package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutWidgetDto;", "", "widgetId", "", "content", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutContentDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "badge", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutContentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getContent", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutContentDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getBadge", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShortcutWidgetDto {
    private final TapActionDto action;
    private final FormBadgeDto badge;
    private final ShortcutContentDto content;
    private final String metricaLabel;
    private final String widgetId;

    public ShortcutWidgetDto(@Json(name = "widget_id") String str, @Json(name = "content") ShortcutContentDto shortcutContentDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "badge") FormBadgeDto formBadgeDto, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.content = shortcutContentDto;
        this.action = tapActionDto;
        this.badge = formBadgeDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ShortcutWidgetDto copy$default(ShortcutWidgetDto shortcutWidgetDto, String str, ShortcutContentDto shortcutContentDto, TapActionDto tapActionDto, FormBadgeDto formBadgeDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shortcutWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            shortcutContentDto = shortcutWidgetDto.content;
        }
        if ((i & 4) != 0) {
            tapActionDto = shortcutWidgetDto.action;
        }
        if ((i & 8) != 0) {
            formBadgeDto = shortcutWidgetDto.badge;
        }
        if ((i & 16) != 0) {
            str2 = shortcutWidgetDto.metricaLabel;
        }
        String str3 = str2;
        TapActionDto tapActionDto2 = tapActionDto;
        return shortcutWidgetDto.copy(str, shortcutContentDto, tapActionDto2, formBadgeDto, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final ShortcutContentDto getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ShortcutWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "content") ShortcutContentDto content, @Json(name = "action") TapActionDto action, @Json(name = "badge") FormBadgeDto badge, @Json(name = "metrica_label") String metricaLabel) {
        return new ShortcutWidgetDto(widgetId, content, action, badge, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutWidgetDto)) {
            return false;
        }
        ShortcutWidgetDto shortcutWidgetDto = (ShortcutWidgetDto) other;
        return jl40.l(this.widgetId, shortcutWidgetDto.widgetId) && jl40.l(this.content, shortcutWidgetDto.content) && jl40.l(this.action, shortcutWidgetDto.action) && jl40.l(this.badge, shortcutWidgetDto.badge) && jl40.l(this.metricaLabel, shortcutWidgetDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    public final ShortcutContentDto getContent() {
        return this.content;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + (this.widgetId.hashCode() * 31)) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode2 = (hashCode + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        FormBadgeDto formBadgeDto = this.badge;
        int hashCode3 = (hashCode2 + (formBadgeDto == null ? 0 : formBadgeDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        ShortcutContentDto shortcutContentDto = this.content;
        TapActionDto tapActionDto = this.action;
        FormBadgeDto formBadgeDto = this.badge;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ShortcutWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", content=");
        sb.append(shortcutContentDto);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", badge=");
        sb.append(formBadgeDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
