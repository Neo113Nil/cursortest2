package defpackage;

import com.ybsdk.feature.card.api.SuccessIssueAction;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class uh8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuccessIssueAction.values().length];
        try {
            iArr[SuccessIssueAction.Back.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuccessIssueAction.OpenCardDetails.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
