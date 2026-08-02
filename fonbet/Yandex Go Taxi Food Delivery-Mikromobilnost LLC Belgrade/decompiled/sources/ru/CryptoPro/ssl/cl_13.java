package ru.CryptoPro.ssl;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
enum cl_13 {
    P_NONE(JCP.RAW_PREFIX, 0, 0),
    P_SHA256(JCP.DIGEST_SHA_256, 32, 64),
    P_SHA384(JCP.DIGEST_SHA_384, 48, 128),
    P_SHA512(JCP.DIGEST_SHA_512, 64, 128);

    private final String e;
    private final int f;
    private final int g;

    cl_13(String str, int i, int i2) {
        this.e = str;
        this.f = i;
        this.g = i2;
    }
}
