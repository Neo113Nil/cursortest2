package ru.CryptoPro.Crypto.Key;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.AbstractMasterSecret;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.MasterKeyInterface;
import ru.CryptoPro.JCP.Key.MasterKeySpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class MasterSecret extends AbstractMasterSecret implements SpecKey {
    private final MasterKeyInterface a;

    public MasterSecret(SecretKey secretKey, byte[] bArr, String str) throws KeyManagementException, InvalidKeyException {
        if (secretKey instanceof GostSecretKey) {
            this.a = ((SecretKeyInterface) ((GostSecretKey) secretKey).getSpec()).preHashMaster(bArr, str.equals(JCP.GOST_DIGEST_2012_256_NAME) || str.equals("1.2.643.7.1.1.2.2"));
        } else {
            dy31.v("Invalid type of pre-master key");
            throw null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof CryptParamsInterface)) {
            throw new InvalidParameterException("Parameters should be encryption");
        }
        try {
            try {
                return new GostSecretKey(MasterKeySpec.deriveKey(this.a.hashMasterForKeys(bArr, bArr2), str, bArr3, str2, (CryptParamsInterface) algorithmParameterSpec));
            } catch (KeyManagementException e) {
                InvalidKeyException invalidKeyException = new InvalidKeyException("Error in creating connection key");
                invalidKeyException.initCause(e);
                JCPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
        } catch (KeyManagementException e2) {
            InvalidKeyException invalidKeyException2 = new InvalidKeyException("Invalid master key");
            invalidKeyException2.initCause(e2);
            throw invalidKeyException2;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public void clear() {
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public byte[] computeFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        try {
            return this.a.hashMasterForFinished(bArr, bArr2);
        } catch (KeyManagementException e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Invalid master key");
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        clear();
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public int getKeySize() {
        return 0;
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public KeyInterface getSpec() {
        return this.a;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return false;
    }

    public MasterSecret(SecretKey secretKey, byte[] bArr, byte[] bArr2, String str) throws KeyManagementException, InvalidKeyException {
        if (secretKey instanceof GostSecretKey) {
            this.a = ((SecretKeyInterface) ((GostSecretKey) secretKey).getSpec()).preHashMaster(bArr, bArr2, str.equals(JCP.GOST_DIGEST_2012_256_NAME) || str.equals("1.2.643.7.1.1.2.2"));
        } else {
            dy31.v("Invalid type of pre-master key");
            throw null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException {
        return calculateConnectionKey(bArr, bArr2, str, bArr3, "GOST28147", algorithmParameterSpec);
    }

    @Override // ru.CryptoPro.JCP.Key.AbstractMasterSecret, ru.CryptoPro.JCP.Key.MasterSecretInterface
    public SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, boolean z, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, boolean z4) throws NoSuchAlgorithmException, InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }
}
