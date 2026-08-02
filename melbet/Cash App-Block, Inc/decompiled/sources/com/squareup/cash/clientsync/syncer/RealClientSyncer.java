package com.squareup.cash.clientsync.syncer;

import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.ClientSyncRequestExecutor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchExecutor;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.pipeline.TaskIdGenerator;
import com.squareup.cash.clientsync.util.coroutines.ClientSyncDispatchers;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;

/* loaded from: classes.dex */
public final class RealClientSyncer {
    public final CoroutineScope coroutineScope;
    public final CoroutineDispatcher ioDispatcher;
    public final ClientSyncRequestExecutor requestExecutor;
    public final RealClientSyncStorageOperationBatchExecutor storageOperationBatchExecutor;
    public final TaskIdGenerator taskIdGenerator;

    public RealClientSyncer(CoroutineScope coroutineScope, ClientSyncRequestExecutor clientSyncRequestExecutor, RealClientSyncStorageOperationBatchExecutor realClientSyncStorageOperationBatchExecutor, TaskIdGenerator taskIdGenerator) {
        DefaultIoScheduler defaultIoScheduler = ClientSyncDispatchers.IO;
        defaultIoScheduler.getClass();
        this.coroutineScope = coroutineScope;
        this.requestExecutor = clientSyncRequestExecutor;
        this.storageOperationBatchExecutor = realClientSyncStorageOperationBatchExecutor;
        this.taskIdGenerator = taskIdGenerator;
        this.ioDispatcher = defaultIoScheduler;
    }

    public final CompletableDeferredImpl reset(ResetTrigger resetTrigger) {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        JobKt.launch$default(this.coroutineScope, this.ioDispatcher, null, new SetNameViewKt$SetName$2$1(this, resetTrigger, completableDeferredImpl, (Continuation) null, 25), 2);
        return completableDeferredImpl;
    }

    public final CompletableDeferredImpl sync(SyncTrigger syncTrigger, SyncScope syncScope) {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        JobKt.launch$default(this.coroutineScope, null, null, new FlowQuery$asFlow$1(this, syncTrigger, syncScope, completableDeferredImpl, null, 8), 3);
        return completableDeferredImpl;
    }

    public final CompletableDeferredImpl sync(SyncTrigger syncTrigger, Set set) {
        set.getClass();
        return sync(syncTrigger, new SyncScope.Topics(set));
    }
}
