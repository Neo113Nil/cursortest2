package androidx.compose.animation;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 extends Lambda implements Function2 {
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EnterExitState enterExitState = (EnterExitState) obj2;
        return Boolean.valueOf(((EnterExitState) obj) == enterExitState && enterExitState == EnterExitState.PostExit);
    }
}
