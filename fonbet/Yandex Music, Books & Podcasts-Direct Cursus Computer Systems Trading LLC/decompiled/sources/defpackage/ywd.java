package defpackage;

/* loaded from: classes4.dex */
public final class ywd {
    public static final ywd c = new ywd(1, 1000);
    public static final ywd d = new ywd(0, 0);
    public final int a;
    public final int b;

    public ywd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywd)) {
            return false;
        }
        ywd ywdVar = (ywd) obj;
        return this.a == ywdVar.a && this.b == ywdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.f("HedgingParams(parallelism=", this.a, this.b, ", delayOffsetMs=", ")");
    }
}
