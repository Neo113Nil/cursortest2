package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemsWidgetDto;", "", "widgetId", "", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrollableItemsWidgetDto {
    private final List<ScrollableItemDto> items;
    private final String metricaLabel;
    private final String widgetId;

    public ScrollableItemsWidgetDto(@Json(name = "widget_id") String str, @Json(name = "items") List<ScrollableItemDto> list, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.items = list;
        this.metricaLabel = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScrollableItemsWidgetDto copy$default(ScrollableItemsWidgetDto scrollableItemsWidgetDto, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scrollableItemsWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            list = scrollableItemsWidgetDto.items;
        }
        if ((i & 4) != 0) {
            str2 = scrollableItemsWidgetDto.metricaLabel;
        }
        return scrollableItemsWidgetDto.copy(str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<ScrollableItemDto> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ScrollableItemsWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "items") List<ScrollableItemDto> items, @Json(name = "metrica_label") String metricaLabel) {
        return new ScrollableItemsWidgetDto(widgetId, items, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableItemsWidgetDto)) {
            return false;
        }
        ScrollableItemsWidgetDto scrollableItemsWidgetDto = (ScrollableItemsWidgetDto) other;
        return jl40.l(this.widgetId, scrollableItemsWidgetDto.widgetId) && jl40.l(this.items, scrollableItemsWidgetDto.items) && jl40.l(this.metricaLabel, scrollableItemsWidgetDto.metricaLabel);
    }

    public final List<ScrollableItemDto> getItems() {
        return this.items;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c(this.widgetId.hashCode() * 31, 31, this.items);
        String str = this.metricaLabel;
        return c + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        List<ScrollableItemDto> list = this.items;
        return oyr.t(xvz.r("ScrollableItemsWidgetDto(widgetId=", str, ", items=", list, ", metricaLabel="), this.metricaLabel, Extension.C_BRAKE);
    }
}
