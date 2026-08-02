package ru.CryptoPro.JCSP.Digest.ecdsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPSHA256Digest extends ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA256Digest {
    public JCSPSHA256Digest() {
        this(JCP.DIGEST_SHA256);
    }

    public JCSPSHA256Digest(String str) {
        super(str, 16);
    }

    public JCSPSHA256Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
