package com.squareup.cash.offers.backend.real;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealOffersAnalyticsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1(Continuation continuation, RealOffersAnalyticsHelper realOffersAnalyticsHelper, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = realOffersAnalyticsHelper;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.this$0;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1 realOffersAnalyticsHelper$special$$inlined$flatMapLatest$1 = new RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1(continuation, realOffersAnalyticsHelper, 0);
                realOffersAnalyticsHelper$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
                realOffersAnalyticsHelper$special$$inlined$flatMapLatest$1.L$1 = obj2;
                return realOffersAnalyticsHelper$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1 realOffersAnalyticsHelper$special$$inlined$flatMapLatest$12 = new RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1(continuation, realOffersAnalyticsHelper, 1);
                realOffersAnalyticsHelper$special$$inlined$flatMapLatest$12.L$0 = flowCollector;
                realOffersAnalyticsHelper$special$$inlined$flatMapLatest$12.L$1 = obj2;
                return realOffersAnalyticsHelper$special$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
            default:
                RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1 realOffersAnalyticsHelper$special$$inlined$flatMapLatest$13 = new RealOffersAnalyticsHelper$special$$inlined$flatMapLatest$1(continuation, realOffersAnalyticsHelper, 2);
                realOffersAnalyticsHelper$special$$inlined$flatMapLatest$13.L$0 = flowCollector;
                realOffersAnalyticsHelper$special$$inlined$flatMapLatest$13.L$1 = obj2;
                return realOffersAnalyticsHelper$special$$inlined$flatMapLatest$13.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Flow cardModelView$textures$$inlined$combine$1;
        int i = this.$r8$classId;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Slots slots = (Slots) CollectionsKt.firstOrNull((List) obj2);
                    Flow appLockMonitor$special$$inlined$map$2 = (slots == null || (str = slots.token) == null) ? new AppLockMonitor$special$$inlined$map$2(null, 19) : realOffersAnalyticsHelper.boostRepository.getMerchantTokensForReward(str);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Slots slots2 = (Slots) CollectionsKt.firstOrNull((List) obj3);
                    Flow appLockMonitor$special$$inlined$map$22 = (slots2 == null || (str2 = slots2.token) == null) ? new AppLockMonitor$special$$inlined$map$2(null, 19) : realOffersAnalyticsHelper.boostRepository.getMerchantNameForReward(str2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, appLockMonitor$special$$inlined$map$22, this) == coroutineSingletons2) {
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
                RealBoostRepository realBoostRepository = realOffersAnalyticsHelper.boostRepository;
                FlowCollector flowCollector3 = this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) obj4;
                    if (list.isEmpty()) {
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        cardModelView$textures$$inlined$combine$1 = new AppLockMonitor$special$$inlined$map$2(emptyMap, 19);
                    } else {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it = list2.iterator();
                        while (true) {
                            int i5 = 0;
                            if (it.hasNext()) {
                                RewardWithSelection rewardWithSelection = (RewardWithSelection) it.next();
                                arrayList.add(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realBoostRepository.getMerchantNameForReward(rewardWithSelection.token), realBoostRepository.getMerchantTokensForReward(rewardWithSelection.token), new CardModelView$getActiveHeat$2$2(rewardWithSelection, continuation, 15), i5));
                            } else {
                                cardModelView$textures$$inlined$combine$1 = new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), 7);
                            }
                        }
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector3, cardModelView$textures$$inlined$combine$1, this) == coroutineSingletons3) {
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
