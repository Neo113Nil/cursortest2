package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class in1 {
    public static final /* synthetic */ int fWTAfUmVKrZq = 0;
    public static final long giKS3J6vZuNy = defpackage.j80.JhCgjQRTAOCT(0, 0);
    public final long ZpBGe2uQfcn8;

    public /* synthetic */ in1(long j) {
        this.ZpBGe2uQfcn8 = j;
    }

    public static final int JhCgjQRTAOCT(long j) {
        return WDYagTQQm9ns(j) - oh71FJcDz6S2(j);
    }

    public static java.lang.String P05cfTpS5W5L(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, (int) (j & 4294967295L), ')');
    }

    public static final boolean QiMR8OkAhezm(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static final int WDYagTQQm9ns(long j) {
        return java.lang.Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static boolean ZpBGe2uQfcn8(long j, java.lang.Object obj) {
        return (obj instanceof defpackage.in1) && j == ((defpackage.in1) obj).ZpBGe2uQfcn8;
    }

    public static final boolean fWTAfUmVKrZq(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final boolean giKS3J6vZuNy(long j, long j2) {
        return j == j2;
    }

    public static final int oh71FJcDz6S2(long j) {
        return java.lang.Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public final boolean equals(java.lang.Object obj) {
        return ZpBGe2uQfcn8(this.ZpBGe2uQfcn8, obj);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return P05cfTpS5W5L(this.ZpBGe2uQfcn8);
    }
}
