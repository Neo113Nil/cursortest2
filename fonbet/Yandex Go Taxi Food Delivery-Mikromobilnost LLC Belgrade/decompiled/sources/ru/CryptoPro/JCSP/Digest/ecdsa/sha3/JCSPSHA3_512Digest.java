package ru.CryptoPro.JCSP.Digest.ecdsa.sha3;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPSHA3_512Digest extends ru.CryptoPro.JCSP.Digest.rsa.sha3.JCSPSHA3_512Digest {
    public JCSPSHA3_512Digest() {
        this(JCP.DIGEST_SHA3_512);
    }

    public JCSPSHA3_512Digest(String str) {
        super(str, 16);
    }

    public JCSPSHA3_512Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
