package com.squareup.cash.clientsync.readers;

import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class RealSyncValueReader extends SyncValueReader {
    public final RealClientSyncEntityDecryptor entityDecryptor;
    public final RealClientSyncErrorReporter errorReporter;
    public boolean hasReportedSyncValuesWithoutType;
    public final ReadonlyStateFlow syncValuesByType;

    public RealSyncValueReader(RealClientSyncEntityDecryptor realClientSyncEntityDecryptor, SyncEntityStore syncEntityStore, RealClientSyncErrorReporter realClientSyncErrorReporter, CoroutineScope coroutineScope) {
        this.entityDecryptor = realClientSyncEntityDecryptor;
        this.errorReporter = realClientSyncErrorReporter;
        FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(8, syncEntityStore.getAllEntitiesOfTypeFlow(new SyncEntityType(14)), this);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.syncValuesByType = FlowKt.stateIn(finishSetupTileBadgeCounter, coroutineScope, SharingStarted.Companion.Eagerly, emptyMap);
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final Object awaitReady(SuspendLambda suspendLambda) {
        Object first = FlowKt.first(this.syncValuesByType, new DataStoreImpl$data$1.AnonymousClass2(16), suspendLambda);
        return first == CoroutineSingletons.COROUTINE_SUSPENDED ? first : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final StateFlow getAllValues(SyncValueSpec syncValueSpec, Function1 function1) {
        syncValueSpec.getClass();
        return DBUtil.mapState(DBUtil.mapState(this.syncValuesByType, new StorageLinkQueries$$ExternalSyntheticLambda8(syncValueSpec, 5)), new MoleculeKt$$ExternalSyntheticLambda1(5, function1, this, syncValueSpec));
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final StateFlow getFirstValueOrDefault(SyncValueSpec syncValueSpec, Boolean bool, Function1 function1) {
        return DBUtil.mapState(DBUtil.mapState(this.syncValuesByType, new StorageLinkQueries$$ExternalSyntheticLambda8(syncValueSpec, 5)), new BankingConfigQueries$$ExternalSyntheticLambda0(bool, function1, this, syncValueSpec, 5));
    }

    @Override // com.squareup.cash.clientsync.readers.SyncValueReader
    public final StateFlow getSingleValueOrDefault(SyncValueSpec syncValueSpec, Object obj, Function1 function1) {
        syncValueSpec.getClass();
        return DBUtil.mapState(DBUtil.mapState(this.syncValuesByType, new StorageLinkQueries$$ExternalSyntheticLambda8(syncValueSpec, 5)), new HeartBeatInfoStorage$$ExternalSyntheticLambda0(obj, function1, this, syncValueSpec, 2));
    }
}
