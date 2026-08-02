package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerDto;", "", "adsBannerSettings", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto;", "showWhenSectionCollapsed", "", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto;ZLjava/lang/String;Ljava/lang/Object;)V", "getAdsBannerSettings", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AdsBannerSettingsDto;", "getShowWhenSectionCollapsed", "()Z", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdsBannerDto {
    private final AdsBannerSettingsDto adsBannerSettings;
    private final Object meta;
    private final String metricaLabel;
    private final boolean showWhenSectionCollapsed;

    public AdsBannerDto(@Json(name = "ads_banner_settings") AdsBannerSettingsDto adsBannerSettingsDto, @Json(name = "show_when_section_collapsed") boolean z, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.adsBannerSettings = adsBannerSettingsDto;
        this.showWhenSectionCollapsed = z;
        this.metricaLabel = str;
        this.meta = obj;
    }

    public static /* synthetic */ AdsBannerDto copy$default(AdsBannerDto adsBannerDto, AdsBannerSettingsDto adsBannerSettingsDto, boolean z, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            adsBannerSettingsDto = adsBannerDto.adsBannerSettings;
        }
        if ((i & 2) != 0) {
            z = adsBannerDto.showWhenSectionCollapsed;
        }
        if ((i & 4) != 0) {
            str = adsBannerDto.metricaLabel;
        }
        if ((i & 8) != 0) {
            obj = adsBannerDto.meta;
        }
        return adsBannerDto.copy(adsBannerSettingsDto, z, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final AdsBannerSettingsDto getAdsBannerSettings() {
        return this.adsBannerSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final AdsBannerDto copy(@Json(name = "ads_banner_settings") AdsBannerSettingsDto adsBannerSettings, @Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new AdsBannerDto(adsBannerSettings, showWhenSectionCollapsed, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsBannerDto)) {
            return false;
        }
        AdsBannerDto adsBannerDto = (AdsBannerDto) other;
        return jl40.l(this.adsBannerSettings, adsBannerDto.adsBannerSettings) && this.showWhenSectionCollapsed == adsBannerDto.showWhenSectionCollapsed && jl40.l(this.metricaLabel, adsBannerDto.metricaLabel) && jl40.l(this.meta, adsBannerDto.meta);
    }

    public final AdsBannerSettingsDto getAdsBannerSettings() {
        return this.adsBannerSettings;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public int hashCode() {
        int e = unr0.e(this.adsBannerSettings.hashCode() * 31, 31, this.showWhenSectionCollapsed);
        String str = this.metricaLabel;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        AdsBannerSettingsDto adsBannerSettingsDto = this.adsBannerSettings;
        boolean z = this.showWhenSectionCollapsed;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("AdsBannerDto(adsBannerSettings=");
        sb.append(adsBannerSettingsDto);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(z);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str, ", meta=", obj, Extension.C_BRAKE);
    }

    public /* synthetic */ AdsBannerDto(AdsBannerSettingsDto adsBannerSettingsDto, boolean z, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adsBannerSettingsDto, (i & 2) != 0 ? false : z, str, obj);
    }
}
