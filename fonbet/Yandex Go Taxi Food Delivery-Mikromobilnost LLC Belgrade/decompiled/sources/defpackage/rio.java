package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class rio {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPaymentStat$Source.values().length];
        try {
            iArr[PlusPaymentStat$Source.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPaymentStat$Source.STORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
