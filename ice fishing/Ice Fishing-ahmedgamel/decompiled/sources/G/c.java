package G;

import android.graphics.Color;
import com.anythink.basead.exoplayer.k.p;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1029a = new ThreadLocal();

    public static int a(double d9, double d10, double d11) {
        double d12 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d9))) / 100.0d;
        double d13 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d9))) / 100.0d;
        double d14 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d9))) / 100.0d;
        double pow = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        double pow2 = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double pow3 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, p.f9259b);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, p.f9259b);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, p.f9259b) : 0);
    }

    public static int b(int i, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / p.f9259b);
        return Color.argb(i6, c(Color.red(i), alpha2, Color.red(i4), alpha, i6), c(Color.green(i), alpha2, Color.green(i4), alpha, i6), c(Color.blue(i), alpha2, Color.blue(i4), alpha, i6));
    }

    public static int c(int i, int i4, int i6, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (((255 - i4) * (i6 * i9)) + ((i * p.f9259b) * i4)) / (i10 * p.f9259b);
    }

    public static int d(int i, int i4) {
        if (i4 < 0 || i4 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i4 << 24);
    }
}
