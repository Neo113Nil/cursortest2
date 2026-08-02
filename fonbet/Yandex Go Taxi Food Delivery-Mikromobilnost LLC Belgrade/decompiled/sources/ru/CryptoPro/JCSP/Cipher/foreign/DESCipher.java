package ru.CryptoPro.JCSP.Cipher.foreign;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;

/* loaded from: classes4.dex */
public class DESCipher extends GostCipher {
    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher
    public boolean a() {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof ForeignSymmetricKey)) {
            throw new InvalidKeyException();
        }
        super.engineInit(i, key, secureRandom);
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof ForeignSymmetricKey)) {
            throw new InvalidKeyException();
        }
        super.engineInit(i, key, algorithmParameterSpec, secureRandom);
    }
}
