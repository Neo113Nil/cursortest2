package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto;", "", "AdsBannerSettings_UrbanAdsDto", "Unknown_AdsBannerSettingsDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto$AdsBannerSettings_UrbanAdsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto$Unknown_AdsBannerSettingsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AdsBannerSettingsDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto$AdsBannerSettings_UrbanAdsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/UrbanAdsSettingsDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/UrbanAdsSettingsDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/UrbanAdsSettingsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto$AdsBannerSettings_UrbanAdsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdsBannerSettings_UrbanAdsDto extends AdsBannerSettingsDto {
        public final String a;
        public final UrbanAdsSettingsDto b;

        public AdsBannerSettings_UrbanAdsDto(@Json(name = "type") String str, UrbanAdsSettingsDto urbanAdsSettingsDto) {
            this.a = str;
            this.b = urbanAdsSettingsDto;
        }

        public final AdsBannerSettings_UrbanAdsDto copy(@Json(name = "type") String type, UrbanAdsSettingsDto value) {
            return new AdsBannerSettings_UrbanAdsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsBannerSettings_UrbanAdsDto)) {
                return false;
            }
            AdsBannerSettings_UrbanAdsDto adsBannerSettings_UrbanAdsDto = (AdsBannerSettings_UrbanAdsDto) obj;
            return this.a.equals(adsBannerSettings_UrbanAdsDto.a) && this.b.equals(adsBannerSettings_UrbanAdsDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AdsBannerSettings_UrbanAdsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto$Unknown_AdsBannerSettingsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto$Unknown_AdsBannerSettingsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_AdsBannerSettingsDto extends AdsBannerSettingsDto {
        public final String a;

        public Unknown_AdsBannerSettingsDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_AdsBannerSettingsDto copy(@Json(name = "type") String type) {
            return new Unknown_AdsBannerSettingsDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_AdsBannerSettingsDto) && jl40.l(this.a, ((Unknown_AdsBannerSettingsDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_AdsBannerSettingsDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_AdsBannerSettingsDto() {
            this(0);
        }

        public /* synthetic */ Unknown_AdsBannerSettingsDto(int i) {
            this("unknown");
        }
    }
}
