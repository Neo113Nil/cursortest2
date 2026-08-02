package defpackage;

/* loaded from: classes4.dex */
public final class du7 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public du7(int i, int i2) {
        this.a = i;
        this.b = i2;
        boolean z = false;
        this.c = i == i2 && i2 != -1;
        if (i == i2 && i2 == -1) {
            z = true;
        }
        this.d = z;
    }

    public static du7 a(du7 du7Var, int i) {
        int i2 = du7Var.a;
        du7Var.getClass();
        return new du7(i2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du7)) {
            return false;
        }
        du7 du7Var = (du7) obj;
        return this.a == du7Var.a && this.b == du7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("Position(current=", ran.a(this.a), ", live=", ran.a(this.b), ")");
    }
}
