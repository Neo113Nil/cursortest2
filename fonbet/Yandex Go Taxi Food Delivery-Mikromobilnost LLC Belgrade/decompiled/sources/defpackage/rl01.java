package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.partnerselection.api.CrossBorderCheckResult$PriorityMoneyType;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetState$SelectAccount$Type;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetViewState$SelectAccount$Type;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainState$Success$OpenScenario;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.SuggestView$State$Behaviour;
import com.ybsdk.widgets.common.WidgetWithToggleView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class rl01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;
    public static final /* synthetic */ int[] j;
    public static final /* synthetic */ int[] k;

    static {
        int[] iArr = new int[TransferPrerequisites.CrossBorder.PriorityMoneyType.values().length];
        try {
            iArr[TransferPrerequisites.CrossBorder.PriorityMoneyType.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferPrerequisites.CrossBorder.PriorityMoneyType.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[WidgetWithToggleView.ToggleState.values().length];
        try {
            iArr2[WidgetWithToggleView.ToggleState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[WidgetWithToggleView.ToggleState.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[BottomSheetState$SelectAccount$Type.values().length];
        try {
            iArr3[BottomSheetState$SelectAccount$Type.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[BottomSheetState$SelectAccount$Type.SUBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
        int[] iArr4 = new int[BottomSheetViewState$SelectAccount$Type.values().length];
        try {
            iArr4[BottomSheetViewState$SelectAccount$Type.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[BottomSheetViewState$SelectAccount$Type.SUBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
        int[] iArr5 = new int[StadiumButtonView.ClickedPart.values().length];
        try {
            iArr5[StadiumButtonView.ClickedPart.FULL_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr5[StadiumButtonView.ClickedPart.RIGHT_PART.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        e = iArr5;
        int[] iArr6 = new int[TransferDirection.values().length];
        try {
            iArr6[TransferDirection.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr6[TransferDirection.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f = iArr6;
        int[] iArr7 = new int[SuggestView$State$Behaviour.values().length];
        try {
            iArr7[SuggestView$State$Behaviour.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr7[SuggestView$State$Behaviour.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        g = iArr7;
        int[] iArr8 = new int[CrossBorderCheckResult$PriorityMoneyType.values().length];
        try {
            iArr8[CrossBorderCheckResult$PriorityMoneyType.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr8[CrossBorderCheckResult$PriorityMoneyType.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        h = iArr8;
        int[] iArr9 = new int[TransferMainState$Success$OpenScenario.values().length];
        try {
            iArr9[TransferMainState$Success$OpenScenario.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr9[TransferMainState$Success$OpenScenario.SELF.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr9[TransferMainState$Success$OpenScenario.REQUISITES.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr9[TransferMainState$Success$OpenScenario.CROSS_BORDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr9[TransferMainState$Success$OpenScenario.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        i = iArr9;
        int[] iArr10 = new int[SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.values().length];
        try {
            iArr10[SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr10[SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        j = iArr10;
        int[] iArr11 = new int[TransferScenario.values().length];
        try {
            iArr11[TransferScenario.MKK_CASHOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr11[TransferScenario.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr11[TransferScenario.SELF.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr11[TransferScenario.REQUISITES.ordinal()] = 4;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr11[TransferScenario.MOBILE_PAYMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr11[TransferScenario.INTERNET_PAYMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr11[TransferScenario.C2G.ordinal()] = 7;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr11[TransferScenario.FUND.ordinal()] = 8;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr11[TransferScenario.SAVERS_TOPUP.ordinal()] = 9;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr11[TransferScenario.TIPS.ordinal()] = 10;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr11[TransferScenario.CROSS_BORDER.ordinal()] = 11;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr11[TransferScenario.INVOICE_HCS.ordinal()] = 12;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr11[TransferScenario.B2C_TRANSFER.ordinal()] = 13;
        } catch (NoSuchFieldError unused36) {
        }
        k = iArr11;
    }
}
