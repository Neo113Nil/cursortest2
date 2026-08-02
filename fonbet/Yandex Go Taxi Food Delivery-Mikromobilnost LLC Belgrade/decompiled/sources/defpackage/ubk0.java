package defpackage;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ubk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderScreen.values().length];
        try {
            iArr[OrderScreen.ORDER_TRACKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderScreen.ORDER_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
