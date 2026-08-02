package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/Responses$DeliveryTrackingsResponseDto", "", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingItemDto;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/Responses$DeliveryTrackingsResponseDto;", "copy", "(Ljava/util/List;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/Responses$DeliveryTrackingsResponseDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$DeliveryTrackingsResponseDto {
    private final List<DeliveryTrackingItemDto> items;

    public Responses$DeliveryTrackingsResponseDto(@Json(name = "items") List<DeliveryTrackingItemDto> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Responses$DeliveryTrackingsResponseDto copy$default(Responses$DeliveryTrackingsResponseDto responses$DeliveryTrackingsResponseDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = responses$DeliveryTrackingsResponseDto.items;
        }
        return responses$DeliveryTrackingsResponseDto.copy(list);
    }

    public final List<DeliveryTrackingItemDto> component1() {
        return this.items;
    }

    public final Responses$DeliveryTrackingsResponseDto copy(@Json(name = "items") List<DeliveryTrackingItemDto> items) {
        return new Responses$DeliveryTrackingsResponseDto(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Responses$DeliveryTrackingsResponseDto) && jl40.l(this.items, ((Responses$DeliveryTrackingsResponseDto) other).items);
    }

    public final List<DeliveryTrackingItemDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return tse0.k("DeliveryTrackingsResponseDto(items=", Extension.C_BRAKE, this.items);
    }
}
