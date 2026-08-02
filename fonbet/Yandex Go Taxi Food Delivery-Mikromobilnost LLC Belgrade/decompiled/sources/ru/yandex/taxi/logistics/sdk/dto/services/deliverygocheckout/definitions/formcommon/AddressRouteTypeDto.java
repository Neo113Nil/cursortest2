package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "", "AddressRouteType_DefaultDto", "AddressRouteType_PickupPointsDto", "Unknown_AddressRouteTypeDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$AddressRouteType_DefaultDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$AddressRouteType_PickupPointsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$Unknown_AddressRouteTypeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AddressRouteTypeDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$AddressRouteType_DefaultDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDefaultDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDefaultDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDefaultDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$AddressRouteType_DefaultDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressRouteType_DefaultDto extends AddressRouteTypeDto {
        public final String a;
        public final AddressRouteTypeDefaultDto b;

        public AddressRouteType_DefaultDto(@Json(name = "type") String str, AddressRouteTypeDefaultDto addressRouteTypeDefaultDto) {
            this.a = str;
            this.b = addressRouteTypeDefaultDto;
        }

        public final AddressRouteType_DefaultDto copy(@Json(name = "type") String type, AddressRouteTypeDefaultDto value) {
            return new AddressRouteType_DefaultDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AddressRouteType_DefaultDto) {
                AddressRouteType_DefaultDto addressRouteType_DefaultDto = (AddressRouteType_DefaultDto) obj;
                return this.a.equals(addressRouteType_DefaultDto.a) && this.b == addressRouteType_DefaultDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AddressRouteType_DefaultDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$AddressRouteType_PickupPointsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypePickupPointsDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypePickupPointsDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypePickupPointsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$AddressRouteType_PickupPointsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressRouteType_PickupPointsDto extends AddressRouteTypeDto {
        public final String a;
        public final AddressRouteTypePickupPointsDto b;

        public AddressRouteType_PickupPointsDto(@Json(name = "type") String str, AddressRouteTypePickupPointsDto addressRouteTypePickupPointsDto) {
            this.a = str;
            this.b = addressRouteTypePickupPointsDto;
        }

        public final AddressRouteType_PickupPointsDto copy(@Json(name = "type") String type, AddressRouteTypePickupPointsDto value) {
            return new AddressRouteType_PickupPointsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AddressRouteType_PickupPointsDto) {
                AddressRouteType_PickupPointsDto addressRouteType_PickupPointsDto = (AddressRouteType_PickupPointsDto) obj;
                return this.a.equals(addressRouteType_PickupPointsDto.a) && this.b == addressRouteType_PickupPointsDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AddressRouteType_PickupPointsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$Unknown_AddressRouteTypeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto$Unknown_AddressRouteTypeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_AddressRouteTypeDto extends AddressRouteTypeDto {
        public final String a;

        public Unknown_AddressRouteTypeDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_AddressRouteTypeDto copy(@Json(name = "type") String type) {
            return new Unknown_AddressRouteTypeDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_AddressRouteTypeDto) && jl40.l(this.a, ((Unknown_AddressRouteTypeDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_AddressRouteTypeDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_AddressRouteTypeDto() {
            this(0);
        }

        public /* synthetic */ Unknown_AddressRouteTypeDto(int i) {
            this("unknown");
        }
    }
}
