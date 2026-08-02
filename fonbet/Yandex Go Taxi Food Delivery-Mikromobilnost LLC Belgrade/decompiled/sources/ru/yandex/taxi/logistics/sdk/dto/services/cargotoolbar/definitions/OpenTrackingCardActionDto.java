package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto;", "", "deliveryId", "", "expansion", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto$ExpansionDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto$ExpansionDto;)V", "getDeliveryId", "()Ljava/lang/String;", "getExpansion", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto$ExpansionDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ExpansionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OpenTrackingCardActionDto {
    private final String deliveryId;
    private final ExpansionDto expansion;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto$ExpansionDto;", "", "<init>", "(Ljava/lang/String;I)V", "ANCHORED", "EXPANDED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExpansionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ExpansionDto[] $VALUES;

        @Json(name = "anchored")
        public static final ExpansionDto ANCHORED = new ExpansionDto("ANCHORED", 0);

        @Json(name = "expanded")
        public static final ExpansionDto EXPANDED = new ExpansionDto("EXPANDED", 1);

        private static final /* synthetic */ ExpansionDto[] $values() {
            return new ExpansionDto[]{ANCHORED, EXPANDED};
        }

        static {
            ExpansionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ExpansionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ExpansionDto valueOf(String str) {
            return (ExpansionDto) Enum.valueOf(ExpansionDto.class, str);
        }

        public static ExpansionDto[] values() {
            return (ExpansionDto[]) $VALUES.clone();
        }
    }

    public OpenTrackingCardActionDto(@Json(name = "delivery_id") String str, @Json(name = "expansion") ExpansionDto expansionDto) {
        this.deliveryId = str;
        this.expansion = expansionDto;
    }

    public static /* synthetic */ OpenTrackingCardActionDto copy$default(OpenTrackingCardActionDto openTrackingCardActionDto, String str, ExpansionDto expansionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openTrackingCardActionDto.deliveryId;
        }
        if ((i & 2) != 0) {
            expansionDto = openTrackingCardActionDto.expansion;
        }
        return openTrackingCardActionDto.copy(str, expansionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final ExpansionDto getExpansion() {
        return this.expansion;
    }

    public final OpenTrackingCardActionDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "expansion") ExpansionDto expansion) {
        return new OpenTrackingCardActionDto(deliveryId, expansion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenTrackingCardActionDto)) {
            return false;
        }
        OpenTrackingCardActionDto openTrackingCardActionDto = (OpenTrackingCardActionDto) other;
        return jl40.l(this.deliveryId, openTrackingCardActionDto.deliveryId) && this.expansion == openTrackingCardActionDto.expansion;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final ExpansionDto getExpansion() {
        return this.expansion;
    }

    public int hashCode() {
        int hashCode = this.deliveryId.hashCode() * 31;
        ExpansionDto expansionDto = this.expansion;
        return hashCode + (expansionDto == null ? 0 : expansionDto.hashCode());
    }

    public String toString() {
        return "OpenTrackingCardActionDto(deliveryId=" + this.deliveryId + ", expansion=" + this.expansion + Extension.C_BRAKE;
    }
}
