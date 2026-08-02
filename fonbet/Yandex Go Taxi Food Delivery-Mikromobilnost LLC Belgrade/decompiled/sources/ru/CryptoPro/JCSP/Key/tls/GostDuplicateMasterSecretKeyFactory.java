package ru.CryptoPro.JCSP.Key.tls;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import ru.CryptoPro.JCSP.Key.MasterSecret;

/* loaded from: classes4.dex */
public class GostDuplicateMasterSecretKeyFactory extends SecretKeyFactorySpi implements TlsConstants {
    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("engineGenerateSecret(...) is unsupported.");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("engineGetKeySpec(...) is unsupported.");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (!(secretKey instanceof MasterSecret)) {
            dy31.v("Unsupported key.");
            return null;
        }
        try {
            return new MasterSecret((MasterSecret) secretKey);
        } catch (CloneNotSupportedException e) {
            dy31.s(e);
            return null;
        }
    }
}
