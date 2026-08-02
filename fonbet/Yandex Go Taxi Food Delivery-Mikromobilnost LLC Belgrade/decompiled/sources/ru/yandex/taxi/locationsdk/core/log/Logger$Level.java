package ru.yandex.taxi.locationsdk.core.log;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/locationsdk/core/log/Logger$Level", "", "Lru/yandex/taxi/locationsdk/core/log/Logger$Level;", "VERBOSE", "DEBUG", "INFO", "WARNING", "core2"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Logger$Level {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Logger$Level[] $VALUES;
    public static final Logger$Level DEBUG;
    public static final Logger$Level INFO;
    public static final Logger$Level VERBOSE;
    public static final Logger$Level WARNING;

    static {
        Logger$Level logger$Level = new Logger$Level("VERBOSE", 0);
        VERBOSE = logger$Level;
        Logger$Level logger$Level2 = new Logger$Level("DEBUG", 1);
        DEBUG = logger$Level2;
        Logger$Level logger$Level3 = new Logger$Level("INFO", 2);
        INFO = logger$Level3;
        Logger$Level logger$Level4 = new Logger$Level("WARNING", 3);
        WARNING = logger$Level4;
        Logger$Level[] logger$LevelArr = {logger$Level, logger$Level2, logger$Level3, logger$Level4};
        $VALUES = logger$LevelArr;
        $ENTRIES = a.a(logger$LevelArr);
    }

    public static Logger$Level valueOf(String str) {
        return (Logger$Level) Enum.valueOf(Logger$Level.class, str);
    }

    public static Logger$Level[] values() {
        return (Logger$Level[]) $VALUES.clone();
    }
}
