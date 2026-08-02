package com.squareup.cash.clientsync.network;

import com.squareup.cash.api.ResponseContextProcessor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.pipeline.TaskIdGenerator;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.util.android.Uris;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class RealClientSyncResponseContextProcessor implements ResponseContextProcessor {
    public final RealClientSyncResponseProcessor responseProcessor;
    public final TaskIdGenerator taskIdGenerator;

    public RealClientSyncResponseContextProcessor(RealClientSyncResponseProcessor realClientSyncResponseProcessor, TaskIdGenerator taskIdGenerator) {
        this.responseProcessor = realClientSyncResponseProcessor;
        this.taskIdGenerator = taskIdGenerator;
    }

    @Override // com.squareup.cash.api.ResponseContextProcessor
    public final Object processResponseContext(RequestContext requestContext, ResponseContext responseContext, String str, ContinuationImpl continuationImpl) {
        SyncEntitiesResponse syncEntitiesResponse = responseContext.sync_entities_data;
        if (syncEntitiesResponse == null) {
            return Unit.INSTANCE;
        }
        this.responseProcessor.processSyncResponse(new SyncResponseOperation(this.taskIdGenerator.nextTaskId(str), SyncResponseOperation.Origin.FromResponseContext.INSTANCE, Uris.toMultiplatform(SyncEntitiesResponse.copy$default(syncEntitiesResponse, null, null, 239))));
        return Unit.INSTANCE;
    }
}
