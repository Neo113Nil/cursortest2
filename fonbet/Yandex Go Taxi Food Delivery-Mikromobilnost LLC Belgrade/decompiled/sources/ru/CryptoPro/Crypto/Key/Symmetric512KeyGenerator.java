package ru.CryptoPro.Crypto.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.Symmetric512KeySpec;
import ru.CryptoPro.JCP.Random.RandomInterface;

/* loaded from: classes4.dex */
public final class Symmetric512KeyGenerator extends GostKeyGenerator {
    @Override // ru.CryptoPro.Crypto.Key.GostKeyGenerator
    public final SecretKeyInterface createSpec(RandomInterface randomInterface) {
        return new Symmetric512KeySpec(randomInterface);
    }

    @Override // ru.CryptoPro.Crypto.Key.GostKeyGenerator, javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
    }
}
