package com.squareup.cash.clientsync.network;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.clientsync.models.SyncRange;
import com.squareup.cash.clientsync.models.SyncTopic;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class GatewayTopicResponse {
    public final ArrayList entityActions;
    public final boolean hasMore;
    public final SyncRange range;
    public final ResyncPolicy resyncType;
    public final SyncTopic topic;

    public GatewayTopicResponse(SyncTopic syncTopic, SyncRange syncRange, ArrayList arrayList, boolean z, ResyncPolicy resyncPolicy) {
        this.topic = syncTopic;
        this.range = syncRange;
        this.entityActions = arrayList;
        this.hasMore = z;
        this.resyncType = resyncPolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayTopicResponse)) {
            return false;
        }
        GatewayTopicResponse gatewayTopicResponse = (GatewayTopicResponse) obj;
        return this.topic.equals(gatewayTopicResponse.topic) && this.range.equals(gatewayTopicResponse.range) && this.entityActions.equals(gatewayTopicResponse.entityActions) && this.hasMore == gatewayTopicResponse.hasMore && this.resyncType == gatewayTopicResponse.resyncType;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final SyncTopic getTopic() {
        return this.topic;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.entityActions, (this.range.hashCode() + (Integer.hashCode(this.topic.value) * 31)) * 31, 31), 31, this.hasMore);
        ResyncPolicy resyncPolicy = this.resyncType;
        return m + (resyncPolicy == null ? 0 : resyncPolicy.hashCode());
    }

    public final String toString() {
        return "GatewayTopicResponse(topic=" + this.topic + ", range=" + this.range + ", entityActions=" + this.entityActions + ", hasMore=" + this.hasMore + ", resyncType=" + this.resyncType + ")";
    }
}
