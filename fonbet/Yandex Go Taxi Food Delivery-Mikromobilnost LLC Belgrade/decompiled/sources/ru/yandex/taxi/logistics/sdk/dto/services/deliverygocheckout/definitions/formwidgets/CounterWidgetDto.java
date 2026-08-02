package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.CounterActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CounterWidgetDto;", "", "widgetId", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;", "horizontalPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;)V", "getWidgetId", "()Ljava/lang/String;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;", "getHorizontalPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CounterWidgetDto {
    private final CounterActionDto action;
    private final HorizontalPaddingsDto horizontalPaddings;
    private final String widgetId;

    public CounterWidgetDto(@Json(name = "widget_id") String str, @Json(name = "action") CounterActionDto counterActionDto, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddingsDto) {
        this.widgetId = str;
        this.action = counterActionDto;
        this.horizontalPaddings = horizontalPaddingsDto;
    }

    public static /* synthetic */ CounterWidgetDto copy$default(CounterWidgetDto counterWidgetDto, String str, CounterActionDto counterActionDto, HorizontalPaddingsDto horizontalPaddingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = counterWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            counterActionDto = counterWidgetDto.action;
        }
        if ((i & 4) != 0) {
            horizontalPaddingsDto = counterWidgetDto.horizontalPaddings;
        }
        return counterWidgetDto.copy(str, counterActionDto, horizontalPaddingsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final CounterActionDto getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final CounterWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "action") CounterActionDto action, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddings) {
        return new CounterWidgetDto(widgetId, action, horizontalPaddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CounterWidgetDto)) {
            return false;
        }
        CounterWidgetDto counterWidgetDto = (CounterWidgetDto) other;
        return jl40.l(this.widgetId, counterWidgetDto.widgetId) && jl40.l(this.action, counterWidgetDto.action) && jl40.l(this.horizontalPaddings, counterWidgetDto.horizontalPaddings);
    }

    public final CounterActionDto getAction() {
        return this.action;
    }

    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.action.hashCode() + (this.widgetId.hashCode() * 31)) * 31;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        return hashCode + (horizontalPaddingsDto == null ? 0 : horizontalPaddingsDto.hashCode());
    }

    public String toString() {
        return "CounterWidgetDto(widgetId=" + this.widgetId + ", action=" + this.action + ", horizontalPaddings=" + this.horizontalPaddings + Extension.C_BRAKE;
    }
}
