package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver;
import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.pipeline.DeleteEntity;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import com.squareup.cash.clientsync.readers.AndroidSyncEntitySpecs$Payment$1;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes.dex */
public abstract class SyncEntityStorageObserver extends ClientSyncStorageObserver.Typed {
    public final /* synthetic */ int $r8$classId;
    public final LinkedHashMap specsByType;

    public SyncEntityStorageObserver(AndroidSyncEntitySpecs$Payment$1[] androidSyncEntitySpecs$Payment$1Arr, int i) {
        this.$r8$classId = i;
        int i2 = 0;
        switch (i) {
            case 1:
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(androidSyncEntitySpecs$Payment$1Arr.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                int length = androidSyncEntitySpecs$Payment$1Arr.length;
                while (i2 < length) {
                    AndroidSyncEntitySpecs$Payment$1 androidSyncEntitySpecs$Payment$1 = androidSyncEntitySpecs$Payment$1Arr[i2];
                    linkedHashMap.put(androidSyncEntitySpecs$Payment$1.entityType, androidSyncEntitySpecs$Payment$1);
                    i2++;
                }
                this.specsByType = linkedHashMap;
                break;
            default:
                int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(androidSyncEntitySpecs$Payment$1Arr.length);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                int length2 = androidSyncEntitySpecs$Payment$1Arr.length;
                while (i2 < length2) {
                    AndroidSyncEntitySpecs$Payment$1 androidSyncEntitySpecs$Payment$12 = androidSyncEntitySpecs$Payment$1Arr[i2];
                    linkedHashMap2.put(androidSyncEntitySpecs$Payment$12.entityType, androidSyncEntitySpecs$Payment$12);
                    i2++;
                }
                this.specsByType = linkedHashMap2;
                break;
        }
    }

    public boolean isEntitySupported(SyncEntity syncEntity) {
        syncEntity.getClass();
        return ((AndroidSyncEntitySpecs$Payment$1) this.specsByType.get(syncEntity.getEntityType())) != null;
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onAfterDeleteAllRangesAndEntities(DeleteAllRangesAndEntities.Result result) {
        switch (this.$r8$classId) {
            case 0:
                onDeleteAllEntities();
                break;
            default:
                onDeleteAllEntities();
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public void onAfterDeleteEntity(DeleteEntity.Result result) {
        AndroidSyncEntitySpecs$Payment$1 androidSyncEntitySpecs$Payment$1;
        int i = this.$r8$classId;
        LinkedHashMap linkedHashMap = this.specsByType;
        switch (i) {
            case 0:
                SyncEntity deletedEntity = result.getDeletedEntity();
                if (deletedEntity != null && ((AndroidSyncEntitySpecs$Payment$1) linkedHashMap.get(deletedEntity.getEntityType())) != null) {
                    onDeleteEntity(deletedEntity.getEntityId(), deletedEntity.getEntityType());
                    break;
                }
                break;
            default:
                SyncEntity deletedEntity2 = result.getDeletedEntity();
                if (deletedEntity2 != null && (androidSyncEntitySpecs$Payment$1 = (AndroidSyncEntitySpecs$Payment$1) linkedHashMap.get(deletedEntity2.getEntityType())) != null) {
                    onDeleteEntity(deletedEntity2.getEntityId(), deletedEntity2.getEntityType(), androidSyncEntitySpecs$Payment$1.getPayload(deletedEntity2.getEntityProto()));
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public void onAfterUpdateEntity(UpdateEntity.Result result) {
        int i = this.$r8$classId;
        LinkedHashMap linkedHashMap = this.specsByType;
        switch (i) {
            case 0:
                SyncEntity entity = result.getStorageOperation().getEntity();
                AndroidSyncEntitySpecs$Payment$1 androidSyncEntitySpecs$Payment$1 = (AndroidSyncEntitySpecs$Payment$1) linkedHashMap.get(entity.getEntityType());
                if (androidSyncEntitySpecs$Payment$1 != null) {
                    onUpdateEntity(entity.getEntityId(), entity.getEntityType(), androidSyncEntitySpecs$Payment$1.getPayload(entity.getEntityProto()));
                    break;
                }
                break;
            default:
                SyncEntity entity2 = result.getStorageOperation().getEntity();
                AndroidSyncEntitySpecs$Payment$1 androidSyncEntitySpecs$Payment$12 = (AndroidSyncEntitySpecs$Payment$1) linkedHashMap.get(entity2.getEntityType());
                if (androidSyncEntitySpecs$Payment$12 != null) {
                    onUpdateEntity(entity2.getEntityId(), entity2.getEntityType(), androidSyncEntitySpecs$Payment$12.getPayload(entity2.getEntityProto()));
                    break;
                }
                break;
        }
    }

    public abstract void onDeleteAllEntities();

    public abstract void onDeleteEntity(String str, SyncEntityType syncEntityType);

    public abstract void onDeleteEntity(String str, SyncEntityType syncEntityType, Object obj);

    public abstract void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyncEntityStorageObserver(AndroidSyncEntitySpecs$Payment$1 androidSyncEntitySpecs$Payment$1) {
        this(new AndroidSyncEntitySpecs$Payment$1[]{androidSyncEntitySpecs$Payment$1}, 0);
        this.$r8$classId = 0;
        androidSyncEntitySpecs$Payment$1.getClass();
    }
}
