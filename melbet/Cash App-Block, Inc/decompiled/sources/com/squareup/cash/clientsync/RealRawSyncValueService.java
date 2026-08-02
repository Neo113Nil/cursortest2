package com.squareup.cash.clientsync;

import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.cash.integration.contacts.RealContactBook$getAliases$$inlined$map$1;
import com.squareup.cash.treehouse.sync.RawSyncValueService;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class RealRawSyncValueService implements RawSyncValueService {
    public final CoroutineContext computationDispatcher;
    public final RealClientSyncEntityDecryptor decryptor;
    public final SyncEntityStore syncEntityStore;

    public RealRawSyncValueService(SyncEntityStore syncEntityStore, RealClientSyncEntityDecryptor realClientSyncEntityDecryptor, CoroutineContext coroutineContext) {
        this.syncEntityStore = syncEntityStore;
        this.decryptor = realClientSyncEntityDecryptor;
        this.computationDispatcher = coroutineContext;
    }

    @Override // com.squareup.cash.treehouse.sync.RawSyncValueService
    public final Flow encodedAllSyncValues() {
        return FlowKt.flowOn(new RealTransferManager$addCash$$inlined$map$1(this.syncEntityStore.getAllEntitiesOfTypeFlow(SyncEntityType.SYNC_VALUE), this, 13), this.computationDispatcher);
    }

    @Override // com.squareup.cash.treehouse.sync.RawSyncValueService
    public final Flow getSyncValues(int i) {
        return FlowKt.flowOn(new RealTransferManager$addCash$$inlined$map$1(new RealContactBook$getAliases$$inlined$map$1(this.syncEntityStore.getAllEntitiesOfTypeFlow(SyncEntityType.SYNC_VALUE), i, 1), this, 13), this.computationDispatcher);
    }
}
