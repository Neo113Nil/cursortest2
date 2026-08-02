package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonStyleDto;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "border", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BorderDto;", "<init>", "(Ljava/lang/String;ILru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BorderDto;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()I", "getBorder", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BorderDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ButtonStyleDto {
    private final String backgroundColor;
    private final BorderDto border;
    private final int cornerRadius;

    public ButtonStyleDto(@Json(name = "background_color") String str, @Json(name = "corner_radius") int i, @Json(name = "border") BorderDto borderDto) {
        this.backgroundColor = str;
        this.cornerRadius = i;
        this.border = borderDto;
    }

    public static /* synthetic */ ButtonStyleDto copy$default(ButtonStyleDto buttonStyleDto, String str, int i, BorderDto borderDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buttonStyleDto.backgroundColor;
        }
        if ((i2 & 2) != 0) {
            i = buttonStyleDto.cornerRadius;
        }
        if ((i2 & 4) != 0) {
            borderDto = buttonStyleDto.border;
        }
        return buttonStyleDto.copy(str, i, borderDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final BorderDto getBorder() {
        return this.border;
    }

    public final ButtonStyleDto copy(@Json(name = "background_color") String backgroundColor, @Json(name = "corner_radius") int cornerRadius, @Json(name = "border") BorderDto border) {
        return new ButtonStyleDto(backgroundColor, cornerRadius, border);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStyleDto)) {
            return false;
        }
        ButtonStyleDto buttonStyleDto = (ButtonStyleDto) other;
        return jl40.l(this.backgroundColor, buttonStyleDto.backgroundColor) && this.cornerRadius == buttonStyleDto.cornerRadius && jl40.l(this.border, buttonStyleDto.border);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BorderDto getBorder() {
        return this.border;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int b = oyr.b(this.cornerRadius, (str == null ? 0 : str.hashCode()) * 31, 31);
        BorderDto borderDto = this.border;
        return b + (borderDto != null ? borderDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.backgroundColor;
        int i = this.cornerRadius;
        BorderDto borderDto = this.border;
        StringBuilder u = b64.u(i, "ButtonStyleDto(backgroundColor=", str, ", cornerRadius=", ", border=");
        u.append(borderDto);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public /* synthetic */ ButtonStyleDto(String str, int i, BorderDto borderDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 16 : i, borderDto);
    }
}
