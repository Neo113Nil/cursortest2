package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/StatePointTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "DESTINATION", "RETURN", "ANOTHER_ORDER_POINT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatePointTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StatePointTypeDto[] $VALUES;

    @Json(name = "source")
    public static final StatePointTypeDto SOURCE = new StatePointTypeDto("SOURCE", 0);

    @Json(name = "destination")
    public static final StatePointTypeDto DESTINATION = new StatePointTypeDto("DESTINATION", 1);

    @Json(name = "return")
    public static final StatePointTypeDto RETURN = new StatePointTypeDto("RETURN", 2);

    @Json(name = "another-order-point")
    public static final StatePointTypeDto ANOTHER_ORDER_POINT = new StatePointTypeDto("ANOTHER_ORDER_POINT", 3);

    private static final /* synthetic */ StatePointTypeDto[] $values() {
        return new StatePointTypeDto[]{SOURCE, DESTINATION, RETURN, ANOTHER_ORDER_POINT};
    }

    static {
        StatePointTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private StatePointTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StatePointTypeDto valueOf(String str) {
        return (StatePointTypeDto) Enum.valueOf(StatePointTypeDto.class, str);
    }

    public static StatePointTypeDto[] values() {
        return (StatePointTypeDto[]) $VALUES.clone();
    }
}
