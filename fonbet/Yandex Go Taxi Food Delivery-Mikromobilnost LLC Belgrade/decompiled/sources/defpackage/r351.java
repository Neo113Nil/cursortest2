package defpackage;

import ru.yandex.taxi.order.analytics.model.WidgetType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class r351 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WidgetType.values().length];
        try {
            iArr[WidgetType.ONE_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetType.SOME_ORDERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
