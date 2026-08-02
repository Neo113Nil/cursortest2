package defpackage;

/* loaded from: classes3.dex */
public final class sx2 {
    public final float a;
    public final boolean b;

    public sx2(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx2)) {
            return false;
        }
        sx2 sx2Var = (sx2) obj;
        return Float.compare(this.a, sx2Var.a) == 0 && this.b == sx2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BatteryStatus(batteryPercent=" + this.a + ", isCharging=" + this.b + ")";
    }
}
