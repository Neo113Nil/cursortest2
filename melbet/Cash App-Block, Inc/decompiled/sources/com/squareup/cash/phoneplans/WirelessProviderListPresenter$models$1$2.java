package com.squareup.cash.phoneplans;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class WirelessProviderListPresenter$models$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BlockerAction $action;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ WirelessProviderListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WirelessProviderListPresenter$models$1$2(WirelessProviderListPresenter wirelessProviderListPresenter, BlockerAction blockerAction, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = wirelessProviderListPresenter;
        this.$action = blockerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BlockerAction blockerAction = this.$action;
        WirelessProviderListPresenter wirelessProviderListPresenter = this.this$0;
        switch (i) {
            case 0:
                return new WirelessProviderListPresenter$models$1$2(wirelessProviderListPresenter, blockerAction, continuation, 0);
            default:
                return new WirelessProviderListPresenter$models$1$2(wirelessProviderListPresenter, blockerAction, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WirelessProviderListPresenter$models$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        WirelessProviderListPresenter wirelessProviderListPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper = wirelessProviderListPresenter.blockersHelper;
                    WirelessProviderListBlockerScreen wirelessProviderListBlockerScreen = wirelessProviderListPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, this.$action, wirelessProviderListBlockerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper2 = wirelessProviderListPresenter.blockersHelper;
                    WirelessProviderListBlockerScreen wirelessProviderListBlockerScreen2 = wirelessProviderListPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper2, this.$action, wirelessProviderListBlockerScreen2, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons2) {
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
