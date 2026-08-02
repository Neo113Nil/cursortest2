package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetConfigurationDto;", "", "widget", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetDto;", "positionChangingAvailable", "", "removalAvailable", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetDto;ZZ)V", "getWidget", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetDto;", "getPositionChangingAvailable", "()Z", "getRemovalAvailable", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RoutePointWidgetConfigurationDto {
    private final boolean positionChangingAvailable;
    private final boolean removalAvailable;
    private final RoutePointWidgetDto widget;

    public /* synthetic */ RoutePointWidgetConfigurationDto(RoutePointWidgetDto routePointWidgetDto, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(routePointWidgetDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public static /* synthetic */ RoutePointWidgetConfigurationDto copy$default(RoutePointWidgetConfigurationDto routePointWidgetConfigurationDto, RoutePointWidgetDto routePointWidgetDto, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            routePointWidgetDto = routePointWidgetConfigurationDto.widget;
        }
        if ((i & 2) != 0) {
            z = routePointWidgetConfigurationDto.positionChangingAvailable;
        }
        if ((i & 4) != 0) {
            z2 = routePointWidgetConfigurationDto.removalAvailable;
        }
        return routePointWidgetConfigurationDto.copy(routePointWidgetDto, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final RoutePointWidgetDto getWidget() {
        return this.widget;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPositionChangingAvailable() {
        return this.positionChangingAvailable;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRemovalAvailable() {
        return this.removalAvailable;
    }

    public final RoutePointWidgetConfigurationDto copy(@Json(name = "widget") RoutePointWidgetDto widget, @Json(name = "position_changing_available") boolean positionChangingAvailable, @Json(name = "removal_available") boolean removalAvailable) {
        return new RoutePointWidgetConfigurationDto(widget, positionChangingAvailable, removalAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointWidgetConfigurationDto)) {
            return false;
        }
        RoutePointWidgetConfigurationDto routePointWidgetConfigurationDto = (RoutePointWidgetConfigurationDto) other;
        return jl40.l(this.widget, routePointWidgetConfigurationDto.widget) && this.positionChangingAvailable == routePointWidgetConfigurationDto.positionChangingAvailable && this.removalAvailable == routePointWidgetConfigurationDto.removalAvailable;
    }

    public final boolean getPositionChangingAvailable() {
        return this.positionChangingAvailable;
    }

    public final boolean getRemovalAvailable() {
        return this.removalAvailable;
    }

    public final RoutePointWidgetDto getWidget() {
        return this.widget;
    }

    public int hashCode() {
        return Boolean.hashCode(this.removalAvailable) + unr0.e(this.widget.hashCode() * 31, 31, this.positionChangingAvailable);
    }

    public String toString() {
        RoutePointWidgetDto routePointWidgetDto = this.widget;
        boolean z = this.positionChangingAvailable;
        boolean z2 = this.removalAvailable;
        StringBuilder sb = new StringBuilder("RoutePointWidgetConfigurationDto(widget=");
        sb.append(routePointWidgetDto);
        sb.append(", positionChangingAvailable=");
        sb.append(z);
        sb.append(", removalAvailable=");
        return x4e.i(sb, z2, Extension.C_BRAKE);
    }

    public RoutePointWidgetConfigurationDto(@Json(name = "widget") RoutePointWidgetDto routePointWidgetDto, @Json(name = "position_changing_available") boolean z, @Json(name = "removal_available") boolean z2) {
        this.widget = routePointWidgetDto;
        this.positionChangingAvailable = z;
        this.removalAvailable = z2;
    }
}
