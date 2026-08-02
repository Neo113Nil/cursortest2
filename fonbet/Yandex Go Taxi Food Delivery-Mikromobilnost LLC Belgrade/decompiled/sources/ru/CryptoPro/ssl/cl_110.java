package ru.CryptoPro.ssl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
enum cl_110 {
    a(-1, "UNDEFINED", StringUtils.UNDEFINED, ""),
    b(-1, JCP.RAW_PREFIX, "none", JCP.RAW_PREFIX),
    c(16, "MD5", "md5", "MD5"),
    d(20, JCP.DIGEST_SHA1, "sha1", "SHA-1"),
    e(28, JCP.DIGEST_SHA224, "sha224", JCP.DIGEST_SHA_224),
    f(32, JCP.DIGEST_SHA256, "sha256", JCP.DIGEST_SHA_256),
    g(48, JCP.DIGEST_SHA384, "sha384", JCP.DIGEST_SHA_384),
    h(64, JCP.DIGEST_SHA512, "sha512", JCP.DIGEST_SHA_512),
    i(32, "GR3411", "1.2.643.2.2.9", JCP.GOST_DIGEST_NAME),
    j(32, "GR3411_2012_256", "1.2.643.7.1.1.2.2", JCP.GOST_DIGEST_2012_256_NAME),
    k(64, "GR3411_2012_512", "1.2.643.7.1.1.2.3", JCP.GOST_DIGEST_2012_512_NAME),
    l(32, "TLS_INTRINSIC_HASH", "1.2.643.7.1.1.2.2", JCP.GOST_DIGEST_2012_256_NAME);

    final String m;
    final String n;
    final int o;
    final int p;

    cl_110(int i2, String str, String str2, String str3) {
        this.m = str2;
        this.n = str3;
        this.o = r2;
        this.p = i2;
    }
}
