package ru.yandex.taxi.masstransit.promo;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/promo/NotificationState;", "", "SHOWING", "HIDING", "SHOWED", "HIDDEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NotificationState[] $VALUES;
    public static final NotificationState HIDDEN;
    public static final NotificationState HIDING;
    public static final NotificationState SHOWED;
    public static final NotificationState SHOWING;

    static {
        NotificationState notificationState = new NotificationState("SHOWING", 0);
        SHOWING = notificationState;
        NotificationState notificationState2 = new NotificationState("HIDING", 1);
        HIDING = notificationState2;
        NotificationState notificationState3 = new NotificationState("SHOWED", 2);
        SHOWED = notificationState3;
        NotificationState notificationState4 = new NotificationState("HIDDEN", 3);
        HIDDEN = notificationState4;
        NotificationState[] notificationStateArr = {notificationState, notificationState2, notificationState3, notificationState4};
        $VALUES = notificationStateArr;
        $ENTRIES = kotlin.enums.a.a(notificationStateArr);
    }

    public static NotificationState valueOf(String str) {
        return (NotificationState) Enum.valueOf(NotificationState.class, str);
    }

    public static NotificationState[] values() {
        return (NotificationState[]) $VALUES.clone();
    }
}
