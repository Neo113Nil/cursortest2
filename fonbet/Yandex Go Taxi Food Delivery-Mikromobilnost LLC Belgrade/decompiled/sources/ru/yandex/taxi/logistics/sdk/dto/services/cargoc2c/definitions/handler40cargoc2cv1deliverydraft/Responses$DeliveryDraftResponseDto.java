package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverydraft;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0007J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/Responses$DeliveryDraftResponseDto", "", "", "deliveryId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/Responses$DeliveryDraftResponseDto;", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/Responses$DeliveryDraftResponseDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeliveryId", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$DeliveryDraftResponseDto {
    private final String deliveryId;

    public Responses$DeliveryDraftResponseDto(@Json(name = "delivery_id") String str) {
        this.deliveryId = str;
    }

    public static /* synthetic */ Responses$DeliveryDraftResponseDto copy$default(Responses$DeliveryDraftResponseDto responses$DeliveryDraftResponseDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responses$DeliveryDraftResponseDto.deliveryId;
        }
        return responses$DeliveryDraftResponseDto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final Responses$DeliveryDraftResponseDto copy(@Json(name = "delivery_id") String deliveryId) {
        return new Responses$DeliveryDraftResponseDto(deliveryId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Responses$DeliveryDraftResponseDto) && jl40.l(this.deliveryId, ((Responses$DeliveryDraftResponseDto) other).deliveryId);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public int hashCode() {
        return this.deliveryId.hashCode();
    }

    public String toString() {
        return oyr.p("DeliveryDraftResponseDto(deliveryId=", this.deliveryId, Extension.C_BRAKE);
    }
}
