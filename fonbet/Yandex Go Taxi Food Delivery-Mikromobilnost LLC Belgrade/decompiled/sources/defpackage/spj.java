package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.entities.activation.DiscountsCardAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class spj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiscountsCardAction.values().length];
        try {
            iArr[DiscountsCardAction.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscountsCardAction.SELECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
