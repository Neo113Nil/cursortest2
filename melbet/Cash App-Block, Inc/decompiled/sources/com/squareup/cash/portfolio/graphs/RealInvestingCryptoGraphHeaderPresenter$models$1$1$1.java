package com.squareup.cash.portfolio.graphs;

import androidx.compose.runtime.MutableState;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingCryptoGraphHeaderPresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ RealInvestingCryptoGraphHeaderPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestingCryptoGraphHeaderPresenter$models$1$1$1(RealInvestingCryptoGraphHeaderPresenter realInvestingCryptoGraphHeaderPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realInvestingCryptoGraphHeaderPresenter;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        RealInvestingCryptoGraphHeaderPresenter realInvestingCryptoGraphHeaderPresenter = this.this$0;
        switch (i) {
            case 0:
                return new RealInvestingCryptoGraphHeaderPresenter$models$1$1$1(realInvestingCryptoGraphHeaderPresenter, mutableState, continuation, 0);
            default:
                return new RealInvestingCryptoGraphHeaderPresenter$models$1$1$1(realInvestingCryptoGraphHeaderPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealInvestingCryptoGraphHeaderPresenter$models$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        RealInvestingCryptoGraphHeaderPresenter realInvestingCryptoGraphHeaderPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = realInvestingCryptoGraphHeaderPresenter.graphModelObservable;
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(28, mutableState);
                    this.label = 1;
                    if (realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(anonymousClass1, this) == coroutineSingletons) {
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
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = realInvestingCryptoGraphHeaderPresenter.currencyCode;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(4, realInvestingCryptoGraphHeaderPresenter, mutableState);
                    this.label = 1;
                    if (realBadger2$setup$lambda$0$$inlined$mapNotNull$12.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons2) {
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
