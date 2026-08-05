package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class x6 {
    public final xx MdtA4re8;
    public final xx NCTxEWno;
    public final long qoPGr6Ce;

    public x6(long j, xx xxVar, xx xxVar2) {
        this.qoPGr6Ce = j;
        this.NCTxEWno = xxVar;
        this.MdtA4re8 = xxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return this.qoPGr6Ce == x6Var.qoPGr6Ce && this.NCTxEWno.equals(x6Var.NCTxEWno) && this.MdtA4re8.equals(x6Var.MdtA4re8);
    }

    public final int hashCode() {
        return this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (Long.hashCode(this.qoPGr6Ce) * 31)) * 31);
    }

    public final String toString() {
        return "ComparedPair(id=" + this.qoPGr6Ce + ", left=" + this.NCTxEWno + ", right=" + this.MdtA4re8 + ")";
    }
}
