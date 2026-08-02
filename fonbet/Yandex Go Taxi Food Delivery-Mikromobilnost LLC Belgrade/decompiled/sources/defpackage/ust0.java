package defpackage;

import com.ybsdk.feature.split.deposit.internal.domain.model.SplitDepositPageData$AutoTopupData$AutoTopupStatus;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.PartnerSelectionSavingState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ust0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PartnerSelectionSavingState.values().length];
        try {
            iArr[PartnerSelectionSavingState.Pending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartnerSelectionSavingState.Timeout.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PartnerSelectionSavingState.Success.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PartnerSelectionSavingState.Fail.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SplitDepositPageData$AutoTopupData$AutoTopupStatus.values().length];
        try {
            iArr2[SplitDepositPageData$AutoTopupData$AutoTopupStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SplitDepositPageData$AutoTopupData$AutoTopupStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
