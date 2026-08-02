package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverydraft;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest.AdditionalDeliveryDescriptionForCreationDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/DeliveryDraftRequestDto;", "", "offerId", "", "additionalDeliveryDescription", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDto;)V", "getOfferId", "()Ljava/lang/String;", "getAdditionalDeliveryDescription", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryDraftRequestDto {
    private final AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescription;
    private final String offerId;

    public DeliveryDraftRequestDto(@Json(name = "offer_id") String str, @Json(name = "additional_delivery_description") AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescriptionForCreationDto) {
        this.offerId = str;
        this.additionalDeliveryDescription = additionalDeliveryDescriptionForCreationDto;
    }

    public static /* synthetic */ DeliveryDraftRequestDto copy$default(DeliveryDraftRequestDto deliveryDraftRequestDto, String str, AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescriptionForCreationDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryDraftRequestDto.offerId;
        }
        if ((i & 2) != 0) {
            additionalDeliveryDescriptionForCreationDto = deliveryDraftRequestDto.additionalDeliveryDescription;
        }
        return deliveryDraftRequestDto.copy(str, additionalDeliveryDescriptionForCreationDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component2, reason: from getter */
    public final AdditionalDeliveryDescriptionForCreationDto getAdditionalDeliveryDescription() {
        return this.additionalDeliveryDescription;
    }

    public final DeliveryDraftRequestDto copy(@Json(name = "offer_id") String offerId, @Json(name = "additional_delivery_description") AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescription) {
        return new DeliveryDraftRequestDto(offerId, additionalDeliveryDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDraftRequestDto)) {
            return false;
        }
        DeliveryDraftRequestDto deliveryDraftRequestDto = (DeliveryDraftRequestDto) other;
        return jl40.l(this.offerId, deliveryDraftRequestDto.offerId) && jl40.l(this.additionalDeliveryDescription, deliveryDraftRequestDto.additionalDeliveryDescription);
    }

    public final AdditionalDeliveryDescriptionForCreationDto getAdditionalDeliveryDescription() {
        return this.additionalDeliveryDescription;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public int hashCode() {
        return this.additionalDeliveryDescription.hashCode() + (this.offerId.hashCode() * 31);
    }

    public String toString() {
        return "DeliveryDraftRequestDto(offerId=" + this.offerId + ", additionalDeliveryDescription=" + this.additionalDeliveryDescription + Extension.C_BRAKE;
    }
}
