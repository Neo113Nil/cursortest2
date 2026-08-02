package com.squareup.cash.profile.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.pools.views.PoolGoalMetKt$PoolGoalMet$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProfilePrivacyPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ProfilePrivacyPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfilePrivacyPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, ProfilePrivacyPresenter profilePrivacyPresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow = flow;
        this.this$0 = profilePrivacyPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ProfilePrivacyPresenter profilePrivacyPresenter = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                ProfilePrivacyPresenter$models$$inlined$CollectEffect$1 profilePrivacyPresenter$models$$inlined$CollectEffect$1 = new ProfilePrivacyPresenter$models$$inlined$CollectEffect$1(flow, continuation, profilePrivacyPresenter, 0);
                profilePrivacyPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return profilePrivacyPresenter$models$$inlined$CollectEffect$1;
            default:
                ProfilePrivacyPresenter$models$$inlined$CollectEffect$1 profilePrivacyPresenter$models$$inlined$CollectEffect$12 = new ProfilePrivacyPresenter$models$$inlined$CollectEffect$1(flow, continuation, profilePrivacyPresenter, 1);
                profilePrivacyPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return profilePrivacyPresenter$models$$inlined$CollectEffect$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ProfilePrivacyPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ProfilePrivacyPresenter profilePrivacyPresenter = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(11, coroutineScope, profilePrivacyPresenter);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$1 = new PoolGoalMetKt$PoolGoalMet$1$1$1(coroutineScope2, profilePrivacyPresenter, 22);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(poolGoalMetKt$PoolGoalMet$1$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
