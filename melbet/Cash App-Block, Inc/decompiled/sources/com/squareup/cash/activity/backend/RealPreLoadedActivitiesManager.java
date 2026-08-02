package com.squareup.cash.activity.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Failure;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$NotFound;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Result;
import com.squareup.cash.activity.backend.loader.ActivitiesManager$ActivityGetHandler$Success;
import com.squareup.cash.activity.backend.loader.DefaultGetRequestHandler$Factory;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealPreLoadedActivitiesManager implements ActivitiesManager {
    public final SharedFlowImpl activities;
    public final ActivitiesManager.ActivityContext activityContext;
    public final ActivitiesCache cache;
    public final KeysetHandle getHandler;

    public RealPreLoadedActivitiesManager(DefaultGetRequestHandler$Factory defaultGetRequestHandler$Factory, ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache) {
        activityContext.getClass();
        activitiesCache.getClass();
        this.activityContext = activityContext;
        this.cache = activitiesCache;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2);
        Activities activities = activitiesCache.get();
        if (activities == null) {
            StateFlowKt.emitOrThrow(MutableSharedFlow$default, new Activities(EmptyList.INSTANCE, LoadingState.LOADED, 14));
        } else {
            StateFlowKt.emitOrThrow(MutableSharedFlow$default, activities);
        }
        this.activities = MutableSharedFlow$default;
        this.getHandler = defaultGetRequestHandler$Factory.create();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow activities() {
        return FlowKt.asSharedFlow(this.activities);
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final void clear() {
        StateFlowKt.emitOrThrow(this.activities, new Activities(EmptyList.INSTANCE, LoadingState.LOADED, 14));
        this.cache.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (updateItem(r8, null, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (updateItem(r8, r9, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ActivityItem activityItem, ContinuationImpl continuationImpl) {
        RealPreLoadedActivitiesManager$fetch$1 realPreLoadedActivitiesManager$fetch$1;
        int i;
        ActivitiesManager$ActivityGetHandler$Result activitiesManager$ActivityGetHandler$Result;
        if (continuationImpl instanceof RealPreLoadedActivitiesManager$fetch$1) {
            realPreLoadedActivitiesManager$fetch$1 = (RealPreLoadedActivitiesManager$fetch$1) continuationImpl;
            int i2 = realPreLoadedActivitiesManager$fetch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPreLoadedActivitiesManager$fetch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPreLoadedActivitiesManager$fetch$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPreLoadedActivitiesManager$fetch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityItemGlobalId activityItemGlobalId = activityItem.getActivityItemGlobalId();
                    realPreLoadedActivitiesManager$fetch$1.L$0 = activityItem;
                    realPreLoadedActivitiesManager$fetch$1.label = 1;
                    obj = this.getHandler.requestItem(this.activityContext, activityItemGlobalId, realPreLoadedActivitiesManager$fetch$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    activityItem = realPreLoadedActivitiesManager$fetch$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                activitiesManager$ActivityGetHandler$Result = (ActivitiesManager$ActivityGetHandler$Result) obj;
                if (!Intrinsics.areEqual(activitiesManager$ActivityGetHandler$Result, ActivitiesManager$ActivityGetHandler$Failure.INSTANCE)) {
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(activitiesManager$ActivityGetHandler$Result, ActivitiesManager$ActivityGetHandler$NotFound.INSTANCE)) {
                    realPreLoadedActivitiesManager$fetch$1.L$0 = null;
                    realPreLoadedActivitiesManager$fetch$1.label = 2;
                } else {
                    if (!(activitiesManager$ActivityGetHandler$Result instanceof ActivitiesManager$ActivityGetHandler$Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ActivityItem activityItem2 = ((ActivitiesManager$ActivityGetHandler$Success) activitiesManager$ActivityGetHandler$Result).item;
                    realPreLoadedActivitiesManager$fetch$1.L$0 = null;
                    realPreLoadedActivitiesManager$fetch$1.label = 3;
                }
                return obj2;
            }
        }
        realPreLoadedActivitiesManager$fetch$1 = new RealPreLoadedActivitiesManager$fetch$1(this, continuationImpl);
        Object obj3 = realPreLoadedActivitiesManager$fetch$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPreLoadedActivitiesManager$fetch$1.label;
        if (i != 0) {
        }
        activitiesManager$ActivityGetHandler$Result = (ActivitiesManager$ActivityGetHandler$Result) obj3;
        if (!Intrinsics.areEqual(activitiesManager$ActivityGetHandler$Result, ActivitiesManager$ActivityGetHandler$Failure.INSTANCE)) {
        }
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Object load(ActivitiesManager.LoadMode loadMode, Continuation continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateItem(ActivityItem activityItem, ActivityItem activityItem2, ContinuationImpl continuationImpl) {
        RealPreLoadedActivitiesManager$updateItem$1 realPreLoadedActivitiesManager$updateItem$1;
        int i;
        ArrayList arrayList;
        Activities activities;
        if (continuationImpl instanceof RealPreLoadedActivitiesManager$updateItem$1) {
            realPreLoadedActivitiesManager$updateItem$1 = (RealPreLoadedActivitiesManager$updateItem$1) continuationImpl;
            int i2 = realPreLoadedActivitiesManager$updateItem$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPreLoadedActivitiesManager$updateItem$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPreLoadedActivitiesManager$updateItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPreLoadedActivitiesManager$updateItem$1.label;
                ActivitiesCache activitiesCache = this.cache;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = this.activities;
                    Activities activities2 = (Activities) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                    if (activities2 == null) {
                        return Unit.INSTANCE;
                    }
                    if (activitiesCache.get(activityItem.getRowId()) != null) {
                        List<ActivityItem> list = activities2.recentActivities;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (ActivityItem activityItem3 : list) {
                                if (Intrinsics.areEqual(activityItem3.getRowId(), activityItem.getRowId())) {
                                    activityItem3 = activityItem2;
                                }
                                if (activityItem3 != null) {
                                    arrayList.add(activityItem3);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        Activities copy$default = Activities.copy$default(activities2, arrayList, null, 30);
                        realPreLoadedActivitiesManager$updateItem$1.L$4 = copy$default;
                        realPreLoadedActivitiesManager$updateItem$1.label = 1;
                        if (sharedFlowImpl.emit(copy$default, realPreLoadedActivitiesManager$updateItem$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        activities = copy$default;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                activities = realPreLoadedActivitiesManager$updateItem$1.L$4;
                SafeTrace.throwOnFailure(obj);
                activitiesCache.set(activities);
                return Unit.INSTANCE;
            }
        }
        realPreLoadedActivitiesManager$updateItem$1 = new RealPreLoadedActivitiesManager$updateItem$1(this, continuationImpl);
        Object obj2 = realPreLoadedActivitiesManager$updateItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPreLoadedActivitiesManager$updateItem$1.label;
        ActivitiesCache activitiesCache2 = this.cache;
        if (i != 0) {
        }
        activitiesCache2.set(activities);
        return Unit.INSTANCE;
    }
}
