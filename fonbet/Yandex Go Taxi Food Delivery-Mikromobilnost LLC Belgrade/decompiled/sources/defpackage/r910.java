package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class r910 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Me2MeDebitResultEntity$Status.values().length];
        try {
            iArr[Me2MeDebitResultEntity$Status.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Me2MeDebitResultEntity$Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Me2MeDebitResultEntity$Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Me2MeDebitResultEntity$Status.TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
