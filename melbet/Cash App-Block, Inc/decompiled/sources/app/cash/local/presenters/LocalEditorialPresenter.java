package app.cash.local.presenters;

import android.app.Activity;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.compose.ui.unit.VelocityKt;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.app.NotificationCompat;
import androidx.core.net.UriKt;
import androidx.core.text.TextUtilsCompat;
import androidx.core.widget.TextViewCompat$Api28Impl;
import androidx.credentials.Credential;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.brand.checkout.LocalCheckoutDeeplinkPresenter$PendingCheckout;
import app.cash.local.presenters.brand.checkout.LocalCheckoutDeeplinkPresenter$models$3$1;
import app.cash.local.presenters.internal.CashBannerKt;
import app.cash.local.presenters.internal.LocalBrandBannersKt;
import app.cash.local.presenters.internal.LocalMenuItemsKt;
import app.cash.local.presenters.internal.LocalResponseContextHandler$Factory$Impl;
import app.cash.local.presenters.internal.LocationsKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.EditorialToken;
import app.cash.local.primitives.LocationKt;
import app.cash.local.screens.app.LocalCheckoutDeeplinkScreen;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.viewmodels.LocalCashAllActivityViewModel;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.viewmodels.LocalEditorialText;
import app.cash.local.viewmodels.LocalEditorialViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.internal.AddRemoveIcon;
import app.cash.local.views.LocalViewFactory;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.versioned.Versioned;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.size.DimensionKt;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.activity.presenters.RealActivityScreenInitialArgumentsSupplier;
import com.squareup.cash.activity.presenters.RealContactHeaderPresenter$Factory$Impl;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.screens.StablecoinDepositScreen;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$1$2;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.borrow.presenters.BorrowLimitHubPresenter$models$2$1;
import com.squareup.cash.borrow.presenters.UnsupportedBorrowLimitHubSection;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.businessaccount.backend.real.RealBusinessProfileManager;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.cdf.account.AccountConfigureSearchPrivacySetting;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.cdf.stock.Sort;
import com.squareup.cash.cdf.stock.StockSource;
import com.squareup.cash.cdf.stock.StockViewPresentSortBy;
import com.squareup.cash.cdf.themepicker.Theme;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.profile.Badge;
import com.squareup.cash.data.profile.ProfilesKt;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.datetimeformatter.api.TodayDateTimeFormatter$FormatOptions;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.screens.SponsorLedInviteScreen;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewModel;
import com.squareup.cash.family.requestsponsorship.screens.SelectContactMethodScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactMethod;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewModel;
import com.squareup.cash.favorites.viewmodels.ToolbarViewModel;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CommerceBrowserEditAutofill;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsContext;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.GlobalSearchFeedPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.GlobalSearchQueryPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.RowSectionPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.viewmodels.CancelPaymentViewModel;
import com.squareup.cash.identityverification.backend.api.IdentityVerificationStatus;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewModel;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.contacts.ContactBook$Contact$DetailedContact;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.presenters.StockMetricTypePickerPresenter$logPresentTypePicker$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.FollowingStockMetricType;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.model.chat.Session;
import com.squareup.cash.moneybot.presenters.MoneybotChatHistoryPresenter$content$$inlined$sortedByDescending$1;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCardPlanningState;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardMappersKt$WhenMappings;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.profile.devicemanager.navigation.RealDeviceManagerInboundNavigator$Factory$Impl;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.searchprivacy.RealSearchPrivacySettingsPresenter$handleSettingChanged$1;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.NavigationIcon;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loaded;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loading;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$State;
import com.squareup.cash.qrcodes.presenters.RealCashAppUrlParser;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.qrcodes.screens.CashtagQrScanScreen;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import com.squareup.cash.qrcodes.viewmodels.CashtagQrScanViewModel;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.savings.presenters.TransferringPresenter$initiateTransferInFlow$1;
import com.squareup.cash.savings.presenters.TransferringPresenter$initiateTransferOutFlow$1;
import com.squareup.cash.savings.presenters.TransferringPresenter$startTransferFlow$1;
import com.squareup.cash.savings.screens.TransferProcessingScreen;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.score.backend.RealScoreRepository;
import com.squareup.cash.score.backend.RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1;
import com.squareup.cash.score.screens.ScoreHomeScreen;
import com.squareup.cash.score.viewmodels.ProfileAvatarViewModel;
import com.squareup.cash.score.viewmodels.ScoreHomeSheet;
import com.squareup.cash.score.viewmodels.ScoreHomeViewModel;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.securityhub.presenters.SecurityHubBookletsKt;
import com.squareup.cash.securityhub.presenters.TrustHubImageUrls;
import com.squareup.cash.securityhub.screens.BookletId;
import com.squareup.cash.securityhub.screens.BookletScreen;
import com.squareup.cash.securityhub.screens.RecoveryGuideId;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardId;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardLinkViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardViewModel;
import com.squareup.cash.securityhub.viewmodels.BookletViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowId;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideRowViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionId;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowId;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowViewModel;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.autofill.presenters.AutofillCombinedInfo;
import com.squareup.cash.shopping.autofill.presenters.AutofillMapperKt;
import com.squareup.cash.shopping.autofill.presenters.AutofillPresenter$saveAutofill$1;
import com.squareup.cash.shopping.autofill.presenters.AutofillPresenter$updateAutofill$1;
import com.squareup.cash.shopping.autofill.presenters.AutofillState;
import com.squareup.cash.shopping.autofill.presenters.EditAutofillPresenter$submitUpdatedInfo$1;
import com.squareup.cash.shopping.autofill.presenters.InputViewModelExtKt;
import com.squareup.cash.shopping.autofill.presenters.RealAutofillNetworkFailureMessageGenerator;
import com.squareup.cash.shopping.autofill.presenters.ShoppingAutofillAnalyticsHandler;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.DialogViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.presenters.ArticlePresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.support.presenters.RealViewTokenGenerator;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository;
import com.squareup.cash.taptopay.screens.TapToPayPaymentRequestScreen;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentRequestViewModel;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.timestampformatter.api.TimestampFormatter$DisplayContext;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData;
import com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction;
import com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText;
import com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent;
import com.squareup.lending.PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle;
import com.squareup.lending.PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent;
import com.squareup.lending.PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent;
import com.squareup.lending.PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent;
import com.squareup.lending.PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent;
import com.squareup.lending.PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.aegis.sync_values.LinkText;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.balancemover.api.v1.BalanceMoverAppService;
import com.squareup.protos.cash.balancemover.api.v1.SavingsCashInRequest;
import com.squareup.protos.cash.balancemover.api.v1.SavingsCashInResponse;
import com.squareup.protos.cash.balancemover.api.v1.SavingsMoveCashRequest;
import com.squareup.protos.cash.balancemover.api.v1.SavingsMoveCashResponse;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse;
import com.squareup.protos.cash.customersearch.api.privacy.SetSearchPrivacySettingsRequest;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressResponse;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressResponse;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse$EditorialContent$ContentType$BrandCarousel;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse$EditorialContent$ContentType$Image;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse$EditorialContent$ContentType$Spacer;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse$EditorialContent$ContentType$Text;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.usher.api.UsherService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.location.Phone;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.blockers.OnboardingInternalRouteBlocker;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.lending.SyncPrepurchaseCashCardRequest;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.protos.franklin.ui.IdentityHubState;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$DisclaimerSection;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$LimitInfoBulletsSection;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$ProgressSection;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.Regions;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcStatus;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.time.Instant;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
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
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import nl.dionsegijn.konfetti.core.Position;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LocalEditorialPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object clock;
    public final Object installedStore;
    public final Object launcher;
    public final Object navigator;
    public Object responseContextHandler;
    public final Object screen;
    public final Object service;
    public final Object stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GetEditorialResponse.EditorialContent.Text.Font.Weight.values().length];
            try {
                RetailerType.Companion companion = GetEditorialResponse.EditorialContent.Text.Font.Weight.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RetailerType.Companion companion2 = GetEditorialResponse.EditorialContent.Text.Font.Weight.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RetailerType.Companion companion3 = GetEditorialResponse.EditorialContent.Text.Font.Weight.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RetailerType.Companion companion4 = GetEditorialResponse.EditorialContent.Text.Font.Weight.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RetailerType.Companion companion5 = GetEditorialResponse.EditorialContent.Text.Font.Weight.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GetEditorialResponse.EditorialContent.Text.Alignment.values().length];
            try {
                ContactAliasType.Companion companion6 = GetEditorialResponse.EditorialContent.Text.Alignment.Companion;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ContactAliasType.Companion companion7 = GetEditorialResponse.EditorialContent.Text.Alignment.Companion;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ContactAliasType.Companion companion8 = GetEditorialResponse.EditorialContent.Text.Alignment.Companion;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ContactAliasType.Companion companion9 = GetEditorialResponse.EditorialContent.Text.Alignment.Companion;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LocalEditorialPresenter(GlobalSearchFeedPresenter$Factory$Impl globalSearchFeedPresenter$Factory$Impl, GlobalSearchQueryPresenter$Factory$Impl globalSearchQueryPresenter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, GlobalSearchScreen globalSearchScreen, RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper, Analytics analytics, RealInputFieldTextSaver realInputFieldTextSaver, RealActivityScreenInitialArgumentsSupplier realActivityScreenInitialArgumentsSupplier) {
        this.$r8$classId = 13;
        globalSearchScreen.getClass();
        this.navigator = screenNavigator;
        this.launcher = globalSearchScreen;
        this.service = realGlobalSearchAnalyticsHelper;
        this.installedStore = analytics;
        this.clock = realInputFieldTextSaver;
        this.stringManager = realActivityScreenInitialArgumentsSupplier;
        TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = globalSearchFeedPresenter$Factory$Impl.delegateFactory;
        RealContactHeaderPresenter$Factory$Impl realContactHeaderPresenter$Factory$Impl = (RealContactHeaderPresenter$Factory$Impl) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
        realContactHeaderPresenter$Factory$Impl.getClass();
        androidStringManager.getClass();
        this.screen = new BinaryBitmap(realContactHeaderPresenter$Factory$Impl, androidStringManager, screenNavigator, globalSearchScreen);
        Reward$Adapter reward$Adapter = globalSearchQueryPresenter$Factory$Impl.delegateFactory;
        RealGlobalSearchRepository realGlobalSearchRepository = (RealGlobalSearchRepository) ((DoubleCheck) reward$Adapter.avatarsAdapter).getValue();
        ActivitySectionPresenter$Factory$Impl activitySectionPresenter$Factory$Impl = (ActivitySectionPresenter$Factory$Impl) ((InstanceFactory) reward$Adapter.reward_selection_stateAdapter).value;
        RowSectionPresenter$Factory$Impl rowSectionPresenter$Factory$Impl = (RowSectionPresenter$Factory$Impl) ((InstanceFactory) reward$Adapter.boost_detail_bottom_upsellAdapter).value;
        RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext = (RealGlobalSearchAnalyticsContext) ((DoubleCheck) reward$Adapter.app_linksAdapter).getValue();
        RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper2 = (RealGlobalSearchAnalyticsHelper) ((DoubleCheck) reward$Adapter.program_detail_rowsAdapter).getValue();
        Analytics analytics2 = (Analytics) ((DoubleCheck) reward$Adapter.boost_detail_rowsAdapter).getValue();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) reward$Adapter.boost_attributesAdapter).lambda.invoke();
        realGlobalSearchRepository.getClass();
        activitySectionPresenter$Factory$Impl.getClass();
        rowSectionPresenter$Factory$Impl.getClass();
        realGlobalSearchAnalyticsContext.getClass();
        realGlobalSearchAnalyticsHelper2.getClass();
        analytics2.getClass();
        androidStringManager2.getClass();
        this.responseContextHandler = new StuckPlayerDetector(screenNavigator, globalSearchScreen, realGlobalSearchRepository, activitySectionPresenter$Factory$Impl, rowSectionPresenter$Factory$Impl, realGlobalSearchAnalyticsContext, realGlobalSearchAnalyticsHelper2, analytics2, androidStringManager2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSettingChanged(LocalEditorialPresenter localEditorialPresenter, SearchPrivacySectionViewEvent.SettingToggled settingToggled, ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1, ContinuationImpl continuationImpl) {
        RealSearchPrivacySettingsPresenter$handleSettingChanged$1 realSearchPrivacySettingsPresenter$handleSettingChanged$1;
        int i;
        SetSearchPrivacySettingsRequest setSearchPrivacySettingsRequest;
        ApiResult apiResult;
        AccountConfigureSearchPrivacySetting.SettingType settingType;
        if (continuationImpl instanceof RealSearchPrivacySettingsPresenter$handleSettingChanged$1) {
            realSearchPrivacySettingsPresenter$handleSettingChanged$1 = (RealSearchPrivacySettingsPresenter$handleSettingChanged$1) continuationImpl;
            int i2 = realSearchPrivacySettingsPresenter$handleSettingChanged$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSearchPrivacySettingsPresenter$handleSettingChanged$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSearchPrivacySettingsPresenter$handleSettingChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSearchPrivacySettingsPresenter$handleSettingChanged$1.label;
                int i3 = 14;
                String str = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SearchPrivacySectionViewEvent.SearchSettingType searchSettingType = settingToggled.f1042type;
                    boolean z = settingToggled.isChecked;
                    int ordinal = searchSettingType.ordinal();
                    if (ordinal == 0) {
                        setSearchPrivacySettingsRequest = new SetSearchPrivacySettingsRequest(Boolean.valueOf(z), (Boolean) (objArr2 == true ? 1 : 0), (Boolean) (objArr == true ? 1 : 0), i3);
                    } else if (ordinal == 1) {
                        setSearchPrivacySettingsRequest = new SetSearchPrivacySettingsRequest((Boolean) (objArr4 == true ? 1 : 0), (Boolean) (objArr3 == true ? 1 : 0), Boolean.valueOf(z), 11);
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        setSearchPrivacySettingsRequest = new SetSearchPrivacySettingsRequest((Boolean) (objArr6 == true ? 1 : 0), Boolean.valueOf(z), (Boolean) (objArr5 == true ? 1 : 0), 13);
                    }
                    SearchPrivacySectionViewEvent.SearchSettingType searchSettingType2 = settingToggled.f1042type;
                    shiftNotePresenter$models$1$1.getClass();
                    MutableState mutableState = shiftNotePresenter$models$1$1.$toastState$delegate;
                    mutableState.setValue(MapsKt__MapsKt.plus((Map) mutableState.getValue(), new Pair(searchSettingType2, Boolean.valueOf(z))));
                    CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) localEditorialPresenter.launcher;
                    realSearchPrivacySettingsPresenter$handleSettingChanged$1.L$0 = settingToggled;
                    realSearchPrivacySettingsPresenter$handleSettingChanged$1.L$1 = shiftNotePresenter$models$1$1;
                    realSearchPrivacySettingsPresenter$handleSettingChanged$1.label = 1;
                    obj = customerSearchClientService.setPrivacySettings(setSearchPrivacySettingsRequest, realSearchPrivacySettingsPresenter$handleSettingChanged$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    shiftNotePresenter$models$1$1 = realSearchPrivacySettingsPresenter$handleSettingChanged$1.L$1;
                    settingToggled = realSearchPrivacySettingsPresenter$handleSettingChanged$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    Timber.Forest forest = Timber.Forest;
                    SearchPrivacySectionViewEvent.SearchSettingType searchSettingType3 = settingToggled.f1042type;
                    boolean z2 = settingToggled.isChecked;
                    forest.d("Successfully updated %s setting to: %s", searchSettingType3, Boolean.valueOf(z2));
                    Analytics analytics = (Analytics) localEditorialPresenter.clock;
                    String activeAccountToken = PlatformKt.activeAccountToken((SessionManager) localEditorialPresenter.screen);
                    int ordinal2 = searchSettingType3.ordinal();
                    if (ordinal2 == 0) {
                        settingType = AccountConfigureSearchPrivacySetting.SettingType.NAME;
                    } else if (ordinal2 == 1) {
                        settingType = AccountConfigureSearchPrivacySetting.SettingType.PHONE;
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        settingType = AccountConfigureSearchPrivacySetting.SettingType.EMAIL;
                    }
                    analytics.track(new AccountConfigureSearchPrivacySetting(activeAccountToken, settingType, z2 ? AccountConfigureSearchPrivacySetting.ToggleState.ON : AccountConfigureSearchPrivacySetting.ToggleState.OFF), null);
                    shiftNotePresenter$models$1$1.getClass();
                    MutableState mutableState2 = shiftNotePresenter$models$1$1.$toastState$delegate;
                    mutableState2.setValue(MapsKt__MapsKt.plus((Map) mutableState2.getValue(), new Pair(searchSettingType3, Boolean.valueOf(z2))));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) localEditorialPresenter.stringManager, (ApiResult.Failure) apiResult, new Integer(R.string.profile_error_message_update)).message, str, i3));
                    SearchPrivacySectionViewEvent.SearchSettingType searchSettingType4 = settingToggled.f1042type;
                    boolean z3 = !settingToggled.isChecked;
                    shiftNotePresenter$models$1$1.getClass();
                    MutableState mutableState3 = shiftNotePresenter$models$1$1.$toastState$delegate;
                    mutableState3.setValue(MapsKt__MapsKt.plus((Map) mutableState3.getValue(), new Pair(searchSettingType4, Boolean.valueOf(z3))));
                }
                return Unit.INSTANCE;
            }
        }
        realSearchPrivacySettingsPresenter$handleSettingChanged$1 = new RealSearchPrivacySettingsPresenter$handleSettingChanged$1(localEditorialPresenter, continuationImpl);
        Object obj2 = realSearchPrivacySettingsPresenter$handleSettingChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSearchPrivacySettingsPresenter$handleSettingChanged$1.label;
        int i32 = 14;
        String str2 = null;
        Object[] objArr7 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        Object[] objArr42 = 0;
        Object[] objArr52 = 0;
        Object[] objArr62 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$logPresentTypePicker(LocalEditorialPresenter localEditorialPresenter, ContinuationImpl continuationImpl) {
        StockMetricTypePickerPresenter$logPresentTypePicker$1 stockMetricTypePickerPresenter$logPresentTypePicker$1;
        int i;
        StockSource stockSource;
        StockSource stockSource2;
        Sort sortType;
        InvestingScreens.StockMetricTypePicker stockMetricTypePicker = (InvestingScreens.StockMetricTypePicker) localEditorialPresenter.screen;
        if (continuationImpl instanceof StockMetricTypePickerPresenter$logPresentTypePicker$1) {
            stockMetricTypePickerPresenter$logPresentTypePicker$1 = (StockMetricTypePickerPresenter$logPresentTypePicker$1) continuationImpl;
            int i2 = stockMetricTypePickerPresenter$logPresentTypePicker$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stockMetricTypePickerPresenter$logPresentTypePicker$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stockMetricTypePickerPresenter$logPresentTypePicker$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stockMetricTypePickerPresenter$logPresentTypePicker$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = stockMetricTypePicker.metricType.ordinal();
                    if (ordinal == 0) {
                        stockSource = StockSource.STOCKS_I_OWN;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        stockSource = StockSource.FOLLOW;
                    }
                    int ordinal2 = stockMetricTypePicker.metricType.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        sortType = Position.getSortType((FollowingStockMetricType) ((EnumPreference) localEditorialPresenter.service).get());
                        ((Analytics) localEditorialPresenter.installedStore).track(new StockViewPresentSortBy(sortType, stockSource), null);
                        return Unit.INSTANCE;
                    }
                    KeyValue keyValue = (KeyValue) localEditorialPresenter.launcher;
                    stockMetricTypePickerPresenter$logPresentTypePicker$1.L$0 = stockSource;
                    stockMetricTypePickerPresenter$logPresentTypePicker$1.label = 1;
                    Object obj2 = keyValue.get(stockMetricTypePickerPresenter$logPresentTypePicker$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    stockSource2 = stockSource;
                    obj = obj2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stockSource2 = stockMetricTypePickerPresenter$logPresentTypePicker$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                StockSource stockSource3 = stockSource2;
                sortType = Position.getSortType((PortfolioStockMetricType) obj);
                stockSource = stockSource3;
                ((Analytics) localEditorialPresenter.installedStore).track(new StockViewPresentSortBy(sortType, stockSource), null);
                return Unit.INSTANCE;
            }
        }
        stockMetricTypePickerPresenter$logPresentTypePicker$1 = new StockMetricTypePickerPresenter$logPresentTypePicker$1(localEditorialPresenter, continuationImpl);
        Object obj3 = stockMetricTypePickerPresenter$logPresentTypePicker$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stockMetricTypePickerPresenter$logPresentTypePicker$1.label;
        if (i != 0) {
        }
        StockSource stockSource32 = stockSource2;
        sortType = Position.getSortType((PortfolioStockMetricType) obj3);
        stockSource = stockSource32;
        ((Analytics) localEditorialPresenter.installedStore).track(new StockViewPresentSortBy(sortType, stockSource), null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$saveAutofill(LocalEditorialPresenter localEditorialPresenter, Map map, String str, Function1 function1, Function0 function0, ContinuationImpl continuationImpl) {
        AutofillPresenter$saveAutofill$1 autofillPresenter$saveAutofill$1;
        int i;
        Function1 function12;
        Object obj;
        Function0 function02;
        ApiResult apiResult;
        if (continuationImpl instanceof AutofillPresenter$saveAutofill$1) {
            autofillPresenter$saveAutofill$1 = (AutofillPresenter$saveAutofill$1) continuationImpl;
            int i2 = autofillPresenter$saveAutofill$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                autofillPresenter$saveAutofill$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = autofillPresenter$saveAutofill$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autofillPresenter$saveAutofill$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ShippingAddressService shippingAddressService = (ShippingAddressService) localEditorialPresenter.service;
                    map.getClass();
                    str.getClass();
                    Action.Type.Companion companion = ShippingAddressSource.Companion;
                    CreateShippingAddressRequest createShippingAddressRequest = new CreateShippingAddressRequest(UUID.randomUUID().toString(), new CreateShippingAddressRequest.ShippingAddress(str, AutofillMapperKt.getFullName(map), AutofillMapperKt.getGlobalAddress(map), AutofillMapperKt.getPhone(map), AutofillMapperKt.getOrNull(map, AutofillWebField.EMAIL), 388));
                    function12 = function1;
                    autofillPresenter$saveAutofill$1.L$2 = function12;
                    autofillPresenter$saveAutofill$1.L$3 = function0;
                    autofillPresenter$saveAutofill$1.label = 1;
                    Object createShippingAddress = shippingAddressService.createShippingAddress(createShippingAddressRequest, autofillPresenter$saveAutofill$1);
                    if (createShippingAddress == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = createShippingAddress;
                    function02 = function0;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function02 = autofillPresenter$saveAutofill$1.L$3;
                    Function1 function13 = autofillPresenter$saveAutofill$1.L$2;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                    function12 = function13;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    function12.invoke(apiResult);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function02.invoke();
                }
                return Unit.INSTANCE;
            }
        }
        autofillPresenter$saveAutofill$1 = new AutofillPresenter$saveAutofill$1(localEditorialPresenter, continuationImpl);
        Object obj22 = autofillPresenter$saveAutofill$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autofillPresenter$saveAutofill$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$startTransferFlow(LocalEditorialPresenter localEditorialPresenter, TransferProcessingScreen.Direction direction, OpenSourceKt$$ExternalSyntheticLambda11 openSourceKt$$ExternalSyntheticLambda11, ContinuationImpl continuationImpl) {
        TransferringPresenter$startTransferFlow$1 transferringPresenter$startTransferFlow$1;
        int i;
        OpenSourceKt$$ExternalSyntheticLambda11 openSourceKt$$ExternalSyntheticLambda112;
        String str;
        TransferProcessingScreen.Direction direction2;
        int ordinal;
        String str2;
        ResponseContext responseContext;
        TransferProcessingScreen transferProcessingScreen = (TransferProcessingScreen) localEditorialPresenter.screen;
        if (continuationImpl instanceof TransferringPresenter$startTransferFlow$1) {
            transferringPresenter$startTransferFlow$1 = (TransferringPresenter$startTransferFlow$1) continuationImpl;
            int i2 = transferringPresenter$startTransferFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                transferringPresenter$startTransferFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = transferringPresenter$startTransferFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferringPresenter$startTransferFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    ChannelFlowTransformLatest select = ((RealBalanceSnapshotManager) localEditorialPresenter.clock).select();
                    transferringPresenter$startTransferFlow$1.L$0 = direction;
                    openSourceKt$$ExternalSyntheticLambda112 = openSourceKt$$ExternalSyntheticLambda11;
                    transferringPresenter$startTransferFlow$1.L$1 = openSourceKt$$ExternalSyntheticLambda112;
                    transferringPresenter$startTransferFlow$1.L$2 = generateToken;
                    transferringPresenter$startTransferFlow$1.label = 1;
                    Object first = FlowKt.first(select, transferringPresenter$startTransferFlow$1);
                    if (first != coroutineSingletons) {
                        str = generateToken;
                        obj = first;
                        direction2 = direction;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    str = transferringPresenter$startTransferFlow$1.L$2;
                    OpenSourceKt$$ExternalSyntheticLambda11 openSourceKt$$ExternalSyntheticLambda113 = transferringPresenter$startTransferFlow$1.L$1;
                    TransferProcessingScreen.Direction direction3 = transferringPresenter$startTransferFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    openSourceKt$$ExternalSyntheticLambda112 = openSourceKt$$ExternalSyntheticLambda113;
                    direction2 = direction3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = transferringPresenter$startTransferFlow$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        responseContext = (ResponseContext) obj;
                        String str3 = str2;
                        if (responseContext != null) {
                            return Unit.INSTANCE;
                        }
                        ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(((BlockersDataNavigator) localEditorialPresenter.installedStore).getNext(transferProcessingScreen, FlowStarter.startFlow$default((FlowStarter) localEditorialPresenter.service, BlockersData.Flow.CLIENT_SCENARIO, transferProcessingScreen.origin, null, ClientScenario.PLASMA, str3, null, null, null, null, 980).updateFromResponseContext(responseContext, false)));
                        return Unit.INSTANCE;
                    }
                    str2 = transferringPresenter$startTransferFlow$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    responseContext = (ResponseContext) obj;
                    String str32 = str2;
                    if (responseContext != null) {
                    }
                }
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                ordinal = direction2.ordinal();
                if (ordinal != 0) {
                    transferringPresenter$startTransferFlow$1.L$0 = null;
                    transferringPresenter$startTransferFlow$1.L$1 = null;
                    transferringPresenter$startTransferFlow$1.L$2 = str;
                    transferringPresenter$startTransferFlow$1.label = 2;
                    obj = localEditorialPresenter.initiateTransferInFlow(str, balanceSnapshot, openSourceKt$$ExternalSyntheticLambda112, transferringPresenter$startTransferFlow$1);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                        responseContext = (ResponseContext) obj;
                        String str322 = str2;
                        if (responseContext != null) {
                        }
                    }
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    transferringPresenter$startTransferFlow$1.L$0 = null;
                    transferringPresenter$startTransferFlow$1.L$1 = null;
                    transferringPresenter$startTransferFlow$1.L$2 = str;
                    transferringPresenter$startTransferFlow$1.label = 3;
                    obj = localEditorialPresenter.initiateTransferOutFlow(str, balanceSnapshot, openSourceKt$$ExternalSyntheticLambda112, transferringPresenter$startTransferFlow$1);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                        responseContext = (ResponseContext) obj;
                        String str3222 = str2;
                        if (responseContext != null) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        transferringPresenter$startTransferFlow$1 = new TransferringPresenter$startTransferFlow$1(localEditorialPresenter, continuationImpl);
        Object obj2 = transferringPresenter$startTransferFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferringPresenter$startTransferFlow$1.label;
        if (i != 0) {
        }
        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) obj2;
        ordinal = direction2.ordinal();
        if (ordinal != 0) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r13 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        if (r13 == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitUpdatedInfo(LocalEditorialPresenter localEditorialPresenter, AutofillCombinedInfo autofillCombinedInfo, String str, String str2, OverridingUtil.AnonymousClass7 anonymousClass7, QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1, ContinuationImpl continuationImpl) {
        EditAutofillPresenter$submitUpdatedInfo$1 editAutofillPresenter$submitUpdatedInfo$1;
        int i;
        ApiResult apiResult;
        ShippingAddressService shippingAddressService = (ShippingAddressService) localEditorialPresenter.launcher;
        if (continuationImpl instanceof EditAutofillPresenter$submitUpdatedInfo$1) {
            editAutofillPresenter$submitUpdatedInfo$1 = (EditAutofillPresenter$submitUpdatedInfo$1) continuationImpl;
            int i2 = editAutofillPresenter$submitUpdatedInfo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                editAutofillPresenter$submitUpdatedInfo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = editAutofillPresenter$submitUpdatedInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = editAutofillPresenter$submitUpdatedInfo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Screen screen = ((EditAutofillScreen) localEditorialPresenter.clock).origin;
                    if (screen instanceof AutofillScreen.SaveAutofillScreen) {
                        CreateShippingAddressRequest createShippingAddressRequest = new CreateShippingAddressRequest(UUID.randomUUID().toString(), InputViewModelExtKt.toCreateShippingAddress(autofillCombinedInfo));
                        editAutofillPresenter$submitUpdatedInfo$1.L$3 = anonymousClass7;
                        editAutofillPresenter$submitUpdatedInfo$1.L$4 = quickPayViewKt$QuickPay$1$1$1$2$1$3$1;
                        editAutofillPresenter$submitUpdatedInfo$1.label = 1;
                        obj = shippingAddressService.createShippingAddress(createShippingAddressRequest, editAutofillPresenter$submitUpdatedInfo$1);
                    } else if ((screen instanceof AutofillScreen.UpdateAutofillScreen) || (screen instanceof AutofillScreen.OfferAutofillScreen)) {
                        UpdateShippingAddressRequest updateShippingAddressRequest = new UpdateShippingAddressRequest(str2, str, InputViewModelExtKt.toUpdateShippingAddress(autofillCombinedInfo));
                        editAutofillPresenter$submitUpdatedInfo$1.L$3 = anonymousClass7;
                        editAutofillPresenter$submitUpdatedInfo$1.L$4 = quickPayViewKt$QuickPay$1$1$1$2$1$3$1;
                        editAutofillPresenter$submitUpdatedInfo$1.label = 2;
                        obj = shippingAddressService.updateShippingAddress(updateShippingAddressRequest, editAutofillPresenter$submitUpdatedInfo$1);
                    } else {
                        apiResult = null;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = editAutofillPresenter$submitUpdatedInfo$1.L$4;
                    anonymousClass7 = editAutofillPresenter$submitUpdatedInfo$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        localEditorialPresenter.responseContextHandler = ((CreateShippingAddressResponse) ((ApiResult.Success) apiResult).response).shipping_address;
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = editAutofillPresenter$submitUpdatedInfo$1.L$4;
                    anonymousClass7 = editAutofillPresenter$submitUpdatedInfo$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        localEditorialPresenter.responseContextHandler = ((UpdateShippingAddressResponse) ((ApiResult.Success) apiResult).response).shipping_address;
                    }
                }
                if (apiResult != null) {
                    if (apiResult instanceof ApiResult.Failure) {
                        anonymousClass7.invoke(apiResult);
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
        }
        editAutofillPresenter$submitUpdatedInfo$1 = new EditAutofillPresenter$submitUpdatedInfo$1(localEditorialPresenter, continuationImpl);
        Object obj2 = editAutofillPresenter$submitUpdatedInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = editAutofillPresenter$submitUpdatedInfo$1.label;
        if (i != 0) {
        }
        if (apiResult != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$syncPrepurchaseCashCard(LocalEditorialPresenter localEditorialPresenter, Function1 function1, Function0 function0, ContinuationImpl continuationImpl) {
        PrepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1 prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof PrepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1) {
            prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1 = (PrepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1) continuationImpl;
            int i2 = prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = (RealPrepurchaseCashCardRepository) localEditorialPresenter.launcher;
                    SyncPrepurchaseCashCardRequest syncPrepurchaseCashCardRequest = new SyncPrepurchaseCashCardRequest(null, ByteString.EMPTY);
                    prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.L$0 = function1;
                    prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.L$1 = function0;
                    prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.label = 1;
                    obj = realPrepurchaseCashCardRepository.lendingAppService.syncPrepurchaseCashCard(syncPrepurchaseCashCardRequest, prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function0 = prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.L$1;
                    function1 = prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    function1.invoke(((ApiResult.Success) apiResult).response);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to sync prepurchase cash card.", new Object[0]);
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }
        prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1 = new PrepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1(localEditorialPresenter, continuationImpl);
        Object obj2 = prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = prepurchaseCashCardPlanningPresenter$syncPrepurchaseCashCard$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static final Theme access$toCdfTheme(LocalEditorialPresenter localEditorialPresenter, PaymentPadTheme paymentPadTheme) {
        int ordinal = paymentPadTheme.ordinal();
        if (ordinal == 0) {
            return Theme.DEFAULT;
        }
        if (ordinal == 1) {
            return Theme.BLACK;
        }
        if (ordinal == 2) {
            return Theme.PINK;
        }
        if (ordinal == 3) {
            return Theme.GLITTER;
        }
        if (ordinal == 4) {
            return Theme.TORTOISE;
        }
        if (ordinal == 5) {
            return Theme.BRAT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$updateAutofill(LocalEditorialPresenter localEditorialPresenter, Map map, String str, String str2, Function1 function1, Function0 function0, ContinuationImpl continuationImpl) {
        AutofillPresenter$updateAutofill$1 autofillPresenter$updateAutofill$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof AutofillPresenter$updateAutofill$1) {
            autofillPresenter$updateAutofill$1 = (AutofillPresenter$updateAutofill$1) continuationImpl;
            int i2 = autofillPresenter$updateAutofill$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                autofillPresenter$updateAutofill$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = autofillPresenter$updateAutofill$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autofillPresenter$updateAutofill$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShippingAddressService shippingAddressService = (ShippingAddressService) localEditorialPresenter.service;
                    map.getClass();
                    Action.Type.Companion companion = ShippingAddressSource.Companion;
                    UpdateShippingAddressRequest updateShippingAddressRequest = new UpdateShippingAddressRequest(str2, str, new UpdateShippingAddressRequest.ShippingAddress(AutofillMapperKt.getFullName(map), AutofillMapperKt.getGlobalAddress(map), AutofillMapperKt.getPhone(map), AutofillMapperKt.getOrNull(map, AutofillWebField.EMAIL)));
                    autofillPresenter$updateAutofill$1.L$3 = function1;
                    autofillPresenter$updateAutofill$1.L$4 = function0;
                    autofillPresenter$updateAutofill$1.label = 1;
                    obj = shippingAddressService.updateShippingAddress(updateShippingAddressRequest, autofillPresenter$updateAutofill$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function0 = autofillPresenter$updateAutofill$1.L$4;
                    function1 = autofillPresenter$updateAutofill$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    function1.invoke(apiResult);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }
        autofillPresenter$updateAutofill$1 = new AutofillPresenter$updateAutofill$1(localEditorialPresenter, continuationImpl);
        Object obj2 = autofillPresenter$updateAutofill$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autofillPresenter$updateAutofill$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    public static Integer getScoreChange(CashCreditScoreHomeData cashCreditScoreHomeData) {
        Integer num;
        Integer num2;
        CashCreditScoreHomeData.ScoreSummary scoreSummary = cashCreditScoreHomeData.score_summary;
        if (scoreSummary == null || (num = scoreSummary.score) == null) {
            return null;
        }
        int intValue = num.intValue();
        if (scoreSummary == null || (num2 = scoreSummary.previous_score) == null) {
            return null;
        }
        return Integer.valueOf(intValue - num2.intValue());
    }

    private final Object models$com$squareup$cash$directdeposit$presenters$DirectDepositUpdateManualFormDetailsPresenter(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        boolean z;
        String format2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1299834408);
        final int i2 = 0;
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new Recipient$$ExternalSyntheticLambda2(11);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState5 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = new Recipient$$ExternalSyntheticLambda2(12);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState7 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        int i3 = 26;
        if (rememberedValue4 == obj) {
            Object cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealJurisdictionConfigManager) this.clock).select(), i3);
            gapComposer.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
            rememberedValue4 = cardModelView$cardHeat$$inlined$map$1;
        }
        Object collectAsState = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(new Versioned(Unit.INSTANCE, 0));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState8 = (MutableState) rememberedValue5;
        Versioned versioned = (Versioned) mutableState8.getValue();
        boolean changed = gapComposer.changed(mutableState5) | gapComposer.changed(mutableState6) | gapComposer.changedInstance(this) | gapComposer.changed(collectAsState);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == obj) {
            Object engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(this, mutableState5, mutableState6, mutableState7, collectAsState, (Continuation) null, 28);
            mutableState = mutableState6;
            mutableState2 = mutableState8;
            mutableState3 = mutableState7;
            mutableState4 = mutableState5;
            gapComposer.updateRememberedValue(engineInterceptor$intercept$2);
            rememberedValue6 = engineInterceptor$intercept$2;
        } else {
            mutableState4 = mutableState5;
            mutableState = mutableState6;
            mutableState2 = mutableState8;
            mutableState3 = mutableState7;
        }
        Updater.LaunchedEffect(gapComposer, versioned, (Function2) rememberedValue6);
        Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, mutableState4, mutableState2, 20));
        if (((DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm) mutableState4.getValue()) == null) {
            DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel = (DirectDepositUpdateManualFormDetailsViewModel) mutableState.getValue();
            gapComposer.end(false);
            return directDepositUpdateManualFormDetailsViewModel;
        }
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue7 = gapComposer.rememberedValue();
        final int i4 = 1;
        if (changedInstance || rememberedValue7 == obj) {
            rememberedValue7 = new EarningsHomePresenter$models$3$1(this, mutableState3, continuation, i4);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue7);
        final DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm directDepositUpdateManualFormDetailsPresenter$DirectDepositForm = (DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm) mutableState4.getValue();
        if (directDepositUpdateManualFormDetailsPresenter$DirectDepositForm == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        boolean z2 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.addSignature;
        String str = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.companyName;
        String str2 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.fullName;
        Object[] objArr3 = {str2};
        boolean changedInstance2 = gapComposer.changedInstance(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == obj) {
            rememberedValue8 = new Function0() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i5 = i2;
                    DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm;
                    switch (i5) {
                        case 0:
                            String str3 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.fullName;
                            if (str3 == null) {
                                str3 = "";
                            }
                            return Updater.mutableStateOf$default(str3);
                        case 1:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.companyName);
                        case 2:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.paycheckDepositAllocation);
                        default:
                            return Updater.mutableStateOf$default(Boolean.valueOf(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.addSignature));
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue8, gapComposer, 0);
        Object[] objArr4 = {str};
        boolean changedInstance3 = gapComposer.changedInstance(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue9 == obj) {
            rememberedValue9 = new Function0() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i5 = i4;
                    DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm;
                    switch (i5) {
                        case 0:
                            String str3 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.fullName;
                            if (str3 == null) {
                                str3 = "";
                            }
                            return Updater.mutableStateOf$default(str3);
                        case 1:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.companyName);
                        case 2:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.paycheckDepositAllocation);
                        default:
                            return Updater.mutableStateOf$default(Boolean.valueOf(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.addSignature));
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState10 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue9, gapComposer, 0);
        Object[] objArr5 = new Object[0];
        boolean changedInstance4 = gapComposer.changedInstance(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue10 == obj) {
            final int i5 = 2;
            rememberedValue10 = new Function0() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i5;
                    DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm;
                    switch (i52) {
                        case 0:
                            String str3 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.fullName;
                            if (str3 == null) {
                                str3 = "";
                            }
                            return Updater.mutableStateOf$default(str3);
                        case 1:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.companyName);
                        case 2:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.paycheckDepositAllocation);
                        default:
                            return Updater.mutableStateOf$default(Boolean.valueOf(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.addSignature));
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState11 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue10, gapComposer, 0);
        Object[] objArr6 = {Boolean.valueOf(z2)};
        boolean changedInstance5 = gapComposer.changedInstance(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue11 == obj) {
            final int i6 = 3;
            rememberedValue11 = new Function0() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i6;
                    DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm;
                    switch (i52) {
                        case 0:
                            String str3 = directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.fullName;
                            if (str3 == null) {
                                str3 = "";
                            }
                            return Updater.mutableStateOf$default(str3);
                        case 1:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.companyName);
                        case 2:
                            return Updater.mutableStateOf$default(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.paycheckDepositAllocation);
                        default:
                            return Updater.mutableStateOf$default(Boolean.valueOf(directDepositUpdateManualFormDetailsPresenter$DirectDepositForm2.addSignature));
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState12 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) rememberedValue11, gapComposer, 0);
        boolean changed2 = gapComposer.changed(mutableState9);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue12 == obj) {
            rememberedValue12 = new HeroTagViewKt$$ExternalSyntheticLambda12(14, mutableState9);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        Function2 function2 = (Function2) rememberedValue12;
        ProvidableCompositionLocal providableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(providableCompositionLocal);
        boolean changed3 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue13 == obj) {
            z = z2;
            rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 25);
            gapComposer.updateRememberedValue(rememberedValue13);
        } else {
            z = z2;
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue13, gapComposer);
        boolean changed4 = gapComposer.changed(mutableState10);
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue14 == obj) {
            rememberedValue14 = new HeroTagViewKt$$ExternalSyntheticLambda12(15, mutableState10);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        Function2 function22 = (Function2) rememberedValue14;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer.consume(providableCompositionLocal);
        boolean changed5 = gapComposer.changed(function22) | gapComposer.changedInstance(answerDispatcher2);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue15 == obj) {
            rememberedValue15 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 26);
            gapComposer.updateRememberedValue(rememberedValue15);
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue15, gapComposer);
        boolean changed6 = gapComposer.changed(mutableState11);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue16 == obj) {
            rememberedValue16 = new HeroTagViewKt$$ExternalSyntheticLambda12(16, mutableState11);
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        Function2 function23 = (Function2) rememberedValue16;
        AnswerDispatcher answerDispatcher3 = (AnswerDispatcher) gapComposer.consume(providableCompositionLocal);
        boolean changed7 = gapComposer.changed(function23) | gapComposer.changedInstance(answerDispatcher3);
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (changed7 || rememberedValue17 == obj) {
            rememberedValue17 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function23, answerDispatcher3, 27);
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        Updater.DisposableEffect(answerDispatcher3, (Function1) rememberedValue17, gapComposer);
        boolean z3 = z;
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState12, mutableState9, mutableState10, mutableState11, mutableState3, 15));
        boolean z4 = (Intrinsics.areEqual((String) mutableState9.getValue(), str2) && Intrinsics.areEqual((String) mutableState10.getValue(), str) && Intrinsics.areEqual((PaycheckDepositAllocation) mutableState11.getValue(), directDepositUpdateManualFormDetailsPresenter$DirectDepositForm.paycheckDepositAllocation) && ((Boolean) mutableState12.getValue()).booleanValue() == z3) ? false : true;
        String str3 = (String) mutableState9.getValue();
        String str4 = (String) mutableState10.getValue();
        PaycheckDepositAllocation paycheckDepositAllocation = (PaycheckDepositAllocation) mutableState11.getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        Resources resources = androidStringManager.resources;
        paycheckDepositAllocation.getClass();
        if (paycheckDepositAllocation.equals(PaycheckDepositAllocation.All.INSTANCE)) {
            format2 = androidStringManager.get(R.string.direct_deposit_manual_paycheck_all);
        } else if (paycheckDepositAllocation instanceof PaycheckDepositAllocation.Percentage) {
            Object[] objArr7 = {Integer.valueOf(((PaycheckDepositAllocation.Percentage) paycheckDepositAllocation).percentage)};
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.direct_deposit_manual_paycheck_percent)).format(objArr7);
            format2.getClass();
        } else {
            if (!(paycheckDepositAllocation instanceof PaycheckDepositAllocation.CurrencyAmount)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String format3 = ((MoneyFormatter) ((Lazy) this.responseContextHandler).getValue()).format(((PaycheckDepositAllocation.CurrencyAmount) paycheckDepositAllocation).amount);
            format3.getClass();
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.direct_deposit_manual_paycheck_amount)).format(new Object[]{format3});
            format2.getClass();
        }
        mutableState.setValue(new DirectDepositUpdateManualFormDetailsViewModel.Content(str3, str4, format2, ((Boolean) mutableState12.getValue()).booleanValue(), z4));
        DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel2 = (DirectDepositUpdateManualFormDetailsViewModel) mutableState.getValue();
        gapComposer.end(false);
        return directDepositUpdateManualFormDetailsViewModel2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$family$requestsponsorship$presenters$SelectContactMethodPresenter(Flow flow, Composer composer, int i) {
        Object content;
        List list;
        Object obj;
        String str;
        List list2;
        Object obj2;
        String str2;
        SelectContactMethodScreen selectContactMethodScreen = (SelectContactMethodScreen) this.screen;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(103313797);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new Transform$special$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$filter$1(((RealContactBook) this.launcher).detailedContacts, 22), this, 7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        PhoneNumbers.Format format2 = null;
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, (Continuation) (0 == true ? 1 : 0), (Object) this, (Object) mutableState, 17));
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            content = SelectContactMethodViewModel.Loading.INSTANCE;
        } else {
            Recipient recipient = selectContactMethodScreen.recipient;
            BlockersData blockersData = selectContactMethodScreen.blockersData;
            String str3 = recipient.displayName;
            if (str3 == null) {
                str3 = "";
            }
            ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact = (ContactBook$Contact$DetailedContact) collectAsState.getValue();
            ArrayList smsNumberList = zzba.getSmsNumberList(recipient);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(smsNumberList, 10));
            Iterator it = smsNumberList.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                ContactMethod.Type type2 = ContactMethod.Type.Sms;
                String format3 = PhoneNumbers.format(str4, Regions.toCountry(blockersData.region).name(), format2);
                if (format3 == null) {
                    format3 = str4;
                }
                if (contactBook$Contact$DetailedContact != null && (list2 = contactBook$Contact$DetailedContact.phoneNumbers) != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next = it2.next();
                        if (Intrinsics.areEqual(PhoneNumbers.normalize(((ContactBook$Contact$DetailedContact.LabeledData) next).value, Regions.toCountry(blockersData.region).name()), str4)) {
                            obj2 = next;
                            break;
                        }
                    }
                    ContactBook$Contact$DetailedContact.LabeledData labeledData = (ContactBook$Contact$DetailedContact.LabeledData) obj2;
                    if (labeledData != null && (str2 = labeledData.label) != null && (r2 = toContactMethodLabel(str2)) != null) {
                        arrayList.add(new ContactMethod(type2, format3, r2, new SelectContactMethodViewEvent.Select(Recipient.copy$default(selectContactMethodScreen.recipient, null, str4, null, str4, null, null, null, false, false, -26113, 3))));
                        recipient = recipient;
                        format2 = null;
                    }
                }
                String str5 = "";
                arrayList.add(new ContactMethod(type2, format3, str5, new SelectContactMethodViewEvent.Select(Recipient.copy$default(selectContactMethodScreen.recipient, null, str4, null, str4, null, null, null, false, false, -26113, 3))));
                recipient = recipient;
                format2 = null;
            }
            ArrayList emailAddressList = zzba.getEmailAddressList(recipient);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(emailAddressList, 10));
            for (Iterator it3 = emailAddressList.iterator(); it3.hasNext(); it3 = it3) {
                String str6 = (String) it3.next();
                ContactMethod.Type type3 = ContactMethod.Type.Email;
                if (contactBook$Contact$DetailedContact != null && (list = contactBook$Contact$DetailedContact.emailAddresses) != null) {
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it4.next();
                        if (Intrinsics.areEqual(((ContactBook$Contact$DetailedContact.LabeledData) obj).value, str6)) {
                            break;
                        }
                    }
                    ContactBook$Contact$DetailedContact.LabeledData labeledData2 = (ContactBook$Contact$DetailedContact.LabeledData) obj;
                    if (labeledData2 != null && (str = labeledData2.label) != null && (r8 = toContactMethodLabel(str)) != null) {
                        arrayList2.add(new ContactMethod(type3, str6, r8, new SelectContactMethodViewEvent.Select(Recipient.copy$default(selectContactMethodScreen.recipient, str6, null, str6, null, null, null, null, false, false, -26113, 3))));
                    }
                }
                String str7 = "";
                arrayList2.add(new ContactMethod(type3, str6, str7, new SelectContactMethodViewEvent.Select(Recipient.copy$default(selectContactMethodScreen.recipient, str6, null, str6, null, null, null, null, false, false, -26113, 3))));
            }
            ArrayList plus = CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList);
            if (plus.size() < 2) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(plus.size(), "The recipient has ", " contact methods, but should have at least 2"));
                return null;
            }
            content = new SelectContactMethodViewModel.Content(str3, plus);
        }
        gapComposer.end(false);
        return content;
    }

    private final Object models$com$squareup$cash$favorites$presenters$ListFavoritesPresenter(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-426012545);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            RealDisclosureProvider$special$$inlined$map$1 realDisclosureProvider$special$$inlined$map$1 = new RealDisclosureProvider$special$$inlined$map$1(((RealProfileManager) this.clock).region(), 11);
            gapComposer.updateRememberedValue(realDisclosureProvider$special$$inlined$map$1);
            rememberedValue = realDisclosureProvider$special$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, Region.USA, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealFavoritesManager) this.service).getFavorites();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, emptyList, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = ((RealAllowlistRepository) this.installedStore).getAllowlistedTokensIfActive();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue3, EmptySet.INSTANCE, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(emptyList);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) rememberedValue4;
        List list = (List) collectAsState2.getValue();
        boolean changed = gapComposer.changed(collectAsState2) | gapComposer.changed(collectAsState3) | gapComposer.changedInstance(this) | gapComposer.changed(collectAsState);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed || rememberedValue5 == neverEqualPolicy) {
            mutableState = collectAsState2;
            MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(mutableState, collectAsState3, this, collectAsState, mutableState3, null, 13);
            mutableState2 = mutableState3;
            gapComposer.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
            rememberedValue5 = moleculeKt$immediateClockFlow$1$1$1;
        } else {
            mutableState = collectAsState2;
            mutableState2 = mutableState3;
        }
        Updater.LaunchedEffect(gapComposer, list, (Function2) rememberedValue5);
        Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, mutableState2, mutableState, 27));
        ListFavoritesViewModel listFavoritesViewModel = new ListFavoritesViewModel(new ToolbarViewModel(((AndroidStringManager) this.stringManager).get(R.string.favorites)), (List) mutableState2.getValue());
        gapComposer.end(false);
        return listFavoritesViewModel;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final java.lang.Object models$com$squareup$cash$globalsearch$presenters$GlobalSearchPresenter(kotlinx.coroutines.flow.Flow r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.cash.local.presenters.LocalEditorialPresenter.models$com$squareup$cash$globalsearch$presenters$GlobalSearchPresenter(kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int):java.lang.Object");
    }

    private final Object models$com$squareup$cash$history$presenters$CancelPaymentPresenter(Flow flow, Composer composer, int i) {
        HistoryScreens.CancelPayment cancelPayment = (HistoryScreens.CancelPayment) this.responseContextHandler;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(998301359);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new RealProfileManager$profileOrNull$2(this, continuation, 24);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, 5));
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            RealLegacyActivityEntityManager realLegacyActivityEntityManager = (RealLegacyActivityEntityManager) this.service;
            String str = cancelPayment.paymentToken;
            str.getClass();
            rememberedValue2 = FlowKt.mapLatest(new DataStoreImpl$data$1.AnonymousClass2(2, continuation, 25), FlowKt.transformLatest((Flow) realLegacyActivityEntityManager.javaScripter.invoke(), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, realLegacyActivityEntityManager, str, 12)));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            SafeFlow flow2 = DBUtil.toFlow(((CashAccountDatabaseImpl) this.clock).pendingPaymentQueries.pendingRequest(cancelPayment.paymentToken));
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(flow2, DefaultIoScheduler.INSTANCE), 13);
            gapComposer.updateRememberedValue(realCustomerStore$getCustomerForId$$inlined$map$1);
            rememberedValue3 = realCustomerStore$getCustomerForId$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        String str2 = (String) collectAsState.getValue();
        if (str2 == null) {
            str2 = ((AndroidStringManager) this.stringManager).get(((Orientation) collectAsState2.getValue()) == Orientation.BILL ? R.string.payment_cancel_dialog_message_bill : R.string.payment_cancel_dialog_message_cash);
        }
        CancelPaymentViewModel cancelPaymentViewModel = new CancelPaymentViewModel(str2);
        gapComposer.end(false);
        return cancelPaymentViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$initialscreenloader$presenters$AppUpgradePresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-620285571);
        Updater.LaunchedEffect(gapComposer, flow, new PasscodeDialogPresenter$models$1$1(flow, (Continuation) (0 == true ? 1 : 0), (Object) this, 17));
        AppUpgradeScreen appUpgradeScreen = (AppUpgradeScreen) this.responseContextHandler;
        String title = appUpgradeScreen.getTitle();
        String message = appUpgradeScreen.getMessage();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        AppUpgradeViewModel appUpgradeViewModel = new AppUpgradeViewModel(title, message, androidStringManager.get(R.string.update_required_positive), appUpgradeScreen.getRequired() ? null : androidStringManager.get(R.string.update_required_negative), appUpgradeScreen.getRequired() ? androidStringManager.get(R.string.update_required_web_escape_hatch) : null);
        gapComposer.end(false);
        return appUpgradeViewModel;
    }

    private final Object models$com$squareup$cash$investing$presenters$StockMetricTypePickerPresenter(Flow flow, Composer composer, int i) {
        StockMetricTypePickerViewModel stockMetricTypePickerViewModel;
        int i2;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        InvestingScreens.StockMetricTypePicker stockMetricTypePicker = (InvestingScreens.StockMetricTypePicker) this.screen;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-73072662);
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new RealKeyStoreProvider$load$2(this, continuation, 19);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 13));
        int ordinal = stockMetricTypePicker.metricType.ordinal();
        if (ordinal == 0) {
            gapComposer.startReplaceGroup(641734208);
            MutableState collectAsState = Updater.collectAsState(((KeyValue) this.responseContextHandler).observe(), PortfolioStockMetricType.TOTAL_PERCENT_RETURN, null, gapComposer, 48, 2);
            PortfolioStockMetricType[] values = PortfolioStockMetricType.values();
            ArrayList arrayList = new ArrayList(values.length);
            int length = values.length;
            for (int i3 = 0; i3 < length; i3++) {
                PortfolioStockMetricType portfolioStockMetricType = values[i3];
                if (stockMetricTypePicker.isDependent) {
                    portfolioStockMetricType.getClass();
                    switch (portfolioStockMetricType.ordinal()) {
                        case 0:
                            i2 = R.string.dependent_stock_metric_type_daily_percent_change;
                            break;
                        case 1:
                            i2 = R.string.dependent_stock_metric_type_daily_return;
                            break;
                        case 2:
                            i2 = R.string.dependent_stock_metric_type_total_return;
                            break;
                        case 3:
                            i2 = R.string.dependent_stock_metric_type_total_percent_return;
                            break;
                        case 4:
                            i2 = R.string.dependent_stock_metric_type_total_investment_value;
                            break;
                        case 5:
                            i2 = R.string.dependent_stock_metric_type_share_price;
                            break;
                        case 6:
                            i2 = R.string.dependent_stock_metric_type_market_cap;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                } else {
                    portfolioStockMetricType.getClass();
                    switch (portfolioStockMetricType.ordinal()) {
                        case 0:
                            i2 = R.string.stock_metric_type_daily_percent_change;
                            break;
                        case 1:
                            i2 = R.string.stock_metric_type_daily_return;
                            break;
                        case 2:
                            i2 = R.string.stock_metric_type_total_return;
                            break;
                        case 3:
                            i2 = R.string.stock_metric_type_total_percent_return;
                            break;
                        case 4:
                            i2 = R.string.stock_metric_type_total_investment_value;
                            break;
                        case 5:
                            i2 = R.string.stock_metric_type_share_price;
                            break;
                        case 6:
                            i2 = R.string.stock_metric_type_market_cap;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                }
                arrayList.add(new StockMetricTypePickerViewModel.Option.PortfolioOption(androidStringManager.get(i2), portfolioStockMetricType, portfolioStockMetricType == collectAsState.getValue()));
            }
            stockMetricTypePickerViewModel = new StockMetricTypePickerViewModel(arrayList);
            gapComposer.end(false);
        } else {
            if (ordinal != 1) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1503320132, false);
            }
            gapComposer.startReplaceGroup(642356967);
            gapComposer.end(false);
            FollowingStockMetricType followingStockMetricType = (FollowingStockMetricType) ((EnumPreference) this.service).get();
            FollowingStockMetricType[] values2 = FollowingStockMetricType.values();
            ArrayList arrayList2 = new ArrayList();
            for (FollowingStockMetricType followingStockMetricType2 : values2) {
                if (followingStockMetricType2 != FollowingStockMetricType.DEFAULT) {
                    arrayList2.add(followingStockMetricType2);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                FollowingStockMetricType followingStockMetricType3 = (FollowingStockMetricType) it.next();
                arrayList3.add(new StockMetricTypePickerViewModel.Option.FollowingOption(androidStringManager.get(Position.getDisplayLabelResId(followingStockMetricType3)), followingStockMetricType3, followingStockMetricType3 == followingStockMetricType || (followingStockMetricType3 == FollowingStockMetricType.DAILY_PERCENT_CHANGE && followingStockMetricType == FollowingStockMetricType.DEFAULT)));
            }
            stockMetricTypePickerViewModel = new StockMetricTypePickerViewModel(arrayList3);
        }
        gapComposer.end(false);
        return stockMetricTypePickerViewModel;
    }

    private final Object models$com$squareup$cash$moneybot$presenters$MoneybotChatHistoryPresenter(Flow flow, Composer composer, int i) {
        Object obj;
        String str;
        RealUserSessionPager realUserSessionPager = (RealUserSessionPager) this.service;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2122380203);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = FlowKt.asStateFlow(realUserSessionPager._sessions);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new CashMapPresenter$models$3$1((MoleculePresenter) this, mutableState, continuation, 19);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
        Updater.LaunchedEffect(gapComposer, flow, new MusicPresenter$models$1$1(flow, continuation, (MoleculePresenter) this, (State) parcelableSnapshotMutableIntState, 8));
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(502115191);
            gapComposer.end(false);
            obj = MoneybotChatHistoryViewModel.Error.INSTANCE;
        } else if (((Set) collectAsState.getValue()) == null) {
            gapComposer.startReplaceGroup(502117241);
            gapComposer.end(false);
            obj = MoneybotChatHistoryViewModel.Loading.INSTANCE;
        } else {
            Set set = (Set) collectAsState.getValue();
            set.getClass();
            if (set.isEmpty()) {
                gapComposer.startReplaceGroup(502119479);
                gapComposer.end(false);
                obj = MoneybotChatHistoryViewModel.Empty.INSTANCE;
            } else {
                gapComposer.startReplaceGroup(502121050);
                Set set2 = (Set) collectAsState.getValue();
                set2.getClass();
                List<Session> sortedWith = CollectionsKt.sortedWith(set2, new MoneybotChatHistoryPresenter$content$$inlined$sortedByDescending$1(0));
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                for (Session session : sortedWith) {
                    Long l = session.updatedAtMs;
                    if (l != null) {
                        long longValue = l.longValue();
                        RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) this.installedStore;
                        Instant ofEpochMilli = Instant.ofEpochMilli(longValue);
                        ofEpochMilli.getClass();
                        str = realTodayDateTimeFormatter.formatDate(ofEpochMilli, new TodayDateTimeFormatter$FormatOptions(89, null, null, null, true, false));
                    } else {
                        str = null;
                    }
                    String str2 = session.id;
                    String str3 = session.title;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new MoneybotChatHistoryViewModel.Content.Session(str2, str3, str, new MoneybotChatHistoryViewEvent.OpenChat(str2)));
                }
                MoneybotChatHistoryViewModel.Content content = new MoneybotChatHistoryViewModel.Content(CollectionsKt.toList(arrayList), ((Boolean) ((ParcelableSnapshotMutableState) this.stringManager).getValue()).booleanValue(), realUserSessionPager.hasMoreSessions, (String) ((ParcelableSnapshotMutableState) this.screen).getValue(), (MoneybotChatHistoryViewModel.Content.Error) ((ParcelableSnapshotMutableState) this.responseContextHandler).getValue());
                gapComposer.end(false);
                obj = content;
            }
        }
        gapComposer.end(false);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[EDGE_INSN: B:27:0x0096->B:28:0x0096 BREAK  A[LOOP:0: B:16:0x0073->B:42:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:0: B:16:0x0073->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction] */
    /* JADX WARN: Type inference failed for: r0v47, types: [androidx.credentials.Credential] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v52, types: [com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r14v13, types: [com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$LoadableText] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$PaymentPlanAction, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4, types: [com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$LoadableText] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.squareup.lending.PrepurchaseCashCardAppletData$UnknownContent] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.squareup.lending.PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$PaymentPlanAction, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.squareup.lending.PrepurchaseCashCardAppletData$UnknownContent] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.squareup.lending.PrepurchaseCashCardAppletData$FooterButtonContent] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.squareup.lending.PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.squareup.lending.PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52, types: [com.squareup.protos.cash.localization.LocalizedString, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$LocaleToggle] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [com.squareup.lending.PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [com.squareup.protos.cash.localization.LocalizedString] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [com.squareup.lending.PrepurchaseCashCardAppletData$FooterButtonContent] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [com.squareup.lending.PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [com.squareup.lending.PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter(Flow flow, Composer composer, int i) {
        int i2;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        boolean changedInstance3;
        Object rememberedValue3;
        Throwable th;
        Object rememberedValue4;
        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.LocaleToggle localeToggle;
        PrepurchaseCardPlanningState prepurchaseCardPlanningState;
        GapComposer gapComposer;
        Object obj;
        Object prepurchaseCardPaymentPlanOptionsSheet;
        Object obj2;
        Object obj3;
        ?? r20;
        String str;
        Iterator it;
        LocalBrandBannersKt localBrandBannersKt;
        ?? r5;
        ?? r3;
        LocalMenuItemsKt localMenuItemsKt;
        ?? r32;
        ?? r2;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        ?? r14;
        Object obj8;
        PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData;
        String str2;
        List list;
        Iterator it2;
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData;
        PrepurchaseCashCardPlanningViewModel.LoadableText.Loading loading;
        GapComposer gapComposer2;
        Object obj9;
        ?? r0;
        final String str3;
        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem.Style style;
        PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction paymentPlanAction;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData2;
        List list2;
        Object obj10;
        CashBannerKt cashBannerKt;
        PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction paymentPlanAction2;
        flow.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-1768311942);
        Object rememberedValue5 = gapComposer3.rememberedValue();
        int i3 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue5 == neverEqualPolicy) {
            RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = (RealPrepurchaseCashCardRepository) this.launcher;
            rememberedValue5 = new InviteContactsPresenter$special$$inlined$map$1(new RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1(realPrepurchaseCashCardRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PrepurchaseCashCardData), realPrepurchaseCashCardRepository, i3), this, 27);
            gapComposer3.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer3, 48, 2);
        GapComposer gapComposer4 = gapComposer3;
        Object rememberedValue6 = gapComposer4.rememberedValue();
        PrepurchaseCardPlanningState.HomeState homeState = PrepurchaseCardPlanningState.HomeState.INSTANCE;
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = Updater.mutableStateOf$default(homeState);
            gapComposer4.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer4.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue7 == neverEqualPolicy) {
            List list3 = (List) collectAsState.getValue();
            if (list3 != null && (prepurchaseCashCardAppletData2 = (PrepurchaseCashCardAppletData) CollectionsKt.last(list3)) != null && (list2 = prepurchaseCashCardAppletData2.info_rows) != null) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj10 = null;
                        break;
                    }
                    obj10 = it3.next();
                    CashBannerKt cashBannerKt2 = ((PrepurchaseCashCardAppletData.InfoRow) obj10).trailing_content;
                    if (cashBannerKt2 != null) {
                        PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction prepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction = cashBannerKt2 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt2 : null;
                        if (prepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction != null) {
                            paymentPlanAction2 = prepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction.value;
                            if (paymentPlanAction2 == null) {
                                break;
                            }
                        }
                    }
                    paymentPlanAction2 = null;
                    if (paymentPlanAction2 == null) {
                    }
                }
                PrepurchaseCashCardAppletData.InfoRow infoRow = (PrepurchaseCashCardAppletData.InfoRow) obj10;
                if (infoRow != null && (cashBannerKt = infoRow.trailing_content) != null) {
                    PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction prepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction2 = cashBannerKt instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt : null;
                    if (prepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction2 != null) {
                        paymentPlanAction = prepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction2.value;
                        rememberedValue7 = Updater.mutableStateOf$default(paymentPlanAction == null ? paymentPlanAction.initial_selected_option_identifier : null);
                        gapComposer4.updateRememberedValue(rememberedValue7);
                    }
                }
            }
            paymentPlanAction = null;
            rememberedValue7 = Updater.mutableStateOf$default(paymentPlanAction == null ? paymentPlanAction.initial_selected_option_identifier : null);
            gapComposer4.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState2 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer4.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = Updater.mutableStateOf$default(null);
            gapComposer4.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState3 = (MutableState) rememberedValue8;
        List list4 = (List) mutableState3.getValue();
        if (list4 == null) {
            list4 = (List) collectAsState.getValue();
        }
        List list5 = list4;
        Object[] objArr = new Object[0];
        Object rememberedValue9 = gapComposer4.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = new DateScrubber$$ExternalSyntheticLambda0(12);
            gapComposer4.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState4 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue9, gapComposer4, 48);
        if (list5 != null) {
            if (((String) mutableState4.getValue()) == null) {
                i2 = list5.size() - 1;
            } else {
                Iterator it4 = list5.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    PrepurchaseCashCardAppletData.Locale locale = ((PrepurchaseCashCardAppletData) it4.next()).locale;
                    if (Intrinsics.areEqual(locale != null ? locale.display_name : null, (String) mutableState4.getValue())) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
            }
            prepurchaseCashCardAppletData = list5 != null ? null : (PrepurchaseCashCardAppletData) list5.get(RangesKt___RangesKt.coerceIn(i2, 0, list5.size() - 1));
            Unit unit = Unit.INSTANCE;
            changedInstance = gapComposer4.changedInstance(this);
            rememberedValue = gapComposer4.rememberedValue();
            if (!changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PdfPreviewPresenter$models$1$1(this, mutableState3, mutableState, (Continuation) null);
                gapComposer4.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer4, unit, (Function2) rememberedValue);
            changedInstance2 = gapComposer4.changedInstance(this);
            rememberedValue2 = gapComposer4.rememberedValue();
            if (!changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ShoppingWebBridge.AnonymousClass1(this, continuation, 3);
                gapComposer4.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer4, unit, (Function2) rememberedValue2);
            PrepurchaseCardPlanningState prepurchaseCardPlanningState2 = (PrepurchaseCardPlanningState) mutableState.getValue();
            changedInstance3 = gapComposer4.changedInstance(this) | gapComposer4.changedInstance(prepurchaseCashCardAppletData);
            rememberedValue3 = gapComposer4.rememberedValue();
            if (!changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                AndroidFileSaver$save$2 androidFileSaver$save$2 = new AndroidFileSaver$save$2(this, prepurchaseCashCardAppletData, mutableState, continuation, 11);
                th = null;
                gapComposer4.updateRememberedValue(androidFileSaver$save$2);
                rememberedValue3 = androidFileSaver$save$2;
            } else {
                th = null;
            }
            Updater.LaunchedEffect(gapComposer4, prepurchaseCardPlanningState2, (Function2) rememberedValue3);
            rememberedValue4 = gapComposer4.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                gapComposer4.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState5 = (MutableState) rememberedValue4;
            PrepurchaseCashCardAppletData prepurchaseCashCardAppletData3 = prepurchaseCashCardAppletData;
            Updater.LaunchedEffect(gapComposer4, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState, mutableState5, mutableState2, mutableState3, mutableState4, 27));
            int i5 = 10;
            if (list5 != null || list5.size() <= 1) {
                localeToggle = th;
            } else {
                List list6 = list5;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                Iterator it5 = list6.iterator();
                while (it5.hasNext()) {
                    PrepurchaseCashCardAppletData.Locale locale2 = ((PrepurchaseCashCardAppletData) it5.next()).locale;
                    locale2.getClass();
                    String str4 = locale2.display_name;
                    str4.getClass();
                    arrayList.add(str4);
                }
                localeToggle = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.LocaleToggle(i2, arrayList);
            }
            prepurchaseCardPlanningState = (PrepurchaseCardPlanningState) mutableState.getValue();
            if (Intrinsics.areEqual(prepurchaseCardPlanningState, homeState)) {
                gapComposer = gapComposer4;
                if (Intrinsics.areEqual(prepurchaseCardPlanningState, PrepurchaseCardPlanningState.SelectPaymentPlanState.INSTANCE)) {
                    if (prepurchaseCashCardAppletData3 != null) {
                        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData2 = prepurchaseCashCardAppletData3.payment_plans_data;
                        String str5 = (String) mutableState2.getValue();
                        paymentPlansData2.getClass();
                        LocalizedString localizedString = paymentPlansData2.title;
                        localizedString.getClass();
                        String str6 = localizedString.translated_value;
                        str6.getClass();
                        LocalizedString localizedString2 = paymentPlansData2.subtitle;
                        ?? r202 = localizedString2 != null ? localizedString2.translated_value : th;
                        List list7 = paymentPlansData2.options;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                        int i6 = 0;
                        for (Object obj11 : list7) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw th;
                            }
                            PrepurchaseCashCardAppletData.PaymentPlansData.Option option = (PrepurchaseCashCardAppletData.PaymentPlansData.Option) obj11;
                            boolean areEqual = str5 != null ? Intrinsics.areEqual(option.identifier, str5) : i6 == 0;
                            String str7 = option.identifier;
                            str7.getClass();
                            LocalizedString localizedString3 = option.title;
                            localizedString3.getClass();
                            String str8 = localizedString3.translated_value;
                            str8.getClass();
                            LocalizedString localizedString4 = option.subtitle;
                            arrayList2.add(new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet.Option(str7, str8, localizedString4 != null ? localizedString4.translated_value : th, areEqual));
                            i6 = i7;
                        }
                        LocalizedString localizedString5 = paymentPlansData2.primary_button_text;
                        localizedString5.getClass();
                        String str9 = localizedString5.translated_value;
                        str9.getClass();
                        prepurchaseCardPaymentPlanOptionsSheet = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet(localeToggle, str6, r202, arrayList2, str9);
                        obj = prepurchaseCardPaymentPlanOptionsSheet;
                    }
                    obj = th;
                } else {
                    if (!(prepurchaseCardPlanningState instanceof PrepurchaseCardPlanningState.InfoState)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    obj = ((PrepurchaseCardPlanningState.InfoState) prepurchaseCardPlanningState).infoSheet;
                }
            } else if (prepurchaseCashCardAppletData3 != null) {
                String str10 = (String) mutableState2.getValue();
                List list8 = (List) mutableState5.getValue();
                list8.getClass();
                LocalizedString localizedString6 = prepurchaseCashCardAppletData3.title;
                PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData3 = prepurchaseCashCardAppletData3.payment_plans_data;
                ?? r19 = localizedString6 != null ? localizedString6.translated_value : th;
                r19.getClass();
                zztc zztcVar = prepurchaseCashCardAppletData3.loadable_subtitle;
                if (zztcVar != null) {
                    ?? r7 = zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent ? (PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) zztcVar : th;
                    if (r7 != 0) {
                        obj2 = r7.value;
                        PrepurchaseCashCardPlanningViewModel.LoadableText.Loading loading2 = PrepurchaseCashCardPlanningViewModel.LoadableText.Loading.INSTANCE;
                        if (obj2 == null) {
                            r20 = loading2;
                        } else {
                            if (zztcVar != null) {
                                ?? r52 = zztcVar instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle ? (PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) zztcVar : th;
                                ?? r53 = r52 != 0 ? r52.value : th;
                                if (r53 != 0 && (str = r53.translated_value) != null) {
                                    obj3 = new PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded(str);
                                    r20 = obj3;
                                }
                            }
                            obj3 = th;
                            r20 = obj3;
                        }
                        LocalizedString localizedString7 = prepurchaseCashCardAppletData3.info_rows_header;
                        ?? r21 = localizedString7 == null ? localizedString7.translated_value : th;
                        List list9 = prepurchaseCashCardAppletData3.info_rows;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                        it = list9.iterator();
                        while (it.hasNext()) {
                            PrepurchaseCashCardAppletData.InfoRow infoRow2 = (PrepurchaseCashCardAppletData.InfoRow) it.next();
                            LocalizedString localizedString8 = infoRow2.leading_text;
                            CashBannerKt cashBannerKt3 = infoRow2.trailing_content;
                            localizedString8.getClass();
                            String str11 = localizedString8.translated_value;
                            str11.getClass();
                            if (cashBannerKt3 != null) {
                                ?? r142 = cashBannerKt3 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) cashBannerKt3 : th;
                                if (r142 != 0) {
                                    obj4 = r142.value;
                                    if (obj4 == null) {
                                        cashBannerKt3.getClass();
                                        obj5 = null;
                                        ?? r33 = cashBannerKt3 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) cashBannerKt3 : th;
                                        ?? r34 = r33 != 0 ? r33.value : th;
                                        r34.getClass();
                                        String str12 = r34.translated_value;
                                        str12.getClass();
                                        r14 = new PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded(str12);
                                    } else {
                                        obj5 = null;
                                        if (cashBannerKt3 != null) {
                                            ?? r35 = cashBannerKt3 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt3 : th;
                                            if (r35 != 0) {
                                                obj6 = r35.value;
                                                if (obj6 == null) {
                                                    paymentPlansData3.getClass();
                                                    List list10 = paymentPlansData3.options;
                                                    Iterator it6 = list10.iterator();
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            obj8 = th;
                                                            break;
                                                        }
                                                        obj8 = it6.next();
                                                        if (Intrinsics.areEqual(((PrepurchaseCashCardAppletData.PaymentPlansData.Option) obj8).identifier, str10)) {
                                                            break;
                                                        }
                                                    }
                                                    PrepurchaseCashCardAppletData.PaymentPlansData.Option option2 = (PrepurchaseCashCardAppletData.PaymentPlansData.Option) obj8;
                                                    if (option2 == null) {
                                                        option2 = (PrepurchaseCashCardAppletData.PaymentPlansData.Option) CollectionsKt.firstOrNull(list10);
                                                    }
                                                    PrepurchaseCashCardAppletData.PaymentPlansData.Option option3 = option2;
                                                    if (option3 != null) {
                                                        LocalizedString localizedString9 = option3.title;
                                                        localizedString9.getClass();
                                                        String str13 = localizedString9.translated_value;
                                                        str13.getClass();
                                                        r14 = new PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded(str13);
                                                    }
                                                    r14 = th;
                                                } else {
                                                    if (cashBannerKt3 != null) {
                                                        ?? r36 = cashBannerKt3 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) cashBannerKt3 : th;
                                                        if (r36 != 0) {
                                                            obj7 = r36.value;
                                                            if (obj7 != null) {
                                                                r14 = loading2;
                                                            }
                                                            r14 = th;
                                                        }
                                                    }
                                                    obj7 = th;
                                                    if (obj7 != null) {
                                                    }
                                                    r14 = th;
                                                }
                                            }
                                        }
                                        obj6 = th;
                                        if (obj6 == null) {
                                        }
                                    }
                                    prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = infoRow2.leading_text_action;
                                    if ((prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData == null ? prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.value : th) == null) {
                                        prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.getClass();
                                        PrepurchaseCashCardAppletData.InfoViewData infoViewData = prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.value;
                                        infoViewData.getClass();
                                        LocalizedString localizedString10 = infoViewData.title;
                                        localizedString10.getClass();
                                        String str14 = localizedString10.translated_value;
                                        str14.getClass();
                                        List list11 = infoViewData.text_blocks;
                                        str2 = str10;
                                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, i5));
                                        Iterator it7 = list11.iterator();
                                        while (it7.hasNext()) {
                                            PrepurchaseCashCardAppletData.InfoViewData.TextBlock textBlock = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock) it7.next();
                                            LocalizedString localizedString11 = textBlock.header;
                                            ?? r02 = localizedString11 != null ? localizedString11.translated_value : th;
                                            Iterator it8 = it7;
                                            LocalizedString localizedString12 = textBlock.body;
                                            ?? r1 = localizedString12 != null ? localizedString12.translated_value : th;
                                            List list12 = textBlock.rows;
                                            Iterator it9 = it;
                                            PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData4 = paymentPlansData3;
                                            PrepurchaseCashCardPlanningViewModel.LoadableText.Loading loading3 = loading2;
                                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list12, 10));
                                            Iterator it10 = list12.iterator();
                                            while (it10.hasNext()) {
                                                PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row row = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row) it10.next();
                                                Iterator it11 = it10;
                                                LocalizedString localizedString13 = row.leading_text;
                                                localizedString13.getClass();
                                                String str15 = localizedString13.translated_value;
                                                str15.getClass();
                                                GapComposer gapComposer5 = gapComposer4;
                                                LocalizedString localizedString14 = row.trailing_text;
                                                localizedString14.getClass();
                                                String str16 = localizedString14.translated_value;
                                                str16.getClass();
                                                PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle rowStyle = row.style;
                                                int i8 = rowStyle == null ? -1 : PrepurchaseCashCardMappersKt$WhenMappings.$EnumSwitchMapping$0[rowStyle.ordinal()];
                                                List list13 = list8;
                                                if (i8 == -1) {
                                                    style = PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem.Style.Standard;
                                                } else if (i8 == 1) {
                                                    style = PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem.Style.Standard;
                                                } else {
                                                    if (i8 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return obj5;
                                                    }
                                                    style = PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem.Style.Prominent;
                                                }
                                                arrayList5.add(new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem(str15, str16, style));
                                                list8 = list13;
                                                it10 = it11;
                                                gapComposer4 = gapComposer5;
                                            }
                                            arrayList4.add(new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlock(r02, r1, arrayList5));
                                            list8 = list8;
                                            it7 = it8;
                                            it = it9;
                                            paymentPlansData3 = paymentPlansData4;
                                            loading2 = loading3;
                                        }
                                        list = list8;
                                        it2 = it;
                                        paymentPlansData = paymentPlansData3;
                                        loading = loading2;
                                        gapComposer2 = gapComposer4;
                                        LocalizedString localizedString15 = infoViewData.primary_footer_button_text;
                                        r0 = new PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo(new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet(localeToggle, str14, arrayList4, localizedString15 != null ? localizedString15.translated_value : th));
                                    } else {
                                        str2 = str10;
                                        list = list8;
                                        it2 = it;
                                        paymentPlansData = paymentPlansData3;
                                        loading = loading2;
                                        gapComposer2 = gapComposer4;
                                        if (cashBannerKt3 != null) {
                                            ?? r03 = cashBannerKt3 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt3 : th;
                                            if (r03 != 0) {
                                                obj9 = r03.value;
                                                if (obj9 == null) {
                                                    if (str2 == null) {
                                                        cashBannerKt3.getClass();
                                                        ?? r12 = cashBannerKt3 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt3 : th;
                                                        ?? r13 = r12 != 0 ? r12.value : th;
                                                        r13.getClass();
                                                        str3 = r13.initial_selected_option_identifier;
                                                    } else {
                                                        str3 = str2;
                                                    }
                                                    cashBannerKt3.getClass();
                                                    ?? r22 = cashBannerKt3 instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction ? (PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) cashBannerKt3 : th;
                                                    ?? r23 = r22 != 0 ? r22.value : th;
                                                    r23.getClass();
                                                    LocalizedString localizedString16 = r23.action_accessibility_hint;
                                                    final ?? r24 = localizedString16 != null ? localizedString16.translated_value : th;
                                                    r0 = new Credential(str3, r24) { // from class: com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions
                                                        public final String accessibilityHint;
                                                        public final String initialSelectedOptionId;

                                                        {
                                                            super(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.ActionIconStyle.TRAILING_CARET);
                                                            this.initialSelectedOptionId = str3;
                                                            this.accessibilityHint = r24;
                                                        }

                                                        public final boolean equals(Object obj12) {
                                                            if (this == obj12) {
                                                                return true;
                                                            }
                                                            if (!(obj12 instanceof PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions)) {
                                                                return false;
                                                            }
                                                            PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions prepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions = (PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions) obj12;
                                                            return Intrinsics.areEqual(this.initialSelectedOptionId, prepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions.initialSelectedOptionId) && Intrinsics.areEqual(this.accessibilityHint, prepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowPaymentPlanOptions.accessibilityHint);
                                                        }

                                                        public final int hashCode() {
                                                            String str17 = this.initialSelectedOptionId;
                                                            int hashCode = (str17 == null ? 0 : str17.hashCode()) * 31;
                                                            String str18 = this.accessibilityHint;
                                                            return hashCode + (str18 != null ? str18.hashCode() : 0);
                                                        }

                                                        public final String toString() {
                                                            return Boxes$$ExternalSyntheticOutline1.m("ShowPaymentPlanOptions(initialSelectedOptionId=", this.initialSelectedOptionId, ", accessibilityHint=", this.accessibilityHint, ")");
                                                        }
                                                    };
                                                } else {
                                                    r0 = th;
                                                }
                                            }
                                        }
                                        obj9 = th;
                                        if (obj9 == null) {
                                        }
                                    }
                                    arrayList3.add(new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow(str11, r14, r0));
                                    str10 = str2;
                                    list8 = list;
                                    it = it2;
                                    paymentPlansData3 = paymentPlansData;
                                    loading2 = loading;
                                    gapComposer4 = gapComposer2;
                                    i5 = 10;
                                }
                            }
                            obj4 = th;
                            if (obj4 == null) {
                            }
                            prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData = infoRow2.leading_text_action;
                            if ((prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData == null ? prepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData.value : th) == null) {
                            }
                            arrayList3.add(new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow(str11, r14, r0));
                            str10 = str2;
                            list8 = list;
                            it = it2;
                            paymentPlansData3 = paymentPlansData;
                            loading2 = loading;
                            gapComposer4 = gapComposer2;
                            i5 = 10;
                        }
                        List list14 = list8;
                        gapComposer = gapComposer4;
                        LocalizedString localizedString17 = prepurchaseCashCardAppletData3.footer_text;
                        ?? r232 = localizedString17 == null ? localizedString17.translated_value : th;
                        boolean contains = list14.contains("home-sheet-primary-footer-button");
                        localBrandBannersKt = prepurchaseCashCardAppletData3.primary_footer_button_state;
                        if (localBrandBannersKt != null) {
                            ?? r54 = localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent ? (PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) localBrandBannersKt : th;
                            if (r54 != 0) {
                                r5 = r54.value;
                                if (localBrandBannersKt != null) {
                                    ?? r37 = localBrandBannersKt instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent ? (PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) localBrandBannersKt : th;
                                    if (r37 != 0) {
                                        r3 = r37.value;
                                        PrepurchaseCashCardPlanningViewModel.LoadableButton createLoadableButton = VelocityKt.createLoadableButton("home-sheet-primary-footer-button", contains, r5, r3);
                                        boolean contains2 = list14.contains("home-sheet-secondary-footer-button");
                                        localMenuItemsKt = prepurchaseCashCardAppletData3.secondary_footer_button_state;
                                        if (localMenuItemsKt != null) {
                                            ?? r38 = localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent ? (PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) localMenuItemsKt : th;
                                            if (r38 != 0) {
                                                r32 = r38.value;
                                                if (localMenuItemsKt != null) {
                                                    ?? r25 = localMenuItemsKt instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent ? (PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) localMenuItemsKt : th;
                                                    if (r25 != 0) {
                                                        r2 = r25.value;
                                                        prepurchaseCardPaymentPlanOptionsSheet = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet(localeToggle, r19, r20, r21, arrayList3, r232, createLoadableButton, VelocityKt.createLoadableButton("home-sheet-secondary-footer-button", contains2, r32, r2));
                                                        obj = prepurchaseCardPaymentPlanOptionsSheet;
                                                    }
                                                }
                                                r2 = th;
                                                prepurchaseCardPaymentPlanOptionsSheet = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet(localeToggle, r19, r20, r21, arrayList3, r232, createLoadableButton, VelocityKt.createLoadableButton("home-sheet-secondary-footer-button", contains2, r32, r2));
                                                obj = prepurchaseCardPaymentPlanOptionsSheet;
                                            }
                                        }
                                        r32 = th;
                                        if (localMenuItemsKt != null) {
                                        }
                                        r2 = th;
                                        prepurchaseCardPaymentPlanOptionsSheet = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet(localeToggle, r19, r20, r21, arrayList3, r232, createLoadableButton, VelocityKt.createLoadableButton("home-sheet-secondary-footer-button", contains2, r32, r2));
                                        obj = prepurchaseCardPaymentPlanOptionsSheet;
                                    }
                                }
                                r3 = th;
                                PrepurchaseCashCardPlanningViewModel.LoadableButton createLoadableButton2 = VelocityKt.createLoadableButton("home-sheet-primary-footer-button", contains, r5, r3);
                                boolean contains22 = list14.contains("home-sheet-secondary-footer-button");
                                localMenuItemsKt = prepurchaseCashCardAppletData3.secondary_footer_button_state;
                                if (localMenuItemsKt != null) {
                                }
                                r32 = th;
                                if (localMenuItemsKt != null) {
                                }
                                r2 = th;
                                prepurchaseCardPaymentPlanOptionsSheet = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet(localeToggle, r19, r20, r21, arrayList3, r232, createLoadableButton2, VelocityKt.createLoadableButton("home-sheet-secondary-footer-button", contains22, r32, r2));
                                obj = prepurchaseCardPaymentPlanOptionsSheet;
                            }
                        }
                        r5 = th;
                        if (localBrandBannersKt != null) {
                        }
                        r3 = th;
                        PrepurchaseCashCardPlanningViewModel.LoadableButton createLoadableButton22 = VelocityKt.createLoadableButton("home-sheet-primary-footer-button", contains, r5, r3);
                        boolean contains222 = list14.contains("home-sheet-secondary-footer-button");
                        localMenuItemsKt = prepurchaseCashCardAppletData3.secondary_footer_button_state;
                        if (localMenuItemsKt != null) {
                        }
                        r32 = th;
                        if (localMenuItemsKt != null) {
                        }
                        r2 = th;
                        prepurchaseCardPaymentPlanOptionsSheet = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet(localeToggle, r19, r20, r21, arrayList3, r232, createLoadableButton22, VelocityKt.createLoadableButton("home-sheet-secondary-footer-button", contains222, r32, r2));
                        obj = prepurchaseCardPaymentPlanOptionsSheet;
                    }
                }
                obj2 = th;
                PrepurchaseCashCardPlanningViewModel.LoadableText.Loading loading22 = PrepurchaseCashCardPlanningViewModel.LoadableText.Loading.INSTANCE;
                if (obj2 == null) {
                }
                LocalizedString localizedString72 = prepurchaseCashCardAppletData3.info_rows_header;
                if (localizedString72 == null) {
                }
                List list92 = prepurchaseCashCardAppletData3.info_rows;
                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list92, 10));
                it = list92.iterator();
                while (it.hasNext()) {
                }
                List list142 = list8;
                gapComposer = gapComposer4;
                LocalizedString localizedString172 = prepurchaseCashCardAppletData3.footer_text;
                if (localizedString172 == null) {
                }
                boolean contains3 = list142.contains("home-sheet-primary-footer-button");
                localBrandBannersKt = prepurchaseCashCardAppletData3.primary_footer_button_state;
                if (localBrandBannersKt != null) {
                }
                r5 = th;
                if (localBrandBannersKt != null) {
                }
                r3 = th;
                PrepurchaseCashCardPlanningViewModel.LoadableButton createLoadableButton222 = VelocityKt.createLoadableButton("home-sheet-primary-footer-button", contains3, r5, r3);
                boolean contains2222 = list142.contains("home-sheet-secondary-footer-button");
                localMenuItemsKt = prepurchaseCashCardAppletData3.secondary_footer_button_state;
                if (localMenuItemsKt != null) {
                }
                r32 = th;
                if (localMenuItemsKt != null) {
                }
                r2 = th;
                prepurchaseCardPaymentPlanOptionsSheet = new PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet(localeToggle, r19, r20, r21, arrayList32, r232, createLoadableButton222, VelocityKt.createLoadableButton("home-sheet-secondary-footer-button", contains2222, r32, r2));
                obj = prepurchaseCardPaymentPlanOptionsSheet;
            } else {
                gapComposer = gapComposer4;
                obj = th;
            }
            if (obj == null) {
                obj = PrepurchaseCashCardPlanningViewModel.Loading.INSTANCE;
            }
            gapComposer.end(false);
            return obj;
        }
        i2 = -1;
        if (list5 != null) {
        }
        Unit unit2 = Unit.INSTANCE;
        changedInstance = gapComposer4.changedInstance(this);
        rememberedValue = gapComposer4.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new PdfPreviewPresenter$models$1$1(this, mutableState3, mutableState, (Continuation) null);
        gapComposer4.updateRememberedValue(rememberedValue);
        Updater.LaunchedEffect(gapComposer4, unit2, (Function2) rememberedValue);
        changedInstance2 = gapComposer4.changedInstance(this);
        rememberedValue2 = gapComposer4.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = new ShoppingWebBridge.AnonymousClass1(this, continuation, 3);
        gapComposer4.updateRememberedValue(rememberedValue2);
        Updater.LaunchedEffect(gapComposer4, unit2, (Function2) rememberedValue2);
        PrepurchaseCardPlanningState prepurchaseCardPlanningState22 = (PrepurchaseCardPlanningState) mutableState.getValue();
        changedInstance3 = gapComposer4.changedInstance(this) | gapComposer4.changedInstance(prepurchaseCashCardAppletData);
        rememberedValue3 = gapComposer4.rememberedValue();
        if (changedInstance3) {
        }
        AndroidFileSaver$save$2 androidFileSaver$save$22 = new AndroidFileSaver$save$2(this, prepurchaseCashCardAppletData, mutableState, continuation, 11);
        th = null;
        gapComposer4.updateRememberedValue(androidFileSaver$save$22);
        rememberedValue3 = androidFileSaver$save$22;
        Updater.LaunchedEffect(gapComposer4, prepurchaseCardPlanningState22, (Function2) rememberedValue3);
        rememberedValue4 = gapComposer4.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
        }
        MutableState mutableState52 = (MutableState) rememberedValue4;
        PrepurchaseCashCardAppletData prepurchaseCashCardAppletData32 = prepurchaseCashCardAppletData;
        Updater.LaunchedEffect(gapComposer4, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState, mutableState52, mutableState2, mutableState3, mutableState4, 27));
        int i52 = 10;
        if (list5 != null) {
        }
        localeToggle = th;
        prepurchaseCardPlanningState = (PrepurchaseCardPlanningState) mutableState.getValue();
        if (Intrinsics.areEqual(prepurchaseCardPlanningState, homeState)) {
        }
        if (obj == null) {
        }
        gapComposer.end(false);
        return obj;
    }

    private final Object models$com$squareup$cash$profile$presenters$RealProfilePreviewPresenter(Flow flow, Composer composer, int i) {
        Debug debug;
        Object loading;
        boolean z;
        RealProfileManager realProfileManager = (RealProfileManager) this.launcher;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1102710739);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = realProfileManager.profile();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = realProfileManager.publicProfile();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = ((RealP2pSettingsManager) this.installedStore).select();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = RealBitcoinCapabilityProvider.isBTCxFlow();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        int i2 = 24;
        if (rememberedValue5 == neverEqualPolicy) {
            RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealBusinessProfileManager) this.clock).syncValueReader.getSingleValue(AndroidSyncValueSpecs.C4bProfile), i2);
            gapComposer.updateRememberedValue(realBadger2$setup$lambda$0$$inlined$mapNotNull$1);
            rememberedValue5 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
        }
        Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        boolean changed = gapComposer.changed((Profile) collectAsState.getValue());
        Object rememberedValue6 = gapComposer.rememberedValue();
        boolean z2 = false;
        if (changed || rememberedValue6 == neverEqualPolicy) {
            Profile profile = (Profile) collectAsState.getValue();
            if (profile != null) {
                ProfileScreens.ProfileScreen.Customer buildCustomerFromRecipient = UriKt.buildCustomerFromRecipient(new Recipient(null, false, false, profile.profile_id, null, null, false, false, false, null, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, null, -9, 3));
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                GetProfileDetailsContext getProfileDetailsContext = GetProfileDetailsContext.UNKNOWN;
                ProfileScreens.GenericProfileElementsSection genericProfileElementsSection = new ProfileScreens.GenericProfileElementsSection(buildCustomerFromRecipient, new ProfileScreens.GenericProfileElementsSection.ExtraPaymentInfo(randomUUID, getProfileDetailsContext, CustomerProfileViewOpen.EntryPoint.CELL, EditProfile.INSTANCE, false, null), z2, i2);
                rememberedValue6 = ((RealGenericProfileElementsPresenter$Factory$Impl) this.screen).create$1((ProfileScreens.ProfilePreview) this.responseContextHandler, genericProfileElementsSection, RealProfileRepo.customerDetails$default((RealProfileRepo) this.service, buildCustomerFromRecipient, false, getProfileDetailsContext, genericProfileElementsSection.loadInitialDetailsFromCache), (BetterNavigator.ScreenNavigator) this.navigator);
            } else {
                rememberedValue6 = null;
            }
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        RealGenericProfileElementsPresenter realGenericProfileElementsPresenter = (RealGenericProfileElementsPresenter) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 23), 17);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider);
            rememberedValue7 = nullStateSwipeConfigProvider;
        }
        Flow flow2 = (Flow) rememberedValue7;
        if (realGenericProfileElementsPresenter == null) {
            gapComposer.startReplaceGroup(-1347292176);
            gapComposer.end(false);
            debug = null;
        } else {
            gapComposer.startReplaceGroup(-1151839695);
            debug = (Debug) realGenericProfileElementsPresenter.models(flow2, gapComposer, 0);
            gapComposer.end(false);
        }
        NotificationCompat profileViewModel$Loaded$ProfileBody$Loaded = debug != null ? new ProfileViewModel$Loaded$ProfileBody$Loaded(debug) : ProfileViewModel$Loaded$ProfileBody$Loading.INSTANCE;
        if (((Profile) collectAsState.getValue()) == null || ((PublicProfile) collectAsState2.getValue()) == null || ((P2pSettingsManager$P2pSettings) collectAsState3.getValue()) == null || collectAsState4.getValue() == null) {
            z = false;
            loading = new ProfileViewModel.Loading(false);
        } else {
            Profile profile2 = (Profile) collectAsState.getValue();
            profile2.getClass();
            PublicProfile publicProfile = (PublicProfile) collectAsState2.getValue();
            publicProfile.getClass();
            P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) collectAsState3.getValue();
            p2pSettingsManager$P2pSettings.getClass();
            AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
            String str = publicProfile.fullName;
            Character firstOrNull = str != null ? StringsKt___StringsKt.firstOrNull(str) : null;
            String str2 = publicProfile.photoUrl;
            StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, profile2.profile_id, null, null, null))), firstOrNull, null, str2 != null ? new Image(str2, str2, 4) : null, null, null, null, null, false, false, null, false, null, null, 131060);
            Badge profileBadge = ProfilesKt.profileBadge(publicProfile, CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings));
            ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton = new ProfileViewModel.Loaded.ProfileHeader.ActionButton(androidStringManager.get(R.string.profile_action_pay));
            ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton2 = new ProfileViewModel.Loaded.ProfileHeader.ActionButton(androidStringManager.get(R.string.profile_action_request));
            NavigationIcon navigationIcon = NavigationIcon.CLOSE;
            StackedAvatarViewModel.Single single = new StackedAvatarViewModel.Single(avatar);
            String str3 = str == null ? "null" : str;
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.profile_avatar_cont_desc)).format(new Object[]{str3});
            format2.getClass();
            ProfileHeaderViewModel.BadgeName badgeName = new ProfileHeaderViewModel.BadgeName(str, profileBadge == Badge.BUSINESS, profileBadge == Badge.VERIFIED);
            FullCashtag fullCashtag = publicProfile.fullCashtag;
            loading = new ProfileViewModel.Loaded(new ProfileViewModel.Loaded.ProfileHeader(navigationIcon, null, new ProfileHeaderViewModel(single, format2, badgeName, (Icons) null, fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : null, 8), actionButton, actionButton2, false), profileViewModel$Loaded$ProfileBody$Loaded, null);
            z = false;
        }
        gapComposer.end(z);
        return loading;
    }

    private final Object models$com$squareup$cash$profile$presenters$searchprivacy$RealSearchPrivacySettingsPresenter(Flow flow, Composer composer, int i) {
        Object dotGridKt$DotGrid$3$1;
        MutableState mutableState;
        Object obj;
        List list;
        List list2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1048819071);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(((RealProfileManager) this.responseContextHandler).publicProfile(), 20);
            gapComposer.updateRememberedValue(realDrawerOpener$getDrawerScreen$$inlined$map$1);
            rememberedValue = realDrawerOpener$getDrawerScreen$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        MutableState collectAsState2 = Updater.collectAsState(((RealProfileAliasRepository) this.service).all(), EmptyList.INSTANCE, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            rememberedValue3 = Updater.mutableStateOf$default(emptyMap);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, mutableState3, 9));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            mutableState = mutableState2;
            dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) this, mutableState, mutableState3, continuation, 28);
            gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
        } else {
            dotGridKt$DotGrid$3$1 = rememberedValue4;
            mutableState = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) dotGridKt$DotGrid$3$1);
        String str = (String) collectAsState.getValue();
        List list3 = (List) collectAsState2.getValue();
        GetSearchPrivacySettingsResponse getSearchPrivacySettingsResponse = (GetSearchPrivacySettingsResponse) mutableState.getValue();
        Map map = (Map) mutableState3.getValue();
        Resources resources = ((AndroidStringManager) this.stringManager).resources;
        if (getSearchPrivacySettingsResponse != null) {
            SearchPrivacySectionViewEvent.SearchSettingType searchSettingType = SearchPrivacySectionViewEvent.SearchSettingType.NAME;
            GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting = getSearchPrivacySettingsResponse.search_by_name;
            Boolean bool = booleanSetting != null ? booleanSetting.editable : null;
            if (str == null) {
                str = "";
            }
            ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting viewModels$getPrivacySetting = viewModels$getPrivacySetting(map, searchSettingType, bool, CollectionsKt__CollectionsJVMKt.listOf(str));
            SearchPrivacySectionViewEvent.SearchSettingType searchSettingType2 = SearchPrivacySectionViewEvent.SearchSettingType.PHONE_NUMBER;
            GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting2 = getSearchPrivacySettingsResponse.search_by_phone;
            Boolean bool2 = booleanSetting2 != null ? booleanSetting2.editable : null;
            List list4 = list3;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list4) {
                if (((ProfileAlias) obj2).f1121type == UiAlias.Type.SMS) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ProfileAlias profileAlias = (ProfileAlias) it.next();
                String displayText = profileAlias != null ? AliasFormatter.getDisplayText(profileAlias.canonical_text, profileAlias.f1121type, PhoneNumbers.Format.NATIONAL) : null;
                if (displayText == null) {
                    displayText = "";
                }
                arrayList2.add(displayText);
            }
            if (arrayList2.isEmpty()) {
                list = EmptyList.INSTANCE;
            } else {
                int size = arrayList2.size();
                list = arrayList2;
                if (size > 3) {
                    List take = CollectionsKt.take(arrayList2, 2);
                    Object[] objArr = {Integer.valueOf(arrayList2.size() - 2)};
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.profile_search_privacy_more_linked_phones)).format(objArr);
                    format2.getClass();
                    list = CollectionsKt.plus((Collection) take, (Object) format2);
                }
            }
            ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting viewModels$getPrivacySetting2 = viewModels$getPrivacySetting(map, searchSettingType2, bool2, list);
            SearchPrivacySectionViewEvent.SearchSettingType searchSettingType3 = SearchPrivacySectionViewEvent.SearchSettingType.EMAIL;
            GetSearchPrivacySettingsResponse.BooleanSetting booleanSetting3 = getSearchPrivacySettingsResponse.search_by_email;
            Boolean bool3 = booleanSetting3 != null ? booleanSetting3.editable : null;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list4) {
                if (((ProfileAlias) obj3).f1121type == UiAlias.Type.EMAIL) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((ProfileAlias) it2.next()).canonical_text);
            }
            if (arrayList4.isEmpty()) {
                list2 = EmptyList.INSTANCE;
            } else {
                int size2 = arrayList4.size();
                list2 = arrayList4;
                if (size2 > 3) {
                    List take2 = CollectionsKt.take(arrayList4, 2);
                    Object[] objArr2 = {Integer.valueOf(arrayList4.size() - 2)};
                    resources.getClass();
                    String format3 = new MessageFormat(resources.getString(R.string.profile_search_privacy_more_linked_emails)).format(objArr2);
                    format3.getClass();
                    list2 = CollectionsKt.plus((Collection) take2, (Object) format3);
                }
            }
            obj = new ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content(viewModels$getPrivacySetting, viewModels$getPrivacySetting2, viewModels$getPrivacySetting(map, searchSettingType3, bool3, list2));
        } else {
            obj = ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.None.INSTANCE;
        }
        gapComposer.end(false);
        return obj;
    }

    private final Object models$com$squareup$cash$qrcodes$presenters$CashtagQrScanPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2030232615);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(new CashtagQrScanPresenter$State(false, CameraState.RESUMED));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new AndroidFileSaver$save$2(this, mutableState, continuation, 18);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation, this, 24));
        CashtagQrScanViewModel cashtagQrScanViewModel = new CashtagQrScanViewModel(((CashtagQrScanPresenter$State) mutableState.getValue()).hasCameraPermission, ((CashtagQrScanPresenter$State) mutableState.getValue()).cameraState);
        gapComposer.end(false);
        return cashtagQrScanViewModel;
    }

    private final Object models$com$squareup$cash$savings$presenters$TransferringPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-256633497);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(TransferringViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        TransferProcessingScreen transferProcessingScreen = (TransferProcessingScreen) this.screen;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new RingtoneView.AnonymousClass1(this, mutableState, continuation, 27);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, transferProcessingScreen, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 3));
        TransferringViewModel transferringViewModel = (TransferringViewModel) mutableState.getValue();
        gapComposer.end(false);
        return transferringViewModel;
    }

    private final Object models$com$squareup$cash$score$presenters$ScoreHomePresenter(Flow flow, Composer composer, int i) {
        Character monogram;
        FullCashtag fullCashtag;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-705318094);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = null;
        boolean z = false;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj2 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj2 = mutableStateOf$default;
        }
        MutableState mutableState = (MutableState) obj2;
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 0;
        if (rememberedValue2 == neverEqualPolicy) {
            RealScoreRepository realScoreRepository = (RealScoreRepository) this.service;
            RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1 realScoreRepository$cashCreditScoreHomeData$$inlined$map$1 = new RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1(realScoreRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashCreditScore), realScoreRepository, i2);
            gapComposer.updateRememberedValue(realScoreRepository$cashCreditScoreHomeData$$inlined$map$1);
            rememberedValue2 = realScoreRepository$cashCreditScoreHomeData$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            ChannelFlowTransformLatest publicProfile = ((RealProfileManager) this.installedStore).publicProfile();
            gapComposer.updateRememberedValue(publicProfile);
            obj3 = publicProfile;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) obj3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy) {
            FinishSetupTileBadgeCounter issuedCardOrNull = ((RealIssuedCardManager) ((IssuedCardManager) this.clock)).getIssuedCardOrNull();
            gapComposer.updateRememberedValue(issuedCardOrNull);
            obj4 = issuedCardOrNull;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) obj4, null, null, gapComposer, 48, 2);
        PublicProfile publicProfile2 = (PublicProfile) collectAsState2.getValue();
        String cashtagWithCurrencySymbol = (publicProfile2 == null || (fullCashtag = publicProfile2.fullCashtag) == null) ? null : FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag);
        if (cashtagWithCurrencySymbol == null) {
            cashtagWithCurrencySymbol = "";
        }
        String str = cashtagWithCurrencySymbol;
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy) {
            ChannelFlowTransformLatest customizationImage = ((RealCardCustomizationRepository) this.stringManager).getCustomizationImage();
            gapComposer.updateRememberedValue(customizationImage);
            obj5 = customizationImage;
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) obj5, null, null, gapComposer, 48, 2);
        IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) collectAsState3.getValue();
        CardTheme cardTheme = issuedCard != null ? issuedCard.cardTheme : null;
        boolean changed = gapComposer.changed((byte[]) collectAsState4.getValue()) | gapComposer.changed(cardTheme) | gapComposer.changed(str);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = (cardTheme == null || str.length() <= 0) ? null : new StyledCardViewModel(str, true, cardTheme, false, null, (byte[]) collectAsState4.getValue(), false, null, null, null, null, null, null, 65496);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        StyledCardViewModel styledCardViewModel = (StyledCardViewModel) rememberedValue6;
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (MoleculePresenter) this, (Object) collectAsState, mutableState, 19));
        CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) collectAsState.getValue();
        if (cashCreditScoreHomeData == null) {
            gapComposer.startReplaceGroup(-1150041030);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1150041029);
            gapComposer.startReplaceGroup(794197173);
            PublicProfile publicProfile3 = (PublicProfile) collectAsState2.getValue();
            String str2 = publicProfile3 != null ? publicProfile3.photoUrl : null;
            PublicProfile publicProfile4 = (PublicProfile) collectAsState2.getValue();
            ScoreHomeViewModel.Loaded loaded = new ScoreHomeViewModel.Loaded(cashCreditScoreHomeData, new ProfileAvatarViewModel(str2, (publicProfile4 == null || (monogram = FillrWidget.WidgetType.AnonymousClass1.getMonogram(publicProfile4)) == null) ? null : String.valueOf(monogram.charValue())), styledCardViewModel, (ScoreHomeSheet) mutableState.getValue());
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(cashCreditScoreHomeData) | gapComposer.changedInstance(this);
            Object rememberedValue7 = gapComposer.rememberedValue();
            Object obj6 = rememberedValue7;
            if (changedInstance || rememberedValue7 == neverEqualPolicy) {
                ProfileCropView.AnonymousClass3 anonymousClass3 = new ProfileCropView.AnonymousClass3(cashCreditScoreHomeData, this, z ? 1 : 0, 12);
                gapComposer.updateRememberedValue(anonymousClass3);
                obj6 = anonymousClass3;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) obj6);
            gapComposer.end(false);
            gapComposer.end(false);
            obj = loaded;
        }
        if (obj == null) {
            obj = ScoreHomeViewModel.Loading.INSTANCE;
        }
        gapComposer.end(false);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$securityhub$presenters$BookletPresenter(Flow flow, Composer composer, int i) {
        boolean z;
        int ordinal;
        BookletViewModel bookletViewModel;
        int i2;
        BookletViewModel bookletViewModel2;
        int i3;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Continuation continuation;
        BookletViewModel bookletViewModel3;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1690694794);
        Object rememberedValue3 = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = ((RealIdentityVerificationRepo) this.installedStore).status();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        if (((IdentityVerificationStatus) collectAsState.getValue()) != null) {
            IdentityVerificationStatus identityVerificationStatus = (IdentityVerificationStatus) collectAsState.getValue();
            if ((identityVerificationStatus != null ? identityVerificationStatus.entrypointStatus : null) != IdentityHubState.EntrypointStatus.VERIFIED) {
                IdentityVerificationStatus identityVerificationStatus2 = (IdentityVerificationStatus) collectAsState.getValue();
                if ((identityVerificationStatus2 != null ? identityVerificationStatus2.entrypointStatus : null) != IdentityHubState.EntrypointStatus.PENDING) {
                    z = false;
                    BookletId bookletId = ((BookletScreen) this.launcher).bookletId;
                    AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
                    Map map = SecurityHubBookletsKt.RELATED_BOOKLET_IDS;
                    bookletId.getClass();
                    ordinal = bookletId.ordinal();
                    if (ordinal == 0) {
                        if (ordinal == 1) {
                            bookletViewModel3 = new BookletViewModel(androidStringManager.get(R.string.booklet_common_scams_nav_title), androidStringManager.get(R.string.booklet_common_scams_page_title), androidStringManager.get(R.string.booklet_common_scams_page_body), CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.GOODS_AND_SERVICES_SCAM, androidStringManager.get(R.string.booklet_common_scams_card_goods_and_services_title), androidStringManager.get(R.string.booklet_common_scams_card_goods_and_services_body), TrustHubImageUrls.SCAMS_SERVICES, null), new BookletFeatureCardViewModel(BookletFeatureCardId.CUSTOMER_SUPPORT_SCAM, androidStringManager.get(R.string.booklet_common_scams_card_customer_support_title), androidStringManager.get(R.string.booklet_common_scams_card_customer_support_body), TrustHubImageUrls.SCAMS_SUPPORT, null), new BookletFeatureCardViewModel(BookletFeatureCardId.FRIEND_OR_FAMILY_IMPERSONATION, androidStringManager.get(R.string.booklet_common_scams_card_friend_or_family_title), androidStringManager.get(R.string.booklet_common_scams_card_friend_or_family_body), TrustHubImageUrls.SCAMS_IMPERSONATION, null), new BookletFeatureCardViewModel(BookletFeatureCardId.ROMANCE_OR_INVESTMENT_SCAM, androidStringManager.get(R.string.booklet_common_scams_card_romance_or_investment_title), androidStringManager.get(R.string.booklet_common_scams_card_romance_or_investment_body), TrustHubImageUrls.SCAMS_ROMANCE, null), new BookletFeatureCardViewModel(BookletFeatureCardId.DEPOSIT_SCAM, androidStringManager.get(R.string.booklet_common_scams_card_deposit_scam_title), androidStringManager.get(R.string.booklet_common_scams_card_deposit_scam_body), TrustHubImageUrls.SCAMS_MONEYFLIP, null)}), androidStringManager.get(R.string.booklet_related_section_title), SecurityHubBookletsKt.relatedBooklets(BookletId.COMMON_SCAMS, androidStringManager), androidStringManager.get(R.string.security_education_support_section_title), CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityEducationSupportRowViewModel[]{new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_SCAMMED, androidStringManager.get(R.string.security_education_support_scammed_title), androidStringManager.get(R.string.security_education_support_scammed_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_HACKED, androidStringManager.get(R.string.security_education_support_hacked_title), androidStringManager.get(R.string.security_education_support_hacked_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.REPORT_AN_ISSUE, androidStringManager.get(R.string.security_education_support_report_another_title), androidStringManager.get(R.string.security_education_support_report_subtitle), true)}));
                        } else if (ordinal == 2) {
                            bookletViewModel3 = new BookletViewModel(androidStringManager.get(R.string.booklet_spot_scams_nav_title), androidStringManager.get(R.string.booklet_spot_scams_page_title), androidStringManager.get(R.string.booklet_spot_scams_page_body), CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.TOO_GOOD_TO_BE_TRUE, androidStringManager.get(R.string.booklet_spot_scams_card_too_good_title), androidStringManager.get(R.string.booklet_spot_scams_card_too_good_body), TrustHubImageUrls.SPOT_TOO_GOOD, null), new BookletFeatureCardViewModel(BookletFeatureCardId.UNKNOWN_CONTACT, androidStringManager.get(R.string.booklet_spot_scams_card_unknown_contact_title), androidStringManager.get(R.string.booklet_spot_scams_card_unknown_contact_body), TrustHubImageUrls.SPOT_STRANGERS, null), new BookletFeatureCardViewModel(BookletFeatureCardId.UNUSUAL_PAYMENT_METHOD, androidStringManager.get(R.string.booklet_spot_scams_card_unusual_payment_title), androidStringManager.get(R.string.booklet_spot_scams_card_unusual_payment_body), TrustHubImageUrls.SPOT_UNUSUAL_PAYMENT, null), new BookletFeatureCardViewModel(BookletFeatureCardId.URGENT, androidStringManager.get(R.string.booklet_spot_scams_card_urgent_title), androidStringManager.get(R.string.booklet_spot_scams_card_urgent_body), TrustHubImageUrls.SPOT_URGENT, null), new BookletFeatureCardViewModel(BookletFeatureCardId.PERSONAL_INFO_REQUEST, androidStringManager.get(R.string.booklet_spot_scams_card_personal_info_title), androidStringManager.get(R.string.booklet_spot_scams_card_personal_info_body), TrustHubImageUrls.SPOT_PERSONAL, null)}), androidStringManager.get(R.string.booklet_related_section_title), SecurityHubBookletsKt.relatedBooklets(BookletId.SPOT_SCAMS, androidStringManager), androidStringManager.get(R.string.security_education_support_section_title), CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityEducationSupportRowViewModel[]{new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_SCAMMED, androidStringManager.get(R.string.security_education_support_scammed_title), androidStringManager.get(R.string.security_education_support_scammed_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_HACKED, androidStringManager.get(R.string.security_education_support_hacked_title), androidStringManager.get(R.string.security_education_support_hacked_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.REPORT_AN_ISSUE, androidStringManager.get(R.string.security_education_support_report_another_title), androidStringManager.get(R.string.security_education_support_report_subtitle), true)}));
                        } else {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                bookletViewModel2 = new BookletViewModel(androidStringManager.get(R.string.booklet_security_features_nav_title), androidStringManager.get(R.string.booklet_security_features_page_title), androidStringManager.get(R.string.booklet_security_features_page_body), ArraysKt___ArraysKt.filterNotNull(new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.SECURITY_LOCK, androidStringManager.get(R.string.booklet_security_features_card_security_lock_title), androidStringManager.get(R.string.booklet_security_features_card_security_lock_body), TrustHubImageUrls.SECURITY_FACE_ID, new BookletFeatureCardLinkViewModel(androidStringManager.get(R.string.booklet_security_features_card_security_lock_link))), !z ? new BookletFeatureCardViewModel(BookletFeatureCardId.IDENTITY_VERIFICATION, androidStringManager.get(R.string.booklet_security_features_card_identity_verification_title), androidStringManager.get(R.string.booklet_security_features_card_identity_verification_body), TrustHubImageUrls.SECURITY_IDENTITY, new BookletFeatureCardLinkViewModel(androidStringManager.get(R.string.booklet_security_features_card_identity_verification_link))) : null, new BookletFeatureCardViewModel(BookletFeatureCardId.CONTACT_SYNC, androidStringManager.get(R.string.booklet_security_features_card_contact_sync_title), androidStringManager.get(R.string.booklet_security_features_card_contact_sync_body), TrustHubImageUrls.SECURITY_CONTACTS, new BookletFeatureCardLinkViewModel(androidStringManager.get(R.string.booklet_security_features_card_contact_sync_link))), new BookletFeatureCardViewModel(BookletFeatureCardId.ENABLE_NOTIFICATIONS, androidStringManager.get(R.string.booklet_security_features_card_enable_notifications_title), androidStringManager.get(R.string.booklet_security_features_card_enable_notifications_body), TrustHubImageUrls.SECURITY_NOTIFICATIONS, new BookletFeatureCardLinkViewModel(androidStringManager.get(R.string.booklet_security_features_card_enable_notifications_link))), new BookletFeatureCardViewModel(BookletFeatureCardId.SECURE_PIN, androidStringManager.get(R.string.booklet_security_features_card_secure_pin_title), androidStringManager.get(R.string.booklet_security_features_card_secure_pin_body), TrustHubImageUrls.SECURITY_PIN, new BookletFeatureCardLinkViewModel(androidStringManager.get(R.string.booklet_security_features_card_secure_pin_link)))}), androidStringManager.get(R.string.booklet_related_section_title), SecurityHubBookletsKt.relatedBooklets(BookletId.SECURITY_FEATURES, androidStringManager), androidStringManager.get(R.string.security_education_support_section_title), CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityEducationSupportRowViewModel[]{new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_SCAMMED, androidStringManager.get(R.string.security_education_support_scammed_title), androidStringManager.get(R.string.security_education_support_scammed_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_HACKED, androidStringManager.get(R.string.security_education_support_hacked_title), androidStringManager.get(R.string.security_education_support_hacked_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.REPORT_AN_ISSUE, androidStringManager.get(R.string.security_education_support_report_another_title), androidStringManager.get(R.string.security_education_support_report_subtitle), true)}));
                                i2 = 1;
                                i3 = 0;
                                Object[] objArr = new Object[i3];
                                rememberedValue = gapComposer.rememberedValue();
                                if (rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new SheetKt$$ExternalSyntheticLambda9(i2);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
                                Unit unit = Unit.INSTANCE;
                                changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(this);
                                rememberedValue2 = gapComposer.rememberedValue();
                                if (!changed || rememberedValue2 == neverEqualPolicy) {
                                    continuation = null;
                                    rememberedValue2 = new ProfileCropView.AnonymousClass3(this, mutableState, continuation, 13);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                } else {
                                    continuation = null;
                                }
                                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                                Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 6));
                                gapComposer.end(false);
                                return bookletViewModel2;
                            }
                            bookletViewModel = new BookletViewModel(androidStringManager.get(R.string.booklet_prevent_fraud_nav_title), androidStringManager.get(R.string.booklet_prevent_fraud_page_title), androidStringManager.get(R.string.booklet_prevent_fraud_page_body), CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.NEVER_SHARE_LOGIN_INFO, androidStringManager.get(R.string.booklet_prevent_fraud_card_never_share_login_title), androidStringManager.get(R.string.booklet_prevent_fraud_card_never_share_login_body), TrustHubImageUrls.PREVENT_LOGIN, null), new BookletFeatureCardViewModel(BookletFeatureCardId.WATCH_ACCOUNT_ALERTS, androidStringManager.get(R.string.booklet_prevent_fraud_card_watch_alerts_title), androidStringManager.get(R.string.booklet_prevent_fraud_card_watch_alerts_body), TrustHubImageUrls.PREVENT_ALERTS, null), new BookletFeatureCardViewModel(BookletFeatureCardId.VERIFY_RECIPIENT, androidStringManager.get(R.string.booklet_prevent_fraud_card_verify_recipient_title), androidStringManager.get(R.string.booklet_prevent_fraud_card_verify_recipient_body), TrustHubImageUrls.PREVENT_VERIFY, null), new BookletFeatureCardViewModel(BookletFeatureCardId.MAKE_SURE_ITS_CASH_APP, androidStringManager.get(R.string.booklet_prevent_fraud_card_make_sure_cash_app_title), androidStringManager.get(R.string.booklet_prevent_fraud_card_make_sure_cash_app_body), TrustHubImageUrls.PREVENT_CASHAPP, null), new BookletFeatureCardViewModel(BookletFeatureCardId.DONT_OPEN_UNKNOWN_MESSAGES, androidStringManager.get(R.string.booklet_prevent_fraud_card_dont_open_unknown_title), androidStringManager.get(R.string.booklet_prevent_fraud_card_dont_open_unknown_body), TrustHubImageUrls.PREVENT_UNKNOWN, null), new BookletFeatureCardViewModel(BookletFeatureCardId.FOLLOW_BEST_PRACTICES, androidStringManager.get(R.string.booklet_prevent_fraud_card_follow_best_practices_title), androidStringManager.get(R.string.booklet_prevent_fraud_card_follow_best_practices_body), TrustHubImageUrls.PREVENT_BEST_PRACTICES, null)}), androidStringManager.get(R.string.booklet_related_section_title), SecurityHubBookletsKt.relatedBooklets(BookletId.PREVENT_FRAUD, androidStringManager), androidStringManager.get(R.string.security_education_support_section_title), CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityEducationSupportRowViewModel[]{new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_SCAMMED, androidStringManager.get(R.string.security_education_support_scammed_title), androidStringManager.get(R.string.security_education_support_scammed_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_HACKED, androidStringManager.get(R.string.security_education_support_hacked_title), androidStringManager.get(R.string.security_education_support_hacked_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.REPORT_AN_ISSUE, androidStringManager.get(R.string.security_education_support_report_another_title), androidStringManager.get(R.string.security_education_support_report_subtitle), true)}));
                            i2 = 1;
                        }
                        bookletViewModel2 = bookletViewModel3;
                        i3 = 0;
                        i2 = 1;
                        Object[] objArr2 = new Object[i3];
                        rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                        }
                        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue, gapComposer, 48);
                        Unit unit2 = Unit.INSTANCE;
                        changed = gapComposer.changed(mutableState2) | gapComposer.changedInstance(this);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (changed) {
                        }
                        continuation = null;
                        rememberedValue2 = new ProfileCropView.AnonymousClass3(this, mutableState2, continuation, 13);
                        gapComposer.updateRememberedValue(rememberedValue2);
                        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue2);
                        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 6));
                        gapComposer.end(false);
                        return bookletViewModel2;
                    }
                    i2 = 1;
                    bookletViewModel = new BookletViewModel(androidStringManager.get(R.string.booklet_built_in_protections_nav_title), androidStringManager.get(R.string.booklet_built_in_protections_page_title), androidStringManager.get(R.string.booklet_built_in_protections_page_body), CollectionsKt__CollectionsKt.listOf((Object[]) new BookletFeatureCardViewModel[]{new BookletFeatureCardViewModel(BookletFeatureCardId.ALWAYS_ON_MONITORING, androidStringManager.get(R.string.booklet_built_in_protections_card_monitoring_title), androidStringManager.get(R.string.booklet_built_in_protections_card_monitoring_body), TrustHubImageUrls.PROTECTIONS_247, null), new BookletFeatureCardViewModel(BookletFeatureCardId.SECURITY_ALERTS, androidStringManager.get(R.string.booklet_built_in_protections_card_alerts_title), androidStringManager.get(R.string.booklet_built_in_protections_card_alerts_body), TrustHubImageUrls.PROTECTIONS_SIGNIN, null), new BookletFeatureCardViewModel(BookletFeatureCardId.SCAM_WARNINGS, androidStringManager.get(R.string.booklet_built_in_protections_card_warnings_title), androidStringManager.get(R.string.booklet_built_in_protections_card_warnings_body), TrustHubImageUrls.PROTECTIONS_UNUSUAL, null), new BookletFeatureCardViewModel(BookletFeatureCardId.ACCOUNT_LOCKS, androidStringManager.get(R.string.booklet_built_in_protections_card_locks_title), androidStringManager.get(R.string.booklet_built_in_protections_card_locks_body), TrustHubImageUrls.PROTECTIONS_LOCK, null)}), androidStringManager.get(R.string.booklet_related_section_title), SecurityHubBookletsKt.relatedBooklets(BookletId.BUILT_IN_PROTECTIONS, androidStringManager), androidStringManager.get(R.string.security_education_support_section_title), CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityEducationSupportRowViewModel[]{new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_SCAMMED, androidStringManager.get(R.string.security_education_support_scammed_title), androidStringManager.get(R.string.security_education_support_scammed_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.IVE_BEEN_HACKED, androidStringManager.get(R.string.security_education_support_hacked_title), androidStringManager.get(R.string.security_education_support_hacked_subtitle), true), new SecurityEducationSupportRowViewModel(SecurityEducationSupportRowId.REPORT_AN_ISSUE, androidStringManager.get(R.string.security_education_support_report_another_title), androidStringManager.get(R.string.security_education_support_report_subtitle), true)}));
                    bookletViewModel2 = bookletViewModel;
                    i3 = 0;
                    Object[] objArr22 = new Object[i3];
                    rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                    }
                    MutableState mutableState22 = (MutableState) SaverKt.rememberSaveable(objArr22, (Function0) rememberedValue, gapComposer, 48);
                    Unit unit22 = Unit.INSTANCE;
                    changed = gapComposer.changed(mutableState22) | gapComposer.changedInstance(this);
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (changed) {
                    }
                    continuation = null;
                    rememberedValue2 = new ProfileCropView.AnonymousClass3(this, mutableState22, continuation, 13);
                    gapComposer.updateRememberedValue(rememberedValue2);
                    Updater.LaunchedEffect(gapComposer, unit22, (Function2) rememberedValue2);
                    Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 6));
                    gapComposer.end(false);
                    return bookletViewModel2;
                }
            }
        }
        z = true;
        BookletId bookletId2 = ((BookletScreen) this.launcher).bookletId;
        AndroidStringManager androidStringManager2 = (AndroidStringManager) this.stringManager;
        Map map2 = SecurityHubBookletsKt.RELATED_BOOKLET_IDS;
        bookletId2.getClass();
        ordinal = bookletId2.ordinal();
        if (ordinal == 0) {
        }
        bookletViewModel2 = bookletViewModel;
        i3 = 0;
        Object[] objArr222 = new Object[i3];
        rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == neverEqualPolicy) {
        }
        MutableState mutableState222 = (MutableState) SaverKt.rememberSaveable(objArr222, (Function0) rememberedValue, gapComposer, 48);
        Unit unit222 = Unit.INSTANCE;
        changed = gapComposer.changed(mutableState222) | gapComposer.changedInstance(this);
        rememberedValue2 = gapComposer.rememberedValue();
        if (changed) {
        }
        continuation = null;
        rememberedValue2 = new ProfileCropView.AnonymousClass3(this, mutableState222, continuation, 13);
        gapComposer.updateRememberedValue(rememberedValue2);
        Updater.LaunchedEffect(gapComposer, unit222, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 6));
        gapComposer.end(false);
        return bookletViewModel2;
    }

    private final Object models$com$squareup$cash$securityhub$presenters$RecoveryGuidePresenter(Flow flow, Composer composer, int i) {
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        Continuation continuation;
        GapComposer gapComposer2;
        flow.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-688168725);
        Object rememberedValue = gapComposer3.rememberedValue();
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy2) {
            RecoveryGuideId recoveryGuideId = ((RecoveryGuideScreen) this.launcher).recoveryGuideId;
            AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
            recoveryGuideId.getClass();
            int ordinal = recoveryGuideId.ordinal();
            if (ordinal == 0) {
                gapComposer2 = gapComposer3;
                neverEqualPolicy = neverEqualPolicy2;
                rememberedValue = new RecoveryGuideViewModel(androidStringManager.get(R.string.recovery_guide_scammed_nav_title), androidStringManager.get(R.string.recovery_guide_scammed_page_title), androidStringManager.get(R.string.recovery_guide_scammed_page_body), CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideSectionViewModel[]{new RecoveryGuideSectionViewModel(RecoveryGuideSectionId.NEXT_STEPS, androidStringManager.get(R.string.recovery_guide_section_next_steps_title), null, new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideRowViewModel[]{new RecoveryGuideRowViewModel(RecoveryGuideRowId.TRY_TO_REVERSE_PAYMENT, androidStringManager.get(R.string.recovery_guide_scammed_step_try_to_reverse_payment_title), androidStringManager.get(R.string.recovery_guide_scammed_step_try_to_reverse_payment_subtitle), false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.STOP_AND_DISCONNECT, androidStringManager.get(R.string.recovery_guide_scammed_step_stop_and_disconnect_title), androidStringManager.get(R.string.recovery_guide_scammed_step_stop_and_disconnect_subtitle), false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.PROTECT_YOUR_ACCOUNT, androidStringManager.get(R.string.recovery_guide_scammed_step_protect_your_account_title), androidStringManager.get(R.string.recovery_guide_scammed_step_protect_your_account_subtitle), true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.BEWARE_OF_FUTURE_SCAMS, androidStringManager.get(R.string.recovery_guide_scammed_step_beware_of_future_scams_title), androidStringManager.get(R.string.recovery_guide_scammed_step_beware_of_future_scams_subtitle), false)}))), TextViewCompat$Api28Impl.reportSection(androidStringManager, R.string.recovery_guide_scammed_section_report_title, R.string.recovery_guide_scammed_section_report_body), TextViewCompat$Api28Impl.protectYourselfSection(androidStringManager), TextViewCompat$Api28Impl.getSupportSection(androidStringManager)}));
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                neverEqualPolicy = neverEqualPolicy2;
                gapComposer2 = gapComposer3;
                rememberedValue = new RecoveryGuideViewModel(androidStringManager.get(R.string.recovery_guide_hacked_nav_title), androidStringManager.get(R.string.recovery_guide_hacked_page_title), androidStringManager.get(R.string.recovery_guide_hacked_page_body), CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideSectionViewModel[]{new RecoveryGuideSectionViewModel(RecoveryGuideSectionId.NEXT_STEPS, androidStringManager.get(R.string.recovery_guide_section_next_steps_title), null, new RecoveryGuideSectionViewModel.Content.Rows(CollectionsKt__CollectionsKt.listOf((Object[]) new RecoveryGuideRowViewModel[]{new RecoveryGuideRowViewModel(RecoveryGuideRowId.SECURE_YOUR_EMAIL, androidStringManager.get(R.string.recovery_guide_hacked_step_secure_your_email_title), androidStringManager.get(R.string.recovery_guide_hacked_step_secure_your_email_subtitle), false), new RecoveryGuideRowViewModel(RecoveryGuideRowId.CHANGE_YOUR_PIN, androidStringManager.get(R.string.recovery_guide_hacked_step_change_your_pin_title), androidStringManager.get(R.string.recovery_guide_hacked_step_change_your_pin_subtitle), true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.SIGN_OUT_EVERYWHERE, androidStringManager.get(R.string.recovery_guide_hacked_step_sign_out_everywhere_title), androidStringManager.get(R.string.recovery_guide_hacked_step_sign_out_everywhere_subtitle), true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.ENABLE_PASSKEYS, androidStringManager.get(R.string.recovery_guide_hacked_step_enable_passkeys_title), androidStringManager.get(R.string.recovery_guide_hacked_step_enable_passkeys_subtitle), true), new RecoveryGuideRowViewModel(RecoveryGuideRowId.FREEZE_YOUR_CREDIT, androidStringManager.get(R.string.recovery_guide_hacked_step_freeze_your_credit_title), androidStringManager.get(R.string.recovery_guide_hacked_step_freeze_your_credit_subtitle), false)}))), TextViewCompat$Api28Impl.reportSection(androidStringManager, R.string.recovery_guide_hacked_section_report_title, R.string.recovery_guide_hacked_section_report_body), TextViewCompat$Api28Impl.protectYourselfSection(androidStringManager), TextViewCompat$Api28Impl.getSupportSection(androidStringManager)}));
            }
            gapComposer = gapComposer2;
            gapComposer.updateRememberedValue(rememberedValue);
        } else {
            gapComposer = gapComposer3;
            neverEqualPolicy = neverEqualPolicy2;
        }
        RecoveryGuideViewModel recoveryGuideViewModel = (RecoveryGuideViewModel) rememberedValue;
        Object[] objArr = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
        if (rememberedValue2 == neverEqualPolicy3) {
            rememberedValue2 = new SheetKt$$ExternalSyntheticLambda9(2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 48);
        Unit unit = Unit.INSTANCE;
        boolean changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy3) {
            continuation = null;
            rememberedValue3 = new ProfileCropView.AnonymousClass3(this, mutableState, continuation, 14);
            gapComposer.updateRememberedValue(rememberedValue3);
        } else {
            continuation = null;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 8));
        gapComposer.end(false);
        return recoveryGuideViewModel;
    }

    private final Object models$com$squareup$cash$shopping$autofill$presenters$AutofillPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1720564877);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = StateFlowKt.mapState(Trace.valuesState((FeatureFlagManager) this.screen, LaunchDarklyFeatureFlags$CommerceBrowserEditAutofill.INSTANCE), new RealSheetState$$ExternalSyntheticLambda0(6));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(asLoadedState((AutofillScreen) this.launcher, ((Boolean) collectAsState.getValue()).booleanValue()));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = ((RealProfileManager) this.clock).profile();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new ScoreSummaryKt$$ExternalSyntheticLambda1(mutableState2, mutableState, 8);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Function0 function0 = (Function0) rememberedValue6;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = new CardTransitionKt$$ExternalSyntheticLambda4(9, this, mutableState2, mutableState);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect(gapComposer, flow, new SessionWorkerKt$runSession$4$1(flow, null, this, coroutineScope, mutableState2, collectAsState2, (Function1) rememberedValue7, function0, collectAsState, mutableState));
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
            mutableState.setValue(AutofillViewModel.Loading.INSTANCE);
        }
        AutofillViewModel autofillViewModel = (AutofillViewModel) mutableState.getValue();
        gapComposer.end(false);
        return autofillViewModel;
    }

    private final Object models$com$squareup$cash$shopping$autofill$presenters$EditAutofillPresenter(Flow flow, Composer composer, int i) {
        Object content;
        AutofillCombinedInfo autofillCombinedInfo = (AutofillCombinedInfo) this.screen;
        EditAutofillScreen editAutofillScreen = (EditAutofillScreen) this.clock;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1988036619);
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
        Updater.LaunchedEffect(gapComposer, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, mutableState, mutableState3, mutableState2, 8));
        AutofillState autofillState = (AutofillState) mutableState2.getValue();
        if (Intrinsics.areEqual(autofillState, AutofillState.Loading.INSTANCE)) {
            content = EditAutofillViewModel.LoadingViewModel.INSTANCE;
        } else if (Intrinsics.areEqual(autofillState, AutofillState.Success.INSTANCE)) {
            content = new EditAutofillViewModel.SuccessViewModel(androidStringManager.get(R.string.edit_autofill_success_message));
        } else if (autofillState instanceof AutofillState.Error) {
            RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator = (RealAutofillNetworkFailureMessageGenerator) this.installedStore;
            Screen screen = editAutofillScreen.origin;
            AutofillState autofillState2 = (AutofillState) mutableState2.getValue();
            autofillState2.getClass();
            Pair submitErrorMessaging = realAutofillNetworkFailureMessageGenerator.getSubmitErrorMessaging(screen, ((AutofillState.Error) autofillState2).result);
            content = new EditAutofillViewModel.ErrorViewModel((String) submitErrorMessaging.first, (String) submitErrorMessaging.second, androidStringManager.get(R.string.ok));
        } else {
            if (!Intrinsics.areEqual(autofillState, loaded)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ArrayList inputFields = InputViewModelExtKt.getInputFields((AutofillCombinedInfo) mutableState.getValue(), androidStringManager);
            boolean allValid = InputViewModelExtKt.allValid(inputFields);
            Screen screen2 = editAutofillScreen.origin;
            content = new EditAutofillViewModel.Content(androidStringManager.get(R.string.edit_autofill_title), androidStringManager.get(R.string.edit_autofill_subtitle), androidStringManager.get(R.string.edit_autofill_footer), screen2 instanceof AutofillScreen.OfferAutofillScreen ? androidStringManager.get(R.string.edit_save_and_autofill) : ((screen2 instanceof AutofillScreen.UpdateAutofillScreen) || (screen2 instanceof AutofillScreen.SaveAutofillScreen)) ? androidStringManager.get(R.string.edit_save) : "", allValid && !Intrinsics.areEqual((AutofillCombinedInfo) mutableState.getValue(), autofillCombinedInfo), inputFields, ((Boolean) mutableState3.getValue()).booleanValue() ? new DialogViewModel(androidStringManager.get(R.string.unsaved_changes_dialog_title), androidStringManager.get(R.string.unsaved_changes_dialog_body), androidStringManager.get(R.string.discard), androidStringManager.get(R.string.cancel)) : null);
        }
        gapComposer.end(false);
        return content;
    }

    public static final ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting viewModels$getPrivacySetting(Map map, SearchPrivacySectionViewEvent.SearchSettingType searchSettingType, Boolean bool, List list) {
        boolean booleanValue;
        boolean z = true;
        if (list.isEmpty()) {
            booleanValue = false;
        } else {
            Boolean bool2 = (Boolean) map.get(searchSettingType);
            booleanValue = bool2 != null ? bool2.booleanValue() : true;
        }
        if (list.isEmpty()) {
            z = false;
        } else if (bool != null) {
            z = bool.booleanValue();
        }
        return new ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting(list, z, booleanValue);
    }

    public AutofillViewModel.Loaded asLoadedState(AutofillScreen autofillScreen, boolean z) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        String str = null;
        if (autofillScreen instanceof AutofillScreen.SaveAutofillScreen) {
            return new AutofillViewModel.Loaded(androidStringManager.get(R.string.save_your_autofill_info_title), androidStringManager.get(R.string.save_autofill_body), androidStringManager.get(R.string.save_autofill_cta), null, AutofillMapperKt.toAutofillData(null, (Map) ((AutofillScreen.SaveAutofillScreen) autofillScreen).capturedData.getValue()), z);
        }
        if (autofillScreen instanceof AutofillScreen.UpdateAutofillScreen) {
            return new AutofillViewModel.Loaded(androidStringManager.get(R.string.update_your_autofill_info_title), androidStringManager.get(R.string.update_autofill_body), androidStringManager.get(R.string.update_autofill_cta), null, AutofillMapperKt.toAutofillData(null, (Map) ((AutofillScreen.UpdateAutofillScreen) autofillScreen).capturedData.getValue()), z);
        }
        if (!(autofillScreen instanceof AutofillScreen.OfferAutofillScreen)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        AutofillScreen.OfferAutofillScreen offerAutofillScreen = (AutofillScreen.OfferAutofillScreen) autofillScreen;
        WebViewUseCase webViewUseCase = offerAutofillScreen.paymentMethod;
        Redacted redacted = offerAutofillScreen.cardData;
        Redacted redacted2 = offerAutofillScreen.capturedData;
        switch (webViewUseCase.ordinal()) {
            case 0:
            case 2:
            case 3:
            case 4:
                return new AutofillViewModel.Loaded(androidStringManager.get(R.string.autofill_your_info), androidStringManager.get(R.string.autofill_body_text), androidStringManager.get(R.string.autofill_cta), androidStringManager.get(R.string.autofill_subtitle), AutofillMapperKt.toAutofillData(null, (Map) redacted2.getValue()), z);
            case 1:
                String str2 = androidStringManager.get(R.string.autofill_your_info);
                String str3 = androidStringManager.get(R.string.autofill_body_text);
                String str4 = androidStringManager.get(R.string.autofill_cta);
                Map map = (Map) redacted2.getValue();
                if (redacted.getValue() != null) {
                    Object value = redacted.getValue();
                    value.getClass();
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    str = new MessageFormat(resources.getString(R.string.card_number_text)).format(new Object[]{value});
                    str.getClass();
                }
                return new AutofillViewModel.Loaded(str2, str3, str4, null, AutofillMapperKt.toAutofillData(str, map), z);
            case 5:
            case 6:
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Unsupported use-case ", webViewUseCase, ".");
                return null;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.installedStore;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.clock;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable initiateTransferInFlow(String str, BalanceSnapshot balanceSnapshot, Function1 function1, ContinuationImpl continuationImpl) {
        TransferringPresenter$initiateTransferInFlow$1 transferringPresenter$initiateTransferInFlow$1;
        int i;
        Function1 function12;
        ApiResult apiResult;
        TransferProcessingScreen transferProcessingScreen = (TransferProcessingScreen) this.screen;
        if (continuationImpl instanceof TransferringPresenter$initiateTransferInFlow$1) {
            transferringPresenter$initiateTransferInFlow$1 = (TransferringPresenter$initiateTransferInFlow$1) continuationImpl;
            int i2 = transferringPresenter$initiateTransferInFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                transferringPresenter$initiateTransferInFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = transferringPresenter$initiateTransferInFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferringPresenter$initiateTransferInFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BalanceMoverAppService balanceMoverAppService = (BalanceMoverAppService) this.launcher;
                    SavingsCashInRequest savingsCashInRequest = new SavingsCashInRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), RealUuidGenerator.generate().toString(), transferProcessingScreen.savingsFolderToken, balanceSnapshot != null ? new com.squareup.protos.franklin.ui.BalanceSnapshot(balanceSnapshot.token, balanceSnapshot.version, balanceSnapshot.balance, BalanceSnapshot.Type.PRIMARY, ByteString.EMPTY) : null, transferProcessingScreen.amount, null, transferProcessingScreen.context, null, null, ByteString.EMPTY);
                    function12 = function1;
                    transferringPresenter$initiateTransferInFlow$1.L$2 = function12;
                    transferringPresenter$initiateTransferInFlow$1.label = 1;
                    obj = balanceMoverAppService.savingsCashIn(str, savingsCashInRequest, transferringPresenter$initiateTransferInFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = transferringPresenter$initiateTransferInFlow$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    apiResult.getClass();
                    ResponseContext responseContext = ((SavingsCashInResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    return responseContext;
                }
                AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
                String format2 = ((MoneyFormatter) this.responseContextHandler).format(transferProcessingScreen.amount);
                format2.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.savings_add_cash_error)).format(new Object[]{format2});
                format3.getClass();
                function12.invoke(format3);
                return null;
            }
        }
        transferringPresenter$initiateTransferInFlow$1 = new TransferringPresenter$initiateTransferInFlow$1(this, continuationImpl);
        Object obj2 = transferringPresenter$initiateTransferInFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferringPresenter$initiateTransferInFlow$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable initiateTransferOutFlow(String str, com.squareup.cash.instruments.common.BalanceSnapshot balanceSnapshot, Function1 function1, ContinuationImpl continuationImpl) {
        TransferringPresenter$initiateTransferOutFlow$1 transferringPresenter$initiateTransferOutFlow$1;
        int i;
        Function1 function12;
        ApiResult apiResult;
        TransferProcessingScreen transferProcessingScreen = (TransferProcessingScreen) this.screen;
        if (continuationImpl instanceof TransferringPresenter$initiateTransferOutFlow$1) {
            transferringPresenter$initiateTransferOutFlow$1 = (TransferringPresenter$initiateTransferOutFlow$1) continuationImpl;
            int i2 = transferringPresenter$initiateTransferOutFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                transferringPresenter$initiateTransferOutFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = transferringPresenter$initiateTransferOutFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferringPresenter$initiateTransferOutFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BalanceMoverAppService balanceMoverAppService = (BalanceMoverAppService) this.launcher;
                    SavingsMoveCashRequest savingsMoveCashRequest = new SavingsMoveCashRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), RealUuidGenerator.generate().toString(), transferProcessingScreen.savingsFolderToken, null, transferProcessingScreen.amount, transferProcessingScreen.context, balanceSnapshot != null ? new com.squareup.protos.franklin.ui.BalanceSnapshot(balanceSnapshot.token, balanceSnapshot.version, balanceSnapshot.balance, BalanceSnapshot.Type.PRIMARY, ByteString.EMPTY) : null, null, ByteString.EMPTY);
                    function12 = function1;
                    transferringPresenter$initiateTransferOutFlow$1.L$2 = function12;
                    transferringPresenter$initiateTransferOutFlow$1.label = 1;
                    obj = balanceMoverAppService.savingsMoveCash(str, savingsMoveCashRequest, transferringPresenter$initiateTransferOutFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = transferringPresenter$initiateTransferOutFlow$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    apiResult.getClass();
                    ResponseContext responseContext = ((SavingsMoveCashResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    return responseContext;
                }
                AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
                String format2 = ((MoneyFormatter) this.responseContextHandler).format(transferProcessingScreen.amount);
                format2.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.savings_move_cash_error)).format(new Object[]{format2});
                format3.getClass();
                function12.invoke(format3);
                return null;
            }
        }
        transferringPresenter$initiateTransferOutFlow$1 = new TransferringPresenter$initiateTransferOutFlow$1(this, continuationImpl);
        Object obj2 = transferringPresenter$initiateTransferOutFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferringPresenter$initiateTransferOutFlow$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x055b A[LOOP:3: B:246:0x0555->B:248:0x055b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05b7  */
    /* JADX WARN: Type inference failed for: r10v10, types: [app.cash.local.viewmodels.LocalEditorialContent$Text] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel$TextStack] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$ProgressSection] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v6, types: [app.cash.local.viewmodels.LocalEditorialContent$Image] */
    /* JADX WARN: Type inference failed for: r10v7, types: [app.cash.local.viewmodels.LocalEditorialContent$Spacer] */
    /* JADX WARN: Type inference failed for: r11v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102, types: [com.squareup.protos.lending.sync_values.BorrowLimitHubData$IncreaseLimitActionsSection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111, types: [com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection] */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v154 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75, types: [com.squareup.protos.lending.sync_values.BorrowLimitHubData$LimitProgressSection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v97 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel$TextStack] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40, types: [com.squareup.protos.lending.sync_values.BorrowLimitHubData$Section$Section$ProgressSection] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        EditorialToken editorialToken;
        MutableState mutableState;
        Continuation continuation;
        boolean z;
        LocalEditorialViewModel localEditorialViewModel;
        Iterator it;
        Set set;
        BrandSpot brandSpot;
        LocalEditorialContent.BrandCarousel brandCarousel;
        Iterator it2;
        LocalEditorialContent.BrandCarousel.CarouselImage carouselImage;
        LocalEditorialText.Font font;
        LocalEditorialText.Alignment alignment;
        LocalEditorialText.Alignment alignment2;
        LocalEditorialText.Weight weight;
        BorrowLimitHubViewModel borrowLimitHubViewModel;
        Object obj;
        Object obj2;
        BorrowLimitHubData.LimitInfoBulletsSection limitInfoBulletsSection;
        BorrowLimitHubData.LimitDisclaimerSection limitDisclaimerSection;
        BorrowLimitHubViewModel.Section section;
        BorrowLimitHubData.LimitDisclaimerSection limitDisclaimerSection2;
        BorrowLimitHubData.LimitInfoBulletsSection limitInfoBulletsSection2;
        ?? r1;
        BorrowLimitHubViewModel.CtaBullet.Accessory accessory;
        BorrowLimitHubViewModel.CtaBullet.Accessory accessory2;
        ?? r6;
        BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar segmentedProgressBar;
        ?? r11;
        List list;
        com.squareup.cash.db.contacts.Recipient recipient;
        Object obj3;
        Object loaded;
        int i2 = this.$r8$classId;
        int i3 = 25;
        int i4 = 22;
        Object obj4 = this.service;
        Object obj5 = this.screen;
        Object obj6 = this.installedStore;
        Object obj7 = this.clock;
        Object obj8 = this.launcher;
        Object obj9 = this.stringManager;
        int i5 = 1;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation2 = null;
        Object obj10 = null;
        String str = null;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-625791330);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState3 = (MutableState) rememberedValue2;
                EditorialToken editorialToken2 = new EditorialToken(((LocalEditorialScreen) obj5).editorialToken);
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    editorialToken = editorialToken2;
                    SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2(this, mutableState3, mutableState2, null, 24);
                    mutableState = mutableState2;
                    continuation = null;
                    gapComposer.updateRememberedValue(sliderState$drag$2);
                    rememberedValue3 = sliderState$drag$2;
                } else {
                    mutableState = mutableState2;
                    editorialToken = editorialToken2;
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer, editorialToken, (Function2) rememberedValue3);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Updater.mutableStateOf$default(continuation);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState4 = (MutableState) rememberedValue4;
                Object rememberedValue5 = gapComposer.rememberedValue();
                int i6 = 3;
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(((RealLocalInstalledStore) ((LocalInstalledStore) obj6)).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalCard), new ToastKt$Toast$7$1(mutableState4, continuation, i5), i6), i5);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue5, EmptySet.INSTANCE, null, gapComposer, 48, 2);
                Object obj11 = continuation;
                Updater.LaunchedEffect(gapComposer, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, this, mutableState3, mutableState4, 10));
                GetEditorialResponse getEditorialResponse = (GetEditorialResponse) mutableState3.getValue();
                if (getEditorialResponse != null) {
                    Set set2 = (Set) collectAsState.getValue();
                    BrandSpot brandSpot2 = (BrandSpot) mutableState4.getValue();
                    String str2 = getEditorialResponse.title;
                    GetEditorialResponse.ShareLinkInfo shareLinkInfo = getEditorialResponse.share_link_info;
                    boolean z2 = (shareLinkInfo != null ? shareLinkInfo.url : obj11) != null;
                    List list2 = getEditorialResponse.contents;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        zzic zzicVar = ((GetEditorialResponse.EditorialContent) it3.next()).content_type;
                        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Text) {
                            GetEditorialResponse.EditorialContent.Text text = ((GetEditorialResponse$EditorialContent$ContentType$Text) zzicVar).value;
                            String str3 = text.markdown_text;
                            String str4 = str3 == null ? "" : str3;
                            GetEditorialResponse.EditorialContent.Text.Font font2 = text.font;
                            if (font2 != null) {
                                Long l = font2.size;
                                GetEditorialResponse.EditorialContent.Text.Font.Weight weight2 = font2.weight;
                                int i7 = weight2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[weight2.ordinal()];
                                if (i7 == -1 || i7 == 1) {
                                    weight = null;
                                } else if (i7 == 2) {
                                    weight = LocalEditorialText.Weight.NORMAL;
                                } else if (i7 == 3) {
                                    weight = LocalEditorialText.Weight.MEDIUM;
                                } else if (i7 == 4) {
                                    weight = LocalEditorialText.Weight.SEMIBOLD;
                                } else {
                                    if (i7 != 5) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    weight = LocalEditorialText.Weight.BOLD;
                                }
                                font = new LocalEditorialText.Font(l, weight);
                            } else {
                                font = null;
                            }
                            LocalColor localColor = text.color;
                            Long l2 = text.line_limit;
                            Integer valueOf = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
                            GetEditorialResponse.EditorialContent.Text.Alignment alignment3 = text.alignment;
                            int i8 = alignment3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[alignment3.ordinal()];
                            if (i8 != -1 && i8 != 1) {
                                if (i8 == 2) {
                                    alignment2 = LocalEditorialText.Alignment.START;
                                } else if (i8 == 3) {
                                    alignment2 = LocalEditorialText.Alignment.CENTER;
                                } else {
                                    if (i8 != 4) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    alignment2 = LocalEditorialText.Alignment.END;
                                }
                                alignment = alignment2;
                                brandCarousel = new LocalEditorialContent.Text(new LocalEditorialText(str4, font, localColor, alignment, valueOf));
                                it = it3;
                                set = set2;
                                brandSpot = brandSpot2;
                            }
                            alignment = null;
                            brandCarousel = new LocalEditorialContent.Text(new LocalEditorialText(str4, font, localColor, alignment, valueOf));
                            it = it3;
                            set = set2;
                            brandSpot = brandSpot2;
                        } else {
                            if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Spacer) {
                                GetEditorialResponse.EditorialContent.Spacer spacer = ((GetEditorialResponse$EditorialContent$ContentType$Spacer) zzicVar).value;
                                Long l3 = spacer.height;
                                int longValue = l3 != null ? (int) l3.longValue() : 0;
                                Boolean bool = spacer.divider;
                                brandCarousel = new LocalEditorialContent.Spacer(longValue, bool != null ? bool.booleanValue() : false);
                            } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Image) {
                                LocalImage localImage = ((GetEditorialResponse$EditorialContent$ContentType$Image) zzicVar).value.image;
                                localImage.getClass();
                                brandCarousel = new LocalEditorialContent.Image(localImage);
                            } else {
                                if (!(zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$BrandCarousel)) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Unsupported editorial content type");
                                    return null;
                                }
                                GetEditorialResponse.EditorialContent.BrandCarousel brandCarousel2 = ((GetEditorialResponse$EditorialContent$ContentType$BrandCarousel) zzicVar).value;
                                String str5 = brandCarousel2.brand_token;
                                str5.getClass();
                                String str6 = brandCarousel2.location_token;
                                if (str6 == null) {
                                    str6 = null;
                                }
                                BrandSpot brandSpot3 = new BrandSpot(str5, str6);
                                String str7 = brandCarousel2.name;
                                str7.getClass();
                                LocalLocationSummary localLocationSummary = brandCarousel2.location;
                                LocationStatus status = localLocationSummary != null ? LocationsKt.status(LocationKt.toLocation(localLocationSummary), null, brandCarousel2.category, null, (AndroidClock) obj7, (AndroidStringManager) obj9, LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED) : null;
                                String str8 = brandCarousel2.description;
                                String str9 = brandCarousel2.share_url;
                                AddRemoveIcon addRemoveIcon = Intrinsics.areEqual(brandSpot2, brandSpot3) ? AddRemoveIcon.LOADING : set2.contains(brandSpot3) ? AddRemoveIcon.CHECK : AddRemoveIcon.PLUS;
                                List list3 = brandCarousel2.carousel_images;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    Iterator it5 = it3;
                                    GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage carouselImage2 = (GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage) it4.next();
                                    Set set3 = set2;
                                    LocalImage localImage2 = carouselImage2.image;
                                    BrandSpot brandSpot4 = brandSpot2;
                                    if (localImage2 != null) {
                                        it2 = it4;
                                        carouselImage = new LocalEditorialContent.BrandCarousel.CarouselImage(localImage2, carouselImage2.client_route_url, carouselImage2.overlay_text);
                                    } else {
                                        it2 = it4;
                                        carouselImage = null;
                                    }
                                    if (carouselImage != null) {
                                        arrayList2.add(carouselImage);
                                    }
                                    it3 = it5;
                                    set2 = set3;
                                    brandSpot2 = brandSpot4;
                                    it4 = it2;
                                }
                                it = it3;
                                set = set2;
                                brandSpot = brandSpot2;
                                brandCarousel = new LocalEditorialContent.BrandCarousel(brandSpot3, str7, status, str8, str9, addRemoveIcon, arrayList2);
                            }
                            it = it3;
                            set = set2;
                            brandSpot = brandSpot2;
                        }
                        arrayList.add(brandCarousel);
                        it3 = it;
                        set2 = set;
                        brandSpot2 = brandSpot;
                        i6 = 3;
                        i5 = 1;
                    }
                    z = false;
                    localEditorialViewModel = new LocalEditorialViewModel(str2, arrayList, false, z2);
                } else {
                    z = false;
                    localEditorialViewModel = new LocalEditorialViewModel(null, EmptyList.INSTANCE, ((Boolean) mutableState.getValue()).booleanValue(), false);
                }
                LocalEditorialViewModel localEditorialViewModel2 = localEditorialViewModel;
                gapComposer.end(z);
                return localEditorialViewModel2;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(702057896);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = Updater.mutableStateOf$default(TapToPayPaymentRequestViewModel.Requesting.INSTANCE);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                MutableState mutableState5 = (MutableState) rememberedValue6;
                Object rememberedValue7 = gapComposer2.rememberedValue();
                Continuation continuation3 = null;
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState6 = (MutableState) rememberedValue7;
                String str10 = (String) obj5;
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new TaxWebAppPresenter$models$1$1(this, mutableState5, mutableState6, (Continuation) null);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                Updater.LaunchedEffect(gapComposer2, str10, (Function2) rememberedValue8);
                Updater.LaunchedEffect(gapComposer2, flow, new TaxWebAppPresenter$models$1$1(flow, continuation3, (MoleculePresenter) this, mutableState6, 19));
                TapToPayPaymentRequestViewModel tapToPayPaymentRequestViewModel = (TapToPayPaymentRequestViewModel) mutableState5.getValue();
                gapComposer2.end(false);
                return tapToPayPaymentRequestViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1698095688);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer3.changedInstance(this);
                Object rememberedValue9 = gapComposer3.rememberedValue();
                if (changedInstance3 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new RealBadger2$clear$2(this, null, i3);
                    gapComposer3.updateRememberedValue(rememberedValue9);
                }
                Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue9);
                Object rememberedValue10 = gapComposer3.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = ((RealLocalInstalledStore) ((LocalInstalledStore) obj6)).selectLocalCashActivity();
                    gapComposer3.updateRememberedValue(rememberedValue10);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer3, 48, 2);
                Updater.LaunchedEffect(gapComposer3, flow, new SliderState$drag$2(flow, (Continuation) null, this, i4));
                Object rememberedValue11 = gapComposer3.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = Updater.derivedStateOf(new StatusRunnable$$ExternalSyntheticLambda1(5, this, collectAsState2));
                    gapComposer3.updateRememberedValue(rememberedValue11);
                }
                LocalCashAllActivityViewModel localCashAllActivityViewModel = new LocalCashAllActivityViewModel((List) ((State) rememberedValue11).getValue());
                gapComposer3.end(false);
                return localCashAllActivityViewModel;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-565255898);
                Object rememberedValue12 = gapComposer4.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer4.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState7 = (MutableState) rememberedValue12;
                Object rememberedValue13 = gapComposer4.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer4);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue13;
                Object rememberedValue14 = gapComposer4.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = Updater.mutableStateOf$default(null);
                    gapComposer4.updateRememberedValue(rememberedValue14);
                }
                MutableState mutableState8 = (MutableState) rememberedValue14;
                Updater.LaunchedEffect(gapComposer4, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, mutableState7, mutableState8, parcelableSnapshotMutableIntState, 7));
                Integer valueOf2 = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
                boolean changedInstance4 = gapComposer4.changedInstance(this);
                Object rememberedValue15 = gapComposer4.rememberedValue();
                if (changedInstance4 || rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = new NetworkFetcher$doFetch$fetchResult$1(this, mutableState7, mutableState8, (Continuation) null);
                    gapComposer4.updateRememberedValue(rememberedValue15);
                }
                Updater.LaunchedEffect(gapComposer4, valueOf2, (Function2) rememberedValue15);
                LocalCheckoutDeeplinkPresenter$PendingCheckout localCheckoutDeeplinkPresenter$PendingCheckout = (LocalCheckoutDeeplinkPresenter$PendingCheckout) mutableState8.getValue();
                boolean changedInstance5 = gapComposer4.changedInstance(this);
                Object rememberedValue16 = gapComposer4.rememberedValue();
                if (changedInstance5 || rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = new LocalCheckoutDeeplinkPresenter$models$3$1(this, mutableState8, mutableState7, null);
                    gapComposer4.updateRememberedValue(rememberedValue16);
                }
                Updater.LaunchedEffect(gapComposer4, localCheckoutDeeplinkPresenter$PendingCheckout, (Function2) rememberedValue16);
                Object obj12 = ((Boolean) mutableState7.getValue()).booleanValue() ? LocalOrderStatusViewModel.Error.INSTANCE : LocalOrderStatusViewModel.Loading.INSTANCE;
                gapComposer4.end(false);
                return obj12;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(678235366);
                Object rememberedValue17 = gapComposer5.rememberedValue();
                if (rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = Updater.mutableStateOf$default(ThemeSwitcherViewModel.Loading.INSTANCE);
                    gapComposer5.updateRememberedValue(rememberedValue17);
                }
                MutableState mutableState9 = (MutableState) rememberedValue17;
                Object rememberedValue18 = gapComposer5.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer5);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue18;
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer5.changedInstance(this);
                Object rememberedValue19 = gapComposer5.rememberedValue();
                if (changedInstance6 || rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = new MLKitTitleGenerator$1(this, null, i5);
                    gapComposer5.updateRememberedValue(rememberedValue19);
                }
                Updater.LaunchedEffect(gapComposer5, unit2, (Function2) rememberedValue19);
                Integer valueOf3 = Integer.valueOf(parcelableSnapshotMutableIntState2.getIntValue());
                boolean changedInstance7 = gapComposer5.changedInstance(this);
                Object rememberedValue20 = gapComposer5.rememberedValue();
                if (changedInstance7 || rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = new NetworkFetcher$doFetch$fetchResult$1(this, mutableState9, null);
                    gapComposer5.updateRememberedValue(rememberedValue20);
                }
                Updater.LaunchedEffect(gapComposer5, valueOf3, (Function2) rememberedValue20);
                Updater.LaunchedEffect(gapComposer5, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, this, mutableState9, parcelableSnapshotMutableIntState2, 22));
                ThemeSwitcherViewModel themeSwitcherViewModel = (ThemeSwitcherViewModel) mutableState9.getValue();
                gapComposer5.end(false);
                return themeSwitcherViewModel;
            case 5:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj9;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-724855483);
                Object rememberedValue21 = gapComposer6.rememberedValue();
                if (rememberedValue21 == neverEqualPolicy) {
                    CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealProfileManager) obj6).publicProfile(), 18);
                    gapComposer6.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                    rememberedValue21 = cardModelView$cardHeat$$inlined$map$1;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue21, null, null, gapComposer6, 48, 2);
                Object rememberedValue22 = gapComposer6.rememberedValue();
                Object obj13 = rememberedValue22;
                if (rememberedValue22 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(((StablecoinDepositScreen) this.responseContextHandler).option);
                    gapComposer6.updateRememberedValue(mutableStateOf$default);
                    obj13 = mutableStateOf$default;
                }
                MutableState mutableState10 = (MutableState) obj13;
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance8 = gapComposer6.changedInstance(this);
                Object rememberedValue23 = gapComposer6.rememberedValue();
                Continuation continuation4 = null;
                Object obj14 = rememberedValue23;
                if (changedInstance8 || rememberedValue23 == neverEqualPolicy) {
                    MLKitTitleGenerator$1 mLKitTitleGenerator$1 = new MLKitTitleGenerator$1(this, continuation4, 21);
                    gapComposer6.updateRememberedValue(mLKitTitleGenerator$1);
                    obj14 = mLKitTitleGenerator$1;
                }
                Updater.LaunchedEffect(gapComposer6, unit3, (Function2) obj14);
                boolean changedInstance9 = gapComposer6.changedInstance(this);
                Object rememberedValue24 = gapComposer6.rememberedValue();
                Object obj15 = rememberedValue24;
                if (changedInstance9 || rememberedValue24 == neverEqualPolicy) {
                    BitcoinUiFactory$$ExternalSyntheticLambda12 bitcoinUiFactory$$ExternalSyntheticLambda12 = new BitcoinUiFactory$$ExternalSyntheticLambda12(5, this, mutableState10);
                    gapComposer6.updateRememberedValue(bitcoinUiFactory$$ExternalSyntheticLambda12);
                    obj15 = bitcoinUiFactory$$ExternalSyntheticLambda12;
                }
                Function2 function2 = (Function2) obj15;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer6.consume(AnswersKt.LocalAnswerDispatcher);
                boolean changed = gapComposer6.changed(function2) | gapComposer6.changedInstance(answerDispatcher);
                Object rememberedValue25 = gapComposer6.rememberedValue();
                Object obj16 = rememberedValue25;
                if (changed || rememberedValue25 == neverEqualPolicy) {
                    VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 16);
                    gapComposer6.updateRememberedValue(verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1);
                    obj16 = verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) obj16, gapComposer6);
                StablecoinNetwork stablecoinNetwork = ((StablecoinDepositOption) mutableState10.getValue()).network;
                Updater.LaunchedEffect(gapComposer6, flow, new SetNamePresenter$models$1$1$1(9, mutableState10, this, flow, continuation4));
                QrCodeModel models = ((RealQrCodesPresenter) obj4).models(new QrCodeArgs((Integer) null, (Integer) null, (Integer) null, (Integer) null, (CurrencyCode) null, 0, 72), ((StablecoinDepositOption) mutableState10.getValue()).qrCodeUrl, gapComposer6, 0);
                String str11 = (String) collectAsState3.getValue();
                String str12 = stablecoinNetwork.assetName;
                String str13 = str11 != null ? str11 : "";
                str12.getClass();
                Object[] objArr = {str13, str12};
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.stablecoin_deposit_description)).format(objArr);
                format2.getClass();
                String str14 = stablecoinNetwork.chainName;
                str14.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.stablecoin_deposit_copy_disclaimer)).format(new Object[]{str14});
                format3.getClass();
                StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = new StablecoinDepositViewModel$Loaded(models, format2, str14, format3);
                gapComposer6.end(false);
                return stablecoinDepositViewModel$Loaded;
            case 6:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(1204506147);
                Object rememberedValue26 = gapComposer7.rememberedValue();
                if (rememberedValue26 == neverEqualPolicy) {
                    rememberedValue26 = Updater.mutableStateOf$default(new OnboardingInternalRouteViewModel(true, (String) obj7, (String) obj9, (String) obj5));
                    gapComposer7.updateRememberedValue(rememberedValue26);
                }
                MutableState mutableState11 = (MutableState) rememberedValue26;
                Object rememberedValue27 = gapComposer7.rememberedValue();
                if (rememberedValue27 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new Object(), NeverEqualPolicy.INSTANCE);
                    gapComposer7.updateRememberedValue(parcelableSnapshotMutableState);
                    rememberedValue27 = parcelableSnapshotMutableState;
                }
                MutableState mutableState12 = (MutableState) rememberedValue27;
                Object value = mutableState12.getValue();
                boolean changedInstance10 = gapComposer7.changedInstance(this);
                Object rememberedValue28 = gapComposer7.rememberedValue();
                Continuation continuation5 = null;
                if (changedInstance10 || rememberedValue28 == neverEqualPolicy) {
                    rememberedValue28 = new PasscodePresenter$models$1$2(this, mutableState11, mutableState12, (Continuation) null);
                    gapComposer7.updateRememberedValue(rememberedValue28);
                }
                Updater.LaunchedEffect(gapComposer7, value, (Function2) rememberedValue28);
                Updater.LaunchedEffect(gapComposer7, flow, new CashMapPresenter$models$$inlined$CollectEffect$1(flow, continuation5, mutableState11, mutableState12, 1));
                OnboardingInternalRouteViewModel onboardingInternalRouteViewModel = (OnboardingInternalRouteViewModel) mutableState11.getValue();
                gapComposer7.end(false);
                return onboardingInternalRouteViewModel;
            case 7:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(1612004321);
                Updater.LaunchedEffect(gapComposer8, flow, new FileBlockerView$6$2$2(flow, continuation2, this, i3));
                Object rememberedValue29 = gapComposer8.rememberedValue();
                if (rememberedValue29 == neverEqualPolicy) {
                    RealBorrowDataManager realBorrowDataManager = (RealBorrowDataManager) obj8;
                    RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(realBorrowDataManager.syncValueReader.getSingleValue(AndroidSyncValueSpecs.BorrowLimitHubData), realBorrowDataManager, 7);
                    gapComposer8.updateRememberedValue(realTransferManager$addCash$$inlined$map$1);
                    rememberedValue29 = realTransferManager$addCash$$inlined$map$1;
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue29, null, null, gapComposer8, 48, 2);
                BorrowLimitHubData borrowLimitHubData = (BorrowLimitHubData) collectAsState4.getValue();
                boolean changed2 = gapComposer8.changed(collectAsState4) | gapComposer8.changedInstance(this);
                Object rememberedValue30 = gapComposer8.rememberedValue();
                Object obj17 = rememberedValue30;
                if (changed2 || rememberedValue30 == neverEqualPolicy) {
                    BorrowLimitHubPresenter$models$2$1 borrowLimitHubPresenter$models$2$1 = new BorrowLimitHubPresenter$models$2$1(this, collectAsState4, null);
                    gapComposer8.updateRememberedValue(borrowLimitHubPresenter$models$2$1);
                    obj17 = borrowLimitHubPresenter$models$2$1;
                }
                Updater.LaunchedEffect(gapComposer8, borrowLimitHubData, (Function2) obj17);
                BorrowLimitHubData borrowLimitHubData2 = (BorrowLimitHubData) collectAsState4.getValue();
                if (borrowLimitHubData2 != null) {
                    LocalizedString localizedString = borrowLimitHubData2.title;
                    localizedString.getClass();
                    String str15 = localizedString.translated_value;
                    str15.getClass();
                    List<BorrowLimitHubData.Section> list4 = borrowLimitHubData2.sections;
                    ArrayList arrayList3 = new ArrayList();
                    for (BorrowLimitHubData.Section section2 : list4) {
                        zzjl zzjlVar = section2.section;
                        if (zzjlVar != null) {
                            ?? r10 = zzjlVar instanceof BorrowLimitHubData$Section$Section$ProgressSection ? (BorrowLimitHubData$Section$Section$ProgressSection) zzjlVar : continuation2;
                            if (r10 != null) {
                                obj = r10.value;
                                if (obj == null) {
                                    if (zzjlVar != null) {
                                        ?? r7 = zzjlVar instanceof BorrowLimitHubData$Section$Section$ProgressSection ? (BorrowLimitHubData$Section$Section$ProgressSection) zzjlVar : continuation2;
                                        if (r7 != null) {
                                            r6 = r7.value;
                                            r6.getClass();
                                            BorrowLimitHubData.LimitProgressSection.TextStack textStack = r6.leading_text_stack;
                                            ?? viewModel = textStack == null ? zzagn.toViewModel(textStack) : continuation2;
                                            BorrowLimitHubData.LimitProgressSection.TextStack textStack2 = r6.trailing_text_stack;
                                            ?? viewModel2 = textStack2 == null ? zzagn.toViewModel(textStack2) : continuation2;
                                            segmentedProgressBar = r6.progress_bar;
                                            if (segmentedProgressBar != null || (list = segmentedProgressBar.segments) == null) {
                                                r11 = EmptyList.INSTANCE;
                                            } else {
                                                List<BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment> list5 = list;
                                                r11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                                for (BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment segment : list5) {
                                                    Color color = segment.color;
                                                    color.getClass();
                                                    Float f = segment.percent;
                                                    f.getClass();
                                                    r11.add(new BorrowLimitHubViewModel.ProgressBarSegment(f.floatValue(), color));
                                                }
                                            }
                                            section = new BorrowLimitHubViewModel.Section.ProgressBarSectionModel(viewModel, viewModel2, r11);
                                        }
                                    }
                                    r6 = continuation2;
                                    r6.getClass();
                                    BorrowLimitHubData.LimitProgressSection.TextStack textStack3 = r6.leading_text_stack;
                                    if (textStack3 == null) {
                                    }
                                    BorrowLimitHubData.LimitProgressSection.TextStack textStack22 = r6.trailing_text_stack;
                                    if (textStack22 == null) {
                                    }
                                    segmentedProgressBar = r6.progress_bar;
                                    if (segmentedProgressBar != null) {
                                    }
                                    r11 = EmptyList.INSTANCE;
                                    section = new BorrowLimitHubViewModel.Section.ProgressBarSectionModel(viewModel, viewModel2, r11);
                                } else {
                                    if (zzjlVar != null) {
                                        ?? r12 = zzjlVar instanceof BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection ? (BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) zzjlVar : continuation2;
                                        if (r12 != null) {
                                            obj2 = r12.value;
                                            if (obj2 == null) {
                                                if (zzjlVar != null) {
                                                    ?? r72 = zzjlVar instanceof BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection ? (BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) zzjlVar : continuation2;
                                                    if (r72 != null) {
                                                        r1 = r72.value;
                                                        r1.getClass();
                                                        LocalizedString localizedString2 = r1.title;
                                                        localizedString2.getClass();
                                                        String str16 = localizedString2.translated_value;
                                                        str16.getClass();
                                                        LocalizedString localizedString3 = r1.subtitle;
                                                        ?? r73 = localizedString3 == null ? localizedString3.translated_value : continuation2;
                                                        List<BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet> list6 = r1.cta_bullets;
                                                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                                        for (BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet cTABullet : list6) {
                                                            LocalizedString localizedString4 = cTABullet.accessory_label;
                                                            BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = cTABullet.action;
                                                            if (localizedString4 != null) {
                                                                if ((borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null ? borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value : null) != null) {
                                                                    String str17 = localizedString4.translated_value;
                                                                    str17.getClass();
                                                                    accessory2 = new BorrowLimitHubViewModel.CtaBullet.Accessory.LabeledPush(str17);
                                                                    accessory = accessory2;
                                                                    Icon icon = cTABullet.icon;
                                                                    LocalizedString localizedString5 = cTABullet.title;
                                                                    localizedString5.getClass();
                                                                    String str18 = localizedString5.translated_value;
                                                                    str18.getClass();
                                                                    LocalizedString localizedString6 = cTABullet.body;
                                                                    arrayList4.add(new BorrowLimitHubViewModel.CtaBullet(icon, str18, localizedString6 != null ? localizedString6.translated_value : null, accessory, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null ? borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value : null));
                                                                }
                                                            }
                                                            if (localizedString4 != null) {
                                                                String str19 = localizedString4.translated_value;
                                                                str19.getClass();
                                                                accessory2 = new BorrowLimitHubViewModel.CtaBullet.Accessory.Label(str19);
                                                            } else if ((borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null ? borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value : null) != null) {
                                                                accessory2 = BorrowLimitHubViewModel.CtaBullet.Accessory.Push.INSTANCE;
                                                            } else {
                                                                accessory = null;
                                                                Icon icon2 = cTABullet.icon;
                                                                LocalizedString localizedString52 = cTABullet.title;
                                                                localizedString52.getClass();
                                                                String str182 = localizedString52.translated_value;
                                                                str182.getClass();
                                                                LocalizedString localizedString62 = cTABullet.body;
                                                                arrayList4.add(new BorrowLimitHubViewModel.CtaBullet(icon2, str182, localizedString62 != null ? localizedString62.translated_value : null, accessory, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null ? borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value : null));
                                                            }
                                                            accessory = accessory2;
                                                            Icon icon22 = cTABullet.icon;
                                                            LocalizedString localizedString522 = cTABullet.title;
                                                            localizedString522.getClass();
                                                            String str1822 = localizedString522.translated_value;
                                                            str1822.getClass();
                                                            LocalizedString localizedString622 = cTABullet.body;
                                                            arrayList4.add(new BorrowLimitHubViewModel.CtaBullet(icon22, str1822, localizedString622 != null ? localizedString622.translated_value : null, accessory, borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null ? borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value : null));
                                                        }
                                                        section = new BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection(str16, r73, arrayList4);
                                                    }
                                                }
                                                r1 = continuation2;
                                                r1.getClass();
                                                LocalizedString localizedString22 = r1.title;
                                                localizedString22.getClass();
                                                String str162 = localizedString22.translated_value;
                                                str162.getClass();
                                                LocalizedString localizedString32 = r1.subtitle;
                                                if (localizedString32 == null) {
                                                }
                                                List<BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet> list62 = r1.cta_bullets;
                                                ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list62, 10));
                                                while (r1.hasNext()) {
                                                }
                                                section = new BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection(str162, r73, arrayList42);
                                            } else {
                                                if (zzjlVar != null) {
                                                    BorrowLimitHubData$Section$Section$LimitInfoBulletsSection borrowLimitHubData$Section$Section$LimitInfoBulletsSection = zzjlVar instanceof BorrowLimitHubData$Section$Section$LimitInfoBulletsSection ? (BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) zzjlVar : null;
                                                    if (borrowLimitHubData$Section$Section$LimitInfoBulletsSection != null) {
                                                        limitInfoBulletsSection = borrowLimitHubData$Section$Section$LimitInfoBulletsSection.value;
                                                        if (limitInfoBulletsSection == null) {
                                                            if (zzjlVar != null) {
                                                                BorrowLimitHubData$Section$Section$LimitInfoBulletsSection borrowLimitHubData$Section$Section$LimitInfoBulletsSection2 = zzjlVar instanceof BorrowLimitHubData$Section$Section$LimitInfoBulletsSection ? (BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) zzjlVar : null;
                                                                if (borrowLimitHubData$Section$Section$LimitInfoBulletsSection2 != null) {
                                                                    limitInfoBulletsSection2 = borrowLimitHubData$Section$Section$LimitInfoBulletsSection2.value;
                                                                    limitInfoBulletsSection2.getClass();
                                                                    LocalizedString localizedString7 = limitInfoBulletsSection2.title;
                                                                    localizedString7.getClass();
                                                                    String str20 = localizedString7.translated_value;
                                                                    str20.getClass();
                                                                    LocalizedString localizedString8 = limitInfoBulletsSection2.subtitle;
                                                                    String str21 = localizedString8 == null ? localizedString8.translated_value : null;
                                                                    List<BorrowLimitHubData.LimitInfoBulletsSection.Bullet> list7 = limitInfoBulletsSection2.bullets;
                                                                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                                                    for (BorrowLimitHubData.LimitInfoBulletsSection.Bullet bullet : list7) {
                                                                        Icon icon3 = bullet.icon;
                                                                        icon3.getClass();
                                                                        LocalizedString localizedString9 = bullet.text;
                                                                        localizedString9.getClass();
                                                                        String str22 = localizedString9.translated_value;
                                                                        str22.getClass();
                                                                        arrayList5.add(new BorrowLimitHubViewModel.InfoBullet(icon3, str22));
                                                                    }
                                                                    section = new BorrowLimitHubViewModel.Section.LimitInfoBulletsSection(str20, str21, arrayList5);
                                                                }
                                                            }
                                                            limitInfoBulletsSection2 = null;
                                                            limitInfoBulletsSection2.getClass();
                                                            LocalizedString localizedString72 = limitInfoBulletsSection2.title;
                                                            localizedString72.getClass();
                                                            String str202 = localizedString72.translated_value;
                                                            str202.getClass();
                                                            LocalizedString localizedString82 = limitInfoBulletsSection2.subtitle;
                                                            if (localizedString82 == null) {
                                                            }
                                                            List<BorrowLimitHubData.LimitInfoBulletsSection.Bullet> list72 = limitInfoBulletsSection2.bullets;
                                                            ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list72, 10));
                                                            while (r1.hasNext()) {
                                                            }
                                                            section = new BorrowLimitHubViewModel.Section.LimitInfoBulletsSection(str202, str21, arrayList52);
                                                        } else {
                                                            if (zzjlVar != null) {
                                                                BorrowLimitHubData$Section$Section$DisclaimerSection borrowLimitHubData$Section$Section$DisclaimerSection = zzjlVar instanceof BorrowLimitHubData$Section$Section$DisclaimerSection ? (BorrowLimitHubData$Section$Section$DisclaimerSection) zzjlVar : null;
                                                                if (borrowLimitHubData$Section$Section$DisclaimerSection != null) {
                                                                    limitDisclaimerSection = borrowLimitHubData$Section$Section$DisclaimerSection.value;
                                                                    if (limitDisclaimerSection == null) {
                                                                        if (zzjlVar != null) {
                                                                            BorrowLimitHubData$Section$Section$DisclaimerSection borrowLimitHubData$Section$Section$DisclaimerSection2 = zzjlVar instanceof BorrowLimitHubData$Section$Section$DisclaimerSection ? (BorrowLimitHubData$Section$Section$DisclaimerSection) zzjlVar : null;
                                                                            if (borrowLimitHubData$Section$Section$DisclaimerSection2 != null) {
                                                                                limitDisclaimerSection2 = borrowLimitHubData$Section$Section$DisclaimerSection2.value;
                                                                                limitDisclaimerSection2.getClass();
                                                                                LocalizedString localizedString10 = limitDisclaimerSection2.text;
                                                                                localizedString10.getClass();
                                                                                String str23 = localizedString10.translated_value;
                                                                                str23.getClass();
                                                                                section = new BorrowLimitHubViewModel.Section.DisclaimerSection(str23);
                                                                            }
                                                                        }
                                                                        limitDisclaimerSection2 = null;
                                                                        limitDisclaimerSection2.getClass();
                                                                        LocalizedString localizedString102 = limitDisclaimerSection2.text;
                                                                        localizedString102.getClass();
                                                                        String str232 = localizedString102.translated_value;
                                                                        str232.getClass();
                                                                        section = new BorrowLimitHubViewModel.Section.DisclaimerSection(str232);
                                                                    } else {
                                                                        UnsupportedBorrowLimitHubSection unsupportedBorrowLimitHubSection = new UnsupportedBorrowLimitHubSection(section2);
                                                                        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                                                                        if (errorReporter == null) {
                                                                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                                                            return null;
                                                                        }
                                                                        errorReporter.report(unsupportedBorrowLimitHubSection, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                                                        section = null;
                                                                    }
                                                                }
                                                            }
                                                            limitDisclaimerSection = null;
                                                            if (limitDisclaimerSection == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                limitInfoBulletsSection = null;
                                                if (limitInfoBulletsSection == null) {
                                                }
                                            }
                                        }
                                    }
                                    obj2 = continuation2;
                                    if (obj2 == null) {
                                    }
                                }
                                if (section == null) {
                                    arrayList3.add(section);
                                }
                                continuation2 = null;
                            }
                        }
                        obj = continuation2;
                        if (obj == null) {
                        }
                        if (section == null) {
                        }
                        continuation2 = null;
                    }
                    borrowLimitHubViewModel = new BorrowLimitHubViewModel(str15, arrayList3);
                } else {
                    borrowLimitHubViewModel = null;
                }
                List<BorrowLimitHubViewModel.Section> list8 = borrowLimitHubViewModel != null ? borrowLimitHubViewModel.sections : null;
                if (list8 == null) {
                    gapComposer8.startReplaceGroup(1192417335);
                } else {
                    gapComposer8.startReplaceGroup(1192417336);
                    for (BorrowLimitHubViewModel.Section section3 : list8) {
                        Unit unit4 = Unit.INSTANCE;
                        boolean changedInstance11 = gapComposer8.changedInstance(this) | gapComposer8.changedInstance(section3);
                        Object rememberedValue31 = gapComposer8.rememberedValue();
                        if (changedInstance11 || rememberedValue31 == neverEqualPolicy) {
                            rememberedValue31 = new InteractiveCardView$flingTo$1.AnonymousClass2(this, section3, (Continuation) null, 21);
                            gapComposer8.updateRememberedValue(rememberedValue31);
                        }
                        Updater.LaunchedEffect(gapComposer8, unit4, (Function2) rememberedValue31);
                    }
                }
                gapComposer8.end(false);
                if (borrowLimitHubViewModel == null) {
                    borrowLimitHubViewModel = new BorrowLimitHubViewModel(((AndroidStringManager) obj9).get(R.string.borrow_pres_borrow_limit_hub_title_placeholder), EmptyList.INSTANCE);
                }
                BorrowLimitHubViewModel borrowLimitHubViewModel2 = borrowLimitHubViewModel;
                gapComposer8.end(false);
                return borrowLimitHubViewModel2;
            case 8:
                return models$com$squareup$cash$directdeposit$presenters$DirectDepositUpdateManualFormDetailsPresenter(flow, composer, i);
            case 9:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(1608458275);
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj5;
                verifyCheckDialogPresenter.getClass();
                gapComposer9.startReplaceGroup(-1613152821);
                boolean changed3 = gapComposer9.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
                Object rememberedValue32 = gapComposer9.rememberedValue();
                if (changed3 || rememberedValue32 == neverEqualPolicy) {
                    rememberedValue32 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
                    gapComposer9.updateRememberedValue(rememberedValue32);
                }
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue32, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer9, 0, 2).getValue();
                gapComposer9.end(false);
                boolean changed4 = gapComposer9.changed(promotedAppletTileViewModel);
                Object rememberedValue33 = gapComposer9.rememberedValue();
                if (changed4 || rememberedValue33 == neverEqualPolicy) {
                    rememberedValue33 = StateFlowKt.mapState(((SyncValueReader) obj8).getSingleValue(AndroidSyncValueSpecs.C4bEarningsTrackerSummary), new ProfileQueries$$ExternalSyntheticLambda13(i4, this, promotedAppletTileViewModel));
                    gapComposer9.updateRememberedValue(rememberedValue33);
                }
                MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue33, null, gapComposer9, 1);
                Updater.LaunchedEffect(gapComposer9, flow, new EarningsHomePresenter$models$3$1(flow, continuation2, this, 6));
                EarningsAppletTileModel earningsAppletTileModel = (EarningsAppletTileModel) collectAsState5.getValue();
                gapComposer9.end(false);
                return earningsAppletTileModel;
            case 10:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj9;
                SponsorLedInviteScreen sponsorLedInviteScreen = (SponsorLedInviteScreen) obj8;
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1588404508);
                Updater.LaunchedEffect(gapComposer10, flow, new EarningsHomePresenter$models$3$1(flow, continuation2, this, 27));
                String str24 = (String) ((Lazy) this.responseContextHandler).getValue();
                Object obj18 = SponsorLedInviteViewModel.Loading.INSTANCE;
                if (str24 == null) {
                    gapComposer10.end(false);
                } else {
                    boolean changed5 = gapComposer10.changed(str24);
                    Object rememberedValue34 = gapComposer10.rememberedValue();
                    Object obj19 = rememberedValue34;
                    if (changed5 || rememberedValue34 == neverEqualPolicy) {
                        Flow customerForId = ((RealCustomerStore) obj4).getCustomerForId(str24);
                        gapComposer10.updateRememberedValue(customerForId);
                        obj19 = customerForId;
                    }
                    MutableState collectAsState6 = Updater.collectAsState((Flow) obj19, null, null, gapComposer10, 48, 2);
                    Sponsor sponsor = sponsorLedInviteScreen.sponsor;
                    FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                    try {
                        LinkText linkText = sponsor.primary_cta;
                        String str25 = linkText != null ? linkText.text : null;
                        if (str25 != null) {
                            str = str25;
                        } else {
                            try {
                                throw new IllegalArgumentException("sponsor.primary_cta.text");
                            } catch (Exception e) {
                                ((ErrorReporter) obj6).report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Sponsor.class), familyParsingErrorFactory, null), (SampleStrategy) obj7);
                            }
                        }
                        if (str != null && (recipient = (com.squareup.cash.db.contacts.Recipient) collectAsState6.getValue()) != null) {
                            StackedAvatarViewModel.Single single = new StackedAvatarViewModel.Single(GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel(recipient)));
                            String str26 = androidStringManager2.get(R.string.sponsor_led_invite_title);
                            String str27 = recipient.displayName;
                            str27.getClass();
                            Resources resources2 = androidStringManager2.resources;
                            resources2.getClass();
                            String format4 = new MessageFormat(resources2.getString(R.string.sponsor_led_invite_body)).format(new Object[]{str27});
                            format4.getClass();
                            obj18 = new SponsorLedInviteViewModel.Loaded(single, str26, format4, str);
                        }
                        gapComposer10.end(false);
                    } catch (Exception e2) {
                        throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(sponsor.getClass()), familyParsingErrorFactory, null);
                    }
                }
                return obj18;
            case 11:
                return models$com$squareup$cash$family$requestsponsorship$presenters$SelectContactMethodPresenter(flow, composer, i);
            case 12:
                return models$com$squareup$cash$favorites$presenters$ListFavoritesPresenter(flow, composer, i);
            case 13:
                return models$com$squareup$cash$globalsearch$presenters$GlobalSearchPresenter(flow, composer, i);
            case 14:
                m1210models(flow, composer, i);
                return Unit.INSTANCE;
            case 15:
                return models$com$squareup$cash$history$presenters$CancelPaymentPresenter(flow, composer, i);
            case 16:
                return models$com$squareup$cash$initialscreenloader$presenters$AppUpgradePresenter(flow, composer, i);
            case 17:
                return models$com$squareup$cash$investing$presenters$StockMetricTypePickerPresenter(flow, composer, i);
            case 18:
                return models$com$squareup$cash$moneybot$presenters$MoneybotChatHistoryPresenter(flow, composer, i);
            case 19:
                return models$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter(flow, composer, i);
            case 20:
                return models$com$squareup$cash$profile$presenters$RealProfilePreviewPresenter(flow, composer, i);
            case 21:
                return models$com$squareup$cash$profile$presenters$searchprivacy$RealSearchPrivacySettingsPresenter(flow, composer, i);
            case 22:
                return models$com$squareup$cash$qrcodes$presenters$CashtagQrScanPresenter(flow, composer, i);
            case 23:
                return models$com$squareup$cash$savings$presenters$TransferringPresenter(flow, composer, i);
            case 24:
                return models$com$squareup$cash$score$presenters$ScoreHomePresenter(flow, composer, i);
            case 25:
                return models$com$squareup$cash$securityhub$presenters$BookletPresenter(flow, composer, i);
            case 26:
                return models$com$squareup$cash$securityhub$presenters$RecoveryGuidePresenter(flow, composer, i);
            case 27:
                return models$com$squareup$cash$shopping$autofill$presenters$AutofillPresenter(flow, composer, i);
            case 28:
                return models$com$squareup$cash$shopping$autofill$presenters$EditAutofillPresenter(flow, composer, i);
            default:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-224397312);
                Object rememberedValue35 = gapComposer11.rememberedValue();
                if (rememberedValue35 == neverEqualPolicy) {
                    RealArticlesService realArticlesService = (RealArticlesService) obj8;
                    String str28 = ((SupportScreens.UnauthenticatedArticleScreen) obj7).token;
                    str28.getClass();
                    Article article = (Article) realArticlesService.articleCache.get(str28);
                    String str29 = realArticlesService.cssCache;
                    rememberedValue35 = Updater.mutableStateOf$default((article == null || str29 == null) ? null : new ArticlesService$ArticleResult.Success(article, RealArticlesService.getFinalHtml(article, str29)));
                    gapComposer11.updateRememberedValue(rememberedValue35);
                }
                MutableState mutableState13 = (MutableState) rememberedValue35;
                Object rememberedValue36 = gapComposer11.rememberedValue();
                if (rememberedValue36 == neverEqualPolicy) {
                    rememberedValue36 = Updater.mutableStateOf$default(1);
                    gapComposer11.updateRememberedValue(rememberedValue36);
                }
                MutableState mutableState14 = (MutableState) rememberedValue36;
                Integer valueOf4 = Integer.valueOf(((Number) mutableState14.getValue()).intValue());
                boolean changedInstance12 = gapComposer11.changedInstance(this);
                Object rememberedValue37 = gapComposer11.rememberedValue();
                if (changedInstance12 || rememberedValue37 == neverEqualPolicy) {
                    rememberedValue37 = new ShoppingWebBridge$loadUrl$1(this, mutableState13, continuation2, 28);
                    gapComposer11.updateRememberedValue(rememberedValue37);
                }
                Updater.LaunchedEffect(gapComposer11, valueOf4, (Function2) rememberedValue37);
                ArticlesService$ArticleResult articlesService$ArticleResult = (ArticlesService$ArticleResult) mutableState13.getValue();
                ArticlesService$ArticleResult.Success success = articlesService$ArticleResult instanceof ArticlesService$ArticleResult.Success ? (ArticlesService$ArticleResult.Success) articlesService$ArticleResult : null;
                Article article2 = success != null ? success.article : null;
                if (article2 != null) {
                    gapComposer11.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer11, article2, new Logger$_log$2(article2, continuation2, this, i5));
                    gapComposer11.end(false);
                } else {
                    gapComposer11.startReplaceGroup(-1106436997);
                    gapComposer11.end(false);
                }
                Object rememberedValue38 = gapComposer11.rememberedValue();
                if (rememberedValue38 == neverEqualPolicy) {
                    rememberedValue38 = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer11.updateRememberedValue(rememberedValue38);
                }
                MutableState mutableState15 = (MutableState) rememberedValue38;
                Updater.LaunchedEffect(gapComposer11, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, mutableState13, mutableState14, mutableState15, 14));
                ArticlesService$ArticleResult articlesService$ArticleResult2 = (ArticlesService$ArticleResult) mutableState13.getValue();
                if (!(articlesService$ArticleResult2 instanceof ArticlesService$ArticleResult.Failure)) {
                    if (!(articlesService$ArticleResult2 instanceof ArticlesService$ArticleResult.Success)) {
                        if (articlesService$ArticleResult2 != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return obj10;
                        }
                        obj3 = ArticleViewModel.Loading.INSTANCE;
                    } else if (((Boolean) mutableState15.getValue()).booleanValue()) {
                        ArticlesService$ArticleResult.Success success2 = (ArticlesService$ArticleResult.Success) articlesService$ArticleResult2;
                        loaded = new ArticleViewModel.Loaded(success2.article, success2.html, EmptyList.INSTANCE, null, 8);
                    } else {
                        obj3 = new ArticleViewModel.Error(false);
                    }
                    obj10 = obj3;
                    gapComposer11.end(false);
                    return obj10;
                }
                loaded = new ArticleViewModel.Error(((ArticlesService$ArticleResult.Failure) articlesService$ArticleResult2).isRetryable);
                obj10 = loaded;
                gapComposer11.end(false);
                return obj10;
        }
    }

    public String toContactMethodLabel(String str) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        int hashCode = str.hashCode();
        if (hashCode != -1068855134) {
            if (hashCode != 3208415) {
                if (hashCode == 3655441 && str.equals("work")) {
                    return androidStringManager.get(R.string.contact_method_label_work);
                }
            } else if (str.equals("home")) {
                return androidStringManager.get(R.string.contact_method_label_home);
            }
        } else if (str.equals("mobile")) {
            return androidStringManager.get(R.string.contact_method_label_mobile);
        }
        return androidStringManager.get(R.string.contact_method_label_other);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final LambdaProvider clock;
        public final Provider installedStore;
        public final Provider launcher;
        public final Provider responseContextHandlerFactory;
        public final DoubleCheck service;
        public final LambdaProvider stringManager;

        public MetroFactory(NavigationSideEffects.MetroFactory metroFactory, IntentLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory) {
            this.launcher = metroFactory;
            this.installedStore = metroFactory2;
            this.clock = lambdaProvider;
            this.service = doubleCheck;
            this.stringManager = lambdaProvider2;
            this.responseContextHandlerFactory = instanceFactory;
        }

        public MetroFactory(IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory2, InstanceFactory instanceFactory, DoubleCheck doubleCheck) {
            this.launcher = metroFactory;
            this.clock = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.installedStore = metroFactory2;
            this.responseContextHandlerFactory = instanceFactory;
            this.service = doubleCheck;
        }

        public MetroFactory(IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
            this.launcher = metroFactory;
            this.service = doubleCheck;
            this.installedStore = metroFactory2;
            this.responseContextHandlerFactory = instanceFactory;
            this.clock = lambdaProvider;
            this.stringManager = lambdaProvider2;
        }

        public MetroFactory(LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, RealMessageSigner.MetroFactory metroFactory2, RealMessageSigner.MetroFactory metroFactory3, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2) {
            this.clock = lambdaProvider;
            this.launcher = metroFactory;
            this.installedStore = metroFactory2;
            this.responseContextHandlerFactory = metroFactory3;
            this.service = doubleCheck;
            this.stringManager = lambdaProvider2;
        }

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory, LocalViewFactory.MetroFactory metroFactory2) {
            this.clock = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.launcher = metroFactory;
            this.service = doubleCheck;
            this.installedStore = instanceFactory;
            this.responseContextHandlerFactory = metroFactory2;
        }

        public MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, InstanceFactory instanceFactory, RealSessionFlags.MetroFactory metroFactory2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
            this.service = doubleCheck;
            this.launcher = metroFactory;
            this.installedStore = instanceFactory;
            this.responseContextHandlerFactory = metroFactory2;
            this.clock = lambdaProvider;
            this.stringManager = lambdaProvider2;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, ScoreUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2) {
            this.launcher = instanceFactory;
            this.installedStore = instanceFactory2;
            this.responseContextHandlerFactory = metroFactory;
            this.clock = lambdaProvider;
            this.service = doubleCheck;
            this.stringManager = lambdaProvider2;
        }
    }

    public LocalEditorialPresenter(GooglePayService googlePayService, BlockersDataNavigator blockersDataNavigator, Moshi moshi, IssuedCardManager issuedCardManager, BlockerFlowListener blockerFlowListener, CoroutineContext coroutineContext, BlockersScreens.GooglePayActivationScreen googlePayActivationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 14;
        googlePayActivationScreen.getClass();
        this.launcher = googlePayService;
        this.service = blockersDataNavigator;
        this.installedStore = moshi;
        this.clock = issuedCardManager;
        this.stringManager = blockerFlowListener;
        this.screen = coroutineContext;
        this.responseContextHandler = googlePayActivationScreen;
        this.navigator = screenNavigator;
    }

    public LocalEditorialPresenter(RealIntentFactory realIntentFactory, Activity activity, AndroidActivityFinisher androidActivityFinisher, AndroidStringManager androidStringManager, zzr zzrVar, String str, AppUpgradeScreen appUpgradeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        appUpgradeScreen.getClass();
        this.launcher = realIntentFactory;
        this.service = activity;
        this.installedStore = androidActivityFinisher;
        this.stringManager = androidStringManager;
        this.clock = zzrVar;
        this.screen = str;
        this.responseContextHandler = appUpgradeScreen;
        this.navigator = screenNavigator;
    }

    public LocalEditorialPresenter(SponsorLedInviteScreen sponsorLedInviteScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, RealCustomerStore realCustomerStore, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 10;
        sponsorLedInviteScreen.getClass();
        this.launcher = sponsorLedInviteScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.service = realCustomerStore;
        this.installedStore = errorReporter;
        this.clock = sampleStrategy;
        this.screen = realRouter$Factory$Impl.create$1(screenNavigator);
        this.responseContextHandler = LazyKt.lazy(new ArcadeModal$$ExternalSyntheticLambda2(this, 21));
    }

    public LocalEditorialPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, RealClientRouteParser realClientRouteParser, LocalizedMoneyFormatter.Factory factory, RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, RealTapToPayRepository realTapToPayRepository, BetterNavigator.ScreenNavigator screenNavigator, TapToPayPaymentRequestScreen tapToPayPaymentRequestScreen) {
        this.$r8$classId = 1;
        tapToPayPaymentRequestScreen.getClass();
        this.launcher = realClientRouteParser;
        this.service = realTapToPayAnalyticsHelper;
        this.installedStore = realTapToPayRepository;
        this.navigator = screenNavigator;
        this.clock = tapToPayPaymentRequestScreen;
        this.stringManager = realRouter$Factory$Impl.create$1(screenNavigator);
        this.screen = LocalEditorialPresenter.class.getName();
        this.responseContextHandler = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public LocalEditorialPresenter(BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.OnboardingInternalRouteScreen onboardingInternalRouteScreen, UsherService usherService, BlockersDataNavigator blockersDataNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl, AndroidStringManager androidStringManager) {
        this.$r8$classId = 6;
        this.navigator = screenNavigator;
        this.launcher = onboardingInternalRouteScreen;
        this.service = usherService;
        this.installedStore = blockersDataNavigator;
        OnboardingInternalRouteBlocker onboardingInternalRouteBlocker = onboardingInternalRouteScreen.data;
        String str = onboardingInternalRouteBlocker.error_title_text;
        this.clock = str == null ? androidStringManager.get(R.string.blockers_onboarding_internal_route_error_title) : str;
        String str2 = onboardingInternalRouteBlocker.error_body_text;
        this.stringManager = str2 == null ? androidStringManager.get(R.string.blockers_onboarding_internal_route_error_subtitle) : str2;
        String str3 = onboardingInternalRouteBlocker.error_button_text;
        this.screen = str3 == null ? androidStringManager.get(R.string.blockers_onboarding_internal_route_error_button) : str3;
        this.responseContextHandler = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalEditorialPresenter(PermissionChecker permissionChecker, AndroidPermissionManager androidPermissionManager, AndroidStringManager androidStringManager, RealCashAppUrlParser realCashAppUrlParser, RealRecipientFinder realRecipientFinder, Flow flow, CashtagQrScanScreen cashtagQrScanScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 22;
        cashtagQrScanScreen.getClass();
        this.launcher = androidPermissionManager;
        this.stringManager = androidStringManager;
        this.service = realRecipientFinder;
        this.installedStore = cashtagQrScanScreen;
        this.navigator = screenNavigator;
        this.clock = permissionChecker.granted("android.permission.CAMERA");
        this.screen = new RealRecipientRepository$suggestions$$inlined$map$1(permissionChecker.denials(), 2);
        this.responseContextHandler = new RealRecipientRepository$suggestions$$inlined$map$1(flow, 3);
    }

    public LocalEditorialPresenter(ChatManager chatManager, RealUserSessionPager realUserSessionPager, RealTodayDateTimeFormatter realTodayDateTimeFormatter, RealMoneybotChatMessagesCache realMoneybotChatMessagesCache, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 18;
        this.launcher = chatManager;
        this.service = realUserSessionPager;
        this.installedStore = realTodayDateTimeFormatter;
        this.clock = realMoneybotChatMessagesCache;
        this.navigator = screenNavigator;
        this.stringManager = Updater.mutableStateOf$default(Boolean.FALSE);
        this.screen = Updater.mutableStateOf$default(null);
        this.responseContextHandler = Updater.mutableStateOf$default(null);
    }

    public LocalEditorialPresenter(Analytics analytics, RealLegacyActivityEntityManager realLegacyActivityEntityManager, PaymentNavigator paymentNavigator, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidStringManager androidStringManager, CoroutineScope coroutineScope, BetterNavigator.ScreenNavigator screenNavigator, HistoryScreens.CancelPayment cancelPayment) {
        this.$r8$classId = 15;
        cancelPayment.getClass();
        this.launcher = analytics;
        this.service = realLegacyActivityEntityManager;
        this.installedStore = paymentNavigator;
        this.clock = cashAccountDatabaseImpl;
        this.stringManager = androidStringManager;
        this.screen = coroutineScope;
        this.navigator = screenNavigator;
        this.responseContextHandler = cancelPayment;
    }

    public LocalEditorialPresenter(ScoreHomeScreen scoreHomeScreen, RealScoreRepository realScoreRepository, RealProfileManager realProfileManager, IssuedCardManager issuedCardManager, RealCardCustomizationRepository realCardCustomizationRepository, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 24;
        scoreHomeScreen.getClass();
        this.launcher = scoreHomeScreen;
        this.service = realScoreRepository;
        this.installedStore = realProfileManager;
        this.clock = issuedCardManager;
        this.stringManager = realCardCustomizationRepository;
        this.screen = analytics;
        this.navigator = screenNavigator;
        this.responseContextHandler = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalEditorialPresenter(RealLocalBrandSyncer realLocalBrandSyncer, RealLocalLauncher realLocalLauncher, RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl, LocalInstalledStore localInstalledStore, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, AndroidClock androidClock) {
        this.$r8$classId = 2;
        this.service = realLocalBrandSyncer;
        this.launcher = realLocalLauncher;
        this.installedStore = localInstalledStore;
        this.stringManager = androidStringManager;
        this.navigator = screenNavigator;
        this.clock = androidClock;
        Locale locale = Locale.getDefault();
        locale.getClass();
        this.screen = realTimestampFormatter$Factory$Impl.create$1(locale, TimestampFormatter$DisplayContext.STANDALONE);
        this.responseContextHandler = new DateTimeFormatterBuilder().appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL).appendLiteral(' ').appendValue(ChronoField.YEAR).toFormatter();
    }

    public LocalEditorialPresenter(RealContactBook realContactBook, AppService appService, BlockersDataNavigator blockersDataNavigator, Signal signal, AndroidStringManager androidStringManager, SelectContactMethodScreen selectContactMethodScreen, BetterNavigator.ScreenNavigator screenNavigator, ModifiablePermissions modifiablePermissions) {
        this.$r8$classId = 11;
        selectContactMethodScreen.getClass();
        this.launcher = realContactBook;
        this.service = appService;
        this.installedStore = blockersDataNavigator;
        this.clock = signal;
        this.stringManager = androidStringManager;
        this.screen = selectContactMethodScreen;
        this.navigator = screenNavigator;
        this.responseContextHandler = modifiablePermissions;
    }

    public LocalEditorialPresenter(AndroidStringManager androidStringManager, KeyValue keyValue, KeyValue keyValue2, EnumPreference enumPreference, Analytics analytics, CoroutineContext coroutineContext, InvestingScreens.StockMetricTypePicker stockMetricTypePicker, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        stockMetricTypePicker.getClass();
        this.stringManager = androidStringManager;
        this.launcher = keyValue;
        this.service = enumPreference;
        this.installedStore = analytics;
        this.clock = coroutineContext;
        this.screen = stockMetricTypePicker;
        this.navigator = screenNavigator;
        this.responseContextHandler = stockMetricTypePicker.isDependent ? keyValue2 : keyValue;
    }

    public LocalEditorialPresenter(RealArticlesService realArticlesService, com.squareup.kotterknife.Lazy lazy, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, Moshi moshi, RealViewTokenGenerator realViewTokenGenerator, BetterNavigator.ScreenNavigator screenNavigator, SupportScreens.UnauthenticatedArticleScreen unauthenticatedArticleScreen) {
        this.$r8$classId = 29;
        unauthenticatedArticleScreen.getClass();
        this.launcher = realArticlesService;
        this.service = lazy;
        this.installedStore = analytics;
        this.navigator = screenNavigator;
        this.clock = unauthenticatedArticleScreen;
        this.stringManager = realRouter$Factory$Impl.create$1(screenNavigator);
        this.screen = LazyKt.lazy(new ArticlePresenter$$ExternalSyntheticLambda0(moshi, 4));
        this.responseContextHandler = realViewTokenGenerator.generate();
    }

    public LocalEditorialPresenter(RealBorrowDataManager realBorrowDataManager, IntentLauncher intentLauncher, AndroidStringManager androidStringManager, Analytics analytics, ErrorReporter errorReporter, RealRouter$Factory$Impl realRouter$Factory$Impl, BorrowLimitHub borrowLimitHub, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        borrowLimitHub.getClass();
        this.launcher = realBorrowDataManager;
        this.service = intentLauncher;
        this.stringManager = androidStringManager;
        this.installedStore = analytics;
        this.clock = errorReporter;
        this.screen = borrowLimitHub;
        this.navigator = screenNavigator;
        this.responseContextHandler = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalEditorialPresenter(BalanceMoverAppService balanceMoverAppService, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealUuidGenerator realUuidGenerator, LocalizedMoneyFormatter.Factory factory, TransferProcessingScreen transferProcessingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 23;
        this.launcher = balanceMoverAppService;
        this.service = flowStarter;
        this.installedStore = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.clock = realBalanceSnapshotManager;
        this.screen = transferProcessingScreen;
        this.navigator = screenNavigator;
        this.responseContextHandler = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public LocalEditorialPresenter(Analytics analytics, AndroidStringManager androidStringManager, RealFavoritesManager realFavoritesManager, RealAllowlistRepository realAllowlistRepository, RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl, RealProfileManager realProfileManager, ListFavorites listFavorites, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        listFavorites.getClass();
        this.launcher = analytics;
        this.stringManager = androidStringManager;
        this.service = realFavoritesManager;
        this.installedStore = realAllowlistRepository;
        this.clock = realProfileManager;
        this.screen = listFavorites;
        this.navigator = screenNavigator;
        this.responseContextHandler = realFavoritesInboundNavigator$Factory$Impl.create(screenNavigator);
    }

    public LocalEditorialPresenter(RealProfileManager realProfileManager, RealProfileRepo realProfileRepo, RealP2pSettingsManager realP2pSettingsManager, RealBusinessProfileManager realBusinessProfileManager, AndroidStringManager androidStringManager, RealGenericProfileElementsPresenter$Factory$Impl realGenericProfileElementsPresenter$Factory$Impl, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, ProfileScreens.ProfilePreview profilePreview, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 20;
        profilePreview.getClass();
        this.launcher = realProfileManager;
        this.service = realProfileRepo;
        this.installedStore = realP2pSettingsManager;
        this.clock = realBusinessProfileManager;
        this.stringManager = androidStringManager;
        this.screen = realGenericProfileElementsPresenter$Factory$Impl;
        this.responseContextHandler = profilePreview;
        this.navigator = screenNavigator;
    }

    public LocalEditorialPresenter(Analytics analytics, RealQrCodesPresenter realQrCodesPresenter, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, IntentLauncher intentLauncher, RealClipboardManager realClipboardManager, StablecoinDepositScreen stablecoinDepositScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        stablecoinDepositScreen.getClass();
        this.launcher = analytics;
        this.service = realQrCodesPresenter;
        this.installedStore = realProfileManager;
        this.stringManager = androidStringManager;
        this.clock = intentLauncher;
        this.screen = realClipboardManager;
        this.responseContextHandler = stablecoinDepositScreen;
        this.navigator = screenNavigator;
    }

    public LocalEditorialPresenter(RecoveryGuideScreen recoveryGuideScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, RealSupportNavigator realSupportNavigator, RealPasscodeFlowStarter realPasscodeFlowStarter, RealDeviceManagerInboundNavigator$Factory$Impl realDeviceManagerInboundNavigator$Factory$Impl, RealIntentFactory realIntentFactory, Activity activity, Analytics analytics) {
        this.$r8$classId = 26;
        recoveryGuideScreen.getClass();
        this.launcher = recoveryGuideScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.service = realSupportNavigator;
        this.installedStore = realPasscodeFlowStarter;
        this.clock = realIntentFactory;
        this.screen = activity;
        this.responseContextHandler = analytics;
    }

    public LocalEditorialPresenter(AndroidClock androidClock, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, MoneyAnalyticsService moneyAnalyticsService, RealEarningsTrackerAnalytics realEarningsTrackerAnalytics, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, LocalizedMoneyFormatter.Factory factory, Navigator navigator) {
        this.$r8$classId = 9;
        navigator.getClass();
        this.stringManager = androidStringManager;
        this.launcher = syncValueReader;
        this.service = moneyAnalyticsService;
        this.installedStore = realEarningsTrackerAnalytics;
        this.clock = navigator;
        this.screen = promotedAppletTilePresenter$Factory$Impl.create(AppletId.EARNINGS);
        this.navigator = DimensionKt.nowLocalDate(androidClock);
        this.responseContextHandler = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public LocalEditorialPresenter(CustomerSearchClientService customerSearchClientService, AndroidStringManager androidStringManager, RealProfileAliasRepository realProfileAliasRepository, RealContactAliasFetcher realContactAliasFetcher, Analytics analytics, SessionManager sessionManager, RealProfileManager realProfileManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 21;
        this.launcher = customerSearchClientService;
        this.stringManager = androidStringManager;
        this.service = realProfileAliasRepository;
        this.installedStore = realContactAliasFetcher;
        this.clock = analytics;
        this.screen = sessionManager;
        this.responseContextHandler = realProfileManager;
        this.navigator = screenNavigator;
    }

    public LocalEditorialPresenter(AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, RealFormPdfProvider realFormPdfProvider, PostbankAppService postbankAppService, RealJurisdictionConfigManager realJurisdictionConfigManager, DirectDepositUpdateManualFormScreen directDepositUpdateManualFormScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        directDepositUpdateManualFormScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = factory;
        this.service = realFormPdfProvider;
        this.installedStore = postbankAppService;
        this.clock = realJurisdictionConfigManager;
        this.screen = directDepositUpdateManualFormScreen;
        this.navigator = screenNavigator;
        this.responseContextHandler = LazyKt.lazy(new ArcadeModal$$ExternalSyntheticLambda2(this, 8));
    }

    public LocalEditorialPresenter(RealLocalOrderRepository realLocalOrderRepository, RealLocalBrandSyncer realLocalBrandSyncer, RealLocalBrandRepository realLocalBrandRepository, CartBuilderManager cartBuilderManager, RealOrderBuilder$Factory$Impl realOrderBuilder$Factory$Impl, RealOrderBuilderStore realOrderBuilderStore, LocalCheckoutDeeplinkScreen localCheckoutDeeplinkScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        localCheckoutDeeplinkScreen.getClass();
        this.launcher = realLocalOrderRepository;
        this.service = realLocalBrandSyncer;
        this.installedStore = realLocalBrandRepository;
        this.clock = cartBuilderManager;
        this.stringManager = realOrderBuilder$Factory$Impl;
        this.screen = realOrderBuilderStore;
        this.responseContextHandler = localCheckoutDeeplinkScreen;
        this.navigator = screenNavigator;
    }

    public LocalEditorialPresenter(BookletScreen bookletScreen, BetterNavigator.ScreenNavigator screenNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, FlowStarter flowStarter, RealIdentityVerificationRepo realIdentityVerificationRepo, AndroidStringManager androidStringManager, RealSupportNavigator realSupportNavigator, Analytics analytics) {
        this.$r8$classId = 25;
        bookletScreen.getClass();
        this.launcher = bookletScreen;
        this.navigator = screenNavigator;
        this.service = flowStarter;
        this.installedStore = realIdentityVerificationRepo;
        this.stringManager = androidStringManager;
        this.clock = realSupportNavigator;
        this.screen = analytics;
        this.responseContextHandler = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public LocalEditorialPresenter(AutofillScreen autofillScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, ShippingAddressService shippingAddressService, ShoppingAutofillAnalyticsHandler shoppingAutofillAnalyticsHandler, RealProfileManager realProfileManager, FeatureFlagManager featureFlagManager, RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator) {
        this.$r8$classId = 27;
        autofillScreen.getClass();
        this.launcher = autofillScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.service = shippingAddressService;
        this.installedStore = shoppingAutofillAnalyticsHandler;
        this.clock = realProfileManager;
        this.screen = featureFlagManager;
        this.responseContextHandler = realAutofillNetworkFailureMessageGenerator;
    }

    public LocalEditorialPresenter(AndroidStringManager androidStringManager, ShippingAddressService shippingAddressService, ShoppingAutofillAnalyticsHandler shoppingAutofillAnalyticsHandler, RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator, BetterNavigator.ScreenNavigator screenNavigator, EditAutofillScreen editAutofillScreen) {
        this.$r8$classId = 28;
        editAutofillScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = shippingAddressService;
        this.service = shoppingAutofillAnalyticsHandler;
        this.installedStore = realAutofillNetworkFailureMessageGenerator;
        this.navigator = screenNavigator;
        this.clock = editAutofillScreen;
        FullName fullName = editAutofillScreen.fullName;
        String str = fullName.given_name;
        String str2 = fullName.family_name;
        Phone phone = editAutofillScreen.phone;
        this.screen = new AutofillCombinedInfo(str, str2, PhoneNumbers.normalize(phone != null ? phone.number : null), editAutofillScreen.email, editAutofillScreen.address);
    }

    public LocalEditorialPresenter(KeyValue keyValue, BetterNavigator.ScreenNavigator screenNavigator, ThemeSwitcherScreen themeSwitcherScreen, Analytics analytics, PostcardClientService postcardClientService, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 4;
        themeSwitcherScreen.getClass();
        this.launcher = keyValue;
        this.navigator = screenNavigator;
        this.service = themeSwitcherScreen;
        this.installedStore = analytics;
        this.clock = postcardClientService;
        this.stringManager = androidStringManager;
        this.screen = featureFlagManager;
        this.responseContextHandler = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalEditorialPresenter(RealLocalLauncher realLocalLauncher, LocalService localService, LocalInstalledStore localInstalledStore, LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl, AndroidClock androidClock, AndroidStringManager androidStringManager, LocalEditorialScreen localEditorialScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        localEditorialScreen.getClass();
        this.launcher = realLocalLauncher;
        this.service = localService;
        this.installedStore = localInstalledStore;
        this.clock = androidClock;
        this.stringManager = androidStringManager;
        this.screen = localEditorialScreen;
        this.navigator = screenNavigator;
        this.responseContextHandler = localResponseContextHandler$Factory$Impl.create(screenNavigator);
    }

    public LocalEditorialPresenter(RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository, EglCore eglCore, AndroidStringManager androidStringManager, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent parent, BetterNavigator.ScreenNavigator screenNavigator) {
        Surface surface;
        this.$r8$classId = 19;
        parent.getClass();
        this.launcher = realPrepurchaseCashCardRepository;
        this.service = eglCore;
        this.stringManager = androidStringManager;
        this.installedStore = analytics;
        this.clock = parent;
        this.navigator = screenNavigator;
        this.screen = realRouter$Factory$Impl.create$1(screenNavigator);
        int ordinal = parent.getPrepurchaseSurface().ordinal();
        if (ordinal == 0) {
            surface = Surface.CARD_TAB;
        } else if (ordinal == 1) {
            surface = Surface.AFTERPAY_APPLET;
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            throw null;
        }
        this.responseContextHandler = surface;
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m1210models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1323003637);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GooglePayPresenter$models$1$1(this, null, 27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, 4);
        }
    }
}
