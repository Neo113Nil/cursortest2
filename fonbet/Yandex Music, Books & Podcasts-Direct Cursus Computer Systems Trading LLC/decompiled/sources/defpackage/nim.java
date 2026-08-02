package defpackage;

/* loaded from: classes3.dex */
public final class nim {
    public final mn0 a;
    public final String b;
    public final Object c = btf.a(bwf.c, new ril(24, this));

    public nim(mn0 mn0Var, String str) {
        this.a = mn0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nim)) {
            return false;
        }
        nim nimVar = (nim) obj;
        return this.a.equals(nimVar.a) && this.b.equals(nimVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }

    public final String toString() {
        return "Postfix(text=" + ((Object) this.a) + ", style=null, truncateSymbol=" + this.b + ")";
    }
}
