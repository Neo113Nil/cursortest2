package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotStyleDto;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "backgroundCornerRadius", "", "horizontalInset", "border", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/BorderDto;", "<init>", "(Ljava/lang/String;IILru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/BorderDto;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundCornerRadius", "()I", "getHorizontalInset", "getBorder", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/BorderDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SlotStyleDto {
    private final String backgroundColor;
    private final int backgroundCornerRadius;
    private final BorderDto border;
    private final int horizontalInset;

    public /* synthetic */ SlotStyleDto(String str, int i, int i2, BorderDto borderDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 8 : i2, borderDto);
    }

    public static /* synthetic */ SlotStyleDto copy$default(SlotStyleDto slotStyleDto, String str, int i, int i2, BorderDto borderDto, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = slotStyleDto.backgroundColor;
        }
        if ((i3 & 2) != 0) {
            i = slotStyleDto.backgroundCornerRadius;
        }
        if ((i3 & 4) != 0) {
            i2 = slotStyleDto.horizontalInset;
        }
        if ((i3 & 8) != 0) {
            borderDto = slotStyleDto.border;
        }
        return slotStyleDto.copy(str, i, i2, borderDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBackgroundCornerRadius() {
        return this.backgroundCornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHorizontalInset() {
        return this.horizontalInset;
    }

    /* renamed from: component4, reason: from getter */
    public final BorderDto getBorder() {
        return this.border;
    }

    public final SlotStyleDto copy(@Json(name = "background_color") String backgroundColor, @Json(name = "background_corner_radius") int backgroundCornerRadius, @Json(name = "horizontal_inset") int horizontalInset, @Json(name = "border") BorderDto border) {
        return new SlotStyleDto(backgroundColor, backgroundCornerRadius, horizontalInset, border);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotStyleDto)) {
            return false;
        }
        SlotStyleDto slotStyleDto = (SlotStyleDto) other;
        return jl40.l(this.backgroundColor, slotStyleDto.backgroundColor) && this.backgroundCornerRadius == slotStyleDto.backgroundCornerRadius && this.horizontalInset == slotStyleDto.horizontalInset && jl40.l(this.border, slotStyleDto.border);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundCornerRadius() {
        return this.backgroundCornerRadius;
    }

    public final BorderDto getBorder() {
        return this.border;
    }

    public final int getHorizontalInset() {
        return this.horizontalInset;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int b = oyr.b(this.horizontalInset, oyr.b(this.backgroundCornerRadius, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        BorderDto borderDto = this.border;
        return b + (borderDto != null ? borderDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.backgroundColor;
        int i = this.backgroundCornerRadius;
        int i2 = this.horizontalInset;
        BorderDto borderDto = this.border;
        StringBuilder u = b64.u(i, "SlotStyleDto(backgroundColor=", str, ", backgroundCornerRadius=", ", horizontalInset=");
        u.append(i2);
        u.append(", border=");
        u.append(borderDto);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public SlotStyleDto(@Json(name = "background_color") String str, @Json(name = "background_corner_radius") int i, @Json(name = "horizontal_inset") int i2, @Json(name = "border") BorderDto borderDto) {
        this.backgroundColor = str;
        this.backgroundCornerRadius = i;
        this.horizontalInset = i2;
        this.border = borderDto;
    }
}
