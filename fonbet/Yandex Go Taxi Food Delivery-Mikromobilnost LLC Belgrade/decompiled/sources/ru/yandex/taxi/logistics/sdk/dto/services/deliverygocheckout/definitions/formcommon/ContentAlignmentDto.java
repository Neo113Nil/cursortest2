package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "", "<init>", "(Ljava/lang/String;I)V", "LEADING", "CENTER", "TRAILING", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContentAlignmentDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentAlignmentDto[] $VALUES;

    @Json(name = "leading")
    public static final ContentAlignmentDto LEADING = new ContentAlignmentDto("LEADING", 0);

    @Json(name = "center")
    public static final ContentAlignmentDto CENTER = new ContentAlignmentDto("CENTER", 1);

    @Json(name = "trailing")
    public static final ContentAlignmentDto TRAILING = new ContentAlignmentDto("TRAILING", 2);

    private static final /* synthetic */ ContentAlignmentDto[] $values() {
        return new ContentAlignmentDto[]{LEADING, CENTER, TRAILING};
    }

    static {
        ContentAlignmentDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ContentAlignmentDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ContentAlignmentDto valueOf(String str) {
        return (ContentAlignmentDto) Enum.valueOf(ContentAlignmentDto.class, str);
    }

    public static ContentAlignmentDto[] values() {
        return (ContentAlignmentDto[]) $VALUES.clone();
    }
}
