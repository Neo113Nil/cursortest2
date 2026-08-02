package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.errors.StorageOperationEntityVersionDowngrade;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.persistence.ClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.persistence.SyncRangeStore;
import com.squareup.cash.clientsync.pipeline.DeleteEntity;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.cash.Regions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RealClientSyncStorageOperationBatchExecutor {
    public final SyncEntityStore entityStore;
    public final RealClientSyncErrorReporter errorReporter;
    public final SyncRangeStore rangeStore;
    public final ClientSyncStorageObserver[] storageObservers;
    public final ClientSyncTransactor transactor;

    public RealClientSyncStorageOperationBatchExecutor(SyncRangeStore syncRangeStore, SyncEntityStore syncEntityStore, ClientSyncTransactor clientSyncTransactor, List list, RealClientSyncErrorReporter realClientSyncErrorReporter) {
        list.getClass();
        this.rangeStore = syncRangeStore;
        this.entityStore = syncEntityStore;
        this.transactor = clientSyncTransactor;
        this.errorReporter = realClientSyncErrorReporter;
        this.storageObservers = (ClientSyncStorageObserver[]) list.toArray(new ClientSyncStorageObserver[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DeleteEntity.Result executeDeleteEntity(DeleteEntity deleteEntity) {
        boolean z;
        String entityId = deleteEntity.getEntity().getEntityId();
        SyncEntityType entityType = deleteEntity.getEntity().getEntityType();
        SyncEntityStore syncEntityStore = this.entityStore;
        SyncEntity entity = syncEntityStore.getEntity(entityId, entityType);
        if (entity != null) {
            int ordinal = Regions.getEntityVersionDifference(entity, deleteEntity.getEntity()).ordinal();
            z = true;
            if (ordinal == 0) {
                syncEntityStore.deleteEntity(deleteEntity.getEntity().getEntityId(), deleteEntity.getEntity().getEntityType());
                if (!z) {
                    entity = null;
                }
                return new DeleteEntity.Result(deleteEntity, entity);
            }
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            int i = StorageOperationEntityVersionDowngrade.$r8$clinit;
            this.errorReporter.reportNonFatal(ColorsKt.create(entity, deleteEntity));
        }
        z = false;
        if (!z) {
        }
        return new DeleteEntity.Result(deleteEntity, entity);
    }

    public final UpdateEntity.Result executeUpdateEntity(UpdateEntity updateEntity) {
        String entityId = updateEntity.getEntity().getEntityId();
        SyncEntityType entityType = updateEntity.getEntity().getEntityType();
        SyncEntityStore syncEntityStore = this.entityStore;
        SyncEntity entity = syncEntityStore.getEntity(entityId, entityType);
        int ordinal = Regions.getEntityVersionDifference(entity, updateEntity.getEntity()).ordinal();
        if (ordinal == 0) {
            syncEntityStore.insertEntity((!Intrinsics.areEqual(updateEntity.getEntity().getTopic(), SyncTopic.UNKNOWN) || entity == null) ? updateEntity.getEntity() : SyncEntity.copy$default(updateEntity.getEntity(), entity.getTopic(), null, 62));
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            int i = StorageOperationEntityVersionDowngrade.$r8$clinit;
            entity.getClass();
            this.errorReporter.reportNonFatal(ColorsKt.create(entity, updateEntity));
        }
        return new UpdateEntity.Result(updateEntity);
    }
}
