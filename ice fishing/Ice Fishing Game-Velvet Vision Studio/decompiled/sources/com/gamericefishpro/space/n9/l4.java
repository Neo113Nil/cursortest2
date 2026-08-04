package com.gamericefishpro.space.n9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l4 {
    public final m4 a;
    public int b = 1;
    public long c = a();

    public l4(m4 m4Var) {
        this.a = m4Var;
    }

    public final long a() {
        m4 m4Var = this.a;
        com.gamericefishpro.space.v8.c0.g(m4Var);
        long jLongValue = ((Long) e0.v.a(null)).longValue();
        long jLongValue2 = ((Long) e0.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        m4Var.e().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
