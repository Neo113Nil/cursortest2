package defpackage;

/* loaded from: classes.dex */
public final class tkm0 {
    public final float a;
    public final long b;
    public final qar c;

    public tkm0(float f, long j, qar qarVar) {
        this.a = f;
        this.b = j;
        this.c = qarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkm0)) {
            return false;
        }
        tkm0 tkm0Var = (tkm0) obj;
        return Float.compare(this.a, tkm0Var.a) == 0 && jw01.a(this.b, tkm0Var.b) && jl40.l(this.c, tkm0Var.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i = jw01.c;
        return this.c.hashCode() + qv10.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) jw01.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
