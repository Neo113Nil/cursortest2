package com.squareup.cash.portfolio.graphs;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate$inlined;
    public final /* synthetic */ Object $t1;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealInvestingCryptoGraphHeaderPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1(Object obj, Continuation continuation, RealInvestingCryptoGraphHeaderPresenter realInvestingCryptoGraphHeaderPresenter, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$t1 = obj;
        this.this$0 = realInvestingCryptoGraphHeaderPresenter;
        this.$state$delegate$inlined = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1 realInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1 = new RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1(this.$t1, continuation, this.this$0, this.$state$delegate$inlined, 0);
                realInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1.L$0 = obj;
                return realInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1;
            default:
                RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1 realInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$12 = new RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1(this.$t1, continuation, this.this$0, this.$state$delegate$inlined, 1);
                realInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$12.L$0 = obj;
                return realInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealInvestingCryptoGraphHeaderPresenter$models$$inlined$LaunchedEffectNotNull$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate$inlined;
        RealInvestingCryptoGraphHeaderPresenter realInvestingCryptoGraphHeaderPresenter = this.this$0;
        Object obj2 = this.$t1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow buffer$default = FlowKt.buffer$default(realInvestingCryptoGraphHeaderPresenter.cryptoBalanceRepo.getBitcoinBalance(), -1, 2);
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(5, (CurrencyCode) obj2, mutableState);
                    this.L$0 = null;
                    this.label = 1;
                    if (buffer$default.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons) {
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
                    Flow flow = realInvestingCryptoGraphHeaderPresenter.activityFlow;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$12 = new WirelessProviderListPresenter$models$1$1$1(6, (Money) obj2, mutableState);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(wirelessProviderListPresenter$models$1$1$12, this) == coroutineSingletons2) {
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
