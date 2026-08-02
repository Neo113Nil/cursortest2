package com.squareup.cash.clientsync.errors;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.errors.ClientSyncError;
import java.util.Map;
import kotlin.text.StringsKt__IndentKt;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/clientsync/errors/StorageOperationPersistenceFailure;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "Metadata", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StorageOperationPersistenceFailure extends ClientSyncError {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Throwable cause;
    public final String groupingIdentifier;
    public final String message;
    public final Metadata metadata;

    public final class Metadata implements ClientSyncError.Metadata {
        public final StorageOperationErrorMetadata storageOperation;

        public Metadata(StorageOperationErrorMetadata storageOperationErrorMetadata) {
            this.storageOperation = storageOperationErrorMetadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metadata) && this.storageOperation.equals(((Metadata) obj).storageOperation);
        }

        public final int hashCode() {
            return this.storageOperation.storageOperation.hashCode();
        }

        @Override // com.squareup.cash.clientsync.errors.ClientSyncError.Metadata
        public final Map toMap() {
            return BalanceFeedKt$$ExternalSyntheticOutline0.m("storageOperation", this.storageOperation.toMap());
        }

        public final String toString() {
            return "Metadata(storageOperation=" + this.storageOperation + ")";
        }
    }

    public StorageOperationPersistenceFailure(Throwable th, Metadata metadata) {
        this.cause = th;
        this.metadata = metadata;
        this.message = StringsKt__IndentKt.replaceIndent("\n    There was an exception when executing a storage operation:\n    - Storage Operation: " + metadata.storageOperation + "\n    ");
        String message = th.getMessage();
        this.groupingIdentifier = message == null ? "StorageOperationPersistenceFailure" : message;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
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
