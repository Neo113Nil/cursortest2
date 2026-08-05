package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class py {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final int P7K7Inc8;
    public final String Qr9iLBAD;
    public final String VgvYg0wo;
    public final String b2ZJblxo;
    public final long qoPGr6Ce;
    public final String wxUZMvaN;

    public py(long j, String str, String str2, String str3, String str4, int i, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.qoPGr6Ce = j;
        this.NCTxEWno = str;
        this.MdtA4re8 = str2;
        this.wxUZMvaN = str3;
        this.VgvYg0wo = str4;
        this.P7K7Inc8 = i;
        this.b2ZJblxo = str5;
        this.Qr9iLBAD = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        return this.qoPGr6Ce == pyVar.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, pyVar.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, pyVar.MdtA4re8) && fn.qoPGr6Ce(this.wxUZMvaN, pyVar.wxUZMvaN) && fn.qoPGr6Ce(this.VgvYg0wo, pyVar.VgvYg0wo) && this.P7K7Inc8 == pyVar.P7K7Inc8 && fn.qoPGr6Ce(this.b2ZJblxo, pyVar.b2ZJblxo) && fn.qoPGr6Ce(this.Qr9iLBAD, pyVar.Qr9iLBAD);
    }

    public final int hashCode() {
        return this.Qr9iLBAD.hashCode() + q70.MdtA4re8(this.b2ZJblxo, q70.NCTxEWno(this.P7K7Inc8, q70.MdtA4re8(this.VgvYg0wo, q70.MdtA4re8(this.wxUZMvaN, q70.MdtA4re8(this.MdtA4re8, q70.MdtA4re8(this.NCTxEWno, Long.hashCode(this.qoPGr6Ce) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "PairingListItem(id=" + this.qoPGr6Ce + ", name=" + this.NCTxEWno + ", emoji=" + this.MdtA4re8 + ", sauceBase=" + this.wxUZMvaN + ", intensity=" + this.VgvYg0wo + ", prepMinutes=" + this.P7K7Inc8 + ", cuisine=" + this.b2ZJblxo + ", scope=" + this.Qr9iLBAD + ")";
    }
}
