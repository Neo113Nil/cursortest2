package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BannerCarouselDto;", "", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BannerCarouselDto {
    private final Object meta;
    private final String metricaLabel;

    public BannerCarouselDto(@Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.metricaLabel = str;
        this.meta = obj;
    }

    public static /* synthetic */ BannerCarouselDto copy$default(BannerCarouselDto bannerCarouselDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = bannerCarouselDto.metricaLabel;
        }
        if ((i & 2) != 0) {
            obj = bannerCarouselDto.meta;
        }
        return bannerCarouselDto.copy(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final BannerCarouselDto copy(@Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new BannerCarouselDto(metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerCarouselDto)) {
            return false;
        }
        BannerCarouselDto bannerCarouselDto = (BannerCarouselDto) other;
        return jl40.l(this.metricaLabel, bannerCarouselDto.metricaLabel) && jl40.l(this.meta, bannerCarouselDto.meta);
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public int hashCode() {
        String str = this.metricaLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.meta;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "BannerCarouselDto(metricaLabel=" + this.metricaLabel + ", meta=" + this.meta + Extension.C_BRAKE;
    }
}
