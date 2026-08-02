package com.squareup.cash.clientsync.persistence;

import androidx.room.util.DBUtil;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.clientsync.SyncRangeQueries$DeleteAllQuery;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.contacts.RealContactRepository$recents$$inlined$mapItems$1;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.entities.SyncEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.entities.SyncEntityQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.entities.SyncEntityQueries$ForEntityIdAndTypeQuery;
import com.squareup.cash.db2.entities.SyncEntityQueries$SelectAllWithEntityTypeQuery;
import com.squareup.cash.db2.entities.SyncEntityQueries$forEntityIdAndType$2;
import com.squareup.cash.db2.entities.SyncEntityQueries$selectAll$2;
import com.squareup.cash.db2.entities.SyncEntityQueries$selectAllWithEntityType$2;
import com.squareup.cash.db2.entities.SyncEntityQueries$selectAllWithValueType$2;
import com.squareup.cash.db2.entities.Sync_entity;
import com.squareup.cash.db2.payment.OfflineQueries$PendingQuery;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.util.android.layout.LayoutHelpersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealSyncEntityStore extends SyncEntityStore {
    public final CoroutineContext dispatcher;
    public final InstrumentQueries syncEntityQueries;

    public RealSyncEntityStore(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.dispatcher = coroutineContext;
        this.syncEntityQueries = cashAccountDatabaseImpl.syncEntityQueries;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final long deleteAllEntities() {
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        return ((Number) new SyncRangeQueries$DeleteAllQuery(instrumentQueries, new ContactQueries$$ExternalSyntheticLambda1(28), 4).executeAsOne()).longValue();
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void deleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        int i = syncEntityType.value;
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        instrumentQueries.driver.execute(1852600910, "DELETE\nFROM sync_entity\nWHERE entity_id = ?\nAND type = ?", new PoolGoalMetKt$$ExternalSyntheticLambda6(str, instrumentQueries, i, 12));
        instrumentQueries.notifyQueries(1852600910, new ContactQueries$$ExternalSyntheticLambda1(27));
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntities(long j) {
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        SyncEntityQueries$selectAll$2 syncEntityQueries$selectAll$2 = SyncEntityQueries$selectAll$2.INSTANCE;
        List executeAsList = new OfflineQueries$PendingQuery(instrumentQueries, j, new SyncEntityQueries$$ExternalSyntheticLambda1(instrumentQueries, 2), 2).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        Iterator it = executeAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(LayoutHelpersKt.access$toMultiplatform((Sync_entity) it.next()));
        }
        return arrayList;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllEntitiesOfType(SyncEntityType syncEntityType) {
        int i = syncEntityType.value;
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
        List executeAsList = new SyncEntityQueries$SelectAllWithEntityTypeQuery(instrumentQueries, i, 2147483647L, 0L, new StorageLinkQueries$$ExternalSyntheticLambda8(instrumentQueries, (char) 0)).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        Iterator it = executeAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(LayoutHelpersKt.access$toMultiplatform((Sync_entity) it.next()));
        }
        return arrayList;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllEntitiesOfTypeFlow(SyncEntityType syncEntityType) {
        int i = syncEntityType.value;
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
        return new RealContactRepository$recents$$inlined$mapItems$1(DBUtil.mapToList(DBUtil.toFlow(new SyncEntityQueries$SelectAllWithEntityTypeQuery(instrumentQueries, i, Long.MAX_VALUE, 0L, new StorageLinkQueries$$ExternalSyntheticLambda8(instrumentQueries, (char) 0))), this.dispatcher), 1);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final List getAllValuesOfType(SyncValueType syncValueType) {
        Integer valueOf = Integer.valueOf(syncValueType.value);
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
        List executeAsList = new RewardQueries.ForIdsQuery(instrumentQueries, valueOf, new SyncEntityQueries$$ExternalSyntheticLambda1(instrumentQueries, 0), 23).executeAsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        Iterator it = executeAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(LayoutHelpersKt.access$toMultiplatform((Sync_entity) it.next()));
        }
        return arrayList;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final Flow getAllValuesOfTypeFlow(SyncValueType syncValueType) {
        Integer valueOf = Integer.valueOf(syncValueType.value);
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        SyncEntityQueries$selectAllWithValueType$2 syncEntityQueries$selectAllWithValueType$2 = SyncEntityQueries$selectAllWithValueType$2.INSTANCE;
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(instrumentQueries, valueOf, new SyncEntityQueries$$ExternalSyntheticLambda1(instrumentQueries, 0), 23)), this.dispatcher), 4);
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final SyncEntity getEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        int i = syncEntityType.value;
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        SyncEntityQueries$forEntityIdAndType$2 syncEntityQueries$forEntityIdAndType$2 = SyncEntityQueries$forEntityIdAndType$2.INSTANCE;
        Sync_entity sync_entity = (Sync_entity) new SyncEntityQueries$ForEntityIdAndTypeQuery(instrumentQueries, str, i, new SyncEntityQueries$$ExternalSyntheticLambda1(instrumentQueries, 1)).executeAsOneOrNull();
        if (sync_entity != null) {
            return LayoutHelpersKt.access$toMultiplatform(sync_entity);
        }
        return null;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncEntityStore
    public final void insertEntity(SyncEntity syncEntity) {
        syncEntity.getClass();
        int i = syncEntity.getTopic().value;
        String entityId = syncEntity.getEntityId();
        int i2 = syncEntity.getEntityType().value;
        byte[] encode = ((com.squareup.protos.franklin.common.SyncEntity) syncEntity.getEntityProto()).encode();
        SyncValueType valueType = syncEntity.getValueType();
        Integer valueOf = valueType != null ? Integer.valueOf(valueType.value) : null;
        Long l = ((com.squareup.protos.franklin.common.SyncEntity) syncEntity.getEntityProto()).version;
        InstrumentQueries instrumentQueries = this.syncEntityQueries;
        instrumentQueries.getClass();
        entityId.getClass();
        encode.getClass();
        instrumentQueries.driver.execute(541765842, "INSERT OR REPLACE INTO sync_entity (entity_id, type, entity, entity_processor_version, sync_value_type, sync_entity_version, topic)\nVALUES (?, ?, ?, 31, ?, ?, ?)", new SyncEntityQueries$$ExternalSyntheticLambda3(entityId, instrumentQueries, i2, encode, valueOf, l, i));
        instrumentQueries.notifyQueries(541765842, new ContactQueries$$ExternalSyntheticLambda1(26));
    }
}
