package defpackage;

/* loaded from: classes.dex */
public final class dma implements am6 {
    public final float a;

    public dma(float f) {
        this.a = f;
    }

    @Override // defpackage.am6
    public final float a(long j, jx7 jx7Var) {
        return jx7Var.n0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dma) && cma.a(this.a, ((dma) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return su4.m(this.a, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
