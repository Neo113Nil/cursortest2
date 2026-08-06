package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l90 {
    public final long ZpBGe2uQfcn8;

    public /* synthetic */ l90(long j) {
        this.ZpBGe2uQfcn8 = j;
    }

    public static java.lang.String JhCgjQRTAOCT(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, (int) (j & 4294967295L), ')');
    }

    public static final boolean ZpBGe2uQfcn8(long j, long j2) {
        return j == j2;
    }

    public static final long fWTAfUmVKrZq(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long giKS3J6vZuNy(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.l90) {
            return this.ZpBGe2uQfcn8 == ((defpackage.l90) obj).ZpBGe2uQfcn8;
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
