package ru.CryptoPro.Crypto.Key;

import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.Symmetric512KeySpec;
import ru.CryptoPro.JCP.params.CryptParamsSpec;

/* loaded from: classes4.dex */
public final class GostSymmetric512KeyFactory extends GostSecretKeyFactory {
    @Override // ru.CryptoPro.Crypto.Key.GostSecretKeyFactory
    public SecretKeyInterface createSpec(byte[] bArr, CryptParamsSpec cryptParamsSpec) throws KeyManagementException {
        return new Symmetric512KeySpec(bArr);
    }

    @Override // ru.CryptoPro.Crypto.Key.GostSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported engineTranslateKey");
    }
}
