package defpackage;

import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ykm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderNotification$OrderNotificationType.values().length];
        try {
            iArr[OrderNotification$OrderNotificationType.ORDER_WAITING_LIVE_UPDATES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
