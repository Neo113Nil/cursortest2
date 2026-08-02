package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDestinationInfoDto;", "", "deliveryInterval", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDeliveryIntervalDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDeliveryIntervalDto;)V", "getDeliveryInterval", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDeliveryIntervalDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LpEditDestinationInfoDto {
    private final LpEditDeliveryIntervalDto deliveryInterval;

    public LpEditDestinationInfoDto(@Json(name = "delivery_interval") LpEditDeliveryIntervalDto lpEditDeliveryIntervalDto) {
        this.deliveryInterval = lpEditDeliveryIntervalDto;
    }

    public static /* synthetic */ LpEditDestinationInfoDto copy$default(LpEditDestinationInfoDto lpEditDestinationInfoDto, LpEditDeliveryIntervalDto lpEditDeliveryIntervalDto, int i, Object obj) {
        if ((i & 1) != 0) {
            lpEditDeliveryIntervalDto = lpEditDestinationInfoDto.deliveryInterval;
        }
        return lpEditDestinationInfoDto.copy(lpEditDeliveryIntervalDto);
    }

    /* renamed from: component1, reason: from getter */
    public final LpEditDeliveryIntervalDto getDeliveryInterval() {
        return this.deliveryInterval;
    }

    public final LpEditDestinationInfoDto copy(@Json(name = "delivery_interval") LpEditDeliveryIntervalDto deliveryInterval) {
        return new LpEditDestinationInfoDto(deliveryInterval);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LpEditDestinationInfoDto) && jl40.l(this.deliveryInterval, ((LpEditDestinationInfoDto) other).deliveryInterval);
    }

    public final LpEditDeliveryIntervalDto getDeliveryInterval() {
        return this.deliveryInterval;
    }

    public int hashCode() {
        LpEditDeliveryIntervalDto lpEditDeliveryIntervalDto = this.deliveryInterval;
        if (lpEditDeliveryIntervalDto == null) {
            return 0;
        }
        return lpEditDeliveryIntervalDto.hashCode();
    }

    public String toString() {
        return "LpEditDestinationInfoDto(deliveryInterval=" + this.deliveryInterval + Extension.C_BRAKE;
    }
}
