package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.entities.button.DiscountsButtonAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class wpj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiscountsButtonAction.values().length];
        try {
            iArr[DiscountsButtonAction.GO_TO_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscountsButtonAction.REMOVE_PROMO_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiscountsButtonAction.ADD_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DiscountsButtonAction.SELECT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
