package com.squareup.cash.investing.backend.real.families;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealDependentInvestmentEntities {
    public final RealEntityPriceRefresher entityPriceRefresher;
    public final RealInvestmentEntities investmentEntities;

    public RealDependentInvestmentEntities(RealEntityPriceRefresher realEntityPriceRefresher, RealInvestmentEntities realInvestmentEntities) {
        this.entityPriceRefresher = realEntityPriceRefresher;
        this.investmentEntities = realInvestmentEntities;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[LOOP:0: B:11:0x006f->B:13:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFollowingStocks(List list, ContinuationImpl continuationImpl) {
        RealDependentInvestmentEntities$getFollowingStocks$1 realDependentInvestmentEntities$getFollowingStocks$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof RealDependentInvestmentEntities$getFollowingStocks$1) {
            realDependentInvestmentEntities$getFollowingStocks$1 = (RealDependentInvestmentEntities$getFollowingStocks$1) continuationImpl;
            int i2 = realDependentInvestmentEntities$getFollowingStocks$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDependentInvestmentEntities$getFollowingStocks$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDependentInvestmentEntities$getFollowingStocks$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDependentInvestmentEntities$getFollowingStocks$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((SyncInvestmentHolding) obj3).state == SyncInvestmentHolding.InvestmentHoldingState.FOLLOWED) {
                            arrayList.add(obj3);
                        }
                    }
                    realDependentInvestmentEntities$getFollowingStocks$1.label = 1;
                    obj = getInvestmentDetailsMap(arrayList, realDependentInvestmentEntities$getFollowingStocks$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList(map.size());
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add(((StockDetails) ((Map.Entry) it.next()).getKey()).entityWithPrice.getToken());
                }
                return new Transform$special$$inlined$map$1(this.entityPriceRefresher.observe(arrayList2), map, 28);
            }
        }
        realDependentInvestmentEntities$getFollowingStocks$1 = new RealDependentInvestmentEntities$getFollowingStocks$1(this, continuationImpl);
        Object obj4 = realDependentInvestmentEntities$getFollowingStocks$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDependentInvestmentEntities$getFollowingStocks$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj4;
        ArrayList arrayList22 = new ArrayList(map2.size());
        it = map2.entrySet().iterator();
        while (it.hasNext()) {
        }
        return new Transform$special$$inlined$map$1(this.entityPriceRefresher.observe(arrayList22), map2, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getInvestmentDetailsMap(ArrayList arrayList, ContinuationImpl continuationImpl) {
        RealDependentInvestmentEntities$getInvestmentDetailsMap$1 realDependentInvestmentEntities$getInvestmentDetailsMap$1;
        int i;
        if (continuationImpl instanceof RealDependentInvestmentEntities$getInvestmentDetailsMap$1) {
            realDependentInvestmentEntities$getInvestmentDetailsMap$1 = (RealDependentInvestmentEntities$getInvestmentDetailsMap$1) continuationImpl;
            int i2 = realDependentInvestmentEntities$getInvestmentDetailsMap$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDependentInvestmentEntities$getInvestmentDetailsMap$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDependentInvestmentEntities$getInvestmentDetailsMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDependentInvestmentEntities$getInvestmentDetailsMap$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StartedLazily$command$$inlined$unsafeFlow$1 startedLazily$command$$inlined$unsafeFlow$1 = new StartedLazily$command$$inlined$unsafeFlow$1(arrayList, 3);
                    CheckStatusPresenter.AnonymousClass1.C00611 c00611 = new CheckStatusPresenter.AnonymousClass1.C00611(this, continuation, 26);
                    int i3 = FlowKt__MergeKt.DEFAULT_CONCURRENCY;
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(0, startedLazily$command$$inlined$unsafeFlow$1, c00611);
                    if (i3 <= 0) {
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Expected positive concurrency level, but had "));
                        return null;
                    }
                    Flow realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = i3 == 1 ? new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flowKt__MergeKt$flatMapMerge$$inlined$map$1, 23) : new ChannelFlowMerge(i3, -2, EmptyCoroutineContext.INSTANCE, BufferOverflow.SUSPEND, flowKt__MergeKt$flatMapMerge$$inlined$map$1);
                    realDependentInvestmentEntities$getInvestmentDetailsMap$1.label = 1;
                    obj = FlowKt__CollectionKt.toCollection(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, new ArrayList(), realDependentInvestmentEntities$getInvestmentDetailsMap$1);
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
                return MapsKt__MapsKt.toMap((Iterable) obj);
            }
        }
        realDependentInvestmentEntities$getInvestmentDetailsMap$1 = new RealDependentInvestmentEntities$getInvestmentDetailsMap$1(this, continuationImpl);
        Object obj2 = realDependentInvestmentEntities$getInvestmentDetailsMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDependentInvestmentEntities$getInvestmentDetailsMap$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return MapsKt__MapsKt.toMap((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[LOOP:0: B:11:0x006f->B:13:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOwnedStocks(List list, ContinuationImpl continuationImpl) {
        RealDependentInvestmentEntities$getOwnedStocks$1 realDependentInvestmentEntities$getOwnedStocks$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof RealDependentInvestmentEntities$getOwnedStocks$1) {
            realDependentInvestmentEntities$getOwnedStocks$1 = (RealDependentInvestmentEntities$getOwnedStocks$1) continuationImpl;
            int i2 = realDependentInvestmentEntities$getOwnedStocks$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDependentInvestmentEntities$getOwnedStocks$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDependentInvestmentEntities$getOwnedStocks$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDependentInvestmentEntities$getOwnedStocks$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((SyncInvestmentHolding) obj3).state == SyncInvestmentHolding.InvestmentHoldingState.OWNED) {
                            arrayList.add(obj3);
                        }
                    }
                    realDependentInvestmentEntities$getOwnedStocks$1.label = 1;
                    obj = getInvestmentDetailsMap(arrayList, realDependentInvestmentEntities$getOwnedStocks$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList(map.size());
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add(((StockDetails) ((Map.Entry) it.next()).getKey()).entityWithPrice.getToken());
                }
                return new RealActivityInvitePresenter(20, this.entityPriceRefresher.observe(arrayList2), map, this);
            }
        }
        realDependentInvestmentEntities$getOwnedStocks$1 = new RealDependentInvestmentEntities$getOwnedStocks$1(this, continuationImpl);
        Object obj4 = realDependentInvestmentEntities$getOwnedStocks$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDependentInvestmentEntities$getOwnedStocks$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj4;
        ArrayList arrayList22 = new ArrayList(map2.size());
        it = map2.entrySet().iterator();
        while (it.hasNext()) {
        }
        return new RealActivityInvitePresenter(20, this.entityPriceRefresher.observe(arrayList22), map2, this);
    }
}
