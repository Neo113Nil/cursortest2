package ru.yandex.taxi.settings.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/settings/analytics/NotificationCloseReason;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NEW_SCREEN", "SWIPE", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NotificationCloseReason[] $VALUES;
    public static final NotificationCloseReason NEW_SCREEN;
    public static final NotificationCloseReason SWIPE;
    private final String value;

    static {
        NotificationCloseReason notificationCloseReason = new NotificationCloseReason("NEW_SCREEN", 0, "new_screen");
        NEW_SCREEN = notificationCloseReason;
        NotificationCloseReason notificationCloseReason2 = new NotificationCloseReason("SWIPE", 1, "swipe");
        SWIPE = notificationCloseReason2;
        NotificationCloseReason[] notificationCloseReasonArr = {notificationCloseReason, notificationCloseReason2};
        $VALUES = notificationCloseReasonArr;
        $ENTRIES = a.a(notificationCloseReasonArr);
    }

    public NotificationCloseReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificationCloseReason valueOf(String str) {
        return (NotificationCloseReason) Enum.valueOf(NotificationCloseReason.class, str);
    }

    public static NotificationCloseReason[] values() {
        return (NotificationCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
