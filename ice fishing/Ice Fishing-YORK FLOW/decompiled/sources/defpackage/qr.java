package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qr {
    public final long ZpBGe2uQfcn8;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.qr) {
            return this.ZpBGe2uQfcn8 == ((defpackage.qr) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        long j = this.ZpBGe2uQfcn8;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(java.lang.Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(java.lang.Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
