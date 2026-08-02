package com.squareup.cash.investing.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.db.Investment_holding;
import com.squareup.cash.investing.db.OwnedHoldings;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealInvestmentEntities this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1(Continuation continuation, RealInvestmentEntities realInvestmentEntities, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realInvestmentEntities;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealInvestmentEntities realInvestmentEntities = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1 realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1 = new RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1(continuation, realInvestmentEntities, 0);
                realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1.L$1 = obj2;
                return realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1 realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$12 = new RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1(continuation, realInvestmentEntities, 1);
                realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$12.L$1 = obj2;
                return realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
            default:
                RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1 realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$13 = new RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1(continuation, realInvestmentEntities, 2);
                realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$13.L$0 = flowCollector;
                realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$13.L$1 = obj2;
                return realInvestmentEntities$ownedStocks$$inlined$flatMapLatest$13.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealInvestmentEntities realInvestmentEntities = this.this$0;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) obj2;
                    RealEntityPriceRefresher realEntityPriceRefresher = realInvestmentEntities.entityPriceRefresher;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new InvestmentEntityToken(((OwnedHoldings) it.next()).token));
                    }
                    Flow observe = realEntityPriceRefresher.observe(arrayList);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    Object collect = observe.collect(new MusicPresenter$models$1$1.AnonymousClass2(11, flowCollector, list, realInvestmentEntities), this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
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
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list3 = (List) obj3;
                    RealEntityPriceRefresher realEntityPriceRefresher2 = realInvestmentEntities.entityPriceRefresher;
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new InvestmentEntityToken(((OwnedHoldings) it2.next()).token));
                    }
                    Flow observe2 = realEntityPriceRefresher2.observe(arrayList2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector2);
                    Object collect2 = observe2.collect(new RealCustomerStore$getCustomersForIds$$inlined$map$1.AnonymousClass2(flowCollector2, list3, 3), this);
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (collect2 != coroutineSingletons4) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons4) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons3) {
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
                FlowCollector flowCollector3 = this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list5 = (List) obj4;
                    RealEntityPriceRefresher realEntityPriceRefresher3 = realInvestmentEntities.entityPriceRefresher;
                    List list6 = list5;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new InvestmentEntityToken(((Investment_holding) it3.next()).token));
                    }
                    Flow observe3 = realEntityPriceRefresher3.observe(arrayList3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector3);
                    Object collect3 = observe3.collect(new RealCustomerStore$getCustomersForIds$$inlined$map$1.AnonymousClass2(flowCollector3, list5, 4), this);
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (collect3 != coroutineSingletons6) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 != coroutineSingletons6) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 == coroutineSingletons5) {
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
