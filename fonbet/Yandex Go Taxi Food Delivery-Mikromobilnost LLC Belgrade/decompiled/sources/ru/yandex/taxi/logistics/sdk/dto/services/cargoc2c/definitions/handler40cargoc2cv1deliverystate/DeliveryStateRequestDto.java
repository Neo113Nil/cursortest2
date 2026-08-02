package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentItemTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverystate/DeliveryStateRequestDto;", "", "deliveryId", "", "supportedContentItemTypes", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemTypeDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDeliveryId", "()Ljava/lang/String;", "getSupportedContentItemTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryStateRequestDto {
    private final String deliveryId;
    private final List<ContentItemTypeDto> supportedContentItemTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryStateRequestDto(@Json(name = "delivery_id") String str, @Json(name = "supported_content_item_types") List<? extends ContentItemTypeDto> list) {
        this.deliveryId = str;
        this.supportedContentItemTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryStateRequestDto copy$default(DeliveryStateRequestDto deliveryStateRequestDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryStateRequestDto.deliveryId;
        }
        if ((i & 2) != 0) {
            list = deliveryStateRequestDto.supportedContentItemTypes;
        }
        return deliveryStateRequestDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final List<ContentItemTypeDto> component2() {
        return this.supportedContentItemTypes;
    }

    public final DeliveryStateRequestDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "supported_content_item_types") List<? extends ContentItemTypeDto> supportedContentItemTypes) {
        return new DeliveryStateRequestDto(deliveryId, supportedContentItemTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryStateRequestDto)) {
            return false;
        }
        DeliveryStateRequestDto deliveryStateRequestDto = (DeliveryStateRequestDto) other;
        return jl40.l(this.deliveryId, deliveryStateRequestDto.deliveryId) && jl40.l(this.supportedContentItemTypes, deliveryStateRequestDto.supportedContentItemTypes);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final List<ContentItemTypeDto> getSupportedContentItemTypes() {
        return this.supportedContentItemTypes;
    }

    public int hashCode() {
        int hashCode = this.deliveryId.hashCode() * 31;
        List<ContentItemTypeDto> list = this.supportedContentItemTypes;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return nnm.h("DeliveryStateRequestDto(deliveryId=", this.deliveryId, ", supportedContentItemTypes=", Extension.C_BRAKE, this.supportedContentItemTypes);
    }
}
