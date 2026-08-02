package com.squareup.cash.clientsync.persistence;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.SyncRangeQueries$DeleteAllQuery;
import com.squareup.cash.clientsync.SyncRangeQueries$selectAll$2;
import com.squareup.cash.clientsync.Sync_range;
import com.squareup.cash.clientsync.database.ClientSyncDatabaseImpl;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.entities.EntityRangesQueries$selectAll$2;
import com.squareup.cash.db2.entities.Entity_range;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.stafftasks.resources.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes.dex */
public final class SqlSyncRangeStore implements SyncRangeStore {
    public final /* synthetic */ int $r8$classId = 0;
    public final TransacterImpl syncRangeQueries;

    public SqlSyncRangeStore(CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.syncRangeQueries = cashAccountDatabaseImpl.entityRangesQueries;
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final long deleteAllRanges() {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.syncRangeQueries;
        switch (i) {
            case 0:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                localTabContentQueries.getClass();
                int i2 = 0;
                return ((Number) new SyncRangeQueries$DeleteAllQuery(localTabContentQueries, new SyncRangeQueries$$ExternalSyntheticLambda1(i2), i2).executeAsOne()).longValue();
            default:
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                instrumentQueries.getClass();
                return ((Number) new SyncRangeQueries$DeleteAllQuery(instrumentQueries, new ContactQueries$$ExternalSyntheticLambda1(18), 3).executeAsOne()).longValue();
        }
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final List getAllRanges() {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.syncRangeQueries;
        switch (i) {
            case 0:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                localTabContentQueries.getClass();
                SyncRangeQueries$selectAll$2 syncRangeQueries$selectAll$2 = SyncRangeQueries$selectAll$2.INSTANCE;
                SqlDriver sqlDriver = localTabContentQueries.driver;
                CaptureCheckFaceKt$$ExternalSyntheticLambda12 captureCheckFaceKt$$ExternalSyntheticLambda12 = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(localTabContentQueries);
                sqlDriver.getClass();
                List executeAsList = new SimpleQuery(-1329790729, new String[]{"sync_range"}, sqlDriver, "SyncRange.sq", "selectAll", "SELECT sync_range.topic, sync_range.bytes FROM sync_range", captureCheckFaceKt$$ExternalSyntheticLambda12).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
                Iterator it = executeAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Task.Metadata.toSyncRange((Sync_range) it.next()));
                }
                return arrayList;
            default:
                InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                instrumentQueries.getClass();
                EntityRangesQueries$selectAll$2 entityRangesQueries$selectAll$2 = EntityRangesQueries$selectAll$2.INSTANCE;
                SqlDriver sqlDriver2 = instrumentQueries.driver;
                OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0 = new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries);
                sqlDriver2.getClass();
                List<Entity_range> executeAsList2 = new SimpleQuery(1824283441, new String[]{"entity_range"}, sqlDriver2, "EntityRanges.sq", "selectAll", "SELECT entity_range.range, entity_range.topic FROM entity_range", offlineQueries$$ExternalSyntheticLambda0).executeAsList();
                ArrayList arrayList2 = new ArrayList();
                for (Entity_range entity_range : executeAsList2) {
                    byte[] range = entity_range.getRange();
                    SyncRange syncRange = range != null ? new SyncRange(new SyncTopic(entity_range.getTopic()), range) : null;
                    if (syncRange != null) {
                        arrayList2.add(syncRange);
                    }
                }
                return arrayList2;
        }
    }

    @Override // com.squareup.cash.clientsync.persistence.SyncRangeStore
    public final void replaceRanges(List list, List list2) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.syncRangeQueries;
        list.getClass();
        list2.getClass();
        switch (i) {
            case 0:
                ((LocalTabContentQueries) transacterImpl).transactionWithWrapper(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(18, list, this, list2));
                break;
            default:
                ((InstrumentQueries) transacterImpl).transactionWithWrapper(new CaptureCheckFaceKt$$ExternalSyntheticLambda11(16, list, this, list2));
                break;
        }
    }

    public SqlSyncRangeStore(ClientSyncDatabaseImpl clientSyncDatabaseImpl) {
        this.syncRangeQueries = clientSyncDatabaseImpl.syncRangeQueries;
    }
}
