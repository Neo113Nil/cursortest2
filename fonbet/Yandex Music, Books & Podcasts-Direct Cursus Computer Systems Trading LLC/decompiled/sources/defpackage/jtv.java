package defpackage;

/* loaded from: classes4.dex */
public final class jtv {
    public final int a;
    public final int b;

    public jtv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static jtv a(jtv jtvVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = jtvVar.a;
        }
        if ((i3 & 2) != 0) {
            i2 = jtvVar.b;
        }
        return new jtv(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtv)) {
            return false;
        }
        jtv jtvVar = (jtv) obj;
        return this.a == jtvVar.a && this.b == jtvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("Coordinates(x=", this.a, this.b, ", y=", ")");
    }
}
