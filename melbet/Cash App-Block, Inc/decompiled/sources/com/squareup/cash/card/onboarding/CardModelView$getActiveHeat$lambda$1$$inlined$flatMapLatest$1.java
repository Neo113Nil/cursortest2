package com.squareup.cash.card.onboarding;

import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.util.coroutines.TakeUntil;
import com.squareup.util.coroutines.TakeUntilKt;
import com.squareup.util.coroutines.TickerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1() {
        super(3, null);
        this.$r8$classId = 3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1 cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1 = new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(3, continuation, 0);
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1.L$0 = flowCollector;
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1.L$1 = obj2;
                return cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1 cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$12 = new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(3, continuation, 1);
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$12.L$0 = flowCollector;
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$12.L$1 = obj2;
                return cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1 cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$13 = new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(3, continuation, 2);
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$13.L$0 = flowCollector;
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$13.L$1 = obj2;
                return cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$13.invokeSuspend(Unit.INSTANCE);
            default:
                CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1 cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$14 = new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(3, continuation, 3);
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$14.L$0 = flowCollector;
                cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$14.L$1 = obj2;
                return cardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$14.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    TakeUntil takeUntil = TakeUntilKt.takeUntil(TickerKt.m3996tickerFlowQTBD994$default(DurationKt.toDuration(33L, DurationUnit.MILLISECONDS)), new SafeFlow(new PageFetcher$flow$1.AnonymousClass1(2, continuation, 11)));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    Object collect = takeUntil.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 14), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair = (Pair) obj3;
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) pair.first;
                    List list = (List) pair.second;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (((Instrument) obj4).cashInstrumentType != CashInstrumentType.CASH_BALANCE) {
                            arrayList.add(obj4);
                        }
                    }
                    Pair pair2 = new Pair(balanceSnapshot, arrayList);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector2);
                    Object emit = flowCollector2.emit(pair2, this);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (emit != coroutineSingletons3) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit != coroutineSingletons3) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                FlowCollector flowCollector3 = this.L$0;
                Object obj5 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StartedLazily$command$$inlined$unsafeFlow$1 startedLazily$command$$inlined$unsafeFlow$1 = new StartedLazily$command$$inlined$unsafeFlow$1((List) obj5, 3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector3, startedLazily$command$$inlined$unsafeFlow$1, this) == coroutineSingletons4) {
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
                FlowCollector flowCollector4 = this.L$0;
                Object obj6 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StartedLazily$command$$inlined$unsafeFlow$1 startedLazily$command$$inlined$unsafeFlow$12 = new StartedLazily$command$$inlined$unsafeFlow$1((List) obj6, 3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector4);
                    Object collect2 = startedLazily$command$$inlined$unsafeFlow$12.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector4, 19), this);
                    if (collect2 != coroutineSingletons5) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons5) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons5) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
