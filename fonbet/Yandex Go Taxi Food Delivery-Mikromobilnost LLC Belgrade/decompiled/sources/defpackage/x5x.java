package defpackage;

/* loaded from: classes9.dex */
public final class x5x implements b6x {
    public final String a;
    public final x4x b;

    public x5x(String str, x4x x4xVar) {
        this.a = str;
        this.b = x4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5x)) {
            return false;
        }
        x5x x5xVar = (x5x) obj;
        return jl40.l(this.a, x5xVar.a) && jl40.l(this.b, x5xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JasonScript(name=" + this.a + ", code=" + this.b + ')';
    }
}
