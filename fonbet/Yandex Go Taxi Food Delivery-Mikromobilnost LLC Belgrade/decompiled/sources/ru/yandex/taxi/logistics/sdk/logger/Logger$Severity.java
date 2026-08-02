package ru.yandex.taxi.logistics.sdk.logger;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/logistics/sdk/logger/Logger$Severity", "", "Lru/yandex/taxi/logistics/sdk/logger/Logger$Severity;", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "sdk-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Logger$Severity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Logger$Severity[] $VALUES;
    public static final Logger$Severity DEBUG;
    public static final Logger$Severity ERROR;
    public static final Logger$Severity INFO;
    public static final Logger$Severity VERBOSE;
    public static final Logger$Severity WARN;

    static {
        Logger$Severity logger$Severity = new Logger$Severity("VERBOSE", 0);
        VERBOSE = logger$Severity;
        Logger$Severity logger$Severity2 = new Logger$Severity("DEBUG", 1);
        DEBUG = logger$Severity2;
        Logger$Severity logger$Severity3 = new Logger$Severity("INFO", 2);
        INFO = logger$Severity3;
        Logger$Severity logger$Severity4 = new Logger$Severity("WARN", 3);
        WARN = logger$Severity4;
        Logger$Severity logger$Severity5 = new Logger$Severity("ERROR", 4);
        ERROR = logger$Severity5;
        Logger$Severity[] logger$SeverityArr = {logger$Severity, logger$Severity2, logger$Severity3, logger$Severity4, logger$Severity5};
        $VALUES = logger$SeverityArr;
        $ENTRIES = a.a(logger$SeverityArr);
    }

    public static Logger$Severity valueOf(String str) {
        return (Logger$Severity) Enum.valueOf(Logger$Severity.class, str);
    }

    public static Logger$Severity[] values() {
        return (Logger$Severity[]) $VALUES.clone();
    }
}
