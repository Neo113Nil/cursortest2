package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.SegmentActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SegmentWidgetDto;", "", "widgetId", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto;)V", "getWidgetId", "()Ljava/lang/String;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SegmentWidgetDto {
    private final SegmentActionDto action;
    private final String widgetId;

    public SegmentWidgetDto(@Json(name = "widget_id") String str, @Json(name = "action") SegmentActionDto segmentActionDto) {
        this.widgetId = str;
        this.action = segmentActionDto;
    }

    public static /* synthetic */ SegmentWidgetDto copy$default(SegmentWidgetDto segmentWidgetDto, String str, SegmentActionDto segmentActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            segmentActionDto = segmentWidgetDto.action;
        }
        return segmentWidgetDto.copy(str, segmentActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final SegmentActionDto getAction() {
        return this.action;
    }

    public final SegmentWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "action") SegmentActionDto action) {
        return new SegmentWidgetDto(widgetId, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentWidgetDto)) {
            return false;
        }
        SegmentWidgetDto segmentWidgetDto = (SegmentWidgetDto) other;
        return jl40.l(this.widgetId, segmentWidgetDto.widgetId) && jl40.l(this.action, segmentWidgetDto.action);
    }

    public final SegmentActionDto getAction() {
        return this.action;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.widgetId.hashCode() * 31);
    }

    public String toString() {
        return "SegmentWidgetDto(widgetId=" + this.widgetId + ", action=" + this.action + Extension.C_BRAKE;
    }
}
