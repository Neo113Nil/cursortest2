package com.squareup.cash.clientsync.persistence;

import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public final class FlaggedSyncRangeStore implements SyncRangeStore {
    public final KeysetHandle auditLog;
    public final SqlComponentMigrationStore componentMigrationStore;
    public final Lazy delegate$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 13));
    public final RealClientSyncErrorReporter errorReporter;
    public final RealClientSyncFlags flags;
    public final RealClientSyncLogger logger;
    public final SyncRangeStore multiplatformStore;
    public final SyncRangeStore nativeStore;
    public final ClientSyncTransactor transactor;

    public FlaggedSyncRangeStore(SyncRangeStore syncRangeStore, SyncRangeStore syncRangeStore2, SqlComponentMigrationStore sqlComponentMigrationStore, KeysetHandle keysetHandle, RealClientSyncErrorReporter realClientSyncErrorReporter, RealClientSyncFlags realClientSyncFlags, RealClientSyncLogger realClientSyncLogger, ClientSyncTransactor clientSyncTransactor) {
        this.nativeStore = syncRangeStore;
        this.multiplatformStore = syncRangeStore2;
        this.componentMigrationStore = sqlComponentMigrationStore;
        this.auditLog = keysetHandle;
        this.errorReporter = realClientSyncErrorReporter;
        this.flags = realClientSyncFlags;
        this.logger = realClientSyncLogger;
        this.transactor = clientSyncTransactor;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final long deleteAllRanges() {
        return ((SyncRangeStore) this.delegate$delegate.getValue()).deleteAllRanges();
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final List getAllRanges() {
        return ((SyncRangeStore) this.delegate$delegate.getValue()).getAllRanges();
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final void replaceRanges(List list, List list2) {
        list.getClass();
        list2.getClass();
        ((SyncRangeStore) this.delegate$delegate.getValue()).replaceRanges(list, list2);
    }
}
