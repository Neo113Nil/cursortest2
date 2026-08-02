package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileHeaderDto;", "", "title", "", "subtitle", "titleColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "subtitleColor", "textFormat", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileHeaderDto$TextFormatDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileHeaderDto$TextFormatDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTitleColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getSubtitleColor", "getTextFormat", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileHeaderDto$TextFormatDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TextFormatDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TileHeaderDto {
    private final String subtitle;
    private final ColorDto subtitleColor;
    private final TextFormatDto textFormat;
    private final String title;
    private final ColorDto titleColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileHeaderDto$TextFormatDto;", "", "<init>", "(Ljava/lang/String;I)V", "PLAIN_TEXT", "MARKDOWN", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextFormatDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextFormatDto[] $VALUES;

        @Json(name = "plain_text")
        public static final TextFormatDto PLAIN_TEXT = new TextFormatDto("PLAIN_TEXT", 0);

        @Json(name = "markdown")
        public static final TextFormatDto MARKDOWN = new TextFormatDto("MARKDOWN", 1);

        private static final /* synthetic */ TextFormatDto[] $values() {
            return new TextFormatDto[]{PLAIN_TEXT, MARKDOWN};
        }

        static {
            TextFormatDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private TextFormatDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TextFormatDto valueOf(String str) {
            return (TextFormatDto) Enum.valueOf(TextFormatDto.class, str);
        }

        public static TextFormatDto[] values() {
            return (TextFormatDto[]) $VALUES.clone();
        }
    }

    public TileHeaderDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "title_color") ColorDto colorDto, @Json(name = "subtitle_color") ColorDto colorDto2, @Json(name = "text_format") TextFormatDto textFormatDto) {
        this.title = str;
        this.subtitle = str2;
        this.titleColor = colorDto;
        this.subtitleColor = colorDto2;
        this.textFormat = textFormatDto;
    }

    public static /* synthetic */ TileHeaderDto copy$default(TileHeaderDto tileHeaderDto, String str, String str2, ColorDto colorDto, ColorDto colorDto2, TextFormatDto textFormatDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tileHeaderDto.title;
        }
        if ((i & 2) != 0) {
            str2 = tileHeaderDto.subtitle;
        }
        if ((i & 4) != 0) {
            colorDto = tileHeaderDto.titleColor;
        }
        if ((i & 8) != 0) {
            colorDto2 = tileHeaderDto.subtitleColor;
        }
        if ((i & 16) != 0) {
            textFormatDto = tileHeaderDto.textFormat;
        }
        TextFormatDto textFormatDto2 = textFormatDto;
        ColorDto colorDto3 = colorDto;
        return tileHeaderDto.copy(str, str2, colorDto3, colorDto2, textFormatDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorDto getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ColorDto getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: component5, reason: from getter */
    public final TextFormatDto getTextFormat() {
        return this.textFormat;
    }

    public final TileHeaderDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "title_color") ColorDto titleColor, @Json(name = "subtitle_color") ColorDto subtitleColor, @Json(name = "text_format") TextFormatDto textFormat) {
        return new TileHeaderDto(title, subtitle, titleColor, subtitleColor, textFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileHeaderDto)) {
            return false;
        }
        TileHeaderDto tileHeaderDto = (TileHeaderDto) other;
        return jl40.l(this.title, tileHeaderDto.title) && jl40.l(this.subtitle, tileHeaderDto.subtitle) && jl40.l(this.titleColor, tileHeaderDto.titleColor) && jl40.l(this.subtitleColor, tileHeaderDto.subtitleColor) && this.textFormat == tileHeaderDto.textFormat;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ColorDto getSubtitleColor() {
        return this.subtitleColor;
    }

    public final TextFormatDto getTextFormat() {
        return this.textFormat;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ColorDto getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ColorDto colorDto = this.titleColor;
        int hashCode3 = (hashCode2 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
        ColorDto colorDto2 = this.subtitleColor;
        int hashCode4 = (hashCode3 + (colorDto2 == null ? 0 : colorDto2.hashCode())) * 31;
        TextFormatDto textFormatDto = this.textFormat;
        return hashCode4 + (textFormatDto != null ? textFormatDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ColorDto colorDto = this.titleColor;
        ColorDto colorDto2 = this.subtitleColor;
        TextFormatDto textFormatDto = this.textFormat;
        StringBuilder v = b64.v("TileHeaderDto(title=", str, ", subtitle=", str2, ", titleColor=");
        v.append(colorDto);
        v.append(", subtitleColor=");
        v.append(colorDto2);
        v.append(", textFormat=");
        v.append(textFormatDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
