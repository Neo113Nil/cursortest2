package defpackage;

/* loaded from: classes4.dex */
public final class e7u {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public e7u(int i, int i2) {
        this.a = i;
        this.b = i2;
        boolean z = false;
        this.c = i == i2 && i2 != -1;
        if (i == i2 && i2 == -1) {
            z = true;
        }
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7u)) {
            return false;
        }
        e7u e7uVar = (e7u) obj;
        return this.a == e7uVar.a && this.b == e7uVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("Position(current=", this.a, this.b, ", live=", ")");
    }
}
