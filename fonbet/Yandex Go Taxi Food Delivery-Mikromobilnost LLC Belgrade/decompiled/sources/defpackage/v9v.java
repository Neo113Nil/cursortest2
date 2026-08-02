package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class v9v {
    public final float[] a = new float[20];
    public final ColorMatrix b = new ColorMatrix();
    public final ColorMatrix c = new ColorMatrix();
    public float d = 1.0f;
    public float e = 1.0f;
    public float f = 1.0f;
    public float g = 1.0f;

    public final void a(ImageView imageView) {
        boolean z;
        float f;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        float f2;
        char c6;
        float log;
        float f3;
        char c7;
        float f4;
        float f5;
        ColorMatrix colorMatrix = this.b;
        colorMatrix.reset();
        float f6 = this.e;
        char c8 = '\f';
        float[] fArr = this.a;
        boolean z2 = true;
        if (f6 != 1.0f) {
            float f7 = 1.0f - f6;
            float f8 = 0.2999f * f7;
            float f9 = 0.587f * f7;
            float f10 = f7 * 0.114f;
            fArr[0] = f8 + f6;
            fArr[1] = f9;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f8;
            fArr[6] = f9 + f6;
            fArr[7] = f10;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f8;
            fArr[11] = f9;
            fArr[12] = f10 + f6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            z = true;
        } else {
            z = false;
        }
        float f11 = this.f;
        ColorMatrix colorMatrix2 = this.c;
        if (f11 != 1.0f) {
            colorMatrix2.setScale(f11, f11, f11, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
            z = true;
        }
        float f12 = this.g;
        if (f12 != 1.0f) {
            if (f12 <= 0.0f) {
                f12 = 0.01f;
            }
            float f13 = (5000.0f / f12) / 100.0f;
            f = 1.0f;
            if (f13 > 66.0f) {
                f2 = 66.0f;
                c = 16;
                c2 = 15;
                double d = f13 - 60.0f;
                c3 = 14;
                c4 = '\r';
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                c6 = '\f';
                c5 = 11;
                log = ((float) Math.pow(d, 0.07551485300064087d)) * 288.12216f;
            } else {
                f2 = 66.0f;
                c = 16;
                c2 = 15;
                c3 = 14;
                c4 = '\r';
                c6 = '\f';
                c5 = 11;
                log = (((float) Math.log(f13)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            if (f13 >= f2) {
                c7 = c6;
                f4 = 305.0448f;
                f5 = 255.0f;
            } else if (f13 > 19.0f) {
                c7 = c6;
                f4 = 305.0448f;
                f5 = (((float) Math.log(f13 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                c7 = c6;
                f4 = 305.0448f;
                f5 = 0.0f;
            }
            float min = Math.min(255.0f, Math.max(f3, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f5, 0.0f));
            float log2 = (((float) Math.log(50.0d)) * 99.4708f) - 161.11957f;
            c8 = c7;
            float log3 = (((float) Math.log(40.0d)) * 138.51773f) - f4;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log2, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log3, 0.0f));
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[c5] = 0.0f;
            fArr[c8] = min6;
            fArr[c4] = 0.0f;
            fArr[c3] = 0.0f;
            fArr[c2] = 0.0f;
            fArr[c] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
            z = true;
        } else {
            f = 1.0f;
            c = 16;
            c2 = 15;
            c3 = 14;
            c4 = '\r';
            c5 = 11;
        }
        float f14 = this.d;
        if (f14 != f) {
            fArr[0] = f14;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f14;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[c5] = 0.0f;
            fArr[c8] = f14;
            fArr[c4] = 0.0f;
            fArr[c3] = 0.0f;
            fArr[c2] = 0.0f;
            fArr[c] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
        } else {
            z2 = z;
        }
        if (z2) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            imageView.clearColorFilter();
        }
    }
}
