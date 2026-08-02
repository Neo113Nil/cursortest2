package androidx.compose.animation.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ArcSpline$Arc {
    public final float arcDistance;
    public final float arcVelocity;
    public final float ellipseA;
    public final float ellipseB;
    public final float ellipseCenterX;
    public final float ellipseCenterY;
    public final boolean isLinear;
    public final float[] lut;
    public final float oneOverDeltaTime;
    public final float time1;
    public final float time2;
    public float tmpCosAngle;
    public float tmpSinAngle;
    public final float vertical;
    public final float x1;
    public final float x2;
    public final float y1;
    public final float y2;

    public ArcSpline$Arc(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float[] fArr;
        this.time1 = f;
        this.time2 = f2;
        this.x1 = f3;
        this.y1 = f4;
        this.x2 = f5;
        this.y2 = f6;
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f8 > RecyclerView.DECELERATION_RATE : !(i != 5 || f8 >= RecyclerView.DECELERATION_RATE));
        float f9 = z2 ? -1.0f : 1.0f;
        this.vertical = f9;
        float f10 = 1.0f / (f2 - f);
        this.oneOverDeltaTime = f10;
        float[] fArr2 = new float[101];
        this.lut = fArr2;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
            float hypot = (float) Math.hypot(f8, f7);
            this.arcDistance = hypot;
            this.arcVelocity = hypot * f10;
            this.ellipseCenterX = f7 * f10;
            this.ellipseCenterY = f8 * f10;
            this.ellipseA = Float.NaN;
            this.ellipseB = Float.NaN;
            z = true;
        } else {
            this.ellipseA = f7 * f9;
            this.ellipseB = f8 * (-f9);
            this.ellipseCenterX = z2 ? f5 : f3;
            this.ellipseCenterY = z2 ? f4 : f6;
            float f11 = f5 - f3;
            float f12 = f4 - f6;
            float f13 = f12;
            float f14 = 0.0f;
            float f15 = 0.0f;
            int i4 = 1;
            while (true) {
                double d = (float) (((i4 * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float sin = ((float) Math.sin(d)) * f11;
                float cos = ((float) Math.cos(d)) * f12;
                f14 += (float) Math.hypot(sin - f15, cos - f13);
                fArr = ArcSplineKt.OurPercentCache;
                fArr[i4] = f14;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f15 = sin;
                f13 = cos;
                i3 = i2;
            }
            this.arcDistance = f14;
            int i5 = i2;
            while (true) {
                fArr[i5] = fArr[i5] / f14;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            int length = fArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f16 = i6 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr, 0, 91, f16);
                if (binarySearch >= 0) {
                    fArr2[i6] = binarySearch / 90.0f;
                } else if (binarySearch == -1) {
                    fArr2[i6] = 0.0f;
                } else {
                    int i7 = -binarySearch;
                    int i8 = i7 - 2;
                    float f17 = i8;
                    float f18 = fArr[i8];
                    fArr2[i6] = (((f16 - f18) / (fArr[i7 - i2] - f18)) + f17) / 90.0f;
                }
            }
            this.arcVelocity = this.arcDistance * this.oneOverDeltaTime;
            z = z3;
        }
        this.isLinear = z;
    }

    public final float calcDX() {
        float f = this.ellipseA * this.tmpCosAngle;
        return f * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, (-this.ellipseB) * this.tmpSinAngle)));
    }

    public final float calcDY() {
        float f = this.ellipseA * this.tmpCosAngle;
        float f2 = (-this.ellipseB) * this.tmpSinAngle;
        return f2 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, f2)));
    }

    public final void setPoint(float f) {
        float f2 = (this.vertical == -1.0f ? this.time2 - f : f - this.time1) * this.oneOverDeltaTime;
        float f3 = RecyclerView.DECELERATION_RATE;
        if (f2 > RecyclerView.DECELERATION_RATE) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100.0f;
                int i = (int) f4;
                float[] fArr = this.lut;
                float f5 = fArr[i];
                f3 = CameraState$Type$EnumUnboxingLocalUtility.m(fArr[i + 1], f5, f4 - i, f5);
            }
        }
        double d = f3 * 1.5707964f;
        this.tmpSinAngle = (float) Math.sin(d);
        this.tmpCosAngle = (float) Math.cos(d);
    }
}
