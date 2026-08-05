package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g10 {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final int VgvYg0wo;
    public final String qoPGr6Ce;
    public final int wxUZMvaN;

    public g10(String str, String str2, String str3, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = str2;
        this.MdtA4re8 = str3;
        this.wxUZMvaN = i;
        this.VgvYg0wo = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, g10Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, g10Var.NCTxEWno) && this.MdtA4re8.equals(g10Var.MdtA4re8) && this.wxUZMvaN == g10Var.wxUZMvaN && this.VgvYg0wo == g10Var.VgvYg0wo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.VgvYg0wo) + q70.NCTxEWno(this.wxUZMvaN, q70.MdtA4re8(this.MdtA4re8, q70.MdtA4re8(this.NCTxEWno, this.qoPGr6Ce.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RecapRowItem(name=" + this.qoPGr6Ce + ", emoji=" + this.NCTxEWno + ", traitValue=" + this.MdtA4re8 + ", yourPlace=" + this.wxUZMvaN + ", correctPlace=" + this.VgvYg0wo + ")";
    }
}
