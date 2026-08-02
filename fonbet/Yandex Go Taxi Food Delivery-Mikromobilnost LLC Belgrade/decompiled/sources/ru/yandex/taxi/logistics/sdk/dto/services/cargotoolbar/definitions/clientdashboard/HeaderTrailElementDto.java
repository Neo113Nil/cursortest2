package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;", "", "HeaderTrailElement_ButtonDto", "HeaderTrailElement_CollapseButtonDto", "Unknown_HeaderTrailElementDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$HeaderTrailElement_ButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$HeaderTrailElement_CollapseButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$Unknown_HeaderTrailElementDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class HeaderTrailElementDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$HeaderTrailElement_ButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailButtonDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailButtonDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailButtonDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$HeaderTrailElement_ButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderTrailElement_ButtonDto extends HeaderTrailElementDto {
        public final String a;
        public final TrailButtonDto b;

        public HeaderTrailElement_ButtonDto(@Json(name = "type") String str, TrailButtonDto trailButtonDto) {
            this.a = str;
            this.b = trailButtonDto;
        }

        public final HeaderTrailElement_ButtonDto copy(@Json(name = "type") String type, TrailButtonDto value) {
            return new HeaderTrailElement_ButtonDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderTrailElement_ButtonDto)) {
                return false;
            }
            HeaderTrailElement_ButtonDto headerTrailElement_ButtonDto = (HeaderTrailElement_ButtonDto) obj;
            return this.a.equals(headerTrailElement_ButtonDto.a) && this.b.equals(headerTrailElement_ButtonDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "HeaderTrailElement_ButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$HeaderTrailElement_CollapseButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CollapseButtonDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CollapseButtonDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CollapseButtonDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$HeaderTrailElement_CollapseButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderTrailElement_CollapseButtonDto extends HeaderTrailElementDto {
        public final String a;
        public final CollapseButtonDto b;

        public HeaderTrailElement_CollapseButtonDto(@Json(name = "type") String str, CollapseButtonDto collapseButtonDto) {
            this.a = str;
            this.b = collapseButtonDto;
        }

        public final HeaderTrailElement_CollapseButtonDto copy(@Json(name = "type") String type, CollapseButtonDto value) {
            return new HeaderTrailElement_CollapseButtonDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderTrailElement_CollapseButtonDto)) {
                return false;
            }
            HeaderTrailElement_CollapseButtonDto headerTrailElement_CollapseButtonDto = (HeaderTrailElement_CollapseButtonDto) obj;
            return this.a.equals(headerTrailElement_CollapseButtonDto.a) && this.b.equals(headerTrailElement_CollapseButtonDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "HeaderTrailElement_CollapseButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$Unknown_HeaderTrailElementDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto$Unknown_HeaderTrailElementDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_HeaderTrailElementDto extends HeaderTrailElementDto {
        public final String a;

        public Unknown_HeaderTrailElementDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_HeaderTrailElementDto copy(@Json(name = "type") String type) {
            return new Unknown_HeaderTrailElementDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_HeaderTrailElementDto) && jl40.l(this.a, ((Unknown_HeaderTrailElementDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_HeaderTrailElementDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_HeaderTrailElementDto() {
            this(0);
        }

        public /* synthetic */ Unknown_HeaderTrailElementDto(int i) {
            this("unknown");
        }
    }
}
