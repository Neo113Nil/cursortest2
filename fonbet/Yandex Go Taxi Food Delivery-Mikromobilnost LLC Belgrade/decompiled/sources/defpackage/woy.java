package defpackage;

import com.yandex.go.linked_order.router.LinkedOrderScreen;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class woy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LinkedOrderScreen.values().length];
        try {
            iArr[LinkedOrderScreen.ORDER_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkedOrderScreen.AMBULANCE_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
