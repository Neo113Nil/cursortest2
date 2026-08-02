package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto;", "", "style", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto$StyleDto;", "color", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto$StyleDto;Ljava/lang/String;)V", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto$StyleDto;", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "StyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TextDecorationLineThroughDto {
    private final String color;
    private final StyleDto style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto$StyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "DIAGONALLY", "DEFAULT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @Json(name = "diagonally")
        public static final StyleDto DIAGONALLY = new StyleDto("DIAGONALLY", 0);

        @Json(name = "default")
        public static final StyleDto DEFAULT = new StyleDto("DEFAULT", 1);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{DIAGONALLY, DEFAULT};
        }

        static {
            StyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private StyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    public TextDecorationLineThroughDto(@Json(name = "style") StyleDto styleDto, @Json(name = "color") String str) {
        this.style = styleDto;
        this.color = str;
    }

    public static /* synthetic */ TextDecorationLineThroughDto copy$default(TextDecorationLineThroughDto textDecorationLineThroughDto, StyleDto styleDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            styleDto = textDecorationLineThroughDto.style;
        }
        if ((i & 2) != 0) {
            str = textDecorationLineThroughDto.color;
        }
        return textDecorationLineThroughDto.copy(styleDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final StyleDto getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final TextDecorationLineThroughDto copy(@Json(name = "style") StyleDto style, @Json(name = "color") String color) {
        return new TextDecorationLineThroughDto(style, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDecorationLineThroughDto)) {
            return false;
        }
        TextDecorationLineThroughDto textDecorationLineThroughDto = (TextDecorationLineThroughDto) other;
        return this.style == textDecorationLineThroughDto.style && jl40.l(this.color, textDecorationLineThroughDto.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final StyleDto getStyle() {
        return this.style;
    }

    public int hashCode() {
        int hashCode = this.style.hashCode() * 31;
        String str = this.color;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TextDecorationLineThroughDto(style=" + this.style + ", color=" + this.color + Extension.C_BRAKE;
    }
}
