package ru.CryptoPro.JCSP.Key.tls;

import defpackage.dy31;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCSP.Key.MasterSecret;

/* loaded from: classes4.dex */
public class GostKuzPerMasterCipherSecretKeyFactory extends GostKuzPerMasterMacSecretKeyFactory {
    private byte[] e = null;

    @Override // ru.CryptoPro.JCSP.Key.tls.GostKuzPerMasterMacSecretKeyFactory, ru.CryptoPro.JCSP.Key.tls.GostPerCipherSuiteMasterSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(this.e, TlsConstants.TLS_IV);
        }
        throw new InvalidKeySpecException("Unsupported keySpec.");
    }

    @Override // ru.CryptoPro.JCSP.Key.tls.GostKuzPerMasterMacSecretKeyFactory, ru.CryptoPro.JCSP.Key.tls.GostPerCipherSuiteMasterSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (!(secretKey instanceof MasterSecret)) {
            dy31.v("Unsupported key type.");
            return null;
        }
        MasterSecret masterSecret = (MasterSecret) secretKey;
        byte[] bArr = new byte[c()];
        this.e = bArr;
        try {
            return masterSecret.calculateConnectionKey(this.c, this.d, true, bArr, d(), ((GostKuzPerMasterMacSecretKeyFactory) this).b, ((GostKuzPerMasterMacSecretKeyFactory) this).a, e(), f(), g(), a(), 0, h());
        } catch (NoSuchAlgorithmException e) {
            dy31.s(e);
            return null;
        }
    }
}
