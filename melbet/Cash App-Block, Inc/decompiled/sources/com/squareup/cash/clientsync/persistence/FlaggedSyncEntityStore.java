package com.squareup.cash.clientsync.persistence;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.util.coroutines.ClientSyncDispatchers;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;

/* loaded from: classes.dex */
public final class FlaggedSyncEntityStore extends SyncEntityStore {
    public final SqlComponentMigrationStore componentMigrationStore;
    public final Lazy delegate$delegate;
    public final RealClientSyncErrorReporter errorReporter;
    public final RealClientSyncFlags flags;
    public final CoroutineDispatcher ioDispatcher;
    public final RealClientSyncLogger logger;
    public final SyncEntityStore multiplatformStore;
    public final SyncEntityStore nativeStore;
    public final ClientSyncTransactor transactor;

    public FlaggedSyncEntityStore(SyncEntityStore syncEntityStore, SyncEntityStore syncEntityStore2, SqlComponentMigrationStore sqlComponentMigrationStore, RealClientSyncErrorReporter realClientSyncErrorReporter, RealClientSyncFlags realClientSyncFlags, RealClientSyncLogger realClientSyncLogger, ClientSyncTransactor clientSyncTransactor) {
        DefaultIoScheduler defaultIoScheduler = ClientSyncDispatchers.IO;
        defaultIoScheduler.getClass();
        this.ioDispatcher = defaultIoScheduler;
        this.delegate$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 12));
        this.nativeStore = syncEntityStore;
        this.multiplatformStore = syncEntityStore2;
        this.componentMigrationStore = sqlComponentMigrationStore;
        this.errorReporter = realClientSyncErrorReporter;
        this.flags = realClientSyncFlags;
        this.logger = realClientSyncLogger;
        this.transactor = clientSyncTransactor;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final long deleteAllEntities() {
        return getDelegate().deleteAllEntities();
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void deleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        getDelegate().deleteEntity(str, syncEntityType);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntities(long j) {
        return getDelegate().getAllEntities(j);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntitiesOfType(SyncEntityType syncEntityType) {
        return getDelegate().getAllEntitiesOfType(syncEntityType);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllEntitiesOfTypeFlow(SyncEntityType syncEntityType) {
        return FlowKt.flowOn(FlowKt.flatMapConcat(new RealGcmRegistrar$unregister$2(this, syncEntityType, null, 16), new AppLockMonitor$special$$inlined$map$2(Unit.INSTANCE, 19)), this.ioDispatcher);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllValuesOfType(SyncValueType syncValueType) {
        return getDelegate().getAllValuesOfType(syncValueType);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllValuesOfTypeFlow(SyncValueType syncValueType) {
        return FlowKt.flowOn(FlowKt.flatMapConcat(new RealAppConfigManager$update$2$2(this, syncValueType, null, 7), new AppLockMonitor$special$$inlined$map$2(Unit.INSTANCE, 19)), this.ioDispatcher);
    }

    public final SyncEntityStore getDelegate() {
        return (SyncEntityStore) this.delegate$delegate.getValue();
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final SyncEntity getEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        return getDelegate().getEntity(str, syncEntityType);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void insertEntity(SyncEntity syncEntity) {
        syncEntity.getClass();
        getDelegate().insertEntity(syncEntity);
    }
}
