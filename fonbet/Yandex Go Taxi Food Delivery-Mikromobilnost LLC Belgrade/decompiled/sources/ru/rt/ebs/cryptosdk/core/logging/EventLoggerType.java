package ru.rt.ebs.cryptosdk.core.logging;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/logging/EventLoggerType;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "DATA", "WARNING", "ERROR", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EventLoggerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EventLoggerType[] $VALUES;
    public static final EventLoggerType INFO = new EventLoggerType("INFO", 0);
    public static final EventLoggerType DATA = new EventLoggerType("DATA", 1);
    public static final EventLoggerType WARNING = new EventLoggerType("WARNING", 2);
    public static final EventLoggerType ERROR = new EventLoggerType("ERROR", 3);

    private static final /* synthetic */ EventLoggerType[] $values() {
        return new EventLoggerType[]{INFO, DATA, WARNING, ERROR};
    }

    static {
        EventLoggerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private EventLoggerType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EventLoggerType valueOf(String str) {
        return (EventLoggerType) Enum.valueOf(EventLoggerType.class, str);
    }

    public static EventLoggerType[] values() {
        return (EventLoggerType[]) $VALUES.clone();
    }
}
