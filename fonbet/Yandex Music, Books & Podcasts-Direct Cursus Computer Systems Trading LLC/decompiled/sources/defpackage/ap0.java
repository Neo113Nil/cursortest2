package defpackage;

/* loaded from: classes5.dex */
public final class ap0 {
    public final int a;
    public final int b;
    public final int c;

    public ap0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final Integer a() {
        int i = this.a;
        if ((i + 1) * this.b < this.c) {
            return Integer.valueOf(i + 1);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap0)) {
            return false;
        }
        ap0 ap0Var = (ap0) obj;
        return this.a == ap0Var.a && this.b == ap0Var.b && this.c == ap0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return f1d.i(dfi.l("ApiPager(currentPage=", this.a, this.b, ", pageSize=", ", total="), this.c, ")");
    }

    public /* synthetic */ ap0(int i, int i2) {
        this(i, i2, Integer.MAX_VALUE);
    }
}
