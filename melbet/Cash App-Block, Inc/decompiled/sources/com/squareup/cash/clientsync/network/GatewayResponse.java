package com.squareup.cash.clientsync.network;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class GatewayResponse implements ServerSyncResponse {
    public final ArrayList topicErrors;
    public final ArrayList topicResponses;

    public GatewayResponse(ArrayList arrayList, ArrayList arrayList2) {
        this.topicResponses = arrayList;
        this.topicErrors = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayResponse)) {
            return false;
        }
        GatewayResponse gatewayResponse = (GatewayResponse) obj;
        return this.topicResponses.equals(gatewayResponse.topicResponses) && this.topicErrors.equals(gatewayResponse.topicErrors);
    }

    public final List getTopicResponses() {
        return this.topicResponses;
    }

    public final int hashCode() {
        return this.topicErrors.hashCode() + (this.topicResponses.hashCode() * 31);
    }

    public final String toString() {
        return "GatewayResponse(topicResponses=" + this.topicResponses + ", topicErrors=" + this.topicErrors + ")";
    }
}
