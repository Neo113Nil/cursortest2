package com.squareup.cash.investing.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.db.SelectDiscoveries;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
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
public final class RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ boolean $forSearch$inlined;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealInvestmentEntities this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1(Continuation continuation, boolean z, RealInvestmentEntities realInvestmentEntities) {
        super(3, continuation);
        this.$forSearch$inlined = z;
        this.this$0 = realInvestmentEntities;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1 realInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1 = new RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1((Continuation) obj3, this.$forSearch$inlined, this.this$0);
        realInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        realInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1.L$1 = obj2;
        return realInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            List list = (List) obj2;
            if (this.$forSearch$inlined) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    Boolean bool = ((SelectDiscoveries) obj3).in_search_suggestion;
                    if (bool != null ? bool.booleanValue() : true) {
                        arrayList.add(obj3);
                    }
                }
                list = arrayList;
            }
            RealEntityPriceRefresher realEntityPriceRefresher = this.this$0.entityPriceRefresher;
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new InvestmentEntityToken(((SelectDiscoveries) it.next()).token));
            }
            Flow observe = realEntityPriceRefresher.observe(arrayList2);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            FlowKt.ensureActive(flowCollector);
            Object collect = observe.collect(new RealCustomerStore$getCustomersForIds$$inlined$map$1.AnonymousClass2(flowCollector, list, 2), this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (collect != coroutineSingletons2) {
                collect = Unit.INSTANCE;
            }
            if (collect != coroutineSingletons2) {
                collect = Unit.INSTANCE;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
