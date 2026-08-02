package defpackage;

/* loaded from: classes.dex */
public final class rg3 {
    public final vqf a;
    public final int b;
    public final int c;

    public rg3(vqf vqfVar, int i, int i2) {
        this.a = vqfVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg3)) {
            return false;
        }
        rg3 rg3Var = (rg3) obj;
        return this.a == rg3Var.a && this.b == rg3Var.b && this.c == rg3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) d40.b(this.b)) + ", verticalAlignment=" + ((Object) e40.b(this.c)) + ')';
    }
}
