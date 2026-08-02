package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDto;", "", "iconSpot", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/IconSpotDto;", "hasBubbleArrow", "", "routePointIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/IconSpotDto;ZLru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;)V", "getIconSpot", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/IconSpotDto;", "getHasBubbleArrow", "()Z", "getRoutePointIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MapPinDto {
    private final boolean hasBubbleArrow;
    private final IconSpotDto iconSpot;
    private final ImageDto routePointIcon;

    public MapPinDto(@Json(name = "icon_spot") IconSpotDto iconSpotDto, @Json(name = "has_bubble_arrow") boolean z, @Json(name = "route_point_icon") ImageDto imageDto) {
        this.iconSpot = iconSpotDto;
        this.hasBubbleArrow = z;
        this.routePointIcon = imageDto;
    }

    public static /* synthetic */ MapPinDto copy$default(MapPinDto mapPinDto, IconSpotDto iconSpotDto, boolean z, ImageDto imageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            iconSpotDto = mapPinDto.iconSpot;
        }
        if ((i & 2) != 0) {
            z = mapPinDto.hasBubbleArrow;
        }
        if ((i & 4) != 0) {
            imageDto = mapPinDto.routePointIcon;
        }
        return mapPinDto.copy(iconSpotDto, z, imageDto);
    }

    /* renamed from: component1, reason: from getter */
    public final IconSpotDto getIconSpot() {
        return this.iconSpot;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasBubbleArrow() {
        return this.hasBubbleArrow;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageDto getRoutePointIcon() {
        return this.routePointIcon;
    }

    public final MapPinDto copy(@Json(name = "icon_spot") IconSpotDto iconSpot, @Json(name = "has_bubble_arrow") boolean hasBubbleArrow, @Json(name = "route_point_icon") ImageDto routePointIcon) {
        return new MapPinDto(iconSpot, hasBubbleArrow, routePointIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapPinDto)) {
            return false;
        }
        MapPinDto mapPinDto = (MapPinDto) other;
        return jl40.l(this.iconSpot, mapPinDto.iconSpot) && this.hasBubbleArrow == mapPinDto.hasBubbleArrow && jl40.l(this.routePointIcon, mapPinDto.routePointIcon);
    }

    public final boolean getHasBubbleArrow() {
        return this.hasBubbleArrow;
    }

    public final IconSpotDto getIconSpot() {
        return this.iconSpot;
    }

    public final ImageDto getRoutePointIcon() {
        return this.routePointIcon;
    }

    public int hashCode() {
        return this.routePointIcon.hashCode() + unr0.e(this.iconSpot.hashCode() * 31, 31, this.hasBubbleArrow);
    }

    public String toString() {
        return "MapPinDto(iconSpot=" + this.iconSpot + ", hasBubbleArrow=" + this.hasBubbleArrow + ", routePointIcon=" + this.routePointIcon + Extension.C_BRAKE;
    }

    public /* synthetic */ MapPinDto(IconSpotDto iconSpotDto, boolean z, ImageDto imageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconSpotDto, (i & 2) != 0 ? true : z, imageDto);
    }
}
