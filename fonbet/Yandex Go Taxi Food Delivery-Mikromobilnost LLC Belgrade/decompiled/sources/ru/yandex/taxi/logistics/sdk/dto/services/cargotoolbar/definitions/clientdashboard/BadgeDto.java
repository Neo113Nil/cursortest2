package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;", "", "Badge_RedBadgeDto", "Badge_CornerBadgeDto", "Unknown_BadgeDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Badge_CornerBadgeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Badge_RedBadgeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Unknown_BadgeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BadgeDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Badge_CornerBadgeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Badge_CornerBadgeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge_CornerBadgeDto extends BadgeDto {
        public final String a;
        public final CornerBadgeDto b;

        public Badge_CornerBadgeDto(@Json(name = "type") String str, CornerBadgeDto cornerBadgeDto) {
            this.a = str;
            this.b = cornerBadgeDto;
        }

        public final Badge_CornerBadgeDto copy(@Json(name = "type") String type, CornerBadgeDto value) {
            return new Badge_CornerBadgeDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge_CornerBadgeDto)) {
                return false;
            }
            Badge_CornerBadgeDto badge_CornerBadgeDto = (Badge_CornerBadgeDto) obj;
            return this.a.equals(badge_CornerBadgeDto.a) && this.b.equals(badge_CornerBadgeDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge_CornerBadgeDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Badge_RedBadgeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/RedBadgeDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/RedBadgeDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/RedBadgeDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Badge_RedBadgeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badge_RedBadgeDto extends BadgeDto {
        public final String a;
        public final RedBadgeDto b;

        public Badge_RedBadgeDto(@Json(name = "type") String str, RedBadgeDto redBadgeDto) {
            this.a = str;
            this.b = redBadgeDto;
        }

        public final Badge_RedBadgeDto copy(@Json(name = "type") String type, RedBadgeDto value) {
            return new Badge_RedBadgeDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge_RedBadgeDto)) {
                return false;
            }
            Badge_RedBadgeDto badge_RedBadgeDto = (Badge_RedBadgeDto) obj;
            return this.a.equals(badge_RedBadgeDto.a) && this.b.equals(badge_RedBadgeDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge_RedBadgeDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Unknown_BadgeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto$Unknown_BadgeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_BadgeDto extends BadgeDto {
        public final String a;

        public Unknown_BadgeDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_BadgeDto copy(@Json(name = "type") String type) {
            return new Unknown_BadgeDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_BadgeDto) && jl40.l(this.a, ((Unknown_BadgeDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_BadgeDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_BadgeDto() {
            this(0);
        }

        public /* synthetic */ Unknown_BadgeDto(int i) {
            this("unknown");
        }
    }
}
