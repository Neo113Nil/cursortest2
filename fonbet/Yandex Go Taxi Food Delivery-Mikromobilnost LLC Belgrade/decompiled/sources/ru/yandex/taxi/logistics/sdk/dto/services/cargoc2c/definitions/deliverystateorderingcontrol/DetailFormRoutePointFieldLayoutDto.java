package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "DetailFormRoutePointFieldLayout_AddressDto", "DetailFormRoutePointFieldLayout_EntranceDto", "DetailFormRoutePointFieldLayout_ApartmentDto", "DetailFormRoutePointFieldLayout_FloorDto", "DetailFormRoutePointFieldLayout_DoorPhoneDto", "DetailFormRoutePointFieldLayout_CommentDto", "DetailFormRoutePointFieldLayout_ContactDto", "Unknown_DetailFormRoutePointFieldLayoutDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_AddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_ApartmentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_CommentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_ContactDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_DoorPhoneDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_EntranceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_FloorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$Unknown_DetailFormRoutePointFieldLayoutDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DetailFormRoutePointFieldLayoutDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_AddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_AddressDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailFormRoutePointFieldLayout_AddressDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;
        public final DetailFormCommonInputLayoutDto b;

        public DetailFormRoutePointFieldLayout_AddressDto(@Json(name = "type") String str, DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto) {
            this.a = str;
            this.b = detailFormCommonInputLayoutDto;
        }

        public final DetailFormRoutePointFieldLayout_AddressDto copy(@Json(name = "type") String type, DetailFormCommonInputLayoutDto value) {
            return new DetailFormRoutePointFieldLayout_AddressDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailFormRoutePointFieldLayout_AddressDto)) {
                return false;
            }
            DetailFormRoutePointFieldLayout_AddressDto detailFormRoutePointFieldLayout_AddressDto = (DetailFormRoutePointFieldLayout_AddressDto) obj;
            return this.a.equals(detailFormRoutePointFieldLayout_AddressDto.a) && this.b.equals(detailFormRoutePointFieldLayout_AddressDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailFormRoutePointFieldLayout_AddressDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_ApartmentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_ApartmentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailFormRoutePointFieldLayout_ApartmentDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;
        public final DetailFormCommonInputLayoutDto b;

        public DetailFormRoutePointFieldLayout_ApartmentDto(@Json(name = "type") String str, DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto) {
            this.a = str;
            this.b = detailFormCommonInputLayoutDto;
        }

        public final DetailFormRoutePointFieldLayout_ApartmentDto copy(@Json(name = "type") String type, DetailFormCommonInputLayoutDto value) {
            return new DetailFormRoutePointFieldLayout_ApartmentDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailFormRoutePointFieldLayout_ApartmentDto)) {
                return false;
            }
            DetailFormRoutePointFieldLayout_ApartmentDto detailFormRoutePointFieldLayout_ApartmentDto = (DetailFormRoutePointFieldLayout_ApartmentDto) obj;
            return this.a.equals(detailFormRoutePointFieldLayout_ApartmentDto.a) && this.b.equals(detailFormRoutePointFieldLayout_ApartmentDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailFormRoutePointFieldLayout_ApartmentDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_CommentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_CommentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailFormRoutePointFieldLayout_CommentDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;
        public final DetailFormCommonInputLayoutDto b;

        public DetailFormRoutePointFieldLayout_CommentDto(@Json(name = "type") String str, DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto) {
            this.a = str;
            this.b = detailFormCommonInputLayoutDto;
        }

        public final DetailFormRoutePointFieldLayout_CommentDto copy(@Json(name = "type") String type, DetailFormCommonInputLayoutDto value) {
            return new DetailFormRoutePointFieldLayout_CommentDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailFormRoutePointFieldLayout_CommentDto)) {
                return false;
            }
            DetailFormRoutePointFieldLayout_CommentDto detailFormRoutePointFieldLayout_CommentDto = (DetailFormRoutePointFieldLayout_CommentDto) obj;
            return this.a.equals(detailFormRoutePointFieldLayout_CommentDto.a) && this.b.equals(detailFormRoutePointFieldLayout_CommentDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailFormRoutePointFieldLayout_CommentDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_ContactDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormContactInputLayoutDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormContactInputLayoutDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormContactInputLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_ContactDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailFormRoutePointFieldLayout_ContactDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;
        public final DetailFormContactInputLayoutDto b;

        public DetailFormRoutePointFieldLayout_ContactDto(@Json(name = "type") String str, DetailFormContactInputLayoutDto detailFormContactInputLayoutDto) {
            this.a = str;
            this.b = detailFormContactInputLayoutDto;
        }

        public final DetailFormRoutePointFieldLayout_ContactDto copy(@Json(name = "type") String type, DetailFormContactInputLayoutDto value) {
            return new DetailFormRoutePointFieldLayout_ContactDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailFormRoutePointFieldLayout_ContactDto)) {
                return false;
            }
            DetailFormRoutePointFieldLayout_ContactDto detailFormRoutePointFieldLayout_ContactDto = (DetailFormRoutePointFieldLayout_ContactDto) obj;
            return this.a.equals(detailFormRoutePointFieldLayout_ContactDto.a) && this.b.equals(detailFormRoutePointFieldLayout_ContactDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailFormRoutePointFieldLayout_ContactDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_DoorPhoneDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_DoorPhoneDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailFormRoutePointFieldLayout_DoorPhoneDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;
        public final DetailFormCommonInputLayoutDto b;

        public DetailFormRoutePointFieldLayout_DoorPhoneDto(@Json(name = "type") String str, DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto) {
            this.a = str;
            this.b = detailFormCommonInputLayoutDto;
        }

        public final DetailFormRoutePointFieldLayout_DoorPhoneDto copy(@Json(name = "type") String type, DetailFormCommonInputLayoutDto value) {
            return new DetailFormRoutePointFieldLayout_DoorPhoneDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailFormRoutePointFieldLayout_DoorPhoneDto)) {
                return false;
            }
            DetailFormRoutePointFieldLayout_DoorPhoneDto detailFormRoutePointFieldLayout_DoorPhoneDto = (DetailFormRoutePointFieldLayout_DoorPhoneDto) obj;
            return this.a.equals(detailFormRoutePointFieldLayout_DoorPhoneDto.a) && this.b.equals(detailFormRoutePointFieldLayout_DoorPhoneDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailFormRoutePointFieldLayout_DoorPhoneDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_EntranceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_EntranceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailFormRoutePointFieldLayout_EntranceDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;
        public final DetailFormCommonInputLayoutDto b;

        public DetailFormRoutePointFieldLayout_EntranceDto(@Json(name = "type") String str, DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto) {
            this.a = str;
            this.b = detailFormCommonInputLayoutDto;
        }

        public final DetailFormRoutePointFieldLayout_EntranceDto copy(@Json(name = "type") String type, DetailFormCommonInputLayoutDto value) {
            return new DetailFormRoutePointFieldLayout_EntranceDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailFormRoutePointFieldLayout_EntranceDto)) {
                return false;
            }
            DetailFormRoutePointFieldLayout_EntranceDto detailFormRoutePointFieldLayout_EntranceDto = (DetailFormRoutePointFieldLayout_EntranceDto) obj;
            return this.a.equals(detailFormRoutePointFieldLayout_EntranceDto.a) && this.b.equals(detailFormRoutePointFieldLayout_EntranceDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailFormRoutePointFieldLayout_EntranceDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_FloorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$DetailFormRoutePointFieldLayout_FloorDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DetailFormRoutePointFieldLayout_FloorDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;
        public final DetailFormCommonInputLayoutDto b;

        public DetailFormRoutePointFieldLayout_FloorDto(@Json(name = "type") String str, DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto) {
            this.a = str;
            this.b = detailFormCommonInputLayoutDto;
        }

        public final DetailFormRoutePointFieldLayout_FloorDto copy(@Json(name = "type") String type, DetailFormCommonInputLayoutDto value) {
            return new DetailFormRoutePointFieldLayout_FloorDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetailFormRoutePointFieldLayout_FloorDto)) {
                return false;
            }
            DetailFormRoutePointFieldLayout_FloorDto detailFormRoutePointFieldLayout_FloorDto = (DetailFormRoutePointFieldLayout_FloorDto) obj;
            return this.a.equals(detailFormRoutePointFieldLayout_FloorDto.a) && this.b.equals(detailFormRoutePointFieldLayout_FloorDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DetailFormRoutePointFieldLayout_FloorDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$Unknown_DetailFormRoutePointFieldLayoutDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto$Unknown_DetailFormRoutePointFieldLayoutDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_DetailFormRoutePointFieldLayoutDto extends DetailFormRoutePointFieldLayoutDto {
        public final String a;

        public Unknown_DetailFormRoutePointFieldLayoutDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_DetailFormRoutePointFieldLayoutDto copy(@Json(name = "type") String type) {
            return new Unknown_DetailFormRoutePointFieldLayoutDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_DetailFormRoutePointFieldLayoutDto) && jl40.l(this.a, ((Unknown_DetailFormRoutePointFieldLayoutDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_DetailFormRoutePointFieldLayoutDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_DetailFormRoutePointFieldLayoutDto() {
            this(0);
        }

        public /* synthetic */ Unknown_DetailFormRoutePointFieldLayoutDto(int i) {
            this("unknown");
        }
    }
}
