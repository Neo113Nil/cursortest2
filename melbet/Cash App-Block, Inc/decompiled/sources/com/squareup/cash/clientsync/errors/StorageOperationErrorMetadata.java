package com.squareup.cash.clientsync.errors;

import com.squareup.cash.clientsync.errors.ClientSyncError;
import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.pipeline.EntityStorageOperation;
import com.squareup.cash.clientsync.pipeline.ReplaceRanges;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import com.squareup.util.android.Emails;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class StorageOperationErrorMetadata implements ClientSyncError.Metadata {
    public final StorageOperation storageOperation;

    public StorageOperationErrorMetadata(StorageOperation storageOperation) {
        storageOperation.getClass();
        this.storageOperation = storageOperation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StorageOperationErrorMetadata) && Intrinsics.areEqual(this.storageOperation, ((StorageOperationErrorMetadata) obj).storageOperation);
    }

    public final int hashCode() {
        return this.storageOperation.hashCode();
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
    public final Map toMap() {
        MapBuilder mapBuilder = new MapBuilder();
        StorageOperation storageOperation = this.storageOperation;
        mapBuilder.put("type", Reflection.factory.getOrCreateKotlinClass(storageOperation.getClass()).getSimpleName());
        mapBuilder.put("taskId", storageOperation.getTaskId().id);
        if (storageOperation instanceof ReplaceRanges) {
            ReplaceRanges replaceRanges = (ReplaceRanges) storageOperation;
            mapBuilder.put("rangesToDeleteCount", Integer.valueOf(replaceRanges.rangesToDelete.size()));
            mapBuilder.put("rangesToAddCount", Integer.valueOf(replaceRanges.rangesToAdd.size()));
        } else if (storageOperation instanceof EntityStorageOperation) {
            mapBuilder.put("entity", Emails.getErrorMetadata(((EntityStorageOperation) storageOperation).getEntity()).toString());
        } else {
            if (!(storageOperation instanceof DeleteAllRangesAndEntities)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            mapBuilder.put("trigger", ((DeleteAllRangesAndEntities) storageOperation).trigger.toString());
        }
        return mapBuilder.build();
    }

    public final String toString() {
        return "StorageOperationErrorMetadata(storageOperation=" + this.storageOperation + ")";
    }
}
