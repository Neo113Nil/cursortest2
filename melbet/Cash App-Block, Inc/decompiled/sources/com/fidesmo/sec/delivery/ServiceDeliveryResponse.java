package com.fidesmo.sec.delivery;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/fidesmo/sec/delivery/ServiceDeliveryResponse;", "", "sessionId", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServiceDeliveryResponse {
    private UUID sessionId;

    public /* synthetic */ ServiceDeliveryResponse(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid);
    }

    public static /* synthetic */ ServiceDeliveryResponse copy$default(ServiceDeliveryResponse serviceDeliveryResponse, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = serviceDeliveryResponse.sessionId;
        }
        return serviceDeliveryResponse.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final ServiceDeliveryResponse copy(UUID sessionId) {
        return new ServiceDeliveryResponse(sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ServiceDeliveryResponse) && Intrinsics.areEqual(this.sessionId, ((ServiceDeliveryResponse) other).sessionId);
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        UUID uuid = this.sessionId;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    public final void setSessionId(UUID uuid) {
        this.sessionId = uuid;
    }

    public String toString() {
        return "ServiceDeliveryResponse(sessionId=" + this.sessionId + ')';
    }

    public ServiceDeliveryResponse(UUID uuid) {
        this.sessionId = uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceDeliveryResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
