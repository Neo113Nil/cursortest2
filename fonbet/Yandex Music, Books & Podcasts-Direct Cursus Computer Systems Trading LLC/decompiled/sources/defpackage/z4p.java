package defpackage;

/* loaded from: classes3.dex */
public final class z4p {
    public final int a;
    public final int b;

    public z4p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4p)) {
            return false;
        }
        z4p z4pVar = (z4p) obj;
        return this.a == z4pVar.a && this.b == z4pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("Key(index=", this.a, this.b, ", nextPage=", ")");
    }
}
