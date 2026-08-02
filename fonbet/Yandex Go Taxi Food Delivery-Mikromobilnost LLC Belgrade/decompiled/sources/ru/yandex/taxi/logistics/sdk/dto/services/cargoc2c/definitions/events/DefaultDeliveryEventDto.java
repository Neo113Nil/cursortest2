package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;", "", "deliveryId", "", "commitRevision", "", "webTrackingUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getDeliveryId", "()Ljava/lang/String;", "getCommitRevision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWebTrackingUrl", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DefaultDeliveryEventDto {
    private final Integer commitRevision;
    private final String deliveryId;
    private final String webTrackingUrl;

    public DefaultDeliveryEventDto(@Json(name = "delivery_id") String str, @Json(name = "commit_revision") Integer num, @Json(name = "web_tracking_url") String str2) {
        this.deliveryId = str;
        this.commitRevision = num;
        this.webTrackingUrl = str2;
    }

    public static /* synthetic */ DefaultDeliveryEventDto copy$default(DefaultDeliveryEventDto defaultDeliveryEventDto, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultDeliveryEventDto.deliveryId;
        }
        if ((i & 2) != 0) {
            num = defaultDeliveryEventDto.commitRevision;
        }
        if ((i & 4) != 0) {
            str2 = defaultDeliveryEventDto.webTrackingUrl;
        }
        return defaultDeliveryEventDto.copy(str, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCommitRevision() {
        return this.commitRevision;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWebTrackingUrl() {
        return this.webTrackingUrl;
    }

    public final DefaultDeliveryEventDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "commit_revision") Integer commitRevision, @Json(name = "web_tracking_url") String webTrackingUrl) {
        return new DefaultDeliveryEventDto(deliveryId, commitRevision, webTrackingUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultDeliveryEventDto)) {
            return false;
        }
        DefaultDeliveryEventDto defaultDeliveryEventDto = (DefaultDeliveryEventDto) other;
        return jl40.l(this.deliveryId, defaultDeliveryEventDto.deliveryId) && jl40.l(this.commitRevision, defaultDeliveryEventDto.commitRevision) && jl40.l(this.webTrackingUrl, defaultDeliveryEventDto.webTrackingUrl);
    }

    public final Integer getCommitRevision() {
        return this.commitRevision;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final String getWebTrackingUrl() {
        return this.webTrackingUrl;
    }

    public int hashCode() {
        int hashCode = this.deliveryId.hashCode() * 31;
        Integer num = this.commitRevision;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.webTrackingUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.deliveryId;
        Integer num = this.commitRevision;
        return oyr.t(n.q("DefaultDeliveryEventDto(deliveryId=", num, str, ", commitRevision=", ", webTrackingUrl="), this.webTrackingUrl, Extension.C_BRAKE);
    }
}
