package com.squareup.cash.clientsync.network;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class ClientSyncResponseContext implements ServerSyncResponse {
    public final ArrayList entityActions;
    public final ResyncPolicy resyncPolicy;

    public ClientSyncResponseContext(ArrayList arrayList, ResyncPolicy resyncPolicy) {
        this.entityActions = arrayList;
        this.resyncPolicy = resyncPolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientSyncResponseContext)) {
            return false;
        }
        ClientSyncResponseContext clientSyncResponseContext = (ClientSyncResponseContext) obj;
        return this.entityActions.equals(clientSyncResponseContext.entityActions) && this.resyncPolicy == clientSyncResponseContext.resyncPolicy;
    }

    public final int hashCode() {
        return this.resyncPolicy.hashCode() + (this.entityActions.hashCode() * 31);
    }

    public final String toString() {
        return "ClientSyncResponseContext(entityActions=" + this.entityActions + ", resyncPolicy=" + this.resyncPolicy + ")";
    }
}
