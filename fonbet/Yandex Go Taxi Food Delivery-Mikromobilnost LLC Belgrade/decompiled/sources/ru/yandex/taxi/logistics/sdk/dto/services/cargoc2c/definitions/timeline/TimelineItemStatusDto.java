package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineItemStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "FAILED", "PASSED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TimelineItemStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimelineItemStatusDto[] $VALUES;

    @Json(name = "pending")
    public static final TimelineItemStatusDto PENDING = new TimelineItemStatusDto("PENDING", 0);

    @Json(name = "failed")
    public static final TimelineItemStatusDto FAILED = new TimelineItemStatusDto("FAILED", 1);

    @Json(name = "passed")
    public static final TimelineItemStatusDto PASSED = new TimelineItemStatusDto("PASSED", 2);

    private static final /* synthetic */ TimelineItemStatusDto[] $values() {
        return new TimelineItemStatusDto[]{PENDING, FAILED, PASSED};
    }

    static {
        TimelineItemStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TimelineItemStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TimelineItemStatusDto valueOf(String str) {
        return (TimelineItemStatusDto) Enum.valueOf(TimelineItemStatusDto.class, str);
    }

    public static TimelineItemStatusDto[] values() {
        return (TimelineItemStatusDto[]) $VALUES.clone();
    }
}
