package com.squareup.cash.clientsync.persistence;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.mc$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.util.android.ViewGroups;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes6.dex */
public final class BootstrappedSyncEntityStore extends SyncEntityStore {
    public final SqlComponentMigrationStore componentMigrationStore;
    public final SyncEntityStore destinationStore;
    public final RealClientSyncLogger logger;
    public final SyncEntityStore sourceStore;
    public final ClientSyncTransactor transactor;

    public BootstrappedSyncEntityStore(SyncEntityStore syncEntityStore, SyncEntityStore syncEntityStore2, SqlComponentMigrationStore sqlComponentMigrationStore, ClientSyncTransactor clientSyncTransactor, RealClientSyncLogger realClientSyncLogger) {
        syncEntityStore.getClass();
        syncEntityStore2.getClass();
        sqlComponentMigrationStore.getClass();
        clientSyncTransactor.getClass();
        realClientSyncLogger.getClass();
        this.sourceStore = syncEntityStore;
        this.destinationStore = syncEntityStore2;
        this.componentMigrationStore = sqlComponentMigrationStore;
        this.transactor = clientSyncTransactor;
        this.logger = realClientSyncLogger;
        if (Intrinsics.areEqual(syncEntityStore, syncEntityStore2)) {
            a$$ExternalSyntheticBUOutline0.m$3("The source store and the destination store must be different.");
            throw null;
        }
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final long deleteAllEntities() {
        SqlComponentMigrationStore sqlComponentMigrationStore = this.componentMigrationStore;
        sqlComponentMigrationStore.getClass();
        SessionQueries sessionQueries = sqlComponentMigrationStore.componentMigrationQueries;
        sessionQueries.getClass();
        Long l = (Long) new RewardQueries.ForIdsQuery(sessionQueries, "sync_entity_store", new SyncRangeQueries$$ExternalSyntheticLambda1(7), 12).executeAsOneOrNull();
        if (l != null && l.longValue() == 9) {
            return this.destinationStore.deleteAllEntities();
        }
        return 0L;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void deleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        SqlComponentMigrationStore sqlComponentMigrationStore = this.componentMigrationStore;
        sqlComponentMigrationStore.getClass();
        SessionQueries sessionQueries = sqlComponentMigrationStore.componentMigrationQueries;
        sessionQueries.getClass();
        Long l = (Long) new RewardQueries.ForIdsQuery(sessionQueries, "sync_entity_store", new SyncRangeQueries$$ExternalSyntheticLambda1(7), 12).executeAsOneOrNull();
        if (l != null && l.longValue() == 9) {
            this.destinationStore.deleteEntity(str, syncEntityType);
        }
    }

    public final Object ensureBootstrapped(Function0 function0) {
        return ViewGroups.ensureMigrated(this.componentMigrationStore, "sync_entity_store", new WandScene$ring$3(0, this, BootstrappedSyncEntityStore.class, "bootstrap", "bootstrap()V", 0, 18), function0, this.logger);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntities(long j) {
        return (List) ensureBootstrapped(new mc$$ExternalSyntheticLambda0(this, j, 2));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntitiesOfType(SyncEntityType syncEntityType) {
        return (List) ensureBootstrapped(new ArcadeModal2Kt$$ExternalSyntheticLambda2(4, this, syncEntityType));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllEntitiesOfTypeFlow(SyncEntityType syncEntityType) {
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new BootstrappedSyncEntityStore$getAllValuesOfTypeFlow$1(this, null, 1), this.destinationStore.getAllEntitiesOfTypeFlow(syncEntityType));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllValuesOfType(SyncValueType syncValueType) {
        return (List) ensureBootstrapped(new ArcadeModal2Kt$$ExternalSyntheticLambda2(5, this, syncValueType));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllValuesOfTypeFlow(SyncValueType syncValueType) {
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new BootstrappedSyncEntityStore$getAllValuesOfTypeFlow$1(this, null, 0), this.destinationStore.getAllValuesOfTypeFlow(syncValueType));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final SyncEntity getEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        return (SyncEntity) ensureBootstrapped(new CopyCodeKt$$ExternalSyntheticLambda4(27, this, str, syncEntityType));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void insertEntity(SyncEntity syncEntity) {
        syncEntity.getClass();
        SqlComponentMigrationStore sqlComponentMigrationStore = this.componentMigrationStore;
        sqlComponentMigrationStore.getClass();
        SessionQueries sessionQueries = sqlComponentMigrationStore.componentMigrationQueries;
        sessionQueries.getClass();
        Long l = (Long) new RewardQueries.ForIdsQuery(sessionQueries, "sync_entity_store", new SyncRangeQueries$$ExternalSyntheticLambda1(7), 12).executeAsOneOrNull();
        if (l != null && l.longValue() == 9) {
            this.destinationStore.insertEntity(syncEntity);
        }
    }
}
