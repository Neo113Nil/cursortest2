package com.squareup.cash.dialog;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.DpSize;
import app.cash.broadway.ui.compose.UiScope;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewModel;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.viewmodels.WelcomeViewModel;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.blockers.views.WelcomeViewKt;
import com.squareup.cash.blockers.views.components.VerifyAliasViewKt;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowMultiStepLoadingViewModel;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.charting.components.ChartConfig;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.checks.CaptureCheckFaceKt;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.deposits.physical.view.address.AddressSearchKt;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewModel;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal2Kt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda3(SsnViewModel ssnViewModel, Function1 function1, FocusRequester focusRequester, int i) {
        this.$r8$classId = 2;
        this.f$0 = ssnViewModel;
        this.f$1 = function1;
        this.f$2 = focusRequester;
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
                ((Integer) obj2).intValue();
                ArcadeModal2Kt.ArcadeModal2((UiScope) obj5, (Function0) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                SsnViewKt.SsnContent((SsnViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                SsnViewKt.Ssn((SsnViewModel) obj5, (Function1) obj4, (FocusRequester) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                WelcomeViewKt.Welcome((Modifier) obj5, (WelcomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                VerifyAliasViewKt.InviteFriends((InviteFriendsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                VerifyAliasViewKt.VerifyAlias((Modifier) obj5, (Function1) obj4, (VerifyAliasModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj5).UI((BorrowAppletTileModel) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                BorrowHomeKt.BorrowLimitHub((BorrowLimitHubViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                BorrowHomeKt.BorrowMultiStepLoading((BorrowMultiStepLoadingViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                BorrowHomeKt.BulletinTile((BorrowHomeViewModel.Tile.BulletinTileModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                BorrowHomeKt.ExpandedLoanHistoryList((ExpandedLoanHistoryListModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                BorrowHomeKt.Bullets((FirstTimeBorrowViewModel.Content.Bullets) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                BorrowHomeKt.Notice((FirstTimeBorrowViewModel.Content.Notice) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                BorrowHomeKt.LoanHistoryTileRow((BorrowAppletLoanHistoryTile.Data.Loan) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$3);
                break;
            case 14:
                ((Integer) obj2).getClass();
                BorrowHomeKt.LoanHistoryTile((BorrowHomeViewModel.Tile.LoanHistoryTileModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                CanvasKt.CardStylePicker((CardStylePickerViewModel) obj5, (Function1) obj4, (LazyListState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                zzaho.SpendingInsightDetailContent((SpendingInsightDetailViewModel.Content) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                RecipientMapper.ArcadeSpendingInsightsContent((SpendingInsightsHomeViewModel.Content) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                RecipientMapper.InsightsSection((SpendingInsightsHomeViewModel.Content.InsightsSection) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                KycAppletTileKt.LiteCashInView((LiteCashInViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                UnlinkResultViewKt.CashAppPaySettings((CashAppPaySettingsViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                UnlinkResultViewKt.LinkedBusinessDetailSheet((LinkedBusinessDetailsViewModel) obj5, (RealImageLoader) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                SegmentedBarChartKt.ChartLabels((List) obj5, (ChartConfig) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                CaptureCheckFaceKt.CaptureCheckFace((CaptureCheckFaceViewModel) obj5, (Function1) obj4, (RealCashVibrator) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                VisibleKt.HintCarousel((Modifier) obj5, (String) obj4, (ImmutableList) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$3);
                break;
            case 25:
                ((Integer) obj2).getClass();
                VisibleKt.m3494InfoUpsellImage5H3ToQM((Painter) obj5, (Modifier) obj4, (DpSize) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                AddressSearchKt.AddressSearchBar((String) obj5, (SearchBarKeyboardState) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                DirectDepositFormErrorKt.DirectDepositEditPaycheckAllocation((DirectDepositEditPaycheckAmountViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                DirectDepositFormErrorKt.DirectDepositManualFormDetails((DirectDepositManualFormDetailsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                DirectDepositFormErrorKt.DirectDepositSingleInput((DirectDepositSingleInputViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i2;
    }
}
