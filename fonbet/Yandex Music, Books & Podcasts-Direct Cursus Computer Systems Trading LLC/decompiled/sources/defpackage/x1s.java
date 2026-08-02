package defpackage;

/* loaded from: classes3.dex */
public final class x1s {
    public final int a;
    public final int b;

    public x1s(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1s)) {
            return false;
        }
        x1s x1sVar = (x1s) obj;
        return this.a == x1sVar.a && this.b == x1sVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("TabUiData(textRes=", this.a, this.b, ", counter=", ")");
    }
}
