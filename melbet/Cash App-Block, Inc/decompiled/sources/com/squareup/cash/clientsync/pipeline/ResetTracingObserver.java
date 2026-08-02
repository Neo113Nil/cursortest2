package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver;
import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.telemetry.RealClientSyncSpan;
import com.squareup.cash.clientsync.telemetry.RealClientSyncTracer;
import com.squareup.cash.clientsync.telemetry.SpanResult;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.compose.ResourcesKt;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ResetTracingObserver extends ClientSyncStorageObserver.Typed {
    public final LinkedHashMap spans = new LinkedHashMap();
    public final RealClientSyncTracer tracer;

    public ResetTracingObserver(RealClientSyncTracer realClientSyncTracer) {
        this.tracer = realClientSyncTracer;
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onAfterDeleteAllRangesAndEntities(DeleteAllRangesAndEntities.Result result) {
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.spans.remove(result.getStorageOperation().getTaskId());
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.Success);
            realClientSyncSpan.stop();
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onBeforeDeleteAllRangesAndEntities(DeleteAllRangesAndEntities deleteAllRangesAndEntities) {
        deleteAllRangesAndEntities.getClass();
        TaskId taskId = deleteAllRangesAndEntities.getTaskId();
        LinkedHashMap linkedHashMap = this.spans;
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) linkedHashMap.remove(taskId);
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.Canceled);
            realClientSyncSpan.stop();
        }
        RealClientSyncSpan start = this.tracer.start("client_sync_clearData", null);
        start.setAttribute("clear_reason", StringsKt.getAttributeValue(deleteAllRangesAndEntities.getTrigger()));
        linkedHashMap.put(taskId, start);
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onDeleteAllRangesAndEntitiesFailure(DeleteAllRangesAndEntities deleteAllRangesAndEntities, Throwable th) {
        deleteAllRangesAndEntities.getClass();
        RealClientSyncSpan realClientSyncSpan = (RealClientSyncSpan) this.spans.remove(deleteAllRangesAndEntities.getTaskId());
        if (realClientSyncSpan != null) {
            ResourcesKt.setResult(realClientSyncSpan, SpanResult.PersistenceFailure);
            realClientSyncSpan.stop();
        }
    }
}
