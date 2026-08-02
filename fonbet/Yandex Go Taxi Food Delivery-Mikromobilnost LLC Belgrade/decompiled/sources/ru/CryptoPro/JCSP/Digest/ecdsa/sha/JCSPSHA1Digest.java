package ru.CryptoPro.JCSP.Digest.ecdsa.sha;

import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public class JCSPSHA1Digest extends ru.CryptoPro.JCSP.Digest.rsa.sha.JCSPSHA1Digest {
    public JCSPSHA1Digest() {
        super(16);
    }

    public JCSPSHA1Digest(KeyInterface keyInterface) {
        super(keyInterface, 16);
    }
}
