package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.launch;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/launch/DeliveryLaunchResponseDto;", "", "typedConfigs", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto;)V", "getTypedConfigs", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryLaunchResponseDto {
    private final TypedConfigsDto typedConfigs;

    public DeliveryLaunchResponseDto(@Json(name = "typed_configs") TypedConfigsDto typedConfigsDto) {
        this.typedConfigs = typedConfigsDto;
    }

    public static /* synthetic */ DeliveryLaunchResponseDto copy$default(DeliveryLaunchResponseDto deliveryLaunchResponseDto, TypedConfigsDto typedConfigsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            typedConfigsDto = deliveryLaunchResponseDto.typedConfigs;
        }
        return deliveryLaunchResponseDto.copy(typedConfigsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TypedConfigsDto getTypedConfigs() {
        return this.typedConfigs;
    }

    public final DeliveryLaunchResponseDto copy(@Json(name = "typed_configs") TypedConfigsDto typedConfigs) {
        return new DeliveryLaunchResponseDto(typedConfigs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveryLaunchResponseDto) && jl40.l(this.typedConfigs, ((DeliveryLaunchResponseDto) other).typedConfigs);
    }

    public final TypedConfigsDto getTypedConfigs() {
        return this.typedConfigs;
    }

    public int hashCode() {
        return this.typedConfigs.hashCode();
    }

    public String toString() {
        return "DeliveryLaunchResponseDto(typedConfigs=" + this.typedConfigs + Extension.C_BRAKE;
    }
}
