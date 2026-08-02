package com.squareup.cash.pools.backend.real;

import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.pools.backend.api.AddPoolParticipantFailureReason;
import com.squareup.cash.pools.backend.api.RemovePoolParticipantFailureReason;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.pools.AddCustomersToPoolRequest;
import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.pools.PoolsService;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolRequest;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealPoolsRepository {
    public final DerivedStateFlow appletAvailabilityState;
    public final DerivedStateFlow appletData;
    public final KeyValue goalMetAnimationSeen;
    public final CoroutineContext ioDispatcher;
    public final KeyValue poolsAppletData;
    public final PoolsService poolsService;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoolParticipantType.values().length];
            try {
                TransactionType.Companion companion = PoolParticipantType.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TransactionType.Companion companion2 = PoolParticipantType.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealPoolsRepository(RealFeatureEligibilityRepository realFeatureEligibilityRepository, KeyValue keyValue, PoolsService poolsService, KeyValue keyValue2, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.poolsAppletData = keyValue;
        this.poolsService = poolsService;
        this.goalMetAnimationSeen = keyValue2;
        this.ioDispatcher = coroutineContext;
        this.appletData = Countries.observeState(keyValue);
        int i = 10;
        this.appletAvailabilityState = StateFlowKt.mapState(FlowKt.stateIn(new FinishSetupTileBadgeCounter(i, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.POOLS_ONBOARDING_VISIBILITY}), coroutineScope, SharingStarted.Companion.Lazily, null), new MainActivity$$ExternalSyntheticLambda5(16));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addPoolParticipants(String str, List list, ContinuationImpl continuationImpl) {
        RealPoolsRepository$addPoolParticipants$1 realPoolsRepository$addPoolParticipants$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPoolsRepository$addPoolParticipants$1) {
            realPoolsRepository$addPoolParticipants$1 = (RealPoolsRepository$addPoolParticipants$1) continuationImpl;
            int i2 = realPoolsRepository$addPoolParticipants$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPoolsRepository$addPoolParticipants$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPoolsRepository$addPoolParticipants$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPoolsRepository$addPoolParticipants$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AddCustomersToPoolRequest addCustomersToPoolRequest = new AddCustomersToPoolRequest(str, list, ByteString.EMPTY);
                    realPoolsRepository$addPoolParticipants$1.label = 1;
                    obj = this.poolsService.addCustomersToPool(addCustomersToPoolRequest, realPoolsRepository$addPoolParticipants$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    return AddPoolParticipantFailureReason.HttpFailure.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    return AddPoolParticipantFailureReason.NetworkFailure.INSTANCE;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list2 = ((AddCustomersToPoolResponse) ((ApiResult.Success) apiResult).response).results;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((AddCustomersToPoolResponse.AddCustomerResult) obj2).failure_reason != null) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AddCustomersToPoolResponse.FailureReason failureReason = ((AddCustomersToPoolResponse.AddCustomerResult) it.next()).failure_reason;
                    failureReason.getClass();
                    arrayList2.add(failureReason);
                }
                return new AddPoolParticipantFailureReason.SuccessfulRequestFailureReason(arrayList2);
            }
        }
        realPoolsRepository$addPoolParticipants$1 = new RealPoolsRepository$addPoolParticipants$1(this, continuationImpl);
        Object obj3 = realPoolsRepository$addPoolParticipants$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPoolsRepository$addPoolParticipants$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removePoolParticipants(String str, List list, ContinuationImpl continuationImpl) {
        RealPoolsRepository$removePoolParticipants$1 realPoolsRepository$removePoolParticipants$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPoolsRepository$removePoolParticipants$1) {
            realPoolsRepository$removePoolParticipants$1 = (RealPoolsRepository$removePoolParticipants$1) continuationImpl;
            int i2 = realPoolsRepository$removePoolParticipants$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPoolsRepository$removePoolParticipants$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPoolsRepository$removePoolParticipants$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPoolsRepository$removePoolParticipants$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RemoveCustomersFromPoolRequest removeCustomersFromPoolRequest = new RemoveCustomersFromPoolRequest(str, list, ByteString.EMPTY);
                    realPoolsRepository$removePoolParticipants$1.label = 1;
                    obj = this.poolsService.removeCustomersFromPool(removeCustomersFromPoolRequest, realPoolsRepository$removePoolParticipants$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    return RemovePoolParticipantFailureReason.HttpFailure.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    return RemovePoolParticipantFailureReason.NetworkFailure.INSTANCE;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list2 = ((RemoveCustomersFromPoolResponse) ((ApiResult.Success) apiResult).response).results;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((RemoveCustomersFromPoolResponse.RemoveCustomerResult) obj2).failure_reason != null) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RemoveCustomersFromPoolResponse.FailureReason failureReason = ((RemoveCustomersFromPoolResponse.RemoveCustomerResult) it.next()).failure_reason;
                    failureReason.getClass();
                    arrayList2.add(failureReason);
                }
                return new RemovePoolParticipantFailureReason.SuccessfulRequestFailureReason(arrayList2);
            }
        }
        realPoolsRepository$removePoolParticipants$1 = new RealPoolsRepository$removePoolParticipants$1(this, continuationImpl);
        Object obj3 = realPoolsRepository$removePoolParticipants$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPoolsRepository$removePoolParticipants$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.set(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveGoalMetAnimationShown(String str, ContinuationImpl continuationImpl) {
        RealPoolsRepository$saveGoalMetAnimationShown$1 realPoolsRepository$saveGoalMetAnimationShown$1;
        int i;
        if (continuationImpl instanceof RealPoolsRepository$saveGoalMetAnimationShown$1) {
            realPoolsRepository$saveGoalMetAnimationShown$1 = (RealPoolsRepository$saveGoalMetAnimationShown$1) continuationImpl;
            int i2 = realPoolsRepository$saveGoalMetAnimationShown$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPoolsRepository$saveGoalMetAnimationShown$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPoolsRepository$saveGoalMetAnimationShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPoolsRepository$saveGoalMetAnimationShown$1.label;
                KeyValue keyValue = this.goalMetAnimationSeen;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realPoolsRepository$saveGoalMetAnimationShown$1.L$0 = str;
                    realPoolsRepository$saveGoalMetAnimationShown$1.label = 1;
                    obj = keyValue.get(realPoolsRepository$saveGoalMetAnimationShown$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realPoolsRepository$saveGoalMetAnimationShown$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                LinkedHashSet mutableSet = CollectionsKt.toMutableSet((Iterable) obj);
                mutableSet.add(str);
                realPoolsRepository$saveGoalMetAnimationShown$1.L$0 = null;
                realPoolsRepository$saveGoalMetAnimationShown$1.label = 2;
            }
        }
        realPoolsRepository$saveGoalMetAnimationShown$1 = new RealPoolsRepository$saveGoalMetAnimationShown$1(this, continuationImpl);
        Object obj2 = realPoolsRepository$saveGoalMetAnimationShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPoolsRepository$saveGoalMetAnimationShown$1.label;
        KeyValue keyValue2 = this.goalMetAnimationSeen;
        if (i != 0) {
        }
        LinkedHashSet mutableSet2 = CollectionsKt.toMutableSet((Iterable) obj2);
        mutableSet2.add(str);
        realPoolsRepository$saveGoalMetAnimationShown$1.L$0 = null;
        realPoolsRepository$saveGoalMetAnimationShown$1.label = 2;
    }
}
