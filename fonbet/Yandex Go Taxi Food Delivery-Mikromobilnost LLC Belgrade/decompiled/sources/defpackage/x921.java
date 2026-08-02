package defpackage;

import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditViewState$StepChange;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class x921 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UpgradeEditViewState$StepChange.values().length];
        try {
            iArr[UpgradeEditViewState$StepChange.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpgradeEditViewState$StepChange.FORWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpgradeEditViewState$StepChange.BACKWARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
