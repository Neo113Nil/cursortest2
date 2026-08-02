package com.fidesmo.sec.delivery;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/fidesmo/sec/delivery/SecRequest;", "", "uuid", "Ljava/util/UUID;", "responses", "", "", "(Ljava/util/UUID;Ljava/util/List;)V", "getResponses", "()Ljava/util/List;", "getUuid", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SecRequest {
    private final List<byte[]> responses;
    private final UUID uuid;

    public /* synthetic */ SecRequest(UUID uuid, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecRequest copy$default(SecRequest secRequest, UUID uuid, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = secRequest.uuid;
        }
        if ((i & 2) != 0) {
            list = secRequest.responses;
        }
        return secRequest.copy(uuid, list);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    public final List<byte[]> component2() {
        return this.responses;
    }

    public final SecRequest copy(UUID uuid, List<byte[]> responses) {
        return new SecRequest(uuid, responses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecRequest)) {
            return false;
        }
        SecRequest secRequest = (SecRequest) other;
        return Intrinsics.areEqual(this.uuid, secRequest.uuid) && Intrinsics.areEqual(this.responses, secRequest.responses);
    }

    public final List<byte[]> getResponses() {
        return this.responses;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        UUID uuid = this.uuid;
        int hashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        List<byte[]> list = this.responses;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SecRequest(uuid=");
        sb.append(this.uuid);
        sb.append(", responses=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, (List) this.responses, ')');
    }

    public SecRequest(UUID uuid, List<byte[]> list) {
        this.uuid = uuid;
        this.responses = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
