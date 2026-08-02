package com.squareup.cash.clientsync.errors;

import com.squareup.cash.clientsync.errors.ClientSyncError;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt__IndentKt;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/clientsync/errors/StorageOperationEntityVersionDowngrade;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "com/squareup/util/android/ColorsKt", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StorageOperationEntityVersionDowngrade extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String groupingIdentifier = "StorageOperationEntityVersionDowngrade";
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final SyncEntityErrorMetadata existingEntity;
        public final StorageOperationErrorMetadata storageOperation;

        public Metadata(SyncEntityErrorMetadata syncEntityErrorMetadata, StorageOperationErrorMetadata storageOperationErrorMetadata) {
            this.existingEntity = syncEntityErrorMetadata;
            this.storageOperation = storageOperationErrorMetadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return this.existingEntity.equals(metadata.existingEntity) && this.storageOperation.equals(metadata.storageOperation);
        }

        public final int hashCode() {
            return this.storageOperation.storageOperation.hashCode() + (this.existingEntity.hashCode() * 31);
        }

        @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
        public final Map toMap() {
            return MapsKt__MapsKt.mapOf(new Pair("existingEntity", this.existingEntity.toString()), new Pair("storageOperation", this.storageOperation.toMap()));
        }

        public final String toString() {
            return "Metadata(existingEntity=" + this.existingEntity + ", storageOperation=" + this.storageOperation + ")";
        }
    }

    public StorageOperationEntityVersionDowngrade(Metadata metadata) {
        this.metadata = metadata;
        this.message = StringsKt__IndentKt.replaceIndent("\n    A storage operation for a stale entity was skipped:\n    - Existing Entity: " + metadata.existingEntity + "\n    - Storage Operation: " + metadata.storageOperation + "\n    ");
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncError
    public final String getGroupingIdentifier() {
        return this.groupingIdentifier;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncError
    public final ClientSyncError.Metadata getMetadata() {
        return this.metadata;
    }
}
