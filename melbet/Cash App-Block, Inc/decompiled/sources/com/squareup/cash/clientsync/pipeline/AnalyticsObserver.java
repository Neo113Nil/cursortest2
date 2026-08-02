package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.cdf.syncentity.SyncEntitySyncWipe;
import com.squareup.cash.clientsync.errors.ClientSyncEntityFieldValidationError;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver;
import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.pipeline.DeleteEntity;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Access$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncEntityType;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.ui.UiAccess;
import com.squareup.util.cash.ImagesKt;
import com.squareup.wire.AndroidMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.ResourceFileSystem;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class AnalyticsObserver extends ClientSyncStorageObserver.Typed {
    public final /* synthetic */ int $r8$classId;
    public final Object analytics;

    public AnalyticsObserver() {
        this.$r8$classId = 1;
        this.analytics = AndroidSyncValueSpecs.Access;
    }

    private final void onAfterDeleteAllRangesAndEntities$com$squareup$cash$clientsync$pipeline$AccessSyncValueStorageObserver(DeleteAllRangesAndEntities.Result result) {
    }

    public static String validate(SyncEntity syncEntity, AndroidMessage androidMessage, String str) {
        Boolean bool = syncEntity.deleted;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            if (androidMessage == null) {
                return null;
            }
            return str.concat(" should be null");
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            if (androidMessage != null) {
                return null;
            }
            return str.concat(" should not be null");
        }
        if (bool != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (androidMessage != null) {
            return null;
        }
        return str.concat(" should not be null");
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public void onAfterDeleteAllRangesAndEntities(DeleteAllRangesAndEntities.Result result) {
        switch (this.$r8$classId) {
            case 0:
                ((Analytics) this.analytics).track(new SyncEntitySyncWipe(Integer.valueOf((int) result.getDeletedRangeCount()), Long.valueOf(result.getDeletedEntityCount()), ImagesKt.access$toCdfReason(result.getStorageOperation().getTrigger())), null);
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public void onAfterDeleteEntity(DeleteEntity.Result result) {
        switch (this.$r8$classId) {
            case 1:
                com.squareup.cash.clientsync.models.SyncEntity entity = result.getStorageOperation().getEntity();
                if (Intrinsics.areEqual(entity.getValueType(), (SyncValueType) ((AndroidSyncValueSpecs$Access$1) this.analytics).valueType)) {
                    String entityId = entity.getEntityId();
                    TaskId taskId = result.getStorageOperation().getTaskId();
                    Timber.Forest.i("Access SyncValue deleted: { entityId:" + entityId + ", taskId:" + taskId + " }", new Object[0]);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public void onAfterUpdateEntity(UpdateEntity.Result result) {
        switch (this.$r8$classId) {
            case 1:
                com.squareup.cash.clientsync.models.SyncEntity entity = result.getStorageOperation().getEntity();
                if (Intrinsics.areEqual(entity.getValueType(), (SyncValueType) ((AndroidSyncValueSpecs$Access$1) this.analytics).valueType)) {
                    String entityId = entity.getEntityId();
                    SyncEntity syncEntity = (SyncEntity) entity.getEntityProto();
                    syncEntity.getClass();
                    SyncValue syncValue = syncEntity.sync_value;
                    syncValue.getClass();
                    SyncValue.Value value = syncValue.value;
                    value.getClass();
                    UiAccess value2 = ((SyncValue.Value.Access) value).getValue();
                    TaskId taskId = result.getStorageOperation().getTaskId();
                    Timber.Forest.i("Access SyncValue updated: { entityId:" + entityId + ", payload:" + value2 + ", taskId:" + taskId + " }", new Object[0]);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public void onBeforeUpdateEntity(UpdateEntity updateEntity) {
        String validate;
        switch (this.$r8$classId) {
            case 2:
                updateEntity.getClass();
                SyncEntity syncEntity = (SyncEntity) updateEntity.getEntity().getEntityProto();
                int i = updateEntity.getEntity().getEntityType().value;
                ResourceFileSystem.Companion companion = SyncEntityType.Companion;
                if (i == 1) {
                    validate = validate(syncEntity, syncEntity.payment, "payment");
                } else if (i == 2) {
                    validate = validate(syncEntity, syncEntity.customer, "customer");
                } else if (i == 3) {
                    validate = validate(syncEntity, syncEntity.payment, "payment");
                } else if (i == 4) {
                    validate = validate(syncEntity, syncEntity.payment, "payment");
                } else if (i == 5) {
                    validate = validate(syncEntity, syncEntity.customer, "customer");
                } else if (i == 19) {
                    validate = validate(syncEntity, syncEntity.payment, "payment");
                } else if (i == 31) {
                    validate = validate(syncEntity, syncEntity.payment, "payment");
                }
                if (validate != null) {
                    ((ErrorReporter) this.analytics).report(new ClientSyncEntityFieldValidationError(syncEntity, updateEntity.getTaskId(), validate), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    break;
                }
                break;
            default:
                super.onBeforeUpdateEntity(updateEntity);
                break;
        }
    }

    public /* synthetic */ AnalyticsObserver(Object obj, int i) {
        this.$r8$classId = i;
        this.analytics = obj;
    }
}
