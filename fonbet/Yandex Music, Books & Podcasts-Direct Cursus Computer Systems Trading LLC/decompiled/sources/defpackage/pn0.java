package defpackage;

/* loaded from: classes3.dex */
public final class pn0 {
    public final float a;
    public final float b;
    public final nim c;
    public final float d;

    public pn0(float f, float f2, nim nimVar, float f3) {
        this.a = f;
        this.b = f2;
        this.c = nimVar;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn0)) {
            return false;
        }
        pn0 pn0Var = (pn0) obj;
        return cma.a(this.a, pn0Var.a) && cma.a(this.b, pn0Var.b) && this.c.equals(pn0Var.c) && cma.a(this.d, pn0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k5r.e((this.c.hashCode() + eta.a(Float.hashCode(this.a) * 31, this.b, 31)) * 31, 31, false);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String b2 = cma.b(this.b);
        String b3 = cma.b(this.d);
        StringBuilder m = f1d.m("AnnotatedStringPostfixData(maxWidth=", b, ", maxHeight=", b2, ", postfix=");
        m.append(this.c);
        m.append(", onlyWhenOverflow=false, horizontalPadding=");
        m.append(b3);
        m.append(")");
        return m.toString();
    }
}
