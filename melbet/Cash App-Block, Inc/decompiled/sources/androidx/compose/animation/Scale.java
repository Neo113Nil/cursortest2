package androidx.compose.animation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Scale {
    public final FiniteAnimationSpec animationSpec;
    public final float scale;
    public final long transformOrigin;

    public Scale(float f, long j, FiniteAnimationSpec finiteAnimationSpec) {
        this.scale = f;
        this.transformOrigin = j;
        this.animationSpec = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m714equalsimpl0(this.transformOrigin, scale.transformOrigin) && Intrinsics.areEqual(this.animationSpec, scale.animationSpec);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.scale) * 31;
        int i = TransformOrigin.$r8$clinit;
        return this.animationSpec.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.transformOrigin);
    }

    public final String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m715toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }
}
