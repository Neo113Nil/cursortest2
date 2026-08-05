package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class et {
    public final long MdtA4re8;
    public final boolean NCTxEWno;
    public final kb0 qoPGr6Ce;

    public et(kb0 kb0Var, boolean z, long j) {
        this.qoPGr6Ce = kb0Var;
        this.NCTxEWno = z;
        this.MdtA4re8 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return this.qoPGr6Ce == etVar.qoPGr6Ce && this.NCTxEWno == etVar.NCTxEWno && this.MdtA4re8 == etVar.MdtA4re8;
    }

    public final int hashCode() {
        kb0 kb0Var = this.qoPGr6Ce;
        int hashCode = kb0Var == null ? 0 : kb0Var.hashCode();
        return Long.hashCode(this.MdtA4re8) + ((Boolean.hashCode(this.NCTxEWno) + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "MoodState(mood=" + this.qoPGr6Ce + ", introShown=" + this.NCTxEWno + ", ratingDismissedFor=" + this.MdtA4re8 + ")";
    }
}
