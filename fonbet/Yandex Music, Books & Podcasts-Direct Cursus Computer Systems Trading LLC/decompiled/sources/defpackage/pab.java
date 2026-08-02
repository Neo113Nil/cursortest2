package defpackage;

/* loaded from: classes3.dex */
public final class pab implements qab {
    public final kjm a;
    public final nkm b;

    public pab(kjm kjmVar, nkm nkmVar) {
        this.a = kjmVar;
        this.b = nkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pab)) {
            return false;
        }
        pab pabVar = (pab) obj;
        return this.a.equals(pabVar.a) && this.b.equals(pabVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreSaveEntity(data=" + this.a + ", uiData=" + this.b + ")";
    }
}
