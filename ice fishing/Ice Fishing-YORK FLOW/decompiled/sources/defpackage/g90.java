package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class g90 {
    public final long ZpBGe2uQfcn8;

    public static long ZpBGe2uQfcn8(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.g90) {
            return this.ZpBGe2uQfcn8 == ((defpackage.g90) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        long j = this.ZpBGe2uQfcn8;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, (int) (j & 4294967295L), ')');
    }
}
