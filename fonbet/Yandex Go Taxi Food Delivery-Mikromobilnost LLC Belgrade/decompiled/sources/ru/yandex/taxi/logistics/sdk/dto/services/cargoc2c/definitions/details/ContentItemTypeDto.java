package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "LIST_ITEM", IDialogId.INTENT_EXTRA_IN_HEADER, "SEPARATOR", "POSTCARD", "DETAILS", "TEXT_WIDGET", "PHOTOS", "ACTION_BUTTON", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContentItemTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentItemTypeDto[] $VALUES;

    @Json(name = "list_item")
    public static final ContentItemTypeDto LIST_ITEM = new ContentItemTypeDto("LIST_ITEM", 0);

    @Json(name = "header")
    public static final ContentItemTypeDto HEADER = new ContentItemTypeDto(IDialogId.INTENT_EXTRA_IN_HEADER, 1);

    @Json(name = "separator")
    public static final ContentItemTypeDto SEPARATOR = new ContentItemTypeDto("SEPARATOR", 2);

    @Json(name = "postcard")
    public static final ContentItemTypeDto POSTCARD = new ContentItemTypeDto("POSTCARD", 3);

    @Json(name = "details")
    public static final ContentItemTypeDto DETAILS = new ContentItemTypeDto("DETAILS", 4);

    @Json(name = "text_widget")
    public static final ContentItemTypeDto TEXT_WIDGET = new ContentItemTypeDto("TEXT_WIDGET", 5);

    @Json(name = "photos")
    public static final ContentItemTypeDto PHOTOS = new ContentItemTypeDto("PHOTOS", 6);

    @Json(name = "action_button")
    public static final ContentItemTypeDto ACTION_BUTTON = new ContentItemTypeDto("ACTION_BUTTON", 7);

    private static final /* synthetic */ ContentItemTypeDto[] $values() {
        return new ContentItemTypeDto[]{LIST_ITEM, HEADER, SEPARATOR, POSTCARD, DETAILS, TEXT_WIDGET, PHOTOS, ACTION_BUTTON};
    }

    static {
        ContentItemTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ContentItemTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ContentItemTypeDto valueOf(String str) {
        return (ContentItemTypeDto) Enum.valueOf(ContentItemTypeDto.class, str);
    }

    public static ContentItemTypeDto[] values() {
        return (ContentItemTypeDto[]) $VALUES.clone();
    }
}
