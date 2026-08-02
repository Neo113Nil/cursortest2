package com.datadog.android.core.internal.persistence;

import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.RawBatchEvent;

/* loaded from: classes4.dex */
public final class NoOpEventBatchWriter implements EventBatchWriter {
    @Override // com.datadog.android.api.storage.EventBatchWriter
    public final boolean write(RawBatchEvent rawBatchEvent, int i) {
        if (i != 0) {
            return true;
        }
        throw null;
    }
}
