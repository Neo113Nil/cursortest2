package defpackage;

import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class rao {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentErrorButtonContent$ClickAction.values().length];
        try {
            iArr[PaymentErrorButtonContent$ClickAction.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentErrorButtonContent$ClickAction.RETRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
