package com.squareup.cash.clientsync.network;

import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GatewayTopicRequest {
    public final SyncRange range;
    public final SyncTopic topic;
    public final SyncTrigger trigger;

    public GatewayTopicRequest(SyncTopic syncTopic, SyncRange syncRange, SyncTrigger syncTrigger) {
        syncTopic.getClass();
        this.topic = syncTopic;
        this.range = syncRange;
        this.trigger = syncTrigger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayTopicRequest)) {
            return false;
        }
        GatewayTopicRequest gatewayTopicRequest = (GatewayTopicRequest) obj;
        return Intrinsics.areEqual(this.topic, gatewayTopicRequest.topic) && Intrinsics.areEqual(this.range, gatewayTopicRequest.range) && this.trigger == gatewayTopicRequest.trigger;
    }

    public final SyncRange getRange() {
        return this.range;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.topic.value) * 31;
        SyncRange syncRange = this.range;
        return this.trigger.hashCode() + ((hashCode + (syncRange == null ? 0 : syncRange.hashCode())) * 31);
    }

    public final String toString() {
        return "GatewayTopicRequest(topic=" + this.topic + ", range=" + this.range + ", trigger=" + this.trigger + ")";
    }
}
