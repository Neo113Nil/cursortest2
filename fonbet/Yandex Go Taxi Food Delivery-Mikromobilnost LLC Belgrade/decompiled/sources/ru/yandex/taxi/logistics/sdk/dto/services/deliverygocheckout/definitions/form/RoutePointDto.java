package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/RoutePointDto;", "", "index", "", "pinIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "<init>", "(ILru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;)V", "getIndex", "()I", "getPinIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RoutePointDto {
    private final int index;
    private final ImageDto pinIcon;

    public RoutePointDto(@Json(name = "index") int i, @Json(name = "pin_icon") ImageDto imageDto) {
        this.index = i;
        this.pinIcon = imageDto;
    }

    public static /* synthetic */ RoutePointDto copy$default(RoutePointDto routePointDto, int i, ImageDto imageDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = routePointDto.index;
        }
        if ((i2 & 2) != 0) {
            imageDto = routePointDto.pinIcon;
        }
        return routePointDto.copy(i, imageDto);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDto getPinIcon() {
        return this.pinIcon;
    }

    public final RoutePointDto copy(@Json(name = "index") int index, @Json(name = "pin_icon") ImageDto pinIcon) {
        return new RoutePointDto(index, pinIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointDto)) {
            return false;
        }
        RoutePointDto routePointDto = (RoutePointDto) other;
        return this.index == routePointDto.index && jl40.l(this.pinIcon, routePointDto.pinIcon);
    }

    public final int getIndex() {
        return this.index;
    }

    public final ImageDto getPinIcon() {
        return this.pinIcon;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        ImageDto imageDto = this.pinIcon;
        return hashCode + (imageDto == null ? 0 : imageDto.hashCode());
    }

    public String toString() {
        return "RoutePointDto(index=" + this.index + ", pinIcon=" + this.pinIcon + Extension.C_BRAKE;
    }
}
