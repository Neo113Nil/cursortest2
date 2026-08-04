package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 implements p8 {
    public static final k4 a;
    public static final k4 b;
    public static final k4 c;
    public static final k4 d;
    public static final k4 e;
    public static final k4 f;

    static {
        com.gamericefishpro.space.b4.f fVar = new com.gamericefishpro.space.b4.f(j4.a(), true, true);
        a = fVar.d("measurement.test.boolean_flag", false);
        b = fVar.c("measurement.test.cached_long_flag", -1L);
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = k4.g;
        c = new k4(fVar, "measurement.test.double_flag", dValueOf, 2);
        d = fVar.c("measurement.test.int_flag", -2L);
        e = fVar.c("measurement.test.long_flag", -1L);
        f = fVar.e("measurement.test.string_flag", "---");
    }
}
