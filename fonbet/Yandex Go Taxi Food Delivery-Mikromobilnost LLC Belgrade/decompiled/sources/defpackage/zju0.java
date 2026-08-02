package defpackage;

import com.yandex.plus.core.graphql.type.GOOGLE_OFFER_REPLACE_STRATEGY;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class zju0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GOOGLE_OFFER_REPLACE_STRATEGY.values().length];
        try {
            iArr[GOOGLE_OFFER_REPLACE_STRATEGY.CHARGE_FULL_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GOOGLE_OFFER_REPLACE_STRATEGY.DEFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GOOGLE_OFFER_REPLACE_STRATEGY.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
