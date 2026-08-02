package com.squareup.cash.clientsync.errors;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientsync/errors/ClientSyncMultiplatformError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClientSyncMultiplatformError extends ClientSyncReportedError {
    public final ClientSyncError cause;
    public final String groupingDescriptor;
    public final boolean isBackgroundError;
    public final String message;
    public final Map metadata;

    public ClientSyncMultiplatformError(String str, ClientSyncError clientSyncError, String str2, Map map) {
        map.getClass();
        this.message = str;
        this.cause = clientSyncError;
        this.groupingDescriptor = str2;
        this.metadata = map;
        this.isBackgroundError = true;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncReportedError
    /* renamed from: isBackgroundError, reason: from getter */
    public final boolean getIsBackgroundError() {
        return this.isBackgroundError;
    }
}
