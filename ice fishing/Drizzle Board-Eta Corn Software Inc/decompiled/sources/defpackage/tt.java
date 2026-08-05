package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tt {
    public final boolean MdtA4re8;
    public final boolean NCTxEWno;
    public final ev qoPGr6Ce;
    public final Object wxUZMvaN;

    public tt(ev evVar, boolean z, Object obj, boolean z2) {
        if (!evVar.qoPGr6Ce && z) {
            m1.NCTxEWno(evVar.NCTxEWno().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            m1.KlHjfFWx(evVar.NCTxEWno(), " has null value but is not nullable.", "Argument with type ");
            throw null;
        }
        this.qoPGr6Ce = evVar;
        this.NCTxEWno = z;
        this.wxUZMvaN = obj;
        this.MdtA4re8 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tt.class != obj.getClass()) {
            return false;
        }
        tt ttVar = (tt) obj;
        if (this.NCTxEWno != ttVar.NCTxEWno || this.MdtA4re8 != ttVar.MdtA4re8 || !this.qoPGr6Ce.equals(ttVar.qoPGr6Ce)) {
            return false;
        }
        Object obj2 = ttVar.wxUZMvaN;
        Object obj3 = this.wxUZMvaN;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.qoPGr6Ce.hashCode() * 31) + (this.NCTxEWno ? 1 : 0)) * 31) + (this.MdtA4re8 ? 1 : 0)) * 31;
        Object obj = this.wxUZMvaN;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m20.qoPGr6Ce(tt.class).MdtA4re8());
        sb.append(" Type: " + this.qoPGr6Ce);
        sb.append(" Nullable: " + this.NCTxEWno);
        if (this.MdtA4re8) {
            sb.append(" DefaultValue: " + this.wxUZMvaN);
        }
        return sb.toString();
    }
}
