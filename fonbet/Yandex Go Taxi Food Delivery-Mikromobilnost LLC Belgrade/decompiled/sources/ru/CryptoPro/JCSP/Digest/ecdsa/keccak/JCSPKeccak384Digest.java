package ru.CryptoPro.JCSP.Digest.ecdsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPKeccak384Digest extends ru.CryptoPro.JCSP.Digest.rsa.keccak.JCSPKeccak384Digest {
    public JCSPKeccak384Digest() {
        this(JCP.DIGEST_KECCAK_384);
    }

    public JCSPKeccak384Digest(String str) {
        super(str, 16);
    }

    public JCSPKeccak384Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
