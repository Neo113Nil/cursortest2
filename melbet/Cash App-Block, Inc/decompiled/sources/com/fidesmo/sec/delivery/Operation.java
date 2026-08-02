package com.fidesmo.sec.delivery;

import com.fidesmo.sec.delivery.models.DeliveryProgress;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/fidesmo/sec/delivery/Operation;", "", "uuid", "Ljava/util/UUID;", "progress", "Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "(Ljava/util/UUID;Lcom/fidesmo/sec/delivery/models/DeliveryProgress;)V", "getProgress", "()Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "getUuid", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Operation {
    private final DeliveryProgress progress;
    private final UUID uuid;

    public /* synthetic */ Operation(UUID uuid, DeliveryProgress deliveryProgress, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : deliveryProgress);
    }

    public static /* synthetic */ Operation copy$default(Operation operation2, UUID uuid, DeliveryProgress deliveryProgress, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = operation2.uuid;
        }
        if ((i & 2) != 0) {
            deliveryProgress = operation2.progress;
        }
        return operation2.copy(uuid, deliveryProgress);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final DeliveryProgress getProgress() {
        return this.progress;
    }

    public final Operation copy(UUID uuid, DeliveryProgress progress) {
        return new Operation(uuid, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Operation)) {
            return false;
        }
        Operation operation2 = (Operation) other;
        return Intrinsics.areEqual(this.uuid, operation2.uuid) && Intrinsics.areEqual(this.progress, operation2.progress);
    }

    public final DeliveryProgress getProgress() {
        return this.progress;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        UUID uuid = this.uuid;
        int hashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        DeliveryProgress deliveryProgress = this.progress;
        return hashCode + (deliveryProgress != null ? deliveryProgress.hashCode() : 0);
    }

    public String toString() {
        return "Operation(uuid=" + this.uuid + ", progress=" + this.progress + ')';
    }

    public Operation(UUID uuid, DeliveryProgress deliveryProgress) {
        this.uuid = uuid;
        this.progress = deliveryProgress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Operation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
