package com.squareup.cash.clientsync.pipeline;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.network.ClientSyncApiResult;
import com.squareup.cash.clientsync.network.ClientSyncResponseContext;
import com.squareup.cash.clientsync.network.GatewayRequest;
import com.squareup.cash.clientsync.network.GatewayResponse;
import com.squareup.cash.clientsync.network.GatewayServiceKt;
import com.squareup.cash.clientsync.network.GatewayTopicRequest;
import com.squareup.cash.clientsync.network.GatewayTopicResponse;
import com.squareup.cash.clientsync.network.ServerSyncResponse;
import com.squareup.cash.clientsync.persistence.SyncRangeStore;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.util.coroutines.ClientSyncDispatchers;
import com.squareup.cash.db.WireAdapter;
import com.squareup.util.compose.ProgressBarKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Clock;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.Instant;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealClientSyncRequestExecutor implements ClientSyncRequestExecutor {
    public static final long SYNC_EXPIRATION_TIME_MS;
    public final Clock clock;
    public final MutableClientSyncCompletionTracker completionTracker;
    public final WireAdapter gatewayService;
    public final BufferedChannel queue;
    public final RealClientSyncResponseProcessor responseProcessor;
    public final SyncRangeStore syncRangeStore;
    public final ClientSyncRequestObserver[] syncRequestObservers;
    public final KeysetHandle syncTopicReader;

    /* loaded from: classes6.dex */
    public final class SyncRequestQueueElement {
        public final SyncRequestOperation syncRequestOperation;
        public final CompletableDeferredImpl syncRequestOperationResult;

        public SyncRequestQueueElement(SyncRequestOperation syncRequestOperation, CompletableDeferredImpl completableDeferredImpl) {
            this.syncRequestOperation = syncRequestOperation;
            this.syncRequestOperationResult = completableDeferredImpl;
        }

        public final SyncRequestOperation component1() {
            return this.syncRequestOperation;
        }

        public final CompletableDeferred component2() {
            return this.syncRequestOperationResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SyncRequestQueueElement) {
                SyncRequestQueueElement syncRequestQueueElement = (SyncRequestQueueElement) obj;
                return this.syncRequestOperation.equals(syncRequestQueueElement.syncRequestOperation) && this.syncRequestOperationResult == syncRequestQueueElement.syncRequestOperationResult;
            }
            return false;
        }

        public final int hashCode() {
            return this.syncRequestOperationResult.hashCode() + (this.syncRequestOperation.hashCode() * 31);
        }

        public final String toString() {
            return "SyncRequestQueueElement(syncRequestOperation=" + this.syncRequestOperation + ", syncRequestOperationResult=" + this.syncRequestOperationResult + ")";
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        SYNC_EXPIRATION_TIME_MS = DurationKt.toDuration(3, DurationUnit.MINUTES);
    }

    public RealClientSyncRequestExecutor(CoroutineScope coroutineScope, MutableClientSyncCompletionTracker mutableClientSyncCompletionTracker, RealClientSyncResponseProcessor realClientSyncResponseProcessor, WireAdapter wireAdapter, SyncRangeStore syncRangeStore, List list, KeysetHandle keysetHandle) {
        DefaultIoScheduler defaultIoScheduler = ClientSyncDispatchers.IO;
        list.getClass();
        defaultIoScheduler.getClass();
        this.completionTracker = mutableClientSyncCompletionTracker;
        this.responseProcessor = realClientSyncResponseProcessor;
        this.gatewayService = wireAdapter;
        this.syncRangeStore = syncRangeStore;
        this.syncTopicReader = keysetHandle;
        this.clock = Clock.System.INSTANCE;
        this.syncRequestObservers = (ClientSyncRequestObserver[]) list.toArray(new ClientSyncRequestObserver[0]);
        BufferedChannel Channel$default = PapaEvent.Channel$default(-2, null, null, 6);
        JobKt.launch$default(coroutineScope, defaultIoScheduler, null, new RealBoostSelector.AnonymousClass1(Channel$default, this, null, 3), 2);
        this.queue = Channel$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011c A[LOOP:0: B:12:0x011a->B:13:0x011c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$executeSyncRequestSynchronously(RealClientSyncRequestExecutor realClientSyncRequestExecutor, SyncRequestOperation syncRequestOperation, ContinuationImpl continuationImpl) {
        RealClientSyncRequestExecutor$executeSyncRequestSynchronously$1 realClientSyncRequestExecutor$executeSyncRequestSynchronously$1;
        int i;
        Set topics;
        SyncRequestOperation.Result skipped;
        Object obj;
        ClientSyncRequestObserver[] clientSyncRequestObserverArr = realClientSyncRequestExecutor.syncRequestObservers;
        if (continuationImpl instanceof RealClientSyncRequestExecutor$executeSyncRequestSynchronously$1) {
            realClientSyncRequestExecutor$executeSyncRequestSynchronously$1 = (RealClientSyncRequestExecutor$executeSyncRequestSynchronously$1) continuationImpl;
            int i2 = realClientSyncRequestExecutor$executeSyncRequestSynchronously$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClientSyncRequestExecutor$executeSyncRequestSynchronously$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realClientSyncRequestExecutor$executeSyncRequestSynchronously$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClientSyncRequestExecutor$executeSyncRequestSynchronously$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    for (ClientSyncRequestObserver clientSyncRequestObserver : clientSyncRequestObserverArr) {
                        clientSyncRequestObserver.onBeforeSyncRequestOperation(syncRequestOperation);
                    }
                    KeysetHandle keysetHandle = realClientSyncRequestExecutor.syncTopicReader;
                    SyncScope syncScope = syncRequestOperation.scope;
                    SyncTrigger syncTrigger = syncRequestOperation.trigger;
                    if (syncScope instanceof SyncScope.Global) {
                        topics = ProgressBarKt.getTopicsEligibleForGlobalSync(keysetHandle);
                    } else {
                        if (!(syncScope instanceof SyncScope.Topics)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        topics = syncTrigger == SyncTrigger.SERVER_PUSH ? ((SyncScope.Topics) syncScope).getTopics() : CollectionsKt.intersect(((SyncScope.Topics) syncScope).getTopics(), keysetHandle.getTopicsEligibleForTopicSync());
                    }
                    switch (syncTrigger.ordinal()) {
                        case 2:
                        case 5:
                        case 6:
                        case 7:
                            Instant now = realClientSyncRequestExecutor.clock.now();
                            now.getClass();
                            long m4179unaryMinusUwyO8pc = Duration.m4179unaryMinusUwyO8pc(SYNC_EXPIRATION_TIME_MS);
                            long m4176toLongimpl = Duration.m4176toLongimpl(m4179unaryMinusUwyO8pc, DurationUnit.SECONDS);
                            int m4169getNanosecondsComponentimpl = Duration.m4169getNanosecondsComponentimpl(m4179unaryMinusUwyO8pc);
                            if (m4176toLongimpl != 0 || m4169getNanosecondsComponentimpl != 0) {
                                long j = now.epochSeconds;
                                long j2 = j + m4176toLongimpl;
                                if ((j ^ j2) >= 0 || (m4176toLongimpl ^ j) < 0) {
                                    int i3 = now.nanosecondsOfSecond + m4169getNanosecondsComponentimpl;
                                    Instant.Companion companion = Instant.Companion;
                                    now = Instant.Companion.fromEpochSeconds(i3, j2);
                                } else {
                                    now = m4179unaryMinusUwyO8pc > 0 ? Instant.MAX : Instant.MIN;
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : topics) {
                                SyncTopic syncTopic = (SyncTopic) obj4;
                                MutableClientSyncCompletionTracker mutableClientSyncCompletionTracker = realClientSyncRequestExecutor.completionTracker;
                                mutableClientSyncCompletionTracker.getClass();
                                syncTopic.getClass();
                                Instant instant = (Instant) mutableClientSyncCompletionTracker.completedSyncTimes.get(syncTopic);
                                if (instant == null || instant.compareTo(now) < 0) {
                                    arrayList.add(obj4);
                                }
                            }
                            topics = CollectionsKt.toSet(arrayList);
                            break;
                        case 0:
                        case 1:
                        case 3:
                        case 4:
                        case 8:
                        case 9:
                            if (topics.isEmpty()) {
                                skipped = new SyncRequestOperation.Result.Skipped(syncRequestOperation);
                                for (ClientSyncRequestObserver clientSyncRequestObserver2 : clientSyncRequestObserverArr) {
                                    clientSyncRequestObserver2.onAfterSyncRequestOperation(skipped);
                                }
                                break;
                            } else {
                                realClientSyncRequestExecutor$executeSyncRequestSynchronously$1.label = 1;
                                Object performFreshSync = realClientSyncRequestExecutor.performFreshSync(syncRequestOperation, topics, realClientSyncRequestExecutor$executeSyncRequestSynchronously$1);
                                obj = performFreshSync;
                                if (performFreshSync == obj3) {
                                }
                            }
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj2);
                obj = obj2;
                skipped = (SyncRequestOperation.Result) obj;
                while (r8 < r1) {
                }
                return skipped;
            }
        }
        realClientSyncRequestExecutor$executeSyncRequestSynchronously$1 = new RealClientSyncRequestExecutor$executeSyncRequestSynchronously$1(realClientSyncRequestExecutor, continuationImpl);
        Object obj22 = realClientSyncRequestExecutor$executeSyncRequestSynchronously$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClientSyncRequestExecutor$executeSyncRequestSynchronously$1.label;
        if (i != 0) {
        }
        skipped = (SyncRequestOperation.Result) obj;
        while (r8 < r1) {
        }
        return skipped;
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestExecutor
    public final Deferred executeSyncRequest(SyncRequestOperation syncRequestOperation) {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        this.queue.mo1159trySendJP2dKIU(new SyncRequestQueueElement(syncRequestOperation, completableDeferredImpl));
        return completableDeferredImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0211 A[LOOP:1: B:22:0x020f->B:23:0x0211, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0246 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef A[LOOP:7: B:84:0x01e9->B:86:0x01ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0061  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0196 -> B:11:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x023a -> B:24:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performFreshSync(SyncRequestOperation syncRequestOperation, Set set, ContinuationImpl continuationImpl) {
        RealClientSyncRequestExecutor$performFreshSync$1 realClientSyncRequestExecutor$performFreshSync$1;
        int i;
        ArrayList arrayList;
        RealClientSyncRequestExecutor$performFreshSync$1 realClientSyncRequestExecutor$performFreshSync$12;
        SyncRequestOperation.Result result;
        SyncRequestOperation syncRequestOperation2;
        Set set2;
        SyncRequestOperation syncRequestOperation3;
        ArrayList arrayList2;
        RealClientSyncRequestExecutor$performFreshSync$1 realClientSyncRequestExecutor$performFreshSync$13;
        GatewayRequest gatewayRequest;
        ClientSyncApiResult clientSyncApiResult;
        ?? legacyRanges;
        GatewayRequest gatewayRequest2;
        if (continuationImpl instanceof RealClientSyncRequestExecutor$performFreshSync$1) {
            realClientSyncRequestExecutor$performFreshSync$1 = (RealClientSyncRequestExecutor$performFreshSync$1) continuationImpl;
            int i2 = realClientSyncRequestExecutor$performFreshSync$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClientSyncRequestExecutor$performFreshSync$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClientSyncRequestExecutor$performFreshSync$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClientSyncRequestExecutor$performFreshSync$1.label;
                ClientSyncRequestObserver[] clientSyncRequestObserverArr = this.syncRequestObservers;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    realClientSyncRequestExecutor$performFreshSync$12 = realClientSyncRequestExecutor$performFreshSync$1;
                    result = null;
                    syncRequestOperation2 = syncRequestOperation;
                    set2 = set;
                    if (result != null) {
                    }
                } else if (i == 1) {
                    gatewayRequest = realClientSyncRequestExecutor$performFreshSync$1.L$6;
                    List list = realClientSyncRequestExecutor$performFreshSync$1.L$3;
                    result = realClientSyncRequestExecutor$performFreshSync$1.L$2;
                    Set set3 = realClientSyncRequestExecutor$performFreshSync$1.L$1;
                    syncRequestOperation3 = realClientSyncRequestExecutor$performFreshSync$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realClientSyncRequestExecutor$performFreshSync$13 = realClientSyncRequestExecutor$performFreshSync$1;
                    set2 = set3;
                    arrayList2 = list;
                    clientSyncApiResult = (ClientSyncApiResult) obj;
                    if (clientSyncApiResult instanceof ClientSyncApiResult.Success) {
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ClientSyncApiResult.Success success = realClientSyncRequestExecutor$performFreshSync$1.L$7;
                    List list2 = realClientSyncRequestExecutor$performFreshSync$1.L$3;
                    result = realClientSyncRequestExecutor$performFreshSync$1.L$2;
                    Set set4 = realClientSyncRequestExecutor$performFreshSync$1.L$1;
                    syncRequestOperation3 = realClientSyncRequestExecutor$performFreshSync$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ClientSyncApiResult clientSyncApiResult2 = success;
                    char c = 2;
                    RealClientSyncRequestExecutor$performFreshSync$1 realClientSyncRequestExecutor$performFreshSync$14 = realClientSyncRequestExecutor$performFreshSync$1;
                    set2 = set4;
                    ArrayList arrayList3 = list2;
                    arrayList3.add((SyncResponseOperation.Result) obj);
                    ClientSyncApiResult.Success success2 = (ClientSyncApiResult.Success) clientSyncApiResult2;
                    ServerSyncResponse serverSyncResponse = (ServerSyncResponse) success2.getResponse();
                    if (serverSyncResponse instanceof GatewayResponse) {
                        List topicResponses = ((GatewayResponse) serverSyncResponse).getTopicResponses();
                        if (!topicResponses.isEmpty()) {
                            Iterator it = topicResponses.iterator();
                            while (it.hasNext()) {
                                if (((GatewayTopicResponse) it.next()).getHasMore()) {
                                    break;
                                }
                            }
                        }
                    } else if (!(serverSyncResponse instanceof ClientSyncResponseContext)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Instant now = this.clock.now();
                    Iterator it2 = ((GatewayResponse) success2.getResponse()).getTopicResponses().iterator();
                    while (it2.hasNext()) {
                        SyncTopic topic = ((GatewayTopicResponse) it2.next()).getTopic();
                        MutableClientSyncCompletionTracker mutableClientSyncCompletionTracker = this.completionTracker;
                        mutableClientSyncCompletionTracker.getClass();
                        now.getClass();
                        mutableClientSyncCompletionTracker.completedSyncTimes.put(topic, now);
                    }
                    result = new SyncRequestOperation.Result.Success(syncRequestOperation3, arrayList3);
                    for (ClientSyncRequestObserver clientSyncRequestObserver : clientSyncRequestObserverArr) {
                        clientSyncRequestObserver.onAfterSyncRequestPage(syncRequestOperation3);
                    }
                    arrayList = arrayList3;
                    syncRequestOperation2 = syncRequestOperation3;
                    realClientSyncRequestExecutor$performFreshSync$12 = realClientSyncRequestExecutor$performFreshSync$14;
                    if (result != null) {
                        for (ClientSyncRequestObserver clientSyncRequestObserver2 : clientSyncRequestObserverArr) {
                            clientSyncRequestObserver2.onBeforeSyncRequestPage(syncRequestOperation2);
                        }
                        List allRanges = this.syncRangeStore.getAllRanges();
                        List list3 = allRanges;
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                        for (Object obj2 : list3) {
                            linkedHashMap.put(((SyncRange) obj2).getTopic(), obj2);
                        }
                        if (linkedHashMap.containsKey(SyncTopic.UNKNOWN)) {
                            gatewayRequest2 = new GatewayRequest(EmptyList.INSTANCE, allRanges);
                        } else {
                            Set<SyncTopic> set5 = set2;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set5, 10));
                            for (SyncTopic syncTopic : set5) {
                                arrayList4.add(new GatewayTopicRequest(syncTopic, (SyncRange) linkedHashMap.get(syncTopic), syncRequestOperation2.trigger));
                            }
                            gatewayRequest2 = new GatewayRequest(arrayList4, EmptyList.INSTANCE);
                        }
                        realClientSyncRequestExecutor$performFreshSync$12.L$0 = syncRequestOperation2;
                        realClientSyncRequestExecutor$performFreshSync$12.L$1 = set2;
                        realClientSyncRequestExecutor$performFreshSync$12.L$2 = result;
                        realClientSyncRequestExecutor$performFreshSync$12.L$3 = arrayList;
                        realClientSyncRequestExecutor$performFreshSync$12.L$6 = gatewayRequest2;
                        realClientSyncRequestExecutor$performFreshSync$12.L$7 = null;
                        realClientSyncRequestExecutor$performFreshSync$12.label = 1;
                        Object syncEntitiesWithRetries = GatewayServiceKt.getSyncEntitiesWithRetries(this.gatewayService, gatewayRequest2, realClientSyncRequestExecutor$performFreshSync$12);
                        if (syncEntitiesWithRetries != coroutineSingletons) {
                            RealClientSyncRequestExecutor$performFreshSync$1 realClientSyncRequestExecutor$performFreshSync$15 = realClientSyncRequestExecutor$performFreshSync$12;
                            arrayList2 = arrayList;
                            gatewayRequest = gatewayRequest2;
                            realClientSyncRequestExecutor$performFreshSync$13 = realClientSyncRequestExecutor$performFreshSync$15;
                            syncRequestOperation3 = syncRequestOperation2;
                            obj = syncEntitiesWithRetries;
                            clientSyncApiResult = (ClientSyncApiResult) obj;
                            if (clientSyncApiResult instanceof ClientSyncApiResult.Success) {
                                TaskId taskId = syncRequestOperation3.taskId;
                                if (gatewayRequest.getTopicRequests().isEmpty()) {
                                    legacyRanges = gatewayRequest.getLegacyRanges();
                                } else {
                                    List topicRequests = gatewayRequest.getTopicRequests();
                                    legacyRanges = new ArrayList();
                                    Iterator it3 = topicRequests.iterator();
                                    while (it3.hasNext()) {
                                        SyncRange range = ((GatewayTopicRequest) it3.next()).getRange();
                                        if (range != null) {
                                            legacyRanges.add(range);
                                        }
                                    }
                                }
                                ClientSyncApiResult.Success success3 = (ClientSyncApiResult.Success) clientSyncApiResult;
                                CompletableDeferredImpl processSyncResponse = this.responseProcessor.processSyncResponse(new SyncResponseOperation(taskId, new SyncResponseOperation.Origin.FromSyncRequest(legacyRanges), (ServerSyncResponse) success3.getResponse()));
                                realClientSyncRequestExecutor$performFreshSync$13.L$0 = syncRequestOperation3;
                                realClientSyncRequestExecutor$performFreshSync$13.L$1 = set2;
                                realClientSyncRequestExecutor$performFreshSync$13.L$2 = result;
                                realClientSyncRequestExecutor$performFreshSync$13.L$3 = arrayList2;
                                realClientSyncRequestExecutor$performFreshSync$13.L$6 = null;
                                realClientSyncRequestExecutor$performFreshSync$13.L$7 = success3;
                                c = 2;
                                realClientSyncRequestExecutor$performFreshSync$13.label = 2;
                                Object awaitInternal = processSyncResponse.awaitInternal(realClientSyncRequestExecutor$performFreshSync$13);
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (awaitInternal != coroutineSingletons) {
                                    RealClientSyncRequestExecutor$performFreshSync$1 realClientSyncRequestExecutor$performFreshSync$16 = realClientSyncRequestExecutor$performFreshSync$13;
                                    clientSyncApiResult2 = clientSyncApiResult;
                                    obj = awaitInternal;
                                    realClientSyncRequestExecutor$performFreshSync$14 = realClientSyncRequestExecutor$performFreshSync$16;
                                    arrayList3 = arrayList2;
                                    arrayList3.add((SyncResponseOperation.Result) obj);
                                    ClientSyncApiResult.Success success22 = (ClientSyncApiResult.Success) clientSyncApiResult2;
                                    ServerSyncResponse serverSyncResponse2 = (ServerSyncResponse) success22.getResponse();
                                    if (serverSyncResponse2 instanceof GatewayResponse) {
                                    }
                                    Instant now2 = this.clock.now();
                                    Iterator it22 = ((GatewayResponse) success22.getResponse()).getTopicResponses().iterator();
                                    while (it22.hasNext()) {
                                    }
                                    result = new SyncRequestOperation.Result.Success(syncRequestOperation3, arrayList3);
                                    while (r5 < r1) {
                                    }
                                    arrayList = arrayList3;
                                    syncRequestOperation2 = syncRequestOperation3;
                                    realClientSyncRequestExecutor$performFreshSync$12 = realClientSyncRequestExecutor$performFreshSync$14;
                                    if (result != null) {
                                    }
                                }
                            } else {
                                if (!(clientSyncApiResult instanceof ClientSyncApiResult.Failure)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                result = new SyncRequestOperation.Result.Failure(syncRequestOperation3, arrayList2);
                                for (ClientSyncRequestObserver clientSyncRequestObserver3 : clientSyncRequestObserverArr) {
                                    clientSyncRequestObserver3.onSyncRequestPageFailure(syncRequestOperation3);
                                }
                                arrayList = arrayList2;
                                realClientSyncRequestExecutor$performFreshSync$12 = realClientSyncRequestExecutor$performFreshSync$13;
                                syncRequestOperation2 = syncRequestOperation3;
                                if (result != null) {
                                    return result;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        realClientSyncRequestExecutor$performFreshSync$1 = new RealClientSyncRequestExecutor$performFreshSync$1(this, continuationImpl);
        Object obj3 = realClientSyncRequestExecutor$performFreshSync$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClientSyncRequestExecutor$performFreshSync$1.label;
        ClientSyncRequestObserver[] clientSyncRequestObserverArr2 = this.syncRequestObservers;
        if (i != 0) {
        }
    }
}
