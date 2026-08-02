package defpackage;

import com.ybsdk.feature.card.api.CardApplicationsRepository$CardIssueResult;
import com.ybsdk.feature.dashboard.api.model.ProductId;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class whg {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.CREDIT_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductId.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductId.PRO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProductId.CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ProductId.CREDIT_ACCOUNT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[CardApplicationsRepository$CardIssueResult.values().length];
        try {
            iArr2[CardApplicationsRepository$CardIssueResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CardApplicationsRepository$CardIssueResult.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
