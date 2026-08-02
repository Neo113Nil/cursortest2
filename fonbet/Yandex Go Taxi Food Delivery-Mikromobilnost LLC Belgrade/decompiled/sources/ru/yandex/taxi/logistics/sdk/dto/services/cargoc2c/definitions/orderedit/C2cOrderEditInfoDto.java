package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto;", "", "C2cOrderEditInfo_RoutePointDto", "C2cOrderEditInfo_OrderCommentDto", "C2cOrderEditInfo_WebPaymentUrlDto", "Unknown_C2cOrderEditInfoDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_OrderCommentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_RoutePointDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_WebPaymentUrlDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$Unknown_C2cOrderEditInfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class C2cOrderEditInfoDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_OrderCommentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditOrderCommentDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditOrderCommentDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditOrderCommentDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_OrderCommentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C2cOrderEditInfo_OrderCommentDto extends C2cOrderEditInfoDto {
        public final String a;
        public final C2cEditOrderCommentDto b;

        public C2cOrderEditInfo_OrderCommentDto(@Json(name = "type") String str, C2cEditOrderCommentDto c2cEditOrderCommentDto) {
            this.a = str;
            this.b = c2cEditOrderCommentDto;
        }

        public final C2cOrderEditInfo_OrderCommentDto copy(@Json(name = "type") String type, C2cEditOrderCommentDto value) {
            return new C2cOrderEditInfo_OrderCommentDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2cOrderEditInfo_OrderCommentDto)) {
                return false;
            }
            C2cOrderEditInfo_OrderCommentDto c2cOrderEditInfo_OrderCommentDto = (C2cOrderEditInfo_OrderCommentDto) obj;
            return this.a.equals(c2cOrderEditInfo_OrderCommentDto.a) && this.b.equals(c2cOrderEditInfo_OrderCommentDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "C2cOrderEditInfo_OrderCommentDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_WebPaymentUrlDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditWebPaymentUrlDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditWebPaymentUrlDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditWebPaymentUrlDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_WebPaymentUrlDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C2cOrderEditInfo_WebPaymentUrlDto extends C2cOrderEditInfoDto {
        public final String a;
        public final C2cEditWebPaymentUrlDto b;

        public C2cOrderEditInfo_WebPaymentUrlDto(@Json(name = "type") String str, C2cEditWebPaymentUrlDto c2cEditWebPaymentUrlDto) {
            this.a = str;
            this.b = c2cEditWebPaymentUrlDto;
        }

        public final C2cOrderEditInfo_WebPaymentUrlDto copy(@Json(name = "type") String type, C2cEditWebPaymentUrlDto value) {
            return new C2cOrderEditInfo_WebPaymentUrlDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2cOrderEditInfo_WebPaymentUrlDto)) {
                return false;
            }
            C2cOrderEditInfo_WebPaymentUrlDto c2cOrderEditInfo_WebPaymentUrlDto = (C2cOrderEditInfo_WebPaymentUrlDto) obj;
            return this.a.equals(c2cOrderEditInfo_WebPaymentUrlDto.a) && this.b.equals(c2cOrderEditInfo_WebPaymentUrlDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "C2cOrderEditInfo_WebPaymentUrlDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$Unknown_C2cOrderEditInfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$Unknown_C2cOrderEditInfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_C2cOrderEditInfoDto extends C2cOrderEditInfoDto {
        public final String a;

        public Unknown_C2cOrderEditInfoDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_C2cOrderEditInfoDto copy(@Json(name = "type") String type) {
            return new Unknown_C2cOrderEditInfoDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_C2cOrderEditInfoDto) && jl40.l(this.a, ((Unknown_C2cOrderEditInfoDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_C2cOrderEditInfoDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_C2cOrderEditInfoDto() {
            this(0);
        }

        public /* synthetic */ Unknown_C2cOrderEditInfoDto(int i) {
            this("unknown");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_RoutePointDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditRoutePointDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditRoutePointDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cEditRoutePointDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/C2cOrderEditInfoDto$C2cOrderEditInfo_RoutePointDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C2cOrderEditInfo_RoutePointDto extends C2cOrderEditInfoDto {
        public final String a;
        public final C2cEditRoutePointDto b;

        public C2cOrderEditInfo_RoutePointDto(@Json(name = "type") String str, C2cEditRoutePointDto c2cEditRoutePointDto) {
            this.a = str;
            this.b = c2cEditRoutePointDto;
        }

        public final C2cOrderEditInfo_RoutePointDto copy(@Json(name = "type") String type, C2cEditRoutePointDto value) {
            return new C2cOrderEditInfo_RoutePointDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2cOrderEditInfo_RoutePointDto)) {
                return false;
            }
            C2cOrderEditInfo_RoutePointDto c2cOrderEditInfo_RoutePointDto = (C2cOrderEditInfo_RoutePointDto) obj;
            return jl40.l(this.a, c2cOrderEditInfo_RoutePointDto.a) && jl40.l(this.b, c2cOrderEditInfo_RoutePointDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "C2cOrderEditInfo_RoutePointDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ C2cOrderEditInfo_RoutePointDto(C2cEditRoutePointDto c2cEditRoutePointDto) {
            this("route-point", c2cEditRoutePointDto);
        }
    }
}
