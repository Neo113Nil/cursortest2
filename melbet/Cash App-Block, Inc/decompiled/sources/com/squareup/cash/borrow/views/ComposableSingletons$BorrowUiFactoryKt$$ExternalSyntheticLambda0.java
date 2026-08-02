package com.squareup.cash.borrow.views;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.map.BitcoinClusterItem;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewModel;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetPinViewModel;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.blockers.viewmodels.WelcomeViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.CalendarDatePickerKt;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.blockers.views.WelcomeViewKt;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowMultiStepLoadingViewModel;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.card.onboarding.CardPreviewViewKt;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.common.CurrencyCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.$r8$classId) {
            case 0:
                BorrowHomeViewModel borrowHomeViewModel = (BorrowHomeViewModel) obj;
                Function1 function1 = (Function1) obj2;
                int intValue = ((Integer) obj4).intValue();
                borrowHomeViewModel.getClass();
                function1.getClass();
                BorrowHomeKt.BorrowHome(borrowHomeViewModel, function1, null, null, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 1:
                BitcoinClusterItem bitcoinClusterItem = (BitcoinClusterItem) obj;
                ((Boolean) obj2).booleanValue();
                Composer composer = (Composer) obj3;
                ((Integer) obj4).intValue();
                bitcoinClusterItem.getClass();
                Boolean bool = bitcoinClusterItem.location.bitcoinSellerLocation.is_square_seller;
                BitcoinMapViewKt.BitcoinLocationMarker(bool != null ? bool.booleanValue() : false, composer, 0);
                break;
            case 2:
                ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                break;
            case 3:
                SetPinViewModel setPinViewModel = (SetPinViewModel) obj;
                Function1 function12 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                function12.getClass();
                if (setPinViewModel != null) {
                    SsnViewKt.SetPin(setPinViewModel, function12, null, composer2, intValue2 & 112);
                }
                break;
            case 4:
                Composer composer3 = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, (Function1) obj2);
                GapComposer gapComposer = (GapComposer) composer3;
                if (gapComposer.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    SsnViewKt.ClientScenarioLauncherUi(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 5:
                SsnViewModel ssnViewModel = (SsnViewModel) obj;
                Function1 function13 = (Function1) obj2;
                Composer composer4 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                function13.getClass();
                if (ssnViewModel != null) {
                    SsnViewKt.SsnContent(ssnViewModel, function13, null, composer4, intValue3 & 112);
                }
                break;
            case 6:
                Function1 function14 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                int m2 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function14);
                if ((m2 & 48) == 0) {
                    m2 |= ((GapComposer) composer5).changedInstance(function14) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer5;
                if (gapComposer2.shouldExecute(m2 & 1, (m2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    SsnViewKt.GetFlowLoading(function14, gapComposer2, (m2 >> 3) & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 7:
                WelcomeViewModel welcomeViewModel = (WelcomeViewModel) obj;
                Function1 function15 = (Function1) obj2;
                Composer composer6 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                function15.getClass();
                if (welcomeViewModel != null) {
                    WelcomeViewKt.Welcome(null, welcomeViewModel, function15, composer6, (intValue4 << 3) & 896);
                    break;
                } else {
                    break;
                }
            case 8:
                AtmPickerAmountBlockerViewModel atmPickerAmountBlockerViewModel = (AtmPickerAmountBlockerViewModel) obj;
                Function1 function16 = (Function1) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                atmPickerAmountBlockerViewModel.getClass();
                function16.getClass();
                AmountBlockerViewKt.AtmPickerAmountBlocker(atmPickerAmountBlockerViewModel, function16, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 9:
                CalendarBlockerViewModel calendarBlockerViewModel = (CalendarBlockerViewModel) obj;
                Function1 function17 = (Function1) obj2;
                Composer composer7 = (Composer) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                calendarBlockerViewModel.getClass();
                function17.getClass();
                if ((intValue6 & 6) == 0) {
                    i = (((GapComposer) composer7).changed(calendarBlockerViewModel) ? 4 : 2) | intValue6;
                } else {
                    i = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i |= ((GapComposer) composer7).changedInstance(function17) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer7;
                if (gapComposer3.shouldExecute(i & 1, (i & 147) != 146)) {
                    CalendarDatePickerKt.CalendarDatePicker(calendarBlockerViewModel, function17, gapComposer3, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 10:
                AuthorizeGooglePayViewModel authorizeGooglePayViewModel = (AuthorizeGooglePayViewModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                authorizeGooglePayViewModel.getClass();
                function18.getClass();
                AmountBlockerViewKt.AuthorizeGooglePayView(authorizeGooglePayViewModel, function18, (Composer) obj3, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 11:
                RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel = (RequestPushNotificationsBlockerViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                requestPushNotificationsBlockerViewModel.getClass();
                function19.getClass();
                SsnViewKt.RequestPushNotificationsBlockerContent(requestPushNotificationsBlockerViewModel, function19, (Composer) obj3, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 12:
                Composer composer8 = (Composer) obj3;
                int m3 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, (Function1) obj2);
                GapComposer gapComposer4 = (GapComposer) composer8;
                if (gapComposer4.shouldExecute(m3 & 1, (m3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, AmountBlockerViewKt.f287lambda$1952757406, gapComposer4, 3072, 7);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 13:
                CashtagViewModel cashtagViewModel = (CashtagViewModel) obj;
                Function1 function110 = (Function1) obj2;
                Composer composer9 = (Composer) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                function110.getClass();
                if (cashtagViewModel != null) {
                    SsnViewKt.Cashtag(cashtagViewModel, function110, null, composer9, intValue9 & 112);
                }
                break;
            case 14:
                PasscodeViewModel passcodeViewModel = (PasscodeViewModel) obj;
                Function1 function111 = (Function1) obj2;
                Composer composer10 = (Composer) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                function111.getClass();
                if (passcodeViewModel != null) {
                    SsnViewKt.Passcode(passcodeViewModel, function111, null, composer10, intValue10 & 112);
                }
                break;
            case 15:
                SetNameViewModel setNameViewModel = (SetNameViewModel) obj;
                Function1 function112 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                setNameViewModel.getClass();
                function112.getClass();
                SsnViewKt.SetName(setNameViewModel, function112, null, (Composer) obj3, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 16:
                ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((Unit) obj2).getClass();
                break;
            case 17:
                ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((Unit) obj2).getClass();
                break;
            case 18:
                Function1 function113 = (Function1) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                function113.getClass();
                BorrowHomeKt.BorrowAmountPicker((BorrowAmountPickerViewModel) obj, function113, (Composer) obj3, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 19:
                BorrowHomeOverlayViewModel borrowHomeOverlayViewModel = (BorrowHomeOverlayViewModel) obj;
                Function1 function114 = (Function1) obj2;
                Composer composer11 = (Composer) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                borrowHomeOverlayViewModel.getClass();
                function114.getClass();
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(570082507, new BorrowHomeOverlayKt$BorrowHomeOverlay$1(objArr2 == true ? 1 : 0, function114), composer11);
                int i2 = (intValue13 & 112) | (intValue13 & 14) | MLKEMEngine.KyberPolyBytes;
                if (!(borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.BulletinInfo)) {
                    if (!(borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.RepaymentSheet)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        obj5 = BorrowHomeOverlayEvent.RepaymentSheetEvent.Dismiss.INSTANCE;
                    }
                } else {
                    obj5 = BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.Dismiss.INSTANCE;
                }
                CardModelView$1$3$4$2 cardModelView$1$3$4$2 = new CardModelView$1$3$4$2(10, obj5, function114);
                GapComposer gapComposer5 = (GapComposer) composer11;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1927029819, new BorrowHomeOverlayKt$Overlay$contentWithLocals$1(objArr == true ? 1 : 0, new CompositionLocalContext(gapComposer5.buildContext().getCompositionLocalScope$runtime()), rememberComposableLambda), composer11);
                if (borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.InfoModal) {
                    gapComposer5.startReplaceGroup(1970150297);
                    ArcadeModal2Kt.Modal(borrowHomeOverlayViewModel, borrowHomeOverlayViewModel, cardModelView$1$3$4$2, cardModelView$1$3$4$2, false, false, rememberComposableLambda2, gapComposer5, (i2 & 14) | 1572864 | ((i2 << 3) & 112), 48);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(1970322781);
                    ComposeBottomSheetKt.BottomSheet(borrowHomeOverlayViewModel, borrowHomeOverlayViewModel, cardModelView$1$3$4$2, false, false, 0, null, Navigation.ArcadeBottomSheetStyle(gapComposer5), rememberComposableLambda2, gapComposer5, (i2 & 14) | 100663296 | ((i2 << 3) & 112) | 16777216, 120);
                    gapComposer5.end(false);
                }
                break;
            case 20:
                BorrowLimitHubViewModel borrowLimitHubViewModel = (BorrowLimitHubViewModel) obj;
                Function1 function115 = (Function1) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                borrowLimitHubViewModel.getClass();
                function115.getClass();
                BorrowHomeKt.BorrowLimitHub(borrowLimitHubViewModel, function115, null, (Composer) obj3, intValue14 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 21:
                ExpandedLoanHistoryListModel expandedLoanHistoryListModel = (ExpandedLoanHistoryListModel) obj;
                Function1 function116 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                expandedLoanHistoryListModel.getClass();
                function116.getClass();
                BorrowHomeKt.ExpandedLoanHistoryList(expandedLoanHistoryListModel, function116, null, (Composer) obj3, intValue15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 22:
                FirstTimeBorrowViewModel firstTimeBorrowViewModel = (FirstTimeBorrowViewModel) obj;
                Function1 function117 = (Function1) obj2;
                int intValue16 = ((Integer) obj4).intValue();
                firstTimeBorrowViewModel.getClass();
                function117.getClass();
                BorrowHomeKt.LoadableFirstTimeBorrow(firstTimeBorrowViewModel, function117, null, null, (Composer) obj3, intValue16 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 23:
                BorrowMultiStepLoadingViewModel borrowMultiStepLoadingViewModel = (BorrowMultiStepLoadingViewModel) obj;
                Function1 function118 = (Function1) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                borrowMultiStepLoadingViewModel.getClass();
                function118.getClass();
                BorrowHomeKt.BorrowMultiStepLoading(borrowMultiStepLoadingViewModel, function118, null, (Composer) obj3, intValue17 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 24:
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                Function1 function119 = (Function1) obj2;
                int intValue18 = ((Integer) obj4).intValue();
                amountPickerViewModel.getClass();
                function119.getClass();
                TickersAmountCaptionKt.FullscreenAmountPicker(amountPickerViewModel, new AmountConfig.MoneyConfig(CurrencyCode.USD, null, false, 0, 14), function119, null, null, (Composer) obj3, (intValue18 & 14) | 64 | ((intValue18 << 3) & 896), 24);
                break;
            case 25:
                CardStudioViewModelV2 cardStudioViewModelV2 = (CardStudioViewModelV2) obj;
                Function1 function120 = (Function1) obj2;
                int intValue19 = ((Integer) obj4).intValue();
                cardStudioViewModelV2.getClass();
                function120.getClass();
                CardStudioViewV2Kt.CardStudioViewV2(cardStudioViewModelV2, function120, (Composer) obj3, intValue19 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 26:
                StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) obj;
                Function1 function121 = (Function1) obj2;
                int intValue20 = ((Integer) obj4).intValue();
                stampSheetViewModel.getClass();
                function121.getClass();
                CanvasKt.StampSheetV2(stampSheetViewModel, function121, (Composer) obj3, intValue20 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 27:
                CardStudioMoreSheetViewModel cardStudioMoreSheetViewModel = (CardStudioMoreSheetViewModel) obj;
                Function1 function122 = (Function1) obj2;
                int intValue21 = ((Integer) obj4).intValue();
                cardStudioMoreSheetViewModel.getClass();
                function122.getClass();
                CanvasKt.CardStudioMoreSheetV2(cardStudioMoreSheetViewModel, function122, (Composer) obj3, intValue21 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 28:
                CardPreviewViewModel cardPreviewViewModel = (CardPreviewViewModel) obj;
                Function1 function123 = (Function1) obj2;
                int intValue22 = ((Integer) obj4).intValue();
                cardPreviewViewModel.getClass();
                function123.getClass();
                GapComposer gapComposer6 = (GapComposer) ((Composer) obj3);
                Object rememberedValue = gapComposer6.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TextureViewFpsTracker();
                    gapComposer6.updateRememberedValue(rememberedValue);
                }
                CardPreviewViewKt.CardPreview(null, cardPreviewViewModel, function123, (TextureViewFpsTracker) rememberedValue, gapComposer6, ((intValue22 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION) | 4096);
                break;
            default:
                CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj;
                Function1 function124 = (Function1) obj2;
                int intValue23 = ((Integer) obj4).intValue();
                cardStylePickerViewModel.getClass();
                function124.getClass();
                CanvasKt.CardStylePicker(cardStylePickerViewModel, function124, null, (Composer) obj3, intValue23 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
