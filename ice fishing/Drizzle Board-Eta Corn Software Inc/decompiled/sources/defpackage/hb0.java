package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hb0 {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final ArrayList VgvYg0wo;
    public final String qoPGr6Ce;
    public final ArrayList wxUZMvaN;

    public hb0(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = str2;
        this.MdtA4re8 = str3;
        this.wxUZMvaN = arrayList;
        this.VgvYg0wo = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0Var = (hb0) obj;
        if (fn.qoPGr6Ce(this.qoPGr6Ce, hb0Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, hb0Var.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, hb0Var.MdtA4re8) && this.wxUZMvaN.equals(hb0Var.wxUZMvaN)) {
            return this.VgvYg0wo.equals(hb0Var.VgvYg0wo);
        }
        return false;
    }

    public final int hashCode() {
        return this.VgvYg0wo.hashCode() + ((this.wxUZMvaN.hashCode() + q70.MdtA4re8(this.MdtA4re8, q70.MdtA4re8(this.NCTxEWno, this.qoPGr6Ce.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return ca0.sjUBp5pO(ca0.OxcuoDLp("\n            |ForeignKey {\n            |   referenceTable = '" + this.qoPGr6Ce + "',\n            |   onDelete = '" + this.NCTxEWno + "',\n            |   onUpdate = '" + this.MdtA4re8 + "',\n            |   columnNames = {" + ca0.sjUBp5pO(x5.Sjrx9cEN(x5.uQ3KJUK5(this.wxUZMvaN), ",", null, null, null, 62)).concat(ca0.sjUBp5pO("},")) + "\n            |   referenceColumnNames = {" + ca0.sjUBp5pO(x5.Sjrx9cEN(x5.uQ3KJUK5(this.VgvYg0wo), ",", null, null, null, 62)).concat(ca0.sjUBp5pO(" }")) + "\n            |}\n        "));
    }
}
