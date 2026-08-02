package defpackage;

/* loaded from: classes3.dex */
public final class x32 {
    public final int a;
    public final int b;
    public final k22 c;

    public x32(int i, int i2, k22 k22Var) {
        k22Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = k22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x32)) {
            return false;
        }
        x32 x32Var = (x32) obj;
        return this.a == x32Var.a && this.b == x32Var.b && this.c == x32Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("AutoCachedVariant(limit=", this.a, this.b, ", description=", ", autoCacheSize=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
