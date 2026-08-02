package com.squareup.cash.clientsync.flags;

import com.squareup.cash.clientsync.errors.ClientSyncError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientsync/flags/DatabaseMigrationException;", "Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatabaseMigrationException extends ClientSyncError {
    public final Throwable cause;
    public final String message = "Error while waiting for the FeatureFlagManager to load";
    public final String groupingIdentifier = "Error while waiting for the FeatureFlagManager to load";

    public DatabaseMigrationException(Throwable th) {
        this.cause = th;
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
}
