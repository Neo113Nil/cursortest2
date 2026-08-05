package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q6 {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final String P7K7Inc8;
    public final int VgvYg0wo;
    public final String qoPGr6Ce;
    public final String wxUZMvaN;

    public q6(String str, String str2, String str3, String str4, int i, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = str2;
        this.MdtA4re8 = str3;
        this.wxUZMvaN = str4;
        this.VgvYg0wo = i;
        this.P7K7Inc8 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, q6Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, q6Var.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, q6Var.MdtA4re8) && fn.qoPGr6Ce(this.wxUZMvaN, q6Var.wxUZMvaN) && this.VgvYg0wo == q6Var.VgvYg0wo && fn.qoPGr6Ce(this.P7K7Inc8, q6Var.P7K7Inc8);
    }

    public final int hashCode() {
        return this.P7K7Inc8.hashCode() + q70.NCTxEWno(this.VgvYg0wo, q70.MdtA4re8(this.wxUZMvaN, q70.MdtA4re8(this.MdtA4re8, q70.MdtA4re8(this.NCTxEWno, this.qoPGr6Ce.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "ComparePanelData(emoji=" + this.qoPGr6Ce + ", name=" + this.NCTxEWno + ", sauceBase=" + this.MdtA4re8 + ", intensity=" + this.wxUZMvaN + ", prepMinutes=" + this.VgvYg0wo + ", cuisine=" + this.P7K7Inc8 + ")";
    }
}
