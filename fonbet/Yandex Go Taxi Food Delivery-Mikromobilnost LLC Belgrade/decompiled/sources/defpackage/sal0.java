package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sal0 extends ual0 {
    public final DrivingRoute a;
    public final int b;
    public final int c;
    public final double d;

    public sal0(DrivingRoute drivingRoute, int i, int i2, double d) {
        this.a = drivingRoute;
        this.b = i;
        this.c = i2;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sal0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        sal0 sal0Var = (sal0) obj;
        return this.b == sal0Var.b && this.c == sal0Var.c && this.d == sal0Var.d;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + (((this.b * 31) + this.c) * 31);
    }

    public final String toString() {
        return "Ready(drivingRoute=" + this.a + ", emitVersion=" + this.b + ", segmentIndex=" + this.c + ", segmentPosition=" + this.d + Extension.C_BRAKE;
    }
}
