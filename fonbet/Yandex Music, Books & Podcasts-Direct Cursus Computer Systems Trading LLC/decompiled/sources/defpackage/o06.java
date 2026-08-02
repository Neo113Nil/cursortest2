package defpackage;

/* loaded from: classes3.dex */
public final class o06 {
    public final int a;
    public final int b;

    public o06(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o06)) {
            return false;
        }
        o06 o06Var = (o06) obj;
        return this.a == o06Var.a && this.b == o06Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("ConcertTabConfigParameters(offset=", this.a, this.b, ", limit=", ")");
    }
}
