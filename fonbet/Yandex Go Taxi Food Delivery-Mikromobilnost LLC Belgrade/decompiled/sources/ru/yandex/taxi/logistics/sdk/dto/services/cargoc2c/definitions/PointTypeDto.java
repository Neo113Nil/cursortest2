package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "DESTINATION", "RETURN", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PointTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PointTypeDto[] $VALUES;

    @Json(name = "source")
    public static final PointTypeDto SOURCE = new PointTypeDto("SOURCE", 0);

    @Json(name = "destination")
    public static final PointTypeDto DESTINATION = new PointTypeDto("DESTINATION", 1);

    @Json(name = "return")
    public static final PointTypeDto RETURN = new PointTypeDto("RETURN", 2);

    private static final /* synthetic */ PointTypeDto[] $values() {
        return new PointTypeDto[]{SOURCE, DESTINATION, RETURN};
    }

    static {
        PointTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PointTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PointTypeDto valueOf(String str) {
        return (PointTypeDto) Enum.valueOf(PointTypeDto.class, str);
    }

    public static PointTypeDto[] values() {
        return (PointTypeDto[]) $VALUES.clone();
    }
}
