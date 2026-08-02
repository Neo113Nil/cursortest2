package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/analytics/LiveLocationModalAnalytics$ButtonType", "", "Lru/yandex/taxi/analytics/LiveLocationModalAnalytics$ButtonType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NOTHING", "TURN_ON", "TURN_OFF", "TURN_ON_THIS_RIDE", "TURN_OFF_THIS_RIDE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LiveLocationModalAnalytics$ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LiveLocationModalAnalytics$ButtonType[] $VALUES;
    public static final LiveLocationModalAnalytics$ButtonType NOTHING;
    public static final LiveLocationModalAnalytics$ButtonType TURN_OFF;
    public static final LiveLocationModalAnalytics$ButtonType TURN_OFF_THIS_RIDE;
    public static final LiveLocationModalAnalytics$ButtonType TURN_ON;
    public static final LiveLocationModalAnalytics$ButtonType TURN_ON_THIS_RIDE;
    private final String value;

    static {
        LiveLocationModalAnalytics$ButtonType liveLocationModalAnalytics$ButtonType = new LiveLocationModalAnalytics$ButtonType("NOTHING", 0, "nothing");
        NOTHING = liveLocationModalAnalytics$ButtonType;
        LiveLocationModalAnalytics$ButtonType liveLocationModalAnalytics$ButtonType2 = new LiveLocationModalAnalytics$ButtonType("TURN_ON", 1, "turn_on");
        TURN_ON = liveLocationModalAnalytics$ButtonType2;
        LiveLocationModalAnalytics$ButtonType liveLocationModalAnalytics$ButtonType3 = new LiveLocationModalAnalytics$ButtonType("TURN_OFF", 2, "turn_off");
        TURN_OFF = liveLocationModalAnalytics$ButtonType3;
        LiveLocationModalAnalytics$ButtonType liveLocationModalAnalytics$ButtonType4 = new LiveLocationModalAnalytics$ButtonType("TURN_ON_THIS_RIDE", 3, "turn_on_this_ride");
        TURN_ON_THIS_RIDE = liveLocationModalAnalytics$ButtonType4;
        LiveLocationModalAnalytics$ButtonType liveLocationModalAnalytics$ButtonType5 = new LiveLocationModalAnalytics$ButtonType("TURN_OFF_THIS_RIDE", 4, "turn_off_this_ride");
        TURN_OFF_THIS_RIDE = liveLocationModalAnalytics$ButtonType5;
        LiveLocationModalAnalytics$ButtonType[] liveLocationModalAnalytics$ButtonTypeArr = {liveLocationModalAnalytics$ButtonType, liveLocationModalAnalytics$ButtonType2, liveLocationModalAnalytics$ButtonType3, liveLocationModalAnalytics$ButtonType4, liveLocationModalAnalytics$ButtonType5};
        $VALUES = liveLocationModalAnalytics$ButtonTypeArr;
        $ENTRIES = a.a(liveLocationModalAnalytics$ButtonTypeArr);
    }

    public LiveLocationModalAnalytics$ButtonType(String str, int i, String str2) {
        this.value = str2;
    }

    public static LiveLocationModalAnalytics$ButtonType valueOf(String str) {
        return (LiveLocationModalAnalytics$ButtonType) Enum.valueOf(LiveLocationModalAnalytics$ButtonType.class, str);
    }

    public static LiveLocationModalAnalytics$ButtonType[] values() {
        return (LiveLocationModalAnalytics$ButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
