package defpackage;

/* loaded from: classes3.dex */
public final class r34 {
    public final ahs a;
    public final f24 b;
    public final boolean c;

    public r34(ahs ahsVar, f24 f24Var, boolean z) {
        f24Var.getClass();
        this.a = ahsVar;
        this.b = f24Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r34)) {
            return false;
        }
        r34 r34Var = (r34) obj;
        return this.a.equals(r34Var.a) && this.b == r34Var.b && this.c == r34Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.b + "(pin=" + this.c + ", title=" + this.a.getTitle() + ")";
    }
}
