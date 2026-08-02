package defpackage;

import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class tz7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CancelSimilarOrdersNotification.ModalType.values().length];
        try {
            iArr[CancelSimilarOrdersNotification.ModalType.ORDER_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CancelSimilarOrdersNotification.ModalType.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
