package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/IconSpotDto;", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/String;I)V", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IconSpotDto {
    private final String backgroundColor;
    private final int cornerRadius;
    private final ImageDto icon;

    public IconSpotDto(@Json(name = "icon") ImageDto imageDto, @Json(name = "background_color") String str, @Json(name = "corner_radius") int i) {
        this.icon = imageDto;
        this.backgroundColor = str;
        this.cornerRadius = i;
    }

    public static /* synthetic */ IconSpotDto copy$default(IconSpotDto iconSpotDto, ImageDto imageDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            imageDto = iconSpotDto.icon;
        }
        if ((i2 & 2) != 0) {
            str = iconSpotDto.backgroundColor;
        }
        if ((i2 & 4) != 0) {
            i = iconSpotDto.cornerRadius;
        }
        return iconSpotDto.copy(imageDto, str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final IconSpotDto copy(@Json(name = "icon") ImageDto icon, @Json(name = "background_color") String backgroundColor, @Json(name = "corner_radius") int cornerRadius) {
        return new IconSpotDto(icon, backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconSpotDto)) {
            return false;
        }
        IconSpotDto iconSpotDto = (IconSpotDto) other;
        return jl40.l(this.icon, iconSpotDto.icon) && jl40.l(this.backgroundColor, iconSpotDto.backgroundColor) && this.cornerRadius == iconSpotDto.cornerRadius;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final ImageDto getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        String str = this.backgroundColor;
        return Integer.hashCode(this.cornerRadius) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        ImageDto imageDto = this.icon;
        String str = this.backgroundColor;
        int i = this.cornerRadius;
        StringBuilder sb = new StringBuilder("IconSpotDto(icon=");
        sb.append(imageDto);
        sb.append(", backgroundColor=");
        sb.append(str);
        sb.append(", cornerRadius=");
        return oyr.m(i, Extension.C_BRAKE, sb);
    }

    public /* synthetic */ IconSpotDto(ImageDto imageDto, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDto, str, (i2 & 4) != 0 ? 12 : i);
    }
}
