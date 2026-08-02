package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class Slide {
    public final FiniteAnimationSpec animationSpec;
    public final Function1 slideOffset;

    public Slide(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        this.slideOffset = function1;
        this.animationSpec = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return this.slideOffset.equals(slide.slideOffset) && this.animationSpec.equals(slide.animationSpec);
    }

    public final int hashCode() {
        return this.animationSpec.hashCode() + (this.slideOffset.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
