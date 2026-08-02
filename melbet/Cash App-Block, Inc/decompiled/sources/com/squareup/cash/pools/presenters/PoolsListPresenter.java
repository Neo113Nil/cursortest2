package com.squareup.cash.pools.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.PathOperation;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.widget.ComposeHelpersKt;
import app.cash.redwood.yoga.internal.YGNode;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.mlkit.vision.common.zzb;
import com.google.mlkit.vision.text.zzc;
import com.google.mlkit.vision.text.zzd;
import com.google.zxing.BinaryBitmap;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationSearchResult;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.real.RealLocationSearchClient;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewModel;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletParsingErrorFactory;
import com.squareup.cash.afterpayapplet.backend.AfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.afterpayapplet.backend.RetroOrderSelectionResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomeMapperKt;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$WhenMappings;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$models$1$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletNotificationScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$Factory$Impl;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewModel;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$onContactsPermissionDenied$1;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$onContactsPermissionDenied$4;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$onContactsPermissionGranted$1;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$onContactsPermissionGranted$4;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$shouldContinueEmitting$1;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenterKt$WhenMappings;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$1$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.ButtonOrder;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewModel;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.cashcommercebrowser.api.v1.CustomerPreferencesService;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.cryptonauts.api.CryptoCustomerControlsService;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.InstrumentQueries$walletAddressForCurrency$2;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.db.AddressSearch;
import com.squareup.cash.deposits.physical.db.AtmWithdrawalAddressSearchQueries;
import com.squareup.cash.deposits.physical.db.AtmWithdrawalAddressSearchQueries$addresses$2;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries$addresses$2;
import com.squareup.cash.deposits.physical.db.PhysicalDepositUsAddressSearchQueries;
import com.squareup.cash.deposits.physical.db.PhysicalDepositUsAddressSearchQueries$addresses$2;
import com.squareup.cash.deposits.physical.presenter.address.PhysicalDepositAddressEntryPresenter$models$1$1;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.deposits.physical.viewmodels.address.AddressSearchViewModel;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryViewModel;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportChatExitPromptCopy;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportConsistentCsatOrder;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InvestingPortfolioPerformanceSyncValue;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.gps.backend.api.Location;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.presenters.ResolvedTransferOption;
import com.squareup.cash.instruments.presenters.TransferOptionPickerResolver;
import com.squareup.cash.instruments.screens.TransferOptionPickerScreen;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.InvestingPerformanceSyncerKt;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.InvestmentPerformanceQueries$forEntityToken$2;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.PerformanceViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.PoolsAsset;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.offers.presenters.RealOffersAnalytics$Factory$Impl;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.offers.viewmodels.ArcadeOffersTimelineViewModels;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$Loading;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolsListScreen;
import com.squareup.cash.pools.viewmodels.InviteMemberSnackBarViewModel;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.pools.viewmodels.PoolListNuxAssets;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.pools.viewmodels.PoolParticipant;
import com.squareup.cash.pools.viewmodels.PoolRow;
import com.squareup.cash.pools.viewmodels.PoolSection;
import com.squareup.cash.pools.viewmodels.PoolsListViewModel;
import com.squareup.cash.profile.presenters.personal.ArcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1;
import com.squareup.cash.profile.screens.ArcadeAutofillSettingsScreen;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.screens.Back;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.autofill.presenters.AutofillCombinedInfo;
import com.squareup.cash.shopping.autofill.presenters.AutofillState;
import com.squareup.cash.shopping.autofill.presenters.InputViewModelExtKt;
import com.squareup.cash.shopping.autofill.presenters.RealAutofillNetworkFailureMessageGenerator;
import com.squareup.cash.shopping.autofill.viewmodels.DialogViewModel;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.support.chat.presenters.ChatExitPromptSheetState;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference;
import com.squareup.cash.transfers.backend.api.RecurringSchedule;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsManager;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsPreference;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.LastClockedInInfo;
import com.squareup.cash.work.data.api.LocationScopedClockInControls;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.shift.ClockInBottomSheetViewModelBuilder$InitialSelection;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.presenters.shift.data.ClockInDisabledReason;
import com.squareup.cash.work.presenters.shift.data.ClockInEnabledResult;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.cash.work.presenters.shift.geofence.GeofenceStateResolver;
import com.squareup.cash.work.screens.ClockInBottomSheetScreen;
import com.squareup.cash.work.screens.LocationClockInControls;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$MerchantToken;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$OfferToken;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse$ScreenContent$EligibleOrders;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse$ScreenContent$TextLines;
import com.squareup.protos.cash.fiatly.api.v1.FiatlyService;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.cash.investcustomer.api.v1.InvestCustomerService;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolLifecycleCategory;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.shop.rendering.api.PageHeader;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ContactAccessPreparationScreen;
import com.squareup.protos.franklin.api.InviteFriendsBlockerButtonOrder;
import com.squareup.protos.franklin.api.InviteFriendsOpportunityScreen;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.invest.ui.Section;
import com.squareup.util.Strings;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$2;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.OneOf;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PoolsListPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object analytics;
    public final Object args;
    public final Object dateFormatManager;
    public final Object flowToken;
    public final Object localeAssetProvider;
    public final Object moneyFormatter;
    public final Object navigator;
    public final Object repository;
    public final Object sessionManager;
    public final Object stringManager;

    public PoolsListPresenter(BlockersDataNavigator blockersDataNavigator, AppConfigManager appConfigManager, Analytics analytics, CoroutineContext coroutineContext, BlockersScreens.InviteFriendsScreen inviteFriendsScreen, BetterNavigator.ScreenNavigator screenNavigator, ModifiablePermissions modifiablePermissions, AndroidClock androidClock) {
        this.$r8$classId = 3;
        this.sessionManager = blockersDataNavigator;
        this.stringManager = appConfigManager;
        this.analytics = analytics;
        this.repository = coroutineContext;
        this.dateFormatManager = inviteFriendsScreen;
        this.navigator = screenNavigator;
        this.localeAssetProvider = modifiablePermissions;
        this.args = androidClock;
        this.moneyFormatter = BlockersData.copy$default(inviteFriendsScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1073741825, 65535);
        this.flowToken = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
    }

    public static final AbstractPersistentList access$buildDisplayableSections(PoolsListPresenter poolsListPresenter, List list, List list2, List list3) {
        String str;
        AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter.stringManager;
        PoolInvitePeopleListScreen poolInvitePeopleListScreen = (PoolInvitePeopleListScreen) poolsListPresenter.flowToken;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Section) obj).recipients.isEmpty()) {
                arrayList.add(obj);
            }
        }
        int i = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Section section = (Section) it.next();
            Section.Type type2 = section.f1192type;
            if (type2 != Section.Type.SUGGESTED || poolInvitePeopleListScreen.shareUrl == null) {
                int ordinal = type2.ordinal();
                if (ordinal == 0) {
                    str = androidStringManager.get(R.string.pools_member_search_suggested);
                } else if (ordinal == 1) {
                    str = androidStringManager.get(R.string.pools_member_search_contacts);
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str = androidStringManager.get(R.string.pools_member_search_results);
                }
            } else {
                str = androidStringManager.get(R.string.pools_add_share_suggested_section_title);
            }
            List list4 = section.recipients;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list4) {
                Recipient recipient = (Recipient) obj2;
                if (section.f1192type != Section.Type.SUGGESTED || !CollectionsKt.contains(poolInvitePeopleListScreen.alreadyAddedCustomerTokens, recipient.customerId)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, i));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Recipient recipient2 = (Recipient) it2.next();
                String str2 = recipient2.customerId;
                String str3 = recipient2.displayName;
                arrayList4.add(new PoolListSection.PoolListPerson(str2 == null ? "" : str2, str3 == null ? "" : str3, Cashtags.fromString(recipient2.cashtag, recipient2.region), String.valueOf(str3 != null ? StringsKt___StringsKt.firstOrNull(str3) : null), CollectionsKt.contains(list2, str2), CollectionsKt.contains(list3, str2), recipient2.isFavorited, recipient2.isVerified, recipient2.isBusiness, recipient2.photo, recipient2.getAccentColor(), true, true));
            }
            arrayList2.add(new PoolListSection(str, Tags.toImmutableList(arrayList4)));
            i = 10;
        }
        return Tags.toPersistentList(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onContactsPermissionDenied(PoolsListPresenter poolsListPresenter, ContinuationImpl continuationImpl) {
        InviteFriendsPresenter$onContactsPermissionDenied$1 inviteFriendsPresenter$onContactsPermissionDenied$1;
        int i;
        if (continuationImpl instanceof InviteFriendsPresenter$onContactsPermissionDenied$1) {
            inviteFriendsPresenter$onContactsPermissionDenied$1 = (InviteFriendsPresenter$onContactsPermissionDenied$1) continuationImpl;
            int i2 = inviteFriendsPresenter$onContactsPermissionDenied$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inviteFriendsPresenter$onContactsPermissionDenied$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inviteFriendsPresenter$onContactsPermissionDenied$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteFriendsPresenter$onContactsPermissionDenied$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((ModifiablePermissions) poolsListPresenter.localeAssetProvider).denied(), (SharedFlowImpl) poolsListPresenter.flowToken, InviteFriendsPresenter$onContactsPermissionDenied$4.INSTANCE, 0);
                    inviteFriendsPresenter$onContactsPermissionDenied$1.label = 1;
                    if (FlowKt.first(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, inviteFriendsPresenter$onContactsPermissionDenied$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                BlockersData blockersData = (BlockersData) poolsListPresenter.moneyFormatter;
                BlockersScreens.InviteFriendsScreen inviteFriendsScreen = (BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager;
                screenNavigator.goTo(new BlockersScreens.InviteContactsScreen(blockersData, true, inviteFriendsScreen.inviteFriendsData, inviteFriendsScreen.inviteFriendsOpportunityScreen, inviteFriendsScreen.inviteFriendsScreen, inviteFriendsScreen.recommendedContactsHashedAliasIds, inviteFriendsScreen.plasmaOrigin));
                return Unit.INSTANCE;
            }
        }
        inviteFriendsPresenter$onContactsPermissionDenied$1 = new InviteFriendsPresenter$onContactsPermissionDenied$1(poolsListPresenter, continuationImpl);
        Object obj2 = inviteFriendsPresenter$onContactsPermissionDenied$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteFriendsPresenter$onContactsPermissionDenied$1.label;
        if (i != 0) {
        }
        BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
        BlockersData blockersData2 = (BlockersData) poolsListPresenter.moneyFormatter;
        BlockersScreens.InviteFriendsScreen inviteFriendsScreen2 = (BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager;
        screenNavigator2.goTo(new BlockersScreens.InviteContactsScreen(blockersData2, true, inviteFriendsScreen2.inviteFriendsData, inviteFriendsScreen2.inviteFriendsOpportunityScreen, inviteFriendsScreen2.inviteFriendsScreen, inviteFriendsScreen2.recommendedContactsHashedAliasIds, inviteFriendsScreen2.plasmaOrigin));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onContactsPermissionGranted(PoolsListPresenter poolsListPresenter, ContinuationImpl continuationImpl) {
        InviteFriendsPresenter$onContactsPermissionGranted$1 inviteFriendsPresenter$onContactsPermissionGranted$1;
        int i;
        if (continuationImpl instanceof InviteFriendsPresenter$onContactsPermissionGranted$1) {
            inviteFriendsPresenter$onContactsPermissionGranted$1 = (InviteFriendsPresenter$onContactsPermissionGranted$1) continuationImpl;
            int i2 = inviteFriendsPresenter$onContactsPermissionGranted$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inviteFriendsPresenter$onContactsPermissionGranted$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inviteFriendsPresenter$onContactsPermissionGranted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteFriendsPresenter$onContactsPermissionGranted$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((ModifiablePermissions) poolsListPresenter.localeAssetProvider).granted(), (SharedFlowImpl) poolsListPresenter.flowToken, InviteFriendsPresenter$onContactsPermissionGranted$4.INSTANCE, 0)), 11);
                    inviteFriendsPresenter$onContactsPermissionGranted$1.label = 1;
                    if (FlowKt.first(cardModelView$iconTexture$$inlined$map$1, inviteFriendsPresenter$onContactsPermissionGranted$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                BlockersData blockersData = (BlockersData) poolsListPresenter.moneyFormatter;
                BlockersScreens.InviteFriendsScreen inviteFriendsScreen = (BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager;
                screenNavigator.goTo(new BlockersScreens.InviteContactsScreen(blockersData, false, inviteFriendsScreen.inviteFriendsData, inviteFriendsScreen.inviteFriendsOpportunityScreen, inviteFriendsScreen.inviteFriendsScreen, inviteFriendsScreen.recommendedContactsHashedAliasIds, inviteFriendsScreen.plasmaOrigin));
                return Unit.INSTANCE;
            }
        }
        inviteFriendsPresenter$onContactsPermissionGranted$1 = new InviteFriendsPresenter$onContactsPermissionGranted$1(poolsListPresenter, continuationImpl);
        Object obj2 = inviteFriendsPresenter$onContactsPermissionGranted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteFriendsPresenter$onContactsPermissionGranted$1.label;
        if (i != 0) {
        }
        BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
        BlockersData blockersData2 = (BlockersData) poolsListPresenter.moneyFormatter;
        BlockersScreens.InviteFriendsScreen inviteFriendsScreen2 = (BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager;
        screenNavigator2.goTo(new BlockersScreens.InviteContactsScreen(blockersData2, false, inviteFriendsScreen2.inviteFriendsData, inviteFriendsScreen2.inviteFriendsOpportunityScreen, inviteFriendsScreen2.inviteFriendsScreen, inviteFriendsScreen2.recommendedContactsHashedAliasIds, inviteFriendsScreen2.plasmaOrigin));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0061, code lost:
    
        if (r2 == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x007a, code lost:
    
        if (r2 == r6) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshData(PoolsListPresenter poolsListPresenter, PoolCategory poolCategory, ContinuationImpl continuationImpl) {
        PoolsListPresenter$refreshData$1 poolsListPresenter$refreshData$1;
        int i;
        List list;
        PoolsListViewModel.Loaded loaded;
        boolean z;
        PoolsListViewModel.Loaded loaded2;
        AndroidStringManager androidStringManager;
        boolean z2;
        String format2;
        String str;
        String format3;
        String str2;
        PoolCategory poolCategory2 = poolCategory;
        RealPoolsRepository realPoolsRepository = (RealPoolsRepository) poolsListPresenter.repository;
        CoroutineContext coroutineContext = realPoolsRepository.ioDispatcher;
        if (continuationImpl instanceof PoolsListPresenter$refreshData$1) {
            poolsListPresenter$refreshData$1 = (PoolsListPresenter$refreshData$1) continuationImpl;
            int i2 = poolsListPresenter$refreshData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                poolsListPresenter$refreshData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = poolsListPresenter$refreshData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = poolsListPresenter$refreshData$1.label;
                Continuation continuation = null;
                boolean z3 = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = poolCategory2.ordinal();
                    int i3 = 29;
                    if (ordinal == 0) {
                        poolsListPresenter$refreshData$1.L$0 = poolCategory2;
                        poolsListPresenter$refreshData$1.label = 1;
                        obj = JobKt.withContext(coroutineContext, new OverlayKt$Overlay$1$1$1$1$1(realPoolsRepository, PoolLifecycleCategory.POOL_LIFECYCLE_CATEGORY_ACTIVE, continuation, i3), poolsListPresenter$refreshData$1);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        poolsListPresenter$refreshData$1.L$0 = poolCategory2;
                        poolsListPresenter$refreshData$1.label = 2;
                        obj = JobKt.withContext(coroutineContext, new OverlayKt$Overlay$1$1$1$1$1(realPoolsRepository, PoolLifecycleCategory.POOL_LIFECYCLE_CATEGORY_CLOSED, continuation, i3), poolsListPresenter$refreshData$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    poolCategory2 = poolsListPresenter$refreshData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    list = (List) obj;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    poolCategory2 = poolsListPresenter$refreshData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    list = (List) obj;
                }
                if (list != null) {
                    return new PoolsListViewModel.Error(poolCategory2);
                }
                boolean z4 = poolCategory2 == PoolCategory.ACTIVE;
                MoneyFormatter moneyFormatter = (MoneyFormatter) poolsListPresenter.moneyFormatter;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) poolsListPresenter.stringManager;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull((SessionManager) poolsListPresenter.sessionManager);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    PoolOwner poolOwner = ((MoneyPool) obj2).owner;
                    if (Intrinsics.areEqual(poolOwner != null ? poolOwner.customer_token : null, activeAccountTokenOrNull)) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                List listOf = CollectionsKt__CollectionsKt.listOf(arrayList, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listOf) {
                    if (!((List) obj3).isEmpty()) {
                        arrayList3.add(obj3);
                    }
                }
                int i4 = 10;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    Continuation continuation2 = continuation;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            PoolOwner poolOwner2 = ((MoneyPool) it2.next()).owner;
                            if (!Intrinsics.areEqual(poolOwner2 != null ? poolOwner2.customer_token : continuation2, activeAccountTokenOrNull)) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = z3;
                    String str3 = androidStringManager2.get(z ? R.string.pools_list_owned_title : R.string.pools_list_joined_title);
                    Resources resources = androidStringManager2.resources;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, i4));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        MoneyPool moneyPool = (MoneyPool) it3.next();
                        Money money = moneyPool.target;
                        boolean z5 = z4;
                        PoolOwner poolOwner3 = moneyPool.owner;
                        if (money == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Missing target in MoneyPool proto.");
                            return continuation2;
                        }
                        Iterator it4 = it3;
                        Money money2 = moneyPool.balance;
                        if (money2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Missing balance in MoneyPool proto.");
                            return continuation2;
                        }
                        String str4 = activeAccountTokenOrNull;
                        Long l = money.amount;
                        if (l == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Pool should have a target amount.");
                            return continuation2;
                        }
                        Iterator it5 = it;
                        long longValue = l.longValue();
                        PoolCategory poolCategory3 = poolCategory2;
                        Long l2 = money2.amount;
                        if (l2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Pool should have a balance amount.");
                            return continuation2;
                        }
                        ArrayList arrayList6 = arrayList4;
                        long longValue2 = l2.longValue();
                        if (z) {
                            loaded2 = loaded;
                            format2 = androidStringManager2.get(R.string.pools_list_row_label_by_you);
                            z2 = z;
                            androidStringManager = androidStringManager2;
                        } else {
                            loaded2 = loaded;
                            Object obj4 = poolOwner3 != null ? poolOwner3.full_name : continuation2;
                            if (obj4 == null) {
                                obj4 = "";
                            }
                            androidStringManager = androidStringManager2;
                            z2 = z;
                            ArrayMap arrayMap = new ArrayMap(1);
                            arrayMap.put("name", obj4);
                            resources.getClass();
                            format2 = new MessageFormat(resources.getString(R.string.pools_list_row_label_by_name)).format(arrayMap);
                            format2.getClass();
                        }
                        String str5 = format2;
                        if (z5) {
                            Long l3 = moneyPool.contributions_count;
                            Long valueOf = Long.valueOf(l3 != null ? l3.longValue() : 0L);
                            ArrayMap arrayMap2 = new ArrayMap(1);
                            arrayMap2.put("count", valueOf);
                            resources.getClass();
                            format3 = new MessageFormat(resources.getString(R.string.pools_list_number_payments_label)).format(arrayMap2);
                            format3.getClass();
                        } else {
                            Long l4 = moneyPool.closed_at;
                            if (l4 != null) {
                                long longValue3 = l4.longValue();
                                AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) poolsListPresenter.dateFormatManager;
                                String format4 = androidDateFormatManager.getDateFormat("MMM dd, yyyy", androidDateFormatManager.clock.timeZone()).formatter.format(Instant.ofEpochMilli(longValue3));
                                format4.getClass();
                                resources.getClass();
                                format3 = new MessageFormat(resources.getString(R.string.pools_closed_on_date_label)).format(new Object[]{format4});
                                format3.getClass();
                            } else {
                                str = "";
                                String format5 = moneyFormatter.format(money2);
                                String format6 = moneyFormatter.format(money);
                                format5.getClass();
                                format6.getClass();
                                ArrayMap arrayMap3 = new ArrayMap(2);
                                arrayMap3.put("goal", format6);
                                arrayMap3.put("total", format5);
                                resources.getClass();
                                String format7 = new MessageFormat(resources.getString(R.string.pools_list_goal_progress_label)).format(arrayMap3);
                                format7.getClass();
                                str2 = moneyPool.pool_token;
                                if (str2 != null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Pool should have a corresponding token.");
                                    return continuation2;
                                }
                                String str6 = moneyPool.name;
                                String str7 = str6 == null ? "" : str6;
                                float f = longValue2 / longValue;
                                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                if (poolOwner3 != null) {
                                    String str8 = poolOwner3.customer_token;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    String str9 = poolOwner3.full_name;
                                    String str10 = poolOwner3.profile_photo_url;
                                    createListBuilder.add(new PoolParticipant(str9, str8, str10 != null ? new Image(str10, str10, 4) : continuation2, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner3.customer_token, poolOwner3.full_name, null, null))));
                                }
                                List list3 = moneyPool.participants;
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj5 : list3) {
                                    if (((com.squareup.protos.cash.pools.PoolParticipant) obj5).participant_type == PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER) {
                                        arrayList7.add(obj5);
                                    }
                                }
                                List<com.squareup.protos.cash.pools.PoolParticipant> sortedWith = CollectionsKt.sortedWith(arrayList7, new LinkedHashTreeMap.AnonymousClass1(6));
                                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                                for (com.squareup.protos.cash.pools.PoolParticipant poolParticipant : sortedWith) {
                                    String str11 = poolParticipant.customer_identifier;
                                    str11.getClass();
                                    String str12 = poolParticipant.full_name;
                                    String str13 = poolParticipant.profile_photo_url;
                                    arrayList8.add(new PoolParticipant(str12, str11, str13 != null ? new Image(str13, str13, 4) : continuation2, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolParticipant.customer_identifier, poolParticipant.full_name, null, null))));
                                }
                                createListBuilder.addAll(arrayList8);
                                arrayList5.add(new PoolRow(str2, str7, str5, str, format7, f, Tags.toPersistentList(CollectionsKt__CollectionsJVMKt.build(createListBuilder))));
                                z4 = z5;
                                it3 = it4;
                                activeAccountTokenOrNull = str4;
                                it = it5;
                                poolCategory2 = poolCategory3;
                                arrayList4 = arrayList6;
                                loaded = loaded2;
                                androidStringManager2 = androidStringManager;
                                z = z2;
                            }
                        }
                        str = format3;
                        String format52 = moneyFormatter.format(money2);
                        String format62 = moneyFormatter.format(money);
                        format52.getClass();
                        format62.getClass();
                        ArrayMap arrayMap32 = new ArrayMap(2);
                        arrayMap32.put("goal", format62);
                        arrayMap32.put("total", format52);
                        resources.getClass();
                        String format72 = new MessageFormat(resources.getString(R.string.pools_list_goal_progress_label)).format(arrayMap32);
                        format72.getClass();
                        str2 = moneyPool.pool_token;
                        if (str2 != null) {
                        }
                    }
                    arrayList4 = arrayList4;
                    arrayList4.add(new PoolSection(str3, arrayList5, z));
                    continuation = continuation2;
                    poolCategory2 = poolCategory2;
                    z3 = true;
                    i4 = 10;
                }
                PoolCategory poolCategory4 = poolCategory2;
                zzb zzbVar = (zzb) poolsListPresenter.localeAssetProvider;
                String localizePoolsAsset = zzbVar.localizePoolsAsset(PoolsAsset.POOLS_NUX_DETAILS);
                String localizePoolsAsset2 = zzbVar.localizePoolsAsset(PoolsAsset.POOLS_NUX_ACTIVITY);
                return new PoolsListViewModel.Loaded(arrayList4, false, poolCategory4, new PoolListNuxAssets(new Image(localizePoolsAsset, localizePoolsAsset, 4), new Image(localizePoolsAsset2, localizePoolsAsset2, 4)));
            }
        }
        poolsListPresenter$refreshData$1 = new PoolsListPresenter$refreshData$1(poolsListPresenter, continuationImpl);
        Object obj6 = poolsListPresenter$refreshData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = poolsListPresenter$refreshData$1.label;
        Continuation continuation3 = null;
        boolean z32 = true;
        if (i != 0) {
        }
        if (list != null) {
        }
    }

    public static final void access$routeAction(PoolsListPresenter poolsListPresenter, String str) {
        RealRouter realRouter = (RealRouter) poolsListPresenter.moneyFormatter;
        AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen afterpayAppletScreen$AfterpayRetroOrderSelectionScreen = (AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen) poolsListPresenter.sessionManager;
        realRouter.route(new RoutingParams(afterpayAppletScreen$AfterpayRetroOrderSelectionScreen, null, afterpayAppletScreen$AfterpayRetroOrderSelectionScreen, null, new AnalyticsParams.GenericAnalyticsParams(afterpayAppletScreen$AfterpayRetroOrderSelectionScreen.referrerFlowToken, "RETRO_ORDER_SELECTION", (String) null, 10), null, 470), str);
    }

    public static final void access$saveLastClockedInInfo(PoolsListPresenter poolsListPresenter, JobIdentifier jobIdentifier, LocationIdentifier locationIdentifier) {
        RealLastClockedInInfoUseCase realLastClockedInInfoUseCase = (RealLastClockedInInfoUseCase) poolsListPresenter.analytics;
        ClockInBottomSheetScreen clockInBottomSheetScreen = (ClockInBottomSheetScreen) poolsListPresenter.sessionManager;
        String str = clockInBottomSheetScreen.merchantToken;
        MerchantIdentifier merchantIdentifier = new MerchantIdentifier(str);
        String str2 = clockInBottomSheetScreen.employeeToken;
        str2.getClass();
        ArrayList mutableList = CollectionsKt.toMutableList((Collection) realLastClockedInInfoUseCase.getInfoList());
        mutableList.removeIf(new PulsingState$$ExternalSyntheticLambda1(3, new HeroCardViewKt$$ExternalSyntheticLambda0(7, merchantIdentifier, str2)));
        mutableList.add(new RealLastClockedInInfoUseCase.StoredLastClockedInInfo(jobIdentifier.token, str, str2, locationIdentifier.token));
        realLastClockedInInfoUseCase.userPrefs.lastClockedInInfoKeyValue.blockingSet(realLastClockedInInfoUseCase.listAdapter.toJson(mutableList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$shouldContinueEmitting(PoolsListPresenter poolsListPresenter, ModifiablePermissions modifiablePermissions, ContinuationImpl continuationImpl) {
        InviteFriendsPresenter$shouldContinueEmitting$1 inviteFriendsPresenter$shouldContinueEmitting$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object shouldShowRequestPermissionRationale;
        boolean z;
        if (continuationImpl instanceof InviteFriendsPresenter$shouldContinueEmitting$1) {
            inviteFriendsPresenter$shouldContinueEmitting$1 = (InviteFriendsPresenter$shouldContinueEmitting$1) continuationImpl;
            int i2 = inviteFriendsPresenter$shouldContinueEmitting$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inviteFriendsPresenter$shouldContinueEmitting$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inviteFriendsPresenter$shouldContinueEmitting$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteFriendsPresenter$shouldContinueEmitting$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow granted = modifiablePermissions.granted();
                    inviteFriendsPresenter$shouldContinueEmitting$1.L$0 = modifiablePermissions;
                    inviteFriendsPresenter$shouldContinueEmitting$1.label = 1;
                    obj = FlowKt.first(granted, inviteFriendsPresenter$shouldContinueEmitting$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = inviteFriendsPresenter$shouldContinueEmitting$1.Z$0;
                        SafeTrace.throwOnFailure(obj);
                        Boolean bool = (Boolean) obj;
                        boolean booleanValue = bool.booleanValue();
                        if (!z || booleanValue) {
                            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                            BlockersData blockersData = (BlockersData) poolsListPresenter.moneyFormatter;
                            BlockersScreens.InviteFriendsScreen inviteFriendsScreen = (BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager;
                            screenNavigator.goTo(new BlockersScreens.InviteContactsScreen(blockersData, false, inviteFriendsScreen.inviteFriendsData, inviteFriendsScreen.inviteFriendsOpportunityScreen, inviteFriendsScreen.inviteFriendsScreen, inviteFriendsScreen.recommendedContactsHashedAliasIds, inviteFriendsScreen.plasmaOrigin));
                        }
                        return new Pair(Boolean.valueOf(z), bool);
                    }
                    modifiablePermissions = inviteFriendsPresenter$shouldContinueEmitting$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                inviteFriendsPresenter$shouldContinueEmitting$1.L$0 = null;
                inviteFriendsPresenter$shouldContinueEmitting$1.Z$0 = booleanValue2;
                inviteFriendsPresenter$shouldContinueEmitting$1.label = 2;
                shouldShowRequestPermissionRationale = modifiablePermissions.shouldShowRequestPermissionRationale(inviteFriendsPresenter$shouldContinueEmitting$1);
                if (shouldShowRequestPermissionRationale != coroutineSingletons) {
                    obj = shouldShowRequestPermissionRationale;
                    z = booleanValue2;
                    Boolean bool2 = (Boolean) obj;
                    boolean booleanValue3 = bool2.booleanValue();
                    if (!z) {
                    }
                    BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                    BlockersData blockersData2 = (BlockersData) poolsListPresenter.moneyFormatter;
                    BlockersScreens.InviteFriendsScreen inviteFriendsScreen2 = (BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager;
                    screenNavigator2.goTo(new BlockersScreens.InviteContactsScreen(blockersData2, false, inviteFriendsScreen2.inviteFriendsData, inviteFriendsScreen2.inviteFriendsOpportunityScreen, inviteFriendsScreen2.inviteFriendsScreen, inviteFriendsScreen2.recommendedContactsHashedAliasIds, inviteFriendsScreen2.plasmaOrigin));
                    return new Pair(Boolean.valueOf(z), bool2);
                }
                return coroutineSingletons;
            }
        }
        inviteFriendsPresenter$shouldContinueEmitting$1 = new InviteFriendsPresenter$shouldContinueEmitting$1(poolsListPresenter, continuationImpl);
        Object obj2 = inviteFriendsPresenter$shouldContinueEmitting$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteFriendsPresenter$shouldContinueEmitting$1.label;
        if (i != 0) {
        }
        boolean booleanValue22 = ((Boolean) obj2).booleanValue();
        inviteFriendsPresenter$shouldContinueEmitting$1.L$0 = null;
        inviteFriendsPresenter$shouldContinueEmitting$1.Z$0 = booleanValue22;
        inviteFriendsPresenter$shouldContinueEmitting$1.label = 2;
        shouldShowRequestPermissionRationale = modifiablePermissions.shouldShowRequestPermissionRationale(inviteFriendsPresenter$shouldContinueEmitting$1);
        if (shouldShowRequestPermissionRationale != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitUpdatedInfo(PoolsListPresenter poolsListPresenter, AutofillCombinedInfo autofillCombinedInfo, String str, String str2, ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1, QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1, ContinuationImpl continuationImpl) {
        ArcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1 arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ArcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1) {
            arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1 = (ArcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1) continuationImpl;
            int i2 = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShippingAddressService shippingAddressService = (ShippingAddressService) poolsListPresenter.dateFormatManager;
                    if (str == null) {
                        CreateShippingAddressRequest createShippingAddressRequest = new CreateShippingAddressRequest(UUID.randomUUID().toString(), InputViewModelExtKt.toCreateShippingAddress(autofillCombinedInfo));
                        arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$3 = shiftNotePresenter$models$1$1;
                        arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$4 = quickPayViewKt$QuickPay$1$1$1$2$1$3$1;
                        arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.label = 1;
                        obj = shippingAddressService.createShippingAddress(createShippingAddressRequest, arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1);
                    } else {
                        UpdateShippingAddressRequest updateShippingAddressRequest = new UpdateShippingAddressRequest(str2, str, InputViewModelExtKt.toUpdateShippingAddress(autofillCombinedInfo));
                        arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$3 = shiftNotePresenter$models$1$1;
                        arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$4 = quickPayViewKt$QuickPay$1$1$1$2$1$3$1;
                        arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.label = 2;
                        obj = shippingAddressService.updateShippingAddress(updateShippingAddressRequest, arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$4;
                    shiftNotePresenter$models$1$1 = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$4;
                    shiftNotePresenter$models$1$1 = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                }
                if (!(apiResult instanceof ApiResult.Failure)) {
                    shiftNotePresenter$models$1$1.invoke(apiResult);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                }
                return Unit.INSTANCE;
            }
        }
        arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1 = new ArcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1(poolsListPresenter, continuationImpl);
        Object obj2 = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = arcadeAutofillSettingsDetailPresenter$submitUpdatedInfo$1.label;
        if (i != 0) {
        }
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$toRetroOrderSelectionViewModel(PoolsListPresenter poolsListPresenter, RetroOrderSelectionResult retroOrderSelectionResult, ContinuationImpl continuationImpl) {
        AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1 afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1;
        int i;
        AfterpayAppletRetroOrderSelectionViewModel.Error error = (AfterpayAppletRetroOrderSelectionViewModel.Error) poolsListPresenter.flowToken;
        try {
            if (continuationImpl instanceof AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1) {
                afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1 = (AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1) continuationImpl;
                int i2 = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!Intrinsics.areEqual(retroOrderSelectionResult, RetroOrderSelectionResult.Error.INSTANCE)) {
                            if (Intrinsics.areEqual(retroOrderSelectionResult, RetroOrderSelectionResult.Loading.INSTANCE)) {
                                return AfterpayAppletRetroOrderSelectionViewModel.Loading.INSTANCE;
                            }
                            if (retroOrderSelectionResult instanceof RetroOrderSelectionResult.Success) {
                                RetroOrderSelectionResponse retroOrderSelectionResponse = ((RetroOrderSelectionResult.Success) retroOrderSelectionResult).data;
                                afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1.label = 1;
                                obj = poolsListPresenter.toLoadedRetroOrderSelectionViewModel(retroOrderSelectionResponse, afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1);
                                if (obj == obj2) {
                                    return obj2;
                                }
                            } else if (!Intrinsics.areEqual(retroOrderSelectionResult, RetroOrderSelectionResult.Empty.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                        return error;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return (AfterpayAppletRetroOrderSelectionViewModel) obj;
                }
            }
            if (i != 0) {
            }
            return (AfterpayAppletRetroOrderSelectionViewModel) obj;
        } catch (ProtoParsingError e) {
            ((ErrorReporter) poolsListPresenter.localeAssetProvider).report(e, (SampleStrategy) poolsListPresenter.args);
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
            screenNavigator.goTo(Back.INSTANCE);
            AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter.stringManager;
            screenNavigator.goTo(new AfterpayAppletScreen$AfterpayAppletNotificationScreen(3000L, androidStringManager.get(R.string.afterpay_applet_notification_error_title), androidStringManager.get(R.string.afterpay_applet_notification_error_subtitle)));
            return error;
        }
        afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1 = new AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1(poolsListPresenter, continuationImpl);
        Object obj3 = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSelectionViewModel$1.label;
    }

    public static final ArrayList access$toSectionModels(PoolsListPresenter poolsListPresenter, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.squareup.protos.invest.ui.Section section = (com.squareup.protos.invest.ui.Section) it.next();
            final String str = section.title;
            str.getClass();
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new OneOf(str) { // from class: com.squareup.cash.investing.viewmodels.PerformanceViewModel$SectionModel$SectionTitle
                public final String label;

                {
                    str.getClass();
                    this.label = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PerformanceViewModel$SectionModel$SectionTitle) && Intrinsics.areEqual(this.label, ((PerformanceViewModel$SectionModel$SectionTitle) obj).label);
                }

                public final int hashCode() {
                    return this.label.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionTitle(label=", this.label, ")");
                }
            });
            List<Section.Row> list2 = section.rows;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (final Section.Row row : list2) {
                arrayList2.add(new OneOf(row) { // from class: com.squareup.cash.investing.viewmodels.PerformanceViewModel$SectionModel$SectionRow
                    public final Section.Row row;

                    {
                        row.getClass();
                        this.row = row;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof PerformanceViewModel$SectionModel$SectionRow) && Intrinsics.areEqual(this.row, ((PerformanceViewModel$SectionModel$SectionRow) obj).row);
                    }

                    public final int hashCode() {
                        return this.row.hashCode();
                    }

                    public final String toString() {
                        return "SectionRow(row=" + this.row + ")";
                    }
                });
            }
            CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.plus((Iterable) arrayList2, (Collection) listOf), arrayList);
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel$Content, still in use, count: 2, list:
          (r1v3 com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel$Content) from 0x020e: MOVE (r20v1 com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel$Content) = (r1v3 com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel$Content)
          (r1v3 com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel$Content) from 0x01d9: MOVE (r20v4 com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel$Content) = (r1v3 com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel$Content)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.Object models$com$squareup$cash$family$familyhub$presenters$SetDependentCustomLimitPresenter(kotlinx.coroutines.flow.Flow r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.pools.presenters.PoolsListPresenter.models$com$squareup$cash$family$familyhub$presenters$SetDependentCustomLimitPresenter(kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0194, code lost:
    
        if (r9 == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b6 A[LOOP:4: B:80:0x01b0->B:82:0x01b6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$instruments$presenters$TransferOptionPickerPresenter(Flow flow, Composer composer, int i) {
        TransferOptionPickerSelection transferOptionPickerSelection;
        boolean z;
        String str;
        String str2;
        Iterator it;
        Iterator it2;
        Object obj;
        TransferOptionPickerScreen transferOptionPickerScreen = (TransferOptionPickerScreen) this.flowToken;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-793778291);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealBalanceSnapshotManager) this.sessionManager).select();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealInstrumentManager) this.repository).select();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = ((SyncValueReader) this.dateFormatManager).getSingleValueOrDefault(AndroidSyncValueSpecs.VersionedSavingsFolders, null, new GpsConfigQueries$$ExternalSyntheticLambda2(this, 14));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue3, gapComposer);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) rememberedValue4;
        TransferOptionPickerResolver transferOptionPickerResolver = (TransferOptionPickerResolver) this.analytics;
        Money money = transferOptionPickerScreen.amount;
        List list = transferOptionPickerScreen.transferOptions;
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState.getValue();
        List list2 = (List) collectAsState2.getValue();
        if (list2 == null) {
            list2 = EmptyList.INSTANCE;
        }
        List list3 = list2;
        List list4 = (List) receiveValueAsState.getValue();
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        ArrayList resolve = transferOptionPickerResolver.resolve(money, list, balanceSnapshot, list3, list4, transferOptionPickerScreen.hiddenOptionValues, transferOptionPickerScreen.balanceGatingEnabled ? transferOptionPickerScreen.amount : null, ((List) collectAsState2.getValue()) != null);
        TransferOptionPickerSelection transferOptionPickerSelection2 = (TransferOptionPickerSelection) mutableState.getValue();
        if (!resolve.isEmpty()) {
            Iterator it3 = resolve.iterator();
            while (it3.hasNext()) {
                ResolvedTransferOption resolvedTransferOption = (ResolvedTransferOption) it3.next();
                if (resolvedTransferOption.selection.equals(transferOptionPickerSelection2) && resolvedTransferOption.isSelectable()) {
                    break;
                }
            }
        }
        transferOptionPickerSelection2 = null;
        if (transferOptionPickerSelection2 == null) {
            transferOptionPickerSelection2 = transferOptionPickerScreen.selectedOption;
            if (!resolve.isEmpty()) {
                Iterator it4 = resolve.iterator();
                while (it4.hasNext()) {
                    ResolvedTransferOption resolvedTransferOption2 = (ResolvedTransferOption) it4.next();
                    if (resolvedTransferOption2.selection.equals(transferOptionPickerSelection2) && resolvedTransferOption2.isSelectable()) {
                        break;
                    }
                }
            }
            transferOptionPickerSelection2 = null;
            if (transferOptionPickerSelection2 == null) {
                Iterator it5 = resolve.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it5.next();
                    if (((ResolvedTransferOption) obj).isSelectable()) {
                        break;
                    }
                }
                ResolvedTransferOption resolvedTransferOption3 = (ResolvedTransferOption) obj;
                if (resolvedTransferOption3 == null) {
                    transferOptionPickerSelection = null;
                    if (transferOptionPickerSelection != null && !resolve.isEmpty()) {
                        it2 = resolve.iterator();
                        while (it2.hasNext()) {
                            ResolvedTransferOption resolvedTransferOption4 = (ResolvedTransferOption) it2.next();
                            if (resolvedTransferOption4.selection.equals(transferOptionPickerSelection) && resolvedTransferOption4.isSelectable()) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) Updater.rememberUpdatedState(resolve, gapComposer), (State) mutableState, (Object) Updater.rememberUpdatedState(transferOptionPickerSelection, gapComposer), 8));
                    String str3 = transferOptionPickerScreen.title;
                    str = transferOptionPickerScreen.cta;
                    if (str != null) {
                        str2 = StringsKt.isBlank(str) ? null : str;
                    }
                    str2 = ((AndroidStringManager) this.stringManager).get(R.string.button_done);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(resolve, 10));
                    it = resolve.iterator();
                    while (it.hasNext()) {
                        ResolvedTransferOption resolvedTransferOption5 = (ResolvedTransferOption) it.next();
                        TransferOptionPickerSelection transferOptionPickerSelection3 = resolvedTransferOption5.selection;
                        arrayList.add(new TransferOptionPickerViewModel.Option(transferOptionPickerSelection3, resolvedTransferOption5.instrument, transferOptionPickerSelection3.equals(transferOptionPickerSelection)));
                    }
                    TransferOptionPickerViewModel transferOptionPickerViewModel = new TransferOptionPickerViewModel(str3, str2, arrayList, z);
                    gapComposer.end(false);
                    return transferOptionPickerViewModel;
                }
                transferOptionPickerSelection2 = resolvedTransferOption3.selection;
            }
        }
        transferOptionPickerSelection = transferOptionPickerSelection2;
        if (transferOptionPickerSelection != null) {
            it2 = resolve.iterator();
            while (it2.hasNext()) {
            }
        }
        z = false;
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) Updater.rememberUpdatedState(resolve, gapComposer), (State) mutableState, (Object) Updater.rememberUpdatedState(transferOptionPickerSelection, gapComposer), 8));
        String str32 = transferOptionPickerScreen.title;
        str = transferOptionPickerScreen.cta;
        if (str != null) {
        }
        str2 = ((AndroidStringManager) this.stringManager).get(R.string.button_done);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(resolve, 10));
        it = resolve.iterator();
        while (it.hasNext()) {
        }
        TransferOptionPickerViewModel transferOptionPickerViewModel2 = new TransferOptionPickerViewModel(str32, str2, arrayList2, z);
        gapComposer.end(false);
        return transferOptionPickerViewModel2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        if (r13 == null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$offers$presenters$OffersTimelinePresenter(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        String name;
        OffersScreen$OffersTimelineScreen offersScreen$OffersTimelineScreen = (OffersScreen$OffersTimelineScreen) this.sessionManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1415338710);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(OffersTimelineViewModel$Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (rememberedValue2 == neverEqualPolicy) {
            RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) this.repository;
            OfferSheetKey offerSheetKey = offersScreen$OffersTimelineScreen.offerSheetKey;
            Screen screen = offersScreen$OffersTimelineScreen.parentScreen;
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(realOffersSheetRepository.offerSheet(OfferSheetKey.copy$default(offerSheetKey, screen != null ? PathOperation.toPresentingContext(screen) : null, null, 55), new Overlay$$ExternalSyntheticLambda0(this, 27)), new MainPaymentView$Content$2$1((Object) this, (Continuation) (objArr4 == true ? 1 : 0), 3), 3);
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        ArcadeOffersTimelineViewModels arcadeOffersTimelineViewModels = (ArcadeOffersTimelineViewModels) mutableState.getValue();
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new MainPaymentView$Content$2$1(this, mutableState, objArr == true ? 1 : 0, 2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, arcadeOffersTimelineViewModels, (Function2) rememberedValue3);
        ApiResult apiResult = (ApiResult) collectAsState.getValue();
        if (apiResult != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, apiResult, new DotGridKt$DotGrid$3$1(15, mutableState, (MoleculePresenter) this, (Object) apiResult, (Continuation) (objArr3 == true ? 1 : 0)));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new RealMRIFactory$sign$2(flow, (Continuation) (objArr2 == true ? 1 : 0), (MoleculePresenter) this, 15));
        RealObservabilityManager realObservabilityManager = (RealObservabilityManager) this.analytics;
        OfferSheetKey offerSheetKey2 = offersScreen$OffersTimelineScreen.offerSheetKey;
        ComposeHelpersKt composeHelpersKt = offerSheetKey2.identifier_token;
        String str3 = "";
        if (composeHelpersKt != null) {
            OfferSheetKey$IdentifierToken$OfferToken offerSheetKey$IdentifierToken$OfferToken = composeHelpersKt instanceof OfferSheetKey$IdentifierToken$OfferToken ? (OfferSheetKey$IdentifierToken$OfferToken) composeHelpersKt : null;
            str = offerSheetKey$IdentifierToken$OfferToken != null ? offerSheetKey$IdentifierToken$OfferToken.value : null;
        }
        str = "";
        Pair pair = new Pair("offer_token", str);
        if (composeHelpersKt != null) {
            OfferSheetKey$IdentifierToken$MerchantToken offerSheetKey$IdentifierToken$MerchantToken = composeHelpersKt instanceof OfferSheetKey$IdentifierToken$MerchantToken ? (OfferSheetKey$IdentifierToken$MerchantToken) composeHelpersKt : null;
            str2 = offerSheetKey$IdentifierToken$MerchantToken != null ? offerSheetKey$IdentifierToken$MerchantToken.value : null;
        }
        str2 = "";
        Pair pair2 = new Pair("merchant_token", str2);
        OfferType offerType = offerSheetKey2.offer_type;
        if (offerType != null && (name = offerType.name()) != null) {
            str3 = name;
        }
        DragAndDrop_androidKt.AddViewAttributes(realObservabilityManager, MapsKt__MapsKt.mapOf(pair, pair2, new Pair("offer_type", str3)), gapComposer, 0);
        ArcadeOffersTimelineViewModels arcadeOffersTimelineViewModels2 = (ArcadeOffersTimelineViewModels) mutableState.getValue();
        gapComposer.end(false);
        return arcadeOffersTimelineViewModels2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    private final Object models$com$squareup$cash$pools$presenters$PoolInvitePeopleListPresenter(Flow flow, Composer composer, int i) {
        Object navHostKt$NavHost$33$1;
        MutableState mutableState;
        Object[] objArr;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        ?? r14;
        MutableState mutableState5;
        MutableState mutableState6;
        GapComposer gapComposer;
        Object loaded;
        PoolInvitePeopleListScreen poolInvitePeopleListScreen = (PoolInvitePeopleListScreen) this.flowToken;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-55186354);
        Object rememberedValue = gapComposer2.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default("");
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState7 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState8 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState9 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState10 = (MutableState) rememberedValue4;
        boolean changed = gapComposer2.changed((String) mutableState7.getValue());
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (changed || rememberedValue5 == obj) {
            rememberedValue5 = new CashQrScannerPresenter$special$$inlined$filter$1(RealRecipientRepository.search$default((RealRecipientRepository) this.sessionManager, (String) mutableState7.getValue(), null, null, null, null, 14226), 4);
            gapComposer2.updateRememberedValue(rememberedValue5);
        }
        Flow flow2 = (Flow) rememberedValue5;
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        MutableState collectAsState = Updater.collectAsState(flow2, smallPersistentVector, null, gapComposer2, 48, 2);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(smallPersistentVector);
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState11 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Updater.mutableStateOf$default(poolInvitePeopleListScreen.alreadyAddedCustomerTokens);
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState12 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState13 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer2.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer2.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState14 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer2.rememberedValue();
        if (rememberedValue10 == obj) {
            rememberedValue10 = ((ModifiablePermissions) this.moneyFormatter).granted();
            gapComposer2.updateRememberedValue(rememberedValue10);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue10, Boolean.FALSE, null, gapComposer2, 48, 2);
        int i2 = 1;
        if (((List) collectAsState.getValue()).isEmpty()) {
            gapComposer2.startReplaceGroup(917537364);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(917151042);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer2.changedInstance(this) | gapComposer2.changed(collectAsState);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue11 == obj) {
                rememberedValue11 = new NotificationActionService$onHandleIntent$1(this, collectAsState, continuation, i2);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue11);
            gapComposer2.end(false);
        }
        Object[] objArr2 = {(String) mutableState7.getValue(), (List) mutableState10.getValue(), (List) collectAsState.getValue(), (List) mutableState12.getValue()};
        boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changed(collectAsState);
        Object rememberedValue12 = gapComposer2.rememberedValue();
        if (changedInstance2 || rememberedValue12 == obj) {
            mutableState = mutableState10;
            objArr = objArr2;
            mutableState2 = collectAsState;
            GapComposer gapComposer3 = gapComposer2;
            mutableState3 = mutableState11;
            mutableState4 = mutableState9;
            r14 = 0;
            mutableState5 = mutableState12;
            navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1((Object) this, (Object) mutableState8, (Object) mutableState2, (Object) mutableState, (Object) mutableState5, (Object) mutableState3, (Continuation) null, 14);
            mutableState6 = mutableState8;
            gapComposer3.updateRememberedValue(navHostKt$NavHost$33$1);
            gapComposer = gapComposer3;
        } else {
            mutableState6 = mutableState8;
            navHostKt$NavHost$33$1 = rememberedValue12;
            mutableState3 = mutableState11;
            mutableState4 = mutableState9;
            r14 = 0;
            mutableState5 = mutableState12;
            objArr = objArr2;
            mutableState = mutableState10;
            mutableState2 = collectAsState;
            gapComposer = gapComposer2;
        }
        Updater.LaunchedEffect(objArr, (Function2) navHostKt$NavHost$33$1, gapComposer);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj) {
            rememberedValue13 = FlowKt.debounce(new FinishSetupTileBadgeCounter(23, flow, Reflection.factory.getOrCreateKotlinClass(PoolInvitePeopleListViewEvent.SearchTermChanged.class)), 300L);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        Flow flow3 = (Flow) rememberedValue13;
        Updater.LaunchedEffect(gapComposer, flow3, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(r14, mutableState7, null, flow3));
        MutableState mutableState15 = mutableState3;
        MutableState mutableState16 = mutableState5;
        Updater.LaunchedEffect(gapComposer, flow, new SessionWorkerKt$runSession$4$1(flow, (Continuation) null, this, mutableState2, mutableState, mutableState16, mutableState15, mutableState4, mutableState14, mutableState13, 10));
        if (((Boolean) mutableState6.getValue()).booleanValue()) {
            loaded = PoolInvitePeopleListViewModel.Loading.INSTANCE;
        } else {
            loaded = new PoolInvitePeopleListViewModel.Loaded((AbstractPersistentList) mutableState15.getValue(), (String) mutableState7.getValue(), (InviteMemberSnackBarViewModel) mutableState4.getValue(), (poolInvitePeopleListScreen.shareUrl == null || ((String) mutableState7.getValue()).length() != 0) ? r14 : true, (((Boolean) collectAsState2.getValue()).booleanValue() || ((String) mutableState7.getValue()).length() != 0) ? r14 : true);
        }
        gapComposer.end(r14);
        return loaded;
    }

    private final Object models$com$squareup$cash$profile$presenters$personal$ArcadeAutofillSettingsDetailPresenter(Flow flow, Composer composer, int i) {
        Object content;
        AutofillCombinedInfo autofillCombinedInfo = (AutofillCombinedInfo) this.flowToken;
        ArcadeAutofillSettingsScreen arcadeAutofillSettingsScreen = (ArcadeAutofillSettingsScreen) this.moneyFormatter;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1158611020);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(autofillCombinedInfo);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        AutofillState.Loaded loaded = AutofillState.Loaded.INSTANCE;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(loaded);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = ((SyncValueReader) this.repository).getSingleValueOrDefault(AndroidSyncValueSpecs.CommerceBrowserAutofillPreferences, Boolean.TRUE, new OpenSourceKt$$ExternalSyntheticLambda8(5));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            Boolean bool = (Boolean) collectAsState.getValue();
            bool.getClass();
            rememberedValue5 = Updater.mutableStateOf$default(bool);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState4 = (MutableState) rememberedValue5;
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, mutableState, mutableState3, mutableState2, mutableState4, 24));
        AutofillState autofillState = (AutofillState) mutableState2.getValue();
        if (Intrinsics.areEqual(autofillState, AutofillState.Loading.INSTANCE)) {
            content = ArcadeAutofillSettingsDetailViewModel.LoadingViewModel.INSTANCE;
        } else if (Intrinsics.areEqual(autofillState, AutofillState.Success.INSTANCE)) {
            content = new ArcadeAutofillSettingsDetailViewModel.SuccessViewModel(androidStringManager.get(R.string.edit_autofill_success_message));
        } else if (autofillState instanceof AutofillState.Error) {
            RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator = (RealAutofillNetworkFailureMessageGenerator) this.localeAssetProvider;
            AutofillState autofillState2 = (AutofillState) mutableState2.getValue();
            autofillState2.getClass();
            Pair submitErrorMessaging = realAutofillNetworkFailureMessageGenerator.getSubmitErrorMessaging(arcadeAutofillSettingsScreen, ((AutofillState.Error) autofillState2).result);
            content = new ArcadeAutofillSettingsDetailViewModel.ErrorViewModel((String) submitErrorMessaging.first, (String) submitErrorMessaging.second, androidStringManager.get(R.string.ok));
        } else {
            if (!Intrinsics.areEqual(autofillState, loaded)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ArrayList inputFields = InputViewModelExtKt.getInputFields((AutofillCombinedInfo) mutableState.getValue(), androidStringManager);
            boolean allValid = InputViewModelExtKt.allValid(inputFields);
            content = new ArcadeAutofillSettingsDetailViewModel.Content(arcadeAutofillSettingsScreen.shippingAddressId == null ? androidStringManager.get(R.string.shopping_autofill_settings_title_add_address) : androidStringManager.get(R.string.shopping_autofill_settings_title_edit_address), androidStringManager.get(R.string.autofill_settings_footer), null, ((Boolean) mutableState4.getValue()).booleanValue(), androidStringManager.get(R.string.save), allValid && !Intrinsics.areEqual((AutofillCombinedInfo) mutableState.getValue(), autofillCombinedInfo), inputFields, ((Boolean) mutableState3.getValue()).booleanValue() ? new DialogViewModel(androidStringManager.get(R.string.unsaved_changes_dialog_title), androidStringManager.get(R.string.unsaved_changes_dialog_body), androidStringManager.get(R.string.discard), androidStringManager.get(R.string.cancel)) : null);
        }
        gapComposer.end(false);
        return content;
    }

    private final Object models$com$squareup$cash$savings$applets$presenters$SavingsAppletTilePresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(348959924);
        VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) this.navigator;
        verifyCheckDialogPresenter.getClass();
        gapComposer.startReplaceGroup(-1613152821);
        boolean changed = gapComposer.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer, 0, 2).getValue();
        int i2 = 0;
        gapComposer.end(false);
        boolean changed2 = gapComposer.changed(promotedAppletTileViewModel);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((RealSavingsAppletTileRepository) this.repository).savingsModelState, ((RealFamilyProfileManager) this.dateFormatManager).familyProfile, new FlowExtensionsKt$doOnFirst$2(this, promotedAppletTileViewModel, continuation, 5), i2);
            gapComposer.updateRememberedValue(flowKt__ZipKt$combine$$inlined$unsafeFlow$1);
            rememberedValue2 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, new SavingsAppletTileViewModel.Loading((String) this.flowToken), null, gapComposer, 0, 2);
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, Updater.rememberUpdatedState((SavingsAppletTileViewModel) collectAsState.getValue(), gapComposer), 15));
        SavingsAppletTileViewModel savingsAppletTileViewModel = (SavingsAppletTileViewModel) collectAsState.getValue();
        gapComposer.end(false);
        return savingsAppletTileViewModel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object models$com$squareup$cash$support$chat$presenters$ChatExitPromptSheetPresenter(Flow flow, Composer composer, int i) {
        Object survey;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(10511925);
        Object rememberedValue = gapComposer.rememberedValue();
        ChatExitPromptSheetState.Prompt prompt = ChatExitPromptSheetState.Prompt.INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(prompt);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(ChatSurveyViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new ChatInputView$Content$1$1$1(this, continuation, 14);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new RealSandboxer$$ExternalSyntheticLambda0(this, 23);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.DisposableEffect(unit, (Function1) rememberedValue4, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (Object) this, mutableState, mutableState2, 26));
        ChatExitPromptSheetState chatExitPromptSheetState = (ChatExitPromptSheetState) mutableState.getValue();
        if (Intrinsics.areEqual(chatExitPromptSheetState, prompt)) {
            AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
            String str = (String) ((Lazy) this.flowToken).getValue();
            switch (str.hashCode()) {
                case 92911885:
                    if (str.equals("alt-1")) {
                        survey = new ChatExitPromptSheetViewModel.Prompt(androidStringManager.get(R.string.chat_exit_sheet_title_alt), androidStringManager.get(R.string.chat_exit_sheet_subtitle_alt_one), androidStringManager.get(R.string.chat_exit_sheet_keep_chat_open_button_text), androidStringManager.get(R.string.chat_exit_sheet_end_chat_button_text));
                        break;
                    }
                    survey = new ChatExitPromptSheetViewModel.Prompt(androidStringManager.get(R.string.chat_exit_sheet_title_control), androidStringManager.get(R.string.chat_exit_sheet_subtitle_control), androidStringManager.get(R.string.chat_exit_sheet_save_conversation_button_text), androidStringManager.get(R.string.chat_exit_sheet_end_conversation_button_text));
                    break;
                case 92911886:
                    if (str.equals("alt-2")) {
                        survey = new ChatExitPromptSheetViewModel.Prompt(androidStringManager.get(R.string.chat_exit_sheet_title_alt), androidStringManager.get(R.string.chat_exit_sheet_subtitle_alt_two), androidStringManager.get(R.string.chat_exit_sheet_keep_chat_open_button_text), androidStringManager.get(R.string.chat_exit_sheet_end_chat_button_text));
                        break;
                    }
                    survey = new ChatExitPromptSheetViewModel.Prompt(androidStringManager.get(R.string.chat_exit_sheet_title_control), androidStringManager.get(R.string.chat_exit_sheet_subtitle_control), androidStringManager.get(R.string.chat_exit_sheet_save_conversation_button_text), androidStringManager.get(R.string.chat_exit_sheet_end_conversation_button_text));
                    break;
                case 951543133:
                    if (str.equals("control")) {
                        survey = new ChatExitPromptSheetViewModel.Prompt(androidStringManager.get(R.string.chat_exit_sheet_title_control), androidStringManager.get(R.string.chat_exit_sheet_subtitle_control), androidStringManager.get(R.string.chat_exit_sheet_save_conversation_button_text), androidStringManager.get(R.string.chat_exit_sheet_end_conversation_button_text));
                        break;
                    }
                    survey = new ChatExitPromptSheetViewModel.Prompt(androidStringManager.get(R.string.chat_exit_sheet_title_control), androidStringManager.get(R.string.chat_exit_sheet_subtitle_control), androidStringManager.get(R.string.chat_exit_sheet_save_conversation_button_text), androidStringManager.get(R.string.chat_exit_sheet_end_conversation_button_text));
                    break;
                default:
                    survey = new ChatExitPromptSheetViewModel.Prompt(androidStringManager.get(R.string.chat_exit_sheet_title_control), androidStringManager.get(R.string.chat_exit_sheet_subtitle_control), androidStringManager.get(R.string.chat_exit_sheet_save_conversation_button_text), androidStringManager.get(R.string.chat_exit_sheet_end_conversation_button_text));
                    break;
            }
        } else if (Intrinsics.areEqual(chatExitPromptSheetState, ChatExitPromptSheetState.Loading.INSTANCE)) {
            survey = ChatExitPromptSheetViewModel.Loading.INSTANCE;
        } else {
            if (!(chatExitPromptSheetState instanceof ChatExitPromptSheetState.ShowSurvey)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            survey = new ChatExitPromptSheetViewModel.Survey(((ChatExitPromptSheetState.ShowSurvey) chatExitPromptSheetState).surveyToken, (ChatSurveyViewModel) mutableState2.getValue());
        }
        gapComposer.end(false);
        return survey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0170, code lost:
    
        if (r13 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$transfers$presenters$RecurringReloadOptionPresenter(Flow flow, Composer composer, int i) {
        Object obj;
        String str;
        RecurringReloadOptionViewModel recurringReloadOptionViewModel;
        Money money;
        String format2;
        Money money2;
        String str2;
        RecurringReloadOptionViewModel.SettingRow settingRow;
        Money money3;
        String format3;
        Integer num;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.moneyFormatter;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(785627426);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppPresenter$models$1$1(flow, (Continuation) null, this, (CoroutineScope) rememberedValue, 24));
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealInstrumentManager) this.dateFormatManager).forType(CashInstrumentType.DEBIT_CARD);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, EmptyList.INSTANCE, null, gapComposer, 48, 2);
        boolean changed = gapComposer.changed((List) collectAsState.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            Iterator it = ((List) collectAsState.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Instrument) obj).defaultForInstrumentType) {
                    break;
                }
            }
            Instrument instrument = (Instrument) obj;
            if (instrument != null) {
                InstrumentIcon instrumentIcon$default = GoogleMapKt.instrumentIcon$default(instrument, null, InstrumentIcon.IconShape.CARD, 5);
                String str3 = instrument.displayNameCompact;
                if (str3 == null) {
                    str3 = "";
                }
                rememberedValue3 = new InstrumentCellViewModel(str3, null, true, CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default), InstrumentCellViewModel.Accessory.Info.INSTANCE, null, androidStringManager.get(R.string.recurring_reload_option_from), null, null, 416);
            } else {
                rememberedValue3 = null;
            }
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) rememberedValue3;
        int ordinal = ((RecurringReloadOptionScreen) this.localeAssetProvider).f1216type.ordinal();
        if (ordinal == 0) {
            gapComposer.startReplaceGroup(-926203928);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = ((RealBalanceBasedAddCashManager) this.sessionManager).preferences();
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2).getValue();
            BalanceBasedAddCashPreference.State state = balanceBasedAddCashPreference != null ? balanceBasedAddCashPreference.state : null;
            BalanceBasedAddCashPreference.State.Enabled enabled = state instanceof BalanceBasedAddCashPreference.State.Enabled ? (BalanceBasedAddCashPreference.State.Enabled) state : null;
            String str4 = androidStringManager.get(R.string.recurring_reload_option_default_value);
            String str5 = androidStringManager.get(R.string.recurring_reload_option_balance_based_title);
            String str6 = androidStringManager.get(R.string.recurring_reload_option_balance_based_description);
            String str7 = androidStringManager.get(R.string.recurring_reload_option_balance_based_toggle_label);
            String str8 = androidStringManager.get(R.string.recurring_reload_option_turn_off);
            String str9 = androidStringManager.get(R.string.recurring_reload_option_minimum_balance);
            if (enabled == null || (money2 = enabled.minimumBalance) == null || (str = moneyFormatter.format(money2)) == null) {
                str = str4;
            }
            RecurringReloadOptionViewModel.SettingRow settingRow2 = new RecurringReloadOptionViewModel.SettingRow(str9, str);
            String str10 = androidStringManager.get(R.string.recurring_reload_option_increment_amount);
            if (enabled != null && (money = enabled.incrementAmount) != null && (format2 = moneyFormatter.format(money)) != null) {
                str4 = format2;
            }
            RecurringReloadOptionViewModel recurringReloadOptionViewModel2 = new RecurringReloadOptionViewModel(str5, str6, str7, str8, new RecurringReloadOptionViewModel.Settings.BalanceBased(settingRow2, new RecurringReloadOptionViewModel.SettingRow(str10, str4), instrumentCellViewModel));
            gapComposer.end(false);
            recurringReloadOptionViewModel = recurringReloadOptionViewModel2;
        } else {
            if (ordinal != 1) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -926205499, false);
            }
            gapComposer.startReplaceGroup(-926201723);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = ((RealScheduledReloadsManager) ((ScheduledReloadsManager) this.repository)).preferences();
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            ScheduledReloadsPreference scheduledReloadsPreference = (ScheduledReloadsPreference) Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2).getValue();
            ScheduledReloadsPreference.State state2 = scheduledReloadsPreference != null ? scheduledReloadsPreference.state : null;
            ScheduledReloadsPreference.State.Enabled enabled2 = state2 instanceof ScheduledReloadsPreference.State.Enabled ? (ScheduledReloadsPreference.State.Enabled) state2 : null;
            String str11 = androidStringManager.get(R.string.recurring_reload_option_default_value);
            RecurringSchedule recurringSchedule = enabled2 != null ? enabled2.recurringSchedule : null;
            String str12 = androidStringManager.get(R.string.recurring_reload_option_scheduled_title);
            String str13 = androidStringManager.get(R.string.recurring_reload_option_scheduled_description);
            String str14 = androidStringManager.get(R.string.recurring_reload_option_scheduled_toggle_label);
            String str15 = androidStringManager.get(R.string.recurring_reload_option_turn_off);
            String str16 = androidStringManager.get(R.string.recurring_reload_option_every);
            if (recurringSchedule != null) {
                int ordinal2 = recurringSchedule.frequency.ordinal();
                if (ordinal2 == 0) {
                    str2 = androidStringManager.get(R.string.recurring_reload_option_frequency_day);
                } else if (ordinal2 == 1) {
                    str2 = androidStringManager.get(R.string.recurring_reload_option_frequency_week);
                } else {
                    if (ordinal2 == 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("EVERY_TWO_WEEKS is not a supported frequency");
                        return null;
                    }
                    if (ordinal2 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str2 = androidStringManager.get(R.string.recurring_reload_option_frequency_month);
                }
            }
            str2 = str11;
            RecurringReloadOptionViewModel.SettingRow settingRow3 = new RecurringReloadOptionViewModel.SettingRow(str16, str2);
            if (recurringSchedule != null && (num = (Integer) CollectionsKt.firstOrNull(recurringSchedule.daysOfPeriod)) != null) {
                int intValue = num.intValue();
                int ordinal3 = recurringSchedule.frequency.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        String str17 = androidStringManager.get(R.string.recurring_reload_option_on);
                        String displayName = DayOfWeek.of(intValue).getDisplayName(TextStyle.FULL, Locale.getDefault());
                        displayName.getClass();
                        settingRow = new RecurringReloadOptionViewModel.SettingRow(str17, displayName);
                    } else {
                        if (ordinal3 == 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("EVERY_TWO_WEEKS is not a supported frequency");
                            return null;
                        }
                        if (ordinal3 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        settingRow = new RecurringReloadOptionViewModel.SettingRow(androidStringManager.get(R.string.recurring_reload_option_on_the), AndroidStringManager.getOrdinal(intValue));
                    }
                    String str18 = androidStringManager.get(R.string.recurring_reload_option_add);
                    if (enabled2 != null && (money3 = enabled2.amount) != null && (format3 = moneyFormatter.format(money3)) != null) {
                        str11 = format3;
                    }
                    recurringReloadOptionViewModel = new RecurringReloadOptionViewModel(str12, str13, str14, str15, new RecurringReloadOptionViewModel.Settings.Scheduled(settingRow3, settingRow, new RecurringReloadOptionViewModel.SettingRow(str18, str11), instrumentCellViewModel));
                    gapComposer.end(false);
                }
            }
            settingRow = null;
            String str182 = androidStringManager.get(R.string.recurring_reload_option_add);
            if (enabled2 != null) {
                str11 = format3;
            }
            recurringReloadOptionViewModel = new RecurringReloadOptionViewModel(str12, str13, str14, str15, new RecurringReloadOptionViewModel.Settings.Scheduled(settingRow3, settingRow, new RecurringReloadOptionViewModel.SettingRow(str182, str11), instrumentCellViewModel));
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return recurringReloadOptionViewModel;
    }

    public Map getDefaultRetroAnalyticsParams() {
        return MapsKt__MapsKt.mapOf(new Pair(AnalyticsEvent.ParamType.ORIGIN, "AFTERPAY_APPLET"), new Pair(AnalyticsEvent.ParamType.FROM_SCREEN, "RETRO_ORDER_SELECTION"), new Pair(AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN, ((AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen) this.sessionManager).referrerFlowToken));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        int i = this.$r8$classId;
        Object obj = this.localeAssetProvider;
        switch (i) {
            case 1:
                return (ErrorReporter) obj;
            case 6:
                return (ErrorReporter) this.args;
            default:
                return (ErrorReporter) obj;
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        int i = this.$r8$classId;
        Object obj = this.args;
        switch (i) {
            case 1:
                return (SampleStrategy) obj;
            case 6:
                return (SampleStrategy) this.moneyFormatter;
            default:
                return (SampleStrategy) obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03bc A[LOOP:2: B:124:0x03b6->B:126:0x03bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0401 A[LOOP:3: B:129:0x03fb->B:131:0x0401, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        ?? r15;
        Object content;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        ButtonOrder buttonOrder;
        Continuation continuation;
        String str5;
        PhysicalDepositAddressEntryViewModel physicalDepositAddressEntryViewModel;
        Object inviteContactsPresenter$special$$inlined$map$1;
        Object realPayDataLoader$fetchData$1;
        Boolean bool;
        MutableState mutableState3;
        MutableState mutableState4;
        String str6;
        Iterator it;
        Iterator it2;
        Object obj;
        LocationScopedClockInControls locationScopedClockInControls;
        ClockInEnabledResult clockInEnabledForLocationResult;
        Instant instant;
        Instant instant2;
        String str7;
        String str8;
        GeofenceStateResolver.GeofenceAction geofenceAction;
        ClockInBottomSheetViewModel.ReasonAction reasonAction;
        ClockInBottomSheetViewModel.ReasonAction requestLocationPermission;
        String str9;
        ArrayList arrayList;
        String str10;
        int i2 = this.$r8$classId;
        Object obj2 = this.stringManager;
        int i3 = 13;
        int i4 = 11;
        Object obj3 = this.localeAssetProvider;
        Object obj4 = this.sessionManager;
        int i5 = 4;
        Object obj5 = this.flowToken;
        int i6 = 8;
        Object obj6 = this.args;
        Object obj7 = this.dateFormatManager;
        Object obj8 = Composer.Companion.Empty;
        Continuation continuation2 = null;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(708014267);
                Object[] objArr = new Object[0];
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj8) {
                    rememberedValue = new DateScrubber$$ExternalSyntheticLambda0(5);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState5 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj8) {
                    rememberedValue2 = Updater.mutableStateOf$default(new PoolsListViewModel.Loading((PoolCategory) mutableState5.getValue()));
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState6 = (MutableState) rememberedValue2;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(mutableState5);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == obj8) {
                    mutableState = mutableState6;
                    Object dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) this, mutableState5, mutableState, (Continuation) null, 26);
                    gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
                    rememberedValue3 = dotGridKt$DotGrid$3$1;
                } else {
                    mutableState = mutableState6;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                MutableState mutableState7 = mutableState;
                Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (Object) this, mutableState7, mutableState5, 12));
                PoolsListViewModel poolsListViewModel = (PoolsListViewModel) mutableState7.getValue();
                gapComposer.end(false);
                return poolsListViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(976894965);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == obj8) {
                    rememberedValue4 = Updater.mutableStateOf$default(AfterpayAppletRetroOrderSelectionViewModel.Loading.INSTANCE);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState8 = (MutableState) rememberedValue4;
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Continuation continuation3 = null;
                if (changedInstance2 || rememberedValue5 == obj8) {
                    rememberedValue5 = new AfterpayAppletRetroOrderSelectionPresenter$models$1$1(this, mutableState8, continuation3, 0);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue5);
                Updater.LaunchedEffect(gapComposer2, flow, new BenefitsHubPresenter$models$1$1(4, mutableState8, flow, this, continuation3));
                AfterpayAppletRetroOrderSelectionViewModel afterpayAppletRetroOrderSelectionViewModel = (AfterpayAppletRetroOrderSelectionViewModel) mutableState8.getValue();
                boolean changedInstance3 = gapComposer2.changedInstance(this);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue6 == obj8) {
                    rememberedValue6 = new SearchBarBinding$Content$1$1(this, mutableState8, continuation3, i3);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(gapComposer2, afterpayAppletRetroOrderSelectionViewModel, (Function2) rememberedValue6);
                AfterpayAppletRetroOrderSelectionViewModel afterpayAppletRetroOrderSelectionViewModel2 = (AfterpayAppletRetroOrderSelectionViewModel) mutableState8.getValue();
                gapComposer2.end(false);
                return afterpayAppletRetroOrderSelectionViewModel2;
            case 2:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj2;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(234153210);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                Continuation continuation4 = null;
                if (rememberedValue7 == obj8) {
                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj6;
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) markwonConfiguration.theme;
                    SyncValueType syncValueType = SyncValueType.CRYPTO_WALLET;
                    InstrumentQueries instrumentQueries = (InstrumentQueries) markwonConfiguration.spansFactory;
                    CashInstrumentType cashInstrumentType = CashInstrumentType.CASH_BALANCE;
                    CurrencyCode currencyCode = CurrencyCode.BTC;
                    instrumentQueries.getClass();
                    cashInstrumentType.getClass();
                    InstrumentQueries$walletAddressForCurrency$2 instrumentQueries$walletAddressForCurrency$2 = InstrumentQueries$walletAddressForCurrency$2.INSTANCE;
                    rememberedValue7 = Trace.selectClientSyncValues(featureFlagManager, syncValueType, new RealGooglePayer$createWallet$$inlined$filter$1(StateFlowKt.runUntil(DBUtil.mapToOneOrNull(DBUtil.toFlow(new BadgeQueries$VersionQuery(instrumentQueries, cashInstrumentType, currencyCode, new InstrumentQueries$$ExternalSyntheticLambda2(0, false), 2)), (CoroutineContext) markwonConfiguration.linkResolver), (Signal) markwonConfiguration.imageDestinationProcessor), 6), ((SyncValueReader) markwonConfiguration.syntaxHighlight).getFirstValueOrDefault(AndroidSyncValueSpecs.CryptoWallet, null, new FlowStarter$$ExternalSyntheticLambda0(14)));
                    gapComposer3.updateRememberedValue(rememberedValue7);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer3, 48, 2);
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (rememberedValue8 == obj8) {
                    Object cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealProfileManager) obj7).publicProfile(), i6);
                    gapComposer3.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                    rememberedValue8 = cardModelView$cardHeat$$inlined$map$1;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer3, 48, 2);
                Object rememberedValue9 = gapComposer3.rememberedValue();
                if (rememberedValue9 == obj8) {
                    rememberedValue9 = Updater.mutableStateOf$default(new QrCodeModel((String) null, 4, true));
                    gapComposer3.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState9 = (MutableState) rememberedValue9;
                Object rememberedValue10 = gapComposer3.rememberedValue();
                if (rememberedValue10 == obj8) {
                    rememberedValue10 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState10 = (MutableState) rememberedValue10;
                Object rememberedValue11 = gapComposer3.rememberedValue();
                if (rememberedValue11 == obj8) {
                    rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState11 = (MutableState) rememberedValue11;
                CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress = (CryptoAddress$BitcoinAddress) collectAsState.getValue();
                boolean changed = gapComposer3.changed(collectAsState) | gapComposer3.changedInstance(this);
                Object rememberedValue12 = gapComposer3.rememberedValue();
                if (changed || rememberedValue12 == obj8) {
                    Object toastKt$Toast$9$1 = new ToastKt$Toast$9$1(this, collectAsState, mutableState11, continuation4, 29);
                    mutableState2 = mutableState11;
                    r15 = 0;
                    gapComposer3.updateRememberedValue(toastKt$Toast$9$1);
                    rememberedValue12 = toastKt$Toast$9$1;
                } else {
                    mutableState2 = mutableState11;
                    r15 = 0;
                }
                Updater.LaunchedEffect(gapComposer3, cryptoAddress$BitcoinAddress, (Function2) rememberedValue12);
                Updater.LaunchedEffect(gapComposer3, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, collectAsState, mutableState10, 10));
                CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress2 = (CryptoAddress$BitcoinAddress) collectAsState.getValue();
                String str11 = (String) collectAsState2.getValue();
                int i7 = R.string.bitcoin_address_copy;
                if (cryptoAddress$BitcoinAddress2 != null && str11 != null) {
                    gapComposer3.startReplaceGroup(632652883);
                    RealQrCodesPresenter realQrCodesPresenter = (RealQrCodesPresenter) obj3;
                    QrCodeArgs qrCodeArgs = new QrCodeArgs((Integer) null, (Integer) 50672, (Integer) null, (Integer) null, CurrencyCode.BTC, 0, 104);
                    Uri parse = Uri.parse(str11);
                    String m = Recorder$$ExternalSyntheticOutline2.m(parse.getHost(), "/qr/btc/", cryptoAddress$BitcoinAddress2.address);
                    String scheme = parse.getScheme();
                    if (!StringsKt__StringsJVMKt.startsWith(m, "api.", false)) {
                        m = "api.".concat(m);
                    }
                    mutableState9.setValue(realQrCodesPresenter.models(qrCodeArgs, Recorder$$ExternalSyntheticOutline2.m(scheme, "://", m), gapComposer3, 0));
                    CryptoAddress$BitcoinAddress cryptoAddress$BitcoinAddress3 = (CryptoAddress$BitcoinAddress) collectAsState.getValue();
                    if (((Boolean) mutableState10.getValue()).booleanValue()) {
                        i7 = R.string.bitcoin_address_copied;
                    }
                    content = new WalletAddressOptionsViewModel.Content(cryptoAddress$BitcoinAddress3, androidStringManager.get(i7), (QrCodeModel) mutableState9.getValue());
                    z = false;
                    gapComposer3.end(false);
                } else if (cryptoAddress$BitcoinAddress2 == null && ((Boolean) mutableState2.getValue()).booleanValue()) {
                    gapComposer3.startReplaceGroup(633366038);
                    content = new WalletAddressOptionsViewModel.Error(androidStringManager.get(R.string.bitcoin_address_copy_error_title), androidStringManager.get(R.string.bitcoin_address_error_message));
                    z = false;
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(633629352);
                    gapComposer3.end(false);
                    if (((Boolean) mutableState10.getValue()).booleanValue()) {
                        i7 = R.string.bitcoin_address_copied;
                    }
                    content = new WalletAddressOptionsViewModel.Content(r15, androidStringManager.get(i7), new QrCodeModel((String) r15, 4, true));
                    z = false;
                }
                gapComposer3.end(z);
                return content;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1867929758);
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer4.changedInstance(this);
                Object rememberedValue13 = gapComposer4.rememberedValue();
                if (changedInstance4 || rememberedValue13 == obj8) {
                    rememberedValue13 = new InteractiveCardView$flingTo$1.AnonymousClass2(this, null, i6);
                    gapComposer4.updateRememberedValue(rememberedValue13);
                }
                Updater.LaunchedEffect(gapComposer4, unit3, (Function2) rememberedValue13);
                Object rememberedValue14 = gapComposer4.rememberedValue();
                if (rememberedValue14 == obj8) {
                    BlockersScreens.InviteFriendsScreen inviteFriendsScreen = (BlockersScreens.InviteFriendsScreen) obj7;
                    if (inviteFriendsScreen.blockersData.flow == BlockersData.Flow.ONBOARDING) {
                        InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen = inviteFriendsScreen.inviteFriendsOpportunityScreen;
                        str = inviteFriendsOpportunityScreen != null ? inviteFriendsOpportunityScreen.header_text : null;
                        str2 = inviteFriendsOpportunityScreen != null ? inviteFriendsOpportunityScreen.body_text : null;
                        str3 = inviteFriendsOpportunityScreen != null ? inviteFriendsOpportunityScreen.skip_button_text : null;
                        str4 = inviteFriendsOpportunityScreen != null ? inviteFriendsOpportunityScreen.continue_button_text : null;
                        InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = inviteFriendsOpportunityScreen != null ? inviteFriendsOpportunityScreen.button_order : null;
                        buttonOrder = (inviteFriendsBlockerButtonOrder != null ? InviteFriendsPresenterKt$WhenMappings.$EnumSwitchMapping$0[inviteFriendsBlockerButtonOrder.ordinal()] : -1) == 1 ? ButtonOrder.PRIMARY_BUTTON_FIRST : ButtonOrder.SECONDARY_BUTTON_FIRST;
                    } else {
                        ContactAccessPreparationScreen contactAccessPreparationScreen = inviteFriendsScreen.contactAccessPreparationScreen;
                        str = contactAccessPreparationScreen != null ? contactAccessPreparationScreen.header_text : null;
                        str2 = contactAccessPreparationScreen != null ? contactAccessPreparationScreen.body_text : null;
                        str3 = contactAccessPreparationScreen != null ? contactAccessPreparationScreen.skip_button_text : null;
                        str4 = contactAccessPreparationScreen != null ? contactAccessPreparationScreen.continue_button_text : null;
                        InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder2 = contactAccessPreparationScreen != null ? contactAccessPreparationScreen.button_order : null;
                        buttonOrder = (inviteFriendsBlockerButtonOrder2 != null ? InviteFriendsPresenterKt$WhenMappings.$EnumSwitchMapping$0[inviteFriendsBlockerButtonOrder2.ordinal()] : -1) == 1 ? ButtonOrder.PRIMARY_BUTTON_FIRST : ButtonOrder.SECONDARY_BUTTON_FIRST;
                    }
                    String str12 = str4;
                    String str13 = str;
                    String str14 = str2;
                    if (str3 != null && str3.length() == 0) {
                        buttonOrder = ButtonOrder.SINGLE_BUTTON;
                    }
                    Object inviteFriendsViewModel = new InviteFriendsViewModel(str3, str12, str13, str14, buttonOrder);
                    gapComposer4.updateRememberedValue(inviteFriendsViewModel);
                    rememberedValue14 = inviteFriendsViewModel;
                }
                InviteFriendsViewModel inviteFriendsViewModel2 = (InviteFriendsViewModel) rememberedValue14;
                Updater.LaunchedEffect(gapComposer4, flow, new PasscodePresenter$models$1$2(flow, (Continuation) null, this, 7));
                gapComposer4.end(false);
                return inviteFriendsViewModel2;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(468843911);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance5 = gapComposer5.changedInstance(this);
                Object rememberedValue15 = gapComposer5.rememberedValue();
                if (changedInstance5 || rememberedValue15 == obj8) {
                    rememberedValue15 = new PhysicalDepositAddressEntryPresenter$models$1$1(this, null, 0);
                    gapComposer5.updateRememberedValue(rememberedValue15);
                }
                Updater.LaunchedEffect(gapComposer5, unit4, (Function2) rememberedValue15);
                Object rememberedValue16 = gapComposer5.rememberedValue();
                if (rememberedValue16 == obj8) {
                    rememberedValue16 = FlowKt.debounce((StateFlowImpl) obj5, 300L);
                    gapComposer5.updateRememberedValue(rememberedValue16);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue16, "", null, gapComposer5, 48, 2);
                Object rememberedValue17 = gapComposer5.rememberedValue();
                if (rememberedValue17 == obj8) {
                    rememberedValue17 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue17);
                }
                MutableState mutableState12 = (MutableState) rememberedValue17;
                Object rememberedValue18 = gapComposer5.rememberedValue();
                if (rememberedValue18 == obj8) {
                    EglCore eglCore = (EglCore) obj6;
                    CoroutineContext coroutineContext = (CoroutineContext) eglCore.eglDisplay;
                    TransacterImpl transacterImpl = (TransacterImpl) eglCore.eglConfig;
                    int ordinal = ((PhysicalCashDepositAddressEntryScreen.AddressSearchType) eglCore.eglContext).ordinal();
                    if (ordinal == 0) {
                        transacterImpl.getClass();
                        PhysicalDepositUsAddressSearchQueries$addresses$2 physicalDepositUsAddressSearchQueries$addresses$2 = PhysicalDepositUsAddressSearchQueries$addresses$2.INSTANCE;
                        SqlDriver sqlDriver = ((PhysicalDepositUsAddressSearchQueries) transacterImpl).driver;
                        PasswordInfoQueries$$ExternalSyntheticLambda0 passwordInfoQueries$$ExternalSyntheticLambda0 = new PasswordInfoQueries$$ExternalSyntheticLambda0(19);
                        sqlDriver.getClass();
                        rememberedValue18 = new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-1776690159, new String[]{"physicalDepositUsAddressSearch"}, sqlDriver, "PhysicalDepositUsAddressSearch.sq", "addresses", "SELECT physicalDepositUsAddressSearch.identifier, physicalDepositUsAddressSearch.created_at, physicalDepositUsAddressSearch.formatted_address, physicalDepositUsAddressSearch.primary_text, physicalDepositUsAddressSearch.secondary_text, physicalDepositUsAddressSearch.latitude, physicalDepositUsAddressSearch.longitude\nFROM physicalDepositUsAddressSearch\nORDER BY created_at DESC", passwordInfoQueries$$ExternalSyntheticLambda0)), coroutineContext), i4);
                    } else if (ordinal == 1) {
                        transacterImpl.getClass();
                        AtmWithdrawalAddressSearchQueries$addresses$2 atmWithdrawalAddressSearchQueries$addresses$2 = AtmWithdrawalAddressSearchQueries$addresses$2.INSTANCE;
                        SqlDriver sqlDriver2 = ((AtmWithdrawalAddressSearchQueries) transacterImpl).driver;
                        PasswordInfoQueries$$ExternalSyntheticLambda0 passwordInfoQueries$$ExternalSyntheticLambda02 = new PasswordInfoQueries$$ExternalSyntheticLambda0(10);
                        sqlDriver2.getClass();
                        rememberedValue18 = new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(107371963, new String[]{"atmWithdrawalAddressSearch"}, sqlDriver2, "AtmWithdrawalAddressSearch.sq", "addresses", "SELECT atmWithdrawalAddressSearch.identifier, atmWithdrawalAddressSearch.created_at, atmWithdrawalAddressSearch.formatted_address, atmWithdrawalAddressSearch.primary_text, atmWithdrawalAddressSearch.secondary_text, atmWithdrawalAddressSearch.latitude, atmWithdrawalAddressSearch.longitude\nFROM atmWithdrawalAddressSearch\nORDER BY created_at DESC", passwordInfoQueries$$ExternalSyntheticLambda02)), coroutineContext), 12);
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        transacterImpl.getClass();
                        BitcoinMapAddressSearchQueries$addresses$2 bitcoinMapAddressSearchQueries$addresses$2 = BitcoinMapAddressSearchQueries$addresses$2.INSTANCE;
                        SqlDriver sqlDriver3 = ((BitcoinMapAddressSearchQueries) transacterImpl).driver;
                        PasswordInfoQueries$$ExternalSyntheticLambda0 passwordInfoQueries$$ExternalSyntheticLambda03 = new PasswordInfoQueries$$ExternalSyntheticLambda0(14);
                        sqlDriver3.getClass();
                        rememberedValue18 = new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-30376446, new String[]{"bitcoinMapAddressSearch"}, sqlDriver3, "BitcoinMapAddressSearch.sq", "addresses", "SELECT bitcoinMapAddressSearch.identifier, bitcoinMapAddressSearch.created_at, bitcoinMapAddressSearch.formatted_address, bitcoinMapAddressSearch.primary_text, bitcoinMapAddressSearch.secondary_text, bitcoinMapAddressSearch.latitude, bitcoinMapAddressSearch.longitude\nFROM bitcoinMapAddressSearch\nORDER BY created_at DESC", passwordInfoQueries$$ExternalSyntheticLambda03)), coroutineContext), i3);
                    }
                    gapComposer5.updateRememberedValue(rememberedValue18);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue18, EmptyList.INSTANCE, null, gapComposer5, 48, 2);
                String str15 = (String) collectAsState3.getValue();
                boolean changed2 = gapComposer5.changed(collectAsState3) | gapComposer5.changedInstance(this);
                Object rememberedValue19 = gapComposer5.rememberedValue();
                if (changed2 || rememberedValue19 == obj8) {
                    continuation = null;
                    rememberedValue19 = new VerifyCheckDepositPresenter$models$3$1(this, collectAsState3, mutableState12, (Continuation) null);
                    gapComposer5.updateRememberedValue(rememberedValue19);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer5, str15, (Function2) rememberedValue19);
                Updater.LaunchedEffect(gapComposer5, flow, new RealProfileManager$setPhoto$2(flow, continuation, this, 21));
                LocationSearchClient$LocationSearchResult locationSearchClient$LocationSearchResult = (LocationSearchClient$LocationSearchResult) mutableState12.getValue();
                List list = (List) collectAsState4.getValue();
                PhysicalCashDepositAddressEntryScreen physicalCashDepositAddressEntryScreen = (PhysicalCashDepositAddressEntryScreen) obj4;
                PhysicalCashDepositAddressEntryScreen.SearchScreen searchScreen = physicalCashDepositAddressEntryScreen.searchScreen;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj2;
                boolean z2 = locationSearchClient$LocationSearchResult instanceof LocationSearchClient$LocationSearchResult.Success;
                PhysicalDepositAddressEntryViewModel.Error error = (z2 && ((LocationSearchClient$LocationSearchResult.Success) locationSearchClient$LocationSearchResult).locations.isEmpty()) ? new PhysicalDepositAddressEntryViewModel.Error(androidStringManager2.get(R.string.no_results), androidStringManager2.get(R.string.no_results_description)) : locationSearchClient$LocationSearchResult instanceof LocationSearchClient$LocationSearchResult.Failure ? new PhysicalDepositAddressEntryViewModel.Error(androidStringManager2.get(R.string.search_error), androidStringManager2.get(R.string.search_error_description)) : null;
                if (error != null) {
                    physicalDepositAddressEntryViewModel = new PhysicalDepositAddressEntryViewModel(searchScreen.searchBarPlaceholder, null, error, 2);
                } else {
                    List<AddressSearch> list2 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (AddressSearch addressSearch : list2) {
                        String str16 = addressSearch.identifier;
                        String str17 = addressSearch.primary_text;
                        String str18 = addressSearch.secondary_text;
                        String str19 = addressSearch.formatted_address;
                        Double d = addressSearch.latitude;
                        d.getClass();
                        double doubleValue = d.doubleValue();
                        Double d2 = addressSearch.longitude;
                        d2.getClass();
                        arrayList2.add(new AddressSearchViewModel(str16, str17, str18, str19, doubleValue, d2.doubleValue()));
                    }
                    List list3 = z2 ? ((LocationSearchClient$LocationSearchResult.Success) locationSearchClient$LocationSearchResult).locations : EmptyList.INSTANCE;
                    boolean isEmpty = arrayList2.isEmpty();
                    boolean isEmpty2 = list3.isEmpty();
                    boolean z3 = !isEmpty2;
                    String str20 = searchScreen.searchBarPlaceholder;
                    String str21 = searchScreen.recentSectionHeaderText;
                    String str22 = searchScreen.resultSectionHeaderText;
                    int ordinal2 = physicalCashDepositAddressEntryScreen.addressSearchType.ordinal();
                    if (ordinal2 == 0) {
                        str5 = androidStringManager2.get(R.string.pmd_search_empty_title);
                    } else if (ordinal2 == 1) {
                        str5 = androidStringManager2.get(R.string.atm_search_empty_title);
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str5 = androidStringManager2.get(R.string.bitcoin_map_search_empty_title);
                    }
                    physicalDepositAddressEntryViewModel = new PhysicalDepositAddressEntryViewModel(str20, new PhysicalDepositAddressEntryViewModel.Results(str21, str22, searchScreen.explanationTitleText, str5, isEmpty2 && isEmpty, isEmpty2 && !isEmpty, z3, list3, arrayList2), null, 4);
                }
                gapComposer5.end(false);
                return physicalDepositAddressEntryViewModel;
            case 5:
                return models$com$squareup$cash$family$familyhub$presenters$SetDependentCustomLimitPresenter(flow, composer, i);
            case 6:
                return models$com$squareup$cash$instruments$presenters$TransferOptionPickerPresenter(flow, composer, i);
            case 7:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-505003220);
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer6.changedInstance(this);
                Object rememberedValue20 = gapComposer6.rememberedValue();
                if (changedInstance6 || rememberedValue20 == obj8) {
                    rememberedValue20 = new RealKeyStoreProvider$load$2(this, null, 18);
                    gapComposer6.updateRememberedValue(rememberedValue20);
                }
                Updater.LaunchedEffect(gapComposer6, unit5, (Function2) rememberedValue20);
                Object rememberedValue21 = gapComposer6.rememberedValue();
                if (rememberedValue21 == obj8) {
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.repository)).peekCurrentValue(LaunchDarklyFeatureFlags$InvestingPortfolioPerformanceSyncValue.INSTANCE)).enabled()) {
                        inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(((SyncValueReader) obj7).getAllValues(AndroidSyncValueSpecs.InvestPortfoliosPerformance), this, i5);
                    } else {
                        GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) this.moneyFormatter;
                        String str23 = ((InvestmentEntityToken) obj5).value;
                        gpsConfigQueries.getClass();
                        str23.getClass();
                        InvestmentPerformanceQueries$forEntityToken$2 investmentPerformanceQueries$forEntityToken$2 = InvestmentPerformanceQueries$forEntityToken$2.INSTANCE;
                        inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, str23, new TooltipBoxKt$$ExternalSyntheticLambda2(gpsConfigQueries, 0))), (CoroutineContext) obj3), this, 3);
                    }
                    rememberedValue21 = inviteContactsPresenter$special$$inlined$map$1;
                    gapComposer6.updateRememberedValue(rememberedValue21);
                }
                EmptyList emptyList = EmptyList.INSTANCE;
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue21, new PerformanceViewModel("", emptyList, emptyList), null, gapComposer6, 48, 2);
                Updater.LaunchedEffect(gapComposer6, flow, new InvestingHomeView$onScrollFlow$1(flow, (Continuation) null, this, i4));
                PerformanceViewModel performanceViewModel = (PerformanceViewModel) collectAsState5.getValue();
                gapComposer6.end(false);
                return performanceViewModel;
            case 8:
                return models$com$squareup$cash$offers$presenters$OffersTimelinePresenter(flow, composer, i);
            case 9:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-1456121629);
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj5;
                verifyCheckDialogPresenter.getClass();
                gapComposer7.startReplaceGroup(-1613152821);
                boolean changed3 = gapComposer7.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
                Object rememberedValue22 = gapComposer7.rememberedValue();
                if (changed3 || rememberedValue22 == obj8) {
                    rememberedValue22 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
                    gapComposer7.updateRememberedValue(rememberedValue22);
                }
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue22, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer7, 0, 2).getValue();
                gapComposer7.end(false);
                boolean changed4 = gapComposer7.changed(promotedAppletTileViewModel);
                Object rememberedValue23 = gapComposer7.rememberedValue();
                if (changed4 || rememberedValue23 == obj8) {
                    rememberedValue23 = StateFlowKt.mapState(((SyncValueReader) obj7).getSingleValue(AndroidSyncValueSpecs.PaychecksUiState), new MusicViewKt$$ExternalSyntheticLambda6(25, this, promotedAppletTileViewModel));
                    gapComposer7.updateRememberedValue(rememberedValue23);
                }
                MutableState collectAsState6 = Updater.collectAsState((StateFlow) rememberedValue23, null, gapComposer7, 1);
                Updater.LaunchedEffect(gapComposer7, flow, new MusicPresenter$models$1$1(flow, (Continuation) null, (MoleculePresenter) this, Updater.rememberUpdatedState((PaychecksAppletTileModel) collectAsState6.getValue(), gapComposer7), 28));
                PaychecksAppletTileModel paychecksAppletTileModel = (PaychecksAppletTileModel) collectAsState6.getValue();
                gapComposer7.end(false);
                return paychecksAppletTileModel;
            case 10:
                return models$com$squareup$cash$pools$presenters$PoolInvitePeopleListPresenter(flow, composer, i);
            case 11:
                return models$com$squareup$cash$profile$presenters$personal$ArcadeAutofillSettingsDetailPresenter(flow, composer, i);
            case 12:
                return models$com$squareup$cash$savings$applets$presenters$SavingsAppletTilePresenter(flow, composer, i);
            case 13:
                return models$com$squareup$cash$support$chat$presenters$ChatExitPromptSheetPresenter(flow, composer, i);
            case 14:
                return models$com$squareup$cash$transfers$presenters$RecurringReloadOptionPresenter(flow, composer, i);
            default:
                AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) obj6;
                MarkwonConfiguration markwonConfiguration2 = (MarkwonConfiguration) obj7;
                ClockInStateResolver clockInStateResolver = (ClockInStateResolver) markwonConfiguration2.linkResolver;
                RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) markwonConfiguration2.syntaxHighlight;
                ClockInBottomSheetScreen clockInBottomSheetScreen = (ClockInBottomSheetScreen) obj4;
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(866945799);
                Object rememberedValue24 = gapComposer8.rememberedValue();
                if (rememberedValue24 == obj8) {
                    rememberedValue24 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer8.updateRememberedValue(rememberedValue24);
                }
                MutableState mutableState13 = (MutableState) rememberedValue24;
                Object rememberedValue25 = gapComposer8.rememberedValue();
                if (rememberedValue25 == obj8) {
                    rememberedValue25 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer8.updateRememberedValue(rememberedValue25);
                }
                MutableState mutableState14 = (MutableState) rememberedValue25;
                Object rememberedValue26 = gapComposer8.rememberedValue();
                if (rememberedValue26 == obj8) {
                    rememberedValue26 = Updater.mutableStateOf$default(null);
                    gapComposer8.updateRememberedValue(rememberedValue26);
                }
                MutableState mutableState15 = (MutableState) rememberedValue26;
                Object rememberedValue27 = gapComposer8.rememberedValue();
                if (rememberedValue27 == obj8) {
                    clockInBottomSheetScreen.getClass();
                    LastClockedInInfo info = ((RealLastClockedInInfoUseCase) markwonConfiguration2.imageDestinationProcessor).getInfo(new MerchantIdentifier(clockInBottomSheetScreen.merchantToken), clockInBottomSheetScreen.employeeToken);
                    ArrayList arrayList3 = clockInBottomSheetScreen.jobs;
                    if (arrayList3.size() == 1) {
                        ClockInBottomSheetScreen.JobInfo jobInfo = (ClockInBottomSheetScreen.JobInfo) CollectionsKt.firstOrNull((List) arrayList3);
                        if (jobInfo != null) {
                            str9 = jobInfo.token;
                            arrayList = clockInBottomSheetScreen.locations;
                            if (arrayList.size() != 1) {
                                ClockInBottomSheetScreen.LocationInfo locationInfo = (ClockInBottomSheetScreen.LocationInfo) CollectionsKt.firstOrNull((List) arrayList);
                                if (locationInfo != null) {
                                    str10 = locationInfo.token;
                                    rememberedValue27 = new ClockInBottomSheetViewModelBuilder$InitialSelection(str9 != null ? new JobIdentifier(str9) : null, str10 != null ? new LocationIdentifier(str10) : null);
                                    gapComposer8.updateRememberedValue(rememberedValue27);
                                }
                                str10 = null;
                                rememberedValue27 = new ClockInBottomSheetViewModelBuilder$InitialSelection(str9 != null ? new JobIdentifier(str9) : null, str10 != null ? new LocationIdentifier(str10) : null);
                                gapComposer8.updateRememberedValue(rememberedValue27);
                            } else {
                                String str24 = clockInBottomSheetScreen.scheduledLocationToken;
                                if (str24 != null) {
                                    str10 = str24;
                                } else {
                                    str10 = info != null ? info.locationIdentifier.token : null;
                                    if (str10 != null && !arrayList.isEmpty()) {
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            if (Intrinsics.areEqual(((ClockInBottomSheetScreen.LocationInfo) it3.next()).token, str10)) {
                                            }
                                        }
                                    }
                                    str10 = null;
                                }
                                rememberedValue27 = new ClockInBottomSheetViewModelBuilder$InitialSelection(str9 != null ? new JobIdentifier(str9) : null, str10 != null ? new LocationIdentifier(str10) : null);
                                gapComposer8.updateRememberedValue(rememberedValue27);
                            }
                        }
                        str9 = null;
                        arrayList = clockInBottomSheetScreen.locations;
                        if (arrayList.size() != 1) {
                        }
                    } else {
                        String str25 = clockInBottomSheetScreen.scheduledJobToken;
                        if (str25 == null) {
                            str25 = info != null ? info.jobIdentifier.token : null;
                            if (str25 != null && !arrayList3.isEmpty()) {
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    if (Intrinsics.areEqual(((ClockInBottomSheetScreen.JobInfo) it4.next()).token, str25)) {
                                    }
                                }
                            }
                            str9 = null;
                            arrayList = clockInBottomSheetScreen.locations;
                            if (arrayList.size() != 1) {
                            }
                        }
                        str9 = str25;
                        arrayList = clockInBottomSheetScreen.locations;
                        if (arrayList.size() != 1) {
                        }
                    }
                }
                ClockInBottomSheetViewModelBuilder$InitialSelection clockInBottomSheetViewModelBuilder$InitialSelection = (ClockInBottomSheetViewModelBuilder$InitialSelection) rememberedValue27;
                Object rememberedValue28 = gapComposer8.rememberedValue();
                if (rememberedValue28 == obj8) {
                    rememberedValue28 = Updater.mutableStateOf$default(clockInBottomSheetViewModelBuilder$InitialSelection.jobIdentifier);
                    gapComposer8.updateRememberedValue(rememberedValue28);
                }
                MutableState mutableState16 = (MutableState) rememberedValue28;
                Object rememberedValue29 = gapComposer8.rememberedValue();
                if (rememberedValue29 == obj8) {
                    rememberedValue29 = Updater.mutableStateOf$default(clockInBottomSheetViewModelBuilder$InitialSelection.locationIdentifier);
                    gapComposer8.updateRememberedValue(rememberedValue29);
                }
                MutableState mutableState17 = (MutableState) rememberedValue29;
                Object rememberedValue30 = gapComposer8.rememberedValue();
                if (rememberedValue30 == obj8) {
                    rememberedValue30 = androidPermissionManager.create("android.permission.ACCESS_FINE_LOCATION");
                    gapComposer8.updateRememberedValue(rememberedValue30);
                }
                ModifiablePermissions modifiablePermissions = (ModifiablePermissions) rememberedValue30;
                Object rememberedValue31 = gapComposer8.rememberedValue();
                if (rememberedValue31 == obj8) {
                    rememberedValue31 = Boolean.valueOf(modifiablePermissions.check());
                    gapComposer8.updateRememberedValue(rememberedValue31);
                }
                Boolean bool2 = (Boolean) rememberedValue31;
                bool2.getClass();
                Object rememberedValue32 = gapComposer8.rememberedValue();
                if (rememberedValue32 == obj8) {
                    rememberedValue32 = modifiablePermissions.granted();
                    gapComposer8.updateRememberedValue(rememberedValue32);
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue32, bool2, null, gapComposer8, 48, 2);
                Object rememberedValue33 = gapComposer8.rememberedValue();
                if (rememberedValue33 == obj8) {
                    rememberedValue33 = androidPermissionManager.create("android.permission.ACCESS_COARSE_LOCATION");
                    gapComposer8.updateRememberedValue(rememberedValue33);
                }
                ModifiablePermissions modifiablePermissions2 = (ModifiablePermissions) rememberedValue33;
                Object rememberedValue34 = gapComposer8.rememberedValue();
                if (rememberedValue34 == obj8) {
                    rememberedValue34 = Boolean.valueOf(modifiablePermissions2.check());
                    gapComposer8.updateRememberedValue(rememberedValue34);
                }
                Boolean bool3 = (Boolean) rememberedValue34;
                bool3.getClass();
                Object rememberedValue35 = gapComposer8.rememberedValue();
                if (rememberedValue35 == obj8) {
                    rememberedValue35 = modifiablePermissions2.granted();
                    gapComposer8.updateRememberedValue(rememberedValue35);
                }
                MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue35, bool3, null, gapComposer8, 48, 2);
                Object rememberedValue36 = gapComposer8.rememberedValue();
                if (rememberedValue36 == obj8) {
                    rememberedValue36 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer8.updateRememberedValue(rememberedValue36);
                }
                MutableState mutableState18 = (MutableState) rememberedValue36;
                Object rememberedValue37 = gapComposer8.rememberedValue();
                if (rememberedValue37 == obj8) {
                    rememberedValue37 = Updater.mutableStateOf$default(null);
                    gapComposer8.updateRememberedValue(rememberedValue37);
                }
                MutableState mutableState19 = (MutableState) rememberedValue37;
                Object rememberedValue38 = gapComposer8.rememberedValue();
                if (rememberedValue38 == obj8) {
                    rememberedValue38 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer8);
                    gapComposer8.updateRememberedValue(rememberedValue38);
                }
                AskedQuestion askedQuestion = clockInBottomSheetScreen.askedQuestion;
                Flow denied = modifiablePermissions.denied();
                Updater.LaunchedEffect(gapComposer8, denied, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(i6, mutableState18, continuation2, denied));
                Updater.LaunchedEffect(gapComposer8, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, this, askedQuestion, (CoroutineScope) rememberedValue38, mutableState13, mutableState15, mutableState16, mutableState17, 12));
                boolean changed5 = gapComposer8.changed((LocationIdentifier) mutableState17.getValue()) | gapComposer8.changed(((Boolean) collectAsState7.getValue()).booleanValue());
                Object rememberedValue39 = gapComposer8.rememberedValue();
                if (changed5 || rememberedValue39 == obj8) {
                    LocationIdentifier locationIdentifier = (LocationIdentifier) mutableState17.getValue();
                    boolean booleanValue = ((Boolean) collectAsState7.getValue()).booleanValue();
                    GeofenceStateResolver.SelectedLocationGeofenceInput selectedLocationGeofenceInput = GeofenceStateResolver.toSelectedLocationGeofenceInput(clockInBottomSheetScreen, locationIdentifier);
                    rememberedValue39 = Boolean.valueOf(selectedLocationGeofenceInput != null && selectedLocationGeofenceInput.canUseGeofencing && selectedLocationGeofenceInput.isGeofencingEnabled && selectedLocationGeofenceInput.geofenceRadiusInMeters > 0.0d && booleanValue);
                    gapComposer8.updateRememberedValue(rememberedValue39);
                }
                Boolean bool4 = (Boolean) rememberedValue39;
                boolean booleanValue2 = bool4.booleanValue();
                boolean changed6 = gapComposer8.changed(booleanValue2) | gapComposer8.changedInstance(this);
                Object rememberedValue40 = gapComposer8.rememberedValue();
                if (changed6 || rememberedValue40 == obj8) {
                    bool = bool4;
                    mutableState3 = mutableState14;
                    mutableState4 = mutableState19;
                    realPayDataLoader$fetchData$1 = new RealPayDataLoader$fetchData$1(booleanValue2, this, mutableState4, mutableState3, (Continuation) null, 15);
                    gapComposer8.updateRememberedValue(realPayDataLoader$fetchData$1);
                } else {
                    bool = bool4;
                    realPayDataLoader$fetchData$1 = rememberedValue40;
                    mutableState3 = mutableState14;
                    mutableState4 = mutableState19;
                }
                Updater.LaunchedEffect(gapComposer8, bool, (Function2) realPayDataLoader$fetchData$1);
                JobIdentifier jobIdentifier = (JobIdentifier) mutableState16.getValue();
                LocationIdentifier locationIdentifier2 = (LocationIdentifier) mutableState17.getValue();
                boolean z4 = ((Boolean) mutableState13.getValue()).booleanValue() || ((Boolean) mutableState3.getValue()).booleanValue();
                ToastState toastState = (ToastState) mutableState15.getValue();
                boolean booleanValue3 = ((Boolean) collectAsState7.getValue()).booleanValue();
                boolean booleanValue4 = ((Boolean) collectAsState8.getValue()).booleanValue();
                boolean booleanValue5 = ((Boolean) mutableState18.getValue()).booleanValue();
                Location location = (Location) mutableState4.getValue();
                AndroidStringManager androidStringManager3 = (AndroidStringManager) markwonConfiguration2.theme;
                String str26 = clockInBottomSheetScreen.merchantName;
                String str27 = clockInBottomSheetScreen.scheduledLocationToken;
                ArrayMap m2 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str26, "merchant_name", str26);
                Resources resources = androidStringManager3.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.work_clock_in_title)).format(m2);
                format2.getClass();
                String str28 = clockInBottomSheetScreen.shiftStartDatetime;
                String str29 = clockInBottomSheetScreen.shiftStopDatetime;
                if (str28 != null && str29 != null) {
                    try {
                        OffsetDateTime parse2 = OffsetDateTime.parse(str28);
                        OffsetDateTime parse3 = OffsetDateTime.parse(str29);
                        parse2.getClass();
                        String formatDayDate = realShiftTimeFormatter.formatDayDate(parse2);
                        parse3.getClass();
                        str6 = formatDayDate + "  ·  " + RealShiftTimeFormatter.formatTimeRange$default(realShiftTimeFormatter, parse2, parse3);
                    } catch (Exception e) {
                        Timber.Forest.w("Failed to parse shift date/time", new Object[0], e);
                    }
                    String str30 = clockInBottomSheetScreen.scheduledJobToken;
                    JobIdentifier jobIdentifier2 = str30 == null ? new JobIdentifier(str30) : null;
                    LocationIdentifier locationIdentifier3 = str27 == null ? new LocationIdentifier(str27) : null;
                    ArrayList arrayList4 = clockInBottomSheetScreen.jobs;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ClockInBottomSheetScreen.JobInfo jobInfo2 = (ClockInBottomSheetScreen.JobInfo) it.next();
                        JobIdentifier jobIdentifier3 = new JobIdentifier(jobInfo2.token);
                        arrayList5.add(new ClockInBottomSheetViewModel.JobItem(jobIdentifier3, jobInfo2.title, jobIdentifier3.equals(jobIdentifier), jobIdentifier3.equals(jobIdentifier2)));
                        it = it;
                        booleanValue4 = booleanValue4;
                        jobIdentifier = jobIdentifier;
                    }
                    boolean z5 = booleanValue4;
                    ArrayList arrayList6 = clockInBottomSheetScreen.locations;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                    for (it2 = arrayList6.iterator(); it2.hasNext(); it2 = it2) {
                        ClockInBottomSheetScreen.LocationInfo locationInfo2 = (ClockInBottomSheetScreen.LocationInfo) it2.next();
                        LocationIdentifier locationIdentifier4 = new LocationIdentifier(locationInfo2.token);
                        arrayList7.add(new ClockInBottomSheetViewModel.LocationItem(locationIdentifier4, locationInfo2.name, locationIdentifier4.equals(locationIdentifier2), locationIdentifier4.equals(locationIdentifier3)));
                    }
                    if (locationIdentifier2 != null) {
                        clockInEnabledForLocationResult = new ClockInEnabledResult(false, null, null, null, 14);
                    } else {
                        String str31 = locationIdentifier2.token;
                        Iterator it5 = clockInBottomSheetScreen.locationControls.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj = it5.next();
                                if (Intrinsics.areEqual(((LocationClockInControls) obj).token, str31)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        LocationClockInControls locationClockInControls = (LocationClockInControls) obj;
                        if (locationClockInControls != null) {
                            boolean z6 = locationClockInControls.isEarlyAndUnscheduledClockInBlocked;
                            boolean z7 = locationClockInControls.isGeofencingEnabled;
                            double d3 = locationClockInControls.geofenceRadiusInMeters;
                            String str32 = locationClockInControls.earlyClockInBoundaryBegin;
                            if (str32 == null || (instant = MarkwonConfiguration.parseInstant(str32)) == null) {
                                instant = Instant.MIN;
                            }
                            Instant instant3 = instant;
                            instant3.getClass();
                            String str33 = locationClockInControls.earlyClockInBoundaryEnd;
                            if (str33 == null || (instant2 = MarkwonConfiguration.parseInstant(str33)) == null) {
                                instant2 = Instant.MIN;
                            }
                            Instant instant4 = instant2;
                            instant4.getClass();
                            locationScopedClockInControls = new LocationScopedClockInControls(z7, z6, instant3, instant4, d3, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
                        } else {
                            locationScopedClockInControls = new LocationScopedClockInControls(false, false, null, null, 0.0d, 511);
                        }
                        clockInEnabledForLocationResult = clockInStateResolver.getClockInEnabledForLocationResult(clockInBottomSheetScreen.hasOverridePermission, clockInBottomSheetScreen.canEnforceEarlyOrUnscheduledClockIn, locationScopedClockInControls, MarkwonConfiguration.parseShiftEndTime(clockInBottomSheetScreen), Intrinsics.areEqual(str31, str27));
                    }
                    ClockInEnabledResult clockInEnabledResult = clockInEnabledForLocationResult;
                    boolean shouldSendShiftToken = clockInStateResolver.shouldSendShiftToken(clockInBottomSheetScreen.hasOverridePermission, clockInBottomSheetScreen.canEnforceEarlyOrUnscheduledClockIn, null, locationIdentifier2 == null ? locationIdentifier2.token : null, clockInBottomSheetScreen.scheduledLocationToken, MarkwonConfiguration.parseShiftEndTime(clockInBottomSheetScreen));
                    GeofenceStateResolver.GeofenceResolution resolve = ((GeofenceStateResolver) markwonConfiguration2.spansFactory).resolve(GeofenceStateResolver.toSelectedLocationGeofenceInput(clockInBottomSheetScreen, locationIdentifier2), booleanValue3, z5, booleanValue5, location);
                    str7 = resolve.reasonText;
                    if (str7 == null) {
                        ClockInDisabledReason clockInDisabledReason = clockInEnabledResult.disabledReason;
                        if (clockInDisabledReason == null) {
                            str8 = null;
                            geofenceAction = resolve.reasonAction;
                            if (geofenceAction instanceof GeofenceStateResolver.GeofenceAction.OpenSettings) {
                                requestLocationPermission = new ClockInBottomSheetViewModel.ReasonAction.OpenSettings(((GeofenceStateResolver.GeofenceAction.OpenSettings) geofenceAction).text);
                            } else {
                                if (!(geofenceAction instanceof GeofenceStateResolver.GeofenceAction.RequestLocationPermission)) {
                                    if (geofenceAction != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    reasonAction = null;
                                    ClockInBottomSheetViewModel clockInBottomSheetViewModel = new ClockInBottomSheetViewModel(format2, str6, arrayList5, arrayList7, str8, reasonAction, z4, !clockInEnabledResult.isEnabled && resolve.isAllowed, toastState, shouldSendShiftToken);
                                    gapComposer8.end(false);
                                    return clockInBottomSheetViewModel;
                                }
                                requestLocationPermission = new ClockInBottomSheetViewModel.ReasonAction.RequestLocationPermission(((GeofenceStateResolver.GeofenceAction.RequestLocationPermission) geofenceAction).text);
                            }
                            reasonAction = requestLocationPermission;
                            ClockInBottomSheetViewModel clockInBottomSheetViewModel2 = new ClockInBottomSheetViewModel(format2, str6, arrayList5, arrayList7, str8, reasonAction, z4, !clockInEnabledResult.isEnabled && resolve.isAllowed, toastState, shouldSendShiftToken);
                            gapComposer8.end(false);
                            return clockInBottomSheetViewModel2;
                        }
                        if (clockInDisabledReason.equals(ClockInDisabledReason.EarlyClockInBlocked.INSTANCE) || clockInDisabledReason.equals(ClockInDisabledReason.BeforeClockInWindow.INSTANCE)) {
                            str7 = androidStringManager3.get(R.string.work_shift_disclaimer_early_clock_in_blocked);
                        } else {
                            if (!clockInDisabledReason.equals(ClockInDisabledReason.UnscheduledClockInBlocked.INSTANCE) && !clockInDisabledReason.equals(ClockInDisabledReason.ShiftEnded.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str7 = androidStringManager3.get(R.string.work_shift_disclaimer_unscheduled_clock_in_blocked);
                        }
                    }
                    str8 = str7;
                    geofenceAction = resolve.reasonAction;
                    if (geofenceAction instanceof GeofenceStateResolver.GeofenceAction.OpenSettings) {
                    }
                    reasonAction = requestLocationPermission;
                    ClockInBottomSheetViewModel clockInBottomSheetViewModel22 = new ClockInBottomSheetViewModel(format2, str6, arrayList5, arrayList7, str8, reasonAction, z4, !clockInEnabledResult.isEnabled && resolve.isAllowed, toastState, shouldSendShiftToken);
                    gapComposer8.end(false);
                    return clockInBottomSheetViewModel22;
                }
                str6 = null;
                String str302 = clockInBottomSheetScreen.scheduledJobToken;
                if (str302 == null) {
                }
                if (str27 == null) {
                }
                ArrayList arrayList42 = clockInBottomSheetScreen.jobs;
                ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList42, 10));
                it = arrayList42.iterator();
                while (it.hasNext()) {
                }
                boolean z52 = booleanValue4;
                ArrayList arrayList62 = clockInBottomSheetScreen.locations;
                ArrayList arrayList72 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList62, 10));
                while (it2.hasNext()) {
                }
                if (locationIdentifier2 != null) {
                }
                ClockInEnabledResult clockInEnabledResult2 = clockInEnabledForLocationResult;
                boolean shouldSendShiftToken2 = clockInStateResolver.shouldSendShiftToken(clockInBottomSheetScreen.hasOverridePermission, clockInBottomSheetScreen.canEnforceEarlyOrUnscheduledClockIn, null, locationIdentifier2 == null ? locationIdentifier2.token : null, clockInBottomSheetScreen.scheduledLocationToken, MarkwonConfiguration.parseShiftEndTime(clockInBottomSheetScreen));
                GeofenceStateResolver.GeofenceResolution resolve2 = ((GeofenceStateResolver) markwonConfiguration2.spansFactory).resolve(GeofenceStateResolver.toSelectedLocationGeofenceInput(clockInBottomSheetScreen, locationIdentifier2), booleanValue3, z52, booleanValue5, location);
                str7 = resolve2.reasonText;
                if (str7 == null) {
                }
                str8 = str7;
                geofenceAction = resolve2.reasonAction;
                if (geofenceAction instanceof GeofenceStateResolver.GeofenceAction.OpenSettings) {
                }
                reasonAction = requestLocationPermission;
                ClockInBottomSheetViewModel clockInBottomSheetViewModel222 = new ClockInBottomSheetViewModel(format2, str6, arrayList52, arrayList72, str8, reasonAction, z4, !clockInEnabledResult2.isEnabled && resolve2.isAllowed, toastState, shouldSendShiftToken2);
                gapComposer8.end(false);
                return clockInBottomSheetViewModel222;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:11:0x0038, B:13:0x00c2, B:15:0x00c9, B:17:0x00cd, B:18:0x00d1, B:20:0x00dd, B:21:0x00e1, B:22:0x00f8, B:24:0x00fe, B:25:0x0105, B:27:0x0109, B:28:0x010f), top: B:10:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:11:0x0038, B:13:0x00c2, B:15:0x00c9, B:17:0x00cd, B:18:0x00d1, B:20:0x00dd, B:21:0x00e1, B:22:0x00f8, B:24:0x00fe, B:25:0x0105, B:27:0x0109, B:28:0x010f), top: B:10:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:11:0x0038, B:13:0x00c2, B:15:0x00c9, B:17:0x00cd, B:18:0x00d1, B:20:0x00dd, B:21:0x00e1, B:22:0x00f8, B:24:0x00fe, B:25:0x0105, B:27:0x0109, B:28:0x010f), top: B:10:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0097 A[Catch: Exception -> 0x0071, TryCatch #0 {Exception -> 0x0071, blocks: (B:48:0x0050, B:50:0x0068, B:52:0x006c, B:54:0x0078, B:56:0x007c, B:57:0x0082, B:59:0x0086, B:61:0x008a, B:63:0x0091, B:65:0x0097, B:67:0x009b, B:69:0x00a1, B:70:0x00a5), top: B:47:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object toLoadedRetroOrderSelectionViewModel(RetroOrderSelectionResponse retroOrderSelectionResponse, ContinuationImpl continuationImpl) {
        AfterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1 afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1;
        int i;
        AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory;
        ProtoValidationScope protoValidationScope;
        RetroOrderSelectionResponse.TextLineItemSection textLineItemSection;
        RetroOrderSelectionResponse.EligibleRetroOrdersSection eligibleRetroOrdersSection;
        Object retroOrderSection;
        StackedAvatarViewModel.Single single;
        String str;
        String str2;
        RetroOrderSelectionResponse retroOrderSelectionResponse2;
        UiAvatar uiAvatar;
        LocalizedString localizedString;
        TappableIcon tappableIcon;
        com.squareup.cash.afterpayapplet.viewmodels.TappableIcon tappableIcon2;
        RetroOrderSelectionResponse retroOrderSelectionResponse3 = retroOrderSelectionResponse;
        if (continuationImpl instanceof AfterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1) {
            afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1 = (AfterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1) continuationImpl;
            int i2 = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory2 = AfterpayAppletParsingErrorFactory.INSTANCE;
                    try {
                        protoValidationScope = new ProtoValidationScope(retroOrderSelectionResponse3, afterpayAppletParsingErrorFactory2, this);
                        PageHeader pageHeader = retroOrderSelectionResponse3.screen_header;
                        ProtoValidationScope.required(pageHeader, "screen_header");
                        String required = ProtoValidationScope.required(pageHeader.title, "screen_header.title");
                        String translated = (pageHeader == null || (localizedString = pageHeader.subtitle) == null) ? null : com.squareup.util.cash.StringsKt.translated(localizedString);
                        StackedAvatarViewModel.Single stackedAvatarViewModel = (pageHeader == null || (uiAvatar = pageHeader.avatar) == null) ? null : StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar);
                        YGNode.Companion companion = retroOrderSelectionResponse3.screen_content;
                        if (companion != null) {
                            RetroOrderSelectionResponse$ScreenContent$TextLines retroOrderSelectionResponse$ScreenContent$TextLines = companion instanceof RetroOrderSelectionResponse$ScreenContent$TextLines ? (RetroOrderSelectionResponse$ScreenContent$TextLines) companion : null;
                            if (retroOrderSelectionResponse$ScreenContent$TextLines != null) {
                                textLineItemSection = retroOrderSelectionResponse$ScreenContent$TextLines.value;
                                if (companion != null) {
                                    RetroOrderSelectionResponse$ScreenContent$EligibleOrders retroOrderSelectionResponse$ScreenContent$EligibleOrders = companion instanceof RetroOrderSelectionResponse$ScreenContent$EligibleOrders ? (RetroOrderSelectionResponse$ScreenContent$EligibleOrders) companion : null;
                                    if (retroOrderSelectionResponse$ScreenContent$EligibleOrders != null) {
                                        eligibleRetroOrdersSection = retroOrderSelectionResponse$ScreenContent$EligibleOrders.value;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$0 = retroOrderSelectionResponse3;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$5 = retroOrderSelectionResponse3;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$6 = afterpayAppletParsingErrorFactory2;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$7 = protoValidationScope;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$9 = required;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$10 = stackedAvatarViewModel;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$11 = translated;
                                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.label = 1;
                                        retroOrderSection = toRetroOrderSection(textLineItemSection, eligibleRetroOrdersSection, afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1);
                                        if (retroOrderSection == obj2) {
                                            return obj2;
                                        }
                                        afterpayAppletParsingErrorFactory = afterpayAppletParsingErrorFactory2;
                                        single = stackedAvatarViewModel;
                                        str = required;
                                        str2 = translated;
                                        obj = retroOrderSection;
                                        retroOrderSelectionResponse2 = retroOrderSelectionResponse3;
                                    }
                                }
                                eligibleRetroOrdersSection = null;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$0 = retroOrderSelectionResponse3;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$5 = retroOrderSelectionResponse3;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$6 = afterpayAppletParsingErrorFactory2;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$7 = protoValidationScope;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$9 = required;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$10 = stackedAvatarViewModel;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$11 = translated;
                                afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.label = 1;
                                retroOrderSection = toRetroOrderSection(textLineItemSection, eligibleRetroOrdersSection, afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1);
                                if (retroOrderSection == obj2) {
                                }
                            }
                        }
                        textLineItemSection = null;
                        if (companion != null) {
                        }
                        eligibleRetroOrdersSection = null;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$0 = retroOrderSelectionResponse3;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$5 = retroOrderSelectionResponse3;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$6 = afterpayAppletParsingErrorFactory2;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$7 = protoValidationScope;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$9 = required;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$10 = stackedAvatarViewModel;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$11 = translated;
                        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.label = 1;
                        retroOrderSection = toRetroOrderSection(textLineItemSection, eligibleRetroOrdersSection, afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1);
                        if (retroOrderSection == obj2) {
                        }
                    } catch (Exception e) {
                        e = e;
                        afterpayAppletParsingErrorFactory = afterpayAppletParsingErrorFactory2;
                        throw RotateKt.toProtoParsingExceptionFor(e, retroOrderSelectionResponse3 == null ? Reflection.factory.getOrCreateKotlinClass(retroOrderSelectionResponse3.getClass()) : null, afterpayAppletParsingErrorFactory, null);
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$11;
                    StackedAvatarViewModel.Single single2 = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$10;
                    String str4 = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$9;
                    protoValidationScope = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$7;
                    afterpayAppletParsingErrorFactory = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$6;
                    retroOrderSelectionResponse2 = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$5;
                    RetroOrderSelectionResponse retroOrderSelectionResponse4 = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        str2 = str3;
                        single = single2;
                        retroOrderSelectionResponse3 = retroOrderSelectionResponse4;
                        str = str4;
                    } catch (Exception e2) {
                        e = e2;
                        retroOrderSelectionResponse3 = retroOrderSelectionResponse2;
                        throw RotateKt.toProtoParsingExceptionFor(e, retroOrderSelectionResponse3 == null ? Reflection.factory.getOrCreateKotlinClass(retroOrderSelectionResponse3.getClass()) : null, afterpayAppletParsingErrorFactory, null);
                    }
                }
                AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection retroOrderSection2 = (AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection) obj;
                tappableIcon = retroOrderSelectionResponse3.screen_tappable_info;
                if (tappableIcon == null) {
                    Icon icon = tappableIcon.arcade_icon;
                    String str5 = icon != null ? icon.arcade_id : null;
                    protoValidationScope.getClass();
                    ProtoValidationScope.required(str5, "arcade_id");
                    LocalizedString localizedString2 = tappableIcon.accessibility_text;
                    String str6 = localizedString2 != null ? localizedString2.translated_value : null;
                    TapAction tapAction = tappableIcon.tap_action;
                    ProtoValidationScope.required(tapAction, "no tap action for header icon");
                    tappableIcon2 = new com.squareup.cash.afterpayapplet.viewmodels.TappableIcon(str5, AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction), String.valueOf(str6));
                } else {
                    tappableIcon2 = null;
                }
                LocalizedString localizedString3 = retroOrderSelectionResponse3.bottom_text;
                String translated2 = localizedString3 == null ? com.squareup.util.cash.StringsKt.translated(localizedString3) : null;
                AnalyticsEvent analyticsEvent = retroOrderSelectionResponse3.analytic_view_event;
                return new AfterpayAppletRetroOrderSelectionViewModel.Loaded(tappableIcon2, single, str, str2, retroOrderSection2, translated2, CollectionsKt__CollectionsKt.listOfNotNull(analyticsEvent == null ? HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent) : null));
            }
        }
        afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1 = new AfterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1(this, continuationImpl);
        Object obj3 = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterpayAppletRetroOrderSelectionPresenter$toLoadedRetroOrderSelectionViewModel$1.label;
        if (i != 0) {
        }
        AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection retroOrderSection22 = (AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection) obj3;
        tappableIcon = retroOrderSelectionResponse3.screen_tappable_info;
        if (tappableIcon == null) {
        }
        LocalizedString localizedString32 = retroOrderSelectionResponse3.bottom_text;
        if (localizedString32 == null) {
        }
        AnalyticsEvent analyticsEvent2 = retroOrderSelectionResponse3.analytic_view_event;
        return new AfterpayAppletRetroOrderSelectionViewModel.Loaded(tappableIcon2, single, str, str2, retroOrderSection22, translated2, CollectionsKt__CollectionsKt.listOfNotNull(analyticsEvent2 == null ? HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2) : null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0092, code lost:
    
        if (r4 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object toRetroOrderSection(RetroOrderSelectionResponse.TextLineItemSection textLineItemSection, RetroOrderSelectionResponse.EligibleRetroOrdersSection eligibleRetroOrdersSection, ContinuationImpl continuationImpl) {
        AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1 afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1;
        int i;
        ImmutableList immutableList;
        if (continuationImpl instanceof AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1) {
            afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1 = (AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1) continuationImpl;
            int i2 = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (textLineItemSection != null) {
                        List list = textLineItemSection.line_items;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(com.squareup.util.cash.StringsKt.translated((LocalizedString) it.next()));
                        }
                        ImmutableList immutableList2 = Tags.toImmutableList(arrayList);
                        RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle displayStyle = textLineItemSection.display_style;
                        return new AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection.EmptyEligibleTransactions(immutableList2, (displayStyle == null ? -1 : AfterpayAppletRetroOrderSelectionPresenter$WhenMappings.$EnumSwitchMapping$0[displayStyle.ordinal()]) == 1 ? AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection.EmptyEligibleTransactions.DisplayStyle.UNORDERED : AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection.EmptyEligibleTransactions.DisplayStyle.ORDERED);
                    }
                    if (eligibleRetroOrdersSection != null) {
                        AfterpayEligibleRetroTransactionsProvider afterpayEligibleRetroTransactionsProvider = (AfterpayEligibleRetroTransactionsProvider) this.repository;
                        List list2 = eligibleRetroOrdersSection.order_rows;
                        afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1.label = 1;
                        obj = ((RealAfterpayEligibleRetroTransactionsProvider) afterpayEligibleRetroTransactionsProvider).processTransactions(list2, afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    immutableList = SmallPersistentVector.EMPTY;
                    return new AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection.EligibleTransactions(immutableList);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                immutableList = Tags.toImmutableList((Iterable) obj);
            }
        }
        afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1 = new AfterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1(this, continuationImpl);
        Object obj3 = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterpayAppletRetroOrderSelectionPresenter$toRetroOrderSection$1.label;
        if (i != 0) {
        }
        immutableList = Tags.toImmutableList((Iterable) obj3);
    }

    public PoolsListPresenter(RealChatManager realChatManager, RealChatSurveyService realChatSurveyService, RealChatNotificationSuppressor realChatNotificationSuppressor, AndroidStringManager androidStringManager, Analytics analytics, FeatureFlagManager featureFlagManager, SupportChatScreens.SupportChatSheets.ChatExitPromptSheet chatExitPromptSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 13;
        chatExitPromptSheet.getClass();
        this.sessionManager = realChatManager;
        this.repository = realChatSurveyService;
        this.dateFormatManager = realChatNotificationSuppressor;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.localeAssetProvider = featureFlagManager;
        this.args = chatExitPromptSheet;
        this.navigator = screenNavigator;
        final int i = 0;
        this.moneyFormatter = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.support.chat.presenters.ChatExitPromptSheetPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ PoolsListPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PoolsListPresenter poolsListPresenter = this.f$0;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) poolsListPresenter.localeAssetProvider)).currentValue(AmplitudeExperiments$ClientSupportConsistentCsatOrder.INSTANCE)).enabled());
                    default:
                        return ((FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) ((FeatureFlagManager) poolsListPresenter.localeAssetProvider)).currentValue(AmplitudeExperiments$ClientSupportChatExitPromptCopy.INSTANCE)).value;
                }
            }
        });
        final int i2 = 1;
        this.flowToken = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.support.chat.presenters.ChatExitPromptSheetPresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ PoolsListPresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PoolsListPresenter poolsListPresenter = this.f$0;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) poolsListPresenter.localeAssetProvider)).currentValue(AmplitudeExperiments$ClientSupportConsistentCsatOrder.INSTANCE)).enabled());
                    default:
                        return ((FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) ((FeatureFlagManager) poolsListPresenter.localeAssetProvider)).currentValue(AmplitudeExperiments$ClientSupportChatExitPromptCopy.INSTANCE)).value;
                }
            }
        });
    }

    public PoolsListPresenter(Analytics analytics, IntentLauncher intentLauncher, RealClipboardManager realClipboardManager, AndroidStringManager androidStringManager, RealProfileManager realProfileManager, RealQrCodesPresenter realQrCodesPresenter, MarkwonConfiguration markwonConfiguration, AndroidAccessibilityManager androidAccessibilityManager, ErrorReporter errorReporter, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        this.analytics = analytics;
        this.sessionManager = intentLauncher;
        this.repository = realClipboardManager;
        this.stringManager = androidStringManager;
        this.dateFormatManager = realProfileManager;
        this.localeAssetProvider = realQrCodesPresenter;
        this.args = markwonConfiguration;
        this.moneyFormatter = androidAccessibilityManager;
        this.flowToken = errorReporter;
        this.navigator = screenNavigator;
    }

    public PoolsListPresenter(AndroidStringManager androidStringManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, SyncValueReader syncValueReader, TransferOptionPickerResolver transferOptionPickerResolver, FlowStarter flowStarter, ErrorReporter errorReporter, SampleStrategy sampleStrategy, TransferOptionPickerScreen transferOptionPickerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        transferOptionPickerScreen.getClass();
        this.stringManager = androidStringManager;
        this.sessionManager = realBalanceSnapshotManager;
        this.repository = realInstrumentManager;
        this.dateFormatManager = syncValueReader;
        this.analytics = transferOptionPickerResolver;
        this.localeAssetProvider = flowStarter;
        this.args = errorReporter;
        this.moneyFormatter = sampleStrategy;
        this.flowToken = transferOptionPickerScreen;
        this.navigator = screenNavigator;
    }

    public PoolsListPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidStringManager androidStringManager, Analytics analytics, RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer, FeatureFlagManager featureFlagManager, SyncValueReader syncValueReader, CoroutineContext coroutineContext, InvestingScreens.PerformanceScreens performanceScreens, BetterNavigator.ScreenNavigator screenNavigator) {
        InvestmentEntityToken investmentEntityToken;
        this.$r8$classId = 7;
        performanceScreens.getClass();
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.sessionManager = realInvestmentPerformanceSyncer;
        this.repository = featureFlagManager;
        this.dateFormatManager = syncValueReader;
        this.localeAssetProvider = coroutineContext;
        this.args = performanceScreens;
        this.navigator = screenNavigator;
        this.moneyFormatter = cashAccountDatabaseImpl.investmentPerformanceQueries;
        if (performanceScreens instanceof InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen) {
            investmentEntityToken = InvestingPerformanceSyncerKt.PORTFOLIO_TOKEN;
        } else {
            if (!(performanceScreens instanceof InvestingScreens.PerformanceScreens.StockPerformanceScreen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            investmentEntityToken = ((InvestingScreens.PerformanceScreens.StockPerformanceScreen) performanceScreens).token;
        }
        this.flowToken = investmentEntityToken;
    }

    public PoolsListPresenter(Analytics analytics, MoneyAnalyticsService moneyAnalyticsService, LocalizedMoneyFormatter.Factory factory, RealSavingsAppletTileRepository realSavingsAppletTileRepository, Navigator navigator, AndroidStringManager androidStringManager, RealFamilyProfileManager realFamilyProfileManager, RealRouter$Factory$Impl realRouter$Factory$Impl, RealMoneyNavigatorHelper realMoneyNavigatorHelper, FeatureFlagManager featureFlagManager, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl) {
        this.$r8$classId = 12;
        navigator.getClass();
        this.analytics = analytics;
        this.sessionManager = moneyAnalyticsService;
        this.repository = realSavingsAppletTileRepository;
        this.stringManager = androidStringManager;
        this.dateFormatManager = realFamilyProfileManager;
        this.localeAssetProvider = featureFlagManager;
        this.args = realRouter$Factory$Impl.create$1(navigator);
        this.navigator = promotedAppletTilePresenter$Factory$Impl.create(AppletId.SAVINGS);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.flowToken = androidStringManager.get(R.string.savings_tile_default_title);
    }

    public PoolsListPresenter(ClockInBottomSheetScreen clockInBottomSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, RealClockInRepository realClockInRepository, MarkwonConfiguration markwonConfiguration, RealLastClockedInInfoUseCase realLastClockedInInfoUseCase, ShiftsAnalytics shiftsAnalytics, AndroidPermissionManager androidPermissionManager, AndroidLocationProvider androidLocationProvider, IntentLauncher intentLauncher) {
        this.$r8$classId = 15;
        clockInBottomSheetScreen.getClass();
        this.sessionManager = clockInBottomSheetScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.repository = realClockInRepository;
        this.dateFormatManager = markwonConfiguration;
        this.analytics = realLastClockedInInfoUseCase;
        this.localeAssetProvider = shiftsAnalytics;
        this.args = androidPermissionManager;
        this.moneyFormatter = androidLocationProvider;
        this.flowToken = intentLauncher;
    }

    public PoolsListPresenter(AndroidClock androidClock, MoneyAnalyticsService moneyAnalyticsService, BinaryBitmap binaryBitmap, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, Navigator navigator, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.$r8$classId = 9;
        navigator.getClass();
        this.sessionManager = moneyAnalyticsService;
        this.repository = binaryBitmap;
        this.stringManager = androidStringManager;
        this.dateFormatManager = syncValueReader;
        this.analytics = navigator;
        this.localeAssetProvider = errorReporter;
        this.args = sampleStrategy;
        this.navigator = DimensionKt.now(androidClock);
        this.moneyFormatter = realRouter$Factory$Impl.create$1(navigator);
        this.flowToken = promotedAppletTilePresenter$Factory$Impl.create(AppletId.PAYCHECKS);
    }

    public PoolsListPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, PhysicalCashDepositAddressEntryScreen physicalCashDepositAddressEntryScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, RealLocationSearchClient realLocationSearchClient, AndroidStringManager androidStringManager, Analytics analytics) {
        Object zzdVar;
        this.$r8$classId = 4;
        physicalCashDepositAddressEntryScreen.getClass();
        this.sessionManager = physicalCashDepositAddressEntryScreen;
        this.navigator = screenNavigator;
        this.repository = coroutineContext;
        this.dateFormatManager = realLocationSearchClient;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.localeAssetProvider = new LocationSearchClient$SessionId$GoogleSessionId(zzdi.newInstance());
        PhysicalCashDepositAddressEntryScreen.AddressSearchType addressSearchType = physicalCashDepositAddressEntryScreen.addressSearchType;
        this.args = new EglCore(cashAccountDatabaseImpl, coroutineContext, addressSearchType);
        int ordinal = addressSearchType.ordinal();
        if (ordinal != 0) {
            int i = 23;
            if (ordinal == 1) {
                zzdVar = new com.google.mlkit.vision.text.zzb(i);
            } else if (ordinal == 2) {
                zzdVar = new zzc(i);
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
        } else {
            zzdVar = new zzd(24);
        }
        this.moneyFormatter = zzdVar;
        this.flowToken = FlowKt.MutableStateFlow("");
    }

    public PoolsListPresenter(SessionManager sessionManager, AndroidStringManager androidStringManager, RealPoolsRepository realPoolsRepository, AndroidDateFormatManager androidDateFormatManager, RealUuidGenerator realUuidGenerator, LocalizedMoneyFormatter.Factory factory, Analytics analytics, zzb zzbVar, PoolsListScreen poolsListScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        poolsListScreen.getClass();
        this.sessionManager = sessionManager;
        this.stringManager = androidStringManager;
        this.repository = realPoolsRepository;
        this.dateFormatManager = androidDateFormatManager;
        this.analytics = analytics;
        this.localeAssetProvider = zzbVar;
        this.args = poolsListScreen;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.flowToken = re$$ExternalSyntheticOutline0.m();
    }

    public PoolsListPresenter(LocalizedMoneyFormatter.Factory factory, RealBalanceBasedAddCashManager realBalanceBasedAddCashManager, ScheduledReloadsManager scheduledReloadsManager, RealInstrumentManager realInstrumentManager, AndroidStringManager androidStringManager, Analytics analytics, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl, RecurringReloadOptionScreen recurringReloadOptionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 14;
        recurringReloadOptionScreen.getClass();
        this.sessionManager = realBalanceBasedAddCashManager;
        this.repository = scheduledReloadsManager;
        this.dateFormatManager = realInstrumentManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.localeAssetProvider = recurringReloadOptionScreen;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.args = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.flowToken = realBankingOutboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    public PoolsListPresenter(OffersScreen$OffersTimelineScreen offersScreen$OffersTimelineScreen, BetterNavigator.ScreenNavigator screenNavigator, RealOffersSheetRepository realOffersSheetRepository, RealOffersAnalyticsHelper realOffersAnalyticsHelper, AndroidStringManager androidStringManager, RealFlowTokenGenerator realFlowTokenGenerator, RealObservabilityManager realObservabilityManager, RealOffersSpanManager realOffersSpanManager, AndroidClock androidClock, FlowStarter flowStarter, RealUuidGenerator realUuidGenerator, RealRouter$Factory$Impl realRouter$Factory$Impl, RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl) {
        this.$r8$classId = 8;
        offersScreen$OffersTimelineScreen.getClass();
        this.sessionManager = offersScreen$OffersTimelineScreen;
        this.navigator = screenNavigator;
        this.repository = realOffersSheetRepository;
        this.dateFormatManager = realOffersAnalyticsHelper;
        this.stringManager = androidStringManager;
        this.analytics = realObservabilityManager;
        this.localeAssetProvider = realOffersSpanManager;
        this.args = androidClock;
        this.moneyFormatter = realRouter$Factory$Impl.create$1(screenNavigator);
        this.flowToken = realOffersAnalytics$Factory$Impl.create(offersScreen$OffersTimelineScreen);
        realOffersSpanManager.onAction(new OffersSpanAction.StartRootSpan("offers_timeline_sheet_span"));
    }

    public PoolsListPresenter(SyncValueReader syncValueReader, ShippingAddressService shippingAddressService, CustomerPreferencesService customerPreferencesService, AndroidStringManager androidStringManager, RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator, SessionManager sessionManager, CoroutineContext coroutineContext, ArcadeAutofillSettingsScreen arcadeAutofillSettingsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        arcadeAutofillSettingsScreen.getClass();
        this.repository = syncValueReader;
        this.dateFormatManager = shippingAddressService;
        this.analytics = customerPreferencesService;
        this.stringManager = androidStringManager;
        this.localeAssetProvider = realAutofillNetworkFailureMessageGenerator;
        this.sessionManager = sessionManager;
        this.args = coroutineContext;
        this.moneyFormatter = arcadeAutofillSettingsScreen;
        this.navigator = screenNavigator;
        String str = arcadeAutofillSettingsScreen.firstName;
        String str2 = arcadeAutofillSettingsScreen.lastName;
        Phone phone = arcadeAutofillSettingsScreen.phone;
        this.flowToken = new AutofillCombinedInfo(str, str2, phone != null ? phone.number : null, arcadeAutofillSettingsScreen.email, arcadeAutofillSettingsScreen.address);
    }

    public PoolsListPresenter(BetterNavigator.ScreenNavigator screenNavigator, AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen afterpayAppletScreen$AfterpayRetroOrderSelectionScreen, AndroidStringManager androidStringManager, AfterpayEligibleRetroTransactionsProvider afterpayEligibleRetroTransactionsProvider, RealAfterpayAppletRepository realAfterpayAppletRepository, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 1;
        afterpayAppletScreen$AfterpayRetroOrderSelectionScreen.getClass();
        this.navigator = screenNavigator;
        this.sessionManager = afterpayAppletScreen$AfterpayRetroOrderSelectionScreen;
        this.stringManager = androidStringManager;
        this.repository = afterpayEligibleRetroTransactionsProvider;
        this.dateFormatManager = realAfterpayAppletRepository;
        this.analytics = realAfterpayAppletAnalytics;
        this.localeAssetProvider = errorReporter;
        this.args = sampleStrategy;
        this.moneyFormatter = realRouter$Factory$Impl.create$1(screenNavigator);
        this.flowToken = new AfterpayAppletRetroOrderSelectionViewModel.Error(androidStringManager.get(R.string.afterpay_error_title), androidStringManager.get(R.string.afterpay_error_message), androidStringManager.get(R.string.afterpay_error_button));
    }

    public PoolsListPresenter(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, CryptoCustomerControlsService cryptoCustomerControlsService, InvestCustomerService investCustomerService, RealDependentControlStatusManager.Factory factory2, CoroutineContext coroutineContext, SetDependentCustomLimitScreen setDependentCustomLimitScreen, BetterNavigator.ScreenNavigator screenNavigator, FiatlyService fiatlyService, AegisService aegisService) {
        this.$r8$classId = 5;
        setDependentCustomLimitScreen.getClass();
        this.stringManager = androidStringManager;
        this.sessionManager = cryptoCustomerControlsService;
        this.repository = investCustomerService;
        this.dateFormatManager = coroutineContext;
        this.analytics = setDependentCustomLimitScreen;
        this.navigator = screenNavigator;
        this.localeAssetProvider = fiatlyService;
        this.args = aegisService;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.flowToken = factory2.create(setDependentCustomLimitScreen.controlType, setDependentCustomLimitScreen.dependentCustomerToken);
        if (setDependentCustomLimitScreen.limitCategory.getPresetLimitsInCents().size() + 1 <= 6) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    public PoolsListPresenter(AndroidStringManager androidStringManager, RealPoolsRepository realPoolsRepository, RealRecipientRepository realRecipientRepository, IntentLauncher intentLauncher, RealClipboardManager realClipboardManager, Analytics analytics, RealUuidGenerator realUuidGenerator, CoroutineContext coroutineContext, ModifiablePermissions modifiablePermissions, PoolInvitePeopleListScreen poolInvitePeopleListScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        poolInvitePeopleListScreen.getClass();
        this.stringManager = androidStringManager;
        this.repository = realPoolsRepository;
        this.sessionManager = realRecipientRepository;
        this.dateFormatManager = intentLauncher;
        this.localeAssetProvider = realClipboardManager;
        this.analytics = analytics;
        this.args = coroutineContext;
        this.moneyFormatter = modifiablePermissions;
        this.flowToken = poolInvitePeopleListScreen;
        this.navigator = screenNavigator;
    }
}
