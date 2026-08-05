package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w6 {
    public final q6 MdtA4re8;
    public final q6 NCTxEWno;
    public final long qoPGr6Ce;

    public w6(long j, q6 q6Var, q6 q6Var2) {
        this.qoPGr6Ce = j;
        this.NCTxEWno = q6Var;
        this.MdtA4re8 = q6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return this.qoPGr6Ce == w6Var.qoPGr6Ce && this.NCTxEWno.equals(w6Var.NCTxEWno) && this.MdtA4re8.equals(w6Var.MdtA4re8);
    }

    public final int hashCode() {
        return this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (Long.hashCode(this.qoPGr6Ce) * 31)) * 31);
    }

    public final String toString() {
        return "ComparedItem(id=" + this.qoPGr6Ce + ", left=" + this.NCTxEWno + ", right=" + this.MdtA4re8 + ")";
    }
}
