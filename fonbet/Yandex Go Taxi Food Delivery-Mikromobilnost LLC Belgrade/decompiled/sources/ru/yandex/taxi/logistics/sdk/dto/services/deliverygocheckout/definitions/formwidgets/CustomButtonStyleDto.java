package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CustomButtonStyleDto;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "<init>", "(Ljava/lang/String;I)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomButtonStyleDto {
    private final String backgroundColor;
    private final int cornerRadius;

    public /* synthetic */ CustomButtonStyleDto(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 16 : i);
    }

    public static /* synthetic */ CustomButtonStyleDto copy$default(CustomButtonStyleDto customButtonStyleDto, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = customButtonStyleDto.backgroundColor;
        }
        if ((i2 & 2) != 0) {
            i = customButtonStyleDto.cornerRadius;
        }
        return customButtonStyleDto.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final CustomButtonStyleDto copy(@Json(name = "background_color") String backgroundColor, @Json(name = "corner_radius") int cornerRadius) {
        return new CustomButtonStyleDto(backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomButtonStyleDto)) {
            return false;
        }
        CustomButtonStyleDto customButtonStyleDto = (CustomButtonStyleDto) other;
        return jl40.l(this.backgroundColor, customButtonStyleDto.backgroundColor) && this.cornerRadius == customButtonStyleDto.cornerRadius;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public int hashCode() {
        return Integer.hashCode(this.cornerRadius) + (this.backgroundColor.hashCode() * 31);
    }

    public String toString() {
        return qv10.i(this.cornerRadius, "CustomButtonStyleDto(backgroundColor=", this.backgroundColor, ", cornerRadius=", Extension.C_BRAKE);
    }

    public CustomButtonStyleDto(@Json(name = "background_color") String str, @Json(name = "corner_radius") int i) {
        this.backgroundColor = str;
        this.cornerRadius = i;
    }
}
