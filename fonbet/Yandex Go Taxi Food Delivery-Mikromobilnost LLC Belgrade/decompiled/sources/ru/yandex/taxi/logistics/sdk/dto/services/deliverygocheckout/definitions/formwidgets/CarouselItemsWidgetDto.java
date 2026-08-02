package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\nHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemsWidgetDto;", "", "widgetId", "", "horizontalPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemDto;", "itemHeight", "", "indicatorsStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselIndicatorsStyleDto;", "autoscrollIntervalSeconds", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;Ljava/util/List;ILru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselIndicatorsStyleDto;Ljava/lang/Integer;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getHorizontalPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "getItems", "()Ljava/util/List;", "getItemHeight", "()I", "getIndicatorsStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselIndicatorsStyleDto;", "getAutoscrollIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;Ljava/util/List;ILru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselIndicatorsStyleDto;Ljava/lang/Integer;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemsWidgetDto;", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CarouselItemsWidgetDto {
    private final Integer autoscrollIntervalSeconds;
    private final HorizontalPaddingsDto horizontalPaddings;
    private final CarouselIndicatorsStyleDto indicatorsStyle;
    private final int itemHeight;
    private final List<CarouselItemDto> items;
    private final String metricaLabel;
    private final String widgetId;

    public CarouselItemsWidgetDto(@Json(name = "widget_id") String str, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddingsDto, @Json(name = "items") List<CarouselItemDto> list, @Json(name = "item_height") int i, @Json(name = "indicators_style") CarouselIndicatorsStyleDto carouselIndicatorsStyleDto, @Json(name = "autoscroll_interval_seconds") Integer num, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.horizontalPaddings = horizontalPaddingsDto;
        this.items = list;
        this.itemHeight = i;
        this.indicatorsStyle = carouselIndicatorsStyleDto;
        this.autoscrollIntervalSeconds = num;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ CarouselItemsWidgetDto copy$default(CarouselItemsWidgetDto carouselItemsWidgetDto, String str, HorizontalPaddingsDto horizontalPaddingsDto, List list, int i, CarouselIndicatorsStyleDto carouselIndicatorsStyleDto, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = carouselItemsWidgetDto.widgetId;
        }
        if ((i2 & 2) != 0) {
            horizontalPaddingsDto = carouselItemsWidgetDto.horizontalPaddings;
        }
        if ((i2 & 4) != 0) {
            list = carouselItemsWidgetDto.items;
        }
        if ((i2 & 8) != 0) {
            i = carouselItemsWidgetDto.itemHeight;
        }
        if ((i2 & 16) != 0) {
            carouselIndicatorsStyleDto = carouselItemsWidgetDto.indicatorsStyle;
        }
        if ((i2 & 32) != 0) {
            num = carouselItemsWidgetDto.autoscrollIntervalSeconds;
        }
        if ((i2 & 64) != 0) {
            str2 = carouselItemsWidgetDto.metricaLabel;
        }
        Integer num2 = num;
        String str3 = str2;
        CarouselIndicatorsStyleDto carouselIndicatorsStyleDto2 = carouselIndicatorsStyleDto;
        List list2 = list;
        return carouselItemsWidgetDto.copy(str, horizontalPaddingsDto, list2, i, carouselIndicatorsStyleDto2, num2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final List<CarouselItemDto> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final int getItemHeight() {
        return this.itemHeight;
    }

    /* renamed from: component5, reason: from getter */
    public final CarouselIndicatorsStyleDto getIndicatorsStyle() {
        return this.indicatorsStyle;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getAutoscrollIntervalSeconds() {
        return this.autoscrollIntervalSeconds;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final CarouselItemsWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "horizontal_paddings") HorizontalPaddingsDto horizontalPaddings, @Json(name = "items") List<CarouselItemDto> items, @Json(name = "item_height") int itemHeight, @Json(name = "indicators_style") CarouselIndicatorsStyleDto indicatorsStyle, @Json(name = "autoscroll_interval_seconds") Integer autoscrollIntervalSeconds, @Json(name = "metrica_label") String metricaLabel) {
        return new CarouselItemsWidgetDto(widgetId, horizontalPaddings, items, itemHeight, indicatorsStyle, autoscrollIntervalSeconds, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselItemsWidgetDto)) {
            return false;
        }
        CarouselItemsWidgetDto carouselItemsWidgetDto = (CarouselItemsWidgetDto) other;
        return jl40.l(this.widgetId, carouselItemsWidgetDto.widgetId) && jl40.l(this.horizontalPaddings, carouselItemsWidgetDto.horizontalPaddings) && jl40.l(this.items, carouselItemsWidgetDto.items) && this.itemHeight == carouselItemsWidgetDto.itemHeight && jl40.l(this.indicatorsStyle, carouselItemsWidgetDto.indicatorsStyle) && jl40.l(this.autoscrollIntervalSeconds, carouselItemsWidgetDto.autoscrollIntervalSeconds) && jl40.l(this.metricaLabel, carouselItemsWidgetDto.metricaLabel);
    }

    public final Integer getAutoscrollIntervalSeconds() {
        return this.autoscrollIntervalSeconds;
    }

    public final HorizontalPaddingsDto getHorizontalPaddings() {
        return this.horizontalPaddings;
    }

    public final CarouselIndicatorsStyleDto getIndicatorsStyle() {
        return this.indicatorsStyle;
    }

    public final int getItemHeight() {
        return this.itemHeight;
    }

    public final List<CarouselItemDto> getItems() {
        return this.items;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        int b = oyr.b(this.itemHeight, unr0.c((hashCode + (horizontalPaddingsDto == null ? 0 : horizontalPaddingsDto.hashCode())) * 31, 31, this.items), 31);
        CarouselIndicatorsStyleDto carouselIndicatorsStyleDto = this.indicatorsStyle;
        int hashCode2 = (b + (carouselIndicatorsStyleDto == null ? 0 : carouselIndicatorsStyleDto.hashCode())) * 31;
        Integer num = this.autoscrollIntervalSeconds;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        HorizontalPaddingsDto horizontalPaddingsDto = this.horizontalPaddings;
        List<CarouselItemDto> list = this.items;
        int i = this.itemHeight;
        CarouselIndicatorsStyleDto carouselIndicatorsStyleDto = this.indicatorsStyle;
        Integer num = this.autoscrollIntervalSeconds;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("CarouselItemsWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", horizontalPaddings=");
        sb.append(horizontalPaddingsDto);
        sb.append(", items=");
        sb.append(list);
        sb.append(", itemHeight=");
        sb.append(i);
        sb.append(", indicatorsStyle=");
        sb.append(carouselIndicatorsStyleDto);
        sb.append(", autoscrollIntervalSeconds=");
        sb.append(num);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
