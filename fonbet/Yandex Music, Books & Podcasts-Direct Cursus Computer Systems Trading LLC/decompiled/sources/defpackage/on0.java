package defpackage;

/* loaded from: classes3.dex */
public final class on0 {
    public final float a;
    public final float b;

    public on0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on0)) {
            return false;
        }
        on0 on0Var = (on0) obj;
        return cma.a(this.a, on0Var.a) && cma.a(this.b, on0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + eta.a(Boolean.hashCode(true) * 31, this.a, 31);
    }

    public final String toString() {
        return hrg.s("AnnotatedStringNoWrapData(enabled=true, maxWidth=", cma.b(this.a), ", maxHeight=", cma.b(this.b), ")");
    }
}
