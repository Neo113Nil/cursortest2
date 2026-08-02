package ru.CryptoPro.ssl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes4.dex */
enum cl_111 {
    UNDEFINED(StringUtils.UNDEFINED, -1),
    ANONYMOUS("anonymous", 0),
    RSA("rsa", 1),
    DSA("dsa", 2),
    ECDSA("ecdsa", 3),
    GR3410("1.2.643.2.2.19", 237),
    GR3410_2012_256("1.2.643.7.1.1.1.1", 238),
    GR3410_2012_512("1.2.643.7.1.1.1.2", 239),
    GOST3410_2012_256_IANA("1.2.643.7.1.1.1.1", 64),
    GOST3410_2012_512_IANA("1.2.643.7.1.1.1.1", 65);

    final String k;
    final int l;

    cl_111(String str, int i) {
        this.k = str;
        this.l = i;
    }
}
