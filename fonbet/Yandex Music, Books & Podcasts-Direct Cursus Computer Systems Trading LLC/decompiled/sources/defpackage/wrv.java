package defpackage;

/* loaded from: classes4.dex */
public final class wrv {
    public final int a;
    public final int b;

    public wrv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static wrv a(wrv wrvVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = wrvVar.a;
        }
        if ((i3 & 2) != 0) {
            i2 = wrvVar.b;
        }
        return new wrv(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrv)) {
            return false;
        }
        wrv wrvVar = (wrv) obj;
        return this.a == wrvVar.a && this.b == wrvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("Coordinates(x=", this.a, this.b, ", y=", ")");
    }
}
