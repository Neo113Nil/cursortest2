package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n2 {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final int VgvYg0wo;
    public final int qoPGr6Ce;
    public final int wxUZMvaN;

    public n2(int i, int i2, int i3, int i4, int i5) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = i2;
        this.MdtA4re8 = i3;
        this.wxUZMvaN = i4;
        this.VgvYg0wo = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.qoPGr6Ce == n2Var.qoPGr6Ce && this.NCTxEWno == n2Var.NCTxEWno && this.MdtA4re8 == n2Var.MdtA4re8 && this.wxUZMvaN == n2Var.wxUZMvaN && this.VgvYg0wo == n2Var.VgvYg0wo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.VgvYg0wo) + q70.NCTxEWno(this.wxUZMvaN, q70.NCTxEWno(this.MdtA4re8, q70.NCTxEWno(this.NCTxEWno, Integer.hashCode(this.qoPGr6Ce) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "BoardStats(total=" + this.qoPGr6Ce + ", opened=" + this.NCTxEWno + ", rated=" + this.MdtA4re8 + ", compares=" + this.wxUZMvaN + ", rounds=" + this.VgvYg0wo + ")";
    }
}
