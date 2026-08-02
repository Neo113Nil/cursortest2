package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayInAppReplacementParams.Strategy.values().length];
        try {
            iArr[PlusPayInAppReplacementParams.Strategy.CHARGE_FULL_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayInAppReplacementParams.Strategy.DEFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
