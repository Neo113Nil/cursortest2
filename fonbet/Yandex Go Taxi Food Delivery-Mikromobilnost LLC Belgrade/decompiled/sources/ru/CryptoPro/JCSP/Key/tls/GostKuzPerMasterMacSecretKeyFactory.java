package ru.CryptoPro.JCSP.Key.tls;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCSP.Key.MasterSecret;

/* loaded from: classes4.dex */
public class GostKuzPerMasterMacSecretKeyFactory extends GostKuzMasterSecretKeyFactory {
    protected boolean a = false;
    protected boolean b = false;

    public int c() {
        return 8;
    }

    public CryptParamsInterface d() {
        return null;
    }

    public int e() {
        return 32;
    }

    @Override // ru.CryptoPro.JCSP.Key.tls.GostPerCipherSuiteMasterSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        super.engineGenerateSecret(keySpec);
        if (!(keySpec instanceof SecretKeySpec)) {
            return null;
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) keySpec;
        String algorithm = secretKeySpec.getAlgorithm();
        if (!algorithm.equalsIgnoreCase(TlsConstants.TLS_WRITE) && !algorithm.equalsIgnoreCase(TlsConstants.TLS_SERVER)) {
            return null;
        }
        byte[] encoded = secretKeySpec.getEncoded();
        if (encoded == null) {
            throw new InvalidKeySpecException("KeySpec value must be not null.");
        }
        if (encoded.length != 1) {
            throw new InvalidKeySpecException("KeySpec value must have size 1 byte.");
        }
        byte b = encoded[0];
        if (b != 0 && b != 1) {
            throw new InvalidKeySpecException("KeySpec value must have value 0 (false) or 1 (true).");
        }
        if (algorithm.equals(TlsConstants.TLS_SERVER)) {
            this.b = b == 1;
            return null;
        }
        if (!algorithm.equals(TlsConstants.TLS_WRITE)) {
            return null;
        }
        this.a = b == 1;
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.tls.GostPerCipherSuiteMasterSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("engineGetKeySpec(...) is unsupported.");
    }

    @Override // ru.CryptoPro.JCSP.Key.tls.GostPerCipherSuiteMasterSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (!(secretKey instanceof MasterSecret)) {
            dy31.v("Unsupported key type.");
            return null;
        }
        try {
            return ((MasterSecret) secretKey).calculateConnectionKey(this.c, this.d, false, null, d(), this.b, this.a, e(), f(), g(), a(), 0, h());
        } catch (NoSuchAlgorithmException e) {
            dy31.s(e);
            return null;
        }
    }

    public int f() {
        return 19458;
    }
}
