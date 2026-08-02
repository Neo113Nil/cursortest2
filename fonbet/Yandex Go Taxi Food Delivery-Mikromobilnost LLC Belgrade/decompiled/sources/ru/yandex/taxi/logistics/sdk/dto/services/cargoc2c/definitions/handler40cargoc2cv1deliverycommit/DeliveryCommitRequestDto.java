package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycommit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycommit/DeliveryCommitRequestDto;", "", "deliveryId", "", "revision", "", "<init>", "(Ljava/lang/String;J)V", "getDeliveryId", "()Ljava/lang/String;", "getRevision", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryCommitRequestDto {
    private final String deliveryId;
    private final long revision;

    public /* synthetic */ DeliveryCommitRequestDto(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j);
    }

    public static /* synthetic */ DeliveryCommitRequestDto copy$default(DeliveryCommitRequestDto deliveryCommitRequestDto, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCommitRequestDto.deliveryId;
        }
        if ((i & 2) != 0) {
            j = deliveryCommitRequestDto.revision;
        }
        return deliveryCommitRequestDto.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRevision() {
        return this.revision;
    }

    public final DeliveryCommitRequestDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "revision") long revision) {
        return new DeliveryCommitRequestDto(deliveryId, revision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryCommitRequestDto)) {
            return false;
        }
        DeliveryCommitRequestDto deliveryCommitRequestDto = (DeliveryCommitRequestDto) other;
        return jl40.l(this.deliveryId, deliveryCommitRequestDto.deliveryId) && this.revision == deliveryCommitRequestDto.revision;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final long getRevision() {
        return this.revision;
    }

    public int hashCode() {
        return Long.hashCode(this.revision) + (this.deliveryId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder l = x4e.l("DeliveryCommitRequestDto(deliveryId=", this.deliveryId, ", revision=", this.revision);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public DeliveryCommitRequestDto(@Json(name = "delivery_id") String str, @Json(name = "revision") long j) {
        this.deliveryId = str;
        this.revision = j;
    }
}
