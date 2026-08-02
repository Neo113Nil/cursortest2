package com.squareup.cash.clientsync.persistence;

import androidx.compose.material.SliderKt$$ExternalSyntheticLambda4;
import androidx.room.util.DBUtil;
import app.cash.local.db.LocalTabContentQueries;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.clientsync.SyncEntityQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.SyncEntityQueries$SelectAllWithEntityTypeQuery;
import com.squareup.cash.clientsync.SyncEntityQueries$select$2;
import com.squareup.cash.clientsync.SyncEntityQueries$selectAll$2;
import com.squareup.cash.clientsync.SyncEntityQueries$selectAllWithEntityType$2;
import com.squareup.cash.clientsync.SyncEntityQueries$selectAllWithValueType$2;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.SyncRangeQueries$DeleteAllQuery;
import com.squareup.cash.clientsync.Sync_entity;
import com.squareup.cash.clientsync.database.ClientSyncDatabaseImpl;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.util.coroutines.ClientSyncDispatchers;
import com.squareup.cash.db2.payment.OfflineQueries$PendingQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;

/* loaded from: classes.dex */
public final class SqlSyncEntityStore extends SyncEntityStore {
    public final CoroutineDispatcher ioDispatcher;
    public final zzd serializer;
    public final LocalTabContentQueries syncEntityQueries;

    public SqlSyncEntityStore(ClientSyncDatabaseImpl clientSyncDatabaseImpl, zzd zzdVar) {
        DefaultIoScheduler defaultIoScheduler = ClientSyncDispatchers.IO;
        defaultIoScheduler.getClass();
        this.serializer = zzdVar;
        this.ioDispatcher = defaultIoScheduler;
        this.syncEntityQueries = clientSyncDatabaseImpl.syncEntityQueries;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final long deleteAllEntities() {
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        return ((Number) new SyncRangeQueries$DeleteAllQuery(localTabContentQueries, new SyncRangeQueries$$ExternalSyntheticLambda1(9), 1).executeAsOne()).longValue();
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void deleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        localTabContentQueries.driver.execute(-1163532231, "DELETE\nFROM sync_entity\nWHERE entity_id = ?\nAND entity_type = ?", new CaptureCheckFaceKt$$ExternalSyntheticLambda11(15, str, localTabContentQueries, syncEntityType));
        localTabContentQueries.notifyQueries(-1163532231, new SyncRangeQueries$$ExternalSyntheticLambda1(10));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntities(long j) {
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        SyncEntityQueries$selectAll$2 syncEntityQueries$selectAll$2 = SyncEntityQueries$selectAll$2.INSTANCE;
        List executeAsList = new OfflineQueries$PendingQuery(localTabContentQueries, j, new SyncEntityQueries$$ExternalSyntheticLambda0(localTabContentQueries, 3), 1).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        Iterator it = executeAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(toSyncEntity((Sync_entity) it.next()));
        }
        return arrayList;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntitiesOfType(SyncEntityType syncEntityType) {
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
        List executeAsList = new SyncEntityQueries$SelectAllWithEntityTypeQuery(localTabContentQueries, syncEntityType, 2147483647L, 0L, new SyncEntityQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0)).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        Iterator it = executeAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(toSyncEntity((Sync_entity) it.next()));
        }
        return arrayList;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllEntitiesOfTypeFlow(SyncEntityType syncEntityType) {
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
        return FlowKt.distinctUntilChanged(new SqlSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SyncEntityQueries$SelectAllWithEntityTypeQuery(localTabContentQueries, syncEntityType, Long.MAX_VALUE, 0L, new SyncEntityQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0))), this.ioDispatcher), this, 1));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllValuesOfType(SyncValueType syncValueType) {
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
        List executeAsList = new RewardQueries.ForIdsQuery(localTabContentQueries, syncValueType, new SyncEntityQueries$$ExternalSyntheticLambda0(localTabContentQueries, 2), 13).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        Iterator it = executeAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(toSyncEntity((Sync_entity) it.next()));
        }
        return arrayList;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllValuesOfTypeFlow(SyncValueType syncValueType) {
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
        return FlowKt.distinctUntilChanged(new SqlSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(localTabContentQueries, syncValueType, new SyncEntityQueries$$ExternalSyntheticLambda0(localTabContentQueries, 2), 13)), this.ioDispatcher), this, 0));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final SyncEntity getEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        SyncEntityQueries$select$2 syncEntityQueries$select$2 = SyncEntityQueries$select$2.INSTANCE;
        Sync_entity sync_entity = (Sync_entity) new BadgeQueries$VersionQuery(localTabContentQueries, str, syncEntityType, new SyncEntityQueries$$ExternalSyntheticLambda0(localTabContentQueries, 1)).executeAsOneOrNull();
        if (sync_entity != null) {
            return toSyncEntity(sync_entity);
        }
        return null;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void insertEntity(SyncEntity syncEntity) {
        syncEntity.getClass();
        SyncTopic topic = syncEntity.getTopic();
        String entityId = syncEntity.getEntityId();
        SyncEntityType entityType = syncEntity.getEntityType();
        Object entityProto = syncEntity.getEntityProto();
        this.serializer.getClass();
        com.squareup.protos.franklin.common.SyncEntity syncEntity2 = (com.squareup.protos.franklin.common.SyncEntity) entityProto;
        syncEntity2.getClass();
        byte[] encode = syncEntity2.encode();
        Long entityVersion = syncEntity.getEntityVersion();
        SyncValueType valueType = syncEntity.getValueType();
        LocalTabContentQueries localTabContentQueries = this.syncEntityQueries;
        localTabContentQueries.getClass();
        topic.getClass();
        entityId.getClass();
        entityType.getClass();
        encode.getClass();
        localTabContentQueries.driver.execute(-1011866297, "INSERT OR REPLACE INTO sync_entity\nVALUES (?, ?, ?, ?, ?, ?)", new SliderKt$$ExternalSyntheticLambda4(localTabContentQueries, topic, entityId, entityType, encode, entityVersion, valueType, 3));
        localTabContentQueries.notifyQueries(-1011866297, new SyncRangeQueries$$ExternalSyntheticLambda1(11));
    }

    public final SyncEntity toSyncEntity(Sync_entity sync_entity) {
        SyncTopic topic = sync_entity.getTopic();
        String entity_id = sync_entity.getEntity_id();
        SyncEntityType entity_type = sync_entity.getEntity_type();
        byte[] entity_data = sync_entity.getEntity_data();
        this.serializer.getClass();
        entity_data.getClass();
        return new SyncEntity(topic, entity_id, entity_type, (com.squareup.protos.franklin.common.SyncEntity) com.squareup.protos.franklin.common.SyncEntity.ADAPTER.decode(entity_data), sync_entity.getEntity_version(), sync_entity.getValue_type());
    }
}
