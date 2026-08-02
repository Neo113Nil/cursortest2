package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LoadingSpinnerWidgetDto;", "", "widgetId", "", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LoadingSpinnerWidgetDto {
    private final String color;
    private final String widgetId;

    public LoadingSpinnerWidgetDto(@Json(name = "widget_id") String str, @Json(name = "color") String str2) {
        this.widgetId = str;
        this.color = str2;
    }

    public static /* synthetic */ LoadingSpinnerWidgetDto copy$default(LoadingSpinnerWidgetDto loadingSpinnerWidgetDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadingSpinnerWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = loadingSpinnerWidgetDto.color;
        }
        return loadingSpinnerWidgetDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final LoadingSpinnerWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "color") String color) {
        return new LoadingSpinnerWidgetDto(widgetId, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingSpinnerWidgetDto)) {
            return false;
        }
        LoadingSpinnerWidgetDto loadingSpinnerWidgetDto = (LoadingSpinnerWidgetDto) other;
        return jl40.l(this.widgetId, loadingSpinnerWidgetDto.widgetId) && jl40.l(this.color, loadingSpinnerWidgetDto.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return this.color.hashCode() + (this.widgetId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("LoadingSpinnerWidgetDto(widgetId=", this.widgetId, ", color=", this.color, Extension.C_BRAKE);
    }
}
