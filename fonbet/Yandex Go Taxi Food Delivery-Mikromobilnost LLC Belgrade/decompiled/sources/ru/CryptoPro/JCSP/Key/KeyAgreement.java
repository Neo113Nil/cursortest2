package ru.CryptoPro.JCSP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Vector;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Starter;

/* loaded from: classes4.dex */
public abstract class KeyAgreement extends KeyAgreementSpi {
    private static final String d = "NeedSV";
    private static final String e = "NotDHKey";
    private static final String f = "InvKeyType";
    private byte[] a = null;
    private JCSPPrivateKeyInterface b = null;
    private final Vector c = new Vector(0);

    public KeyAgreement() {
        Starter.check(KeyAgreement.class);
    }

    private void a(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        JCSPLogger.enter();
        if (!(key instanceof GostPrivateKey)) {
            InvalidKeyException invalidKeyException = new InvalidKeyException(GostKeyGenerator.resource.getString(e));
            JCSPLogger.warning(invalidKeyException);
            throw invalidKeyException;
        }
        try {
            KeyInterface spec = ((GostPrivateKey) key).getSpec();
            if (!(spec instanceof JCSPPrivateKeyInterface)) {
                throw new CloneNotSupportedException();
            }
            this.b = (JCSPPrivateKeyInterface) spec.clone();
            if (algorithmParameterSpec != null) {
                if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                    InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(GostKeyGenerator.resource.getString(d));
                    JCSPLogger.warning(invalidAlgorithmParameterException);
                    throw invalidAlgorithmParameterException;
                }
                this.a = (byte[]) ((IvParameterSpec) algorithmParameterSpec).getIV().clone();
            }
            JCSPLogger.exit();
        } catch (CloneNotSupportedException e2) {
            InvalidKeyException invalidKeyException2 = new InvalidKeyException(GostKeyGenerator.resource.getString(e));
            invalidKeyException2.initCause(e2);
            JCSPLogger.warning(invalidKeyException2);
            throw invalidKeyException2;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        boolean z2;
        GostPublicKey gostPublicKey;
        JCSPLogger.enter();
        if (key instanceof GostPublicKey) {
            gostPublicKey = (GostPublicKey) key;
        } else {
            byte[] encoded = key.getEncoded();
            try {
                if (key instanceof SpecKey) {
                    SpecKey specKey = (SpecKey) key;
                    if (((specKey.getSpec() instanceof JCSPPublicKeyInterface) && ((JCSPPublicKeyInterface) specKey.getSpec()).isTrusted()) || ((specKey.getSpec() instanceof PublicKeyInterface) && ((PublicKeyInterface) specKey.getSpec()).isTrusted())) {
                        z2 = true;
                        gostPublicKey = new GostPublicKey(new PublicKeySpec(encoded, z2));
                    }
                }
                gostPublicKey = new GostPublicKey(new PublicKeySpec(encoded, z2));
            } catch (InvalidAlgorithmParameterException unused) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(GostKeyGenerator.resource.getString(e));
                JCSPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            } catch (InvalidKeySpecException unused2) {
                InvalidKeyException invalidKeyException2 = new InvalidKeyException(GostKeyGenerator.resource.getString(e));
                JCSPLogger.warning(invalidKeyException2);
                throw invalidKeyException2;
            }
            z2 = false;
        }
        try {
            this.c.add(this.b.doDHPhase((JCSPPublicKeyInterface) gostPublicKey.getSpec(), this.a));
            JCSPLogger.exit();
            return key;
        } catch (KeyManagementException e2) {
            InvalidKeyException invalidKeyException3 = new InvalidKeyException(e2.getMessage());
            invalidKeyException3.initCause(e2);
            throw invalidKeyException3;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        JCSPLogger.enter();
        JCSPAgreeSecretKeySpec jCSPAgreeSecretKeySpec = (JCSPAgreeSecretKeySpec) this.c.elementAt(0);
        if (str.equals("GOST3412_2015_M") || str.equals("GOST3412_2015_K")) {
            JCSPLogger.exit();
            return new GostAgreeKey(jCSPAgreeSecretKeySpec, this.a);
        }
        if (str.equals("GOST28147")) {
            byte[] bArr = this.a;
            if (bArr != null) {
                if (bArr.length <= 8) {
                    jCSPAgreeSecretKeySpec.setIV_byte(bArr);
                } else {
                    jCSPAgreeSecretKeySpec.setIV_blob(bArr);
                }
            }
            GostAgreeKey gostAgreeKey = new GostAgreeKey(jCSPAgreeSecretKeySpec, this.a);
            JCSPLogger.exit();
            return gostAgreeKey;
        }
        if (!str.equals("SYMMETRIC512")) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
            JCSPLogger.thrown(noSuchAlgorithmException);
            throw noSuchAlgorithmException;
        }
        byte[] bArr2 = this.a;
        if (bArr2 != null) {
            if (bArr2.length <= 8) {
                jCSPAgreeSecretKeySpec.setIV_byte(bArr2);
            } else {
                jCSPAgreeSecretKeySpec.setIV_blob(bArr2);
            }
        }
        JCSPLogger.exit();
        return new GostSecretKey(JCSPSymmetric512KeySpec.fromAgree(jCSPAgreeSecretKeySpec));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            a(key, null);
        } catch (InvalidAlgorithmParameterException e2) {
            InvalidKeyException invalidKeyException = new InvalidKeyException(GostKeyGenerator.resource.getString(e));
            invalidKeyException.initCause(e2);
            throw invalidKeyException;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        a(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        return 0;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        return null;
    }
}
