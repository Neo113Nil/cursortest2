package defpackage;

/* loaded from: classes.dex */
public interface jx7 {
    default long B0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float n0 = n0(fma.c(j));
        float n02 = n0(fma.b(j));
        return (Float.floatToRawIntBits(n02) & 4294967295L) | (Float.floatToRawIntBits(n0) << 32);
    }

    default int L(float f) {
        float n0 = n0(f);
        if (Float.isInfinite(n0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(n0);
    }

    default float N(long j) {
        if (!les.a(kes.b(j), 4294967296L)) {
            ume.b("Only Sp can convert to Px");
        }
        return n0(p(j));
    }

    default float c0(int i) {
        return i / getDensity();
    }

    default float d0(float f) {
        return f / getDensity();
    }

    float getDensity();

    float i0();

    default long l(float f) {
        float[] fArr = mqc.a;
        if (i0() < 1.03f) {
            return v7g.D(f / i0(), 4294967296L);
        }
        lqc a = mqc.a(i0());
        return v7g.D(a != null ? a.a(f) : f / i0(), 4294967296L);
    }

    default long m(long j) {
        if (j != 9205357640488583168L) {
            return xv.m(d0(Float.intBitsToFloat((int) (j >> 32))), d0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float n0(float f) {
        return getDensity() * f;
    }

    default float p(long j) {
        float c;
        float i0;
        if (!les.a(kes.b(j), 4294967296L)) {
            ume.b("Only Sp can convert to Px");
        }
        float[] fArr = mqc.a;
        if (i0() >= 1.03f) {
            lqc a = mqc.a(i0());
            c = kes.c(j);
            if (a != null) {
                return a.b(c);
            }
            i0 = i0();
        } else {
            c = kes.c(j);
            i0 = i0();
        }
        return i0 * c;
    }

    default int s0(long j) {
        return Math.round(N(j));
    }

    default long w(float f) {
        return l(d0(f));
    }
}
