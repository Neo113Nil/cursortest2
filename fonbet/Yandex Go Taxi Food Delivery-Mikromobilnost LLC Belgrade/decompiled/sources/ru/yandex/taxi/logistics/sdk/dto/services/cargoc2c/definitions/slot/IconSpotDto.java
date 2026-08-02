package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/IconSpotDto;", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ImageDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ImageDto;Ljava/lang/String;)V", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ImageDto;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IconSpotDto {
    private final String backgroundColor;
    private final ImageDto icon;

    public IconSpotDto(@Json(name = "icon") ImageDto imageDto, @Json(name = "background_color") String str) {
        this.icon = imageDto;
        this.backgroundColor = str;
    }

    public static /* synthetic */ IconSpotDto copy$default(IconSpotDto iconSpotDto, ImageDto imageDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            imageDto = iconSpotDto.icon;
        }
        if ((i & 2) != 0) {
            str = iconSpotDto.backgroundColor;
        }
        return iconSpotDto.copy(imageDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconSpotDto copy(@Json(name = "icon") ImageDto icon, @Json(name = "background_color") String backgroundColor) {
        return new IconSpotDto(icon, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconSpotDto)) {
            return false;
        }
        IconSpotDto iconSpotDto = (IconSpotDto) other;
        return jl40.l(this.icon, iconSpotDto.icon) && jl40.l(this.backgroundColor, iconSpotDto.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ImageDto getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        String str = this.backgroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IconSpotDto(icon=" + this.icon + ", backgroundColor=" + this.backgroundColor + Extension.C_BRAKE;
    }
}
