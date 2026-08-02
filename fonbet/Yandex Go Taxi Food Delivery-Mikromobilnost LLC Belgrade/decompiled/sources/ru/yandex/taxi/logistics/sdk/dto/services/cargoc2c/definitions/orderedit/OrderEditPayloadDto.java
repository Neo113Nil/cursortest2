package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;", "", "OrderEditPayload_CargoC2CDto", "OrderEditPayload_LogisticPlatformDto", "Unknown_OrderEditPayloadDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$OrderEditPayload_CargoC2CDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$OrderEditPayload_LogisticPlatformDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$Unknown_OrderEditPayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class OrderEditPayloadDto {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$Unknown_OrderEditPayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$Unknown_OrderEditPayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_OrderEditPayloadDto extends OrderEditPayloadDto {
        public final String a;

        public Unknown_OrderEditPayloadDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_OrderEditPayloadDto copy(@Json(name = "type") String type) {
            return new Unknown_OrderEditPayloadDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_OrderEditPayloadDto) && jl40.l(this.a, ((Unknown_OrderEditPayloadDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_OrderEditPayloadDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_OrderEditPayloadDto() {
            this(0);
        }

        public /* synthetic */ Unknown_OrderEditPayloadDto(int i) {
            this("unknown");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$OrderEditPayload_CargoC2CDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditPayloadDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditPayloadDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditPayloadDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$OrderEditPayload_CargoC2CDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderEditPayload_CargoC2CDto extends OrderEditPayloadDto {
        public final String a;
        public final C2cOrderEditPayloadDto b;

        public OrderEditPayload_CargoC2CDto(@Json(name = "type") String str, C2cOrderEditPayloadDto c2cOrderEditPayloadDto) {
            this.a = str;
            this.b = c2cOrderEditPayloadDto;
        }

        public final OrderEditPayload_CargoC2CDto copy(@Json(name = "type") String type, C2cOrderEditPayloadDto value) {
            return new OrderEditPayload_CargoC2CDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderEditPayload_CargoC2CDto)) {
                return false;
            }
            OrderEditPayload_CargoC2CDto orderEditPayload_CargoC2CDto = (OrderEditPayload_CargoC2CDto) obj;
            return jl40.l(this.a, orderEditPayload_CargoC2CDto.a) && jl40.l(this.b, orderEditPayload_CargoC2CDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OrderEditPayload_CargoC2CDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ OrderEditPayload_CargoC2CDto(C2cOrderEditPayloadDto c2cOrderEditPayloadDto) {
            this("cargo-c2c", c2cOrderEditPayloadDto);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$OrderEditPayload_LogisticPlatformDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditPayloadDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditPayloadDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditPayloadDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto$OrderEditPayload_LogisticPlatformDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderEditPayload_LogisticPlatformDto extends OrderEditPayloadDto {
        public final String a;
        public final LpOrderEditPayloadDto b;

        public OrderEditPayload_LogisticPlatformDto(@Json(name = "type") String str, LpOrderEditPayloadDto lpOrderEditPayloadDto) {
            this.a = str;
            this.b = lpOrderEditPayloadDto;
        }

        public final OrderEditPayload_LogisticPlatformDto copy(@Json(name = "type") String type, LpOrderEditPayloadDto value) {
            return new OrderEditPayload_LogisticPlatformDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderEditPayload_LogisticPlatformDto)) {
                return false;
            }
            OrderEditPayload_LogisticPlatformDto orderEditPayload_LogisticPlatformDto = (OrderEditPayload_LogisticPlatformDto) obj;
            return jl40.l(this.a, orderEditPayload_LogisticPlatformDto.a) && jl40.l(this.b, orderEditPayload_LogisticPlatformDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OrderEditPayload_LogisticPlatformDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ OrderEditPayload_LogisticPlatformDto(LpOrderEditPayloadDto lpOrderEditPayloadDto) {
            this("logistic-platform", lpOrderEditPayloadDto);
        }
    }
}
