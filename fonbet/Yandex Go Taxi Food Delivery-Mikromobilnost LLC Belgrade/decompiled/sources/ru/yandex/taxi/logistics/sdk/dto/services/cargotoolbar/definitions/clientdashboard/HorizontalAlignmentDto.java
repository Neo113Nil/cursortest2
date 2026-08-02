package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HorizontalAlignmentDto;", "", "<init>", "(Ljava/lang/String;I)V", "BEGIN", "CENTER", "END", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HorizontalAlignmentDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HorizontalAlignmentDto[] $VALUES;

    @Json(name = "begin")
    public static final HorizontalAlignmentDto BEGIN = new HorizontalAlignmentDto("BEGIN", 0);

    @Json(name = "center")
    public static final HorizontalAlignmentDto CENTER = new HorizontalAlignmentDto("CENTER", 1);

    @Json(name = "end")
    public static final HorizontalAlignmentDto END = new HorizontalAlignmentDto("END", 2);

    private static final /* synthetic */ HorizontalAlignmentDto[] $values() {
        return new HorizontalAlignmentDto[]{BEGIN, CENTER, END};
    }

    static {
        HorizontalAlignmentDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private HorizontalAlignmentDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static HorizontalAlignmentDto valueOf(String str) {
        return (HorizontalAlignmentDto) Enum.valueOf(HorizontalAlignmentDto.class, str);
    }

    public static HorizontalAlignmentDto[] values() {
        return (HorizontalAlignmentDto[]) $VALUES.clone();
    }
}
