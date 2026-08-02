package defpackage;

/* loaded from: classes10.dex */
public final class x450 {
    public final t550 a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public x450(t550 t550Var, boolean z, Object obj, boolean z2) {
        if (!t550Var.a && z) {
            w511.f(t550Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            yci0.x("Argument with type ", t550Var.b(), " has null value but is not nullable.");
            throw null;
        }
        this.a = t550Var;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !x450.class.equals(obj.getClass())) {
            return false;
        }
        x450 x450Var = (x450) obj;
        if (this.b != x450Var.b || this.c != x450Var.c || !this.a.equals(x450Var.a)) {
            return false;
        }
        Object obj2 = x450Var.d;
        Object obj3 = this.d;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x450.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        return sb.toString();
    }
}
