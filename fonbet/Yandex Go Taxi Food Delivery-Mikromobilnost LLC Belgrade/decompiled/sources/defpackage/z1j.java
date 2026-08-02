package defpackage;

import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class z1j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AfterCancelPopupButton.ActionType.values().length];
        try {
            iArr[AfterCancelPopupButton.ActionType.TO_SUMMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AfterCancelPopupButton.ActionType.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AfterCancelPopupButton.ActionType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
