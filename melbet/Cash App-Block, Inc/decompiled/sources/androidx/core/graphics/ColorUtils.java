package androidx.core.graphics;

import android.graphics.Color;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ColorUtils {
    public static final ThreadLocal TEMP_ARRAY = new ThreadLocal();

    public static int HSLToColor(float[] fArr) {
        int round;
        int round2;
        int i = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(constrain(i), constrain(round), constrain(round2));
    }

    public static int XYZToColor(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(constrain((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), constrain((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), constrain((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int blendARGB(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static double calculateContrast(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline1.m(i2, new StringBuilder("background can not be translucent: #")));
            return 0.0d;
        }
        if (Color.alpha(i) < 255) {
            i = compositeColors(i, i2);
        }
        double calculateLuminance = calculateLuminance(i) + 0.05d;
        double calculateLuminance2 = calculateLuminance(i2) + 0.05d;
        return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
    }

    public static double calculateLuminance(int i) {
        ThreadLocal threadLocal = TEMP_ARRAY;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            a$$ExternalSyntheticBUOutline0.m$3("outXyz must have a length of 3.");
            return 0.0d;
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = blue / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d4 / 100.0d;
    }

    public static void colorToHSL(int i, float[] fArr) {
        float m;
        float abs;
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float max = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f = max - min;
        float f2 = (max + min) / 2.0f;
        float f3 = RecyclerView.DECELERATION_RATE;
        if (max == min) {
            m = 0.0f;
            abs = 0.0f;
        } else {
            m = max == red ? ((green - blue) / f) % 6.0f : max == green ? Recorder$$ExternalSyntheticOutline2.m(blue, red, f, 2.0f) : Recorder$$ExternalSyntheticOutline2.m(red, green, f, 4.0f);
            abs = f / (1.0f - Math.abs((2.0f * f2) - 1.0f));
        }
        float f4 = (m * 60.0f) % 360.0f;
        if (f4 < RecyclerView.DECELERATION_RATE) {
            f4 += 360.0f;
        }
        fArr[0] = f4 < RecyclerView.DECELERATION_RATE ? 0.0f : Math.min(f4, 360.0f);
        fArr[1] = abs < RecyclerView.DECELERATION_RATE ? 0.0f : Math.min(abs, 1.0f);
        if (f2 >= RecyclerView.DECELERATION_RATE) {
            f3 = Math.min(f2, 1.0f);
        }
        fArr[2] = f3;
    }

    public static int compositeColors(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, compositeComponent(Color.red(i), alpha2, Color.red(i2), alpha, i3), compositeComponent(Color.green(i), alpha2, Color.green(i2), alpha, i3), compositeComponent(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int compositeComponent(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int constrain(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public static int setAlphaComponent(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        a$$ExternalSyntheticBUOutline0.m$3("alpha must be between 0 and 255.");
        return 0;
    }
}
