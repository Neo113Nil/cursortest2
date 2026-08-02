package defpackage;

import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class x4m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavingsAccountCreationStatusEntity$Status.values().length];
        try {
            iArr[SavingsAccountCreationStatusEntity$Status.FAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsAccountCreationStatusEntity$Status.TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
