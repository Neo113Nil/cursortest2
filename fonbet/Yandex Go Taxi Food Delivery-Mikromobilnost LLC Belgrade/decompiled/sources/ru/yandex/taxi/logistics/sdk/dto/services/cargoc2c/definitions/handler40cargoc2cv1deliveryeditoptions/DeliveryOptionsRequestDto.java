package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryeditoptions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ExtendStoragePeriodDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto;", "", "deliveryId", "", "requestId", "payload", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto;)V", "getDeliveryId", "()Ljava/lang/String;", "getRequestId", "getPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PayloadDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryOptionsRequestDto {
    private final String deliveryId;
    private final PayloadDto payload;
    private final String requestId;

    public DeliveryOptionsRequestDto(@Json(name = "delivery_id") String str, @Json(name = "request_id") String str2, @Json(name = "payload") PayloadDto payloadDto) {
        this.deliveryId = str;
        this.requestId = str2;
        this.payload = payloadDto;
    }

    public static /* synthetic */ DeliveryOptionsRequestDto copy$default(DeliveryOptionsRequestDto deliveryOptionsRequestDto, String str, String str2, PayloadDto payloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryOptionsRequestDto.deliveryId;
        }
        if ((i & 2) != 0) {
            str2 = deliveryOptionsRequestDto.requestId;
        }
        if ((i & 4) != 0) {
            payloadDto = deliveryOptionsRequestDto.payload;
        }
        return deliveryOptionsRequestDto.copy(str, str2, payloadDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component3, reason: from getter */
    public final PayloadDto getPayload() {
        return this.payload;
    }

    public final DeliveryOptionsRequestDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "request_id") String requestId, @Json(name = "payload") PayloadDto payload) {
        return new DeliveryOptionsRequestDto(deliveryId, requestId, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOptionsRequestDto)) {
            return false;
        }
        DeliveryOptionsRequestDto deliveryOptionsRequestDto = (DeliveryOptionsRequestDto) other;
        return jl40.l(this.deliveryId, deliveryOptionsRequestDto.deliveryId) && jl40.l(this.requestId, deliveryOptionsRequestDto.requestId) && jl40.l(this.payload, deliveryOptionsRequestDto.payload);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final PayloadDto getPayload() {
        return this.payload;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.payload.hashCode() + unr0.b(this.deliveryId.hashCode() * 31, 31, this.requestId);
    }

    public String toString() {
        String str = this.deliveryId;
        String str2 = this.requestId;
        PayloadDto payloadDto = this.payload;
        StringBuilder v = b64.v("DeliveryOptionsRequestDto(deliveryId=", str, ", requestId=", str2, ", payload=");
        v.append(payloadDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto;", "", "Payload_StoragePeriodDto", "Unknown_PayloadDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto$Payload_StoragePeriodDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto$Unknown_PayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PayloadDto {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto$Unknown_PayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto$Unknown_PayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_PayloadDto extends PayloadDto {
            public final String a;

            public Unknown_PayloadDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_PayloadDto copy(@Json(name = "type") String type) {
                return new Unknown_PayloadDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_PayloadDto) && jl40.l(this.a, ((Unknown_PayloadDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_PayloadDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_PayloadDto() {
                this(0);
            }

            public /* synthetic */ Unknown_PayloadDto(int i) {
                this("unknown");
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto$Payload_StoragePeriodDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ExtendStoragePeriodDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ExtendStoragePeriodDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ExtendStoragePeriodDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/DeliveryOptionsRequestDto$PayloadDto$Payload_StoragePeriodDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Payload_StoragePeriodDto extends PayloadDto {
            public final String a;
            public final ExtendStoragePeriodDto b;

            public Payload_StoragePeriodDto(@Json(name = "type") String str, ExtendStoragePeriodDto extendStoragePeriodDto) {
                this.a = str;
                this.b = extendStoragePeriodDto;
            }

            public final Payload_StoragePeriodDto copy(@Json(name = "type") String type, ExtendStoragePeriodDto value) {
                return new Payload_StoragePeriodDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Payload_StoragePeriodDto)) {
                    return false;
                }
                Payload_StoragePeriodDto payload_StoragePeriodDto = (Payload_StoragePeriodDto) obj;
                return jl40.l(this.a, payload_StoragePeriodDto.a) && jl40.l(this.b, payload_StoragePeriodDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Payload_StoragePeriodDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }

            public /* synthetic */ Payload_StoragePeriodDto(ExtendStoragePeriodDto extendStoragePeriodDto) {
                this("storage_period", extendStoragePeriodDto);
            }
        }
    }
}
