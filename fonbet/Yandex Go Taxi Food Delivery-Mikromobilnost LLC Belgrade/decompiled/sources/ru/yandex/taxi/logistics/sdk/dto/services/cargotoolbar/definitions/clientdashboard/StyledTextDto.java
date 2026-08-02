package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "", "content", "", "fontSize", "", "textStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;", "textColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "<init>", "(Ljava/lang/String;ILru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)V", "getContent", "()Ljava/lang/String;", "getFontSize", "()I", "getTextStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;", "getTextColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StyledTextDto {
    private final String content;
    private final int fontSize;
    private final ColorDto textColor;
    private final TextStyleDto textStyle;

    public StyledTextDto(@Json(name = "content") String str, @Json(name = "font_size") int i, @Json(name = "text_style") TextStyleDto textStyleDto, @Json(name = "text_color") ColorDto colorDto) {
        this.content = str;
        this.fontSize = i;
        this.textStyle = textStyleDto;
        this.textColor = colorDto;
    }

    public static /* synthetic */ StyledTextDto copy$default(StyledTextDto styledTextDto, String str, int i, TextStyleDto textStyleDto, ColorDto colorDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = styledTextDto.content;
        }
        if ((i2 & 2) != 0) {
            i = styledTextDto.fontSize;
        }
        if ((i2 & 4) != 0) {
            textStyleDto = styledTextDto.textStyle;
        }
        if ((i2 & 8) != 0) {
            colorDto = styledTextDto.textColor;
        }
        return styledTextDto.copy(str, i, textStyleDto, colorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component3, reason: from getter */
    public final TextStyleDto getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final ColorDto getTextColor() {
        return this.textColor;
    }

    public final StyledTextDto copy(@Json(name = "content") String content, @Json(name = "font_size") int fontSize, @Json(name = "text_style") TextStyleDto textStyle, @Json(name = "text_color") ColorDto textColor) {
        return new StyledTextDto(content, fontSize, textStyle, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyledTextDto)) {
            return false;
        }
        StyledTextDto styledTextDto = (StyledTextDto) other;
        return jl40.l(this.content, styledTextDto.content) && this.fontSize == styledTextDto.fontSize && this.textStyle == styledTextDto.textStyle && jl40.l(this.textColor, styledTextDto.textColor);
    }

    public final String getContent() {
        return this.content;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final ColorDto getTextColor() {
        return this.textColor;
    }

    public final TextStyleDto getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int hashCode = (this.textStyle.hashCode() + oyr.b(this.fontSize, this.content.hashCode() * 31, 31)) * 31;
        ColorDto colorDto = this.textColor;
        return hashCode + (colorDto == null ? 0 : colorDto.hashCode());
    }

    public String toString() {
        String str = this.content;
        int i = this.fontSize;
        TextStyleDto textStyleDto = this.textStyle;
        ColorDto colorDto = this.textColor;
        StringBuilder u = b64.u(i, "StyledTextDto(content=", str, ", fontSize=", ", textStyle=");
        u.append(textStyleDto);
        u.append(", textColor=");
        u.append(colorDto);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public /* synthetic */ StyledTextDto(String str, int i, TextStyleDto textStyleDto, ColorDto colorDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 16 : i, textStyleDto, colorDto);
    }
}
