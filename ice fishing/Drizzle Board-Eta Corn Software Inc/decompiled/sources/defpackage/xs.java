package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xs {
    public final boolean MdtA4re8;
    public final String NCTxEWno;
    public final int qoPGr6Ce;
    public final long wxUZMvaN;

    public xs(int i, String str, boolean z, long j) {
        str.getClass();
        this.qoPGr6Ce = i;
        this.NCTxEWno = str;
        this.MdtA4re8 = z;
        this.wxUZMvaN = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return this.qoPGr6Ce == xsVar.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, xsVar.NCTxEWno) && this.MdtA4re8 == xsVar.MdtA4re8 && this.wxUZMvaN == xsVar.wxUZMvaN;
    }

    public final int hashCode() {
        return Long.hashCode(this.wxUZMvaN) + ((Boolean.hashCode(this.MdtA4re8) + q70.MdtA4re8(this.NCTxEWno, Integer.hashCode(this.qoPGr6Ce) * 31, 31)) * 31);
    }

    public final String toString() {
        return "MoodEntity(id=" + this.qoPGr6Ce + ", moodKey=" + this.NCTxEWno + ", introShown=" + this.MdtA4re8 + ", ratingDismissedFor=" + this.wxUZMvaN + ")";
    }
}
