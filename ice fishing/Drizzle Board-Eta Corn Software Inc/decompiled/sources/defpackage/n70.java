package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n70 {
    public final a4 MdtA4re8;
    public final Set NCTxEWno;
    public final List P7K7Inc8;
    public final kb0 Qr9iLBAD;
    public final List VgvYg0wo;
    public final List b2ZJblxo;
    public final String qoPGr6Ce;
    public final q3 wxUZMvaN;

    public n70(String str, Set set, a4 a4Var, q3 q3Var, List list, List list2, List list3, kb0 kb0Var) {
        str.getClass();
        set.getClass();
        a4Var.getClass();
        q3Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = set;
        this.MdtA4re8 = a4Var;
        this.wxUZMvaN = q3Var;
        this.VgvYg0wo = list;
        this.P7K7Inc8 = list2;
        this.b2ZJblxo = list3;
        this.Qr9iLBAD = kb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n70)) {
            return false;
        }
        n70 n70Var = (n70) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, n70Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, n70Var.NCTxEWno) && this.MdtA4re8 == n70Var.MdtA4re8 && this.wxUZMvaN == n70Var.wxUZMvaN && fn.qoPGr6Ce(this.VgvYg0wo, n70Var.VgvYg0wo) && fn.qoPGr6Ce(this.P7K7Inc8, n70Var.P7K7Inc8) && fn.qoPGr6Ce(this.b2ZJblxo, n70Var.b2ZJblxo) && this.Qr9iLBAD == n70Var.Qr9iLBAD;
    }

    public final int hashCode() {
        int hashCode = (this.b2ZJblxo.hashCode() + ((this.P7K7Inc8.hashCode() + ((this.VgvYg0wo.hashCode() + ((this.wxUZMvaN.hashCode() + ((this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        kb0 kb0Var = this.Qr9iLBAD;
        return hashCode + (kb0Var == null ? 0 : kb0Var.hashCode());
    }

    public final String toString() {
        return "ShelfState(query=" + this.qoPGr6Ce + ", scopes=" + this.NCTxEWno + ", sort=" + this.MdtA4re8 + ", density=" + this.wxUZMvaN + ", items=" + this.VgvYg0wo + ", letters=" + this.P7K7Inc8 + ", compared=" + this.b2ZJblxo + ", mood=" + this.Qr9iLBAD + ")";
    }
}
