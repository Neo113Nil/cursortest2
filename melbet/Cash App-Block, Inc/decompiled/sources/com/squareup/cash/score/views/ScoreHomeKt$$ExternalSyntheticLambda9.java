package com.squareup.cash.score.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import coil3.RealImageLoader;
import com.squareup.cash.account.settings.viewmodels.ConfirmReplaceInfoViewModel;
import com.squareup.cash.account.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.PoolsListViewModel;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.StartPoolAmountKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Success;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.ProfileUiViewKt;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.profile.views.notifications.EnableAliasSheetViewKt;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt;
import com.squareup.cash.qrcodes.views.CameraXPreviewManager;
import com.squareup.cash.qrcodes.views.CameraXPreviewState;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.applets.views.SavingsAppletTile;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.securityhub.viewmodels.BookletViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.cash.securityhub.viewmodels.SecurityHubUiModel;
import com.squareup.cash.securityhub.views.BookletViewKt;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt;
import com.squareup.cash.securityhub.views.SecurityHubViewKt;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import com.squareup.lending.CashCreditScoreHomeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScoreHomeKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda9(Function1 function1, PoolMemberListViewModel poolMemberListViewModel, RealImageLoader realImageLoader, int i) {
        this.$r8$classId = 3;
        this.f$1 = function1;
        this.f$0 = poolMemberListViewModel;
        this.f$2 = realImageLoader;
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
                CalloutKt.DisclaimerSection((CashCreditScoreHomeData.DisclaimerSection) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolContributeComposer((PoolContributeWithNoteViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolInvitePeopleList((Function1) obj4, (Modifier) obj3, (PoolInvitePeopleListViewModel.Loaded) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolMemberListView((Function1) obj4, (PoolMemberListViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolsListView((PoolsListViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                StartPoolAmountKt.StartPoolComposer((StartPoolViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                LocaleToggleKt.PrepurchaseCashCardPlanningSheetView((PrepurchaseCashCardPlanningViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.ConfirmRemoveDevicesContent((DeviceManagerConfirmRemoveDevicesScreen) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.ImagePlaceholder((Modifier) obj3, (String) obj5, (Icons) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.DeviceManagerRemovedSuccessFullScreen((DeviceManagerRemovedSuccessViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.DeviceRemovalFailedFullView((DeviceRemovalFailedViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                BadgeNameKt.ConfirmReplaceInfo((Modifier) obj3, (ConfirmReplaceInfoViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                BadgeNameKt.SignOutDialog((ProfileConfirmSignOutViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                BadgeNameKt.ErrorDialog((ErrorViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                BadgeNameKt.SuccessView((Function1) obj4, (Modifier) obj3, (GenericProfileElementsViewModel$Success) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ProfileUiViewKt.ProfilePhotoOverlay((Modifier) obj3, (ProfileViewModel.Loaded.ProfilePhoto) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ChannelListViewKt.EmailContactAlias((Modifier) obj3, (Function1) obj4, (ContactMethodType) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                EnableAliasSheetViewKt.EnableAlias((Modifier) obj3, (Function1) obj4, (EnableAliasSheetViewModel) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                WebSectionKt.SecurityLockSectionView(updateChangedFlags, (Composer) obj, (Modifier) obj3, (ProfilePasscodeSectionViewModel) obj5, (Function1) obj4);
                break;
            case 19:
                ((Integer) obj2).getClass();
                PromotionsTitleBarKt.PromotionsReferralsHomeView((PromotionsReferralsHomeViewModel) obj5, (RealImageLoader) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((CameraXPreviewManager) obj5).HandleState((CameraXPreviewState) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                SelectPaymentPlanViewKt.SummarySection((SelectPaymentPlanViewModel.SummarySection) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((SavingsAppletTile) obj5).UI((SavingsAppletTileViewModel) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ButtonGroupKt.FolderRow((SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder) obj5, (Modifier) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                SavingsScreenViewKt.SavingsScreenView((SavingsScreenViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                BookletViewKt.BookletView((BookletViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                RecoveryGuideViewKt.RecoveryGuideView((RecoveryGuideViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                SecurityHubViewKt.SecurityHubView((SecurityHubUiModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((ProductSearchPresenter) obj5).ProductSearchEffect((ProductSearchPresenter.State) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ErrorDialogKt.ErrorDialog((com.squareup.cash.shopping.settings.viewmodels.ErrorViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda9(Modifier modifier, Function1 function1, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$1 = function1;
        this.f$0 = obj;
        this.f$3 = i;
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda9(Function1 function1, Modifier modifier, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$3 = i;
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda9(int i, int i2, Modifier modifier, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = i;
    }
}
