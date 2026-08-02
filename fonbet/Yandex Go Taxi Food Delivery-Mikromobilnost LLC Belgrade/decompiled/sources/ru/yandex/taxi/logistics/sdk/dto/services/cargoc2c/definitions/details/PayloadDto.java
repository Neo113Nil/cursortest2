package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "", "Payload_CopyPayloadDto", "Payload_ActionPayloadDto", "Unknown_PayloadDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Payload_ActionPayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Payload_CopyPayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Unknown_PayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class PayloadDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Payload_ActionPayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DeliveryActionPayloadDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DeliveryActionPayloadDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DeliveryActionPayloadDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Payload_ActionPayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Payload_ActionPayloadDto extends PayloadDto {
        public final String a;
        public final DeliveryActionPayloadDto b;

        public Payload_ActionPayloadDto(@Json(name = "type") String str, DeliveryActionPayloadDto deliveryActionPayloadDto) {
            this.a = str;
            this.b = deliveryActionPayloadDto;
        }

        public final Payload_ActionPayloadDto copy(@Json(name = "type") String type, DeliveryActionPayloadDto value) {
            return new Payload_ActionPayloadDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload_ActionPayloadDto)) {
                return false;
            }
            Payload_ActionPayloadDto payload_ActionPayloadDto = (Payload_ActionPayloadDto) obj;
            return this.a.equals(payload_ActionPayloadDto.a) && this.b.equals(payload_ActionPayloadDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Payload_ActionPayloadDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Payload_CopyPayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/CopyPayloadDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/CopyPayloadDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/CopyPayloadDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Payload_CopyPayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Payload_CopyPayloadDto extends PayloadDto {
        public final String a;
        public final CopyPayloadDto b;

        public Payload_CopyPayloadDto(@Json(name = "type") String str, CopyPayloadDto copyPayloadDto) {
            this.a = str;
            this.b = copyPayloadDto;
        }

        public final Payload_CopyPayloadDto copy(@Json(name = "type") String type, CopyPayloadDto value) {
            return new Payload_CopyPayloadDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload_CopyPayloadDto)) {
                return false;
            }
            Payload_CopyPayloadDto payload_CopyPayloadDto = (Payload_CopyPayloadDto) obj;
            return this.a.equals(payload_CopyPayloadDto.a) && this.b.equals(payload_CopyPayloadDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Payload_CopyPayloadDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Unknown_PayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto$Unknown_PayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
}
