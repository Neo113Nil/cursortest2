package ru.yandex.taxi.locationsdk.core.utils;

import defpackage.n1f;
import defpackage.rol0;
import defpackage.vez0;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes5.dex */
public abstract class b {
    public static final rol0 a(n1f n1fVar, TimestampSelector timestampSelector) {
        return ru.yandex.taxi.locationsdk.common_utils.a.b(n1fVar, new LocationMonotonicityKt$ensureStrictTimestampMonotonicity$1(2, timestampSelector, vez0.class, "isStrictlyMonotonic", "isStrictlyMonotonic(Lru/yandex/taxi/locationsdk/core/time/TimestampSelector;Lru/yandex/taxi/locationsdk/core/location/Location;Lru/yandex/taxi/locationsdk/core/location/Location;)Z", 1));
    }
}
