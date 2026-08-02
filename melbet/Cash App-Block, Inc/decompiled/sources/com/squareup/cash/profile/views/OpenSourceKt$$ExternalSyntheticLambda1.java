package com.squareup.cash.profile.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModel;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingViewModel;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewModel;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetHomeKt;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.protos.cash.ui.Image;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final /* synthetic */ class OpenSourceKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda1(int i, int i2, Modifier modifier, Image image) {
        this.$r8$classId = 14;
        this.f$0 = image;
        this.f$2 = i;
        this.f$1 = modifier;
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
                BadgeNameKt.OpenSource((OpenSourceViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ErrorKt.SelectStablecoinWithdrawalOption((PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                NearbyPayRequestViewKt.NearbyPayRequestHelpView((NearbyPayRequestHelpViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((LocalHomePresenter) obj4).m1224models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                PhonePlansHomeViewKt.PhonePlansEsimCheckView((PhonePlansEsimCheckViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                PhonePlansHomeViewKt.InfoCards((Pair) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PhonePlansHomeViewKt.Header((PhonePlansHomeViewModel.Content.Header) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PhonePlansHomeViewKt.InactiveHeader((PhonePlansHomeViewModel.Content.Header.Inactive) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                PhonePlansHomeViewKt.ActiveHeader((PhonePlansHomeViewModel.Content.Header.Active) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                PhonePlansHomeViewKt.PhonePlansHomeContent((PhonePlansHomeViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                PhonePlansHomeViewKt.PhonePlansNewLineLoadingView((PhonePlansNewLineLoadingViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                PhonePlansHomeViewKt.WirelessProviderListContent((WirelessProviderListViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj4).UninstalledUI((PhonePlansAppletTileModel.Uninstalled) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                PoolToastKt.NuxImage((Image) obj4, i2, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                PoolToastKt.PoolMoreOptionsBottomSheetView((Function1) obj3, (PoolMoreOptionsBottomSheetViewModel) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PrepurchasePlanningSheetHomeKt.PrepurchasePlanningSheetHome((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                LocaleToggleKt.PrepurchasePlanningSheetInfo((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                LocaleToggleKt.PrepurchasePlanningSheetSelectPayment((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((TaxReturnsPresenter) obj4).m3767models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((KybBannerPresenter) obj4).m3608models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((InviteErrorPresenter) obj4).m3587models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                BadgeNameKt.CellAction((GenericProfileElementViewModel.ButtonWidget) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                BadgeNameKt.GenericProfilePaymentHistoryWidgetView((GenericProfileElementViewModel.PaymentHistoryWidget) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                WebSectionKt.IdentificationSection((IdentityVerificationSectionViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                WebSectionKt.PersonalizedAdsSectionIneligible((ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Ineligible) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryKt.PaymentPlanSummaryBottomSheetContent((PaymentPlanSummaryViewModel.BottomSheetData) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1), i2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda1(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet prepurchaseCardHomeSheet, Function1 function1, int i) {
        this.$r8$classId = 16;
        this.f$0 = prepurchaseCardHomeSheet;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda1(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet prepurchaseCardInfoSheet, Function1 function1, int i) {
        this.$r8$classId = 17;
        this.f$0 = prepurchaseCardInfoSheet;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda1(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet prepurchaseCardPaymentPlanOptionsSheet, Function1 function1, int i) {
        this.$r8$classId = 18;
        this.f$0 = prepurchaseCardPaymentPlanOptionsSheet;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda1(PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData, Modifier modifier, int i, int i2) {
        this.$r8$classId = 29;
        this.f$0 = bottomSheetData;
        this.f$1 = modifier;
        this.f$2 = i2;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda1(Function1 function1, PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel, int i) {
        this.$r8$classId = 15;
        this.f$1 = function1;
        this.f$0 = poolMoreOptionsBottomSheetViewModel;
        this.f$2 = i;
    }
}
