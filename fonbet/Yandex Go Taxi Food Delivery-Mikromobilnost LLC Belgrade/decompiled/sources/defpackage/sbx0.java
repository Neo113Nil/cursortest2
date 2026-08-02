package defpackage;

import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class sbx0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TariffPageCloseReason.values().length];
        try {
            iArr[TariffPageCloseReason.PULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffPageCloseReason.FOOTER_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TariffPageCloseReason.SYSTEM_BACK_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TariffPageCloseReason.OUT_CARD_TAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TariffPageCloseReason.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
