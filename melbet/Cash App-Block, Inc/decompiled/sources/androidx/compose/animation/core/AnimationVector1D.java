package androidx.compose.animation.core;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class AnimationVector1D extends AnimationVector {
    public float value;

    public AnimationVector1D(float f) {
        this.value = f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).value == this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float get$animation_core(int i) {
        return i == 0 ? this.value : RecyclerView.DECELERATION_RATE;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final int getSize$animation_core() {
        return 1;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector newVector$animation_core() {
        return new AnimationVector1D(RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void reset$animation_core() {
        this.value = RecyclerView.DECELERATION_RATE;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void set$animation_core(float f, int i) {
        if (i == 0) {
            this.value = f;
        }
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.value;
    }
}
