package ru.CryptoPro.JCSP.Digest.ecdsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPSHA384Digest extends ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA384Digest {
    public JCSPSHA384Digest() {
        this(JCP.DIGEST_SHA384);
    }

    public JCSPSHA384Digest(String str) {
        super(str, 16);
    }

    public JCSPSHA384Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
