package ru.yandex.taxi.notifications.tips;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TipsNotificationBuilder$NotificationSize.values().length];
        try {
            iArr[TipsNotificationBuilder$NotificationSize.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TipsNotificationBuilder$NotificationSize.HEADS_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TipsNotificationBuilder$NotificationSize.BIG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
