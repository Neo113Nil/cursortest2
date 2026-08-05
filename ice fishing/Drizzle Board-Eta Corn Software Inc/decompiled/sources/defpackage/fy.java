package defpackage;

import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fy {
    public final List MdtA4re8;
    public final List NCTxEWno;
    public final r6 VgvYg0wo;
    public final xx qoPGr6Ce;
    public final boolean wxUZMvaN;

    public fy(xx xxVar, List list, List list2, boolean z, r6 r6Var) {
        list.getClass();
        list2.getClass();
        this.qoPGr6Ce = xxVar;
        this.NCTxEWno = list;
        this.MdtA4re8 = list2;
        this.wxUZMvaN = z;
        this.VgvYg0wo = r6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, fyVar.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, fyVar.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, fyVar.MdtA4re8) && this.wxUZMvaN == fyVar.wxUZMvaN && fn.qoPGr6Ce(this.VgvYg0wo, fyVar.VgvYg0wo);
    }

    public final int hashCode() {
        xx xxVar = this.qoPGr6Ce;
        int hashCode = (Boolean.hashCode(this.wxUZMvaN) + ((this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + ((xxVar == null ? 0 : xxVar.hashCode()) * 31)) * 31)) * 31)) * 31;
        r6 r6Var = this.VgvYg0wo;
        return hashCode + (r6Var != null ? r6Var.hashCode() : 0);
    }

    public final String toString() {
        return "PairingCardState(pairing=" + this.qoPGr6Ce + ", flow=" + this.NCTxEWno + ", similar=" + this.MdtA4re8 + ", pickerVisible=" + this.wxUZMvaN + ", panels=" + this.VgvYg0wo + ")";
    }
}
