package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r6 {
    public final q6 NCTxEWno;
    public final q6 qoPGr6Ce;

    public r6(q6 q6Var, q6 q6Var2) {
        this.qoPGr6Ce = q6Var;
        this.NCTxEWno = q6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return this.qoPGr6Ce.equals(r6Var.qoPGr6Ce) && this.NCTxEWno.equals(r6Var.NCTxEWno);
    }

    public final int hashCode() {
        return this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31);
    }

    public final String toString() {
        return "ComparePanels(left=" + this.qoPGr6Ce + ", right=" + this.NCTxEWno + ")";
    }
}
