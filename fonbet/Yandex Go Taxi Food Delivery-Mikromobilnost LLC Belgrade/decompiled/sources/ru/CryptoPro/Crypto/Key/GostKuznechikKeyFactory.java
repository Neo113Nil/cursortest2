package ru.CryptoPro.Crypto.Key;

import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.Key.KuznechikKeySpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;

/* loaded from: classes4.dex */
public final class GostKuznechikKeyFactory extends GostSecretKeyFactory {
    @Override // ru.CryptoPro.Crypto.Key.GostSecretKeyFactory
    public SecretKeyInterface createSpec(byte[] bArr, CryptParamsSpec cryptParamsSpec) throws KeyManagementException {
        return new KuznechikKeySpec(bArr, cryptParamsSpec);
    }

    @Override // ru.CryptoPro.Crypto.Key.GostSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported engineTranslateKey");
    }

    @Override // ru.CryptoPro.Crypto.Key.GostSecretKeyFactory
    public String getKeyAlgorithm() {
        return "GOST3412_2015_K";
    }
}
