package com.squareup.cash.blockers.views;

import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bitcoin.viewmodels.unavailable.BitcoinFeatureUnavailableViewEvent$DoneClicked;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogViewEvent;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewEvent;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionDialogActionViewEvent;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewEvent;
import com.squareup.cash.blockers.viewmodels.FilesetUploadLoadingViewEvent$Cancel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        StablecoinOnboardingViewEvent.BackClicked backClicked = StablecoinOnboardingViewEvent.BackClicked.INSTANCE;
        BitcoinInstrumentRecommendationViewEvent.CloseClicked closeClicked = BitcoinInstrumentRecommendationViewEvent.CloseClicked.INSTANCE;
        FilesetUploadViewEvent.GoBack goBack = FilesetUploadViewEvent.GoBack.INSTANCE;
        BlockerActionConfirmSheetViewEvent.ConfirmClicked confirmClicked = BlockerActionConfirmSheetViewEvent.ConfirmClicked.INSTANCE;
        BlockerActionConfirmSheetViewEvent.GoBackClicked goBackClicked = BlockerActionConfirmSheetViewEvent.GoBackClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(AtmPickerAmountBlockerViewEvent.Dismiss.INSTANCE);
                break;
            case 1:
                function1.invoke(backClicked);
                break;
            case 2:
                function1.invoke(backClicked);
                break;
            case 3:
                function1.invoke(StablecoinOnboardingViewEvent.CallToActionClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(BitcoinTransferViewEvent.Submit.INSTANCE);
                break;
            case 5:
                function1.invoke(closeClicked);
                break;
            case 6:
                function1.invoke(closeClicked);
                break;
            case 7:
                function1.invoke(BitcoinInstrumentRecommendationViewEvent.PrimaryButtonClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(BitcoinInstrumentRecommendationViewEvent.SecondaryButtonClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(BitcoinFeatureUnavailableViewEvent$DoneClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(BlockerActionConfirmDialogViewEvent.Confirm.INSTANCE);
                break;
            case 11:
                function1.invoke(BlockerActionConfirmDialogViewEvent.Cancel.INSTANCE);
                break;
            case 12:
                function1.invoke(confirmClicked);
                break;
            case 13:
                function1.invoke(goBackClicked);
                break;
            case 14:
                function1.invoke(BlockerActionConfirmSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 15:
                function1.invoke(BlockerActionConfirmSheetViewEvent.SuccessAnimationComplete.INSTANCE);
                break;
            case 16:
                function1.invoke(confirmClicked);
                break;
            case 17:
                function1.invoke(goBackClicked);
                break;
            case 18:
                function1.invoke(confirmClicked);
                break;
            case 19:
                function1.invoke(goBackClicked);
                break;
            case 20:
                function1.invoke(BlockerActionDialogActionViewEvent.PrimaryButton.INSTANCE);
                break;
            case 21:
                function1.invoke(BlockerActionDialogActionViewEvent.SecondaryButton.INSTANCE);
                break;
            case 22:
                function1.invoke(FilesetUploadErrorViewEvent.Retry.INSTANCE);
                break;
            case 23:
                function1.invoke(FilesetUploadErrorViewEvent.Cancel.INSTANCE);
                break;
            case 24:
                function1.invoke(FilesetUploadLoadingViewEvent$Cancel.INSTANCE);
                break;
            case 25:
                function1.invoke(goBack);
                break;
            case 26:
                function1.invoke(goBack);
                break;
            case 27:
                function1.invoke(FilesetUploadViewEvent.SecondaryButtonClick.INSTANCE);
                break;
            case 28:
                function1.invoke(FilesetUploadViewEvent.PrimaryButtonClick.INSTANCE);
                break;
            default:
                function1.invoke(FilesetUploadViewEvent.AttachFileClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
