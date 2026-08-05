package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c10 {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final long qoPGr6Ce;
    public final int wxUZMvaN;

    public c10(long j, String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.qoPGr6Ce = j;
        this.NCTxEWno = str;
        this.MdtA4re8 = str2;
        this.wxUZMvaN = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        return this.qoPGr6Ce == c10Var.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, c10Var.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, c10Var.MdtA4re8) && this.wxUZMvaN == c10Var.wxUZMvaN;
    }

    public final int hashCode() {
        return Integer.hashCode(this.wxUZMvaN) + q70.MdtA4re8(this.MdtA4re8, q70.MdtA4re8(this.NCTxEWno, Long.hashCode(this.qoPGr6Ce) * 31, 31), 31);
    }

    public final String toString() {
        return "RatingItem(pairId=" + this.qoPGr6Ce + ", name=" + this.NCTxEWno + ", emoji=" + this.MdtA4re8 + ", level=" + this.wxUZMvaN + ")";
    }
}
