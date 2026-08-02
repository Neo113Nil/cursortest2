package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class q9d0 {
    public static final m9d0 Companion = new m9d0();
    public final String a;
    public final p9d0 b;

    public /* synthetic */ q9d0(int i, String str, p9d0 p9d0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, l9d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = p9d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9d0)) {
            return false;
        }
        q9d0 q9d0Var = (q9d0) obj;
        return jl40.l(this.a, q9d0Var.a) && jl40.l(this.b, q9d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Argument(key=" + this.a + ", data=" + this.b + ')';
    }
}
