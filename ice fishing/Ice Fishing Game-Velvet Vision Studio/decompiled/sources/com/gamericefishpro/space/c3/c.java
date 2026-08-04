package com.gamericefishpro.space.c3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default float D(long j) {
        float fC;
        float fG;
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        float[] fArr = com.gamericefishpro.space.d3.b.a;
        if (g() >= 1.03f) {
            com.gamericefishpro.space.d3.a aVarA = com.gamericefishpro.space.d3.b.a(g());
            fC = n.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fG = g();
        } else {
            fC = n.c(j);
            fG = g();
        }
        return fG * fC;
    }

    default int J(float f) {
        float fR = r(f);
        if (Float.isInfinite(fR)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fR);
    }

    default long S(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fR = r(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Float.floatToRawIntBits(r(Float.intBitsToFloat((int) (j & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(fR) << 32);
    }

    default float V(long j) {
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        return r(D(j));
    }

    float b();

    default long b0(float f) {
        return q(i0(f));
    }

    float g();

    default float g0(int i) {
        return i / b();
    }

    default float i0(float f) {
        return f / b();
    }

    default long q(float f) {
        float[] fArr = com.gamericefishpro.space.d3.b.a;
        if (g() < 1.03f) {
            return com.gamericefishpro.space.hj.c.G(4294967296L, f / g());
        }
        com.gamericefishpro.space.d3.a aVarA = com.gamericefishpro.space.d3.b.a(g());
        return com.gamericefishpro.space.hj.c.G(4294967296L, aVarA != null ? aVarA.a(f) : f / g());
    }

    default float r(float f) {
        return b() * f;
    }
}
