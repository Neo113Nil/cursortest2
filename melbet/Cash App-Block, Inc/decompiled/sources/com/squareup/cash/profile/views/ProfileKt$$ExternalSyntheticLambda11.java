package com.squareup.cash.profile.views;

import androidx.biometric.AuthenticatorUtils;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.credentials.Credential;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$CashMeSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$AuthenticatorViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewEvent;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewEvent;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewEvent;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel$ActionRow$AddTrustedContactRow;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel$ActionRow$OpenTrustedContactRow;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.favorites.viewmodels.AddOrRemoveAsFavoriteButtonViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMessagingNotificationSettingsSam;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoItemArticle;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.StablecoinWithdrawalOptionRow;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.pools.viewmodels.PoolRow;
import com.squareup.cash.pools.viewmodels.PoolsListViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewEvent;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceViewModel;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.CategoryGroupSectionViewModel;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.profile.viewmodels.ContactMethodSectionViewEvent;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.viewmodels.NotificationPageHeaderViewModel;
import com.squareup.cash.profile.viewmodels.OpenSourceViewEvent;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.recurringpayments.viewmodels.CadenceOption;
import com.squareup.cash.recurringpayments.viewmodels.SelectCadenceViewEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.Avatar;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class ProfileKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda11(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.squareup.protos.cash.janus.syncvalues.FullAccount] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.$r8$classId;
        PrepurchaseCashCardPlanningViewModel.ButtonAction.Dismiss dismiss = PrepurchaseCashCardPlanningViewModel.ButtonAction.Dismiss.INSTANCE;
        FullAccount fullAccount = 0;
        Object obj2 = null;
        fullAccount = 0;
        fullAccount = 0;
        boolean z = true;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                AddOrRemoveAsFavoriteButtonViewModel addOrRemoveAsFavoriteButtonViewModel = ((ProfileViewModel.Loaded.ProfileHeader.FavoriteAction) obj3).addOrRemoveAsFavoriteButtonViewModel;
                ((Function1) obj4).invoke(new ProfileViewEvent.GenericProfileElementsViewEventWrapper(new GenericProfileElementsViewEvent.AddOrRemoveAsFavoriteClicked(addOrRemoveAsFavoriteButtonViewModel.customerId, addOrRemoveAsFavoriteButtonViewModel.name, addOrRemoveAsFavoriteButtonViewModel.accentColor, addOrRemoveAsFavoriteButtonViewModel.photo, addOrRemoveAsFavoriteButtonViewModel.monogram)));
                return Unit.INSTANCE;
            case 1:
                ((Function1) obj4).invoke(((StablecoinWithdrawalOptionRow) obj3).option);
                return Unit.INSTANCE;
            case 2:
                JobKt.launch$default((CoroutineScope) obj4, null, null, new MusicPresenter$models$3$1((CoreFlowBasicShieetScope) obj3, fullAccount, 21), 3);
                return Unit.INSTANCE;
            case 3:
                ((Function1) obj4).invoke(new NearbyPayRequestViewEvent.OnPersonClicked((NearbyPerson) obj3));
                return Unit.INSTANCE;
            case 4:
                ((Function1) obj4).invoke(new NearbyPaymentsInfoViewEvent.OnNavigationItemClicked(((NearbyPaymentsInfoItemArticle) obj3).f1186type));
                return Unit.INSTANCE;
            case 5:
                Element element = (Element) obj3;
                Function1 function1 = (Function1) obj4;
                if (element instanceof Text) {
                    function1.invoke(new PersonalizePaymentViewEvent.RequestFocus(element, true));
                }
                return Unit.INSTANCE;
            case 6:
                return ((RealRouter$Factory$Impl) obj4).create$1((BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj3).navigator);
            case 7:
                LazyListState lazyListState = (LazyListState) obj4;
                Integer num = (Integer) ((MutableState) obj3).getValue();
                if (num == null || (lazyListState.scrollPosition.index$delegate.getIntValue() <= 0 && lazyListState.scrollPosition.scrollOffset$delegate.getIntValue() < num.intValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                ((Function1) obj4).invoke(new PoolsListViewEvent.TapOnPool(((PoolRow) obj3).poolToken));
                return Unit.INSTANCE;
            case 9:
                ((Function1) obj4).invoke((HistoricalRange) obj3);
                return Unit.INSTANCE;
            case 10:
                ((Function1) obj4).invoke(new PrepurchaseCashCardPlanningViewEvent.TapButton(((PrepurchaseCashCardPlanningViewModel.LoadableButton.Loaded) ((PrepurchaseCashCardPlanningViewModel.LoadableButton) obj3)).action));
                return Unit.INSTANCE;
            case 11:
                ((Function1) obj4).invoke(new PrepurchaseCashCardPlanningViewEvent.TapInfoRow((Credential) obj3));
                return Unit.INSTANCE;
            case 12:
                ((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet) obj3).getClass();
                ((Function1) obj4).invoke(new PrepurchaseCashCardPlanningViewEvent.TapButton(dismiss));
                return Unit.INSTANCE;
            case 13:
                ((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet) obj3).getClass();
                ((Function1) obj4).invoke(new PrepurchaseCashCardPlanningViewEvent.TapButton(dismiss));
                return Unit.INSTANCE;
            case 14:
                ((DeviceManagerListViewModel.DeviceAction) obj3).getClass();
                ((Function1) obj4).invoke(DeviceManagerListViewEvent.RequestRemoveAll.INSTANCE);
                return Unit.INSTANCE;
            case 15:
                ((Function1) obj4).invoke(new DeviceManagerListViewEvent.DeviceSelected(((DeviceViewModel) obj3).appToken));
                return Unit.INSTANCE;
            case 16:
                PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) obj4;
                MutableState mutableState = (MutableState) obj3;
                ProfileScreens.CategoryListScreen categoryListScreen = (ProfileScreens.CategoryListScreen) paymentLoadingPresenter.flowToken;
                if (categoryListScreen.categoryListType == CategoryListType.ACTIVITY) {
                    if (!((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) paymentLoadingPresenter.featureFlagManager)).peekCurrentValue(AmplitudeExperiments$MobileMessagingNotificationSettingsSam.INSTANCE)).disabled()) {
                        AccountholderAccountRepository$LoadAccountsResult accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) mutableState.getValue();
                        if (accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful) {
                            List list = ((AccountholderAccountRepository$LoadAccountsResult.Successful) accountholderAccountRepository$LoadAccountsResult).accounts;
                            if (list.size() <= 1) {
                                list = null;
                            }
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (Intrinsics.areEqual(((FullAccount) next).account_id, categoryListScreen.ownerAccountToken)) {
                                            obj2 = next;
                                        }
                                    }
                                }
                                fullAccount = (FullAccount) obj2;
                            }
                        } else if (!Intrinsics.areEqual(accountholderAccountRepository$LoadAccountsResult, AccountholderAccountRepository$LoadAccountsResult.Failure.INSTANCE) && accountholderAccountRepository$LoadAccountsResult != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (fullAccount != 0) {
                            Avatar avatar = fullAccount.avatar;
                            avatar.getClass();
                            StackedAvatarViewModel.Single viewModel = StackedAvatarViewModelKt.toViewModel(avatar);
                            String str = fullAccount.title;
                            str.getClass();
                            String str2 = fullAccount.cash_tag;
                            str2.getClass();
                            return new NotificationPageHeaderViewModel.AccountHeader(viewModel, str, str2, Intrinsics.areEqual(fullAccount.is_business, Boolean.TRUE));
                        }
                    }
                }
                return NotificationPageHeaderViewModel.EmptyHeader.INSTANCE;
            case 17:
                Function1 function12 = (Function1) obj4;
                String str3 = ((OpenSourceViewModel.ArtifactViewModel) obj3).scmUrl;
                if (str3 != null) {
                    function12.invoke(new OpenSourceViewEvent.OpenUrl(str3));
                }
                return Unit.INSTANCE;
            case 18:
                ((Function1) obj4).invoke(new TaxesPasswordViewEvent.EnablePassword(!((TaxesPasswordViewModel) obj3).enabled));
                return Unit.INSTANCE;
            case 19:
                ((CategoryGroupSectionViewModel) obj4).onClicked.invoke((Category) obj3);
                return Unit.INSTANCE;
            case 20:
                ((Function1) obj4).invoke((Category) obj3);
                return Unit.INSTANCE;
            case 21:
                ((Function1) obj4).invoke(new ChannelListViewEvent.AddAlias(((Channel) obj3).channelType));
                return Unit.INSTANCE;
            case 22:
                ((Function1) obj4).invoke(new ContactMethodSectionViewEvent.ContactMethodClicked((ContactMethodType) obj3));
                return Unit.INSTANCE;
            case 23:
                ((Function1) obj4).invoke(new ContactMethodSectionViewEvent.AddAliasClicked((AliasItem) obj3));
                return Unit.INSTANCE;
            case 24:
                ((Function1) obj4).invoke(new AliasesSectionEvent.NavigationAction.RemoveAlias((ProfileAlias) obj3));
                return Unit.INSTANCE;
            case 25:
                ((Function1) obj4).invoke(new ProfileSecurityViewEvent.ToggleAuthenticator(!((ProfileSecurityReadyViewModel$AuthenticatorViewModel) obj3).isAuthenticatorActive));
                return Unit.INSTANCE;
            case 26:
                Function1 function13 = (Function1) obj4;
                AuthenticatorUtils authenticatorUtils = ((TrustedContactSettingViewModel) obj3).actionRow;
                if (authenticatorUtils instanceof TrustedContactSettingViewModel$ActionRow$AddTrustedContactRow) {
                    obj = TrustedContactSettingViewEvent.AddTrustedContactClicked.INSTANCE;
                } else {
                    if (!(authenticatorUtils instanceof TrustedContactSettingViewModel$ActionRow$OpenTrustedContactRow)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    obj = TrustedContactSettingViewEvent.OpenTrustedContactClicked.INSTANCE;
                }
                function13.invoke(obj);
                return Unit.INSTANCE;
            case 27:
                ((Function1) obj4).invoke(Boolean.valueOf(!((ProfilePrivacyReadyViewModel$CashMeSettingViewModel) obj3).isChecked));
                return Unit.INSTANCE;
            case 28:
                AndroidStringManager androidStringManager = (AndroidStringManager) ((CardLockPresenter) obj4).stringManager;
                ReferralManager$RewardStatus referralManager$RewardStatus = (ReferralManager$RewardStatus) ((MutableState) obj3).getValue();
                if (referralManager$RewardStatus != null) {
                    PromotionsReferralsHomeViewModel.Loaded.PromotionCode promotionCode = referralManager$RewardStatus.code_entry_enabled ? new PromotionsReferralsHomeViewModel.Loaded.PromotionCode(androidStringManager.get(R.string.enter_a_code)) : null;
                    if (promotionCode != null) {
                        return promotionCode;
                    }
                }
                return new PromotionsReferralsHomeViewModel.Loaded.PromotionCode(androidStringManager.get(R.string.enter_a_code));
            default:
                ((Function1) obj4).invoke(new SelectCadenceViewEvent.SelectCadenceOption(((CadenceOption) obj3).cadenceToken));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda11(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
    }
}
