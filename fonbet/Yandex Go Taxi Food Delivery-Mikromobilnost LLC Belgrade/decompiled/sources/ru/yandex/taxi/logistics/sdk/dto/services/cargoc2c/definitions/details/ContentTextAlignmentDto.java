package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;", "", "<init>", "(Ljava/lang/String;I)V", "LEAD", "CENTER", "TRAIL", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentTextAlignmentDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentTextAlignmentDto[] $VALUES;

    @Json(name = "lead")
    public static final ContentTextAlignmentDto LEAD = new ContentTextAlignmentDto("LEAD", 0);

    @Json(name = "center")
    public static final ContentTextAlignmentDto CENTER = new ContentTextAlignmentDto("CENTER", 1);

    @Json(name = "trail")
    public static final ContentTextAlignmentDto TRAIL = new ContentTextAlignmentDto("TRAIL", 2);

    private static final /* synthetic */ ContentTextAlignmentDto[] $values() {
        return new ContentTextAlignmentDto[]{LEAD, CENTER, TRAIL};
    }

    static {
        ContentTextAlignmentDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ContentTextAlignmentDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ContentTextAlignmentDto valueOf(String str) {
        return (ContentTextAlignmentDto) Enum.valueOf(ContentTextAlignmentDto.class, str);
    }

    public static ContentTextAlignmentDto[] values() {
        return (ContentTextAlignmentDto[]) $VALUES.clone();
    }
}
