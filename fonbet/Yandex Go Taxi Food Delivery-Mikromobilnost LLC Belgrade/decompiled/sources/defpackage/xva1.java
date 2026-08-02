package defpackage;

import android.text.TextPaint;
import java.math.RoundingMode;
import java.util.NoSuchElementException;

/* loaded from: classes11.dex */
public abstract class xva1 {
    public static int a = 16777214;

    public static final void a(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    public static final void b(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }

    public static final void d(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        throw new NoSuchElementException(str);
    }

    public static int f(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            w511.w("/ by zero");
            return 0;
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (uy91.a[roundingMode.ordinal()]) {
            case 1:
                w511.w("mode was UNNECESSARY, but rounding was necessary");
                return 0;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                ny61.w();
                return 0;
        }
        return i3 + i5;
    }
}
