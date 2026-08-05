package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h80 {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final i90 qoPGr6Ce;
    public final long wxUZMvaN;

    public h80(i90 i90Var, int i, int i2, long j) {
        this.qoPGr6Ce = i90Var;
        this.NCTxEWno = i;
        this.MdtA4re8 = i2;
        this.wxUZMvaN = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return this.qoPGr6Ce == h80Var.qoPGr6Ce && this.NCTxEWno == h80Var.NCTxEWno && this.MdtA4re8 == h80Var.MdtA4re8 && this.wxUZMvaN == h80Var.wxUZMvaN;
    }

    public final int hashCode() {
        return Long.hashCode(this.wxUZMvaN) + q70.NCTxEWno(this.MdtA4re8, q70.NCTxEWno(this.NCTxEWno, this.qoPGr6Ce.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SprintAverage(trait=" + this.qoPGr6Ce + ", sessions=" + this.NCTxEWno + ", averageAccuracy=" + this.MdtA4re8 + ", lastRoundId=" + this.wxUZMvaN + ")";
    }
}
