package ru.CryptoPro.Crypto.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.Crypto.Starter;
import ru.CryptoPro.JCP.Key.MagmaKeySpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;

/* loaded from: classes4.dex */
public final class GostMagmaKeyGenerator extends GostKeyGenerator {
    public GostMagmaKeyGenerator() {
        Starter.check(GostMagmaKeyGenerator.class);
        this.params = CryptParamsSpec.getInstance(CryptParamsSpec.OID_tc26_cipher_gost_3412_2015_M);
    }

    @Override // ru.CryptoPro.Crypto.Key.GostKeyGenerator
    public SecretKeyInterface createSpec(RandomInterface randomInterface) throws KeyManagementException {
        return new MagmaKeySpec(this.params, randomInterface);
    }

    @Override // ru.CryptoPro.Crypto.Key.GostKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
    }
}
