package defpackage;

/* loaded from: classes.dex */
public class xss {
    public static float a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float f, int i, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float a = a(((i >> 16) & 255) / 255.0f);
        float a2 = a(((i >> 8) & 255) / 255.0f);
        float a3 = a((i & 255) / 255.0f);
        float a4 = a(((i2 >> 16) & 255) / 255.0f);
        float a5 = a(((i2 >> 8) & 255) / 255.0f);
        float a6 = a((i2 & 255) / 255.0f);
        float b = g8e.b(f3, f2, f, f2);
        float b2 = g8e.b(a4, a, f, a);
        float b3 = g8e.b(a5, a2, f, a2);
        float b4 = g8e.b(a6, a3, f, a3);
        float b5 = b(b2) * 255.0f;
        float b6 = b(b3) * 255.0f;
        return Math.round(b(b4) * 255.0f) | (Math.round(b5) << 16) | (Math.round(b * 255.0f) << 24) | (Math.round(b6) << 8);
    }
}
