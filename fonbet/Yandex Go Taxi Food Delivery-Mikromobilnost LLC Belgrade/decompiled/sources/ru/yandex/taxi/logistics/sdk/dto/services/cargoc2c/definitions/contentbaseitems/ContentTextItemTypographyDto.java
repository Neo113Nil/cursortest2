package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemTypographyDto;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE1", "TITLE2", "TITLE3", "SUBTITLE", "BODY1", "BODY2", "CAPTION1", "CAPTION2", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentTextItemTypographyDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentTextItemTypographyDto[] $VALUES;

    @Json(name = "title1")
    public static final ContentTextItemTypographyDto TITLE1 = new ContentTextItemTypographyDto("TITLE1", 0);

    @Json(name = "title2")
    public static final ContentTextItemTypographyDto TITLE2 = new ContentTextItemTypographyDto("TITLE2", 1);

    @Json(name = "title3")
    public static final ContentTextItemTypographyDto TITLE3 = new ContentTextItemTypographyDto("TITLE3", 2);

    @Json(name = "subtitle")
    public static final ContentTextItemTypographyDto SUBTITLE = new ContentTextItemTypographyDto("SUBTITLE", 3);

    @Json(name = "body1")
    public static final ContentTextItemTypographyDto BODY1 = new ContentTextItemTypographyDto("BODY1", 4);

    @Json(name = "body2")
    public static final ContentTextItemTypographyDto BODY2 = new ContentTextItemTypographyDto("BODY2", 5);

    @Json(name = "caption1")
    public static final ContentTextItemTypographyDto CAPTION1 = new ContentTextItemTypographyDto("CAPTION1", 6);

    @Json(name = "caption2")
    public static final ContentTextItemTypographyDto CAPTION2 = new ContentTextItemTypographyDto("CAPTION2", 7);

    private static final /* synthetic */ ContentTextItemTypographyDto[] $values() {
        return new ContentTextItemTypographyDto[]{TITLE1, TITLE2, TITLE3, SUBTITLE, BODY1, BODY2, CAPTION1, CAPTION2};
    }

    static {
        ContentTextItemTypographyDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ContentTextItemTypographyDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ContentTextItemTypographyDto valueOf(String str) {
        return (ContentTextItemTypographyDto) Enum.valueOf(ContentTextItemTypographyDto.class, str);
    }

    public static ContentTextItemTypographyDto[] values() {
        return (ContentTextItemTypographyDto[]) $VALUES.clone();
    }
}
