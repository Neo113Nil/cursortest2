package androidx.compose.animation;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public final class EnterTransitionImpl {
    public static final EnterTransitionImpl None = new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 127));
    public final TransitionData data;

    public EnterTransitionImpl(TransitionData transitionData) {
        this.data = transitionData;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof EnterTransitionImpl) && ((EnterTransitionImpl) obj).data.equals(this.data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final EnterTransitionImpl plus(EnterTransitionImpl enterTransitionImpl) {
        Fade fade = enterTransitionImpl.data.fade;
        if (fade == null) {
            fade = this.data.fade;
        }
        TransitionData transitionData = enterTransitionImpl.data;
        Slide slide = transitionData.slide;
        if (slide == null) {
            slide = this.data.slide;
        }
        ChangeSize changeSize = transitionData.changeSize;
        if (changeSize == null) {
            changeSize = this.data.changeSize;
        }
        Scale scale = transitionData.scale;
        if (scale == null) {
            scale = this.data.scale;
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, MapsKt__MapsKt.plus(this.data.effectsMap, transitionData.effectsMap), 32));
    }

    public final String toString() {
        if (equals(None)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        TransitionData transitionData = this.data;
        Fade fade = transitionData.fade;
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = transitionData.slide;
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = transitionData.changeSize;
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = transitionData.scale;
        sb.append(scale != null ? scale.toString() : null);
        return sb.toString();
    }
}
