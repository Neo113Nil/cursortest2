package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0005:;<=>B\u0089\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0090\u0001\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0005HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006?"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;", "", "text", "", "fontSize", "", "fontWeight", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontWeightDto;", "fontStyle", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontStyleDto;", "color", "metaColor", "metaStyle", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$MetaStyleDto;", "textDecoration", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$TextDecorationDto;", "detailedTextDecoration", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto;", "display", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$DisplayDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontWeightDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontStyleDto;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$MetaStyleDto;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$DisplayDto;)V", "getText", "()Ljava/lang/String;", "getFontSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontWeight", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontWeightDto;", "getFontStyle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontStyleDto;", "getColor", "getMetaColor", "getMetaStyle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$MetaStyleDto;", "getTextDecoration", "()Ljava/util/List;", "getDetailedTextDecoration", "getDisplay", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$DisplayDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontWeightDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontStyleDto;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$MetaStyleDto;Ljava/util/List;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$DisplayDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;", "equals", "", "other", "hashCode", "toString", "FontWeightDto", "FontStyleDto", "MetaStyleDto", "TextDecorationDto", "DisplayDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ATTextPropertyDto {
    private final String color;
    private final List<AnyTextDecorationDto> detailedTextDecoration;
    private final DisplayDto display;
    private final Integer fontSize;
    private final FontStyleDto fontStyle;
    private final FontWeightDto fontWeight;
    private final String metaColor;
    private final MetaStyleDto metaStyle;
    private final String text;
    private final List<TextDecorationDto> textDecoration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$DisplayDto;", "", "<init>", "(Ljava/lang/String;I)V", "BLOCK", "INLINE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisplayDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DisplayDto[] $VALUES;

        @Json(name = "block")
        public static final DisplayDto BLOCK = new DisplayDto("BLOCK", 0);

        @Json(name = "inline")
        public static final DisplayDto INLINE = new DisplayDto("INLINE", 1);

        private static final /* synthetic */ DisplayDto[] $values() {
            return new DisplayDto[]{BLOCK, INLINE};
        }

        static {
            DisplayDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private DisplayDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static DisplayDto valueOf(String str) {
            return (DisplayDto) Enum.valueOf(DisplayDto.class, str);
        }

        public static DisplayDto[] values() {
            return (DisplayDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontStyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "ITALIC", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FontStyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontStyleDto[] $VALUES;

        @Json(name = Constants.NORMAL)
        public static final FontStyleDto NORMAL = new FontStyleDto("NORMAL", 0);

        @Json(name = "italic")
        public static final FontStyleDto ITALIC = new FontStyleDto("ITALIC", 1);

        private static final /* synthetic */ FontStyleDto[] $values() {
            return new FontStyleDto[]{NORMAL, ITALIC};
        }

        static {
            FontStyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private FontStyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FontStyleDto valueOf(String str) {
            return (FontStyleDto) Enum.valueOf(FontStyleDto.class, str);
        }

        public static FontStyleDto[] values() {
            return (FontStyleDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontWeightDto;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "LIGHT", "MEDIUM", "BOLD", "DISPLAY_HEAVY", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FontWeightDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontWeightDto[] $VALUES;

        @Json(name = "regular")
        public static final FontWeightDto REGULAR = new FontWeightDto("REGULAR", 0);

        @Json(name = "light")
        public static final FontWeightDto LIGHT = new FontWeightDto("LIGHT", 1);

        @Json(name = "medium")
        public static final FontWeightDto MEDIUM = new FontWeightDto("MEDIUM", 2);

        @Json(name = "bold")
        public static final FontWeightDto BOLD = new FontWeightDto("BOLD", 3);

        @Json(name = "display-heavy")
        public static final FontWeightDto DISPLAY_HEAVY = new FontWeightDto("DISPLAY_HEAVY", 4);

        private static final /* synthetic */ FontWeightDto[] $values() {
            return new FontWeightDto[]{REGULAR, LIGHT, MEDIUM, BOLD, DISPLAY_HEAVY};
        }

        static {
            FontWeightDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private FontWeightDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FontWeightDto valueOf(String str) {
            return (FontWeightDto) Enum.valueOf(FontWeightDto.class, str);
        }

        public static FontWeightDto[] values() {
            return (FontWeightDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b%\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$MetaStyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER_REGULAR", "HEADER_MEDIUM", "HEADER_BOLD", "HEADER_LIGHT", "TITLE_REGULAR", "TITLE_MEDIUM", "TITLE_BOLD", "TITLE_SEMIBOLD", "TITLE_LIGHT", "SUBTITLE_LIGHT", "SUBTITLE_REGULAR", "SUBTITLE_MEDIUM", "SUBTITLE_BOLD", "BODY_REGULAR", "BODY_MEDIUM", "BODY_SEMIBOLD", "MONOSPACED_BODY_MEDIUM", "BODY_BOLD", "BODY_LIGHT", "CAPTION_REGULAR", "CAPTION_MEDIUM", "CAPTION_MEDIUM_ITALIC", "CAPTION_SEMIBOLD", "CAPTION_BOLD", "CAPTION_LIGHT", "CAPS_HIGHLIGHTED", "CAPS", "DETAILS", "HEADLINE_TITLE_1", "HEADLINE_TITLE_2", "HEADLINE_TITLE_3", "HEADLINE_TITLE_4", "HEADLINE_TITLE_5", "ANY_FONT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MetaStyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MetaStyleDto[] $VALUES;

        @Json(name = "header-regular")
        public static final MetaStyleDto HEADER_REGULAR = new MetaStyleDto("HEADER_REGULAR", 0);

        @Json(name = "header-medium")
        public static final MetaStyleDto HEADER_MEDIUM = new MetaStyleDto("HEADER_MEDIUM", 1);

        @Json(name = "header-bold")
        public static final MetaStyleDto HEADER_BOLD = new MetaStyleDto("HEADER_BOLD", 2);

        @Json(name = "header-light")
        public static final MetaStyleDto HEADER_LIGHT = new MetaStyleDto("HEADER_LIGHT", 3);

        @Json(name = "title-regular")
        public static final MetaStyleDto TITLE_REGULAR = new MetaStyleDto("TITLE_REGULAR", 4);

        @Json(name = "title-medium")
        public static final MetaStyleDto TITLE_MEDIUM = new MetaStyleDto("TITLE_MEDIUM", 5);

        @Json(name = "title-bold")
        public static final MetaStyleDto TITLE_BOLD = new MetaStyleDto("TITLE_BOLD", 6);

        @Json(name = "title-semibold")
        public static final MetaStyleDto TITLE_SEMIBOLD = new MetaStyleDto("TITLE_SEMIBOLD", 7);

        @Json(name = "title-light")
        public static final MetaStyleDto TITLE_LIGHT = new MetaStyleDto("TITLE_LIGHT", 8);

        @Json(name = "subtitle-light")
        public static final MetaStyleDto SUBTITLE_LIGHT = new MetaStyleDto("SUBTITLE_LIGHT", 9);

        @Json(name = "subtitle-regular")
        public static final MetaStyleDto SUBTITLE_REGULAR = new MetaStyleDto("SUBTITLE_REGULAR", 10);

        @Json(name = "subtitle-medium")
        public static final MetaStyleDto SUBTITLE_MEDIUM = new MetaStyleDto("SUBTITLE_MEDIUM", 11);

        @Json(name = "subtitle-bold")
        public static final MetaStyleDto SUBTITLE_BOLD = new MetaStyleDto("SUBTITLE_BOLD", 12);

        @Json(name = "body-regular")
        public static final MetaStyleDto BODY_REGULAR = new MetaStyleDto("BODY_REGULAR", 13);

        @Json(name = "body-medium")
        public static final MetaStyleDto BODY_MEDIUM = new MetaStyleDto("BODY_MEDIUM", 14);

        @Json(name = "body-semibold")
        public static final MetaStyleDto BODY_SEMIBOLD = new MetaStyleDto("BODY_SEMIBOLD", 15);

        @Json(name = "monospaced-body-medium")
        public static final MetaStyleDto MONOSPACED_BODY_MEDIUM = new MetaStyleDto("MONOSPACED_BODY_MEDIUM", 16);

        @Json(name = "body-bold")
        public static final MetaStyleDto BODY_BOLD = new MetaStyleDto("BODY_BOLD", 17);

        @Json(name = "body-light")
        public static final MetaStyleDto BODY_LIGHT = new MetaStyleDto("BODY_LIGHT", 18);

        @Json(name = "caption-regular")
        public static final MetaStyleDto CAPTION_REGULAR = new MetaStyleDto("CAPTION_REGULAR", 19);

        @Json(name = "caption-medium")
        public static final MetaStyleDto CAPTION_MEDIUM = new MetaStyleDto("CAPTION_MEDIUM", 20);

        @Json(name = "caption-medium-italic")
        public static final MetaStyleDto CAPTION_MEDIUM_ITALIC = new MetaStyleDto("CAPTION_MEDIUM_ITALIC", 21);

        @Json(name = "caption-semibold")
        public static final MetaStyleDto CAPTION_SEMIBOLD = new MetaStyleDto("CAPTION_SEMIBOLD", 22);

        @Json(name = "caption-bold")
        public static final MetaStyleDto CAPTION_BOLD = new MetaStyleDto("CAPTION_BOLD", 23);

        @Json(name = "caption-light")
        public static final MetaStyleDto CAPTION_LIGHT = new MetaStyleDto("CAPTION_LIGHT", 24);

        @Json(name = "caps-highlighted")
        public static final MetaStyleDto CAPS_HIGHLIGHTED = new MetaStyleDto("CAPS_HIGHLIGHTED", 25);

        @Json(name = "caps")
        public static final MetaStyleDto CAPS = new MetaStyleDto("CAPS", 26);

        @Json(name = "details")
        public static final MetaStyleDto DETAILS = new MetaStyleDto("DETAILS", 27);

        @Json(name = "headline-title-1")
        public static final MetaStyleDto HEADLINE_TITLE_1 = new MetaStyleDto("HEADLINE_TITLE_1", 28);

        @Json(name = "headline-title-2")
        public static final MetaStyleDto HEADLINE_TITLE_2 = new MetaStyleDto("HEADLINE_TITLE_2", 29);

        @Json(name = "headline-title-3")
        public static final MetaStyleDto HEADLINE_TITLE_3 = new MetaStyleDto("HEADLINE_TITLE_3", 30);

        @Json(name = "headline-title-4")
        public static final MetaStyleDto HEADLINE_TITLE_4 = new MetaStyleDto("HEADLINE_TITLE_4", 31);

        @Json(name = "headline-title-5")
        public static final MetaStyleDto HEADLINE_TITLE_5 = new MetaStyleDto("HEADLINE_TITLE_5", 32);

        @Json(name = "any-font")
        public static final MetaStyleDto ANY_FONT = new MetaStyleDto("ANY_FONT", 33);

        private static final /* synthetic */ MetaStyleDto[] $values() {
            return new MetaStyleDto[]{HEADER_REGULAR, HEADER_MEDIUM, HEADER_BOLD, HEADER_LIGHT, TITLE_REGULAR, TITLE_MEDIUM, TITLE_BOLD, TITLE_SEMIBOLD, TITLE_LIGHT, SUBTITLE_LIGHT, SUBTITLE_REGULAR, SUBTITLE_MEDIUM, SUBTITLE_BOLD, BODY_REGULAR, BODY_MEDIUM, BODY_SEMIBOLD, MONOSPACED_BODY_MEDIUM, BODY_BOLD, BODY_LIGHT, CAPTION_REGULAR, CAPTION_MEDIUM, CAPTION_MEDIUM_ITALIC, CAPTION_SEMIBOLD, CAPTION_BOLD, CAPTION_LIGHT, CAPS_HIGHLIGHTED, CAPS, DETAILS, HEADLINE_TITLE_1, HEADLINE_TITLE_2, HEADLINE_TITLE_3, HEADLINE_TITLE_4, HEADLINE_TITLE_5, ANY_FONT};
        }

        static {
            MetaStyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private MetaStyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static MetaStyleDto valueOf(String str) {
            return (MetaStyleDto) Enum.valueOf(MetaStyleDto.class, str);
        }

        public static MetaStyleDto[] values() {
            return (MetaStyleDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$TextDecorationDto;", "", "<init>", "(Ljava/lang/String;I)V", "LINE_THROUGH", "UNDERLINE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextDecorationDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextDecorationDto[] $VALUES;

        @Json(name = "line_through")
        public static final TextDecorationDto LINE_THROUGH = new TextDecorationDto("LINE_THROUGH", 0);

        @Json(name = "underline")
        public static final TextDecorationDto UNDERLINE = new TextDecorationDto("UNDERLINE", 1);

        private static final /* synthetic */ TextDecorationDto[] $values() {
            return new TextDecorationDto[]{LINE_THROUGH, UNDERLINE};
        }

        static {
            TextDecorationDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TextDecorationDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TextDecorationDto valueOf(String str) {
            return (TextDecorationDto) Enum.valueOf(TextDecorationDto.class, str);
        }

        public static TextDecorationDto[] values() {
            return (TextDecorationDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ATTextPropertyDto(@Json(name = "text") String str, @Json(name = "font_size") Integer num, @Json(name = "font_weight") FontWeightDto fontWeightDto, @Json(name = "font_style") FontStyleDto fontStyleDto, @Json(name = "color") String str2, @Json(name = "meta_color") String str3, @Json(name = "meta_style") MetaStyleDto metaStyleDto, @Json(name = "text_decoration") List<? extends TextDecorationDto> list, @Json(name = "detailed_text_decoration") List<? extends AnyTextDecorationDto> list2, @Json(name = "display") DisplayDto displayDto) {
        this.text = str;
        this.fontSize = num;
        this.fontWeight = fontWeightDto;
        this.fontStyle = fontStyleDto;
        this.color = str2;
        this.metaColor = str3;
        this.metaStyle = metaStyleDto;
        this.textDecoration = list;
        this.detailedTextDecoration = list2;
        this.display = displayDto;
    }

    public static /* synthetic */ ATTextPropertyDto copy$default(ATTextPropertyDto aTTextPropertyDto, String str, Integer num, FontWeightDto fontWeightDto, FontStyleDto fontStyleDto, String str2, String str3, MetaStyleDto metaStyleDto, List list, List list2, DisplayDto displayDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aTTextPropertyDto.text;
        }
        if ((i & 2) != 0) {
            num = aTTextPropertyDto.fontSize;
        }
        if ((i & 4) != 0) {
            fontWeightDto = aTTextPropertyDto.fontWeight;
        }
        if ((i & 8) != 0) {
            fontStyleDto = aTTextPropertyDto.fontStyle;
        }
        if ((i & 16) != 0) {
            str2 = aTTextPropertyDto.color;
        }
        if ((i & 32) != 0) {
            str3 = aTTextPropertyDto.metaColor;
        }
        if ((i & 64) != 0) {
            metaStyleDto = aTTextPropertyDto.metaStyle;
        }
        if ((i & 128) != 0) {
            list = aTTextPropertyDto.textDecoration;
        }
        if ((i & 256) != 0) {
            list2 = aTTextPropertyDto.detailedTextDecoration;
        }
        if ((i & 512) != 0) {
            displayDto = aTTextPropertyDto.display;
        }
        List list3 = list2;
        DisplayDto displayDto2 = displayDto;
        MetaStyleDto metaStyleDto2 = metaStyleDto;
        List list4 = list;
        String str4 = str2;
        String str5 = str3;
        return aTTextPropertyDto.copy(str, num, fontWeightDto, fontStyleDto, str4, str5, metaStyleDto2, list4, list3, displayDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final DisplayDto getDisplay() {
        return this.display;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component3, reason: from getter */
    public final FontWeightDto getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component4, reason: from getter */
    public final FontStyleDto getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetaColor() {
        return this.metaColor;
    }

    /* renamed from: component7, reason: from getter */
    public final MetaStyleDto getMetaStyle() {
        return this.metaStyle;
    }

    public final List<TextDecorationDto> component8() {
        return this.textDecoration;
    }

    public final List<AnyTextDecorationDto> component9() {
        return this.detailedTextDecoration;
    }

    public final ATTextPropertyDto copy(@Json(name = "text") String text, @Json(name = "font_size") Integer fontSize, @Json(name = "font_weight") FontWeightDto fontWeight, @Json(name = "font_style") FontStyleDto fontStyle, @Json(name = "color") String color, @Json(name = "meta_color") String metaColor, @Json(name = "meta_style") MetaStyleDto metaStyle, @Json(name = "text_decoration") List<? extends TextDecorationDto> textDecoration, @Json(name = "detailed_text_decoration") List<? extends AnyTextDecorationDto> detailedTextDecoration, @Json(name = "display") DisplayDto display) {
        return new ATTextPropertyDto(text, fontSize, fontWeight, fontStyle, color, metaColor, metaStyle, textDecoration, detailedTextDecoration, display);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ATTextPropertyDto)) {
            return false;
        }
        ATTextPropertyDto aTTextPropertyDto = (ATTextPropertyDto) other;
        return jl40.l(this.text, aTTextPropertyDto.text) && jl40.l(this.fontSize, aTTextPropertyDto.fontSize) && this.fontWeight == aTTextPropertyDto.fontWeight && this.fontStyle == aTTextPropertyDto.fontStyle && jl40.l(this.color, aTTextPropertyDto.color) && jl40.l(this.metaColor, aTTextPropertyDto.metaColor) && this.metaStyle == aTTextPropertyDto.metaStyle && jl40.l(this.textDecoration, aTTextPropertyDto.textDecoration) && jl40.l(this.detailedTextDecoration, aTTextPropertyDto.detailedTextDecoration) && this.display == aTTextPropertyDto.display;
    }

    public final String getColor() {
        return this.color;
    }

    public final List<AnyTextDecorationDto> getDetailedTextDecoration() {
        return this.detailedTextDecoration;
    }

    public final DisplayDto getDisplay() {
        return this.display;
    }

    public final Integer getFontSize() {
        return this.fontSize;
    }

    public final FontStyleDto getFontStyle() {
        return this.fontStyle;
    }

    public final FontWeightDto getFontWeight() {
        return this.fontWeight;
    }

    public final String getMetaColor() {
        return this.metaColor;
    }

    public final MetaStyleDto getMetaStyle() {
        return this.metaStyle;
    }

    public final String getText() {
        return this.text;
    }

    public final List<TextDecorationDto> getTextDecoration() {
        return this.textDecoration;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Integer num = this.fontSize;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        FontWeightDto fontWeightDto = this.fontWeight;
        int hashCode3 = (hashCode2 + (fontWeightDto == null ? 0 : fontWeightDto.hashCode())) * 31;
        FontStyleDto fontStyleDto = this.fontStyle;
        int hashCode4 = (hashCode3 + (fontStyleDto == null ? 0 : fontStyleDto.hashCode())) * 31;
        String str = this.color;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metaColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MetaStyleDto metaStyleDto = this.metaStyle;
        int hashCode7 = (hashCode6 + (metaStyleDto == null ? 0 : metaStyleDto.hashCode())) * 31;
        List<TextDecorationDto> list = this.textDecoration;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<AnyTextDecorationDto> list2 = this.detailedTextDecoration;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisplayDto displayDto = this.display;
        return hashCode9 + (displayDto != null ? displayDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        Integer num = this.fontSize;
        FontWeightDto fontWeightDto = this.fontWeight;
        FontStyleDto fontStyleDto = this.fontStyle;
        String str2 = this.color;
        String str3 = this.metaColor;
        MetaStyleDto metaStyleDto = this.metaStyle;
        List<TextDecorationDto> list = this.textDecoration;
        List<AnyTextDecorationDto> list2 = this.detailedTextDecoration;
        DisplayDto displayDto = this.display;
        StringBuilder q = n.q("ATTextPropertyDto(text=", num, str, ", fontSize=", ", fontWeight=");
        q.append(fontWeightDto);
        q.append(", fontStyle=");
        q.append(fontStyleDto);
        q.append(", color=");
        g8e.D(q, str2, ", metaColor=", str3, ", metaStyle=");
        q.append(metaStyleDto);
        q.append(", textDecoration=");
        q.append(list);
        q.append(", detailedTextDecoration=");
        q.append(list2);
        q.append(", display=");
        q.append(displayDto);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
