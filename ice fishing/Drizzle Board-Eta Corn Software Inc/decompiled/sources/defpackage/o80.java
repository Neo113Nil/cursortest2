package defpackage;

import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o80 {
    public final i90 MdtA4re8;
    public final List NCTxEWno;
    public final w80 qoPGr6Ce;

    public o80(w80 w80Var, List list, i90 i90Var) {
        list.getClass();
        i90Var.getClass();
        this.qoPGr6Ce = w80Var;
        this.NCTxEWno = list;
        this.MdtA4re8 = i90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o80)) {
            return false;
        }
        o80 o80Var = (o80) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, o80Var.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, o80Var.NCTxEWno) && this.MdtA4re8 == o80Var.MdtA4re8;
    }

    public final int hashCode() {
        w80 w80Var = this.qoPGr6Ce;
        int hashCode = w80Var == null ? 0 : w80Var.hashCode();
        return this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "SprintRecapState(round=" + this.qoPGr6Ce + ", rows=" + this.NCTxEWno + ", trait=" + this.MdtA4re8 + ")";
    }
}
