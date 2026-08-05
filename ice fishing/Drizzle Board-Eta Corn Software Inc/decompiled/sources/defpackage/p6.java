package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p6 {
    public final long MdtA4re8;
    public final long NCTxEWno;
    public final long qoPGr6Ce;
    public final long wxUZMvaN;

    public p6(long j, long j2, long j3, long j4) {
        this.qoPGr6Ce = j;
        this.NCTxEWno = j2;
        this.MdtA4re8 = j3;
        this.wxUZMvaN = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return this.qoPGr6Ce == p6Var.qoPGr6Ce && this.NCTxEWno == p6Var.NCTxEWno && this.MdtA4re8 == p6Var.MdtA4re8 && this.wxUZMvaN == p6Var.wxUZMvaN;
    }

    public final int hashCode() {
        return Long.hashCode(this.wxUZMvaN) + ((Long.hashCode(this.MdtA4re8) + ((Long.hashCode(this.NCTxEWno) + (Long.hashCode(this.qoPGr6Ce) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CompareEntity(id=" + this.qoPGr6Ce + ", leftId=" + this.NCTxEWno + ", rightId=" + this.MdtA4re8 + ", comparedAt=" + this.wxUZMvaN + ")";
    }
}
