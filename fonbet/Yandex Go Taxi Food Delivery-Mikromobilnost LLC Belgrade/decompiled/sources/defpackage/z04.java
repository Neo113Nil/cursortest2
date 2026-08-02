package defpackage;

import com.ybsdk.feature.deeplink.api.actions.AutoTopupSettingType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class z04 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupSettingType.values().length];
        try {
            iArr[AutoTopupSettingType.AUTOFUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupSettingType.AUTOTOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
