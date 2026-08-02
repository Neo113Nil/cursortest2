package com.squareup.cash.clientsync.errors;

import java.util.Map;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/clientsync/errors/ClientSyncError;", "", "Metadata", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ClientSyncError extends Throwable {

    public interface Metadata {
        Map toMap();
    }

    public abstract String getGroupingIdentifier();

    public Metadata getMetadata() {
        return null;
    }
}
