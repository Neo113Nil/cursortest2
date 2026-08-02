package androidx.compose.material;

import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* loaded from: classes3.dex */
public final class FadeInFadeOutAnimationItem {
    public final ComposableLambdaImpl transition;

    public FadeInFadeOutAnimationItem(ComposableLambdaImpl composableLambdaImpl) {
        this.transition = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FadeInFadeOutAnimationItem) && this.transition == ((FadeInFadeOutAnimationItem) obj).transition;
    }

    public final int hashCode() {
        return this.transition.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=null, transition=" + this.transition + ')';
    }
}
