package ru.CryptoPro.JCSP.Digest.ecdsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPSHA512Digest extends ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA512Digest {
    public JCSPSHA512Digest() {
        this(JCP.DIGEST_SHA512);
    }

    public JCSPSHA512Digest(String str) {
        super(str, 16);
    }

    public JCSPSHA512Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
