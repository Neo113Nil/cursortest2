package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k1 {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final int qoPGr6Ce;
    public final long wxUZMvaN;

    public k1(int i, int i2, int i3, long j) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = i2;
        this.MdtA4re8 = i3;
        this.wxUZMvaN = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.qoPGr6Ce == k1Var.qoPGr6Ce && this.NCTxEWno == k1Var.NCTxEWno && this.MdtA4re8 == k1Var.MdtA4re8 && this.wxUZMvaN == k1Var.wxUZMvaN;
    }

    public final int hashCode() {
        return Long.hashCode(this.wxUZMvaN) + q70.NCTxEWno(this.MdtA4re8, q70.NCTxEWno(this.NCTxEWno, Integer.hashCode(this.qoPGr6Ce) * 31, 31), 31);
    }

    public final String toString() {
        return "AverageItem(traitLabel=" + this.qoPGr6Ce + ", sessions=" + this.NCTxEWno + ", averageAccuracy=" + this.MdtA4re8 + ", lastRoundId=" + this.wxUZMvaN + ")";
    }
}
