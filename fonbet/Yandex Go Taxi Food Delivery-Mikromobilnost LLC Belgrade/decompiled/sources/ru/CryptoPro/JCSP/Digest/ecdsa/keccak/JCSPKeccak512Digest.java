package ru.CryptoPro.JCSP.Digest.ecdsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPKeccak512Digest extends ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak512Digest {
    public JCSPKeccak512Digest() {
        this(JCP.DIGEST_KECCAK_512);
    }

    public JCSPKeccak512Digest(String str) {
        super(str, 16);
    }

    public JCSPKeccak512Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
