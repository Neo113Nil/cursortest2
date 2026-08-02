package ru.CryptoPro.JCSP.Digest.ecdsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPSHA224Digest extends ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA224Digest {
    public JCSPSHA224Digest() {
        this(JCP.DIGEST_SHA224);
    }

    public JCSPSHA224Digest(String str) {
        super(str, 16);
    }

    public JCSPSHA224Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
