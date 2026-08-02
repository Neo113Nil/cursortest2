package defpackage;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class yw70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderScreen.values().length];
        try {
            iArr[OrderScreen.ORDER_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderScreen.LINKED_ORDER_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderScreen.AMBULANCE_LINKED_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderScreen.BUNDLED_ORDER_DETAILS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
