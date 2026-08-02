package com.google.zxing.common;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class PerspectiveTransform {
    public final float a11;
    public final float a12;
    public final float a13;
    public final float a21;
    public final float a22;
    public final float a23;
    public final float a31;
    public final float a32;
    public final float a33;

    public PerspectiveTransform(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a11 = f;
        this.a12 = f4;
        this.a13 = f7;
        this.a21 = f2;
        this.a22 = f5;
        this.a23 = f8;
        this.a31 = f3;
        this.a32 = f6;
        this.a33 = f9;
    }

    public static PerspectiveTransform squareToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == RecyclerView.DECELERATION_RATE && f10 == RecyclerView.DECELERATION_RATE) {
            return new PerspectiveTransform(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new PerspectiveTransform((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }
}
