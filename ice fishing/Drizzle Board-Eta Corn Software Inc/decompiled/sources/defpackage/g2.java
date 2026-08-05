package defpackage;

import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g2 {
    public final List MdtA4re8;
    public final List NCTxEWno;
    public final boolean P7K7Inc8;
    public final xx VgvYg0wo;
    public final n2 qoPGr6Ce;
    public final kb0 wxUZMvaN;

    public g2(n2 n2Var, List list, List list2, kb0 kb0Var, xx xxVar, boolean z) {
        n2Var.getClass();
        list.getClass();
        list2.getClass();
        this.qoPGr6Ce = n2Var;
        this.NCTxEWno = list;
        this.MdtA4re8 = list2;
        this.wxUZMvaN = kb0Var;
        this.VgvYg0wo = xxVar;
        this.P7K7Inc8 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, g2Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, g2Var.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, g2Var.MdtA4re8) && this.wxUZMvaN == g2Var.wxUZMvaN && fn.qoPGr6Ce(this.VgvYg0wo, g2Var.VgvYg0wo) && this.P7K7Inc8 == g2Var.P7K7Inc8;
    }

    public final int hashCode() {
        int hashCode = (this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31)) * 31)) * 31;
        kb0 kb0Var = this.wxUZMvaN;
        int hashCode2 = (hashCode + (kb0Var == null ? 0 : kb0Var.hashCode())) * 31;
        xx xxVar = this.VgvYg0wo;
        return Boolean.hashCode(this.P7K7Inc8) + ((hashCode2 + (xxVar != null ? xxVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BenchState(stats=" + this.qoPGr6Ce + ", related=" + this.NCTxEWno + ", sprints=" + this.MdtA4re8 + ", mood=" + this.wxUZMvaN + ", lastOpened=" + this.VgvYg0wo + ", ratingVisible=" + this.P7K7Inc8 + ")";
    }
}
