package com.squareup.cash.family.familyhub.backend.real.sync;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import com.squareup.protos.cash.clientsync.service.ClientSyncAppApiService;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetRequest;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetResponse;
import com.squareup.protos.cash.clientsync.service.SyncTopic;
import com.squareup.protos.cash.clientsync.service.TargetEntities;
import com.squareup.protos.cash.clientsync.service.TargetSpecifications;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealTargetEntityManager$investingPortfolio$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $accountToken;
    public final /* synthetic */ MutableState $investmentHoldings$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealTargetEntityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealTargetEntityManager$investingPortfolio$2$1(String str, RealTargetEntityManager realTargetEntityManager, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$accountToken = str;
        this.this$0 = realTargetEntityManager;
        this.$investmentHoldings$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealTargetEntityManager$investingPortfolio$2$1(this.$accountToken, this.this$0, this.$investmentHoldings$delegate, continuation, 0);
            default:
                return new RealTargetEntityManager$investingPortfolio$2$1(this.$accountToken, this.this$0, this.$investmentHoldings$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealTargetEntityManager$investingPortfolio$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object syncEntitiesByTarget;
        Object value;
        Object syncEntitiesByTarget2;
        Object value2;
        int i = this.$r8$classId;
        Object obj2 = TargetEntityManager$TargetEntityValue.Failed.INSTANCE;
        MutableState mutableState = this.$investmentHoldings$delegate;
        String str = this.$accountToken;
        RealTargetEntityManager realTargetEntityManager = this.this$0;
        switch (i) {
            case 0:
                StateFlowImpl stateFlowImpl = realTargetEntityManager.cachedInvestmentHoldings;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = new GetSyncEntitiesByTargetRequest(str, CollectionsKt__CollectionsJVMKt.listOf(new TargetSpecifications(SyncTopic.CLIENTSYNC_PRIMARY, CollectionsKt__CollectionsJVMKt.listOf(DomainType.HOLDING_ENTITY))), new Integer(100), 24);
                    ClientSyncAppApiService clientSyncAppApiService = realTargetEntityManager.service;
                    this.label = 1;
                    syncEntitiesByTarget = clientSyncAppApiService.getSyncEntitiesByTarget("TODO", getSyncEntitiesByTargetRequest, this);
                    if (syncEntitiesByTarget == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    syncEntitiesByTarget = obj;
                }
                ApiResult apiResult = (ApiResult) syncEntitiesByTarget;
                if (apiResult instanceof ApiResult.Failure) {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e("Failed to fetch sync entities for account " + str + ". Http error: " + ((ApiResult.Failure.HttpFailure) apiResult).code, new Object[0]);
                    } else {
                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Failed to fetch sync entities for account ", str), new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                    }
                    List list = (List) ((Map) stateFlowImpl.getValue()).get(str);
                    TargetEntityManager$TargetEntityValue.Ready ready = list != null ? new TargetEntityManager$TargetEntityValue.Ready(null, null, list, 3) : null;
                    if (ready != null) {
                        obj2 = ready;
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list2 = ((GetSyncEntitiesByTargetResponse) ((ApiResult.Success) apiResult).response).target_entities;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        CollectionsKt__MutableCollectionsKt.addAll(((TargetEntities) it.next()).entities, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        SyncInvestmentHolding syncInvestmentHolding = ((SyncEntity) it2.next()).investment_holding;
                        if (syncInvestmentHolding != null) {
                            arrayList2.add(syncInvestmentHolding);
                        }
                    }
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, MapsKt__MapsKt.plus((Map) value, new Pair(str, arrayList2))));
                    obj2 = new TargetEntityManager$TargetEntityValue.Ready(null, null, arrayList2, 3);
                }
                mutableState.setValue(obj2);
                return Unit.INSTANCE;
            default:
                StateFlowImpl stateFlowImpl2 = realTargetEntityManager.cachedRecurringPreferences;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest2 = new GetSyncEntitiesByTargetRequest(str, CollectionsKt__CollectionsJVMKt.listOf(new TargetSpecifications(SyncTopic.CLIENTSYNC_PRIMARY, CollectionsKt__CollectionsJVMKt.listOf(DomainType.RECURRING_PREFERENCE))), new Integer(100), 24);
                    ClientSyncAppApiService clientSyncAppApiService2 = realTargetEntityManager.service;
                    this.label = 1;
                    syncEntitiesByTarget2 = clientSyncAppApiService2.getSyncEntitiesByTarget("TODO", getSyncEntitiesByTargetRequest2, this);
                    if (syncEntitiesByTarget2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    syncEntitiesByTarget2 = obj;
                }
                ApiResult apiResult2 = (ApiResult) syncEntitiesByTarget2;
                if (apiResult2 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure2 = (ApiResult.Failure) apiResult2;
                    if (failure2 instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e("Failed to fetch sync entities for account " + str + ". Http error: " + ((ApiResult.Failure.HttpFailure) apiResult2).code, new Object[0]);
                    } else {
                        if (!(failure2 instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Failed to fetch sync entities for account ", str), new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult2).error);
                    }
                    List list3 = (List) ((Map) stateFlowImpl2.getValue()).get(str);
                    TargetEntityManager$TargetEntityValue.Ready ready2 = list3 != null ? new TargetEntityManager$TargetEntityValue.Ready(null, list3, null, 5) : null;
                    if (ready2 != null) {
                        obj2 = ready2;
                    }
                    mutableState.setValue(obj2);
                    return Unit.INSTANCE;
                }
                if (!(apiResult2 instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list4 = ((GetSyncEntitiesByTargetResponse) ((ApiResult.Success) apiResult2).response).target_entities;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((TargetEntities) it3.next()).entities, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    SyncRecurringPreference syncRecurringPreference = ((SyncEntity) it4.next()).recurring_preference;
                    if (syncRecurringPreference != null) {
                        arrayList4.add(syncRecurringPreference);
                    }
                }
                do {
                    value2 = stateFlowImpl2.getValue();
                } while (!stateFlowImpl2.compareAndSet(value2, MapsKt__MapsKt.plus((Map) value2, new Pair(str, arrayList4))));
                obj2 = new TargetEntityManager$TargetEntityValue.Ready(null, arrayList4, null, 5);
                mutableState.setValue(obj2);
                return Unit.INSTANCE;
        }
    }
}
