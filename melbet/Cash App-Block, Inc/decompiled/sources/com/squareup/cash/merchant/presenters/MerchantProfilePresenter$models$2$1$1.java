package com.squareup.cash.merchant.presenters;

import android.app.Activity;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.spatial.ThrottledCallbacksKt;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewGroupKt;
import androidx.credentials.Credential;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.navigation.api.RealCashLocalNavigator;
import app.cash.local.presenters.LocalAddBrandsPresenter;
import app.cash.local.presenters.LocalAddBrandsPresenter$models$2$1;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.fulfillment.ActiveFulfillmentType;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenterKt$WhenMappings;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.DeliveryQuote;
import app.cash.local.primitives.EstimatedCompletionDurationKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.GlobalAddressWrapper;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.viewmodels.LocalAddBrandsViewEvent;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchCleared;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchClicked;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchInput;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewEvent;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.size.DimensionKt;
import coil3.size.ViewSizeResolver$size$3$1;
import coil3.util.BitmapsKt;
import com.fillr.e0;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountInboundNavigator;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.presenters.AccountPresenter;
import com.squareup.cash.account.presenters.AccountPresenter$models$1$1;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.BusinessInfoScreen;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.amountchooser.presenters.KeypadAmountChangedHandled;
import com.squareup.cash.amountchooser.presenters.TapAmountSelectorOptionHandled;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewEvent;
import com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsQrCodeModel;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinDepositCopyScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cashapppay.settings.screens.CashAppPaySettingsScreen;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.bankingoption.BankingOptionBrowseViewItem;
import com.squareup.cash.cdf.bankingoption.EntryScreen;
import com.squareup.cash.cdf.businessgrant.BusinessGrantViewOpenList;
import com.squareup.cash.cdf.crypto.CryptoDepositShareInvoice;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenDisputes;
import com.squareup.cash.cdf.customersupport.CustomerSupportFullTransactionPickerStart;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneViewStatus;
import com.squareup.cash.cdf.customersupport.CustomerSupportSearchStart;
import com.squareup.cash.cdf.customersupport.FullTransactionPickerOrigin;
import com.squareup.cash.cdf.minthype.MintHypeTapHypeBadge;
import com.squareup.cash.cdf.money.MoneyBrowseViewItem;
import com.squareup.cash.cdf.money.MoneyItemId;
import com.squareup.cash.cdf.money.MoneyItemPromotionState;
import com.squareup.cash.cdf.personalprofile.PersonalProfileManageAddAccount;
import com.squareup.cash.cdf.personalprofile.PersonalProfileManageAddPhoto;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSource;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenLink;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewShare;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardLanguageToggleTap;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.cdf.qrcodeshortcuts.QRCodeShortcutsProfileAddWidget;
import com.squareup.cash.cdf.savingsfolder.SavingsFolderManageViewAllActivity;
import com.squareup.cash.cdf.shifts.ShiftsClockInStart;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageAllowanceChangeSchedule;
import com.squareup.cash.cdf.stock.OrderSide;
import com.squareup.cash.cdf.stock.StockTradeSetPrice;
import com.squareup.cash.cdf.thread.EntryPoint;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewEvent;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.exchangedata.api.FxExchangeRate;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewEvent;
import com.squareup.cash.favorites.viewmodels.FavoriteViewModel;
import com.squareup.cash.favorites.viewmodels.SectionViewModel;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$LinkedBusinessesSettingPlasmaFlowAndroid;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$2;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomOrderPresenter;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.merchant.backend.api.MerchantProfileData;
import com.squareup.cash.money.analytics.MoneyAnalyticsContext$Item;
import com.squareup.cash.money.analytics.MoneyAnalyticsItem;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsContext;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsServiceKt;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenterKt;
import com.squareup.cash.money.screens.HypeWelcomeScreen;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersAnalyticsState;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$7$2;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$7$4;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.offers.viewmodels.viewevents.OfferDetailsSheetClosed;
import com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter$models$3$1;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSkipDialogModel;
import com.squareup.cash.passkeys.screens.PasskeyManagementScreen;
import com.squareup.cash.paymentpad.presenters.FxExchangeRates;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$WhenMappings;
import com.squareup.cash.paymentpad.screens.LitePaymentPadSheetScreen;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewEvent;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.presenters.PoolMemberListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.screens.PoolInvitePeopleQuestion;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewEvent;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCardPlanningState;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recurringpayments.presenters.RealCreateOrEditRecurringPaymentPresenter;
import com.squareup.cash.recurringpayments.presenters.RealCreateOrEditRecurringPaymentPresenter$models$1$1;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.cash.recurringpayments.screens.SelectCadenceScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewEvent;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.data.ActiveGoal;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.savings.presenters.LoadedSavingsModel;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$handleBalanceSeen$1;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.screens.SavingsFullActivityScreen;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.savings.screens.TransferOutScreen$Full;
import com.squareup.cash.savings.viewmodels.SavingsHeaderEvent$InformationClicked;
import com.squareup.cash.savings.viewmodels.SavingsHeaderEvent$RouteClicked;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.screens.RedactedStringList;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetScreen;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsScreen;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputesHistoryResult;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.ArticlesService$AllArticlesResult;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportHomeViewEvent;
import com.squareup.cash.support.viewmodels.SupportNotification;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.ui.qrcodes.RealQrShortcutInstaller;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.ShiftDataLoader;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.presenters.shift.ShiftListPresenter;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.screens.ClockInResult$Cancelled;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.ShiftListViewEvent;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.genericelements.ui.ComponentElement;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.protos.cash.genericelements.ui.ContainerElement$Container$Series;
import com.squareup.protos.cash.genericelements.ui.ContainerElement$Container$Single;
import com.squareup.protos.cash.genericelements.ui.RefreshTrigger;
import com.squareup.protos.cash.genericelements.ui.RefreshTrigger$Trigger$BoostContentUpdate;
import com.squareup.protos.cash.genericelements.ui.SeriesContainer;
import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountEntryPoint;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.whimsicard.flows.v1.InitiationSource;
import com.squareup.protos.cash.whimsicard.flows.v1.OrderPaymentDeviceFlowParameters;
import com.squareup.protos.cash.whimsicard.flows.v1.PaymentDeviceConfig;
import com.squareup.protos.cash.whimsicard.flows.v1.PaymentDeviceOrderScenarioType;
import com.squareup.protos.cash.whimsicard.flows.v1.PresentationMode;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.Coordinates;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.MoshiJsonIntegration;
import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import designsystem.arcade.ArcadeColors;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import okio.Okio;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.wires.WiresAccountInfo;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MerchantProfilePresenter$models$2$1$1 implements FlowCollector {
    public final /* synthetic */ Object $genericTreeAction$delegate;
    public final /* synthetic */ Object $genericTreeViewEvent$delegate;
    public final /* synthetic */ MutableState $merchantProfileToken$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $refreshTriggers$delegate;
    public final /* synthetic */ MutableState $state$delegate;
    public final /* synthetic */ MutableState $treeElementsData$delegate;
    public final /* synthetic */ Object this$0;

    public MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, MoneyTabPresenter moneyTabPresenter, CoroutineScope coroutineScope2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.$r8$classId = 9;
        this.$refreshTriggers$delegate = moneyTabPresenter;
        this.$genericTreeAction$delegate = coroutineScope2;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
        this.this$0 = coroutineScope;
    }

    private final Object emit$com$squareup$cash$family$familyhub$presenters$SetDependentCustomLimitPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$refreshTriggers$delegate;
        MutableState mutableState2 = (MutableState) this.$genericTreeViewEvent$delegate;
        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.$genericTreeAction$delegate;
        CoroutineContext coroutineContext = (CoroutineContext) poolsListPresenter.dateFormatManager;
        SetDependentCustomLimitScreen setDependentCustomLimitScreen = (SetDependentCustomLimitScreen) poolsListPresenter.analytics;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        AmountChooserViewEvent amountChooserViewEvent = (AmountChooserViewEvent) obj;
        boolean z = amountChooserViewEvent instanceof AmountChooserViewEvent.KeypadAmountChanged;
        MutableState mutableState3 = this.$merchantProfileToken$delegate;
        MutableState mutableState4 = this.$state$delegate;
        MutableState mutableState5 = this.$treeElementsData$delegate;
        if (z) {
            KeypadAmountChangedHandled handle = WiresAccountInfo.WiresProfile.handle((AmountChooserViewEvent.KeypadAmountChanged) amountChooserViewEvent, (List) mutableState4.getValue(), (Versioned) mutableState3.getValue());
            String str = handle.rawAmount;
            ArrayList arrayList = handle.amountSelectorOptions;
            Versioned versioned = handle.shouldShakeAmountAndShowLimitText;
            mutableState5.setValue(str);
            mutableState4.setValue(arrayList);
            mutableState3.setValue(versioned);
        } else if (amountChooserViewEvent instanceof AmountChooserViewEvent.TapAmountSelectorOption) {
            TapAmountSelectorOptionHandled handle2 = WiresAccountInfo.WiresProfile.handle((AmountChooserViewEvent.TapAmountSelectorOption) amountChooserViewEvent, (String) mutableState5.getValue(), (List) mutableState4.getValue(), ((Boolean) mutableState2.getValue()).booleanValue());
            String str2 = handle2.rawAmount;
            List list = handle2.amountSelectorOptions;
            boolean z2 = handle2.shouldExpand;
            mutableState5.setValue(str2);
            mutableState4.setValue(list);
            mutableState2.setValue(Boolean.valueOf(z2));
        } else if (Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.Expanded.INSTANCE)) {
            mutableState2.setValue(Boolean.TRUE);
        } else if (Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.TapDismiss.INSTANCE)) {
            ((BetterNavigator.ScreenNavigator) poolsListPresenter.navigator).goTo(Back.INSTANCE);
        } else {
            Continuation continuation2 = null;
            if (Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.TapSecondaryButton.INSTANCE)) {
                JobKt.launch$default(coroutineScope, coroutineContext, null, new FormCashtag.AnonymousClass8.AnonymousClass2(poolsListPresenter, mutableState, continuation2, 9), 2);
            } else {
                if (!Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.TapPrimaryButton.INSTANCE)) {
                    throw new IllegalStateException(amountChooserViewEvent + " shouldn't be present in SetDependentCustomLimitPresenter");
                }
                String str3 = (String) mutableState5.getValue();
                int ordinal = setDependentCustomLimitScreen.controlType.ordinal();
                if (WiresAccountInfo.WiresProfile.isInLimit(new Long((ordinal == 1 || ordinal == 2) ? 1000L : 500L), str3, new Long(setDependentCustomLimitScreen.maxAmountInCents))) {
                    mutableState.setValue(Boolean.TRUE);
                    JobKt.launch$default(coroutineScope, coroutineContext, null, new FormCashtag.AnonymousClass8.AnonymousClass2(poolsListPresenter, new Money(new Long(WiresAccountInfo.WiresProfile.toCents((String) mutableState5.getValue())), setDependentCustomLimitScreen.currencyCode, 4), continuation2, 10), 2);
                } else {
                    mutableState3.setValue(VersionedKt.update((Versioned) mutableState3.getValue(), Boolean.TRUE));
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.$refreshTriggers$delegate;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        AddFavoritesViewEvent addFavoritesViewEvent = (AddFavoritesViewEvent) obj;
        if (addFavoritesViewEvent instanceof AddFavoritesViewEvent.ListRowClicked) {
            EglCore eglCore = (EglCore) localHomePresenter.embeddedMapEnabled$delegate;
            Recipient recipient = ((AddFavoritesViewEvent.ListRowClicked) addFavoritesViewEvent).favorite.recipient;
            AddFavorites addFavorites = (AddFavorites) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
            UUID uuid = addFavorites.externalId;
            EntryPoint[] entryPointArr = EntryPoint.$VALUES;
            eglCore.showFavorite(uuid, recipient, addFavorites);
        } else if (addFavoritesViewEvent instanceof AddFavoritesViewEvent.SearchQueryChanged) {
            this.$state$delegate.setValue(((AddFavoritesViewEvent.SearchQueryChanged) addFavoritesViewEvent).query);
        } else if (addFavoritesViewEvent instanceof AddFavoritesViewEvent.FavoriteClicked) {
            this.$merchantProfileToken$delegate.setValue(Boolean.TRUE);
            String str = ((AddFavoritesViewEvent.FavoriteClicked) addFavoritesViewEvent).customerId;
            boolean contains = ((List) this.$treeElementsData$delegate.getValue()).contains(str);
            MutableState mutableState = (MutableState) this.$genericTreeViewEvent$delegate;
            List list = (List) mutableState.getValue();
            list.getClass();
            List<SectionViewModel> list2 = list;
            int i = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (SectionViewModel sectionViewModel : list2) {
                List<FavoriteViewModel> list3 = sectionViewModel.favorites;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i));
                for (FavoriteViewModel favoriteViewModel : list3) {
                    if (favoriteViewModel.customerId.equals(str)) {
                        favoriteViewModel = FavoriteViewModel.copy$default(favoriteViewModel, true, false, 4063);
                    }
                    arrayList2.add(favoriteViewModel);
                }
                arrayList.add(SectionViewModel.copy$default(sectionViewModel, arrayList2));
                i = 10;
            }
            mutableState.setValue(arrayList);
            JobKt.launch$default(coroutineScope, null, null, new RealPayDataLoader$fetchData$1(contains, localHomePresenter, str, addFavoritesViewEvent, (State) this.$genericTreeAction$delegate, (Continuation) null), 3);
        } else if (addFavoritesViewEvent instanceof AddFavoritesViewEvent.GrantContactsPermissionClicked) {
            JobKt.launch$default(coroutineScope, null, null, new GooglePayPresenter$models$1$1(localHomePresenter, null, 25), 3);
        } else if (addFavoritesViewEvent instanceof AddFavoritesViewEvent.CloseClicked) {
            ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(Back.INSTANCE);
        } else {
            if (!(addFavoritesViewEvent instanceof AddFavoritesViewEvent.OnDialogResult)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            AddFavoritesViewEvent.OnDialogResult onDialogResult = (AddFavoritesViewEvent.OnDialogResult) addFavoritesViewEvent;
            Screen screen = onDialogResult.screenArgs;
            Object obj2 = onDialogResult.result;
            if ((screen instanceof PaymentScreens.ContactSyncPermissionScreen) && obj2 == AlertDialogResult.POSITIVE) {
                ((ModifiablePermissions) localHomePresenter.tabContentPresenterFactory).request();
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$investing$presenters$custom$order$InvestingCustomOrderPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String format2;
        String format3;
        MutableState mutableState = (MutableState) this.$refreshTriggers$delegate;
        InvestingCustomOrderPresenter investingCustomOrderPresenter = (InvestingCustomOrderPresenter) this.this$0;
        MoneyFormatter moneyFormatter = investingCustomOrderPresenter.moneyFormatter;
        BetterNavigator.ScreenNavigator screenNavigator = investingCustomOrderPresenter.navigator;
        AndroidStringManager androidStringManager = investingCustomOrderPresenter.stringManager;
        InvestingScreens.CustomOrderScreen customOrderScreen = investingCustomOrderPresenter.screen;
        InvestingCustomOrderViewEvent investingCustomOrderViewEvent = (InvestingCustomOrderViewEvent) obj;
        if (Intrinsics.areEqual(investingCustomOrderViewEvent, InvestingCustomOrderViewEvent.BackPressed.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (Intrinsics.areEqual(investingCustomOrderViewEvent, InvestingCustomOrderViewEvent.KeypadPressed.INSTANCE)) {
            screenNavigator.goTo(new InvestingScreens.CustomSharePriceScreen(customOrderScreen.f1157type, customOrderScreen.side, customOrderScreen.accentColor));
        } else if (investingCustomOrderViewEvent instanceof InvestingCustomOrderViewEvent.PriceSet) {
            int ordinal = customOrderScreen.side.ordinal();
            if (ordinal == 0) {
                investingCustomOrderPresenter.firstBuyPreference.set(true);
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                investingCustomOrderPresenter.firstSellPreference.set(true);
            }
            InvestingScreens.OrderTypeSelectionScreen.Type type2 = customOrderScreen.f1157type;
            InvestingScreens.OrderTypeSelectionScreen.Type.Equity equity = type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity ? (InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type2 : null;
            if (equity != null) {
                RealInvestingAnalytics realInvestingAnalytics = investingCustomOrderPresenter.analytics;
                OrderSide cdf = ProcessPhoenix.toCdf(customOrderScreen.side);
                String str = equity.symbol;
                long j = ((InvestingCustomOrderViewEvent.PriceSet) investingCustomOrderViewEvent).targetUsdPerShare;
                str.getClass();
                realInvestingAnalytics.analytics.track(new StockTradeSetPrice(cdf, str, Long.valueOf(j)), null);
            }
            InvestingCustomOrderViewEvent.PriceSet priceSet = (InvestingCustomOrderViewEvent.PriceSet) investingCustomOrderViewEvent;
            long j2 = priceSet.targetUsdPerShare;
            if (j2 > 0) {
                InvestingScreens.OrderTypeSelectionScreen.Type type3 = customOrderScreen.f1157type;
                if (type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
                    InvestmentEntityToken investmentEntityToken = ((InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type3).entityToken;
                    com.squareup.protos.franklin.investing.resources.OrderSide orderSide = customOrderScreen.side;
                    long j3 = priceSet.currentUsdPerShare;
                    screenNavigator.goTo(new InvestingScreens.TransferStock(investmentEntityToken, orderSide, j3, customOrderScreen.accentColor, new InvestingScreens.OrderType.CustomOrder(j3, j2), null, 128));
                } else {
                    if (!(type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BitcoinInboundNavigator.showTransferBitcoin$default(investingCustomOrderPresenter.bitcoinInboundNavigator, customOrderScreen.side == com.squareup.protos.franklin.investing.resources.OrderSide.BUY, new BitcoinTransferScreen.OrderType.CustomOrder(priceSet.currentUsdPerShare, j2), null, null, null, null, 496);
                }
            } else {
                screenNavigator.goTo(new InvestingScreens.InvestingExplanatoryDialogScreen(androidStringManager.get(R.string.custom_order_invalid_target_price), customOrderScreen.accentColor));
            }
        } else {
            boolean z = investingCustomOrderViewEvent instanceof InvestingCustomOrderViewEvent.MetricPressed;
            MutableState mutableState2 = this.$state$delegate;
            if (z) {
                InvestingScreens.OrderTypeSelectionScreen.Type type4 = customOrderScreen.f1157type;
                if (type4 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
                    InvestingCustomOrderViewEvent.MetricPressed metricPressed = (InvestingCustomOrderViewEvent.MetricPressed) investingCustomOrderViewEvent;
                    long j4 = metricPressed.targetUsdPerShare;
                    String format4 = moneyFormatter.format(new Money(new Long(j4), CurrencyCode.USD, 4));
                    long j5 = metricPressed.currentUsdPerShare;
                    if (j4 == j5) {
                        format3 = androidStringManager.get(R.string.custom_order_sell_current_metric_btc);
                    } else if (j4 < j5) {
                        format4.getClass();
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        format3 = new MessageFormat(resources.getString(R.string.custom_order_sell_down_metric)).format(new Object[]{format4});
                        format3.getClass();
                    } else {
                        format4.getClass();
                        Resources resources2 = androidStringManager.resources;
                        resources2.getClass();
                        format3 = new MessageFormat(resources2.getString(R.string.custom_order_sell_up_metric)).format(new Object[]{format4});
                        format3.getClass();
                    }
                    mutableState2.setValue(format3);
                } else {
                    if (!(type4 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InvestingCustomOrderViewEvent.MetricPressed metricPressed2 = (InvestingCustomOrderViewEvent.MetricPressed) investingCustomOrderViewEvent;
                    long j6 = metricPressed2.targetUsdPerShare;
                    String format5 = moneyFormatter.format(new Money(new Long(j6), CurrencyCode.USD, 4));
                    long j7 = metricPressed2.currentUsdPerShare;
                    if (j6 == j7) {
                        format2 = androidStringManager.get(R.string.custom_order_sell_current_metric_btc);
                    } else if (j6 < j7) {
                        format5.getClass();
                        Resources resources3 = androidStringManager.resources;
                        resources3.getClass();
                        format2 = new MessageFormat(resources3.getString(R.string.custom_order_sell_down_metric_btc)).format(new Object[]{format5});
                        format2.getClass();
                    } else {
                        format5.getClass();
                        Resources resources4 = androidStringManager.resources;
                        resources4.getClass();
                        format2 = new MessageFormat(resources4.getString(R.string.custom_order_sell_up_metric_btc)).format(new Object[]{format5});
                        format2.getClass();
                    }
                    mutableState2.setValue(format2);
                }
            } else if (Intrinsics.areEqual(investingCustomOrderViewEvent, InvestingCustomOrderViewEvent.OverlayPressed.INSTANCE)) {
                this.$merchantProfileToken$delegate.setValue(Boolean.TRUE);
            } else if (investingCustomOrderViewEvent instanceof InvestingCustomOrderViewEvent.SelectedPrice) {
                this.$treeElementsData$delegate.setValue((InvestingCustomOrderViewEvent.SelectedPrice) investingCustomOrderViewEvent);
            } else if (investingCustomOrderViewEvent instanceof InvestingCustomOrderViewEvent.SelectedRange) {
                MutableState mutableState3 = (MutableState) this.$genericTreeViewEvent$delegate;
                Boolean bool = Boolean.FALSE;
                mutableState3.setValue(bool);
                mutableState.setValue(bool);
                ((MutableState) this.$genericTreeAction$delegate).setValue(((InvestingCustomOrderViewEvent.SelectedRange) investingCustomOrderViewEvent).range);
            } else if (Intrinsics.areEqual(investingCustomOrderViewEvent, InvestingCustomOrderViewEvent.CloseExplanation.INSTANCE)) {
                mutableState2.setValue(null);
            } else {
                if (!Intrinsics.areEqual(investingCustomOrderViewEvent, InvestingCustomOrderViewEvent.GraphReset.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                mutableState.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$money$presenters$MoneyTabPresenter$models$$inlined$CollectEffect$2$1(Object obj, Continuation continuation) {
        String str;
        Instant instant;
        ArrayList arrayList;
        Iterable iterable;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        MoneyTabEvent moneyTabEvent = (MoneyTabEvent) obj;
        Continuation continuation2 = null;
        if (moneyTabEvent instanceof MoneyTabEvent.TabToolbarEvent) {
            JobKt.launch$default(coroutineScope, null, null, new MusicPresenter$models$2$1((MoneyTabPresenter) this.$refreshTriggers$delegate, moneyTabEvent, null, 11), 3);
        } else if (moneyTabEvent instanceof MoneyTabEvent.VisibleRangeChanged) {
            MoneyAnalyticsService moneyAnalyticsService = ((MoneyTabPresenter) this.$refreshTriggers$delegate).moneyAnalyticsService;
            IntRange intRange = ((MoneyTabEvent.VisibleRangeChanged) moneyTabEvent).visibleRange;
            RealMoneyAnalyticsService realMoneyAnalyticsService = (RealMoneyAnalyticsService) moneyAnalyticsService;
            intRange.getClass();
            RealMoneyAnalyticsContext realMoneyAnalyticsContext = realMoneyAnalyticsService.analyticsContext;
            synchronized (realMoneyAnalyticsContext) {
                try {
                    arrayList = new ArrayList();
                    IntProgressionIterator it = intRange.iterator();
                    while (it.hasNext) {
                        List list = (List) realMoneyAnalyticsContext.itemIdsByIndexes.get(Integer.valueOf(it.nextInt()));
                        if (list != null) {
                            List list2 = list;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    iterable = arrayList2;
                                    break;
                                }
                                MoneyAnalyticsItem moneyAnalyticsItem = (MoneyAnalyticsItem) realMoneyAnalyticsContext.itemsByIds.get((ItemId) it2.next());
                                if (moneyAnalyticsItem == null) {
                                    iterable = EmptyList.INSTANCE;
                                    break;
                                }
                                ItemId itemId = moneyAnalyticsItem.id;
                                int intValue = moneyAnalyticsItem.index + ((Number) realMoneyAnalyticsContext.sectionItemOffsets.get(moneyAnalyticsItem.sectionIndex)).intValue();
                                int i = moneyAnalyticsItem.index;
                                SectionId sectionId = (SectionId) realMoneyAnalyticsContext.sectionIds.get(moneyAnalyticsItem.sectionIndex);
                                int i2 = moneyAnalyticsItem.sectionIndex;
                                arrayList2.add(new MoneyAnalyticsContext$Item(itemId, intValue, i, sectionId, i2, ((Number) realMoneyAnalyticsContext.sectionTotals.get(i2)).intValue(), moneyAnalyticsItem.isPromoted));
                            }
                        } else {
                            iterable = EmptyList.INSTANCE;
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(iterable, arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                MoneyAnalyticsContext$Item moneyAnalyticsContext$Item = (MoneyAnalyticsContext$Item) it3.next();
                ItemId itemId2 = moneyAnalyticsContext$Item.id;
                MoneyItemId cDFItemId = RealMoneyAnalyticsServiceKt.toCDFItemId(itemId2);
                if (cDFItemId == null) {
                    if (itemId2 instanceof ItemId.DEPOSIT) {
                        RealMoneyAnalyticsService.EXPECTED_MISSING_DEPOSIT_IDS.contains(((ItemId.DEPOSIT) itemId2).value);
                    }
                } else if (realMoneyAnalyticsService.viewItemsSet.add(cDFItemId)) {
                    if (itemId2 instanceof ItemId.DEPOSIT) {
                        realMoneyAnalyticsService.analytics.track(new BankingOptionBrowseViewItem(((ItemId.DEPOSIT) itemId2).value, EntryScreen.MoneyTab), null);
                    }
                    realMoneyAnalyticsService.analytics.track(new MoneyBrowseViewItem(realMoneyAnalyticsService.flowToken, RealMoneyAnalyticsServiceKt.toCDFSectionId(moneyAnalyticsContext$Item.sectionId), Integer.valueOf(moneyAnalyticsContext$Item.sectionIndex), Integer.valueOf(moneyAnalyticsContext$Item.sectionTotal), cDFItemId, Integer.valueOf(moneyAnalyticsContext$Item.itemIndex), Integer.valueOf(moneyAnalyticsContext$Item.absoluteItemIndex), Integer.valueOf(realMoneyAnalyticsService.version), moneyAnalyticsContext$Item.isPromoted ? MoneyItemPromotionState.PROMOTED : MoneyItemPromotionState.DEFAULT), null);
                }
            }
        } else if (moneyTabEvent instanceof MoneyTabEvent.NavigateToWallet) {
            JobKt.launch$default((CoroutineScope) this.$genericTreeAction$delegate, null, null, new GenieViewKt$GenieView$1$1((MoneyTabPresenter) this.$refreshTriggers$delegate, moneyTabEvent, continuation2, 15), 3);
        } else if (!Intrinsics.areEqual(moneyTabEvent, MoneyTabEvent.SuspensionsBannerClicked.INSTANCE)) {
            if (Intrinsics.areEqual(moneyTabEvent, MoneyTabEvent.NavigateToMoneybot.INSTANCE)) {
                ((MoneyTabPresenter) this.$refreshTriggers$delegate).navigator.goTo(new MoneybotChatScreen((ChatKickoffParams) null, (MoneybotChatEntryPoint) null, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 63));
            } else if (Intrinsics.areEqual(moneyTabEvent, MoneyTabEvent.Viewed.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new ToastKt$Toast$7$1(this.$state$delegate, null, 13), 3);
            } else if (Intrinsics.areEqual(moneyTabEvent, MoneyTabEvent.HandleBack.INSTANCE)) {
                MoneyTabPresenter moneyTabPresenter = (MoneyTabPresenter) this.$refreshTriggers$delegate;
                e0 e0Var = moneyTabPresenter.moneyProfileManager;
                BetterNavigator.ScreenNavigator screenNavigator = moneyTabPresenter.navigator;
                if (!((RealFamilyNavigator$Factory$Impl) e0Var.b).create$1(screenNavigator).handleManagedAccountBack((FamilyProfile) ((RealFamilyProfileManager) e0Var.a).familyProfile.$$delegate_0.getValue())) {
                    screenNavigator.goTo(Back.INSTANCE);
                }
            } else {
                if (!Intrinsics.areEqual(moneyTabEvent, MoneyTabEvent.HypeCountdownClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                NextAvailableCashTag nextAvailableCashTag = (NextAvailableCashTag) this.$merchantProfileToken$delegate.getValue();
                if (nextAvailableCashTag != null && (str = (String) this.$treeElementsData$delegate.getValue()) != null) {
                    ((MoneyTabPresenter) this.$refreshTriggers$delegate).analytics.track(new MintHypeTapHypeBadge(str, PlatformKt.activeAccountTokenOrNull(((MoneyTabPresenter) this.$refreshTriggers$delegate).sessionManager)), null);
                    AndroidClock androidClock = ((MoneyTabPresenter) this.$refreshTriggers$delegate).clock;
                    LocalDate localDate = nextAvailableCashTag.date;
                    Long l = (Long) ((MutableState) this.$genericTreeViewEvent$delegate).getValue();
                    ZoneId zoneId = MoneyTabPresenterKt.HYPE_PDP_LAUNCH_ZONE;
                    if (l == null || (instant = Instant.ofEpochMilli(l.longValue())) == null) {
                        instant = localDate.atTime(9, 0).atZone(MoneyTabPresenterKt.HYPE_PDP_LAUNCH_ZONE).toInstant();
                    }
                    boolean isBefore = DimensionKt.now(androidClock).isBefore(instant);
                    MoneyTabPresenter moneyTabPresenter2 = (MoneyTabPresenter) this.$refreshTriggers$delegate;
                    BetterNavigator.ScreenNavigator screenNavigator2 = moneyTabPresenter2.navigator;
                    if (isBefore) {
                        String localDate2 = nextAvailableCashTag.date.toString();
                        localDate2.getClass();
                        screenNavigator2.goTo(new HypeWelcomeScreen(localDate2, nextAvailableCashTag.symbol, str));
                    } else {
                        FlowStarter flowStarter = moneyTabPresenter2.flowStarter;
                        Flow$Type flow$Type = Flow$Type.ORDER_PAYMENT_DEVICE;
                        PaymentDeviceOrderScenarioType paymentDeviceOrderScenarioType = PaymentDeviceOrderScenarioType.REPLACEMENT_ORDER;
                        InitiationSource initiationSource = InitiationSource.PLASMA;
                        PresentationMode presentationMode = PresentationMode.DEVICE_VIEW;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        ByteString byteString = ByteString.EMPTY;
                        screenNavigator2.goTo(FlowStarter.startPlasmaFlowWithParams$default(flowStarter, flow$Type, new OrderPaymentDeviceFlowParameters(paymentDeviceOrderScenarioType, new PaymentDeviceConfig(emptyList, str, presentationMode, byteString), initiationSource, null, byteString), ((MoneyTabPresenter) this.$refreshTriggers$delegate).args, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$offers$presenters$OffersHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$refreshTriggers$delegate;
        OffersHomePresenter offersHomePresenter = (OffersHomePresenter) this.$genericTreeAction$delegate;
        BetterNavigator.ScreenNavigator screenNavigator = offersHomePresenter.navigator;
        RealOffersAnalytics realOffersAnalytics = offersHomePresenter.analytics;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        OffersHomeViewEvent offersHomeViewEvent = (OffersHomeViewEvent) obj;
        if ((offersHomeViewEvent instanceof OffersHomeViewEvent.OffersPullDownToRefresh) || Intrinsics.areEqual(offersHomeViewEvent, OffersHomeViewEvent.ErrorRetryClicked.INSTANCE)) {
            Boolean bool = Boolean.TRUE;
            MutableState mutableState2 = this.$state$delegate;
            mutableState2.setValue(bool);
            realOffersAnalytics.clearCache();
            JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new RealMRIFactory$sign$2(offersHomePresenter, mutableState2, this.$merchantProfileToken$delegate, null, 11), 1);
        } else {
            boolean areEqual = Intrinsics.areEqual(offersHomeViewEvent, OffersHomeViewEvent.SystemBackPressed.INSTANCE);
            Back back = Back.INSTANCE;
            if (areEqual) {
                if (((OffersSearchViewModel) this.$treeElementsData$delegate.getValue()).isSearchMode) {
                    JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new OffersHomePresenter$models$7$2(offersHomePresenter, null, 0), 1);
                } else {
                    screenNavigator.goTo(back);
                }
            } else if (offersHomeViewEvent instanceof ItemViewed) {
                RealOffersAnalytics.trackImpressionAnalyticsEvents$default(realOffersAnalytics, ((ItemViewed) offersHomeViewEvent).analyticsEventSpecs);
                MutableState mutableState3 = (MutableState) this.$genericTreeViewEvent$delegate;
                LinkedHashSet linkedHashSet = realOffersAnalytics.loggedImpressionEventHashes;
                Parcelable.Creator<OffersAnalyticsState> creator = OffersAnalyticsState.CREATOR;
                linkedHashSet.getClass();
                mutableState3.setValue(new OffersAnalyticsState(linkedHashSet));
            } else if (Intrinsics.areEqual(offersHomeViewEvent, OffersHomeViewEvent.OnSearchBarFocusAcquired.INSTANCE)) {
                RealOffersSearchPresenter realOffersSearchPresenter = offersHomePresenter.offersSearchPresenter;
                realOffersSearchPresenter.getClass();
                if (!realOffersSearchPresenter.isSearchMode()) {
                    realOffersSearchPresenter.isSearchMode$delegate.setValue(Boolean.TRUE);
                    realOffersSearchPresenter.isRestoringFromSearchMode$delegate.setValue(Boolean.FALSE);
                    realOffersSearchPresenter.searchFilterTokens$delegate.setValue("");
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper = realOffersSearchPresenter.analyticsHelper;
                    realOffersAnalyticsHelper.searchSourceScreen = "";
                    realOffersAnalyticsHelper.searchSourceSection = "";
                    realOffersAnalyticsHelper.searchSourceFilter = "";
                }
            } else if (Intrinsics.areEqual(offersHomeViewEvent, OffersHomeViewEvent.SearchBarBackButtonClicked.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new OffersHomePresenter$models$7$2(offersHomePresenter, null, 3), 1);
            } else if (offersHomeViewEvent instanceof OffersHomeViewEvent.OffersHomePillClicked) {
                OffersHomePresenter.access$routeActionUrl(offersHomePresenter, ((OffersHomeViewEvent.OffersHomePillClicked) offersHomeViewEvent).actionUrl, (String) mutableState.getValue());
            } else if (offersHomeViewEvent instanceof OffersHomeViewEvent.OffersHeroTileClicked) {
                JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new OffersHomePresenter$models$7$4(offersHomeViewEvent, offersHomePresenter, mutableState, null, 0), 1);
            } else if (offersHomeViewEvent instanceof OffersHomeViewEvent.OffersClusterInfoItemClicked) {
                OffersHomePresenter.access$routeActionUrl(offersHomePresenter, ((OffersHomeViewEvent.OffersClusterInfoItemClicked) offersHomeViewEvent).actionUrl, (String) mutableState.getValue());
            } else if (offersHomeViewEvent instanceof OffersHomeViewEvent.OffersClusterItemClicked) {
                JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new OffersHomePresenter$models$7$4(offersHomeViewEvent, offersHomePresenter, mutableState, null, 1), 1);
            } else if (offersHomeViewEvent instanceof OffersHomeViewEvent.OffersCategoryTileClicked) {
                Timber.Forest forest = Timber.Forest;
                String str = ((OffersHomeViewEvent.OffersCategoryTileClicked) offersHomeViewEvent).actionUrl;
                forest.d(Recorder$$ExternalSyntheticOutline2.m("Offers Home Category Tile Clicked with url: ", str), new Object[0]);
                OffersHomePresenter.access$routeActionUrl(offersHomePresenter, str, (String) mutableState.getValue());
            } else if (offersHomeViewEvent instanceof OffersHomeViewEvent.ViewBackEvent) {
                screenNavigator.goTo(back);
            } else if (offersHomeViewEvent instanceof OfferDetailsSheetClosed) {
                offersHomePresenter.analyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.BROWSE);
            } else {
                if (!(offersHomeViewEvent instanceof OffersHomeViewEvent.LegalUrlClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                offersHomePresenter.launcher.launchUrlInInternalBrowser(((OffersHomeViewEvent.LegalUrlClicked) offersHomeViewEvent).url);
            }
        }
        if (offersHomeViewEvent instanceof OffersAnalyticsViewEvent) {
            RealOffersAnalytics.trackGenericAnalyticsEvents$default(realOffersAnalytics, ((OffersAnalyticsViewEvent) offersHomeViewEvent).getAnalyticsActionEventSpecs());
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$p2pblocking$presenters$BaseAllowlistSelectionPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$genericTreeViewEvent$delegate;
        BaseAllowlistSelectionPresenter baseAllowlistSelectionPresenter = (BaseAllowlistSelectionPresenter) this.this$0;
        AndroidStringManager androidStringManager = baseAllowlistSelectionPresenter.stringManager;
        AllowlistSelectionViewEvent allowlistSelectionViewEvent = (AllowlistSelectionViewEvent) obj;
        if (!(allowlistSelectionViewEvent instanceof AllowlistSelectionViewEvent.ChangeSearchText)) {
            boolean areEqual = Intrinsics.areEqual(allowlistSelectionViewEvent, AllowlistSelectionViewEvent.TapClose.INSTANCE);
            MutableState mutableState = this.$merchantProfileToken$delegate;
            if (areEqual || Intrinsics.areEqual(allowlistSelectionViewEvent, AllowlistSelectionViewEvent.TapBack.INSTANCE)) {
                if (baseAllowlistSelectionPresenter.getConfirmsBack()) {
                    String str = androidStringManager.get(R.string.allow_list_skip_dialog_title);
                    String str2 = baseAllowlistSelectionPresenter.firstName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.allow_list_skip_dialog_body)).format(new Object[]{str2});
                    format2.getClass();
                    mutableState.setValue(new AllowlistSkipDialogModel(str, format2, androidStringManager.get(R.string.allow_list_skip_dialog_confirm), androidStringManager.get(R.string.allow_list_skip_dialog_cancel)));
                } else {
                    JobKt.launch$default(coroutineScope, null, null, new BaseAllowlistSelectionPresenter$models$3$1(baseAllowlistSelectionPresenter, null, 0), 3);
                }
            } else if (allowlistSelectionViewEvent instanceof AllowlistSelectionViewEvent.TapContinue) {
                JobKt.launch$default(coroutineScope, null, null, new BaseAllowlistSelectionPresenter$models$3$1(baseAllowlistSelectionPresenter, null, 1), 3);
            } else if (Intrinsics.areEqual(allowlistSelectionViewEvent, AllowlistSelectionViewEvent.ConfirmSkip.INSTANCE)) {
                mutableState.setValue(null);
                JobKt.launch$default(coroutineScope, null, null, new BaseAllowlistSelectionPresenter$models$3$1(baseAllowlistSelectionPresenter, null, 2), 3);
            } else if (Intrinsics.areEqual(allowlistSelectionViewEvent, AllowlistSelectionViewEvent.CancelSkip.INSTANCE)) {
                mutableState.setValue(null);
            } else if (allowlistSelectionViewEvent instanceof AllowlistSelectionViewEvent.TapCustomerButton) {
                JobKt.launch$default(coroutineScope, null, null, new MoneybotChatPresenter$models$6$1(baseAllowlistSelectionPresenter, allowlistSelectionViewEvent, this.$state$delegate, this.$treeElementsData$delegate, (ParcelableSnapshotMutableIntState) this.$refreshTriggers$delegate, (ParcelableSnapshotMutableIntState) this.$genericTreeAction$delegate, null, 22), 3);
            } else if (Intrinsics.areEqual(allowlistSelectionViewEvent, AllowlistSelectionViewEvent.DismissDialog.INSTANCE)) {
                this.$state$delegate.setValue(null);
            } else if (!(allowlistSelectionViewEvent instanceof AllowlistSelectionViewEvent.TapCustomerAvatar)) {
                if (!Intrinsics.areEqual(allowlistSelectionViewEvent, AllowlistSelectionViewEvent.TapSafetyResources.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                JobKt.launch$default(coroutineScope, null, null, new BaseAllowlistSelectionPresenter$models$3$1(baseAllowlistSelectionPresenter, null, 3), 3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r5 == r6) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$paymentpad$presenters$LitePaymentPadPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$genericTreeAction$delegate;
        MutableState mutableState2 = (MutableState) this.$genericTreeViewEvent$delegate;
        MutableState mutableState3 = (MutableState) this.$refreshTriggers$delegate;
        ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
        AndroidStringManager androidStringManager = (AndroidStringManager) shareSheetPresenter.stringManager;
        LitePaymentPadViewEvent litePaymentPadViewEvent = (LitePaymentPadViewEvent) obj;
        boolean z = litePaymentPadViewEvent instanceof LitePaymentPadViewEvent.AmountChanged;
        MutableState mutableState4 = this.$state$delegate;
        MutableState mutableState5 = this.$treeElementsData$delegate;
        MutableState mutableState6 = this.$merchantProfileToken$delegate;
        if (z) {
            mutableState4.setValue(((LitePaymentPadViewEvent.AmountChanged) litePaymentPadViewEvent).rawAmount);
            mutableState6.setValue(null);
            mutableState5.setValue(null);
        } else if (litePaymentPadViewEvent instanceof LitePaymentPadViewEvent.ExchangeRatePreviewTapped) {
            Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default((String) mutableState4.getValue(), (CurrencyCode) mutableState2.getValue());
            CurrencyCode currencyCode = (CurrencyCode) mutableState2.getValue();
            CurrencyCode currencyCode2 = (CurrencyCode) mutableState3.getValue();
            int i = LitePaymentPadPresenter$WhenMappings.$EnumSwitchMapping$0[currencyCode2.ordinal()];
            CurrencyCode currencyCode3 = i != 1 ? i != 2 ? null : CurrencyCode.USD : CurrencyCode.MXN;
            if (currencyCode3 != null) {
                if (currencyCode == currencyCode2) {
                    currencyCode2 = currencyCode3;
                }
                if (currencyCode2 != null) {
                    FxExchangeRate fxExchangeRate = ((FxExchangeRates) mutableState.getValue()).current;
                    Money convertTo = fxExchangeRate != null ? ShareSheetPresenter.convertTo(parseMoneyFromString$default, currencyCode2, fxExchangeRate) : null;
                    if (convertTo != null) {
                        Long l = convertTo.amount;
                        long longValue = l != null ? l.longValue() : 0L;
                        CurrencyCode currencyCode4 = convertTo.currency_code;
                        if (currencyCode4 == null) {
                            currencyCode4 = CurrencyCode.USD;
                        }
                        String plainString = new BigDecimal(longValue).divide(new BigDecimal((long) Moneys.displayDivisor(currencyCode4))).setScale(2, RoundingMode.DOWN).stripTrailingZeros().toPlainString();
                        plainString.getClass();
                        mutableState4.setValue(plainString);
                        mutableState2.setValue(currencyCode2);
                        mutableState6.setValue(null);
                        mutableState5.setValue(null);
                    }
                }
            }
            currencyCode2 = null;
            if (currencyCode2 != null) {
            }
        } else if (litePaymentPadViewEvent instanceof LitePaymentPadViewEvent.Pay) {
            Money convertTo2 = ShareSheetPresenter.convertTo(Moneys.parseMoneyFromString$default((String) mutableState4.getValue(), (CurrencyCode) mutableState2.getValue()), (CurrencyCode) mutableState3.getValue(), ((FxExchangeRates) mutableState.getValue()).current);
            if (convertTo2 == null) {
                mutableState6.setValue(null);
                mutableState5.setValue(androidStringManager.get(R.string.lite_payment_pad_exchange_rate_unavailable_error));
            } else {
                convertTo2.amount.getClass();
                if (r2.longValue() >= Moneys.displayDivisor((CurrencyCode) mutableState3.getValue())) {
                    mutableState6.setValue(null);
                    mutableState5.setValue(null);
                    screenNavigator.goTo(new PaymentScreens.PaymentConfiguration(RealUuidGenerator.generate(), convertTo2, Orientation.CASH, new LitePaymentPadSheetScreen(false), (AppCreationActivity) null, (String) null, (String) null, (String) null, new PaymentConfigurationFlow.Lite(new PaymentFlowData.StandardFlowData(new RedactedString("Cash App Payment"), null, 2)), (BlockersData.MoneybotContext) null, 1508));
                } else {
                    String format2 = ((MoneyFormatter) shareSheetPresenter.analytics).format(new Money(new Long((long) Moneys.displayDivisor((CurrencyCode) mutableState3.getValue())), (CurrencyCode) mutableState3.getValue(), 4));
                    format2.getClass();
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format3 = new MessageFormat(resources.getString(R.string.minimum_amount_send_error)).format(new Object[]{format2});
                    format3.getClass();
                    mutableState5.setValue(format3);
                    mutableState6.setValue(VersionedKt.update((Versioned) mutableState6.getValue(), Unit.INSTANCE));
                }
            }
        } else if (litePaymentPadViewEvent instanceof LitePaymentPadViewEvent.QrCode) {
            ((EglCore) shareSheetPresenter.modelUpdates).goToCashQrCodeScanner(true);
        } else {
            if (!(litePaymentPadViewEvent instanceof LitePaymentPadViewEvent.Dismiss)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$pools$presenters$PoolMemberListPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Screen profileFor;
        Screen profileFor2;
        PoolMemberListPresenter poolMemberListPresenter = (PoolMemberListPresenter) this.$refreshTriggers$delegate;
        BetterNavigator.ScreenNavigator screenNavigator = poolMemberListPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        PoolMemberListViewEvent poolMemberListViewEvent = (PoolMemberListViewEvent) obj;
        boolean z = poolMemberListViewEvent instanceof PoolMemberListViewEvent.AddPeople;
        MutableState mutableState = this.$state$delegate;
        if (z) {
            List list = (List) mutableState.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((PoolParticipant) it.next()).customer_identifier;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            screenNavigator.askQuestion(new PoolInvitePeopleQuestion(new RedactedStringList(arrayList)), new OverridingUtil.AnonymousClass7(3, poolMemberListPresenter, mutableState));
        } else {
            boolean z2 = poolMemberListViewEvent instanceof PoolMemberListViewEvent.Close;
            Back back = Back.INSTANCE;
            if (z2) {
                screenNavigator.goTo(back);
            } else {
                boolean z3 = poolMemberListViewEvent instanceof PoolMemberListViewEvent.RemovePerson;
                Object obj2 = this.$genericTreeViewEvent$delegate;
                if (z3) {
                    JobKt.launch$default(coroutineScope, poolMemberListPresenter.ioDispatcher, null, new ZiplineLoader$load$2(poolMemberListPresenter, poolMemberListViewEvent, (State) this.$genericTreeAction$delegate, this.$merchantProfileToken$delegate, mutableState, this.$treeElementsData$delegate, (MutableState) obj2, (Continuation) null), 2);
                } else if (Intrinsics.areEqual(poolMemberListViewEvent, PoolMemberListViewEvent.DismissDialog.INSTANCE)) {
                    ((MutableState) obj2).setValue(null);
                } else if (Intrinsics.areEqual(poolMemberListViewEvent, PoolMemberListViewEvent.OwnerTapped.INSTANCE)) {
                    LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                    String str2 = ((PoolOwner) poolMemberListPresenter.args.poolOwner.getValue()).customer_token;
                    str2.getClass();
                    profileFor2 = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(str2, false), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE, RealUuidGenerator.generate(), GetProfileDetailsContext.POOLS, CustomerProfileViewOpen.EntryPoint.CELL, back, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                    screenNavigator.goTo(profileFor2);
                } else {
                    if (!(poolMemberListViewEvent instanceof PoolMemberListViewEvent.AvatarTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    LinkedHashMap linkedHashMap2 = ProfileLauncher.launchedScreens;
                    profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(((PoolMemberListViewEvent.AvatarTapped) poolMemberListViewEvent).personToken, false), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE, RealUuidGenerator.generate(), GetProfileDetailsContext.POOLS, CustomerProfileViewOpen.EntryPoint.CELL, back, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                    screenNavigator.goTo(profileFor);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Object obj2;
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$genericTreeAction$delegate;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
        RealRouter realRouter = (RealRouter) localEditorialPresenter.screen;
        PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent parent = (PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent) localEditorialPresenter.clock;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        PrepurchaseCashCardPlanningViewEvent prepurchaseCashCardPlanningViewEvent = (PrepurchaseCashCardPlanningViewEvent) obj;
        boolean z = prepurchaseCashCardPlanningViewEvent instanceof PrepurchaseCashCardPlanningViewEvent.TapInfoRow;
        MutableState mutableState = this.$state$delegate;
        if (z) {
            Credential credential = ((PrepurchaseCashCardPlanningViewEvent.TapInfoRow) prepurchaseCashCardPlanningViewEvent).action;
            if (credential instanceof PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo) {
                obj2 = new PrepurchaseCardPlanningState.InfoState(((PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo) credential).infoSheet);
            } else {
                if (!(credential instanceof PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                obj2 = PrepurchaseCardPlanningState.SelectPaymentPlanState.INSTANCE;
            }
            mutableState.setValue(obj2);
        } else {
            boolean z2 = prepurchaseCashCardPlanningViewEvent instanceof PrepurchaseCashCardPlanningViewEvent.TapButton;
            Back back = Back.INSTANCE;
            if (z2) {
                PrepurchaseCashCardPlanningViewModel.ButtonAction buttonAction = ((PrepurchaseCashCardPlanningViewEvent.TapButton) prepurchaseCashCardPlanningViewEvent).action;
                if (buttonAction instanceof PrepurchaseCashCardPlanningViewModel.ButtonAction.Toggle) {
                    boolean z3 = ((PrepurchaseCashCardPlanningViewModel.ButtonAction.Toggle) buttonAction).dismissSheet;
                    JobKt.launch$default(coroutineScope, null, null, new DbSessionManager$updateDb$2(buttonAction, localEditorialPresenter, parent.copyWithOrWithoutSheet(!z3), z3 ? back : null, this.$merchantProfileToken$delegate, this.$treeElementsData$delegate, (MutableState) this.$genericTreeViewEvent$delegate, null, 23), 3);
                } else if (buttonAction instanceof PrepurchaseCashCardPlanningViewModel.ButtonAction.ClientRoute) {
                    PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent copyWithOrWithoutSheet = parent.copyWithOrWithoutSheet(!r13.dismissSheet);
                    realRouter.route(new RoutingParams(copyWithOrWithoutSheet, null, copyWithOrWithoutSheet, null, null, null, HttpStatusCode.BAD_GATEWAY_502), ((PrepurchaseCashCardPlanningViewModel.ButtonAction.ClientRoute) buttonAction).url);
                } else {
                    if (!(buttonAction instanceof PrepurchaseCashCardPlanningViewModel.ButtonAction.Dismiss)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (((PrepurchaseCardPlanningState) mutableState.getValue()) instanceof PrepurchaseCardPlanningState.HomeState) {
                        screenNavigator.goTo(back);
                    } else {
                        mutableState.setValue(PrepurchaseCardPlanningState.HomeState.INSTANCE);
                    }
                }
            } else if (prepurchaseCashCardPlanningViewEvent instanceof PrepurchaseCashCardPlanningViewEvent.OpenLink) {
                String str = ((PrepurchaseCashCardPlanningViewEvent.OpenLink) prepurchaseCashCardPlanningViewEvent).url;
                PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent parent2 = (PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent) localEditorialPresenter.clock;
                realRouter.route(new RoutingParams(parent2, null, parent2, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
            } else if (prepurchaseCashCardPlanningViewEvent instanceof PrepurchaseCashCardPlanningViewEvent.SelectOption) {
                this.$treeElementsData$delegate.setValue(((PrepurchaseCashCardPlanningViewEvent.SelectOption) prepurchaseCashCardPlanningViewEvent).identifier);
            } else if (prepurchaseCashCardPlanningViewEvent instanceof PrepurchaseCashCardPlanningViewEvent.SelectLocale) {
                MutableState mutableState2 = (MutableState) this.$refreshTriggers$delegate;
                String str2 = ((PrepurchaseCashCardPlanningViewEvent.SelectLocale) prepurchaseCashCardPlanningViewEvent).localeDisplayName;
                mutableState2.setValue(str2);
                ((Analytics) localEditorialPresenter.installedStore).track(new PrepurchaseCardLanguageToggleTap(str2, (Surface) localEditorialPresenter.responseContextHandler), null);
            } else {
                if (!(prepurchaseCashCardPlanningViewEvent instanceof PrepurchaseCashCardPlanningViewEvent.Close)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(back);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$recurringpayments$presenters$RealCreateOrEditRecurringPaymentPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        RecurringPaymentBlocker.AmountOption amountOption;
        Object obj2 = this.$genericTreeViewEvent$delegate;
        MutableState mutableState = (MutableState) obj2;
        RealCreateOrEditRecurringPaymentPresenter realCreateOrEditRecurringPaymentPresenter = (RealCreateOrEditRecurringPaymentPresenter) this.$genericTreeAction$delegate;
        CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen = realCreateOrEditRecurringPaymentPresenter.args;
        BetterNavigator.ScreenNavigator screenNavigator = realCreateOrEditRecurringPaymentPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        AmountChooserViewEvent amountChooserViewEvent = (AmountChooserViewEvent) obj;
        if (Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.TapDismiss.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else {
            boolean z = amountChooserViewEvent instanceof AmountChooserViewEvent.TapAmountSelectorOption;
            MutableState mutableState2 = this.$treeElementsData$delegate;
            MutableState mutableState3 = this.$state$delegate;
            MutableState mutableState4 = this.$merchantProfileToken$delegate;
            if (z) {
                TapAmountSelectorOptionHandled handle = WiresAccountInfo.WiresProfile.handle((AmountChooserViewEvent.TapAmountSelectorOption) amountChooserViewEvent, (String) mutableState3.getValue(), (List) mutableState4.getValue(), ((Boolean) mutableState2.getValue()).booleanValue());
                String str = handle.rawAmount;
                List list = handle.amountSelectorOptions;
                boolean z2 = handle.shouldExpand;
                mutableState3.setValue(str);
                mutableState4.setValue(list);
                mutableState2.setValue(Boolean.valueOf(z2));
            } else if (amountChooserViewEvent instanceof AmountChooserViewEvent.KeypadAmountChanged) {
                KeypadAmountChangedHandled handle2 = WiresAccountInfo.WiresProfile.handle((AmountChooserViewEvent.KeypadAmountChanged) amountChooserViewEvent, (List) mutableState4.getValue(), (Versioned) mutableState.getValue());
                String str2 = handle2.rawAmount;
                ArrayList arrayList = handle2.amountSelectorOptions;
                Versioned versioned = handle2.shouldShakeAmountAndShowLimitText;
                mutableState3.setValue(str2);
                mutableState4.setValue(arrayList);
                mutableState.setValue(versioned);
            } else if (Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.TapPrimaryButton.INSTANCE) || Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.TapSecondaryButton.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new RealCreateOrEditRecurringPaymentPresenter$models$1$1(amountChooserViewEvent, realCreateOrEditRecurringPaymentPresenter, this.$state$delegate, (MutableState) obj2, (MutableState) this.$refreshTriggers$delegate, null), 3);
            } else if (Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.TapConfigButton.INSTANCE)) {
                realCreateOrEditRecurringPaymentPresenter.analytics.track(new SponsoredAccountManageAllowanceChangeSchedule(createOrEditRecurringPaymentScreen.blockersData.flowToken, Boolean.valueOf(createOrEditRecurringPaymentScreen.isCreate())), null);
                RecurringPaymentBlocker.CadenceMenu cadenceMenu = createOrEditRecurringPaymentScreen.cadenceMenu;
                List list2 = (List) mutableState4.getValue();
                String str3 = (String) mutableState3.getValue();
                boolean isCustom = WiresAccountInfo.WiresProfile.isCustom(str3, list2);
                List<AmountSelectorOption> list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (AmountSelectorOption amountSelectorOption : list3) {
                    if (amountSelectorOption instanceof AmountSelectorOption.PreSetAmountSelectorOption) {
                        AmountSelectorOption.PreSetAmountSelectorOption preSetAmountSelectorOption = (AmountSelectorOption.PreSetAmountSelectorOption) amountSelectorOption;
                        amountOption = new RecurringPaymentBlocker.AmountOption(preSetAmountSelectorOption.amount.amount, Boolean.valueOf(preSetAmountSelectorOption.isSelected), RecurringPaymentBlocker.AmountOption.Type.PRESET, null, 8, null);
                    } else {
                        if (!(amountSelectorOption instanceof AmountSelectorOption.CustomAmountSelectorOption)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        amountOption = new RecurringPaymentBlocker.AmountOption(isCustom ? Long.valueOf(WiresAccountInfo.WiresProfile.toCents(str3)) : null, Boolean.valueOf(isCustom), RecurringPaymentBlocker.AmountOption.Type.CUSTOM, null, 8, null);
                    }
                    arrayList2.add(amountOption);
                }
                screenNavigator.goTo(new SelectCadenceScreen(cadenceMenu, CreateOrEditRecurringPaymentScreen.copy$default(createOrEditRecurringPaymentScreen, null, arrayList2, ((Boolean) mutableState2.getValue()).booleanValue(), 6127)));
            } else {
                if (!Intrinsics.areEqual(amountChooserViewEvent, AmountChooserViewEvent.Expanded.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                mutableState2.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$retro$presenters$SelectPaymentPlanBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String str;
        List<SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option> list;
        SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option option;
        MutableState mutableState = (MutableState) this.$refreshTriggers$delegate;
        SelectPaymentPlanBlockerPresenter selectPaymentPlanBlockerPresenter = (SelectPaymentPlanBlockerPresenter) this.$genericTreeAction$delegate;
        BlockersScreens.SelectPaymentPlanBlockerScreen selectPaymentPlanBlockerScreen = selectPaymentPlanBlockerPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        SelectPaymentPlanViewEvent selectPaymentPlanViewEvent = (SelectPaymentPlanViewEvent) obj;
        if (selectPaymentPlanViewEvent instanceof SelectPaymentPlanViewEvent.Close) {
            Screen back = selectPaymentPlanBlockerPresenter.blockersDataNavigator.getBack(selectPaymentPlanBlockerScreen, selectPaymentPlanBlockerScreen.blockersData);
            if (back == null) {
                back = Back.INSTANCE;
            }
            selectPaymentPlanBlockerPresenter.navigator.goTo(back);
        } else {
            boolean z = selectPaymentPlanViewEvent instanceof SelectPaymentPlanViewEvent.ViewHalfSheet;
            MutableState mutableState2 = this.$state$delegate;
            if (z) {
                mutableState2.setValue(((SelectPaymentPlanViewEvent.ViewHalfSheet) selectPaymentPlanViewEvent).data);
            } else {
                boolean z2 = selectPaymentPlanViewEvent instanceof SelectPaymentPlanViewEvent.DismissHalfSheet;
                MutableState mutableState3 = this.$merchantProfileToken$delegate;
                MutableState mutableState4 = this.$treeElementsData$delegate;
                Continuation continuation2 = null;
                if (z2) {
                    mutableState2.setValue(null);
                    mutableState4.setValue(SelectPaymentPlanBlockerPresenter.getPreselectedPaymentOptionIndex((SelectPaymentPlanBlocker) mutableState3.getValue()));
                } else if (selectPaymentPlanViewEvent instanceof SelectPaymentPlanViewEvent.SelectOption) {
                    mutableState4.setValue(new Integer(((SelectPaymentPlanViewEvent.SelectOption) selectPaymentPlanViewEvent).optionIndex));
                } else {
                    boolean z3 = selectPaymentPlanViewEvent instanceof SelectPaymentPlanViewEvent.UpdatePaymentPlan;
                    SelectPaymentPlanViewModel.ButtonState.Loading loading = SelectPaymentPlanViewModel.ButtonState.Loading.INSTANCE;
                    if (z3) {
                        Integer num = (Integer) mutableState4.getValue();
                        if (num != null) {
                            int intValue = num.intValue();
                            SelectPaymentPlanBlocker.PaymentsTimelineSection paymentsTimelineSection = selectPaymentPlanBlockerScreen.data.payments_timeline_section;
                            paymentsTimelineSection.getClass();
                            SelectPaymentPlanBlocker.OptionsHalfSheetConfig optionsHalfSheetConfig = paymentsTimelineSection.options_half_sheet_config;
                            if (optionsHalfSheetConfig != null && (list = optionsHalfSheetConfig.options) != null && (option = (SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option) CollectionsKt.getOrNull(intValue, list)) != null) {
                                str = option.token;
                                if (str != null || Intrinsics.areEqual(SelectPaymentPlanBlockerPresenter.getPreselectedPaymentOptionIndex((SelectPaymentPlanBlocker) mutableState3.getValue()), (Integer) mutableState4.getValue())) {
                                    mutableState2.setValue(null);
                                } else {
                                    Object obj2 = this.$genericTreeViewEvent$delegate;
                                    ((MutableState) obj2).setValue(loading);
                                    JobKt.launch$default(coroutineScope, null, null, new NotificationActionService$onHandleIntent$1(selectPaymentPlanBlockerPresenter, str, this.$state$delegate, this.$merchantProfileToken$delegate, this.$treeElementsData$delegate, (MutableState) obj2, (Continuation) null), 3);
                                }
                            }
                        }
                        str = null;
                        if (str != null) {
                        }
                        mutableState2.setValue(null);
                    } else {
                        if (!(selectPaymentPlanViewEvent instanceof SelectPaymentPlanViewEvent.ConfirmPaymentPlan)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        mutableState.setValue(loading);
                        JobKt.launch$default(coroutineScope, null, null, new SelectPaymentPlanBlockerPresenter$models$1$2(selectPaymentPlanBlockerPresenter, mutableState3, mutableState, continuation2, 0), 3);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$savings$presenters$SavingsScreenPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        SavingsScreenViewEvent savingsScreenViewEvent = (SavingsScreenViewEvent) obj;
        SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) this.$genericTreeAction$delegate;
        CoroutineContext coroutineContext = (CoroutineContext) savingsScreenPresenter.ioDispatcher;
        LoadedSavingsModel loadedSavingsModel = (LoadedSavingsModel) this.$state$delegate.getValue();
        ActiveGoal activeGoal = loadedSavingsModel != null ? (ActiveGoal) loadedSavingsModel.data : null;
        SavingsBalance savingsBalance = (SavingsBalance) this.$merchantProfileToken$delegate.getValue();
        Money money = (Money) this.$treeElementsData$delegate.getValue();
        MutableState mutableState = (MutableState) this.$genericTreeViewEvent$delegate;
        ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = new ShiftNotePresenter$models$1$1(7, (MutableState) this.$refreshTriggers$delegate);
        ErrorReporter errorReporter = (ErrorReporter) savingsScreenPresenter.errorReporter;
        RealRouter realRouter = savingsScreenPresenter.router;
        Analytics analytics = savingsScreenPresenter.analytics;
        BetterNavigator.ScreenNavigator screenNavigator = savingsScreenPresenter.navigator;
        SavingsScreen.ScreenType screenType = (SavingsScreen.ScreenType) savingsScreenPresenter.screenType;
        if (Intrinsics.areEqual(savingsScreenViewEvent, SavingsScreenViewEvent.Exit.INSTANCE)) {
            screenNavigator.goTo(Back.INSTANCE);
        } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.Clicked) {
            SavingsScreenViewEvent.Clicked clicked = (SavingsScreenViewEvent.Clicked) savingsScreenViewEvent;
            Event event = clicked.analyticsEvent;
            if (event != null) {
                analytics.track(event, null);
            }
            CdfEvent cdfEvent = clicked.cdfEvent;
            if (cdfEvent != null) {
                analytics.track(new UtilsKt$toCdfEvent$2(cdfEvent, new Pair[0]), null);
            }
            realRouter.route(new RoutingParams(new GeneralSavingsScreen(screenType), null, new GeneralSavingsScreen(screenType), null, null, null, HttpStatusCode.BAD_GATEWAY_502), clicked.clientRoute);
        } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.DisclosureUrlClicked) {
            realRouter.route(new RoutingParams(null, null, new GeneralSavingsScreen(screenType), null, null, null, 503), ((SavingsScreenViewEvent.DisclosureUrlClicked) savingsScreenViewEvent).url);
        } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.SavingsHeaderClicked) {
            ViewGroupKt viewGroupKt = ((SavingsScreenViewEvent.SavingsHeaderClicked) savingsScreenViewEvent).event;
            if (viewGroupKt instanceof SavingsHeaderEvent$InformationClicked) {
                SavingsHeaderEvent$InformationClicked savingsHeaderEvent$InformationClicked = (SavingsHeaderEvent$InformationClicked) viewGroupKt;
                CdfEvent cdfEvent2 = savingsHeaderEvent$InformationClicked.cdfEvent;
                if (cdfEvent2 != null) {
                    analytics.track(new UtilsKt$toCdfEvent$2(cdfEvent2, new Pair[0]), null);
                }
                screenNavigator.goTo(new SavingsCardSheet(savingsHeaderEvent$InformationClicked.card, new GeneralSavingsScreen(screenType)));
            } else {
                if (!(viewGroupKt instanceof SavingsHeaderEvent$RouteClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SavingsHeaderEvent$RouteClicked savingsHeaderEvent$RouteClicked = (SavingsHeaderEvent$RouteClicked) viewGroupKt;
                CdfEvent cdfEvent3 = savingsHeaderEvent$RouteClicked.cdfEvent;
                if (cdfEvent3 != null) {
                    analytics.track(new UtilsKt$toCdfEvent$2(cdfEvent3, new Pair[0]), null);
                }
                realRouter.route(new RoutingParams(null, null, new GeneralSavingsScreen(screenType), null, null, null, 503), savingsHeaderEvent$RouteClicked.clientRoute);
            }
        } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.RemoveActiveGoal) {
            JobKt.launch$default(coroutineScope, coroutineContext, null, new BasicShieetKt$BasicShieet$4$1(savingsScreenPresenter, savingsScreenViewEvent, shiftNotePresenter$models$1$1, null, 1), 2);
        } else if (Intrinsics.areEqual(savingsScreenViewEvent, SavingsScreenViewEvent.SeeAllActivitiesEvent.INSTANCE)) {
            boolean z = screenType instanceof SavingsScreen.ScreenType.GoalDetail;
            String str = z ? ((SavingsScreen.ScreenType.GoalDetail) screenType).token : (!(screenType instanceof SavingsScreen.ScreenType.GeneralSavings) || savingsBalance == null) ? null : savingsBalance.token;
            analytics.track(new SavingsFolderManageViewAllActivity(null), null);
            screenNavigator.goTo(new SavingsFullActivityScreen((z || (screenType instanceof SavingsScreen.ScreenType.GeneralSavings)) ? ActivityTokenType.SAVINGS_FOLDER_TOKEN : ActivityTokenType.CUSTOMER_TOKEN_SAVINGS_ACCOUNT, str, (ActivityScope) null, 12));
        } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.SavingsCardEvent) {
            SavingsScreenViewEvent.SavingsCardEvent savingsCardEvent = (SavingsScreenViewEvent.SavingsCardEvent) savingsScreenViewEvent;
            int ordinal = savingsCardEvent.f1198type.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                UpsellCardEvent upsellCardEvent = savingsCardEvent.event;
                if (!(upsellCardEvent instanceof UpsellCardEvent.Close)) {
                    if (!(upsellCardEvent instanceof UpsellCardEvent.RouterClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    UpsellCardEvent.RouterClicked routerClicked = (UpsellCardEvent.RouterClicked) upsellCardEvent;
                    realRouter.route(new RoutingParams(new GeneralSavingsScreen(screenType), null, new GeneralSavingsScreen(screenType), null, null, null, HttpStatusCode.BAD_GATEWAY_502), routerClicked.clientRoute);
                    CdfEvent cdfEvent4 = routerClicked.analyticsEvent;
                    if (cdfEvent4 != null) {
                        analytics.track(new UtilsKt$toCdfEvent$2(cdfEvent4, new Pair[0]), null);
                    }
                }
            }
        } else {
            boolean z2 = savingsScreenViewEvent instanceof SavingsScreenViewEvent.TransferInClicked;
            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
            if (z2) {
                TransferConfig.TransferInConfig transferInConfig = ((SavingsScreenViewEvent.TransferInClicked) savingsScreenViewEvent).config;
                if (savingsBalance == null) {
                    errorReporter.report(new GeneralSavingsError("Attempted to transfer to a null savings balance from " + screenType + " screen.", null), defaultSamplingStrategy);
                } else {
                    CdfEvent cdfEvent5 = transferInConfig.cdfEvent;
                    if (cdfEvent5 != null) {
                        savingsScreenPresenter.reportTransferCdfEvent(cdfEvent5);
                    }
                    if (transferInConfig.clientRouteTemplate != null) {
                        savingsScreenPresenter.navigateToTransferClientRoute(transferInConfig, activeGoal);
                    } else {
                        screenNavigator.goTo(new TransferInScreen.Condensed(transferInConfig, savingsBalance.token, new GeneralSavingsScreen(screenType), SavingsScreenPresenter.getTransferContext(screenType)));
                    }
                }
            } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.TransferOutClicked) {
                TransferConfig.TransferOutConfig transferOutConfig = ((SavingsScreenViewEvent.TransferOutClicked) savingsScreenViewEvent).config;
                if (savingsBalance == null) {
                    errorReporter.report(new GeneralSavingsError("Attempted to transfer from a null savings balance from " + screenType + " screen.", null), defaultSamplingStrategy);
                } else if (money == null) {
                    errorReporter.report(new GeneralSavingsError("Attempted to transfer from a null max transfer balance from " + screenType + " screen.", null), defaultSamplingStrategy);
                } else {
                    CdfEvent cdfEvent6 = transferOutConfig.cdfEvent;
                    if (cdfEvent6 != null) {
                        savingsScreenPresenter.reportTransferCdfEvent(cdfEvent6);
                    }
                    if (transferOutConfig.clientRouteTemplate != null) {
                        savingsScreenPresenter.navigateToTransferClientRoute(transferOutConfig, activeGoal);
                    } else {
                        screenNavigator.goTo(new TransferOutScreen$Full(new Money((Long) 0L, savingsBalance.balance.currency_code, 4), money, savingsBalance.token, transferOutConfig, new GeneralSavingsScreen(screenType), SavingsScreenPresenter.getTransferContext(screenType)));
                    }
                }
            } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.GoalCelebrationSeen) {
                JobKt.launch$default(coroutineScope, coroutineContext, null, new ProfileCropView.AnonymousClass3(savingsScreenPresenter, savingsScreenViewEvent, null, 9), 2);
            } else if (savingsScreenViewEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent) {
                SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent = (SavingsScreenViewEvent.BalanceSeenEvent) savingsScreenViewEvent;
                mutableState.setValue(Boolean.TRUE);
                if (balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.SavingsBalanceSeen) {
                    JobKt.launch$default(coroutineScope, coroutineContext, null, new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, null, 0), 2);
                } else if (balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.GeneralBalanceSeen) {
                    JobKt.launch$default(coroutineScope, coroutineContext, null, new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, null, 1), 2);
                } else if (balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen) {
                    JobKt.launch$default(coroutineScope, coroutineContext, null, new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, null, 2), 2);
                } else {
                    if (!(balanceSeenEvent instanceof SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope, coroutineContext, null, new SavingsScreenPresenter$handleBalanceSeen$1(savingsScreenPresenter, balanceSeenEvent, null, 3), 2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$support$presenters$SupportHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        State state = (State) this.$genericTreeAction$delegate;
        State state2 = (State) this.$refreshTriggers$delegate;
        SupportHomePresenter supportHomePresenter = (SupportHomePresenter) this.$genericTreeViewEvent$delegate;
        BetterNavigator.ScreenNavigator screenNavigator = supportHomePresenter.navigator;
        Analytics analytics = supportHomePresenter.analytics;
        SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = supportHomePresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        SupportHomeViewEvent supportHomeViewEvent = (SupportHomeViewEvent) obj;
        if (supportHomeViewEvent instanceof SupportHomeViewEvent.SearchClicked) {
            String str = supportHomeScreen.data.flowToken;
            str.getClass();
            analytics.track(new CustomerSupportSearchStart(str), null);
            SupportScreens.FlowScreens.Data data = supportHomeScreen.data;
            String str2 = supportHomeScreen.nodeToken;
            if (str2 == null) {
                str2 = "";
            }
            screenNavigator.goTo(new SupportScreens.FlowScreens.SupportSearchScreen(data, str2, EmptyList.INSTANCE, supportHomePresenter.searchPlaceholder));
        } else if (supportHomeViewEvent instanceof SupportHomeViewEvent.Close) {
            screenNavigator.goTo(supportHomeScreen.data.exitScreen);
        } else if (supportHomeViewEvent instanceof SupportHomeViewEvent.PhoneClicked) {
            LegacySubtitleUtil.logTapSupportPhone(analytics, (SupportPhoneStatus) state2.getValue(), supportHomeScreen);
            supportHomePresenter.onPhoneButtonClicked((SupportPhoneStatus) state2.getValue());
        } else if (supportHomeViewEvent instanceof SupportHomeViewEvent.ChatModuleClicked) {
            LegacySubtitleUtil.logTapSupportChat(analytics, supportHomeScreen, Boolean.valueOf(SupportHomePresenter.models$lambda$8(state)));
            supportHomePresenter.goToChatLoading(SupportChatScreens.FlowScreen.ChatLoading.Source.OTHER);
        } else if (supportHomeViewEvent instanceof SupportHomeViewEvent.NotificationClicked) {
            SupportNotification.Trigger trigger = ((SupportHomeViewEvent.NotificationClicked) supportHomeViewEvent).trigger;
            if (Intrinsics.areEqual(trigger, SupportNotification.Trigger.ChatMessage.INSTANCE)) {
                LegacySubtitleUtil.logTapSupportChat(analytics, supportHomeScreen, Boolean.valueOf(SupportHomePresenter.models$lambda$8(state)));
                supportHomePresenter.goToChatLoading(SupportChatScreens.FlowScreen.ChatLoading.Source.SUPPORT_HOME_NOTIFICATION);
            } else if (Intrinsics.areEqual(trigger, SupportNotification.Trigger.PhoneMessage.INSTANCE)) {
                screenNavigator.goTo(new SupportScreens.SupportPhoneStatusScreen(true, supportHomeScreen.data.flowToken, CustomerSupportPhoneViewStatus.Trigger.HOME_NOTIFICATION_CARD));
            } else {
                if (!(trigger instanceof SupportNotification.Trigger.Incident)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(new SupportScreens.FlowScreens.SupportIncidentDetailsScreen(supportHomeScreen.data, ((SupportNotification.Trigger.Incident) trigger).id, true, SupportScreens.FlowScreens.SupportIncidentDetailsScreen.Source.HOME));
            }
        } else {
            boolean z = supportHomeViewEvent instanceof SupportHomeViewEvent.CategoryClicked;
            MutableState mutableState = this.$state$delegate;
            if (z) {
                SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen2 = supportHomePresenter.args;
                ArticlesService$AllArticlesResult articlesService$AllArticlesResult = (ArticlesService$AllArticlesResult) mutableState.getValue();
                List categories = articlesService$AllArticlesResult != null ? SupportHomePresenter.getCategories(articlesService$AllArticlesResult) : null;
                ArticlesService$AllArticlesResult articlesService$AllArticlesResult2 = (ArticlesService$AllArticlesResult) mutableState.getValue();
                LegacySubtitleUtil.logTapSupportFlowNode(analytics, supportHomeScreen2, supportHomeViewEvent, categories, articlesService$AllArticlesResult2 != null ? SupportHomePresenter.getSuggestedActions(articlesService$AllArticlesResult2) : null, supportHomePresenter.viewToken);
                screenNavigator.goTo(new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken(((SupportHomeViewEvent.CategoryClicked) supportHomeViewEvent).token), supportHomeScreen.data, false, 28));
            } else if (supportHomeViewEvent instanceof SupportHomeViewEvent.SuggestedActionClicked) {
                SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen3 = supportHomePresenter.args;
                ArticlesService$AllArticlesResult articlesService$AllArticlesResult3 = (ArticlesService$AllArticlesResult) mutableState.getValue();
                List categories2 = articlesService$AllArticlesResult3 != null ? SupportHomePresenter.getCategories(articlesService$AllArticlesResult3) : null;
                ArticlesService$AllArticlesResult articlesService$AllArticlesResult4 = (ArticlesService$AllArticlesResult) mutableState.getValue();
                LegacySubtitleUtil.logTapSupportFlowNode(analytics, supportHomeScreen3, supportHomeViewEvent, categories2, articlesService$AllArticlesResult4 != null ? SupportHomePresenter.getSuggestedActions(articlesService$AllArticlesResult4) : null, supportHomePresenter.viewToken);
                JobKt.launch$default(coroutineScope, null, null, new ShoppingWebBridge$loadUrl$1(supportHomePresenter, supportHomeViewEvent, null, 23), 3);
            } else if (supportHomeViewEvent instanceof SupportHomeViewEvent.ViewMoreTransactionClicked) {
                supportHomeScreen.getClass();
                String str3 = supportHomeScreen.data.flowToken;
                FullTransactionPickerOrigin fullTransactionPickerOrigin = FullTransactionPickerOrigin.HOME;
                analytics.track(new CustomerSupportFullTransactionPickerStart(str3, fullTransactionPickerOrigin), null);
                screenNavigator.goTo(new SupportScreens.FlowScreens.SupportActivityPickerFullScreen(supportHomeScreen.data, fullTransactionPickerOrigin, null));
            } else if (Intrinsics.areEqual(supportHomeViewEvent, SupportHomeViewEvent.DisputesClicked.INSTANCE)) {
                DisputesTrackerService$DisputesHistoryResult disputesTrackerService$DisputesHistoryResult = (DisputesTrackerService$DisputesHistoryResult) this.$merchantProfileToken$delegate.getValue();
                if (disputesTrackerService$DisputesHistoryResult instanceof DisputesTrackerService$DisputesHistoryResult.Success) {
                    int i = ((DisputesTrackerService$DisputesHistoryResult.Success) disputesTrackerService$DisputesHistoryResult).activeClaims;
                    supportHomeScreen.getClass();
                    analytics.track(new CustomerSupportAccessOpenDisputes(Integer.valueOf(i), supportHomeScreen.data.flowToken), null);
                    screenNavigator.goTo(new SupportScreens.FlowScreens.SupportDisputeTrackerScreen(supportHomeScreen.data));
                }
            } else if (Intrinsics.areEqual(supportHomeViewEvent, SupportHomeViewEvent.MoreContactOptionsClicked.INSTANCE)) {
                screenNavigator.goTo(new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken("SUPPORT_CONTACT_DETAILS"), supportHomeScreen.data, false, 28));
            } else {
                if (!Intrinsics.areEqual(supportHomeViewEvent, SupportHomeViewEvent.ProminentSupportContactClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) state2.getValue();
                ChatStatus chatStatus = (ChatStatus) this.$treeElementsData$delegate.getValue();
                boolean models$lambda$8 = SupportHomePresenter.models$lambda$8(state);
                AndroidStringManager androidStringManager = supportHomePresenter.stringManager;
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                ChatStatus.Enabled enabled = chatStatus instanceof ChatStatus.Enabled ? (ChatStatus.Enabled) chatStatus : null;
                if (enabled != null) {
                    createListBuilder.add(new SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption(androidStringManager.get(R.string.support_home_chat_button_text), enabled.availabilitySubtitle, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption.Type.CHAT, false, models$lambda$8, 8));
                }
                if (supportPhoneStatus instanceof SupportPhoneStatus.IsEligible) {
                    SupportPhoneStatus.IsEligible isEligible = (SupportPhoneStatus.IsEligible) supportPhoneStatus;
                    createListBuilder.add(new SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption(androidStringManager.get(R.string.support_home_phone_button_text), isEligible.getAvailability().subtitle, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption.Type.PHONE, isEligible.getAvailability().isAvailable, false, 16));
                }
                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                LegacySubtitleUtil.logViewContactOptions(analytics, supportHomeScreen, supportHomePresenter.viewToken, SupportHomePresenter.access$mapSheetOptionStatus(supportHomePresenter, build, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption.Type.CHAT), SupportHomePresenter.access$mapSheetOptionStatus(supportHomePresenter, build, SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption.Type.PHONE));
                screenNavigator.askQuestion(SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.INSTANCE, new OverridingUtil.AnonymousClass7(5, supportHomePresenter, build));
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$work$presenters$shift$ClockInBottomSheetPresenter$models$$inlined$CollectEffect$2$1(Object obj, Continuation continuation) {
        ClockInBottomSheetViewEvent clockInBottomSheetViewEvent = (ClockInBottomSheetViewEvent) obj;
        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.this$0;
        AskedQuestion askedQuestion = (AskedQuestion) this.$refreshTriggers$delegate;
        CoroutineScope coroutineScope = (CoroutineScope) this.$genericTreeAction$delegate;
        ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = new ShiftNotePresenter$models$1$1(10, this.$state$delegate);
        ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$12 = new ShiftNotePresenter$models$1$1(11, this.$merchantProfileToken$delegate);
        MutableState mutableState = (MutableState) this.$genericTreeViewEvent$delegate;
        if (Intrinsics.areEqual(clockInBottomSheetViewEvent, ClockInBottomSheetViewEvent.Dismiss.INSTANCE)) {
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
            if (askedQuestion != null) {
                screenNavigator.giveAnswer(askedQuestion, ClockInResult$Cancelled.INSTANCE);
            } else {
                screenNavigator.goTo(Back.INSTANCE);
            }
        } else if (clockInBottomSheetViewEvent instanceof ClockInBottomSheetViewEvent.ClockInClicked) {
            ClockInBottomSheetViewEvent.ClockInClicked clockInClicked = (ClockInBottomSheetViewEvent.ClockInClicked) clockInBottomSheetViewEvent;
            ShiftsAnalytics shiftsAnalytics = (ShiftsAnalytics) poolsListPresenter.localeAssetProvider;
            String str = clockInClicked.selectedJobIdentifier.token;
            String str2 = clockInClicked.selectedLocationIdentifier.token;
            boolean z = clockInClicked.shouldSendShiftToken;
            str.getClass();
            str2.getClass();
            shiftsAnalytics.analytics.track(new ShiftsClockInStart(Boolean.valueOf(z), shiftsAnalytics.getPersonToken(), shiftsAnalytics.getMerchantToken(), str, str2), null);
            shiftNotePresenter$models$1$1.invoke(Boolean.TRUE);
            JobKt.launch$default(coroutineScope, null, null, new WorkflowLayout$start$1(poolsListPresenter, clockInClicked, shiftNotePresenter$models$1$1, askedQuestion, shiftNotePresenter$models$1$12, null, 19), 3);
        } else if (Intrinsics.areEqual(clockInBottomSheetViewEvent, ClockInBottomSheetViewEvent.LocationPermissionLinkClicked.INSTANCE)) {
            ActivityCompat.requestPermissions(((AndroidPermissionManager) poolsListPresenter.args).activity, AndroidPermissionManager.REQUEST_LOCATION, 2);
        } else if (Intrinsics.areEqual(clockInBottomSheetViewEvent, ClockInBottomSheetViewEvent.OpenAppSettingsClicked.INSTANCE)) {
            ((IntentLauncher) poolsListPresenter.flowToken).launchSettings();
        } else if (clockInBottomSheetViewEvent instanceof ClockInBottomSheetViewEvent.JobSelectionChanged) {
            JobIdentifier jobIdentifier = ((ClockInBottomSheetViewEvent.JobSelectionChanged) clockInBottomSheetViewEvent).jobIdentifier;
            jobIdentifier.getClass();
            this.$treeElementsData$delegate.setValue(jobIdentifier);
        } else {
            if (!(clockInBottomSheetViewEvent instanceof ClockInBottomSheetViewEvent.LocationSelectionChanged)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            LocationIdentifier locationIdentifier = ((ClockInBottomSheetViewEvent.LocationSelectionChanged) clockInBottomSheetViewEvent).locationIdentifier;
            locationIdentifier.getClass();
            mutableState.setValue(locationIdentifier);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c18  */
    /* JADX WARN: Type inference failed for: r0v199, types: [app.cash.broadway.screen.Screen] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Object obj2;
        Image image;
        GenericAnalyticsData genericAnalyticsData;
        GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger genericTreeElementsRefreshTrigger$BoostContentUpdateTrigger;
        ComponentElement componentElement;
        SeriesContainer seriesContainer;
        List list;
        String str2;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration;
        ActiveFulfillmentType activeFulfillmentType;
        FullCashtag fullCashtag;
        SupportScreens startSupportHome;
        String str3;
        BitcoinPayments bitcoinPayments;
        int i = this.$r8$classId;
        Back back = Back.INSTANCE;
        Object obj3 = this.this$0;
        Object obj4 = this.$refreshTriggers$delegate;
        MutableState mutableState = this.$state$delegate;
        MutableState mutableState2 = this.$merchantProfileToken$delegate;
        Object obj5 = this.$genericTreeAction$delegate;
        MutableState mutableState3 = this.$treeElementsData$delegate;
        Object obj6 = this.$genericTreeViewEvent$delegate;
        switch (i) {
            case 0:
                ApiResult apiResult = (ApiResult) obj;
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj3;
                if (apiResult instanceof ApiResult.Success) {
                    MerchantProfilePresenter$State merchantProfilePresenter$State = (MerchantProfilePresenter$State) mutableState.getValue();
                    MerchantProfileData merchantProfileData = (MerchantProfileData) ((ApiResult.Success) apiResult).response;
                    String str4 = merchantProfileData.name;
                    List list2 = merchantProfileData.genericTreeElements;
                    Color color = merchantProfileData.brandColor;
                    Character monogram = GrpcStatus.Companion.monogram(str4);
                    String str5 = merchantProfileData.name;
                    GetProfileDetailsResponse.MerchantData.MerchantProfileImage merchantProfileImage = merchantProfileData.logo;
                    if (merchantProfileImage != null) {
                        str = str5;
                        obj2 = obj4;
                        image = new Image(merchantProfileImage.light_url, merchantProfileImage.dark_url, 4);
                    } else {
                        str = str5;
                        obj2 = obj4;
                        image = null;
                    }
                    mutableState.setValue(MerchantProfilePresenter$State.copy$default(merchantProfilePresenter$State, new Loadable.Loaded(new MerchantProfilePresenter$HeaderState(new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(color != null ? new ColorModel.Accented(color) : null, monogram, str, image, null, null, merchantProfileData.shouldColorizeAvatar ? MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse) : null, (!merchantProfileData.shouldFillBackground || color == null) ? null : new ColorModel.Accented(color), false, false, null, false, null, null, 129520)), merchantProfileData.name, merchantProfileData.category)), null, null, null, 14));
                    String str6 = merchantProfileData.merchantToken;
                    if (str6 != null) {
                        mutableState2.setValue(new RedactedString(str6));
                    }
                    mutableState3.setValue(list2);
                    MutableState mutableState4 = (MutableState) obj6;
                    AnalyticsEvent analyticsEvent = merchantProfileData.viewEvent;
                    if (analyticsEvent != null) {
                        String str7 = analyticsEvent.name;
                        str7.getClass();
                        genericAnalyticsData = new GenericAnalyticsData(str7, analyticsEvent.parameters);
                    } else {
                        genericAnalyticsData = null;
                    }
                    mutableState4.setValue(genericAnalyticsData);
                    if (list2 != null) {
                        MutableState mutableState5 = (MutableState) obj2;
                        ((SubtreeManager) shareSheetPresenter.modelUpdates).getClass();
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            BitmapsKt bitmapsKt = ((ContainerElement) it.next()).container;
                            if (bitmapsKt != null) {
                                ContainerElement$Container$Single containerElement$Container$Single = bitmapsKt instanceof ContainerElement$Container$Single ? (ContainerElement$Container$Single) bitmapsKt : null;
                                if (containerElement$Container$Single != null) {
                                    componentElement = containerElement$Container$Single.value;
                                    if (componentElement == null) {
                                        bitmapsKt.getClass();
                                        ContainerElement$Container$Single containerElement$Container$Single2 = bitmapsKt instanceof ContainerElement$Container$Single ? (ContainerElement$Container$Single) bitmapsKt : null;
                                        ComponentElement componentElement2 = containerElement$Container$Single2 != null ? containerElement$Container$Single2.value : null;
                                        componentElement2.getClass();
                                        list = componentElement2.refresh_triggers;
                                    } else {
                                        if (bitmapsKt != null) {
                                            ContainerElement$Container$Series containerElement$Container$Series = bitmapsKt instanceof ContainerElement$Container$Series ? (ContainerElement$Container$Series) bitmapsKt : null;
                                            if (containerElement$Container$Series != null) {
                                                seriesContainer = containerElement$Container$Series.value;
                                                if (seriesContainer == null) {
                                                    bitmapsKt.getClass();
                                                    ContainerElement$Container$Series containerElement$Container$Series2 = bitmapsKt instanceof ContainerElement$Container$Series ? (ContainerElement$Container$Series) bitmapsKt : null;
                                                    SeriesContainer seriesContainer2 = containerElement$Container$Series2 != null ? containerElement$Container$Series2.value : null;
                                                    seriesContainer2.getClass();
                                                    List list4 = seriesContainer2.items;
                                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                                    Iterator it2 = list4.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList2.add(((ComponentElement) it2.next()).refresh_triggers);
                                                    }
                                                    list = CollectionsKt__IterablesKt.flatten(arrayList2);
                                                } else {
                                                    list = EmptyList.INSTANCE;
                                                }
                                            }
                                        }
                                        seriesContainer = null;
                                        if (seriesContainer == null) {
                                        }
                                    }
                                    arrayList.add(list);
                                }
                            }
                            componentElement = null;
                            if (componentElement == null) {
                            }
                            arrayList.add(list);
                        }
                        ArrayList flatten = CollectionsKt__IterablesKt.flatten(arrayList);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = flatten.iterator();
                        while (it3.hasNext()) {
                            RefreshTrigger refreshTrigger = (RefreshTrigger) it3.next();
                            refreshTrigger.getClass();
                            RefreshTrigger$Trigger$BoostContentUpdate refreshTrigger$Trigger$BoostContentUpdate = refreshTrigger.trigger;
                            if ((refreshTrigger$Trigger$BoostContentUpdate != null ? refreshTrigger$Trigger$BoostContentUpdate.value : null) != null) {
                                refreshTrigger$Trigger$BoostContentUpdate.getClass();
                                RefreshTrigger.BoostContentUpdateTrigger boostContentUpdateTrigger = refreshTrigger$Trigger$BoostContentUpdate.value;
                                boostContentUpdateTrigger.getClass();
                                genericTreeElementsRefreshTrigger$BoostContentUpdateTrigger = new GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger(boostContentUpdateTrigger.boost_tokens);
                            } else {
                                genericTreeElementsRefreshTrigger$BoostContentUpdateTrigger = null;
                            }
                            if (genericTreeElementsRefreshTrigger$BoostContentUpdateTrigger != null) {
                                arrayList3.add(genericTreeElementsRefreshTrigger$BoostContentUpdateTrigger);
                            }
                        }
                        mutableState5.setValue(arrayList3);
                    }
                    ((MutableState) obj5).setValue(merchantProfileData.passiveAction);
                } else {
                    mutableState.setValue(MerchantProfilePresenter$State.copy$default((MerchantProfilePresenter$State) mutableState.getValue(), ((MerchantProfilePresenter$State) mutableState.getValue()).headerState instanceof Loadable.Loaded ? ((MerchantProfilePresenter$State) mutableState.getValue()).headerState : new Loadable.Failed(new Throwable()), new GenericTreeElementsViewModel.Loaded(EmptyList.INSTANCE, new GenericTreeElementsViewModel.Loaded.Error(null)), null, null, 12));
                }
                return Unit.INSTANCE;
            case 1:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj5;
                LocalAddBrandsPresenter localAddBrandsPresenter = (LocalAddBrandsPresenter) obj6;
                BetterNavigator.ScreenNavigator screenNavigator = localAddBrandsPresenter.navigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                LocalAddBrandsViewEvent localAddBrandsViewEvent = (LocalAddBrandsViewEvent) obj;
                WorkLauncherImpl workLauncherImpl = LocalAddBrandsPresenter.brandTokenListSaver;
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    if (localAddBrandsViewEvent instanceof LocalAddBrandsViewEvent.BrandClicked) {
                        LocalAddBrandsViewEvent.BrandClicked brandClicked = (LocalAddBrandsViewEvent.BrandClicked) localAddBrandsViewEvent;
                        String str8 = brandClicked.clientRoute;
                        if (str8 != null) {
                            localAddBrandsPresenter.launcher.openWeb(screenNavigator, str8);
                        } else {
                            screenNavigator.goTo(new LocalBrandProfileScreen(new BrandSpot(brandClicked.brandToken, null), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, (BrandSpotSyncTokens) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                        }
                    } else if (localAddBrandsViewEvent instanceof LocalAddBrandsViewEvent.BrandToggled) {
                        LocalAddBrandsViewEvent.BrandToggled brandToggled = (LocalAddBrandsViewEvent.BrandToggled) localAddBrandsViewEvent;
                        String str9 = brandToggled.brandToken;
                        if (brandToggled.toggleValue) {
                            snapshotStateList.remove(new BrandToken(str9));
                            snapshotStateList2.add(new BrandToken(str9));
                        } else {
                            snapshotStateList.add(new BrandToken(str9));
                            snapshotStateList2.remove(new BrandToken(str9));
                        }
                    } else if (localAddBrandsViewEvent instanceof LocalAddBrandsViewEvent.DoneClicked) {
                        List minus = CollectionsKt.minus((Iterable) snapshotStateList2, (Iterable) mutableState2.getValue());
                        LinkedHashSet intersect = CollectionsKt.intersect(snapshotStateList, (Set) mutableState2.getValue());
                        List list5 = minus;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        Iterator it4 = list5.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(new BulkUpdateBrandsRequest.AddBrandRequest(((BrandToken) it4.next()).value, ByteString.EMPTY));
                        }
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intersect, 10));
                        Iterator it5 = intersect.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(new BulkUpdateBrandsRequest.RemoveBrandRequest(((BrandToken) it5.next()).value, ByteString.EMPTY));
                        }
                        if (arrayList4.isEmpty() && arrayList5.isEmpty()) {
                            screenNavigator.goTo(back);
                        } else {
                            mutableState.setValue(Boolean.TRUE);
                            JobKt.launch$default(coroutineScope, null, null, new LocalAddBrandsPresenter$models$2$1(localAddBrandsPresenter, arrayList4, arrayList5, minus, intersect, this.$state$delegate, null), 3);
                        }
                    } else if (localAddBrandsViewEvent instanceof LocalAddBrandsViewEvent.CancelClicked) {
                        screenNavigator.goTo(back);
                    } else if (!Intrinsics.areEqual(localAddBrandsViewEvent, LocalSearchViewEvent$SearchClicked.INSTANCE)) {
                        if (localAddBrandsViewEvent instanceof LocalSearchViewEvent$SearchCleared) {
                            mutableState3.setValue(null);
                        } else {
                            if (!(localAddBrandsViewEvent instanceof LocalSearchViewEvent$SearchInput)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            mutableState3.setValue(((LocalSearchViewEvent$SearchInput) localAddBrandsViewEvent).text);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                FulfillmentPickerPresenter fulfillmentPickerPresenter = (FulfillmentPickerPresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator2 = fulfillmentPickerPresenter.navigator;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                FulfillmentPickerViewEvent fulfillmentPickerViewEvent = (FulfillmentPickerViewEvent) obj;
                if (fulfillmentPickerViewEvent instanceof FulfillmentPickerViewEvent.FulfillmentTypeSelected) {
                    LocalFulfillmentType localFulfillmentType = ((FulfillmentPickerViewEvent.FulfillmentTypeSelected) fulfillmentPickerViewEvent).f922type;
                    localFulfillmentType.getClass();
                    switch (FulfillmentPickerPresenterKt$WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()]) {
                        case 1:
                            activeFulfillmentType = ActiveFulfillmentType.PICKUP;
                            mutableState.setValue(activeFulfillmentType);
                            JobKt.launch$default(coroutineScope2, null, null, new EventBridge$sendEvent$1(fulfillmentPickerPresenter, fulfillmentPickerViewEvent, null, 3), 3);
                            return Unit.INSTANCE;
                        case 2:
                            activeFulfillmentType = ActiveFulfillmentType.DELIVERY;
                            mutableState.setValue(activeFulfillmentType);
                            JobKt.launch$default(coroutineScope2, null, null, new EventBridge$sendEvent$1(fulfillmentPickerPresenter, fulfillmentPickerViewEvent, null, 3), 3);
                            return Unit.INSTANCE;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            Path$$ExternalSyntheticBUOutline0.m$1(localFulfillmentType, "Unexpected type ");
                            return null;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                }
                if (fulfillmentPickerViewEvent instanceof FulfillmentPickerViewEvent.Dismissed) {
                    screenNavigator2.goTo(back);
                } else if (fulfillmentPickerViewEvent instanceof FulfillmentPickerViewEvent.LocationSelected) {
                    String str10 = ((FulfillmentPickerViewEvent.LocationSelected) fulfillmentPickerViewEvent).locationToken;
                    Brand brand = (Brand) ((State) obj5).getValue();
                    mutableState2.setValue(new FulfillmentConfiguration.Pickup(str10, (brand == null || (localEstimatedCompletionDuration = brand.estimatedPickupWaitTime) == null) ? null : EstimatedCompletionDurationKt.toEstimatedCompletionDuration(localEstimatedCompletionDuration), 10));
                } else if (fulfillmentPickerViewEvent instanceof FulfillmentPickerViewEvent.ValidAddressEntered) {
                    GlobalAddressWrapper globalAddressWrapper = ((FulfillmentPickerViewEvent.ValidAddressEntered) fulfillmentPickerViewEvent).address;
                    GlobalAddress globalAddress = globalAddressWrapper.globalAddress;
                    String str11 = globalAddressWrapper.placeId;
                    str11.getClass();
                    globalAddress.getClass();
                    List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new String[]{globalAddress.address_line_1, globalAddress.address_line_2});
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj7 : filterNotNull) {
                        if (!StringsKt.isBlank((String) obj7)) {
                            arrayList6.add(obj7);
                        }
                    }
                    String joinToString$default = CollectionsKt.joinToString$default(arrayList6, ", ", null, null, 0, null, null, 62);
                    String str12 = globalAddress.locality;
                    String str13 = globalAddress.administrative_district_level_1;
                    String str14 = globalAddress.postal_code;
                    Country country = globalAddress.country_code;
                    if (country == null || (str2 = country.name()) == null) {
                        str2 = "US";
                    }
                    String str15 = str2;
                    Coordinates coordinates = globalAddress.address_coordinates;
                    mutableState3.setValue(new LocalAddress(joinToString$default, str12, str13, str14, str15, coordinates != null ? coordinates.latitude : null, coordinates != null ? coordinates.longitude : null, str11, globalAddress.address_line_1, globalAddress.address_line_2, ByteString.EMPTY));
                } else {
                    if (!(fulfillmentPickerViewEvent instanceof FulfillmentPickerViewEvent.DeliveryAddressSelected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (((LocalAddress) mutableState3.getValue()) == null) {
                        screenNavigator2.goTo(back);
                    } else {
                        DeliveryQuote deliveryQuote = (DeliveryQuote) ((MutableState) obj6).getValue();
                        deliveryQuote.getClass();
                        mutableState2.setValue(FulfillmentConfigurationKt.m1240toFulfillmentConfiguration6UYloQk(deliveryQuote.fulfillment, deliveryQuote.location.token, deliveryQuote.deliveryFee));
                    }
                }
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState6 = (MutableState) obj6;
                AccountPresenter accountPresenter = (AccountPresenter) obj4;
                RealRouter realRouter = accountPresenter.router;
                boolean z = accountPresenter.isQrToProfileEnabled;
                Account account = accountPresenter.args;
                Analytics analytics = accountPresenter.analytics;
                RealAccountOutboundNavigator realAccountOutboundNavigator = accountPresenter.accountOutboundNavigator;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj3;
                AccountViewEvent accountViewEvent = (AccountViewEvent) obj;
                if (accountViewEvent instanceof AccountViewEvent.PersonalClick) {
                    accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.INFO);
                    realAccountOutboundNavigator.navigator.goTo(ProfileScreens.AccountInfoScreen.INSTANCE);
                } else {
                    boolean z2 = accountViewEvent instanceof AccountViewEvent.BusinessesClick;
                    Account account2 = Account.INSTANCE;
                    if (z2) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.LINKED_BUSINESSES);
                        BetterNavigator.ScreenNavigator screenNavigator3 = realAccountOutboundNavigator.navigator;
                        Analytics analytics2 = realAccountOutboundNavigator.analytics;
                        BusinessGrantViewOpenList.EntryPoint entryPoint = BusinessGrantViewOpenList.EntryPoint.PROFILE_ROW;
                        analytics2.track(new BusinessGrantViewOpenList(), null);
                        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) realAccountOutboundNavigator.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$LinkedBusinessesSettingPlasmaFlowAndroid.INSTANCE)).enabled()) {
                            screenNavigator3.goTo(FlowStarter.startPlasmaFlow$default(realAccountOutboundNavigator.flowStarter, Flow$Type.LINKED_BUSINESSES, account2, null, null, 12));
                        } else {
                            screenNavigator3.goTo(CashAppPaySettingsScreen.INSTANCE);
                        }
                    } else if (accountViewEvent instanceof AccountViewEvent.DocumentsClick) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.DOCUMENTS);
                        realAccountOutboundNavigator.navigator.goTo(new DocumentsScreen.DocumentsScreenCategory(null));
                    } else if (accountViewEvent instanceof AccountViewEvent.FamilyAccountsClick) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.FAMILY_ACCOUNTS);
                        realAccountOutboundNavigator.navigator.goTo(ProfileScreens.FamilyEligibilityLoadingScreen.INSTANCE);
                    } else if (accountViewEvent instanceof AccountViewEvent.HelpClick) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.SUPPORT);
                        realAccountOutboundNavigator.getClass();
                        BetterNavigator.ScreenNavigator screenNavigator4 = realAccountOutboundNavigator.navigator;
                        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) realAccountOutboundNavigator.supportNavigator;
                        SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.PROFILE;
                        startSupportHome = realSupportNavigator.startSupportHome(null, account2, SupportNavigator$Source.PROFILE, null, null);
                        screenNavigator4.goTo(startSupportHome);
                    } else if (accountViewEvent instanceof AccountViewEvent.LimitsClick) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.LIMITS);
                        realAccountOutboundNavigator.navigator.goTo(LimitsScreen.INSTANCE);
                    } else if (accountViewEvent instanceof AccountViewEvent.LinkedBanksClick) {
                        JobKt.launch$default(coroutineScope3, null, null, new AccountPresenter$models$1$1(accountPresenter, null, 2), 3);
                    } else if (accountViewEvent instanceof AccountViewEvent.NotificationsClick) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.NOTIFICATIONS);
                        realAccountOutboundNavigator.navigator.goTo(ProfileScreens.NotificationsScreen.INSTANCE);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.PrivacyClick.INSTANCE)) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.PRIVACY);
                        realAccountOutboundNavigator.navigator.goTo(ProfileScreens.PrivacyScreen.INSTANCE);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.SecurityClick.INSTANCE)) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.SECURITY);
                        realAccountOutboundNavigator.navigator.goTo(new ProfileScreens.SecurityScreen(null));
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.BackClicked.INSTANCE)) {
                        realAccountOutboundNavigator.navigator.goTo(back);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.EditProfileClicked.INSTANCE)) {
                        ((RealAccountInboundNavigator) realAccountOutboundNavigator.accountInboundNavigator).navigator.goTo(EditProfile.INSTANCE);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.AddQrToHomeScreenClicked.INSTANCE)) {
                        analytics.track(new QRCodeShortcutsProfileAddWidget(), null);
                        ((RealQrShortcutInstaller) accountPresenter.qrShortcutInstaller).requestPinWidget();
                    } else if (accountViewEvent instanceof AccountViewEvent.QrClick) {
                        AccountPresenter.access$maybeLogQrCodeOpen(accountPresenter, (PublicProfile) mutableState2.getValue());
                        if (z) {
                            ((ToolbarTuckTargets) realAccountOutboundNavigator.qrCodesInboundNavigator).showQrCodeScanner(false);
                        } else {
                            PublicProfile publicProfile = (PublicProfile) mutableState2.getValue();
                            realAccountOutboundNavigator.getClass();
                            account.getClass();
                            String str16 = (publicProfile == null || (fullCashtag = publicProfile.fullCashtag) == null) ? null : fullCashtag.cashtag_display_name;
                            if (str16 == null || str16.length() == 0) {
                                realAccountOutboundNavigator.navigator.goTo(((RealFlowStarter) realAccountOutboundNavigator.flowStarter).startCashtagFlow(account, new RedactedString(null)));
                            } else {
                                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) realAccountOutboundNavigator.qrCodesInboundNavigator;
                                ((Analytics) toolbarTuckTargets.endCornerCenterX$delegate).track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.QR_CODE, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), null);
                                ((BetterNavigator.ScreenNavigator) toolbarTuckTargets.startCornerCenterX$delegate).goTo(new QrCodeScreen(back));
                            }
                        }
                    } else if (accountViewEvent instanceof AccountViewEvent.ShareClick) {
                        realAccountOutboundNavigator.analytics.track(new PersonalProfileViewShare(PersonalProfileViewShare.PersonalProfileShareOrigin.TOP_BAR, PersonalProfileShareSource.ACCOUNT), null);
                        realAccountOutboundNavigator.navigator.goTo(ShareSheetScreen.INSTANCE);
                    } else if (accountViewEvent instanceof AccountViewEvent.AddPhotoClick) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.PROFILE_PHOTO);
                        PublicProfile publicProfile2 = (PublicProfile) mutableState2.getValue();
                        String str17 = publicProfile2 != null ? publicProfile2.photoUrl : null;
                        boolean z3 = str17 == null || str17.length() == 0;
                        analytics.track(new PersonalProfileManageAddPhoto(), null);
                        realAccountOutboundNavigator.navigator.goTo(new ProfileScreens.HeaderMenuScreen(!z3));
                    } else if (accountViewEvent instanceof AccountViewEvent.SwitchAccountClick) {
                        AccountSwitchAccountViewSwitcher.Entrypoint entrypoint = AccountSwitchAccountViewSwitcher.Entrypoint.PROFILE_TAB_CASHTAG_DROPDOWN;
                        realAccountOutboundNavigator.getClass();
                        account.getClass();
                        realAccountOutboundNavigator.navigator.goTo(new AccountSwitcherScreen(entrypoint, account, new TargetDestination.ScreenDestination(account)));
                    } else if (accountViewEvent instanceof AccountViewEvent.OnDialogResult) {
                        JobKt.launch$default(coroutineScope3, null, null, new NetworkFetcher$doFetch$2(accountPresenter, accountViewEvent, null, 12), 3);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.FavoritesListAddClicked.INSTANCE) || Intrinsics.areEqual(accountViewEvent, AccountViewEvent.FavoritesListCreateClicked.INSTANCE)) {
                        ((BetterNavigator.ScreenNavigator) ((EglCore) realAccountOutboundNavigator.favoritesNavigator).eglDisplay).goTo(new AddFavorites(RealUuidGenerator.generate()));
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.FavoritesSettingsRowClicked.INSTANCE)) {
                        PersonalProfileViewOpenScreen.EntryPoint entryPoint2 = PersonalProfileViewOpenScreen.EntryPoint.PROFILE;
                        realAccountOutboundNavigator.getClass();
                        ((EglCore) realAccountOutboundNavigator.favoritesNavigator).showListFavorites(entryPoint2);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.FavoritesListViewAllClicked.INSTANCE)) {
                        PersonalProfileViewOpenScreen.EntryPoint entryPoint3 = PersonalProfileViewOpenScreen.EntryPoint.PROFILE;
                        realAccountOutboundNavigator.getClass();
                        ((EglCore) realAccountOutboundNavigator.favoritesNavigator).showListFavorites(entryPoint3);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.InviteFriendsClicked.INSTANCE)) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.INVITE_FRIENDS);
                        realAccountOutboundNavigator.navigator.goTo(((RealFlowStarter) realAccountOutboundNavigator.flowStarter).startInviteFlow(back, BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE));
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.SocialInstagramClick.INSTANCE)) {
                        accountPresenter.analytics.track(new PersonalProfileViewOpenLink(PersonalProfileViewOpenLink.Destination.INSTAGRAM), null);
                        ((RealIntentFactory) realAccountOutboundNavigator.intentFactory).maybeStartUrlIntent("https://instagram.com/cashapp", (Activity) realAccountOutboundNavigator.activity, true);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.SignOutClick.INSTANCE)) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.SIGN_OUT);
                        realAccountOutboundNavigator.navigator.goTo(ProfileScreens.ConfirmSignOutScreen.INSTANCE);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.SocialXClick.INSTANCE)) {
                        accountPresenter.analytics.track(new PersonalProfileViewOpenLink(PersonalProfileViewOpenLink.Destination.TWITTER), null);
                        ((RealIntentFactory) realAccountOutboundNavigator.intentFactory).maybeStartUrlIntent("https://twitter.com/cashapp", (Activity) realAccountOutboundNavigator.activity, true);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.OpenSourceSoftwareClick.INSTANCE)) {
                        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.OPEN_SOURCE);
                        realAccountOutboundNavigator.navigator.goTo(OpenSourceScreen.INSTANCE);
                    } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.PrivacyNoticeClick.INSTANCE)) {
                        JobKt.launch$default(coroutineScope3, null, null, new AccountPresenter$models$1$1(accountPresenter, null, 3), 3);
                    } else {
                        Continuation continuation2 = null;
                        if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.TermsOfServiceClick.INSTANCE)) {
                            JobKt.launch$default(coroutineScope3, null, null, new AccountPresenter$models$1$1(accountPresenter, continuation2, 4), 3);
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.VersionCodeClick.INSTANCE)) {
                            mutableState.setValue(new Integer(((Number) mutableState.getValue()).intValue() + 1));
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.BusinessInfoClick.INSTANCE)) {
                            accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.BUSINESS_INFO);
                            realAccountOutboundNavigator.navigator.goTo(BusinessInfoScreen.INSTANCE);
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.ThemesClick.INSTANCE)) {
                            accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.THEMES);
                            realAccountOutboundNavigator.navigator.goTo(new ThemeSwitcherScreen(ThemeSwitcherScreen.Source.PROFILE));
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.CreateBusinessAccountClick.INSTANCE)) {
                            BlockersData.Flow.INSTANCE.getClass();
                            analytics.track(new PersonalProfileManageAddAccount(BlockersData.Flow.Companion.generateToken(), PersonalProfileManageAddAccount.AccountType.BUSINESS), null);
                            realAccountOutboundNavigator.getClass();
                            account.getClass();
                            realAccountOutboundNavigator.navigator.goTo(((RealFlowStarter) realAccountOutboundNavigator.flowStarter).startBusinessAccountCreationFlow(account, C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACCOUNT_FOOTER, BlockersData.Flow.Companion.generateToken()));
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.CreatePersonalAccountClick.INSTANCE)) {
                            BlockersData.Flow.INSTANCE.getClass();
                            analytics.track(new PersonalProfileManageAddAccount(BlockersData.Flow.Companion.generateToken(), PersonalProfileManageAddAccount.AccountType.PERSONAL), null);
                            realAccountOutboundNavigator.getClass();
                            account.getClass();
                            realAccountOutboundNavigator.navigator.goTo(((RealFlowStarter) realAccountOutboundNavigator.flowStarter).startPersonalAccountCreationFlow(BlockersData.Flow.Companion.generateToken(), account, CreateSecondaryPersonalAccountEntryPoint.ACCOUNT_FOOTER));
                        } else if (accountViewEvent instanceof AccountViewEvent.DisclosureUrlClick) {
                            realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((AccountViewEvent.DisclosureUrlClick) accountViewEvent).url);
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.TrustedDevicesClick.INSTANCE)) {
                            accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.TRUSTED_DEVICES);
                            ((RealCashLocalNavigator) realAccountOutboundNavigator.deviceManagerNavigator).showDeviceList();
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.PasskeysClick.INSTANCE)) {
                            accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.PASSKEYS);
                            realAccountOutboundNavigator.navigator.goTo(PasskeyManagementScreen.INSTANCE);
                        } else if (Intrinsics.areEqual(accountViewEvent, AccountViewEvent.ClaimRewardClick.INSTANCE)) {
                            JobKt.launch$default(coroutineScope3, null, null, new AccountPresenter$models$1$1(accountPresenter, null, 5), 3);
                            accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.REFERRAL_REWARDS_STATUS);
                            ProfileRow profileRow = (ProfileRow) mutableState3.getValue();
                            if (profileRow != null) {
                                String str18 = profileRow.client_route;
                                Account account3 = accountPresenter.args;
                                realRouter.route(new RoutingParams(account3, null, account3, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str18);
                            }
                        } else if (accountViewEvent instanceof AccountViewEvent.ShoppingSettingClick) {
                            accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.SHOPPING);
                            realAccountOutboundNavigator.navigator.goTo(ShoppingSettingsScreen.INSTANCE);
                        } else if (accountViewEvent instanceof AccountViewEvent.PromotionsReferralsClick) {
                            accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.PROMOTIONS_HOME);
                            realAccountOutboundNavigator.navigator.goTo(new PromotionsReferralsScreen$PromotionsReferralsHomeScreen());
                        } else if (accountViewEvent instanceof AccountViewEvent.SecurityHubClick) {
                            realAccountOutboundNavigator.navigator.goTo(new SecurityHubScreen(SecurityHubScreen.Source.SETTINGS));
                        } else if (accountViewEvent instanceof AccountViewEvent.QrCodeBoxMeasured) {
                            Integer num = accountPresenter.familyProfileManager.familyProfile.$$delegate_0.getValue() instanceof FamilyProfile.ManagedAccount ? new Integer(((AccountViewEvent.QrCodeBoxMeasured) accountViewEvent).logoColor) : ThrottledCallbacksKt.qrLogoColor((PaymentPadTheme) ((State) obj5).getValue(), new Integer(((AccountViewEvent.QrCodeBoxMeasured) accountViewEvent).logoColor));
                            AccountViewEvent.QrCodeBoxMeasured qrCodeBoxMeasured = (AccountViewEvent.QrCodeBoxMeasured) accountViewEvent;
                            Integer num2 = new Integer(qrCodeBoxMeasured.backgroundColor);
                            if (z) {
                                num = new Integer(-1);
                            }
                            Integer num3 = num;
                            Integer num4 = new Integer(qrCodeBoxMeasured.size);
                            Integer num5 = z ? new Integer(-1) : null;
                            QrCodeArgs qrCodeArgs = (QrCodeArgs) mutableState6.getValue();
                            mutableState6.setValue(new QrCodeArgs(num2, num3, num4, num5, (CurrencyCode) null, qrCodeArgs != null ? qrCodeArgs.retryKey : 0, 48));
                        } else if (accountViewEvent instanceof AccountViewEvent.QrCodeRetryClick) {
                            QrCodeArgs qrCodeArgs2 = (QrCodeArgs) mutableState6.getValue();
                            if (qrCodeArgs2 != null) {
                                mutableState6.setValue(new QrCodeArgs(qrCodeArgs2.backgroundColor, qrCodeArgs2.logoColor, qrCodeArgs2.size, qrCodeArgs2.currencyColor, qrCodeArgs2.currency, qrCodeArgs2.saveToTemporaryStorage, qrCodeArgs2.retryKey + 1));
                            }
                        } else {
                            if (!(accountViewEvent instanceof AccountViewEvent.QrScanClick)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            AccountPresenter.access$maybeLogQrCodeOpen(accountPresenter, (PublicProfile) mutableState2.getValue());
                            ((ToolbarTuckTargets) realAccountOutboundNavigator.qrCodesInboundNavigator).showQrCodeScanner(false);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 4:
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator;
                BitcoinDepositsViewEvent bitcoinDepositsViewEvent = (BitcoinDepositsViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinDepositsViewEvent, BitcoinDepositsViewEvent.CopyAddress.INSTANCE)) {
                    BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel = (BitcoinDepositsQrCodeModel) mutableState.getValue();
                    if (bitcoinDepositsQrCodeModel != null && (bitcoinPayments = bitcoinDepositsQrCodeModel.qrCodeInvoice) != null) {
                        screenNavigator5.goTo(new BitcoinDepositCopyScreen(bitcoinPayments));
                    }
                } else if (Intrinsics.areEqual(bitcoinDepositsViewEvent, BitcoinDepositsViewEvent.AdjustAmount.INSTANCE)) {
                    screenNavigator5.askQuestion(BitcoinAmountPickerQuestion.INSTANCE, new ViewSizeResolver$size$3$1(5, (State) obj4, mutableState2, (State) obj5));
                } else if (Intrinsics.areEqual(bitcoinDepositsViewEvent, BitcoinDepositsViewEvent.BackPressed.INSTANCE)) {
                    screenNavigator5.goTo(back);
                } else if (Intrinsics.areEqual(bitcoinDepositsViewEvent, BitcoinDepositsViewEvent.Share.INSTANCE)) {
                    BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel2 = (BitcoinDepositsQrCodeModel) mutableState.getValue();
                    if (bitcoinDepositsQrCodeModel2 != null && (str3 = bitcoinDepositsQrCodeModel2.shareUrl) != null) {
                        ((IntentLauncher) tapToPayPresenter.errorReporter).shareText(str3, null, null);
                        ((Analytics) tapToPayPresenter.deviceIntegrityAttester).track(new CryptoDepositShareInvoice(), null);
                    }
                } else {
                    if (!Intrinsics.areEqual(bitcoinDepositsViewEvent, BitcoinDepositsViewEvent.TryAgainClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState3.setValue(Boolean.valueOf(!((Boolean) mutableState3.getValue()).booleanValue()));
                    ((MutableState) obj6).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 5:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) obj6;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                AddPayerCustomersScreen addPayerCustomersScreen = (AddPayerCustomersScreen) cardStudioPresenter.cardStudioQueries;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
                AddPayerCustomersViewEvent addPayerCustomersViewEvent = (AddPayerCustomersViewEvent) obj;
                if (addPayerCustomersViewEvent instanceof AddPayerCustomersViewEvent.SearchTextChanged) {
                    mutableState.setValue(((AddPayerCustomersViewEvent.SearchTextChanged) addPayerCustomersViewEvent).text);
                } else if (addPayerCustomersViewEvent instanceof AddPayerCustomersViewEvent.ToggleCustomer) {
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        LinkedHashSet mutableSet = CollectionsKt.toMutableSet(snapshotStateSet);
                        String str19 = ((AddPayerCustomersViewEvent.ToggleCustomer) addPayerCustomersViewEvent).customerToken;
                        if (mutableSet.contains(str19)) {
                            mutableSet.remove(str19);
                        } else {
                            mutableSet.add(str19);
                        }
                        if (addPayerCustomersScreen.entrypoint == AddPayerCustomersScreen.Entrypoint.POST_KYB) {
                            snapshotStateSet.clear();
                            snapshotStateSet.addAll(mutableSet);
                        } else {
                            mutableState2.setValue(Boolean.TRUE);
                            JobKt.launch$default(coroutineScope4, null, null, new RealFidesmoClient$observeDeviceState$1(cardStudioPresenter, mutableSet, (SnapshotStateSet) obj6, this.$merchantProfileToken$delegate, null, 4), 3);
                        }
                    }
                } else if (addPayerCustomersViewEvent instanceof AddPayerCustomersViewEvent.TapDone) {
                    if (addPayerCustomersScreen.entrypoint == AddPayerCustomersScreen.Entrypoint.POST_KYB) {
                        AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) mutableState3.getValue();
                        AddPayerCustomersViewModel.Loaded loaded = addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Loaded ? (AddPayerCustomersViewModel.Loaded) addPayerCustomersViewModel : null;
                        if (loaded != null) {
                            if (snapshotStateSet.isEmpty()) {
                                ?? r0 = addPayerCustomersScreen.exitScreen;
                                if (r0 != 0) {
                                    back = r0;
                                }
                                screenNavigator6.goTo(back);
                            } else {
                                mutableState3.setValue(new AddPayerCustomersViewModel.Saving(loaded));
                                JobKt.launch$default(coroutineScope4, null, null, new RealFidesmoClient$observeDeviceState$1(cardStudioPresenter, (SnapshotStateSet) obj6, loaded, this.$treeElementsData$delegate, null, 5), 3);
                            }
                        }
                    } else if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        screenNavigator6.goTo(back);
                    }
                } else if (addPayerCustomersViewEvent instanceof AddPayerCustomersViewEvent.Dismiss) {
                    screenNavigator6.goTo(back);
                } else if (addPayerCustomersViewEvent instanceof AddPayerCustomersViewEvent.DismissError) {
                    AddPayerCustomersViewModel addPayerCustomersViewModel2 = (AddPayerCustomersViewModel) mutableState3.getValue();
                    AddPayerCustomersViewModel.SaveError saveError = addPayerCustomersViewModel2 instanceof AddPayerCustomersViewModel.SaveError ? (AddPayerCustomersViewModel.SaveError) addPayerCustomersViewModel2 : null;
                    if (saveError != null) {
                        mutableState3.setValue(saveError.loaded);
                    }
                } else {
                    if (!(addPayerCustomersViewEvent instanceof AddPayerCustomersViewEvent.RetryLoad)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int intValue = parcelableSnapshotMutableIntState.getIntValue();
                    parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                    Okio.boxInt(intValue);
                }
                return Unit.INSTANCE;
            case 6:
                return emit$com$squareup$cash$family$familyhub$presenters$SetDependentCustomLimitPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 7:
                return emit$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 8:
                return emit$com$squareup$cash$investing$presenters$custom$order$InvestingCustomOrderPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 9:
                return emit$com$squareup$cash$money$presenters$MoneyTabPresenter$models$$inlined$CollectEffect$2$1(obj, continuation);
            case 10:
                return emit$com$squareup$cash$offers$presenters$OffersHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 11:
                return emit$com$squareup$cash$p2pblocking$presenters$BaseAllowlistSelectionPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 12:
                return emit$com$squareup$cash$paymentpad$presenters$LitePaymentPadPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 13:
                return emit$com$squareup$cash$pools$presenters$PoolMemberListPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 14:
                return emit$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 15:
                return emit$com$squareup$cash$recurringpayments$presenters$RealCreateOrEditRecurringPaymentPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 16:
                return emit$com$squareup$cash$retro$presenters$SelectPaymentPlanBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 17:
                return emit$com$squareup$cash$savings$presenters$SavingsScreenPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 18:
                return emit$com$squareup$cash$support$presenters$SupportHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 19:
                return emit$com$squareup$cash$work$presenters$shift$ClockInBottomSheetPresenter$models$$inlined$CollectEffect$2$1(obj, continuation);
            default:
                LocalDate localDate = (LocalDate) obj5;
                ShiftDataLoader shiftDataLoader = (ShiftDataLoader) obj4;
                ShiftListViewEvent shiftListViewEvent = (ShiftListViewEvent) obj;
                if (Intrinsics.areEqual(shiftListViewEvent, ShiftListViewEvent.BackClicked.INSTANCE)) {
                    ((ShiftListPresenter) obj3).navigator.goTo(back);
                } else if (Intrinsics.areEqual(shiftListViewEvent, ShiftListViewEvent.LoadNext.INSTANCE)) {
                    ((RealShiftDataLoader) shiftDataLoader).commands.tryEmit(RealShiftDataLoader.Command.LoadNextSchedules.INSTANCE);
                } else if (Intrinsics.areEqual(shiftListViewEvent, ShiftListViewEvent.LoadPrevious.INSTANCE)) {
                    ((RealShiftDataLoader) shiftDataLoader).commands.tryEmit(RealShiftDataLoader.Command.LoadPreviousTimecards.INSTANCE);
                } else if (Intrinsics.areEqual(shiftListViewEvent, ShiftListViewEvent.MonthTitleClicked.INSTANCE)) {
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        mutableState2.setValue(YearMonth.from(localDate));
                        mutableState3.setValue(localDate);
                    }
                    mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                } else if (Intrinsics.areEqual(shiftListViewEvent, ShiftListViewEvent.Retry.INSTANCE)) {
                    ((RealShiftDataLoader) shiftDataLoader).commands.tryEmit(RealShiftDataLoader.Command.Retry.INSTANCE);
                } else if (shiftListViewEvent instanceof ShiftListViewEvent.MonthChanged) {
                    mutableState2.setValue(((ShiftListViewEvent.MonthChanged) shiftListViewEvent).month);
                } else if (shiftListViewEvent instanceof ShiftListViewEvent.DateClicked) {
                    mutableState3.setValue(((ShiftListViewEvent.DateClicked) shiftListViewEvent).date);
                } else if (!(shiftListViewEvent instanceof ShiftListViewEvent.ScheduleClicked) && !(shiftListViewEvent instanceof ShiftListViewEvent.TimecardClicked)) {
                    if (!(shiftListViewEvent instanceof ShiftListViewEvent.FilterApplied)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj6).setValue(((ShiftListViewEvent.FilterApplied) shiftListViewEvent).selections);
                }
                return Unit.INSTANCE;
        }
    }

    public MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, SnapshotStateSet snapshotStateSet, CardStudioPresenter cardStudioPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = 5;
        this.$genericTreeViewEvent$delegate = snapshotStateSet;
        this.$refreshTriggers$delegate = cardStudioPresenter;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeAction$delegate = parcelableSnapshotMutableIntState;
        this.this$0 = coroutineScope;
    }

    public /* synthetic */ MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, int i) {
        this.$r8$classId = i;
        this.$genericTreeAction$delegate = moleculePresenter;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
        this.$refreshTriggers$delegate = mutableState5;
        this.this$0 = coroutineScope;
    }

    public /* synthetic */ MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
        this.$refreshTriggers$delegate = mutableState5;
        this.$genericTreeAction$delegate = mutableState6;
    }

    public /* synthetic */ MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, MutableState mutableState, State state, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        this.$r8$classId = i;
        this.$refreshTriggers$delegate = moleculePresenter;
        this.$state$delegate = mutableState;
        this.$genericTreeAction$delegate = state;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
        this.this$0 = coroutineScope;
    }

    public /* synthetic */ MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.$r8$classId = i;
        this.$genericTreeViewEvent$delegate = moleculePresenter;
        this.$refreshTriggers$delegate = obj;
        this.$genericTreeAction$delegate = obj2;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.this$0 = coroutineScope;
    }

    public /* synthetic */ MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$refreshTriggers$delegate = obj;
        this.$genericTreeAction$delegate = obj2;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
    }

    public MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state) {
        this.$r8$classId = 7;
        this.$refreshTriggers$delegate = localHomePresenter;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
        this.$genericTreeAction$delegate = state;
        this.this$0 = coroutineScope;
    }

    public MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, AccountPresenter accountPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, MutableState mutableState4) {
        this.$r8$classId = 3;
        this.$refreshTriggers$delegate = accountPresenter;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeAction$delegate = state;
        this.$genericTreeViewEvent$delegate = mutableState4;
        this.this$0 = coroutineScope;
    }

    public MerchantProfilePresenter$models$2$1$1(ShareSheetPresenter shareSheetPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.$r8$classId = 0;
        this.this$0 = shareSheetPresenter;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
        this.$refreshTriggers$delegate = mutableState5;
        this.$genericTreeAction$delegate = mutableState6;
    }

    public MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, BaseAllowlistSelectionPresenter baseAllowlistSelectionPresenter, CoroutineScope coroutineScope2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2) {
        this.$r8$classId = 11;
        this.this$0 = baseAllowlistSelectionPresenter;
        this.$genericTreeViewEvent$delegate = coroutineScope2;
        this.$state$delegate = mutableState;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$treeElementsData$delegate = mutableState3;
        this.$refreshTriggers$delegate = parcelableSnapshotMutableIntState;
        this.$genericTreeAction$delegate = parcelableSnapshotMutableIntState2;
    }

    public MerchantProfilePresenter$models$2$1$1(CoroutineScope coroutineScope, TapToPayPresenter tapToPayPresenter, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4) {
        this.$r8$classId = 4;
        this.this$0 = tapToPayPresenter;
        this.$state$delegate = mutableState;
        this.$refreshTriggers$delegate = state;
        this.$merchantProfileToken$delegate = mutableState2;
        this.$genericTreeAction$delegate = state2;
        this.$treeElementsData$delegate = mutableState3;
        this.$genericTreeViewEvent$delegate = mutableState4;
    }
}
