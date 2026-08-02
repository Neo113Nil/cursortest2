package defpackage;

/* loaded from: classes10.dex */
public final class s9x {
    public final Object a;
    public final Object b;

    public s9x(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9x)) {
            return false;
        }
        s9x s9xVar = (s9x) obj;
        return jl40.l(this.a, s9xVar.a) && jl40.l(this.b, s9xVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        if (obj2 instanceof Enum) {
            i = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i + ordinal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.a);
        sb.append(", right=");
        return qv10.r(sb, this.b, ')');
    }
}
