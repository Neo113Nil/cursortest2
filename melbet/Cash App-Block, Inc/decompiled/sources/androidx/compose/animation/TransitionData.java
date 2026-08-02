package androidx.compose.animation;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TransitionData {
    public final ChangeSize changeSize;
    public final Map effectsMap;
    public final Fade fade;
    public final boolean hold;
    public final Scale scale;
    public final Slide slide;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, LinkedHashMap linkedHashMap, int i) {
        this(fade, slide, changeSize, scale, r0, r7);
        fade = (i & 1) != 0 ? null : fade;
        slide = (i & 2) != 0 ? null : slide;
        changeSize = (i & 4) != 0 ? null : changeSize;
        scale = (i & 8) != 0 ? null : scale;
        boolean z = (i & 32) == 0;
        Map map = linkedHashMap;
        if ((i & 64) != 0) {
            Map map2 = EmptyMap.INSTANCE;
            map2.getClass();
            map = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return Intrinsics.areEqual(this.fade, transitionData.fade) && Intrinsics.areEqual(this.slide, transitionData.slide) && Intrinsics.areEqual(this.changeSize, transitionData.changeSize) && Intrinsics.areEqual(this.scale, transitionData.scale) && this.hold == transitionData.hold && Intrinsics.areEqual(this.effectsMap, transitionData.effectsMap);
    }

    public final int hashCode() {
        Fade fade = this.fade;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return this.effectsMap.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (scale != null ? scale.hashCode() : 0)) * 961, 31, this.hold);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", veil=null, hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z, Map map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z;
        this.effectsMap = map;
    }
}
