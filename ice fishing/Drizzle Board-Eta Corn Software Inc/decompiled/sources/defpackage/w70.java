package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w70 {
    public final w80 NCTxEWno;
    public final i90 qoPGr6Ce;

    public w70(i90 i90Var, w80 w80Var) {
        i90Var.getClass();
        this.qoPGr6Ce = i90Var;
        this.NCTxEWno = w80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w70)) {
            return false;
        }
        w70 w70Var = (w70) obj;
        return this.qoPGr6Ce == w70Var.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, w70Var.NCTxEWno);
    }

    public final int hashCode() {
        int hashCode = this.qoPGr6Ce.hashCode() * 31;
        w80 w80Var = this.NCTxEWno;
        return hashCode + (w80Var == null ? 0 : w80Var.hashCode());
    }

    public final String toString() {
        return "SortSprintState(trait=" + this.qoPGr6Ce + ", bestRound=" + this.NCTxEWno + ")";
    }
}
