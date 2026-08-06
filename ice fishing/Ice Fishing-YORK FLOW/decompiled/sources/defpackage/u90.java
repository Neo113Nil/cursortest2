package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u90 {
    public final long ZpBGe2uQfcn8;

    public static final boolean ZpBGe2uQfcn8(long j, long j2) {
        return j == j2;
    }

    public static java.lang.String giKS3J6vZuNy(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.u90) {
            return this.ZpBGe2uQfcn8 == ((defpackage.u90) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return giKS3J6vZuNy(this.ZpBGe2uQfcn8);
    }
}
