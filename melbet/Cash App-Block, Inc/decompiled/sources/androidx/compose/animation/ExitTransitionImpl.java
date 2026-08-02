package androidx.compose.animation;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public final class ExitTransitionImpl {
    public final TransitionData data;
    public static final ExitTransitionImpl None = new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 127));
    public static final ExitTransitionImpl KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, (Scale) null, (LinkedHashMap) null, 95));

    public ExitTransitionImpl(TransitionData transitionData) {
        this.data = transitionData;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExitTransitionImpl) && ((ExitTransitionImpl) obj).data.equals(this.data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final ExitTransitionImpl plus(ExitTransitionImpl exitTransitionImpl) {
        Fade fade = exitTransitionImpl.data.fade;
        if (fade == null) {
            fade = this.data.fade;
        }
        TransitionData transitionData = exitTransitionImpl.data;
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
        boolean z = transitionData.hold;
        TransitionData transitionData2 = this.data;
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, z || transitionData2.hold, MapsKt__MapsKt.plus(transitionData2.effectsMap, transitionData.effectsMap)));
    }

    public final String toString() {
        if (equals(None)) {
            return "ExitTransition.None";
        }
        if (equals(KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(transitionData.hold);
        return sb.toString();
    }
}
