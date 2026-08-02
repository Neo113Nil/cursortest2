package defpackage;

import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class qp8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardType.values().length];
        try {
            iArr[CardType.AMEX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardType.DINERSCLUB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
