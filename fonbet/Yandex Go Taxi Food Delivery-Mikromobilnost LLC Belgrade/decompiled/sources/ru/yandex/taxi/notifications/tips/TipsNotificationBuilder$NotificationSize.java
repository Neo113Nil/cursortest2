package ru.yandex.taxi.notifications.tips;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/notifications/tips/TipsNotificationBuilder$NotificationSize", "", "Lru/yandex/taxi/notifications/tips/TipsNotificationBuilder$NotificationSize;", "SMALL", "HEADS_UP", "BIG", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TipsNotificationBuilder$NotificationSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TipsNotificationBuilder$NotificationSize[] $VALUES;
    public static final TipsNotificationBuilder$NotificationSize BIG;
    public static final TipsNotificationBuilder$NotificationSize HEADS_UP;
    public static final TipsNotificationBuilder$NotificationSize SMALL;

    static {
        TipsNotificationBuilder$NotificationSize tipsNotificationBuilder$NotificationSize = new TipsNotificationBuilder$NotificationSize("SMALL", 0);
        SMALL = tipsNotificationBuilder$NotificationSize;
        TipsNotificationBuilder$NotificationSize tipsNotificationBuilder$NotificationSize2 = new TipsNotificationBuilder$NotificationSize("HEADS_UP", 1);
        HEADS_UP = tipsNotificationBuilder$NotificationSize2;
        TipsNotificationBuilder$NotificationSize tipsNotificationBuilder$NotificationSize3 = new TipsNotificationBuilder$NotificationSize("BIG", 2);
        BIG = tipsNotificationBuilder$NotificationSize3;
        TipsNotificationBuilder$NotificationSize[] tipsNotificationBuilder$NotificationSizeArr = {tipsNotificationBuilder$NotificationSize, tipsNotificationBuilder$NotificationSize2, tipsNotificationBuilder$NotificationSize3};
        $VALUES = tipsNotificationBuilder$NotificationSizeArr;
        $ENTRIES = kotlin.enums.a.a(tipsNotificationBuilder$NotificationSizeArr);
    }

    public static TipsNotificationBuilder$NotificationSize valueOf(String str) {
        return (TipsNotificationBuilder$NotificationSize) Enum.valueOf(TipsNotificationBuilder$NotificationSize.class, str);
    }

    public static TipsNotificationBuilder$NotificationSize[] values() {
        return (TipsNotificationBuilder$NotificationSize[]) $VALUES.clone();
    }
}
