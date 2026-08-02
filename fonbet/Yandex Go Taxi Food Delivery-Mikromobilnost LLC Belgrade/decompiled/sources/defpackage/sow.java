package defpackage;

import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class sow {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntercityPhoneSelectOrigin.values().length];
        try {
            iArr[IntercityPhoneSelectOrigin.BUBBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityPhoneSelectOrigin.TARIFF_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntercityPhoneSelectOrigin.ORDER_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IntercityPhoneSelectOrigin.CHECKOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
