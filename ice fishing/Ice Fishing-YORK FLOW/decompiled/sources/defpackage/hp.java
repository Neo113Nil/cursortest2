package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public interface hp {
    default float BXaznwstz2U0(long j) {
        if (!defpackage.un1.ZpBGe2uQfcn8(defpackage.tn1.giKS3J6vZuNy(j), 4294967296L)) {
            defpackage.g80.giKS3J6vZuNy("Only Sp can convert to Px");
        }
        float[] fArr = defpackage.q00.ZpBGe2uQfcn8;
        if (h3m55N1URyyK() < 1.03f) {
            return h3m55N1URyyK() * defpackage.tn1.fWTAfUmVKrZq(j);
        }
        defpackage.p00 ZpBGe2uQfcn8 = defpackage.q00.ZpBGe2uQfcn8(h3m55N1URyyK());
        if (ZpBGe2uQfcn8 != null) {
            return ZpBGe2uQfcn8.giKS3J6vZuNy(defpackage.tn1.fWTAfUmVKrZq(j));
        }
        return h3m55N1URyyK() * defpackage.tn1.fWTAfUmVKrZq(j);
    }

    default int OVwOqzUGHcCU(float f) {
        float dG7RjM6DqYVL = dG7RjM6DqYVL(f);
        if (java.lang.Float.isInfinite(dG7RjM6DqYVL)) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.round(dG7RjM6DqYVL);
    }

    default long ULjnV488Y6RO(float f) {
        return VFeft99leXEK(a6r05ZxsOP0A(f));
    }

    default long VFeft99leXEK(float f) {
        float[] fArr = defpackage.q00.ZpBGe2uQfcn8;
        if (h3m55N1URyyK() < 1.03f) {
            return defpackage.m90.UmgHb6n58gfG(4294967296L, f / h3m55N1URyyK());
        }
        defpackage.p00 ZpBGe2uQfcn8 = defpackage.q00.ZpBGe2uQfcn8(h3m55N1URyyK());
        return defpackage.m90.UmgHb6n58gfG(4294967296L, ZpBGe2uQfcn8 != null ? ZpBGe2uQfcn8.ZpBGe2uQfcn8(f) : f / h3m55N1URyyK());
    }

    default float a6r05ZxsOP0A(float f) {
        return f / giKS3J6vZuNy();
    }

    default float dG7RjM6DqYVL(float f) {
        return giKS3J6vZuNy() * f;
    }

    default long fhbmYuu9J3cT(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float dG7RjM6DqYVL = dG7RjM6DqYVL(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        float dG7RjM6DqYVL2 = dG7RjM6DqYVL(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        return (java.lang.Float.floatToRawIntBits(dG7RjM6DqYVL) << 32) | (java.lang.Float.floatToRawIntBits(dG7RjM6DqYVL2) & 4294967295L);
    }

    float giKS3J6vZuNy();

    float h3m55N1URyyK();

    default long oCu53ZX2v4Ju(long j) {
        if (j != 9205357640488583168L) {
            return defpackage.la0.fWTAfUmVKrZq(a6r05ZxsOP0A(java.lang.Float.intBitsToFloat((int) (j >> 32))), a6r05ZxsOP0A(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float omM9cAlgeGXx(long j) {
        if (!defpackage.un1.ZpBGe2uQfcn8(defpackage.tn1.giKS3J6vZuNy(j), 4294967296L)) {
            defpackage.g80.giKS3J6vZuNy("Only Sp can convert to Px");
        }
        return dG7RjM6DqYVL(BXaznwstz2U0(j));
    }

    default float pf0OXpZQoaz3(int i) {
        return i / giKS3J6vZuNy();
    }
}
