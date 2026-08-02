package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointVisitStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "ARRIVED", "VISITED", "SKIPPED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PointVisitStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PointVisitStatusDto[] $VALUES;

    @Json(name = "pending")
    public static final PointVisitStatusDto PENDING = new PointVisitStatusDto("PENDING", 0);

    @Json(name = "arrived")
    public static final PointVisitStatusDto ARRIVED = new PointVisitStatusDto("ARRIVED", 1);

    @Json(name = "visited")
    public static final PointVisitStatusDto VISITED = new PointVisitStatusDto("VISITED", 2);

    @Json(name = "skipped")
    public static final PointVisitStatusDto SKIPPED = new PointVisitStatusDto("SKIPPED", 3);

    private static final /* synthetic */ PointVisitStatusDto[] $values() {
        return new PointVisitStatusDto[]{PENDING, ARRIVED, VISITED, SKIPPED};
    }

    static {
        PointVisitStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PointVisitStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PointVisitStatusDto valueOf(String str) {
        return (PointVisitStatusDto) Enum.valueOf(PointVisitStatusDto.class, str);
    }

    public static PointVisitStatusDto[] values() {
        return (PointVisitStatusDto[]) $VALUES.clone();
    }
}
