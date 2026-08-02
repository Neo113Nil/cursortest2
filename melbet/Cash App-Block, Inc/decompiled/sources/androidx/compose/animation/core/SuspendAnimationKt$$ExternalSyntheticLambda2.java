package androidx.compose.animation.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class SuspendAnimationKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnimationState f$0;

    public /* synthetic */ SuspendAnimationKt$$ExternalSyntheticLambda2(int i, AnimationState animationState) {
        this.$r8$classId = i;
        this.f$0 = animationState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AnimationState animationState = this.f$0;
        switch (i) {
            case 0:
                animationState.isRunning = false;
                break;
            default:
                animationState.isRunning = false;
                break;
        }
        return Unit.INSTANCE;
    }
}
