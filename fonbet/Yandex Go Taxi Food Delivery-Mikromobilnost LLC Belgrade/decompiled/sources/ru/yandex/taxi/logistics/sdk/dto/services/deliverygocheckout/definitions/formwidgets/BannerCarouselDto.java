package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.vfc;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012JN\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BannerCarouselDto;", "", "widgetId", "", "displayIds", "", "metricaLabel", "topPadding", "", "bottomPadding", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getWidgetId", "()Ljava/lang/String;", "getDisplayIds", "()Ljava/util/List;", "getMetricaLabel", "getTopPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottomPadding", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BannerCarouselDto;", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BannerCarouselDto {
    private final Integer bottomPadding;
    private final List<String> displayIds;
    private final String metricaLabel;
    private final Integer topPadding;
    private final String widgetId;

    public BannerCarouselDto(@Json(name = "widget_id") String str, @Json(name = "display_ids") List<String> list, @Json(name = "metrica_label") String str2, @Json(name = "top_padding") Integer num, @Json(name = "bottom_padding") Integer num2) {
        this.widgetId = str;
        this.displayIds = list;
        this.metricaLabel = str2;
        this.topPadding = num;
        this.bottomPadding = num2;
    }

    public static /* synthetic */ BannerCarouselDto copy$default(BannerCarouselDto bannerCarouselDto, String str, List list, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerCarouselDto.widgetId;
        }
        if ((i & 2) != 0) {
            list = bannerCarouselDto.displayIds;
        }
        if ((i & 4) != 0) {
            str2 = bannerCarouselDto.metricaLabel;
        }
        if ((i & 8) != 0) {
            num = bannerCarouselDto.topPadding;
        }
        if ((i & 16) != 0) {
            num2 = bannerCarouselDto.bottomPadding;
        }
        Integer num3 = num2;
        String str3 = str2;
        return bannerCarouselDto.copy(str, list, str3, num, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<String> component2() {
        return this.displayIds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getBottomPadding() {
        return this.bottomPadding;
    }

    public final BannerCarouselDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "display_ids") List<String> displayIds, @Json(name = "metrica_label") String metricaLabel, @Json(name = "top_padding") Integer topPadding, @Json(name = "bottom_padding") Integer bottomPadding) {
        return new BannerCarouselDto(widgetId, displayIds, metricaLabel, topPadding, bottomPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerCarouselDto)) {
            return false;
        }
        BannerCarouselDto bannerCarouselDto = (BannerCarouselDto) other;
        return jl40.l(this.widgetId, bannerCarouselDto.widgetId) && jl40.l(this.displayIds, bannerCarouselDto.displayIds) && jl40.l(this.metricaLabel, bannerCarouselDto.metricaLabel) && jl40.l(this.topPadding, bannerCarouselDto.topPadding) && jl40.l(this.bottomPadding, bannerCarouselDto.bottomPadding);
    }

    public final Integer getBottomPadding() {
        return this.bottomPadding;
    }

    public final List<String> getDisplayIds() {
        return this.displayIds;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final Integer getTopPadding() {
        return this.topPadding;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        List<String> list = this.displayIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.topPadding;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomPadding;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        List<String> list = this.displayIds;
        String str2 = this.metricaLabel;
        Integer num = this.topPadding;
        Integer num2 = this.bottomPadding;
        StringBuilder r = xvz.r("BannerCarouselDto(widgetId=", str, ", displayIds=", list, ", metricaLabel=");
        vfc.w(num, str2, ", topPadding=", ", bottomPadding=", r);
        return oo31.j(r, num2, Extension.C_BRAKE);
    }
}
