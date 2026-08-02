package defpackage;

/* loaded from: classes7.dex */
public class rg71 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public rg71(rg71 rg71Var) {
        this.a = rg71Var.a;
        this.b = rg71Var.b;
        this.c = rg71Var.c;
        this.d = rg71Var.d;
        this.e = rg71Var.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg71)) {
            return false;
        }
        rg71 rg71Var = (rg71) obj;
        return this.a.equals(rg71Var.a) && this.b == rg71Var.b && this.c == rg71Var.c && this.d == rg71Var.d && this.e == rg71Var.e;
    }

    public final int hashCode() {
        return ((((((smw0.c(527, 31, this.a) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public rg71(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
