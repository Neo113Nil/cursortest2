package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NotificationWidgetDto;", "", "widgetId", "", "trailNav", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailNavDto;", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailNavDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getTrailNav", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailNavDto;", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getBackgroundColor", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotificationWidgetDto {
    private final TapActionDto action;
    private final String backgroundColor;
    private final ImageDto leadIcon;
    private final String metricaLabel;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;
    private final TrailNavDto trailNav;
    private final String widgetId;

    public NotificationWidgetDto(@Json(name = "widget_id") String str, @Json(name = "trail_nav") TrailNavDto trailNavDto, @Json(name = "lead_icon") ImageDto imageDto, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "background_color") String str2, @Json(name = "metrica_label") String str3) {
        this.widgetId = str;
        this.trailNav = trailNavDto;
        this.leadIcon = imageDto;
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.action = tapActionDto;
        this.backgroundColor = str2;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ NotificationWidgetDto copy$default(NotificationWidgetDto notificationWidgetDto, String str, TrailNavDto trailNavDto, ImageDto imageDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, TapActionDto tapActionDto, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            trailNavDto = notificationWidgetDto.trailNav;
        }
        if ((i & 4) != 0) {
            imageDto = notificationWidgetDto.leadIcon;
        }
        if ((i & 8) != 0) {
            attributedTextDto = notificationWidgetDto.title;
        }
        if ((i & 16) != 0) {
            attributedTextDto2 = notificationWidgetDto.subtitle;
        }
        if ((i & 32) != 0) {
            tapActionDto = notificationWidgetDto.action;
        }
        if ((i & 64) != 0) {
            str2 = notificationWidgetDto.backgroundColor;
        }
        if ((i & 128) != 0) {
            str3 = notificationWidgetDto.metricaLabel;
        }
        String str4 = str2;
        String str5 = str3;
        AttributedTextDto attributedTextDto3 = attributedTextDto2;
        TapActionDto tapActionDto2 = tapActionDto;
        return notificationWidgetDto.copy(str, trailNavDto, imageDto, attributedTextDto, attributedTextDto3, tapActionDto2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final TrailNavDto getTrailNav() {
        return this.trailNav;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final NotificationWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "trail_nav") TrailNavDto trailNav, @Json(name = "lead_icon") ImageDto leadIcon, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "action") TapActionDto action, @Json(name = "background_color") String backgroundColor, @Json(name = "metrica_label") String metricaLabel) {
        return new NotificationWidgetDto(widgetId, trailNav, leadIcon, title, subtitle, action, backgroundColor, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationWidgetDto)) {
            return false;
        }
        NotificationWidgetDto notificationWidgetDto = (NotificationWidgetDto) other;
        return jl40.l(this.widgetId, notificationWidgetDto.widgetId) && jl40.l(this.trailNav, notificationWidgetDto.trailNav) && jl40.l(this.leadIcon, notificationWidgetDto.leadIcon) && jl40.l(this.title, notificationWidgetDto.title) && jl40.l(this.subtitle, notificationWidgetDto.subtitle) && jl40.l(this.action, notificationWidgetDto.action) && jl40.l(this.backgroundColor, notificationWidgetDto.backgroundColor) && jl40.l(this.metricaLabel, notificationWidgetDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ImageDto getLeadIcon() {
        return this.leadIcon;
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

    public final TrailNavDto getTrailNav() {
        return this.trailNav;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        TrailNavDto trailNavDto = this.trailNav;
        int hashCode2 = (this.leadIcon.hashCode() + ((hashCode + (trailNavDto == null ? 0 : trailNavDto.hashCode())) * 31)) * 31;
        AttributedTextDto attributedTextDto = this.title;
        int e = ly3.e(this.subtitle, (hashCode2 + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31, 31);
        TapActionDto tapActionDto = this.action;
        int b = unr0.b((e + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31, 31, this.backgroundColor);
        String str = this.metricaLabel;
        return b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        TrailNavDto trailNavDto = this.trailNav;
        ImageDto imageDto = this.leadIcon;
        AttributedTextDto attributedTextDto = this.title;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        TapActionDto tapActionDto = this.action;
        String str2 = this.backgroundColor;
        String str3 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("NotificationWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", trailNav=");
        sb.append(trailNavDto);
        sb.append(", leadIcon=");
        sb.append(imageDto);
        sb.append(", title=");
        sb.append(attributedTextDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto2);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", backgroundColor=");
        return g8e.r(sb, str2, ", metricaLabel=", str3, Extension.C_BRAKE);
    }
}
