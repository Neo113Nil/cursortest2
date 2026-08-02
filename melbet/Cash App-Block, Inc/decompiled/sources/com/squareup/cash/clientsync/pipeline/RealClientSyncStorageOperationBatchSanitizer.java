package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.models.SyncEntity;

/* loaded from: classes.dex */
public final class RealClientSyncStorageOperationBatchSanitizer {
    public static String getKey(SyncEntity syncEntity) {
        return syncEntity.getEntityId() + ":" + syncEntity.getEntityType();
    }
}
