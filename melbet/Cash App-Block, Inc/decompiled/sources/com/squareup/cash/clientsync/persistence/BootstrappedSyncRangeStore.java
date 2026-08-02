package com.squareup.cash.clientsync.persistence;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.db.SessionQueries;
import com.squareup.util.android.ViewGroups;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BootstrappedSyncRangeStore implements SyncRangeStore {
    public final KeysetHandle auditLog;
    public final SqlComponentMigrationStore componentMigrationStore;
    public final SyncRangeStore destinationStore;
    public final RealClientSyncLogger logger;
    public final SyncRangeStore sourceStore;
    public final ClientSyncTransactor transactor;

    public BootstrappedSyncRangeStore(SyncRangeStore syncRangeStore, SyncRangeStore syncRangeStore2, SqlComponentMigrationStore sqlComponentMigrationStore, KeysetHandle keysetHandle, ClientSyncTransactor clientSyncTransactor, RealClientSyncLogger realClientSyncLogger) {
        syncRangeStore.getClass();
        syncRangeStore2.getClass();
        sqlComponentMigrationStore.getClass();
        keysetHandle.getClass();
        clientSyncTransactor.getClass();
        realClientSyncLogger.getClass();
        this.sourceStore = syncRangeStore;
        this.destinationStore = syncRangeStore2;
        this.componentMigrationStore = sqlComponentMigrationStore;
        this.auditLog = keysetHandle;
        this.transactor = clientSyncTransactor;
        this.logger = realClientSyncLogger;
        if (Intrinsics.areEqual(syncRangeStore, syncRangeStore2)) {
            a$$ExternalSyntheticBUOutline0.m$3("The source store and the destination store must be different.");
            throw null;
        }
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final long deleteAllRanges() {
        SqlComponentMigrationStore sqlComponentMigrationStore = this.componentMigrationStore;
        sqlComponentMigrationStore.getClass();
        SessionQueries sessionQueries = sqlComponentMigrationStore.componentMigrationQueries;
        sessionQueries.getClass();
        Long l = (Long) new RewardQueries.ForIdsQuery(sessionQueries, "sync_range_store", new SyncRangeQueries$$ExternalSyntheticLambda1(7), 12).executeAsOneOrNull();
        if (l != null && l.longValue() == 9) {
            return this.destinationStore.deleteAllRanges();
        }
        return 0L;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final List getAllRanges() {
        SsnViewKt$$ExternalSyntheticLambda4 ssnViewKt$$ExternalSyntheticLambda4 = new SsnViewKt$$ExternalSyntheticLambda4(this, 25);
        return (List) ViewGroups.ensureMigrated(this.componentMigrationStore, "sync_range_store", new WandScene$ring$3(0, this, BootstrappedSyncRangeStore.class, "bootstrap", "bootstrap()V", 0, 19), ssnViewKt$$ExternalSyntheticLambda4, this.logger);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final void replaceRanges(List list, List list2) {
        list.getClass();
        list2.getClass();
        SqlComponentMigrationStore sqlComponentMigrationStore = this.componentMigrationStore;
        sqlComponentMigrationStore.getClass();
        SessionQueries sessionQueries = sqlComponentMigrationStore.componentMigrationQueries;
        sessionQueries.getClass();
        Long l = (Long) new RewardQueries.ForIdsQuery(sessionQueries, "sync_range_store", new SyncRangeQueries$$ExternalSyntheticLambda1(7), 12).executeAsOneOrNull();
        if (l != null && l.longValue() == 9) {
            this.destinationStore.replaceRanges(list, list2);
        }
    }
}
