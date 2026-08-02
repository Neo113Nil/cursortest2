package androidx.compose.animation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.BiasAlignment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ChangeSize {
    public final BiasAlignment alignment;
    public final FiniteAnimationSpec animationSpec;
    public final boolean clip;
    public final Function1 size;

    public ChangeSize(FiniteAnimationSpec finiteAnimationSpec, BiasAlignment biasAlignment, Function1 function1, boolean z) {
        this.alignment = biasAlignment;
        this.size = function1;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return this.alignment.equals(changeSize.alignment) && this.size.equals(changeSize.size) && Intrinsics.areEqual(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.clip) + ((this.animationSpec.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.alignment.hashCode() * 31, 31, this.size)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.alignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(", clip=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.clip, ')');
    }
}
