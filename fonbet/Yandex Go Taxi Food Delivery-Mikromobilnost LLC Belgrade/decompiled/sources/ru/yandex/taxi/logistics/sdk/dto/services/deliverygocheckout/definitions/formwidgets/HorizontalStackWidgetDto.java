package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006'"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetDto;", "", "widgetId", "", "arrangedItems", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto;", "horizontalPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "spacingWidth", "", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;Ljava/lang/Object;ILjava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getArrangedItems", "()Ljava/util/List;", "getHorizontalPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "getMeta", "()Ljava/lang/Object;", "getSpacingWidth", "()I", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HorizontalStackWidgetDto {
    private final List<HorizontalStackWidgetItemDto> arrangedItems;
    private final HorizontalPaddingsDto horizontalPaddings;
    private final Object meta;
    private final String metricaLabel;
    private final int spacingWidth;
    private final String widgetId;

    public HorizontalStackWidgetDto(@Json(name = "widget_id") String str, @Json(name = "arranged_items") List<HorizontalStackWidgetItemDto> list, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddingsDto, @Json(name = "meta") Object obj, @Json(name = "spacing_width") int i, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.arrangedItems = list;
        this.horizontalPaddings = horizontalPaddingsDto;
        this.meta = obj;
        this.spacingWidth = i;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ HorizontalStackWidgetDto copy$default(HorizontalStackWidgetDto horizontalStackWidgetDto, String str, List list, HorizontalPaddingsDto horizontalPaddingsDto, Object obj, int i, String str2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = horizontalStackWidgetDto.widgetId;
        }
        if ((i2 & 2) != 0) {
            list = horizontalStackWidgetDto.arrangedItems;
        }
        if ((i2 & 4) != 0) {
            horizontalPaddingsDto = horizontalStackWidgetDto.horizontalPaddings;
        }
        if ((i2 & 8) != 0) {
            obj = horizontalStackWidgetDto.meta;
        }
        if ((i2 & 16) != 0) {
            i = horizontalStackWidgetDto.spacingWidth;
        }
        if ((i2 & 32) != 0) {
            str2 = horizontalStackWidgetDto.metricaLabel;
        }
        int i3 = i;
        String str3 = str2;
        return horizontalStackWidgetDto.copy(str, list, horizontalPaddingsDto, obj, i3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<HorizontalStackWidgetItemDto> component2() {
        return this.arrangedItems;
    }

    /* renamed from: component3, reason: from getter */
    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSpacingWidth() {
        return this.spacingWidth;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final HorizontalStackWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "arranged_items") List<HorizontalStackWidgetItemDto> arrangedItems, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddings, @Json(name = "meta") Object meta, @Json(name = "spacing_width") int spacingWidth, @Json(name = "metrica_label") String metricaLabel) {
        return new HorizontalStackWidgetDto(widgetId, arrangedItems, horizontalPaddings, meta, spacingWidth, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalStackWidgetDto)) {
            return false;
        }
        HorizontalStackWidgetDto horizontalStackWidgetDto = (HorizontalStackWidgetDto) other;
        return jl40.l(this.widgetId, horizontalStackWidgetDto.widgetId) && jl40.l(this.arrangedItems, horizontalStackWidgetDto.arrangedItems) && jl40.l(this.horizontalPaddings, horizontalStackWidgetDto.horizontalPaddings) && jl40.l(this.meta, horizontalStackWidgetDto.meta) && this.spacingWidth == horizontalStackWidgetDto.spacingWidth && jl40.l(this.metricaLabel, horizontalStackWidgetDto.metricaLabel);
    }

    public final List<HorizontalStackWidgetItemDto> getArrangedItems() {
        return this.arrangedItems;
    }

    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final int getSpacingWidth() {
        return this.spacingWidth;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c(this.widgetId.hashCode() * 31, 31, this.arrangedItems);
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        int hashCode = (c + (horizontalPaddingsDto == null ? 0 : horizontalPaddingsDto.hashCode())) * 31;
        Object obj = this.meta;
        int b = oyr.b(this.spacingWidth, (hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31);
        String str = this.metricaLabel;
        return b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        List<HorizontalStackWidgetItemDto> list = this.arrangedItems;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        Object obj = this.meta;
        int i = this.spacingWidth;
        String str2 = this.metricaLabel;
        StringBuilder r = xvz.r("HorizontalStackWidgetDto(widgetId=", str, ", arrangedItems=", list, ", horizontalPaddings=");
        r.append(horizontalPaddingsDto);
        r.append(", meta=");
        r.append(obj);
        r.append(", spacingWidth=");
        return xvz.h(i, ", metricaLabel=", str2, Extension.C_BRAKE, r);
    }

    public /* synthetic */ HorizontalStackWidgetDto(String str, List list, HorizontalPaddingsDto horizontalPaddingsDto, Object obj, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, horizontalPaddingsDto, obj, (i2 & 16) != 0 ? 4 : i, str2);
    }
}
