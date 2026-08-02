package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.InAppReplacementParams;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class scd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InAppReplacementParams.Strategy.values().length];
        try {
            iArr[InAppReplacementParams.Strategy.CHARGE_FULL_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppReplacementParams.Strategy.DEFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
