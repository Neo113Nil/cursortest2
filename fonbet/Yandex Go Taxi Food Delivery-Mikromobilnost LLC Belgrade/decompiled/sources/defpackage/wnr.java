package defpackage;

/* loaded from: classes9.dex */
public final class wnr implements b6x {
    public final String a;
    public final x4x b;

    public wnr(String str, x4x x4xVar) {
        this.a = str;
        this.b = x4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnr)) {
            return false;
        }
        wnr wnrVar = (wnr) obj;
        return jl40.l(this.a, wnrVar.a) && jl40.l(this.b, wnrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Float64Evaluator(name=" + this.a + ", code=" + this.b + ')';
    }
}
