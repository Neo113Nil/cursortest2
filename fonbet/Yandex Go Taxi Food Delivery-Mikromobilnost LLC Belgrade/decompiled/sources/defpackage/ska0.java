package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.api.widget.WidgetState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ska0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WidgetState.values().length];
        try {
            iArr[WidgetState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetState.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WidgetState.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
