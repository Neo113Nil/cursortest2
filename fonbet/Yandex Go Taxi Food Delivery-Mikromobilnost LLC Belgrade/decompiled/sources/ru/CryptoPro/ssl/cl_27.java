package ru.CryptoPro.ssl;

import defpackage.kbs;
import ru.CryptoPro.JCP.params.ECDSAParamsSpec;

/* loaded from: classes4.dex */
enum cl_27 {
    a("sect163k1", "1.3.132.0.1", true, 1),
    b("sect163r1", "1.3.132.0.2", false, 2),
    c("sect163r2", "1.3.132.0.15", true, 3),
    d("sect193r1", "1.3.132.0.24", false, 4),
    e("sect193r2", "1.3.132.0.25", false, 5),
    f("sect233k1", "1.3.132.0.26", true, 6),
    g("sect233r1", "1.3.132.0.27", true, 7),
    h("sect239k1", "1.3.132.0.3", false, 8),
    i("sect283k1", "1.3.132.0.16", true, 9),
    j("sect283r1", "1.3.132.0.17", true, 10),
    k("sect409k1", "1.3.132.0.36", true, 11),
    l("sect409r1", "1.3.132.0.37", true, 12),
    m("sect571k1", "1.3.132.0.38", true, 13),
    n("sect571r1", "1.3.132.0.39", true, 14),
    o("secp160k1", "1.3.132.0.9", false, 15),
    p("secp160r1", "1.3.132.0.8", false, 16),
    q("secp160r2", "1.3.132.0.30", false, 17),
    r("secp192k1", "1.3.132.0.31", false, 18),
    s(ECDSAParamsSpec.ECDSA_P192_NAME, "1.2.840.10045.3.1.1", true, 19),
    t("secp224k1", "1.3.132.0.32", false, 20),
    u(ECDSAParamsSpec.ECDSA_P224_NAME, "1.3.132.0.33", true, 21),
    v(ECDSAParamsSpec.ECDSA_SECP256K1_NAME, "1.3.132.0.10", false, 22),
    w(ECDSAParamsSpec.ECDSA_P256_NAME, "1.2.840.10045.3.1.7", true, 23),
    x(ECDSAParamsSpec.ECDSA_P384_NAME, "1.3.132.0.34", true, 24),
    y(ECDSAParamsSpec.ECDSA_P521_NAME, "1.3.132.0.35", true, 25);

    String A;
    String B;
    boolean C;
    int z;

    cl_27(String str, String str2, boolean z, int i2) {
        this.z = i2;
        this.A = str;
        this.B = str2;
        this.C = z;
        if (cl_26.g.put(str2, Integer.valueOf(i2)) == null && cl_26.h.put(Integer.valueOf(i2), str2) == null) {
            return;
        }
        kbs.g("Duplicate named elliptic curve definition: ".concat(str));
        throw null;
    }

    public static void b(String str) {
        cl_27[] values = values();
        int length = values.length;
        for (int i2 = 0; i2 < length && !values[i2].A.equals(str); i2++) {
        }
    }
}
