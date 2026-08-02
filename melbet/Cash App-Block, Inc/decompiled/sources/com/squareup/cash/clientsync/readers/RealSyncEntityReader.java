package com.squareup.cash.clientsync.readers;

import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class RealSyncEntityReader {
    public final RealClientSyncEntityDecryptor entityDecryptor;
    public final SyncEntityStore entityStore;

    public RealSyncEntityReader(RealClientSyncEntityDecryptor realClientSyncEntityDecryptor, SyncEntityStore syncEntityStore) {
        this.entityDecryptor = realClientSyncEntityDecryptor;
        this.entityStore = syncEntityStore;
    }

    public final Flow getAllEntitiesFlow(AndroidSyncEntitySpecs$Payment$1 androidSyncEntitySpecs$Payment$1) {
        return FlowKt.distinctUntilChanged(new RealActivityInvitePresenter(9, this.entityStore.getAllEntitiesOfTypeFlow(androidSyncEntitySpecs$Payment$1.entityType), androidSyncEntitySpecs$Payment$1, this));
    }
}
