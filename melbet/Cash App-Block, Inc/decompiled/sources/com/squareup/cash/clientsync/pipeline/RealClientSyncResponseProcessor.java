package com.squareup.cash.clientsync.pipeline;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.util.coroutines.ClientSyncDispatchers;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.util.compose.ModifierKt;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealClientSyncResponseProcessor {
    public final CoroutineDispatcher ioDispatcher;
    public final BufferedChannel queue;
    public final RealClientSyncStorageOperationBatchExecutor storageOperationBatchExecutor;
    public final RealClientSyncStorageOperationBatchSanitizer storageOperationBatchSanitizer;
    public final ClientSyncResponseObserver[] syncResponseObservers;

    /* loaded from: classes6.dex */
    public final class SyncResponseQueueElement {
        public final SyncResponseOperation syncResponseOperation;
        public final CompletableDeferredImpl syncResponseOperationResult;

        public SyncResponseQueueElement(SyncResponseOperation syncResponseOperation, CompletableDeferredImpl completableDeferredImpl) {
            this.syncResponseOperation = syncResponseOperation;
            this.syncResponseOperationResult = completableDeferredImpl;
        }

        public final SyncResponseOperation component1() {
            return this.syncResponseOperation;
        }

        public final CompletableDeferred component2() {
            return this.syncResponseOperationResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SyncResponseQueueElement) {
                SyncResponseQueueElement syncResponseQueueElement = (SyncResponseQueueElement) obj;
                return this.syncResponseOperation.equals(syncResponseQueueElement.syncResponseOperation) && this.syncResponseOperationResult == syncResponseQueueElement.syncResponseOperationResult;
            }
            return false;
        }

        public final int hashCode() {
            return this.syncResponseOperationResult.hashCode() + (this.syncResponseOperation.hashCode() * 31);
        }

        public final String toString() {
            return "SyncResponseQueueElement(syncResponseOperation=" + this.syncResponseOperation + ", syncResponseOperationResult=" + this.syncResponseOperationResult + ")";
        }
    }

    public RealClientSyncResponseProcessor(CoroutineScope coroutineScope, RealClientSyncStorageOperationBatchSanitizer realClientSyncStorageOperationBatchSanitizer, RealClientSyncStorageOperationBatchExecutor realClientSyncStorageOperationBatchExecutor, List list) {
        DefaultIoScheduler defaultIoScheduler = ClientSyncDispatchers.IO;
        list.getClass();
        defaultIoScheduler.getClass();
        this.storageOperationBatchSanitizer = realClientSyncStorageOperationBatchSanitizer;
        this.storageOperationBatchExecutor = realClientSyncStorageOperationBatchExecutor;
        this.ioDispatcher = defaultIoScheduler;
        this.syncResponseObservers = (ClientSyncResponseObserver[]) list.toArray(new ClientSyncResponseObserver[0]);
        BufferedChannel Channel$default = PapaEvent.Channel$default(-2, null, null, 6);
        JobKt.launch$default(coroutineScope, null, null, new RealBoostSelector.AnonymousClass1(Channel$default, this, null, 4), 3);
        this.queue = Channel$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070 A[LOOP:0: B:11:0x006e->B:12:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processSyncResponseSynchronously(RealClientSyncResponseProcessor realClientSyncResponseProcessor, SyncResponseOperation syncResponseOperation, ContinuationImpl continuationImpl) {
        RealClientSyncResponseProcessor$processSyncResponseSynchronously$1 realClientSyncResponseProcessor$processSyncResponseSynchronously$1;
        int i;
        ClientSyncResponseObserver[] clientSyncResponseObserverArr = realClientSyncResponseProcessor.syncResponseObservers;
        if (continuationImpl instanceof RealClientSyncResponseProcessor$processSyncResponseSynchronously$1) {
            realClientSyncResponseProcessor$processSyncResponseSynchronously$1 = (RealClientSyncResponseProcessor$processSyncResponseSynchronously$1) continuationImpl;
            int i2 = realClientSyncResponseProcessor$processSyncResponseSynchronously$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClientSyncResponseProcessor$processSyncResponseSynchronously$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClientSyncResponseProcessor$processSyncResponseSynchronously$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClientSyncResponseProcessor$processSyncResponseSynchronously$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    for (ClientSyncResponseObserver clientSyncResponseObserver : clientSyncResponseObserverArr) {
                        clientSyncResponseObserver.onBeforeSyncResponseOperation(syncResponseOperation);
                    }
                    StorageOperationBatch createStorageOperationBatch = ModifierKt.createStorageOperationBatch(syncResponseOperation.getTaskId(), syncResponseOperation.getOrigin(), syncResponseOperation.getResponse());
                    CoroutineDispatcher coroutineDispatcher = realClientSyncResponseProcessor.ioDispatcher;
                    RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(realClientSyncResponseProcessor, createStorageOperationBatch, continuation, 8);
                    realClientSyncResponseProcessor$processSyncResponseSynchronously$1.L$2 = syncResponseOperation;
                    realClientSyncResponseProcessor$processSyncResponseSynchronously$1.label = 1;
                    obj = JobKt.withContext(coroutineDispatcher, realAppConfigManager$update$2$2, realClientSyncResponseProcessor$processSyncResponseSynchronously$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    syncResponseOperation = realClientSyncResponseProcessor$processSyncResponseSynchronously$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                SyncResponseOperation.Result result = new SyncResponseOperation.Result(syncResponseOperation, (List) obj);
                for (ClientSyncResponseObserver clientSyncResponseObserver2 : clientSyncResponseObserverArr) {
                    clientSyncResponseObserver2.onAfterSyncResponseOperation(result);
                }
                return result;
            }
        }
        realClientSyncResponseProcessor$processSyncResponseSynchronously$1 = new RealClientSyncResponseProcessor$processSyncResponseSynchronously$1(realClientSyncResponseProcessor, continuationImpl);
        Object obj2 = realClientSyncResponseProcessor$processSyncResponseSynchronously$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClientSyncResponseProcessor$processSyncResponseSynchronously$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        SyncResponseOperation.Result result2 = new SyncResponseOperation.Result(syncResponseOperation, (List) obj2);
        while (r4 < r10) {
        }
        return result2;
    }

    public final CompletableDeferredImpl processSyncResponse(SyncResponseOperation syncResponseOperation) {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        this.queue.mo1159trySendJP2dKIU(new SyncResponseQueueElement(syncResponseOperation, completableDeferredImpl));
        return completableDeferredImpl;
    }
}
