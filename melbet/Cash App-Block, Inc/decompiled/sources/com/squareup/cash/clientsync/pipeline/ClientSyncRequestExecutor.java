package com.squareup.cash.clientsync.pipeline;

import kotlinx.coroutines.Deferred;

/* loaded from: classes.dex */
public interface ClientSyncRequestExecutor {
    Deferred executeSyncRequest(SyncRequestOperation syncRequestOperation);
}
