package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.entities.activation.DiscountsPromoCodeActivationAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sqj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiscountsPromoCodeActivationAction.values().length];
        try {
            iArr[DiscountsPromoCodeActivationAction.DO_NOTHING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscountsPromoCodeActivationAction.ACTIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
