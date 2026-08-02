package org.koin.core.logger;

import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/koin/core/logger/Level;", "", "DEBUG", "INFO", "ERROR", JCP.RAW_PREFIX, "koin-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Level {
    private static final /* synthetic */ Level[] $VALUES;
    public static final Level DEBUG;
    public static final Level ERROR;
    public static final Level INFO;
    public static final Level NONE;

    static {
        Level level = new Level("DEBUG", 0);
        DEBUG = level;
        Level level2 = new Level("INFO", 1);
        INFO = level2;
        Level level3 = new Level("ERROR", 2);
        ERROR = level3;
        Level level4 = new Level(JCP.RAW_PREFIX, 3);
        NONE = level4;
        $VALUES = new Level[]{level, level2, level3, level4};
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) $VALUES.clone();
    }
}
