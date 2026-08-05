package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ar {
    public final en NCTxEWno;
    public final String qoPGr6Ce;

    public ar(String str, en enVar) {
        this.qoPGr6Ce = str;
        this.NCTxEWno = enVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return this.qoPGr6Ce.equals(arVar.qoPGr6Ce) && this.NCTxEWno.equals(arVar.NCTxEWno);
    }

    public final int hashCode() {
        return this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.qoPGr6Ce + ", range=" + this.NCTxEWno + ')';
    }
}
