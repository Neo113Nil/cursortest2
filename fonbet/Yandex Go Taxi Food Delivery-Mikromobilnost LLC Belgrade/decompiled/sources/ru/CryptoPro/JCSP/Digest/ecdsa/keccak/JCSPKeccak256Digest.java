package ru.CryptoPro.JCSP.Digest.ecdsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPKeccak256Digest extends ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak256Digest {
    public JCSPKeccak256Digest() {
        this(JCP.DIGEST_KECCAK_256);
    }

    public JCSPKeccak256Digest(String str) {
        super(str, 16);
    }

    public JCSPKeccak256Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
