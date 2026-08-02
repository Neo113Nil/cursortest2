package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class wiy {
    public static LinearGradient a(float f, int[] iArr, float[] fArr, int i, int i2) {
        float f2 = i;
        float f3 = f2 / 2.0f;
        float f4 = i2;
        float f5 = f4 / 2.0f;
        double d = (float) ((f * 3.141592653589793d) / 180.0d);
        float abs = Math.abs(f4 * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d)));
        float cos = (((float) Math.cos(d)) * abs) / 2.0f;
        if (Math.abs(0.0f - cos) <= 1.0E-4f) {
            cos = 0.0f;
        }
        float sin = (((float) Math.sin(d)) * abs) / 2.0f;
        float f6 = Math.abs(0.0f - sin) > 1.0E-4f ? sin : 0.0f;
        return new LinearGradient(f3 - cos, f5 + f6, f3 + cos, f5 - f6, iArr, fArr, Shader.TileMode.CLAMP);
    }
}
