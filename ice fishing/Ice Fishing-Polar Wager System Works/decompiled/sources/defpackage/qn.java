package defpackage;

/* loaded from: classes.dex */
public interface qn {
    default long AQHddgaEX(float f) {
        return G3OKOH3wZRC(qvFH3dnF(f));
    }

    float EXtogiMhuM();

    default float EgCjBq0SZwJ(float f) {
        return oh6vYeIP() * f;
    }

    default long G3OKOH3wZRC(float f) {
        float[] fArr = defpackage.zy.IHQe1A4L2xu;
        if (EXtogiMhuM() < 1.03f) {
            return defpackage.e90.V7bD7b8KA(4294967296L, f / EXtogiMhuM());
        }
        defpackage.yy IHQe1A4L2xu = defpackage.zy.IHQe1A4L2xu(EXtogiMhuM());
        return defpackage.e90.V7bD7b8KA(4294967296L, IHQe1A4L2xu != null ? IHQe1A4L2xu.IHQe1A4L2xu(f) : f / EXtogiMhuM());
    }

    default float QPwENk36pDC(long j) {
        if (!defpackage.gg1.IHQe1A4L2xu(defpackage.fg1.oh6vYeIP(j), 4294967296L)) {
            defpackage.z50.oh6vYeIP("Only Sp can convert to Px");
        }
        return EgCjBq0SZwJ(UsuH8pd5P(j));
    }

    default float UsuH8pd5P(long j) {
        if (!defpackage.gg1.IHQe1A4L2xu(defpackage.fg1.oh6vYeIP(j), 4294967296L)) {
            defpackage.z50.oh6vYeIP("Only Sp can convert to Px");
        }
        float[] fArr = defpackage.zy.IHQe1A4L2xu;
        if (EXtogiMhuM() < 1.03f) {
            return EXtogiMhuM() * defpackage.fg1.r1MBDhnF(j);
        }
        defpackage.yy IHQe1A4L2xu = defpackage.zy.IHQe1A4L2xu(EXtogiMhuM());
        if (IHQe1A4L2xu != null) {
            return IHQe1A4L2xu.oh6vYeIP(defpackage.fg1.r1MBDhnF(j));
        }
        return EXtogiMhuM() * defpackage.fg1.r1MBDhnF(j);
    }

    default float d6FAb9xVJ8GU(int i) {
        return i / oh6vYeIP();
    }

    default long hkbnNdmy(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float EgCjBq0SZwJ = EgCjBq0SZwJ(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        float EgCjBq0SZwJ2 = EgCjBq0SZwJ(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        return (java.lang.Float.floatToRawIntBits(EgCjBq0SZwJ) << 32) | (java.lang.Float.floatToRawIntBits(EgCjBq0SZwJ2) & 4294967295L);
    }

    default long kd6TUFXn(long j) {
        if (j != 9205357640488583168L) {
            return defpackage.ci0.xiZrDbcSW0(qvFH3dnF(java.lang.Float.intBitsToFloat((int) (j >> 32))), qvFH3dnF(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    float oh6vYeIP();

    default float qvFH3dnF(float f) {
        return f / oh6vYeIP();
    }

    default int yIx6ChFVk(float f) {
        float EgCjBq0SZwJ = EgCjBq0SZwJ(f);
        if (java.lang.Float.isInfinite(EgCjBq0SZwJ)) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.round(EgCjBq0SZwJ);
    }
}
