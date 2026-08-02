package androidx.compose.animation.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public float v1;
    public float v2;
    public float v3;
    public float v4;

    public AnimationVector4D(float f, float f2, float f3, float f4) {
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
        this.v4 = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        return animationVector4D.v1 == this.v1 && animationVector4D.v2 == this.v2 && animationVector4D.v3 == this.v3 && animationVector4D.v4 == this.v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float get$animation_core(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? RecyclerView.DECELERATION_RATE : this.v4 : this.v3 : this.v2 : this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int getSize$animation_core() {
        return 4;
    }

    public final int hashCode() {
        return Float.hashCode(this.v4) + CameraState$Type$EnumUnboxingLocalUtility.m(this.v3, CameraState$Type$EnumUnboxingLocalUtility.m(this.v2, Float.hashCode(this.v1) * 31, 31), 31);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector newVector$animation_core() {
        return new AnimationVector4D(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void reset$animation_core() {
        this.v1 = RecyclerView.DECELERATION_RATE;
        this.v2 = RecyclerView.DECELERATION_RATE;
        this.v3 = RecyclerView.DECELERATION_RATE;
        this.v4 = RecyclerView.DECELERATION_RATE;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void set$animation_core(float f, int i) {
        if (i == 0) {
            this.v1 = f;
            return;
        }
        if (i == 1) {
            this.v2 = f;
        } else if (i == 2) {
            this.v3 = f;
        } else {
            if (i != 3) {
                return;
            }
            this.v4 = f;
        }
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }
}
