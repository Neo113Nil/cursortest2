package com.squareup.cash.score.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.room.Room;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzqt;
import com.google.mlkit.vision.common.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.benefits.screens.BankingBenefitsBookletScreen;
import com.squareup.cash.benefits.screens.BenefitDetailScreen;
import com.squareup.cash.benefits.screens.BenefitsExplanationScreen;
import com.squareup.cash.benefits.screens.BenefitsHomeScreen;
import com.squareup.cash.benefits.screens.BenefitsHubScreen;
import com.squareup.cash.benefits.screens.GreenEligibleTransactionsScreen;
import com.squareup.cash.benefits.screens.PdsaBenefitsExplainerScreen;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewModel;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewModel;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositUiFactory;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewModel;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.favorites.screens.FavoriteAdded;
import com.squareup.cash.favorites.screens.FavoritesMessage;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewModel;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewModel;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.screens.FidesmoDeprovisioningScreen;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.screens.TransferOptionPickerScreen;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteContactsReferralRulesViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.screens.InviteReferralsRulesBottomSheet;
import com.squareup.cash.limits.views.LimitsViewFactory;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantInfoFeedbackBottomSheetScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.money.booklet.MoneyTabBookletScreen;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersFilterGroupSheetScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersNotificationScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersRedemptionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreenV2;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.offers.views.redemption.OffersRedemptionSheetView;
import com.squareup.cash.offers.views.sup.OffersNotificationView;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerErrorScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerOptionsMenuScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAliasPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.onboarding.screens.OnboardingLandingScreen;
import com.squareup.cash.p2pblocking.screens.P2PAllowlistScreen;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.paychecks.screens.DistributePaycheckScreen;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.HelpSheetScreen;
import com.squareup.cash.paychecks.screens.PaycheckActivityListScreen;
import com.squareup.cash.paychecks.screens.PaycheckAggregationReceiptScreen;
import com.squareup.cash.paychecks.screens.PaycheckAlertDialogScreen;
import com.squareup.cash.paychecks.screens.PaycheckReceiptScreen;
import com.squareup.cash.paychecks.screens.PaychecksHomeScreen;
import com.squareup.cash.paychecks.screens.PaychecksScreen;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paychecks.views.DistributePaycheckView;
import com.squareup.cash.paychecks.views.HelpSheetView;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.MultipleAllocationView;
import com.squareup.cash.paychecks.views.PaycheckAlertDialog;
import com.squareup.cash.paychecks.views.inject.ComposableSingletons$PaychecksUiFactoryKt;
import com.squareup.cash.paymentpad.views.PaymentPadUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.phoneplans.PhonePlansHomeScreen;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingBlockerScreen;
import com.squareup.cash.phoneplans.WirelessProviderListBlockerScreen;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphSmoother;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.devicemanager.backend.ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$1;
import com.squareup.cash.profile.devicemanager.backend.ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$2;
import com.squareup.cash.profile.devicemanager.backend.ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$3;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedBottomSheetScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedFullScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessBottomSheetScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessFullScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerDeviceDetailsView;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.views.ProfilePhotoUrlProvider;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;
import com.squareup.cash.qrcodes.views.CashQrCodesViewFactory;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.recurring.backend.RecurringPreferencesSyncEntityStorageObserver;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.SavingsActivityItemEventDecorator;
import com.squareup.cash.score.screens.ScoreHomeScreen;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.securityhub.screens.BookletScreen;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.securityhub.views.EducationCardKt;
import com.squareup.cash.shopping.autofill.presenters.RealAutofillNetworkFailureMessageGenerator;
import com.squareup.cash.shopping.sup.backend.SingleWebSessionInMemoryManager;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1;
import com.squareup.cash.storage.StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$3;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.screens.TapToPayErrorScreen;
import com.squareup.cash.taptopay.screens.TapToPayFirstTimeScreen;
import com.squareup.cash.taptopay.screens.TapToPayInitiatorNotesScreen;
import com.squareup.cash.taptopay.screens.TapToPayOnboardingCompleteScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentRequestScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentScreen;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.StandardJsonAdapters$2;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.p2pencoreedge.RecurringPaymentsService;
import com.squareup.util.android.AndroidActivityFinisher;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.internal.Symbol;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class ScoreUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider imageLoader;

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.imageLoader = provider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 18;
            int i3 = 2;
            int i4 = 0;
            Provider provider = this.imageLoader;
            switch (i) {
                case 0:
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    realImageLoader.getClass();
                    return new ScoreUiFactory(realImageLoader, i4);
                case 1:
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider.invoke();
                    realFamilyAccountsManager.getClass();
                    return new Lazy(realFamilyAccountsManager);
                case 2:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    realImageLoader2.getClass();
                    return new ScoreUiFactory(realImageLoader2, 16);
                case 3:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences, "pools_goal_met_animation_seen", new MainActivity$$ExternalSyntheticLambda5(14), new MainActivity$$ExternalSyntheticLambda5(15), new Moneys$$ExternalSyntheticLambda0(i2), 96);
                case 4:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    return TextDrawStyleKt.provideShownFirstPurchase(sharedPreferences2);
                case 5:
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    coroutineContext.getClass();
                    return new RealInvestingGraphSmoother(coroutineContext);
                case 6:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider.invoke();
                    realImageLoader3.getClass();
                    return new ScoreUiFactory(realImageLoader3, 17);
                case 7:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                    sharedPreferences3.getClass();
                    return Room.SerDeKeyValue$default(sharedPreferences3, "device-info-hash", ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$1.INSTANCE, ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$2.INSTANCE, ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$3.INSTANCE, 96);
                case 8:
                    return new Symbol((String) provider.invoke(), 2);
                case 9:
                    Analytics analytics = (Analytics) provider.invoke();
                    analytics.getClass();
                    return new RealDeviceManagerAnalytics(analytics);
                case 10:
                    RealImageLoader realImageLoader4 = (RealImageLoader) provider.invoke();
                    realImageLoader4.getClass();
                    return new ScoreUiFactory(realImageLoader4, i2);
                case 11:
                    AndroidActivityFinisher androidActivityFinisher = (AndroidActivityFinisher) provider.invoke();
                    androidActivityFinisher.getClass();
                    return new KybBannerPresenter(androidActivityFinisher, 5);
                case 12:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    return new ProfilePhotoUrlProvider(cashAccountDatabaseImpl);
                case 13:
                    RealImageLoader realImageLoader5 = (RealImageLoader) provider.invoke();
                    realImageLoader5.getClass();
                    return new ScoreUiFactory(realImageLoader5, 19);
                case 14:
                    SharedPreferences sharedPreferences4 = (SharedPreferences) provider.invoke();
                    sharedPreferences4.getClass();
                    return Room.BooleanKeyValue(sharedPreferences4, "has-seen-qr-shortcuts-onboarding-key", false, false);
                case 15:
                    SharedPreferences sharedPreferences5 = (SharedPreferences) provider.invoke();
                    sharedPreferences5.getClass();
                    return Room.IntKeyValue$default(sharedPreferences5, "qr-shortcuts-onboarding-app-starts-key");
                case 16:
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                    realCashVibrator.getClass();
                    return new CashQrCodesViewFactory(realCashVibrator, i4);
                case 17:
                    AppConfigManager appConfigManager = (AppConfigManager) provider.invoke();
                    appConfigManager.getClass();
                    return new RealSharedReactionState(appConfigManager);
                case 18:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    return new RecurringPreferencesSyncEntityStorageObserver(cashAccountDatabaseImpl2);
                case 19:
                    RecurringPaymentsService recurringPaymentsService = (RecurringPaymentsService) provider.invoke();
                    recurringPaymentsService.getClass();
                    return new RealRecurringPaymentsManager(recurringPaymentsService);
                case 20:
                    Analytics analytics2 = (Analytics) provider.invoke();
                    analytics2.getClass();
                    return new SavingsActivityItemEventDecorator(analytics2);
                case 21:
                    RealImageLoader realImageLoader6 = (RealImageLoader) provider.invoke();
                    realImageLoader6.getClass();
                    return new ScoreUiFactory(realImageLoader6, 20);
                case 22:
                    Analytics analytics3 = (Analytics) provider.invoke();
                    analytics3.getClass();
                    return zzqt.provideShoppingAutofillAnalyticsHandler(analytics3);
                case 23:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                    androidStringManager.getClass();
                    return new RealAutofillNetworkFailureMessageGenerator(androidStringManager);
                case 24:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    featureFlagManager.getClass();
                    return new CheckDepositUiFactory(featureFlagManager, i3);
                case 25:
                    SingleWebSessionInMemoryManager singleWebSessionInMemoryManager = (SingleWebSessionInMemoryManager) provider.invoke();
                    singleWebSessionInMemoryManager.getClass();
                    return new zzb(singleWebSessionInMemoryManager);
                case 26:
                    SharedPreferences sharedPreferences6 = (SharedPreferences) provider.invoke();
                    sharedPreferences6.getClass();
                    return Room.BooleanKeyValue(sharedPreferences6, "stablecoin_activity_pref", false, false);
                case 27:
                    RealImageLoader realImageLoader7 = (RealImageLoader) provider.invoke();
                    realImageLoader7.getClass();
                    return new LimitsViewFactory(realImageLoader7, 7);
                case 28:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    return new RealStorage(context);
                default:
                    SharedPreferences sharedPreferences7 = (SharedPreferences) provider.invoke();
                    sharedPreferences7.getClass();
                    Moshi.Builder builder = new Moshi.Builder();
                    List list = Collections.EMPTY_LIST;
                    if (list.contains("sandboxed")) {
                        a$$ExternalSyntheticBUOutline0.m$3("Labels must be unique.");
                        return null;
                    }
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.add("sandboxed");
                    ArrayList arrayList2 = new ArrayList(list);
                    arrayList2.add(StorageLink.Sandboxed.class);
                    builder.add((JsonAdapter.Factory) new PolymorphicJsonAdapterFactory(StorageLink.class, "type", arrayList, arrayList2, null).withSubtype(StorageLink.Legacy.class, "legacy"));
                    builder.add(StorageLink.Legacy.class, new StandardJsonAdapters$2(1));
                    Moshi moshi = new Moshi(builder);
                    KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Throw;
                    JsonAdapter adapter = moshi.adapter(StorageLink.class, Util.NO_ANNOTATIONS, null);
                    return Room.SerDeKeyValue(sharedPreferences7, "persisted-storage-link", new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, i4), new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, 9), new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$3(), onDeserializationFailure, false);
            }
        }
    }

    public ScoreUiFactory(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator) {
        this.$r8$classId = 1;
        this.imageLoader = realImageLoader;
    }

    public UiFactory.ComposeUi composeUiWithImageLoader(ComposableLambdaImpl composableLambdaImpl) {
        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda41(7, this, composableLambdaImpl), true, -2108248579));
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        P2PListView p2PListView;
        ComposeUiView composeUiView;
        int i = this.$r8$classId;
        int i2 = 15;
        final int i3 = 3;
        int i4 = 19;
        int i5 = 4;
        int i6 = 20;
        int i7 = 22;
        int i8 = 23;
        final int i9 = 2;
        RealImageLoader realImageLoader = this.imageLoader;
        final int i10 = 0;
        final int i11 = 1;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof ScoreHomeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(this, i10), true, 1346261420));
                }
                return null;
            case 1:
                if (screen instanceof BenefitsHomeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.benefits.views.BenefitsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    BenefitsHomeViewModel benefitsHomeViewModel = (BenefitsHomeViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    benefitsHomeViewModel.getClass();
                                    function1.getClass();
                                    BenefitsHomeViewKt.BenefitsHome(scoreUiFactory.imageLoader, benefitsHomeViewModel, function1, (Composer) obj3, (intValue << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 1:
                                    BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel = (BankingBenefitsBookletViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    bankingBenefitsBookletViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2124291624, new BenefitsUiFactory$$ExternalSyntheticLambda4(bankingBenefitsBookletViewModel, function12), composer), composer, 56);
                                    break;
                                default:
                                    GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel = (GreenEligibleTransactionsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    greenEligibleTransactionsViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1954469216, new BenefitsUiFactory$$ExternalSyntheticLambda3(greenEligibleTransactionsViewModel, function13, 0, (byte) 0), composer2), composer2, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -765300742));
                }
                if (screen instanceof BankingBenefitsBookletScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.benefits.views.BenefitsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    BenefitsHomeViewModel benefitsHomeViewModel = (BenefitsHomeViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    benefitsHomeViewModel.getClass();
                                    function1.getClass();
                                    BenefitsHomeViewKt.BenefitsHome(scoreUiFactory.imageLoader, benefitsHomeViewModel, function1, (Composer) obj3, (intValue << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 1:
                                    BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel = (BankingBenefitsBookletViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    bankingBenefitsBookletViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2124291624, new BenefitsUiFactory$$ExternalSyntheticLambda4(bankingBenefitsBookletViewModel, function12), composer), composer, 56);
                                    break;
                                default:
                                    GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel = (GreenEligibleTransactionsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    greenEligibleTransactionsViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1954469216, new BenefitsUiFactory$$ExternalSyntheticLambda3(greenEligibleTransactionsViewModel, function13, 0, (byte) 0), composer2), composer2, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -49394024));
                }
                if (screen instanceof GreenEligibleTransactionsScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.benefits.views.BenefitsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i9;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    BenefitsHomeViewModel benefitsHomeViewModel = (BenefitsHomeViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    benefitsHomeViewModel.getClass();
                                    function1.getClass();
                                    BenefitsHomeViewKt.BenefitsHome(scoreUiFactory.imageLoader, benefitsHomeViewModel, function1, (Composer) obj3, (intValue << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 1:
                                    BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel = (BankingBenefitsBookletViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    bankingBenefitsBookletViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2124291624, new BenefitsUiFactory$$ExternalSyntheticLambda4(bankingBenefitsBookletViewModel, function12), composer), composer, 56);
                                    break;
                                default:
                                    GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel = (GreenEligibleTransactionsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    greenEligibleTransactionsViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1954469216, new BenefitsUiFactory$$ExternalSyntheticLambda3(greenEligibleTransactionsViewModel, function13, 0, (byte) 0), composer2), composer2, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 2059546784));
                }
                if (screen instanceof PdsaBenefitsExplainerScreen) {
                    return new UiFactory.ComposeUi(BenefitsHomeViewKt.f243lambda$1562289354);
                }
                if (screen instanceof BenefitDetailScreen) {
                    return new UiFactory.ComposeUi(BenefitsHomeViewKt.f242lambda$1250725136);
                }
                if (screen instanceof BenefitsExplanationScreen) {
                    return new UiFactory.ComposeUi(BenefitsHomeViewKt.lambda$1435542859);
                }
                if (screen instanceof BenefitsHubScreen) {
                    return new UiFactory.ComposeUi(BenefitsHomeViewKt.f244lambda$907484794);
                }
                return null;
            case 2:
                if (screen instanceof BlockersScreens.BlockerActionConfirmSheetScreen) {
                    return new UiFactory.LegacySheetComposeUi(new ComposableLambdaImpl(new Function5() { // from class: com.squareup.cash.offers.views.OffersUiFactory$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function5
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = (ScoreUiFactory) this;
                            UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj;
                            switch (i12) {
                                case 0:
                                    OfferDetailsSheetViewModel offerDetailsSheetViewModel = (OfferDetailsSheetViewModel) obj2;
                                    Function1 function1 = (Function1) obj3;
                                    int intValue = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    offerDetailsSheetViewModel.getClass();
                                    function1.getClass();
                                    OfferDetailsSheetKt.OfferDetailsSheetView(offerDetailsSheetViewModel, function1, scoreUiFactory.imageLoader, (Composer) obj4, (intValue >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel = (BlockerActionConfirmSheetViewModel) obj2;
                                    Function1 function12 = (Function1) obj3;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    blockerActionConfirmSheetViewModel.getClass();
                                    function12.getClass();
                                    MeasureScopeWithLayoutNodeKt.BlockerActionConfirmSheet(blockerActionConfirmSheetViewModel, function12, scoreUiFactory.imageLoader, (Composer) obj4, (intValue2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = (InviteContactsReferralRulesViewModel) obj2;
                                    Function1 function13 = (Function1) obj3;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    inviteContactsReferralRulesViewModel.getClass();
                                    function13.getClass();
                                    InviteErrorDialogKt.InviteContactsReferralRulesSheet(scoreUiFactory.imageLoader, inviteContactsReferralRulesViewModel, function13, (Composer) obj4, intValue3 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    PaychecksReceiptViewModel paychecksReceiptViewModel = (PaychecksReceiptViewModel) obj2;
                                    Function1 function14 = (Function1) obj3;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    paychecksReceiptViewModel.getClass();
                                    function14.getClass();
                                    HelpSheetViewKt.PaychecksReceiptView(paychecksReceiptViewModel, function14, scoreUiFactory.imageLoader, (Composer) obj4, (intValue4 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1908799085));
                }
                return null;
            case 3:
                if (screen.equals(SafetyHubScreens.SafetyHubScreen.INSTANCE)) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    SafetyHubViewModel safetyHubViewModel = (SafetyHubViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    function1.getClass();
                                    if (safetyHubViewModel != null) {
                                        GapComposer gapComposer = (GapComposer) composer;
                                        gapComposer.startReplaceGroup(-1472901864);
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-201217250, new FormCashtag$8$$ExternalSyntheticLambda0(9, safetyHubViewModel, function1), gapComposer), gapComposer, 56);
                                        gapComposer.end(false);
                                    } else {
                                        GapComposer gapComposer2 = (GapComposer) composer;
                                        gapComposer2.startReplaceGroup(-1472741377);
                                        gapComposer2.end(false);
                                    }
                                    break;
                                default:
                                    SafetyEducationPageViewModel safetyEducationPageViewModel = (SafetyEducationPageViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    ((Integer) obj4).getClass();
                                    function12.getClass();
                                    GapComposer gapComposer3 = (GapComposer) ((Composer) obj3);
                                    if (safetyEducationPageViewModel == null) {
                                        gapComposer3.startReplaceGroup(1608194526);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1608194527);
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(845522846, new SafetyHubUiFactory$$ExternalSyntheticLambda2(safetyEducationPageViewModel, function12), gapComposer3), gapComposer3, 56);
                                        gapComposer3.end(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1754886205));
                }
                if (screen instanceof SafetyHubScreens.SafetyEducationPageScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.safetyhub.views.SafetyHubUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    SafetyHubViewModel safetyHubViewModel = (SafetyHubViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    function1.getClass();
                                    if (safetyHubViewModel != null) {
                                        GapComposer gapComposer = (GapComposer) composer;
                                        gapComposer.startReplaceGroup(-1472901864);
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-201217250, new FormCashtag$8$$ExternalSyntheticLambda0(9, safetyHubViewModel, function1), gapComposer), gapComposer, 56);
                                        gapComposer.end(false);
                                    } else {
                                        GapComposer gapComposer2 = (GapComposer) composer;
                                        gapComposer2.startReplaceGroup(-1472741377);
                                        gapComposer2.end(false);
                                    }
                                    break;
                                default:
                                    SafetyEducationPageViewModel safetyEducationPageViewModel = (SafetyEducationPageViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    ((Integer) obj4).getClass();
                                    function12.getClass();
                                    GapComposer gapComposer3 = (GapComposer) ((Composer) obj3);
                                    if (safetyEducationPageViewModel == null) {
                                        gapComposer3.startReplaceGroup(1608194526);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1608194527);
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(845522846, new SafetyHubUiFactory$$ExternalSyntheticLambda2(safetyEducationPageViewModel, function12), gapComposer3), gapComposer3, 56);
                                        gapComposer3.end(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1975074482));
                }
                return null;
            case 4:
                if (screen instanceof FavoritesMessage) {
                    return new UiFactory.ComposeUi(AddFavoritesViewKt.f420lambda$1586617614);
                }
                if (screen instanceof FavoriteAdded) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.favorites.components.FavoritesViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    FavoriteAddedViewModel favoriteAddedViewModel = (FavoriteAddedViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    favoriteAddedViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(107624601, new FavoritesViewFactory$$ExternalSyntheticLambda4(favoriteAddedViewModel, function1, 0), composer), composer, 56);
                                    break;
                                case 1:
                                    AddFavoritesViewModel addFavoritesViewModel = (AddFavoritesViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    addFavoritesViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1471112448, new FavoritesViewFactory$$ExternalSyntheticLambda5(addFavoritesViewModel, function12, 0), composer2), composer2, 56);
                                    break;
                                default:
                                    ListFavoritesViewModel listFavoritesViewModel = (ListFavoritesViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    listFavoritesViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-813995348, new FavoritesViewFactory$$ExternalSyntheticLambda3(listFavoritesViewModel, function13, 0), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 212702169));
                }
                if (screen instanceof AddFavorites) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.favorites.components.FavoritesViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    FavoriteAddedViewModel favoriteAddedViewModel = (FavoriteAddedViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    favoriteAddedViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(107624601, new FavoritesViewFactory$$ExternalSyntheticLambda4(favoriteAddedViewModel, function1, 0), composer), composer, 56);
                                    break;
                                case 1:
                                    AddFavoritesViewModel addFavoritesViewModel = (AddFavoritesViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    addFavoritesViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1471112448, new FavoritesViewFactory$$ExternalSyntheticLambda5(addFavoritesViewModel, function12, 0), composer2), composer2, 56);
                                    break;
                                default:
                                    ListFavoritesViewModel listFavoritesViewModel = (ListFavoritesViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    listFavoritesViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-813995348, new FavoritesViewFactory$$ExternalSyntheticLambda3(listFavoritesViewModel, function13, 0), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -359344192));
                }
                if (screen instanceof ListFavorites) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.favorites.components.FavoritesViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i9;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    FavoriteAddedViewModel favoriteAddedViewModel = (FavoriteAddedViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    favoriteAddedViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(107624601, new FavoritesViewFactory$$ExternalSyntheticLambda4(favoriteAddedViewModel, function1, 0), composer), composer, 56);
                                    break;
                                case 1:
                                    AddFavoritesViewModel addFavoritesViewModel = (AddFavoritesViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    addFavoritesViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1471112448, new FavoritesViewFactory$$ExternalSyntheticLambda5(addFavoritesViewModel, function12, 0), composer2), composer2, 56);
                                    break;
                                default:
                                    ListFavoritesViewModel listFavoritesViewModel = (ListFavoritesViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    listFavoritesViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-813995348, new FavoritesViewFactory$$ExternalSyntheticLambda3(listFavoritesViewModel, function13, 0), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -708917780));
                }
                return null;
            case 5:
                if ((screen instanceof FidesmoProvisioningScreen) || (screen instanceof FidesmoDeprovisioningScreen)) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 10), true, -230582280));
                }
                return null;
            case 6:
                if (screen instanceof InstrumentSelectionScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.instruments.views.InstrumentsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    InstrumentSelectionViewModel instrumentSelectionViewModel = (InstrumentSelectionViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    instrumentSelectionViewModel.getClass();
                                    function1.getClass();
                                    InstrumentAvatarUtilsKt.InstrumentSelectionView(instrumentSelectionViewModel, function1, scoreUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    InstrumentSelectionBlockerViewModel instrumentSelectionBlockerViewModel = (InstrumentSelectionBlockerViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    instrumentSelectionBlockerViewModel.getClass();
                                    function12.getClass();
                                    InstrumentAvatarUtilsKt.InstrumentSelectionBlockerView(instrumentSelectionBlockerViewModel, function12, scoreUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1997931212));
                }
                if (screen instanceof InstrumentSelectionBlockerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.instruments.views.InstrumentsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    InstrumentSelectionViewModel instrumentSelectionViewModel = (InstrumentSelectionViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    instrumentSelectionViewModel.getClass();
                                    function1.getClass();
                                    InstrumentAvatarUtilsKt.InstrumentSelectionView(instrumentSelectionViewModel, function1, scoreUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    InstrumentSelectionBlockerViewModel instrumentSelectionBlockerViewModel = (InstrumentSelectionBlockerViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    instrumentSelectionBlockerViewModel.getClass();
                                    function12.getClass();
                                    InstrumentAvatarUtilsKt.InstrumentSelectionBlockerView(instrumentSelectionBlockerViewModel, function12, scoreUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -678083459));
                }
                if (screen instanceof InstrumentSelectionLoadingScreen) {
                    return new UiFactory.ComposeUi(InstrumentAvatarUtilsKt.lambda$470183401);
                }
                if (screen instanceof TransferOptionPickerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(5, this, screen), true, 975880454));
                }
                return null;
            case 7:
                if (screen instanceof InviteReferralsRulesBottomSheet) {
                    return new UiFactory.LegacySheetComposeUi(new ComposableLambdaImpl(new Function5() { // from class: com.squareup.cash.offers.views.OffersUiFactory$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function5
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i12 = i9;
                            ScoreUiFactory scoreUiFactory = (ScoreUiFactory) this;
                            UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj;
                            switch (i12) {
                                case 0:
                                    OfferDetailsSheetViewModel offerDetailsSheetViewModel = (OfferDetailsSheetViewModel) obj2;
                                    Function1 function1 = (Function1) obj3;
                                    int intValue = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    offerDetailsSheetViewModel.getClass();
                                    function1.getClass();
                                    OfferDetailsSheetKt.OfferDetailsSheetView(offerDetailsSheetViewModel, function1, scoreUiFactory.imageLoader, (Composer) obj4, (intValue >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel = (BlockerActionConfirmSheetViewModel) obj2;
                                    Function1 function12 = (Function1) obj3;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    blockerActionConfirmSheetViewModel.getClass();
                                    function12.getClass();
                                    MeasureScopeWithLayoutNodeKt.BlockerActionConfirmSheet(blockerActionConfirmSheetViewModel, function12, scoreUiFactory.imageLoader, (Composer) obj4, (intValue2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = (InviteContactsReferralRulesViewModel) obj2;
                                    Function1 function13 = (Function1) obj3;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    inviteContactsReferralRulesViewModel.getClass();
                                    function13.getClass();
                                    InviteErrorDialogKt.InviteContactsReferralRulesSheet(scoreUiFactory.imageLoader, inviteContactsReferralRulesViewModel, function13, (Composer) obj4, intValue3 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    PaychecksReceiptViewModel paychecksReceiptViewModel = (PaychecksReceiptViewModel) obj2;
                                    Function1 function14 = (Function1) obj3;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    paychecksReceiptViewModel.getClass();
                                    function14.getClass();
                                    HelpSheetViewKt.PaychecksReceiptView(paychecksReceiptViewModel, function14, scoreUiFactory.imageLoader, (Composer) obj4, (intValue4 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1744475968));
                }
                if (screen instanceof BlockersScreens.InviteErrorScreen) {
                    return new UiFactory.ComposeUi(InviteErrorDialogKt.f460lambda$279826781);
                }
                if (screen instanceof BlockersScreens.InviteContactsScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 13), true, -1331909199));
                }
                return null;
            case 8:
                if (screen instanceof MerchantScreen$MerchantInfoFeedbackBottomSheetScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.merchant.views.MerchantUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel = (MerchantInfoFeedbackViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    merchantInfoFeedbackViewModel.getClass();
                                    function1.getClass();
                                    MerchantProfileViewKt.MerchantInfoFeedback(scoreUiFactory.imageLoader, merchantInfoFeedbackViewModel, function1, (Composer) obj3, (intValue << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    MerchantBlockingViewModel merchantBlockingViewModel = (MerchantBlockingViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    merchantBlockingViewModel.getClass();
                                    function12.getClass();
                                    MerchantProfileViewKt.MerchantBlockingView(scoreUiFactory.imageLoader, merchantBlockingViewModel, function12, (Composer) obj3, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 31540894));
                }
                if (screen instanceof MerchantScreen$MerchantProfileScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(7, screen, this), true, 987310967));
                }
                if (screen instanceof MerchantScreen$MerchantBlockingScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.merchant.views.MerchantUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel = (MerchantInfoFeedbackViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    merchantInfoFeedbackViewModel.getClass();
                                    function1.getClass();
                                    MerchantProfileViewKt.MerchantInfoFeedback(scoreUiFactory.imageLoader, merchantInfoFeedbackViewModel, function1, (Composer) obj3, (intValue << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    MerchantBlockingViewModel merchantBlockingViewModel = (MerchantBlockingViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    merchantBlockingViewModel.getClass();
                                    function12.getClass();
                                    MerchantProfileViewKt.MerchantBlockingView(scoreUiFactory.imageLoader, merchantBlockingViewModel, function12, (Composer) obj3, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1053924984));
                }
                return null;
            case 9:
                if (screen instanceof MoneyTabBookletScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 14), true, -28739522));
                }
                return null;
            case 10:
                if (screen instanceof MusicScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(this, i2), true, -797079353));
                }
                return null;
            case 11:
                if (screen instanceof OffersScreen$OffersGreenStatusScreen) {
                    return new UiFactory.ComposeUi(UtilsKt.f514lambda$207972424);
                }
                if (screen instanceof OffersScreen$OffersTimelineScreenV2) {
                    return new UiFactory.ComposeUi(UtilsKt.lambda$1062725653);
                }
                if (screen instanceof OffersScreen$OffersDetailsScreenV2) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.offers.views.OffersUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    OffersDetailsSheetViewModelV2 offersDetailsSheetViewModelV2 = (OffersDetailsSheetViewModelV2) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    offersDetailsSheetViewModelV2.getClass();
                                    function1.getClass();
                                    OfferDetailsSheetKt.OffersDetailsSheetV2(scoreUiFactory.imageLoader, offersDetailsSheetViewModelV2, function1, (Composer) obj3, (intValue << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    OffersHomeViewModelV2 offersHomeViewModelV2 = (OffersHomeViewModelV2) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    offersHomeViewModelV2.getClass();
                                    function12.getClass();
                                    OfferTileKt.OffersHomeV2(scoreUiFactory.imageLoader, offersHomeViewModelV2, function12, (Composer) obj3, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 501118128));
                }
                if (screen instanceof OffersScreen$OffersHomeScreenV2) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.offers.views.OffersUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    OffersDetailsSheetViewModelV2 offersDetailsSheetViewModelV2 = (OffersDetailsSheetViewModelV2) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    offersDetailsSheetViewModelV2.getClass();
                                    function1.getClass();
                                    OfferDetailsSheetKt.OffersDetailsSheetV2(scoreUiFactory.imageLoader, offersDetailsSheetViewModelV2, function1, (Composer) obj3, (intValue << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    OffersHomeViewModelV2 offersHomeViewModelV2 = (OffersHomeViewModelV2) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    offersHomeViewModelV2.getClass();
                                    function12.getClass();
                                    OfferTileKt.OffersHomeV2(scoreUiFactory.imageLoader, offersHomeViewModelV2, function12, (Composer) obj3, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1507131023));
                }
                if (screen instanceof OffersScreen$OffersHomeScreen) {
                    P2PListView p2PListView2 = new P2PListView(context, realImageLoader, 20);
                    return new UiFactory.ViewUi(p2PListView2, p2PListView2);
                }
                if (screen instanceof OffersScreen$OffersFilterGroupSheetScreen) {
                    SquareLoyaltySheetView squareLoyaltySheetView = new SquareLoyaltySheetView(context, realImageLoader, 4);
                    return new UiFactory.ViewUi(squareLoyaltySheetView, squareLoyaltySheetView);
                }
                if (screen instanceof OffersScreen$OffersFullscreenCollectionScreen) {
                    P2PListView p2PListView3 = new P2PListView(context, realImageLoader, 19);
                    return new UiFactory.ViewUi(p2PListView3, p2PListView3);
                }
                if (screen instanceof OffersScreen$OffersDetailsScreen) {
                    return new UiFactory.LegacySheetComposeUi(new ComposableLambdaImpl(new Function5() { // from class: com.squareup.cash.offers.views.OffersUiFactory$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function5
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = (ScoreUiFactory) this;
                            UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj;
                            switch (i12) {
                                case 0:
                                    OfferDetailsSheetViewModel offerDetailsSheetViewModel = (OfferDetailsSheetViewModel) obj2;
                                    Function1 function1 = (Function1) obj3;
                                    int intValue = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    offerDetailsSheetViewModel.getClass();
                                    function1.getClass();
                                    OfferDetailsSheetKt.OfferDetailsSheetView(offerDetailsSheetViewModel, function1, scoreUiFactory.imageLoader, (Composer) obj4, (intValue >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel = (BlockerActionConfirmSheetViewModel) obj2;
                                    Function1 function12 = (Function1) obj3;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    blockerActionConfirmSheetViewModel.getClass();
                                    function12.getClass();
                                    MeasureScopeWithLayoutNodeKt.BlockerActionConfirmSheet(blockerActionConfirmSheetViewModel, function12, scoreUiFactory.imageLoader, (Composer) obj4, (intValue2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = (InviteContactsReferralRulesViewModel) obj2;
                                    Function1 function13 = (Function1) obj3;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    inviteContactsReferralRulesViewModel.getClass();
                                    function13.getClass();
                                    InviteErrorDialogKt.InviteContactsReferralRulesSheet(scoreUiFactory.imageLoader, inviteContactsReferralRulesViewModel, function13, (Composer) obj4, intValue3 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    PaychecksReceiptViewModel paychecksReceiptViewModel = (PaychecksReceiptViewModel) obj2;
                                    Function1 function14 = (Function1) obj3;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                    paychecksReceiptViewModel.getClass();
                                    function14.getClass();
                                    HelpSheetViewKt.PaychecksReceiptView(paychecksReceiptViewModel, function14, scoreUiFactory.imageLoader, (Composer) obj4, (intValue4 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1706715325));
                }
                if (screen instanceof OffersScreen$OffersTimelineScreen) {
                    return new UiFactory.LegacySheetComposeUi(UtilsKt.lambda$507632886);
                }
                if (screen instanceof OffersScreen$OffersRedemptionScreen) {
                    OffersRedemptionSheetView offersRedemptionSheetView = new OffersRedemptionSheetView(context);
                    return new UiFactory.ViewUi(offersRedemptionSheetView, offersRedemptionSheetView);
                }
                if (!(screen instanceof OffersScreen$OffersNotificationScreen)) {
                    return null;
                }
                OffersNotificationView offersNotificationView = new OffersNotificationView(context);
                return new UiFactory.ViewUi(offersNotificationView, offersNotificationView);
            case 12:
                if (screen instanceof OnboardingAccountPickerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, i2), true, -683460436));
                }
                if (screen instanceof OnboardingAccountPickerErrorScreen) {
                    return new UiFactory.ComposeUi(AliasPickerViewKt.lambda$2037868797);
                }
                if (screen instanceof OnboardingAccountPickerOptionsMenuScreen) {
                    return new UiFactory.LegacySheetComposeUi(AliasPickerViewKt.f521lambda$581519098);
                }
                if (screen instanceof OnboardingAliasPickerScreen) {
                    return new UiFactory.ComposeUi(AliasPickerViewKt.f527lambda$86296586);
                }
                if (screen instanceof OnboardingConfirmAccountRemovalScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new PaymentPadUiFactory$$ExternalSyntheticLambda1(i3, screen), true, 997943415));
                }
                return null;
            case 13:
                if (screen instanceof OnboardingLandingScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 16), true, 936360962));
                }
                return null;
            case 14:
                if (screen instanceof P2PListScreen) {
                    p2PListView = new P2PListView(context, realImageLoader, 0);
                } else {
                    if (!(screen instanceof SelectCustomerScreen)) {
                        if (screen instanceof BlockersScreens.SelectAllowlistCustomerBlockerScreen) {
                            return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.p2pblocking.views.P2PBlockingViewFactory$$ExternalSyntheticLambda0
                                public final /* synthetic */ ScoreUiFactory f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    int i12 = i10;
                                    ScoreUiFactory scoreUiFactory = this.f$0;
                                    AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    switch (i12) {
                                        case 0:
                                            allowlistSelectionViewModel.getClass();
                                            function1.getClass();
                                            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-129357165, new AllowlistSelectionKt$$ExternalSyntheticLambda6(allowlistSelectionViewModel, function1, 3, (byte) 0), composer), composer, 56);
                                            break;
                                        default:
                                            allowlistSelectionViewModel.getClass();
                                            function1.getClass();
                                            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(155778738, new AllowlistSelectionKt$$ExternalSyntheticLambda6(allowlistSelectionViewModel, function1, 2, (byte) 0), composer), composer, 56);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, true, -2114132141));
                        }
                        if (screen instanceof P2PAllowlistScreen) {
                            return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.p2pblocking.views.P2PBlockingViewFactory$$ExternalSyntheticLambda0
                                public final /* synthetic */ ScoreUiFactory f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    int i12 = i11;
                                    ScoreUiFactory scoreUiFactory = this.f$0;
                                    AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    switch (i12) {
                                        case 0:
                                            allowlistSelectionViewModel.getClass();
                                            function1.getClass();
                                            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-129357165, new AllowlistSelectionKt$$ExternalSyntheticLambda6(allowlistSelectionViewModel, function1, 3, (byte) 0), composer), composer, 56);
                                            break;
                                        default:
                                            allowlistSelectionViewModel.getClass();
                                            function1.getClass();
                                            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(155778738, new AllowlistSelectionKt$$ExternalSyntheticLambda6(allowlistSelectionViewModel, function1, 2, (byte) 0), composer), composer, 56);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, true, -1828996238));
                        }
                        return null;
                    }
                    p2PListView = new P2PListView(context, realImageLoader, 21);
                }
                return new UiFactory.ViewUi(p2PListView, p2PListView);
            case 15:
                PaychecksScreen paychecksScreen = screen instanceof PaychecksScreen ? (PaychecksScreen) screen : null;
                if (paychecksScreen instanceof PaychecksHomeScreen) {
                    composeUiView = new P2PListView(context, realImageLoader, 22);
                } else if (paychecksScreen instanceof DistributePaycheckScreen) {
                    composeUiView = new DistributePaycheckView(context);
                } else if (paychecksScreen instanceof EditDistributionScreen) {
                    composeUiView = new P2PListView(context, realImageLoader, 23);
                } else if (paychecksScreen instanceof SetPaycheckMultipleAllocationScreen) {
                    composeUiView = new MultipleAllocationView(context);
                } else if (paychecksScreen instanceof PaycheckAlertDialogScreen) {
                    composeUiView = new PaycheckAlertDialog(context);
                } else {
                    if ((paychecksScreen instanceof PaycheckReceiptScreen) || (paychecksScreen instanceof PaycheckAggregationReceiptScreen)) {
                        return new UiFactory.LegacySheetComposeUi(new ComposableLambdaImpl(new Function5() { // from class: com.squareup.cash.offers.views.OffersUiFactory$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function5
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i12 = i3;
                                ScoreUiFactory scoreUiFactory = (ScoreUiFactory) this;
                                UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj;
                                switch (i12) {
                                    case 0:
                                        OfferDetailsSheetViewModel offerDetailsSheetViewModel = (OfferDetailsSheetViewModel) obj2;
                                        Function1 function1 = (Function1) obj3;
                                        int intValue = ((Integer) obj5).intValue();
                                        uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                        offerDetailsSheetViewModel.getClass();
                                        function1.getClass();
                                        OfferDetailsSheetKt.OfferDetailsSheetView(offerDetailsSheetViewModel, function1, scoreUiFactory.imageLoader, (Composer) obj4, (intValue >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                        break;
                                    case 1:
                                        BlockerActionConfirmSheetViewModel blockerActionConfirmSheetViewModel = (BlockerActionConfirmSheetViewModel) obj2;
                                        Function1 function12 = (Function1) obj3;
                                        int intValue2 = ((Integer) obj5).intValue();
                                        uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                        blockerActionConfirmSheetViewModel.getClass();
                                        function12.getClass();
                                        MeasureScopeWithLayoutNodeKt.BlockerActionConfirmSheet(blockerActionConfirmSheetViewModel, function12, scoreUiFactory.imageLoader, (Composer) obj4, (intValue2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                        break;
                                    case 2:
                                        InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = (InviteContactsReferralRulesViewModel) obj2;
                                        Function1 function13 = (Function1) obj3;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                        inviteContactsReferralRulesViewModel.getClass();
                                        function13.getClass();
                                        InviteErrorDialogKt.InviteContactsReferralRulesSheet(scoreUiFactory.imageLoader, inviteContactsReferralRulesViewModel, function13, (Composer) obj4, intValue3 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                        break;
                                    default:
                                        PaychecksReceiptViewModel paychecksReceiptViewModel = (PaychecksReceiptViewModel) obj2;
                                        Function1 function14 = (Function1) obj3;
                                        int intValue4 = ((Integer) obj5).intValue();
                                        uiContainerKt$BottomSheet$1$sheetScope$1.getClass();
                                        paychecksReceiptViewModel.getClass();
                                        function14.getClass();
                                        HelpSheetViewKt.PaychecksReceiptView(paychecksReceiptViewModel, function14, scoreUiFactory.imageLoader, (Composer) obj4, (intValue4 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, true, -773473326));
                    }
                    if (paychecksScreen instanceof PaycheckActivityListScreen) {
                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 17), true, -1350835037));
                    }
                    if (paychecksScreen instanceof CustomAllocationScreen) {
                        return new UiFactory.ComposeUi(ComposableSingletons$PaychecksUiFactoryKt.f542lambda$357886392);
                    }
                    if (paychecksScreen instanceof HelpSheetScreen) {
                        composeUiView = new HelpSheetView(context);
                    } else {
                        if (paychecksScreen != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        composeUiView = null;
                    }
                }
                if (composeUiView != null && (screen instanceof DialogScreen) && !(composeUiView instanceof OutsideTapCloses)) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m$1(Reflection.factory.getOrCreateKotlinClass(composeUiView.getClass()).getSimpleName(), " doesn't implement OutsideTapCloses"));
                    return null;
                }
                if (composeUiView != null) {
                    return new UiFactory.ViewUi(composeUiView, composeUiView);
                }
                return null;
            case 16:
                if (screen instanceof WirelessProviderListBlockerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.phoneplans.PhonePlansUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i10;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    WirelessProviderListViewModel wirelessProviderListViewModel = (WirelessProviderListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    wirelessProviderListViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(2089230764, new PhonePlansUiFactory$$ExternalSyntheticLambda2(wirelessProviderListViewModel, function1, 0, (byte) 0), composer), composer, 56);
                                    break;
                                default:
                                    PhonePlansHomeViewModel phonePlansHomeViewModel = (PhonePlansHomeViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    phonePlansHomeViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1270387455, new PhonePlansUiFactory$$ExternalSyntheticLambda3(phonePlansHomeViewModel, function12), composer2), composer2, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -488116628));
                }
                if (screen instanceof PhonePlansEsimCheckBlockerScreen) {
                    return new UiFactory.ComposeUi(PhonePlansHomeViewKt.f565lambda$1588923860);
                }
                if (screen instanceof PhonePlansNewLineLoadingBlockerScreen) {
                    return new UiFactory.ComposeUi(PhonePlansHomeViewKt.lambda$1923245547);
                }
                if (screen instanceof PhonePlansHomeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.phoneplans.PhonePlansUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ ScoreUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i12 = i11;
                            ScoreUiFactory scoreUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    WirelessProviderListViewModel wirelessProviderListViewModel = (WirelessProviderListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    wirelessProviderListViewModel.getClass();
                                    function1.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(2089230764, new PhonePlansUiFactory$$ExternalSyntheticLambda2(wirelessProviderListViewModel, function1, 0, (byte) 0), composer), composer, 56);
                                    break;
                                default:
                                    PhonePlansHomeViewModel phonePlansHomeViewModel = (PhonePlansHomeViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    phonePlansHomeViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1270387455, new PhonePlansUiFactory$$ExternalSyntheticLambda3(phonePlansHomeViewModel, function12), composer2), composer2, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1317837249));
                }
                return null;
            case 17:
                if (screen instanceof BlockersScreens.PrepurchaseCashCardFAQBlockerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, i4), true, -2142165324));
                }
                if (screen instanceof PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen) {
                    return new UiFactory.ComposeUi(LocaleToggleKt.lambda$1998932607);
                }
                return null;
            case 18:
                if (screen instanceof DeviceManagerListScreen) {
                    return new UiFactory.ComposeUi(DeviceManagerListViewKt.lambda$344324478);
                }
                if (screen instanceof DeviceManagerDeviceDetailsScreen) {
                    DeviceManagerDeviceDetailsView deviceManagerDeviceDetailsView = new DeviceManagerDeviceDetailsView(context, realImageLoader);
                    return new UiFactory.ViewUi(deviceManagerDeviceDetailsView, deviceManagerDeviceDetailsView);
                }
                if (screen instanceof DeviceManagerDeviceRemovalFailedFullScreen) {
                    return new UiFactory.ComposeUi(DeviceManagerListViewKt.lambda$544737060);
                }
                if (screen instanceof DeviceManagerDeviceRemovalFailedBottomSheetScreen) {
                    return new UiFactory.ComposeUi(DeviceManagerListViewKt.lambda$308119235);
                }
                if (screen instanceof DeviceManagerDeviceRemovalSuccessFullScreen) {
                    return new UiFactory.ComposeUi(DeviceManagerListViewKt.lambda$832469673);
                }
                if (screen instanceof DeviceManagerDeviceRemovalSuccessBottomSheetScreen) {
                    return new UiFactory.ComposeUi(DeviceManagerListViewKt.lambda$595851848);
                }
                if (screen instanceof DeviceManagerConfirmRemoveDevicesScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new PaymentPadUiFactory$$ExternalSyntheticLambda1(i5, screen), true, -1281504275));
                }
                return null;
            case 19:
                if (screen instanceof PromotionsReferralsScreen$PromotionsReferralsHomeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, i6), true, -1860079322));
                }
                return null;
            case 20:
                if (screen instanceof SecurityHubScreen) {
                    return composeUiWithImageLoader(EducationCardKt.lambda$429012772);
                }
                if (screen instanceof BookletScreen) {
                    return composeUiWithImageLoader(EducationCardKt.lambda$45646605);
                }
                if (screen instanceof RecoveryGuideScreen) {
                    return composeUiWithImageLoader(EducationCardKt.lambda$631358489);
                }
                return null;
            case 21:
                if (screen instanceof TapToPayScreen) {
                    return new UiFactory.ComposeUi(TapToPayKt.f728lambda$744323661);
                }
                if (screen instanceof TapToPayPaymentScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, i7), true, 1605897368));
                }
                if (screen instanceof TapToPayPaymentRequestScreen) {
                    return new UiFactory.ComposeUi(TapToPayKt.lambda$741436420);
                }
                if (screen instanceof TapToPayInitiatorNotesScreen) {
                    return new UiFactory.ComposeUi(TapToPayKt.f719lambda$114869300);
                }
                if (screen instanceof TapToPayErrorScreen) {
                    return new UiFactory.ComposeUi(TapToPayKt.lambda$340009913);
                }
                if (screen instanceof TapToPayErrorDialogScreen) {
                    return new UiFactory.ComposeUi(TapToPayKt.f723lambda$141184386);
                }
                if (screen instanceof TapToPayFirstTimeScreen) {
                    return new UiFactory.ComposeUi(TapToPayKt.lambda$750620279);
                }
                if (screen instanceof TapToPayOnboardingCompleteScreen) {
                    return new UiFactory.ComposeUi(TapToPayKt.f720lambda$1191558186);
                }
                return null;
            default:
                if (screen instanceof BlockersScreens.ThreeDsAuthenticationScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, i8), true, 2129387631));
                }
                return null;
        }
    }

    public /* synthetic */ ScoreUiFactory(RealImageLoader realImageLoader, int i) {
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
    }
}
