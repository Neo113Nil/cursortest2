package ru.yandex.taxi.activity;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/activity/AndroidComponentRepository$Component", "", "Lru/yandex/taxi/activity/AndroidComponentRepository$Component;", "MAIN_ACTIVITY", "SURVEY_DEEPLINK_SERVICE", "WAITING_NOTIFICATION_SERVICE", "NOTIFICATIONS_DISMISS_RECEIVER", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidComponentRepository$Component {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidComponentRepository$Component[] $VALUES;
    public static final AndroidComponentRepository$Component MAIN_ACTIVITY;
    public static final AndroidComponentRepository$Component NOTIFICATIONS_DISMISS_RECEIVER;
    public static final AndroidComponentRepository$Component SURVEY_DEEPLINK_SERVICE;
    public static final AndroidComponentRepository$Component WAITING_NOTIFICATION_SERVICE;

    static {
        AndroidComponentRepository$Component androidComponentRepository$Component = new AndroidComponentRepository$Component("MAIN_ACTIVITY", 0);
        MAIN_ACTIVITY = androidComponentRepository$Component;
        AndroidComponentRepository$Component androidComponentRepository$Component2 = new AndroidComponentRepository$Component("SURVEY_DEEPLINK_SERVICE", 1);
        SURVEY_DEEPLINK_SERVICE = androidComponentRepository$Component2;
        AndroidComponentRepository$Component androidComponentRepository$Component3 = new AndroidComponentRepository$Component("WAITING_NOTIFICATION_SERVICE", 2);
        WAITING_NOTIFICATION_SERVICE = androidComponentRepository$Component3;
        AndroidComponentRepository$Component androidComponentRepository$Component4 = new AndroidComponentRepository$Component("NOTIFICATIONS_DISMISS_RECEIVER", 3);
        NOTIFICATIONS_DISMISS_RECEIVER = androidComponentRepository$Component4;
        AndroidComponentRepository$Component[] androidComponentRepository$ComponentArr = {androidComponentRepository$Component, androidComponentRepository$Component2, androidComponentRepository$Component3, androidComponentRepository$Component4};
        $VALUES = androidComponentRepository$ComponentArr;
        $ENTRIES = kotlin.enums.a.a(androidComponentRepository$ComponentArr);
    }

    public static AndroidComponentRepository$Component valueOf(String str) {
        return (AndroidComponentRepository$Component) Enum.valueOf(AndroidComponentRepository$Component.class, str);
    }

    public static AndroidComponentRepository$Component[] values() {
        return (AndroidComponentRepository$Component[]) $VALUES.clone();
    }
}
