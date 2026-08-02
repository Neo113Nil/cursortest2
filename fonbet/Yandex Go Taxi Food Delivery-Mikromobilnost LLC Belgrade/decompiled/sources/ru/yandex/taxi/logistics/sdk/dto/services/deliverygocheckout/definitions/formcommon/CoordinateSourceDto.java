package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;", "", "CoordinateSource_CoordinateDto", "CoordinateSource_AddressDto", "Unknown_CoordinateSourceDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$CoordinateSource_AddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$CoordinateSource_CoordinateDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$Unknown_CoordinateSourceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CoordinateSourceDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$CoordinateSource_AddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressCoordinateSourceDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressCoordinateSourceDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressCoordinateSourceDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$CoordinateSource_AddressDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CoordinateSource_AddressDto extends CoordinateSourceDto {
        public final String a;
        public final AddressCoordinateSourceDto b;

        public CoordinateSource_AddressDto(@Json(name = "type") String str, AddressCoordinateSourceDto addressCoordinateSourceDto) {
            this.a = str;
            this.b = addressCoordinateSourceDto;
        }

        public final CoordinateSource_AddressDto copy(@Json(name = "type") String type, AddressCoordinateSourceDto value) {
            return new CoordinateSource_AddressDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoordinateSource_AddressDto)) {
                return false;
            }
            CoordinateSource_AddressDto coordinateSource_AddressDto = (CoordinateSource_AddressDto) obj;
            return this.a.equals(coordinateSource_AddressDto.a) && this.b.equals(coordinateSource_AddressDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CoordinateSource_AddressDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$CoordinateSource_CoordinateDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GeoCoordinateSourceDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GeoCoordinateSourceDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GeoCoordinateSourceDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$CoordinateSource_CoordinateDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CoordinateSource_CoordinateDto extends CoordinateSourceDto {
        public final String a;
        public final GeoCoordinateSourceDto b;

        public CoordinateSource_CoordinateDto(@Json(name = "type") String str, GeoCoordinateSourceDto geoCoordinateSourceDto) {
            this.a = str;
            this.b = geoCoordinateSourceDto;
        }

        public final CoordinateSource_CoordinateDto copy(@Json(name = "type") String type, GeoCoordinateSourceDto value) {
            return new CoordinateSource_CoordinateDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoordinateSource_CoordinateDto)) {
                return false;
            }
            CoordinateSource_CoordinateDto coordinateSource_CoordinateDto = (CoordinateSource_CoordinateDto) obj;
            return this.a.equals(coordinateSource_CoordinateDto.a) && this.b.equals(coordinateSource_CoordinateDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CoordinateSource_CoordinateDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$Unknown_CoordinateSourceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto$Unknown_CoordinateSourceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_CoordinateSourceDto extends CoordinateSourceDto {
        public final String a;

        public Unknown_CoordinateSourceDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_CoordinateSourceDto copy(@Json(name = "type") String type) {
            return new Unknown_CoordinateSourceDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_CoordinateSourceDto) && jl40.l(this.a, ((Unknown_CoordinateSourceDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_CoordinateSourceDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_CoordinateSourceDto() {
            this(0);
        }

        public /* synthetic */ Unknown_CoordinateSourceDto(int i) {
            this("unknown");
        }
    }
}
