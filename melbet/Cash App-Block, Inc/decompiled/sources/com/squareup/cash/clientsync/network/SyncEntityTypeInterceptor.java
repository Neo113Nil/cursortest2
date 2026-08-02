package com.squareup.cash.clientsync.network;

import app.cash.api.ApiResult;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.pipeline.TaskIdGenerator;
import com.squareup.protos.cash.portfolios.GetPortfoliosPerformanceResponse;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosPerformanceValue;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncEntityType;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.util.android.Uris;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncEntityTypeInterceptor {
    public final Lazy responseProcessor;
    public final TaskIdGenerator taskIdGenerator;

    public SyncEntityTypeInterceptor(Lazy lazy, TaskIdGenerator taskIdGenerator) {
        this.responseProcessor = lazy;
        this.taskIdGenerator = taskIdGenerator;
    }

    public final void interceptApiResult(Class cls, ApiResult apiResult) {
        cls.getClass();
        apiResult.getClass();
        if (apiResult instanceof ApiResult.Success) {
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            EmptyList emptyList = EmptyList.INSTANCE;
            ByteString byteString = ByteString.EMPTY;
            SyncEntitiesResponse syncEntitiesResponse = new SyncEntitiesResponse(emptyList, bool, null, emptyList, bool2, null, bool2, byteString);
            Object obj = ((ApiResult.Success) apiResult).response;
            SyncEntitiesResponse syncEntitiesResponse2 = null;
            if (obj instanceof GetPortfoliosPerformanceResponse) {
                GetPortfoliosPerformanceResponse getPortfoliosPerformanceResponse = (GetPortfoliosPerformanceResponse) obj;
                PortfoliosPerformanceValue portfoliosPerformanceValue = getPortfoliosPerformanceResponse.portfolios_performance_value;
                Long l = getPortfoliosPerformanceResponse.version;
                String str = getPortfoliosPerformanceResponse.entity_id;
                if (portfoliosPerformanceValue != null && str != null) {
                    SyncEntityType syncEntityType = SyncEntityType.SYNC_VALUE;
                    UiAlias.Type.Companion companion = SyncValueType.Companion;
                    syncEntitiesResponse2 = SyncEntitiesResponse.copy$default(syncEntitiesResponse, CollectionsKt__CollectionsJVMKt.listOf(new SyncEntity(syncEntityType, str, l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SyncValue(new SyncValue.Value.InvestPortfoliosPerformance(portfoliosPerformanceValue)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, byteString)), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                }
            }
            if (syncEntitiesResponse2 != null) {
                ((RealClientSyncResponseProcessor) this.responseProcessor.getValue()).processSyncResponse(new SyncResponseOperation(this.taskIdGenerator.nextTaskId(cls.getSimpleName()), SyncResponseOperation.Origin.FromResponseContext.INSTANCE, Uris.toMultiplatform(syncEntitiesResponse2)));
            }
        }
    }
}
