package coil3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Logger$Level {
    public static final /* synthetic */ Logger$Level[] $VALUES = {new Logger$Level("Verbose", 0), new Logger$Level("Debug", 1), new Logger$Level("Info", 2), new Logger$Level("Warn", 3), new Logger$Level("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    Logger$Level EF5;

    public static Logger$Level valueOf(String str) {
        return (Logger$Level) Enum.valueOf(Logger$Level.class, str);
    }

    public static Logger$Level[] values() {
        return (Logger$Level[]) $VALUES.clone();
    }
}
