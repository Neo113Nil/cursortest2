package defpackage;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class y680 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderScreen.values().length];
        try {
            iArr[OrderScreen.ORDER_TRACKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderScreen.ORDER_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderScreen.ORDER_DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderScreen.LINKED_ORDER_DETAILS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OrderScreen.AMBULANCE_LINKED_ORDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OrderScreen.BUNDLED_ORDER_DETAILS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OrderScreen.DELEGATE_TO_NAV_COMMAND.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
