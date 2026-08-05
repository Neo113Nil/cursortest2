package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k80 {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final long qoPGr6Ce;
    public final long wxUZMvaN;

    public k80(int i, int i2, long j, long j2) {
        this.qoPGr6Ce = j;
        this.NCTxEWno = i;
        this.MdtA4re8 = i2;
        this.wxUZMvaN = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return this.qoPGr6Ce == k80Var.qoPGr6Ce && this.NCTxEWno == k80Var.NCTxEWno && this.MdtA4re8 == k80Var.MdtA4re8 && this.wxUZMvaN == k80Var.wxUZMvaN;
    }

    public final int hashCode() {
        return Long.hashCode(this.wxUZMvaN) + q70.NCTxEWno(this.MdtA4re8, q70.NCTxEWno(this.NCTxEWno, Long.hashCode(this.qoPGr6Ce) * 31, 31), 31);
    }

    public final String toString() {
        return "SprintHistoryItem(roundId=" + this.qoPGr6Ce + ", traitLabel=" + this.NCTxEWno + ", accuracyPercent=" + this.MdtA4re8 + ", elapsedMillis=" + this.wxUZMvaN + ")";
    }
}
