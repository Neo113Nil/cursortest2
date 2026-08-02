package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DeliveryStateDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverystate/Responses$DeliveryStateResponseDto", "", "", "etag", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDto;", ClidProvider.STATE, "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDto;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverystate/Responses$DeliveryStateResponseDto;", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverystate/Responses$DeliveryStateResponseDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEtag", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeliveryStateDto;", "getState", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$DeliveryStateResponseDto {
    private final String etag;
    private final DeliveryStateDto state;

    public Responses$DeliveryStateResponseDto(@Json(name = "etag") String str, @Json(name = "state") DeliveryStateDto deliveryStateDto) {
        this.etag = str;
        this.state = deliveryStateDto;
    }

    public static /* synthetic */ Responses$DeliveryStateResponseDto copy$default(Responses$DeliveryStateResponseDto responses$DeliveryStateResponseDto, String str, DeliveryStateDto deliveryStateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responses$DeliveryStateResponseDto.etag;
        }
        if ((i & 2) != 0) {
            deliveryStateDto = responses$DeliveryStateResponseDto.state;
        }
        return responses$DeliveryStateResponseDto.copy(str, deliveryStateDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEtag() {
        return this.etag;
    }

    /* renamed from: component2, reason: from getter */
    public final DeliveryStateDto getState() {
        return this.state;
    }

    public final Responses$DeliveryStateResponseDto copy(@Json(name = "etag") String etag, @Json(name = "state") DeliveryStateDto state) {
        return new Responses$DeliveryStateResponseDto(etag, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Responses$DeliveryStateResponseDto)) {
            return false;
        }
        Responses$DeliveryStateResponseDto responses$DeliveryStateResponseDto = (Responses$DeliveryStateResponseDto) other;
        return jl40.l(this.etag, responses$DeliveryStateResponseDto.etag) && jl40.l(this.state, responses$DeliveryStateResponseDto.state);
    }

    public final String getEtag() {
        return this.etag;
    }

    public final DeliveryStateDto getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = this.etag.hashCode() * 31;
        DeliveryStateDto deliveryStateDto = this.state;
        return hashCode + (deliveryStateDto == null ? 0 : deliveryStateDto.hashCode());
    }

    public String toString() {
        return "DeliveryStateResponseDto(etag=" + this.etag + ", state=" + this.state + Extension.C_BRAKE;
    }
}
