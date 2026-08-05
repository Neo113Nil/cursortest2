package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class t70 {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final int P7K7Inc8;
    public final String VgvYg0wo;
    public final boolean b2ZJblxo;
    public final long qoPGr6Ce;
    public final String wxUZMvaN;

    public t70(long j, String str, String str2, String str3, String str4, int i, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.qoPGr6Ce = j;
        this.NCTxEWno = str;
        this.MdtA4re8 = str2;
        this.wxUZMvaN = str3;
        this.VgvYg0wo = str4;
        this.P7K7Inc8 = i;
        this.b2ZJblxo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        return this.qoPGr6Ce == t70Var.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, t70Var.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, t70Var.MdtA4re8) && fn.qoPGr6Ce(this.wxUZMvaN, t70Var.wxUZMvaN) && fn.qoPGr6Ce(this.VgvYg0wo, t70Var.VgvYg0wo) && this.P7K7Inc8 == t70Var.P7K7Inc8 && this.b2ZJblxo == t70Var.b2ZJblxo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b2ZJblxo) + q70.NCTxEWno(this.P7K7Inc8, q70.MdtA4re8(this.VgvYg0wo, q70.MdtA4re8(this.wxUZMvaN, q70.MdtA4re8(this.MdtA4re8, q70.MdtA4re8(this.NCTxEWno, Long.hashCode(this.qoPGr6Ce) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SortCardItem(pairId=" + this.qoPGr6Ce + ", name=" + this.NCTxEWno + ", emoji=" + this.MdtA4re8 + ", sauceBase=" + this.wxUZMvaN + ", cuisine=" + this.VgvYg0wo + ", position=" + this.P7K7Inc8 + ", selected=" + this.b2ZJblxo + ")";
    }
}
