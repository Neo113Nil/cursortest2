package com.squareup.cash.featureflags;

import com.squareup.cash.onboarding.backend.OnboardingFlowTokenManager$FlowToken;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealFeatureFlagManager$setup$1$1$5 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ String L$0;
    public /* synthetic */ String L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFeatureFlagManager$setup$1$1$5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        String str = (String) obj;
        String str2 = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                RealFeatureFlagManager$setup$1$1$5 realFeatureFlagManager$setup$1$1$5 = new RealFeatureFlagManager$setup$1$1$5(i, continuation, 0);
                realFeatureFlagManager$setup$1$1$5.L$0 = str;
                realFeatureFlagManager$setup$1$1$5.L$1 = str2;
                return realFeatureFlagManager$setup$1$1$5.invokeSuspend(Unit.INSTANCE);
            default:
                RealFeatureFlagManager$setup$1$1$5 realFeatureFlagManager$setup$1$1$52 = new RealFeatureFlagManager$setup$1$1$5(i, continuation, 1);
                realFeatureFlagManager$setup$1$1$52.L$0 = str;
                realFeatureFlagManager$setup$1$1$52.L$1 = str2;
                return realFeatureFlagManager$setup$1$1$52.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                String str = this.L$0;
                String str2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new Pair(str, str2);
            default:
                String str3 = this.L$0;
                String str4 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (str4 != null) {
                    str3 = str4;
                }
                if (str3 != null) {
                    return new OnboardingFlowTokenManager$FlowToken(str3, str4 != null);
                }
                return null;
        }
    }
}
