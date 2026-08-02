package defpackage;

import android.graphics.Path;

/* loaded from: classes11.dex */
public final class vr90 {
    public char a;
    public float[] b;

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d4 * sin) + (d3 * cos)) / d5;
        double d7 = f6;
        double d8 = ((d4 * cos) + ((-f) * sin)) / d7;
        double d9 = f4;
        double a = vfc.a(d9, sin, f3 * cos, d5);
        double d10 = d3;
        double a2 = vfc.a(d9, cos, (-f3) * sin, d7);
        double d11 = d6 - a;
        double d12 = d8 - a2;
        double d13 = (d6 + a) / 2.0d;
        double d14 = (d8 + a2) / 2.0d;
        double d15 = (d12 * d12) + (d11 * d11);
        if (d15 == 0.0d) {
            return;
        }
        double d16 = (1.0d / d15) - 0.25d;
        if (d16 < 0.0d) {
            float sqrt = (float) (Math.sqrt(d15) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * sqrt, sqrt * f6, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d16);
        double d17 = d11 * sqrt2;
        double d18 = sqrt2 * d12;
        if (z == z2) {
            d = d13 - d18;
            d2 = d14 + d17;
        } else {
            d = d13 + d18;
            d2 = d14 - d17;
        }
        double atan2 = Math.atan2(d8 - d2, d6 - d);
        double atan22 = Math.atan2(a2 - d2, a - d) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d19 = d * d5;
        double d20 = d2 * d7;
        double d21 = (d19 * cos) - (d20 * sin);
        double d22 = (d20 * cos) + (d19 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d23 = -d5;
        double d24 = d23 * cos2;
        double d25 = d7 * sin2;
        double d26 = (d24 * sin3) - (d25 * cos3);
        double d27 = d23 * sin2;
        double d28 = d7 * cos2;
        double d29 = (cos3 * d28) + (sin3 * d27);
        double d30 = atan22 / ceil;
        int i = 0;
        while (i < ceil) {
            double d31 = atan2 + d30;
            double sin4 = Math.sin(d31);
            double cos4 = Math.cos(d31);
            int i2 = i;
            double d32 = (((d5 * cos2) * cos4) + d21) - (d25 * sin4);
            double d33 = d21;
            double d34 = (d28 * sin4) + (d5 * sin2 * cos4) + d22;
            double d35 = (d24 * sin4) - (d25 * cos4);
            double d36 = (cos4 * d28) + (sin4 * d27);
            double d37 = d31 - atan2;
            double tan = Math.tan(d37 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d37)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d26 * sqrt3) + d10), (float) ((d29 * sqrt3) + d4), (float) (d32 - (sqrt3 * d35)), (float) (d34 - (sqrt3 * d36)), (float) d32, (float) d34);
            ceil = ceil;
            d30 = d30;
            d27 = d27;
            atan2 = d31;
            d29 = d36;
            d26 = d35;
            d10 = d32;
            i = i2 + 1;
            d4 = d34;
            d21 = d33;
        }
    }
}
