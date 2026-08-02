package defpackage;

import com.ybsdk.feature.card.api.CardApplicationsRepository$CardIssueResult;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vh8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardApplicationsRepository$CardIssueResult.values().length];
        try {
            iArr[CardApplicationsRepository$CardIssueResult.FAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardApplicationsRepository$CardIssueResult.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
