package ru.CryptoPro.Crypto.Key;

import defpackage.ss61;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.Crypto.Starter;
import ru.CryptoPro.Crypto.tools.SelfTester_Crypt;
import ru.CryptoPro.JCP.Key.AgreeKeySpec;
import ru.CryptoPro.JCP.Key.GostPrivateKey;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class KeyAgreement extends KeyAgreementSpi {
    public static final String BUNDLE_NAME = "ru.CryptoPro.Crypto.Key.resources.key";
    public static final String NO_CIPHER_LIC = "NoCipherLicense";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.Crypto.Key.resources.key", Locale.getDefault());
    public PrivateKeyInterface a = null;
    public final Vector b = new Vector(0);
    public byte[] c = null;

    public KeyAgreement() {
        Starter.check(KeyAgreement.class);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        boolean z2;
        GostPublicKey gostPublicKey;
        JCPLogger.enter();
        if (key instanceof GostPublicKey) {
            gostPublicKey = (GostPublicKey) key;
        } else {
            try {
                if (key instanceof SpecKey) {
                    SpecKey specKey = (SpecKey) key;
                    if ((specKey.getSpec() instanceof PublicKeyInterface) && ((PublicKeyInterface) specKey.getSpec()).isTrusted()) {
                        z2 = true;
                        gostPublicKey = new GostPublicKey(key.getEncoded(), z2);
                    }
                }
                gostPublicKey = new GostPublicKey(key.getEncoded(), z2);
            } catch (InvalidKeySpecException unused) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("NotDHKey"));
                JCPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
            z2 = false;
        }
        try {
            this.b.add(this.a.doDHPhase((PublicKeyInterface) gostPublicKey.getSpec(), this.c));
            JCPLogger.exit();
            return key;
        } catch (KeyManagementException e) {
            InvalidKeyException invalidKeyException2 = new InvalidKeyException(e.getMessage());
            invalidKeyException2.initCause(e);
            throw invalidKeyException2;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        JCPLogger.enter();
        boolean equals = str.equals("GOST28147");
        Vector vector = this.b;
        if (equals || str.equals("GOST3412_2015_M") || str.equals("GOST3412_2015_K")) {
            try {
                GostAgreeKey gostAgreeKey = new GostAgreeKey(AgreeKeySpec.getSpec((AgreeKeySpec) vector.elementAt(0), str), this.c);
                JCPLogger.exit();
                return gostAgreeKey;
            } catch (KeyManagementException unused) {
                InvalidKeyException invalidKeyException = new InvalidKeyException();
                JCPLogger.thrown(invalidKeyException);
                throw invalidKeyException;
            }
        }
        if (!str.equals("SYMMETRIC512")) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
            JCPLogger.thrown(noSuchAlgorithmException);
            throw noSuchAlgorithmException;
        }
        try {
            GostSecretKey gostSecretKey = new GostSecretKey(AgreeKeySpec.getSpec((AgreeKeySpec) vector.elementAt(0), str));
            JCPLogger.exit();
            return gostSecretKey;
        } catch (Exception unused2) {
            InvalidKeyException invalidKeyException2 = new InvalidKeyException();
            JCPLogger.thrown(invalidKeyException2);
            throw invalidKeyException2;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        JCPLogger.enter();
        if (!ss61.a) {
            throw new InvalidKeyException(resource.getString("NoCipherLicense"));
        }
        if (!(key instanceof GostPrivateKey)) {
            InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("NotDHKey"));
            JCPLogger.warning(invalidKeyException);
            throw invalidKeyException;
        }
        try {
            KeyInterface spec = ((GostPrivateKey) key).getSpec();
            SelfTester_Crypt.check(1024);
            if (!(spec instanceof PrivateKeyInterface)) {
                throw new CloneNotSupportedException();
            }
            this.a = (PrivateKeyInterface) spec.clone();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.c = (byte[]) ((IvParameterSpec) algorithmParameterSpec).getIV().clone();
                JCPLogger.exit();
            } else {
                InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(resource.getString("NeedSV"));
                JCPLogger.warning(invalidAlgorithmParameterException);
                throw invalidAlgorithmParameterException;
            }
        } catch (CloneNotSupportedException e) {
            InvalidKeyException invalidKeyException2 = new InvalidKeyException(resource.getString("NotDHKey"));
            invalidKeyException2.initCause(e);
            JCPLogger.warning(invalidKeyException2);
            throw invalidKeyException2;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        return 0;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        JCPLogger.enter();
        InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("NeedSV"));
        JCPLogger.warning(invalidKeyException);
        throw invalidKeyException;
    }
}
