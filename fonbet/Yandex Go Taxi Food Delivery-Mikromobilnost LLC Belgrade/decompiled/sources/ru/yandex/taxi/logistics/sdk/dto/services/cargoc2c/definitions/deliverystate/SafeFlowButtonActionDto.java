package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SafeFlowButtonActionDto;", "", "url", "", "commitProperties", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SafeFlowButtonActionDto$CommitPropertiesDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SafeFlowButtonActionDto$CommitPropertiesDto;)V", "getUrl", "()Ljava/lang/String;", "getCommitProperties", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SafeFlowButtonActionDto$CommitPropertiesDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CommitPropertiesDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SafeFlowButtonActionDto {
    private final CommitPropertiesDto commitProperties;
    private final String url;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SafeFlowButtonActionDto$CommitPropertiesDto;", "", "deliveryId", "", "canCreateOrderUntil", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TimestampDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TimestampDto;)V", "getDeliveryId", "()Ljava/lang/String;", "getCanCreateOrderUntil", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TimestampDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommitPropertiesDto {
        private final TimestampDto canCreateOrderUntil;
        private final String deliveryId;

        public CommitPropertiesDto(@Json(name = "delivery_id") String str, @Json(name = "can_create_order_until") TimestampDto timestampDto) {
            this.deliveryId = str;
            this.canCreateOrderUntil = timestampDto;
        }

        public static /* synthetic */ CommitPropertiesDto copy$default(CommitPropertiesDto commitPropertiesDto, String str, TimestampDto timestampDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commitPropertiesDto.deliveryId;
            }
            if ((i & 2) != 0) {
                timestampDto = commitPropertiesDto.canCreateOrderUntil;
            }
            return commitPropertiesDto.copy(str, timestampDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeliveryId() {
            return this.deliveryId;
        }

        /* renamed from: component2, reason: from getter */
        public final TimestampDto getCanCreateOrderUntil() {
            return this.canCreateOrderUntil;
        }

        public final CommitPropertiesDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "can_create_order_until") TimestampDto canCreateOrderUntil) {
            return new CommitPropertiesDto(deliveryId, canCreateOrderUntil);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommitPropertiesDto)) {
                return false;
            }
            CommitPropertiesDto commitPropertiesDto = (CommitPropertiesDto) other;
            return jl40.l(this.deliveryId, commitPropertiesDto.deliveryId) && jl40.l(this.canCreateOrderUntil, commitPropertiesDto.canCreateOrderUntil);
        }

        public final TimestampDto getCanCreateOrderUntil() {
            return this.canCreateOrderUntil;
        }

        public final String getDeliveryId() {
            return this.deliveryId;
        }

        public int hashCode() {
            return this.canCreateOrderUntil.hashCode() + (this.deliveryId.hashCode() * 31);
        }

        public String toString() {
            return "CommitPropertiesDto(deliveryId=" + this.deliveryId + ", canCreateOrderUntil=" + this.canCreateOrderUntil + Extension.C_BRAKE;
        }
    }

    public SafeFlowButtonActionDto(@Json(name = "url") String str, @Json(name = "commit_properties") CommitPropertiesDto commitPropertiesDto) {
        this.url = str;
        this.commitProperties = commitPropertiesDto;
    }

    public static /* synthetic */ SafeFlowButtonActionDto copy$default(SafeFlowButtonActionDto safeFlowButtonActionDto, String str, CommitPropertiesDto commitPropertiesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = safeFlowButtonActionDto.url;
        }
        if ((i & 2) != 0) {
            commitPropertiesDto = safeFlowButtonActionDto.commitProperties;
        }
        return safeFlowButtonActionDto.copy(str, commitPropertiesDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final CommitPropertiesDto getCommitProperties() {
        return this.commitProperties;
    }

    public final SafeFlowButtonActionDto copy(@Json(name = "url") String url, @Json(name = "commit_properties") CommitPropertiesDto commitProperties) {
        return new SafeFlowButtonActionDto(url, commitProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeFlowButtonActionDto)) {
            return false;
        }
        SafeFlowButtonActionDto safeFlowButtonActionDto = (SafeFlowButtonActionDto) other;
        return jl40.l(this.url, safeFlowButtonActionDto.url) && jl40.l(this.commitProperties, safeFlowButtonActionDto.commitProperties);
    }

    public final CommitPropertiesDto getCommitProperties() {
        return this.commitProperties;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.commitProperties.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        return "SafeFlowButtonActionDto(url=" + this.url + ", commitProperties=" + this.commitProperties + Extension.C_BRAKE;
    }
}
