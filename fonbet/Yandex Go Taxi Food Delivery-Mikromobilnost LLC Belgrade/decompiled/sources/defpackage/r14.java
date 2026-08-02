package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class r14 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupSwitchStatus.values().length];
        try {
            iArr[AutoTopupSwitchStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupSwitchStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
