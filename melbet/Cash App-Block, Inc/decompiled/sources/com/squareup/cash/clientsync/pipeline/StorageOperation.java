package com.squareup.cash.clientsync.pipeline;

/* loaded from: classes6.dex */
public interface StorageOperation {

    public interface Result {
        StorageOperation getStorageOperation();
    }

    TaskId getTaskId();
}
