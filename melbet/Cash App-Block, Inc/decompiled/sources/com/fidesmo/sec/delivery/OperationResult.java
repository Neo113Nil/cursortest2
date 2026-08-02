package com.fidesmo.sec.delivery;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/fidesmo/sec/delivery/OperationResult;", "", "operationId", "Ljava/util/UUID;", "fields", "", "", "ephemeralKey", "", "(Ljava/util/UUID;Ljava/util/Map;[B)V", "getEphemeralKey", "()[B", "getFields", "()Ljava/util/Map;", "getOperationId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OperationResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int statusCode = 200;
    private final byte[] ephemeralKey;
    private final Map<String, String> fields;
    private final UUID operationId;

    public /* synthetic */ OperationResult(UUID uuid, Map map, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperationResult copy$default(OperationResult operationResult, UUID uuid, Map map, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = operationResult.operationId;
        }
        if ((i & 2) != 0) {
            map = operationResult.fields;
        }
        if ((i & 4) != 0) {
            bArr = operationResult.ephemeralKey;
        }
        return operationResult.copy(uuid, map, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOperationId() {
        return this.operationId;
    }

    public final Map<String, String> component2() {
        return this.fields;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final OperationResult copy(UUID operationId, Map<String, String> fields, byte[] ephemeralKey) {
        operationId.getClass();
        return new OperationResult(operationId, fields, ephemeralKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperationResult)) {
            return false;
        }
        OperationResult operationResult = (OperationResult) other;
        return Intrinsics.areEqual(this.operationId, operationResult.operationId) && Intrinsics.areEqual(this.fields, operationResult.fields) && Intrinsics.areEqual(this.ephemeralKey, operationResult.ephemeralKey);
    }

    public final byte[] getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final Map<String, String> getFields() {
        return this.fields;
    }

    public final UUID getOperationId() {
        return this.operationId;
    }

    public int hashCode() {
        int hashCode = this.operationId.hashCode() * 31;
        Map<String, String> map = this.fields;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        byte[] bArr = this.ephemeralKey;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return "OperationResult(operationId=" + this.operationId + ", fields=" + this.fields + ", ephemeralKey=" + Arrays.toString(this.ephemeralKey) + ')';
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/delivery/OperationResult$Companion;", "", "()V", "statusCode", "", "getStatusCode", "()I", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getStatusCode() {
            return OperationResult.statusCode;
        }

        private Companion() {
        }
    }

    public OperationResult(UUID uuid, Map<String, String> map, byte[] bArr) {
        uuid.getClass();
        this.operationId = uuid;
        this.fields = map;
        this.ephemeralKey = bArr;
    }
}
