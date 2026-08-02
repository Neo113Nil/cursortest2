package defpackage;

/* loaded from: classes12.dex */
public final class wnb implements xnb {
    public final dge a;
    public final nib b;

    public wnb(dge dgeVar, nib nibVar) {
        this.a = dgeVar;
        this.b = nibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnb)) {
            return false;
        }
        wnb wnbVar = (wnb) obj;
        return jl40.l(this.a, wnbVar.a) && this.b.equals(wnbVar.b);
    }

    @Override // defpackage.xnb
    public final blb getNavigation() {
        return null;
    }

    public final int hashCode() {
        return (this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "Loading(footer=" + this.a + ", backAction=" + this.b + ", navigation=null)";
    }
}
