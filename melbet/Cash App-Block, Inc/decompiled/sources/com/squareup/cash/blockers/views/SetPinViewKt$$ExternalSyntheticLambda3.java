package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.node.HitTestResultKt;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendRestrictionViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.note.BitcoinDepositNoteViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.viewmodels.unavailable.BitcoinFeatureUnavailableViewModel;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.performance.BitcoinPerformanceSummaryViewKt;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellViewKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewModel;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetPinViewModel;
import com.squareup.cash.blockers.viewmodels.SignatureViewModel;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class SetPinViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda3(Modifier modifier, Function1 function1, BitcoinStoriesWidgetViewModel bitcoinStoriesWidgetViewModel, int i) {
        this.$r8$classId = 2;
        this.f$2 = modifier;
        this.f$1 = function1;
        this.f$0 = bitcoinStoriesWidgetViewModel;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SsnViewKt.SetPin((SetPinViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PointMode.BitcoinRecurringPurchaseTileView((InvestingCryptoRecurringPurchaseTileViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                BitcoinStoriesWidgetViewKt.BitcoinStoriesWidgetView((Modifier) obj3, (Function1) obj4, (BitcoinStoriesWidgetViewModel) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                BitcoinStoriesWidgetViewKt.StoryGrid((Modifier) obj3, (BitcoinStoriesWidgetViewModel.Content) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                BitcoinPerformanceSummaryViewKt.BitcoinPerformanceSummaryLoading((BitcoinPerformanceSummaryViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                BitcoinSendRestrictionViewKt.BitcoinSendRestrictionContent((Modifier) obj3, (BitcoinSendRestrictionViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((BitcoinDepositNoteScreenView) obj5).Form((Modifier) obj3, (FormViewModel) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((BitcoinDepositNoteScreenView) obj5).HandleFormViewEvents((BitcoinDepositNoteViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.BitcoinAddressCopyErrorContent((WalletAddressOptionsViewModel.Error) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.BitcoinAddressCopyContent((WalletAddressOptionsViewModel.Content) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.BitcoinDepositCopyContent((BitcoinDepositCopyViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.AddressCopyContent((BitcoinDepositCopyViewModel.Loaded) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj3;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(743403227, new CheckmarkPresenter$$ExternalSyntheticLambda0(bitcoinTransferViewModel, function1, i2, 8), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                BitcoinMapViewKt.BitcoinMapErrorDialog((BitcoinMapErrorViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                BitcoinMapViewKt.BitcoinMapView((BitcoinMapViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                PainInBitcoinUpsellViewKt.PaidInBitcoinLanding((PaidInBitcoinLandingViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                BitcoinPerformanceDetailsViewKt.BitcoinPerformanceDetailsContent((Function1) obj4, (BitcoinPerformanceDetailsViewModel) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.StablecoinOnboardingView((StablecoinOnboardingViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                HitTestResultKt.BitcoinFeatureUnavailableView((BitcoinFeatureUnavailableViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                MeasureScopeWithLayoutNodeKt.BlockerActionConfirmSheet((BlockerActionConfirmSheetViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AmountBlockerViewKt.ArcadeFilesetUploadErrorDialog((FilesetUploadErrorViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                AmountBlockerViewKt.FilesetUpload((FilesetUploadViewModel) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AmountBlockerViewKt.FilesetUploadScreen((FilesetUploadViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                AmountBlockerViewKt.AtmPicker((AtmPickerAmountBlockerViewModel.AtmPicker) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                SsnViewKt.Cashtag((CashtagViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                SsnViewKt.ErrorMessage((Function1) obj4, (OnboardingInternalRouteViewModel) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                SsnViewKt.Passcode((PasscodeViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                SetAddressViewKt.SetAddress((SetAddressViewModel) obj5, (Function1) obj4, (PlacesAddressSearcher) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                SsnViewKt.SetName((SetNameViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SsnViewKt.DrawSignature((SignatureViewModel.Content) obj5, (Function1) obj4, (SignatureState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda3(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda3(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = function1;
        this.f$2 = obj2;
        this.f$3 = i;
    }

    public /* synthetic */ SetPinViewKt$$ExternalSyntheticLambda3(Function1 function1, Object obj, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = function1;
        this.f$0 = obj;
        this.f$2 = modifier;
        this.f$3 = i;
    }
}
