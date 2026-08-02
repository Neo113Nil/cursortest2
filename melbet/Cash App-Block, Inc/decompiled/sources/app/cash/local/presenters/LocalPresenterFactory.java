package app.cash.local.presenters;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.ui.node.NodeChain;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.ClearMarketingBadgesIfNeeded;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import app.cash.local.backend.RefreshMarketingMessages;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.LocalAddBrandsPresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter$Factory$Impl;
import app.cash.local.presenters.brand.checkout.LocalCheckoutDeeplinkPresenter$Factory$Impl;
import app.cash.local.presenters.brand.checkout.LocalOpenTabCheckoutPresenter$Args;
import app.cash.local.presenters.brand.checkout.LocalOpenTabCheckoutPresenter$Factory$Impl;
import app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter;
import app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter$Factory$Impl;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter$Factory$Impl;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter$Factory$Impl;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter$Factory$Impl;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$Factory$Impl;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter$Factory$Impl;
import app.cash.local.presenters.cart.LocalBrandLocationOpenTabPresenter;
import app.cash.local.presenters.cart.LocalBrandLocationOpenTabPresenter$Factory$Impl;
import app.cash.local.presenters.cart.LocalCartCheckoutNavigator;
import app.cash.local.presenters.cart.LocalOpenTabCartMapper;
import app.cash.local.presenters.dialog.LocalExplanatoryDialogPresenter$Factory$Impl;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter$Factory$Impl;
import app.cash.local.presenters.fulfillment.SchedulingDayTimePickerPresenter$Factory$Impl;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter$Factory$Impl;
import app.cash.local.presenters.instore.TableQrCodeScannerPresenter;
import app.cash.local.presenters.instore.TableQrCodeScannerPresenter$Factory$Impl;
import app.cash.local.presenters.internal.FulfillmentTimeUtils;
import app.cash.local.presenters.internal.LocalResponseContextHandler$Factory$Impl;
import app.cash.local.presenters.map.LocalBrandCollectionMapPresenter$Factory$Impl;
import app.cash.local.presenters.marketingmessages.MarketingMessagePresenter$Factory$Impl;
import app.cash.local.presenters.marketingmessages.MarketingMessagesPresenter$Factory$Impl;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter$Factory$Impl;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter$Factory$Impl;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter$Factory$Impl;
import app.cash.local.presenters.sheet.CurbsidePickupCarPresenter$Factory$Impl;
import app.cash.local.presenters.sheet.EducationalSheetPresenter$Factory$Impl;
import app.cash.local.presenters.sheet.LocalMenuPickerSheetPresenter$Factory$Impl;
import app.cash.local.presenters.sheet.LocalShortlinkPresenter$Factory$Impl;
import app.cash.local.presenters.sheet.LoyaltySheetPresenter$Factory$Impl;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter$Factory$Impl;
import app.cash.local.presenters.wallet.TabContentPresenter$Factory$Impl;
import app.cash.local.screens.app.LocalAddBrandsScreen;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabCheckoutScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalCashAllActivityScreen;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.screens.app.LocalCheckoutDeeplinkScreen;
import app.cash.local.screens.app.LocalCurbsidePickupCarScreen;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.screens.app.LocalEducationalSheet;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalMarketingMessagesScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.LocalMenuPickerScreen;
import app.cash.local.screens.app.LocalNeighborhoodsMapScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalOrdersScreen;
import app.cash.local.screens.app.LocalPosBrandOnboardingScreen;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.screens.app.LocalPosLocalCashRedemptionScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.screens.app.LocalScreen;
import app.cash.local.screens.app.LocalShortlinkSheet;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.screens.app.TableQrCodeScannerScreen;
import app.cash.local.service.LocalService;
import app.cash.passcode.presenters.EndAppLockPresenter;
import coil3.ImageLoader$Builder;
import coil3.svg.internal.AndroidSvg;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.android.gms.internal.measurement.zzlj;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.ProfileInlineAppMessagePresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BankingSectionsPresenter;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.blockers.presenters.BlockerImageUploader$MetroFactory;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.cashcommercebrowser.api.v1.CustomerPreferencesService;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.routers.transfers.AddCashRouter;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.history.payments.presenters.CounterpartyPageRequestHandler$Factory$Impl;
import com.squareup.cash.history.payments.presenters.ProfileActivityItemEventDecorator;
import com.squareup.cash.history.payments.presenters.ProfileCompleteActivityPresenter$Factory$Impl;
import com.squareup.cash.history.payments.presenters.ProfileCompleteActivityPresenter$MetroFactory;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.notifications.NotificationSettingsChecker;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.navigation.real.RealPaymentsInboundNavigator$Factory$Impl;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.AddressSheetPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.AppMessagesOptionsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ErrorPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.FamilyEligibilityLoadingPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.GenericConfirmDialogPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.IncomingRequestsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.OpenSourcePresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.OpenSourcePresenter$MetroFactory;
import com.squareup.cash.profile.presenters.PaymentNotificationOptionsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfileCashtagRequiredPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfileConfirmRemoveAliasPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfileConfirmSignOutPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfileCropPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfileHeaderMenuPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfilePasswordDialogPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ProfileSecurityPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.RealProfilePasscodePresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.RealProfilePreviewPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.ReferralStatusPresenter;
import com.squareup.cash.profile.presenters.ReferralStatusPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.RingtonePresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.TaxesPasswordPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.TaxesPasswordPresenter$MetroFactory;
import com.squareup.cash.profile.presenters.UnsupportedSettingPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.allowedaccounts.RealAllowedAccountsSectionPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.blockedaccounts.RealBlockedAccountsSectionPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.AdjustableThresholdPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.CategoryListPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.ContactMethodDetailsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.EnableAliasSheetPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.NotificationSectionPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.profile.presenters.personal.ArcadeAutofillSettingsDetailPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.personal.ConfirmReplaceInfoPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.personal.PersonalInfoConfirmationDialogPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.personal.PersonalInfoSectionPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.profile.presenters.personal.ProfilePersonalPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.personalizedads.RealPersonalizedAdsSettingsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.searchprivacy.RealSearchPrivacySettingsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.trustedcontact.InvestingContactPresenter;
import com.squareup.cash.profile.presenters.trustedcontact.InvestingContactPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.trustedcontact.TrustedContactFlowPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.trustedcontact.TrustedContactSettingPresenter$Factory$Impl;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ActivePasswordDialog;
import com.squareup.cash.profile.screens.ArcadeAutofillSettingsScreen;
import com.squareup.cash.profile.screens.CashtagRequiredScreen;
import com.squareup.cash.profile.screens.GenericConfirmDialog;
import com.squareup.cash.profile.screens.InvestingContactScreen;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.profile.screens.PersonalInfoConfirmationDialogScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.screens.SearchVisibilityScreen;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.autofill.presenters.RealAutofillNetworkFailureMessageGenerator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.presenters.MerchantPickerPresenter$MetroFactory;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.util.android.AndroidColorManager;
import com.squareup.util.android.RealIntentFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.NotImplementedError;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import retrofit2.OkHttpCall;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class LocalPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object allActivityPresenter;
    public final Object brandCollectionMapPresenter;
    public final Object brandProfilePresenter;
    public final Object checkoutDeeplinkPresenter;
    public final Object curbsidePickupCarPresenter;
    public final Object educationalSheetPresenter;
    public final Object fulfillmentPickerPresenter;
    public final Object localAddBrandsPresenter;
    public final Object localCashBalancePresenter;
    public final Object localEditorialPresenter;
    public final Object localExplanatoryDialogPresenter;
    public final Object localHomePresenter;
    public final Object localMenuComboDetailsPresenter;
    public final Object localMenuItemDetailsPresenter;
    public final Object localMenuPresenter;
    public final Object localOrderStatusPresenter;
    public final Object locationCartPresenter;
    public final Object locationCheckoutPresenter;
    public final Object locationOpenTabPresenter;
    public final Object loyaltySheetPresenter;
    public final Object marketingMessagePresenter;
    public final Object marketingMessagesPresenter;
    public final Object openTabCheckoutPresenter;
    public final Object posBrandOnboardingPresenter;
    public final Object posCheckInPresenter;
    public final Object posLocalCashRedemptionPresenter;
    public final Object schedulingDayTimePickerPresenter;
    public final Object shortlinkPresenter;
    public final Object tableQrCodeScannerPresenter;

    public final class MetroFactory implements Factory {
        public final InstanceFactory allActivityPresenter;
        public final InstanceFactory brandCollectionMapPresenter;
        public final Provider brandProfilePresenter;
        public final InstanceFactory checkoutDeeplinkPresenter;
        public final InstanceFactory curbsidePickupCarPresenter;
        public final Provider educationalSheetPresenter;
        public final InstanceFactory fulfillmentPickerPresenter;
        public final InstanceFactory localAddBrandsPresenter;
        public final InstanceFactory localCashBalancePresenter;
        public final InstanceFactory localEditorialPresenter;
        public final InstanceFactory localExplanatoryDialogPresenter;
        public final InstanceFactory localHomePresenter;
        public final InstanceFactory localMenuComboDetailsPresenter;
        public final InstanceFactory localMenuItemDetailsPresenter;
        public final InstanceFactory localMenuPresenter;
        public final InstanceFactory localOrderStatusPresenter;
        public final InstanceFactory locationCartPresenter;
        public final InstanceFactory locationCheckoutPresenter;
        public final InstanceFactory locationOpenTabPresenter;
        public final InstanceFactory loyaltySheetPresenter;
        public final InstanceFactory marketingMessagePresenter;
        public final InstanceFactory marketingMessagesPresenter;
        public final InstanceFactory menuPickerSheetPresenter;
        public final InstanceFactory openTabCheckoutPresenter;
        public final InstanceFactory posBrandOnboardingPresenter;
        public final InstanceFactory posCheckInPresenter;
        public final InstanceFactory posLocalCashRedemptionPresenter;
        public final InstanceFactory schedulingDayTimePickerPresenter;
        public final InstanceFactory shortlinkPresenter;
        public final InstanceFactory tableQrCodeScannerPresenter;

        public MetroFactory(Provider provider, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, Provider provider2, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28) {
            this.brandProfilePresenter = provider;
            this.locationCartPresenter = instanceFactory;
            this.locationOpenTabPresenter = instanceFactory2;
            this.locationCheckoutPresenter = instanceFactory3;
            this.openTabCheckoutPresenter = instanceFactory4;
            this.checkoutDeeplinkPresenter = instanceFactory5;
            this.localOrderStatusPresenter = instanceFactory6;
            this.localMenuPresenter = instanceFactory7;
            this.localMenuItemDetailsPresenter = instanceFactory8;
            this.localMenuComboDetailsPresenter = instanceFactory9;
            this.localExplanatoryDialogPresenter = instanceFactory10;
            this.localHomePresenter = instanceFactory11;
            this.localCashBalancePresenter = instanceFactory12;
            this.localAddBrandsPresenter = instanceFactory13;
            this.educationalSheetPresenter = provider2;
            this.shortlinkPresenter = instanceFactory14;
            this.brandCollectionMapPresenter = instanceFactory15;
            this.fulfillmentPickerPresenter = instanceFactory16;
            this.localEditorialPresenter = instanceFactory17;
            this.loyaltySheetPresenter = instanceFactory18;
            this.schedulingDayTimePickerPresenter = instanceFactory19;
            this.marketingMessagePresenter = instanceFactory20;
            this.marketingMessagesPresenter = instanceFactory21;
            this.allActivityPresenter = instanceFactory22;
            this.tableQrCodeScannerPresenter = instanceFactory23;
            this.posBrandOnboardingPresenter = instanceFactory24;
            this.posLocalCashRedemptionPresenter = instanceFactory25;
            this.posCheckInPresenter = instanceFactory26;
            this.menuPickerSheetPresenter = instanceFactory27;
            this.curbsidePickupCarPresenter = instanceFactory28;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            LocalBrandProfilePresenter$Factory$Impl localBrandProfilePresenter$Factory$Impl = (LocalBrandProfilePresenter$Factory$Impl) this.brandProfilePresenter.invoke();
            LocalBrandLocationCartPresenter$Factory$Impl localBrandLocationCartPresenter$Factory$Impl = (LocalBrandLocationCartPresenter$Factory$Impl) this.locationCartPresenter.value;
            LocalBrandLocationOpenTabPresenter$Factory$Impl localBrandLocationOpenTabPresenter$Factory$Impl = (LocalBrandLocationOpenTabPresenter$Factory$Impl) this.locationOpenTabPresenter.value;
            LocalBrandLocationCheckoutPresenter$Factory$Impl localBrandLocationCheckoutPresenter$Factory$Impl = (LocalBrandLocationCheckoutPresenter$Factory$Impl) this.locationCheckoutPresenter.value;
            LocalOpenTabCheckoutPresenter$Factory$Impl localOpenTabCheckoutPresenter$Factory$Impl = (LocalOpenTabCheckoutPresenter$Factory$Impl) this.openTabCheckoutPresenter.value;
            LocalCheckoutDeeplinkPresenter$Factory$Impl localCheckoutDeeplinkPresenter$Factory$Impl = (LocalCheckoutDeeplinkPresenter$Factory$Impl) this.checkoutDeeplinkPresenter.value;
            LocalOrderStatusPresenter$Factory$Impl localOrderStatusPresenter$Factory$Impl = (LocalOrderStatusPresenter$Factory$Impl) this.localOrderStatusPresenter.value;
            LocalBrandLocationMenuPresenter$Factory$Impl localBrandLocationMenuPresenter$Factory$Impl = (LocalBrandLocationMenuPresenter$Factory$Impl) this.localMenuPresenter.value;
            LocalMenuItemDetailsPresenter$Factory$Impl localMenuItemDetailsPresenter$Factory$Impl = (LocalMenuItemDetailsPresenter$Factory$Impl) this.localMenuItemDetailsPresenter.value;
            LocalMenuComboDetailsPresenter$Factory$Impl localMenuComboDetailsPresenter$Factory$Impl = (LocalMenuComboDetailsPresenter$Factory$Impl) this.localMenuComboDetailsPresenter.value;
            LocalExplanatoryDialogPresenter$Factory$Impl localExplanatoryDialogPresenter$Factory$Impl = (LocalExplanatoryDialogPresenter$Factory$Impl) this.localExplanatoryDialogPresenter.value;
            LocalHomePresenter$Factory$Impl localHomePresenter$Factory$Impl = (LocalHomePresenter$Factory$Impl) this.localHomePresenter.value;
            LocalCashBalancePresenter$Factory$Impl localCashBalancePresenter$Factory$Impl = (LocalCashBalancePresenter$Factory$Impl) this.localCashBalancePresenter.value;
            LocalAddBrandsPresenter$Factory$Impl localAddBrandsPresenter$Factory$Impl = (LocalAddBrandsPresenter$Factory$Impl) this.localAddBrandsPresenter.value;
            EducationalSheetPresenter$Factory$Impl educationalSheetPresenter$Factory$Impl = (EducationalSheetPresenter$Factory$Impl) this.educationalSheetPresenter.invoke();
            LocalShortlinkPresenter$Factory$Impl localShortlinkPresenter$Factory$Impl = (LocalShortlinkPresenter$Factory$Impl) this.shortlinkPresenter.value;
            LocalBrandCollectionMapPresenter$Factory$Impl localBrandCollectionMapPresenter$Factory$Impl = (LocalBrandCollectionMapPresenter$Factory$Impl) this.brandCollectionMapPresenter.value;
            FulfillmentPickerPresenter$Factory$Impl fulfillmentPickerPresenter$Factory$Impl = (FulfillmentPickerPresenter$Factory$Impl) this.fulfillmentPickerPresenter.value;
            LocalEditorialPresenter$Factory$Impl localEditorialPresenter$Factory$Impl = (LocalEditorialPresenter$Factory$Impl) this.localEditorialPresenter.value;
            LoyaltySheetPresenter$Factory$Impl loyaltySheetPresenter$Factory$Impl = (LoyaltySheetPresenter$Factory$Impl) this.loyaltySheetPresenter.value;
            SchedulingDayTimePickerPresenter$Factory$Impl schedulingDayTimePickerPresenter$Factory$Impl = (SchedulingDayTimePickerPresenter$Factory$Impl) this.schedulingDayTimePickerPresenter.value;
            MarketingMessagePresenter$Factory$Impl marketingMessagePresenter$Factory$Impl = (MarketingMessagePresenter$Factory$Impl) this.marketingMessagePresenter.value;
            MarketingMessagesPresenter$Factory$Impl marketingMessagesPresenter$Factory$Impl = (MarketingMessagesPresenter$Factory$Impl) this.marketingMessagesPresenter.value;
            LocalCashAllActivityPresenter$Factory$Impl localCashAllActivityPresenter$Factory$Impl = (LocalCashAllActivityPresenter$Factory$Impl) this.allActivityPresenter.value;
            TableQrCodeScannerPresenter$Factory$Impl tableQrCodeScannerPresenter$Factory$Impl = (TableQrCodeScannerPresenter$Factory$Impl) this.tableQrCodeScannerPresenter.value;
            LocalPosBrandOnboardingPresenter$Factory$Impl localPosBrandOnboardingPresenter$Factory$Impl = (LocalPosBrandOnboardingPresenter$Factory$Impl) this.posBrandOnboardingPresenter.value;
            LocalPosLocalCashRedemptionPresenter$Factory$Impl localPosLocalCashRedemptionPresenter$Factory$Impl = (LocalPosLocalCashRedemptionPresenter$Factory$Impl) this.posLocalCashRedemptionPresenter.value;
            LocalPosCheckInPresenter$Factory$Impl localPosCheckInPresenter$Factory$Impl = (LocalPosCheckInPresenter$Factory$Impl) this.posCheckInPresenter.value;
            LocalMenuPickerSheetPresenter$Factory$Impl localMenuPickerSheetPresenter$Factory$Impl = (LocalMenuPickerSheetPresenter$Factory$Impl) this.menuPickerSheetPresenter.value;
            CurbsidePickupCarPresenter$Factory$Impl curbsidePickupCarPresenter$Factory$Impl = (CurbsidePickupCarPresenter$Factory$Impl) this.curbsidePickupCarPresenter.value;
            localBrandProfilePresenter$Factory$Impl.getClass();
            localBrandLocationCartPresenter$Factory$Impl.getClass();
            localBrandLocationOpenTabPresenter$Factory$Impl.getClass();
            localBrandLocationCheckoutPresenter$Factory$Impl.getClass();
            localOpenTabCheckoutPresenter$Factory$Impl.getClass();
            localCheckoutDeeplinkPresenter$Factory$Impl.getClass();
            localOrderStatusPresenter$Factory$Impl.getClass();
            localBrandLocationMenuPresenter$Factory$Impl.getClass();
            localMenuItemDetailsPresenter$Factory$Impl.getClass();
            localMenuComboDetailsPresenter$Factory$Impl.getClass();
            localExplanatoryDialogPresenter$Factory$Impl.getClass();
            localHomePresenter$Factory$Impl.getClass();
            localCashBalancePresenter$Factory$Impl.getClass();
            localAddBrandsPresenter$Factory$Impl.getClass();
            educationalSheetPresenter$Factory$Impl.getClass();
            localShortlinkPresenter$Factory$Impl.getClass();
            localBrandCollectionMapPresenter$Factory$Impl.getClass();
            fulfillmentPickerPresenter$Factory$Impl.getClass();
            localEditorialPresenter$Factory$Impl.getClass();
            loyaltySheetPresenter$Factory$Impl.getClass();
            schedulingDayTimePickerPresenter$Factory$Impl.getClass();
            marketingMessagePresenter$Factory$Impl.getClass();
            marketingMessagesPresenter$Factory$Impl.getClass();
            localCashAllActivityPresenter$Factory$Impl.getClass();
            tableQrCodeScannerPresenter$Factory$Impl.getClass();
            localPosBrandOnboardingPresenter$Factory$Impl.getClass();
            localPosLocalCashRedemptionPresenter$Factory$Impl.getClass();
            localPosCheckInPresenter$Factory$Impl.getClass();
            localMenuPickerSheetPresenter$Factory$Impl.getClass();
            curbsidePickupCarPresenter$Factory$Impl.getClass();
            return new LocalPresenterFactory(localBrandProfilePresenter$Factory$Impl, localBrandLocationCartPresenter$Factory$Impl, localBrandLocationOpenTabPresenter$Factory$Impl, localBrandLocationCheckoutPresenter$Factory$Impl, localOpenTabCheckoutPresenter$Factory$Impl, localCheckoutDeeplinkPresenter$Factory$Impl, localOrderStatusPresenter$Factory$Impl, localBrandLocationMenuPresenter$Factory$Impl, localMenuItemDetailsPresenter$Factory$Impl, localMenuComboDetailsPresenter$Factory$Impl, localExplanatoryDialogPresenter$Factory$Impl, localHomePresenter$Factory$Impl, localCashBalancePresenter$Factory$Impl, localAddBrandsPresenter$Factory$Impl, educationalSheetPresenter$Factory$Impl, localShortlinkPresenter$Factory$Impl, localBrandCollectionMapPresenter$Factory$Impl, fulfillmentPickerPresenter$Factory$Impl, localEditorialPresenter$Factory$Impl, loyaltySheetPresenter$Factory$Impl, schedulingDayTimePickerPresenter$Factory$Impl, marketingMessagePresenter$Factory$Impl, marketingMessagesPresenter$Factory$Impl, localCashAllActivityPresenter$Factory$Impl, tableQrCodeScannerPresenter$Factory$Impl, localPosBrandOnboardingPresenter$Factory$Impl, localPosLocalCashRedemptionPresenter$Factory$Impl, localPosCheckInPresenter$Factory$Impl, localMenuPickerSheetPresenter$Factory$Impl, curbsidePickupCarPresenter$Factory$Impl);
        }
    }

    public LocalPresenterFactory(ProfilePresenter$Factory$Impl profilePresenter$Factory$Impl, RealProfilePreviewPresenter$Factory$Impl realProfilePreviewPresenter$Factory$Impl, ProfileCompleteActivityPresenter$Factory$Impl profileCompleteActivityPresenter$Factory$Impl, ErrorPresenter$Factory$Impl errorPresenter$Factory$Impl, ProfilePasswordDialogPresenter$Factory$Impl profilePasswordDialogPresenter$Factory$Impl, GenericConfirmDialogPresenter$Factory$Impl genericConfirmDialogPresenter$Factory$Impl, ProfileSecurityPresenter$Factory$Impl profileSecurityPresenter$Factory$Impl, ProfilePrivacyPresenter$Factory$Impl profilePrivacyPresenter$Factory$Impl, IncomingRequestsPresenter$Factory$Impl incomingRequestsPresenter$Factory$Impl, RealProfilePasscodePresenter$Factory$Impl realProfilePasscodePresenter$Factory$Impl, InvestingContactPresenter$Factory$Impl investingContactPresenter$Factory$Impl, ProfileCashtagRequiredPresenter$Factory$Impl profileCashtagRequiredPresenter$Factory$Impl, ProfilePersonalPresenter$Factory$Impl profilePersonalPresenter$Factory$Impl, ConfirmReplaceInfoPresenter$Factory$Impl confirmReplaceInfoPresenter$Factory$Impl, ReferralStatusPresenter$Factory$Impl referralStatusPresenter$Factory$Impl, ProfileNotificationsPresenter$Factory$Impl profileNotificationsPresenter$Factory$Impl, ContactMethodDetailsPresenter$Factory$Impl contactMethodDetailsPresenter$Factory$Impl, ChannelListPresenter$Factory$Impl channelListPresenter$Factory$Impl, CategoryListPresenter$Factory$Impl categoryListPresenter$Factory$Impl, PersonalInfoConfirmationDialogPresenter$Factory$Impl personalInfoConfirmationDialogPresenter$Factory$Impl, ArcadeAutofillSettingsDetailPresenter$Factory$Impl arcadeAutofillSettingsDetailPresenter$Factory$Impl, FamilyEligibilityLoadingPresenter$Factory$Impl familyEligibilityLoadingPresenter$Factory$Impl, AddAliasPresenter$Factory$Impl addAliasPresenter$Factory$Impl, AddressSheetPresenter$Factory$Impl addressSheetPresenter$Factory$Impl, AppMessagesOptionsPresenter$Factory$Impl appMessagesOptionsPresenter$Factory$Impl, PaymentNotificationOptionsPresenter$Factory$Impl paymentNotificationOptionsPresenter$Factory$Impl, OpenSourcePresenter$Factory$Impl openSourcePresenter$Factory$Impl, ProfileCropPresenter$Factory$Impl profileCropPresenter$Factory$Impl, ProfileHeaderMenuPresenter$Factory$Impl profileHeaderMenuPresenter$Factory$Impl, RingtonePresenter$Factory$Impl ringtonePresenter$Factory$Impl, ProfileConfirmRemoveAliasPresenter$Factory$Impl profileConfirmRemoveAliasPresenter$Factory$Impl, UnsupportedSettingPresenter$Factory$Impl unsupportedSettingPresenter$Factory$Impl, ProfileConfirmSignOutPresenter$Factory$Impl profileConfirmSignOutPresenter$Factory$Impl, AdjustableThresholdPresenter$Factory$Impl adjustableThresholdPresenter$Factory$Impl, EnableAliasSheetPresenter$Factory$Impl enableAliasSheetPresenter$Factory$Impl, RealSearchPrivacySettingsPresenter$Factory$Impl realSearchPrivacySettingsPresenter$Factory$Impl, TaxesPasswordPresenter$Factory$Impl taxesPasswordPresenter$Factory$Impl) {
        this.brandProfilePresenter = profilePresenter$Factory$Impl;
        this.locationCartPresenter = realProfilePreviewPresenter$Factory$Impl;
        this.locationOpenTabPresenter = profileCompleteActivityPresenter$Factory$Impl;
        this.locationCheckoutPresenter = errorPresenter$Factory$Impl;
        this.openTabCheckoutPresenter = profilePasswordDialogPresenter$Factory$Impl;
        this.checkoutDeeplinkPresenter = profileSecurityPresenter$Factory$Impl;
        this.localOrderStatusPresenter = profilePrivacyPresenter$Factory$Impl;
        this.localMenuPresenter = incomingRequestsPresenter$Factory$Impl;
        this.localMenuItemDetailsPresenter = realProfilePasscodePresenter$Factory$Impl;
        this.localMenuComboDetailsPresenter = investingContactPresenter$Factory$Impl;
        this.localExplanatoryDialogPresenter = profileCashtagRequiredPresenter$Factory$Impl;
        this.localHomePresenter = profilePersonalPresenter$Factory$Impl;
        this.localCashBalancePresenter = confirmReplaceInfoPresenter$Factory$Impl;
        this.localAddBrandsPresenter = referralStatusPresenter$Factory$Impl;
        this.educationalSheetPresenter = profileNotificationsPresenter$Factory$Impl;
        this.shortlinkPresenter = contactMethodDetailsPresenter$Factory$Impl;
        this.brandCollectionMapPresenter = channelListPresenter$Factory$Impl;
        this.fulfillmentPickerPresenter = categoryListPresenter$Factory$Impl;
        this.localEditorialPresenter = personalInfoConfirmationDialogPresenter$Factory$Impl;
        this.loyaltySheetPresenter = arcadeAutofillSettingsDetailPresenter$Factory$Impl;
        this.schedulingDayTimePickerPresenter = familyEligibilityLoadingPresenter$Factory$Impl;
        this.marketingMessagePresenter = appMessagesOptionsPresenter$Factory$Impl;
        this.marketingMessagesPresenter = openSourcePresenter$Factory$Impl;
        this.allActivityPresenter = unsupportedSettingPresenter$Factory$Impl;
        this.tableQrCodeScannerPresenter = profileConfirmSignOutPresenter$Factory$Impl;
        this.posBrandOnboardingPresenter = adjustableThresholdPresenter$Factory$Impl;
        this.posLocalCashRedemptionPresenter = enableAliasSheetPresenter$Factory$Impl;
        this.posCheckInPresenter = realSearchPrivacySettingsPresenter$Factory$Impl;
        this.curbsidePickupCarPresenter = taxesPasswordPresenter$Factory$Impl;
    }

    private final Presenter create$app$cash$local$presenters$LocalPresenterFactory(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (!(screen instanceof LocalScreen)) {
            return null;
        }
        LocalScreen localScreen = (LocalScreen) screen;
        if (localScreen instanceof LocalBrandProfileScreen) {
            return MoleculePresenterKt.asPresenter$default(((LocalBrandProfilePresenter$Factory$Impl) this.brandProfilePresenter).create((LocalBrandProfileScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalBrandLocationCartScreen) {
            FilesetUploadPresenter.MetroFactory metroFactory = ((LocalBrandLocationCartPresenter$Factory$Impl) this.locationCartPresenter).delegateFactory;
            CartBuilderManager cartBuilderManager = (CartBuilderManager) metroFactory.analytics.getValue();
            SessionManager sessionManager = (SessionManager) metroFactory.stringManager.lambda.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.errorReporter.lambda.invoke();
            RealLocalBrandRepository realLocalBrandRepository = (RealLocalBrandRepository) metroFactory.blockersNavigator.invoke();
            RealOrderBuilderStore realOrderBuilderStore = (RealOrderBuilderStore) metroFactory.fileTypeDescriber.invoke();
            LocalInstalledStore localInstalledStore = (LocalInstalledStore) metroFactory.fileValidatorFactory.invoke();
            LocalService localService = (LocalService) metroFactory.fileUploadService.getValue();
            RealOrderBuilder$Factory$Impl realOrderBuilder$Factory$Impl = (RealOrderBuilder$Factory$Impl) metroFactory.imageFormatConverterFactory.invoke();
            RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) metroFactory.service.getValue();
            Analytics analytics = (Analytics) ((DoubleCheck) metroFactory.franklinAppService).getValue();
            FulfillmentTimeUtils fulfillmentTimeUtils = (FulfillmentTimeUtils) metroFactory.blockersHelperFactory.invoke();
            LocalOpenTabCartMapper localOpenTabCartMapper = (LocalOpenTabCartMapper) metroFactory.permissionManager.invoke();
            LocalCartCheckoutNavigator localCartCheckoutNavigator = (LocalCartCheckoutNavigator) metroFactory.featureFlagManager.invoke();
            RealLocalLauncher realLocalLauncher = (RealLocalLauncher) metroFactory.cameraLauncherFactory.invoke();
            RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.fileProvider.lambda.invoke();
            BuyerIntentManager buyerIntentManager = (BuyerIntentManager) ((DoubleCheck) metroFactory.storage).getValue();
            cartBuilderManager.getClass();
            sessionManager.getClass();
            androidStringManager.getClass();
            realLocalBrandRepository.getClass();
            realOrderBuilderStore.getClass();
            localInstalledStore.getClass();
            localService.getClass();
            realOrderBuilder$Factory$Impl.getClass();
            realLocalBrandSyncer.getClass();
            analytics.getClass();
            fulfillmentTimeUtils.getClass();
            localOpenTabCartMapper.getClass();
            localCartCheckoutNavigator.getClass();
            realLocalLauncher.getClass();
            realUuidGenerator.getClass();
            buyerIntentManager.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalBrandLocationCartPresenter(cartBuilderManager, sessionManager, androidStringManager, realLocalBrandRepository, realOrderBuilderStore, localInstalledStore, localService, realOrderBuilder$Factory$Impl, realLocalBrandSyncer, analytics, fulfillmentTimeUtils, localOpenTabCartMapper, localCartCheckoutNavigator, realLocalLauncher, realUuidGenerator, buyerIntentManager, (LocalBrandLocationCartScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalBrandLocationOpenTabScreen) {
            VerifyCheckDepositPresenter.MetroFactory metroFactory2 = ((LocalBrandLocationOpenTabPresenter$Factory$Impl) this.locationOpenTabPresenter).delegateFactory;
            AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
            CartBuilderManager cartBuilderManager2 = (CartBuilderManager) metroFactory2.analytics.getValue();
            RealLocalBrandRepository realLocalBrandRepository2 = (RealLocalBrandRepository) metroFactory2.blockerFlowAnalytics.invoke();
            RealLocalBrandSyncer realLocalBrandSyncer2 = (RealLocalBrandSyncer) metroFactory2.appService.getValue();
            LocalOpenTabCartMapper localOpenTabCartMapper2 = (LocalOpenTabCartMapper) metroFactory2.blockersNavigator.invoke();
            LocalCartCheckoutNavigator localCartCheckoutNavigator2 = (LocalCartCheckoutNavigator) metroFactory2.moneyFormatterFactory.invoke();
            androidStringManager2.getClass();
            cartBuilderManager2.getClass();
            realLocalBrandRepository2.getClass();
            realLocalBrandSyncer2.getClass();
            localOpenTabCartMapper2.getClass();
            localCartCheckoutNavigator2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalBrandLocationOpenTabPresenter(androidStringManager2, cartBuilderManager2, realLocalBrandRepository2, realLocalBrandSyncer2, localOpenTabCartMapper2, localCartCheckoutNavigator2, (LocalBrandLocationOpenTabScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalBrandLocationCheckoutScreen) {
            NodeChain nodeChain = ((LocalBrandLocationCheckoutPresenter$Factory$Impl) this.locationCheckoutPresenter).delegateFactory;
            AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) nodeChain.layoutNode).lambda.invoke();
            RealLocalBrandRepository realLocalBrandRepository3 = (RealLocalBrandRepository) ((Provider) nodeChain.sentinelHead).invoke();
            RealOrderBuilderStore realOrderBuilderStore2 = (RealOrderBuilderStore) ((Provider) nodeChain.innerCoordinator).invoke();
            AndroidClock androidClock = (AndroidClock) ((LambdaProvider) nodeChain.outerCoordinator).lambda.invoke();
            RealLocalLauncher realLocalLauncher2 = (RealLocalLauncher) ((Provider) nodeChain.tail).invoke();
            LocalInstalledStore localInstalledStore2 = (LocalInstalledStore) ((Provider) nodeChain.head).invoke();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) nodeChain.current).getValue();
            Analytics analytics2 = (Analytics) ((DoubleCheck) nodeChain.buffer).getValue();
            SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) nodeChain.stack).lambda.invoke();
            FulfillmentTimeUtils fulfillmentTimeUtils2 = (FulfillmentTimeUtils) ((Provider) nodeChain.cachedDiffer).invoke();
            androidStringManager3.getClass();
            realLocalBrandRepository3.getClass();
            realOrderBuilderStore2.getClass();
            androidClock.getClass();
            realLocalLauncher2.getClass();
            localInstalledStore2.getClass();
            featureFlagManager.getClass();
            analytics2.getClass();
            sessionManager2.getClass();
            fulfillmentTimeUtils2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalBrandLocationCheckoutPresenter(androidStringManager3, realLocalBrandRepository3, realOrderBuilderStore2, androidClock, realLocalLauncher2, localInstalledStore2, featureFlagManager, analytics2, sessionManager2, fulfillmentTimeUtils2, (LocalBrandLocationCheckoutScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalBrandLocationOpenTabCheckoutScreen) {
            LocalOpenTabCheckoutPresenter$Factory$Impl localOpenTabCheckoutPresenter$Factory$Impl = (LocalOpenTabCheckoutPresenter$Factory$Impl) this.openTabCheckoutPresenter;
            LocalOpenTabCheckoutPresenter$Args access$toOpenTabCheckoutArgs = LocalPresenterFactoryKt.access$toOpenTabCheckoutArgs((LocalBrandLocationOpenTabCheckoutScreen) screen);
            zzlj zzljVar = localOpenTabCheckoutPresenter$Factory$Impl.delegateFactory;
            AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) zzljVar.zza).lambda.invoke();
            RealLocalBrandRepository realLocalBrandRepository4 = (RealLocalBrandRepository) ((Provider) zzljVar.zzb).invoke();
            RealOrderBuilderStore realOrderBuilderStore3 = (RealOrderBuilderStore) ((Provider) zzljVar.zzc).invoke();
            LocalInstalledStore localInstalledStore3 = (LocalInstalledStore) ((Provider) zzljVar.zze).invoke();
            RealLocalLauncher realLocalLauncher3 = (RealLocalLauncher) ((Provider) zzljVar.zzd).invoke();
            AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) zzljVar.zzf).lambda.invoke();
            androidStringManager4.getClass();
            realLocalBrandRepository4.getClass();
            realOrderBuilderStore3.getClass();
            localInstalledStore3.getClass();
            realLocalLauncher3.getClass();
            androidClock2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(androidStringManager4, realLocalBrandRepository4, realOrderBuilderStore3, localInstalledStore3, realLocalLauncher3, androidClock2, access$toOpenTabCheckoutArgs, screenNavigator));
        }
        if (localScreen instanceof LocalCheckoutDeeplinkScreen) {
            BankingSectionsPresenter.MetroFactory metroFactory3 = ((LocalCheckoutDeeplinkPresenter$Factory$Impl) this.checkoutDeeplinkPresenter).delegateFactory;
            RealLocalOrderRepository realLocalOrderRepository = (RealLocalOrderRepository) metroFactory3.analytics.getValue();
            RealLocalBrandSyncer realLocalBrandSyncer3 = (RealLocalBrandSyncer) metroFactory3.syncValueReader.getValue();
            RealLocalBrandRepository realLocalBrandRepository5 = (RealLocalBrandRepository) metroFactory3.blockersHelperFactory.invoke();
            CartBuilderManager cartBuilderManager3 = (CartBuilderManager) metroFactory3.featureFlagManager.getValue();
            RealOrderBuilder$Factory$Impl realOrderBuilder$Factory$Impl2 = (RealOrderBuilder$Factory$Impl) metroFactory3.bankingOptionBadgeUpdater.invoke();
            RealOrderBuilderStore realOrderBuilderStore4 = (RealOrderBuilderStore) metroFactory3.routerFactory.invoke();
            realLocalOrderRepository.getClass();
            realLocalBrandSyncer3.getClass();
            realLocalBrandRepository5.getClass();
            cartBuilderManager3.getClass();
            realOrderBuilder$Factory$Impl2.getClass();
            realOrderBuilderStore4.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realLocalOrderRepository, realLocalBrandSyncer3, realLocalBrandRepository5, cartBuilderManager3, realOrderBuilder$Factory$Impl2, realOrderBuilderStore4, (LocalCheckoutDeeplinkScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalBrandLocationMenuScreen) {
            ImageLoader$Builder imageLoader$Builder = ((LocalBrandLocationMenuPresenter$Factory$Impl) this.localMenuPresenter).delegateFactory;
            CartBuilderManager cartBuilderManager4 = (CartBuilderManager) ((DoubleCheck) imageLoader$Builder.application).getValue();
            RealLocalBrandRepository realLocalBrandRepository6 = (RealLocalBrandRepository) ((Provider) imageLoader$Builder.defaults).invoke();
            LocalInstalledStore localInstalledStore4 = (LocalInstalledStore) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
            RealLocalBrandSyncer realLocalBrandSyncer4 = (RealLocalBrandSyncer) ((DoubleCheck) imageLoader$Builder.memoryCacheLazy).getValue();
            RealLocalLauncher realLocalLauncher4 = (RealLocalLauncher) ((Provider) imageLoader$Builder.diskCacheLazy).invoke();
            AndroidStringManager androidStringManager5 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.eventListenerFactory).lambda.invoke();
            AndroidClock androidClock3 = (AndroidClock) ((LambdaProvider) imageLoader$Builder.componentRegistry).lambda.invoke();
            BuyerIntentManager buyerIntentManager2 = (BuyerIntentManager) ((DoubleCheck) imageLoader$Builder.extras).getValue();
            cartBuilderManager4.getClass();
            realLocalBrandRepository6.getClass();
            localInstalledStore4.getClass();
            realLocalBrandSyncer4.getClass();
            realLocalLauncher4.getClass();
            androidStringManager5.getClass();
            androidClock3.getClass();
            buyerIntentManager2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalBrandLocationMenuPresenter(cartBuilderManager4, realLocalBrandRepository6, localInstalledStore4, realLocalBrandSyncer4, realLocalLauncher4, androidStringManager5, androidClock3, buyerIntentManager2, (LocalBrandLocationMenuScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalMenuItemDetailsScreen) {
            BitcoinMapPresenter.MetroFactory metroFactory4 = ((LocalMenuItemDetailsPresenter$Factory$Impl) this.localMenuItemDetailsPresenter).delegateFactory;
            Analytics analytics3 = (Analytics) metroFactory4.cashDatabase.getValue();
            AndroidStringManager androidStringManager6 = (AndroidStringManager) metroFactory4.clock.lambda.invoke();
            CartBuilderManager cartBuilderManager5 = (CartBuilderManager) metroFactory4.cryptoService.getValue();
            RealLocalBrandRepository realLocalBrandRepository7 = (RealLocalBrandRepository) metroFactory4.cashMapPresenterFactory.invoke();
            SessionManager sessionManager3 = (SessionManager) metroFactory4.stringManager.lambda.invoke();
            LocalInstalledStore localInstalledStore5 = (LocalInstalledStore) metroFactory4.bitcoinMapEligibilityManager.invoke();
            RealLocalBrandSyncer realLocalBrandSyncer5 = (RealLocalBrandSyncer) metroFactory4.locationSearchClient.getValue();
            BuyerIntentManager buyerIntentManager3 = (BuyerIntentManager) metroFactory4.analytics.getValue();
            analytics3.getClass();
            androidStringManager6.getClass();
            cartBuilderManager5.getClass();
            realLocalBrandRepository7.getClass();
            sessionManager3.getClass();
            localInstalledStore5.getClass();
            realLocalBrandSyncer5.getClass();
            buyerIntentManager3.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalMenuItemDetailsPresenter(analytics3, androidStringManager6, cartBuilderManager5, realLocalBrandRepository7, sessionManager3, localInstalledStore5, realLocalBrandSyncer5, buyerIntentManager3, screenNavigator, (LocalMenuItemDetailsScreen) screen));
        }
        if (localScreen instanceof LocalMenuComboDetailsScreen) {
            BitcoinMapPresenter.MetroFactory metroFactory5 = ((LocalMenuComboDetailsPresenter$Factory$Impl) this.localMenuComboDetailsPresenter).delegateFactory;
            Analytics analytics4 = (Analytics) metroFactory5.cashDatabase.getValue();
            AndroidStringManager androidStringManager7 = (AndroidStringManager) metroFactory5.clock.lambda.invoke();
            CartBuilderManager cartBuilderManager6 = (CartBuilderManager) metroFactory5.cryptoService.getValue();
            RealLocalBrandRepository realLocalBrandRepository8 = (RealLocalBrandRepository) metroFactory5.cashMapPresenterFactory.invoke();
            SessionManager sessionManager4 = (SessionManager) metroFactory5.stringManager.lambda.invoke();
            LocalInstalledStore localInstalledStore6 = (LocalInstalledStore) metroFactory5.bitcoinMapEligibilityManager.invoke();
            RealLocalBrandSyncer realLocalBrandSyncer6 = (RealLocalBrandSyncer) metroFactory5.locationSearchClient.getValue();
            BuyerIntentManager buyerIntentManager4 = (BuyerIntentManager) metroFactory5.analytics.getValue();
            analytics4.getClass();
            androidStringManager7.getClass();
            cartBuilderManager6.getClass();
            realLocalBrandRepository8.getClass();
            sessionManager4.getClass();
            localInstalledStore6.getClass();
            realLocalBrandSyncer6.getClass();
            buyerIntentManager4.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalMenuComboDetailsPresenter(analytics4, androidStringManager7, cartBuilderManager6, realLocalBrandRepository8, sessionManager4, localInstalledStore6, realLocalBrandSyncer6, buyerIntentManager4, screenNavigator, (LocalMenuComboDetailsScreen) screen));
        }
        if (localScreen instanceof LocalOrderStatusScreen) {
            LocalOrderStatusPresenter.MetroFactory metroFactory6 = ((LocalOrderStatusPresenter$Factory$Impl) this.localOrderStatusPresenter).delegateFactory;
            AndroidStringManager androidStringManager8 = (AndroidStringManager) metroFactory6.stringManager.lambda.invoke();
            RealClipboardManager realClipboardManager = (RealClipboardManager) metroFactory6.clipboardManager.lambda.invoke();
            RealLocalLauncher realLocalLauncher5 = (RealLocalLauncher) metroFactory6.launcher.invoke();
            RealLocalOrderRepository realLocalOrderRepository2 = (RealLocalOrderRepository) metroFactory6.localOrderRepository.getValue();
            SessionManager sessionManager5 = (SessionManager) metroFactory6.sessionManager.lambda.invoke();
            Analytics analytics5 = (Analytics) metroFactory6.analytics.getValue();
            FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory6.featureFlagManager.getValue();
            androidStringManager8.getClass();
            realClipboardManager.getClass();
            realLocalLauncher5.getClass();
            realLocalOrderRepository2.getClass();
            sessionManager5.getClass();
            analytics5.getClass();
            featureFlagManager2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalOrderStatusPresenter(androidStringManager8, realClipboardManager, realLocalLauncher5, realLocalOrderRepository2, sessionManager5, analytics5, featureFlagManager2, (LocalOrderStatusScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalExplanatoryDialog) {
            TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = ((LocalExplanatoryDialogPresenter$Factory$Impl) this.localExplanatoryDialogPresenter).delegateFactory;
            AndroidStringManager androidStringManager9 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
            IntentLauncher intentLauncher = (IntentLauncher) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
            androidStringManager9.getClass();
            intentLauncher.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter(androidStringManager9, intentLauncher, (LocalExplanatoryDialog) screen, screenNavigator));
        }
        if (localScreen instanceof LocalEducationalSheet) {
            return MoleculePresenterKt.asPresenter$default(((EducationalSheetPresenter$Factory$Impl) this.educationalSheetPresenter).create((LocalEducationalSheet) screen, screenNavigator));
        }
        if (localScreen instanceof LocalPosBrandOnboardingScreen) {
            HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = ((LocalPosBrandOnboardingPresenter$Factory$Impl) this.posBrandOnboardingPresenter).delegateFactory;
            AndroidStringManager androidStringManager10 = (AndroidStringManager) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
            RealLocalLauncher realLocalLauncher6 = (RealLocalLauncher) helpSheetPresenter$MetroFactory.routerFactory.invoke();
            RealCashLocalShortlinkHandler realCashLocalShortlinkHandler = (RealCashLocalShortlinkHandler) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
            Analytics analytics6 = (Analytics) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
            androidStringManager10.getClass();
            realLocalLauncher6.getClass();
            realCashLocalShortlinkHandler.getClass();
            analytics6.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosBrandOnboardingPresenter(androidStringManager10, realLocalLauncher6, realCashLocalShortlinkHandler, analytics6, (LocalPosBrandOnboardingScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalPosLocalCashRedemptionScreen) {
            MerchantPickerPresenter$MetroFactory merchantPickerPresenter$MetroFactory = ((LocalPosLocalCashRedemptionPresenter$Factory$Impl) this.posLocalCashRedemptionPresenter).delegateFactory;
            Analytics analytics7 = (Analytics) merchantPickerPresenter$MetroFactory.selectedMerchantProvider.getValue();
            LocalInstalledStore localInstalledStore7 = (LocalInstalledStore) merchantPickerPresenter$MetroFactory.sellerCardViewModelProducer.invoke();
            LocalService localService2 = (LocalService) merchantPickerPresenter$MetroFactory.selectedMerchantSetter.getValue();
            FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) merchantPickerPresenter$MetroFactory.merchantRepository.getValue();
            analytics7.getClass();
            localInstalledStore7.getClass();
            localService2.getClass();
            featureFlagManager3.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosLocalCashRedemptionPresenter(analytics7, localInstalledStore7, localService2, featureFlagManager3, (LocalPosLocalCashRedemptionScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalShortlinkSheet) {
            LoadTimeClock.MetroFactory metroFactory7 = ((LocalShortlinkPresenter$Factory$Impl) this.shortlinkPresenter).delegateFactory;
            EducationalSheetPresenter$Factory$Impl educationalSheetPresenter$Factory$Impl = (EducationalSheetPresenter$Factory$Impl) metroFactory7.clock.invoke();
            RealCashLocalShortlinkHandler realCashLocalShortlinkHandler2 = (RealCashLocalShortlinkHandler) metroFactory7.observabilityManager.invoke();
            educationalSheetPresenter$Factory$Impl.getClass();
            realCashLocalShortlinkHandler2.getClass();
            return MoleculePresenterKt.asPresenter$default(new MusicPresenter(educationalSheetPresenter$Factory$Impl, realCashLocalShortlinkHandler2, (LocalShortlinkSheet) screen, screenNavigator));
        }
        if (localScreen instanceof LocalEditorialScreen) {
            LocalEditorialPresenter.MetroFactory metroFactory8 = ((LocalEditorialPresenter$Factory$Impl) this.localEditorialPresenter).delegateFactory;
            RealLocalLauncher realLocalLauncher7 = (RealLocalLauncher) metroFactory8.launcher.invoke();
            LocalService localService3 = (LocalService) metroFactory8.service.getValue();
            LocalInstalledStore localInstalledStore8 = (LocalInstalledStore) metroFactory8.installedStore.invoke();
            LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl = (LocalResponseContextHandler$Factory$Impl) metroFactory8.responseContextHandlerFactory.invoke();
            AndroidClock androidClock4 = (AndroidClock) metroFactory8.clock.lambda.invoke();
            AndroidStringManager androidStringManager11 = (AndroidStringManager) metroFactory8.stringManager.lambda.invoke();
            realLocalLauncher7.getClass();
            localService3.getClass();
            localInstalledStore8.getClass();
            localResponseContextHandler$Factory$Impl.getClass();
            androidClock4.getClass();
            androidStringManager11.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realLocalLauncher7, localService3, localInstalledStore8, localResponseContextHandler$Factory$Impl, androidClock4, androidStringManager11, (LocalEditorialScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalFulfillmentPickerScreen) {
            LocalCashBalancePresenter.MetroFactory metroFactory9 = ((FulfillmentPickerPresenter$Factory$Impl) this.fulfillmentPickerPresenter).delegateFactory;
            AndroidStringManager androidStringManager12 = (AndroidStringManager) metroFactory9.sessionManager.lambda.invoke();
            AndroidClock androidClock5 = (AndroidClock) metroFactory9.stringManager.lambda.invoke();
            LocalService localService4 = (LocalService) metroFactory9.syncer.getValue();
            RealLocalLauncher realLocalLauncher8 = (RealLocalLauncher) metroFactory9.launcher.invoke();
            RealLocalBrandSyncer realLocalBrandSyncer7 = (RealLocalBrandSyncer) metroFactory9.analytics.getValue();
            RealLocalBrandRepository realLocalBrandRepository9 = (RealLocalBrandRepository) metroFactory9.timestampFormatterFactory.invoke();
            LocalInstalledStore localInstalledStore9 = (LocalInstalledStore) metroFactory9.store.invoke();
            SessionManager sessionManager6 = (SessionManager) metroFactory9.clock.lambda.invoke();
            Analytics analytics8 = (Analytics) metroFactory9.service.getValue();
            androidStringManager12.getClass();
            androidClock5.getClass();
            localService4.getClass();
            realLocalLauncher8.getClass();
            realLocalBrandSyncer7.getClass();
            realLocalBrandRepository9.getClass();
            localInstalledStore9.getClass();
            sessionManager6.getClass();
            analytics8.getClass();
            return MoleculePresenterKt.asPresenter$default(new FulfillmentPickerPresenter(androidStringManager12, androidClock5, localService4, realLocalLauncher8, realLocalBrandSyncer7, realLocalBrandRepository9, localInstalledStore9, sessionManager6, analytics8, (LocalFulfillmentPickerScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalLoyaltySheet) {
            AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LoyaltySheetPresenter$Factory$Impl) this.loyaltySheetPresenter).delegateFactory.stringManager.lambda.invoke();
            androidStringManager13.getClass();
            return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager13, (LocalLoyaltySheet) screen, screenNavigator));
        }
        if (localScreen instanceof LocalTabScreen) {
            LocalHomePresenter.MetroFactory metroFactory10 = ((LocalHomePresenter$Factory$Impl) this.localHomePresenter).delegateFactory;
            RealLocalBrandSyncer realLocalBrandSyncer8 = (RealLocalBrandSyncer) metroFactory10.syncer.getValue();
            LocalInstalledStore localInstalledStore10 = (LocalInstalledStore) metroFactory10.store.invoke();
            ClearMarketingBadgesIfNeeded clearMarketingBadgesIfNeeded = (ClearMarketingBadgesIfNeeded) metroFactory10.clearMarketingBadgesIfNeeded.invoke();
            FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) metroFactory10.featureFlagManager.getValue();
            LocalHomeGeoPresenter$Factory$Impl localHomeGeoPresenter$Factory$Impl = (LocalHomeGeoPresenter$Factory$Impl) metroFactory10.localHomeGeoPresenterFactory.value;
            TabContentPresenter$Factory$Impl tabContentPresenter$Factory$Impl = (TabContentPresenter$Factory$Impl) metroFactory10.tabContentPresenterFactory.invoke();
            realLocalBrandSyncer8.getClass();
            localInstalledStore10.getClass();
            clearMarketingBadgesIfNeeded.getClass();
            featureFlagManager4.getClass();
            localHomeGeoPresenter$Factory$Impl.getClass();
            tabContentPresenter$Factory$Impl.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realLocalBrandSyncer8, localInstalledStore10, clearMarketingBadgesIfNeeded, featureFlagManager4, localHomeGeoPresenter$Factory$Impl, tabContentPresenter$Factory$Impl, screenNavigator));
        }
        if (localScreen instanceof LocalCashBalanceScreen) {
            LocalCashBalancePresenter.MetroFactory metroFactory11 = ((LocalCashBalancePresenter$Factory$Impl) this.localCashBalancePresenter).delegateFactory;
            RealLocalBrandSyncer realLocalBrandSyncer9 = (RealLocalBrandSyncer) metroFactory11.syncer.getValue();
            RealLocalLauncher realLocalLauncher9 = (RealLocalLauncher) metroFactory11.launcher.invoke();
            RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl = (RealTimestampFormatter$Factory$Impl) metroFactory11.timestampFormatterFactory.invoke();
            Analytics analytics9 = (Analytics) metroFactory11.analytics.getValue();
            SessionManager sessionManager7 = (SessionManager) metroFactory11.sessionManager.lambda.invoke();
            LocalInstalledStore localInstalledStore11 = (LocalInstalledStore) metroFactory11.store.invoke();
            LocalService localService5 = (LocalService) metroFactory11.service.getValue();
            AndroidStringManager androidStringManager14 = (AndroidStringManager) metroFactory11.stringManager.lambda.invoke();
            AndroidClock androidClock6 = (AndroidClock) metroFactory11.clock.lambda.invoke();
            realLocalBrandSyncer9.getClass();
            realLocalLauncher9.getClass();
            realTimestampFormatter$Factory$Impl.getClass();
            analytics9.getClass();
            sessionManager7.getClass();
            localInstalledStore11.getClass();
            localService5.getClass();
            androidStringManager14.getClass();
            androidClock6.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter(realLocalBrandSyncer9, realLocalLauncher9, realTimestampFormatter$Factory$Impl, analytics9, sessionManager7, localInstalledStore11, localService5, androidStringManager14, (LocalCashBalanceScreen) screen, screenNavigator, androidClock6));
        }
        if (localScreen instanceof LocalAddBrandsScreen) {
            LocalAddBrandsPresenter.MetroFactory metroFactory12 = ((LocalAddBrandsPresenter$Factory$Impl) this.localAddBrandsPresenter).delegateFactory;
            LocalService localService6 = (LocalService) metroFactory12.service.getValue();
            RealLocalLauncher realLocalLauncher10 = (RealLocalLauncher) metroFactory12.launcher.invoke();
            Analytics analytics10 = (Analytics) metroFactory12.analytics.getValue();
            LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl2 = (LocalResponseContextHandler$Factory$Impl) metroFactory12.responseContextHandlerFactory.invoke();
            LocalInstalledStore localInstalledStore12 = (LocalInstalledStore) metroFactory12.store.invoke();
            localService6.getClass();
            realLocalLauncher10.getClass();
            analytics10.getClass();
            localResponseContextHandler$Factory$Impl2.getClass();
            localInstalledStore12.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalAddBrandsPresenter(localService6, realLocalLauncher10, analytics10, localResponseContextHandler$Factory$Impl2, localInstalledStore12, screenNavigator));
        }
        if (localScreen instanceof LocalSchedulingDayTimePickerScreen) {
            ProfileUpsellPresenter.MetroFactory metroFactory13 = ((SchedulingDayTimePickerPresenter$Factory$Impl) this.schedulingDayTimePickerPresenter).delegateFactory;
            Analytics analytics11 = (Analytics) metroFactory13.analytics.getValue();
            RealLocalBrandRepository realLocalBrandRepository10 = (RealLocalBrandRepository) metroFactory13.routerFactory.invoke();
            LocalService localService7 = (LocalService) metroFactory13.syncValueReader.getValue();
            analytics11.getClass();
            realLocalBrandRepository10.getClass();
            localService7.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(analytics11, realLocalBrandRepository10, localService7, screenNavigator, (LocalSchedulingDayTimePickerScreen) screen));
        }
        if (localScreen instanceof LocalNeighborhoodsMapScreen) {
            LocalHomeGeoPresenter.MetroFactory metroFactory14 = ((LocalBrandCollectionMapPresenter$Factory$Impl) this.brandCollectionMapPresenter).delegateFactory;
            RealBrandFollowPresenter$Factory$Impl realBrandFollowPresenter$Factory$Impl = (RealBrandFollowPresenter$Factory$Impl) metroFactory14.store.invoke();
            CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl = (CashMapPresenter$Factory$Impl) metroFactory14.cashMapPresenterFactory.invoke();
            RealLocalBrandSyncer realLocalBrandSyncer10 = (RealLocalBrandSyncer) metroFactory14.syncer.getValue();
            LocalInstalledStore localInstalledStore13 = (LocalInstalledStore) metroFactory14.tabContentPresenterFactory.invoke();
            AndroidClock androidClock7 = (AndroidClock) metroFactory14.clock.lambda.invoke();
            RealLocalLauncher realLocalLauncher11 = (RealLocalLauncher) metroFactory14.brandProfilePresenterFactory.invoke();
            AndroidStringManager androidStringManager15 = (AndroidStringManager) metroFactory14.stringManager.lambda.invoke();
            Analytics analytics12 = (Analytics) metroFactory14.featureFlagManager.getValue();
            realBrandFollowPresenter$Factory$Impl.getClass();
            cashMapPresenter$Factory$Impl.getClass();
            realLocalBrandSyncer10.getClass();
            localInstalledStore13.getClass();
            androidClock7.getClass();
            realLocalLauncher11.getClass();
            androidStringManager15.getClass();
            analytics12.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realBrandFollowPresenter$Factory$Impl, cashMapPresenter$Factory$Impl, realLocalBrandSyncer10, localInstalledStore13, androidClock7, realLocalLauncher11, androidStringManager15, analytics12, screenNavigator));
        }
        if (localScreen instanceof LocalOrdersScreen) {
            throw new NotImplementedError(null, 1, null);
        }
        if (localScreen instanceof LocalMarketingMessageScreen) {
            SimpleActor simpleActor = ((MarketingMessagePresenter$Factory$Impl) this.marketingMessagePresenter).delegateFactory;
            AndroidSvg androidSvg = (AndroidSvg) ((MarkMarketingMessageAsViewed$MetroFactory) simpleActor.scope).invoke();
            AndroidStringManager androidStringManager16 = (AndroidStringManager) ((LambdaProvider) simpleActor.consumeMessage).lambda.invoke();
            RealLocalLauncher realLocalLauncher12 = (RealLocalLauncher) ((Provider) simpleActor.messageQueue).invoke();
            Analytics analytics13 = (Analytics) ((DoubleCheck) simpleActor.remainingMessages).getValue();
            androidStringManager16.getClass();
            realLocalLauncher12.getClass();
            analytics13.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(androidSvg, androidStringManager16, realLocalLauncher12, analytics13, screenNavigator, (LocalMarketingMessageScreen) screen));
        }
        if (localScreen instanceof LocalMarketingMessagesScreen) {
            DisclosurePresenter.MetroFactory metroFactory15 = ((MarketingMessagesPresenter$Factory$Impl) this.marketingMessagesPresenter).delegateFactory;
            ClearMarketingBadgesIfNeeded clearMarketingBadgesIfNeeded2 = (ClearMarketingBadgesIfNeeded) metroFactory15.blockersNavigator.invoke();
            RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) metroFactory15.analytics.getValue();
            RefreshMarketingMessages refreshMarketingMessages = (RefreshMarketingMessages) metroFactory15.launcher.invoke();
            AndroidStringManager androidStringManager17 = (AndroidStringManager) metroFactory15.stringManager.lambda.invoke();
            Analytics analytics14 = (Analytics) metroFactory15.appService.getValue();
            clearMarketingBadgesIfNeeded2.getClass();
            realMarketingMessageRepository.getClass();
            refreshMarketingMessages.getClass();
            androidStringManager17.getClass();
            analytics14.getClass();
            return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(clearMarketingBadgesIfNeeded2, realMarketingMessageRepository, refreshMarketingMessages, androidStringManager17, analytics14, screenNavigator, (LocalMarketingMessagesScreen) screen));
        }
        if (localScreen instanceof LocalMenuPickerScreen) {
            return MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator, (LocalMenuPickerScreen) screen));
        }
        if (localScreen instanceof TableQrCodeScannerScreen) {
            TableQrCodeScannerPresenter.MetroFactory metroFactory16 = ((TableQrCodeScannerPresenter$Factory$Impl) this.tableQrCodeScannerPresenter).delegateFactory;
            AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) metroFactory16.permissionManager.invoke();
            AndroidStringManager androidStringManager18 = (AndroidStringManager) metroFactory16.stringManager.lambda.invoke();
            RealClientRouteParser realClientRouteParser = (RealClientRouteParser) metroFactory16.clientRouteParser.getValue();
            RealDeepLinkParser realDeepLinkParser = (RealDeepLinkParser) metroFactory16.deepLinkParser.getValue();
            StateFlow stateFlow = (StateFlow) metroFactory16.activityLifecycleState.invoke();
            RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) metroFactory16.uuidGenerator.lambda.invoke();
            androidPermissionManager.getClass();
            androidStringManager18.getClass();
            realClientRouteParser.getClass();
            realDeepLinkParser.getClass();
            stateFlow.getClass();
            realUuidGenerator2.getClass();
            return MoleculePresenterKt.asPresenter$default(new TableQrCodeScannerPresenter(androidPermissionManager, androidStringManager18, realClientRouteParser, realDeepLinkParser, stateFlow, realUuidGenerator2, screenNavigator));
        }
        if (localScreen instanceof LocalPosCheckInScreen) {
            LocalPosCheckInPresenter.MetroFactory metroFactory17 = ((LocalPosCheckInPresenter$Factory$Impl) this.posCheckInPresenter).delegateFactory;
            AndroidPermissionManager androidPermissionManager2 = (AndroidPermissionManager) metroFactory17.permissionManager.invoke();
            AndroidStringManager androidStringManager19 = (AndroidStringManager) metroFactory17.stringManager.lambda.invoke();
            RealLocalLauncher realLocalLauncher13 = (RealLocalLauncher) metroFactory17.launcher.invoke();
            LocalInstalledStore localInstalledStore14 = (LocalInstalledStore) metroFactory17.store.invoke();
            androidPermissionManager2.getClass();
            androidStringManager19.getClass();
            realLocalLauncher13.getClass();
            localInstalledStore14.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(androidPermissionManager2, androidStringManager19, realLocalLauncher13, localInstalledStore14, (LocalPosCheckInScreen) screen, screenNavigator));
        }
        if (localScreen instanceof LocalCurbsidePickupCarScreen) {
            AndroidStringManager androidStringManager20 = (AndroidStringManager) ((CurbsidePickupCarPresenter$Factory$Impl) this.curbsidePickupCarPresenter).delegateFactory.stringManager.lambda.invoke();
            androidStringManager20.getClass();
            return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager20, (LocalCurbsidePickupCarScreen) screen, screenNavigator));
        }
        if (!(localScreen instanceof LocalCashAllActivityScreen)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        LocalEditorialPresenter.MetroFactory metroFactory18 = ((LocalCashAllActivityPresenter$Factory$Impl) this.allActivityPresenter).delegateFactory;
        RealLocalBrandSyncer realLocalBrandSyncer11 = (RealLocalBrandSyncer) metroFactory18.service.getValue();
        RealLocalLauncher realLocalLauncher14 = (RealLocalLauncher) metroFactory18.launcher.invoke();
        RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl2 = (RealTimestampFormatter$Factory$Impl) metroFactory18.installedStore.invoke();
        LocalInstalledStore localInstalledStore15 = (LocalInstalledStore) metroFactory18.responseContextHandlerFactory.invoke();
        AndroidStringManager androidStringManager21 = (AndroidStringManager) metroFactory18.clock.lambda.invoke();
        AndroidClock androidClock8 = (AndroidClock) metroFactory18.stringManager.lambda.invoke();
        realLocalBrandSyncer11.getClass();
        realLocalLauncher14.getClass();
        realTimestampFormatter$Factory$Impl2.getClass();
        localInstalledStore15.getClass();
        androidStringManager21.getClass();
        androidClock8.getClass();
        return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realLocalBrandSyncer11, realLocalLauncher14, realTimestampFormatter$Factory$Impl2, localInstalledStore15, androidStringManager21, screenNavigator, androidClock8));
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        switch (this.$r8$classId) {
            case 0:
                return create$app$cash$local$presenters$LocalPresenterFactory(screen, screenNavigator);
            default:
                screen.getClass();
                if (screen instanceof ProfileScreens.SecurityLockScreen) {
                    return MoleculePresenterKt.asPresenter$default(((RealProfilePasscodePresenter$Factory$Impl) this.localMenuItemDetailsPresenter).create$1(new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.SECURITY), screenNavigator));
                }
                if (screen instanceof ProfileScreens.IncomingRequestsScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = ((IncomingRequestsPresenter$Factory$Impl) this.localMenuPresenter).delegateFactory;
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
                    realP2pSettingsManager.getClass();
                    androidStringManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(realP2pSettingsManager, androidStringManager, (ProfileScreens.IncomingRequestsScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.ProfileScreen) {
                    RememberEventDispatcher rememberEventDispatcher = ((ProfilePresenter$Factory$Impl) this.brandProfilePresenter).delegateFactory;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher.abandoning).lambda.invoke();
                    RealProfileRepo realProfileRepo = (RealProfileRepo) ((Provider) rememberEventDispatcher.traceContext).invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) ((Provider) rememberEventDispatcher.remembering).invoke();
                    RealFavoritesManager realFavoritesManager = (RealFavoritesManager) ((Provider) rememberEventDispatcher.currentRememberingList).invoke();
                    RealGenericProfileElementsPresenter$Factory$Impl realGenericProfileElementsPresenter$Factory$Impl = (RealGenericProfileElementsPresenter$Factory$Impl) ((Provider) rememberEventDispatcher.leaving).invoke();
                    Analytics analytics = (Analytics) ((DoubleCheck) rememberEventDispatcher.sideEffects).getValue();
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) ((Provider) rememberEventDispatcher.rememberSet).invoke();
                    RealPaymentsInboundNavigator$Factory$Impl realPaymentsInboundNavigator$Factory$Impl = (RealPaymentsInboundNavigator$Factory$Impl) ((Provider) rememberEventDispatcher.releasing).invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) rememberEventDispatcher.ignoreLeavingSet).getValue();
                    KeyValue keyValue = (KeyValue) ((Provider) rememberEventDispatcher.pausedPlaceholders).invoke();
                    RealAllowlistRepository realAllowlistRepository = (RealAllowlistRepository) ((Provider) rememberEventDispatcher.nestedRemembersLists).invoke();
                    androidStringManager2.getClass();
                    realProfileRepo.getClass();
                    realJurisdictionConfigManager.getClass();
                    realFavoritesManager.getClass();
                    realGenericProfileElementsPresenter$Factory$Impl.getClass();
                    analytics.getClass();
                    realBitcoinCapabilityProvider.getClass();
                    realPaymentsInboundNavigator$Factory$Impl.getClass();
                    featureFlagManager.getClass();
                    keyValue.getClass();
                    realAllowlistRepository.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ProfilePresenter(androidStringManager2, realProfileRepo, realJurisdictionConfigManager, realFavoritesManager, realGenericProfileElementsPresenter$Factory$Impl, analytics, realBitcoinCapabilityProvider, realPaymentsInboundNavigator$Factory$Impl, featureFlagManager, keyValue, realAllowlistRepository, (ProfileScreens.ProfileScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.ProfilePreview) {
                    return MoleculePresenterKt.asPresenter$default(((RealProfilePreviewPresenter$Factory$Impl) this.locationCartPresenter).create$1((ProfileScreens.ProfilePreview) screen, screenNavigator));
                }
                if (screen instanceof PaymentHistoryScreens$ProfileCompletePaymentHistory) {
                    ProfileCompleteActivityPresenter$MetroFactory profileCompleteActivityPresenter$MetroFactory = ((ProfileCompleteActivityPresenter$Factory$Impl) this.locationOpenTabPresenter).delegateFactory;
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) profileCompleteActivityPresenter$MetroFactory.stringManager.lambda.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) profileCompleteActivityPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) profileCompleteActivityPresenter$MetroFactory.activitiesCacheManager.getValue();
                    CounterpartyPageRequestHandler$Factory$Impl counterpartyPageRequestHandler$Factory$Impl = (CounterpartyPageRequestHandler$Factory$Impl) profileCompleteActivityPresenter$MetroFactory.counterpartyPageRequestHandlerFactory.invoke();
                    RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) profileCompleteActivityPresenter$MetroFactory.activityTokenFactory.invoke();
                    DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) profileCompleteActivityPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
                    ProfileActivityItemEventDecorator profileActivityItemEventDecorator = (ProfileActivityItemEventDecorator) profileCompleteActivityPresenter$MetroFactory.profileActivityItemEventDecorator.invoke();
                    androidStringManager3.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl.getClass();
                    realActivitiesCacheManager.getClass();
                    counterpartyPageRequestHandler$Factory$Impl.getClass();
                    realActivityTokenFactory.getClass();
                    defaultActivityItemEventHandler$Factory$Impl.getClass();
                    profileActivityItemEventDecorator.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(screenNavigator, (PaymentHistoryScreens$ProfileCompletePaymentHistory) screen, androidStringManager3, realActivityEmbeddedPresenter$Factory$Impl, realActivitiesCacheManager, counterpartyPageRequestHandler$Factory$Impl, realActivityTokenFactory, defaultActivityItemEventHandler$Factory$Impl, profileActivityItemEventDecorator));
                }
                if (screen instanceof ProfileScreens.ErrorScreen) {
                    Analytics analytics2 = (Analytics) ((ErrorPresenter$Factory$Impl) this.locationCheckoutPresenter).delegateFactory.analytics.getValue();
                    analytics2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter(analytics2, (ProfileScreens.ErrorScreen) screen, screenNavigator));
                }
                if (screen instanceof ActivePasswordDialog) {
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) ((ProfilePasswordDialogPresenter$Factory$Impl) this.openTabCheckoutPresenter).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioUndoDialogPresenter(androidStringManager4, screenNavigator, (ActivePasswordDialog) screen));
                }
                if (screen instanceof GenericConfirmDialog) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter(screenNavigator, (GenericConfirmDialog) screen));
                }
                if (screen instanceof ProfileScreens.SecurityScreen) {
                    FilesetUploadPresenter.MetroFactory metroFactory = ((ProfileSecurityPresenter$Factory$Impl) this.checkoutDeeplinkPresenter).delegateFactory;
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory.analytics.getValue();
                    ModifiablePermissions modifiablePermissions = (ModifiablePermissions) metroFactory.blockersNavigator.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) metroFactory.errorReporter.lambda.invoke();
                    Analytics analytics3 = (Analytics) metroFactory.fileUploadService.getValue();
                    AndroidClock androidClock = (AndroidClock) metroFactory.fileProvider.lambda.invoke();
                    FlowStarter flowStarter = (FlowStarter) metroFactory.service.getValue();
                    SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) metroFactory.franklinAppService).getValue();
                    JCAContext jCAContext = (JCAContext) ((RealCurrentUserSetter.MetroFactory) metroFactory.blockersHelperFactory).invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) metroFactory.permissionManager).invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) ((DoubleCheck) metroFactory.storage).getValue();
                    StateFlow stateFlow = (StateFlow) metroFactory.fileTypeDescriber.invoke();
                    RealProfilePasscodePresenter$Factory$Impl realProfilePasscodePresenter$Factory$Impl = (RealProfilePasscodePresenter$Factory$Impl) metroFactory.fileValidatorFactory.invoke();
                    TrustedContactSettingPresenter$Factory$Impl trustedContactSettingPresenter$Factory$Impl = (TrustedContactSettingPresenter$Factory$Impl) ((InstanceFactory) metroFactory.cameraLauncherFactory).value;
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider2 = (RealBitcoinCapabilityProvider) metroFactory.imageFormatConverterFactory.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((DoubleCheck) metroFactory.featureFlagManager).getValue();
                    androidStringManager5.getClass();
                    featureFlagManager2.getClass();
                    modifiablePermissions.getClass();
                    coroutineContext.getClass();
                    analytics3.getClass();
                    androidClock.getClass();
                    flowStarter.getClass();
                    syncValueReader.getClass();
                    realProfileManager.getClass();
                    realSettingsEligibilityManager.getClass();
                    stateFlow.getClass();
                    realProfilePasscodePresenter$Factory$Impl.getClass();
                    trustedContactSettingPresenter$Factory$Impl.getClass();
                    realBitcoinCapabilityProvider2.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TabToolbarPresenter(androidStringManager5, featureFlagManager2, modifiablePermissions, coroutineContext, (ProfileScreens.SecurityScreen) screen, screenNavigator, analytics3, androidClock, flowStarter, syncValueReader, jCAContext, realProfileManager, realSettingsEligibilityManager, stateFlow, realProfilePasscodePresenter$Factory$Impl, trustedContactSettingPresenter$Factory$Impl, realBitcoinCapabilityProvider2, cashAccountDatabaseImpl));
                }
                if (screen instanceof ProfileScreens.PrivacyScreen) {
                    FilesetUploadPresenter.MetroFactory metroFactory2 = ((ProfilePrivacyPresenter$Factory$Impl) this.localOrderStatusPresenter).delegateFactory;
                    RealP2pSettingsManager realP2pSettingsManager2 = (RealP2pSettingsManager) metroFactory2.blockersNavigator.invoke();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) metroFactory2.analytics.getValue();
                    EnumPreference enumPreference = (EnumPreference) metroFactory2.fileUploadService.getValue();
                    ModifiablePermissions modifiablePermissions2 = (ModifiablePermissions) metroFactory2.fileTypeDescriber.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory2.errorReporter.lambda.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) metroFactory2.cameraLauncherFactory).value;
                    Analytics analytics4 = (Analytics) metroFactory2.service.getValue();
                    AndroidClock androidClock2 = (AndroidClock) metroFactory2.fileProvider.lambda.invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) metroFactory2.storage).invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager2 = (RealSettingsEligibilityManager) ((DoubleCheck) metroFactory2.franklinAppService).getValue();
                    RealBlockedAccountsSectionPresenter$Factory$Impl realBlockedAccountsSectionPresenter$Factory$Impl = (RealBlockedAccountsSectionPresenter$Factory$Impl) ((InstanceFactory) metroFactory2.featureFlagManager).value;
                    RealAllowedAccountsSectionPresenter$Factory$Impl realAllowedAccountsSectionPresenter$Factory$Impl = (RealAllowedAccountsSectionPresenter$Factory$Impl) ((InstanceFactory) metroFactory2.blockersHelperFactory).value;
                    RealSearchPrivacySettingsPresenter$Factory$Impl realSearchPrivacySettingsPresenter$Factory$Impl = (RealSearchPrivacySettingsPresenter$Factory$Impl) metroFactory2.fileValidatorFactory.invoke();
                    RealPersonalizedAdsSettingsPresenter$Factory$Impl realPersonalizedAdsSettingsPresenter$Factory$Impl = (RealPersonalizedAdsSettingsPresenter$Factory$Impl) ((InstanceFactory) metroFactory2.permissionManager).value;
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider3 = (RealBitcoinCapabilityProvider) metroFactory2.imageFormatConverterFactory.invoke();
                    realP2pSettingsManager2.getClass();
                    androidStringManager6.getClass();
                    featureFlagManager3.getClass();
                    enumPreference.getClass();
                    modifiablePermissions2.getClass();
                    coroutineContext2.getClass();
                    coroutineScope.getClass();
                    analytics4.getClass();
                    androidClock2.getClass();
                    realProfileManager2.getClass();
                    realSettingsEligibilityManager2.getClass();
                    realBlockedAccountsSectionPresenter$Factory$Impl.getClass();
                    realAllowedAccountsSectionPresenter$Factory$Impl.getClass();
                    realSearchPrivacySettingsPresenter$Factory$Impl.getClass();
                    realPersonalizedAdsSettingsPresenter$Factory$Impl.getClass();
                    realBitcoinCapabilityProvider3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ProfilePrivacyPresenter(realP2pSettingsManager2, androidStringManager6, featureFlagManager3, enumPreference, modifiablePermissions2, coroutineContext2, coroutineScope, (ProfileScreens.PrivacyScreen) screen, screenNavigator, analytics4, androidClock2, realProfileManager2, realSettingsEligibilityManager2, realBlockedAccountsSectionPresenter$Factory$Impl, realAllowedAccountsSectionPresenter$Factory$Impl, realSearchPrivacySettingsPresenter$Factory$Impl, realPersonalizedAdsSettingsPresenter$Factory$Impl, realBitcoinCapabilityProvider3));
                }
                if (screen instanceof InvestingContactScreen) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((InvestingContactPresenter$Factory$Impl) this.localMenuComboDetailsPresenter).delegateFactory;
                    SyncValueReader syncValueReader2 = (SyncValueReader) transferInPresenter$MetroFactory.analytics.getValue();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                    TrustedContactFlowPresenter$Factory$Impl trustedContactFlowPresenter$Factory$Impl = (TrustedContactFlowPresenter$Factory$Impl) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    syncValueReader2.getClass();
                    androidStringManager7.getClass();
                    trustedContactFlowPresenter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InvestingContactPresenter(syncValueReader2, androidStringManager7, trustedContactFlowPresenter$Factory$Impl, screenNavigator, 0));
                }
                if (screen instanceof CashtagRequiredScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory2 = ((ProfileCashtagRequiredPresenter$Factory$Impl) this.localExplanatoryDialogPresenter).delegateFactory;
                    RealJurisdictionConfigManager realJurisdictionConfigManager2 = (RealJurisdictionConfigManager) taxTooltipPresenter$MetroFactory2.taxDesktopTooltipPreference.invoke();
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) taxTooltipPresenter$MetroFactory2.stringManager.lambda.invoke();
                    realJurisdictionConfigManager2.getClass();
                    androidStringManager8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(realJurisdictionConfigManager2, androidStringManager8, screenNavigator, 11));
                }
                if (screen instanceof ProfileScreens.AccountInfoScreen) {
                    DeviceBuildInfo deviceBuildInfo = ((ProfilePersonalPresenter$Factory$Impl) this.localHomePresenter).delegateFactory;
                    FlowStarter flowStarter2 = (FlowStarter) ((DoubleCheck) deviceBuildInfo.manufacturer).getValue();
                    Analytics analytics5 = (Analytics) ((DoubleCheck) deviceBuildInfo.model).getValue();
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.osVersion).lambda.invoke();
                    RealAccountRatePlanManager realAccountRatePlanManager = (RealAccountRatePlanManager) ((Provider) deviceBuildInfo.osBuild).invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager3 = (RealSettingsEligibilityManager) ((DoubleCheck) deviceBuildInfo.fingerprint).getValue();
                    SyncValueReader syncValueReader3 = (SyncValueReader) ((DoubleCheck) deviceBuildInfo.tags).getValue();
                    AliasesSectionPresenter$AssistedInjectionFactory$Impl aliasesSectionPresenter$AssistedInjectionFactory$Impl = (AliasesSectionPresenter$AssistedInjectionFactory$Impl) ((InstanceFactory) deviceBuildInfo.brand).value;
                    PersonalInfoSectionPresenter$AssistedInjectionFactory$Impl personalInfoSectionPresenter$AssistedInjectionFactory$Impl = (PersonalInfoSectionPresenter$AssistedInjectionFactory$Impl) ((InstanceFactory) deviceBuildInfo.apiLevel).value;
                    ProfileInlineAppMessagePresenter$Factory$Impl profileInlineAppMessagePresenter$Factory$Impl = (ProfileInlineAppMessagePresenter$Factory$Impl) ((InstanceFactory) deviceBuildInfo.cpuAbis).value;
                    flowStarter2.getClass();
                    analytics5.getClass();
                    androidStringManager9.getClass();
                    realAccountRatePlanManager.getClass();
                    realSettingsEligibilityManager3.getClass();
                    syncValueReader3.getClass();
                    aliasesSectionPresenter$AssistedInjectionFactory$Impl.getClass();
                    personalInfoSectionPresenter$AssistedInjectionFactory$Impl.getClass();
                    profileInlineAppMessagePresenter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter(flowStarter2, analytics5, androidStringManager9, realAccountRatePlanManager, realSettingsEligibilityManager3, syncValueReader3, aliasesSectionPresenter$AssistedInjectionFactory$Impl, personalInfoSectionPresenter$AssistedInjectionFactory$Impl, profileInlineAppMessagePresenter$Factory$Impl, (ProfileScreens.AccountInfoScreen) screen, screenNavigator));
                }
                if (screen instanceof PersonalInfoConfirmationDialogScreen) {
                    TaxesPasswordPresenter$MetroFactory taxesPasswordPresenter$MetroFactory = ((PersonalInfoConfirmationDialogPresenter$Factory$Impl) this.localEditorialPresenter).delegateFactory;
                    FlowStarter flowStarter3 = (FlowStarter) taxesPasswordPresenter$MetroFactory.syncValueReader.getValue();
                    Analytics analytics6 = (Analytics) taxesPasswordPresenter$MetroFactory.flowStarter.getValue();
                    flowStarter3.getClass();
                    analytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter((Object) flowStarter3, analytics6, screenNavigator, 15));
                }
                if (screen instanceof ArcadeAutofillSettingsScreen) {
                    LocalOrderStatusPresenter.MetroFactory metroFactory3 = ((ArcadeAutofillSettingsDetailPresenter$Factory$Impl) this.loyaltySheetPresenter).delegateFactory;
                    SyncValueReader syncValueReader4 = (SyncValueReader) metroFactory3.localOrderRepository.getValue();
                    ShippingAddressService shippingAddressService = (ShippingAddressService) metroFactory3.analytics.getValue();
                    CustomerPreferencesService customerPreferencesService = (CustomerPreferencesService) metroFactory3.featureFlagManager.getValue();
                    AndroidStringManager androidStringManager10 = (AndroidStringManager) metroFactory3.stringManager.lambda.invoke();
                    RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator = (RealAutofillNetworkFailureMessageGenerator) metroFactory3.launcher.invoke();
                    SessionManager sessionManager = (SessionManager) metroFactory3.clipboardManager.lambda.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory3.sessionManager.lambda.invoke();
                    syncValueReader4.getClass();
                    shippingAddressService.getClass();
                    customerPreferencesService.getClass();
                    androidStringManager10.getClass();
                    realAutofillNetworkFailureMessageGenerator.getClass();
                    sessionManager.getClass();
                    coroutineContext3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(syncValueReader4, shippingAddressService, customerPreferencesService, androidStringManager10, realAutofillNetworkFailureMessageGenerator, sessionManager, coroutineContext3, (ArcadeAutofillSettingsScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.ConfirmReplaceInfoSheet) {
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) ((ConfirmReplaceInfoPresenter$Factory$Impl) this.localCashBalancePresenter).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager11.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(androidStringManager11, (ProfileScreens.ConfirmReplaceInfoSheet) screen, screenNavigator));
                }
                int i = 0;
                if (screen instanceof ProfileScreens.NotificationsScreen) {
                    ProfileNotificationsPresenter$Factory$Impl profileNotificationsPresenter$Factory$Impl = (ProfileNotificationsPresenter$Factory$Impl) this.educationalSheetPresenter;
                    ProfileScreens.NotificationsScreen notificationsScreen = (ProfileScreens.NotificationsScreen) screen;
                    boolean z = Build.VERSION.SDK_INT > 32;
                    PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = profileNotificationsPresenter$Factory$Impl.delegateFactory;
                    RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.stringManager).lambda.invoke();
                    Analytics analytics7 = (Analytics) ((DoubleCheck) poolDetailsPresenter$MetroFactory.blockersNavigator).getValue();
                    AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
                    SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.sessionManager).lambda.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager4 = (RealSettingsEligibilityManager) ((DoubleCheck) poolDetailsPresenter$MetroFactory.analytics).getValue();
                    NotificationSettingsChecker notificationSettingsChecker = (NotificationSettingsChecker) poolDetailsPresenter$MetroFactory.launcher.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) poolDetailsPresenter$MetroFactory.featureFlagManager).getValue();
                    IntentLauncher intentLauncher = (IntentLauncher) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) ((LambdaProvider) poolDetailsPresenter$MetroFactory.dateFormatManager).lambda.invoke();
                    KeyValue keyValue2 = (KeyValue) ((RealLiteCashInRepo$MetroFactory) poolDetailsPresenter$MetroFactory.clock).invoke();
                    NotificationSectionPresenter$Factory$Impl notificationSectionPresenter$Factory$Impl = (NotificationSectionPresenter$Factory$Impl) ((InstanceFactory) poolDetailsPresenter$MetroFactory.uuidGenerator).value;
                    RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) poolDetailsPresenter$MetroFactory.activitiesCacheManager).value;
                    realProfileNotificationsRepository.getClass();
                    androidStringManager12.getClass();
                    analytics7.getClass();
                    androidPermissionManager.getClass();
                    sessionManager2.getClass();
                    realSettingsEligibilityManager4.getClass();
                    notificationSettingsChecker.getClass();
                    featureFlagManager4.getClass();
                    intentLauncher.getClass();
                    errorReporter.getClass();
                    notificationSectionPresenter$Factory$Impl.getClass();
                    realAccountholderAccountRepository.getClass();
                    coroutineScope2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ProfileNotificationsPresenter(realProfileNotificationsRepository, androidStringManager12, analytics7, androidPermissionManager, sessionManager2, realSettingsEligibilityManager4, notificationSettingsChecker, featureFlagManager4, intentLauncher, errorReporter, keyValue2, notificationSectionPresenter$Factory$Impl, realAccountholderAccountRepository, coroutineScope2, notificationsScreen, screenNavigator, z));
                }
                if (screen instanceof ProfileScreens.ContactMethodDetailsScreen) {
                    Instrument$Adapter instrument$Adapter = ((ContactMethodDetailsPresenter$Factory$Impl) this.shortlinkPresenter).delegateFactory;
                    RealProfileManager realProfileManager3 = (RealProfileManager) ((DelegateFactory) instrument$Adapter.cash_instrument_typeAdapter).invoke();
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) instrument$Adapter.card_brandAdapter).lambda.invoke();
                    Analytics analytics8 = (Analytics) ((DoubleCheck) instrument$Adapter.balance_currencyAdapter).getValue();
                    realProfileManager3.getClass();
                    androidStringManager13.getClass();
                    analytics8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realProfileManager3, androidStringManager13, analytics8, (ProfileScreens.ContactMethodDetailsScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.ChannelListScreen) {
                    ChannelListPresenter$Factory$Impl channelListPresenter$Factory$Impl = (ChannelListPresenter$Factory$Impl) this.brandCollectionMapPresenter;
                    ProfileScreens.ChannelListScreen channelListScreen = (ProfileScreens.ChannelListScreen) screen;
                    boolean z2 = Build.VERSION.SDK_INT > 32;
                    ChannelListPresenter.MetroFactory metroFactory4 = channelListPresenter$Factory$Impl.delegateFactory;
                    RealProfileNotificationsRepository realProfileNotificationsRepository2 = (RealProfileNotificationsRepository) metroFactory4.repository.invoke();
                    AndroidStringManager androidStringManager14 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
                    RealCustomerStore realCustomerStore = (RealCustomerStore) metroFactory4.customerStore.invoke();
                    FlowStarter flowStarter4 = (FlowStarter) metroFactory4.blockersNavigator.getValue();
                    AndroidPermissionManager androidPermissionManager2 = (AndroidPermissionManager) metroFactory4.permissionManager.invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory4.launcher.invoke();
                    Analytics analytics9 = (Analytics) metroFactory4.analytics.getValue();
                    NotificationSettingsChecker notificationSettingsChecker2 = (NotificationSettingsChecker) metroFactory4.settingsChecker.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) metroFactory4.featureFlagManager.getValue();
                    realProfileNotificationsRepository2.getClass();
                    androidStringManager14.getClass();
                    realCustomerStore.getClass();
                    flowStarter4.getClass();
                    androidPermissionManager2.getClass();
                    intentLauncher2.getClass();
                    analytics9.getClass();
                    notificationSettingsChecker2.getClass();
                    featureFlagManager5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ChannelListPresenter(realProfileNotificationsRepository2, androidStringManager14, realCustomerStore, flowStarter4, androidPermissionManager2, intentLauncher2, analytics9, notificationSettingsChecker2, featureFlagManager5, channelListScreen, screenNavigator, z2));
                }
                if (screen instanceof ProfileScreens.CategoryListScreen) {
                    CategoryListPresenter$Factory$Impl categoryListPresenter$Factory$Impl = (CategoryListPresenter$Factory$Impl) this.fulfillmentPickerPresenter;
                    ProfileScreens.CategoryListScreen categoryListScreen = (ProfileScreens.CategoryListScreen) screen;
                    boolean z3 = Build.VERSION.SDK_INT > 32;
                    AddCashRouter.MetroFactory metroFactory5 = categoryListPresenter$Factory$Impl.delegateFactory;
                    RealAccountholderAccountRepository realAccountholderAccountRepository2 = (RealAccountholderAccountRepository) metroFactory5.transferManager.invoke();
                    RealProfileNotificationsRepository realProfileNotificationsRepository3 = (RealProfileNotificationsRepository) metroFactory5.jurisdictionConfigManager.invoke();
                    AndroidStringManager androidStringManager15 = (AndroidStringManager) metroFactory5.computationContext.lambda.invoke();
                    Analytics analytics10 = (Analytics) metroFactory5.flowStarter.getValue();
                    AndroidPermissionManager androidPermissionManager3 = (AndroidPermissionManager) metroFactory5.transfersInboundNavigatorFactory.invoke();
                    IntentLauncher intentLauncher3 = (IntentLauncher) metroFactory5.blockersHelperFactory.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory5.analytics.getValue();
                    NotificationSettingsChecker notificationSettingsChecker3 = (NotificationSettingsChecker) metroFactory5.routerFactory.invoke();
                    realAccountholderAccountRepository2.getClass();
                    realProfileNotificationsRepository3.getClass();
                    androidStringManager15.getClass();
                    analytics10.getClass();
                    androidPermissionManager3.getClass();
                    intentLauncher3.getClass();
                    featureFlagManager6.getClass();
                    notificationSettingsChecker3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PaymentLoadingPresenter(realAccountholderAccountRepository2, realProfileNotificationsRepository3, androidStringManager15, analytics10, androidPermissionManager3, intentLauncher3, featureFlagManager6, notificationSettingsChecker3, categoryListScreen, screenNavigator, z3));
                }
                if (screen instanceof ProfileScreens.EnableAliasSheetScreen) {
                    Retrofit.Builder builder = ((EnableAliasSheetPresenter$Factory$Impl) this.posLocalCashRedemptionPresenter).delegateFactory;
                    AndroidStringManager androidStringManager16 = (AndroidStringManager) ((LambdaProvider) builder.callFactory).lambda.invoke();
                    RealProfileManager realProfileManager4 = (RealProfileManager) ((DelegateFactory) builder.baseUrl).invoke();
                    Analytics analytics11 = (Analytics) ((DoubleCheck) builder.converterFactories).getValue();
                    SessionManager sessionManager3 = (SessionManager) ((LambdaProvider) builder.callAdapterFactories).lambda.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) builder.callbackExecutor).value;
                    androidStringManager16.getClass();
                    realProfileManager4.getClass();
                    analytics11.getClass();
                    sessionManager3.getClass();
                    coroutineScope3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(androidStringManager16, realProfileManager4, analytics11, sessionManager3, (ProfileScreens.EnableAliasSheetScreen) screen, screenNavigator, coroutineScope3));
                }
                if (screen instanceof ProfileScreens.ReferralStatusScreen) {
                    BlockerImageUploader$MetroFactory blockerImageUploader$MetroFactory = ((ReferralStatusPresenter$Factory$Impl) this.localAddBrandsPresenter).delegateFactory;
                    AndroidColorManager androidColorManager = (AndroidColorManager) blockerImageUploader$MetroFactory.stringManager.lambda.invoke();
                    AndroidClock androidClock3 = (AndroidClock) blockerImageUploader$MetroFactory.ioDispatcher.lambda.invoke();
                    Analytics analytics12 = (Analytics) blockerImageUploader$MetroFactory.analytics.getValue();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) blockerImageUploader$MetroFactory.blockersNavigator.invoke();
                    RealReferralManager realReferralManager = (RealReferralManager) blockerImageUploader$MetroFactory.multiBlockerFacilitator.invoke();
                    androidColorManager.getClass();
                    androidClock3.getClass();
                    analytics12.getClass();
                    factory.getClass();
                    realReferralManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ReferralStatusPresenter(androidColorManager, androidClock3, analytics12, factory, realReferralManager, screenNavigator, (ProfileScreens.ReferralStatusScreen) screen));
                }
                if (screen instanceof ProfileScreens.UnsupportedSettingScreen) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory6 = ((UnsupportedSettingPresenter$Factory$Impl) this.allActivityPresenter).delegateFactory;
                    RealP2pSettingsManager realP2pSettingsManager3 = (RealP2pSettingsManager) metroFactory6.blockerFlowAnalytics.invoke();
                    FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) metroFactory6.analytics.getValue();
                    realP2pSettingsManager3.getClass();
                    featureFlagManager7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(realP2pSettingsManager3, featureFlagManager7, (ProfileScreens.UnsupportedSettingScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.FamilyEligibilityLoadingScreen) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory2 = ((FamilyEligibilityLoadingPresenter$Factory$Impl) this.schedulingDayTimePickerPresenter).delegateFactory;
                    AndroidStringManager androidStringManager17 = (AndroidStringManager) transferInPresenter$MetroFactory2.stringManager.lambda.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager5 = (RealSettingsEligibilityManager) transferInPresenter$MetroFactory2.analytics.getValue();
                    RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl = (RealAccountOutboundNavigator$Factory$Impl) transferInPresenter$MetroFactory2.moneyFormatterFactory.invoke();
                    androidStringManager17.getClass();
                    realSettingsEligibilityManager5.getClass();
                    realAccountOutboundNavigator$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager17, realSettingsEligibilityManager5, realAccountOutboundNavigator$Factory$Impl, screenNavigator));
                }
                if (screen instanceof ProfileScreens.AddAliasScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, i));
                }
                if (screen instanceof ProfileScreens.ProfileAddressSheet) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter((ProfileScreens.ProfileAddressSheet) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.AppMessagesOptions) {
                    TaxesPasswordPresenter$MetroFactory taxesPasswordPresenter$MetroFactory2 = ((AppMessagesOptionsPresenter$Factory$Impl) this.marketingMessagePresenter).delegateFactory;
                    BooleanPreference booleanPreference = (BooleanPreference) taxesPasswordPresenter$MetroFactory2.syncValueReader.getValue();
                    BooleanPreference booleanPreference2 = (BooleanPreference) taxesPasswordPresenter$MetroFactory2.flowStarter.getValue();
                    booleanPreference.getClass();
                    booleanPreference2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(booleanPreference, booleanPreference2, screenNavigator, 9));
                }
                if (screen instanceof ProfileScreens.PaymentNotificationOptions) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, 17));
                }
                if (screen instanceof OpenSourceScreen) {
                    OpenSourcePresenter$MetroFactory openSourcePresenter$MetroFactory = ((OpenSourcePresenter$Factory$Impl) this.marketingMessagesPresenter).delegateFactory;
                    Moshi moshi = (Moshi) openSourcePresenter$MetroFactory.moshi.lambda.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) openSourcePresenter$MetroFactory.ioDispatcher.lambda.invoke();
                    Context context = (Context) openSourcePresenter$MetroFactory.context.getValue();
                    RealIntentFactory realIntentFactory = (RealIntentFactory) openSourcePresenter$MetroFactory.intentFactory.getValue();
                    moshi.getClass();
                    coroutineContext4.getClass();
                    context.getClass();
                    realIntentFactory.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(screenNavigator, moshi, coroutineContext4, context, realIntentFactory, 12));
                }
                if (screen instanceof ProfileScreens.CropScreen) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter((ProfileScreens.CropScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.HeaderMenuScreen) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter((ProfileScreens.HeaderMenuScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.RingtoneScreen) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter((ProfileScreens.RingtoneScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.ConfirmRemoveAliasScreen) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter((ProfileScreens.ConfirmRemoveAliasScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.AccountSwitchInfoDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter((ProfileScreens.AccountSwitchInfoDialogScreen) screen, screenNavigator));
                }
                if (screen instanceof ProfileScreens.ConfirmSignOutScreen) {
                    OkHttpCall.AnonymousClass1 anonymousClass1 = ((ProfileConfirmSignOutPresenter$Factory$Impl) this.tableQrCodeScannerPresenter).delegateFactory;
                    OfflineManager offlineManager = (OfflineManager) ((DelegateFactory) anonymousClass1.val$callback).invoke();
                    AndroidStringManager androidStringManager18 = (AndroidStringManager) ((LambdaProvider) anonymousClass1.this$0).lambda.invoke();
                    offlineManager.getClass();
                    androidStringManager18.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(offlineManager, androidStringManager18, screenNavigator, 12));
                }
                if (screen instanceof ProfileScreens.AdjustableThresholdScreen) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory7 = ((AdjustableThresholdPresenter$Factory$Impl) this.posBrandOnboardingPresenter).delegateFactory;
                    RealProfileNotificationsRepository realProfileNotificationsRepository4 = (RealProfileNotificationsRepository) metroFactory7.blockerFlowAnalytics.invoke();
                    Analytics analytics13 = (Analytics) metroFactory7.analytics.getValue();
                    realProfileNotificationsRepository4.getClass();
                    analytics13.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(realProfileNotificationsRepository4, analytics13, (ProfileScreens.AdjustableThresholdScreen) screen, screenNavigator));
                }
                if (screen instanceof SearchVisibilityScreen) {
                    return MoleculePresenterKt.asPresenter$default(((RealSearchPrivacySettingsPresenter$Factory$Impl) this.posCheckInPresenter).create$1(screenNavigator));
                }
                if (!(screen instanceof ProfileScreens.TaxesPasswordScreen)) {
                    return null;
                }
                TaxesPasswordPresenter$MetroFactory taxesPasswordPresenter$MetroFactory3 = ((TaxesPasswordPresenter$Factory$Impl) this.curbsidePickupCarPresenter).delegateFactory;
                SyncValueReader syncValueReader5 = (SyncValueReader) taxesPasswordPresenter$MetroFactory3.syncValueReader.getValue();
                FlowStarter flowStarter5 = (FlowStarter) taxesPasswordPresenter$MetroFactory3.flowStarter.getValue();
                syncValueReader5.getClass();
                flowStarter5.getClass();
                return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(syncValueReader5, flowStarter5, screenNavigator, (ProfileScreens.TaxesPasswordScreen) screen));
        }
    }

    public LocalPresenterFactory(LocalBrandProfilePresenter$Factory$Impl localBrandProfilePresenter$Factory$Impl, LocalBrandLocationCartPresenter$Factory$Impl localBrandLocationCartPresenter$Factory$Impl, LocalBrandLocationOpenTabPresenter$Factory$Impl localBrandLocationOpenTabPresenter$Factory$Impl, LocalBrandLocationCheckoutPresenter$Factory$Impl localBrandLocationCheckoutPresenter$Factory$Impl, LocalOpenTabCheckoutPresenter$Factory$Impl localOpenTabCheckoutPresenter$Factory$Impl, LocalCheckoutDeeplinkPresenter$Factory$Impl localCheckoutDeeplinkPresenter$Factory$Impl, LocalOrderStatusPresenter$Factory$Impl localOrderStatusPresenter$Factory$Impl, LocalBrandLocationMenuPresenter$Factory$Impl localBrandLocationMenuPresenter$Factory$Impl, LocalMenuItemDetailsPresenter$Factory$Impl localMenuItemDetailsPresenter$Factory$Impl, LocalMenuComboDetailsPresenter$Factory$Impl localMenuComboDetailsPresenter$Factory$Impl, LocalExplanatoryDialogPresenter$Factory$Impl localExplanatoryDialogPresenter$Factory$Impl, LocalHomePresenter$Factory$Impl localHomePresenter$Factory$Impl, LocalCashBalancePresenter$Factory$Impl localCashBalancePresenter$Factory$Impl, LocalAddBrandsPresenter$Factory$Impl localAddBrandsPresenter$Factory$Impl, EducationalSheetPresenter$Factory$Impl educationalSheetPresenter$Factory$Impl, LocalShortlinkPresenter$Factory$Impl localShortlinkPresenter$Factory$Impl, LocalBrandCollectionMapPresenter$Factory$Impl localBrandCollectionMapPresenter$Factory$Impl, FulfillmentPickerPresenter$Factory$Impl fulfillmentPickerPresenter$Factory$Impl, LocalEditorialPresenter$Factory$Impl localEditorialPresenter$Factory$Impl, LoyaltySheetPresenter$Factory$Impl loyaltySheetPresenter$Factory$Impl, SchedulingDayTimePickerPresenter$Factory$Impl schedulingDayTimePickerPresenter$Factory$Impl, MarketingMessagePresenter$Factory$Impl marketingMessagePresenter$Factory$Impl, MarketingMessagesPresenter$Factory$Impl marketingMessagesPresenter$Factory$Impl, LocalCashAllActivityPresenter$Factory$Impl localCashAllActivityPresenter$Factory$Impl, TableQrCodeScannerPresenter$Factory$Impl tableQrCodeScannerPresenter$Factory$Impl, LocalPosBrandOnboardingPresenter$Factory$Impl localPosBrandOnboardingPresenter$Factory$Impl, LocalPosLocalCashRedemptionPresenter$Factory$Impl localPosLocalCashRedemptionPresenter$Factory$Impl, LocalPosCheckInPresenter$Factory$Impl localPosCheckInPresenter$Factory$Impl, LocalMenuPickerSheetPresenter$Factory$Impl localMenuPickerSheetPresenter$Factory$Impl, CurbsidePickupCarPresenter$Factory$Impl curbsidePickupCarPresenter$Factory$Impl) {
        this.brandProfilePresenter = localBrandProfilePresenter$Factory$Impl;
        this.locationCartPresenter = localBrandLocationCartPresenter$Factory$Impl;
        this.locationOpenTabPresenter = localBrandLocationOpenTabPresenter$Factory$Impl;
        this.locationCheckoutPresenter = localBrandLocationCheckoutPresenter$Factory$Impl;
        this.openTabCheckoutPresenter = localOpenTabCheckoutPresenter$Factory$Impl;
        this.checkoutDeeplinkPresenter = localCheckoutDeeplinkPresenter$Factory$Impl;
        this.localOrderStatusPresenter = localOrderStatusPresenter$Factory$Impl;
        this.localMenuPresenter = localBrandLocationMenuPresenter$Factory$Impl;
        this.localMenuItemDetailsPresenter = localMenuItemDetailsPresenter$Factory$Impl;
        this.localMenuComboDetailsPresenter = localMenuComboDetailsPresenter$Factory$Impl;
        this.localExplanatoryDialogPresenter = localExplanatoryDialogPresenter$Factory$Impl;
        this.localHomePresenter = localHomePresenter$Factory$Impl;
        this.localCashBalancePresenter = localCashBalancePresenter$Factory$Impl;
        this.localAddBrandsPresenter = localAddBrandsPresenter$Factory$Impl;
        this.educationalSheetPresenter = educationalSheetPresenter$Factory$Impl;
        this.shortlinkPresenter = localShortlinkPresenter$Factory$Impl;
        this.brandCollectionMapPresenter = localBrandCollectionMapPresenter$Factory$Impl;
        this.fulfillmentPickerPresenter = fulfillmentPickerPresenter$Factory$Impl;
        this.localEditorialPresenter = localEditorialPresenter$Factory$Impl;
        this.loyaltySheetPresenter = loyaltySheetPresenter$Factory$Impl;
        this.schedulingDayTimePickerPresenter = schedulingDayTimePickerPresenter$Factory$Impl;
        this.marketingMessagePresenter = marketingMessagePresenter$Factory$Impl;
        this.marketingMessagesPresenter = marketingMessagesPresenter$Factory$Impl;
        this.allActivityPresenter = localCashAllActivityPresenter$Factory$Impl;
        this.tableQrCodeScannerPresenter = tableQrCodeScannerPresenter$Factory$Impl;
        this.posBrandOnboardingPresenter = localPosBrandOnboardingPresenter$Factory$Impl;
        this.posLocalCashRedemptionPresenter = localPosLocalCashRedemptionPresenter$Factory$Impl;
        this.posCheckInPresenter = localPosCheckInPresenter$Factory$Impl;
        this.curbsidePickupCarPresenter = curbsidePickupCarPresenter$Factory$Impl;
    }
}
