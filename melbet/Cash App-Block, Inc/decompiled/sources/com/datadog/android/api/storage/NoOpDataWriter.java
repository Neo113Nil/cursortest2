package com.datadog.android.api.storage;

/* loaded from: classes4.dex */
public final class NoOpDataWriter implements DataWriter {
    @Override // com.datadog.android.api.storage.DataWriter
    public final boolean write(EventBatchWriter eventBatchWriter, Object obj, int i) {
        eventBatchWriter.getClass();
        if (i != 0) {
            return false;
        }
        throw null;
    }
}
