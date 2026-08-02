package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006*"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/VerticalStackWidgetDto;", "", "widgetId", "", "widgets", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "contentPaddings", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;ILru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getWidgets", "()Ljava/util/List;", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "getCornerRadius", "()I", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getContentPaddings", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerticalStackWidgetDto {
    private final BackgroundDto background;
    private final PaddingsDto contentPaddings;
    private final int cornerRadius;
    private final String metricaLabel;
    private final PaddingsDto paddings;
    private final String widgetId;
    private final List<WidgetDto> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public VerticalStackWidgetDto(@Json(name = "widget_id") String str, @Json(name = "widgets") List<? extends WidgetDto> list, @Json(name = "background") BackgroundDto backgroundDto, @Json(name = "corner_radius") int i, @Json(name = "paddings") PaddingsDto paddingsDto, @Json(name = "content_paddings") PaddingsDto paddingsDto2, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.widgets = list;
        this.background = backgroundDto;
        this.cornerRadius = i;
        this.paddings = paddingsDto;
        this.contentPaddings = paddingsDto2;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ VerticalStackWidgetDto copy$default(VerticalStackWidgetDto verticalStackWidgetDto, String str, List list, BackgroundDto backgroundDto, int i, PaddingsDto paddingsDto, PaddingsDto paddingsDto2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = verticalStackWidgetDto.widgetId;
        }
        if ((i2 & 2) != 0) {
            list = verticalStackWidgetDto.widgets;
        }
        if ((i2 & 4) != 0) {
            backgroundDto = verticalStackWidgetDto.background;
        }
        if ((i2 & 8) != 0) {
            i = verticalStackWidgetDto.cornerRadius;
        }
        if ((i2 & 16) != 0) {
            paddingsDto = verticalStackWidgetDto.paddings;
        }
        if ((i2 & 32) != 0) {
            paddingsDto2 = verticalStackWidgetDto.contentPaddings;
        }
        if ((i2 & 64) != 0) {
            str2 = verticalStackWidgetDto.metricaLabel;
        }
        PaddingsDto paddingsDto3 = paddingsDto2;
        String str3 = str2;
        PaddingsDto paddingsDto4 = paddingsDto;
        BackgroundDto backgroundDto2 = backgroundDto;
        return verticalStackWidgetDto.copy(str, list, backgroundDto2, i, paddingsDto4, paddingsDto3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<WidgetDto> component2() {
        return this.widgets;
    }

    /* renamed from: component3, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component5, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    /* renamed from: component6, reason: from getter */
    public final PaddingsDto getContentPaddings() {
        return this.contentPaddings;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final VerticalStackWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "widgets") List<? extends WidgetDto> widgets, @Json(name = "background") BackgroundDto background, @Json(name = "corner_radius") int cornerRadius, @Json(name = "paddings") PaddingsDto paddings, @Json(name = "content_paddings") PaddingsDto contentPaddings, @Json(name = "metrica_label") String metricaLabel) {
        return new VerticalStackWidgetDto(widgetId, widgets, background, cornerRadius, paddings, contentPaddings, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalStackWidgetDto)) {
            return false;
        }
        VerticalStackWidgetDto verticalStackWidgetDto = (VerticalStackWidgetDto) other;
        return jl40.l(this.widgetId, verticalStackWidgetDto.widgetId) && jl40.l(this.widgets, verticalStackWidgetDto.widgets) && jl40.l(this.background, verticalStackWidgetDto.background) && this.cornerRadius == verticalStackWidgetDto.cornerRadius && jl40.l(this.paddings, verticalStackWidgetDto.paddings) && jl40.l(this.contentPaddings, verticalStackWidgetDto.contentPaddings) && jl40.l(this.metricaLabel, verticalStackWidgetDto.metricaLabel);
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final PaddingsDto getContentPaddings() {
        return this.contentPaddings;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<WidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int c = unr0.c(this.widgetId.hashCode() * 31, 31, this.widgets);
        BackgroundDto backgroundDto = this.background;
        int b = oyr.b(this.cornerRadius, (c + (backgroundDto == null ? 0 : backgroundDto.hashCode())) * 31, 31);
        PaddingsDto paddingsDto = this.paddings;
        int hashCode = (b + (paddingsDto == null ? 0 : paddingsDto.hashCode())) * 31;
        PaddingsDto paddingsDto2 = this.contentPaddings;
        int hashCode2 = (hashCode + (paddingsDto2 == null ? 0 : paddingsDto2.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        List<WidgetDto> list = this.widgets;
        BackgroundDto backgroundDto = this.background;
        int i = this.cornerRadius;
        PaddingsDto paddingsDto = this.paddings;
        PaddingsDto paddingsDto2 = this.contentPaddings;
        String str2 = this.metricaLabel;
        StringBuilder r = xvz.r("VerticalStackWidgetDto(widgetId=", str, ", widgets=", list, ", background=");
        r.append(backgroundDto);
        r.append(", cornerRadius=");
        r.append(i);
        r.append(", paddings=");
        r.append(paddingsDto);
        r.append(", contentPaddings=");
        r.append(paddingsDto2);
        r.append(", metricaLabel=");
        return oyr.t(r, str2, Extension.C_BRAKE);
    }

    public /* synthetic */ VerticalStackWidgetDto(String str, List list, BackgroundDto backgroundDto, int i, PaddingsDto paddingsDto, PaddingsDto paddingsDto2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, backgroundDto, (i2 & 8) != 0 ? 0 : i, paddingsDto, paddingsDto2, str2);
    }
}
