package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto;", "", "AccentButtonAction_DeeplinkDto", "AccentButtonAction_OrderStateActionDto", "AccentButtonAction_EmptyActionDto", "Unknown_AccentButtonActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_DeeplinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_EmptyActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_OrderStateActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$Unknown_AccentButtonActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AccentButtonActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_DeeplinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeeplinkButtonActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeeplinkButtonActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DeeplinkButtonActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_DeeplinkDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentButtonAction_DeeplinkDto extends AccentButtonActionDto {
        public final String a;
        public final DeeplinkButtonActionDto b;

        public AccentButtonAction_DeeplinkDto(@Json(name = "type") String str, DeeplinkButtonActionDto deeplinkButtonActionDto) {
            this.a = str;
            this.b = deeplinkButtonActionDto;
        }

        public final AccentButtonAction_DeeplinkDto copy(@Json(name = "type") String type, DeeplinkButtonActionDto value) {
            return new AccentButtonAction_DeeplinkDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccentButtonAction_DeeplinkDto)) {
                return false;
            }
            AccentButtonAction_DeeplinkDto accentButtonAction_DeeplinkDto = (AccentButtonAction_DeeplinkDto) obj;
            return this.a.equals(accentButtonAction_DeeplinkDto.a) && this.b.equals(accentButtonAction_DeeplinkDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AccentButtonAction_DeeplinkDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_EmptyActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/EmptyActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/EmptyActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/EmptyActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_EmptyActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentButtonAction_EmptyActionDto extends AccentButtonActionDto {
        public final String a;
        public final EmptyActionDto b;

        public AccentButtonAction_EmptyActionDto(@Json(name = "type") String str, EmptyActionDto emptyActionDto) {
            this.a = str;
            this.b = emptyActionDto;
        }

        public final AccentButtonAction_EmptyActionDto copy(@Json(name = "type") String type, EmptyActionDto value) {
            return new AccentButtonAction_EmptyActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccentButtonAction_EmptyActionDto) {
                AccentButtonAction_EmptyActionDto accentButtonAction_EmptyActionDto = (AccentButtonAction_EmptyActionDto) obj;
                return this.a.equals(accentButtonAction_EmptyActionDto.a) && this.b == accentButtonAction_EmptyActionDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AccentButtonAction_EmptyActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_OrderStateActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderStateActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderStateActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderStateActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$AccentButtonAction_OrderStateActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentButtonAction_OrderStateActionDto extends AccentButtonActionDto {
        public final String a;
        public final OrderStateActionDto b;

        public AccentButtonAction_OrderStateActionDto(@Json(name = "type") String str, OrderStateActionDto orderStateActionDto) {
            this.a = str;
            this.b = orderStateActionDto;
        }

        public final AccentButtonAction_OrderStateActionDto copy(@Json(name = "type") String type, OrderStateActionDto value) {
            return new AccentButtonAction_OrderStateActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccentButtonAction_OrderStateActionDto)) {
                return false;
            }
            AccentButtonAction_OrderStateActionDto accentButtonAction_OrderStateActionDto = (AccentButtonAction_OrderStateActionDto) obj;
            return this.a.equals(accentButtonAction_OrderStateActionDto.a) && this.b.equals(accentButtonAction_OrderStateActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AccentButtonAction_OrderStateActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$Unknown_AccentButtonActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AccentButtonActionDto$Unknown_AccentButtonActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_AccentButtonActionDto extends AccentButtonActionDto {
        public final String a;

        public Unknown_AccentButtonActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_AccentButtonActionDto copy(@Json(name = "type") String type) {
            return new Unknown_AccentButtonActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_AccentButtonActionDto) && jl40.l(this.a, ((Unknown_AccentButtonActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_AccentButtonActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_AccentButtonActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_AccentButtonActionDto(int i) {
            this("unknown");
        }
    }
}
