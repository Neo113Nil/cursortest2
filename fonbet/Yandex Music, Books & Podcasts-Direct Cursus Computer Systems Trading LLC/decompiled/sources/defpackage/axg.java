package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public abstract class axg implements Interpolator {
    public final /* synthetic */ int a;
    public final float[] b;
    public final float c;

    public axg(int i, float[] fArr) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = fArr;
                this.c = 1.0f / (fArr.length - 1);
                break;
            default:
                this.b = fArr;
                this.c = 1.0f / (fArr.length - 1);
                break;
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
                if (f <= 0.0f) {
                    return 0.0f;
                }
                if (f >= 1.0f) {
                    return 1.0f;
                }
                float[] fArr = this.b;
                int length = (int) ((fArr.length - 1) * f);
                int length2 = fArr.length - 2;
                if (length > length2) {
                    length = length2;
                }
                float f2 = this.c;
                float f3 = (f - (length * f2)) / f2;
                float f4 = fArr[length];
                return su4.e(fArr[length + 1], f4, f3, f4);
            default:
                if (f >= 1.0f) {
                    return 1.0f;
                }
                if (f <= 0.0f) {
                    return 0.0f;
                }
                float[] fArr2 = this.b;
                int min = Math.min((int) ((fArr2.length - 1) * f), fArr2.length - 2);
                float f5 = this.c;
                float f6 = (f - (min * f5)) / f5;
                float f7 = fArr2[min];
                return su4.e(fArr2[min + 1], f7, f6, f7);
        }
    }
}
