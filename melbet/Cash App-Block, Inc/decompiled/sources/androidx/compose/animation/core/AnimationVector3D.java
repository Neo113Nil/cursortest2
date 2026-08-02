package androidx.compose.animation.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class AnimationVector3D extends AnimationVector {
    public float v1;
    public float v2;
    public float v3;

    public AnimationVector3D(float f, float f2, float f3) {
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) obj;
        return animationVector3D.v1 == this.v1 && animationVector3D.v2 == this.v2 && animationVector3D.v3 == this.v3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float get$animation_core(int i) {
        return i != 0 ? i != 1 ? i != 2 ? RecyclerView.DECELERATION_RATE : this.v3 : this.v2 : this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int getSize$animation_core() {
        return 3;
    }

    public final int hashCode() {
        return Float.hashCode(this.v3) + CameraState$Type$EnumUnboxingLocalUtility.m(this.v2, Float.hashCode(this.v1) * 31, 31);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector newVector$animation_core() {
        return new AnimationVector3D(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void reset$animation_core() {
        this.v1 = RecyclerView.DECELERATION_RATE;
        this.v2 = RecyclerView.DECELERATION_RATE;
        this.v3 = RecyclerView.DECELERATION_RATE;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void set$animation_core(float f, int i) {
        if (i == 0) {
            this.v1 = f;
        } else if (i == 1) {
            this.v2 = f;
        } else {
            if (i != 2) {
                return;
            }
            this.v3 = f;
        }
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3;
    }
}
