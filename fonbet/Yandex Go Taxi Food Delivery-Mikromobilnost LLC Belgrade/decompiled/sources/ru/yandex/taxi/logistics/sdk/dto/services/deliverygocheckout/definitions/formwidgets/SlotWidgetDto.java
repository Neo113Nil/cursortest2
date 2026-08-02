package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AccessibilityInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotWidgetDto;", "", "widgetId", "", "slot", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;", "metricaLabel", "accessibilityInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;)V", "getWidgetId", "()Ljava/lang/String;", "getSlot", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;", "getMetricaLabel", "getAccessibilityInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlotWidgetDto {
    private final AccessibilityInfoDto accessibilityInfo;
    private final String metricaLabel;
    private final SlotDto slot;
    private final String widgetId;

    public SlotWidgetDto(@Json(name = "widget_id") String str, @Json(name = "slot") SlotDto slotDto, @Json(name = "metrica_label") String str2, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfoDto) {
        this.widgetId = str;
        this.slot = slotDto;
        this.metricaLabel = str2;
        this.accessibilityInfo = accessibilityInfoDto;
    }

    public static /* synthetic */ SlotWidgetDto copy$default(SlotWidgetDto slotWidgetDto, String str, SlotDto slotDto, String str2, AccessibilityInfoDto accessibilityInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            slotDto = slotWidgetDto.slot;
        }
        if ((i & 4) != 0) {
            str2 = slotWidgetDto.metricaLabel;
        }
        if ((i & 8) != 0) {
            accessibilityInfoDto = slotWidgetDto.accessibilityInfo;
        }
        return slotWidgetDto.copy(str, slotDto, str2, accessibilityInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final SlotDto getSlot() {
        return this.slot;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final SlotWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "slot") SlotDto slot, @Json(name = "metrica_label") String metricaLabel, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfo) {
        return new SlotWidgetDto(widgetId, slot, metricaLabel, accessibilityInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotWidgetDto)) {
            return false;
        }
        SlotWidgetDto slotWidgetDto = (SlotWidgetDto) other;
        return jl40.l(this.widgetId, slotWidgetDto.widgetId) && jl40.l(this.slot, slotWidgetDto.slot) && jl40.l(this.metricaLabel, slotWidgetDto.metricaLabel) && jl40.l(this.accessibilityInfo, slotWidgetDto.accessibilityInfo);
    }

    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SlotDto getSlot() {
        return this.slot;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.slot.hashCode() + (this.widgetId.hashCode() * 31)) * 31;
        String str = this.metricaLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AccessibilityInfoDto accessibilityInfoDto = this.accessibilityInfo;
        return hashCode2 + (accessibilityInfoDto != null ? accessibilityInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "SlotWidgetDto(widgetId=" + this.widgetId + ", slot=" + this.slot + ", metricaLabel=" + this.metricaLabel + ", accessibilityInfo=" + this.accessibilityInfo + Extension.C_BRAKE;
    }
}
