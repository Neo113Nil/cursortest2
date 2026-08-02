package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006*"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutWidgetDto;", "", "widgetId", "", "size", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto;", "lineSpacing", "", "columnSpacing", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;Ljava/util/List;IILru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;", "getItems", "()Ljava/util/List;", "getLineSpacing", "()I", "getColumnSpacing", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GridLayoutWidgetDto {
    private final int columnSpacing;
    private final List<GridItemDto> items;
    private final int lineSpacing;
    private final String metricaLabel;
    private final PaddingsDto paddings;
    private final GridLayoutSizeDto size;
    private final String widgetId;

    public GridLayoutWidgetDto(@Json(name = "widget_id") String str, @Json(name = "size") GridLayoutSizeDto gridLayoutSizeDto, @Json(name = "items") List<GridItemDto> list, @Json(name = "line_spacing") int i, @Json(name = "column_spacing") int i2, @Json(name = "paddings") PaddingsDto paddingsDto, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.size = gridLayoutSizeDto;
        this.items = list;
        this.lineSpacing = i;
        this.columnSpacing = i2;
        this.paddings = paddingsDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ GridLayoutWidgetDto copy$default(GridLayoutWidgetDto gridLayoutWidgetDto, String str, GridLayoutSizeDto gridLayoutSizeDto, List list, int i, int i2, PaddingsDto paddingsDto, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = gridLayoutWidgetDto.widgetId;
        }
        if ((i3 & 2) != 0) {
            gridLayoutSizeDto = gridLayoutWidgetDto.size;
        }
        if ((i3 & 4) != 0) {
            list = gridLayoutWidgetDto.items;
        }
        if ((i3 & 8) != 0) {
            i = gridLayoutWidgetDto.lineSpacing;
        }
        if ((i3 & 16) != 0) {
            i2 = gridLayoutWidgetDto.columnSpacing;
        }
        if ((i3 & 32) != 0) {
            paddingsDto = gridLayoutWidgetDto.paddings;
        }
        if ((i3 & 64) != 0) {
            str2 = gridLayoutWidgetDto.metricaLabel;
        }
        PaddingsDto paddingsDto2 = paddingsDto;
        String str3 = str2;
        int i4 = i2;
        List list2 = list;
        return gridLayoutWidgetDto.copy(str, gridLayoutSizeDto, list2, i, i4, paddingsDto2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final GridLayoutSizeDto getSize() {
        return this.size;
    }

    public final List<GridItemDto> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLineSpacing() {
        return this.lineSpacing;
    }

    /* renamed from: component5, reason: from getter */
    public final int getColumnSpacing() {
        return this.columnSpacing;
    }

    /* renamed from: component6, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final GridLayoutWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "size") GridLayoutSizeDto size, @Json(name = "items") List<GridItemDto> items, @Json(name = "line_spacing") int lineSpacing, @Json(name = "column_spacing") int columnSpacing, @Json(name = "paddings") PaddingsDto paddings, @Json(name = "metrica_label") String metricaLabel) {
        return new GridLayoutWidgetDto(widgetId, size, items, lineSpacing, columnSpacing, paddings, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridLayoutWidgetDto)) {
            return false;
        }
        GridLayoutWidgetDto gridLayoutWidgetDto = (GridLayoutWidgetDto) other;
        return jl40.l(this.widgetId, gridLayoutWidgetDto.widgetId) && jl40.l(this.size, gridLayoutWidgetDto.size) && jl40.l(this.items, gridLayoutWidgetDto.items) && this.lineSpacing == gridLayoutWidgetDto.lineSpacing && this.columnSpacing == gridLayoutWidgetDto.columnSpacing && jl40.l(this.paddings, gridLayoutWidgetDto.paddings) && jl40.l(this.metricaLabel, gridLayoutWidgetDto.metricaLabel);
    }

    public final int getColumnSpacing() {
        return this.columnSpacing;
    }

    public final List<GridItemDto> getItems() {
        return this.items;
    }

    public final int getLineSpacing() {
        return this.lineSpacing;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final GridLayoutSizeDto getSize() {
        return this.size;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.paddings.hashCode() + oyr.b(this.columnSpacing, oyr.b(this.lineSpacing, unr0.c((this.size.hashCode() + (this.widgetId.hashCode() * 31)) * 31, 31, this.items), 31), 31)) * 31;
        String str = this.metricaLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        GridLayoutSizeDto gridLayoutSizeDto = this.size;
        List<GridItemDto> list = this.items;
        int i = this.lineSpacing;
        int i2 = this.columnSpacing;
        PaddingsDto paddingsDto = this.paddings;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("GridLayoutWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", size=");
        sb.append(gridLayoutSizeDto);
        sb.append(", items=");
        sb.append(list);
        sb.append(", lineSpacing=");
        sb.append(i);
        sb.append(", columnSpacing=");
        sb.append(i2);
        sb.append(", paddings=");
        sb.append(paddingsDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    public /* synthetic */ GridLayoutWidgetDto(String str, GridLayoutSizeDto gridLayoutSizeDto, List list, int i, int i2, PaddingsDto paddingsDto, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, gridLayoutSizeDto, list, (i3 & 8) != 0 ? 8 : i, (i3 & 16) != 0 ? 8 : i2, paddingsDto, str2);
    }
}
