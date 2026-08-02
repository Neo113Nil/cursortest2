package com.squareup.cash.clientsync.errors;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientsync/errors/ClientSyncServerPushError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClientSyncServerPushError extends ClientSyncReportedError {
    public final Exception cause;

    public ClientSyncServerPushError(Exception exc) {
        this.cause = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    /* renamed from: getGroupingDescriptor */
    public final String getMessage() {
        Exception exc = this.cause;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getSimpleName();
        }
        return "ClientSyncServerPushError:".concat(message);
    }
}
