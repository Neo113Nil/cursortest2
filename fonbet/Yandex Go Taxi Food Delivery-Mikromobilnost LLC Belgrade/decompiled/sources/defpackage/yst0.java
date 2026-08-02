package defpackage;

import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.PartnerSelectionSavingState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class yst0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PartnerSelectionSavingState.values().length];
        try {
            iArr[PartnerSelectionSavingState.Fail.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartnerSelectionSavingState.Pending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PartnerSelectionSavingState.Success.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PartnerSelectionSavingState.Timeout.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
