package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.internal.metrics.RemovalReason;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public interface Storage {
    void confirmBatchRead(BatchId batchId, RemovalReason removalReason, boolean z);

    Function1 getEventWriteScope(DatadogContext datadogContext);

    BatchData readNextBatch();
}
