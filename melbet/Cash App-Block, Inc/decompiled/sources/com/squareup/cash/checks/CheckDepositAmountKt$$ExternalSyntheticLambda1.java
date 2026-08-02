package com.squareup.cash.checks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewModel;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.SelectionViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.CalendarDatePickerKt;
import com.squareup.cash.blockers.views.SelectionViewKt;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.card.onboarding.DisclosureSection;
import com.squareup.cash.card.onboarding.MarkdownTextSection;
import com.squareup.cash.card.onboarding.PaymentDeviceAvailabilityStyleKt;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewModel;
import com.squareup.cash.cashapplite.viewmodels.AddMoneyRowId;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapplite.views.ActivityAppletTile;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.common.composeui.animations.HypeCountdownAnimationKt;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt;
import com.squareup.cash.filepicker.RealFilePicker;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final /* synthetic */ class CheckDepositAmountKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda1(LiteCashInViewModel.Loaded loaded, Function1 function1, int i) {
        this.$r8$classId = 23;
        this.f$0 = loaded;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                CheckDepositAmountKt.CheckDepositAmount((CheckDepositAmountViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((EndAppLockPresenter) obj4).m1348models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AmountBlockerViewKt.KeypadPicker((AtmPickerAmountBlockerViewModel.KeypadPicker) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                AmountBlockerViewKt.AuthorizeGooglePayView((AuthorizeGooglePayViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                CalendarDatePickerKt.CalendarDatePicker((CalendarBlockerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                SsnViewKt.GpsBlocker((GpsLocationConsentBlockerViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                SsnViewKt.RequestPushNotificationsBlockerContent((RequestPushNotificationsBlockerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                SelectionViewKt.HeaderSection((SelectionViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                BorrowHomeKt.BorrowAmountPicker((BorrowAmountPickerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                BorrowHomeKt.Header((FirstTimeBorrowViewModel.Content) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                BugReportingViewKt.AddMoreSection((RealFilePicker) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                BugReportingViewKt.ScreenshotRow((Screenshot) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                CanvasKt.CardStudioMoreSheetV2((CardStudioMoreSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                CardStudioViewV2Kt.CardStudioViewV2((CardStudioViewModelV2) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                CanvasKt.MoodHeatEffect((Modifier) obj4, (HeatRenderer) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                PaymentDeviceAvailabilityStyleKt.CardOverlayContent((PaymentDeviceItemViewModel) obj4, (ZoomLevel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                HeroSectionKt.DisclosureSection((DisclosureSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                HeroSectionKt.MarkdownTextSection((MarkdownTextSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                zzaho.BarChart((StackedBarChartViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((ActivityAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                KycAppletTileKt.AddMoneyRowItem((AddMoneyRowId) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                KycAppletTileKt.BalanceHeader((LiteBalanceHomeViewModel) obj4, (ScreenScaffoldContentScope) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                KycAppletTileKt.LiteCashInLoaded((LiteCashInViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                CheckDepositAmountKt.ConfirmBackOfCheck((ConfirmBackOfCheckViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                CheckDepositAmountKt.ConfirmFrontOfCheck((ConfirmFrontOfCheckViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                CheckDepositAmountKt.VerifyCheckDeposit((VerifyCheckDepositViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                CollapsingToolbarKt.CollapsingToolbar((CollapsingToolbarState) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                HypeCountdownAnimationKt.DateText((LocalDate) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                BitcoinP2pConversionPercentageViewKt.ContentScreen((BitcoinP2pConversionPercentageViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda1(CollapsingToolbarState collapsingToolbarState, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 27;
        this.f$0 = collapsingToolbarState;
        this.f$1 = composableLambdaImpl;
        this.f$2 = i;
    }

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
