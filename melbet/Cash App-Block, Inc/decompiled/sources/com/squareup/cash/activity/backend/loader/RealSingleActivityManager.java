package com.squareup.cash.activity.backend.loader;

import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadger2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealSingleActivityManager implements SingleActivityManager {
    public final SharedFlowImpl activity;
    public final ActivitiesManager.ActivityContext activityContext;
    public final ZiplineActivityItemFormatter activityItemFormatter;
    public final Badger2 badger2;
    public final SingleActivityCache$InMemory cache;
    public final CoroutineContext ioDispatcher;
    public final Locale locale;
    public final KeysetHandle requestHandler;
    public final ActivityItemGlobalId target;

    public RealSingleActivityManager(ActivitiesManager.ActivityContext activityContext, ActivityItemGlobalId activityItemGlobalId, SingleActivityCache$InMemory singleActivityCache$InMemory, Locale locale, Badger2 badger2, CoroutineContext coroutineContext, ZiplineActivityItemFormatter ziplineActivityItemFormatter, DefaultGetRequestHandler$Factory defaultGetRequestHandler$Factory) {
        activityItemGlobalId.getClass();
        singleActivityCache$InMemory.getClass();
        this.activityContext = activityContext;
        this.target = activityItemGlobalId;
        this.cache = singleActivityCache$InMemory;
        this.locale = locale;
        this.badger2 = badger2;
        this.ioDispatcher = coroutineContext;
        this.activityItemFormatter = ziplineActivityItemFormatter;
        KeysetHandle keysetHandle = activityContext.getRequestHandler;
        this.requestHandler = keysetHandle == null ? defaultGetRequestHandler$Factory.create() : keysetHandle;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2);
        SingleActivity singleActivity = singleActivityCache$InMemory.activityItem;
        if (singleActivity != null) {
            StateFlowKt.emitOrThrow(MutableSharedFlow$default, singleActivity);
        }
        this.activity = MutableSharedFlow$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012b, code lost:
    
        if (r4.emit(r14, r0) != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r4.emit(r13, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if (r4.emit(r13, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r14 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ContinuationImpl continuationImpl) {
        RealSingleActivityManager$fetch$1 realSingleActivityManager$fetch$1;
        int i;
        SingleActivity singleActivity;
        ActivitiesManager$ActivityGetHandler$Result activitiesManager$ActivityGetHandler$Result;
        if (continuationImpl instanceof RealSingleActivityManager$fetch$1) {
            realSingleActivityManager$fetch$1 = (RealSingleActivityManager$fetch$1) continuationImpl;
            int i2 = realSingleActivityManager$fetch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSingleActivityManager$fetch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSingleActivityManager$fetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSingleActivityManager$fetch$1.label;
                int i3 = 1;
                SharedFlowImpl sharedFlowImpl = this.activity;
                Continuation continuation = null;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        SingleActivity singleActivity2 = (SingleActivity) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                        SingleActivity copy$default = singleActivity2 != null ? SingleActivity.copy$default(singleActivity2, null, LoadingState.LOADING, 1) : new SingleActivity(LoadingState.LOADING);
                        realSingleActivityManager$fetch$1.L$0 = singleActivity2;
                        realSingleActivityManager$fetch$1.label = 1;
                        if (sharedFlowImpl.emit(copy$default, realSingleActivityManager$fetch$1) != coroutineSingletons) {
                            singleActivity = singleActivity2;
                            RealSingleActivityManager$activity$2$1$1 realSingleActivityManager$activity$2$1$1 = new RealSingleActivityManager$activity$2$1$1(this, continuation, i3);
                            realSingleActivityManager$fetch$1.L$0 = singleActivity;
                            realSingleActivityManager$fetch$1.label = 2;
                            obj = JobKt.withContext(this.ioDispatcher, realSingleActivityManager$activity$2$1$1, realSingleActivityManager$fetch$1);
                            break;
                        }
                        return coroutineSingletons;
                    case 1:
                        singleActivity = realSingleActivityManager$fetch$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        RealSingleActivityManager$activity$2$1$1 realSingleActivityManager$activity$2$1$12 = new RealSingleActivityManager$activity$2$1$1(this, continuation, i3);
                        realSingleActivityManager$fetch$1.L$0 = singleActivity;
                        realSingleActivityManager$fetch$1.label = 2;
                        obj = JobKt.withContext(this.ioDispatcher, realSingleActivityManager$activity$2$1$12, realSingleActivityManager$fetch$1);
                        break;
                    case 2:
                        singleActivity = realSingleActivityManager$fetch$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        ActivitiesManager$ActivityGetHandler$Result activitiesManager$ActivityGetHandler$Result2 = (ActivitiesManager$ActivityGetHandler$Result) obj;
                        if (Intrinsics.areEqual(activitiesManager$ActivityGetHandler$Result2, ActivitiesManager$ActivityGetHandler$Failure.INSTANCE)) {
                            SingleActivity copy$default2 = singleActivity != null ? SingleActivity.copy$default(singleActivity, null, LoadingState.ERROR, 1) : new SingleActivity(LoadingState.ERROR);
                            realSingleActivityManager$fetch$1.L$0 = null;
                            realSingleActivityManager$fetch$1.L$1 = null;
                            realSingleActivityManager$fetch$1.label = 3;
                            break;
                        } else if (Intrinsics.areEqual(activitiesManager$ActivityGetHandler$Result2, ActivitiesManager$ActivityGetHandler$NotFound.INSTANCE)) {
                            SingleActivity singleActivity3 = new SingleActivity(null, LoadingState.LOADED);
                            realSingleActivityManager$fetch$1.L$0 = null;
                            realSingleActivityManager$fetch$1.L$1 = null;
                            realSingleActivityManager$fetch$1.label = 4;
                            break;
                        } else {
                            if (!(activitiesManager$ActivityGetHandler$Result2 instanceof ActivitiesManager$ActivityGetHandler$Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ActivitiesManager$ActivityGetHandler$Success activitiesManager$ActivityGetHandler$Success = (ActivitiesManager$ActivityGetHandler$Success) activitiesManager$ActivityGetHandler$Result2;
                            ActivityItem activityItem = activitiesManager$ActivityGetHandler$Success.item;
                            realSingleActivityManager$fetch$1.L$0 = null;
                            realSingleActivityManager$fetch$1.L$1 = activitiesManager$ActivityGetHandler$Success;
                            realSingleActivityManager$fetch$1.label = 5;
                            Object updateBadgingInfo = ((RealBadger2) this.badger2).updateBadgingInfo(CollectionsKt__CollectionsJVMKt.listOf(new Badger2.BadgingInfo(activityItem.getRowId(), activityItem.getVersion(), activityItem.isBadged(), CollectionsKt__CollectionsJVMKt.listOf("ACTIVITY"), ItemType.ACTIVITY)), realSingleActivityManager$fetch$1);
                            if (updateBadgingInfo != coroutineSingletons) {
                                updateBadgingInfo = Unit.INSTANCE;
                            }
                            if (updateBadgingInfo != coroutineSingletons) {
                                activitiesManager$ActivityGetHandler$Result = activitiesManager$ActivityGetHandler$Result2;
                                SingleActivity singleActivity4 = new SingleActivity(((ActivitiesManager$ActivityGetHandler$Success) activitiesManager$ActivityGetHandler$Result).item, LoadingState.LOADED);
                                realSingleActivityManager$fetch$1.L$0 = null;
                                realSingleActivityManager$fetch$1.L$1 = null;
                                realSingleActivityManager$fetch$1.label = 6;
                                break;
                            }
                        }
                        return coroutineSingletons;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        activitiesManager$ActivityGetHandler$Result = realSingleActivityManager$fetch$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        SingleActivity singleActivity42 = new SingleActivity(((ActivitiesManager$ActivityGetHandler$Success) activitiesManager$ActivityGetHandler$Result).item, LoadingState.LOADED);
                        realSingleActivityManager$fetch$1.L$0 = null;
                        realSingleActivityManager$fetch$1.L$1 = null;
                        realSingleActivityManager$fetch$1.label = 6;
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realSingleActivityManager$fetch$1 = new RealSingleActivityManager$fetch$1(this, continuationImpl);
        Object obj2 = realSingleActivityManager$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSingleActivityManager$fetch$1.label;
        int i32 = 1;
        SharedFlowImpl sharedFlowImpl2 = this.activity;
        Continuation continuation2 = null;
        switch (i) {
        }
    }
}
