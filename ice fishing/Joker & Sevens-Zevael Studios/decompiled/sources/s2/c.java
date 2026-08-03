package s2;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface c {
    default float B(long j3) {
        float c3;
        float m10;
        if (!o.a(n.b(j3), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        float[] fArr = t2.b.f6513a;
        if (m() >= 1.03f) {
            t2.a a6 = t2.b.a(m());
            c3 = n.c(j3);
            if (a6 != null) {
                return a6.b(c3);
            }
            m10 = m();
        } else {
            c3 = n.c(j3);
            m10 = m();
        }
        return m10 * c3;
    }

    default int D(float f10) {
        float x10 = x(f10);
        if (Float.isInfinite(x10)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(x10);
    }

    default long L(long j3) {
        if (j3 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float x10 = x(Float.intBitsToFloat((int) (j3 >> 32)));
        float x11 = x(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        return (Float.floatToRawIntBits(x11) & 4294967295L) | (Float.floatToRawIntBits(x10) << 32);
    }

    default float N(long j3) {
        if (!o.a(n.b(j3), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        return x(B(j3));
    }

    default long U(float f10) {
        return v(d0(f10));
    }

    float c();

    default float d0(float f10) {
        return f10 / c();
    }

    float m();

    default long v(float f10) {
        float[] fArr = t2.b.f6513a;
        if (m() < 1.03f) {
            return a0.E(4294967296L, f10 / m());
        }
        t2.a a6 = t2.b.a(m());
        return a0.E(4294967296L, a6 != null ? a6.a(f10) : f10 / m());
    }

    default float x(float f10) {
        return c() * f10;
    }
}
