package com.squareup.cash.sheet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnimatedVisibilityScope f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ BasicShieetKt$BasicShieet$4$1$$ExternalSyntheticLambda0(AnimatedVisibilityScope animatedVisibilityScope, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = animatedVisibilityScope;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        AnimatedVisibilityScope animatedVisibilityScope = this.f$0;
        switch (i) {
            case 0:
                if (animatedVisibilityScope.getTransition().targetState$delegate.getValue() != EnterExitState.PostExit) {
                    function0.invoke();
                }
                break;
            default:
                if (animatedVisibilityScope.getTransition().targetState$delegate.getValue() != EnterExitState.PostExit) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
