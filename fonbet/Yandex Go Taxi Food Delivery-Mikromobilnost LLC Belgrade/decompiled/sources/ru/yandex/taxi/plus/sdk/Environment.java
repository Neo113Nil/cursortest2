package ru.yandex.taxi.plus.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/plus/sdk/Environment;", "", "TESTING", "PRODUCTION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Environment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Environment PRODUCTION;
    public static final Environment TESTING;

    static {
        Environment environment = new Environment("TESTING", 0);
        TESTING = environment;
        Environment environment2 = new Environment("PRODUCTION", 1);
        PRODUCTION = environment2;
        Environment[] environmentArr = {environment, environment2};
        $VALUES = environmentArr;
        $ENTRIES = a.a(environmentArr);
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }
}
