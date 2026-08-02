package defpackage;

/* loaded from: classes4.dex */
public final class vqw {
    public static final vqw d = new vqw(10);
    public final int a;
    public final eq4 b;
    public final boolean c;

    public vqw(int i) {
        this.a = i;
        this.b = new eq4(0.0d, i);
        this.c = i <= 0;
    }

    public final wqw a(int i) {
        return new wqw(yhn.d(i, 0, this.a), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqw) && this.a == ((vqw) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Spec(steps=", ")");
    }
}
