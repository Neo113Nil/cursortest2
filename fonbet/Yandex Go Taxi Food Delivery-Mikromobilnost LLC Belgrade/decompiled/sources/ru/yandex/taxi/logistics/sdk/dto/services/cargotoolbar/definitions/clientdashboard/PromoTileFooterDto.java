package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoTileFooterDto;", "", "text", "", "textColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "horizontalAlignment", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HorizontalAlignmentDto;", "locked", "", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HorizontalAlignmentDto;Z)V", "getText", "()Ljava/lang/String;", "getTextColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getHorizontalAlignment", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HorizontalAlignmentDto;", "getLocked", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PromoTileFooterDto {
    private final HorizontalAlignmentDto horizontalAlignment;
    private final boolean locked;
    private final String text;
    private final ColorDto textColor;

    public PromoTileFooterDto(@Json(name = "text") String str, @Json(name = "text_color") ColorDto colorDto, @Json(name = "horizontal_alignment") HorizontalAlignmentDto horizontalAlignmentDto, @Json(name = "locked") boolean z) {
        this.text = str;
        this.textColor = colorDto;
        this.horizontalAlignment = horizontalAlignmentDto;
        this.locked = z;
    }

    public static /* synthetic */ PromoTileFooterDto copy$default(PromoTileFooterDto promoTileFooterDto, String str, ColorDto colorDto, HorizontalAlignmentDto horizontalAlignmentDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promoTileFooterDto.text;
        }
        if ((i & 2) != 0) {
            colorDto = promoTileFooterDto.textColor;
        }
        if ((i & 4) != 0) {
            horizontalAlignmentDto = promoTileFooterDto.horizontalAlignment;
        }
        if ((i & 8) != 0) {
            z = promoTileFooterDto.locked;
        }
        return promoTileFooterDto.copy(str, colorDto, horizontalAlignmentDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorDto getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final HorizontalAlignmentDto getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    public final PromoTileFooterDto copy(@Json(name = "text") String text, @Json(name = "text_color") ColorDto textColor, @Json(name = "horizontal_alignment") HorizontalAlignmentDto horizontalAlignment, @Json(name = "locked") boolean locked) {
        return new PromoTileFooterDto(text, textColor, horizontalAlignment, locked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoTileFooterDto)) {
            return false;
        }
        PromoTileFooterDto promoTileFooterDto = (PromoTileFooterDto) other;
        return jl40.l(this.text, promoTileFooterDto.text) && jl40.l(this.textColor, promoTileFooterDto.textColor) && this.horizontalAlignment == promoTileFooterDto.horizontalAlignment && this.locked == promoTileFooterDto.locked;
    }

    public final HorizontalAlignmentDto getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final String getText() {
        return this.text;
    }

    public final ColorDto getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ColorDto colorDto = this.textColor;
        int hashCode2 = (hashCode + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
        HorizontalAlignmentDto horizontalAlignmentDto = this.horizontalAlignment;
        return Boolean.hashCode(this.locked) + ((hashCode2 + (horizontalAlignmentDto != null ? horizontalAlignmentDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "PromoTileFooterDto(text=" + this.text + ", textColor=" + this.textColor + ", horizontalAlignment=" + this.horizontalAlignment + ", locked=" + this.locked + Extension.C_BRAKE;
    }

    public /* synthetic */ PromoTileFooterDto(String str, ColorDto colorDto, HorizontalAlignmentDto horizontalAlignmentDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, colorDto, horizontalAlignmentDto, (i & 8) != 0 ? false : z);
    }
}
