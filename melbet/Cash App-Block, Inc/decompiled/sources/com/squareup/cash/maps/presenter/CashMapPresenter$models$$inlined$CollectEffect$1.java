package com.squareup.cash.maps.presenter;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter$models$3$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CashMapPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ MutableState $locationViewModel$delegate$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $searchedLocation$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, MutableState mutableState, MutableState mutableState2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow = flow;
        this.$locationViewModel$delegate$inlined = mutableState;
        this.$searchedLocation$delegate$inlined = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                CashMapPresenter$models$$inlined$CollectEffect$1 cashMapPresenter$models$$inlined$CollectEffect$1 = new CashMapPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, this.$locationViewModel$delegate$inlined, this.$searchedLocation$delegate$inlined, 0);
                cashMapPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return cashMapPresenter$models$$inlined$CollectEffect$1;
            case 1:
                CashMapPresenter$models$$inlined$CollectEffect$1 cashMapPresenter$models$$inlined$CollectEffect$12 = new CashMapPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, this.$locationViewModel$delegate$inlined, this.$searchedLocation$delegate$inlined, 1);
                cashMapPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return cashMapPresenter$models$$inlined$CollectEffect$12;
            default:
                CashMapPresenter$models$$inlined$CollectEffect$1 cashMapPresenter$models$$inlined$CollectEffect$13 = new CashMapPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, this.$locationViewModel$delegate$inlined, this.$searchedLocation$delegate$inlined, 2);
                cashMapPresenter$models$$inlined$CollectEffect$13.L$0 = obj;
                return cashMapPresenter$models$$inlined$CollectEffect$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashMapPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$searchedLocation$delegate$inlined;
        MutableState mutableState2 = this.$locationViewModel$delegate$inlined;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersSearchPresenter$models$3$1$2$1 realOffersSearchPresenter$models$3$1$2$1 = new RealOffersSearchPresenter$models$3$1$2$1(coroutineScope, mutableState2, mutableState, 3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(realOffersSearchPresenter$models$3$1$2$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersSearchPresenter$models$3$1$2$1 realOffersSearchPresenter$models$3$1$2$12 = new RealOffersSearchPresenter$models$3$1$2$1(coroutineScope2, mutableState2, mutableState, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(realOffersSearchPresenter$models$3$1$2$12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersSearchPresenter$models$3$1$2$1 realOffersSearchPresenter$models$3$1$2$13 = new RealOffersSearchPresenter$models$3$1$2$1(coroutineScope3, mutableState2, mutableState, 2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(realOffersSearchPresenter$models$3$1$2$13, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
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
