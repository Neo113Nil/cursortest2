package defpackage;

/* loaded from: classes10.dex */
public final class sf10 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public sf10(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final sf10 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new sf10(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf10)) {
            return false;
        }
        sf10 sf10Var = (sf10) obj;
        return this.a.equals(sf10Var.a) && this.b == sf10Var.b && this.c == sf10Var.c && this.d == sf10Var.d && this.e == sf10Var.e;
    }

    public final int hashCode() {
        return ((((((smw0.c(527, 31, this.a) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public sf10(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public sf10(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public sf10(Object obj) {
        this(-1L, obj);
    }
}
