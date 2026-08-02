package androidx.compose.animation;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class SizeTransformImpl {
    public final boolean clip;
    public final Function2 sizeAnimationSpec;

    public SizeTransformImpl(boolean z, Function2 function2) {
        this.clip = z;
        this.sizeAnimationSpec = function2;
    }
}
