package com.fidesmo.sec.delivery;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/fidesmo/sec/delivery/ServiceErrorRequest;", "", "sessionId", "Ljava/util/UUID;", "message", "", "fatal", "", "details", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "getFatal", "()Ljava/lang/Boolean;", "setFatal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "setMessage", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/fidesmo/sec/delivery/ServiceErrorRequest;", "equals", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServiceErrorRequest {
    private String details;
    private Boolean fatal;
    private String message;
    private UUID sessionId;

    public /* synthetic */ ServiceErrorRequest(UUID uuid, String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ ServiceErrorRequest copy$default(ServiceErrorRequest serviceErrorRequest, UUID uuid, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = serviceErrorRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str = serviceErrorRequest.message;
        }
        if ((i & 4) != 0) {
            bool = serviceErrorRequest.fatal;
        }
        if ((i & 8) != 0) {
            str2 = serviceErrorRequest.details;
        }
        return serviceErrorRequest.copy(uuid, str, bool, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getFatal() {
        return this.fatal;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    public final ServiceErrorRequest copy(UUID sessionId, String message, Boolean fatal, String details) {
        return new ServiceErrorRequest(sessionId, message, fatal, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceErrorRequest)) {
            return false;
        }
        ServiceErrorRequest serviceErrorRequest = (ServiceErrorRequest) other;
        return Intrinsics.areEqual(this.sessionId, serviceErrorRequest.sessionId) && Intrinsics.areEqual(this.message, serviceErrorRequest.message) && Intrinsics.areEqual(this.fatal, serviceErrorRequest.fatal) && Intrinsics.areEqual(this.details, serviceErrorRequest.details);
    }

    public final String getDetails() {
        return this.details;
    }

    public final Boolean getFatal() {
        return this.fatal;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        UUID uuid = this.sessionId;
        int hashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.fatal;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.details;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDetails(String str) {
        this.details = str;
    }

    public final void setFatal(Boolean bool) {
        this.fatal = bool;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSessionId(UUID uuid) {
        this.sessionId = uuid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServiceErrorRequest(sessionId=");
        sb.append(this.sessionId);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", fatal=");
        sb.append(this.fatal);
        sb.append(", details=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.details, ')');
    }

    public ServiceErrorRequest(UUID uuid, String str, Boolean bool, String str2) {
        this.sessionId = uuid;
        this.message = str;
        this.fatal = bool;
        this.details = str2;
    }

    public ServiceErrorRequest() {
        this(null, null, null, null, 15, null);
    }
}
