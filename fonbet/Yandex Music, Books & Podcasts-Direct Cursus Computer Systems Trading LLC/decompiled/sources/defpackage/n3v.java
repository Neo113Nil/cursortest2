package defpackage;

/* loaded from: classes4.dex */
public final class n3v {
    public final int a;
    public final int b;

    public n3v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3v)) {
            return false;
        }
        n3v n3vVar = (n3v) obj;
        return this.a == n3vVar.a && this.b == n3vVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("WaveScreenShaderUiColors(foregroundColor=", this.a, this.b, ", backgroundColor=", ")");
    }
}
