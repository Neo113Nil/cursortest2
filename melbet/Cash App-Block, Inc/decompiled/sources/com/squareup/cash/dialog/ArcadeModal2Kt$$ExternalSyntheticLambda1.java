package com.squareup.cash.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.gms.auth.api.identity.Identity;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.view.address.AddressSearchKt;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawlInfoArcadeKt;
import com.squareup.cash.deposits.physical.view.map.LimitReachedModalArcadeKt;
import com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryViewModel;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmWithdrawalMapViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupViewModel;
import com.squareup.cash.directdeposit.views.DirectDepositDialogKt;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.earnings.viewmodels.EarningsActivityListViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel$DistributionsSection$NullState;
import com.squareup.cash.earnings.views.home.EarningsHomeKt;
import com.squareup.cash.earnings.views.home.EarningsToolsSectionKt;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentNotificationsSectionModel;
import com.squareup.cash.family.familyhub.viewmodels.P2PControlListViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewModel;
import com.squareup.cash.work.applets.views.WorkAppletTile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal2Kt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda1(P2PControlListViewModel p2PControlListViewModel, Function0 function0, int i) {
        this.$r8$classId = 28;
        this.f$1 = p2PControlListViewModel;
        this.f$0 = function0;
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
                ArcadeModal2Kt.ArcadeModal2((Function0) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                AddressSearchKt.AddressSearch((PhysicalDepositAddressEntryViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                Logging.PaperMoneyDepositErrorModal((PhysicalDepositErrorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                Identity.LocationDeniedModal((LocationDeniedScreen) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AtmPmdExplainerViewKt.AtmPmdExplainerView((AtmPmdExplainerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AtmWithdrawalMapViewArcadeKt.AtmWithdrawalMapArcade((AtmWithdrawalMapViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                AtmWithdrawlInfoArcadeKt.AtmWithdrawalInfoArcade((AtmExplainerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                LimitReachedModalArcadeKt.LimitReachedModalArcade((LimitReachedDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                PaperMoneyDepositMapViewKt.PaperMoneyDepositMap((PaperMoneyDepositMapViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                ArcadeModal2Kt.AlertDialog((AlertDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                DirectDepositDialogKt.DirectDepositHome((DirectDepositSetupViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                DirectDepositFormErrorKt.DirectDepositManualFormCompletion((DirectDepositManualFormCompletionViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                EarningsHomeKt.EarningsActivityListContent((EarningsActivityListViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                EarningsHomeKt.DisclosureFooter((EarningsHomeViewModel.Loaded.DisclosureFooter) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                EarningsHomeKt.DistributionsNullStateSection((EarningsHomeViewModel$DistributionsSection$NullState) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                EarningsToolsSectionKt.EarningsToolsSection((EarningsHomeViewModel.SectionContent.EarningTools) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((NetEarningsInfoSheetPresenter) obj4).m3524models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                NetEarningsInfoSheetViewKt.EarningsTimeframeSelectorSheetView((EarningsTimeframeSelectorSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                FamilyAppletTileKt.UninstalledUI((AllowanceAppletTileViewModel.Uninstalled) obj4, (ScoreAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                FamilyAppletTileKt.LoadingUI((AllowanceAppletTileViewModel.Loading) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((WorkAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((CardStudioPresenter) obj4).m3429models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                AllowanceViewKt.AllowanceView((AllowanceViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                AllowanceViewKt.ControlErrorDialog((ControlErrorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                AllowanceViewKt.NotificationControlsItem((DependentNotificationsSectionModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                AllowanceViewKt.P2PControlRow((P2PControlListViewModel) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AllowanceViewKt.DependentDetailSettingsSection((DependentAccessControlsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
