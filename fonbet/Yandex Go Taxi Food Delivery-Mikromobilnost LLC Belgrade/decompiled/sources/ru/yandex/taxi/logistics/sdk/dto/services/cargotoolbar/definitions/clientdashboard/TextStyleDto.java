package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "BOLD", "BOLD_ITALIC", "LIGHT", "LIGHT_ITALIC", "REGULAR", "REGULAR_ITALIC", "MEDIUM", "MEDIUM_ITALIC", "LOGOTYPE_REGULAR", "YANGO_HEADLINE_BLACK", "YANGO_HEADLINE_BLACK_ITALIC", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextStyleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextStyleDto[] $VALUES;

    @Json(name = "bold")
    public static final TextStyleDto BOLD = new TextStyleDto("BOLD", 0);

    @Json(name = "bold_italic")
    public static final TextStyleDto BOLD_ITALIC = new TextStyleDto("BOLD_ITALIC", 1);

    @Json(name = "light")
    public static final TextStyleDto LIGHT = new TextStyleDto("LIGHT", 2);

    @Json(name = "light_italic")
    public static final TextStyleDto LIGHT_ITALIC = new TextStyleDto("LIGHT_ITALIC", 3);

    @Json(name = "regular")
    public static final TextStyleDto REGULAR = new TextStyleDto("REGULAR", 4);

    @Json(name = "regular_italic")
    public static final TextStyleDto REGULAR_ITALIC = new TextStyleDto("REGULAR_ITALIC", 5);

    @Json(name = "medium")
    public static final TextStyleDto MEDIUM = new TextStyleDto("MEDIUM", 6);

    @Json(name = "medium_italic")
    public static final TextStyleDto MEDIUM_ITALIC = new TextStyleDto("MEDIUM_ITALIC", 7);

    @Json(name = "logotype_regular")
    public static final TextStyleDto LOGOTYPE_REGULAR = new TextStyleDto("LOGOTYPE_REGULAR", 8);

    @Json(name = "yango_headline_black")
    public static final TextStyleDto YANGO_HEADLINE_BLACK = new TextStyleDto("YANGO_HEADLINE_BLACK", 9);

    @Json(name = "yango_headline_black_italic")
    public static final TextStyleDto YANGO_HEADLINE_BLACK_ITALIC = new TextStyleDto("YANGO_HEADLINE_BLACK_ITALIC", 10);

    private static final /* synthetic */ TextStyleDto[] $values() {
        return new TextStyleDto[]{BOLD, BOLD_ITALIC, LIGHT, LIGHT_ITALIC, REGULAR, REGULAR_ITALIC, MEDIUM, MEDIUM_ITALIC, LOGOTYPE_REGULAR, YANGO_HEADLINE_BLACK, YANGO_HEADLINE_BLACK_ITALIC};
    }

    static {
        TextStyleDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TextStyleDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TextStyleDto valueOf(String str) {
        return (TextStyleDto) Enum.valueOf(TextStyleDto.class, str);
    }

    public static TextStyleDto[] values() {
        return (TextStyleDto[]) $VALUES.clone();
    }
}
