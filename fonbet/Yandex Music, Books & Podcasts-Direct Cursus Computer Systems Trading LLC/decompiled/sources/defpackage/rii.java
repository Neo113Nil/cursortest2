package defpackage;

/* loaded from: classes3.dex */
public final class rii implements zii {
    public final u51 a;
    public final boolean b;

    public rii(u51 u51Var, boolean z) {
        this.a = u51Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rii)) {
            return false;
        }
        rii riiVar = (rii) obj;
        return this.a.equals(riiVar.a) && this.b == riiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.zii
    public final boolean r() {
        return this.b;
    }

    public final String toString() {
        return "Artist(domainModel=" + this.a + ", available=" + this.b + ")";
    }
}
