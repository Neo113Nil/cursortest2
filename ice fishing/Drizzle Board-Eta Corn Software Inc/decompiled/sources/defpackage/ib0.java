package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ib0 {
    public final List MdtA4re8;
    public final boolean NCTxEWno;
    public final String qoPGr6Ce;
    public final List wxUZMvaN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public ib0(String str, boolean z, List list, List list2) {
        str.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = z;
        this.MdtA4re8 = list;
        this.wxUZMvaN = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.wxUZMvaN = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        String str = ib0Var.qoPGr6Ce;
        if (this.NCTxEWno != ib0Var.NCTxEWno || !this.MdtA4re8.equals(ib0Var.MdtA4re8) || !fn.qoPGr6Ce(this.wxUZMvaN, ib0Var.wxUZMvaN)) {
            return false;
        }
        String str2 = this.qoPGr6Ce;
        return ja0.Ey6iv0m0(str2, "index_") ? ja0.Ey6iv0m0(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.qoPGr6Ce;
        return this.wxUZMvaN.hashCode() + ((this.MdtA4re8.hashCode() + ((((ja0.Ey6iv0m0(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.NCTxEWno ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return ca0.sjUBp5pO(ca0.OxcuoDLp("\n            |Index {\n            |   name = '" + this.qoPGr6Ce + "',\n            |   unique = '" + this.NCTxEWno + "',\n            |   columns = {" + ca0.sjUBp5pO(x5.Sjrx9cEN(this.MdtA4re8, ",", null, null, null, 62)).concat(ca0.sjUBp5pO("},")) + "\n            |   orders = {" + ca0.sjUBp5pO(x5.Sjrx9cEN(this.wxUZMvaN, ",", null, null, null, 62)).concat(ca0.sjUBp5pO(" }")) + "\n            |}\n        "));
    }
}
