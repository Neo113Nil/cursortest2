package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FlatNavigationHeaderWidgetDto;", "", "widgetId", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "titleLeadingIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/StaticImageDto;", "trail1", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/StaticImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getTitleLeadingIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/StaticImageDto;", "getTrail1", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlatNavigationHeaderWidgetDto {
    private final TapActionDto action;
    private final String metricaLabel;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;
    private final StaticImageDto titleLeadingIcon;
    private final SlotTrailDto trail1;
    private final String widgetId;

    public FlatNavigationHeaderWidgetDto(@Json(name = "widget_id") String str, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "title_leading_icon") StaticImageDto staticImageDto, @Json(name = "trail1") SlotTrailDto slotTrailDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.titleLeadingIcon = staticImageDto;
        this.trail1 = slotTrailDto;
        this.action = tapActionDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ FlatNavigationHeaderWidgetDto copy$default(FlatNavigationHeaderWidgetDto flatNavigationHeaderWidgetDto, String str, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, StaticImageDto staticImageDto, SlotTrailDto slotTrailDto, TapActionDto tapActionDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flatNavigationHeaderWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            attributedTextDto = flatNavigationHeaderWidgetDto.title;
        }
        if ((i & 4) != 0) {
            attributedTextDto2 = flatNavigationHeaderWidgetDto.subtitle;
        }
        if ((i & 8) != 0) {
            staticImageDto = flatNavigationHeaderWidgetDto.titleLeadingIcon;
        }
        if ((i & 16) != 0) {
            slotTrailDto = flatNavigationHeaderWidgetDto.trail1;
        }
        if ((i & 32) != 0) {
            tapActionDto = flatNavigationHeaderWidgetDto.action;
        }
        if ((i & 64) != 0) {
            str2 = flatNavigationHeaderWidgetDto.metricaLabel;
        }
        TapActionDto tapActionDto2 = tapActionDto;
        String str3 = str2;
        SlotTrailDto slotTrailDto2 = slotTrailDto;
        AttributedTextDto attributedTextDto3 = attributedTextDto2;
        return flatNavigationHeaderWidgetDto.copy(str, attributedTextDto, attributedTextDto3, staticImageDto, slotTrailDto2, tapActionDto2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final StaticImageDto getTitleLeadingIcon() {
        return this.titleLeadingIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    /* renamed from: component6, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final FlatNavigationHeaderWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "title_leading_icon") StaticImageDto titleLeadingIcon, @Json(name = "trail1") SlotTrailDto trail1, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel) {
        return new FlatNavigationHeaderWidgetDto(widgetId, title, subtitle, titleLeadingIcon, trail1, action, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatNavigationHeaderWidgetDto)) {
            return false;
        }
        FlatNavigationHeaderWidgetDto flatNavigationHeaderWidgetDto = (FlatNavigationHeaderWidgetDto) other;
        return jl40.l(this.widgetId, flatNavigationHeaderWidgetDto.widgetId) && jl40.l(this.title, flatNavigationHeaderWidgetDto.title) && jl40.l(this.subtitle, flatNavigationHeaderWidgetDto.subtitle) && jl40.l(this.titleLeadingIcon, flatNavigationHeaderWidgetDto.titleLeadingIcon) && jl40.l(this.trail1, flatNavigationHeaderWidgetDto.trail1) && jl40.l(this.action, flatNavigationHeaderWidgetDto.action) && jl40.l(this.metricaLabel, flatNavigationHeaderWidgetDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public final StaticImageDto getTitleLeadingIcon() {
        return this.titleLeadingIcon;
    }

    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.title;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        int hashCode3 = (hashCode2 + (attributedTextDto2 == null ? 0 : attributedTextDto2.hashCode())) * 31;
        StaticImageDto staticImageDto = this.titleLeadingIcon;
        int hashCode4 = (hashCode3 + (staticImageDto == null ? 0 : staticImageDto.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail1;
        int hashCode5 = (hashCode4 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode6 = (hashCode5 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        AttributedTextDto attributedTextDto = this.title;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        StaticImageDto staticImageDto = this.titleLeadingIcon;
        SlotTrailDto slotTrailDto = this.trail1;
        TapActionDto tapActionDto = this.action;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("FlatNavigationHeaderWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", title=");
        sb.append(attributedTextDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto2);
        sb.append(", titleLeadingIcon=");
        sb.append(staticImageDto);
        sb.append(", trail1=");
        sb.append(slotTrailDto);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
