package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/DeliveriesRequestDto;", "", "deliveries", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/DeliveriesRequestDto$DeliveriesDto;", "<init>", "(Ljava/util/List;)V", "getDeliveries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DeliveriesDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveriesRequestDto {
    private final List<DeliveriesDto> deliveries;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/DeliveriesRequestDto$DeliveriesDto;", "", "deliveryId", "", "<init>", "(Ljava/lang/String;)V", "getDeliveryId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveriesDto {
        private final String deliveryId;

        public DeliveriesDto(@Json(name = "delivery_id") String str) {
            this.deliveryId = str;
        }

        public static /* synthetic */ DeliveriesDto copy$default(DeliveriesDto deliveriesDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deliveriesDto.deliveryId;
            }
            return deliveriesDto.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeliveryId() {
            return this.deliveryId;
        }

        public final DeliveriesDto copy(@Json(name = "delivery_id") String deliveryId) {
            return new DeliveriesDto(deliveryId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeliveriesDto) && jl40.l(this.deliveryId, ((DeliveriesDto) other).deliveryId);
        }

        public final String getDeliveryId() {
            return this.deliveryId;
        }

        public int hashCode() {
            return this.deliveryId.hashCode();
        }

        public String toString() {
            return oyr.p("DeliveriesDto(deliveryId=", this.deliveryId, Extension.C_BRAKE);
        }
    }

    public DeliveriesRequestDto(@Json(name = "deliveries") List<DeliveriesDto> list) {
        this.deliveries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveriesRequestDto copy$default(DeliveriesRequestDto deliveriesRequestDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deliveriesRequestDto.deliveries;
        }
        return deliveriesRequestDto.copy(list);
    }

    public final List<DeliveriesDto> component1() {
        return this.deliveries;
    }

    public final DeliveriesRequestDto copy(@Json(name = "deliveries") List<DeliveriesDto> deliveries) {
        return new DeliveriesRequestDto(deliveries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveriesRequestDto) && jl40.l(this.deliveries, ((DeliveriesRequestDto) other).deliveries);
    }

    public final List<DeliveriesDto> getDeliveries() {
        return this.deliveries;
    }

    public int hashCode() {
        return this.deliveries.hashCode();
    }

    public String toString() {
        return tse0.k("DeliveriesRequestDto(deliveries=", Extension.C_BRAKE, this.deliveries);
    }
}
