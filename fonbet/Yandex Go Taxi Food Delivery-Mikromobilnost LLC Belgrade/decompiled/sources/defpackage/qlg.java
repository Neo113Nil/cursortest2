package defpackage;

import com.ybsdk.feature.dashboard.api.NfcSupportChecker$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class qlg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NfcSupportChecker$Status.values().length];
        try {
            iArr[NfcSupportChecker$Status.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NfcSupportChecker$Status.SPLIT_PROMO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NfcSupportChecker$Status.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
