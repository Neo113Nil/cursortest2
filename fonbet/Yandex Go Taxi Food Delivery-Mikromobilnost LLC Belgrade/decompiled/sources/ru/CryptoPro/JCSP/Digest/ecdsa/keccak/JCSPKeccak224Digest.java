package ru.CryptoPro.JCSP.Digest.ecdsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPKeccak224Digest extends ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak224Digest {
    public JCSPKeccak224Digest() {
        this(JCP.DIGEST_KECCAK_224);
    }

    public JCSPKeccak224Digest(String str) {
        super(str, 16);
    }

    public JCSPKeccak224Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
