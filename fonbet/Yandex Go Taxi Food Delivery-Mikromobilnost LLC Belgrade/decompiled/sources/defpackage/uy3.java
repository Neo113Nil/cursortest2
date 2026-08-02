package defpackage;

import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class uy3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupRequestStatusPollingOption.values().length];
        try {
            iArr[AutoTopupRequestStatusPollingOption.LONG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupRequestStatusPollingOption.SHORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
