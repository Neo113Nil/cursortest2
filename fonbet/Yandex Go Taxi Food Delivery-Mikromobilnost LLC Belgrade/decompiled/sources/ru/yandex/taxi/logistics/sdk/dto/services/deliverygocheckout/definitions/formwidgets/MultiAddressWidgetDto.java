package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RoutePointsIntervalDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011HÆ\u0003Js\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MultiAddressWidgetDto;", "", "widgetId", "", "routePointsInterval", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "title", "lead", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "trail", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Ljava/lang/Object;)V", "getWidgetId", "()Ljava/lang/String;", "getRoutePointsInterval", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;", "getDescription", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getTitle", "getLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "getTrail", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MultiAddressWidgetDto {
    private final TapActionDto action;
    private final AttributedTextDto description;
    private final SlotLeadDto lead;
    private final Object meta;
    private final String metricaLabel;
    private final RoutePointsIntervalDto routePointsInterval;
    private final AttributedTextDto title;
    private final SlotTrailDto trail;
    private final String widgetId;

    public MultiAddressWidgetDto(@Json(name = "widget_id") String str, @Json(name = "route_points_interval") RoutePointsIntervalDto routePointsIntervalDto, @Json(name = "description") AttributedTextDto attributedTextDto, @Json(name = "title") AttributedTextDto attributedTextDto2, @Json(name = "lead") SlotLeadDto slotLeadDto, @Json(name = "trail") SlotTrailDto slotTrailDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.widgetId = str;
        this.routePointsInterval = routePointsIntervalDto;
        this.description = attributedTextDto;
        this.title = attributedTextDto2;
        this.lead = slotLeadDto;
        this.trail = slotTrailDto;
        this.action = tapActionDto;
        this.metricaLabel = str2;
        this.meta = obj;
    }

    public static /* synthetic */ MultiAddressWidgetDto copy$default(MultiAddressWidgetDto multiAddressWidgetDto, String str, RoutePointsIntervalDto routePointsIntervalDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, SlotLeadDto slotLeadDto, SlotTrailDto slotTrailDto, TapActionDto tapActionDto, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = multiAddressWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            routePointsIntervalDto = multiAddressWidgetDto.routePointsInterval;
        }
        if ((i & 4) != 0) {
            attributedTextDto = multiAddressWidgetDto.description;
        }
        if ((i & 8) != 0) {
            attributedTextDto2 = multiAddressWidgetDto.title;
        }
        if ((i & 16) != 0) {
            slotLeadDto = multiAddressWidgetDto.lead;
        }
        if ((i & 32) != 0) {
            slotTrailDto = multiAddressWidgetDto.trail;
        }
        if ((i & 64) != 0) {
            tapActionDto = multiAddressWidgetDto.action;
        }
        if ((i & 128) != 0) {
            str2 = multiAddressWidgetDto.metricaLabel;
        }
        if ((i & 256) != 0) {
            obj = multiAddressWidgetDto.meta;
        }
        String str3 = str2;
        Object obj3 = obj;
        SlotTrailDto slotTrailDto2 = slotTrailDto;
        TapActionDto tapActionDto2 = tapActionDto;
        SlotLeadDto slotLeadDto2 = slotLeadDto;
        AttributedTextDto attributedTextDto3 = attributedTextDto;
        return multiAddressWidgetDto.copy(str, routePointsIntervalDto, attributedTextDto3, attributedTextDto2, slotLeadDto2, slotTrailDto2, tapActionDto2, str3, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final RoutePointsIntervalDto getRoutePointsInterval() {
        return this.routePointsInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final SlotLeadDto getLead() {
        return this.lead;
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

    /* renamed from: component9, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final MultiAddressWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "route_points_interval") RoutePointsIntervalDto routePointsInterval, @Json(name = "description") AttributedTextDto description, @Json(name = "title") AttributedTextDto title, @Json(name = "lead") SlotLeadDto lead, @Json(name = "trail") SlotTrailDto trail, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new MultiAddressWidgetDto(widgetId, routePointsInterval, description, title, lead, trail, action, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiAddressWidgetDto)) {
            return false;
        }
        MultiAddressWidgetDto multiAddressWidgetDto = (MultiAddressWidgetDto) other;
        return jl40.l(this.widgetId, multiAddressWidgetDto.widgetId) && jl40.l(this.routePointsInterval, multiAddressWidgetDto.routePointsInterval) && jl40.l(this.description, multiAddressWidgetDto.description) && jl40.l(this.title, multiAddressWidgetDto.title) && jl40.l(this.lead, multiAddressWidgetDto.lead) && jl40.l(this.trail, multiAddressWidgetDto.trail) && jl40.l(this.action, multiAddressWidgetDto.action) && jl40.l(this.metricaLabel, multiAddressWidgetDto.metricaLabel) && jl40.l(this.meta, multiAddressWidgetDto.meta);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final AttributedTextDto getDescription() {
        return this.description;
    }

    public final SlotLeadDto getLead() {
        return this.lead;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final RoutePointsIntervalDto getRoutePointsInterval() {
        return this.routePointsInterval;
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
        int e = ly3.e(this.title, ly3.e(this.description, (this.routePointsInterval.hashCode() + (this.widgetId.hashCode() * 31)) * 31, 31), 31);
        SlotLeadDto slotLeadDto = this.lead;
        int hashCode = (e + (slotLeadDto == null ? 0 : slotLeadDto.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail;
        int hashCode2 = (hashCode + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode3 = (hashCode2 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        RoutePointsIntervalDto routePointsIntervalDto = this.routePointsInterval;
        AttributedTextDto attributedTextDto = this.description;
        AttributedTextDto attributedTextDto2 = this.title;
        SlotLeadDto slotLeadDto = this.lead;
        SlotTrailDto slotTrailDto = this.trail;
        TapActionDto tapActionDto = this.action;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("MultiAddressWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", routePointsInterval=");
        sb.append(routePointsIntervalDto);
        sb.append(", description=");
        sb.append(attributedTextDto);
        sb.append(", title=");
        sb.append(attributedTextDto2);
        sb.append(", lead=");
        sb.append(slotLeadDto);
        sb.append(", trail=");
        sb.append(slotTrailDto);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", metricaLabel=");
        sb.append(str2);
        sb.append(", meta=");
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }
}
