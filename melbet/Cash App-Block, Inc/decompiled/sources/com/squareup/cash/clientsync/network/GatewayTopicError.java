package com.squareup.cash.clientsync.network;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.models.SyncRange;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GatewayTopicError {
    public final Integer errorCode;
    public final String errorMessage;
    public final SyncRange range;
    public final GatewayTopicRequest request;
    public final Integer retryAfterSeconds;

    public GatewayTopicError(GatewayTopicRequest gatewayTopicRequest, SyncRange syncRange, Integer num, String str, Integer num2) {
        this.request = gatewayTopicRequest;
        this.range = syncRange;
        this.errorCode = num;
        this.errorMessage = str;
        this.retryAfterSeconds = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayTopicError)) {
            return false;
        }
        GatewayTopicError gatewayTopicError = (GatewayTopicError) obj;
        return this.request.equals(gatewayTopicError.request) && Intrinsics.areEqual(this.range, gatewayTopicError.range) && Intrinsics.areEqual(this.errorCode, gatewayTopicError.errorCode) && Intrinsics.areEqual(this.errorMessage, gatewayTopicError.errorMessage) && Intrinsics.areEqual(this.retryAfterSeconds, gatewayTopicError.retryAfterSeconds);
    }

    public final int hashCode() {
        int hashCode = this.request.hashCode() * 31;
        SyncRange syncRange = this.range;
        int hashCode2 = (hashCode + (syncRange == null ? 0 : syncRange.hashCode())) * 31;
        Integer num = this.errorCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorMessage;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.retryAfterSeconds;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GatewayTopicError(request=");
        sb.append(this.request);
        sb.append(", range=");
        sb.append(this.range);
        sb.append(", errorCode=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.errorCode, ", errorMessage=", this.errorMessage, ", retryAfterSeconds=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.retryAfterSeconds, ")");
    }
}
