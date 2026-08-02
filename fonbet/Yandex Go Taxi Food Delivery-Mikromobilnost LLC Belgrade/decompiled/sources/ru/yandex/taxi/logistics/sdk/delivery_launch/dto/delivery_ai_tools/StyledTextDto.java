package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto;", "", "titleKey", "", "textColor", "textSize", "", "textFont", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto$TextFontDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto$TextFontDto;)V", "getTitleKey", "()Ljava/lang/String;", "getTextColor", "getTextSize", "()I", "getTextFont", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto$TextFontDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "TextFontDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StyledTextDto {
    private final String textColor;
    private final TextFontDto textFont;
    private final int textSize;
    private final String titleKey;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto$TextFontDto;", "", "BOLD", "REGULAR", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TextFontDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextFontDto[] $VALUES;

        @Json(name = "bold")
        public static final TextFontDto BOLD;

        @Json(name = "regular")
        public static final TextFontDto REGULAR;

        static {
            TextFontDto textFontDto = new TextFontDto("BOLD", 0);
            BOLD = textFontDto;
            TextFontDto textFontDto2 = new TextFontDto("REGULAR", 1);
            REGULAR = textFontDto2;
            TextFontDto[] textFontDtoArr = {textFontDto, textFontDto2};
            $VALUES = textFontDtoArr;
            $ENTRIES = a.a(textFontDtoArr);
        }

        public static TextFontDto valueOf(String str) {
            return (TextFontDto) Enum.valueOf(TextFontDto.class, str);
        }

        public static TextFontDto[] values() {
            return (TextFontDto[]) $VALUES.clone();
        }
    }

    public StyledTextDto(@Json(name = "title_key") String str, @Json(name = "text_color") String str2, @Json(name = "text_size") int i, @Json(name = "text_font") TextFontDto textFontDto) {
        this.titleKey = str;
        this.textColor = str2;
        this.textSize = i;
        this.textFont = textFontDto;
    }

    public static /* synthetic */ StyledTextDto copy$default(StyledTextDto styledTextDto, String str, String str2, int i, TextFontDto textFontDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = styledTextDto.titleKey;
        }
        if ((i2 & 2) != 0) {
            str2 = styledTextDto.textColor;
        }
        if ((i2 & 4) != 0) {
            i = styledTextDto.textSize;
        }
        if ((i2 & 8) != 0) {
            textFontDto = styledTextDto.textFont;
        }
        return styledTextDto.copy(str, str2, i, textFontDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleKey() {
        return this.titleKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTextSize() {
        return this.textSize;
    }

    /* renamed from: component4, reason: from getter */
    public final TextFontDto getTextFont() {
        return this.textFont;
    }

    public final StyledTextDto copy(@Json(name = "title_key") String titleKey, @Json(name = "text_color") String textColor, @Json(name = "text_size") int textSize, @Json(name = "text_font") TextFontDto textFont) {
        return new StyledTextDto(titleKey, textColor, textSize, textFont);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyledTextDto)) {
            return false;
        }
        StyledTextDto styledTextDto = (StyledTextDto) other;
        return jl40.l(this.titleKey, styledTextDto.titleKey) && jl40.l(this.textColor, styledTextDto.textColor) && this.textSize == styledTextDto.textSize && this.textFont == styledTextDto.textFont;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final TextFontDto getTextFont() {
        return this.textFont;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }

    public int hashCode() {
        int b = oyr.b(this.textSize, unr0.b(this.titleKey.hashCode() * 31, 31, this.textColor), 31);
        TextFontDto textFontDto = this.textFont;
        return b + (textFontDto == null ? 0 : textFontDto.hashCode());
    }

    public String toString() {
        String str = this.titleKey;
        String str2 = this.textColor;
        int i = this.textSize;
        TextFontDto textFontDto = this.textFont;
        StringBuilder v = b64.v("StyledTextDto(titleKey=", str, ", textColor=", str2, ", textSize=");
        v.append(i);
        v.append(", textFont=");
        v.append(textFontDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
