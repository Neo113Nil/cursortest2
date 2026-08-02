package ru.yandex.taxi.scheduleride.deeplink;

import defpackage.k4o;
import defpackage.knm0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/scheduleride/deeplink/ScheduleRideNext;", "", "", "title", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "knm0", "DST_SELECTION", "UNKNOWN", "go-client-android.features.scheduleride:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScheduleRideNext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScheduleRideNext[] $VALUES;
    public static final knm0 Companion;
    public static final ScheduleRideNext DST_SELECTION;
    public static final ScheduleRideNext UNKNOWN;
    private final String title;

    static {
        ScheduleRideNext scheduleRideNext = new ScheduleRideNext("DST_SELECTION", 0, "dst_selection");
        DST_SELECTION = scheduleRideNext;
        ScheduleRideNext scheduleRideNext2 = new ScheduleRideNext("UNKNOWN", 1, "unknown");
        UNKNOWN = scheduleRideNext2;
        ScheduleRideNext[] scheduleRideNextArr = {scheduleRideNext, scheduleRideNext2};
        $VALUES = scheduleRideNextArr;
        $ENTRIES = kotlin.enums.a.a(scheduleRideNextArr);
        Companion = new knm0();
    }

    public ScheduleRideNext(String str, int i, String str2) {
        this.title = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ScheduleRideNext valueOf(String str) {
        return (ScheduleRideNext) Enum.valueOf(ScheduleRideNext.class, str);
    }

    public static ScheduleRideNext[] values() {
        return (ScheduleRideNext[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
