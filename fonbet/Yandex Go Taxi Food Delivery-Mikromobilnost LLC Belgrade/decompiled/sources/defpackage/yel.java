package defpackage;

import com.yandex.xplat.payment.sdk.DivCardForAnalytics;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class yel {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivCardForAnalytics.values().length];
        try {
            iArr[DivCardForAnalytics.SELECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivCardForAnalytics.CVV.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivCardForAnalytics.BANK_SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivCardForAnalytics.EXIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivCardForAnalytics.SBP_LICENSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DivCardForAnalytics.SBP_CHALLENGER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DivCardForAnalytics.BIND_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DivCardForAnalytics.RESULT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
