package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class m70 {
    public final a4 MdtA4re8;
    public final Set NCTxEWno;
    public final kb0 VgvYg0wo;
    public final String qoPGr6Ce;
    public final q3 wxUZMvaN;

    public m70(String str, Set set, a4 a4Var, q3 q3Var, kb0 kb0Var) {
        str.getClass();
        set.getClass();
        a4Var.getClass();
        q3Var.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = set;
        this.MdtA4re8 = a4Var;
        this.wxUZMvaN = q3Var;
        this.VgvYg0wo = kb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m70)) {
            return false;
        }
        m70 m70Var = (m70) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, m70Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, m70Var.NCTxEWno) && this.MdtA4re8 == m70Var.MdtA4re8 && this.wxUZMvaN == m70Var.wxUZMvaN && this.VgvYg0wo == m70Var.VgvYg0wo;
    }

    public final int hashCode() {
        int hashCode = (this.wxUZMvaN.hashCode() + ((this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31)) * 31)) * 31)) * 31;
        kb0 kb0Var = this.VgvYg0wo;
        return hashCode + (kb0Var == null ? 0 : kb0Var.hashCode());
    }

    public final String toString() {
        return "ShelfFilters(query=" + this.qoPGr6Ce + ", scopes=" + this.NCTxEWno + ", sort=" + this.MdtA4re8 + ", density=" + this.wxUZMvaN + ", mood=" + this.VgvYg0wo + ")";
    }
}
