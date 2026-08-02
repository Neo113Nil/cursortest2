package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vy60 {
    public final double a;
    public final double b;

    public vy60(double d) {
        Integer num = 1000;
        double doubleValue = num.doubleValue();
        this.a = d;
        this.b = doubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy60)) {
            return false;
        }
        vy60 vy60Var = (vy60) obj;
        return Double.compare(this.a, vy60Var.a) == 0 && Double.compare(this.b, vy60Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("AccuracyEstimation(averageSpeed=", jpt0.a(this.a), ", defaultAccuracy=", u1k.a(this.b), Extension.C_BRAKE);
    }
}
