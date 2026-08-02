package ru.yandex.taxi.plaque.api.dependencies;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/plaque/api/dependencies/PlaqueEnvironment;", "", "TESTING", "PRODUCTION", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaqueEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaqueEnvironment[] $VALUES;
    public static final PlaqueEnvironment PRODUCTION;
    public static final PlaqueEnvironment TESTING;

    static {
        PlaqueEnvironment plaqueEnvironment = new PlaqueEnvironment("TESTING", 0);
        TESTING = plaqueEnvironment;
        PlaqueEnvironment plaqueEnvironment2 = new PlaqueEnvironment("PRODUCTION", 1);
        PRODUCTION = plaqueEnvironment2;
        PlaqueEnvironment[] plaqueEnvironmentArr = {plaqueEnvironment, plaqueEnvironment2};
        $VALUES = plaqueEnvironmentArr;
        $ENTRIES = a.a(plaqueEnvironmentArr);
    }

    public static PlaqueEnvironment valueOf(String str) {
        return (PlaqueEnvironment) Enum.valueOf(PlaqueEnvironment.class, str);
    }

    public static PlaqueEnvironment[] values() {
        return (PlaqueEnvironment[]) $VALUES.clone();
    }
}
