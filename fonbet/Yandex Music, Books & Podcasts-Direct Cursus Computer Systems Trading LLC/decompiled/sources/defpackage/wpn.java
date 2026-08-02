package defpackage;

/* loaded from: classes3.dex */
public final class wpn {
    public final int a;
    public final int b;

    public wpn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpn)) {
            return false;
        }
        wpn wpnVar = (wpn) obj;
        return this.a == wpnVar.a && this.b == wpnVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("KeepAliveParams(timeSeconds=", this.a, this.b, ", timeoutSeconds=", ")");
    }
}
