package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetDto;", "", "widgetId", "", "lead", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetLeadDto;", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "trail", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetLeadDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetLeadDto;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getDescription", "getTrail", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CartWidgetDto {
    private final TapActionDto action;
    private final AttributedTextDto description;
    private final CartWidgetLeadDto lead;
    private final String metricaLabel;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;
    private final SlotTrailDto trail;
    private final String widgetId;

    public CartWidgetDto(@Json(name = "widget_id") String str, @Json(name = "lead") CartWidgetLeadDto cartWidgetLeadDto, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "description") AttributedTextDto attributedTextDto3, @Json(name = "trail") SlotTrailDto slotTrailDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.lead = cartWidgetLeadDto;
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.description = attributedTextDto3;
        this.trail = slotTrailDto;
        this.action = tapActionDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ CartWidgetDto copy$default(CartWidgetDto cartWidgetDto, String str, CartWidgetLeadDto cartWidgetLeadDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, AttributedTextDto attributedTextDto3, SlotTrailDto slotTrailDto, TapActionDto tapActionDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cartWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            cartWidgetLeadDto = cartWidgetDto.lead;
        }
        if ((i & 4) != 0) {
            attributedTextDto = cartWidgetDto.title;
        }
        if ((i & 8) != 0) {
            attributedTextDto2 = cartWidgetDto.subtitle;
        }
        if ((i & 16) != 0) {
            attributedTextDto3 = cartWidgetDto.description;
        }
        if ((i & 32) != 0) {
            slotTrailDto = cartWidgetDto.trail;
        }
        if ((i & 64) != 0) {
            tapActionDto = cartWidgetDto.action;
        }
        if ((i & 128) != 0) {
            str2 = cartWidgetDto.metricaLabel;
        }
        TapActionDto tapActionDto2 = tapActionDto;
        String str3 = str2;
        AttributedTextDto attributedTextDto4 = attributedTextDto3;
        SlotTrailDto slotTrailDto2 = slotTrailDto;
        return cartWidgetDto.copy(str, cartWidgetLeadDto, attributedTextDto, attributedTextDto2, attributedTextDto4, slotTrailDto2, tapActionDto2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final CartWidgetLeadDto getLead() {
        return this.lead;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final AttributedTextDto getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    /* renamed from: component7, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final CartWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "lead") CartWidgetLeadDto lead, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "description") AttributedTextDto description, @Json(name = "trail") SlotTrailDto trail, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel) {
        return new CartWidgetDto(widgetId, lead, title, subtitle, description, trail, action, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartWidgetDto)) {
            return false;
        }
        CartWidgetDto cartWidgetDto = (CartWidgetDto) other;
        return jl40.l(this.widgetId, cartWidgetDto.widgetId) && jl40.l(this.lead, cartWidgetDto.lead) && jl40.l(this.title, cartWidgetDto.title) && jl40.l(this.subtitle, cartWidgetDto.subtitle) && jl40.l(this.description, cartWidgetDto.description) && jl40.l(this.trail, cartWidgetDto.trail) && jl40.l(this.action, cartWidgetDto.action) && jl40.l(this.metricaLabel, cartWidgetDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final AttributedTextDto getDescription() {
        return this.description;
    }

    public final CartWidgetLeadDto getLead() {
        return this.lead;
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

    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        CartWidgetLeadDto cartWidgetLeadDto = this.lead;
        int e = ly3.e(this.title, (hashCode + (cartWidgetLeadDto == null ? 0 : cartWidgetLeadDto.hashCode())) * 31, 31);
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode2 = (e + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        AttributedTextDto attributedTextDto2 = this.description;
        int hashCode3 = (hashCode2 + (attributedTextDto2 == null ? 0 : attributedTextDto2.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail;
        int hashCode4 = (hashCode3 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode5 = (hashCode4 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CartWidgetDto(widgetId=" + this.widgetId + ", lead=" + this.lead + ", title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ", trail=" + this.trail + ", action=" + this.action + ", metricaLabel=" + this.metricaLabel + Extension.C_BRAKE;
    }
}
