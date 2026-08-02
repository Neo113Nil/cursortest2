package defpackage;

import ru.yandex.taxi.appdelegates.BadgeType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class tj4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BadgeType.values().length];
        try {
            iArr[BadgeType.Plus.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgeType.YangoPay.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BadgeType.BankQr.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BadgeType.PaymentMiniWidgets.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
