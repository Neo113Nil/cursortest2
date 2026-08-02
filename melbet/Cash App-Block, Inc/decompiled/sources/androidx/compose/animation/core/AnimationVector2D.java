package androidx.compose.animation.core;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVector {
    public float v1;
    public float v2;

    public AnimationVector2D(float f, float f2) {
        this.v1 = f;
        this.v2 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return animationVector2D.v1 == this.v1 && animationVector2D.v2 == this.v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float get$animation_core(int i) {
        return i != 0 ? i != 1 ? RecyclerView.DECELERATION_RATE : this.v2 : this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int getSize$animation_core() {
        return 2;
    }

    public final int hashCode() {
        return Float.hashCode(this.v2) + (Float.hashCode(this.v1) * 31);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector newVector$animation_core() {
        return new AnimationVector2D(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void reset$animation_core() {
        this.v1 = RecyclerView.DECELERATION_RATE;
        this.v2 = RecyclerView.DECELERATION_RATE;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void set$animation_core(float f, int i) {
        if (i == 0) {
            this.v1 = f;
        } else {
            if (i != 1) {
                return;
            }
            this.v2 = f;
        }
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.v1 + ", v2 = " + this.v2;
    }
}
