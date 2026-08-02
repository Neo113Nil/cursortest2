package app.cash.local.presenters.wallet;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.CanvasUtils;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.RenavigationKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.backend.ClearMarketingBadgesIfNeeded;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.BrandFollowPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$Factory$Impl;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.RealOrderBuilderStore;
import app.cash.local.presenters.brand.checkout.LocalOpenTabCheckoutPresenter$Args;
import app.cash.local.presenters.brand.checkout.LocalOpenTabCheckoutPresenterKt;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$Factory$Impl;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter$Factory$Impl;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.LocationsKt;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandCollectionData;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.local.primitives.BrandKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.LocalErrorResponse;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationKt;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenuKt;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalNeighborhoodsMapScreen;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.versioned.Versioned;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.memory.RealStrongMemoryCache;
import com.datadog.android.rum.model.ErrorEvent;
import com.fillr.e;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsr;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.mlkit.common.internal.zzd;
import com.google.zxing.BinaryBitmap;
import com.miteksystems.misnap.camera.a.b;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityItemPresenterFactory;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletParsingErrorFactory;
import com.squareup.cash.afterpayapplet.backend.AfterpayMerchantRepo$SearchResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletMerchantSheetRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPageRequestHandler$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$Companion$FilterSelectionMapSaver;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$models$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$models$performSearch$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenterKt;
import com.squareup.cash.afterpayapplet.presenters.OrderItemEventHandler$Factory$Impl;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletNotificationScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpaySearchScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletActivityListEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.banking.observability.DefaultProtoParsingExceptionFactory;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.banking.presenters.BetterOverdraftPresenter$OverdraftToggleState;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Secondary;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.send.SendBitcoinNavigator;
import com.squareup.cash.bitcoin.screens.BitcoinSendRestrictionScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendRestrictionViewModel;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.SignatureViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentModel;
import com.squareup.cash.blockers.viewmodels.VerifyMagicViewModel;
import com.squareup.cash.blockers.views.CashtagViewKt$Cashtag$1$1;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.boost.backend.BoostCategory;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.boost.db.UserRewardsDataQueries$userRewardsData$2;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$models$2$1;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$processScreenshots$1;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$resolveFileNameFromUri$1;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$submitBugReport$1;
import com.squareup.cash.bugreporting.screens.BugReportingScreen;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.bugreporting.viewmodels.DeviceMetrics;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticAttachments;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.PdpNotifiedPreference;
import com.squareup.cash.cashplato.service.CashPlatoAppService;
import com.squareup.cash.cdf.offers.OfferRequestStatus;
import com.squareup.cash.cdf.offers.OffersSearchQueryComplete;
import com.squareup.cash.cdf.offers.OffersSearchQueryStart;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.cdf.offers.Screen;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.CurrencyRepresentationOption;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.contacts.CustomerQueries$ForIdQuery;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.deposits.physical.screens.AtmLocationDetailsScreen;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$lambda$15$$inlined$map$1;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewModel;
import com.squareup.cash.favorites.viewmodels.ToolbarViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$BankingCashGreenRelease;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashBitcoinSymbolDisplaySetting;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashCardRewardsTiles;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$MintHypeDrop;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$GetNeighborhoodsTabContent;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NeighborhoodsTabEmbeddedMap;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileValidator$Result;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView$Content$7$1;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$flatMapLatest$2;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.presenters.ReportAbuseDialogPresenter$WhenMappings;
import com.squareup.cash.history.presenters.ReportAbuseDialogPresenter$handleActionClickWithoutUrl$1;
import com.squareup.cash.history.presenters.ReportAbusePresenter$WhenMappings;
import com.squareup.cash.history.presenters.ReportAbusePresenter$handleActionClickWithoutUrl$1;
import com.squareup.cash.history.viewmodels.ReportAbuseResult;
import com.squareup.cash.history.viewmodels.ReportAbuseViewModel;
import com.squareup.cash.instruments.backend.real.RealInstrumentVerifier;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository$StocksModel$Installed$GraphError;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository$StocksModel$Installed$LoadingPriceMovement;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.presenters.activity.Result;
import com.squareup.cash.investing.presenters.custom.order.InvestingCustomSharePricePresenter$models$1$1;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsActivityRequestHandler$Factory$Impl;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.activity.InvestingActivityHistoryViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.presenter.CashMapPresenter$Factory$Impl;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LatLngBounds;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.presenters.HypeDismissedPreference;
import com.squareup.cash.money.screens.HypeWelcomeScreen;
import com.squareup.cash.money.viewmodels.HypeWelcomeModel;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.resourceindex.ColorCodesKt;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.backend.real.RealOffersInflightStateManager;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.offers.presenters.OffersHomePresenterV2$WhenMappings;
import com.squareup.cash.offers.presenters.OffersMappersKt$WhenMappings;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.backend.api.mapper.CommonMappersKt;
import com.squareup.cash.paychecks.backend.api.mapper.PaycheckAllocationDistributionMappersKt;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.common.presenters.UtilsKt;
import com.squareup.cash.paychecks.presenters.DistributePaycheckPresenter$launchEditAllocation$1;
import com.squareup.cash.paychecks.presenters.util.RealPaycheckSettlementDateFormatter;
import com.squareup.cash.paychecks.screens.DistributePaycheckScreen;
import com.squareup.cash.paychecks.screens.PaycheckAggregationReceiptScreen;
import com.squareup.cash.paychecks.screens.PaycheckReceiptScreen;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewEvent;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel$Icon$Color;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel$TitleBadge$Lock;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckIconModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$models$28$8$1;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.persona.backend.PersonaDidvInquiryLauncher;
import com.squareup.cash.persona.presenters.PersonaDidvPresenter$models$1$1;
import com.squareup.cash.profile.presenters.personalizedads.RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.SupportActivityItemPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportActivityPickerPresenter$awaitInitialLoadedActivities$1;
import com.squareup.cash.support.presenters.SupportHomePresenter$$ExternalSyntheticLambda2;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda21;
import com.squareup.cash.work.service.real.CashAppServiceModule;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.ReportAbuseRequest;
import com.squareup.protos.cash.blockly.api.ReportAbuseResponse;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.BugReportService;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchResponse;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.overdraftly.OverdraftlyService;
import com.squareup.protos.cash.paychecks.api.v1.AddOrEditAllocationDestinationRequest;
import com.squareup.protos.cash.paychecks.api.v1.AddOrEditAllocationDestinationResponse;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection$CategoryTile$Style$IconStyle;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection$CategoryTile$Style$ImageStyle;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection$FilterGroupItem$Style$FilterSheet;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection$AvatarRow$Avatar$Image;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$AvatarRow;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$FilterRow;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$AvartarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$RowSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$TileSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$UpsellCard;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$Cta$CtaButtonV2;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$Cta$CtaText;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$TrailingContent$Image;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$TrailingContent$LogoStack;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.BigDecimalsKt;
import com.squareup.util.Strings;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.Message;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
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
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.uuid.UuidKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.overdraft.OverdraftUsage;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LocalHomePresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object clearMarketingBadgesIfNeeded;
    public final Object embeddedMapEnabled$delegate;
    public final Object featureFlagManager;
    public final Object localHomeGeoPresenterFactory;
    public final Object navigator;
    public Object neighborhoodsTabContentEnabled$delegate;
    public final Object store;
    public final Object syncer;
    public final Object tabContentPresenterFactory;

    public LocalHomePresenter(BetterNavigator.ScreenNavigator screenNavigator, AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen afterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen, AndroidStringManager androidStringManager, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, RealAfterpayAppletRepository realAfterpayAppletRepository, RealRouter$Factory$Impl realRouter$Factory$Impl, SessionManager sessionManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, OrderItemEventHandler$Factory$Impl orderItemEventHandler$Factory$Impl, AfterpayAppletPageRequestHandler$Factory$Impl afterpayAppletPageRequestHandler$Factory$Impl, ActivitiesManager.Factory factory) {
        this.$r8$classId = 3;
        afterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.getClass();
        this.navigator = screenNavigator;
        this.syncer = afterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
        this.store = androidStringManager;
        this.clearMarketingBadgesIfNeeded = realAfterpayAppletAnalytics;
        this.featureFlagManager = realAfterpayAppletRepository;
        this.localHomeGeoPresenterFactory = factory;
        this.tabContentPresenterFactory = realRouter$Factory$Impl.create$1(screenNavigator);
        this.neighborhoodsTabContentEnabled$delegate = Updater.mutableStateOf$default(null);
        String activeAccountToken = PlatformKt.activeAccountToken(sessionManager);
        this.embeddedMapEnabled$delegate = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN_ORDERS, activeAccountToken, (String) null, 12), ActivityScope.MY_ACTIVITY, afterpayAppletPageRequestHandler$Factory$Impl.create("PurchasesListEmbedded"), 8), new ActivitiesCache.InMemory(), afterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen, false, null, orderItemEventHandler$Factory$Impl, null, new InvestingStockDetailsPresenter$$ExternalSyntheticLambda1(this, 1), null, 13720));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$awaitInitialLoadedActivities(LocalHomePresenter localHomePresenter, SafeFlow safeFlow, ContinuationImpl continuationImpl) {
        SupportActivityPickerPresenter$awaitInitialLoadedActivities$1 supportActivityPickerPresenter$awaitInitialLoadedActivities$1;
        int i;
        ActivityEmbeddedViewModel activityEmbeddedViewModel;
        if (continuationImpl instanceof SupportActivityPickerPresenter$awaitInitialLoadedActivities$1) {
            supportActivityPickerPresenter$awaitInitialLoadedActivities$1 = (SupportActivityPickerPresenter$awaitInitialLoadedActivities$1) continuationImpl;
            int i2 = supportActivityPickerPresenter$awaitInitialLoadedActivities$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportActivityPickerPresenter$awaitInitialLoadedActivities$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = supportActivityPickerPresenter$awaitInitialLoadedActivities$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportActivityPickerPresenter$awaitInitialLoadedActivities$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSheetState$peek$3.AnonymousClass2 anonymousClass2 = new RealSheetState$peek$3.AnonymousClass2(2, continuation, 4);
                    supportActivityPickerPresenter$awaitInitialLoadedActivities$1.label = 1;
                    obj = FlowKt.firstOrNull(safeFlow, anonymousClass2, supportActivityPickerPresenter$awaitInitialLoadedActivities$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj;
                if (activityEmbeddedViewModel != null || activityEmbeddedViewModel.getHasLoadingError()) {
                    return null;
                }
                List list = activityEmbeddedViewModel.feedEntries;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ActivityFeedEntry.Item) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        supportActivityPickerPresenter$awaitInitialLoadedActivities$1 = new SupportActivityPickerPresenter$awaitInitialLoadedActivities$1(localHomePresenter, continuationImpl);
        Object obj3 = supportActivityPickerPresenter$awaitInitialLoadedActivities$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportActivityPickerPresenter$awaitInitialLoadedActivities$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj3;
        if (activityEmbeddedViewModel != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if (r1 == r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleActionClickWithoutUrl(LocalHomePresenter localHomePresenter, ContinuationImpl continuationImpl) {
        ReportAbuseDialogPresenter$handleActionClickWithoutUrl$1 reportAbuseDialogPresenter$handleActionClickWithoutUrl$1;
        int i;
        ApiResult apiResult;
        ReportAbuseResult reportAbuseResult;
        String str;
        String str2;
        AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.clearMarketingBadgesIfNeeded;
        PaymentManager paymentManager = (PaymentManager) localHomePresenter.store;
        HistoryScreens.ReportAbuseDialogScreen reportAbuseDialogScreen = (HistoryScreens.ReportAbuseDialogScreen) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
        if (continuationImpl instanceof ReportAbuseDialogPresenter$handleActionClickWithoutUrl$1) {
            reportAbuseDialogPresenter$handleActionClickWithoutUrl$1 = (ReportAbuseDialogPresenter$handleActionClickWithoutUrl$1) continuationImpl;
            int i2 = reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = reportAbuseDialogScreen.url;
                    String str4 = reportAbuseDialogScreen.paymentToken;
                    if (str3 != null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    ReportAbuseRequest reportAbuseRequest = new ReportAbuseRequest(Boolean.valueOf(reportAbuseDialogScreen.block), reportAbuseDialogScreen.customerToken, str4, new RequestContext(null, CollectionsKt__CollectionsKt.listOfNotNull(str4), null, null, null, null, null, null, 8175));
                    BlocklyService blocklyService = (BlocklyService) localHomePresenter.featureFlagManager;
                    ClientScenario clientScenario = ClientScenario.ACTIVITY;
                    String str5 = reportAbuseDialogScreen.flowToken;
                    reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.label = 1;
                    obj = blocklyService.reportAbuse(clientScenario, str5, reportAbuseRequest, reportAbuseDialogPresenter$handleActionClickWithoutUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.d("Successfully %s abuse (%s)", str, reportAbuseDialogScreen.paymentToken);
                        reportAbuseResult = ReportAbuseResult.SUCCESS;
                        ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(new Finish(reportAbuseResult));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                boolean z = reportAbuseDialogScreen.block;
                String str6 = reportAbuseDialogScreen.flowToken;
                String str7 = reportAbuseDialogScreen.paymentToken;
                String str8 = !z ? "reported" : "unreported";
                if (!(apiResult instanceof ApiResult.Success)) {
                    ReportAbuseResponse reportAbuseResponse = (ReportAbuseResponse) ((ApiResult.Success) apiResult).response;
                    ReportAbuseResponse.Status status = reportAbuseResponse.status;
                    if ((status == null ? -1 : ReportAbuseDialogPresenter$WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) != 1) {
                        RealFavoritesManager realFavoritesManager = (RealFavoritesManager) localHomePresenter.localHomeGeoPresenterFactory;
                        String str9 = reportAbuseDialogScreen.customerToken;
                        FavoriteOrigin favoriteOrigin = FavoriteOrigin.FAVORITE_ORIGIN_BLOCKED;
                        reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.L$2 = str8;
                        reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.label = 2;
                        if (realFavoritesManager.removeFavorite(str9, favoriteOrigin, null, reportAbuseDialogPresenter$handleActionClickWithoutUrl$1) != coroutineSingletons) {
                            str = str8;
                            Timber.Forest.d("Successfully %s abuse (%s)", str, reportAbuseDialogScreen.paymentToken);
                            reportAbuseResult = ReportAbuseResult.SUCCESS;
                        }
                        return coroutineSingletons;
                    }
                    Timber.Forest.e("Failed to %s abuse (%s)", str8, str7);
                    ResponseContext responseContext = reportAbuseResponse.response_context;
                    if (responseContext == null || (str2 = responseContext.dialog_message) == null) {
                        str2 = androidStringManager.get(R.string.generic_network_error);
                    }
                    ((RealPaymentManager) paymentManager).error(str6, str2);
                    reportAbuseResult = ReportAbuseResult.FAILURE;
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to %s abuse (%s)", str8, str7);
                    ((RealPaymentManager) paymentManager).error(str6, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message);
                    reportAbuseResult = ReportAbuseResult.FAILURE;
                }
                ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(new Finish(reportAbuseResult));
                return Unit.INSTANCE;
            }
        }
        reportAbuseDialogPresenter$handleActionClickWithoutUrl$1 = new ReportAbuseDialogPresenter$handleActionClickWithoutUrl$1(localHomePresenter, continuationImpl);
        Object obj2 = reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reportAbuseDialogPresenter$handleActionClickWithoutUrl$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        boolean z2 = reportAbuseDialogScreen.block;
        String str62 = reportAbuseDialogScreen.flowToken;
        String str72 = reportAbuseDialogScreen.paymentToken;
        if (!z2) {
        }
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(new Finish(reportAbuseResult));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if (r1 == r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleActionClickWithoutUrl$1(LocalHomePresenter localHomePresenter, ContinuationImpl continuationImpl) {
        ReportAbusePresenter$handleActionClickWithoutUrl$1 reportAbusePresenter$handleActionClickWithoutUrl$1;
        int i;
        ApiResult apiResult;
        ReportAbuseResult reportAbuseResult;
        String str;
        String str2;
        AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.clearMarketingBadgesIfNeeded;
        PaymentManager paymentManager = (PaymentManager) localHomePresenter.store;
        HistoryScreens.ReportAbuse reportAbuse = (HistoryScreens.ReportAbuse) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
        if (continuationImpl instanceof ReportAbusePresenter$handleActionClickWithoutUrl$1) {
            reportAbusePresenter$handleActionClickWithoutUrl$1 = (ReportAbusePresenter$handleActionClickWithoutUrl$1) continuationImpl;
            int i2 = reportAbusePresenter$handleActionClickWithoutUrl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                reportAbusePresenter$handleActionClickWithoutUrl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = reportAbusePresenter$handleActionClickWithoutUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reportAbusePresenter$handleActionClickWithoutUrl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = reportAbuse.url;
                    String str4 = reportAbuse.paymentToken;
                    if (str3 != null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        return null;
                    }
                    ReportAbuseRequest reportAbuseRequest = new ReportAbuseRequest(Boolean.valueOf(reportAbuse.block), reportAbuse.customerToken, str4, new RequestContext(null, CollectionsKt__CollectionsKt.listOfNotNull(str4), null, null, null, null, null, null, 8175));
                    BlocklyService blocklyService = (BlocklyService) localHomePresenter.featureFlagManager;
                    ClientScenario clientScenario = ClientScenario.ACTIVITY;
                    String str5 = reportAbuse.flowToken;
                    reportAbusePresenter$handleActionClickWithoutUrl$1.label = 1;
                    obj = blocklyService.reportAbuse(clientScenario, str5, reportAbuseRequest, reportAbusePresenter$handleActionClickWithoutUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = reportAbusePresenter$handleActionClickWithoutUrl$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.d("Successfully %s abuse (%s)", str, reportAbuse.paymentToken);
                        reportAbuseResult = ReportAbuseResult.SUCCESS;
                        ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(new Finish(reportAbuseResult));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                boolean z = reportAbuse.block;
                String str6 = reportAbuse.flowToken;
                String str7 = reportAbuse.paymentToken;
                String str8 = !z ? "reported" : "unreported";
                if (!(apiResult instanceof ApiResult.Success)) {
                    ReportAbuseResponse reportAbuseResponse = (ReportAbuseResponse) ((ApiResult.Success) apiResult).response;
                    ReportAbuseResponse.Status status = reportAbuseResponse.status;
                    if ((status == null ? -1 : ReportAbusePresenter$WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) != 1) {
                        RealFavoritesManager realFavoritesManager = (RealFavoritesManager) localHomePresenter.localHomeGeoPresenterFactory;
                        String str9 = reportAbuse.customerToken;
                        FavoriteOrigin favoriteOrigin = FavoriteOrigin.FAVORITE_ORIGIN_BLOCKED;
                        reportAbusePresenter$handleActionClickWithoutUrl$1.L$2 = str8;
                        reportAbusePresenter$handleActionClickWithoutUrl$1.label = 2;
                        if (realFavoritesManager.removeFavorite(str9, favoriteOrigin, null, reportAbusePresenter$handleActionClickWithoutUrl$1) != coroutineSingletons) {
                            str = str8;
                            Timber.Forest.d("Successfully %s abuse (%s)", str, reportAbuse.paymentToken);
                            reportAbuseResult = ReportAbuseResult.SUCCESS;
                        }
                        return coroutineSingletons;
                    }
                    Timber.Forest.e("Failed to %s abuse (%s)", str8, str7);
                    ResponseContext responseContext = reportAbuseResponse.response_context;
                    if (responseContext == null || (str2 = responseContext.dialog_message) == null) {
                        str2 = androidStringManager.get(R.string.generic_network_error);
                    }
                    ((RealPaymentManager) paymentManager).error(str6, str2);
                    reportAbuseResult = ReportAbuseResult.FAILURE;
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to %s abuse (%s)", str8, str7);
                    ((RealPaymentManager) paymentManager).error(str6, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message);
                    reportAbuseResult = ReportAbuseResult.FAILURE;
                }
                ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(new Finish(reportAbuseResult));
                return Unit.INSTANCE;
            }
        }
        reportAbusePresenter$handleActionClickWithoutUrl$1 = new ReportAbusePresenter$handleActionClickWithoutUrl$1(localHomePresenter, continuationImpl);
        Object obj2 = reportAbusePresenter$handleActionClickWithoutUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reportAbusePresenter$handleActionClickWithoutUrl$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        boolean z2 = reportAbuse.block;
        String str62 = reportAbuse.flowToken;
        String str72 = reportAbuse.paymentToken;
        if (!z2) {
        }
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(new Finish(reportAbuseResult));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$launchEditAllocation(LocalHomePresenter localHomePresenter, AllocationDestination allocationDestination, PaychecksUiConfiguration paychecksUiConfiguration, ContinuationImpl continuationImpl) {
        DistributePaycheckPresenter$launchEditAllocation$1 distributePaycheckPresenter$launchEditAllocation$1;
        int i;
        String str;
        AllocationDestination allocationDestination2;
        PaychecksUiConfiguration paychecksUiConfiguration2;
        ApiResult apiResult;
        Color color;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
        if (continuationImpl instanceof DistributePaycheckPresenter$launchEditAllocation$1) {
            distributePaycheckPresenter$launchEditAllocation$1 = (DistributePaycheckPresenter$launchEditAllocation$1) continuationImpl;
            int i2 = distributePaycheckPresenter$launchEditAllocation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                distributePaycheckPresenter$launchEditAllocation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = distributePaycheckPresenter$launchEditAllocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = distributePaycheckPresenter$launchEditAllocation$1.label;
                ColorModel.Accented accented = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AddOrEditAllocationDestinationRequest addOrEditAllocationDestinationRequest = new AddOrEditAllocationDestinationRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), CommonMappersKt.toAllocationDestinationProto(allocationDestination));
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    PaychecksAppService paychecksAppService = (PaychecksAppService) localHomePresenter.store;
                    distributePaycheckPresenter$launchEditAllocation$1.L$0 = allocationDestination;
                    distributePaycheckPresenter$launchEditAllocation$1.L$1 = paychecksUiConfiguration;
                    distributePaycheckPresenter$launchEditAllocation$1.L$3 = generateToken;
                    distributePaycheckPresenter$launchEditAllocation$1.label = 1;
                    Object addOrEditAllocationDestination = paychecksAppService.addOrEditAllocationDestination(generateToken, addOrEditAllocationDestinationRequest, distributePaycheckPresenter$launchEditAllocation$1);
                    if (addOrEditAllocationDestination == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = generateToken;
                    obj = addOrEditAllocationDestination;
                    allocationDestination2 = allocationDestination;
                    paychecksUiConfiguration2 = paychecksUiConfiguration;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = distributePaycheckPresenter$launchEditAllocation$1.L$3;
                    paychecksUiConfiguration2 = distributePaycheckPresenter$launchEditAllocation$1.L$1;
                    allocationDestination2 = distributePaycheckPresenter$launchEditAllocation$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    screenNavigator.goTo(new BlockersScreens.Error(BlockersData.DUMMY, TextUtilsCompat.errorMessaging((AndroidStringManager) localHomePresenter.featureFlagManager, (ApiResult.Failure) apiResult, null).message, null));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FlowStarter flowStarter = (FlowStarter) localHomePresenter.clearMarketingBadgesIfNeeded;
                    ResponseContext responseContext = ((AddOrEditAllocationDestinationResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    if (paychecksUiConfiguration2 != null && (color = UtilsKt.getConfigForDestination(paychecksUiConfiguration2, allocationDestination2).tint) != null) {
                        accented = new ColorModel.Accented(color);
                    }
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startEditPaycheckDistributionFlow(str, responseContext, DistributePaycheckScreen.INSTANCE, accented));
                }
                return Boolean.valueOf(apiResult instanceof ApiResult.Success);
            }
        }
        distributePaycheckPresenter$launchEditAllocation$1 = new DistributePaycheckPresenter$launchEditAllocation$1(localHomePresenter, continuationImpl);
        Object obj2 = distributePaycheckPresenter$launchEditAllocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = distributePaycheckPresenter$launchEditAllocation$1.label;
        ColorModel.Accented accented2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Boolean.valueOf(apiResult instanceof ApiResult.Success);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$models$performSearch(SnapshotStateMap snapshotStateMap, LocalHomePresenter localHomePresenter, Ref$ObjectRef ref$ObjectRef, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, ContinuationImpl continuationImpl) {
        AfterpaySearchPresenter$models$performSearch$1 afterpaySearchPresenter$models$performSearch$1;
        int i;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        Object obj;
        ArrayList arrayList;
        Ref$ObjectRef ref$ObjectRef2;
        AfterpayMerchantRepo$SearchResult afterpayMerchantRepo$SearchResult;
        LocalHomePresenter localHomePresenter2 = localHomePresenter;
        MutableState mutableState8 = mutableState;
        if (continuationImpl instanceof AfterpaySearchPresenter$models$performSearch$1) {
            afterpaySearchPresenter$models$performSearch$1 = (AfterpaySearchPresenter$models$performSearch$1) continuationImpl;
            int i2 = afterpaySearchPresenter$models$performSearch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterpaySearchPresenter$models$performSearch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = afterpaySearchPresenter$models$performSearch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterpaySearchPresenter$models$performSearch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    mutableState8.setValue(Boolean.TRUE);
                    ArrayList filterNotNull = CollectionsKt.filterNotNull(snapshotStateMap.values);
                    if (((InputFieldText) mutableState2.getValue()).getValue().length() > 0 || !filterNotNull.isEmpty()) {
                        RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) localHomePresenter2.clearMarketingBadgesIfNeeded;
                        String obj3 = ((InputFieldText) mutableState2.getValue()).getValue().toString();
                        String str = ((AfterpayAppletScreen$AfterpaySearchScreen) localHomePresenter2.neighborhoodsTabContentEnabled$delegate).referrerToken;
                        obj3.getClass();
                        Analytics analytics = realAfterpayAppletAnalytics.analytics;
                        Origin origin = Origin.DISCO;
                        Screen screen = Screen.OFFERS_HOME_V2;
                        analytics.track(new OffersSearchQueryStart(realAfterpayAppletAnalytics.shopFlowToken, str, realAfterpayAppletAnalytics.searchFlowToken, obj3, CollectionsKt.joinToString$default(filterNotNull, ",", null, null, 0, null, null, 62), null, 128), null);
                    }
                    RealAfterpayMerchantRepo realAfterpayMerchantRepo = (RealAfterpayMerchantRepo) localHomePresenter2.syncer;
                    String obj4 = ((InputFieldText) mutableState2.getValue()).getValue().toString();
                    afterpaySearchPresenter$models$performSearch$1.L$1 = localHomePresenter2;
                    afterpaySearchPresenter$models$performSearch$1.L$2 = ref$ObjectRef;
                    afterpaySearchPresenter$models$performSearch$1.L$3 = mutableState8;
                    mutableState5 = mutableState2;
                    afterpaySearchPresenter$models$performSearch$1.L$4 = mutableState5;
                    mutableState6 = mutableState3;
                    afterpaySearchPresenter$models$performSearch$1.L$5 = mutableState6;
                    mutableState7 = mutableState4;
                    afterpaySearchPresenter$models$performSearch$1.L$6 = mutableState7;
                    afterpaySearchPresenter$models$performSearch$1.L$7 = filterNotNull;
                    afterpaySearchPresenter$models$performSearch$1.label = 1;
                    Object internalUpdate = realAfterpayMerchantRepo.internalUpdate(obj4, filterNotNull, afterpaySearchPresenter$models$performSearch$1);
                    if (internalUpdate == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = internalUpdate;
                    arrayList = filterNotNull;
                    ref$ObjectRef2 = ref$ObjectRef;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList2 = afterpaySearchPresenter$models$performSearch$1.L$7;
                    MutableState mutableState9 = afterpaySearchPresenter$models$performSearch$1.L$6;
                    MutableState mutableState10 = afterpaySearchPresenter$models$performSearch$1.L$5;
                    MutableState mutableState11 = afterpaySearchPresenter$models$performSearch$1.L$4;
                    MutableState mutableState12 = afterpaySearchPresenter$models$performSearch$1.L$3;
                    ref$ObjectRef2 = afterpaySearchPresenter$models$performSearch$1.L$2;
                    LocalHomePresenter localHomePresenter3 = afterpaySearchPresenter$models$performSearch$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    arrayList = arrayList2;
                    localHomePresenter2 = localHomePresenter3;
                    obj = obj2;
                    mutableState7 = mutableState9;
                    mutableState6 = mutableState10;
                    mutableState5 = mutableState11;
                    mutableState8 = mutableState12;
                }
                afterpayMerchantRepo$SearchResult = (AfterpayMerchantRepo$SearchResult) obj;
                if (!Intrinsics.areEqual(afterpayMerchantRepo$SearchResult, AfterpayMerchantRepo$SearchResult.Failure.INSTANCE)) {
                    mutableState6.setValue(Boolean.TRUE);
                } else {
                    if (!(afterpayMerchantRepo$SearchResult instanceof AfterpayMerchantRepo$SearchResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState6.setValue(Boolean.FALSE);
                    mutableState7.setValue(((AfterpayMerchantRepo$SearchResult.Success) afterpayMerchantRepo$SearchResult).response);
                }
                if (((InputFieldText) mutableState5.getValue()).getValue().length() <= 0 || !arrayList.isEmpty()) {
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics2 = (RealAfterpayAppletAnalytics) localHomePresenter2.clearMarketingBadgesIfNeeded;
                    String obj5 = ((InputFieldText) mutableState5.getValue()).getValue().toString();
                    boolean z = afterpayMerchantRepo$SearchResult instanceof AfterpayMerchantRepo$SearchResult.Success;
                    String str2 = ((AfterpayAppletScreen$AfterpaySearchScreen) localHomePresenter2.neighborhoodsTabContentEnabled$delegate).referrerToken;
                    obj5.getClass();
                    arrayList.getClass();
                    OfferRequestStatus offerRequestStatus = !z ? OfferRequestStatus.SUCCESS : OfferRequestStatus.NETWORK_ERROR;
                    Analytics analytics2 = realAfterpayAppletAnalytics2.analytics;
                    Origin origin2 = Origin.DISCO;
                    Screen screen2 = Screen.OFFERS_HOME_V2;
                    analytics2.track(new OffersSearchQueryComplete(realAfterpayAppletAnalytics2.shopFlowToken, str2, realAfterpayAppletAnalytics2.searchFlowToken, obj5, CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62), null, offerRequestStatus, 128), null);
                }
                if (((InputFieldText) mutableState5.getValue()).getValue().length() == 0 && arrayList.isEmpty()) {
                    ref$ObjectRef2.element = (AfterpayAppletSearchResponse) mutableState7.getValue();
                }
                mutableState8.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        afterpaySearchPresenter$models$performSearch$1 = new AfterpaySearchPresenter$models$performSearch$1(continuationImpl);
        Object obj22 = afterpaySearchPresenter$models$performSearch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterpaySearchPresenter$models$performSearch$1.label;
        if (i != 0) {
        }
        afterpayMerchantRepo$SearchResult = (AfterpayMerchantRepo$SearchResult) obj;
        if (!Intrinsics.areEqual(afterpayMerchantRepo$SearchResult, AfterpayMerchantRepo$SearchResult.Failure.INSTANCE)) {
        }
        if (((InputFieldText) mutableState5.getValue()).getValue().length() <= 0) {
        }
        RealAfterpayAppletAnalytics realAfterpayAppletAnalytics22 = (RealAfterpayAppletAnalytics) localHomePresenter2.clearMarketingBadgesIfNeeded;
        String obj52 = ((InputFieldText) mutableState5.getValue()).getValue().toString();
        boolean z2 = afterpayMerchantRepo$SearchResult instanceof AfterpayMerchantRepo$SearchResult.Success;
        String str22 = ((AfterpayAppletScreen$AfterpaySearchScreen) localHomePresenter2.neighborhoodsTabContentEnabled$delegate).referrerToken;
        obj52.getClass();
        arrayList.getClass();
        OfferRequestStatus offerRequestStatus2 = !z2 ? OfferRequestStatus.SUCCESS : OfferRequestStatus.NETWORK_ERROR;
        Analytics analytics22 = realAfterpayAppletAnalytics22.analytics;
        Origin origin22 = Origin.DISCO;
        Screen screen22 = Screen.OFFERS_HOME_V2;
        analytics22.track(new OffersSearchQueryComplete(realAfterpayAppletAnalytics22.shopFlowToken, str22, realAfterpayAppletAnalytics22.searchFlowToken, obj52, CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62), null, offerRequestStatus2, 128), null);
        if (((InputFieldText) mutableState5.getValue()).getValue().length() == 0) {
            ref$ObjectRef2.element = (AfterpayAppletSearchResponse) mutableState7.getValue();
        }
        mutableState8.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processScreenshots(LocalHomePresenter localHomePresenter, List list, ContinuationImpl continuationImpl) {
        BugReportingPresenter$processScreenshots$1 bugReportingPresenter$processScreenshots$1;
        int i;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        Screenshot m3428copy5y75sic$default;
        if (continuationImpl instanceof BugReportingPresenter$processScreenshots$1) {
            bugReportingPresenter$processScreenshots$1 = (BugReportingPresenter$processScreenshots$1) continuationImpl;
            int i4 = bugReportingPresenter$processScreenshots$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                bugReportingPresenter$processScreenshots$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = bugReportingPresenter$processScreenshots$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bugReportingPresenter$processScreenshots$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    it = list2.iterator();
                    arrayList = arrayList2;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = bugReportingPresenter$processScreenshots$1.I$1;
                    i3 = bugReportingPresenter$processScreenshots$1.I$0;
                    Collection collection = bugReportingPresenter$processScreenshots$1.L$7;
                    Screenshot screenshot = bugReportingPresenter$processScreenshots$1.L$6;
                    Iterator it2 = bugReportingPresenter$processScreenshots$1.L$4;
                    Collection collection2 = bugReportingPresenter$processScreenshots$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList3 = collection;
                    arrayList = collection2;
                    Iterator it3 = it2;
                    Screenshot screenshot2 = screenshot;
                    FileValidator$Result fileValidator$Result = (FileValidator$Result) obj;
                    if (fileValidator$Result instanceof FileValidator$Result.Success) {
                        FileMetadata fileMetadata = ((FileValidator$Result.Success) fileValidator$Result).metadata;
                        boolean startsWith = StringsKt__StringsJVMKt.startsWith(fileMetadata.mimeType, "video/", false);
                        String str = screenshot2.fileName;
                        if (str == null) {
                            str = fileMetadata.displayName;
                        }
                        m3428copy5y75sic$default = Screenshot.m3428copy5y75sic$default(screenshot2, str, startsWith, 1);
                    } else {
                        if (!(fileValidator$Result instanceof FileValidator$Result.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str2 = screenshot2.fileName;
                        if (str2 == null) {
                            str2 = "Unknown";
                        }
                        m3428copy5y75sic$default = Screenshot.m3428copy5y75sic$default(screenshot2, str2, false, 5);
                    }
                    arrayList3.add(m3428copy5y75sic$default);
                    it = it3;
                    if (it.hasNext()) {
                        Screenshot screenshot3 = (Screenshot) it.next();
                        RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) localHomePresenter.embeddedMapEnabled$delegate;
                        String str3 = screenshot3.uri;
                        ArrayList arrayList4 = arrayList;
                        bugReportingPresenter$processScreenshots$1.L$3 = arrayList4;
                        bugReportingPresenter$processScreenshots$1.L$4 = it;
                        bugReportingPresenter$processScreenshots$1.L$6 = screenshot3;
                        bugReportingPresenter$processScreenshots$1.L$7 = arrayList4;
                        bugReportingPresenter$processScreenshots$1.I$0 = i3;
                        bugReportingPresenter$processScreenshots$1.I$1 = i2;
                        bugReportingPresenter$processScreenshots$1.label = 1;
                        obj = realStrongMemoryCache.m1457validate8YU3vEA(str3, bugReportingPresenter$processScreenshots$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        it3 = it;
                        screenshot2 = screenshot3;
                        arrayList3 = arrayList;
                        FileValidator$Result fileValidator$Result2 = (FileValidator$Result) obj;
                        if (fileValidator$Result2 instanceof FileValidator$Result.Success) {
                        }
                        arrayList3.add(m3428copy5y75sic$default);
                        it = it3;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        bugReportingPresenter$processScreenshots$1 = new BugReportingPresenter$processScreenshots$1(localHomePresenter, continuationImpl);
        Object obj2 = bugReportingPresenter$processScreenshots$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bugReportingPresenter$processScreenshots$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:10:0x0026, B:11:0x0041, B:13:0x0047, B:16:0x004e, B:18:0x0052, B:20:0x0059, B:21:0x005e, B:25:0x0034), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:10:0x0026, B:11:0x0041, B:13:0x0047, B:16:0x004e, B:18:0x0052, B:20:0x0059, B:21:0x005e, B:25:0x0034), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: access$resolveFileNameFromUri-8YU3vEA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1223access$resolveFileNameFromUri8YU3vEA(LocalHomePresenter localHomePresenter, String str, ContinuationImpl continuationImpl) {
        BugReportingPresenter$resolveFileNameFromUri$1 bugReportingPresenter$resolveFileNameFromUri$1;
        int i;
        FileValidator$Result fileValidator$Result;
        localHomePresenter.getClass();
        try {
            if (continuationImpl instanceof BugReportingPresenter$resolveFileNameFromUri$1) {
                bugReportingPresenter$resolveFileNameFromUri$1 = (BugReportingPresenter$resolveFileNameFromUri$1) continuationImpl;
                int i2 = bugReportingPresenter$resolveFileNameFromUri$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    bugReportingPresenter$resolveFileNameFromUri$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = bugReportingPresenter$resolveFileNameFromUri$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bugReportingPresenter$resolveFileNameFromUri$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) localHomePresenter.embeddedMapEnabled$delegate;
                        bugReportingPresenter$resolveFileNameFromUri$1.label = 1;
                        obj = realStrongMemoryCache.m1457validate8YU3vEA(str, bugReportingPresenter$resolveFileNameFromUri$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    fileValidator$Result = (FileValidator$Result) obj;
                    if (!(fileValidator$Result instanceof FileValidator$Result.Success)) {
                        return ((FileValidator$Result.Success) fileValidator$Result).metadata.displayName;
                    }
                    if (fileValidator$Result instanceof FileValidator$Result.Failure) {
                        return ((FileValidator$Result.Failure) fileValidator$Result).metadata.displayName;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            fileValidator$Result = (FileValidator$Result) obj;
            if (!(fileValidator$Result instanceof FileValidator$Result.Success)) {
            }
        } catch (Exception unused) {
            return "";
        }
        bugReportingPresenter$resolveFileNameFromUri$1 = new BugReportingPresenter$resolveFileNameFromUri$1(localHomePresenter, continuationImpl);
        Object obj2 = bugReportingPresenter$resolveFileNameFromUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bugReportingPresenter$resolveFileNameFromUri$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:13:0x007a, B:15:0x0080, B:16:0x00a1, B:23:0x0098, B:25:0x009c, B:26:0x00ab, B:27:0x00b0, B:36:0x004f), top: B:35:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:13:0x007a, B:15:0x0080, B:16:0x00a1, B:23:0x0098, B:25:0x009c, B:26:0x00ab, B:27:0x00b0, B:36:0x004f), top: B:35:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitBugReport(LocalHomePresenter localHomePresenter, BugReport bugReport, String str, DeviceMetrics deviceMetrics, DiagnosticContext diagnosticContext, RealBugReportSender realBugReportSender, RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1, RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12, ButtonKt$Button$2.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        BugReportingPresenter$submitBugReport$1 bugReportingPresenter$submitBugReport$1;
        int i;
        Throwable th;
        ButtonKt$Button$2.AnonymousClass1 anonymousClass12;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        ApiResult apiResult;
        RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$13 = realBrandFollowPresenter$models$2$1$1;
        RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$14 = realBrandFollowPresenter$models$2$1$12;
        if (continuationImpl instanceof BugReportingPresenter$submitBugReport$1) {
            bugReportingPresenter$submitBugReport$1 = (BugReportingPresenter$submitBugReport$1) continuationImpl;
            int i2 = bugReportingPresenter$submitBugReport$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bugReportingPresenter$submitBugReport$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bugReportingPresenter$submitBugReport$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bugReportingPresenter$submitBugReport$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realBrandFollowPresenter$models$2$1$13.invoke(Boolean.TRUE);
                    realBrandFollowPresenter$models$2$1$14.invoke(null);
                    try {
                        Result.Companion companion = Result.Companion;
                        bugReportingPresenter$submitBugReport$1.L$5 = realBrandFollowPresenter$models$2$1$13;
                        bugReportingPresenter$submitBugReport$1.L$6 = realBrandFollowPresenter$models$2$1$14;
                        bugReportingPresenter$submitBugReport$1.L$7 = anonymousClass1;
                        bugReportingPresenter$submitBugReport$1.label = 1;
                        realBugReportSender.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new RealBugReportSender$submitBugReport$2(realBugReportSender, bugReport, diagnosticContext, deviceMetrics, str, null), bugReportingPresenter$submitBugReport$1);
                        if (withContext == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        anonymousClass12 = anonymousClass1;
                        obj = withContext;
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    anonymousClass12 = bugReportingPresenter$submitBugReport$1.L$7;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$15 = bugReportingPresenter$submitBugReport$1.L$6;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$16 = bugReportingPresenter$submitBugReport$1.L$5;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        realBrandFollowPresenter$models$2$1$14 = realBrandFollowPresenter$models$2$1$15;
                        realBrandFollowPresenter$models$2$1$13 = realBrandFollowPresenter$models$2$1$16;
                    } catch (Throwable th3) {
                        th = th3;
                        realBrandFollowPresenter$models$2$1$14 = realBrandFollowPresenter$models$2$1$15;
                        realBrandFollowPresenter$models$2$1$13 = realBrandFollowPresenter$models$2$1$16;
                        Result.Companion companion22 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    anonymousClass12.invoke(((CreateBugReportResponse) ((ApiResult.Success) apiResult).response).external_identifier, ((CreateBugReportResponse) ((ApiResult.Success) apiResult).response).url);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    realBrandFollowPresenter$models$2$1$14.invoke("Failed to submit bug report. Please try again.");
                }
                realBrandFollowPresenter$models$2$1$13.invoke(Boolean.FALSE);
                failure = Unit.INSTANCE;
                Result.Companion companion3 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    realBrandFollowPresenter$models$2$1$14.invoke("An unexpected error occurred: " + m4120exceptionOrNullimpl.getMessage());
                    realBrandFollowPresenter$models$2$1$13.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }
        }
        bugReportingPresenter$submitBugReport$1 = new BugReportingPresenter$submitBugReport$1(localHomePresenter, continuationImpl);
        Object obj2 = bugReportingPresenter$submitBugReport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bugReportingPresenter$submitBugReport$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        realBrandFollowPresenter$models$2$1$13.invoke(Boolean.FALSE);
        failure = Unit.INSTANCE;
        Result.Companion companion32 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static final void access$trackDismissViewEvent(LocalHomePresenter localHomePresenter) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) localHomePresenter.embeddedMapEnabled$delegate;
        if (((AfterpayAppletMerchantSheetViewModel) parcelableSnapshotMutableState.getValue()) instanceof AfterpayAppletMerchantSheetViewModel.Loaded) {
            AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel = (AfterpayAppletMerchantSheetViewModel) parcelableSnapshotMutableState.getValue();
            afterpayAppletMerchantSheetViewModel.getClass();
            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = ((AfterpayAppletMerchantSheetViewModel.Loaded) afterpayAppletMerchantSheetViewModel).analyticsDismissEvent;
            if (afterpayAppletAnalyticsEventsSpec != null) {
                ((RealAfterpayAppletAnalytics) localHomePresenter.featureFlagManager).trackGenericAnalyticsEvents(CollectionsKt__CollectionsJVMKt.listOf(afterpayAppletAnalyticsEventsSpec), localHomePresenter.clientAnalyticsParams());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isForciblyDisabled(OverdraftStatus overdraftStatus) {
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled;
        OverdraftStatus.Disabled.Reason reason;
        OverdraftStatus.State_ state_ = overdraftStatus.State;
        OverdraftStatus.Disabled.Reason reason2 = null;
        if (state_ != null) {
            OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled2 = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : null;
            if (permanentlyDisabled2 != null) {
                permanentlyDisabled = permanentlyDisabled2.value;
                if (permanentlyDisabled == null) {
                    return true;
                }
                if (state_ != null) {
                    OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                    OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                    if (disabled2 != null) {
                        reason = disabled2.reason;
                        if (reason != OverdraftStatus.Disabled.Reason.LOST_ELIGIBILITY) {
                            return true;
                        }
                        if (state_ != null) {
                            OverdraftStatus.State_.Disabled disabled3 = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                            OverdraftStatus.Disabled disabled4 = disabled3 != null ? disabled3.value : null;
                            if (disabled4 != null) {
                                reason2 = disabled4.reason;
                            }
                        }
                        return reason2 == OverdraftStatus.Disabled.Reason.TEMPORARY_DELINQUENCY;
                    }
                }
                reason = null;
                if (reason != OverdraftStatus.Disabled.Reason.LOST_ELIGIBILITY) {
                }
            }
        }
        permanentlyDisabled = null;
        if (permanentlyDisabled == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03d9, code lost:
    
        if (r2 != 0) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0303, code lost:
    
        if (r10 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0359, code lost:
    
        if (r12 != null) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [kotlin.collections.EmptyList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$afterpayapplet$presenters$AfterpaySearchPresenter(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel;
        AndroidStringManager androidStringManager;
        AfterpaySearchViewModel.BodyViewModel bodyViewModel;
        AfterpaySearchViewModel.BodyViewModel bodyViewModel2;
        AfterpayAppletSearchResponse afterpayAppletSearchResponse;
        ?? r2;
        boolean z;
        Map map;
        String str;
        LocalizedString localizedString;
        AfterpayAppletSearchResponse afterpayAppletSearchResponse2;
        KClass orCreateKotlinClass;
        AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel2;
        FilterGroupSection.FilterGroupItem filterGroupItem;
        ErrorEvent.Os.Companion companion;
        List list;
        FilterGroupSection.FilterGroupItem filterGroupItem2;
        AndroidStringManager androidStringManager2 = (AndroidStringManager) this.store;
        SampleStrategy sampleStrategy = (SampleStrategy) this.tabContentPresenterFactory;
        ErrorReporter errorReporter = (ErrorReporter) this.localHomeGeoPresenterFactory;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1747002293);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            gapComposer.updateRememberedValue(null);
            rememberedValue = null;
        }
        ref$ObjectRef.element = (AfterpayAppletSearchResponse) rememberedValue;
        Object[] objArr = new Object[0];
        RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) this.featureFlagManager;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new yf$$ExternalSyntheticLambda2(this, 27);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) realInputFieldTextSaver, (Function0) rememberedValue2, (Composer) gapComposer, 0);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState4 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState5 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState6 = (MutableState) rememberedValue5;
        Object[] objArr2 = new Object[0];
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new MotionKt$$ExternalSyntheticLambda0(15);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        SnapshotStateMap snapshotStateMap = (SnapshotStateMap) SaverKt.m581rememberSaveable(objArr2, (Saver) AfterpaySearchPresenter$Companion$FilterSelectionMapSaver.INSTANCE, (Function0) rememberedValue6, (Composer) gapComposer, 432);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState7 = (MutableState) rememberedValue7;
        Updater.LaunchedEffect(gapComposer, Unit.INSTANCE, new AfterpaySearchPresenter$models$1(snapshotStateMap, this, ref$ObjectRef, mutableState6, rememberSaveable, mutableState4, mutableState5, null, 0));
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, rememberSaveable, this, snapshotStateMap, ref$ObjectRef, mutableState6, mutableState4, mutableState5, (Continuation) null));
        SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$1 = new SessionWorkerKt$runSession$4$1(flow, (Continuation) null, this, snapshotStateMap, ref$ObjectRef, mutableState5, mutableState6, rememberSaveable, mutableState4, mutableState7, 3);
        Map map2 = snapshotStateMap;
        MutableState mutableState8 = mutableState4;
        Updater.LaunchedEffect(gapComposer, flow, sessionWorkerKt$runSession$4$1);
        AfterpayAppletSearchResponse afterpayAppletSearchResponse3 = (AfterpayAppletSearchResponse) mutableState5.getValue();
        AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory = AfterpayAppletParsingErrorFactory.INSTANCE;
        if (afterpayAppletSearchResponse3 != null) {
            String str2 = (String) mutableState7.getValue();
            if (str2 == null) {
                mutableState = rememberSaveable;
                mutableState2 = mutableState6;
                mutableState3 = mutableState8;
                filterBottomSheetViewModel2 = null;
            } else {
                try {
                    FilterGroupSection filterGroupSection = afterpayAppletSearchResponse3.filter_group_sections;
                    if (filterGroupSection == null || (list = filterGroupSection.filter_group_items) == null) {
                        filterGroupItem = null;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                filterGroupItem2 = null;
                                break;
                            }
                            ?? next = it.next();
                            if (AfterpaySearchPresenterKt.id((FilterGroupSection.FilterGroupItem) next).equals(str2)) {
                                filterGroupItem2 = next;
                                break;
                            }
                        }
                        filterGroupItem = filterGroupItem2;
                    }
                    if (filterGroupItem != null && (companion = filterGroupItem.style) != null) {
                        FilterGroupSection$FilterGroupItem$Style$FilterSheet filterGroupSection$FilterGroupItem$Style$FilterSheet = companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet ? (FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion : null;
                        FilterGroupSection.FilterGroupItem.Sheet sheet = filterGroupSection$FilterGroupItem$Style$FilterSheet != null ? filterGroupSection$FilterGroupItem$Style$FilterSheet.value : null;
                        if (sheet != null) {
                            List list2 = sheet.filter_items;
                            mutableState = rememberSaveable;
                            try {
                                mutableState2 = mutableState6;
                                try {
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        FilterGroupSection.FilterGroupItem.FilterItem filterItem = (FilterGroupSection.FilterGroupItem.FilterItem) it2.next();
                                        String str3 = filterItem.filter_token;
                                        if (str3 == null) {
                                            throw new IllegalArgumentException("filter_sheet.filter_items.filter_token");
                                        }
                                        Iterator it3 = it2;
                                        LocalizedString localizedString2 = filterItem.l_name;
                                        if (localizedString2 == null) {
                                            throw new IllegalArgumentException("filter_sheet.filter_items.l_name");
                                        }
                                        Icon icon = filterItem.arcade_icon;
                                        String str4 = icon != null ? icon.arcade_id : null;
                                        if (str4 == null) {
                                            throw new IllegalArgumentException("filter_sheet.filter_items.arcade_icon.arcade_id");
                                        }
                                        mutableState3 = mutableState8;
                                        try {
                                            String str5 = localizedString2.translated_value;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            arrayList.add(new AfterpaySearchViewModel.FilterBottomSheetViewModel.FilterBottomSheetRowViewModel(str3, str5, str4));
                                            it2 = it3;
                                            mutableState8 = mutableState3;
                                        } catch (Exception e) {
                                            e = e;
                                            try {
                                                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletSearchResponse.class), afterpayAppletParsingErrorFactory, null);
                                            } catch (ProtoParsingError e2) {
                                                errorReporter.report(e2, sampleStrategy);
                                                exitWithErrorNotification$1();
                                            }
                                        }
                                    }
                                    mutableState3 = mutableState8;
                                    LocalizedString localizedString3 = sheet.l_title;
                                    if (localizedString3 == null) {
                                        throw new IllegalArgumentException("filter_sheet.l_title");
                                    }
                                    Button button = sheet.apply_button;
                                    LocalizedString localizedString4 = button != null ? button.l_text : null;
                                    if (localizedString4 == null) {
                                        throw new IllegalArgumentException("filter_sheet.apply_button.l_title");
                                    }
                                    Button button2 = sheet.reset_button;
                                    LocalizedString localizedString5 = button2 != null ? button2.l_text : null;
                                    if (localizedString5 == null) {
                                        throw new IllegalArgumentException("filter_sheet.reset_button.l_title");
                                    }
                                    String str6 = localizedString3.translated_value;
                                    String str7 = str6 == null ? "" : str6;
                                    String str8 = localizedString4.translated_value;
                                    String str9 = str8 == null ? "" : str8;
                                    String str10 = localizedString5.translated_value;
                                    filterBottomSheetViewModel2 = new AfterpaySearchViewModel.FilterBottomSheetViewModel(str2, str7, str9, str10 == null ? "" : str10, (String) map2.get(str2), arrayList);
                                } catch (Exception e3) {
                                    e = e3;
                                    mutableState3 = mutableState8;
                                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletSearchResponse.class), afterpayAppletParsingErrorFactory, null);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                mutableState2 = mutableState6;
                                mutableState3 = mutableState8;
                                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletSearchResponse.class), afterpayAppletParsingErrorFactory, null);
                            }
                        }
                    }
                    mutableState = rememberSaveable;
                    mutableState2 = mutableState6;
                    mutableState3 = mutableState8;
                    filterBottomSheetViewModel2 = null;
                } catch (Exception e5) {
                    e = e5;
                    mutableState = rememberSaveable;
                }
            }
            filterBottomSheetViewModel = filterBottomSheetViewModel2;
        } else {
            mutableState = rememberSaveable;
            mutableState2 = mutableState6;
            mutableState3 = mutableState8;
            filterBottomSheetViewModel = null;
        }
        AfterpayAppletSearchResponse afterpayAppletSearchResponse4 = (AfterpayAppletSearchResponse) mutableState5.getValue();
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
        AfterpaySearchViewModel.BodyViewModel bodyViewModel3 = AfterpaySearchViewModel.BodyViewModel.LoadingViewModel.INSTANCE;
        if (booleanValue) {
            if (!booleanValue2 && afterpayAppletSearchResponse4 != null) {
                try {
                    if (AfterpaySearchPresenterKt.access$findNoSearchResultsImageTextSection(afterpayAppletSearchResponse4) != null) {
                    }
                } catch (Exception e6) {
                    e = e6;
                    androidStringManager = androidStringManager2;
                    if (afterpayAppletSearchResponse4 == null) {
                    }
                    throw RotateKt.toProtoParsingExceptionFor(e, orCreateKotlinClass, afterpayAppletParsingErrorFactory, null);
                }
            }
            bodyViewModel2 = bodyViewModel3;
            androidStringManager = androidStringManager2;
            afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) mutableState5.getValue();
            if (afterpayAppletSearchResponse != null) {
                try {
                    DefaultProtoParsingExceptionFactory defaultProtoParsingExceptionFactory = DefaultProtoParsingExceptionFactory.INSTANCE;
                    try {
                        FilterGroupSection filterGroupSection2 = afterpayAppletSearchResponse.filter_group_sections;
                        if (filterGroupSection2 != null) {
                            List list3 = filterGroupSection2.filter_group_items;
                            r2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            Iterator it4 = list3.iterator();
                            while (it4.hasNext()) {
                                FilterGroupSection.FilterGroupItem filterGroupItem3 = (FilterGroupSection.FilterGroupItem) it4.next();
                                String id = AfterpaySearchPresenterKt.id(filterGroupItem3);
                                LocalizedString localizedString6 = filterGroupItem3.l_default_name;
                                String str11 = (String) map2.get(id);
                                FilterGroupSection.FilterGroupItem.FilterItem findItemWithToken = str11 != null ? AfterpaySearchPresenterKt.findItemWithToken(filterGroupItem3, str11) : null;
                                Iterator it5 = it4;
                                int ordinal = AfterpaySearchPresenterKt.access$type(filterGroupItem3).ordinal();
                                if (ordinal == 0) {
                                    z = map2.get(id) != null;
                                } else if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int ordinal2 = AfterpaySearchPresenterKt.access$type(filterGroupItem3).ordinal();
                                if (ordinal2 != 0) {
                                    map = map2;
                                    if (ordinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (findItemWithToken == null || (localizedString = findItemWithToken.l_name) == null || (str = localizedString.translated_value) == null) {
                                        if (localizedString6 == null) {
                                            throw new IllegalArgumentException("l_default_name");
                                        }
                                        str = localizedString6.translated_value;
                                        if (str != null) {
                                        }
                                        str = "";
                                    }
                                } else {
                                    map = map2;
                                    if (localizedString6 == null) {
                                        throw new IllegalArgumentException("l_default_name");
                                    }
                                    str = localizedString6.translated_value;
                                    if (str == null) {
                                        str = "";
                                    }
                                }
                                r2.add(new AfterpaySearchViewModel.FilterPillViewModel(id, str, z, AfterpaySearchPresenterKt.access$type(filterGroupItem3)));
                                it4 = it5;
                                map2 = map;
                            }
                        } else {
                            r2 = EmptyList.INSTANCE;
                        }
                    } catch (Exception e7) {
                        throw RotateKt.toProtoParsingExceptionFor(e7, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletSearchResponse.class), defaultProtoParsingExceptionFactory, null);
                    }
                } catch (ProtoParsingError e8) {
                    errorReporter.report(e8, sampleStrategy);
                    exitWithErrorNotification$1();
                    r2 = EmptyList.INSTANCE;
                }
            }
            r2 = EmptyList.INSTANCE;
            List list4 = r2;
            afterpayAppletSearchResponse2 = (AfterpayAppletSearchResponse) mutableState5.getValue();
            if (afterpayAppletSearchResponse2 != null || (r0 = afterpayAppletSearchResponse2.screen_title) == null) {
                String str12 = androidStringManager.get(R.string.afterpay_applet_search_title_fallback);
            }
            AfterpaySearchViewModel afterpaySearchViewModel = new AfterpaySearchViewModel(str12, androidStringManager.get(R.string.afterpay_applet_search_placeholder_query), (InputFieldText) mutableState.getValue(), list4, bodyViewModel2, filterBottomSheetViewModel);
            gapComposer.end(false);
            return afterpaySearchViewModel;
        }
        if (booleanValue2) {
            androidStringManager = androidStringManager2;
            try {
                bodyViewModel = new AfterpaySearchViewModel.BodyViewModel.NoContentViewModel(androidStringManager.get(R.string.afterpay_applet_search_network_failure_title), androidStringManager.get(R.string.afterpay_applet_search_network_failure_subtitle), (Image) null, androidStringManager.get(R.string.afterpay_applet_search_network_failure_button), (String) null, AfterpaySearchViewEvent.TryAgainButtonClicked.INSTANCE, 4);
            } catch (Exception e9) {
                e = e9;
                if (afterpayAppletSearchResponse4 == null) {
                    try {
                        orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AfterpayAppletSearchResponse.class);
                    } catch (ProtoParsingError e10) {
                        errorReporter.report(e10, sampleStrategy);
                        exitWithErrorNotification$1();
                        bodyViewModel2 = bodyViewModel3;
                        afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) mutableState5.getValue();
                        if (afterpayAppletSearchResponse != null) {
                        }
                        r2 = EmptyList.INSTANCE;
                        List list42 = r2;
                        afterpayAppletSearchResponse2 = (AfterpayAppletSearchResponse) mutableState5.getValue();
                        if (afterpayAppletSearchResponse2 != null) {
                        }
                        String str122 = androidStringManager.get(R.string.afterpay_applet_search_title_fallback);
                        AfterpaySearchViewModel afterpaySearchViewModel2 = new AfterpaySearchViewModel(str122, androidStringManager.get(R.string.afterpay_applet_search_placeholder_query), (InputFieldText) mutableState.getValue(), list42, bodyViewModel2, filterBottomSheetViewModel);
                        gapComposer.end(false);
                        return afterpaySearchViewModel2;
                    }
                } else {
                    orCreateKotlinClass = null;
                }
                throw RotateKt.toProtoParsingExceptionFor(e, orCreateKotlinClass, afterpayAppletParsingErrorFactory, null);
            }
        } else {
            androidStringManager = androidStringManager2;
            bodyViewModel = null;
        }
        if (bodyViewModel == null) {
            bodyViewModel = afterpayAppletSearchResponse4 != null ? noResultsViewModel(afterpayAppletSearchResponse4) : null;
            if (bodyViewModel == null) {
                bodyViewModel = afterpayAppletSearchResponse4 != null ? resultsViewModel(afterpayAppletSearchResponse4, booleanValue) : null;
            }
        }
        bodyViewModel2 = bodyViewModel;
        afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) mutableState5.getValue();
        if (afterpayAppletSearchResponse != null) {
        }
        r2 = EmptyList.INSTANCE;
        List list422 = r2;
        afterpayAppletSearchResponse2 = (AfterpayAppletSearchResponse) mutableState5.getValue();
        if (afterpayAppletSearchResponse2 != null) {
        }
        String str1222 = androidStringManager.get(R.string.afterpay_applet_search_title_fallback);
        AfterpaySearchViewModel afterpaySearchViewModel22 = new AfterpaySearchViewModel(str1222, androidStringManager.get(R.string.afterpay_applet_search_placeholder_query), (InputFieldText) mutableState.getValue(), list422, bodyViewModel2, filterBottomSheetViewModel);
        gapComposer.end(false);
        return afterpaySearchViewModel22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$banking$presenters$BetterOverdraftPresenter(Flow flow, Composer composer, int i) {
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled;
        OverdraftStatus.Disabled.Reason reason;
        OverdraftStatus.Disabled.Reason reason2;
        String str;
        String str2;
        boolean z;
        OverdraftStatus.State_ state_;
        Money money;
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled2;
        Object obj;
        Message message;
        String str3;
        OverdraftStatus overdraftStatus;
        Float f;
        BetterOverdraftViewModel.Loaded.OverdraftUsageViewModel overdraftUsageViewModel;
        int ordinal;
        boolean z2;
        String str4;
        String str5;
        Money money2;
        Money money3;
        Money money4;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.embeddedMapEnabled$delegate;
        SyncValueReader syncValueReader = (SyncValueReader) this.store;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.clearMarketingBadgesIfNeeded;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1226757234);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftStatus);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftUsage);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        OverdraftStatus overdraftStatus2 = (OverdraftStatus) collectAsState.getValue();
        if (overdraftStatus2 == null) {
            gapComposer.startReplaceGroup(448449413);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(448449414);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(overdraftStatus2);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new SearchBarBinding$Content$1$1(this, overdraftStatus2, continuation, 26);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, collectAsState, mutableState, 5));
        if (((OverdraftUsage) collectAsState2.getValue()) == null || ((OverdraftStatus) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return BetterOverdraftViewModel.Loading.INSTANCE;
        }
        String str6 = androidStringManager.get(R.string.overdraft_title_bar_text);
        Resources resources = androidStringManager.resources;
        OverdraftStatus overdraftStatus3 = (OverdraftStatus) collectAsState.getValue();
        overdraftStatus3.getClass();
        OverdraftUsage overdraftUsage = (OverdraftUsage) collectAsState2.getValue();
        boolean z3 = (overdraftUsage == null || (money4 = overdraftUsage.usage) == null || Moneys.isZero(money4)) ? false : true;
        OverdraftStatus.State_ state_2 = overdraftStatus3.State;
        if (state_2 != null) {
            OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled3 = state_2 instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_2 : null;
            if (permanentlyDisabled3 != null) {
                permanentlyDisabled = permanentlyDisabled3.value;
                if (permanentlyDisabled == null && z3) {
                    str2 = androidStringManager.get(R.string.overdraft_permanently_disabled_subtitle);
                } else {
                    if (state_2 != null) {
                        OverdraftStatus.State_.Disabled disabled = state_2 instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_2 : null;
                        OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                        if (disabled2 != null) {
                            reason = disabled2.reason;
                            if (reason == OverdraftStatus.Disabled.Reason.LOST_ELIGIBILITY) {
                                str2 = androidStringManager.get(R.string.overdraft_disabled_lost_eligibility_subtitle);
                            } else {
                                if (state_2 != null) {
                                    OverdraftStatus.State_.Disabled disabled3 = state_2 instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_2 : null;
                                    OverdraftStatus.Disabled disabled4 = disabled3 != null ? disabled3.value : null;
                                    if (disabled4 != null) {
                                        reason2 = disabled4.reason;
                                        if (reason2 == OverdraftStatus.Disabled.Reason.TEMPORARY_DELINQUENCY) {
                                            str = null;
                                            OverdraftUsage overdraftUsage2 = (OverdraftUsage) collectAsState2.getValue();
                                            OverdraftStatus overdraftStatus4 = (OverdraftStatus) collectAsState.getValue();
                                            overdraftStatus4.getClass();
                                            z = (overdraftUsage2 != null || (money3 = overdraftUsage2.usage) == null || Moneys.isZero(money3)) ? false : true;
                                            state_ = overdraftStatus4.State;
                                            if (state_ != null) {
                                                OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled4 = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : null;
                                                permanentlyDisabled2 = permanentlyDisabled4 != null ? permanentlyDisabled4.value : null;
                                                money = null;
                                            } else {
                                                money = null;
                                                permanentlyDisabled2 = null;
                                            }
                                            if (permanentlyDisabled2 == null && z) {
                                                Money money5 = overdraftUsage2.usage;
                                                money5.getClass();
                                                String format2 = moneyFormatter.format(money5);
                                                format2.getClass();
                                                ArrayMap arrayMap = new ArrayMap(1);
                                                arrayMap.put("usedAmount", format2);
                                                resources.getClass();
                                                str3 = new MessageFormat(resources.getString(R.string.overdraft_page_title_owed_text)).format(arrayMap);
                                                str3.getClass();
                                            } else if (z) {
                                                Money money6 = overdraftUsage2.usage;
                                                money6.getClass();
                                                String format3 = moneyFormatter.format(money6);
                                                format3.getClass();
                                                ArrayMap arrayMap2 = new ArrayMap(1);
                                                arrayMap2.put("usedAmount", format3);
                                                resources.getClass();
                                                str3 = new MessageFormat(resources.getString(R.string.overdraft_page_title_used_text)).format(arrayMap2);
                                                str3.getClass();
                                            } else {
                                                if (state_ != null) {
                                                    OverdraftStatus.State_.Disabled disabled5 = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : money;
                                                    OverdraftStatus.Disabled disabled6 = disabled5 != 0 ? disabled5.value : money;
                                                    if (disabled6 != 0) {
                                                        obj = disabled6.reason;
                                                        if (obj != OverdraftStatus.Disabled.Reason.USER_DISABLED) {
                                                            str3 = androidStringManager.get(R.string.overdraft_page_title_turn_on_text);
                                                        } else {
                                                            if (state_ != null) {
                                                                OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled5 = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : money;
                                                                if (permanentlyDisabled5 != 0) {
                                                                    message = permanentlyDisabled5.value;
                                                                    str3 = message == null ? androidStringManager.get(R.string.overdraft_page_title_permanently_disabled_text) : androidStringManager.get(R.string.overdraft_page_title_unused_text);
                                                                }
                                                            }
                                                            message = money;
                                                            if (message == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                obj = money;
                                                if (obj != OverdraftStatus.Disabled.Reason.USER_DISABLED) {
                                                }
                                            }
                                            OverdraftStatus overdraftStatus5 = (OverdraftStatus) collectAsState.getValue();
                                            overdraftStatus5.getClass();
                                            BetterOverdraftViewModel.Loaded.OverdraftHeaderViewModel overdraftHeaderViewModel = new BetterOverdraftViewModel.Loaded.OverdraftHeaderViewModel(str3, isForciblyDisabled(overdraftStatus5) ? money : androidStringManager.get(R.string.overdraft_support_link_text));
                                            OverdraftUsage overdraftUsage3 = (OverdraftUsage) collectAsState2.getValue();
                                            overdraftUsage3.getClass();
                                            Money money7 = overdraftUsage3.usage;
                                            overdraftStatus = (OverdraftStatus) collectAsState.getValue();
                                            overdraftStatus.getClass();
                                            if (isForciblyDisabled(overdraftStatus)) {
                                                overdraftUsageViewModel = new BetterOverdraftViewModel.Loaded.OverdraftUsageViewModel(RecyclerView.DECELERATION_RATE, moneyFormatter.format(new Money((Long) 0L, CurrencyCode.USD, 4)), androidStringManager.get(R.string.overdraft_coverage_disabled_subtitle));
                                            } else {
                                                Money money8 = overdraftUsage3.limit;
                                                if (money7 == null || money8 == null) {
                                                    f = money;
                                                } else {
                                                    Long l = money7.amount;
                                                    l.getClass();
                                                    float longValue = l.longValue();
                                                    money8.amount.getClass();
                                                    f = Float.valueOf(longValue / r10.longValue());
                                                }
                                                f.getClass();
                                                float floatValue = f.floatValue();
                                                Money minus = (money7 == null || money8 == null) ? money : Moneys.minus(money8, money7);
                                                minus.getClass();
                                                overdraftUsageViewModel = new BetterOverdraftViewModel.Loaded.OverdraftUsageViewModel(floatValue, moneyFormatter.format(minus), androidStringManager.get(R.string.overdraft_usage_subtitle));
                                            }
                                            String str7 = androidStringManager.get(R.string.overdraft_explanation_title);
                                            String str8 = androidStringManager.get(R.string.overdraft_explanation_body);
                                            String str9 = androidStringManager.get(R.string.overdraft_explanation_item_pay_off);
                                            zzd zzdVar = Icons.Companion;
                                            BetterOverdraftViewModel.Loaded.OverdraftUsageViewModel overdraftUsageViewModel2 = overdraftUsageViewModel;
                                            BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo overdraftLimitsInfo = new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo(str7, str8, CollectionsKt__CollectionsKt.listOf((Object[]) new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem[]{new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("35X0rU"), str9), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("64SHZU"), androidStringManager.get(R.string.overdraft_explanation_item_add_money)), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("JBpEJg"), androidStringManager.get(R.string.overdraft_explanation_item_use_card)), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("LQUx2D"), androidStringManager.get(R.string.overdraft_explanation_item_deposit_paycheck))}));
                                            OverdraftUsage overdraftUsage4 = (OverdraftUsage) collectAsState2.getValue();
                                            overdraftUsage4.getClass();
                                            String str10 = Moneys.amount(overdraftUsage4.usage) > 0 ? androidStringManager.get(R.string.overdraft_repay_button_text) : money;
                                            OverdraftStatus overdraftStatus6 = (OverdraftStatus) collectAsState.getValue();
                                            overdraftStatus6.getClass();
                                            ordinal = toToggleState(overdraftStatus6).ordinal();
                                            if (ordinal != 0) {
                                                z2 = true;
                                                if (ordinal != 1 && ordinal != 2) {
                                                    if (ordinal != 3) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return money;
                                                    }
                                                    str5 = money;
                                                    OverdraftUsage overdraftUsage5 = (OverdraftUsage) collectAsState2.getValue();
                                                    BetterOverdraftViewModel.Loaded loaded = new BetterOverdraftViewModel.Loaded(str6, str, overdraftHeaderViewModel, overdraftUsageViewModel2, overdraftLimitsInfo, str10, str5, !((Boolean) mutableState.getValue()).booleanValue() ? new BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet(!((overdraftUsage5 != null || (money2 = overdraftUsage5.usage) == null || Moneys.isZero(money2)) ? false : z2) ? androidStringManager.get(R.string.overdraft_turn_off_confirmation_title_with_balance) : androidStringManager.get(R.string.overdraft_turn_off_confirmation_title), androidStringManager.get(R.string.overdraft_turn_off_confirmation_body), androidStringManager.get(R.string.overdraft_turn_off_confirmation_button)) : money);
                                                    gapComposer.end(false);
                                                    return loaded;
                                                }
                                                str4 = androidStringManager.get(R.string.overdraft_turn_on_button_text);
                                            } else {
                                                z2 = true;
                                                str4 = androidStringManager.get(R.string.overdraft_turn_off_button_text);
                                            }
                                            str5 = str4;
                                            OverdraftUsage overdraftUsage52 = (OverdraftUsage) collectAsState2.getValue();
                                            BetterOverdraftViewModel.Loaded loaded2 = new BetterOverdraftViewModel.Loaded(str6, str, overdraftHeaderViewModel, overdraftUsageViewModel2, overdraftLimitsInfo, str10, str5, !((Boolean) mutableState.getValue()).booleanValue() ? new BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet(!((overdraftUsage52 != null || (money2 = overdraftUsage52.usage) == null || Moneys.isZero(money2)) ? false : z2) ? androidStringManager.get(R.string.overdraft_turn_off_confirmation_title_with_balance) : androidStringManager.get(R.string.overdraft_turn_off_confirmation_title), androidStringManager.get(R.string.overdraft_turn_off_confirmation_body), androidStringManager.get(R.string.overdraft_turn_off_confirmation_button)) : money);
                                            gapComposer.end(false);
                                            return loaded2;
                                        }
                                        str2 = androidStringManager.get(R.string.overdraft_disabled_forty_five_day_delinquent_subtitle);
                                    }
                                }
                                reason2 = null;
                                if (reason2 == OverdraftStatus.Disabled.Reason.TEMPORARY_DELINQUENCY) {
                                }
                            }
                        }
                    }
                    reason = null;
                    if (reason == OverdraftStatus.Disabled.Reason.LOST_ELIGIBILITY) {
                    }
                }
                str = str2;
                OverdraftUsage overdraftUsage22 = (OverdraftUsage) collectAsState2.getValue();
                OverdraftStatus overdraftStatus42 = (OverdraftStatus) collectAsState.getValue();
                overdraftStatus42.getClass();
                if (overdraftUsage22 != null) {
                }
                state_ = overdraftStatus42.State;
                if (state_ != null) {
                }
                if (permanentlyDisabled2 == null) {
                }
                if (z) {
                }
                OverdraftStatus overdraftStatus52 = (OverdraftStatus) collectAsState.getValue();
                overdraftStatus52.getClass();
                BetterOverdraftViewModel.Loaded.OverdraftHeaderViewModel overdraftHeaderViewModel2 = new BetterOverdraftViewModel.Loaded.OverdraftHeaderViewModel(str3, isForciblyDisabled(overdraftStatus52) ? money : androidStringManager.get(R.string.overdraft_support_link_text));
                OverdraftUsage overdraftUsage32 = (OverdraftUsage) collectAsState2.getValue();
                overdraftUsage32.getClass();
                Money money72 = overdraftUsage32.usage;
                overdraftStatus = (OverdraftStatus) collectAsState.getValue();
                overdraftStatus.getClass();
                if (isForciblyDisabled(overdraftStatus)) {
                }
                String str72 = androidStringManager.get(R.string.overdraft_explanation_title);
                String str82 = androidStringManager.get(R.string.overdraft_explanation_body);
                String str92 = androidStringManager.get(R.string.overdraft_explanation_item_pay_off);
                zzd zzdVar2 = Icons.Companion;
                BetterOverdraftViewModel.Loaded.OverdraftUsageViewModel overdraftUsageViewModel22 = overdraftUsageViewModel;
                BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo overdraftLimitsInfo2 = new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo(str72, str82, CollectionsKt__CollectionsKt.listOf((Object[]) new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem[]{new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("35X0rU"), str92), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("64SHZU"), androidStringManager.get(R.string.overdraft_explanation_item_add_money)), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("JBpEJg"), androidStringManager.get(R.string.overdraft_explanation_item_use_card)), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("LQUx2D"), androidStringManager.get(R.string.overdraft_explanation_item_deposit_paycheck))}));
                OverdraftUsage overdraftUsage42 = (OverdraftUsage) collectAsState2.getValue();
                overdraftUsage42.getClass();
                if (Moneys.amount(overdraftUsage42.usage) > 0) {
                }
                OverdraftStatus overdraftStatus62 = (OverdraftStatus) collectAsState.getValue();
                overdraftStatus62.getClass();
                ordinal = toToggleState(overdraftStatus62).ordinal();
                if (ordinal != 0) {
                }
                str5 = str4;
                OverdraftUsage overdraftUsage522 = (OverdraftUsage) collectAsState2.getValue();
                BetterOverdraftViewModel.Loaded loaded22 = new BetterOverdraftViewModel.Loaded(str6, str, overdraftHeaderViewModel2, overdraftUsageViewModel22, overdraftLimitsInfo2, str10, str5, !((Boolean) mutableState.getValue()).booleanValue() ? new BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet(!((overdraftUsage522 != null || (money2 = overdraftUsage522.usage) == null || Moneys.isZero(money2)) ? false : z2) ? androidStringManager.get(R.string.overdraft_turn_off_confirmation_title_with_balance) : androidStringManager.get(R.string.overdraft_turn_off_confirmation_title), androidStringManager.get(R.string.overdraft_turn_off_confirmation_body), androidStringManager.get(R.string.overdraft_turn_off_confirmation_button)) : money);
                gapComposer.end(false);
                return loaded22;
            }
        }
        permanentlyDisabled = null;
        if (permanentlyDisabled == null) {
        }
        if (state_2 != null) {
        }
        reason = null;
        if (reason == OverdraftStatus.Disabled.Reason.LOST_ELIGIBILITY) {
        }
        str = str2;
        OverdraftUsage overdraftUsage222 = (OverdraftUsage) collectAsState2.getValue();
        OverdraftStatus overdraftStatus422 = (OverdraftStatus) collectAsState.getValue();
        overdraftStatus422.getClass();
        if (overdraftUsage222 != null) {
        }
        state_ = overdraftStatus422.State;
        if (state_ != null) {
        }
        if (permanentlyDisabled2 == null) {
        }
        if (z) {
        }
        OverdraftStatus overdraftStatus522 = (OverdraftStatus) collectAsState.getValue();
        overdraftStatus522.getClass();
        BetterOverdraftViewModel.Loaded.OverdraftHeaderViewModel overdraftHeaderViewModel22 = new BetterOverdraftViewModel.Loaded.OverdraftHeaderViewModel(str3, isForciblyDisabled(overdraftStatus522) ? money : androidStringManager.get(R.string.overdraft_support_link_text));
        OverdraftUsage overdraftUsage322 = (OverdraftUsage) collectAsState2.getValue();
        overdraftUsage322.getClass();
        Money money722 = overdraftUsage322.usage;
        overdraftStatus = (OverdraftStatus) collectAsState.getValue();
        overdraftStatus.getClass();
        if (isForciblyDisabled(overdraftStatus)) {
        }
        String str722 = androidStringManager.get(R.string.overdraft_explanation_title);
        String str822 = androidStringManager.get(R.string.overdraft_explanation_body);
        String str922 = androidStringManager.get(R.string.overdraft_explanation_item_pay_off);
        zzd zzdVar22 = Icons.Companion;
        BetterOverdraftViewModel.Loaded.OverdraftUsageViewModel overdraftUsageViewModel222 = overdraftUsageViewModel;
        BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo overdraftLimitsInfo22 = new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo(str722, str822, CollectionsKt__CollectionsKt.listOf((Object[]) new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem[]{new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("35X0rU"), str922), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("64SHZU"), androidStringManager.get(R.string.overdraft_explanation_item_add_money)), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("JBpEJg"), androidStringManager.get(R.string.overdraft_explanation_item_use_card)), new BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo.OverdraftLimitsInfoItem(new Icon("LQUx2D"), androidStringManager.get(R.string.overdraft_explanation_item_deposit_paycheck))}));
        OverdraftUsage overdraftUsage422 = (OverdraftUsage) collectAsState2.getValue();
        overdraftUsage422.getClass();
        if (Moneys.amount(overdraftUsage422.usage) > 0) {
        }
        OverdraftStatus overdraftStatus622 = (OverdraftStatus) collectAsState.getValue();
        overdraftStatus622.getClass();
        ordinal = toToggleState(overdraftStatus622).ordinal();
        if (ordinal != 0) {
        }
        str5 = str4;
        OverdraftUsage overdraftUsage5222 = (OverdraftUsage) collectAsState2.getValue();
        BetterOverdraftViewModel.Loaded loaded222 = new BetterOverdraftViewModel.Loaded(str6, str, overdraftHeaderViewModel22, overdraftUsageViewModel222, overdraftLimitsInfo22, str10, str5, !((Boolean) mutableState.getValue()).booleanValue() ? new BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet(!((overdraftUsage5222 != null || (money2 = overdraftUsage5222.usage) == null || Moneys.isZero(money2)) ? false : z2) ? androidStringManager.get(R.string.overdraft_turn_off_confirmation_title_with_balance) : androidStringManager.get(R.string.overdraft_turn_off_confirmation_title), androidStringManager.get(R.string.overdraft_turn_off_confirmation_body), androidStringManager.get(R.string.overdraft_turn_off_confirmation_button)) : money);
        gapComposer.end(false);
        return loaded222;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$banking$presenters$OverdraftCoveragePresenter(Flow flow, Composer composer, int i) {
        Object obj;
        Object obj2;
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled;
        String str;
        Money money;
        OverdraftStatus.Button button;
        LocalizedString localizedString;
        String str2;
        Boolean bool;
        ColorCodesKt colorCodesKt;
        OverdraftStatus.Button button2;
        LocalizedString localizedString2;
        OverdraftStatus.Button button3;
        LocalizedString localizedString3;
        LocalizedString localizedString4;
        SyncValueReader syncValueReader = (SyncValueReader) this.syncer;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2047119038);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftStatus);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.OverdraftUsage);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        OverdraftStatus overdraftStatus = (OverdraftStatus) collectAsState.getValue();
        if (overdraftStatus == null) {
            gapComposer.startReplaceGroup(-1482299467);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1482299466);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(overdraftStatus);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SearchBarBinding$Content$1$1(this, overdraftStatus, objArr == true ? 1 : 0, 27);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            gapComposer.end(false);
        }
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new AmountPickerCondensedView.AnonymousClass14(this, objArr2 == true ? 1 : 0, 10);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue4);
        Updater.LaunchedEffect(gapComposer, flow, new BenefitsHubPresenter$models$1$1(12, collectAsState, (Object) flow, (Object) this, (Continuation) (objArr3 == true ? 1 : 0)));
        OverdraftStatus overdraftStatus2 = (OverdraftStatus) collectAsState.getValue();
        if (overdraftStatus2 != null) {
            OverdraftUsage overdraftUsage = (OverdraftUsage) collectAsState2.getValue();
            MoneyFormatter moneyFormatter = (MoneyFormatter) this.embeddedMapEnabled$delegate;
            AndroidStringManager androidStringManager = (AndroidStringManager) this.featureFlagManager;
            LocalizedString localizedString5 = overdraftStatus2.localized_header_text;
            OverdraftStatus.State_ state_ = overdraftStatus2.State;
            String str3 = localizedString5 != null ? localizedString5.translated_value : null;
            str3.getClass();
            OverdraftStatus.Button button4 = overdraftStatus2.footer_button;
            String str4 = (button4 == null || (localizedString4 = button4.localized_text) == null) ? null : localizedString4.translated_value;
            if (state_ != null) {
                OverdraftStatus.State_.Eligible eligible = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                OverdraftStatus.Eligible eligible2 = eligible != null ? eligible.value : null;
                if (eligible2 != null) {
                    LocalizedString localizedString6 = eligible2.localized_body_text;
                    String str5 = localizedString6 != null ? localizedString6.translated_value : null;
                    str5.getClass();
                    OverdraftStatus.ToggleButton toggleButton = eligible2.toggle_button;
                    obj = new OverdraftViewModel.Loaded.EligibleViewModel(str5, str3, str4, toggleButton != null ? toToggleViewModel(toggleButton, androidStringManager.get(R.string.overdraft_coverage_label), null) : null, 16);
                }
            }
            if (state_ != null) {
                OverdraftStatus.State_.Upsell upsell = state_ instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_ : null;
                OverdraftStatus.Upsell upsell2 = upsell != null ? upsell.value : null;
                if (upsell2 != null) {
                    LocalizedString localizedString7 = upsell2.localized_body_text;
                    localizedString7.getClass();
                    String str6 = localizedString7.translated_value;
                    str6.getClass();
                    obj = new OverdraftViewModel.Loaded.EligibleViewModel(str6, str3, str4, null, 24);
                }
            }
            if (state_ != null) {
                OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
                if (activated2 != null) {
                    MoneyFormatter moneyFormatter2 = (MoneyFormatter) this.neighborhoodsTabContentEnabled$delegate;
                    overdraftUsage.getClass();
                    Money money2 = overdraftUsage.usage;
                    money2.getClass();
                    Money money3 = overdraftUsage.limit;
                    money3.getClass();
                    CurrencyCode currencyCode = money2.currency_code;
                    currencyCode.getClass();
                    Money zero = Moneys.zero(currencyCode);
                    String str7 = ((!Moneys.isZero(money2) ? money2 : null) == null || (button3 = activated2.repayment_button) == null || (localizedString3 = button3.localized_text) == null) ? null : localizedString3.translated_value;
                    OverdraftStatus.ToggleButton toggleButton2 = activated2.toggle_button;
                    toggleButton2.getClass();
                    OverdraftViewModel.Loaded.ToggleViewModel toggleViewModel = toToggleViewModel(toggleButton2, androidStringManager.get(R.string.overdraft_coverage_label), androidStringManager.get(R.string.overdraft_coverage_on));
                    LocalizedString localizedString8 = activated2.localized_usage_subtitle;
                    String str8 = localizedString8 != null ? localizedString8.translated_value : null;
                    str8.getClass();
                    obj2 = new OverdraftViewModel.Loaded.ActivatedViewModel(new OverdraftViewModel.Loaded.OverdraftUsageViewModel(Moneys.div(money2, money3), moneyFormatter2.format(zero), moneyFormatter2.format(money3)), str3, str4, toggleViewModel, new OverdraftViewModel.Loaded.RepaymentSectionViewModel(str7, OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Secondary.INSTANCE, str8, moneyFormatter.format(money2)));
                    if (obj2 == null) {
                        final ColorModel.Warning warning = ColorModel.Warning.INSTANCE;
                        if (state_ != null) {
                            OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                            OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                            if (disabled2 != null) {
                                overdraftUsage.getClass();
                                Money money4 = overdraftUsage.usage;
                                if (money4 != null) {
                                    if ((!Moneys.isZero(money4) ? money4 : null) != null && (button2 = disabled2.repayment_button) != null && (localizedString2 = button2.localized_text) != null) {
                                        str2 = localizedString2.translated_value;
                                        LocalizedString localizedString9 = disabled2.localized_body_text;
                                        OverdraftStatus.ToggleButton toggleButton3 = disabled2.toggle_button;
                                        String str9 = localizedString9 == null ? localizedString9.translated_value : null;
                                        toggleButton3.getClass();
                                        bool = toggleButton3.is_user_interaction_enabled;
                                        OverdraftViewModel.Loaded.ToggleViewModel toggleViewModel2 = toToggleViewModel(toggleButton3, androidStringManager.get(R.string.overdraft_coverage_label), !Intrinsics.areEqual(bool, Boolean.TRUE) ? androidStringManager.get(R.string.overdraft_coverage_off) : androidStringManager.get(R.string.overdraft_coverage_deactivated));
                                        LocalizedString localizedString10 = disabled2.localized_usage_subtitle;
                                        String str10 = localizedString10 == null ? localizedString10.translated_value : null;
                                        str10.getClass();
                                        money4.getClass();
                                        String format2 = moneyFormatter.format(money4);
                                        bool.getClass();
                                        if (bool.booleanValue()) {
                                            colorCodesKt = new ColorCodesKt(warning) { // from class: com.squareup.cash.banking.viewmodels.OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary
                                                public final ColorModel backgroundColorModel;

                                                {
                                                    this.backgroundColorModel = warning;
                                                }

                                                public final boolean equals(Object obj3) {
                                                    if (this == obj3) {
                                                        return true;
                                                    }
                                                    return (obj3 instanceof OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) && this.backgroundColorModel.equals(((OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) obj3).backgroundColorModel);
                                                }

                                                public final int hashCode() {
                                                    return this.backgroundColorModel.hashCode();
                                                }

                                                public final String toString() {
                                                    return "Primary(backgroundColorModel=" + this.backgroundColorModel + ")";
                                                }
                                            };
                                        } else {
                                            final ColorModel.PrimaryButtonBackground primaryButtonBackground = ColorModel.PrimaryButtonBackground.INSTANCE;
                                            colorCodesKt = new ColorCodesKt(primaryButtonBackground) { // from class: com.squareup.cash.banking.viewmodels.OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary
                                                public final ColorModel backgroundColorModel;

                                                {
                                                    this.backgroundColorModel = primaryButtonBackground;
                                                }

                                                public final boolean equals(Object obj3) {
                                                    if (this == obj3) {
                                                        return true;
                                                    }
                                                    return (obj3 instanceof OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) && this.backgroundColorModel.equals(((OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) obj3).backgroundColorModel);
                                                }

                                                public final int hashCode() {
                                                    return this.backgroundColorModel.hashCode();
                                                }

                                                public final String toString() {
                                                    return "Primary(backgroundColorModel=" + this.backgroundColorModel + ")";
                                                }
                                            };
                                        }
                                        obj2 = new OverdraftViewModel.Loaded.DisabledViewModel(str9, str3, str4, toggleViewModel2, new OverdraftViewModel.Loaded.RepaymentSectionViewModel(str2, colorCodesKt, str10, format2));
                                        if (obj2 == null) {
                                            if (state_ != null) {
                                                OverdraftStatus.State_.PermanentlyDisabled permanentlyDisabled2 = state_ instanceof OverdraftStatus.State_.PermanentlyDisabled ? (OverdraftStatus.State_.PermanentlyDisabled) state_ : null;
                                                if (permanentlyDisabled2 != null) {
                                                    permanentlyDisabled = permanentlyDisabled2.value;
                                                    permanentlyDisabled.getClass();
                                                    if (overdraftUsage != null && (money = overdraftUsage.usage) != null) {
                                                        if (Moneys.isZero(money)) {
                                                            money = null;
                                                        }
                                                        if (money != null && (button = permanentlyDisabled.repayment_button) != null && (localizedString = button.localized_text) != null) {
                                                            str = localizedString.translated_value;
                                                            LocalizedString localizedString11 = permanentlyDisabled.localized_body_text;
                                                            String str11 = localizedString11 == null ? localizedString11.translated_value : null;
                                                            LocalizedString localizedString12 = permanentlyDisabled.localized_usage_subtitle;
                                                            String str12 = localizedString12 == null ? localizedString12.translated_value : null;
                                                            str12.getClass();
                                                            Money money5 = overdraftUsage == null ? overdraftUsage.usage : null;
                                                            money5.getClass();
                                                            obj = new OverdraftViewModel.Loaded.PermanentlyDisabledViewModel(str11, str3, new OverdraftViewModel.Loaded.RepaymentSectionViewModel(str, new ColorCodesKt(warning) { // from class: com.squareup.cash.banking.viewmodels.OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary
                                                                public final ColorModel backgroundColorModel;

                                                                {
                                                                    this.backgroundColorModel = warning;
                                                                }

                                                                public final boolean equals(Object obj3) {
                                                                    if (this == obj3) {
                                                                        return true;
                                                                    }
                                                                    return (obj3 instanceof OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) && this.backgroundColorModel.equals(((OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) obj3).backgroundColorModel);
                                                                }

                                                                public final int hashCode() {
                                                                    return this.backgroundColorModel.hashCode();
                                                                }

                                                                public final String toString() {
                                                                    return "Primary(backgroundColorModel=" + this.backgroundColorModel + ")";
                                                                }
                                                            }, str12, moneyFormatter.format(money5)));
                                                        }
                                                    }
                                                    str = null;
                                                    LocalizedString localizedString112 = permanentlyDisabled.localized_body_text;
                                                    if (localizedString112 == null) {
                                                    }
                                                    LocalizedString localizedString122 = permanentlyDisabled.localized_usage_subtitle;
                                                    if (localizedString122 == null) {
                                                    }
                                                    str12.getClass();
                                                    if (overdraftUsage == null) {
                                                    }
                                                    money5.getClass();
                                                    obj = new OverdraftViewModel.Loaded.PermanentlyDisabledViewModel(str11, str3, new OverdraftViewModel.Loaded.RepaymentSectionViewModel(str, new ColorCodesKt(warning) { // from class: com.squareup.cash.banking.viewmodels.OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary
                                                        public final ColorModel backgroundColorModel;

                                                        {
                                                            this.backgroundColorModel = warning;
                                                        }

                                                        public final boolean equals(Object obj3) {
                                                            if (this == obj3) {
                                                                return true;
                                                            }
                                                            return (obj3 instanceof OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) && this.backgroundColorModel.equals(((OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) obj3).backgroundColorModel);
                                                        }

                                                        public final int hashCode() {
                                                            return this.backgroundColorModel.hashCode();
                                                        }

                                                        public final String toString() {
                                                            return "Primary(backgroundColorModel=" + this.backgroundColorModel + ")";
                                                        }
                                                    }, str12, moneyFormatter.format(money5)));
                                                }
                                            }
                                            permanentlyDisabled = null;
                                            permanentlyDisabled.getClass();
                                            if (overdraftUsage != null) {
                                                if (Moneys.isZero(money)) {
                                                }
                                                if (money != null) {
                                                    str = localizedString.translated_value;
                                                    LocalizedString localizedString1122 = permanentlyDisabled.localized_body_text;
                                                    if (localizedString1122 == null) {
                                                    }
                                                    LocalizedString localizedString1222 = permanentlyDisabled.localized_usage_subtitle;
                                                    if (localizedString1222 == null) {
                                                    }
                                                    str12.getClass();
                                                    if (overdraftUsage == null) {
                                                    }
                                                    money5.getClass();
                                                    obj = new OverdraftViewModel.Loaded.PermanentlyDisabledViewModel(str11, str3, new OverdraftViewModel.Loaded.RepaymentSectionViewModel(str, new ColorCodesKt(warning) { // from class: com.squareup.cash.banking.viewmodels.OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary
                                                        public final ColorModel backgroundColorModel;

                                                        {
                                                            this.backgroundColorModel = warning;
                                                        }

                                                        public final boolean equals(Object obj3) {
                                                            if (this == obj3) {
                                                                return true;
                                                            }
                                                            return (obj3 instanceof OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) && this.backgroundColorModel.equals(((OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) obj3).backgroundColorModel);
                                                        }

                                                        public final int hashCode() {
                                                            return this.backgroundColorModel.hashCode();
                                                        }

                                                        public final String toString() {
                                                            return "Primary(backgroundColorModel=" + this.backgroundColorModel + ")";
                                                        }
                                                    }, str12, moneyFormatter.format(money5)));
                                                }
                                            }
                                            str = null;
                                            LocalizedString localizedString11222 = permanentlyDisabled.localized_body_text;
                                            if (localizedString11222 == null) {
                                            }
                                            LocalizedString localizedString12222 = permanentlyDisabled.localized_usage_subtitle;
                                            if (localizedString12222 == null) {
                                            }
                                            str12.getClass();
                                            if (overdraftUsage == null) {
                                            }
                                            money5.getClass();
                                            obj = new OverdraftViewModel.Loaded.PermanentlyDisabledViewModel(str11, str3, new OverdraftViewModel.Loaded.RepaymentSectionViewModel(str, new ColorCodesKt(warning) { // from class: com.squareup.cash.banking.viewmodels.OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary
                                                public final ColorModel backgroundColorModel;

                                                {
                                                    this.backgroundColorModel = warning;
                                                }

                                                public final boolean equals(Object obj3) {
                                                    if (this == obj3) {
                                                        return true;
                                                    }
                                                    return (obj3 instanceof OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) && this.backgroundColorModel.equals(((OverdraftViewModel$Loaded$RepaymentSectionViewModel$RepaymentButtonStyle$Primary) obj3).backgroundColorModel);
                                                }

                                                public final int hashCode() {
                                                    return this.backgroundColorModel.hashCode();
                                                }

                                                public final String toString() {
                                                    return "Primary(backgroundColorModel=" + this.backgroundColorModel + ")";
                                                }
                                            }, str12, moneyFormatter.format(money5)));
                                        }
                                    }
                                }
                                str2 = null;
                                LocalizedString localizedString92 = disabled2.localized_body_text;
                                OverdraftStatus.ToggleButton toggleButton32 = disabled2.toggle_button;
                                if (localizedString92 == null) {
                                }
                                toggleButton32.getClass();
                                bool = toggleButton32.is_user_interaction_enabled;
                                OverdraftViewModel.Loaded.ToggleViewModel toggleViewModel22 = toToggleViewModel(toggleButton32, androidStringManager.get(R.string.overdraft_coverage_label), !Intrinsics.areEqual(bool, Boolean.TRUE) ? androidStringManager.get(R.string.overdraft_coverage_off) : androidStringManager.get(R.string.overdraft_coverage_deactivated));
                                LocalizedString localizedString102 = disabled2.localized_usage_subtitle;
                                if (localizedString102 == null) {
                                }
                                str10.getClass();
                                money4.getClass();
                                String format22 = moneyFormatter.format(money4);
                                bool.getClass();
                                if (bool.booleanValue()) {
                                }
                                obj2 = new OverdraftViewModel.Loaded.DisabledViewModel(str9, str3, str4, toggleViewModel22, new OverdraftViewModel.Loaded.RepaymentSectionViewModel(str2, colorCodesKt, str10, format22));
                                if (obj2 == null) {
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                        }
                    }
                    obj = obj2;
                }
            }
            obj2 = null;
            if (obj2 == null) {
            }
            obj = obj2;
        } else {
            obj = OverdraftViewModel.Loading.INSTANCE;
        }
        gapComposer.end(false);
        return obj;
    }

    private final Object models$com$squareup$cash$bitcoin$presenters$applet$sendreceive$BitcoinSendRestrictionPresenter(Flow flow, Composer composer, int i) {
        String str;
        BitcoinSendRestrictionScreen bitcoinSendRestrictionScreen = (BitcoinSendRestrictionScreen) this.neighborhoodsTabContentEnabled$delegate;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.syncer;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1054240928);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealCryptoBalanceRepo) this.clearMarketingBadgesIfNeeded).getBitcoinBalance();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((BitcoinLimitsProvider) this.store).getMinimumWithdrawalLimit();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new MLKitTitleGenerator$1(this, null, 19);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, collectAsState2, collectAsState, 14));
        Money money = bitcoinSendRestrictionScreen.amount;
        if (money != null) {
            String format2 = ((MoneyFormatter) this.embeddedMapEnabled$delegate).format(money);
            format2.getClass();
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str = new MessageFormat(resources.getString(R.string.bitcoin_send_restriction_title_with_amount)).format(new Object[]{format2});
            str.getClass();
        } else {
            str = androidStringManager.get(R.string.bitcoin_send_restriction_title_no_amount);
        }
        BitcoinSendRestrictionViewModel bitcoinSendRestrictionViewModel = new BitcoinSendRestrictionViewModel(str, bitcoinSendRestrictionScreen.amount != null ? androidStringManager.get(R.string.bitcoin_send_restriction_subtitle_with_amount) : androidStringManager.get(R.string.bitcoin_send_restriction_subtitle_no_amount), androidStringManager.get(R.string.bitcoin_send_restriction_learn_more), androidStringManager.get(R.string.bitcoin_presenters_done_cta));
        gapComposer.end(false);
        return bitcoinSendRestrictionViewModel;
    }

    private final Object models$com$squareup$cash$blockers$presenters$VerifyInstrumentPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(28000593);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new TemporaryStorage$getDir$2(this, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default((VerifyInstrumentModel) this.embeddedMapEnabled$delegate);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, mutableState, 7));
        VerifyInstrumentModel verifyInstrumentModel = (VerifyInstrumentModel) mutableState.getValue();
        gapComposer.end(false);
        return verifyInstrumentModel;
    }

    private final Object models$com$squareup$cash$blockers$presenters$VerifyMagicPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1358274234);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        boolean changed = gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue());
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = StateFlowKt.runUntil(new SafeFlow(new FileBlockerView$6$2$2(this, continuation, 14)), (Signal) this.neighborhoodsTabContentEnabled$delegate);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, VerifyMagicViewModel.Loading.INSTANCE, null, gapComposer, 0, 2);
        Updater.LaunchedEffect(gapComposer, flow, new FileBlockerView$6$2$2(flow, continuation, parcelableSnapshotMutableIntState, 13));
        VerifyMagicViewModel verifyMagicViewModel = (VerifyMagicViewModel) collectAsState.getValue();
        gapComposer.end(false);
        return verifyMagicViewModel;
    }

    private final Object models$com$squareup$cash$bugreporting$presenters$BugReportingPresenter(Flow flow, Composer composer, int i) {
        Object bugReportingPresenter$models$2$1;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        String str;
        MutableState mutableState4;
        Boolean bool;
        Boolean bool2;
        boolean z;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        Object ready;
        LocalHomePresenter localHomePresenter = this;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(461681905);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(new BugReport("", "", EmptyList.INSTANCE, new DiagnosticAttachments(true, true, true, true, true, true, true, true, false, false)));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState8 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            Object dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(((RealProfileAliasRepository) localHomePresenter.store).all(), 22);
            gapComposer.updateRememberedValue(dataStoreImpl$data$1$invokeSuspend$$inlined$map$1);
            rememberedValue2 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, emptyList, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default("No email available");
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState9 = (MutableState) rememberedValue3;
        List list = (List) collectAsState.getValue();
        boolean changed = gapComposer.changed(collectAsState);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue4 == obj) {
            rememberedValue4 = new OffersHomePresenter$models$2$1(collectAsState, mutableState9, continuation, 2);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, list, (Function2) rememberedValue4);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(((BugReportingScreen) localHomePresenter.syncer).screenshots);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState10 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(emptyList);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState11 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState12 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState13 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState14 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj) {
            rememberedValue10 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState15 = (MutableState) rememberedValue10;
        List list2 = (List) mutableState10.getValue();
        boolean changedInstance = gapComposer.changedInstance(localHomePresenter);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue11 == obj) {
            mutableState = mutableState8;
            bugReportingPresenter$models$2$1 = new BugReportingPresenter$models$2$1(mutableState10, localHomePresenter, mutableState11, mutableState, null);
            mutableState2 = mutableState10;
            localHomePresenter = localHomePresenter;
            mutableState3 = mutableState11;
            gapComposer.updateRememberedValue(bugReportingPresenter$models$2$1);
        } else {
            mutableState2 = mutableState10;
            mutableState3 = mutableState11;
            bugReportingPresenter$models$2$1 = rememberedValue11;
            mutableState = mutableState8;
        }
        Updater.LaunchedEffect(gapComposer, list2, (Function2) bugReportingPresenter$models$2$1);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == obj) {
            rememberedValue12 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue12;
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj) {
            RealBugReportSenderFactory realBugReportSenderFactory = (RealBugReportSenderFactory) localHomePresenter.clearMarketingBadgesIfNeeded;
            rememberedValue13 = new RealBugReportSender((BugReportService) realBugReportSenderFactory.bugReportService, (SessionManager) realBugReportSenderFactory.sessionManager, (TemporaryStorage) realBugReportSenderFactory.tempStorage, (SharedPreferences) realBugReportSenderFactory.preferences, (String) realBugReportSenderFactory.endpoint, (e) realBugReportSenderFactory.backStackDumper, (BinaryBitmap) realBugReportSenderFactory.featureEligibilityDumper, (CashAccountDatabaseImpl) realBugReportSenderFactory.cashDatabase, (Context) realBugReportSenderFactory.endpointContext, (CoroutineScope) realBugReportSenderFactory.scope, (BugsnagClient) realBugReportSenderFactory.bugsnagClient, (KeyValue) realBugReportSenderFactory.recentMoneybotSession);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        RealBugReportSender realBugReportSender = (RealBugReportSender) rememberedValue13;
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (rememberedValue14 == obj) {
            rememberedValue14 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        MutableState mutableState16 = (MutableState) rememberedValue14;
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (rememberedValue15 == obj) {
            realBugReportSender.getClass();
            rememberedValue15 = Updater.mutableStateOf$default(new DiagnosticAttachments(true, true, true, true, true, true, true, true, false, false));
            gapComposer.updateRememberedValue(rememberedValue15);
        }
        MutableState mutableState17 = (MutableState) rememberedValue15;
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (rememberedValue16 == obj) {
            rememberedValue16 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        MutableState mutableState18 = (MutableState) rememberedValue16;
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (rememberedValue17 == obj) {
            rememberedValue17 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        MutableState mutableState19 = (MutableState) rememberedValue17;
        Object rememberedValue18 = gapComposer.rememberedValue();
        if (rememberedValue18 == obj) {
            rememberedValue18 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue18);
        }
        MutableState mutableState20 = (MutableState) rememberedValue18;
        MutableState collectAsState2 = Updater.collectAsState((ReadonlyStateFlow) ((BinaryBitmap) localHomePresenter.localHomeGeoPresenterFactory).matrix, null, gapComposer, 1);
        Object rememberedValue19 = gapComposer.rememberedValue();
        if (rememberedValue19 == obj) {
            rememberedValue19 = FlowKt.debounce(FlowKt.distinctUntilChanged(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new TabContentViewKt$$ExternalSyntheticLambda1(24, mutableState)), 4)), 500L);
            gapComposer.updateRememberedValue(rememberedValue19);
        }
        Object obj2 = (Flow) rememberedValue19;
        Boolean bool3 = (Boolean) collectAsState2.getValue();
        bool3.getClass();
        Boolean bool4 = (Boolean) mutableState20.getValue();
        bool4.getClass();
        boolean changed2 = gapComposer.changed(collectAsState2) | gapComposer.changedInstance(obj2) | gapComposer.changedInstance(localHomePresenter);
        Object rememberedValue20 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue20 == obj) {
            MutableState mutableState21 = mutableState;
            LocalHomePresenter localHomePresenter2 = localHomePresenter;
            str = "";
            mutableState4 = mutableState13;
            bool = bool3;
            bool2 = bool4;
            z = true;
            Object engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(obj2, collectAsState2, mutableState20, localHomePresenter2, mutableState18, mutableState21, mutableState19, null, 24);
            mutableState5 = mutableState20;
            localHomePresenter = localHomePresenter2;
            mutableState6 = mutableState18;
            mutableState = mutableState21;
            gapComposer.updateRememberedValue(engineInterceptor$intercept$2);
            rememberedValue20 = engineInterceptor$intercept$2;
        } else {
            mutableState6 = mutableState18;
            str = "";
            mutableState4 = mutableState13;
            z = true;
            bool = bool3;
            bool2 = bool4;
            mutableState5 = mutableState20;
        }
        Updater.LaunchedEffect(bool, bool2, (Function2) rememberedValue20, gapComposer);
        List list3 = (List) mutableState2.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(localHomePresenter);
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue21 == obj) {
            MutableState mutableState22 = mutableState2;
            Object realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1(localHomePresenter, mutableState22, mutableState3, mutableState, (Continuation) null, 2);
            mutableState7 = mutableState22;
            gapComposer.updateRememberedValue(realBlockersHelper$skipBlocker$1);
            rememberedValue21 = realBlockersHelper$skipBlocker$1;
        } else {
            mutableState7 = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, list3, (Function2) rememberedValue21);
        MutableState mutableState23 = mutableState4;
        MutableState mutableState24 = mutableState;
        String str2 = str;
        Updater.LaunchedEffect(gapComposer, flow, new PaymentConfigurationPresenter$models$28$8$1(flow, (Continuation) null, this, coroutineScope, mutableState14, mutableState15, mutableState5, mutableState19, mutableState24, mutableState23, mutableState7, mutableState16, mutableState17, realBugReportSender, mutableState9, mutableState12));
        if (((Boolean) mutableState12.getValue()).booleanValue()) {
            ready = BugReportingViewModel.Loading.INSTANCE;
        } else if (((String) mutableState14.getValue()) != null) {
            String str3 = (String) mutableState14.getValue();
            String str4 = (String) mutableState15.getValue();
            AndroidStringManager androidStringManager = (AndroidStringManager) this.featureFlagManager;
            String str5 = androidStringManager.get(R.string.bug_reporting_success_title);
            if (str3 != null) {
                str2 = str3;
            }
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.bug_reporting_success_message)).format(new Object[]{str2});
            format2.getClass();
            ready = new BugReportingViewModel.Success(str5, format2, str3, str4);
        } else {
            ready = new BugReportingViewModel.Ready((String) mutableState9.getValue(), ((BugReport) mutableState24.getValue()).title, ((BugReport) mutableState24.getValue()).description, (List) mutableState3.getValue(), (((Boolean) mutableState12.getValue()).booleanValue() || StringsKt.isBlank(((BugReport) mutableState24.getValue()).description) || StringsKt.isBlank(((BugReport) mutableState24.getValue()).title) || ((Boolean) mutableState19.getValue()).booleanValue()) ? false : z, ((Boolean) mutableState12.getValue()).booleanValue(), (String) mutableState23.getValue(), (DiagnosticAttachments) mutableState17.getValue(), ((Boolean) mutableState16.getValue()).booleanValue(), ((Boolean) mutableState6.getValue()).booleanValue(), ((Boolean) mutableState19.getValue()).booleanValue());
        }
        gapComposer.end(false);
        return ready;
    }

    private final Object models$com$squareup$cash$deposits$physical$presenter$details$AtmLocationDetailsPresenter(Flow flow, Composer composer, int i) {
        Long l;
        GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) this.neighborhoodsTabContentEnabled$delegate;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(349850259);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new RealProfileManager$setPhoto$2(flow, continuation, this, 24));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new RealProfileManager$profileOrNull$2(this, continuation, 5);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        String str = retailerLocation.retailer_name;
        List list = retailerLocation.location_details;
        str.getClass();
        GlobalAddress globalAddress = retailerLocation.address;
        globalAddress.getClass();
        String buildAsString = AddressKt.buildAsString(globalAddress, false);
        String str2 = retailerLocation.retailer_icon_url;
        str2.getClass();
        String str3 = ((AndroidStringManager) this.featureFlagManager).get(R.string.location_details_directions_button);
        com.squareup.protos.cash.moneymap.app.Button button = retailerLocation.button;
        button.getClass();
        String str4 = button.name;
        str4.getClass();
        Money money = retailerLocation.fee_amount;
        LocationDetailsViewModel.LocationDetailsIcon locationDetailsIcon = (money == null || (l = money.amount) == null || l.longValue() != 0) ? LocationDetailsViewModel.LocationDetailsIcon.Currency : LocationDetailsViewModel.LocationDetailsIcon.Zero;
        String str5 = ((GetRetailerLocationsResponse.LocationDetail) list.get(0)).title;
        str5.getClass();
        String str6 = ((GetRetailerLocationsResponse.LocationDetail) list.get(0)).description;
        str6.getClass();
        String str7 = ((GetRetailerLocationsResponse.LocationDetail) list.get(0)).highlighted_info_text;
        str7.getClass();
        LocationDetailsViewModel locationDetailsViewModel = new LocationDetailsViewModel(str2, buildAsString, str, null, str3, str4, new LocationDetailsViewModel.FeeViewModel(locationDetailsIcon, str5, str7, str6));
        gapComposer.end(false);
        return locationDetailsViewModel;
    }

    private final Object models$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormCompletionPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(803164283);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(new Versioned(Unit.INSTANCE, 0));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object[] objArr = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = new Recipient$$ExternalSyntheticLambda2(6);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 48);
        Object[] objArr2 = new Object[0];
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = new Recipient$$ExternalSyntheticLambda2(7);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue3, gapComposer, 48);
        Unit unit = Unit.INSTANCE;
        Versioned versioned = (Versioned) mutableState.getValue();
        boolean changed = gapComposer.changed(mutableState2) | gapComposer.changed(mutableState3) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == obj) {
            rememberedValue4 = new VerifyCheckDepositPresenter$models$3$1(this, mutableState2, mutableState3, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(unit, versioned, (Function2) rememberedValue4, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, mutableState2, mutableState, 19));
        DirectDepositManualFormCompletionViewModel directDepositManualFormCompletionViewModel = (DirectDepositManualFormCompletionViewModel) mutableState3.getValue();
        gapComposer.end(false);
        return directDepositManualFormCompletionViewModel;
    }

    private final Object models$com$squareup$cash$favorites$presenters$AddFavoritesPresenter(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        Continuation continuation;
        RealProfileManager realProfileManager = (RealProfileManager) this.clearMarketingBadgesIfNeeded;
        ModifiablePermissions modifiablePermissions = (ModifiablePermissions) this.tabContentPresenterFactory;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(774128794);
        int i2 = 0;
        Object[] objArr = new Object[0];
        RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) this.featureFlagManager;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new Recipient$$ExternalSyntheticLambda2(24);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) realInputFieldTextSaver, (Function0) rememberedValue, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState3 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState4 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            Object realDisclosureProvider$special$$inlined$map$1 = new RealDisclosureProvider$special$$inlined$map$1(realProfileManager.region(), 10);
            gapComposer.updateRememberedValue(realDisclosureProvider$special$$inlined$map$1);
            rememberedValue4 = realDisclosureProvider$special$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, Region.USA, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = modifiablePermissions.granted();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        int i3 = 9;
        if (rememberedValue6 == obj) {
            Object transform$special$$inlined$map$1 = new Transform$special$$inlined$map$1(modifiablePermissions.granted(), this, i3);
            gapComposer.updateRememberedValue(transform$special$$inlined$map$1);
            rememberedValue6 = transform$special$$inlined$map$1;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            Object addFavoritesPresenter$models$lambda$15$$inlined$map$1 = new AddFavoritesPresenter$models$lambda$15$$inlined$map$1(((RealFavoritesManager) this.store).getFavorites(), i2);
            gapComposer.updateRememberedValue(addFavoritesPresenter$models$lambda$15$$inlined$map$1);
            rememberedValue7 = addFavoritesPresenter$models$lambda$15$$inlined$map$1;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue7, emptyList, null, gapComposer, 48, 2);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Updater.mutableStateOf$default(emptyList);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState5 = (MutableState) rememberedValue8;
        boolean changed = gapComposer.changed(((InputFieldText) rememberSaveable.getValue()).getValue());
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changed || rememberedValue9 == obj) {
            Continuation continuation2 = null;
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new RealDisclosureProvider$special$$inlined$map$1(realProfileManager.region(), i3), modifiablePermissions.granted(), new CardModelView.AnonymousClass1.AnonymousClass4(rememberSaveable, continuation2, 8), i2);
            mutableState = mutableState3;
            mutableState2 = mutableState4;
            continuation = null;
            rememberedValue9 = FlowKt.transformLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, new PaymentActionHandler$transform$$inlined$flatMapLatest$2(this, mutableState, mutableState4, continuation2, 1));
            gapComposer.updateRememberedValue(rememberedValue9);
        } else {
            mutableState = mutableState3;
            mutableState2 = mutableState4;
            continuation = null;
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue9, emptyList, null, gapComposer, 48, 2);
        List list = (List) collectAsState4.getValue();
        List list2 = (List) collectAsState5.getValue();
        boolean changed2 = gapComposer.changed(collectAsState5);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue10 == obj) {
            rememberedValue10 = new OffersHomePresenter$models$2$1(collectAsState5, mutableState5, continuation, 4);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        Updater.LaunchedEffect(list, list2, (Function2) rememberedValue10, gapComposer);
        MutableState mutableState6 = mutableState;
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, rememberSaveable, mutableState6, collectAsState4, mutableState5, collectAsState2, 18));
        InputFieldText inputFieldText = (InputFieldText) rememberSaveable.getValue();
        Region region = (Region) collectAsState.getValue();
        boolean booleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
        Boolean bool = (Boolean) collectAsState2.getValue();
        boolean booleanValue2 = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) collectAsState3.getValue();
        AddFavoritesViewModel addFavoritesViewModel = new AddFavoritesViewModel(inputFieldText, region, (String) mutableState2.getValue(), new ToolbarViewModel(((AndroidStringManager) this.syncer).get(R.string.add_favorites)), (List) mutableState5.getValue(), (List) collectAsState4.getValue(), booleanValue2, bool2 != null ? bool2.booleanValue() : false, booleanValue);
        gapComposer.end(false);
        return addFavoritesViewModel;
    }

    private final Object models$com$squareup$cash$history$presenters$ReportAbuseDialogPresenter(Flow flow, Composer composer, int i) {
        HistoryScreens.ReportAbuseDialogScreen reportAbuseDialogScreen = (HistoryScreens.ReportAbuseDialogScreen) this.neighborhoodsTabContentEnabled$delegate;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.clearMarketingBadgesIfNeeded;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(711268213);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealFamilyProfileManager) this.tabContentPresenterFactory).familyProfile;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            String str = reportAbuseDialogScreen.title;
            rememberedValue2 = str != null ? new AppLockMonitor$special$$inlined$map$2(str, 19) : new Transform$special$$inlined$map$1(((RealContactRepository) this.syncer).customerFirstNameById(reportAbuseDialogScreen.customerToken), this, 15);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, continuation, this, mutableState, 10));
        boolean changed = gapComposer.changed((FamilyProfile) collectAsState.getValue());
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            String str2 = reportAbuseDialogScreen.message;
            if (str2 == null) {
                if (reportAbuseDialogScreen.block) {
                    FamilyProfile familyProfile = (FamilyProfile) collectAsState.getValue();
                    if (familyProfile instanceof FamilyProfile.ManagedAccount) {
                        String str3 = ((FamilyProfile.ManagedAccount) familyProfile).firstName;
                        if (str3 != null) {
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            str2 = new MessageFormat(resources.getString(R.string.activity_report_abuse_body_managed_account)).format(new Object[]{str3});
                            str2.getClass();
                        } else {
                            str2 = androidStringManager.get(R.string.activity_report_abuse_body);
                        }
                    } else {
                        str2 = androidStringManager.get(R.string.activity_report_abuse_body);
                    }
                } else {
                    str2 = androidStringManager.get(R.string.activity_unreport_abuse_body);
                }
            }
            rememberedValue4 = str2;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        String str4 = (String) rememberedValue4;
        ReportAbuseViewModel reportAbuseViewModel = reportAbuseDialogScreen.block ? new ReportAbuseViewModel((String) collectAsState2.getValue(), str4, androidStringManager.get(R.string.activity_report_abuse_block), androidStringManager.get(R.string.activity_report_abuse_cancel), ReportAbuseViewModel.Action.BLOCK, ((Boolean) mutableState.getValue()).booleanValue()) : new ReportAbuseViewModel((String) collectAsState2.getValue(), str4, androidStringManager.get(R.string.activity_unreport_abuse_unblock), androidStringManager.get(R.string.activity_unreport_abuse_cancel), ReportAbuseViewModel.Action.UNBLOCK, ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return reportAbuseViewModel;
    }

    private final Object models$com$squareup$cash$history$presenters$ReportAbusePresenter(Flow flow, Composer composer, int i) {
        HistoryScreens.ReportAbuse reportAbuse = (HistoryScreens.ReportAbuse) this.neighborhoodsTabContentEnabled$delegate;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.clearMarketingBadgesIfNeeded;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1908673867);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealFamilyProfileManager) this.tabContentPresenterFactory).familyProfile;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            String str = reportAbuse.title;
            rememberedValue2 = str != null ? new AppLockMonitor$special$$inlined$map$2(str, 19) : new Transform$special$$inlined$map$1(((RealContactRepository) this.syncer).customerFirstNameById(reportAbuse.customerToken), this, 16);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, continuation, this, mutableState, 11));
        boolean changed = gapComposer.changed((FamilyProfile) collectAsState.getValue());
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            String str2 = reportAbuse.message;
            if (str2 == null) {
                if (reportAbuse.block) {
                    FamilyProfile familyProfile = (FamilyProfile) collectAsState.getValue();
                    if (familyProfile instanceof FamilyProfile.ManagedAccount) {
                        String str3 = ((FamilyProfile.ManagedAccount) familyProfile).firstName;
                        if (str3 != null) {
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            str2 = new MessageFormat(resources.getString(R.string.activity_report_abuse_body_managed_account)).format(new Object[]{str3});
                            str2.getClass();
                        } else {
                            str2 = androidStringManager.get(R.string.activity_report_abuse_body);
                        }
                    } else {
                        str2 = androidStringManager.get(R.string.activity_report_abuse_body);
                    }
                } else {
                    str2 = androidStringManager.get(R.string.activity_unreport_abuse_body);
                }
            }
            rememberedValue4 = str2;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        String str4 = (String) rememberedValue4;
        ReportAbuseViewModel reportAbuseViewModel = reportAbuse.block ? new ReportAbuseViewModel((String) collectAsState2.getValue(), str4, androidStringManager.get(R.string.activity_report_abuse_block), androidStringManager.get(R.string.activity_report_abuse_cancel), ReportAbuseViewModel.Action.BLOCK, ((Boolean) mutableState.getValue()).booleanValue()) : new ReportAbuseViewModel((String) collectAsState2.getValue(), str4, androidStringManager.get(R.string.activity_unreport_abuse_unblock), androidStringManager.get(R.string.activity_unreport_abuse_cancel), ReportAbuseViewModel.Action.UNBLOCK, ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return reportAbuseViewModel;
    }

    private final Object models$com$squareup$cash$investing$applets$presenters$StocksAppletTilePresenter(Flow flow, Composer composer, int i) {
        Object graphError;
        Object uninstalled;
        Object obj = this.embeddedMapEnabled$delegate;
        String str = (String) obj;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.navigator;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.syncer;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1415940513);
        this.neighborhoodsTabContentEnabled$delegate = ((RealInvestingStateManager) this.featureFlagManager).investingStates(gapComposer);
        VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) this.tabContentPresenterFactory;
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        PromotedAppletTileViewModel models = verifyCheckDialogPresenter.models((MutableSharedFlow) rememberedValue, gapComposer);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealStocksAppletTileRepository) this.store).stocksActivity;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        RealStocksAppletTileRepository.StocksModel stocksModel = (RealStocksAppletTileRepository.StocksModel) Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1).getValue();
        if (stocksModel instanceof RealStocksAppletTileRepository$StocksModel$Installed$LoadingPriceMovement) {
            uninstalled = new StocksAppletTileModel.Installed.LoadingPriceMovement(str);
        } else {
            if (stocksModel instanceof RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement) {
                RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement = (RealStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement) stocksModel;
                long j = realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.balanceAmountCents;
                if (j > 0) {
                    graphError = new StocksAppletTileModel.Installed.LoadedPriceMovement.WithPriceMovement(androidStringManager.get(R.string.applets_pres_investing), moneyFormatter.format(new Money(Long.valueOf(j), (CurrencyCode) null, 6)), j, realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.percentText, realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.todayText, realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.changeDirection, realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.graph);
                } else {
                    String str2 = androidStringManager.get(R.string.applets_pres_investing);
                    String format2 = moneyFormatter.format(new Money(Long.valueOf(j), (CurrencyCode) null, 6));
                    String str3 = realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.percentText;
                    String str4 = realStocksAppletTileRepository$StocksModel$Installed$LoadedPriceMovement.todayText;
                    StocksAppletTileModel.Installed.ChangeDirection changeDirection = StocksAppletTileModel.Installed.ChangeDirection.UP;
                    zzd zzdVar = Icons.Companion;
                    graphError = new StocksAppletTileModel.Installed.LoadedPriceMovement.ZeroBalance(str2, format2, str3, str4, j);
                }
            } else if (stocksModel instanceof RealStocksAppletTileRepository.StocksModel.Uninstalled) {
                String str5 = androidStringManager.get(R.string.applets_pres_investing_null_state_footer);
                zzd zzdVar2 = Icons.Companion;
                uninstalled = new StocksAppletTileModel.Uninstalled(str, str5, models);
            } else {
                if (!(stocksModel instanceof RealStocksAppletTileRepository$StocksModel$Installed$GraphError)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RealStocksAppletTileRepository$StocksModel$Installed$GraphError realStocksAppletTileRepository$StocksModel$Installed$GraphError = (RealStocksAppletTileRepository$StocksModel$Installed$GraphError) stocksModel;
                graphError = new StocksAppletTileModel.Installed.GraphError((String) obj, realStocksAppletTileRepository$StocksModel$Installed$GraphError.balanceAmountCents, androidStringManager.get(R.string.investing_graph_failure_message), moneyFormatter.format(new Money(Long.valueOf(realStocksAppletTileRepository$StocksModel$Installed$GraphError.balanceAmountCents), (CurrencyCode) null, 6)));
            }
            uninstalled = graphError;
        }
        Updater.LaunchedEffect(gapComposer, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, 27));
        gapComposer.end(false);
        return uninstalled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$investing$presenters$activity$InvestingActivityHistoryPresenter(Flow flow, Composer composer, int i) {
        CoroutineContext coroutineContext = (CoroutineContext) this.neighborhoodsTabContentEnabled$delegate;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) this.store;
        Object obj = this.embeddedMapEnabled$delegate;
        InvestingScreens.InvestingActivityHistoryScreen investingActivityHistoryScreen = (InvestingScreens.InvestingActivityHistoryScreen) obj;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1626157563);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            RewardSlotQueries rewardSlotQueries = cashAccountDatabaseImpl.customerQueries;
            String str = investingActivityHistoryScreen.investmentEntityToken.value;
            rewardSlotQueries.getClass();
            Object realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new CustomerQueries$ForIdQuery(rewardSlotQueries, str, new ContactQueries$$ExternalSyntheticLambda1(10), (byte) 0)), coroutineContext), 16);
            gapComposer.updateRememberedValue(realCustomerStore$getCustomerForId$$inlined$map$1);
            rememberedValue = realCustomerStore$getCustomerForId$$inlined$map$1;
        }
        Result.Loading loading = Result.Loading.INSTANCE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, loading, null, gapComposer, 48, 2);
        boolean areEqual = Intrinsics.areEqual((com.squareup.cash.investing.presenters.activity.Result) collectAsState.getValue(), loading);
        Object obj3 = InvestingActivityHistoryViewModel.Loading.INSTANCE;
        if (areEqual) {
            gapComposer.end(false);
            return obj3;
        }
        Object nullableValue = ((com.squareup.cash.investing.presenters.activity.Result) collectAsState.getValue()).nullableValue();
        Continuation continuation = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (nullableValue == null) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Customer token not found for investment entity token: ", investingActivityHistoryScreen.investmentEntityToken.value));
            return null;
        }
        String str2 = (String) nullableValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = DBUtil.mapToOneNotNull(DBUtil.toFlow(cashAccountDatabaseImpl.investmentEntityQueries.forToken(investingActivityHistoryScreen.investmentEntityToken.value)), coroutineContext);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object obj4 = (Investment_entity) collectAsState2.getValue();
        if (obj4 == null) {
            gapComposer.startReplaceGroup(-1922685336);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1922685335);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(obj4);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj2) {
                rememberedValue3 = new CheckStatusPresenter.AnonymousClass1.C00611(this, obj4, objArr == true ? 1 : 0, 29);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            gapComposer.end(false);
        }
        boolean changed = gapComposer.changed(str2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == obj2) {
            rememberedValue4 = ((RealActivityEmbeddedPresenter$Factory$Impl) this.featureFlagManager).create((BetterNavigator.ScreenNavigator) this.navigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountToken((SessionManager) this.syncer), (String) (objArr2 == true ? 1 : 0), 12), ActivityScope.MY_ACTIVITY, InvestingStockDetailsActivityRequestHandler$Factory$Impl.create$default((InvestingStockDetailsActivityRequestHandler$Factory$Impl) this.tabContentPresenterFactory, str2), 8), RealActivitiesCacheManager.take$default((RealActivitiesCacheManager) this.clearMarketingBadgesIfNeeded, investingActivityHistoryScreen.investmentEntityToken), (InvestingScreens.InvestingActivityHistoryScreen) obj, false, null, null, null, null, null, 16376));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        UiCallbackModel models = ((RealActivityEmbeddedPresenter) rememberedValue4).models(gapComposer, 0);
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 14));
        Investment_entity investment_entity = (Investment_entity) collectAsState2.getValue();
        if (investment_entity != null) {
            obj3 = new InvestingActivityHistoryViewModel.Content(models, investment_entity.display_name);
        }
        gapComposer.end(false);
        return obj3;
    }

    private final Object models$com$squareup$cash$investing$presenters$custom$order$InvestingCustomSharePricePresenter(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        AmountPickerViewModel.Ready ready;
        String str3;
        String str4;
        Flow valuePerBitcoin;
        InvestingScreens.CustomSharePriceScreen customSharePriceScreen = (InvestingScreens.CustomSharePriceScreen) this.tabContentPresenterFactory;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(193592371);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = FlowKt.distinctUntilChanged(((RealProfileManager) this.clearMarketingBadgesIfNeeded).currencyCode());
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            InvestingScreens.OrderTypeSelectionScreen.Type type2 = customSharePriceScreen.f1158type;
            if (type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
                valuePerBitcoin = new InviteContactsPresenter$filterContacts$$inlined$map$1(((RealInvestmentEntities) this.syncer).stockDetails(((InvestingScreens.OrderTypeSelectionScreen.Type.Equity) type2).entityToken), 8);
            } else {
                if (!(type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                valuePerBitcoin = ((RealCryptoValueRepo) this.store).valuePerBitcoin(null);
            }
            rememberedValue2 = FlowKt.distinctUntilChanged(valuePerBitcoin);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        if (((Money) collectAsState2.getValue()) == null || ((CurrencyCode) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return AmountPickerViewModel.InitialLoading.INSTANCE;
        }
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(new AmountPickerViewEvent$Full$MoneyChanged(new Money((Long) 0L, (CurrencyCode) collectAsState.getValue(), 4)));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        if (((AmountPickerViewEvent$Full$MoneySubmitted) mutableState2.getValue()) != null) {
            gapComposer.startReplaceGroup(-829861513);
            Money money = (Money) collectAsState2.getValue();
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState2);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == obj) {
                rememberedValue5 = new InvestingCustomSharePricePresenter$models$1$1(this, mutableState2, collectAsState2, null);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer, money, (Function2) rememberedValue5);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-828516113);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, mutableState, mutableState2, 14));
        Long l = ((AmountPickerViewEvent$Full$MoneyChanged) mutableState.getValue()).amount.amount;
        l.getClass();
        long longValue = l.longValue();
        Money money2 = (Money) collectAsState2.getValue();
        money2.getClass();
        CurrencyCode currencyCode = (CurrencyCode) collectAsState.getValue();
        currencyCode.getClass();
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.embeddedMapEnabled$delegate;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.featureFlagManager;
        Resources resources = androidStringManager.resources;
        Long l2 = money2.amount;
        l2.getClass();
        long longValue2 = l2.longValue();
        BigDecimal movement = UuidKt.movement(true, longValue, longValue2);
        String str5 = longValue > longValue2 ? Marker.ANY_NON_NULL_MARKER : "-";
        InvestingScreens.OrderTypeSelectionScreen.Type type3 = customSharePriceScreen.f1158type;
        if (type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity) {
            if (longValue == 0) {
                str4 = null;
            } else {
                if (longValue != longValue2) {
                    BigDecimal abs = movement.abs();
                    abs.getClass();
                    Object[] objArr = {Recorder$$ExternalSyntheticOutline2.m(str5, BigDecimalsKt.toPrettyString(abs, false), "%")};
                    resources.getClass();
                    str3 = new MessageFormat(resources.getString(R.string.custom_share_price_caption)).format(objArr);
                    str3.getClass();
                } else {
                    str3 = androidStringManager.get(R.string.current_price_equity);
                }
                str4 = str3;
            }
            String format2 = moneyFormatter.format(money2);
            format2.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.custom_share_price_subtitle)).format(new Object[]{format2});
            format3.getClass();
            ready = new AmountPickerViewModel.Ready(androidStringManager.get(R.string.custom_share_price_title), format3, androidStringManager.get(R.string.next), new AmountPickerViewModel.Ready.Amount.MoneyAmount(new Money((Long) 100L, currencyCode, 4)), null, false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), str4, null, false, false, null, null, 15984);
        } else {
            if (!(type3 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (longValue == 0) {
                str2 = null;
            } else {
                if (longValue != longValue2) {
                    BigDecimal abs2 = movement.abs();
                    abs2.getClass();
                    Object[] objArr2 = {Recorder$$ExternalSyntheticOutline2.m(str5, BigDecimalsKt.toPrettyString(abs2, false), "%")};
                    resources.getClass();
                    str = new MessageFormat(resources.getString(R.string.custom_bitcoin_price_caption)).format(objArr2);
                    str.getClass();
                } else {
                    str = androidStringManager.get(R.string.current_price_btc);
                }
                str2 = str;
            }
            String format4 = moneyFormatter.format(money2);
            format4.getClass();
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.custom_bitcoin_price_subtitle)).format(new Object[]{format4});
            format5.getClass();
            ready = new AmountPickerViewModel.Ready(androidStringManager.get(R.string.custom_bitcoin_price_title), format5, androidStringManager.get(R.string.next), new AmountPickerViewModel.Ready.Amount.MoneyAmount(new Money((Long) 100L, currencyCode, 4)), new AmountPickerViewModel.Ready.Amount.MoneyAmount(new Money((Long) 99999999L, currencyCode, 4)), false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), str2, null, false, false, null, null, 15968);
        }
        gapComposer.end(false);
        return ready;
    }

    private final Object models$com$squareup$cash$money$presenters$HypeWelcomePresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1953582566);
        HypeWelcomeScreen hypeWelcomeScreen = (HypeWelcomeScreen) this.tabContentPresenterFactory;
        String format2 = LocalDate.parse(hypeWelcomeScreen.launchDateString).format((DateTimeFormatter) this.neighborhoodsTabContentEnabled$delegate);
        format2.getClass();
        String upperCase = format2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Trace.valuesState((FeatureFlagManager) this.featureFlagManager, JsonFeatureFlags$MintHypeDrop.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        String str = hypeWelcomeScreen.notifyDeviceId;
        boolean areEqual = Intrinsics.areEqual(((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState.getValue()).value).notifiedEnabled, Boolean.TRUE);
        boolean changed = gapComposer.changed(str);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            PdpNotifiedPreference pdpNotifiedPreference = (PdpNotifiedPreference) this.store;
            str.getClass();
            rememberedValue2 = ((KeyValue) pdpNotifiedPreference.keyValueFactory.invoke(str)).observe();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Boolean bool = Boolean.FALSE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, bool, null, gapComposer, 48, 2);
        Boolean bool2 = (Boolean) collectAsState2.getValue();
        bool2.getClass();
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(bool2, gapComposer);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((FeatureFlag$JsonFeatureFlag.Options) collectAsState.getValue(), gapComposer);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(bool);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, str, rememberUpdatedState2, rememberUpdatedState, mutableState, 12));
        HypeWelcomeModel hypeWelcomeModel = new HypeWelcomeModel(upperCase, hypeWelcomeScreen.symbol, ((Boolean) mutableState.getValue()).booleanValue(), !areEqual ? HypeWelcomeModel.NotifyButtonState.Hidden : (!((Boolean) collectAsState2.getValue()).booleanValue() || Intrinsics.areEqual(((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState.getValue()).value).oneTimeClick, bool)) ? HypeWelcomeModel.NotifyButtonState.Enabled : HypeWelcomeModel.NotifyButtonState.Disabled, ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState.getValue()).value).notifyText);
        gapComposer.end(false);
        return hypeWelcomeModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$offers$presenters$OffersHomePresenterV2(Flow flow, Composer composer, int i) {
        String str;
        boolean z;
        OffersHomeViewModelV2.Loaded.OffersSection offersSection;
        Object loaded;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.syncer;
        RealBoostRepository realBoostRepository = (RealBoostRepository) this.store;
        RealBoostProvider realBoostProvider = realBoostRepository.boostProvider;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-8276716);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new InviteErrorPresenter$models$1$1(this, objArr == true ? 1 : 0, 10);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = realBoostProvider.getCategorizedBoosts();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, emptyMap, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = realBoostRepository.getSelectedBoostTokens();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        EmptySet emptySet = EmptySet.INSTANCE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, emptySet, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(realBoostProvider.getBoostSlots(true), 15);
            gapComposer.updateRememberedValue(cardModelView$iconTexture$$inlined$map$1);
            rememberedValue4 = cardModelView$iconTexture$$inlined$map$1;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, emptySet, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        byte b = 0;
        if (rememberedValue5 == neverEqualPolicy) {
            LocalTabContentQueries localTabContentQueries = realBoostProvider.userRewardsDataQueries;
            localTabContentQueries.getClass();
            UserRewardsDataQueries$userRewardsData$2 userRewardsDataQueries$userRewardsData$2 = UserRewardsDataQueries$userRewardsData$2.INSTANCE;
            SqlDriver sqlDriver = localTabContentQueries.driver;
            RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda0 = new RewardSlotQueries$$ExternalSyntheticLambda0(localTabContentQueries, b);
            sqlDriver.getClass();
            int i2 = 4;
            rememberedValue5 = FlowKt.distinctUntilChanged(new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(i2, DBUtil.toFlow(new SimpleQuery(2053243793, new String[]{"userRewardsData"}, sqlDriver, "UserRewardsData.sq", "userRewardsData", "SELECT userRewardsData.new_to_boost, userRewardsData.has_recently_used_boost, userRewardsData.ytd_total_saving\nFROM userRewardsData", rewardSlotQueries$$ExternalSyntheticLambda0)), realBoostProvider.ioDispatcher), i2));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = Updater.derivedStateOf(new CardAppletTileKt$$ExternalSyntheticLambda1(collectAsState4, 2));
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        State state = (State) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = ((RealOffersInflightStateManager) this.tabContentPresenterFactory).inflightOffers;
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue7, emptySet, null, gapComposer, 48, 2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new MusicPresenter$models$3$1(this, objArr2 == true ? 1 : 0, 9);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue8);
        Updater.LaunchedEffect(gapComposer, flow, new RealMRIFactory$sign$2(flow, (Continuation) (objArr3 == true ? 1 : 0), (MoleculePresenter) this, 12));
        if (((Map) collectAsState.getValue()).isEmpty() && ((Money) collectAsState4.getValue()) == null) {
            loaded = OffersHomeViewModelV2.Loading.INSTANCE;
            z = false;
        } else {
            String str2 = androidStringManager.get(R.string.offers_home_title);
            if (((Boolean) state.getValue()).booleanValue()) {
                MoneyFormatter moneyFormatter = (MoneyFormatter) this.neighborhoodsTabContentEnabled$delegate;
                Money money = (Money) collectAsState4.getValue();
                money.getClass();
                str = moneyFormatter.format(money);
            } else {
                str = null;
            }
            OffersHomeViewModelV2.Loaded.HeaderSection headerSection = new OffersHomeViewModelV2.Loaded.HeaderSection(str2, str, ((Boolean) state.getValue()).booleanValue() ? androidStringManager.get(R.string.offers_home_savings_body) : null);
            Map map = (Map) collectAsState.getValue();
            BoostCategory boostCategory = BoostCategory.CUSTOM;
            List list = (List) map.get(boostCategory);
            if (list != null) {
                z = false;
                offersSection = mapToOffersSection(list, boostCategory, (Set) collectAsState2.getValue(), (Set) collectAsState3.getValue(), (Set) collectAsState5.getValue());
            } else {
                z = false;
                offersSection = null;
            }
            Map map2 = (Map) collectAsState.getValue();
            BoostCategory boostCategory2 = BoostCategory.CAP;
            List list2 = (List) map2.get(boostCategory2);
            OffersHomeViewModelV2.Loaded.OffersSection mapToOffersSection = list2 != null ? mapToOffersSection(list2, boostCategory2, (Set) collectAsState2.getValue(), (Set) collectAsState3.getValue(), (Set) collectAsState5.getValue()) : null;
            Map map3 = (Map) collectAsState.getValue();
            BoostCategory boostCategory3 = BoostCategory.REGULAR;
            List list3 = (List) map3.get(boostCategory3);
            loaded = new OffersHomeViewModelV2.Loaded(headerSection, ArraysKt___ArraysKt.filterNotNull(new OffersHomeViewModelV2.Loaded.OffersSection[]{offersSection, mapToOffersSection, list3 != null ? mapToOffersSection(list3, boostCategory3, (Set) collectAsState2.getValue(), (Set) collectAsState3.getValue(), (Set) collectAsState5.getValue()) : null}));
        }
        gapComposer.end(z);
        return loaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$paychecks$presenters$DistributePaycheckPresenter(Flow flow, Composer composer, int i) {
        Throwable th;
        boolean z;
        Iterator it;
        String format2;
        int i2;
        Object obj;
        AndroidStringManager androidStringManager;
        DestinationAllocationRowViewModel$Icon$Color destinationAllocationRowViewModel$Icon$Color;
        String format3;
        List list;
        Lazy lazy = (Lazy) this.neighborhoodsTabContentEnabled$delegate;
        SyncValueReader syncValueReader = (SyncValueReader) this.syncer;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(254428511);
        Object rememberedValue = gapComposer.rememberedValue();
        Throwable th2 = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksUiConfiguration, null, new UtilsKt$$ExternalSyntheticLambda0(this, 3));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue, gapComposer);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksAllocationDistribution, null, new MusicViewKt$$ExternalSyntheticLambda6(26, this, receiveValueAsState));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) rememberedValue2, gapComposer);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        ref$ObjectRef.element = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) ref$ObjectRef, (State) receiveValueAsState, (Object) receiveValueAsState2, 23));
        if (((PaychecksUiConfiguration) receiveValueAsState.getValue()) == null || ((Boolean) ((MutableState) ref$ObjectRef.element).getValue()).booleanValue()) {
            gapComposer.end(false);
            return DistributePaycheckViewModel.Loading.INSTANCE;
        }
        PaychecksUiConfiguration paychecksUiConfiguration = (PaychecksUiConfiguration) receiveValueAsState.getValue();
        paychecksUiConfiguration.getClass();
        PaychecksUiConfiguration.PaychecksDistributionSummaryUi paychecksDistributionSummaryUi = paychecksUiConfiguration.distributionSummary;
        PaycheckAllocationDistribution paycheckAllocationDistribution = (PaycheckAllocationDistribution) receiveValueAsState2.getValue();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) this.featureFlagManager;
        Resources resources = androidStringManager2.resources;
        ArrayList arrayList = paychecksUiConfiguration.destinationUiConfigs;
        String str = paychecksDistributionSummaryUi.title;
        if (str == null) {
            str = androidStringManager2.get(R.string.distribute_paycheck_title_fallback);
        }
        String str2 = paychecksDistributionSummaryUi.doneButtonTitle;
        if (str2 == null) {
            str2 = androidStringManager2.get(R.string.distribute_paycheck_done_button_fallback);
        }
        TimeZone timeZone = com.squareup.cash.paychecks.presenters.util.UtilsKt.paycheckTimeZone;
        if ((paycheckAllocationDistribution == null || (list = paycheckAllocationDistribution.allocations) == null) ? false : !list.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Throwable th3 = th2;
                AllocationDestination allocationDestination = ((PaychecksUiConfiguration.PaychecksDestinationUi) it2.next()).destination;
                arrayList2.add(new PaycheckAllocationDistribution.DestinationAndShare(allocationDestination, allocationDestination.equals(AllocationDestination.CashBalanceDestination.INSTANCE) ? 10000L : 0L));
                th2 = th3;
            }
            th = th2;
            paycheckAllocationDistribution = new PaycheckAllocationDistribution(arrayList2);
        }
        ArrayList wheelAllocations = UtilsKt.toWheelAllocations(paycheckAllocationDistribution, paychecksUiConfiguration);
        List list2 = paycheckAllocationDistribution.allocations;
        PaycheckAllocationDistribution.DestinationAndShare highestAllocation = UtilsKt.getHighestAllocation(paycheckAllocationDistribution);
        NumberFormat numberFormat = (NumberFormat) lazy.getValue();
        numberFormat.getClass();
        DistributionWheelViewModel distributionWheelViewModel = new DistributionWheelViewModel(wheelAllocations, new DistributionWheelViewModel.Content.DistributePaycheckScreen(UtilsKt.percentageString(highestAllocation, numberFormat)), 30);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            PaychecksUiConfiguration.PaychecksDestinationUi paychecksDestinationUi = (PaychecksUiConfiguration.PaychecksDestinationUi) obj2;
            List list3 = list2;
            PaycheckAllocationDistribution paycheckAllocationDistribution2 = paycheckAllocationDistribution;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    if (((PaycheckAllocationDistribution.DestinationAndShare) it3.next()).destination.getClass() == paychecksDestinationUi.destination.getClass()) {
                        break;
                    }
                    it3 = it4;
                }
            }
            arrayList3.add(obj2);
            paycheckAllocationDistribution = paycheckAllocationDistribution2;
        }
        PaycheckAllocationDistribution paycheckAllocationDistribution3 = paycheckAllocationDistribution;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            arrayList4.add(new PaycheckAllocationDistribution.DestinationAndShare(((PaychecksUiConfiguration.PaychecksDestinationUi) it5.next()).destination, 0L));
        }
        List sortAllocations = PaycheckAllocationDistributionMappersKt.sortAllocations(list2);
        List productTintWheelPalette = UtilsKt.productTintWheelPalette(paychecksUiConfiguration, sortAllocations, new HelpSheetViewKt$$ExternalSyntheticLambda4(6));
        List list4 = sortAllocations;
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        int i3 = 0;
        for (Iterator it6 = list4.iterator(); it6.hasNext(); it6 = it6) {
            Object next = it6.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw th;
            }
            arrayList5.add(new Pair(((PaycheckAllocationDistribution.DestinationAndShare) next).destination, CollectionsKt.getOrNull(i3, productTintWheelPalette)));
            i3 = i4;
        }
        Map map = MapsKt__MapsKt.toMap(arrayList5);
        List sortAllocations2 = PaycheckAllocationDistributionMappersKt.sortAllocations(CollectionsKt.plus((Iterable) arrayList4, (Collection) list2));
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortAllocations2, 10));
        Iterator it7 = sortAllocations2.iterator();
        while (it7.hasNext()) {
            AllocationDestination allocationDestination2 = ((PaycheckAllocationDistribution.DestinationAndShare) it7.next()).destination;
            float f = r11.shareInBasisPoints / 10000.0f;
            PaychecksUiConfiguration.PaychecksDestinationUi.DestinationUiConfiguration configForDestination = UtilsKt.getConfigForDestination(paychecksUiConfiguration, allocationDestination2);
            String str3 = configForDestination.name;
            PaychecksUiConfiguration paychecksUiConfiguration2 = paychecksUiConfiguration;
            boolean areEqual = Intrinsics.areEqual(UtilsKt.getHighestAllocation(paycheckAllocationDistribution3).destination, allocationDestination2);
            Color color = (Color) map.get(allocationDestination2);
            boolean z2 = allocationDestination2 instanceof AllocationDestination.CashBalanceDestination;
            if (z2 || f != RecyclerView.DECELERATION_RATE) {
                z = z2;
                it = it7;
                format2 = ((NumberFormat) lazy.getValue()).format(Float.valueOf(f));
                format2.getClass();
            } else {
                z = z2;
                format2 = androidStringManager2.get(R.string.distribute_paycheck_add_button);
                it = it7;
            }
            int i5 = (f > RecyclerView.DECELERATION_RATE ? 1 : (f == RecyclerView.DECELERATION_RATE ? 0 : -1));
            if (i5 > 0) {
                Color color2 = color == null ? configForDestination.tint : color;
                i2 = i5;
                obj = new DestinationAllocationRowViewModel$Icon$Color(color2);
            } else {
                i2 = i5;
                obj = th;
            }
            DestinationAllocationRowViewModel.TextColor textColor = areEqual ? DestinationAllocationRowViewModel.TextColor.PROMINENT : f == RecyclerView.DECELERATION_RATE ? DestinationAllocationRowViewModel.TextColor.SUBTLE : DestinationAllocationRowViewModel.TextColor.STANDARD;
            DestinationAllocationRowViewModel$TitleBadge$Lock destinationAllocationRowViewModel$TitleBadge$Lock = z ? DestinationAllocationRowViewModel$TitleBadge$Lock.INSTANCE : th;
            DestinationAllocationRowViewEvent viewInfoEvent = z ? new DestinationAllocationRowViewEvent.ViewInfoEvent(allocationDestination2) : new DestinationAllocationRowViewEvent.ViewAllocationEvent(allocationDestination2);
            DestinationAllocationRowViewModel.Accessory accessory = new DestinationAllocationRowViewModel.Accessory(format2, (z || f == RecyclerView.DECELERATION_RATE) ? DestinationAllocationRowViewModel.TextColor.SUBTLE : DestinationAllocationRowViewModel.TextColor.STANDARD);
            String m = Recorder$$ExternalSyntheticOutline2.m(str3, ": ", format2);
            if (z) {
                format3 = androidStringManager2.get(R.string.distribute_paycheck_destination_allocation_row_info_accessibility_action);
                androidStringManager = androidStringManager2;
                destinationAllocationRowViewModel$Icon$Color = obj;
            } else if (i2 > 0) {
                androidStringManager = androidStringManager2;
                destinationAllocationRowViewModel$Icon$Color = obj;
                ArrayMap arrayMap = new ArrayMap(1);
                arrayMap.put("destination", str3);
                resources.getClass();
                format3 = new MessageFormat(resources.getString(R.string.distribute_paycheck_destination_allocation_row_info_accessibility_edit_action)).format(arrayMap);
                format3.getClass();
            } else {
                androidStringManager = androidStringManager2;
                destinationAllocationRowViewModel$Icon$Color = obj;
                ArrayMap arrayMap2 = new ArrayMap(1);
                arrayMap2.put("destination", str3);
                resources.getClass();
                format3 = new MessageFormat(resources.getString(R.string.distribute_paycheck_destination_allocation_row_info_accessibility_add_action)).format(arrayMap2);
                format3.getClass();
            }
            arrayList6.add(new DestinationAllocationRowViewModel(destinationAllocationRowViewModel$Icon$Color, str3, textColor, destinationAllocationRowViewModel$TitleBadge$Lock, accessory, viewInfoEvent, new DestinationAllocationRowViewModel.AccessibilityContent(m, format3)));
            paychecksUiConfiguration = paychecksUiConfiguration2;
            androidStringManager2 = androidStringManager;
            it7 = it;
        }
        DistributePaycheckViewModel.Loaded loaded = new DistributePaycheckViewModel.Loaded(str, str2, distributionWheelViewModel, arrayList6);
        gapComposer.end(false);
        return loaded;
    }

    private final Object models$com$squareup$cash$paychecks$presenters$PaycheckAggregationReceiptPresenter(Flow flow, Composer composer, int i) {
        PaycheckIconModel paycheckIconModel;
        List list;
        int i2;
        ArrayList arrayList;
        Image image;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.embeddedMapEnabled$delegate;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.clearMarketingBadgesIfNeeded;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2032854515);
        Updater.LaunchedEffect(gapComposer, flow, new MainPaymentPresenter$models$4$4(flow, (Continuation) null, this, 1));
        Object rememberedValue = gapComposer.rememberedValue();
        int i3 = 5;
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = ((SyncValueReader) this.syncer).getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksUiConfiguration, null, new UtilsKt$$ExternalSyntheticLambda0(this, i3));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue, gapComposer);
        PaychecksUiState.CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = ((PaycheckAggregationReceiptScreen) this.featureFlagManager).aggregation;
        PaychecksUiConfiguration paychecksUiConfiguration = (PaychecksUiConfiguration) receiveValueAsState.getValue();
        paychecksUiConfiguration.getClass();
        PaychecksUiState.TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = calendarMonthPaychecksAggregation.aggregation;
        ArrayList arrayList2 = timeBoundedPaychecksAggregation.deductions;
        ArrayList<PaychecksUiState.RealizedAllocationAmount> arrayList3 = timeBoundedPaychecksAggregation.realizedAllocationAmounts;
        List allocations = com.squareup.cash.paychecks.presenters.util.UtilsKt.toAllocations(arrayList2, UtilsKt.getTotalAmount(timeBoundedPaychecksAggregation).amount);
        ArrayList arrayList4 = timeBoundedPaychecksAggregation.employers;
        List wheelAllocations = UtilsKt.toWheelAllocations(arrayList3, UtilsKt.getTotalAmount(timeBoundedPaychecksAggregation).amount, paychecksUiConfiguration);
        String format2 = moneyFormatter.format(UtilsKt.getTotalAmount(timeBoundedPaychecksAggregation));
        YearMonth of = YearMonth.of((int) calendarMonthPaychecksAggregation.year, (int) calendarMonthPaychecksAggregation.monthInYear);
        of.getClass();
        AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) this.store;
        TimeZone timeZone = com.squareup.cash.paychecks.presenters.util.UtilsKt.paycheckTimeZone;
        timeZone.getClass();
        String format3 = of.format(androidDateFormatManager.getDateFormat("MMMM yyyy", timeZone).formatter);
        format3.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format4 = new MessageFormat(resources.getString(R.string.paycheck_monthly_aggregation_description)).format(new Object[]{format3});
        format4.getClass();
        ArrayList plus = CollectionsKt.plus((Iterable) wheelAllocations, (Collection) allocations);
        ScannerView.AnonymousClass3 anonymousClass3 = new ScannerView.AnonymousClass3(1, androidStringManager, AndroidStringManager.class, "getString", "getString(Lapp/cash/paraphrase/FormattedResource;)Ljava/lang/String;", 0, 2);
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            paycheckIconModel = PaycheckIconModel.Unknown.INSTANCE;
            if (!hasNext) {
                break;
            }
            PaychecksUiState.Employer.EmployerUiConfiguration employerUiConfiguration = ((PaychecksUiState.Employer) it.next()).uiConfiguration;
            if (employerUiConfiguration != null && (image = employerUiConfiguration.avatar) != null) {
                paycheckIconModel = new PaycheckIconModel.Avatar(image);
            }
            arrayList5.add(paycheckIconModel);
        }
        List list2 = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList5));
        if (list2 == null || (list = CollectionsKt.sortedWith(list2, new b.C0008b(28))) == null) {
            list = EmptyList.INSTANCE;
        }
        if (list.size() > 6) {
            i2 = arrayList4.size() - 5;
            list = list.subList(0, 5);
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            arrayList = CollectionsKt.plus((Collection) list, (Object) new PaycheckIconModel.Overflow((String) anonymousClass3.invoke(new FormattedResource(R.string.paychecks_overflow_icon_label, NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i2), "additionalPaychecks")))));
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Intrinsics.areEqual((PaycheckIconModel) obj, paycheckIconModel);
                arrayList.add(obj);
            }
        }
        DistributionWheelViewModel distributionWheelViewModel = new DistributionWheelViewModel(plus, new DistributionWheelViewModel.Content.ReceiptScreen(format2, format4, arrayList), 30);
        ArrayList arrayList6 = timeBoundedPaychecksAggregation.deductions;
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(com.squareup.cash.paychecks.presenters.util.UtilsKt.receiptRow((PaychecksUiState.Deduction) it2.next(), moneyFormatter, androidStringManager));
        }
        PaychecksReceiptViewModel.Section section = new PaychecksReceiptViewModel.Section(arrayList7);
        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        for (PaychecksUiState.RealizedAllocationAmount realizedAllocationAmount : arrayList3) {
            PaychecksUiConfiguration paychecksUiConfiguration2 = (PaychecksUiConfiguration) receiveValueAsState.getValue();
            paychecksUiConfiguration2.getClass();
            arrayList8.add(com.squareup.cash.paychecks.presenters.util.UtilsKt.receiptRow(realizedAllocationAmount, paychecksUiConfiguration2, moneyFormatter, androidStringManager));
        }
        PaychecksReceiptViewModel paychecksReceiptViewModel = new PaychecksReceiptViewModel(distributionWheelViewModel, CollectionsKt__CollectionsKt.listOf((Object[]) new PaychecksReceiptViewModel.Section[]{section, new PaychecksReceiptViewModel.Section(arrayList8)}), androidStringManager.get(R.string.receipt_back_button_text));
        gapComposer.end(false);
        return paychecksReceiptViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.squareup.cash.paychecks.viewmodels.PaycheckIconModel$Avatar] */
    private final Object models$com$squareup$cash$paychecks$presenters$PaycheckReceiptPresenter(Flow flow, Composer composer, int i) {
        PaychecksUiState.Employer.EmployerUiConfiguration employerUiConfiguration;
        Image image;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.store;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.embeddedMapEnabled$delegate;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-927681443);
        Continuation continuation = null;
        continuation = null;
        continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new MainPaymentPresenter$models$4$4(flow, continuation, this, 3));
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = ((SyncValueReader) this.syncer).getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksUiConfiguration, null, new UtilsKt$$ExternalSyntheticLambda0(this, 6));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue, gapComposer);
        PaychecksUiState.Paycheck paycheck = WindowInfoImpl.Companion.toPaycheck(this, ((PaycheckReceiptScreen) this.featureFlagManager).paycheck);
        ArrayList<PaychecksUiState.RealizedAllocationAmount> arrayList = paycheck.realizedAllocationAmounts;
        ArrayList arrayList2 = paycheck.deductions;
        PaychecksUiConfiguration paychecksUiConfiguration = (PaychecksUiConfiguration) receiveValueAsState.getValue();
        paychecksUiConfiguration.getClass();
        Money realizedAmount = com.squareup.cash.paychecks.presenters.util.UtilsKt.realizedAmount(paycheck);
        ArrayList plus = CollectionsKt.plus((Iterable) UtilsKt.toWheelAllocations(arrayList, realizedAmount.amount, paychecksUiConfiguration), (Collection) com.squareup.cash.paychecks.presenters.util.UtilsKt.toAllocations(arrayList2, realizedAmount.amount));
        String format2 = moneyFormatter.format(realizedAmount);
        String format3 = ((RealPaycheckSettlementDateFormatter) this.clearMarketingBadgesIfNeeded).format(paycheck.settlementDate);
        PaychecksUiState.Employer employer = paycheck.employer;
        if (employer != null && (employerUiConfiguration = employer.uiConfiguration) != null && (image = employerUiConfiguration.avatar) != null) {
            continuation = new PaycheckIconModel.Avatar(image);
        }
        format2.getClass();
        format3.getClass();
        DistributionWheelViewModel distributionWheelViewModel = new DistributionWheelViewModel(plus, new DistributionWheelViewModel.Content.ReceiptScreen(format2, format3, CollectionsKt__CollectionsKt.listOfNotNull(continuation)), 30);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(com.squareup.cash.paychecks.presenters.util.UtilsKt.receiptRow((PaychecksUiState.Deduction) it.next(), moneyFormatter, androidStringManager));
        }
        PaychecksReceiptViewModel.Section section = new PaychecksReceiptViewModel.Section(arrayList3);
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (PaychecksUiState.RealizedAllocationAmount realizedAllocationAmount : arrayList) {
            PaychecksUiConfiguration paychecksUiConfiguration2 = (PaychecksUiConfiguration) receiveValueAsState.getValue();
            paychecksUiConfiguration2.getClass();
            arrayList4.add(com.squareup.cash.paychecks.presenters.util.UtilsKt.receiptRow(realizedAllocationAmount, paychecksUiConfiguration2, moneyFormatter, androidStringManager));
        }
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PaychecksReceiptViewModel.Section[]{section, new PaychecksReceiptViewModel.Section(arrayList4)});
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : listOf) {
            if (!((PaychecksReceiptViewModel.Section) obj).rows.isEmpty()) {
                arrayList5.add(obj);
            }
        }
        PaychecksReceiptViewModel paychecksReceiptViewModel = new PaychecksReceiptViewModel(distributionWheelViewModel, arrayList5, androidStringManager.get(R.string.receipt_back_button_text));
        gapComposer.end(false);
        return paychecksReceiptViewModel;
    }

    private final Object models$com$squareup$cash$profile$presenters$personalizedads$RealPersonalizedAdsSettingsPresenter(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        C4bEligibilityState c4bEligibilityState;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2099655572);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState3 = (MutableState) rememberedValue2;
        String activeAccountToken = PlatformKt.activeAccountToken((SessionManager) this.store);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = DBUtil.mapToOneOrNull(DBUtil.toFlow(((CashAccountDatabaseImpl) this.syncer).singleAccountHolderEligibilityQueries.eligibility(activeAccountToken)), (CoroutineContext) this.neighborhoodsTabContentEnabled$delegate);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        SingleAccountHolderEligibility singleAccountHolderEligibility = (SingleAccountHolderEligibility) Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2).getValue();
        boolean areEqual = (singleAccountHolderEligibility == null || (c4bEligibilityState = singleAccountHolderEligibility.personalizedAdsToggle) == null) ? false : Intrinsics.areEqual(c4bEligibilityState.is_eligible, Boolean.FALSE);
        boolean z = !areEqual;
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, mutableState2, 7));
        Boolean valueOf = Boolean.valueOf(z);
        boolean changed = gapComposer.changed(z) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            mutableState = mutableState3;
            ArcadeFormDateInputView$Content$7$1 arcadeFormDateInputView$Content$7$1 = new ArcadeFormDateInputView$Content$7$1(z, this, mutableState, mutableState2, (Continuation) null, 5);
            gapComposer.updateRememberedValue(arcadeFormDateInputView$Content$7$1);
            rememberedValue4 = arcadeFormDateInputView$Content$7$1;
        } else {
            mutableState = mutableState3;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
        RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings = (RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings) mutableState2.getValue();
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        Object obj = ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.None.INSTANCE;
        if (!booleanValue) {
            if (!areEqual && realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings != null) {
                obj = new ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Eligible(realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings.description, realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings.isEnabled);
            } else if (areEqual) {
                obj = ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Ineligible.INSTANCE;
            }
        }
        gapComposer.end(false);
        return obj;
    }

    public static AfterpaySearchViewModel.BodyViewModel.NoContentViewModel noResultsViewModel(AfterpayAppletSearchResponse afterpayAppletSearchResponse) {
        String str;
        Icon icon;
        LocalizedString localizedString;
        ImageTextSection access$findNoSearchResultsImageTextSection = AfterpaySearchPresenterKt.access$findNoSearchResultsImageTextSection(afterpayAppletSearchResponse);
        String str2 = null;
        if (access$findNoSearchResultsImageTextSection == null) {
            return null;
        }
        LocalizedString localizedString2 = access$findNoSearchResultsImageTextSection.title;
        if (localizedString2 == null || (str = localizedString2.translated_value) == null) {
            str = "";
        }
        LocalizedString localizedString3 = access$findNoSearchResultsImageTextSection.subtitle;
        String str3 = localizedString3 != null ? localizedString3.translated_value : null;
        Image image = access$findNoSearchResultsImageTextSection.image;
        Button button = access$findNoSearchResultsImageTextSection.button;
        String str4 = (button == null || (localizedString = button.l_text) == null) ? null : localizedString.translated_value;
        if (button != null && (icon = button.arcade_icon) != null) {
            str2 = icon.arcade_id;
        }
        return new AfterpaySearchViewModel.BodyViewModel.NoContentViewModel(str, str3, image, str4, str2, AfterpaySearchViewEvent.NoResultsCtaButtonClicked.INSTANCE, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static AfterpayAppletUpsellCardViewModel.CallToAction.Button toCallToActionButton(Button button) {
        String str;
        ?? r3;
        List list;
        zzle zzleVar;
        LocalizedString localizedString = button.l_text;
        if (localizedString == null || (str = localizedString.translated_value) == null) {
            str = "";
        }
        ButtonProminence buttonProminence = button.button_prominence;
        if (buttonProminence == null) {
            buttonProminence = ButtonProminence.STANDARD;
        }
        TapAction tapAction = button.tap_action;
        String str2 = null;
        if (tapAction != null && (zzleVar = tapAction.action) != null) {
            TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
            UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
            if (urlTapAction != null) {
                str2 = urlTapAction.action_url;
            }
        }
        if (tapAction == null || (list = tapAction.analytics_tap_events) == null) {
            r3 = EmptyList.INSTANCE;
        } else {
            r3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = ((AnalyticsEvent) it.next()).event_name;
                if (str3 != null) {
                    r3.add(str3);
                }
            }
        }
        return new AfterpayAppletUpsellCardViewModel.CallToAction.Button(new AfterpayAppletUpsellCardViewModel.ButtonViewModel(str, buttonProminence, str2, r3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AfterpaySearchViewModel.CategoryTileViewModel toCategoryTileViewModel(CategoryTileSection.CategoryTile categoryTile) {
        CategoryTileSection.CategoryTile.IconStyle iconStyle;
        CategoryTileSection.CategoryTile.ImageStyle imageStyle;
        String str;
        zzle zzleVar;
        String str2;
        CategoryTileSection.CategoryTile.ImageStyle imageStyle2;
        String str3;
        Image image;
        zzle zzleVar2;
        UrlTapAction urlTapAction;
        String str4;
        CategoryTileSection.CategoryTile.IconStyle iconStyle2;
        String str5;
        Image image2;
        zzle zzleVar3;
        UrlTapAction urlTapAction2;
        String str6;
        String str7;
        zzkq zzkqVar = categoryTile.style;
        AnalyticsEvent analyticsEvent = categoryTile.analytics_view_event;
        TapAction tapAction = categoryTile.tap_action;
        LocalizedString localizedString = categoryTile.l_title;
        if (zzkqVar != null) {
            CategoryTileSection$CategoryTile$Style$IconStyle categoryTileSection$CategoryTile$Style$IconStyle = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle ? (CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar : null;
            if (categoryTileSection$CategoryTile$Style$IconStyle != null) {
                iconStyle = categoryTileSection$CategoryTile$Style$IconStyle.value;
                String str8 = "";
                if (iconStyle == null) {
                    if (zzkqVar != null) {
                        CategoryTileSection$CategoryTile$Style$IconStyle categoryTileSection$CategoryTile$Style$IconStyle2 = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$IconStyle ? (CategoryTileSection$CategoryTile$Style$IconStyle) zzkqVar : null;
                        if (categoryTileSection$CategoryTile$Style$IconStyle2 != null) {
                            iconStyle2 = categoryTileSection$CategoryTile$Style$IconStyle2.value;
                            iconStyle2.getClass();
                            String str9 = (localizedString != null || (str7 = localizedString.translated_value) == null) ? "" : str7;
                            if (tapAction != null && (zzleVar3 = tapAction.action) != null) {
                                TapAction$Action$UrlAction tapAction$Action$UrlAction = !(zzleVar3 instanceof TapAction$Action$UrlAction) ? (TapAction$Action$UrlAction) zzleVar3 : null;
                                urlTapAction2 = tapAction$Action$UrlAction == null ? tapAction$Action$UrlAction.value : null;
                                if (urlTapAction2 != null && (str6 = urlTapAction2.action_url) != null) {
                                    str5 = str6;
                                    String str10 = analyticsEvent == null ? analyticsEvent.event_name : null;
                                    image2 = iconStyle2.icon;
                                    if (image2 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("style?.icon_style.icon");
                                        return null;
                                    }
                                    Color color = iconStyle2.background_color;
                                    if (color == null) {
                                        color = ColorsKt.toColor("#000000");
                                    }
                                    return new AfterpaySearchViewModel.CategoryTileViewModel.CategoryIconTileViewModel(str9, str5, str10, image2, color);
                                }
                            }
                            str5 = "";
                            if (analyticsEvent == null) {
                            }
                            image2 = iconStyle2.icon;
                            if (image2 != null) {
                            }
                        }
                    }
                    iconStyle2 = null;
                    iconStyle2.getClass();
                    if (localizedString != null) {
                    }
                    if (tapAction != null) {
                        if (!(zzleVar3 instanceof TapAction$Action$UrlAction)) {
                        }
                        if (tapAction$Action$UrlAction == null) {
                        }
                        if (urlTapAction2 != null) {
                            str5 = str6;
                            if (analyticsEvent == null) {
                            }
                            image2 = iconStyle2.icon;
                            if (image2 != null) {
                            }
                        }
                    }
                    str5 = "";
                    if (analyticsEvent == null) {
                    }
                    image2 = iconStyle2.icon;
                    if (image2 != null) {
                    }
                } else {
                    if (zzkqVar != null) {
                        CategoryTileSection$CategoryTile$Style$ImageStyle categoryTileSection$CategoryTile$Style$ImageStyle = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$ImageStyle ? (CategoryTileSection$CategoryTile$Style$ImageStyle) zzkqVar : null;
                        if (categoryTileSection$CategoryTile$Style$ImageStyle != null) {
                            imageStyle = categoryTileSection$CategoryTile$Style$ImageStyle.value;
                            if (imageStyle != null) {
                                if (localizedString == null || (str = localizedString.translated_value) == null) {
                                    str = "";
                                }
                                if (tapAction != null && (zzleVar = tapAction.action) != null) {
                                    TapAction$Action$UrlAction tapAction$Action$UrlAction2 = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                                    UrlTapAction urlTapAction3 = tapAction$Action$UrlAction2 != null ? tapAction$Action$UrlAction2.value : null;
                                    if (urlTapAction3 != null && (str2 = urlTapAction3.action_url) != null) {
                                        str8 = str2;
                                    }
                                }
                                String str11 = analyticsEvent != null ? analyticsEvent.event_name : null;
                                Image image3 = categoryTile.picture;
                                if (image3 != null) {
                                    return new AfterpaySearchViewModel.CategoryTileViewModel.CategoryImageTileViewModel(image3, str, str8, str11);
                                }
                                a$$ExternalSyntheticBUOutline0.m$3("picture");
                                return null;
                            }
                            if (zzkqVar != null) {
                                CategoryTileSection$CategoryTile$Style$ImageStyle categoryTileSection$CategoryTile$Style$ImageStyle2 = zzkqVar instanceof CategoryTileSection$CategoryTile$Style$ImageStyle ? (CategoryTileSection$CategoryTile$Style$ImageStyle) zzkqVar : null;
                                if (categoryTileSection$CategoryTile$Style$ImageStyle2 != null) {
                                    imageStyle2 = categoryTileSection$CategoryTile$Style$ImageStyle2.value;
                                    imageStyle2.getClass();
                                    if (localizedString != null || (str3 = localizedString.translated_value) == null) {
                                        str3 = "";
                                    }
                                    if (tapAction != null && (zzleVar2 = tapAction.action) != null) {
                                        TapAction$Action$UrlAction tapAction$Action$UrlAction3 = !(zzleVar2 instanceof TapAction$Action$UrlAction) ? (TapAction$Action$UrlAction) zzleVar2 : null;
                                        urlTapAction = tapAction$Action$UrlAction3 == null ? tapAction$Action$UrlAction3.value : null;
                                        if (urlTapAction != null && (str4 = urlTapAction.action_url) != null) {
                                            str8 = str4;
                                        }
                                    }
                                    String str12 = analyticsEvent == null ? analyticsEvent.event_name : null;
                                    image = imageStyle2.background_image;
                                    if (image == null) {
                                        return new AfterpaySearchViewModel.CategoryTileViewModel.CategoryImageTileViewModel(image, str3, str8, str12);
                                    }
                                    a$$ExternalSyntheticBUOutline0.m$3("style?.image_style.background_image");
                                    return null;
                                }
                            }
                            imageStyle2 = null;
                            imageStyle2.getClass();
                            if (localizedString != null) {
                            }
                            str3 = "";
                            if (tapAction != null) {
                                if (!(zzleVar2 instanceof TapAction$Action$UrlAction)) {
                                }
                                if (tapAction$Action$UrlAction3 == null) {
                                }
                                if (urlTapAction != null) {
                                    str8 = str4;
                                }
                            }
                            if (analyticsEvent == null) {
                            }
                            image = imageStyle2.background_image;
                            if (image == null) {
                            }
                        }
                    }
                    imageStyle = null;
                    if (imageStyle != null) {
                    }
                }
            }
        }
        iconStyle = null;
        String str82 = "";
        if (iconStyle == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BetterOverdraftPresenter$OverdraftToggleState toToggleState(OverdraftStatus overdraftStatus) {
        boolean z;
        boolean z2;
        OverdraftStatus.ToggleButton toggleButton;
        OverdraftStatus.ToggleButton toggleButton2;
        OverdraftStatus.ToggleButton toggleButton3;
        OverdraftStatus.State_ state_ = overdraftStatus.State;
        boolean z3 = false;
        if (state_ != null) {
            OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
            OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
            if (activated2 != null && (toggleButton3 = activated2.toggle_button) != null) {
                z = Intrinsics.areEqual(toggleButton3.is_user_interaction_enabled, Boolean.TRUE);
                if (!z) {
                    return BetterOverdraftPresenter$OverdraftToggleState.On;
                }
                if (state_ != null) {
                    OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                    OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                    if (disabled2 != null && (toggleButton2 = disabled2.toggle_button) != null) {
                        z2 = Intrinsics.areEqual(toggleButton2.is_user_interaction_enabled, Boolean.TRUE);
                        if (!z2) {
                            return BetterOverdraftPresenter$OverdraftToggleState.Off;
                        }
                        if (state_ != null) {
                            OverdraftStatus.State_.Eligible eligible = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                            OverdraftStatus.Eligible eligible2 = eligible != null ? eligible.value : null;
                            if (eligible2 != null && (toggleButton = eligible2.toggle_button) != null) {
                                z3 = Intrinsics.areEqual(toggleButton.is_user_interaction_enabled, Boolean.TRUE);
                            }
                        }
                        return z3 ? BetterOverdraftPresenter$OverdraftToggleState.NeedsEnrollment : BetterOverdraftPresenter$OverdraftToggleState.Disabled;
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    public static OverdraftViewModel.Loaded.ToggleViewModel toToggleViewModel(OverdraftStatus.ToggleButton toggleButton, String str, String str2) {
        Boolean bool = toggleButton.is_on;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = toggleButton.is_user_interaction_enabled;
        bool2.getClass();
        return new OverdraftViewModel.Loaded.ToggleViewModel(str, str2, booleanValue, bool2.booleanValue());
    }

    public Map clientAnalyticsParams() {
        AnalyticsEvent.ParamType paramType = AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN;
        AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen afterpayAppletScreen$AfterpayAppletMerchantSheetScreen = (AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen) this.syncer;
        String str = afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.referrerToken;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair(paramType, str);
        AnalyticsEvent.ParamType paramType2 = AnalyticsEvent.ParamType.ORIGIN;
        String str2 = afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.fromScreen;
        Pair pair2 = new Pair(paramType2, str2 == null ? "" : str2);
        AnalyticsEvent.ParamType paramType3 = AnalyticsEvent.ParamType.FROM_SCREEN;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair3 = new Pair(paramType3, str2);
        AnalyticsEvent.ParamType paramType4 = AnalyticsEvent.ParamType.FROM_SECTION;
        String str3 = afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.fromSection;
        return MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair(paramType4, str3 != null ? str3 : ""));
    }

    public Map clientParams() {
        AnalyticsEvent.ParamType paramType = AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN;
        AfterpayAppletScreen$AfterpaySearchScreen afterpayAppletScreen$AfterpaySearchScreen = (AfterpayAppletScreen$AfterpaySearchScreen) this.neighborhoodsTabContentEnabled$delegate;
        String str = afterpayAppletScreen$AfterpaySearchScreen.referrerToken;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair(paramType, str);
        AnalyticsEvent.ParamType paramType2 = AnalyticsEvent.ParamType.ORIGIN;
        String str2 = afterpayAppletScreen$AfterpaySearchScreen.fromScreen;
        Pair pair2 = new Pair(paramType2, str2 == null ? "" : str2);
        AnalyticsEvent.ParamType paramType3 = AnalyticsEvent.ParamType.FROM_SCREEN;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair3 = new Pair(paramType3, str2);
        AnalyticsEvent.ParamType paramType4 = AnalyticsEvent.ParamType.FROM_SECTION;
        String str3 = afterpayAppletScreen$AfterpaySearchScreen.fromSection;
        return MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair(paramType4, str3 != null ? str3 : ""));
    }

    public void exitWithErrorNotification$1() {
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
        screenNavigator.goTo(Back.INSTANCE);
        AndroidStringManager androidStringManager = (AndroidStringManager) this.store;
        screenNavigator.goTo(new AfterpayAppletScreen$AfterpayAppletNotificationScreen(3000L, androidStringManager.get(R.string.afterpay_applet_notification_error_title), androidStringManager.get(R.string.afterpay_applet_notification_error_subtitle)));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        int i = this.$r8$classId;
        Object obj = this.tabContentPresenterFactory;
        switch (i) {
            case 4:
                break;
            case 5:
                break;
            case 24:
                break;
            case 25:
                break;
        }
        return (ErrorReporter) obj;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        switch (this.$r8$classId) {
            case 4:
                break;
            case 5:
                break;
            case 24:
                break;
            case 25:
                break;
        }
        return (SampleStrategy) this.neighborhoodsTabContentEnabled$delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2$Loaded$OfferItem] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.squareup.cash.common.viewmodels.AvatarBadgeViewModel$IconToken] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.EmptyList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OffersHomeViewModelV2.Loaded.OffersSection mapToOffersSection(List list, BoostCategory boostCategory, Set set, Set set2, Set set3) {
        OffersHomeViewModelV2.Loaded.OffersSection.SectionHeader sectionHeader;
        OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus itemStatus;
        OffersHomeViewModelV2.Loaded.OffersSection offersSection;
        OffersHomeViewEventV2 offerAdded;
        ?? r19;
        OffersHomeViewModelV2.Loaded.OffersSection offerItem;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) ((FeatureFlagManager) this.featureFlagManager);
        boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$BankingCashGreenRelease.INSTANCE)).enabled();
        boolean enabled2 = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$CashCardRewardsTiles.INSTANCE)).enabled();
        String str = OffersHomePresenterV2$WhenMappings.$EnumSwitchMapping$0[boostCategory.ordinal()] == 1 ? "Custom" : "Generic";
        ?? arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RewardWithSelection rewardWithSelection = (RewardWithSelection) it.next();
            rewardWithSelection.getClass();
            String str2 = rewardWithSelection.token;
            set.getClass();
            set2.getClass();
            set3.getClass();
            if (set3.contains(str2)) {
                itemStatus = OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.LOADING;
                offersSection = null;
            } else if (set.contains(str2)) {
                itemStatus = OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.SELECTED;
                offersSection = null;
            } else {
                itemStatus = set2.contains(str2) ? OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.LOCKED : OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.SELECTABLE;
                offersSection = null;
            }
            if (itemStatus != OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.LOCKED || enabled) {
                int ordinal = itemStatus.ordinal();
                if (ordinal == 0) {
                    offerAdded = new OffersHomeViewEventV2.OfferAdded(str2, boostCategory == BoostCategory.CAP);
                } else if (ordinal == 1) {
                    offerAdded = new OffersHomeViewEventV2.GreenStatusClicked(str2);
                } else if (ordinal == 2) {
                    r19 = offersSection;
                    ?? iconToken = OffersMappersKt$WhenMappings.$EnumSwitchMapping$1[boostCategory.ordinal()] != 1 ? new AvatarBadgeViewModel.IconToken(Icons.CashAppPay16) : offersSection;
                    String str3 = rewardWithSelection.title;
                    str3.getClass();
                    offerItem = new OffersHomeViewModelV2.Loaded.OfferItem(str2, str3, rewardWithSelection.main_text, new StackedAvatarViewModel.Single(CanvasUtils.toAvatar(rewardWithSelection)), iconToken, itemStatus, r19);
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return offersSection;
                    }
                    offerAdded = new OffersHomeViewEventV2.OfferRemoved(str2);
                }
                r19 = offerAdded;
                if (OffersMappersKt$WhenMappings.$EnumSwitchMapping$1[boostCategory.ordinal()] != 1) {
                }
                String str32 = rewardWithSelection.title;
                str32.getClass();
                offerItem = new OffersHomeViewModelV2.Loaded.OfferItem(str2, str32, rewardWithSelection.main_text, new StackedAvatarViewModel.Single(CanvasUtils.toAvatar(rewardWithSelection)), iconToken, itemStatus, r19);
            } else {
                offerItem = offersSection;
            }
            if (offerItem != null) {
                arrayList.add(offerItem);
            }
        }
        boolean z = enabled2 && boostCategory == BoostCategory.CUSTOM;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.syncer;
        int ordinal2 = boostCategory.ordinal();
        if (ordinal2 == 0) {
            sectionHeader = new OffersHomeViewModelV2.Loaded.OffersSection.SectionHeader(androidStringManager.get(R.string.offers_home_custom_offers_title_rows), androidStringManager.get(R.string.offers_home_custom_offers_subtitle_rows), null);
        } else if (ordinal2 == 1) {
            sectionHeader = new OffersHomeViewModelV2.Loaded.OffersSection.SectionHeader(androidStringManager.get(R.string.offers_home_cap_offers_title), androidStringManager.get(R.string.offers_home_cap_offers_subtitle), new OffersHomeViewModelV2.Loaded.OffersSection.SectionHeader.TextButton(androidStringManager.get(R.string.offers_how_it_works_label), new OffersHomeViewEventV2.UrlClicked()));
        } else {
            if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            sectionHeader = new OffersHomeViewModelV2.Loaded.OffersSection.SectionHeader(androidStringManager.get(R.string.offers_home_regular_offers_title), null, null);
        }
        EmptyList emptyList = z ? arrayList : EmptyList.INSTANCE;
        if (z) {
            arrayList = EmptyList.INSTANCE;
        }
        OffersHomeViewModelV2.Loaded.OffersSection offersSection2 = new OffersHomeViewModelV2.Loaded.OffersSection(str, sectionHeader, emptyList, arrayList);
        if (list.isEmpty()) {
            return null;
        }
        return offersSection2;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        boolean z;
        int i2;
        OrderBuilderModel.BuyerInfo.UiReady validateForCheckout;
        AndroidStringManager androidStringManager;
        Object obj;
        boolean z2;
        LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel;
        String prettyPrint$default;
        LocalLocationDetail localLocationDetail;
        LocalMenu localMenu;
        LocalLocationDetail localLocationDetail2;
        BetterNavigator.ScreenNavigator screenNavigator;
        MutableState mutableState;
        Integer num;
        BrandCollection.GeoFence geoFence;
        BrandCollection.GeoFence geoFence2;
        GapComposer gapComposer;
        Object obj2;
        boolean z3;
        BrandFollowViewModel brandFollowViewModel;
        Flow flow2;
        Object obj3;
        MutableState mutableState2;
        Object obj4;
        Object obj5;
        AndroidClock androidClock;
        AndroidStringManager androidStringManager2;
        Object obj6;
        String str;
        String format2;
        String str2;
        Object obj7;
        String format3;
        String format4;
        int i3 = this.$r8$classId;
        Object obj8 = this.syncer;
        int i4 = 16;
        int i5 = 22;
        Object obj9 = this.navigator;
        Object obj10 = this.tabContentPresenterFactory;
        Object obj11 = this.localHomeGeoPresenterFactory;
        Object obj12 = this.featureFlagManager;
        Object obj13 = this.store;
        Object obj14 = this.clearMarketingBadgesIfNeeded;
        Object obj15 = this.embeddedMapEnabled$delegate;
        int i6 = 1;
        Object obj16 = Composer.Companion.Empty;
        switch (i3) {
            case 0:
                LocalInstalledStore localInstalledStore = (LocalInstalledStore) obj13;
                TabContentPresenter$Factory$Impl tabContentPresenter$Factory$Impl = (TabContentPresenter$Factory$Impl) obj10;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) obj9;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-98492839);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj17 = rememberedValue;
                if (rememberedValue == obj16) {
                    obj17 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj17;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Object obj18 = rememberedValue2;
                if (rememberedValue2 == obj16) {
                    Object walletHomeViewKt$$ExternalSyntheticLambda21 = new WalletHomeViewKt$$ExternalSyntheticLambda21(1, parcelableSnapshotMutableIntState);
                    gapComposer2.updateRememberedValue(walletHomeViewKt$$ExternalSyntheticLambda21);
                    obj18 = walletHomeViewKt$$ExternalSyntheticLambda21;
                }
                int i7 = 14;
                RenavigationKt.RenavigationHandler(this, (Function0) obj18, gapComposer2, ((i >> 3) & 14) | 48);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(this);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                Object obj19 = rememberedValue3;
                if (changedInstance || rememberedValue3 == obj16) {
                    Object blockRunner$cancel$1 = new BlockRunner$cancel$1(this, (Continuation) null, i7);
                    gapComposer2.updateRememberedValue(blockRunner$cancel$1);
                    obj19 = blockRunner$cancel$1;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) obj19);
                if (!((Boolean) ((Lazy) this.neighborhoodsTabContentEnabled$delegate).getValue()).booleanValue()) {
                    gapComposer2.startReplaceGroup(-736934660);
                    GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = new GetNeighborhoodsTabContentResponse(CollectionsKt__CollectionsKt.listOf((Object[]) new GetNeighborhoodsTabContentResponse.AppletType[]{GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_LOCAL_CASH, GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_REORDER, GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_MARKETING_MESSAGE, GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_FOLLOWING}), null, null, null, null, null, null, null, EmptyList.INSTANCE, null, null, null, ByteString.EMPTY);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    Object obj20 = rememberedValue4;
                    if (rememberedValue4 == obj16) {
                        Object create = tabContentPresenter$Factory$Impl.create(getNeighborhoodsTabContentResponse, screenNavigator2);
                        gapComposer2.updateRememberedValue(create);
                        obj20 = create;
                    }
                    TabContentPresenter tabContentPresenter = (TabContentPresenter) obj20;
                    gapComposer2.startMovableGroup(-162304296, tabContentPresenter);
                    LocalHomeViewModel models = tabContentPresenter.models(flow, (Composer) gapComposer2, i & 14);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer2, false, false, false);
                    return models;
                }
                gapComposer2.startReplaceGroup(-736399383);
                gapComposer2.end(false);
                Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                int i8 = 18;
                Object obj21 = rememberedValue5;
                if (changedInstance2 || rememberedValue5 == obj16) {
                    Object ziplineLoader$ModuleJob$run$3 = new ZiplineLoader$ModuleJob$run$3(this, parcelableSnapshotMutableIntState, null, i8);
                    gapComposer2.updateRememberedValue(ziplineLoader$ModuleJob$run$3);
                    obj21 = ziplineLoader$ModuleJob$run$3;
                }
                Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) obj21);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                Object obj22 = rememberedValue6;
                if (rememberedValue6 == obj16) {
                    Object dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalAccount), i5), 4);
                    gapComposer2.updateRememberedValue(dataStoreImpl$data$1$invokeSuspend$$inlined$map$1);
                    obj22 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) obj22, null, null, gapComposer2, 48, 2);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (rememberedValue7 == obj16) {
                    Object realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).localTabContents, i8);
                    gapComposer2.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
                    rememberedValue7 = realLocalInstalledStore$hideBrands$$inlined$map$1;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer2, 48, 2);
                GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse2 = (GetNeighborhoodsTabContentResponse) collectAsState2.getValue();
                LocalHomeViewModel.Loading loading = LocalHomeViewModel.Loading.INSTANCE;
                if (getNeighborhoodsTabContentResponse2 == null) {
                    z = false;
                } else {
                    z = false;
                    if (((Boolean) collectAsState.getValue()) != null) {
                        if (!Intrinsics.areEqual((Boolean) collectAsState.getValue(), Boolean.TRUE) || !((Boolean) ((Lazy) obj15).getValue()).booleanValue()) {
                            gapComposer2.startReplaceGroup(-735323063);
                            gapComposer2.end(false);
                            boolean changed = gapComposer2.changed((GetNeighborhoodsTabContentResponse) collectAsState2.getValue());
                            Object rememberedValue8 = gapComposer2.rememberedValue();
                            Object obj23 = rememberedValue8;
                            if (changed || rememberedValue8 == obj16) {
                                GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse3 = (GetNeighborhoodsTabContentResponse) collectAsState2.getValue();
                                getNeighborhoodsTabContentResponse3.getClass();
                                Object create2 = tabContentPresenter$Factory$Impl.create(getNeighborhoodsTabContentResponse3, screenNavigator2);
                                gapComposer2.updateRememberedValue(create2);
                                obj23 = create2;
                            }
                            gapComposer2.startMovableGroup(-162261417, (GetNeighborhoodsTabContentResponse) collectAsState2.getValue());
                            LocalHomeViewModel models2 = ((TabContentPresenter) obj23).models(flow, (Composer) gapComposer2, i & 14);
                            gapComposer2.end(false);
                            gapComposer2.end(false);
                            return models2;
                        }
                        gapComposer2.startReplaceGroup(-735713229);
                        boolean changed2 = gapComposer2.changed((GetNeighborhoodsTabContentResponse) collectAsState2.getValue());
                        Object rememberedValue9 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue9 == obj16) {
                            GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse4 = (GetNeighborhoodsTabContentResponse) collectAsState2.getValue();
                            getNeighborhoodsTabContentResponse4.getClass();
                            LocalHomeGeoPresenter.MetroFactory metroFactory = ((LocalHomeGeoPresenter$Factory$Impl) obj11).delegateFactory;
                            RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) metroFactory.syncer.getValue();
                            LocalInstalledStore localInstalledStore2 = (LocalInstalledStore) metroFactory.store.invoke();
                            AndroidClock androidClock2 = (AndroidClock) metroFactory.clock.lambda.invoke();
                            CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl = (CashMapPresenter$Factory$Impl) metroFactory.cashMapPresenterFactory.invoke();
                            TabContentPresenter$Factory$Impl tabContentPresenter$Factory$Impl2 = (TabContentPresenter$Factory$Impl) metroFactory.tabContentPresenterFactory.invoke();
                            LocalBrandProfilePresenter$Factory$Impl localBrandProfilePresenter$Factory$Impl = (LocalBrandProfilePresenter$Factory$Impl) metroFactory.brandProfilePresenterFactory.invoke();
                            AndroidStringManager androidStringManager3 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                            FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.featureFlagManager.getValue();
                            realLocalBrandSyncer.getClass();
                            localInstalledStore2.getClass();
                            androidClock2.getClass();
                            cashMapPresenter$Factory$Impl.getClass();
                            tabContentPresenter$Factory$Impl2.getClass();
                            localBrandProfilePresenter$Factory$Impl.getClass();
                            androidStringManager3.getClass();
                            featureFlagManager.getClass();
                            rememberedValue9 = new LocalHomeGeoPresenter(realLocalBrandSyncer, localInstalledStore2, androidClock2, cashMapPresenter$Factory$Impl, tabContentPresenter$Factory$Impl2, localBrandProfilePresenter$Factory$Impl, androidStringManager3, featureFlagManager, getNeighborhoodsTabContentResponse4, screenNavigator2);
                            gapComposer2.updateRememberedValue(rememberedValue9);
                        }
                        gapComposer2.startMovableGroup(-162269607, (GetNeighborhoodsTabContentResponse) collectAsState2.getValue());
                        LocalHomeViewModel models3 = ((LocalHomeGeoPresenter) rememberedValue9).models(flow, (Composer) gapComposer2, i & 14);
                        Boxes$$ExternalSyntheticOutline1.m(gapComposer2, false, false, false);
                        return models3;
                    }
                }
                gapComposer2.end(z);
                return loading;
            case 1:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj8;
                RealOrderBuilderStore realOrderBuilderStore = (RealOrderBuilderStore) obj12;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-539217419);
                LocalOpenTabCheckoutPresenter$Args localOpenTabCheckoutPresenter$Args = (LocalOpenTabCheckoutPresenter$Args) this.neighborhoodsTabContentEnabled$delegate;
                LocalErrorResponse localErrorResponse = localOpenTabCheckoutPresenter$Args.errors;
                if (localErrorResponse != null) {
                    gapComposer3.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer3, localErrorResponse, new AnimatedImageDecoder$wrapDrawable$2(localErrorResponse, (Continuation) null, this, 11));
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-1106436997);
                    gapComposer3.end(false);
                }
                gapComposer3.startMovableGroup(1503112751, realOrderBuilderStore.active);
                RealOrderBuilder realOrderBuilder = realOrderBuilderStore.active;
                if (realOrderBuilder == null) {
                    gapComposer3.startReplaceGroup(-648058142);
                    ((BetterNavigator.ScreenNavigator) obj9).goTo(new LocalBrandProfileScreen(localOpenTabCheckoutPresenter$Args.brandSpot, localOpenTabCheckoutPresenter$Args.attributionKey, (MarketingMessageOfferDetails) null, (String) null, (String) null, localOpenTabCheckoutPresenter$Args.syncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                    LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel = LocalOpenTabCheckoutPresenterKt.EMPTY_MODEL;
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer3, false, false, false);
                    return localOpenTabCheckoutViewModel;
                }
                gapComposer3.startReplaceGroup(-647794456);
                UiCallbackModel models4 = realOrderBuilder.models(gapComposer3);
                gapComposer3.end(false);
                gapComposer3.end(false);
                OrderBuilderModel orderBuilderModel = (OrderBuilderModel) models4.model;
                Function1 function1 = models4.onEvent;
                Object rememberedValue10 = gapComposer3.rememberedValue();
                Object obj24 = rememberedValue10;
                if (rememberedValue10 == obj16) {
                    Object brand = ((RealLocalBrandRepository) obj14).brand((BrandSpot) obj15);
                    gapComposer3.updateRememberedValue(brand);
                    obj24 = brand;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) obj24, null, null, gapComposer3, 48, 2);
                Object rememberedValue11 = gapComposer3.rememberedValue();
                if (rememberedValue11 == obj16) {
                    Object cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealLocalInstalledStore) ((LocalInstalledStore) obj13)).profileManager.publicProfile(), 3);
                    gapComposer3.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                    rememberedValue11 = cardModelView$cardHeat$$inlined$map$1;
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue11, null, null, gapComposer3, 48, 2);
                orderBuilderModel.getClass();
                OrderBuilderModel.BuyerInfo buyerInfo = orderBuilderModel.buyerInfo;
                if (buyerInfo instanceof OrderBuilderModel.BuyerInfo.UiReady) {
                    validateForCheckout = (OrderBuilderModel.BuyerInfo.UiReady) buyerInfo;
                    i2 = 0;
                } else {
                    i2 = 0;
                    validateForCheckout = CashAppServiceModule.validateForCheckout(buyerInfo, androidStringManager4, false);
                }
                Object[] objArr = new Object[i2];
                Object rememberedValue12 = gapComposer3.rememberedValue();
                Object obj25 = rememberedValue12;
                if (rememberedValue12 == obj16) {
                    Object avatarViewModel$$ExternalSyntheticLambda0 = new AvatarViewModel$$ExternalSyntheticLambda0(15);
                    gapComposer3.updateRememberedValue(avatarViewModel$$ExternalSyntheticLambda0);
                    obj25 = avatarViewModel$$ExternalSyntheticLambda0;
                }
                MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj25, gapComposer3, 48);
                OrderBuilderModel.BuyerInfo.UiReady uiReady = validateForCheckout;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(uiReady, gapComposer3);
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(orderBuilderModel, gapComposer3);
                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState((LocalCheckoutPaymentTimingViewModel.Option) mutableState3.getValue(), gapComposer3);
                MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(function1, gapComposer3);
                LocalCheckoutPaymentTimingViewModel.Option option = (LocalCheckoutPaymentTimingViewModel.Option) mutableState3.getValue();
                boolean changed3 = gapComposer3.changed(mutableState3) | gapComposer3.changed(function1);
                Object rememberedValue13 = gapComposer3.rememberedValue();
                if (changed3 || rememberedValue13 == obj16) {
                    androidStringManager = androidStringManager4;
                    Object cashtagViewKt$Cashtag$1$1 = new CashtagViewKt$Cashtag$1$1(function1, mutableState3, null, 1);
                    gapComposer3.updateRememberedValue(cashtagViewKt$Cashtag$1$1);
                    obj = cashtagViewKt$Cashtag$1$1;
                } else {
                    androidStringManager = androidStringManager4;
                    obj = rememberedValue13;
                }
                Updater.LaunchedEffect(gapComposer3, option, (Function2) obj);
                Cart cart = orderBuilderModel.cart;
                JWECryptoParts rememberCheckoutPaymentState = zzsr.rememberCheckoutPaymentState(cart, orderBuilderModel.paymentMethodConfig, (String) collectAsState4.getValue(), true, androidStringManager, gapComposer3, 3072);
                LocalMoney displayTotal = CashAppServiceModule.getDisplayTotal(orderBuilderModel);
                LocalBrand localBrand = (LocalBrand) collectAsState3.getValue();
                Brand brand2 = localBrand != null ? BrandKt.toBrand(localBrand) : null;
                LocalBrand localBrand2 = (LocalBrand) collectAsState3.getValue();
                Location.LocationDetail location = (localBrand2 == null || (localLocationDetail2 = localBrand2.selected_location) == null) ? null : LocationKt.toLocation(localLocationDetail2);
                LocalBrand localBrand3 = (LocalBrand) collectAsState3.getValue();
                Location.LocationDetail locationDetail = location;
                LocationMenu locationMenu = (localBrand3 == null || (localLocationDetail = localBrand3.selected_location) == null || (localMenu = localLocationDetail.menu) == null) ? null : LocationMenuKt.toLocationMenu(localMenu);
                Brand brand3 = brand2;
                Updater.LaunchedEffect(gapComposer3, flow, new SessionWorkerKt$runSession$4$1(flow, (Continuation) null, this, rememberCheckoutPaymentState, rememberUpdatedState4, rememberUpdatedState, mutableState3, rememberUpdatedState2, rememberUpdatedState3, Updater.rememberUpdatedState(Boolean.valueOf(cart.hasOpenTabRounds || rememberCheckoutPaymentState.m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0() != null), gapComposer3), 1));
                boolean changed4 = gapComposer3.changed(cart.lines) | gapComposer3.changed(locationMenu);
                Object rememberedValue14 = gapComposer3.rememberedValue();
                if (changed4 || rememberedValue14 == obj16) {
                    Object checkoutSummaryLines = locationMenu != null ? zzsq.toCheckoutSummaryLines(cart, locationMenu) : null;
                    gapComposer3.updateRememberedValue(checkoutSummaryLines);
                    rememberedValue14 = checkoutSummaryLines;
                }
                List list = (List) rememberedValue14;
                LocalBrand localBrand4 = (LocalBrand) collectAsState3.getValue();
                List list2 = (List) rememberCheckoutPaymentState.encryptedKey;
                String str3 = (String) rememberCheckoutPaymentState.header;
                LocalCheckoutPaymentTimingViewModel.Option option2 = (LocalCheckoutPaymentTimingViewModel.Option) mutableState3.getValue();
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                List list3 = list;
                if (locationDetail != null) {
                    LocalFulfillmentType localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
                    localFulfillmentType.getClass();
                    z2 = LocationsKt.currentlyOpen((AndroidClock) obj10, locationDetail.openState(localFulfillmentType));
                } else {
                    z2 = false;
                }
                Cart cart2 = orderBuilderModel.cart;
                boolean z4 = orderBuilderModel.updatingCart;
                List list4 = cart2.lines;
                LocalMoney localMoney = cart2.linesSubtotal;
                Iterator it = list4.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    i9 += ((Line) it.next()).selection.quantity;
                }
                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = new LocalCheckoutPaymentSectionViewModel(str3, list2);
                LocalCheckoutPaymentTimingViewModel localCheckoutPaymentTimingViewModel = new LocalCheckoutPaymentTimingViewModel(option2, CollectionsKt__CollectionsKt.listOf((Object[]) new LocalCheckoutPaymentTimingViewModel.OptionViewModel[]{new LocalCheckoutPaymentTimingViewModel.OptionViewModel(LocalCheckoutPaymentTimingViewModel.Option.PAY_AT_END), new LocalCheckoutPaymentTimingViewModel.OptionViewModel(LocalCheckoutPaymentTimingViewModel.Option.PAY_NOW)}));
                if (brand3 != null) {
                    LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel2 = new LocalCheckoutSpecialInstructionsViewModel(brand3.name);
                    if (!(localBrand4 != null ? Intrinsics.areEqual(localBrand4.allow_checkout_notes, Boolean.TRUE) : false)) {
                        localCheckoutSpecialInstructionsViewModel2 = null;
                    }
                    localCheckoutSpecialInstructionsViewModel = localCheckoutSpecialInstructionsViewModel2;
                } else {
                    localCheckoutSpecialInstructionsViewModel = null;
                }
                LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel = new LocalCheckoutOrderSummaryViewModel(i9, list3, null, false, 60);
                String prettyPrint$default2 = LocalsKt.prettyPrint$default(localMoney, false, null, 7);
                int ordinal = option2.ordinal();
                if (ordinal == 0) {
                    prettyPrint$default = LocalsKt.prettyPrint$default(localMoney, false, null, 7);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    prettyPrint$default = LocalsKt.prettyPrint$default(displayTotal, false, null, 7);
                }
                LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel2 = new LocalOpenTabCheckoutViewModel(uiReady, localCheckoutPaymentSectionViewModel, localCheckoutPaymentTimingViewModel, localCheckoutSpecialInstructionsViewModel, localCheckoutOrderSummaryViewModel, prettyPrint$default2, prettyPrint$default, z2 && !z4, orderBuilderModel.isWorkingAsync || z4);
                gapComposer3.end(false);
                return localOpenTabCheckoutViewModel2;
            case 2:
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) obj9;
                AndroidClock androidClock3 = (AndroidClock) obj11;
                AndroidStringManager androidStringManager5 = (AndroidStringManager) this.neighborhoodsTabContentEnabled$delegate;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-509503763);
                Object[] objArr2 = new Object[0];
                Object rememberedValue15 = gapComposer4.rememberedValue();
                if (rememberedValue15 == obj16) {
                    rememberedValue15 = new LocalMapKt$$ExternalSyntheticLambda3(9);
                    gapComposer4.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState4 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue15, gapComposer4, 48);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer4.changedInstance(this);
                Object rememberedValue16 = gapComposer4.rememberedValue();
                if (changedInstance3 || rememberedValue16 == obj16) {
                    rememberedValue16 = new BlockRunner$cancel$1((Object) this, (Continuation) (false ? 1 : 0), 11);
                    gapComposer4.updateRememberedValue(rememberedValue16);
                }
                Updater.LaunchedEffect(gapComposer4, unit2, (Function2) rememberedValue16);
                Object rememberedValue17 = gapComposer4.rememberedValue();
                if (rememberedValue17 == obj16) {
                    rememberedValue17 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) ((LocalInstalledStore) obj13)).brandCollections, i4), 1);
                    gapComposer4.updateRememberedValue(rememberedValue17);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue17, null, null, gapComposer4, 48, 2);
                if (((BrandCollection) collectAsState5.getValue()) == null) {
                    BrandCollectionMapViewModel brandCollectionMapViewModel = new BrandCollectionMapViewModel(null, EmptyList.INSTANCE, null, null);
                    gapComposer4.end(false);
                    return brandCollectionMapViewModel;
                }
                boolean changed5 = gapComposer4.changed((BrandCollection) collectAsState5.getValue());
                Object rememberedValue18 = gapComposer4.rememberedValue();
                if (changed5 || rememberedValue18 == obj16) {
                    CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl2 = (CashMapPresenter$Factory$Impl) obj12;
                    LocationDeniedScreen locationDeniedScreen = new LocationDeniedScreen(androidStringManager5.get(R.string.local_presenters_map_location_permission_title), androidStringManager5.get(R.string.local_presenters_map_location_permission_details), androidStringManager5.get(R.string.local_presenters_map_location_permission_settings), androidStringManager5.get(R.string.local_presenters_map_location_permission_ignore), null, null, null);
                    BrandCollection brandCollection = (BrandCollection) collectAsState5.getValue();
                    LocationViewModel locationModel = (brandCollection == null || (geoFence2 = brandCollection.geo_fence) == null) ? null : _MoshiKotlinExtensionsKt.toLocationModel(geoFence2);
                    BrandCollection brandCollection2 = (BrandCollection) collectAsState5.getValue();
                    LatLngBounds latLngBounds = (brandCollection2 == null || (geoFence = brandCollection2.geo_fence) == null) ? null : _MoshiKotlinExtensionsKt.toLatLngBounds(geoFence);
                    screenNavigator = screenNavigator3;
                    mutableState = mutableState4;
                    num = 0;
                    GapComposer gapComposer5 = gapComposer4;
                    rememberedValue18 = cashMapPresenter$Factory$Impl2.create(screenNavigator, locationDeniedScreen, null, "NEIGHBORHOODS_MAP", locationModel, latLngBounds);
                    gapComposer5.updateRememberedValue(rememberedValue18);
                    gapComposer = gapComposer5;
                } else {
                    mutableState = mutableState4;
                    gapComposer = gapComposer4;
                    num = 0;
                    screenNavigator = screenNavigator3;
                }
                CashMapPresenter cashMapPresenter = (CashMapPresenter) rememberedValue18;
                boolean changed6 = gapComposer.changed((BrandCollection) collectAsState5.getValue());
                Object rememberedValue19 = gapComposer.rememberedValue();
                if (changed6 || rememberedValue19 == obj16) {
                    BrandCollection brandCollection3 = (BrandCollection) collectAsState5.getValue();
                    rememberedValue19 = brandCollection3 != null ? BrandCollectionDataKt.toBrandCollectionData(brandCollection3) : null;
                    gapComposer.updateRememberedValue(rememberedValue19);
                }
                BrandCollectionData brandCollectionData = (BrandCollectionData) rememberedValue19;
                List list5 = brandCollectionData != null ? brandCollectionData.locations : null;
                if (list5 == null) {
                    list5 = EmptyList.INSTANCE;
                }
                Object rememberedValue20 = gapComposer.rememberedValue();
                Object obj26 = rememberedValue20;
                if (rememberedValue20 == obj16) {
                    Object mutableStateOf$default = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(mutableStateOf$default);
                    obj26 = mutableStateOf$default;
                }
                MutableState mutableState5 = (MutableState) obj26;
                boolean changed7 = gapComposer.changed((String) mutableState5.getValue()) | gapComposer.changed(list5);
                Object rememberedValue21 = gapComposer.rememberedValue();
                Object obj27 = rememberedValue21;
                if (changed7 || rememberedValue21 == obj16) {
                    Iterator it2 = list5.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (Intrinsics.areEqual(((BrandCollectionData.Location) obj2).clientRoute, (String) mutableState5.getValue())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Object obj28 = (BrandCollectionData.Location) obj2;
                    gapComposer.updateRememberedValue(obj28);
                    obj27 = obj28;
                }
                BrandCollectionData.Location location2 = (BrandCollectionData.Location) obj27;
                boolean changed8 = gapComposer.changed(location2);
                Object rememberedValue22 = gapComposer.rememberedValue();
                if (changed8 || rememberedValue22 == obj16) {
                    Object create3 = location2 == null ? null : ((RealBrandFollowPresenter$Factory$Impl) obj14).create(location2.brandSpot, LocalNeighborhoodsMapScreen.INSTANCE, location2.banner, screenNavigator);
                    gapComposer.updateRememberedValue(create3);
                    rememberedValue22 = create3;
                }
                Object obj29 = (BrandFollowPresenter) rememberedValue22;
                Flow rememberSharedViewEvents = SharedViewEventsKt.rememberSharedViewEvents(gapComposer);
                gapComposer.startMovableGroup(-6768726, obj29);
                if (obj29 == null) {
                    gapComposer.startReplaceGroup(-209767141);
                    z3 = false;
                    gapComposer.end(false);
                    brandFollowViewModel = null;
                } else {
                    z3 = false;
                    gapComposer.startReplaceGroup(-6766682);
                    BrandFollowViewModel brandFollowViewModel2 = (BrandFollowViewModel) ((RealBrandFollowPresenter) obj29).models(rememberSharedViewEvents, gapComposer, 0);
                    gapComposer.end(false);
                    brandFollowViewModel = brandFollowViewModel2;
                }
                gapComposer.end(z3);
                gapComposer.startMovableGroup(-6764672, cashMapPresenter);
                UiCallbackModel models5 = cashMapPresenter.models(gapComposer);
                gapComposer.end(z3);
                CashMapViewModel cashMapViewModel = (CashMapViewModel) models5.model;
                Function1 function12 = models5.onEvent;
                Object rememberedValue23 = gapComposer.rememberedValue();
                if (rememberedValue23 == obj16) {
                    flow2 = rememberSharedViewEvents;
                    Object mutableStateOf$default2 = Updater.mutableStateOf$default(new Pair(num, null));
                    gapComposer.updateRememberedValue(mutableStateOf$default2);
                    obj3 = mutableStateOf$default2;
                } else {
                    flow2 = rememberSharedViewEvents;
                    obj3 = rememberedValue23;
                }
                MutableState mutableState6 = (MutableState) obj3;
                Object obj30 = ((Pair) mutableState6.getValue()).first;
                boolean changed9 = gapComposer.changed(function12);
                List list6 = list5;
                Object rememberedValue24 = gapComposer.rememberedValue();
                if (changed9 || rememberedValue24 == obj16) {
                    mutableState2 = mutableState5;
                    obj4 = null;
                    Object cashtagViewKt$Cashtag$1$12 = new CashtagViewKt$Cashtag$1$1(mutableState6, function12, null);
                    gapComposer.updateRememberedValue(cashtagViewKt$Cashtag$1$12);
                    obj5 = cashtagViewKt$Cashtag$1$12;
                } else {
                    mutableState2 = mutableState5;
                    obj4 = null;
                    obj5 = rememberedValue24;
                }
                Updater.LaunchedEffect(obj30, function12, (Function2) obj5, gapComposer);
                Object rememberedValue25 = gapComposer.rememberedValue();
                Object obj31 = rememberedValue25;
                if (rememberedValue25 == obj16) {
                    Object mutableStateOf$default3 = Updater.mutableStateOf$default(new Pair(num, obj4));
                    gapComposer.updateRememberedValue(mutableStateOf$default3);
                    obj31 = mutableStateOf$default3;
                }
                MutableState mutableState7 = (MutableState) obj31;
                Object obj32 = ((Pair) mutableState7.getValue()).first;
                boolean changedInstance4 = gapComposer.changedInstance(cashMapPresenter);
                Object rememberedValue26 = gapComposer.rememberedValue();
                Object obj33 = rememberedValue26;
                if (changedInstance4 || rememberedValue26 == obj16) {
                    Object eventBridge$sendEvent$1 = new EventBridge$sendEvent$1(mutableState7, cashMapPresenter, null, 6);
                    gapComposer.updateRememberedValue(eventBridge$sendEvent$1);
                    obj33 = eventBridge$sendEvent$1;
                }
                Updater.LaunchedEffect(obj32, cashMapPresenter, (Function2) obj33, gapComposer);
                CashMapViewEvent.MapMovementFinished mapMovementFinished = cashMapViewModel.latestMapMovement;
                boolean changedInstance5 = gapComposer.changedInstance(cashMapViewModel) | gapComposer.changedInstance(this);
                Object rememberedValue27 = gapComposer.rememberedValue();
                Object obj34 = rememberedValue27;
                if (changedInstance5 || rememberedValue27 == obj16) {
                    Object eventBridge$sendEvent$12 = new EventBridge$sendEvent$1(cashMapViewModel, this, null, 7);
                    gapComposer.updateRememberedValue(eventBridge$sendEvent$12);
                    obj34 = eventBridge$sendEvent$12;
                }
                Updater.LaunchedEffect(gapComposer, mapMovementFinished, (Function2) obj34);
                GapComposer gapComposer6 = gapComposer;
                BrandFollowViewModel brandFollowViewModel3 = brandFollowViewModel;
                MutableState mutableState8 = mutableState;
                Updater.LaunchedEffect(gapComposer6, flow, new SessionWorkerKt$runSession$4$1(flow, (Continuation) null, this, flow2, list6, location2, mutableState2, mutableState7, mutableState6, mutableState8, 2));
                LocationSelection locationSelection = cashMapViewModel.selectedLocation;
                boolean changedInstance6 = gapComposer6.changedInstance(cashMapViewModel) | gapComposer6.changedInstance(list6) | gapComposer6.changedInstance(this);
                Object rememberedValue28 = gapComposer6.rememberedValue();
                if (changedInstance6 || rememberedValue28 == obj16) {
                    Object zzmhVar = new zzmh(cashMapViewModel, list6, mutableState2, this, null, 7);
                    gapComposer6.updateRememberedValue(zzmhVar);
                    rememberedValue28 = zzmhVar;
                }
                Updater.LaunchedEffect(gapComposer6, locationSelection, (Function2) rememberedValue28);
                boolean changed10 = gapComposer6.changed(brandCollectionData);
                Object rememberedValue29 = gapComposer6.rememberedValue();
                if (changed10 || rememberedValue29 == obj16) {
                    if (list6.isEmpty()) {
                        androidClock = androidClock3;
                        androidStringManager2 = androidStringManager5;
                        rememberedValue29 = null;
                    } else {
                        String str4 = brandCollectionData != null ? brandCollectionData.title : null;
                        String str5 = brandCollectionData != null ? brandCollectionData.subtitle : null;
                        String str6 = brandCollectionData != null ? brandCollectionData.caption : null;
                        List list7 = list6;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                        Iterator it3 = list7.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(TabContentPresenterKt.toModel((BrandCollectionData.Location) it3.next(), androidClock3, androidStringManager5, null));
                        }
                        androidClock = androidClock3;
                        androidStringManager2 = androidStringManager5;
                        rememberedValue29 = new BrandCollectionMapViewModel.Sheet.BrandCollection(new BrandCollectionModel(str4, str5, str6, arrayList, null, null, null, false));
                    }
                    gapComposer6.updateRememberedValue(rememberedValue29);
                } else {
                    androidClock = androidClock3;
                    androidStringManager2 = androidStringManager5;
                }
                BrandCollectionMapViewModel.Sheet.BrandCollection brandCollection4 = (BrandCollectionMapViewModel.Sheet.BrandCollection) rememberedValue29;
                boolean changed11 = gapComposer6.changed((String) mutableState8.getValue()) | gapComposer6.changed(location2) | gapComposer6.changed(brandFollowViewModel3) | gapComposer6.changed(brandCollection4);
                Object rememberedValue30 = gapComposer6.rememberedValue();
                if (changed11 || rememberedValue30 == obj16) {
                    if (brandFollowViewModel3 == null) {
                        String str7 = (String) mutableState8.getValue();
                        if (str7 != null && !StringsKt.isBlank(str7)) {
                            if (brandCollection4 != null) {
                                BrandCollectionModel brandCollectionModel = brandCollection4.model;
                                List list8 = brandCollectionModel.locations;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj35 : list8) {
                                    BrandCollectionModel.Location location3 = (BrandCollectionModel.Location) obj35;
                                    String str8 = location3.name;
                                    LocationStatus locationStatus = location3.status;
                                    List<String> filterNotNull = ArraysKt___ArraysKt.filterNotNull(new String[]{str8, locationStatus != null ? locationStatus.getDescription() : null, location3.address});
                                    if (!filterNotNull.isEmpty()) {
                                        for (String str9 : filterNotNull) {
                                            String str10 = (String) mutableState8.getValue();
                                            str10.getClass();
                                            if (!StringsKt.contains((CharSequence) str9, (CharSequence) str10, true)) {
                                                String str11 = (String) mutableState8.getValue();
                                                str11.getClass();
                                                if (StringsKt.contains((CharSequence) str11, (CharSequence) str9, true)) {
                                                }
                                            }
                                            arrayList2.add(obj35);
                                        }
                                    }
                                }
                                if (brandCollectionModel.caption != null) {
                                    if (arrayList2.isEmpty()) {
                                        format2 = androidStringManager2.get(R.string.local_presenters_no_results_found);
                                    } else {
                                        ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(arrayList2.size()), "count");
                                        Resources resources = androidStringManager2.resources;
                                        resources.getClass();
                                        format2 = new MessageFormat(resources.getString(R.string.local_presenters_n_results_found)).format(m);
                                        format2.getClass();
                                    }
                                    str = format2;
                                } else {
                                    str = null;
                                }
                                brandCollection4 = new BrandCollectionMapViewModel.Sheet.BrandCollection(new BrandCollectionModel(brandCollectionModel.title, brandCollectionModel.subtitle, str, arrayList2, brandCollectionModel.mastheadImage, brandCollectionModel.primaryCtaButtonLabel, brandCollectionModel.primaryCtaClientRoute, brandCollectionModel.showMapButton));
                            } else {
                                brandCollection4 = null;
                            }
                        }
                        rememberedValue30 = brandCollection4;
                    } else {
                        if (location2 != null) {
                            BrandCollectionModel.Location model = TabContentPresenterKt.toModel(location2, androidClock, androidStringManager2, null);
                            BrandSpot brandSpot = model.brandSpot;
                            String str12 = model.name;
                            LocalColor localColor = model.backgroundColor;
                            LocalColor localColor2 = model.foregroundColor;
                            String str13 = model.artwork;
                            LocationStatus locationStatus2 = model.status;
                            String str14 = model.address;
                            String str15 = model.clientRoute;
                            LocalImage localImage = model.heroImage;
                            String str16 = model.promoTag;
                            String str17 = model.promoDescription;
                            brandSpot.getClass();
                            str12.getClass();
                            localColor.getClass();
                            localColor2.getClass();
                            obj6 = new BrandCollectionMapViewModel.Sheet.Brand(new BrandCollectionModel.Location(brandSpot, str12, localColor, localColor2, str13, locationStatus2, str14, str15, brandFollowViewModel3, localImage, str16, str17, null));
                        } else {
                            obj6 = null;
                        }
                        rememberedValue30 = obj6;
                    }
                    gapComposer6.updateRememberedValue(rememberedValue30);
                }
                BrandCollectionMapViewModel.Sheet sheet = (BrandCollectionMapViewModel.Sheet) rememberedValue30;
                BrandCollection brandCollection5 = (BrandCollection) collectAsState5.getValue();
                String str18 = brandCollection5 != null ? brandCollection5.title : null;
                List<BrandCollectionData.Location> list9 = list6;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                for (BrandCollectionData.Location location4 : list9) {
                    arrayList3.add(new BrandCollectionMapViewModel.Location(location4.clientRoute, location4.name, location4.gpsCoordinates, location4.backgroundColor, location4.artworkUrl, TabContentPresenterKt.toModel(location4, androidClock, androidStringManager2, null)));
                }
                BrandCollectionMapViewModel brandCollectionMapViewModel2 = new BrandCollectionMapViewModel(str18, arrayList3, models5, sheet);
                gapComposer6.end(false);
                return brandCollectionMapViewModel2;
            case 3:
                AndroidStringManager androidStringManager6 = (AndroidStringManager) obj13;
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-1472832638);
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance7 = gapComposer7.changedInstance(this);
                Object rememberedValue31 = gapComposer7.rememberedValue();
                if (changedInstance7 || rememberedValue31 == obj16) {
                    rememberedValue31 = new MLKitTitleGenerator$1(this, false ? 1 : 0, 5);
                    gapComposer7.updateRememberedValue(rememberedValue31);
                }
                Updater.LaunchedEffect(gapComposer7, unit3, (Function2) rememberedValue31);
                boolean changedInstance8 = gapComposer7.changedInstance(this);
                Object rememberedValue32 = gapComposer7.rememberedValue();
                if (changedInstance8 || rememberedValue32 == obj16) {
                    rememberedValue32 = new AmountPickerCondensedView.AnonymousClass14(this, false ? 1 : 0, 4);
                    gapComposer7.updateRememberedValue(rememberedValue32);
                }
                Updater.LaunchedEffect(gapComposer7, unit3, (Function2) rememberedValue32);
                UiCallbackModel models6 = ((RealActivityEmbeddedPresenter) obj15).models(gapComposer7, 0);
                Updater.LaunchedEffect(gapComposer7, flow, new EditProfilePresenter$models$2$1(flow, (Continuation) (false ? 1 : 0), (Object) this, 24));
                int ordinal2 = ((AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) obj8).orderActivityType.ordinal();
                if (ordinal2 == 0) {
                    str2 = androidStringManager6.get(R.string.afterpay_applet_purchases_active_purchases_header);
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str2 = androidStringManager6.get(R.string.afterpay_applet_purchases_history_header);
                }
                AfterpayAppletActivityListEmbeddedViewModel afterpayAppletActivityListEmbeddedViewModel = new AfterpayAppletActivityListEmbeddedViewModel(new FullScreenActivityViewModel(models6, str2), (FooterSection) ((ParcelableSnapshotMutableState) this.neighborhoodsTabContentEnabled$delegate).getValue());
                gapComposer7.end(false);
                return afterpayAppletActivityListEmbeddedViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(1738556528);
                boolean changedInstance9 = gapComposer8.changedInstance(this);
                Object rememberedValue33 = gapComposer8.rememberedValue();
                Object obj36 = rememberedValue33;
                if (changedInstance9 || rememberedValue33 == obj16) {
                    Object contextKt$$ExternalSyntheticLambda1 = new ContextKt$$ExternalSyntheticLambda1(this, 7);
                    gapComposer8.updateRememberedValue(contextKt$$ExternalSyntheticLambda1);
                    obj36 = contextKt$$ExternalSyntheticLambda1;
                }
                Function1 function13 = (Function1) obj36;
                Unit unit4 = Unit.INSTANCE;
                boolean changed12 = gapComposer8.changed(function13);
                Object rememberedValue34 = gapComposer8.rememberedValue();
                Continuation continuation = null;
                Object obj37 = rememberedValue34;
                if (changed12 || rememberedValue34 == obj16) {
                    Object localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(function13, continuation, 4);
                    gapComposer8.updateRememberedValue(localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2);
                    obj37 = localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2;
                }
                Updater.LaunchedEffect(gapComposer8, unit4, (Function2) obj37);
                Updater.LaunchedEffect(gapComposer8, flow, new BenefitsHubPresenter$models$1$1(flow, continuation, this, function13, 3));
                AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel = (AfterpayAppletMerchantSheetViewModel) ((ParcelableSnapshotMutableState) obj15).getValue();
                gapComposer8.end(false);
                return afterpayAppletMerchantSheetViewModel;
            case 5:
                return models$com$squareup$cash$afterpayapplet$presenters$AfterpaySearchPresenter(flow, composer, i);
            case 6:
                return models$com$squareup$cash$banking$presenters$BetterOverdraftPresenter(flow, composer, i);
            case 7:
                return models$com$squareup$cash$banking$presenters$OverdraftCoveragePresenter(flow, composer, i);
            case 8:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(399873008);
                Object rememberedValue35 = gapComposer9.rememberedValue();
                Object obj38 = rememberedValue35;
                if (rememberedValue35 == obj16) {
                    Object obj39 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) obj15;
                    gapComposer9.updateRememberedValue(obj39);
                    obj38 = obj39;
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) obj38, null, null, gapComposer9, 48, 2);
                Object rememberedValue36 = gapComposer9.rememberedValue();
                Object obj40 = rememberedValue36;
                if (rememberedValue36 == obj16) {
                    Object obj41 = (ChannelFlowTransformLatest) this.neighborhoodsTabContentEnabled$delegate;
                    gapComposer9.updateRememberedValue(obj41);
                    obj40 = obj41;
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) obj40, null, null, gapComposer9, 48, 2);
                Object rememberedValue37 = gapComposer9.rememberedValue();
                Object obj42 = rememberedValue37;
                if (rememberedValue37 == obj16) {
                    Object valueOf2 = Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj12)).peekCurrentValue(AmplitudeExperiments$CashBitcoinSymbolDisplaySetting.INSTANCE)).enabled());
                    gapComposer9.updateRememberedValue(valueOf2);
                    obj42 = valueOf2;
                }
                boolean booleanValue = ((Boolean) obj42).booleanValue();
                Object rememberedValue38 = gapComposer9.rememberedValue();
                Object obj43 = rememberedValue38;
                if (rememberedValue38 == obj16) {
                    Object mutableStateOf$default4 = Updater.mutableStateOf$default(null);
                    gapComposer9.updateRememberedValue(mutableStateOf$default4);
                    obj43 = mutableStateOf$default4;
                }
                MutableState mutableState9 = (MutableState) obj43;
                Object rememberedValue39 = gapComposer9.rememberedValue();
                Object obj44 = rememberedValue39;
                if (rememberedValue39 == obj16) {
                    Object mutableStateOf$default5 = Updater.mutableStateOf$default(null);
                    gapComposer9.updateRememberedValue(mutableStateOf$default5);
                    obj44 = mutableStateOf$default5;
                }
                MutableState mutableState10 = (MutableState) obj44;
                BitcoinDisplayUnits bitcoinDisplayUnits = (BitcoinDisplayUnits) collectAsState6.getValue();
                boolean changed13 = gapComposer9.changed(collectAsState6);
                Object rememberedValue40 = gapComposer9.rememberedValue();
                Object obj45 = rememberedValue40;
                if (changed13 || rememberedValue40 == obj16) {
                    Object offersHomePresenter$models$2$1 = new OffersHomePresenter$models$2$1(collectAsState6, mutableState10, false ? 1 : 0, i6);
                    gapComposer9.updateRememberedValue(offersHomePresenter$models$2$1);
                    obj45 = offersHomePresenter$models$2$1;
                }
                Updater.LaunchedEffect(gapComposer9, bitcoinDisplayUnits, (Function2) obj45);
                Updater.LaunchedEffect(gapComposer9, flow, new RealContactSync$syncRequest$2.AnonymousClass1(flow, (Continuation) null, this, booleanValue, mutableState10, mutableState9));
                BitcoinDisplayUnits bitcoinDisplayUnits2 = (BitcoinDisplayUnits) mutableState10.getValue();
                Money money = (Money) collectAsState7.getValue();
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj11;
                MoneyFormatter moneyFormatter2 = (MoneyFormatter) obj10;
                Resources resources2 = ((AndroidStringManager) obj14).resources;
                if (bitcoinDisplayUnits2 == null || money == null) {
                    obj7 = BitcoinDisplayCurrencyViewModel.Loading.INSTANCE;
                } else {
                    if (booleanValue) {
                        String format5 = moneyFormatter2.format(money);
                        format5.getClass();
                        resources2.getClass();
                        format3 = new MessageFormat(resources2.getString(R.string.profile_section_btc_display_unit_btc_subtitle)).format(new Object[]{format5});
                        format3.getClass();
                    } else {
                        String format6 = moneyFormatter.format(money);
                        format6.getClass();
                        resources2.getClass();
                        format3 = new MessageFormat(resources2.getString(R.string.profile_section_btc_display_unit_btc_subtitle)).format(new Object[]{format6});
                        format3.getClass();
                    }
                    if (booleanValue) {
                        String format7 = moneyFormatter2.format(money);
                        format7.getClass();
                        resources2.getClass();
                        format4 = new MessageFormat(resources2.getString(R.string.profile_section_btc_display_unit_symbol_subtitle)).format(new Object[]{format7});
                        format4.getClass();
                    } else {
                        Long l = money.amount;
                        String format8 = moneyFormatter.format(new Money(l != null ? Long.valueOf(l.longValue() / 1000) : null, money.currency_code, 4));
                        format8.getClass();
                        resources2.getClass();
                        format4 = new MessageFormat(resources2.getString(R.string.profile_section_btc_display_unit_sat_subtitle)).format(new Object[]{format8});
                        format4.getClass();
                    }
                    obj7 = new BitcoinDisplayCurrencyViewModel.Loaded(bitcoinDisplayUnits2, format3, format4, booleanValue);
                }
                gapComposer9.end(false);
                return obj7;
            case 9:
                return models$com$squareup$cash$bitcoin$presenters$applet$sendreceive$BitcoinSendRestrictionPresenter(flow, composer, i);
            case 10:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1048028918);
                Object rememberedValue41 = gapComposer10.rememberedValue();
                if (rememberedValue41 == obj16) {
                    rememberedValue41 = Updater.mutableStateOf$default((SignatureViewModel.Content) this.neighborhoodsTabContentEnabled$delegate);
                    gapComposer10.updateRememberedValue(rememberedValue41);
                }
                MutableState mutableState11 = (MutableState) rememberedValue41;
                Object rememberedValue42 = gapComposer10.rememberedValue();
                if (rememberedValue42 == obj16) {
                    rememberedValue42 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer10.updateRememberedValue(rememberedValue42);
                }
                MutableState mutableState12 = (MutableState) rememberedValue42;
                Updater.LaunchedEffect(gapComposer10, flow, new RealBoostSelector$removeBoost$1(flow, (Continuation) null, this, mutableState12, 2));
                Object obj46 = ((Boolean) mutableState12.getValue()).booleanValue() ? SignatureViewModel.Submitting.INSTANCE : (SignatureViewModel.Content) mutableState11.getValue();
                gapComposer10.end(false);
                return obj46;
            case 11:
                return models$com$squareup$cash$blockers$presenters$VerifyInstrumentPresenter(flow, composer, i);
            case 12:
                return models$com$squareup$cash$blockers$presenters$VerifyMagicPresenter(flow, composer, i);
            case 13:
                return models$com$squareup$cash$bugreporting$presenters$BugReportingPresenter(flow, composer, i);
            case 14:
                return models$com$squareup$cash$deposits$physical$presenter$details$AtmLocationDetailsPresenter(flow, composer, i);
            case 15:
                return models$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormCompletionPresenter(flow, composer, i);
            case 16:
                return models$com$squareup$cash$favorites$presenters$AddFavoritesPresenter(flow, composer, i);
            case 17:
                return models$com$squareup$cash$history$presenters$ReportAbuseDialogPresenter(flow, composer, i);
            case 18:
                return models$com$squareup$cash$history$presenters$ReportAbusePresenter(flow, composer, i);
            case 19:
                return models$com$squareup$cash$investing$applets$presenters$StocksAppletTilePresenter(flow, composer, i);
            case 20:
                return models$com$squareup$cash$investing$presenters$activity$InvestingActivityHistoryPresenter(flow, composer, i);
            case 21:
                return models$com$squareup$cash$investing$presenters$custom$order$InvestingCustomSharePricePresenter(flow, composer, i);
            case 22:
                return models$com$squareup$cash$money$presenters$HypeWelcomePresenter(flow, composer, i);
            case 23:
                return models$com$squareup$cash$offers$presenters$OffersHomePresenterV2(flow, composer, i);
            case 24:
                return models$com$squareup$cash$paychecks$presenters$DistributePaycheckPresenter(flow, composer, i);
            case 25:
                return models$com$squareup$cash$paychecks$presenters$PaycheckAggregationReceiptPresenter(flow, composer, i);
            case 26:
                return models$com$squareup$cash$paychecks$presenters$PaycheckReceiptPresenter(flow, composer, i);
            case 27:
                m1224models(flow, composer, i);
                return Unit.INSTANCE;
            case 28:
                return models$com$squareup$cash$profile$presenters$personalizedads$RealPersonalizedAdsSettingsPresenter(flow, composer, i);
            default:
                AndroidStringManager androidStringManager7 = (AndroidStringManager) obj14;
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(596486565);
                MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) ((Lazy) obj15).getValue()).models(gapComposer11, 0), gapComposer11);
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance10 = gapComposer11.changedInstance(this) | gapComposer11.changed(rememberUpdatedState5);
                Object rememberedValue43 = gapComposer11.rememberedValue();
                Object obj47 = rememberedValue43;
                if (changedInstance10 || rememberedValue43 == obj16) {
                    Object shoppingWebBridge$loadUrl$1 = new ShoppingWebBridge$loadUrl$1(this, rememberUpdatedState5, false ? 1 : 0, i5);
                    gapComposer11.updateRememberedValue(shoppingWebBridge$loadUrl$1);
                    obj47 = shoppingWebBridge$loadUrl$1;
                }
                Updater.LaunchedEffect(gapComposer11, unit5, (Function2) obj47);
                Updater.LaunchedEffect(gapComposer11, flow, new ArticlePresenter$models$1$1(flow, (Continuation) (false ? 1 : 0), (MoleculePresenter) this, i4));
                SupportFullScreenActivityPickerViewModel.Loaded loaded = new SupportFullScreenActivityPickerViewModel.Loaded(new FullScreenActivityViewModel((UiCallbackModel) rememberUpdatedState5.getValue(), androidStringManager7.get(R.string.support_activity_toolbar_title)), SupportFullScreenActivityPickerViewModel.Loaded.NavigationIconType.BACK, androidStringManager7.get(R.string.support_activity_picker_title), androidStringManager7.get(R.string.support_activity_picker_subtitle));
                gapComposer11.end(false);
                return loaded;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0244, code lost:
    
        if (r0 == 0) goto L198;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[EDGE_INSN: B:13:0x0031->B:14:0x0031 BREAK  A[LOOP:0: B:2:0x000d->B:452:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0326 A[EDGE_INSN: B:215:0x0326->B:216:0x0326 BREAK  A[LOOP:5: B:204:0x0300->B:374:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x040c A[LOOP:6: B:261:0x0406->B:263:0x040c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:374:? A[LOOP:5: B:204:0x0300->B:374:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0107 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:383:0x00f0, B:385:0x00f4, B:387:0x00f8, B:389:0x0101, B:391:0x0107, B:393:0x010b, B:395:0x0111, B:397:0x0115, B:400:0x011c, B:402:0x0120, B:404:0x0124, B:406:0x0128, B:408:0x012e, B:410:0x0134, B:411:0x0138, B:412:0x014c, B:414:0x0152, B:416:0x0160, B:418:0x0166, B:419:0x016a, B:426:0x016e, B:427:0x0176, B:428:0x0177, B:429:0x017e), top: B:382:0x00f0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0152 A[Catch: Exception -> 0x00fb, LOOP:8: B:412:0x014c->B:414:0x0152, LOOP_END, TryCatch #0 {Exception -> 0x00fb, blocks: (B:383:0x00f0, B:385:0x00f4, B:387:0x00f8, B:389:0x0101, B:391:0x0107, B:393:0x010b, B:395:0x0111, B:397:0x0115, B:400:0x011c, B:402:0x0120, B:404:0x0124, B:406:0x0128, B:408:0x012e, B:410:0x0134, B:411:0x0138, B:412:0x014c, B:414:0x0152, B:416:0x0160, B:418:0x0166, B:419:0x016a, B:426:0x016e, B:427:0x0176, B:428:0x0177, B:429:0x017e), top: B:382:0x00f0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0166 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:383:0x00f0, B:385:0x00f4, B:387:0x00f8, B:389:0x0101, B:391:0x0107, B:393:0x010b, B:395:0x0111, B:397:0x0115, B:400:0x011c, B:402:0x0120, B:404:0x0124, B:406:0x0128, B:408:0x012e, B:410:0x0134, B:411:0x0138, B:412:0x014c, B:414:0x0152, B:416:0x0160, B:418:0x0166, B:419:0x016a, B:426:0x016e, B:427:0x0176, B:428:0x0177, B:429:0x017e), top: B:382:0x00f0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0177 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:383:0x00f0, B:385:0x00f4, B:387:0x00f8, B:389:0x0101, B:391:0x0107, B:393:0x010b, B:395:0x0111, B:397:0x0115, B:400:0x011c, B:402:0x0120, B:404:0x0124, B:406:0x0128, B:408:0x012e, B:410:0x0134, B:411:0x0138, B:412:0x014c, B:414:0x0152, B:416:0x0160, B:418:0x0166, B:419:0x016a, B:426:0x016e, B:427:0x0176, B:428:0x0177, B:429:0x017e), top: B:382:0x00f0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:? A[LOOP:2: B:63:0x00c5->B:438:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:452:? A[LOOP:0: B:2:0x000d->B:452:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8 A[EDGE_INSN: B:74:0x00e8->B:75:0x00e8 BREAK  A[LOOP:2: B:63:0x00c5->B:438:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.squareup.protos.cash.shop.rendering.api.RowSection$FilterRow] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.squareup.cash.ui.widget.StackedAvatarViewModel$Single] */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.squareup.protos.franklin.ui.UiAvatar] */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.squareup.protos.franklin.ui.UiAvatar] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.squareup.cash.ui.widget.StackedAvatarViewModel$Single] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$RowSection] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.squareup.protos.cash.shop.rendering.api.RowSection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$RowSection] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$FilterRow] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$AvatarRow] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.squareup.protos.cash.shop.rendering.api.RowSection$AvatarRow] */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$UpsellCard] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel$CallToAction] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel$TrailingContent] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$UpsellCard] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.squareup.protos.cash.localization.LocalizedString, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$Cta$CtaText] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [com.squareup.protos.cash.shop.rendering.api.Button, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$Cta$CtaButtonV2] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.squareup.protos.cash.ui.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$TrailingContent$Image] */
    /* JADX WARN: Type inference failed for: r4v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.squareup.protos.cash.shop.rendering.api.UrlTapAction] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$AvatarStack, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$TrailingContent$LogoStack] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$Cta$CtaButtonV2] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$Cta$CtaText] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$TrailingContent$Image] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.squareup.protos.cash.shop.rendering.api.UpsellCardSection$TrailingContent$LogoStack] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel$BodyViewModel$ResultsViewModel$UpsellCardSectionViewModel] */
    /* JADX WARN: Type inference failed for: r8v20, types: [com.squareup.protos.cash.shop.rendering.api.RowSection$AvatarRow$Avatar$Image] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AfterpaySearchViewModel.BodyViewModel.ResultsViewModel resultsViewModel(AfterpayAppletSearchResponse afterpayAppletSearchResponse, boolean z) {
        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel resultsViewModel;
        Object obj;
        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel;
        Object obj2;
        AfterpaySearchViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel;
        AfterpaySearchViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel2;
        zzld zzldVar;
        CategoryTileSection categoryTileSection;
        String str;
        String str2;
        Iterator it;
        TapAction tapAction;
        zzle zzleVar;
        LocalizedString localizedString;
        Object obj3;
        ?? r8;
        ?? r1;
        zzlf zzlfVar;
        Object obj4;
        Object obj5;
        ?? r21;
        AfterpayAppletUpsellCardViewModel.CallToAction.Button callToActionButton;
        ?? r3;
        zzlg zzlgVar;
        Object obj6;
        Object obj7;
        ?? r22;
        ?? r4;
        ?? r19;
        ?? r23;
        ?? r42;
        List list;
        zzle zzleVar2;
        ?? r43;
        Iterator it2;
        ?? r32;
        Object obj8;
        Object obj9;
        Iterator it3;
        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel resultsViewModel2;
        Object obj10;
        ?? r10;
        String str3;
        LocalizedString localizedString2;
        LocalizedString localizedString3;
        String str4;
        Iterator it4;
        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel resultsViewModel3;
        Object obj11;
        String str5;
        String str6;
        ?? r0;
        CategoryTileSection categoryTileSection2;
        AvatarCarouselSection avatarCarouselSection;
        String str7;
        LocalizedString localizedString4;
        LocalizedString localizedString5;
        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel.CarouselEntryViewModel carouselEntryViewModel;
        String str8;
        AvatarCarouselSection avatarCarouselSection2;
        List list2 = afterpayAppletSearchResponse.sections;
        Iterator it5 = list2.iterator();
        while (true) {
            resultsViewModel = null;
            if (!it5.hasNext()) {
                obj = null;
                break;
            }
            obj = it5.next();
            zzld zzldVar2 = ((SearchSection) obj).content;
            if (zzldVar2 != null) {
                SearchSection$Content$AvartarCarouselSection searchSection$Content$AvartarCarouselSection = zzldVar2 instanceof SearchSection$Content$AvartarCarouselSection ? (SearchSection$Content$AvartarCarouselSection) zzldVar2 : null;
                if (searchSection$Content$AvartarCarouselSection != null) {
                    avatarCarouselSection2 = searchSection$Content$AvartarCarouselSection.value;
                    if (avatarCarouselSection2 == null) {
                        break;
                    }
                }
            }
            avatarCarouselSection2 = null;
            if (avatarCarouselSection2 == null) {
            }
        }
        SearchSection searchSection = (SearchSection) obj;
        if (searchSection != null) {
            zzld zzldVar3 = searchSection.content;
            if (zzldVar3 != null) {
                SearchSection$Content$AvartarCarouselSection searchSection$Content$AvartarCarouselSection2 = zzldVar3 instanceof SearchSection$Content$AvartarCarouselSection ? (SearchSection$Content$AvartarCarouselSection) zzldVar3 : null;
                if (searchSection$Content$AvartarCarouselSection2 != null) {
                    avatarCarouselSection = searchSection$Content$AvartarCarouselSection2.value;
                    if (avatarCarouselSection != null) {
                        a$$ExternalSyntheticBUOutline0.m$3("content?.avartar_carousel_section");
                        return null;
                    }
                    List list3 = avatarCarouselSection.avatar_items;
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (Object obj12 : list3) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        AvatarCarouselSection.AvatarItem avatarItem = (AvatarCarouselSection.AvatarItem) obj12;
                        UiAvatar uiAvatar = avatarItem.avatar;
                        if (uiAvatar != null) {
                            String id = AfterpaySearchPresenterKt.id(avatarItem, i);
                            LocalizedString localizedString6 = avatarItem.title;
                            if (localizedString6 == null || (str8 = localizedString6.translated_value) == null) {
                                str8 = "";
                            }
                            carouselEntryViewModel = new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel.CarouselEntryViewModel(StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar), id, str8);
                        } else {
                            carouselEntryViewModel = null;
                        }
                        if (carouselEntryViewModel != null) {
                            arrayList.add(carouselEntryViewModel);
                        }
                        i = i2;
                    }
                    SectionHeader sectionHeader = searchSection.section_header;
                    if (sectionHeader == null || (localizedString5 = sectionHeader.l_title) == null || (str7 = localizedString5.translated_value) == null) {
                        str7 = "";
                    }
                    String str9 = (sectionHeader == null || (localizedString4 = sectionHeader.l_subtitle) == null) ? null : localizedString4.translated_value;
                    Boolean bool = searchSection.show_footer_divider;
                    recentlyViewedCarouselViewModel = new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel(str7, str9, arrayList, bool != null ? bool.booleanValue() : false);
                }
            }
            avatarCarouselSection = null;
            if (avatarCarouselSection != null) {
            }
        } else {
            recentlyViewedCarouselViewModel = null;
        }
        List list4 = list2;
        Iterator it6 = list4.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            zzld zzldVar4 = ((SearchSection) obj2).content;
            if (zzldVar4 != null) {
                SearchSection$Content$TileSection searchSection$Content$TileSection = zzldVar4 instanceof SearchSection$Content$TileSection ? (SearchSection$Content$TileSection) zzldVar4 : null;
                if (searchSection$Content$TileSection != null) {
                    categoryTileSection2 = searchSection$Content$TileSection.value;
                    if (categoryTileSection2 == null) {
                        break;
                    }
                }
            }
            categoryTileSection2 = null;
            if (categoryTileSection2 == null) {
            }
        }
        SearchSection searchSection2 = (SearchSection) obj2;
        if (searchSection2 != null) {
            try {
                AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory = AfterpayAppletParsingErrorFactory.INSTANCE;
                try {
                    zzldVar = searchSection2.content;
                } catch (Exception e) {
                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SearchSection.class), afterpayAppletParsingErrorFactory, null);
                }
            } catch (ProtoParsingError e2) {
                ((ErrorReporter) this.localHomeGeoPresenterFactory).report(e2, (SampleStrategy) this.tabContentPresenterFactory);
                exitWithErrorNotification$1();
                categoryTilesSectionViewModel = null;
            }
            if (zzldVar != null) {
                SearchSection$Content$TileSection searchSection$Content$TileSection2 = zzldVar instanceof SearchSection$Content$TileSection ? (SearchSection$Content$TileSection) zzldVar : null;
                if (searchSection$Content$TileSection2 != null) {
                    categoryTileSection = searchSection$Content$TileSection2.value;
                    if (categoryTileSection != null) {
                        throw new IllegalArgumentException("content?.tile_section");
                    }
                    String str10 = searchSection2.section_id;
                    if (str10 == null) {
                        throw new IllegalArgumentException("section_id");
                    }
                    SectionHeader sectionHeader2 = searchSection2.section_header;
                    if (sectionHeader2 == null || (localizedString = sectionHeader2.l_title) == null || (str = localizedString.translated_value) == null) {
                        str = "";
                    }
                    if (sectionHeader2 != null && (tapAction = sectionHeader2.tap_action) != null && (zzleVar = tapAction.action) != null) {
                        TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                        UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
                        if (urlTapAction != null) {
                            str2 = urlTapAction.action_url;
                            AfterpaySearchViewModel.CategorySectionHeaderViewModel categorySectionHeaderViewModel = new AfterpaySearchViewModel.CategorySectionHeaderViewModel(str, str2);
                            List list5 = categoryTileSection.tiles;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                            it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(toCategoryTileViewModel((CategoryTileSection.CategoryTile) it.next()));
                            }
                            AnalyticsEvent analyticsEvent = searchSection2.analytics_view_event;
                            categoryTilesSectionViewModel = new AfterpaySearchViewModel.CategoryTilesSectionViewModel(str10, categorySectionHeaderViewModel, arrayList2, analyticsEvent == null ? analyticsEvent.event_name : null);
                            categoryTilesSectionViewModel2 = categoryTilesSectionViewModel;
                        }
                    }
                    str2 = null;
                    AfterpaySearchViewModel.CategorySectionHeaderViewModel categorySectionHeaderViewModel2 = new AfterpaySearchViewModel.CategorySectionHeaderViewModel(str, str2);
                    List list52 = categoryTileSection.tiles;
                    ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list52, 10));
                    it = list52.iterator();
                    while (it.hasNext()) {
                    }
                    AnalyticsEvent analyticsEvent2 = searchSection2.analytics_view_event;
                    categoryTilesSectionViewModel = new AfterpaySearchViewModel.CategoryTilesSectionViewModel(str10, categorySectionHeaderViewModel2, arrayList22, analyticsEvent2 == null ? analyticsEvent2.event_name : null);
                    categoryTilesSectionViewModel2 = categoryTilesSectionViewModel;
                }
            }
            categoryTileSection = null;
            if (categoryTileSection != null) {
            }
        } else {
            categoryTilesSectionViewModel2 = null;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it7 = list4.iterator();
        while (it7.hasNext()) {
            SearchSection searchSection3 = (SearchSection) it7.next();
            zzld zzldVar5 = searchSection3.content;
            if (zzldVar5 != null) {
                ?? r11 = zzldVar5 instanceof SearchSection$Content$RowSection ? (SearchSection$Content$RowSection) zzldVar5 : resultsViewModel;
                if (r11 != 0) {
                    obj9 = r11.value;
                    if (obj9 == null) {
                        if (zzldVar5 != null) {
                            ?? r102 = zzldVar5 instanceof SearchSection$Content$RowSection ? (SearchSection$Content$RowSection) zzldVar5 : resultsViewModel;
                            if (r102 != 0) {
                                r10 = r102.value;
                                r10.getClass();
                                List list6 = r10.rows;
                                ArrayList arrayList4 = new ArrayList();
                                int i3 = 0;
                                for (Object obj13 : list6) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        ?? r17 = resultsViewModel;
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw r17;
                                    }
                                    int i5 = AfterpaySearchPresenterKt.$r8$clinit;
                                    zzlc zzlcVar = ((RowSection.Row) obj13).f1337type;
                                    if (zzlcVar != null) {
                                        ?? r14 = zzlcVar instanceof RowSection$Row$Type$AvatarRow ? (RowSection$Row$Type$AvatarRow) zzlcVar : resultsViewModel;
                                        ?? r142 = r14 != 0 ? r14.value : resultsViewModel;
                                        if (r142 != 0) {
                                            String id2 = AfterpaySearchPresenterKt.id((RowSection.AvatarRow) r142, i3);
                                            LocalizedString localizedString7 = r142.label_text;
                                            if (localizedString7 == null || (str6 = localizedString7.translated_value) == null) {
                                                str6 = "";
                                            }
                                            resultsViewModel3 = resultsViewModel;
                                            LocalizedString localizedString8 = r142.body_text;
                                            ?? r44 = localizedString8 != null ? localizedString8.translated_value : resultsViewModel3;
                                            zzlb zzlbVar = r142.avatar;
                                            it4 = it7;
                                            if (zzlbVar != null) {
                                                ?? r82 = zzlbVar instanceof RowSection$AvatarRow$Avatar$Image ? (RowSection$AvatarRow$Avatar$Image) zzlbVar : resultsViewModel3;
                                                r0 = r82 != 0 ? r82.value : resultsViewModel3;
                                            }
                                            r0 = r142.ui_avatar;
                                            obj11 = new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel(r0 != 0 ? StackedAvatarViewModelKt.toStackedAvatarViewModel(r0) : resultsViewModel3, id2, str6, r44);
                                            if (obj11 != null) {
                                                arrayList4.add(obj11);
                                            }
                                            it7 = it4;
                                            i3 = i4;
                                            resultsViewModel = resultsViewModel3;
                                        }
                                    }
                                    it4 = it7;
                                    resultsViewModel3 = resultsViewModel;
                                    if (zzlcVar != null) {
                                        ?? r12 = zzlcVar instanceof RowSection$Row$Type$FilterRow ? (RowSection$Row$Type$FilterRow) zzlcVar : resultsViewModel3;
                                        ?? r02 = r12 != 0 ? r12.value : resultsViewModel3;
                                        if (r02 != 0) {
                                            String id3 = AfterpaySearchPresenterKt.id((RowSection.FilterRow) r02, i3);
                                            LocalizedString localizedString9 = r02.l_title;
                                            if (localizedString9 == null || (str5 = localizedString9.translated_value) == null) {
                                                str5 = "";
                                            }
                                            LocalizedString localizedString10 = r02.l_subtitle;
                                            ?? r83 = localizedString10 != null ? localizedString10.translated_value : resultsViewModel3;
                                            UiAvatar uiAvatar2 = r02.ui_avatar;
                                            obj11 = new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel(uiAvatar2 != null ? StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar2) : resultsViewModel3, id3, str5, r83);
                                            if (obj11 != null) {
                                            }
                                            it7 = it4;
                                            i3 = i4;
                                            resultsViewModel = resultsViewModel3;
                                        }
                                    }
                                    obj11 = resultsViewModel3;
                                    if (obj11 != null) {
                                    }
                                    it7 = it4;
                                    i3 = i4;
                                    resultsViewModel = resultsViewModel3;
                                }
                                it3 = it7;
                                resultsViewModel2 = resultsViewModel;
                                str3 = searchSection3.section_id;
                                if (str3 != null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("content?.row_section.section_id");
                                    return resultsViewModel2;
                                }
                                SectionHeader sectionHeader3 = searchSection3.section_header;
                                String str11 = (sectionHeader3 == null || (localizedString3 = sectionHeader3.l_title) == null || (str4 = localizedString3.translated_value) == null) ? "" : str4;
                                ?? r143 = (sectionHeader3 == null || (localizedString2 = sectionHeader3.l_subtitle) == null) ? resultsViewModel2 : localizedString2.translated_value;
                                Boolean bool2 = searchSection3.show_footer_divider;
                                obj10 = new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel(str3, str11, r143, arrayList4, bool2 != null ? bool2.booleanValue() : false);
                            }
                        }
                        r10 = resultsViewModel;
                        r10.getClass();
                        List list62 = r10.rows;
                        ArrayList arrayList42 = new ArrayList();
                        int i32 = 0;
                        while (r10.hasNext()) {
                        }
                        it3 = it7;
                        resultsViewModel2 = resultsViewModel;
                        str3 = searchSection3.section_id;
                        if (str3 != null) {
                        }
                    } else {
                        it3 = it7;
                        resultsViewModel2 = resultsViewModel;
                        obj10 = resultsViewModel2;
                    }
                    if (obj10 == null) {
                        arrayList3.add(obj10);
                    }
                    it7 = it3;
                    resultsViewModel = resultsViewModel2;
                }
            }
            obj9 = resultsViewModel;
            if (obj9 == null) {
            }
            if (obj10 == null) {
            }
            it7 = it3;
            resultsViewModel = resultsViewModel2;
        }
        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel resultsViewModel4 = resultsViewModel;
        Iterator it8 = list4.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj3 = resultsViewModel4;
                break;
            }
            obj3 = it8.next();
            zzld zzldVar6 = ((SearchSection) obj3).content;
            if (zzldVar6 != null) {
                ?? r2 = zzldVar6 instanceof SearchSection$Content$UpsellCard ? (SearchSection$Content$UpsellCard) zzldVar6 : resultsViewModel4;
                if (r2 != 0) {
                    obj8 = r2.value;
                    if (obj8 == null) {
                        break;
                    }
                }
            }
            obj8 = resultsViewModel4;
            if (obj8 == null) {
            }
        }
        SearchSection searchSection4 = (SearchSection) obj3;
        if (searchSection4 != null) {
            String str12 = searchSection4.section_id;
            if (str12 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("content?.upsell_card.section_id");
                return resultsViewModel4;
            }
            zzld zzldVar7 = searchSection4.content;
            if (zzldVar7 != null) {
                ?? r13 = zzldVar7 instanceof SearchSection$Content$UpsellCard ? (SearchSection$Content$UpsellCard) zzldVar7 : resultsViewModel4;
                if (r13 != 0) {
                    r1 = r13.value;
                    r1.getClass();
                    zzlfVar = r1.cta;
                    if (zzlfVar != null) {
                        ?? r45 = zzlfVar instanceof UpsellCardSection$Cta$CtaButtonV2 ? (UpsellCardSection$Cta$CtaButtonV2) zzlfVar : resultsViewModel4;
                        if (r45 != 0) {
                            obj4 = r45.value;
                            if (obj4 != null) {
                                if (zzlfVar != null) {
                                    ?? r33 = zzlfVar instanceof UpsellCardSection$Cta$CtaButtonV2 ? (UpsellCardSection$Cta$CtaButtonV2) zzlfVar : resultsViewModel4;
                                    if (r33 != 0) {
                                        r32 = r33.value;
                                        r32.getClass();
                                        callToActionButton = toCallToActionButton(r32);
                                    }
                                }
                                r32 = resultsViewModel4;
                                r32.getClass();
                                callToActionButton = toCallToActionButton(r32);
                            } else {
                                if (zzlfVar != null) {
                                    ?? r46 = zzlfVar instanceof UpsellCardSection$Cta$CtaText ? (UpsellCardSection$Cta$CtaText) zzlfVar : resultsViewModel4;
                                    if (r46 != 0) {
                                        obj5 = r46.value;
                                        if (obj5 == null) {
                                            if (zzlfVar != null) {
                                                ?? r34 = zzlfVar instanceof UpsellCardSection$Cta$CtaText ? (UpsellCardSection$Cta$CtaText) zzlfVar : resultsViewModel4;
                                                if (r34 != 0) {
                                                    r3 = r34.value;
                                                    r3.getClass();
                                                    String str13 = r3.translated_value;
                                                    r21 = new AfterpayAppletUpsellCardViewModel.CallToAction.Text(str13 != null ? str13 : "");
                                                }
                                            }
                                            r3 = resultsViewModel4;
                                            r3.getClass();
                                            String str132 = r3.translated_value;
                                            r21 = new AfterpayAppletUpsellCardViewModel.CallToAction.Text(str132 != null ? str132 : "");
                                        } else {
                                            Button button = r1.cta_button;
                                            if (button != null) {
                                                callToActionButton = toCallToActionButton(button);
                                            } else {
                                                r21 = resultsViewModel4;
                                            }
                                        }
                                        Boolean bool3 = r1.trailing_content_background;
                                        boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
                                        zzlgVar = r1.trailing_content;
                                        if (zzlgVar != null) {
                                            ?? r5 = zzlgVar instanceof UpsellCardSection$TrailingContent$LogoStack ? (UpsellCardSection$TrailingContent$LogoStack) zzlgVar : resultsViewModel4;
                                            if (r5 != 0) {
                                                obj6 = r5.value;
                                                if (obj6 == null) {
                                                    if (zzlgVar != null) {
                                                        ?? r47 = zzlgVar instanceof UpsellCardSection$TrailingContent$LogoStack ? (UpsellCardSection$TrailingContent$LogoStack) zzlgVar : resultsViewModel4;
                                                        if (r47 != 0) {
                                                            r43 = r47.value;
                                                            r43.getClass();
                                                            List list7 = r43.avatars;
                                                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                                            it2 = list7.iterator();
                                                            while (it2.hasNext()) {
                                                                arrayList5.add(StackedAvatarViewModelKt.toStackedAvatarViewModel((UiAvatar) it2.next()));
                                                            }
                                                            r22 = new AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack(arrayList5, booleanValue);
                                                        }
                                                    }
                                                    r43 = resultsViewModel4;
                                                    r43.getClass();
                                                    List list72 = r43.avatars;
                                                    ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list72, 10));
                                                    it2 = list72.iterator();
                                                    while (it2.hasNext()) {
                                                    }
                                                    r22 = new AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack(arrayList52, booleanValue);
                                                } else {
                                                    if (zzlgVar != null) {
                                                        ?? r52 = zzlgVar instanceof UpsellCardSection$TrailingContent$Image ? (UpsellCardSection$TrailingContent$Image) zzlgVar : resultsViewModel4;
                                                        if (r52 != 0) {
                                                            obj7 = r52.value;
                                                            if (obj7 == null) {
                                                                if (zzlgVar != null) {
                                                                    ?? r48 = zzlgVar instanceof UpsellCardSection$TrailingContent$Image ? (UpsellCardSection$TrailingContent$Image) zzlgVar : resultsViewModel4;
                                                                    if (r48 != 0) {
                                                                        r4 = r48.value;
                                                                        r4.getClass();
                                                                        r22 = new AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage(r4, booleanValue);
                                                                    }
                                                                }
                                                                r4 = resultsViewModel4;
                                                                r4.getClass();
                                                                r22 = new AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage(r4, booleanValue);
                                                            } else {
                                                                r22 = resultsViewModel4;
                                                            }
                                                        }
                                                    }
                                                    obj7 = resultsViewModel4;
                                                    if (obj7 == null) {
                                                    }
                                                }
                                                LocalizedString localizedString11 = r1.title;
                                                r19 = localizedString11 == null ? localizedString11.translated_value : resultsViewModel4;
                                                if (r19 != 0) {
                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                    return resultsViewModel4;
                                                }
                                                LocalizedString localizedString12 = r1.subtitle;
                                                ?? r20 = localizedString12 != null ? localizedString12.translated_value : resultsViewModel4;
                                                TapAction tapAction2 = r1.tap_action;
                                                if (tapAction2 != null && (zzleVar2 = tapAction2.action) != null) {
                                                    ?? r49 = zzleVar2 instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar2 : resultsViewModel4;
                                                    ?? r410 = r49 != 0 ? r49.value : resultsViewModel4;
                                                    if (r410 != 0) {
                                                        r23 = r410.action_url;
                                                        if (tapAction2 != null || (list = tapAction2.analytics_tap_events) == null) {
                                                            r42 = EmptyList.INSTANCE;
                                                        } else {
                                                            r42 = new ArrayList();
                                                            Iterator it9 = list.iterator();
                                                            while (it9.hasNext()) {
                                                                String str14 = ((AnalyticsEvent) it9.next()).event_name;
                                                                if (str14 != null) {
                                                                    r42.add(str14);
                                                                }
                                                            }
                                                        }
                                                        List list8 = r42;
                                                        AnalyticsEvent analyticsEvent3 = r1.analytics_view_event;
                                                        r8 = new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.UpsellCardSectionViewModel(str12, new AfterpayAppletUpsellCardViewModel(r19, r20, r21, r22, r23, list8, analyticsEvent3 == null ? analyticsEvent3.event_name : resultsViewModel4));
                                                    }
                                                }
                                                r23 = resultsViewModel4;
                                                if (tapAction2 != null) {
                                                }
                                                r42 = EmptyList.INSTANCE;
                                                List list82 = r42;
                                                AnalyticsEvent analyticsEvent32 = r1.analytics_view_event;
                                                r8 = new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.UpsellCardSectionViewModel(str12, new AfterpayAppletUpsellCardViewModel(r19, r20, r21, r22, r23, list82, analyticsEvent32 == null ? analyticsEvent32.event_name : resultsViewModel4));
                                            }
                                        }
                                        obj6 = resultsViewModel4;
                                        if (obj6 == null) {
                                        }
                                        LocalizedString localizedString112 = r1.title;
                                        if (localizedString112 == null) {
                                        }
                                        if (r19 != 0) {
                                        }
                                    }
                                }
                                obj5 = resultsViewModel4;
                                if (obj5 == null) {
                                }
                                Boolean bool32 = r1.trailing_content_background;
                                if (bool32 != null) {
                                }
                                zzlgVar = r1.trailing_content;
                                if (zzlgVar != null) {
                                }
                                obj6 = resultsViewModel4;
                                if (obj6 == null) {
                                }
                                LocalizedString localizedString1122 = r1.title;
                                if (localizedString1122 == null) {
                                }
                                if (r19 != 0) {
                                }
                            }
                            r21 = callToActionButton;
                            Boolean bool322 = r1.trailing_content_background;
                            if (bool322 != null) {
                            }
                            zzlgVar = r1.trailing_content;
                            if (zzlgVar != null) {
                            }
                            obj6 = resultsViewModel4;
                            if (obj6 == null) {
                            }
                            LocalizedString localizedString11222 = r1.title;
                            if (localizedString11222 == null) {
                            }
                            if (r19 != 0) {
                            }
                        }
                    }
                    obj4 = resultsViewModel4;
                    if (obj4 != null) {
                    }
                    r21 = callToActionButton;
                    Boolean bool3222 = r1.trailing_content_background;
                    if (bool3222 != null) {
                    }
                    zzlgVar = r1.trailing_content;
                    if (zzlgVar != null) {
                    }
                    obj6 = resultsViewModel4;
                    if (obj6 == null) {
                    }
                    LocalizedString localizedString112222 = r1.title;
                    if (localizedString112222 == null) {
                    }
                    if (r19 != 0) {
                    }
                }
            }
            r1 = resultsViewModel4;
            r1.getClass();
            zzlfVar = r1.cta;
            if (zzlfVar != null) {
            }
            obj4 = resultsViewModel4;
            if (obj4 != null) {
            }
            r21 = callToActionButton;
            Boolean bool32222 = r1.trailing_content_background;
            if (bool32222 != null) {
            }
            zzlgVar = r1.trailing_content;
            if (zzlgVar != null) {
            }
            obj6 = resultsViewModel4;
            if (obj6 == null) {
            }
            LocalizedString localizedString1122222 = r1.title;
            if (localizedString1122222 == null) {
            }
            if (r19 != 0) {
            }
        } else {
            r8 = resultsViewModel4;
        }
        return new AfterpaySearchViewModel.BodyViewModel.ResultsViewModel(recentlyViewedCarouselViewModel, categoryTilesSectionViewModel2, r8, arrayList3, z);
    }

    public void routeAction$1(String str) {
        RealRouter realRouter = (RealRouter) this.embeddedMapEnabled$delegate;
        AfterpayAppletScreen$AfterpaySearchScreen afterpayAppletScreen$AfterpaySearchScreen = (AfterpayAppletScreen$AfterpaySearchScreen) this.neighborhoodsTabContentEnabled$delegate;
        realRouter.route(new RoutingParams(afterpayAppletScreen$AfterpaySearchScreen, null, null, null, new AnalyticsParams.GenericAnalyticsParams(afterpayAppletScreen$AfterpaySearchScreen.referrerToken, afterpayAppletScreen$AfterpaySearchScreen.fromScreen, afterpayAppletScreen$AfterpaySearchScreen.fromSection, 2), null, 478), str);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider clearMarketingBadgesIfNeeded;
        public final DoubleCheck featureFlagManager;
        public final InstanceFactory localHomeGeoPresenterFactory;
        public final Provider store;
        public final DoubleCheck syncer;
        public final Provider tabContentPresenterFactory;

        public MetroFactory(RealActivityItemPresenterFactory.MetroFactory metroFactory, InstanceFactory instanceFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealPasscodeFlowStarter.MetroFactory metroFactory2, InstanceFactory instanceFactory2) {
            this.store = metroFactory;
            this.clearMarketingBadgesIfNeeded = instanceFactory;
            this.syncer = doubleCheck;
            this.featureFlagManager = doubleCheck2;
            this.tabContentPresenterFactory = metroFactory2;
            this.localHomeGeoPresenterFactory = instanceFactory2;
        }

        public MetroFactory(MoneyUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Provider provider, RealMessageSigner.MetroFactory metroFactory2, InstanceFactory instanceFactory) {
            this.store = metroFactory;
            this.syncer = doubleCheck;
            this.featureFlagManager = doubleCheck2;
            this.clearMarketingBadgesIfNeeded = provider;
            this.tabContentPresenterFactory = metroFactory2;
            this.localHomeGeoPresenterFactory = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory, BorrowUiFactory.MetroFactory metroFactory2, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
            this.syncer = doubleCheck;
            this.store = metroFactory;
            this.clearMarketingBadgesIfNeeded = metroFactory2;
            this.featureFlagManager = doubleCheck2;
            this.localHomeGeoPresenterFactory = instanceFactory;
            this.tabContentPresenterFactory = instanceFactory2;
        }
    }

    public LocalHomePresenter(AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, BitcoinLimitsProvider bitcoinLimitsProvider, RealCryptoBalanceRepo realCryptoBalanceRepo, SendBitcoinNavigator sendBitcoinNavigator, CryptoFlowStarter cryptoFlowStarter, Analytics analytics, BitcoinSendRestrictionScreen bitcoinSendRestrictionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 9;
        bitcoinSendRestrictionScreen.getClass();
        this.syncer = androidStringManager;
        this.store = bitcoinLimitsProvider;
        this.clearMarketingBadgesIfNeeded = realCryptoBalanceRepo;
        this.featureFlagManager = sendBitcoinNavigator;
        this.localHomeGeoPresenterFactory = cryptoFlowStarter;
        this.tabContentPresenterFactory = analytics;
        this.neighborhoodsTabContentEnabled$delegate = bitcoinSendRestrictionScreen;
        this.navigator = screenNavigator;
        this.embeddedMapEnabled$delegate = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public LocalHomePresenter(RealActivitiesCacheManager realActivitiesCacheManager, RealActivityTokenFactory realActivityTokenFactory, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenter$Factory$Impl, AndroidStringManager androidStringManager, Analytics analytics, Moshi moshi, BetterNavigator.ScreenNavigator screenNavigator, SupportScreens.FlowScreens.SupportActivityPickerFullScreen supportActivityPickerFullScreen) {
        this.$r8$classId = 29;
        supportActivityPickerFullScreen.getClass();
        this.syncer = realActivityEmbeddedPresenter$Factory$Impl;
        this.store = supportActivityItemPresenter$Factory$Impl;
        this.clearMarketingBadgesIfNeeded = androidStringManager;
        this.featureFlagManager = analytics;
        this.navigator = screenNavigator;
        this.localHomeGeoPresenterFactory = supportActivityPickerFullScreen;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KType typeOf = Reflection.typeOf(String.class);
        companion.getClass();
        this.tabContentPresenterFactory = _MoshiKotlinExtensionsKt.adapter(moshi, Reflection.typeOf(List.class, KTypeProjection.Companion.invariant(typeOf)));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.neighborhoodsTabContentEnabled$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new SupportHomePresenter$$ExternalSyntheticLambda2(realActivityTokenFactory, 1));
        this.embeddedMapEnabled$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new TaxWebAppBridge$$ExternalSyntheticLambda0(2, this, realActivitiesCacheManager));
    }

    public LocalHomePresenter(AtmLocationDetailsScreen atmLocationDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator, IntentLauncher intentLauncher, Analytics analytics, AndroidStringManager androidStringManager, RealClipboardManager realClipboardManager, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 14;
        atmLocationDetailsScreen.getClass();
        this.syncer = atmLocationDetailsScreen;
        this.navigator = screenNavigator;
        this.store = intentLauncher;
        this.clearMarketingBadgesIfNeeded = analytics;
        this.featureFlagManager = androidStringManager;
        this.localHomeGeoPresenterFactory = realClipboardManager;
        this.tabContentPresenterFactory = atmLocationDetailsScreen.explainerScreen;
        this.neighborhoodsTabContentEnabled$delegate = atmLocationDetailsScreen.retailerLocation;
        this.embeddedMapEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalHomePresenter(FeatureFlagManager featureFlagManager, HypeDismissedPreference hypeDismissedPreference, PdpNotifiedPreference pdpNotifiedPreference, Analytics analytics, SessionManager sessionManager, HypeWelcomeScreen hypeWelcomeScreen, BetterNavigator.ScreenNavigator screenNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 22;
        hypeWelcomeScreen.getClass();
        this.featureFlagManager = featureFlagManager;
        this.syncer = hypeDismissedPreference;
        this.store = pdpNotifiedPreference;
        this.clearMarketingBadgesIfNeeded = analytics;
        this.localHomeGeoPresenterFactory = sessionManager;
        this.tabContentPresenterFactory = hypeWelcomeScreen;
        this.navigator = screenNavigator;
        this.neighborhoodsTabContentEnabled$delegate = DateTimeFormatter.ofPattern("MMM d", Locale.getDefault());
        this.embeddedMapEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalHomePresenter(BlockersScreens.SignatureScreen signatureScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, Analytics analytics, AndroidStringManager androidStringManager, AppService appService, BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl) {
        this.$r8$classId = 10;
        this.syncer = signatureScreen;
        this.navigator = screenNavigator;
        this.store = coroutineContext;
        this.clearMarketingBadgesIfNeeded = analytics;
        this.featureFlagManager = androidStringManager;
        this.localHomeGeoPresenterFactory = appService;
        this.tabContentPresenterFactory = blockersDataNavigator;
        this.neighborhoodsTabContentEnabled$delegate = new SignatureViewModel.Content(androidStringManager.get(R.string.signature_title), androidStringManager.get(R.string.signature_back_label), androidStringManager.get(R.string.signature_next_label));
        this.embeddedMapEnabled$delegate = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public LocalHomePresenter(PersonaDidvInquiryLauncher personaDidvInquiryLauncher, BlockersDataNavigator blockersDataNavigator, RealMultiBlockerFacilitator realMultiBlockerFacilitator, AndroidStringManager androidStringManager, BlockersScreens.PersonaDidvScreen personaDidvScreen, BetterNavigator.ScreenNavigator screenNavigator, RealDeviceIntegrityAttester realDeviceIntegrityAttester, FeatureFlagManager featureFlagManager, RealUuidGenerator realUuidGenerator, RealMRIFactory realMRIFactory) {
        this.$r8$classId = 27;
        personaDidvScreen.getClass();
        this.syncer = personaDidvInquiryLauncher;
        this.store = blockersDataNavigator;
        this.clearMarketingBadgesIfNeeded = androidStringManager;
        this.localHomeGeoPresenterFactory = personaDidvScreen;
        this.navigator = screenNavigator;
        this.tabContentPresenterFactory = realDeviceIntegrityAttester;
        this.featureFlagManager = featureFlagManager;
        this.neighborhoodsTabContentEnabled$delegate = realMRIFactory;
        this.embeddedMapEnabled$delegate = realMultiBlockerFacilitator.getResolver(screenNavigator, personaDidvScreen);
    }

    public LocalHomePresenter(AndroidStringManager androidStringManager, RealStocksAppletTileRepository realStocksAppletTileRepository, MoneyAnalyticsService moneyAnalyticsService, RealInvestingStateManager realInvestingStateManager, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, Navigator navigator, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 19;
        navigator.getClass();
        this.syncer = androidStringManager;
        this.store = realStocksAppletTileRepository;
        this.clearMarketingBadgesIfNeeded = moneyAnalyticsService;
        this.featureFlagManager = realInvestingStateManager;
        this.localHomeGeoPresenterFactory = navigator;
        this.tabContentPresenterFactory = promotedAppletTilePresenter$Factory$Impl.create(AppletId.STOCKS);
        this.navigator = factory.create(MoneyFormatterConfig.STANDARD);
        this.embeddedMapEnabled$delegate = androidStringManager.get(R.string.applets_pres_investing);
    }

    public LocalHomePresenter(SessionManager sessionManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealActivitiesCacheManager realActivitiesCacheManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, Analytics analytics, InvestingStockDetailsActivityRequestHandler$Factory$Impl investingStockDetailsActivityRequestHandler$Factory$Impl, CoroutineContext coroutineContext, InvestingScreens.InvestingActivityHistoryScreen investingActivityHistoryScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 20;
        investingActivityHistoryScreen.getClass();
        this.syncer = sessionManager;
        this.store = cashAccountDatabaseImpl;
        this.clearMarketingBadgesIfNeeded = realActivitiesCacheManager;
        this.featureFlagManager = realActivityEmbeddedPresenter$Factory$Impl;
        this.localHomeGeoPresenterFactory = analytics;
        this.tabContentPresenterFactory = investingStockDetailsActivityRequestHandler$Factory$Impl;
        this.neighborhoodsTabContentEnabled$delegate = coroutineContext;
        this.embeddedMapEnabled$delegate = investingActivityHistoryScreen;
        this.navigator = screenNavigator;
    }

    public LocalHomePresenter(SyncValueReader syncValueReader, AndroidStringManager androidStringManager, RealPaycheckSettlementDateFormatter realPaycheckSettlementDateFormatter, LocalizedMoneyFormatter.Factory factory, PaycheckReceiptScreen paycheckReceiptScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.$r8$classId = 26;
        this.syncer = syncValueReader;
        this.store = androidStringManager;
        this.clearMarketingBadgesIfNeeded = realPaycheckSettlementDateFormatter;
        this.featureFlagManager = paycheckReceiptScreen;
        this.navigator = screenNavigator;
        this.localHomeGeoPresenterFactory = analytics;
        this.tabContentPresenterFactory = errorReporter;
        this.neighborhoodsTabContentEnabled$delegate = sampleStrategy;
        this.embeddedMapEnabled$delegate = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public LocalHomePresenter(RealLocalBrandSyncer realLocalBrandSyncer, LocalInstalledStore localInstalledStore, ClearMarketingBadgesIfNeeded clearMarketingBadgesIfNeeded, FeatureFlagManager featureFlagManager, LocalHomeGeoPresenter$Factory$Impl localHomeGeoPresenter$Factory$Impl, TabContentPresenter$Factory$Impl tabContentPresenter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        final int i = 0;
        this.$r8$classId = 0;
        this.syncer = realLocalBrandSyncer;
        this.store = localInstalledStore;
        this.clearMarketingBadgesIfNeeded = clearMarketingBadgesIfNeeded;
        this.featureFlagManager = featureFlagManager;
        this.localHomeGeoPresenterFactory = localHomeGeoPresenter$Factory$Impl;
        this.tabContentPresenterFactory = tabContentPresenter$Factory$Impl;
        this.navigator = screenNavigator;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.neighborhoodsTabContentEnabled$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: app.cash.local.presenters.wallet.LocalHomePresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ LocalHomePresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i2 = i;
                LocalHomePresenter localHomePresenter = this.f$0;
                switch (i2) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localHomePresenter.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$GetNeighborhoodsTabContent.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localHomePresenter.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$NeighborhoodsTabEmbeddedMap.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
        final int i2 = 1;
        this.embeddedMapEnabled$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: app.cash.local.presenters.wallet.LocalHomePresenter$$ExternalSyntheticLambda0
            public final /* synthetic */ LocalHomePresenter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean enabled;
                int i22 = i2;
                LocalHomePresenter localHomePresenter = this.f$0;
                switch (i22) {
                    case 0:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localHomePresenter.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$GetNeighborhoodsTabContent.INSTANCE)).enabled();
                        break;
                    default:
                        enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) localHomePresenter.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$NeighborhoodsTabEmbeddedMap.INSTANCE)).enabled();
                        break;
                }
                return Boolean.valueOf(enabled);
            }
        });
    }

    public LocalHomePresenter(AndroidStringManager androidStringManager, RealBoostRepository realBoostRepository, BoostSyncer boostSyncer, RealFlowTokenGenerator realFlowTokenGenerator, FeatureFlagManager featureFlagManager, RealOffersAnalyticsV2 realOffersAnalyticsV2, RealOffersInflightStateManager realOffersInflightStateManager, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 23;
        this.syncer = androidStringManager;
        this.store = realBoostRepository;
        this.clearMarketingBadgesIfNeeded = boostSyncer;
        this.featureFlagManager = featureFlagManager;
        this.localHomeGeoPresenterFactory = realOffersAnalyticsV2;
        this.tabContentPresenterFactory = realOffersInflightStateManager;
        this.navigator = screenNavigator;
        this.neighborhoodsTabContentEnabled$delegate = factory.create(MoneyFormatterConfig.COMPACT);
        this.embeddedMapEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalHomePresenter(CoroutineScope coroutineScope, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, RealBitcoinProfileRepo realBitcoinProfileRepo, RealCryptoValueRepo realCryptoValueRepo, LocalizedMoneyFormatter.Factory factory, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        this.syncer = coroutineScope;
        this.store = realProfileManager;
        this.clearMarketingBadgesIfNeeded = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.navigator = screenNavigator;
        MoneyFormatterConfig moneyFormatterConfig = MoneyFormatterConfig.STANDARD;
        this.localHomeGeoPresenterFactory = factory.create(moneyFormatterConfig);
        this.tabContentPresenterFactory = factory.create(MoneyFormatterConfig.copy$default(moneyFormatterConfig, null, CurrencyRepresentationOption.CODE, null, 29));
        this.neighborhoodsTabContentEnabled$delegate = realCryptoValueRepo.valuePerBitcoin(null);
        this.embeddedMapEnabled$delegate = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
    }

    public LocalHomePresenter(SyncValueReader syncValueReader, AndroidDateFormatManager androidDateFormatManager, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, PaycheckAggregationReceiptScreen paycheckAggregationReceiptScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.$r8$classId = 25;
        this.syncer = syncValueReader;
        this.store = androidDateFormatManager;
        this.clearMarketingBadgesIfNeeded = androidStringManager;
        this.featureFlagManager = paycheckAggregationReceiptScreen;
        this.navigator = screenNavigator;
        this.localHomeGeoPresenterFactory = analytics;
        this.tabContentPresenterFactory = errorReporter;
        this.neighborhoodsTabContentEnabled$delegate = sampleStrategy;
        this.embeddedMapEnabled$delegate = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public LocalHomePresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, SessionManager sessionManager, CashPlatoAppService cashPlatoAppService, AndroidStringManager androidStringManager, RealLocaleManager realLocaleManager, String str, RealRouter$Factory$Impl realRouter$Factory$Impl, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 28;
        this.syncer = cashAccountDatabaseImpl;
        this.store = sessionManager;
        this.clearMarketingBadgesIfNeeded = cashPlatoAppService;
        this.featureFlagManager = androidStringManager;
        this.localHomeGeoPresenterFactory = realLocaleManager;
        this.tabContentPresenterFactory = str;
        this.neighborhoodsTabContentEnabled$delegate = coroutineContext;
        this.navigator = screenNavigator;
        this.embeddedMapEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalHomePresenter(Analytics analytics, AppService appService, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, BlockerFlowListener blockerFlowListener, Signal signal, BlockersScreens.VerifyMagic verifyMagic, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        this.syncer = analytics;
        this.store = appService;
        this.clearMarketingBadgesIfNeeded = flowStarter;
        this.featureFlagManager = blockersDataNavigator;
        this.localHomeGeoPresenterFactory = androidStringManager;
        this.tabContentPresenterFactory = blockerFlowListener;
        this.neighborhoodsTabContentEnabled$delegate = signal;
        this.embeddedMapEnabled$delegate = verifyMagic;
        this.navigator = screenNavigator;
    }

    public LocalHomePresenter(AndroidStringManager androidStringManager, IntentLauncher intentLauncher, RealFormPdfProvider realFormPdfProvider, AndroidFileProvider androidFileProvider, PostbankAppService postbankAppService, Analytics analytics, CoroutineContext coroutineContext, DirectDepositManualFormSubmissionScreen directDepositManualFormSubmissionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 15;
        directDepositManualFormSubmissionScreen.getClass();
        this.syncer = androidStringManager;
        this.store = intentLauncher;
        this.clearMarketingBadgesIfNeeded = realFormPdfProvider;
        this.featureFlagManager = androidFileProvider;
        this.localHomeGeoPresenterFactory = postbankAppService;
        this.tabContentPresenterFactory = analytics;
        this.neighborhoodsTabContentEnabled$delegate = coroutineContext;
        this.embeddedMapEnabled$delegate = directDepositManualFormSubmissionScreen;
        this.navigator = screenNavigator;
    }

    public LocalHomePresenter(RealContactRepository realContactRepository, PaymentManager paymentManager, AndroidStringManager androidStringManager, BlocklyService blocklyService, RealFavoritesManager realFavoritesManager, RealFamilyProfileManager realFamilyProfileManager, RealRouter$Factory$Impl realRouter$Factory$Impl, HistoryScreens.ReportAbuse reportAbuse, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 18;
        reportAbuse.getClass();
        this.syncer = realContactRepository;
        this.store = paymentManager;
        this.clearMarketingBadgesIfNeeded = androidStringManager;
        this.featureFlagManager = blocklyService;
        this.localHomeGeoPresenterFactory = realFavoritesManager;
        this.tabContentPresenterFactory = realFamilyProfileManager;
        this.neighborhoodsTabContentEnabled$delegate = reportAbuse;
        this.navigator = screenNavigator;
        this.embeddedMapEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalHomePresenter(RealContactRepository realContactRepository, PaymentManager paymentManager, AndroidStringManager androidStringManager, BlocklyService blocklyService, RealFavoritesManager realFavoritesManager, RealFamilyProfileManager realFamilyProfileManager, RealRouter$Factory$Impl realRouter$Factory$Impl, HistoryScreens.ReportAbuseDialogScreen reportAbuseDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        reportAbuseDialogScreen.getClass();
        this.syncer = realContactRepository;
        this.store = paymentManager;
        this.clearMarketingBadgesIfNeeded = androidStringManager;
        this.featureFlagManager = blocklyService;
        this.localHomeGeoPresenterFactory = realFavoritesManager;
        this.tabContentPresenterFactory = realFamilyProfileManager;
        this.neighborhoodsTabContentEnabled$delegate = reportAbuseDialogScreen;
        this.navigator = screenNavigator;
        this.embeddedMapEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalHomePresenter(AndroidStringManager androidStringManager, Analytics analytics, BlockerFlowListener blockerFlowListener, BlockersDataNavigator blockersDataNavigator, RealInstrumentVerifier realInstrumentVerifier, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.VerifyCardScreen verifyCardScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        this.syncer = androidStringManager;
        this.store = analytics;
        this.clearMarketingBadgesIfNeeded = blockerFlowListener;
        this.featureFlagManager = blockersDataNavigator;
        this.localHomeGeoPresenterFactory = realInstrumentVerifier;
        this.tabContentPresenterFactory = verifyCardScreen;
        this.navigator = screenNavigator;
        this.neighborhoodsTabContentEnabled$delegate = realBlockersHelper$Factory$Impl.create(screenNavigator);
        Redacted redacted = verifyCardScreen.title;
        this.embeddedMapEnabled$delegate = new VerifyInstrumentModel(redacted != null ? (String) redacted.getValue() : null, verifyCardScreen.inputHint, false, verifyCardScreen.helpItems != null ? !r5.isEmpty() : false);
    }

    public LocalHomePresenter(BugReportingScreen bugReportingScreen, BetterNavigator.ScreenNavigator screenNavigator, RealProfileAliasRepository realProfileAliasRepository, RealFileValidator$Factory$Impl realFileValidator$Factory$Impl, RealBugReportSenderFactory realBugReportSenderFactory, AndroidStringManager androidStringManager, BinaryBitmap binaryBitmap, RealIntentFactory realIntentFactory, Activity activity) {
        this.$r8$classId = 13;
        bugReportingScreen.getClass();
        this.syncer = bugReportingScreen;
        this.navigator = screenNavigator;
        this.store = realProfileAliasRepository;
        this.clearMarketingBadgesIfNeeded = realBugReportSenderFactory;
        this.featureFlagManager = androidStringManager;
        this.localHomeGeoPresenterFactory = binaryBitmap;
        this.tabContentPresenterFactory = realIntentFactory;
        this.neighborhoodsTabContentEnabled$delegate = activity;
        this.embeddedMapEnabled$delegate = RealFileValidator$Factory$Impl.create$default(realFileValidator$Factory$Impl, 10485760L);
    }

    public LocalHomePresenter(RealInvestmentEntities realInvestmentEntities, RealCryptoValueRepo realCryptoValueRepo, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, LocalizedMoneyFormatter.Factory factory, RealInvestingAnalytics realInvestingAnalytics, InvestingScreens.CustomSharePriceScreen customSharePriceScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 21;
        customSharePriceScreen.getClass();
        this.syncer = realInvestmentEntities;
        this.store = realCryptoValueRepo;
        this.clearMarketingBadgesIfNeeded = realProfileManager;
        this.featureFlagManager = androidStringManager;
        this.localHomeGeoPresenterFactory = realInvestingAnalytics;
        this.tabContentPresenterFactory = customSharePriceScreen;
        this.navigator = screenNavigator;
        this.neighborhoodsTabContentEnabled$delegate = realBitcoinInboundNavigator$Factory$Impl.create(screenNavigator);
        this.embeddedMapEnabled$delegate = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public LocalHomePresenter(BetterNavigator.ScreenNavigator screenNavigator, AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen afterpayAppletScreen$AfterpayAppletMerchantSheetScreen, SampleStrategy sampleStrategy, ErrorReporter errorReporter, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, RealClipboardManager realClipboardManager, IntentLauncher intentLauncher, RealAfterpayAppletMerchantSheetRepository realAfterpayAppletMerchantSheetRepository, AndroidStringManager androidStringManager) {
        this.$r8$classId = 4;
        afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.getClass();
        this.navigator = screenNavigator;
        this.syncer = afterpayAppletScreen$AfterpayAppletMerchantSheetScreen;
        this.store = sampleStrategy;
        this.clearMarketingBadgesIfNeeded = errorReporter;
        this.featureFlagManager = realAfterpayAppletAnalytics;
        this.localHomeGeoPresenterFactory = intentLauncher;
        this.tabContentPresenterFactory = realAfterpayAppletMerchantSheetRepository;
        this.neighborhoodsTabContentEnabled$delegate = androidStringManager;
        this.embeddedMapEnabled$delegate = Updater.mutableStateOf$default(AfterpayAppletMerchantSheetViewModel.Loading.INSTANCE);
    }

    public LocalHomePresenter(AndroidStringManager androidStringManager, RealFavoritesManager realFavoritesManager, RealProfileManager realProfileManager, RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl, RealInputFieldTextSaver realInputFieldTextSaver, BooleanPreference booleanPreference, ModifiablePermissions modifiablePermissions, AddFavorites addFavorites, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        addFavorites.getClass();
        this.syncer = androidStringManager;
        this.store = realFavoritesManager;
        this.clearMarketingBadgesIfNeeded = realProfileManager;
        this.featureFlagManager = realInputFieldTextSaver;
        this.localHomeGeoPresenterFactory = booleanPreference;
        this.tabContentPresenterFactory = modifiablePermissions;
        this.neighborhoodsTabContentEnabled$delegate = addFavorites;
        this.navigator = screenNavigator;
        this.embeddedMapEnabled$delegate = realFavoritesInboundNavigator$Factory$Impl.create(screenNavigator);
    }

    public LocalHomePresenter(RealBrandFollowPresenter$Factory$Impl realBrandFollowPresenter$Factory$Impl, CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl, RealLocalBrandSyncer realLocalBrandSyncer, LocalInstalledStore localInstalledStore, AndroidClock androidClock, RealLocalLauncher realLocalLauncher, AndroidStringManager androidStringManager, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        this.clearMarketingBadgesIfNeeded = realBrandFollowPresenter$Factory$Impl;
        this.featureFlagManager = cashMapPresenter$Factory$Impl;
        this.syncer = realLocalBrandSyncer;
        this.store = localInstalledStore;
        this.localHomeGeoPresenterFactory = androidClock;
        this.tabContentPresenterFactory = realLocalLauncher;
        this.neighborhoodsTabContentEnabled$delegate = androidStringManager;
        this.embeddedMapEnabled$delegate = analytics;
        this.navigator = screenNavigator;
    }

    public LocalHomePresenter(AndroidStringManager androidStringManager, RealLocalBrandRepository realLocalBrandRepository, RealOrderBuilderStore realOrderBuilderStore, LocalInstalledStore localInstalledStore, RealLocalLauncher realLocalLauncher, AndroidClock androidClock, LocalOpenTabCheckoutPresenter$Args localOpenTabCheckoutPresenter$Args, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        this.syncer = androidStringManager;
        this.clearMarketingBadgesIfNeeded = realLocalBrandRepository;
        this.featureFlagManager = realOrderBuilderStore;
        this.store = localInstalledStore;
        this.localHomeGeoPresenterFactory = realLocalLauncher;
        this.tabContentPresenterFactory = androidClock;
        this.neighborhoodsTabContentEnabled$delegate = localOpenTabCheckoutPresenter$Args;
        this.navigator = screenNavigator;
        this.embeddedMapEnabled$delegate = localOpenTabCheckoutPresenter$Args.brandSpot;
    }

    public LocalHomePresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, LocalizedMoneyFormatter.Factory factory, OverdraftlyService overdraftlyService, SyncValueReader syncValueReader, AndroidStringManager androidStringManager, ErrorReporter errorReporter, Analytics analytics, OverdraftCoverageSheetScreen overdraftCoverageSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        overdraftCoverageSheetScreen.getClass();
        this.syncer = overdraftlyService;
        this.store = syncValueReader;
        this.clearMarketingBadgesIfNeeded = androidStringManager;
        this.featureFlagManager = errorReporter;
        this.localHomeGeoPresenterFactory = analytics;
        this.tabContentPresenterFactory = overdraftCoverageSheetScreen;
        this.navigator = screenNavigator;
        this.neighborhoodsTabContentEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
        this.embeddedMapEnabled$delegate = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public LocalHomePresenter(SyncValueReader syncValueReader, OverdraftlyService overdraftlyService, Analytics analytics, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, OverdraftCoverageSheetScreen overdraftCoverageSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        overdraftCoverageSheetScreen.getClass();
        this.syncer = syncValueReader;
        this.store = overdraftlyService;
        this.clearMarketingBadgesIfNeeded = analytics;
        this.featureFlagManager = androidStringManager;
        this.localHomeGeoPresenterFactory = overdraftCoverageSheetScreen;
        this.navigator = screenNavigator;
        this.tabContentPresenterFactory = realRouter$Factory$Impl.create$1(screenNavigator);
        this.neighborhoodsTabContentEnabled$delegate = factory.create(MoneyFormatterConfig.COMPACT);
        this.embeddedMapEnabled$delegate = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public LocalHomePresenter(BetterNavigator.ScreenNavigator screenNavigator, SyncValueReader syncValueReader, PaychecksAppService paychecksAppService, FlowStarter flowStarter, AndroidStringManager androidStringManager, Analytics analytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, CoroutineScope coroutineScope) {
        this.$r8$classId = 24;
        this.navigator = screenNavigator;
        this.syncer = syncValueReader;
        this.store = paychecksAppService;
        this.clearMarketingBadgesIfNeeded = flowStarter;
        this.featureFlagManager = androidStringManager;
        this.localHomeGeoPresenterFactory = analytics;
        this.tabContentPresenterFactory = errorReporter;
        this.embeddedMapEnabled$delegate = sampleStrategy;
        this.neighborhoodsTabContentEnabled$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new P2PListViewKt$$ExternalSyntheticLambda2(26));
    }

    public LocalHomePresenter(RealAfterpayMerchantRepo realAfterpayMerchantRepo, AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, RealInputFieldTextSaver realInputFieldTextSaver, ErrorReporter errorReporter, SampleStrategy sampleStrategy, AfterpayAppletScreen$AfterpaySearchScreen afterpayAppletScreen$AfterpaySearchScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        afterpayAppletScreen$AfterpaySearchScreen.getClass();
        this.syncer = realAfterpayMerchantRepo;
        this.store = androidStringManager;
        this.clearMarketingBadgesIfNeeded = realAfterpayAppletAnalytics;
        this.featureFlagManager = realInputFieldTextSaver;
        this.localHomeGeoPresenterFactory = errorReporter;
        this.tabContentPresenterFactory = sampleStrategy;
        this.neighborhoodsTabContentEnabled$delegate = afterpayAppletScreen$AfterpaySearchScreen;
        this.navigator = screenNavigator;
        this.embeddedMapEnabled$delegate = realRouter$Factory$Impl.create$1(screenNavigator);
        realAfterpayAppletAnalytics.searchFlowToken = Boxes$$ExternalSyntheticOutline1.m();
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m1224models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2025660827);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        int i3 = 3;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BlockersScreens.PersonaDidvScreen personaDidvScreen = (BlockersScreens.PersonaDidvScreen) this.localHomeGeoPresenterFactory;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PersonaDidvPresenter$models$1$1(this, null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, personaDidvScreen, (Function2) rememberedValue);
            Updater.LaunchedEffect(gapComposer, flow, new PdfPreviewPresenter$models$1$1(flow, continuation, this, i3));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, flow, i, i3);
        }
    }
}
