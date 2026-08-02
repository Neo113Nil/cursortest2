package com.squareup.cash.growtools.presenters.manager.directdeposit;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.paychecks.api.v1.DisablePaycheckAllocationRequest;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.random.PlatformRandomKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.BitcoinDestination;

/* loaded from: classes6.dex */
public final class GrowToolsDirectDepositManager$cancelPaidInBitcoin$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GrowToolsManagerState $state;
    public int label;
    public final /* synthetic */ zzai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrowToolsDirectDepositManager$cancelPaidInBitcoin$1(zzai zzaiVar, GrowToolsManagerState growToolsManagerState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zzaiVar;
        this.$state = growToolsManagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GrowToolsDirectDepositManager$cancelPaidInBitcoin$1(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GrowToolsDirectDepositManager$cancelPaidInBitcoin$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zzai zzaiVar = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            DisablePaycheckAllocationRequest disablePaycheckAllocationRequest = new DisablePaycheckAllocationRequest(null, new AllocationDestination(new AllocationDestination.Destination.Bitcoin(new BitcoinDestination())), ByteString.EMPTY);
            PaychecksAppService paychecksAppService = (PaychecksAppService) zzaiVar.zaa;
            this.label = 1;
            obj = paychecksAppService.disablePaycheckAllocation(disablePaycheckAllocationRequest, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        Analytics analytics = (Analytics) zzaiVar.zad;
        GrowToolsManagerScreen.ManageDirectDepositScreen manageDirectDepositScreen = (GrowToolsManagerScreen.ManageDirectDepositScreen) zzaiVar.zzb;
        PlatformRandomKt.trackToggleUpdate(analytics, apiResult, manageDirectDepositScreen.origin, manageDirectDepositScreen.f1144type);
        if (apiResult instanceof ApiResult.Failure) {
            this.$state.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.ERROR));
        } else if (!(apiResult instanceof ApiResult.Success)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return Unit.INSTANCE;
    }
}
