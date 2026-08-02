package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.navigation.RideCardModalExitType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class wkk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardModalExitType.values().length];
        try {
            iArr[RideCardModalExitType.GO_BACK_IN_STACK_VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardModalExitType.CLOSE_ORDER_WITH_COMPLETE_EFFECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
