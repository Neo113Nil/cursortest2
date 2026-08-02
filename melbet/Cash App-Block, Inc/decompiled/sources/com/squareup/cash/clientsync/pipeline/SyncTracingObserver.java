package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.telemetry.RealClientSyncSpan;
import com.squareup.cash.clientsync.telemetry.RealClientSyncTracer;
import com.squareup.cash.clientsync.telemetry.SpanResult;
import com.squareup.util.compose.MotionKt;
import com.squareup.util.compose.ResourcesKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes.dex */
public final class SyncTracingObserver implements ClientSyncRequestObserver, ClientSyncResponseObserver, ClientSyncStorageObserver {
    public final RealClientSyncTracer tracer;
    public final LinkedHashMap syncSpans = new LinkedHashMap();
    public final LinkedHashMap pageSpans = new LinkedHashMap();

    public SyncTracingObserver(RealClientSyncTracer realClientSyncTracer) {
        this.tracer = realClientSyncTracer;
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestOperation(SyncRequestOperation.Result result) {
        SpanResult spanResult;
        result.getClass();
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.syncSpans.remove(result.getSyncRequestOperation().taskId);
        if (realClientSyncSpan != null) {
            realClientSyncSpan.setAttribute("is_full_sync", String.valueOf(MotionKt.access$isFullSync(result)));
            if (result instanceof SyncRequestOperation.Result.Success) {
                spanResult = SpanResult.Success;
            } else if (result instanceof SyncRequestOperation.Result.Skipped) {
                spanResult = SpanResult.Skipped;
            } else {
                if (!(result instanceof SyncRequestOperation.Result.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                spanResult = SpanResult.RequestFailure;
            }
            ResourcesKt.setResult(realClientSyncSpan, spanResult);
            realClientSyncSpan.stop();
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.pageSpans.remove(syncRequestOperation.taskId);
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.Success);
            realClientSyncSpan.stop();
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncResponseObserver
    public final void onAfterSyncResponseOperation(SyncResponseOperation.Result result) {
        SyncResponseOperation.Origin origin = result.getSyncResponseOperation().getOrigin();
        if (origin instanceof SyncResponseOperation.Origin.FromSyncRequest) {
            return;
        }
        if (!(origin instanceof SyncResponseOperation.Origin.FromResponseContext)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TaskId taskId = result.getSyncResponseOperation().getTaskId();
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.pageSpans.remove(taskId);
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.Success);
            realClientSyncSpan.stop();
        }
        RealClientSyncSpan realClientSyncSpan2 = (RealClientSyncSpan) this.syncSpans.remove(taskId);
        if (realClientSyncSpan2 != null) {
            ResourcesKt.setResult(realClientSyncSpan2, SpanResult.Success);
            realClientSyncSpan2.stop();
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestOperation(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
        TaskId taskId = syncRequestOperation.taskId;
        LinkedHashMap linkedHashMap = this.syncSpans;
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) linkedHashMap.get(taskId);
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.Canceled);
            realClientSyncSpan.stop();
        }
        RealClientSyncSpan start = this.tracer.start("client_sync_processSync", null);
        start.setAttribute("start_event", "trigger");
        start.setAttribute("trigger_type", syncRequestOperation.trigger.name());
        SyncScope syncScope = syncRequestOperation.scope;
        if (!(syncScope instanceof SyncScope.Global)) {
            if (!(syncScope instanceof SyncScope.Topics)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Set topics = ((SyncScope.Topics) syncScope).getTopics();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(topics, 10));
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((SyncTopic) it.next()).value));
            }
            start.setAttribute("sync_topics", CollectionsKt.joinToString$default(CollectionsKt.sorted(arrayList), null, null, null, 0, null, null, 63));
        }
        linkedHashMap.put(taskId, start);
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
        TaskId taskId = syncRequestOperation.taskId;
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.syncSpans.get(taskId);
        if (realClientSyncSpan != null) {
            LinkedHashMap linkedHashMap = this.pageSpans;
            RealClientSyncSpan realClientSyncSpan2 = (RealClientSyncSpan) linkedHashMap.get(taskId);
            if (realClientSyncSpan2 != null) {
                ResourcesKt.setResult(realClientSyncSpan2, SpanResult.Canceled);
                realClientSyncSpan2.stop();
            }
            linkedHashMap.put(taskId, this.tracer.start("client_sync_processSyncPage", realClientSyncSpan));
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncResponseObserver
    public final void onBeforeSyncResponseOperation(SyncResponseOperation syncResponseOperation) {
        syncResponseOperation.getClass();
        SyncResponseOperation.Origin origin = syncResponseOperation.getOrigin();
        if (origin instanceof SyncResponseOperation.Origin.FromSyncRequest) {
            return;
        }
        if (!(origin instanceof SyncResponseOperation.Origin.FromResponseContext)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TaskId taskId = syncResponseOperation.getTaskId();
        RealClientSyncTracer realClientSyncTracer = this.tracer;
        RealClientSyncSpan start = realClientSyncTracer.start("client_sync_processSync", null);
        start.setAttribute("start_event", "response_context");
        RealClientSyncSpan start2 = realClientSyncTracer.start("client_sync_processSyncPage", start);
        LinkedHashMap linkedHashMap = this.syncSpans;
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) linkedHashMap.get(taskId);
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.Canceled);
            realClientSyncSpan.stop();
        }
        linkedHashMap.put(taskId, start);
        LinkedHashMap linkedHashMap2 = this.pageSpans;
        RealClientSyncSpan realClientSyncSpan2 = (RealClientSyncSpan) linkedHashMap2.get(taskId);
        if (realClientSyncSpan2 != null) {
            ResourcesKt.setResult(realClientSyncSpan2, SpanResult.Canceled);
            realClientSyncSpan2.stop();
        }
        linkedHashMap2.put(taskId, start2);
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver
    public final void onStorageOperationFailure(StorageOperation storageOperation, Throwable th) {
        storageOperation.getClass();
        TaskId taskId = storageOperation.getTaskId();
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.pageSpans.remove(taskId);
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.PersistenceFailure);
            realClientSyncSpan.stop();
        }
        RealClientSyncSpan realClientSyncSpan2 = (RealClientSyncSpan) this.syncSpans.remove(taskId);
        if (realClientSyncSpan2 != null) {
            ResourcesKt.setResult(realClientSyncSpan2, SpanResult.PersistenceFailure);
            realClientSyncSpan2.stop();
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onSyncRequestPageFailure(SyncRequestOperation syncRequestOperation) {
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.pageSpans.remove(syncRequestOperation.taskId);
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.RequestFailure);
            realClientSyncSpan.stop();
        }
    }
}
