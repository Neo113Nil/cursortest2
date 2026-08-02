package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.CorpDashboardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.DashboardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.OrderFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.OrderTrackingDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto;", "", MetaDataField.SCREEN_FIELD, "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "coordinate", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;)V", "getScreen", "()Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "getCoordinate", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ScreenDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryRequestDto {
    private final CoordinateDto coordinate;
    private final ScreenDto screen;

    public DeliveryRequestDto(@Json(name = "screen") ScreenDto screenDto, @Json(name = "coordinate") CoordinateDto coordinateDto) {
        this.screen = screenDto;
        this.coordinate = coordinateDto;
    }

    public static /* synthetic */ DeliveryRequestDto copy$default(DeliveryRequestDto deliveryRequestDto, ScreenDto screenDto, CoordinateDto coordinateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            screenDto = deliveryRequestDto.screen;
        }
        if ((i & 2) != 0) {
            coordinateDto = deliveryRequestDto.coordinate;
        }
        return deliveryRequestDto.copy(screenDto, coordinateDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ScreenDto getScreen() {
        return this.screen;
    }

    /* renamed from: component2, reason: from getter */
    public final CoordinateDto getCoordinate() {
        return this.coordinate;
    }

    public final DeliveryRequestDto copy(@Json(name = "screen") ScreenDto screen, @Json(name = "coordinate") CoordinateDto coordinate) {
        return new DeliveryRequestDto(screen, coordinate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryRequestDto)) {
            return false;
        }
        DeliveryRequestDto deliveryRequestDto = (DeliveryRequestDto) other;
        return jl40.l(this.screen, deliveryRequestDto.screen) && jl40.l(this.coordinate, deliveryRequestDto.coordinate);
    }

    public final CoordinateDto getCoordinate() {
        return this.coordinate;
    }

    public final ScreenDto getScreen() {
        return this.screen;
    }

    public int hashCode() {
        int hashCode = this.screen.hashCode() * 31;
        CoordinateDto coordinateDto = this.coordinate;
        return hashCode + (coordinateDto == null ? 0 : coordinateDto.hashCode());
    }

    public String toString() {
        return "DeliveryRequestDto(screen=" + this.screen + ", coordinate=" + this.coordinate + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "", "Screen_TrackingDto", "Screen_DashboardDto", "Screen_CorpDashboardDto", "Screen_FormDto", "Unknown_ScreenDto", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_CorpDashboardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_DashboardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_FormDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_TrackingDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Unknown_ScreenDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScreenDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_CorpDashboardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/CorpDashboardDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/CorpDashboardDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/CorpDashboardDto;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_CorpDashboardDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Screen_CorpDashboardDto extends ScreenDto {
            public final String a;
            public final CorpDashboardDto b;

            public Screen_CorpDashboardDto(@Json(name = "type") String str, CorpDashboardDto corpDashboardDto) {
                this.a = str;
                this.b = corpDashboardDto;
            }

            public final Screen_CorpDashboardDto copy(@Json(name = "type") String type, CorpDashboardDto value) {
                return new Screen_CorpDashboardDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Screen_CorpDashboardDto) {
                    Screen_CorpDashboardDto screen_CorpDashboardDto = (Screen_CorpDashboardDto) obj;
                    return this.a.equals(screen_CorpDashboardDto.a) && this.b == screen_CorpDashboardDto.b;
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Screen_CorpDashboardDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_DashboardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/DashboardDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/DashboardDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/DashboardDto;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_DashboardDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Screen_DashboardDto extends ScreenDto {
            public final String a;
            public final DashboardDto b;

            public Screen_DashboardDto(@Json(name = "type") String str, DashboardDto dashboardDto) {
                this.a = str;
                this.b = dashboardDto;
            }

            public final Screen_DashboardDto copy(@Json(name = "type") String type, DashboardDto value) {
                return new Screen_DashboardDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Screen_DashboardDto) {
                    Screen_DashboardDto screen_DashboardDto = (Screen_DashboardDto) obj;
                    return this.a.equals(screen_DashboardDto.a) && this.b == screen_DashboardDto.b;
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Screen_DashboardDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_FormDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/OrderFormDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/OrderFormDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/OrderFormDto;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_FormDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Screen_FormDto extends ScreenDto {
            public final String a;
            public final OrderFormDto b;

            public Screen_FormDto(@Json(name = "type") String str, OrderFormDto orderFormDto) {
                this.a = str;
                this.b = orderFormDto;
            }

            public final Screen_FormDto copy(@Json(name = "type") String type, OrderFormDto value) {
                return new Screen_FormDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Screen_FormDto)) {
                    return false;
                }
                Screen_FormDto screen_FormDto = (Screen_FormDto) obj;
                return this.a.equals(screen_FormDto.a) && this.b.equals(screen_FormDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Screen_FormDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_TrackingDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/OrderTrackingDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/OrderTrackingDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/OrderTrackingDto;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Screen_TrackingDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Screen_TrackingDto extends ScreenDto {
            public final String a;
            public final OrderTrackingDto b;

            public Screen_TrackingDto(@Json(name = "type") String str, OrderTrackingDto orderTrackingDto) {
                this.a = str;
                this.b = orderTrackingDto;
            }

            public final Screen_TrackingDto copy(@Json(name = "type") String type, OrderTrackingDto value) {
                return new Screen_TrackingDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Screen_TrackingDto)) {
                    return false;
                }
                Screen_TrackingDto screen_TrackingDto = (Screen_TrackingDto) obj;
                return this.a.equals(screen_TrackingDto.a) && this.b.equals(screen_TrackingDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Screen_TrackingDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Unknown_ScreenDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto$Unknown_ScreenDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_ScreenDto extends ScreenDto {
            public final String a;

            public Unknown_ScreenDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_ScreenDto copy(@Json(name = "type") String type) {
                return new Unknown_ScreenDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_ScreenDto) && jl40.l(this.a, ((Unknown_ScreenDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_ScreenDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_ScreenDto() {
                this(0);
            }

            public /* synthetic */ Unknown_ScreenDto(int i) {
                this("unknown");
            }
        }
    }
}
