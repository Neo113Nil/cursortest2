package com.fidesmo.sec.delivery;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/fidesmo/sec/delivery/FetchOperationRequest;", "", "sessionId", "Ljava/util/UUID;", "operationResult", "Lcom/fidesmo/sec/delivery/OperationResult;", "(Ljava/util/UUID;Lcom/fidesmo/sec/delivery/OperationResult;)V", "getOperationResult", "()Lcom/fidesmo/sec/delivery/OperationResult;", "getSessionId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FetchOperationRequest {
    private final OperationResult operationResult;
    private final UUID sessionId;

    public FetchOperationRequest(UUID uuid, OperationResult operationResult) {
        uuid.getClass();
        this.sessionId = uuid;
        this.operationResult = operationResult;
    }

    public static /* synthetic */ FetchOperationRequest copy$default(FetchOperationRequest fetchOperationRequest, UUID uuid, OperationResult operationResult, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = fetchOperationRequest.sessionId;
        }
        if ((i & 2) != 0) {
            operationResult = fetchOperationRequest.operationResult;
        }
        return fetchOperationRequest.copy(uuid, operationResult);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final OperationResult getOperationResult() {
        return this.operationResult;
    }

    public final FetchOperationRequest copy(UUID sessionId, OperationResult operationResult) {
        sessionId.getClass();
        return new FetchOperationRequest(sessionId, operationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchOperationRequest)) {
            return false;
        }
        FetchOperationRequest fetchOperationRequest = (FetchOperationRequest) other;
        return Intrinsics.areEqual(this.sessionId, fetchOperationRequest.sessionId) && Intrinsics.areEqual(this.operationResult, fetchOperationRequest.operationResult);
    }

    public final OperationResult getOperationResult() {
        return this.operationResult;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode = this.sessionId.hashCode() * 31;
        OperationResult operationResult = this.operationResult;
        return hashCode + (operationResult == null ? 0 : operationResult.hashCode());
    }

    public String toString() {
        return "FetchOperationRequest(sessionId=" + this.sessionId + ", operationResult=" + this.operationResult + ')';
    }
}
