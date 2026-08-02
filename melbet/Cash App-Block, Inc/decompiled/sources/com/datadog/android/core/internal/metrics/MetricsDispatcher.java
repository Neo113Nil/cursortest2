package com.datadog.android.core.internal.metrics;

import java.io.File;

/* loaded from: classes4.dex */
public interface MetricsDispatcher {
    void sendBatchClosedMetric(File file, BatchClosedMetadata batchClosedMetadata);

    void sendBatchDeletedMetric(File file, RemovalReason removalReason, int i);
}
