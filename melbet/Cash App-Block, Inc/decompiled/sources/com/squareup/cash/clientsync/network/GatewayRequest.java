package com.squareup.cash.clientsync.network;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GatewayRequest {
    public final List legacyRanges;
    public final List topicRequests;

    public GatewayRequest(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.topicRequests = list;
        this.legacyRanges = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayRequest)) {
            return false;
        }
        GatewayRequest gatewayRequest = (GatewayRequest) obj;
        return Intrinsics.areEqual(this.topicRequests, gatewayRequest.topicRequests) && Intrinsics.areEqual(this.legacyRanges, gatewayRequest.legacyRanges);
    }

    public final List getLegacyRanges() {
        return this.legacyRanges;
    }

    public final List getTopicRequests() {
        return this.topicRequests;
    }

    public final int hashCode() {
        return this.legacyRanges.hashCode() + (this.topicRequests.hashCode() * 31);
    }

    public final String toString() {
        return "GatewayRequest(topicRequests=" + this.topicRequests + ", legacyRanges=" + this.legacyRanges + ")";
    }
}
