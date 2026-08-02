package defpackage;

import com.yandex.go.payments_widgets.split.actions.dto.YbSplitOpenTypedURLAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sm51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbSplitOpenTypedURLAction.UrlType.values().length];
        try {
            iArr[YbSplitOpenTypedURLAction.UrlType.Onboarding.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbSplitOpenTypedURLAction.UrlType.Account.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YbSplitOpenTypedURLAction.UrlType.FuturePayments.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[YbSplitOpenTypedURLAction.UrlType.SaverPromo.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
