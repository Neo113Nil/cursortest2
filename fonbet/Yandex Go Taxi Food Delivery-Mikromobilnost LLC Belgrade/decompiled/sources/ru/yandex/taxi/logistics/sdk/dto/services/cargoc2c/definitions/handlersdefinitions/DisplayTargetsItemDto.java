package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/DisplayTargetsItemDto;", "", "<init>", "(Ljava/lang/String;I)V", "DELIVERY_DASHBOARD", "MULTIORDER", "SUMMARY_TRAP", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DisplayTargetsItemDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DisplayTargetsItemDto[] $VALUES;

    @Json(name = "delivery_dashboard")
    public static final DisplayTargetsItemDto DELIVERY_DASHBOARD = new DisplayTargetsItemDto("DELIVERY_DASHBOARD", 0);

    @Json(name = "multiorder")
    public static final DisplayTargetsItemDto MULTIORDER = new DisplayTargetsItemDto("MULTIORDER", 1);

    @Json(name = "summary_trap")
    public static final DisplayTargetsItemDto SUMMARY_TRAP = new DisplayTargetsItemDto("SUMMARY_TRAP", 2);

    private static final /* synthetic */ DisplayTargetsItemDto[] $values() {
        return new DisplayTargetsItemDto[]{DELIVERY_DASHBOARD, MULTIORDER, SUMMARY_TRAP};
    }

    static {
        DisplayTargetsItemDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DisplayTargetsItemDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DisplayTargetsItemDto valueOf(String str) {
        return (DisplayTargetsItemDto) Enum.valueOf(DisplayTargetsItemDto.class, str);
    }

    public static DisplayTargetsItemDto[] values() {
        return (DisplayTargetsItemDto[]) $VALUES.clone();
    }
}
