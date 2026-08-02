package ru.yandex.taxi.perf;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/perf/StartupEvent;", "", "", "logName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ApplicationCreated", "ActivityCreated", "ActivityStarted", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final class StartupEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StartupEvent[] $VALUES;
    public static final StartupEvent ActivityCreated;
    public static final StartupEvent ActivityStarted;
    public static final StartupEvent ApplicationCreated;
    private final String logName;

    static {
        StartupEvent startupEvent = new StartupEvent("ApplicationCreated", 0, "ApplicationCreated");
        ApplicationCreated = startupEvent;
        StartupEvent startupEvent2 = new StartupEvent("ActivityCreated", 1, "ActivityCreated");
        ActivityCreated = startupEvent2;
        StartupEvent startupEvent3 = new StartupEvent("ActivityStarted", 2, "ActivityStarted");
        ActivityStarted = startupEvent3;
        StartupEvent[] startupEventArr = {startupEvent, startupEvent2, startupEvent3};
        $VALUES = startupEventArr;
        $ENTRIES = kotlin.enums.a.a(startupEventArr);
    }

    public StartupEvent(String str, int i, String str2) {
        this.logName = str2;
    }

    public static StartupEvent valueOf(String str) {
        return (StartupEvent) Enum.valueOf(StartupEvent.class, str);
    }

    public static StartupEvent[] values() {
        return (StartupEvent[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getLogName() {
        return this.logName;
    }
}
