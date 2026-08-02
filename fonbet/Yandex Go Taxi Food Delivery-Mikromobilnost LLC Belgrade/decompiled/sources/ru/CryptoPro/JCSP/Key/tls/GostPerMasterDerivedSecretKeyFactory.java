package ru.CryptoPro.JCSP.Key.tls;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;

/* loaded from: classes4.dex */
public abstract class GostPerMasterDerivedSecretKeyFactory extends SecretKeyFactorySpi implements TlsConstants {
    protected long a;

    public abstract int a();

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof SecretKeySpec)) {
            return null;
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) keySpec;
        String algorithm = secretKeySpec.getAlgorithm();
        byte[] encoded = secretKeySpec.getEncoded();
        if (encoded == null) {
            throw new InvalidKeySpecException("KeySpec value must be not null.");
        }
        if (!algorithm.equalsIgnoreCase(TlsConstants.TLS_SEQ_NO)) {
            return null;
        }
        this.a = Array.getLong(encoded, 0);
        return null;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("engineGetKeySpec(...) is unsupported.");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        String str;
        if (secretKey instanceof GostSecretKey) {
            KeyInterface spec = ((GostSecretKey) secretKey).getSpec();
            if (spec instanceof JCSPSecretKeyInterface) {
                SecretKeyInterface secretKeyInterface = (SecretKeyInterface) spec;
                secretKeyInterface.updateTLSKey(this.a, a());
                return new GostSecretKey((JCSPSecretKeyInterface) secretKeyInterface.getWorkKey());
            }
            str = "Unsupported key type.";
        } else {
            str = "Unsupported key.";
        }
        dy31.v(str);
        return null;
    }
}
