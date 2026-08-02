package defpackage;

import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseButtonStyle;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class xt30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtPurchaseButtonStyle.values().length];
        try {
            iArr[MtPurchaseButtonStyle.Main.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtPurchaseButtonStyle.Minor.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
