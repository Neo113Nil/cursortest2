package com.google.android.material.bottomappbar;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.shape.ShapePath;

/* loaded from: classes4.dex */
public final class BottomAppBarTopEdgeTreatment extends Transition.AnonymousClass1 implements Cloneable {
    public float cradleVerticalOffset;
    public float fabCornerSize;
    public float fabDiameter;
    public float fabMargin;
    public float horizontalOffset;
    public float roundedCornerRadius;

    @Override // androidx.transition.Transition.AnonymousClass1
    public final void getEdgePath(float f, float f2, float f3, ShapePath shapePath) {
        float f4;
        float f5;
        float f6 = this.fabDiameter;
        if (f6 == RecyclerView.DECELERATION_RATE) {
            shapePath.lineTo(f, RecyclerView.DECELERATION_RATE);
            return;
        }
        float f7 = ((this.fabMargin * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.roundedCornerRadius;
        float f9 = f2 + this.horizontalOffset;
        float m = CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, f3, f7, this.cradleVerticalOffset * f3);
        if (m / f7 >= 1.0f) {
            shapePath.lineTo(f, RecyclerView.DECELERATION_RATE);
            return;
        }
        float f10 = this.fabCornerSize;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = m;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f4 + f8;
        float sqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - sqrt;
        float f15 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f13));
        float f16 = (90.0f - degrees) + f5;
        shapePath.lineTo(f14, RecyclerView.DECELERATION_RATE);
        float f17 = f14 - f8;
        float f18 = f14 + f8;
        float f19 = f8 * 2.0f;
        shapePath.addArc(f17, RecyclerView.DECELERATION_RATE, f18, f19, 270.0f, degrees);
        if (z) {
            shapePath.addArc(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f20 = this.fabMargin;
            float f21 = f11 * 2.0f;
            float f22 = f20 + f21;
            float f23 = f9 - f7;
            shapePath.addArc(f23, -(f11 + f20), f22 + f23, f20 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f9 + f7;
            float f25 = this.fabMargin;
            shapePath.lineTo(f24 - ((f25 / 2.0f) + f11), f25 + f11);
            float f26 = this.fabMargin;
            shapePath.addArc(f24 - (f21 + f26), -(f11 + f26), f24, f26 + f11, 90.0f, f16 - 90.0f);
        }
        shapePath.addArc(f15 - f8, RecyclerView.DECELERATION_RATE, f15 + f8, f19, 270.0f - degrees, degrees);
        shapePath.lineTo(f, RecyclerView.DECELERATION_RATE);
    }

    public final void setCradleVerticalOffset(float f) {
        if (f >= RecyclerView.DECELERATION_RATE) {
            this.cradleVerticalOffset = f;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("cradleVerticalOffset must be positive.");
        }
    }
}
