package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tn1 {
    public final long ZpBGe2uQfcn8;
    public static final defpackage.un1[] giKS3J6vZuNy = {new defpackage.un1(0), new defpackage.un1(4294967296L), new defpackage.un1(8589934592L)};
    public static final long fWTAfUmVKrZq = defpackage.m90.UmgHb6n58gfG(0, Float.NaN);

    public static java.lang.String JhCgjQRTAOCT(long j) {
        long giKS3J6vZuNy2 = giKS3J6vZuNy(j);
        if (defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy2, 0L)) {
            return "Unspecified";
        }
        if (defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy2, 4294967296L)) {
            return fWTAfUmVKrZq(j) + ".sp";
        }
        if (!defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy2, 8589934592L)) {
            return "Invalid";
        }
        return fWTAfUmVKrZq(j) + ".em";
    }

    public static final boolean ZpBGe2uQfcn8(long j, long j2) {
        return j == j2;
    }

    public static final float fWTAfUmVKrZq(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long giKS3J6vZuNy(long j) {
        return giKS3J6vZuNy[(int) ((j & 1095216660480L) >>> 32)].ZpBGe2uQfcn8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.tn1) {
            return this.ZpBGe2uQfcn8 == ((defpackage.tn1) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return JhCgjQRTAOCT(this.ZpBGe2uQfcn8);
    }
}
