package app.cash.zipline.loader;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.compat.AndroidCameraState;
import androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$1;
import androidx.camera.camera2.pipe.compat.OpenCameraResult;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.collection.ArrayMap;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.RemoteViewsRoot;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.glance.session.TimeoutOptions;
import androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.paging.Pager$pageFetcher$2;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.LocalAddBrandsPresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.service.LocalService;
import app.cash.local.viewmodels.OrderBuilderEvent;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewModel;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.ZiplineManifest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.size.DimensionKt;
import coil3.size.ViewSizeResolver$size$3$1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahx;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.google.android.gms.internal.mlkit_genai_prompt.zzhx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.google.android.gms.internal.mlkit_vision_face.zzea;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.common.zzb;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.presenters.AccountPresenter;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewEvent;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.arcade.treehouse.BiometricsPromptBinding;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.Biometrics$Result;
import com.squareup.cash.biometrics.BiometricsStore$AnalyticsPayload;
import com.squareup.cash.biometrics.BiometricsStore$BiometricsResult;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.send.SendBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinFeatureUnavailableScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinQrCodeScannerScreen;
import com.squareup.cash.bitcoin.screens.BitcoinSendRestrictionScreen;
import com.squareup.cash.bitcoin.screens.SendStablecoinScreen;
import com.squareup.cash.bitcoin.screens.WalletAddressOptionsSheet;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendReceiveBottomSheetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.LinkingFlowsData;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.InputCardInfoHelpersKt;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter$models$2$2;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter$models$2$3;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter$models$lambda$16$$inlined$getStartScreenForLinkingService$default$1$wm$InstitutionLinkingNavigator$WhenMappings;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewEvent;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.borrow.presenters.CreditFirstTimeBorrowBlockerPresenter;
import com.squareup.cash.borrow.presenters.CreditFirstTimeBorrowBlockerPresenter$models$2$2;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewEvent;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewEvent;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.core.CardScene$applyIconToMaterial$1;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewClosePersonalization;
import com.squareup.cash.cdf.asset.AssetPoolRemovePoolMember;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewLoanAmountPicker;
import com.squareup.cash.cdf.cashcard.CashCardManageDisable;
import com.squareup.cash.cdf.cashcard.CashCardManageEnable;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactSubmitMessage;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerFilterOpenTimeframeSelector;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerFilterUpdateTimeframe;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerInteractChangeDisplayPill;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerInteractViewChartDetails;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerInteractViewInfoSheet;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerOpenLoadApplet;
import com.squareup.cash.cdf.instrument.InstrumentLinkNavigate;
import com.squareup.cash.cdf.minthype.MintHypeOptInComplete;
import com.squareup.cash.cdf.minttag.DeviceType;
import com.squareup.cash.cdf.minttag.MintTagLockRequested;
import com.squareup.cash.cdf.minttag.MintTagUnlockRequested;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentDiscoverSelectDirection;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentDismissScreenDismiss;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentFoundPeopleSeeAllClick;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentPayEnterAmount;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentPayPadViewClickInfo;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentPaySubmitPayment;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentStillLookingInfoClick;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentStillLookingNeedHelp;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsChangeDependentSetting;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionConfirmEditAllocation;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionEditConfigurationRowTapped;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionTurnOffAllocation;
import com.squareup.cash.cdf.stock.OrderSide;
import com.squareup.cash.cdf.stock.StockTradeSelectExpiration;
import com.squareup.cash.cdf.stock.StockTradeSetExpiration;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.crypto.primitives.BitcoinFeature;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormCompletionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewEvent;
import com.squareup.cash.earningstracker.backend.api.EarningsTrackerDataResult;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.screens.EarningsTimeframeSelectorSheetScreen;
import com.squareup.cash.earningstracker.screens.NetEarningsInfoSheetScreen;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewEvent;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.viewmodels.HeaderSubtitle;
import com.squareup.cash.earningstracker.viewmodels.HeaderTitle;
import com.squareup.cash.earningstracker.viewmodels.HeroHeaderViewModel;
import com.squareup.cash.earningstracker.viewmodels.Timeframe;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$MintHypeDrop;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InstrumentLinkResolveSuspensionStripeEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InstrumentLinkTransferFundsStripeEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$TapToPayAmountMax;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$TapToPayAmountMin;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.globalsearch.backend.real.GlobalSearchError;
import com.squareup.cash.globalsearch.backend.real.GlobalSearchResponseMappingKt;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.growtools.presenters.manager.bitcoinautowithdraw.GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.investing.viewmodels.search.InvestingFilterResultViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$Map$3$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$2$1$1;
import com.squareup.cash.money.presenters.HypeWelcomePresenter$models$1$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.screens.HypeWelcomeScreen;
import com.squareup.cash.money.viewmodels.HypeWelcomeEvent;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.nearby.backend.NearbyPermissionState;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$AccountRemovalStatus;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountList;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerOptionsMenuScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewEvent;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.EditDistributionPresenter$models$2$1;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.screens.CustomAllocationQuestion;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.paychecks.viewmodels.IsSubmissionInteraction;
import com.squareup.cash.paychecks.viewmodels.UpdateAllocationPercentage;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter$models$6$1;
import com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentRecipientPresenter;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.pools.backend.api.RemovePoolParticipantFailureReason;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.presenters.PoolMemberListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.screens.StartPoolScreen;
import com.squareup.cash.pools.viewmodels.FailureDialogViewModel;
import com.squareup.cash.pools.viewmodels.MemberStatusUpdateSnackBarViewModel;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewEvent;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.viewmodels.SponsoredAccount;
import com.squareup.cash.profile.viewmodels.SponsoredFamilyMember;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.autofill.presenters.AutofillCombinedInfo;
import com.squareup.cash.shopping.autofill.presenters.AutofillState;
import com.squareup.cash.shopping.autofill.presenters.InputViewModelExtKt;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.presenters.ContactSupportEmailMessagePresenter$models$2$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewEvent;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.cash.treehouse.biometrics.BiometricsReadResult;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.RealDeviceLockAnimationBus;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardLockPresenter$models$1$1;
import com.squareup.cash.wallet.presenters.CardLockViewEvent;
import com.squareup.cash.wallet.presenters.LiteCardLockFlowTypeProvider;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataResponse;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.Trend;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchResponse;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.protos.cash.discover.api.app.v2.model.Section$Content$RowSection;
import com.squareup.protos.cash.discover.api.app.v2.service.GlobalSearchService;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsRequest;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse$Response$Details;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FirstTimeBorrowData;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest$RequestValue$Amount;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest$RequestValue$Units;
import com.squareup.protos.franklin.investing.resources.CustomOrder;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.OrderType;
import com.squareup.protos.franklin.investing.resources.Period;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.util.android.Views;
import com.squareup.wire.ProtoAdapter;
import com.squareup.workflow1.ui.TextControllerKt;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RetryTlsHandshakeKt;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ZiplineLoader$load$2 extends SuspendLambda implements Function2 {
    public Object $applicationName;
    public Object $freshnessChecker;
    public final /* synthetic */ Object $initializer;
    public final /* synthetic */ Object $manifestUrlFlow;
    public final /* synthetic */ int $r8$classId;
    public Object $serializersModule;
    public Object L$0;
    public Object L$1;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$load$2(Flow flow, MutableState mutableState, LocalHomePresenter localHomePresenter, SnapshotStateMap snapshotStateMap, Ref$ObjectRef ref$ObjectRef, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.L$0 = flow;
        this.this$0 = mutableState;
        this.$applicationName = localHomePresenter;
        this.$freshnessChecker = snapshotStateMap;
        this.L$1 = ref$ObjectRef;
        this.$serializersModule = mutableState2;
        this.$initializer = mutableState3;
        this.$manifestUrlFlow = mutableState4;
    }

    private final Object invokeSuspend$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope, (LocalHomePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) this.$initializer, (State) this.$manifestUrlFlow);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v9, types: [kotlin.collections.EmptyList] */
    private final Object invokeSuspend$com$squareup$cash$globalsearch$backend$real$RealGlobalSearchRepository$getInitialResults$1$1$serverResultsDeferred$1(Object obj) {
        Object search;
        List list;
        Collection collection;
        GlobalSearchResponseSectionModel globalSearchResponseSectionModel;
        String str;
        String str2 = (String) this.$initializer;
        String str3 = (String) this.$applicationName;
        RealGlobalSearchRepository realGlobalSearchRepository = (RealGlobalSearchRepository) this.L$1;
        AndroidStringManager androidStringManager = realGlobalSearchRepository.stringManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            GlobalSearchService globalSearchService = realGlobalSearchRepository.api;
            ProtoAdapter protoAdapter = SearchRequest.ADAPTER;
            String str4 = (String) this.$freshnessChecker;
            SearchRequest.Origin origin = (SearchRequest.Origin) this.$serializersModule;
            List list2 = (List) this.$manifestUrlFlow;
            Text.Builder builder = new Text.Builder();
            builder.text = str4;
            builder.text_style = origin;
            builder.text_color = str2;
            builder.text_decoration = str3;
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Recipient recipient = ((RecipientSuggestionsProvider$RecipientWithAnalyticsData) it.next()).recipient;
                recipient.getClass();
                String str5 = recipient.customerId;
                if (str5 != null) {
                    arrayList.add(str5);
                }
            }
            TransactorKt.checkElementsNotNull(arrayList);
            builder.icon = arrayList;
            SearchRequest searchRequest = new SearchRequest((String) builder.text, (SearchRequest.Origin) builder.text_style, (String) builder.text_decoration, (String) builder.text_color, (List) builder.icon, builder.buildUnknownFields());
            this.label = 1;
            search = globalSearchService.search(searchRequest, this);
            if (search == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            search = obj;
        }
        ApiResult apiResult = (ApiResult) search;
        SearchResponse searchResponse = (SearchResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
        if (searchResponse == null) {
            return null;
        }
        List<Section> list3 = searchResponse.sections;
        list3.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Section section : list3) {
            section.getClass();
            Section$Content$RowSection section$Content$RowSection = section.content;
            RowSection rowSection = section$Content$RowSection != null ? section$Content$RowSection.value : null;
            RowSection.Page page = rowSection != null ? rowSection.page : null;
            if (page != null) {
                String str6 = rowSection.id;
                com.squareup.protos.cash.discover.api.app.v2.model.Text text = rowSection.title;
                String str7 = "";
                if (str6 == null) {
                    GlobalSearchError globalSearchError = new GlobalSearchError("Global search row section missing id field", Thread$State$EnumUnboxingLocalUtility.m("title", text != null ? text.text : null), 2);
                    ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                    if (errorReporter == null) {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                        return null;
                    }
                    errorReporter.report(globalSearchError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    str6 = "";
                }
                if (text != null && (str = text.text) != null) {
                    str7 = str;
                }
                globalSearchResponseSectionModel = GlobalSearchResponseMappingKt.mapToResponseModel(page, str6, str7);
            } else {
                globalSearchResponseSectionModel = null;
            }
            if (globalSearchResponseSectionModel != null) {
                arrayList2.add(globalSearchResponseSectionModel);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object obj2 = (GlobalSearchResponseSectionModel) it2.next();
            if (!(obj2 instanceof GlobalSearchResponseSectionModel.Activities)) {
                if (!(obj2 instanceof GlobalSearchResponseSectionModel.Rows)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GlobalSearchResponseSectionModel.Rows rows = (GlobalSearchResponseSectionModel.Rows) obj2;
                String str8 = rows.id;
                obj2 = GlobalSearchResponseSectionModel.Rows.copy$default(rows, Intrinsics.areEqual(str8, "people") ? androidStringManager.get(R.string.global_search_section_people_title) : Intrinsics.areEqual(str8, "businesses") ? androidStringManager.get(R.string.global_search_section_businesses_title) : rows.title, null, false, 61);
            }
            arrayList3.add(obj2);
        }
        List list4 = (List) this.L$0;
        List list5 = (List) this.this$0;
        RealClientRouteFormatter realClientRouteFormatter = realGlobalSearchRepository.clientRouteFormatter;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object obj3 = (GlobalSearchResponseSectionModel) it3.next();
            if (obj3 instanceof GlobalSearchResponseSectionModel.Rows) {
                GlobalSearchResponseSectionModel.Rows rows2 = (GlobalSearchResponseSectionModel.Rows) obj3;
                String str9 = rows2.id;
                if (StringsKt__StringsJVMKt.equals(str9, "people", z)) {
                    collection = new ArrayList();
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel globalSearchResponseItemModel = GlobalSearchResponseMappingKt.toGlobalSearchResponseItemModel((RecipientSuggestionsProvider$RecipientWithAnalyticsData) it4.next(), realClientRouteFormatter, androidStringManager, "CUSTOMER", str3);
                        if (globalSearchResponseItemModel != null) {
                            collection.add(globalSearchResponseItemModel);
                        }
                    }
                } else if (StringsKt__StringsJVMKt.equals(str9, "businesses", z)) {
                    collection = new ArrayList();
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel globalSearchResponseItemModel2 = GlobalSearchResponseMappingKt.toGlobalSearchResponseItemModel((RecipientSuggestionsProvider$RecipientWithAnalyticsData) it5.next(), realClientRouteFormatter, androidStringManager, "BUSINESS", str3);
                        if (globalSearchResponseItemModel2 != null) {
                            collection.add(globalSearchResponseItemModel2);
                        }
                    }
                } else {
                    collection = EmptyList.INSTANCE;
                }
                ArrayList plus = CollectionsKt.plus((Iterable) rows2.items, collection);
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = plus.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    List list6 = list5;
                    if (hashSet.add(((GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel) next).entityId)) {
                        arrayList5.add(next);
                    }
                    list5 = list6;
                }
                list = list5;
                obj3 = GlobalSearchResponseSectionModel.Rows.copy$default(rows2, null, arrayList5, rows2.showLoadMore && collection.isEmpty(), 43);
            } else {
                list = list5;
            }
            arrayList4.add(obj3);
            list5 = list;
            z = true;
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            arrayList6.add(new RealGlobalSearchRepository.RealSectionHandle(realGlobalSearchRepository, (GlobalSearchResponseSectionModel) it7.next()));
        }
        return arrayList6;
    }

    private final Object invokeSuspend$com$squareup$cash$growtools$presenters$manager$bitcoinautowithdraw$GrowToolsBitcoinAutoWithdrawManager$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, (RealBugReportSenderFactory) this.this$0, (GrowToolsManagerState) this.$applicationName, (CoroutineScope) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) this.$initializer, (MutableState) this.$manifestUrlFlow, 7);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$money$presenters$MoneyTabPresenter$models$$inlined$CollectEffect$2(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope, (MoneyTabPresenter) this.this$0, (CoroutineScope) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) this.$initializer, (MutableState) this.$manifestUrlFlow);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$offers$presenters$OffersHomePresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope, (MoleculePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) this.$initializer, (MutableState) this.$manifestUrlFlow, 10);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$onboarding$accountpicker$presenters$AccountPickerPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, (TabToolbarPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) this.$initializer, (MutableState) this.$manifestUrlFlow, 11);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$payments$presenters$PersonalizePaymentRecipientPresenter$models$$inlined$CollectEffect$1(Object obj) {
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            final PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter = (PersonalizePaymentRecipientPresenter) this.this$0;
            final MutableState mutableState = (MutableState) this.$applicationName;
            final MutableState mutableState2 = (MutableState) this.$freshnessChecker;
            final MutableState mutableState3 = (MutableState) this.$serializersModule;
            final MutableState mutableState4 = (MutableState) this.$initializer;
            final MutableState mutableState5 = (MutableState) this.$manifestUrlFlow;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.payments.presenters.PersonalizePaymentRecipientPresenter$models$$inlined$CollectEffect$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter2 = personalizePaymentRecipientPresenter;
                    BetterNavigator.ScreenNavigator screenNavigator = personalizePaymentRecipientPresenter2.navigator;
                    PaymentScreens.PersonalizePaymentRecipient personalizePaymentRecipient = personalizePaymentRecipientPresenter2.args;
                    PersonalizePaymentRecipientViewEvent personalizePaymentRecipientViewEvent = (PersonalizePaymentRecipientViewEvent) obj2;
                    boolean z = personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.ReloadResources;
                    MutableState mutableState6 = mutableState;
                    Continuation continuation2 = null;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    if (z) {
                        JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentRecipientPresenter$models$2$1(personalizePaymentRecipientPresenter2, mutableState6, continuation2, 2), 3);
                    } else if (personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.Close) {
                        if (personalizePaymentRecipientPresenter2.isMusicEnabled) {
                            personalizePaymentRecipientPresenter2.musicPlayer.stop();
                        }
                        personalizePaymentRecipientPresenter2.analytics.track(new ActivityRecordViewClosePersonalization(personalizePaymentRecipient.source, personalizePaymentRecipient.entity.entity_token), null);
                        screenNavigator.goTo(Back.INSTANCE);
                    } else if (personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.CloseDialog) {
                        mutableState6.setValue(null);
                    } else {
                        boolean z2 = personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.ReplyButtonTapped;
                        MutableState mutableState7 = mutableState3;
                        MutableState mutableState8 = mutableState2;
                        if (z2) {
                            if (((PersonalizedPaymentLoadingState) mutableState8.getValue()) instanceof PersonalizedPaymentLoadingState.Loaded) {
                                PersonalizedPaymentLoadingState personalizedPaymentLoadingState = (PersonalizedPaymentLoadingState) mutableState8.getValue();
                                personalizedPaymentLoadingState.getClass();
                                mutableState7.setValue(new PersonalizedPaymentsReactionsState.ShowingQuickReactions(((PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState).reactions.quickReactions));
                            }
                        } else if (personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.ReactionTapped) {
                            PersonalizePaymentRecipientViewEvent.ReactionTapped reactionTapped = (PersonalizePaymentRecipientViewEvent.ReactionTapped) personalizePaymentRecipientViewEvent;
                            mutableState7.setValue(new PersonalizedPaymentsReactionsState.PendingReaction(reactionTapped.reaction));
                            if (personalizePaymentRecipientPresenter2.useActivityService) {
                                JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentRecipientPresenter$models$7$2(personalizePaymentRecipientPresenter2, personalizePaymentRecipientViewEvent, mutableState3, mutableState8, null), 3);
                            } else {
                                RealReactionManager realReactionManager = personalizePaymentRecipientPresenter2.reactionManager;
                                String str = personalizePaymentRecipientPresenter2.args.entity.entity_token;
                                str.getClass();
                                RealReactionManager.addReaction$default(realReactionManager, str, null, reactionTapped.reaction, "PERSONALIZED_PAYMENT", null, 32);
                            }
                        } else if (!(personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.ExistingReactionTapped)) {
                            if ((personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.DismissOverlay) || Intrinsics.areEqual(personalizePaymentRecipientViewEvent, PersonalizePaymentRecipientViewEvent.HideMoreReactions.INSTANCE)) {
                                mutableState7.setValue(PersonalizedPaymentsReactionsState.ReactionsAvailable.INSTANCE);
                            } else if (personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.ShowMoreReactions) {
                                if (((PersonalizedPaymentLoadingState) mutableState8.getValue()) instanceof PersonalizedPaymentLoadingState.Loaded) {
                                    PersonalizedPaymentLoadingState personalizedPaymentLoadingState2 = (PersonalizedPaymentLoadingState) mutableState8.getValue();
                                    personalizedPaymentLoadingState2.getClass();
                                    mutableState7.setValue(new PersonalizedPaymentsReactionsState.ShowingExtendedReactions(((PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState2).reactions.extendedReactions));
                                }
                            } else if (personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.OnCanvasDrawn) {
                                mutableState4.setValue(((PersonalizePaymentRecipientViewEvent.OnCanvasDrawn) personalizePaymentRecipientViewEvent).canvasDetails);
                            } else if (personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.TextMeasured) {
                                MutableState mutableState9 = mutableState5;
                                PersonalizePaymentRecipientViewEvent.TextMeasured textMeasured = (PersonalizePaymentRecipientViewEvent.TextMeasured) personalizePaymentRecipientViewEvent;
                                mutableState9.setValue(MapsKt__MapsKt.plus((Map) mutableState9.getValue(), MapsKt__MapsJVMKt.mapOf(new Pair(new Integer(textMeasured.text.id), textMeasured.size))));
                            } else {
                                if (!(personalizePaymentRecipientViewEvent instanceof PersonalizePaymentRecipientViewEvent.ReceiptTapped)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                String str2 = personalizePaymentRecipient.entity.entity_token;
                                str2.getClass();
                                screenNavigator.goTo(new HistoryScreens.PaymentReceipt(str2, null, null, null, null, 62));
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$pools$presenters$PoolMemberListPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope, (MoleculePresenter) this.this$0, (MutableState) this.$applicationName, (State) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) this.$initializer, (MutableState) this.$manifestUrlFlow, 13);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$pools$presenters$PoolMemberListPresenter$models$4$3(Object obj) {
        int i;
        String str;
        Object removePoolParticipants;
        String format2;
        String str2;
        MutableState mutableState = (MutableState) this.$serializersModule;
        MutableState mutableState2 = (MutableState) this.$freshnessChecker;
        PoolMemberListPresenter poolMemberListPresenter = (PoolMemberListPresenter) this.L$1;
        AndroidStringManager androidStringManager = poolMemberListPresenter.stringManager;
        Analytics analytics = poolMemberListPresenter.analytics;
        PoolMemberListScreen poolMemberListScreen = poolMemberListPresenter.args;
        PoolMemberListViewEvent poolMemberListViewEvent = (PoolMemberListViewEvent) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            if (poolMemberListScreen.viewerCanLeavePool) {
                PoolMemberListViewEvent.RemovePerson removePerson = (PoolMemberListViewEvent.RemovePerson) poolMemberListViewEvent;
                if (Intrinsics.areEqual(removePerson.personToken, PlatformKt.activeAccountTokenOrNull(poolMemberListPresenter.sessionManager)) && !Intrinsics.areEqual(removePerson.personToken, ((PoolOwner) poolMemberListScreen.poolOwner.getValue()).customer_token)) {
                    zzahx.trackLeavePoolStart(analytics, poolMemberListScreen.token, poolMemberListScreen.flowToken, poolMemberListScreen.goalAmount, poolMemberListScreen.contributionTotal);
                    poolMemberListPresenter.navigator.goTo(((RealFlowStarter) poolMemberListPresenter.blockersNavigator).startLeavePoolFlow(poolMemberListScreen.token, poolMemberListScreen.leavePoolOrigin));
                    return Unit.INSTANCE;
                }
            }
            String str3 = poolMemberListScreen.flowToken;
            String str4 = poolMemberListScreen.token;
            PoolMemberListViewEvent.RemovePerson removePerson2 = (PoolMemberListViewEvent.RemovePerson) poolMemberListViewEvent;
            String str5 = removePerson2.personToken;
            Iterator it = ((ImmutableList) ((State) this.this$0).getValue()).iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(((PoolListSection.PoolListPerson) it.next()).customerId, removePerson2.personToken)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            Integer num = new Integer(i);
            str3.getClass();
            str4.getClass();
            analytics.track(new AssetPoolRemovePoolMember(null, num, str3, str4, null, str5), null);
            mutableState2.setValue(CollectionsKt.plus((Collection) mutableState2.getValue(), (Object) removePerson2.personToken));
            for (PoolParticipant poolParticipant : (List) mutableState.getValue()) {
                if (Intrinsics.areEqual(poolParticipant.customer_identifier, removePerson2.personToken)) {
                    str = poolParticipant.full_name;
                    str.getClass();
                    RealPoolsRepository realPoolsRepository = poolMemberListPresenter.poolsRepository;
                    String str6 = poolMemberListScreen.token;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(removePerson2.personToken);
                    this.$applicationName = str;
                    this.label = 1;
                    removePoolParticipants = realPoolsRepository.removePoolParticipants(str6, listOf, this);
                    if (removePoolParticipants == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
            return null;
        }
        if (i2 != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str7 = (String) this.$applicationName;
        SafeTrace.throwOnFailure(obj);
        str = str7;
        removePoolParticipants = obj;
        RemovePoolParticipantFailureReason removePoolParticipantFailureReason = (RemovePoolParticipantFailureReason) removePoolParticipants;
        if (removePoolParticipantFailureReason == null) {
            List list = (List) mutableState.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!Intrinsics.areEqual(((PoolParticipant) obj2).customer_identifier, ((PoolMemberListViewEvent.RemovePerson) poolMemberListViewEvent).personToken)) {
                    arrayList.add(obj2);
                }
            }
            mutableState.setValue(arrayList);
            MutableState mutableState3 = (MutableState) this.$initializer;
            str.getClass();
            ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "name", str);
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.pools_member_list_successful_removal_title)).format(m);
            format3.getClass();
            mutableState3.setValue(new MemberStatusUpdateSnackBarViewModel(format3, androidStringManager.get(R.string.pools_member_list_successful_removal_subtitle)));
        } else {
            MutableState mutableState4 = (MutableState) this.$manifestUrlFlow;
            Resources resources2 = androidStringManager.resources;
            boolean z = removePoolParticipantFailureReason instanceof RemovePoolParticipantFailureReason.HttpFailure;
            RemovePoolParticipantFailureReason.NetworkFailure networkFailure = RemovePoolParticipantFailureReason.NetworkFailure.INSTANCE;
            if (z || removePoolParticipantFailureReason.equals(networkFailure)) {
                str.getClass();
                ArrayMap arrayMap = new ArrayMap(1);
                arrayMap.put("name", str);
                resources2.getClass();
                format2 = new MessageFormat(resources2.getString(R.string.pools_remove_error_title)).format(arrayMap);
                format2.getClass();
            } else {
                if (!(removePoolParticipantFailureReason instanceof RemovePoolParticipantFailureReason.SuccessfulRequestFailureReason)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str.getClass();
                ArrayMap arrayMap2 = new ArrayMap(1);
                arrayMap2.put("name", str);
                resources2.getClass();
                format2 = new MessageFormat(resources2.getString(R.string.pools_member_list_unable_to_remove_title_already_contributed)).format(arrayMap2);
                format2.getClass();
            }
            if (removePoolParticipantFailureReason.equals(RemovePoolParticipantFailureReason.HttpFailure.INSTANCE) || removePoolParticipantFailureReason.equals(networkFailure)) {
                str2 = androidStringManager.get(R.string.pools_member_list_failed_to_remove_subtitle_http_failure);
            } else {
                if (!(removePoolParticipantFailureReason instanceof RemovePoolParticipantFailureReason.SuccessfulRequestFailureReason)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RemoveCustomersFromPoolResponse.FailureReason failureReason = (RemoveCustomersFromPoolResponse.FailureReason) CollectionsKt.firstOrNull((List) ((RemovePoolParticipantFailureReason.SuccessfulRequestFailureReason) removePoolParticipantFailureReason).errors);
                int i4 = failureReason == null ? -1 : PoolMemberListPresenter.WhenMappings.$EnumSwitchMapping$0[failureReason.ordinal()];
                str2 = i4 != 1 ? i4 != 2 ? androidStringManager.get(R.string.pools_member_list_failed_to_remove_subtitle_http_failure) : androidStringManager.get(R.string.pools_member_list_unable_to_remove_subtitle_pool_closed) : androidStringManager.get(R.string.pools_member_list_unable_to_remove_subtitle_already_contributed);
            }
            mutableState4.setValue(new FailureDialogViewModel(format2, str2));
        }
        mutableState2.setValue(CollectionsKt.minus((List) mutableState2.getValue(), ((PoolMemberListViewEvent.RemovePerson) poolMemberListViewEvent).personToken));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope, (MoleculePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) this.$initializer, (MutableState) this.$manifestUrlFlow, 14);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$profile$presenters$ProfilePresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.L$1;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, (ProfilePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (State) this.$serializersModule, (State) this.$initializer, (MutableState) this.$manifestUrlFlow, 16);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$manifestUrlFlow;
        Object obj3 = this.$initializer;
        switch (i) {
            case 0:
                ZiplineLoader$load$2 ziplineLoader$load$2 = new ZiplineLoader$load$2((ZiplineLoader) this.this$0, (String) this.$applicationName, (RealConnectionPool) this.$freshnessChecker, (SerializersModule) this.$serializersModule, (RealImageLoader$execute$2) obj3, (ChannelFlowTransformLatest) obj2, continuation, 0);
                ziplineLoader$load$2.L$0 = obj;
                return ziplineLoader$load$2;
            case 1:
                ZiplineLoader$load$2 ziplineLoader$load$22 = new ZiplineLoader$load$2((HCaptcha) obj3, (String) this.$applicationName, (AndroidCameraState) obj2, continuation);
                ziplineLoader$load$22.L$0 = obj;
                return ziplineLoader$load$22;
            case 2:
                ZiplineLoader$load$2 ziplineLoader$load$23 = new ZiplineLoader$load$2((Recomposer) this.L$1, (AppWidgetSession) this.this$0, (StateFlowImpl) this.$applicationName, (Context) this.$freshnessChecker, (RemoteViewsRoot) this.$serializersModule, (TimerScopeKt$withTimer$2$1$blockScope$1) obj3, (TimeoutOptions) obj2, continuation);
                ziplineLoader$load$23.L$0 = obj;
                return ziplineLoader$load$23;
            case 3:
                ZiplineLoader$load$2 ziplineLoader$load$24 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (LocalAddBrandsPresenter) this.this$0, (SnapshotStateList) this.$applicationName, (SnapshotStateList) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 3);
                ziplineLoader$load$24.L$0 = obj;
                return ziplineLoader$load$24;
            case 4:
                return new ZiplineLoader$load$2((OrderBuilderEvent) this.L$1, (RealOrderBuilder) this.L$0, (MutableState) this.this$0, (State) this.$applicationName, (State) this.$freshnessChecker, (State) this.$serializersModule, (State) obj3, (MutableState) obj2, continuation, 4);
            case 5:
                return new ZiplineLoader$load$2((OrderWorkflow) this.L$1, (RealOrderBuilder) this.L$0, (MutableState) this.this$0, (State) this.$applicationName, (State) this.$freshnessChecker, (State) this.$serializersModule, (State) obj3, (MutableState) obj2, continuation, 5);
            case 6:
                return new ZiplineLoader$load$2((CartBuilder) this.L$1, (LocalBrandProfilePresenter) this.L$0, (BrandSpot) this.this$0, (String) this.$applicationName, (String) this.$freshnessChecker, (Function0) this.$serializersModule, (Function1) obj3, (MutableState) obj2, continuation, 6);
            case 7:
                ZiplineLoader$load$2 ziplineLoader$load$25 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (FulfillmentPickerPresenter) this.this$0, (MutableState) this.$applicationName, (State) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 7);
                ziplineLoader$load$25.L$0 = obj;
                return ziplineLoader$load$25;
            case 8:
                return new ZiplineLoader$load$2((LocalPosCheckInViewModel) this.L$0, (Context) this.this$0, (LifecycleOwner) this.$applicationName, (Preview) this.$freshnessChecker, (ImageAnalysis) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, continuation, 8);
            case 9:
                ZiplineLoader$load$2 ziplineLoader$load$26 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (AccountPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (State) obj3, (MutableState) obj2, 9);
                ziplineLoader$load$26.L$0 = obj;
                return ziplineLoader$load$26;
            case 10:
                ZiplineLoader$load$2 ziplineLoader$load$27 = new ZiplineLoader$load$2((LocalHomePresenter) this.this$0, (MutableState) this.$applicationName, (SnapshotStateMap) this.$freshnessChecker, (Ref$ObjectRef) this.L$1, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, continuation);
                ziplineLoader$load$27.L$0 = obj;
                return ziplineLoader$load$27;
            case 11:
                return new ZiplineLoader$load$2((Flow) this.L$0, (MutableState) this.this$0, (LocalHomePresenter) this.$applicationName, (SnapshotStateMap) this.$freshnessChecker, (Ref$ObjectRef) this.L$1, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, continuation);
            case 12:
                return new ZiplineLoader$load$2((BiometricsPromptBinding) obj3, (BiometricsPromptBinding.BiometricsPromptBreadcrumb) obj2, continuation);
            case 13:
                ZiplineLoader$load$2 ziplineLoader$load$28 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (PaymentLoadingPresenter) this.this$0, (State) this.$applicationName, (State) this.$freshnessChecker, (State) this.$serializersModule, (State) obj3, (State) obj2, 13);
                ziplineLoader$load$28.L$0 = obj;
                return ziplineLoader$load$28;
            case 14:
                ZiplineLoader$load$2 ziplineLoader$load$29 = new ZiplineLoader$load$2((BitcoinTransferPresenter) this.this$0, (BigDecimal) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, continuation, 14);
                ziplineLoader$load$29.L$0 = obj;
                return ziplineLoader$load$29;
            case 15:
                ZiplineLoader$load$2 ziplineLoader$load$210 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (LocalEditorialPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 15);
                ziplineLoader$load$210.L$0 = obj;
                return ziplineLoader$load$210;
            case 16:
                ZiplineLoader$load$2 ziplineLoader$load$211 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (SnapshotStateSet) this.this$0, (CardStudioPresenter) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, 16);
                ziplineLoader$load$211.L$0 = obj;
                return ziplineLoader$load$211;
            case 17:
                ZiplineLoader$load$2 ziplineLoader$load$212 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (PoolsListPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 17);
                ziplineLoader$load$212.L$0 = obj;
                return ziplineLoader$load$212;
            case 18:
                ZiplineLoader$load$2 ziplineLoader$load$213 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (LocalHomePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (State) obj2, 18);
                ziplineLoader$load$213.L$0 = obj;
                return ziplineLoader$load$213;
            case 19:
                return new ZiplineLoader$load$2((RealGlobalSearchRepository) this.L$1, (List) this.L$0, (List) this.this$0, (String) this.$applicationName, (String) this.$freshnessChecker, (SearchRequest.Origin) this.$serializersModule, (String) obj3, (List) obj2, continuation, 19);
            case 20:
                ZiplineLoader$load$2 ziplineLoader$load$214 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (RealBugReportSenderFactory) this.this$0, (GrowToolsManagerState) this.$applicationName, (CoroutineScope) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 20);
                ziplineLoader$load$214.L$0 = obj;
                return ziplineLoader$load$214;
            case 21:
                ZiplineLoader$load$2 ziplineLoader$load$215 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (MoneyTabPresenter) this.this$0, (CoroutineScope) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 21);
                ziplineLoader$load$215.L$0 = obj;
                return ziplineLoader$load$215;
            case 22:
                ZiplineLoader$load$2 ziplineLoader$load$216 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (OffersHomePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 22);
                ziplineLoader$load$216.L$0 = obj;
                return ziplineLoader$load$216;
            case 23:
                ZiplineLoader$load$2 ziplineLoader$load$217 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (TabToolbarPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 23);
                ziplineLoader$load$217.L$0 = obj;
                return ziplineLoader$load$217;
            case 24:
                ZiplineLoader$load$2 ziplineLoader$load$218 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (PersonalizePaymentRecipientPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 24);
                ziplineLoader$load$218.L$0 = obj;
                return ziplineLoader$load$218;
            case 25:
                ZiplineLoader$load$2 ziplineLoader$load$219 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (PoolMemberListPresenter) this.this$0, (MutableState) this.$applicationName, (State) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 25);
                ziplineLoader$load$219.L$0 = obj;
                return ziplineLoader$load$219;
            case 26:
                return new ZiplineLoader$load$2((PoolMemberListPresenter) this.L$1, (PoolMemberListViewEvent) this.L$0, (State) this.this$0, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, continuation);
            case 27:
                ZiplineLoader$load$2 ziplineLoader$load$220 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (LocalEditorialPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj3, (MutableState) obj2, 27);
                ziplineLoader$load$220.L$0 = obj;
                return ziplineLoader$load$220;
            case 28:
                ZiplineLoader$load$2 ziplineLoader$load$221 = new ZiplineLoader$load$2((Flow) this.L$1, continuation, (ProfilePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (State) this.$serializersModule, (State) obj3, (MutableState) obj2, 28);
                ziplineLoader$load$221.L$0 = obj;
                return ziplineLoader$load$221;
            default:
                return new ZiplineLoader$load$2((Category.CategoryType.ChannelList) this.L$0, (ChannelListPresenter) this.this$0, (String) this.$applicationName, (ChannelListViewEvent) this.$freshnessChecker, (MutableState) this.$serializersModule, (State) obj3, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((ZiplineLoader$load$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x059a, code lost:
    
        if (r1 == r13) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x052e, code lost:
    
        if (r0 != r13) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044c, code lost:
    
        if (r3 == r13) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0730, code lost:
    
        if (r2 == r0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0b7d, code lost:
    
        if (((kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest) r11).collect(r0, r29) == r13) goto L418;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0aad A[Catch: all -> 0x09ce, TryCatch #1 {all -> 0x09ce, blocks: (B:397:0x09c0, B:399:0x0aa9, B:401:0x0aad, B:403:0x0ac7, B:404:0x0aca, B:406:0x0ad0, B:407:0x0ad3, B:409:0x0ad9, B:410:0x0adc, B:412:0x0ae2, B:419:0x0a2d, B:421:0x0a3c, B:422:0x0a4b, B:424:0x0a51, B:425:0x0a5d, B:427:0x0a63, B:428:0x0a83, B:430:0x0a89, B:431:0x0a95), top: B:396:0x09c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0a2d A[Catch: all -> 0x09ce, TRY_ENTER, TryCatch #1 {all -> 0x09ce, blocks: (B:397:0x09c0, B:399:0x0aa9, B:401:0x0aad, B:403:0x0ac7, B:404:0x0aca, B:406:0x0ad0, B:407:0x0ad3, B:409:0x0ad9, B:410:0x0adc, B:412:0x0ae2, B:419:0x0a2d, B:421:0x0a3c, B:422:0x0a4b, B:424:0x0a51, B:425:0x0a5d, B:427:0x0a63, B:428:0x0a83, B:430:0x0a89, B:431:0x0a95), top: B:396:0x09c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0af2  */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlinx.coroutines.Deferred, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r0v15, types: [kotlinx.coroutines.Deferred, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r0v17, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r0v19, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.camera.camera2.pipe.compat.AndroidCameraState] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:386:0x0aa5 -> B:353:0x0aa9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$loadFromLocal;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        AndroidCameraState androidCameraState;
        Continuation continuation;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        CoroutineScope coroutineScope;
        Ref$ObjectRef ref$ObjectRef5;
        Continuation continuation2;
        Object marketingCouponOfferDetails;
        GetMarketingCouponOfferDetailsResponse.CouponOfferDetails couponOfferDetails;
        Object await;
        ProcessCameraProvider processCameraProvider;
        AndroidBiometricsStore androidBiometricsStore;
        Activity findActivity;
        Object first;
        Object first2;
        Activity activity;
        AndroidBiometricsStore androidBiometricsStore2;
        String str;
        Object first3;
        AndroidBiometricsStore androidBiometricsStore3;
        CharSequence charSequence;
        Object first4;
        CharSequence charSequence2;
        AndroidBiometricsStore androidBiometricsStore4;
        Activity activity2;
        String str2;
        CharSequence charSequence3;
        Object first5;
        AndroidBiometricsStore androidBiometricsStore5;
        CharSequence charSequence4;
        Object read$default;
        BiometricsReadResult biometricsReadResult;
        BiometricsReadResult success;
        Object first6;
        Function1 function1;
        Object withContext;
        SponsoredAccount sponsoredAccount;
        Object obj2;
        Object withContext2;
        List list;
        Object obj3;
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 6;
        int i4 = 2;
        Object obj4 = this.$manifestUrlFlow;
        Object obj5 = this.$initializer;
        int i5 = 1;
        ?? r12 = 0;
        r12 = 0;
        switch (i) {
            case 0:
                RealImageLoader$execute$2 realImageLoader$execute$2 = (RealImageLoader$execute$2) obj5;
                String str3 = (String) this.$applicationName;
                ZiplineLoader ziplineLoader = (ZiplineLoader) this.this$0;
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    long longValue = ((Number) ((Function0) ziplineLoader.nowEpochMs).invoke()).longValue();
                    RealConnectionPool realConnectionPool = (RealConnectionPool) this.$freshnessChecker;
                    SerializersModule serializersModule = (SerializersModule) this.$serializersModule;
                    this.L$0 = producerScope;
                    this.L$1 = m;
                    this.label = 1;
                    access$loadFromLocal = ZiplineLoader.access$loadFromLocal(ziplineLoader, producerScope, longValue, str3, realConnectionPool, serializersModule, realImageLoader$execute$2, this);
                    realImageLoader$execute$2 = realImageLoader$execute$2;
                    if (access$loadFromLocal != coroutineSingletons) {
                        ref$ObjectRef = m;
                    }
                    return coroutineSingletons;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) this.L$1;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef = ref$ObjectRef6;
                access$loadFromLocal = obj;
                ZiplineManifest ziplineManifest = (ZiplineManifest) access$loadFromLocal;
                if (ziplineManifest == null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(ziplineLoader, producerScope, ref$ObjectRef, str3, (SerializersModule) this.$serializersModule, realImageLoader$execute$2, 0);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    break;
                } else {
                    ref$ObjectRef.element = ziplineManifest;
                    return Unit.INSTANCE;
                }
            case 1:
                String str4 = (String) this.$applicationName;
                HCaptcha hCaptcha = (HCaptcha) obj5;
                AndroidCameraState androidCameraState2 = (AndroidCameraState) obj4;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                Continuation continuation3 = null;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    ref$ObjectRef2 = new Ref$ObjectRef();
                    androidCameraState = androidCameraState2;
                    continuation = null;
                    ref$ObjectRef2.element = JobKt.async$default(coroutineScope2, null, null, new SliderDraggableState$drag$2(hCaptcha, str4, androidCameraState2, continuation3, 7), 3);
                    ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef3.element = JobKt.async$default(coroutineScope2, null, null, new ThumbNode$onAttach$1(androidCameraState, continuation, 8), 3);
                    ref$ObjectRef4 = new Ref$ObjectRef();
                    ref$ObjectRef4.element = JobKt.launch$default(coroutineScope2, null, null, new SessionWorkerKt$runSession$snapshotMonitor$1(i4, continuation, i5), 3);
                    Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                    ref$ObjectRef7.element = JobKt.launch$default(coroutineScope2, null, null, new ThumbNode$onAttach$1(hCaptcha, continuation, i2), 3);
                    coroutineScope = coroutineScope2;
                    ref$ObjectRef5 = ref$ObjectRef7;
                    if (JobKt.isActive(coroutineScope)) {
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef5 = (Ref$ObjectRef) this.$serializersModule;
                    Ref$ObjectRef ref$ObjectRef8 = (Ref$ObjectRef) this.$freshnessChecker;
                    Ref$ObjectRef ref$ObjectRef9 = (Ref$ObjectRef) this.this$0;
                    Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) this.L$1;
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        ref$ObjectRef4 = ref$ObjectRef8;
                        ref$ObjectRef3 = ref$ObjectRef9;
                        ref$ObjectRef2 = ref$ObjectRef10;
                        coroutineScope = coroutineScope3;
                        ?? r11 = 0;
                        Object doSelect = obj;
                        OpenCameraResult openCameraResult = (OpenCameraResult) doSelect;
                        if (openCameraResult == null) {
                            Log.i("CXCP", "Camera open completed: " + openCameraResult);
                            ?? r0 = (Deferred) ref$ObjectRef2.element;
                            if (r0 != 0) {
                                r0.cancel(r11);
                            }
                            ?? r02 = (Deferred) ref$ObjectRef3.element;
                            if (r02 != 0) {
                                r02.cancel(r11);
                            }
                            ?? r03 = (Job) ref$ObjectRef4.element;
                            if (r03 != 0) {
                                r03.cancel(r11);
                            }
                            ?? r04 = (Job) ref$ObjectRef5.element;
                            if (r04 != 0) {
                                r04.cancel(r11);
                            }
                            return openCameraResult;
                        }
                        continuation = r11;
                        androidCameraState = androidCameraState2;
                        if (JobKt.isActive(coroutineScope)) {
                            return new OpenCameraResult(continuation, new CameraError(12), 1);
                        }
                        SelectImplementation selectImplementation = new SelectImplementation(getContext());
                        Deferred deferred = (Deferred) ref$ObjectRef2.element;
                        if (deferred != null) {
                            selectImplementation.invoke(deferred.getOnAwait(), new CameraStateOpener$tryOpenCamera$2$result$1$1(ref$ObjectRef2, str4, continuation, 0));
                        }
                        Deferred deferred2 = (Deferred) ref$ObjectRef3.element;
                        if (deferred2 != null) {
                            selectImplementation.invoke(deferred2.getOnAwait(), new CameraStateOpener$tryOpenCamera$2$result$1$1(ref$ObjectRef3, str4, continuation, 1));
                        }
                        Job job = (Job) ref$ObjectRef4.element;
                        if (job != null) {
                            Continuation continuation4 = continuation;
                            AndroidCameraState androidCameraState3 = androidCameraState;
                            androidCameraState2 = androidCameraState3;
                            continuation2 = continuation4;
                            selectImplementation.invoke(job.getOnJoin(), new CardScene$applyIconToMaterial$1(ref$ObjectRef4, ref$ObjectRef2, androidCameraState3, continuation4, 1));
                        } else {
                            androidCameraState2 = androidCameraState;
                            continuation2 = continuation;
                        }
                        Job job2 = (Job) ref$ObjectRef5.element;
                        if (job2 != null) {
                            selectImplementation.invoke(job2.getOnJoin(), new Pager$pageFetcher$2(ref$ObjectRef5, continuation2, i5));
                        }
                        this.L$0 = coroutineScope;
                        this.L$1 = ref$ObjectRef2;
                        this.this$0 = ref$ObjectRef3;
                        this.$freshnessChecker = ref$ObjectRef4;
                        this.$serializersModule = ref$ObjectRef5;
                        this.label = 1;
                        doSelect = selectImplementation.doSelect(this);
                        r11 = continuation2;
                        if (doSelect == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        OpenCameraResult openCameraResult2 = (OpenCameraResult) doSelect;
                        if (openCameraResult2 == null) {
                        }
                    } catch (Throwable th) {
                        Log.e("CXCP", "Unexpected throwable during camera opening!", th);
                        throw th;
                    }
                }
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    Recomposer recomposer = (Recomposer) this.L$1;
                    ref$LongRef.element = recomposer.changeCount;
                    StateFlowImpl stateFlowImpl = recomposer._state;
                    SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$1 = new SessionWorkerKt$runSession$4$1((AppWidgetSession) this.this$0, recomposer, ref$LongRef, (StateFlowImpl) this.$applicationName, (Context) this.$freshnessChecker, (RemoteViewsRoot) this.$serializersModule, (TimerScopeKt$withTimer$2$1$blockScope$1) obj5, (TimeoutOptions) obj4, coroutineScope4, (Continuation) null, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowImpl, sessionWorkerKt$runSession$4$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.L$1;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope5, (LocalAddBrandsPresenter) this.this$0, (SnapshotStateList) this.$applicationName, (SnapshotStateList) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj5, (MutableState) obj4, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OrderWorkflow orderWorkflow = ((OrderBuilderEvent.CreateOrderWithWorkflow) ((OrderBuilderEvent) this.L$1)).orderWorkflow;
                    this.label = 1;
                    if (RealOrderBuilder.models$createOrder((RealOrderBuilder) this.L$0, (MutableState) this.this$0, (State) this.$applicationName, (State) this.$freshnessChecker, (State) this.$serializersModule, (State) obj5, (MutableState) obj4, orderWorkflow, false, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OrderWorkflow orderWorkflow2 = (OrderWorkflow) this.L$1;
                    this.label = 1;
                    if (RealOrderBuilder.models$createOrder((RealOrderBuilder) this.L$0, (MutableState) this.this$0, (State) this.$applicationName, (State) this.$freshnessChecker, (State) this.$serializersModule, (State) obj5, (MutableState) obj4, orderWorkflow2, true, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                Function1 function12 = (Function1) obj5;
                MutableState mutableState = (MutableState) obj4;
                CartBuilder cartBuilder = (CartBuilder) this.L$1;
                String str5 = (String) this.$freshnessChecker;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (DiscountCodeKt.getOfferToken(((RealCartBuilder) cartBuilder).discountCodes) != null) {
                        mutableState.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    LocalService localService = ((LocalBrandProfilePresenter) this.L$0).service;
                    GetMarketingCouponOfferDetailsRequest getMarketingCouponOfferDetailsRequest = new GetMarketingCouponOfferDetailsRequest(str5, ((BrandSpot) this.this$0).brandToken, (String) this.$applicationName, ByteString.EMPTY);
                    this.label = 1;
                    marketingCouponOfferDetails = localService.getMarketingCouponOfferDetails(getMarketingCouponOfferDetailsRequest, this);
                    if (marketingCouponOfferDetails == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    marketingCouponOfferDetails = obj;
                }
                ApiResult apiResult = (ApiResult) marketingCouponOfferDetails;
                mutableState.setValue(Boolean.TRUE);
                if (apiResult instanceof ApiResult.Success) {
                    RuntimeUtilsKt runtimeUtilsKt = ((GetMarketingCouponOfferDetailsResponse) ((ApiResult.Success) apiResult).response).response;
                    if (runtimeUtilsKt != null) {
                        GetMarketingCouponOfferDetailsResponse$Response$Details getMarketingCouponOfferDetailsResponse$Response$Details = runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$Details ? (GetMarketingCouponOfferDetailsResponse$Response$Details) runtimeUtilsKt : null;
                        if (getMarketingCouponOfferDetailsResponse$Response$Details != null) {
                            couponOfferDetails = getMarketingCouponOfferDetailsResponse$Response$Details.value;
                            if (runtimeUtilsKt != null) {
                                GetMarketingCouponOfferDetailsResponse$Response$Details getMarketingCouponOfferDetailsResponse$Response$Details2 = runtimeUtilsKt instanceof GetMarketingCouponOfferDetailsResponse$Response$Details ? (GetMarketingCouponOfferDetailsResponse$Response$Details) runtimeUtilsKt : null;
                                GetMarketingCouponOfferDetailsResponse.CouponOfferDetails couponOfferDetails2 = getMarketingCouponOfferDetailsResponse$Response$Details2 != null ? getMarketingCouponOfferDetailsResponse$Response$Details2.value : null;
                                if (couponOfferDetails2 != null) {
                                    r12 = couponOfferDetails2.coupon_code;
                                }
                            }
                            if (couponOfferDetails != null || r12 == 0) {
                                function12.invoke(str5);
                            } else {
                                ((RealCartBuilder) cartBuilder).applyOffer(new DiscountCode.Entered(r12));
                                ((Function0) this.$serializersModule).invoke();
                            }
                        }
                    }
                    couponOfferDetails = null;
                    if (runtimeUtilsKt != null) {
                    }
                    if (couponOfferDetails != null) {
                    }
                    function12.invoke(str5);
                } else {
                    function12.invoke(str5);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.L$1;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$12 = new MerchantProfilePresenter$models$2$1$1(coroutineScope6, (MoleculePresenter) this.this$0, (MutableState) this.$applicationName, (State) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj5, (MutableState) obj4, 2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(merchantProfilePresenter$models$2$1$12, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                MutableState mutableState2 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((LocalPosCheckInViewModel) this.L$0).canStartCamera) {
                        mutableState2.setValue(null);
                        ((MutableState) obj4).setValue(null);
                        return Unit.INSTANCE;
                    }
                    ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
                    Context context = (Context) this.this$0;
                    context.getClass();
                    this.label = 1;
                    await = RecipientAvatars.await(SwitchViewKt.getInstance(context), this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        processCameraProvider = (ProcessCameraProvider) this.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        } catch (Throwable th2) {
                            th = th2;
                            processCameraProvider.unbindAll();
                            throw th;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                    await = obj;
                }
                ProcessCameraProvider processCameraProvider3 = (ProcessCameraProvider) await;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.$applicationName;
                CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
                cameraSelector.getClass();
                mutableState2.setValue(processCameraProvider3.bindToLifecycle(lifecycleOwner, cameraSelector, (Preview) this.$freshnessChecker, (ImageAnalysis) this.$serializersModule));
                try {
                    this.L$1 = processCameraProvider3;
                    this.label = 2;
                    JobKt.awaitCancellation(this);
                    return coroutineSingletons9;
                } catch (Throwable th3) {
                    th = th3;
                    processCameraProvider = processCameraProvider3;
                    processCameraProvider.unbindAll();
                    throw th;
                }
            case 9:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$1;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$13 = new MerchantProfilePresenter$models$2$1$1(coroutineScope7, (AccountPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (State) obj5, (MutableState) obj4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(merchantProfilePresenter$models$2$1$13, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) localHomePresenter.clearMarketingBadgesIfNeeded;
                AfterpaySearchViewEvent.QueryUpdated queryUpdated = (AfterpaySearchViewEvent.QueryUpdated) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((InputFieldText) ((MutableState) this.$applicationName).getValue()).getValue().length() == 0) {
                        realAfterpayAppletAnalytics.searchFlowToken = Boxes$$ExternalSyntheticOutline1.m();
                    }
                    String obj6 = queryUpdated.query.getValue().toString();
                    obj6.getClass();
                    realAfterpayAppletAnalytics.query = obj6;
                    this.L$0 = null;
                    this.label = 1;
                    if (LocalHomePresenter.access$models$performSearch((SnapshotStateMap) this.$freshnessChecker, localHomePresenter, (Ref$ObjectRef) this.L$1, (MutableState) this.$serializersModule, (MutableState) this.$applicationName, (MutableState) obj5, (MutableState) obj4, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppLockMonitor$special$$inlined$map$2 debounceDuration = FlowKt.debounceDuration(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1((Flow) this.L$0, 9), new TabContentPresenter$models$4$1$1$1((MutableState) this.this$0, (Continuation) r12, i3), 3), new ActivityTabViewKt$$ExternalSyntheticLambda17(22));
                    ZiplineLoader$load$2 ziplineLoader$load$2 = new ZiplineLoader$load$2((LocalHomePresenter) this.$applicationName, (MutableState) this.this$0, (SnapshotStateMap) this.$freshnessChecker, (Ref$ObjectRef) this.L$1, (MutableState) this.$serializersModule, (MutableState) obj5, (MutableState) obj4, (Continuation) null);
                    this.label = 1;
                    if (FlowKt.collectLatest(debounceDuration, ziplineLoader$load$2, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                BiometricsPromptBinding biometricsPromptBinding = (BiometricsPromptBinding) obj5;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        androidBiometricsStore = biometricsPromptBinding.biometricsStore;
                        findActivity = Views.findActivity((BiometricsPromptBinding.BiometricsPromptBreadcrumb) obj4);
                        StateFlowImpl stateFlowImpl2 = biometricsPromptBinding.key;
                        this.L$1 = androidBiometricsStore;
                        this.L$0 = findActivity;
                        this.label = 1;
                        first = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl2, 24), this);
                        break;
                    case 1:
                        findActivity = (Activity) this.L$0;
                        androidBiometricsStore = (AndroidBiometricsStore) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                        Object obj7 = ((Optional) first).get();
                        obj7.getClass();
                        String str6 = (String) obj7;
                        StateFlowImpl stateFlowImpl3 = biometricsPromptBinding.title;
                        this.L$1 = androidBiometricsStore;
                        this.L$0 = findActivity;
                        this.$applicationName = str6;
                        this.label = 2;
                        first2 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl3, 24), this);
                        if (first2 != coroutineSingletons13) {
                            activity = findActivity;
                            androidBiometricsStore2 = androidBiometricsStore;
                            str = str6;
                            Object obj8 = ((Optional) first2).get();
                            obj8.getClass();
                            CharSequence charSequence5 = (CharSequence) obj8;
                            StateFlowImpl stateFlowImpl4 = biometricsPromptBinding.subtitle;
                            this.L$1 = androidBiometricsStore2;
                            this.L$0 = activity;
                            this.$applicationName = str;
                            this.this$0 = charSequence5;
                            this.label = 3;
                            first3 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl4, 24), this);
                            if (first3 != coroutineSingletons13) {
                                androidBiometricsStore3 = androidBiometricsStore2;
                                charSequence = charSequence5;
                                Optional optional = (Optional) first3;
                                optional.getClass();
                                CharSequence charSequence6 = (CharSequence) optional.orElse(null);
                                StateFlowImpl stateFlowImpl5 = biometricsPromptBinding.description;
                                this.L$1 = androidBiometricsStore3;
                                this.L$0 = activity;
                                this.$applicationName = str;
                                this.this$0 = charSequence;
                                this.$freshnessChecker = charSequence6;
                                this.label = 4;
                                first4 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl5, 24), this);
                                if (first4 != coroutineSingletons13) {
                                    Activity activity3 = activity;
                                    charSequence2 = charSequence;
                                    androidBiometricsStore4 = androidBiometricsStore3;
                                    activity2 = activity3;
                                    str2 = str;
                                    charSequence3 = charSequence6;
                                    Optional optional2 = (Optional) first4;
                                    optional2.getClass();
                                    CharSequence charSequence7 = (CharSequence) optional2.orElse(null);
                                    StateFlowImpl stateFlowImpl6 = biometricsPromptBinding.negativeButton;
                                    this.L$1 = androidBiometricsStore4;
                                    this.L$0 = activity2;
                                    this.$applicationName = str2;
                                    this.this$0 = charSequence2;
                                    this.$freshnessChecker = charSequence3;
                                    this.$serializersModule = charSequence7;
                                    this.label = 5;
                                    first5 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl6, 24), this);
                                    if (first5 != coroutineSingletons13) {
                                        androidBiometricsStore5 = androidBiometricsStore4;
                                        charSequence4 = charSequence7;
                                        Object obj9 = ((Optional) first5).get();
                                        obj9.getClass();
                                        Biometrics$Info biometrics$Info = new Biometrics$Info(charSequence2, charSequence3, charSequence4, (CharSequence) obj9);
                                        String str7 = str2;
                                        BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload = new BiometricsStore$AnalyticsPayload(null, null);
                                        this.L$1 = null;
                                        this.L$0 = null;
                                        this.$applicationName = null;
                                        this.this$0 = null;
                                        this.$freshnessChecker = null;
                                        this.$serializersModule = null;
                                        this.label = 6;
                                        read$default = AndroidBiometricsStore.read$default(androidBiometricsStore5, activity2, str7, biometrics$Info, biometricsStore$AnalyticsPayload, this);
                                        break;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons13;
                    case 2:
                        String str8 = (String) this.$applicationName;
                        Activity activity4 = (Activity) this.L$0;
                        AndroidBiometricsStore androidBiometricsStore6 = (AndroidBiometricsStore) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        str = str8;
                        androidBiometricsStore2 = androidBiometricsStore6;
                        activity = activity4;
                        first2 = obj;
                        Object obj82 = ((Optional) first2).get();
                        obj82.getClass();
                        CharSequence charSequence52 = (CharSequence) obj82;
                        StateFlowImpl stateFlowImpl42 = biometricsPromptBinding.subtitle;
                        this.L$1 = androidBiometricsStore2;
                        this.L$0 = activity;
                        this.$applicationName = str;
                        this.this$0 = charSequence52;
                        this.label = 3;
                        first3 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl42, 24), this);
                        if (first3 != coroutineSingletons13) {
                        }
                        return coroutineSingletons13;
                    case 3:
                        charSequence = (CharSequence) this.this$0;
                        str = (String) this.$applicationName;
                        activity = (Activity) this.L$0;
                        AndroidBiometricsStore androidBiometricsStore7 = (AndroidBiometricsStore) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        androidBiometricsStore3 = androidBiometricsStore7;
                        first3 = obj;
                        Optional optional3 = (Optional) first3;
                        optional3.getClass();
                        CharSequence charSequence62 = (CharSequence) optional3.orElse(null);
                        StateFlowImpl stateFlowImpl52 = biometricsPromptBinding.description;
                        this.L$1 = androidBiometricsStore3;
                        this.L$0 = activity;
                        this.$applicationName = str;
                        this.this$0 = charSequence;
                        this.$freshnessChecker = charSequence62;
                        this.label = 4;
                        first4 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl52, 24), this);
                        if (first4 != coroutineSingletons13) {
                        }
                        return coroutineSingletons13;
                    case 4:
                        CharSequence charSequence8 = (CharSequence) this.$freshnessChecker;
                        CharSequence charSequence9 = (CharSequence) this.this$0;
                        String str9 = (String) this.$applicationName;
                        Activity activity5 = (Activity) this.L$0;
                        AndroidBiometricsStore androidBiometricsStore8 = (AndroidBiometricsStore) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        charSequence3 = charSequence8;
                        androidBiometricsStore4 = androidBiometricsStore8;
                        activity2 = activity5;
                        str2 = str9;
                        charSequence2 = charSequence9;
                        first4 = obj;
                        Optional optional22 = (Optional) first4;
                        optional22.getClass();
                        CharSequence charSequence72 = (CharSequence) optional22.orElse(null);
                        StateFlowImpl stateFlowImpl62 = biometricsPromptBinding.negativeButton;
                        this.L$1 = androidBiometricsStore4;
                        this.L$0 = activity2;
                        this.$applicationName = str2;
                        this.this$0 = charSequence2;
                        this.$freshnessChecker = charSequence3;
                        this.$serializersModule = charSequence72;
                        this.label = 5;
                        first5 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl62, 24), this);
                        if (first5 != coroutineSingletons13) {
                        }
                        return coroutineSingletons13;
                    case 5:
                        charSequence4 = (CharSequence) this.$serializersModule;
                        charSequence3 = (CharSequence) this.$freshnessChecker;
                        charSequence2 = (CharSequence) this.this$0;
                        str2 = (String) this.$applicationName;
                        activity2 = (Activity) this.L$0;
                        androidBiometricsStore5 = (AndroidBiometricsStore) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        first5 = obj;
                        Object obj92 = ((Optional) first5).get();
                        obj92.getClass();
                        Biometrics$Info biometrics$Info2 = new Biometrics$Info(charSequence2, charSequence3, charSequence4, (CharSequence) obj92);
                        String str72 = str2;
                        BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload2 = new BiometricsStore$AnalyticsPayload(null, null);
                        this.L$1 = null;
                        this.L$0 = null;
                        this.$applicationName = null;
                        this.this$0 = null;
                        this.$freshnessChecker = null;
                        this.$serializersModule = null;
                        this.label = 6;
                        read$default = AndroidBiometricsStore.read$default(androidBiometricsStore5, activity2, str72, biometrics$Info2, biometricsStore$AnalyticsPayload2, this);
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        read$default = obj;
                        BiometricsStore$BiometricsResult biometricsStore$BiometricsResult = (BiometricsStore$BiometricsResult) read$default;
                        if (!(biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.DecryptionFailure)) {
                            if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Error) {
                                Biometrics$Result.Error error = ((BiometricsStore$BiometricsResult.Error) biometricsStore$BiometricsResult).error;
                                if ((error instanceof Biometrics$Result.Error.UserCanceled) || (error instanceof Biometrics$Result.Error.NegativeButton)) {
                                    biometricsReadResult = BiometricsReadResult.UserCancelled.INSTANCE;
                                } else if (error instanceof Biometrics$Result.Error.Lockout) {
                                    biometricsReadResult = BiometricsReadResult.LockedOut.INSTANCE;
                                } else {
                                    success = new BiometricsReadResult.Unspecified(error.getErrorString().toString());
                                    biometricsReadResult = success;
                                }
                            } else {
                                if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.PlatformException) {
                                    success = new BiometricsReadResult.Unspecified(((BiometricsStore$BiometricsResult.PlatformException) biometricsStore$BiometricsResult).cause.getMessage());
                                } else if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Success) {
                                    success = new BiometricsReadResult.Success(((BiometricsStore$BiometricsResult.Success) biometricsStore$BiometricsResult).value);
                                } else {
                                    if (biometricsStore$BiometricsResult != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    biometricsReadResult = BiometricsReadResult.NoValue.INSTANCE;
                                }
                                biometricsReadResult = success;
                            }
                            Optional optional4 = (Optional) first6;
                            optional4.getClass();
                            function1 = (Function1) optional4.orElse(null);
                            if (function1 != null) {
                                function1.invoke(biometricsReadResult);
                            }
                            return Unit.INSTANCE;
                        }
                        biometricsReadResult = BiometricsReadResult.DecryptionFailure.INSTANCE;
                        StateFlowImpl stateFlowImpl7 = biometricsPromptBinding.onResult;
                        this.L$1 = null;
                        this.L$0 = biometricsReadResult;
                        this.label = 7;
                        first6 = FlowKt.first(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl7, 24), this);
                        break;
                    case 7:
                        biometricsReadResult = (BiometricsReadResult) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        first6 = obj;
                        Optional optional42 = (Optional) first6;
                        optional42.getClass();
                        function1 = (Function1) optional42.orElse(null);
                        if (function1 != null) {
                        }
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 13:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.L$1;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(coroutineScope8, (PaymentLoadingPresenter) this.this$0, (State) this.$applicationName, (State) this.$freshnessChecker, (State) this.$serializersModule, (State) obj5, (State) obj4, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(anonymousClass12, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) this.this$0;
                    BigDecimal bigDecimal = (BigDecimal) this.$applicationName;
                    Money money = (Money) ((MutableState) this.$freshnessChecker).getValue();
                    Money money2 = (Money) ((MutableState) this.$serializersModule).getValue();
                    CurrencyCode currencyCode = (CurrencyCode) ((MutableState) obj5).getValue();
                    currencyCode.getClass();
                    boolean booleanValue = ((Boolean) ((MutableState) obj4).getValue()).booleanValue();
                    this.L$0 = null;
                    this.L$1 = produceStateScope;
                    this.label = 1;
                    withContext = JobKt.withContext(bitcoinTransferPresenter.ioDispatcher, new GoogleMapEngine$Map$3$1(booleanValue, bitcoinTransferPresenter, currencyCode, money, bigDecimal, money2, null), this);
                    if (withContext == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                produceStateScope.setValue(withContext);
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.L$1;
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(coroutineScope9, (LocalEditorialPresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj5, (MutableState) obj4, 5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(anonymousClass13, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.L$1;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$14 = new MerchantProfilePresenter$models$2$1$1(coroutineScope10, (SnapshotStateSet) this.this$0, (CardStudioPresenter) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj5, (ParcelableSnapshotMutableIntState) obj4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(merchantProfilePresenter$models$2$1$14, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.L$1;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$15 = new MerchantProfilePresenter$models$2$1$1(coroutineScope11, (MoleculePresenter) this.this$0, (MutableState) this.$applicationName, (MutableState) this.$freshnessChecker, (MutableState) this.$serializersModule, (MutableState) obj5, (MutableState) obj4, 6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(merchantProfilePresenter$models$2$1$15, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                return invokeSuspend$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$$inlined$CollectEffect$1(obj);
            case 19:
                return invokeSuspend$com$squareup$cash$globalsearch$backend$real$RealGlobalSearchRepository$getInitialResults$1$1$serverResultsDeferred$1(obj);
            case 20:
                return invokeSuspend$com$squareup$cash$growtools$presenters$manager$bitcoinautowithdraw$GrowToolsBitcoinAutoWithdrawManager$models$$inlined$CollectEffect$1(obj);
            case 21:
                return invokeSuspend$com$squareup$cash$money$presenters$MoneyTabPresenter$models$$inlined$CollectEffect$2(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$offers$presenters$OffersHomePresenter$models$$inlined$CollectEffect$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$onboarding$accountpicker$presenters$AccountPickerPresenter$models$$inlined$CollectEffect$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$payments$presenters$PersonalizePaymentRecipientPresenter$models$$inlined$CollectEffect$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$pools$presenters$PoolMemberListPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$pools$presenters$PoolMemberListPresenter$models$4$3(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$prepurchasecashcard$presenters$PrepurchaseCashCardPlanningPresenter$models$$inlined$CollectEffect$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$profile$presenters$ProfilePresenter$models$$inlined$CollectEffect$1(obj);
            default:
                State state = (State) obj5;
                MutableState mutableState3 = (MutableState) this.$serializersModule;
                Category.CategoryType.ChannelList channelList = (Category.CategoryType.ChannelList) this.L$0;
                ChannelListViewEvent channelListViewEvent = (ChannelListViewEvent) this.$freshnessChecker;
                ChannelListPresenter channelListPresenter = (ChannelListPresenter) this.this$0;
                Analytics analytics = channelListPresenter.analytics;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (channelList == null || (list = channelList.family) == null) {
                        sponsoredAccount = null;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (Intrinsics.areEqual(((SponsoredAccount) obj3).accountToken, ((ChannelListViewEvent.SponsoredAccountClicked) channelListViewEvent).account.accountToken)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        sponsoredAccount = (SponsoredAccount) obj3;
                    }
                    String str10 = (String) this.$applicationName;
                    String channelListSettingsPage = zzaky.getChannelListSettingsPage(NotificationCategory.NOTIFICATION_CATEGORY_FAMILY);
                    ChannelListViewEvent.SponsoredAccountClicked sponsoredAccountClicked = (ChannelListViewEvent.SponsoredAccountClicked) channelListViewEvent;
                    boolean z = sponsoredAccountClicked.toggledValue;
                    analytics.track(new NotificationsSettingsChangeDependentSetting(str10, channelListSettingsPage, zzaky.getToggleState(!z), zzaky.getToggleState(z), sponsoredAccountClicked.account.accountToken), null);
                    if (sponsoredAccount != null) {
                        sponsoredAccount.notificationsTurnedOn = sponsoredAccountClicked.toggledValue;
                    }
                    mutableState3.setValue(Boolean.TRUE);
                    if (((List) state.getValue()) != null) {
                        RealProfileNotificationsRepository realProfileNotificationsRepository = channelListPresenter.repository;
                        Long l = ((Integer) ((MutableState) obj4).getValue()) != null ? new Long(r11.intValue()) : null;
                        String str11 = (String) this.$applicationName;
                        List list2 = (List) state.getValue();
                        list2.getClass();
                        List list3 = channelList != null ? channelList.family : null;
                        String str12 = sponsoredAccountClicked.account.accountToken;
                        boolean z2 = sponsoredAccountClicked.toggledValue;
                        ArrayList sponsoredFamilyMembers$real = ChannelListPresenter.toSponsoredFamilyMembers$real(list2, list3);
                        Iterator it2 = sponsoredFamilyMembers$real.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (Intrinsics.areEqual(((SponsoredFamilyMember) obj2).accountToken, str12)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        SponsoredFamilyMember sponsoredFamilyMember = (SponsoredFamilyMember) obj2;
                        if (sponsoredFamilyMember != null) {
                            sponsoredFamilyMember.notificationsTurnedOn = z2;
                        }
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(sponsoredFamilyMembers$real, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                        Iterator it3 = sponsoredFamilyMembers$real.iterator();
                        while (it3.hasNext()) {
                            SponsoredFamilyMember sponsoredFamilyMember2 = (SponsoredFamilyMember) it3.next();
                            linkedHashMap.put(sponsoredFamilyMember2.accountToken, !sponsoredFamilyMember2.notificationsEnabled ? NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_DISABLED : sponsoredFamilyMember2.notificationsTurnedOn ? NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_ENABLED_ON : NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_ENABLED_OFF);
                        }
                        this.L$1 = sponsoredAccount;
                        this.label = 1;
                        withContext2 = JobKt.withContext(realProfileNotificationsRepository.ioDispatcher, new VerifyCheckDepositPresenter$models$3$1(linkedHashMap, realProfileNotificationsRepository, str11, l, (Continuation) null, 17), this);
                        if (withContext2 == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    }
                    mutableState3.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SponsoredAccount sponsoredAccount2 = (SponsoredAccount) this.L$1;
                SafeTrace.throwOnFailure(obj);
                sponsoredAccount = sponsoredAccount2;
                withContext2 = obj;
                ApiResult apiResult2 = (ApiResult) withContext2;
                if (apiResult2 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult2;
                    zzaky.trackChangeSettingError(analytics, zzaky.getReasonCode(failure));
                    ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(channelListPresenter.stringManager, failure, null);
                    channelListPresenter.navigator.goTo(new ProfileScreens.ErrorScreen(errorMessaging.message, errorMessaging.title, 12));
                    if (sponsoredAccount != null) {
                        sponsoredAccount.notificationsTurnedOn = !((ChannelListViewEvent.SponsoredAccountClicked) channelListViewEvent).toggledValue;
                    }
                }
                mutableState3.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    /* renamed from: app.cash.zipline.loader.ZiplineLoader$load$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ Object $$this$channelFlow;
        public final /* synthetic */ Object $applicationName;
        public final /* synthetic */ Object $initializer;
        public final /* synthetic */ Object $previousManifest;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $serializersModule;
        public final /* synthetic */ Object this$0;

        public AnonymousClass1(CoroutineScope coroutineScope, Ref$ObjectRef ref$ObjectRef, LocalPosCheckInPresenter localPosCheckInPresenter, MoneyFormatter moneyFormatter, MutableState mutableState, MutableState mutableState2) {
            this.$r8$classId = 2;
            this.$previousManifest = ref$ObjectRef;
            this.$$this$channelFlow = localPosCheckInPresenter;
            this.$applicationName = moneyFormatter;
            this.$serializersModule = mutableState;
            this.$initializer = mutableState2;
            this.this$0 = coroutineScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$com$squareup$cash$investing$presenters$search$InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2(Object obj, Continuation continuation) {
            InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1 investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1;
            int i;
            MutableState mutableState = (MutableState) this.$initializer;
            Collection collection = (Collection) this.$$this$channelFlow;
            InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) this.$previousManifest;
            AndroidStringManager androidStringManager = investingSearchPresenter.stringManager;
            if (continuation instanceof InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1) {
                investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1 = (InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1) continuation;
                int i2 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        FlowCollector flowCollector = (FlowCollector) this.this$0;
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList();
                        String str = WebSocketProtocol.hasNoSelection(collection) ? null : androidStringManager.get(R.string.reset_filters);
                        if (!StringsKt.isBlank((String) mutableState.getValue()) || !WebSocketProtocol.hasNoSelection(collection)) {
                            ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(1, new Integer(list.size()), "count");
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            String format2 = new MessageFormat(resources.getString(R.string.search_results)).format(m);
                            format2.getClass();
                            arrayList.add(new InvestingFilterResultViewModel((ColorModel) this.$applicationName, format2, str));
                        }
                        arrayList.addAll(list);
                        InvestingSearchViewModel investingSearchViewModel = new InvestingSearchViewModel((String) mutableState.getValue(), (FilterGroupCarousel) this.$serializersModule, arrayList, investingSearchPresenter.showKeypad);
                        investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1.label = 1;
                        if (flowCollector.emit(investingSearchViewModel, investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
            investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1 = new InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1(this, continuation);
            Object obj22 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$money$presenters$HypeWelcomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            MutableState mutableState = (MutableState) this.$initializer;
            String str = (String) this.$applicationName;
            LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.$$this$channelFlow;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            HypeWelcomeEvent hypeWelcomeEvent = (HypeWelcomeEvent) obj;
            if (Intrinsics.areEqual(hypeWelcomeEvent, HypeWelcomeEvent.BackClicked.INSTANCE)) {
                ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(Back.INSTANCE);
            } else {
                Continuation continuation2 = null;
                if (Intrinsics.areEqual(hypeWelcomeEvent, HypeWelcomeEvent.DismissHypeClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new HypeWelcomePresenter$models$1$1(localHomePresenter, str, continuation2, 0), 3);
                } else {
                    if (!Intrinsics.areEqual(hypeWelcomeEvent, HypeWelcomeEvent.NotifyMeClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((Analytics) localHomePresenter.clearMarketingBadgesIfNeeded).track(new MintHypeOptInComplete(str, PlatformKt.activeAccountTokenOrNull((SessionManager) localHomePresenter.localHomeGeoPresenterFactory)), null);
                    String str2 = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) ((MutableState) this.$previousManifest).getValue()).value).notifyLink;
                    if (str2 != null) {
                        mutableState.setValue(Boolean.FALSE);
                        RealRouter realRouter = (RealRouter) localHomePresenter.embeddedMapEnabled$delegate;
                        HypeWelcomeScreen hypeWelcomeScreen = (HypeWelcomeScreen) localHomePresenter.tabContentPresenterFactory;
                        realRouter.route(new RoutingParams(hypeWelcomeScreen, null, hypeWelcomeScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str2);
                    } else if (!((Boolean) ((MutableState) this.$serializersModule).getValue()).booleanValue()) {
                        JobKt.launch$default(coroutineScope, null, null, new HypeWelcomePresenter$models$1$1(localHomePresenter, str, continuation2, 1), 3);
                        mutableState.setValue(Boolean.TRUE);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$onboarding$accountpicker$presenters$AccountPickerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            List list;
            MutableState mutableState = (MutableState) this.$serializersModule;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) ((TabToolbarPresenter) this.this$0).badges;
            MutableState mutableState2 = (MutableState) this.$applicationName;
            MutableState mutableState3 = (MutableState) this.$previousManifest;
            AccountPickerViewEvent accountPickerViewEvent = (AccountPickerViewEvent) obj;
            if (accountPickerViewEvent instanceof AccountPickerViewEvent.AccountSelected) {
                ((MutableState) this.$$this$channelFlow).setValue(((AccountPickerViewEvent.AccountSelected) accountPickerViewEvent).accountToken);
            } else if (accountPickerViewEvent instanceof AccountPickerViewEvent.RemoveAccount) {
                mutableState3.setValue(new AccountPickerPresenter$AccountRemovalStatus.Requested(((AccountPickerViewEvent.RemoveAccount) accountPickerViewEvent).accountToken));
            } else if (accountPickerViewEvent instanceof AccountPickerViewEvent.ConfirmAccountRemoval) {
                mutableState3.setValue(new AccountPickerPresenter$AccountRemovalStatus.InProgress(((AccountPickerViewEvent.ConfirmAccountRemoval) accountPickerViewEvent).accountToken));
            } else if (accountPickerViewEvent instanceof AccountPickerViewEvent.CancelAccountRemoval) {
                mutableState3.setValue(null);
            } else if (Intrinsics.areEqual(accountPickerViewEvent, AccountPickerViewEvent.SkipAccountSelection.INSTANCE)) {
                mutableState2.setValue(Boolean.TRUE);
            } else if (Intrinsics.areEqual(accountPickerViewEvent, AccountPickerViewEvent.OpenOptionsMenu.INSTANCE)) {
                screenNavigator.goTo(OnboardingAccountPickerOptionsMenuScreen.INSTANCE);
            } else if (Intrinsics.areEqual(accountPickerViewEvent, AccountPickerViewEvent.EnableEditMode.INSTANCE)) {
                mutableState.setValue(Boolean.TRUE);
            } else if (Intrinsics.areEqual(accountPickerViewEvent, AccountPickerViewEvent.DisableEditMode.INSTANCE)) {
                mutableState.setValue(Boolean.FALSE);
                ValidatedAccountList validatedAccountList = (ValidatedAccountList) ((MutableState) this.$initializer).getValue();
                if (validatedAccountList != null && (list = validatedAccountList.accounts) != null && list.isEmpty() && !((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState2.setValue(Boolean.TRUE);
                }
            } else {
                if (!Intrinsics.areEqual(accountPickerViewEvent, AccountPickerViewEvent.Exit.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(Back.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
        private final Object emit$com$squareup$cash$paychecks$presenters$EditDistributionPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior backButtonBehavior;
            MutableState mutableState = (MutableState) this.$initializer;
            Object obj2 = this.$applicationName;
            MutableFloatState mutableFloatState = (MutableFloatState) obj2;
            Object obj3 = this.$previousManifest;
            EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) obj3;
            LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.$$this$channelFlow;
            EditDistributionScreen editDistributionScreen = (EditDistributionScreen) localCashBalancePresenter.syncer;
            BlockersData blockersData = (BlockersData) localCashBalancePresenter.store;
            Analytics analytics = (Analytics) localCashBalancePresenter.analytics;
            EditDistributionConfiguration editDistributionConfiguration = (EditDistributionConfiguration) localCashBalancePresenter.service;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            EditDistributionViewEvent editDistributionViewEvent = (EditDistributionViewEvent) obj;
            if (editDistributionViewEvent instanceof EditDistributionViewEvent.SubmitUpdatedAllocationAnswer) {
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                analytics.track(new PaychecksManageDistributionConfirmEditAllocation(blockersData.flowToken, UtilsKt.toDestinationType(destinationUiConfiguration.destination), new Integer((int) UtilsKt.getBasisPoints(parcelableSnapshotMutableFloatState.getFloatValue()))), null);
                AskedQuestion askedQuestion = editDistributionScreen.question;
                askedQuestion.getClass();
                screenNavigator.giveAnswer(askedQuestion, MapsKt__MapsKt.toMap(ImageResources_androidKt.calculateAllocations(editDistributionConfiguration.initialDestinationStates, destinationUiConfiguration, parcelableSnapshotMutableFloatState.getFloatValue(), EditDistributionPresenter$models$2$1.INSTANCE)));
            } else if (editDistributionViewEvent instanceof IsSubmissionInteraction) {
                IsSubmissionInteraction isSubmissionInteraction = (IsSubmissionInteraction) editDistributionViewEvent;
                int basisPoints = (int) UtilsKt.getBasisPoints(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
                String str = blockersData.flowToken;
                Integer destinationType = UtilsKt.toDestinationType(destinationUiConfiguration.destination);
                int ordinal = isSubmissionInteraction.getInteraction().ordinal();
                if (ordinal == 2) {
                    backButtonBehavior = null;
                    analytics.track(new PaychecksManageDistributionConfirmEditAllocation(str, destinationType, Integer.valueOf(basisPoints)), null);
                } else if (ordinal == 3) {
                    backButtonBehavior = null;
                    analytics.track(new PaychecksManageDistributionTurnOffAllocation(destinationType, str), null);
                } else if (ordinal != 4) {
                    backButtonBehavior = null;
                } else {
                    backButtonBehavior = null;
                    analytics.track(new PaychecksManageDistributionEditConfigurationRowTapped(destinationType, str), null);
                }
                if (isSubmissionInteraction instanceof EditDistributionViewEvent.Exit) {
                    EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements selectedStateUiElements = ((EditDistributionConfiguration.DestinationUiConfiguration) editDistributionConfiguration.initialDestinationStates.get(editDistributionConfiguration.initiallySelectedDestinationIndex)).selectedStateUiElements;
                    if ((selectedStateUiElements != null ? selectedStateUiElements.backButtonBehavior : backButtonBehavior) == EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.DISMISS) {
                        AskedQuestion askedQuestion2 = editDistributionScreen.question;
                        if (askedQuestion2 != null) {
                            ArrayList<EditDistributionConfiguration.DestinationUiConfiguration> arrayList = editDistributionConfiguration.initialDestinationStates;
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration2 : arrayList) {
                                linkedHashMap.put(destinationUiConfiguration2.destination, new Long(destinationUiConfiguration2.shareInBasisPoints));
                            }
                            screenNavigator.giveAnswer(askedQuestion2, linkedHashMap);
                        } else {
                            screenNavigator.goTo(Back.INSTANCE);
                        }
                    }
                }
                ?? r0 = backButtonBehavior;
                JobKt.launch$default(coroutineScope, r0, r0, new PoolsListPresenter$models$2$2(localCashBalancePresenter, (EditDistributionConfiguration.DestinationUiConfiguration) obj3, editDistributionViewEvent, (MutableState) this.$serializersModule, (MutableFloatState) obj2, (Continuation) null), 3);
            } else if (editDistributionViewEvent instanceof UpdateAllocationPercentage) {
                localCashBalancePresenter.confirmValidAllocation(destinationUiConfiguration, ((UpdateAllocationPercentage) editDistributionViewEvent).getPercentage(), new AbstractTypeChecker$$Lambda$0(editDistributionViewEvent, localCashBalancePresenter, destinationUiConfiguration, mutableFloatState, 4));
            } else {
                int i = 8;
                if (editDistributionViewEvent instanceof EditDistributionViewEvent.SetCustomAllocation) {
                    screenNavigator.askQuestion(new CustomAllocationQuestion(), new ThumbNode$$ExternalSyntheticLambda0(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), destinationUiConfiguration, localCashBalancePresenter, i));
                } else if (editDistributionViewEvent instanceof EditDistributionViewEvent.TapInfoButton) {
                    mutableState.setValue(Boolean.TRUE);
                } else if (editDistributionViewEvent instanceof EditDistributionViewEvent.ExplanationDismissed) {
                    mutableState.setValue(Boolean.FALSE);
                } else {
                    if (!(editDistributionViewEvent instanceof EditDistributionViewEvent.TapHeroPercentage)) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) editDistributionViewEvent, "Unsupported event received: ");
                        return null;
                    }
                    screenNavigator.askQuestion(new CustomAllocationQuestion(), new ThumbNode$$ExternalSyntheticLambda0(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue(), destinationUiConfiguration, localCashBalancePresenter, i));
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$paymentpad$presenters$MainPaymentPadPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            MainPaymentPadPresenter.State state;
            long j;
            MainPaymentPadPresenter.State state2;
            MainPaymentPadPresenter.State initiateTTPPayment$copyToErrorState;
            MutableState mutableState = (MutableState) this.$serializersModule;
            MainPaymentPadPresenter mainPaymentPadPresenter = (MainPaymentPadPresenter) this.$$this$channelFlow;
            BetterNavigator.ScreenNavigator screenNavigator = mainPaymentPadPresenter.navigator;
            RealMainPaymentPadRefresher realMainPaymentPadRefresher = mainPaymentPadPresenter.mainPaymentPadRefresher;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            MainPaymentPadViewEvent mainPaymentPadViewEvent = (MainPaymentPadViewEvent) obj;
            MutableState mutableState2 = (MutableState) this.$previousManifest;
            boolean z = mainPaymentPadViewEvent instanceof MainPaymentPadViewEvent.FiatPaymentPadViewEvent.RequestFiatPayment;
            mutableState2.setValue((z || (mainPaymentPadViewEvent instanceof MainPaymentPadViewEvent.FiatPaymentPadViewEvent.SendFiatPayment)) ? MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), null, null, null, null, null, false, false, null, false, false, null, 3903) : MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), null, null, null, null, null, false, false, null, false, false, null, 3855));
            Continuation continuation2 = null;
            if (mainPaymentPadViewEvent instanceof MainPaymentPadViewEvent.RestoreState) {
                if (((Boolean) ((MutableState) this.$applicationName).getValue()).booleanValue()) {
                    StateFlowImpl stateFlowImpl = realMainPaymentPadRefresher.shouldResetAmount;
                    Boolean bool = Boolean.FALSE;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool);
                    mutableState2.setValue(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), null, null, new Long(0L), null, null, true, false, null, false, false, null, 3894));
                } else {
                    mutableState2.setValue(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), ((MainPaymentPadViewEvent.RestoreState) mainPaymentPadViewEvent).rawAmount, null, null, null, null, false, true, null, false, false, null, 3966));
                }
            } else if (Intrinsics.areEqual(mainPaymentPadViewEvent, MainPaymentPadViewEvent.FiatPaymentPadViewEvent.ResetErrorMessage.INSTANCE)) {
                mutableState2.setValue(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), null, null, null, null, null, false, false, null, false, false, null, 3935));
            } else if (z) {
                MainPaymentPadPresenter.State state3 = (MainPaymentPadPresenter.State) mutableState2.getValue();
                String str = ((MainPaymentPadPresenter.State) mutableState2.getValue()).rawAmount;
                mutableState2.setValue(MainPaymentPadPresenter.access$initiateFiatPayment(mainPaymentPadPresenter, MainPaymentPadPresenter.State.copy$default(state3, null, null, new Long(str != null ? MainPaymentPadPresenter.getAmountInCents(str) : 0L), null, null, false, false, null, false, false, null, 3959), Orientation.BILL));
            } else if (mainPaymentPadViewEvent instanceof MainPaymentPadViewEvent.FiatPaymentPadViewEvent.SendFiatPayment) {
                MainPaymentPadPresenter.State state4 = (MainPaymentPadPresenter.State) mutableState2.getValue();
                String str2 = ((MainPaymentPadPresenter.State) mutableState2.getValue()).rawAmount;
                mutableState2.setValue(MainPaymentPadPresenter.access$initiateFiatPayment(mainPaymentPadPresenter, MainPaymentPadPresenter.State.copy$default(state4, null, null, new Long(str2 != null ? MainPaymentPadPresenter.getAmountInCents(str2) : 0L), null, null, false, false, null, false, false, null, 3959), Orientation.CASH));
            } else if (mainPaymentPadViewEvent instanceof MainPaymentPadViewEvent.FiatPaymentPadViewEvent.AmountChanged) {
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(MainPaymentPadPresenter.updateConvertedFiatMoney(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState2.getValue(), ((MainPaymentPadViewEvent.FiatPaymentPadViewEvent.AmountChanged) mainPaymentPadViewEvent).rawAmount, null, null, null, null, false, false, null, false, false, null, 3966)));
            } else {
                int i = 0;
                if (Intrinsics.areEqual(mainPaymentPadViewEvent, MainPaymentPadViewEvent.FiatPaymentPadViewEvent.RequestTapToPayPayment.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new MainPaymentPadPresenter$models$6$1(mainPaymentPadPresenter, continuation2, i), 3);
                    MainPaymentPadPresenter.State state5 = (MainPaymentPadPresenter.State) mutableState2.getValue();
                    String str3 = ((MainPaymentPadPresenter.State) mutableState2.getValue()).rawAmount;
                    MainPaymentPadPresenter.State copy$default = MainPaymentPadPresenter.State.copy$default(state5, null, null, new Long(str3 != null ? MainPaymentPadPresenter.getAmountInCents(str3) : 0L), null, null, false, false, null, false, false, null, 3959);
                    Long l = copy$default.fiatAmountCents;
                    CurrencyCode currencyCode = copy$default.defaultFiatCurrencyCode;
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) mainPaymentPadPresenter.featureFlagManager;
                    long j2 = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$TapToPayAmountMin.INSTANCE)).value;
                    long j3 = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$TapToPayAmountMax.INSTANCE)).value;
                    if (!(currencyCode != null) || l == null) {
                        initiateTTPPayment$copyToErrorState = MainPaymentPadPresenter.initiateTTPPayment$copyToErrorState(mainPaymentPadPresenter, copy$default, true, (long) Moneys.displayDivisor(currencyCode));
                    } else if (l.longValue() < j2) {
                        initiateTTPPayment$copyToErrorState = MainPaymentPadPresenter.initiateTTPPayment$copyToErrorState(mainPaymentPadPresenter, copy$default, true, j2);
                    } else if (l.longValue() > j3) {
                        initiateTTPPayment$copyToErrorState = MainPaymentPadPresenter.initiateTTPPayment$copyToErrorState(mainPaymentPadPresenter, copy$default, false, j3);
                    } else {
                        UUID generate = RealUuidGenerator.generate();
                        String uuid = generate.toString();
                        uuid.getClass();
                        realMainPaymentPadRefresher.transactionIdsCreated.add(uuid);
                        screenNavigator.goTo(new TapToPayScreen.TapToPayInitialScreen(new Money(l, currencyCode, 4), PaymentScreens$HomeScreens$PaymentPad.INSTANCE, generate));
                        initiateTTPPayment$copyToErrorState = MainPaymentPadPresenter.State.copy$default(copy$default, null, null, null, null, null, false, false, null, false, false, null, 4047);
                    }
                    mutableState2.setValue(initiateTTPPayment$copyToErrorState);
                } else if (Intrinsics.areEqual(mainPaymentPadViewEvent, MainPaymentPadViewEvent.FiatPaymentPadViewEvent.PoolPayment.INSTANCE)) {
                    MainPaymentPadPresenter.State state6 = (MainPaymentPadPresenter.State) mutableState2.getValue();
                    String str4 = ((MainPaymentPadPresenter.State) mutableState2.getValue()).rawAmount;
                    MainPaymentPadPresenter.State copy$default2 = MainPaymentPadPresenter.State.copy$default(state6, null, null, new Long(str4 != null ? MainPaymentPadPresenter.getAmountInCents(str4) : 0L), null, null, false, false, null, false, false, null, 3959);
                    Long l2 = copy$default2.fiatAmountCents;
                    CurrencyCode currencyCode2 = copy$default2.defaultFiatCurrencyCode;
                    boolean booleanValue = ((Boolean) ((State) this.$initializer).getValue()).booleanValue();
                    MoneyFormatter moneyFormatter = mainPaymentPadPresenter.moneyFormatterStandard;
                    Resources resources = mainPaymentPadPresenter.stringManager.resources;
                    boolean z2 = booleanValue && l2 != null && l2.longValue() > 1000000;
                    if (currencyCode2 != null) {
                        j = 1000000;
                        if ((l2 == null || l2.longValue() >= Moneys.displayDivisor(currencyCode2)) && !z2) {
                            UUID generate2 = RealUuidGenerator.generate();
                            String uuid2 = generate2.toString();
                            uuid2.getClass();
                            realMainPaymentPadRefresher.transactionIdsCreated.add(uuid2);
                            screenNavigator.goTo(new StartPoolScreen(new Money(l2, currencyCode2, 4), generate2, StartPoolScreen.EntryPoint.P2P_KEYPAD));
                            state2 = MainPaymentPadPresenter.State.copy$default(copy$default2, null, null, null, null, null, false, false, null, false, false, null, 4047);
                            mutableState2.setValue(state2);
                        } else {
                            state = copy$default2;
                        }
                    } else {
                        state = copy$default2;
                        j = 1000000;
                    }
                    if (z2) {
                        String uuid3 = RealUuidGenerator.generate().toString();
                        String format2 = moneyFormatter.format(new Money(Long.valueOf(j), (CurrencyCode) null, 6));
                        format2.getClass();
                        resources.getClass();
                        String format3 = new MessageFormat(resources.getString(R.string.maximum_amount_pool_error)).format(new Object[]{format2});
                        format3.getClass();
                        state2 = MainPaymentPadPresenter.State.copy$default(state, null, null, null, uuid3, format3, false, false, null, false, false, null, 4047);
                    } else {
                        String uuid4 = RealUuidGenerator.generate().toString();
                        String format4 = moneyFormatter.format(new Money(Long.valueOf((long) Moneys.displayDivisor(currencyCode2)), (CurrencyCode) null, 6));
                        format4.getClass();
                        resources.getClass();
                        String format5 = new MessageFormat(resources.getString(R.string.minimum_amount_pool_error)).format(new Object[]{format4});
                        format5.getClass();
                        state2 = MainPaymentPadPresenter.State.copy$default(state, null, null, null, uuid4, format5, false, false, null, false, false, null, 4047);
                    }
                    mutableState2.setValue(state2);
                } else {
                    if (!Intrinsics.areEqual(mainPaymentPadViewEvent, MainPaymentPadViewEvent.HypeAnimationComplete.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState.setValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            NearbyPaymentDiscoverSelectDirection.SelectionDirection selectionDirection;
            SnapshotStateList snapshotStateList = (SnapshotStateList) this.$previousManifest;
            CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$$this$channelFlow;
            Analytics analytics = (Analytics) cardLockPresenter.analytics;
            BetterNavigator.ScreenNavigator screenNavigator = cardLockPresenter.navigator;
            String str = (String) cardLockPresenter.ioDispatcher;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            NearbyPayRequestViewEvent nearbyPayRequestViewEvent = (NearbyPayRequestViewEvent) obj;
            boolean areEqual = Intrinsics.areEqual(nearbyPayRequestViewEvent, NearbyPayRequestViewEvent.OnCloseClicked.INSTANCE);
            Back back = Back.INSTANCE;
            Continuation continuation2 = null;
            if (areEqual) {
                NearbyPaymentDismissScreenDismiss.DismissScreen dismissScreen = ((Boolean) ((MutableState) this.$applicationName).getValue()).booleanValue() ? NearbyPaymentDismissScreenDismiss.DismissScreen.STILL_LOOKING : NearbyPaymentDismissScreenDismiss.DismissScreen.DISCOVER_PAGE;
                str.getClass();
                analytics.track(new NearbyPaymentDismissScreenDismiss(dismissScreen, str), null);
                screenNavigator.goTo(back);
            } else if (nearbyPayRequestViewEvent instanceof NearbyPayRequestViewEvent.OnPermissionsAction) {
                NearbyPermissionState nearbyPermissionState = (NearbyPermissionState) ((State) this.$serializersModule).getValue();
                if (nearbyPermissionState != null) {
                    JobKt.launch$default(coroutineScope, null, null, new OverlayKt$Overlay$1$1$1$1$1(cardLockPresenter, nearbyPermissionState, continuation2, 16), 3);
                }
            } else if (nearbyPayRequestViewEvent instanceof NearbyPayRequestViewEvent.OnPersonClicked) {
                NearbyPerson nearbyPerson = ((NearbyPayRequestViewEvent.OnPersonClicked) nearbyPayRequestViewEvent).person;
                String str2 = nearbyPerson.customerToken;
                String str3 = nearbyPerson.cashtag;
                String str4 = nearbyPerson.name;
                NearbyAvatarInfo nearbyAvatarInfo = nearbyPerson.avatar;
                screenNavigator.goTo(new PaymentScreens.NearbyPaymentKeypad((PaymentScreens.NearbyPayRequest) cardLockPresenter.flowNavigationHelper, new RedactedParcelable(new com.squareup.cash.recipients.data.Recipient(null, false, false, str2, null, str3, true, false, false, null, null, null, nearbyAvatarInfo.image, null, null, false, 0L, null, null, false, null, nearbyAvatarInfo.accentColor, null, null, null, str4, null, null, false, null, null, false, false, null, -35655785, 3)), nearbyPerson.nearbySessionToken, str));
            } else if (nearbyPayRequestViewEvent instanceof NearbyPayRequestViewEvent.OnSegmentSelected) {
                NearbyPayRequestTab nearbyPayRequestTab = ((NearbyPayRequestViewEvent.OnSegmentSelected) nearbyPayRequestViewEvent).tab;
                int ordinal = nearbyPayRequestTab.ordinal();
                if (ordinal == 0) {
                    selectionDirection = NearbyPaymentDiscoverSelectDirection.SelectionDirection.PAY;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    selectionDirection = NearbyPaymentDiscoverSelectDirection.SelectionDirection.GET_PAID;
                }
                str.getClass();
                analytics.track(new NearbyPaymentDiscoverSelectDirection(selectionDirection, str), null);
                ((MutableState) this.$initializer).setValue(nearbyPayRequestTab);
            } else if (nearbyPayRequestViewEvent instanceof NearbyPayRequestViewEvent.OnViewAllPayersClicked) {
                ArrayList nearbyPayers = cardLockPresenter.toNearbyPayers(snapshotStateList);
                Money sumOfAmount = CardLockPresenter.sumOfAmount(snapshotStateList);
                str.getClass();
                analytics.track(new NearbyPaymentFoundPeopleSeeAllClick(str), null);
                RedactedParcelableList redactedParcelableList = new RedactedParcelableList(nearbyPayers);
                String format2 = ((MoneyFormatter) cardLockPresenter.deviceLockAnimationBus).format(sumOfAmount);
                Long l = sumOfAmount.amount;
                screenNavigator.goTo(new PaymentScreens.NearbyPayersSheet(redactedParcelableList, format2, new Long(l != null ? l.longValue() : 0L), str));
            } else if (Intrinsics.areEqual(nearbyPayRequestViewEvent, NearbyPayRequestViewEvent.OnViewAllPeopleClicked.INSTANCE)) {
                screenNavigator.goTo(PaymentScreens.NearbyPeopleOverflowSheet.INSTANCE);
            } else if (Intrinsics.areEqual(nearbyPayRequestViewEvent, NearbyPayRequestViewEvent.OnHelpClicked.INSTANCE)) {
                str.getClass();
                analytics.track(new NearbyPaymentStillLookingNeedHelp(str), null);
                screenNavigator.goTo(new PaymentScreens.NearbyPayRequestHelp(str));
            } else if (Intrinsics.areEqual(nearbyPayRequestViewEvent, NearbyPayRequestViewEvent.OnMoreInfoClicked.INSTANCE)) {
                str.getClass();
                analytics.track(new NearbyPaymentStillLookingInfoClick(str), null);
                screenNavigator.goTo(new PaymentScreens.NearbyPaymentsInfo(str));
            } else {
                if (!Intrinsics.areEqual(nearbyPayRequestViewEvent, NearbyPayRequestViewEvent.OnErrorDismissed.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.goTo(back);
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$payments$presenters$NearbyPaymentKeypadPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            MutableState mutableState = (MutableState) this.$initializer;
            MutableState mutableState2 = (MutableState) this.$previousManifest;
            MutableState mutableState3 = (MutableState) this.$serializersModule;
            String str = (String) this.$applicationName;
            LocalPosLocalCashRedemptionPresenter localPosLocalCashRedemptionPresenter = (LocalPosLocalCashRedemptionPresenter) this.$$this$channelFlow;
            BetterNavigator.ScreenNavigator screenNavigator = localPosLocalCashRedemptionPresenter.navigator;
            Analytics analytics = localPosLocalCashRedemptionPresenter.analytics;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            NearbyPaymentKeypadViewEvent nearbyPaymentKeypadViewEvent = (NearbyPaymentKeypadViewEvent) obj;
            Continuation continuation2 = null;
            if (Intrinsics.areEqual(nearbyPaymentKeypadViewEvent, NearbyPaymentKeypadViewEvent.OnCloseClicked.INSTANCE)) {
                analytics.track(new NearbyPaymentDismissScreenDismiss(NearbyPaymentDismissScreenDismiss.DismissScreen.PAD_PAGE, str), null);
                screenNavigator.goTo(Back.INSTANCE);
            } else if (nearbyPaymentKeypadViewEvent instanceof NearbyPaymentKeypadViewEvent.OnAmountChanged) {
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    String str2 = ((NearbyPaymentKeypadViewEvent.OnAmountChanged) nearbyPaymentKeypadViewEvent).rawAmount;
                    if (str2.length() > 0 && !str2.equals("0")) {
                        mutableState2.setValue(Boolean.TRUE);
                        analytics.track(new NearbyPaymentPayEnterAmount(str), null);
                    }
                }
                mutableState3.setValue(((NearbyPaymentKeypadViewEvent.OnAmountChanged) nearbyPaymentKeypadViewEvent).rawAmount);
            } else if (Intrinsics.areEqual(nearbyPaymentKeypadViewEvent, NearbyPaymentKeypadViewEvent.OnPayClicked.INSTANCE)) {
                Long l = Moneys.parseMoneyFromString$default((String) mutableState3.getValue(), CurrencyCode.USD).amount;
                analytics.track(new NearbyPaymentPaySubmitPayment(Long.valueOf(l != null ? l.longValue() : 0L), str), null);
                JobKt.launch$default(coroutineScope, null, null, new MainPaymentPresenter$models$4$4(localPosLocalCashRedemptionPresenter, mutableState3, mutableState, continuation2, 19), 3);
            } else if (Intrinsics.areEqual(nearbyPaymentKeypadViewEvent, NearbyPaymentKeypadViewEvent.OnMoreInfoClicked.INSTANCE)) {
                analytics.track(new NearbyPaymentPayPadViewClickInfo(str), null);
                screenNavigator.goTo(new PaymentScreens.NearbyPaymentsInfo(str));
            } else {
                if (!Intrinsics.areEqual(nearbyPaymentKeypadViewEvent, NearbyPaymentKeypadViewEvent.OnInstrumentClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                screenNavigator.askQuestion(WhichInstrument.INSTANCE, new ViewSizeResolver$size$3$1(9, localPosLocalCashRedemptionPresenter, mutableState3, mutableState));
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Object emit$com$squareup$cash$profile$presenters$ProfilePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            Image photoImage;
            MutableState mutableState = (MutableState) this.$initializer;
            State state = (State) this.$serializersModule;
            State state2 = (State) this.$applicationName;
            MutableState mutableState2 = (MutableState) this.$previousManifest;
            ProfilePresenter profilePresenter = (ProfilePresenter) this.this$0;
            ProfileScreens.ProfileScreen profileScreen = (ProfileScreens.ProfileScreen) profilePresenter.screen;
            BetterNavigator.ScreenNavigator screenNavigator = profilePresenter.navigator;
            ProfileViewEvent profileViewEvent = (ProfileViewEvent) obj;
            if (profileViewEvent instanceof ProfileViewEvent.NavigationIconClicked) {
                screenNavigator.goTo(Back.INSTANCE);
            } else {
                boolean z = profileViewEvent instanceof ProfileViewEvent.PrimaryButtonClicked;
                Object obj2 = this.$$this$channelFlow;
                if (z) {
                    CustomerProfileDetails customerProfileDetails = (CustomerProfileDetails) mutableState2.getValue();
                    r9 = customerProfileDetails != null ? customerProfileDetails.customerProfileData : null;
                    CurrencyCode currencyCode = (CurrencyCode) state2.getValue();
                    MutableState mutableState3 = (MutableState) obj2;
                    Origin origin = ((Boolean) state.getValue()).booleanValue() ? Origin.CUSTOMER_PROFILE_FAVORITES : Origin.CUSTOMER_PROFILE_ACTIVITY;
                    if (r9 != null && currencyCode != null) {
                        int ordinal = profileScreen.primaryAction.actionType.ordinal();
                        profilePresenter.executeAction(profileScreen.primaryAction, currencyCode, r9, ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? Orientation.CASH : Orientation.BILL : Orientation.BILL : Orientation.CASH, mutableState3, origin);
                    }
                } else if (profileViewEvent instanceof ProfileViewEvent.ProfileAvatarClicked) {
                    CustomerProfileDetails customerProfileDetails2 = (CustomerProfileDetails) mutableState2.getValue();
                    CustomerProfileData customerProfileData = customerProfileDetails2 != null ? customerProfileDetails2.customerProfileData : null;
                    ProfileViewModel.Loaded.ProfilePhoto profilePhoto = (ProfileViewModel.Loaded.ProfilePhoto) mutableState.getValue();
                    if (customerProfileData != null && profilePhoto == null && (photoImage = ProfilePresenter.photoImage(customerProfileData)) != null) {
                        r9 = new ProfileViewModel.Loaded.ProfilePhoto(photoImage, customerProfileData.accentColor, customerProfileData.shouldColorizeAvatar);
                    }
                    mutableState.setValue(r9);
                } else if (profileViewEvent instanceof ProfileViewEvent.RecipientConfirmed) {
                    PaymentScreens.QuickPay quickPay = (PaymentScreens.QuickPay) ((MutableState) obj2).getValue();
                    if (quickPay != null) {
                        screenNavigator.goTo(quickPay);
                    }
                } else if (profileViewEvent instanceof ProfileViewEvent.SecondaryButtonClicked) {
                    CustomerProfileDetails customerProfileDetails3 = (CustomerProfileDetails) mutableState2.getValue();
                    r9 = customerProfileDetails3 != null ? customerProfileDetails3.customerProfileData : null;
                    CurrencyCode currencyCode2 = (CurrencyCode) state2.getValue();
                    MutableState mutableState4 = (MutableState) obj2;
                    Origin origin2 = ((Boolean) state.getValue()).booleanValue() ? Origin.CUSTOMER_PROFILE_FAVORITES : Origin.CUSTOMER_PROFILE_ACTIVITY;
                    if (r9 != null && currencyCode2 != null) {
                        int ordinal2 = profileScreen.primaryAction.actionType.ordinal();
                        profilePresenter.executeAction(profileScreen.primaryAction, currencyCode2, r9, ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? Orientation.CASH : Orientation.CASH : Orientation.BILL : Orientation.CASH, mutableState4, origin2);
                    }
                } else if (!(profileViewEvent instanceof ProfileViewEvent.GenericProfileElementsViewEventWrapper)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$profile$presenters$personal$ArcadeAutofillSettingsDetailPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            MutableState mutableState = (MutableState) this.$initializer;
            MutableState mutableState2 = (MutableState) this.$serializersModule;
            MutableState mutableState3 = (MutableState) this.$applicationName;
            MutableState mutableState4 = (MutableState) this.$previousManifest;
            PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.$$this$channelFlow;
            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            ArcadeAutofillSettingsDetailViewEvent arcadeAutofillSettingsDetailViewEvent = (ArcadeAutofillSettingsDetailViewEvent) obj;
            boolean z = arcadeAutofillSettingsDetailViewEvent instanceof ArcadeAutofillSettingsDetailViewEvent.BackClicked;
            Back back = Back.INSTANCE;
            if (z) {
                if (Intrinsics.areEqual((AutofillCombinedInfo) mutableState4.getValue(), (AutofillCombinedInfo) poolsListPresenter.flowToken)) {
                    screenNavigator.goTo(back);
                } else {
                    mutableState3.setValue(Boolean.TRUE);
                }
            } else if (arcadeAutofillSettingsDetailViewEvent instanceof ArcadeAutofillSettingsDetailViewEvent.InputChanged) {
                ArcadeAutofillSettingsDetailViewEvent.InputChanged inputChanged = (ArcadeAutofillSettingsDetailViewEvent.InputChanged) arcadeAutofillSettingsDetailViewEvent;
                mutableState4.setValue(InputViewModelExtKt.update((AutofillCombinedInfo) mutableState4.getValue(), inputChanged.f1038type, inputChanged.newValue));
            } else if (arcadeAutofillSettingsDetailViewEvent instanceof ArcadeAutofillSettingsDetailViewEvent.InputDropdownSelection) {
                ArcadeAutofillSettingsDetailViewEvent.InputDropdownSelection inputDropdownSelection = (ArcadeAutofillSettingsDetailViewEvent.InputDropdownSelection) arcadeAutofillSettingsDetailViewEvent;
                InputViewModel.InputType inputType = inputDropdownSelection.f1039type;
                if (inputType == InputViewModel.InputType.STATE) {
                    mutableState4.setValue(InputViewModelExtKt.update((AutofillCombinedInfo) mutableState4.getValue(), inputType, inputDropdownSelection.newValue));
                }
            } else if (Intrinsics.areEqual(arcadeAutofillSettingsDetailViewEvent, ArcadeAutofillSettingsDetailViewEvent.DiscardChangesAccepted.INSTANCE)) {
                screenNavigator.goTo(back);
                mutableState3.setValue(Boolean.FALSE);
            } else if (arcadeAutofillSettingsDetailViewEvent instanceof ArcadeAutofillSettingsDetailViewEvent.DiscardChangesDismissed) {
                mutableState3.setValue(Boolean.FALSE);
            } else if (Intrinsics.areEqual(arcadeAutofillSettingsDetailViewEvent, ArcadeAutofillSettingsDetailViewEvent.SuccessAnimationCompleted.INSTANCE)) {
                screenNavigator.goTo(back);
            } else {
                Continuation continuation2 = null;
                if (Intrinsics.areEqual(arcadeAutofillSettingsDetailViewEvent, ArcadeAutofillSettingsDetailViewEvent.CtaButtonClicked.INSTANCE)) {
                    mutableState2.setValue(AutofillState.Loading.INSTANCE);
                    JobKt.launch$default(coroutineScope, null, null, new SelectPaymentPlanBlockerPresenter$models$1$2(poolsListPresenter, mutableState4, mutableState2, continuation2, 12), 3);
                } else if (Intrinsics.areEqual(arcadeAutofillSettingsDetailViewEvent, ArcadeAutofillSettingsDetailViewEvent.ErrorCloseClicked.INSTANCE) || Intrinsics.areEqual(arcadeAutofillSettingsDetailViewEvent, ArcadeAutofillSettingsDetailViewEvent.ErrorCtaButtonClicked.INSTANCE)) {
                    mutableState2.setValue(AutofillState.Loaded.INSTANCE);
                } else {
                    if (!Intrinsics.areEqual(arcadeAutofillSettingsDetailViewEvent, ArcadeAutofillSettingsDetailViewEvent.AutofillToggleClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                    JobKt.launch$default(coroutineScope, (CoroutineContext) poolsListPresenter.args, null, new RoomDatabase$performClear$1(poolsListPresenter, booleanValue, mutableState, continuation2, 17), 2);
                }
            }
            return Unit.INSTANCE;
        }

        private final Object emit$com$squareup$cash$support$presenters$ContactSupportEmailMessagePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
            WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.$$this$channelFlow;
            SupportScreens.ContactScreens.ContactSupportMessageScreen contactSupportMessageScreen = (SupportScreens.ContactScreens.ContactSupportMessageScreen) workHomePresenter.payPresenter;
            MutableState mutableState = (MutableState) this.$applicationName;
            CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
            ContactSupportEmailMessageViewEvent contactSupportEmailMessageViewEvent = (ContactSupportEmailMessageViewEvent) obj;
            if (contactSupportEmailMessageViewEvent instanceof ContactSupportEmailMessageViewEvent.UpdateMessage) {
                ((MutableState) this.$previousManifest).setValue(((ContactSupportEmailMessageViewEvent.UpdateMessage) contactSupportEmailMessageViewEvent).message);
                mutableState.setValue(Boolean.FALSE);
            } else {
                boolean z = contactSupportEmailMessageViewEvent instanceof ContactSupportEmailMessageViewEvent.SubmitMessage;
                Object obj2 = this.$initializer;
                if (z) {
                    if (((ContactSupportEmailMessageViewEvent.SubmitMessage) contactSupportEmailMessageViewEvent).message.length() >= 50) {
                        Object obj3 = this.$serializersModule;
                        ((MutableState) obj3).setValue(Boolean.TRUE);
                        mutableState.setValue(Boolean.FALSE);
                        Analytics analytics = (Analytics) workHomePresenter.shiftSection2Presenter;
                        SupportScreens.ContactScreens.Data data = contactSupportMessageScreen.data;
                        data.getClass();
                        analytics.track(new CustomerSupportContactSubmitMessage(zzpd.toChannel(data.contactOption), data.flowToken), null);
                        JobKt.launch$default(coroutineScope, null, null, new ContactSupportEmailMessagePresenter$models$2$1(workHomePresenter, contactSupportEmailMessageViewEvent, (MutableState) obj3, (MutableState) obj2, null), 3);
                    } else {
                        mutableState.setValue(Boolean.TRUE);
                    }
                } else if (contactSupportEmailMessageViewEvent instanceof ContactSupportEmailMessageViewEvent.ExitFlow) {
                    ((BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter).goTo(contactSupportMessageScreen.data.exitScreen);
                } else {
                    if (!Intrinsics.areEqual(contactSupportEmailMessageViewEvent, ContactSupportEmailMessageViewEvent.DismissModal.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj2).setValue(null);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:193:0x0583  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x08e7  */
        /* JADX WARN: Removed duplicated region for block: B:311:0x0915  */
        /* JADX WARN: Type inference failed for: r14v47 */
        /* JADX WARN: Type inference failed for: r14v48 */
        /* JADX WARN: Type inference failed for: r14v49, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v28, types: [com.squareup.cash.launcher.IntentLauncher] */
        /* JADX WARN: Type inference failed for: r3v81 */
        /* JADX WARN: Type inference failed for: r3v82 */
        /* JADX WARN: Type inference failed for: r3v83 */
        /* JADX WARN: Type inference failed for: r3v84 */
        /* JADX WARN: Type inference failed for: r3v85 */
        /* JADX WARN: Type inference failed for: r3v86 */
        /* JADX WARN: Type inference failed for: r6v40 */
        /* JADX WARN: Type inference failed for: r6v41 */
        /* JADX WARN: Type inference failed for: r6v42 */
        /* JADX WARN: Type inference failed for: r6v43 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.runtime.MutableState, androidx.compose.runtime.State] */
        /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.runtime.MutableState, androidx.compose.runtime.State] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            Screen bankAccountLinkingScreen;
            Screen plaidLinkScreen;
            BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow;
            String str;
            Timeframe timeframe;
            RequestContext requestContext;
            zzea zzeaVar;
            Flow$Type flow$Type;
            CashAppTag cashAppTag;
            DeviceType deviceType;
            Object value;
            TagFormFactor tagFormFactor;
            CashAppTag cashAppTag2;
            int i = this.$r8$classId;
            boolean z = false;
            Screen screen = Back.INSTANCE;
            final int i2 = 1;
            Object obj2 = this.$$this$channelFlow;
            Object obj3 = this.$previousManifest;
            Object obj4 = this.this$0;
            Object obj5 = this.$serializersModule;
            Object obj6 = this.$initializer;
            Object obj7 = this.$applicationName;
            switch (i) {
                case 0:
                    return emit((String) obj, continuation);
                case 1:
                    PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) obj4;
                    BetterNavigator.ScreenNavigator screenNavigator = paymentLoadingPresenter.navigator;
                    BitcoinSendReceiveBottomSheetViewEvent bitcoinSendReceiveBottomSheetViewEvent = (BitcoinSendReceiveBottomSheetViewEvent) obj;
                    if (Intrinsics.areEqual(bitcoinSendReceiveBottomSheetViewEvent, BitcoinSendReceiveBottomSheetViewEvent.CloseClicked.INSTANCE)) {
                        screenNavigator.goTo(screen);
                    } else if (Intrinsics.areEqual(bitcoinSendReceiveBottomSheetViewEvent, BitcoinSendReceiveBottomSheetViewEvent.ReceiveClicked.INSTANCE)) {
                        int ordinal = ((CryptoIdvStatus) ((State) obj2).getValue()).ordinal();
                        if (ordinal == 0 || ordinal == 1) {
                            ((RealCryptoFlowStarter) ((CryptoFlowStarter) paymentLoadingPresenter.featureFlagManager)).startCryptoIdvFlow(new BitcoinHome(null, null, null, null, 15), screenNavigator, BitcoinFeature.LN_DEPOSIT);
                        } else if (ordinal == 2) {
                            RealBitcoinInboundNavigator realBitcoinInboundNavigator = (RealBitcoinInboundNavigator) paymentLoadingPresenter.flowToken;
                            CryptoPaymentOrigin cryptoPaymentOrigin = CryptoPaymentOrigin.BITCOIN_TAB;
                            Money money = new Money((Long) 0L, CurrencyCode.BTC, 4);
                            realBitcoinInboundNavigator.getClass();
                            realBitcoinInboundNavigator.navigator.goTo(realBitcoinInboundNavigator.isLightningDepositEnabled() ? new BitcoinDepositsScreen(cryptoPaymentOrigin, money) : WalletAddressOptionsSheet.INSTANCE);
                        } else {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator.goTo(BitcoinFeatureUnavailableScreen.INSTANCE);
                        }
                    } else {
                        if (!Intrinsics.areEqual(bitcoinSendReceiveBottomSheetViewEvent, BitcoinSendReceiveBottomSheetViewEvent.SendClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (paymentLoadingPresenter.isRequest && ((Boolean) ((State) obj3).getValue()).booleanValue()) {
                            Money money2 = (Money) ((State) obj7).getValue();
                            if (money2 != null) {
                                Long l = money2.amount;
                                l.getClass();
                                if (l.longValue() > 0) {
                                    r14 = money2;
                                }
                            }
                            screenNavigator.goTo(new BitcoinSendRestrictionScreen(r14, new BitcoinHome(null, null, null, null, 15)));
                        } else {
                            SendBitcoinNavigator sendBitcoinNavigator = (SendBitcoinNavigator) paymentLoadingPresenter.paymentNavigator;
                            Long l2 = (Long) ((State) obj5).getValue();
                            CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) ((State) obj6).getValue();
                            sendBitcoinNavigator.navigate(screenNavigator, l2, cryptoBalance$BitcoinBalance != null ? TextControllerKt.toMoney(cryptoBalance$BitcoinBalance) : null);
                        }
                    }
                    return Unit.INSTANCE;
                case 2:
                    MutableState mutableState = (MutableState) obj5;
                    LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                    CoroutineScope coroutineScope = (CoroutineScope) obj4;
                    SendStablecoinEvent sendStablecoinEvent = (SendStablecoinEvent) obj;
                    if (sendStablecoinEvent instanceof SendStablecoinEvent.AmountChanged) {
                        ((ParcelableSnapshotMutableLongState) ref$ObjectRef.element).setLongValue(((SendStablecoinEvent.AmountChanged) sendStablecoinEvent).amountCents);
                        mutableState.setValue(null);
                    } else if (Intrinsics.areEqual(sendStablecoinEvent, SendStablecoinEvent.ClosePressed.INSTANCE)) {
                        screenNavigator2.goTo(screen);
                    } else if (Intrinsics.areEqual(sendStablecoinEvent, SendStablecoinEvent.ScanQrCode.INSTANCE)) {
                        screenNavigator2.goTo(new BitcoinQrCodeScannerScreen(CryptoPaymentOrigin.STABLECOIN_DEMO, new Money(new Long(((ParcelableSnapshotMutableLongState) ref$ObjectRef.element).getLongValue()), CurrencyCode.USD, 4), true));
                    } else if (Intrinsics.areEqual(sendStablecoinEvent, SendStablecoinEvent.Withdraw.INSTANCE)) {
                        SolanaAddress solanaAddress = ((SendStablecoinScreen) localPosCheckInPresenter.cameraPermissions).address;
                        if (solanaAddress != null) {
                            JobKt.launch$default(coroutineScope, null, null, new AmountBlockerPresenter$models$1$2(localPosCheckInPresenter, solanaAddress, ref$ObjectRef, (Continuation) (0 == true ? 1 : 0), 16), 3);
                        } else {
                            PaymentScreens.MainPayment.SendCryptoCurrencyType sendCryptoCurrencyType = PaymentScreens.MainPayment.SendCryptoCurrencyType.USDC;
                            Money money3 = new Money(new Long(((ParcelableSnapshotMutableLongState) ref$ObjectRef.element).getLongValue()), CurrencyCode.USD, 4);
                            Orientation orientation = Orientation.CASH;
                            AppCreationActivity appCreationActivity = AppCreationActivity.HOMESCREEN;
                            UUID randomUUID = UUID.randomUUID();
                            randomUUID.getClass();
                            screenNavigator2.goTo(new PaymentScreens.MainPayment(money3, orientation, appCreationActivity, randomUUID, sendCryptoCurrencyType, null, null, null, 126456));
                        }
                    } else {
                        if (!(sendStablecoinEvent instanceof SendStablecoinEvent.PercentageSelected)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Money money4 = (Money) ((MutableState) obj6).getValue();
                        Money percent = money4 != null ? Moneys.percent(money4, ((SendStablecoinEvent.PercentageSelected) sendStablecoinEvent).percentage) : null;
                        Long l3 = percent != null ? percent.amount : null;
                        if (percent != null && l3 != null) {
                            ((ParcelableSnapshotMutableLongState) ref$ObjectRef.element).setLongValue(l3.longValue());
                            mutableState.setValue(((MoneyFormatter) obj7).format(percent));
                        }
                    }
                    return Unit.INSTANCE;
                case 3:
                    InputCardInfoPresenter inputCardInfoPresenter = (InputCardInfoPresenter) obj2;
                    ClientScenario clientScenario = inputCardInfoPresenter.clientScenario;
                    Analytics analytics = inputCardInfoPresenter.analytics;
                    BetterNavigator.ScreenNavigator screenNavigator3 = inputCardInfoPresenter.navigator;
                    BlockersScreens.InputCardInfoScreen inputCardInfoScreen = inputCardInfoPresenter.args;
                    CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                    InputCardInfoViewEvent inputCardInfoViewEvent = (InputCardInfoViewEvent) obj;
                    if (!(inputCardInfoViewEvent instanceof InputCardInfoViewEvent.TapScanCard)) {
                        if (inputCardInfoViewEvent instanceof InputCardInfoViewEvent.TapSkipBlocker) {
                            analytics.track(new InstrumentLinkNavigate(InputCardInfoHelpersKt.toCdfEntryPoint(clientScenario), InstrumentLinkNavigate.Value.SKIP), null);
                            if (inputCardInfoPresenter.skippable) {
                                screenNavigator3.goTo(inputCardInfoPresenter.blockersNavigator.getSkip(inputCardInfoScreen, inputCardInfoScreen.blockersData));
                            } else if (inputCardInfoScreen.bankAccountAllowed) {
                                BlockersData blockersData = inputCardInfoScreen.blockersData;
                                FeatureFlagManager featureFlagManager = inputCardInfoPresenter.featureFlagManager;
                                ClientScenario clientScenario2 = blockersData.clientScenario;
                                int i3 = clientScenario2 == null ? -1 : InputCardInfoPresenter$models$lambda$16$$inlined$getStartScreenForLinkingService$default$1$wm$InstitutionLinkingNavigator$WhenMappings.$EnumSwitchMapping$0[clientScenario2.ordinal()];
                                if (i3 == 1) {
                                    z = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled.INSTANCE)).enabled();
                                } else if (i3 == 2) {
                                    z = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InstrumentLinkTransferFundsStripeEnabled.INSTANCE)).enabled();
                                } else if (i3 == 3) {
                                    z = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InstrumentLinkResolveSuspensionStripeEnabled.INSTANCE)).enabled();
                                }
                                int i4 = 32;
                                if (blockersData.forceManualAch || blockersData.bankAccountOauthConfig == null) {
                                    bankAccountLinkingScreen = new BlockersScreens.BankAccountLinkingScreen(inputCardInfoScreen.blockersData, null, 1 == true ? 1 : 0, i4);
                                } else {
                                    LinkingFlowsData linkingFlowsData = blockersData.linkingFlowsData;
                                    if (linkingFlowsData == null || (supportedLinkingFlow = linkingFlowsData.preferred) == null) {
                                        plaidLinkScreen = new BlockersScreens.PlaidLinkScreen(blockersData, null);
                                    } else if (supportedLinkingFlow == BankAccountLinkingConfig.SupportedLinkingFlow.MANUAL) {
                                        bankAccountLinkingScreen = new BlockersScreens.BankAccountLinkingScreen(inputCardInfoScreen.blockersData, null, 1 == true ? 1 : 0, i4);
                                    } else {
                                        plaidLinkScreen = (supportedLinkingFlow == BankAccountLinkingConfig.SupportedLinkingFlow.STRIPE && z) ? new BlockersScreens.StripeLinkScreen(blockersData) : new BlockersScreens.PlaidLinkScreen(blockersData, null);
                                    }
                                    bankAccountLinkingScreen = plaidLinkScreen;
                                }
                                screenNavigator3.goTo(bankAccountLinkingScreen);
                            }
                        } else if (inputCardInfoViewEvent instanceof InputCardInfoViewEvent.TapNext) {
                            JobKt.launch$default(coroutineScope2, null, null, new InputCardInfoPresenter$models$2$2(inputCardInfoPresenter, (Ref$BooleanRef) obj3, inputCardInfoViewEvent, (MutableState) obj7, (ParcelableSnapshotMutableIntState) obj5, (MutableState) obj6, null), 3);
                        } else {
                            Continuation continuation2 = null;
                            if (!(inputCardInfoViewEvent instanceof InputCardInfoViewEvent.TapBack)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            analytics.track(new InstrumentLinkNavigate(InputCardInfoHelpersKt.toCdfEntryPoint(clientScenario), InstrumentLinkNavigate.Value.BACK), null);
                            if (inputCardInfoScreen.dismissAction != null) {
                                JobKt.launch$default(coroutineScope2, null, null, new InputCardInfoPresenter$models$2$3(inputCardInfoPresenter, continuation2, 0 == true ? 1 : 0), 3);
                            } else {
                                if (inputCardInfoPresenter.flow != BlockersData.Flow.ONBOARDING) {
                                    screen = inputCardInfoScreen.blockersData.exitScreen;
                                }
                                screenNavigator3.goTo(screen);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    MutableState mutableState2 = (MutableState) obj3;
                    CreditFirstTimeBorrowBlockerPresenter creditFirstTimeBorrowBlockerPresenter = (CreditFirstTimeBorrowBlockerPresenter) obj2;
                    zzb zzbVar = creditFirstTimeBorrowBlockerPresenter.outboundNavigator;
                    ?? r2 = creditFirstTimeBorrowBlockerPresenter.launcher;
                    BetterNavigator.ScreenNavigator screenNavigator4 = creditFirstTimeBorrowBlockerPresenter.navigator;
                    BlockersScreens.CreditFirstTimeBorrowBlockerScreen creditFirstTimeBorrowBlockerScreen = creditFirstTimeBorrowBlockerPresenter.args;
                    CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                    FirstTimeBorrowViewEvent firstTimeBorrowViewEvent = (FirstTimeBorrowViewEvent) obj;
                    ?? r8 = 0;
                    r8 = null;
                    String str2 = null;
                    r8 = 0;
                    if (firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.BorrowButtonClick) {
                        FirstTimeBorrowData firstTimeBorrowData = creditFirstTimeBorrowBlockerScreen.blocker.first_time_borrow_data;
                        firstTimeBorrowData.getClass();
                        InitiateLoanData initiateLoanData = firstTimeBorrowData.picker_data;
                        initiateLoanData.getClass();
                        creditFirstTimeBorrowBlockerPresenter.analytics.track(new BorrowAppletViewLoanAmountPicker(creditFirstTimeBorrowBlockerPresenter.flowToken, CollectionsKt.joinToString$default(initiateLoanData.quick_loan_options, ",", null, null, 0, null, new LoanDetailsSheetKt$$ExternalSyntheticLambda3(2), 30)), null);
                        mutableState2.setValue(initiateLoanData.quick_loan_options.isEmpty() ? CreditFirstTimeBorrowBlockerPresenter.AmountPickerState.Full : CreditFirstTimeBorrowBlockerPresenter.AmountPickerState.Condensed);
                    } else if (firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.SecondaryButtonClick) {
                        JobKt.launch$default(coroutineScope3, null, null, new FileBlockerView$6$2$2(creditFirstTimeBorrowBlockerPresenter, firstTimeBorrowViewEvent, (MutableState) obj5, r8, 26), 3);
                    } else if (firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.NoticeLinkClick) {
                        r2.launchUrlInInternalBrowser(((FirstTimeBorrowViewEvent.NoticeLinkClick) firstTimeBorrowViewEvent).url);
                    } else {
                        boolean z2 = firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.BulletsButtonClick;
                        Back back = Back.INSTANCE;
                        if (z2) {
                            FirstTimeBorrowData firstTimeBorrowData2 = creditFirstTimeBorrowBlockerScreen.blocker.first_time_borrow_data;
                            firstTimeBorrowData2.getClass();
                            FirstTimeBorrowData.BulletContent bulletContent = firstTimeBorrowData2.bullet_content;
                            bulletContent.getClass();
                            FirstTimeBorrowData.BulletContent.SupportData supportData = bulletContent.support_data;
                            supportData.getClass();
                            String str3 = supportData.support_node;
                            str3.getClass();
                            screenNavigator4.goTo(RealSupportNavigator.startSupportFlow$default((RealSupportNavigator) zzbVar.zza, str3, null, back, SupportNavigator$Source.MONEY, null, null, 102));
                        } else if (firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.HelpButtonClick) {
                            FirstTimeBorrowData firstTimeBorrowData3 = creditFirstTimeBorrowBlockerScreen.blocker.first_time_borrow_data;
                            firstTimeBorrowData3.getClass();
                            FirstTimeBorrowData.PromoContent promoContent = firstTimeBorrowData3.promo_content;
                            promoContent.getClass();
                            FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting = promoContent.support_node_routing;
                            if (supportNodeRouting != null) {
                                FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode buttonSupportNode = supportNodeRouting instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode ? (FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) supportNodeRouting : null;
                                if (buttonSupportNode != null) {
                                    str = buttonSupportNode.getValue();
                                    if (str == null) {
                                        FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting2 = promoContent.support_node_routing;
                                        if (supportNodeRouting2 != null) {
                                            FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode buttonSupportNode2 = supportNodeRouting2 instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode ? (FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonSupportNode) supportNodeRouting2 : null;
                                            if (buttonSupportNode2 != null) {
                                                str2 = buttonSupportNode2.getValue();
                                            }
                                        }
                                        String str4 = str2;
                                        str4.getClass();
                                        screenNavigator4.goTo(RealSupportNavigator.startSupportFlow$default((RealSupportNavigator) zzbVar.zza, str4, null, back, SupportNavigator$Source.MONEY, null, null, 102));
                                    } else {
                                        FirstTimeBorrowData.PromoContent.SupportNodeRouting supportNodeRouting3 = promoContent.support_node_routing;
                                        if (supportNodeRouting3 != null) {
                                            FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl buttonUrl = supportNodeRouting3 instanceof FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl ? (FirstTimeBorrowData.PromoContent.SupportNodeRouting.ButtonUrl) supportNodeRouting3 : null;
                                            if (buttonUrl != null) {
                                                r8 = buttonUrl.getValue();
                                            }
                                        }
                                        r8.getClass();
                                        r2.launchUrlInInternalBrowser(r8);
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        } else if (firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.Close) {
                            screenNavigator4.goTo(creditFirstTimeBorrowBlockerScreen.blockersData.exitScreen);
                        } else if (firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.AmountPickerEvent) {
                            BorrowAmountPickerViewEvent borrowAmountPickerViewEvent = ((FirstTimeBorrowViewEvent.AmountPickerEvent) firstTimeBorrowViewEvent).value;
                            if (borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.SelectQuickAmount) {
                                FirstTimeBorrowData firstTimeBorrowData4 = creditFirstTimeBorrowBlockerScreen.blocker.first_time_borrow_data;
                                firstTimeBorrowData4.getClass();
                                InitiateLoanData initiateLoanData2 = firstTimeBorrowData4.picker_data;
                                initiateLoanData2.getClass();
                                if (((BorrowAmountPickerViewEvent.SelectQuickAmount) borrowAmountPickerViewEvent).index == initiateLoanData2.quick_loan_options.size()) {
                                    mutableState2.setValue(CreditFirstTimeBorrowBlockerPresenter.AmountPickerState.Full);
                                }
                            } else if (borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.ConfirmQuickAmount) {
                                JobKt.launch$default(coroutineScope3, null, null, new CreditFirstTimeBorrowBlockerPresenter$models$2$2(creditFirstTimeBorrowBlockerPresenter, borrowAmountPickerViewEvent, (MutableState) obj6, (MutableState) obj7, null, 0), 3);
                            } else if (borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.ConfirmCustomAmount) {
                                JobKt.launch$default(coroutineScope3, null, null, new CreditFirstTimeBorrowBlockerPresenter$models$2$2(creditFirstTimeBorrowBlockerPresenter, borrowAmountPickerViewEvent, (MutableState) obj6, (MutableState) obj7, null, 1), 3);
                            } else {
                                if (!(borrowAmountPickerViewEvent instanceof BorrowAmountPickerViewEvent.Dismiss)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                mutableState2.setValue(CreditFirstTimeBorrowBlockerPresenter.AmountPickerState.Closed);
                            }
                        } else {
                            if (!(firstTimeBorrowViewEvent instanceof FirstTimeBorrowViewEvent.AlertDialogEvent)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ((MutableState) obj7).setValue(AlertDialogViewModel.Dismissed.INSTANCE);
                        }
                    }
                    return Unit.INSTANCE;
                case 5:
                    MutableState mutableState3 = (MutableState) obj5;
                    final MutableState mutableState4 = (MutableState) obj7;
                    final MutableState mutableState5 = (MutableState) obj3;
                    MutableState mutableState6 = (MutableState) obj2;
                    final LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj4;
                    BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                    DirectDepositUpdateManualFormDetailsViewEvent directDepositUpdateManualFormDetailsViewEvent = (DirectDepositUpdateManualFormDetailsViewEvent) obj;
                    if (directDepositUpdateManualFormDetailsViewEvent instanceof DirectDepositUpdateManualFormDetailsViewEvent.CheckAddSignature) {
                        mutableState6.setValue(Boolean.valueOf(((DirectDepositUpdateManualFormDetailsViewEvent.CheckAddSignature) directDepositUpdateManualFormDetailsViewEvent).checked));
                    } else if (Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.CreateForm.INSTANCE)) {
                        screenNavigator5.goTo(new DirectDepositUpdateManualFormCompletionScreen(((DirectDepositUpdateManualFormScreen) localEditorialPresenter.screen).token, new DirectDepositManualFormSubmissionScreen.FormDetails((String) mutableState5.getValue(), (String) mutableState4.getValue(), (PaycheckDepositAllocation) mutableState3.getValue(), ((Boolean) mutableState6.getValue()).booleanValue())));
                    } else if (Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.EditCompanyName.INSTANCE)) {
                        final ?? r3 = 0 == true ? 1 : 0;
                        screenNavigator5.askQuestion(DirectDepositEditCompanyNameScreen.CompanyNameQuestion.INSTANCE, new Function1() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$models$7$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i5 = r3;
                                MutableState mutableState7 = mutableState4;
                                LocalEditorialPresenter localEditorialPresenter2 = localEditorialPresenter;
                                switch (i5) {
                                    case 0:
                                        AskedQuestion askedQuestion = (AskedQuestion) obj8;
                                        askedQuestion.getClass();
                                        return new DirectDepositEditCompanyNameScreen(((DirectDepositUpdateManualFormScreen) localEditorialPresenter2.screen).token, (String) mutableState7.getValue(), askedQuestion);
                                    default:
                                        AskedQuestion askedQuestion2 = (AskedQuestion) obj8;
                                        askedQuestion2.getClass();
                                        return new DirectDepositEditFullNameScreen(((DirectDepositUpdateManualFormScreen) localEditorialPresenter2.screen).token, (String) mutableState7.getValue(), askedQuestion2);
                                }
                            }
                        });
                    } else if (Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.EditName.INSTANCE)) {
                        screenNavigator5.askQuestion(DirectDepositEditFullNameScreen.FullNameQuestion.INSTANCE, new Function1() { // from class: com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$models$7$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i5 = i2;
                                MutableState mutableState7 = mutableState5;
                                LocalEditorialPresenter localEditorialPresenter2 = localEditorialPresenter;
                                switch (i5) {
                                    case 0:
                                        AskedQuestion askedQuestion = (AskedQuestion) obj8;
                                        askedQuestion.getClass();
                                        return new DirectDepositEditCompanyNameScreen(((DirectDepositUpdateManualFormScreen) localEditorialPresenter2.screen).token, (String) mutableState7.getValue(), askedQuestion);
                                    default:
                                        AskedQuestion askedQuestion2 = (AskedQuestion) obj8;
                                        askedQuestion2.getClass();
                                        return new DirectDepositEditFullNameScreen(((DirectDepositUpdateManualFormScreen) localEditorialPresenter2.screen).token, (String) mutableState7.getValue(), askedQuestion2);
                                }
                            }
                        });
                    } else if (Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.EditPaycheckAmount.INSTANCE)) {
                        screenNavigator5.askQuestion(new DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion((PaycheckDepositAllocation) mutableState3.getValue()), new KClasses$$Lambda$2(localEditorialPresenter, 15));
                    } else if (Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.ViewExistingForm.INSTANCE)) {
                        Uri uri = (Uri) ((MutableState) obj6).getValue();
                        if (uri != null) {
                            screenNavigator5.goTo(new PdfScreen(uri, null));
                        }
                    } else if (!Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.RetryLoadingForm.INSTANCE) && !Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.Exit.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return Unit.INSTANCE;
                case 6:
                    MutableState mutableState7 = (MutableState) obj7;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj6;
                    ?? r9 = (MutableState) obj3;
                    TransfersPresenter transfersPresenter = (TransfersPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) transfersPresenter.navigator;
                    RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) transfersPresenter.args;
                    CoroutineScope coroutineScope4 = (CoroutineScope) obj4;
                    EarningsTrackerViewEvent earningsTrackerViewEvent = (EarningsTrackerViewEvent) obj;
                    if (Intrinsics.areEqual(earningsTrackerViewEvent, EarningsTrackerViewEvent.GoBack.INSTANCE)) {
                        screenNavigator6.goTo(screen);
                    } else {
                        boolean areEqual = Intrinsics.areEqual(earningsTrackerViewEvent, EarningsTrackerViewEvent.TimeframeSelectorIconClick.INSTANCE);
                        DateFilter dateFilter = DateFilter.AllTime.INSTANCE;
                        if (areEqual) {
                            DateFilter dateFilter2 = (DateFilter) r9.getValue();
                            dateFilter2.getClass();
                            Triple analyticsTimeframeData = zzhx.toAnalyticsTimeframeData(dateFilter2);
                            realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerFilterOpenTimeframeSelector((com.squareup.cash.cdf.earningstracker.Timeframe) analyticsTimeframeData.first, (Integer) analyticsTimeframeData.second, (Integer) analyticsTimeframeData.third), null);
                            DateFilter dateFilter3 = (DateFilter) r9.getValue();
                            if (dateFilter3 instanceof DateFilter.Monthly) {
                                timeframe = Timeframe.MONTHLY;
                            } else if (dateFilter3 instanceof DateFilter.Yearly) {
                                timeframe = Timeframe.YEARLY;
                            } else {
                                if (!Intrinsics.areEqual(dateFilter3, dateFilter)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                timeframe = Timeframe.ALL_TIME;
                            }
                            screenNavigator6.goTo(new EarningsTimeframeSelectorSheetScreen(timeframe));
                        } else if (Intrinsics.areEqual(earningsTrackerViewEvent, EarningsTrackerViewEvent.NetEarningsInfoClick.INSTANCE)) {
                            DateFilter dateFilter4 = (DateFilter) r9.getValue();
                            EarningsTrackerInteractViewInfoSheet.InfoContextType infoContextType = EarningsTrackerInteractViewInfoSheet.InfoContextType.NET_EARNINGS;
                            dateFilter4.getClass();
                            Triple analyticsTimeframeData2 = zzhx.toAnalyticsTimeframeData(dateFilter4);
                            realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerInteractViewInfoSheet((com.squareup.cash.cdf.earningstracker.Timeframe) analyticsTimeframeData2.first, (Integer) analyticsTimeframeData2.second, (Integer) analyticsTimeframeData2.third), null);
                            screenNavigator6.goTo(NetEarningsInfoSheetScreen.INSTANCE);
                        } else if (earningsTrackerViewEvent instanceof EarningsTrackerViewEvent.TimeframeSelected) {
                            Timeframe timeframe2 = ((EarningsTrackerViewEvent.TimeframeSelected) earningsTrackerViewEvent).timeframe;
                            DateFilter dateFilter5 = (DateFilter) r9.getValue();
                            int ordinal2 = timeframe2.ordinal();
                            if (ordinal2 == 0) {
                                if (!(dateFilter5 instanceof DateFilter.Monthly)) {
                                    if (dateFilter5 instanceof DateFilter.Yearly) {
                                        dateFilter = new DateFilter.Monthly(transfersPresenter.getCurrentMonthAsMonthlyFilter().month, ((DateFilter.Yearly) dateFilter5).year);
                                    } else {
                                        if (!(dateFilter5 instanceof DateFilter.AllTime)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        dateFilter = transfersPresenter.getCurrentMonthAsMonthlyFilter();
                                    }
                                    if (!dateFilter.equals((DateFilter) r9.getValue())) {
                                    }
                                }
                                dateFilter = dateFilter5;
                                if (!dateFilter.equals((DateFilter) r9.getValue())) {
                                }
                            } else if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (!dateFilter.equals((DateFilter) r9.getValue())) {
                                    r9.setValue(dateFilter);
                                    DateFilter dateFilter6 = (DateFilter) r9.getValue();
                                    dateFilter6.getClass();
                                    Triple analyticsTimeframeData3 = zzhx.toAnalyticsTimeframeData(dateFilter6);
                                    realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerFilterUpdateTimeframe((com.squareup.cash.cdf.earningstracker.Timeframe) analyticsTimeframeData3.first, (Integer) analyticsTimeframeData3.second, (Integer) analyticsTimeframeData3.third), null);
                                    TransfersPresenter.access$models$trackLoadApplet(transfersPresenter, r9, EarningsTrackerOpenLoadApplet.Trigger.FILTER_UPDATE);
                                }
                            } else {
                                if (dateFilter5 instanceof DateFilter.Monthly) {
                                    dateFilter = new DateFilter.Yearly(((DateFilter.Monthly) dateFilter5).year);
                                } else {
                                    if (!(dateFilter5 instanceof DateFilter.Yearly)) {
                                        if (!(dateFilter5 instanceof DateFilter.AllTime)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        dateFilter = new DateFilter.Yearly(DimensionKt.nowLocalDate((AndroidClock) transfersPresenter.issuedCardManager).getYear());
                                    }
                                    dateFilter = dateFilter5;
                                }
                                if (!dateFilter.equals((DateFilter) r9.getValue())) {
                                }
                            }
                        } else {
                            Continuation continuation3 = null;
                            if (earningsTrackerViewEvent instanceof EarningsTrackerViewEvent.CustomerClicked) {
                                JobKt.launch$default(coroutineScope4, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2(transfersPresenter, earningsTrackerViewEvent, continuation3, 2), 3);
                            } else if (earningsTrackerViewEvent instanceof EarningsTrackerViewEvent.BarSelected) {
                                DateFilter dateFilter7 = (DateFilter) r9.getValue();
                                dateFilter7.getClass();
                                Triple analyticsTimeframeData4 = zzhx.toAnalyticsTimeframeData(dateFilter7);
                                realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerInteractViewChartDetails((com.squareup.cash.cdf.earningstracker.Timeframe) analyticsTimeframeData4.first, (Integer) analyticsTimeframeData4.second, (Integer) analyticsTimeframeData4.third), null);
                                EarningsTrackerViewModel earningsTrackerViewModel = (EarningsTrackerViewModel) mutableState7.getValue();
                                earningsTrackerViewModel.getClass();
                                EarningsTrackerViewEvent.BarSelected barSelected = (EarningsTrackerViewEvent.BarSelected) earningsTrackerViewEvent;
                                mutableState7.setValue(EarningsTrackerViewModel.Loaded.copy$default((EarningsTrackerViewModel.Loaded) earningsTrackerViewModel, new HeroHeaderViewModel(new HeaderTitle.TextTitle(barSelected.displayValue), new HeaderSubtitle.TextSubtitle(barSelected.displayLabel), false)));
                            } else if (Intrinsics.areEqual(earningsTrackerViewEvent, EarningsTrackerViewEvent.BarSelectionCleared.INSTANCE)) {
                                EarningsTrackerDataResult earningsTrackerDataResult = (EarningsTrackerDataResult) ((MutableState) obj5).getValue();
                                earningsTrackerDataResult.getClass();
                                if (!(earningsTrackerDataResult instanceof EarningsTrackerDataResult.Success)) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Expected Success but was ".concat(earningsTrackerDataResult.getClass().getSimpleName()));
                                    return null;
                                }
                                EarningsTrackerDataResponse earningsTrackerDataResponse = ((EarningsTrackerDataResult.Success) earningsTrackerDataResult).earnings;
                                EarningsTrackerViewModel earningsTrackerViewModel2 = (EarningsTrackerViewModel) mutableState7.getValue();
                                earningsTrackerViewModel2.getClass();
                                EarningsTrackerViewModel.Loaded loaded = (EarningsTrackerViewModel.Loaded) earningsTrackerViewModel2;
                                MoneyFormatter moneyFormatter = (MoneyFormatter) transfersPresenter.blockersHelper;
                                Money money5 = earningsTrackerDataResponse.total_earnings;
                                money5.getClass();
                                HeaderTitle.TextTitle textTitle = new HeaderTitle.TextTitle(moneyFormatter.format(money5));
                                Trend trend = earningsTrackerDataResponse.trend;
                                mutableState7.setValue(EarningsTrackerViewModel.Loaded.copy$default(loaded, new HeroHeaderViewModel(textTitle, trend != null ? transfersPresenter.toHeaderSubtitle(trend) : null, false)));
                            } else if (Intrinsics.areEqual(earningsTrackerViewEvent, EarningsTrackerViewEvent.Refresh.INSTANCE)) {
                                TransfersPresenter.access$models$trackLoadApplet(transfersPresenter, r9, EarningsTrackerOpenLoadApplet.Trigger.ERROR_REFRESH);
                                int intValue = parcelableSnapshotMutableIntState.getIntValue();
                                parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                                Okio.boxInt(intValue);
                            } else if (Intrinsics.areEqual(earningsTrackerViewEvent, EarningsTrackerViewEvent.PullToRefresh.INSTANCE)) {
                                TransfersPresenter.access$models$trackLoadApplet(transfersPresenter, r9, EarningsTrackerOpenLoadApplet.Trigger.MANUAL_REFRESH);
                                int intValue2 = parcelableSnapshotMutableIntState.getIntValue();
                                parcelableSnapshotMutableIntState.setIntValue(intValue2 + 1);
                                Okio.boxInt(intValue2);
                            } else if (earningsTrackerViewEvent instanceof EarningsTrackerViewEvent.FilterChipClicked) {
                                TransfersPresenter.access$models$trackLoadApplet(transfersPresenter, r9, EarningsTrackerOpenLoadApplet.Trigger.FILTER_UPDATE);
                                DateFilter dateFilter8 = ((EarningsTrackerViewEvent.FilterChipClicked) earningsTrackerViewEvent).earningsFilter;
                                if (Intrinsics.areEqual(dateFilter8, (DateFilter) r9.getValue())) {
                                    int intValue3 = parcelableSnapshotMutableIntState.getIntValue();
                                    parcelableSnapshotMutableIntState.setIntValue(intValue3 + 1);
                                    Okio.boxInt(intValue3);
                                } else {
                                    dateFilter8.getClass();
                                    Triple analyticsTimeframeData5 = zzhx.toAnalyticsTimeframeData(dateFilter8);
                                    realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerInteractChangeDisplayPill((com.squareup.cash.cdf.earningstracker.Timeframe) analyticsTimeframeData5.first, (Integer) analyticsTimeframeData5.second, (Integer) analyticsTimeframeData5.third), null);
                                    r9.setValue(dateFilter8);
                                }
                            } else {
                                if (!Intrinsics.areEqual(earningsTrackerViewEvent, EarningsTrackerViewEvent.HeaderAnimationComplete.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                EarningsTrackerViewModel earningsTrackerViewModel3 = (EarningsTrackerViewModel) mutableState7.getValue();
                                earningsTrackerViewModel3.getClass();
                                EarningsTrackerViewModel.Loaded loaded2 = (EarningsTrackerViewModel.Loaded) earningsTrackerViewModel3;
                                HeroHeaderViewModel heroHeaderViewModel = loaded2.heroHeader;
                                HeaderTitle headerTitle = heroHeaderViewModel.title;
                                headerTitle.getClass();
                                HeaderTitle.EarningsCounterTitle earningsCounterTitle = (HeaderTitle.EarningsCounterTitle) headerTitle;
                                String str5 = earningsCounterTitle.currencySymbol;
                                Money money6 = earningsCounterTitle.earnings;
                                money6.getClass();
                                mutableState7.setValue(EarningsTrackerViewModel.Loaded.copy$default(loaded2, new HeroHeaderViewModel(new HeaderTitle.EarningsCounterTitle(money6, str5, false), heroHeaderViewModel.subtitle, heroHeaderViewModel.shouldManualRefresh)));
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 7:
                    GrowToolsManagerState growToolsManagerState = (GrowToolsManagerState) obj2;
                    RealBugReportSenderFactory realBugReportSenderFactory = (RealBugReportSenderFactory) obj4;
                    FlowStarter flowStarter = (FlowStarter) realBugReportSenderFactory.tempStorage;
                    BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) realBugReportSenderFactory.featureEligibilityDumper;
                    GrowToolsManagerViewEvent growToolsManagerViewEvent = (GrowToolsManagerViewEvent) obj;
                    if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ActivityShowMoreTapped.INSTANCE)) {
                        screenNavigator7.goTo(new GrowToolsCompleteActivityScreen((GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen) realBugReportSenderFactory.backStackDumper));
                    } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.Back.INSTANCE)) {
                        screenNavigator7.goTo(screen);
                    } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ChangeButtonTapped.INSTANCE)) {
                        screenNavigator7.goTo(FlowStarter.startPlasmaFlow$default(flowStarter, Flow$Type.AUTO_WITHDRAWAL_BITCOIN, (GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen) realBugReportSenderFactory.backStackDumper, null, null, 12));
                    } else {
                        Continuation continuation4 = null;
                        if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.DialogConfirmTapped.INSTANCE)) {
                            growToolsManagerState.setShowDialog(null);
                            growToolsManagerState.setInteractive(false);
                            JobKt.launch$default((CoroutineScope) obj3, null, null, new AnimationsKt$takeUntil$1$1.AnonymousClass1(realBugReportSenderFactory, growToolsManagerState, (MutableState) obj7, continuation4, 28), 3);
                        } else if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DialogDismissTapped) {
                            growToolsManagerState.setShowDialog(null);
                            growToolsManagerState.setInteractive(true);
                        } else if (!Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.TargetAvatarTapped.INSTANCE)) {
                            if (!(growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.ToggleTapped)) {
                                if (!(growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DetailRowTapped)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow growToolsBitcoinAutoWithdrawManager$FieldDetailRow = (GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow) CollectionsKt.getOrNull(((GrowToolsManagerViewEvent.DetailRowTapped) growToolsManagerViewEvent).index, (List) ((MutableState) obj6).getValue());
                                if (growToolsBitcoinAutoWithdrawManager$FieldDetailRow != null) {
                                    screenNavigator7.goTo(FlowStarter.startPlasmaFlowWithParams$default(flowStarter, "AUTO_WITHDRAWAL_BITCOIN?field=".concat(growToolsBitcoinAutoWithdrawManager$FieldDetailRow.field), (GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen) realBugReportSenderFactory.backStackDumper, null, null, null, null, false, null, 508));
                                }
                            } else if (((Boolean) ((MutableState) obj5).getValue()).booleanValue()) {
                                growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.TOGGLE_OFF_CONFIRMATION));
                            } else {
                                screenNavigator7.goTo(FlowStarter.startPlasmaFlow$default(flowStarter, Flow$Type.AUTO_WITHDRAWAL_BITCOIN, (GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen) realBugReportSenderFactory.backStackDumper, null, null, 12));
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 8:
                    ?? r92 = (MutableState) obj3;
                    CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                    RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) cardStudioPresenter.analytics;
                    InvestingScreens.InvestingPeriodSelectionScreen investingPeriodSelectionScreen = (InvestingScreens.InvestingPeriodSelectionScreen) cardStudioPresenter.appConfig;
                    CoroutineScope coroutineScope5 = (CoroutineScope) obj4;
                    PeriodSelectionViewEvent periodSelectionViewEvent = (PeriodSelectionViewEvent) obj;
                    if (Intrinsics.areEqual(periodSelectionViewEvent, PeriodSelectionViewEvent.BackClick.INSTANCE)) {
                        ((BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator).goTo(investingPeriodSelectionScreen.prevScreenBottomSheet);
                    } else {
                        if (!(periodSelectionViewEvent instanceof PeriodSelectionViewEvent.PeriodClick)) {
                            if (Intrinsics.areEqual(periodSelectionViewEvent, PeriodSelectionViewEvent.SubmitClick.INSTANCE)) {
                                InvestmentEntityToken investmentEntityToken = investingPeriodSelectionScreen.investmentEntityToken;
                                String str6 = investingPeriodSelectionScreen.symbol;
                                OrderSide cdf = ProcessPhoenix.toCdf(investingPeriodSelectionScreen.orderSide);
                                String str7 = RetryTlsHandshakeKt.access$getSelectedPeriod((PeriodSelectionViewModel.ContentModel) r92.getValue()).label;
                                str7.getClass();
                                investmentEntityToken.getClass();
                                str6.getClass();
                                realInvestingAnalytics.analytics.track(new StockTradeSetExpiration(cdf, str6, str7), null);
                                CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) ((MutableState) obj7).getValue();
                                customOrderConfiguration.getClass();
                                for (Period period : customOrderConfiguration.periods) {
                                    if (Intrinsics.areEqual(period.token, ((PeriodSelectionViewModel.ContentModel) r92.getValue()).selectedPeriodToken)) {
                                        Long l4 = investingPeriodSelectionScreen.amount;
                                        Money money7 = l4 != null ? new Money(new Long(l4.longValue()), CurrencyCode.USD, 4) : null;
                                        RequestContext requestContext2 = new RequestContext(null, null, null, null, null, null, null, null, 8191);
                                        OrderType orderType = OrderType.MARKET_WHEN_TOUCHED;
                                        String str8 = investingPeriodSelectionScreen.investmentEntityToken.value;
                                        String str9 = investingPeriodSelectionScreen.balanceToken;
                                        String uuid = UUID.randomUUID().toString();
                                        com.squareup.protos.franklin.investing.resources.OrderSide orderSide = investingPeriodSelectionScreen.orderSide;
                                        String str10 = period.token;
                                        str10.getClass();
                                        Long l5 = new Long(investingPeriodSelectionScreen.customOrder.currentUsdPerShare);
                                        CurrencyCode currencyCode = CurrencyCode.USD;
                                        CustomOrder customOrder = new CustomOrder(new Money(l5, currencyCode, 4), new Money(new Long(investingPeriodSelectionScreen.customOrder.targetUsdPerShare), currencyCode, 4), str10, ByteString.EMPTY);
                                        String str11 = investingPeriodSelectionScreen.shares;
                                        if (str11 != null) {
                                            zzeaVar = new InitiateInvestmentOrderRequest$RequestValue$Units(str11);
                                        } else if (money7 != null) {
                                            zzeaVar = new InitiateInvestmentOrderRequest$RequestValue$Amount(money7);
                                        } else {
                                            requestContext = requestContext2;
                                            zzeaVar = null;
                                            JobKt.launch$default(coroutineScope5, (CoroutineContext) cardStudioPresenter.ioContext, null, new CheckStatusPresenter.AnonymousClass1((MutableSharedFlow) obj5, new InitiateInvestmentOrderRequest(requestContext, str8, str9, uuid, zzeaVar, orderType, orderSide, null, customOrder, 1536), null, 29), 2);
                                            ((MutableState) obj6).setValue(Boolean.TRUE);
                                        }
                                        requestContext = requestContext2;
                                        JobKt.launch$default(coroutineScope5, (CoroutineContext) cardStudioPresenter.ioContext, null, new CheckStatusPresenter.AnonymousClass1((MutableSharedFlow) obj5, new InitiateInvestmentOrderRequest(requestContext, str8, str9, uuid, zzeaVar, orderType, orderSide, null, customOrder, 1536), null, 29), 2);
                                        ((MutableState) obj6).setValue(Boolean.TRUE);
                                    }
                                }
                                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            return null;
                        }
                        PeriodSelectionViewModel.ContentModel contentModel = (PeriodSelectionViewModel.ContentModel) r92.getValue();
                        String str12 = ((PeriodSelectionViewEvent.PeriodClick) periodSelectionViewEvent).token;
                        String str13 = contentModel.title;
                        String str14 = contentModel.subTitle;
                        String str15 = contentModel.submitLabel;
                        List list = contentModel.periods;
                        str13.getClass();
                        str14.getClass();
                        str15.getClass();
                        list.getClass();
                        PeriodSelectionViewModel.ContentModel contentModel2 = new PeriodSelectionViewModel.ContentModel(str13, str14, str15, str12, list, true);
                        String str16 = investingPeriodSelectionScreen.symbol;
                        OrderSide cdf2 = ProcessPhoenix.toCdf(investingPeriodSelectionScreen.orderSide);
                        String str17 = RetryTlsHandshakeKt.access$getSelectedPeriod(contentModel2).label;
                        str17.getClass();
                        str16.getClass();
                        realInvestingAnalytics.analytics.track(new StockTradeSelectExpiration(cdf2, str16, str17), null);
                        r92.setValue(contentModel2);
                    }
                    return Unit.INSTANCE;
                case 9:
                    return emit$com$squareup$cash$investing$presenters$search$InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$2$2(obj, continuation);
                case 10:
                    return emit$com$squareup$cash$money$presenters$HypeWelcomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 11:
                    return emit$com$squareup$cash$onboarding$accountpicker$presenters$AccountPickerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 12:
                    return emit$com$squareup$cash$paychecks$presenters$EditDistributionPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 13:
                    return emit$com$squareup$cash$paymentpad$presenters$MainPaymentPadPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 14:
                    return emit$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 15:
                    return emit$com$squareup$cash$payments$presenters$NearbyPaymentKeypadPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 16:
                    return emit$com$squareup$cash$profile$presenters$ProfilePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 17:
                    return emit$com$squareup$cash$profile$presenters$personal$ArcadeAutofillSettingsDetailPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                case 18:
                    return emit$com$squareup$cash$support$presenters$ContactSupportEmailMessagePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                default:
                    CardLockPresenter cardLockPresenter = (CardLockPresenter) obj4;
                    Analytics analytics2 = (Analytics) cardLockPresenter.analytics;
                    CardLockViewEvent cardLockViewEvent = (CardLockViewEvent) obj;
                    if (!(cardLockViewEvent instanceof CardLockViewEvent.ToggleLock)) {
                        if (cardLockViewEvent instanceof CardLockViewEvent.Dismiss) {
                            cardLockPresenter.navigator.goTo(screen);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CardLockViewEvent.ToggleLock toggleLock = (CardLockViewEvent.ToggleLock) cardLockViewEvent;
                    String str18 = toggleLock.deviceId;
                    boolean z3 = toggleLock.setLocked;
                    boolean areEqual2 = Intrinsics.areEqual(str18, "card");
                    boolean z4 = !areEqual2;
                    int i5 = ((LiteCardLockFlowTypeProvider) cardLockPresenter.cardLockFlowTypeProvider).$r8$classId;
                    str18.getClass();
                    switch (i5) {
                        case 0:
                            if (Intrinsics.areEqual(str18, "card")) {
                                if (z3) {
                                    flow$Type = Flow$Type.LITE_DISABLE_ISSUED_CARD;
                                    break;
                                } else {
                                    flow$Type = Flow$Type.LITE_ENABLE_ISSUED_CARD;
                                    break;
                                }
                            } else if (z3) {
                                flow$Type = Flow$Type.LOCK_PAYMENT_TOKEN_DEVICE;
                                break;
                            } else {
                                flow$Type = Flow$Type.UNLOCK_PAYMENT_TOKEN_DEVICE;
                                break;
                            }
                        default:
                            if (Intrinsics.areEqual(str18, "card")) {
                                if (z3) {
                                    flow$Type = Flow$Type.DISABLE_ISSUED_CARD_IN_POSTCARD;
                                    break;
                                } else {
                                    flow$Type = Flow$Type.ENABLE_ISSUED_CARD;
                                    break;
                                }
                            } else if (z3) {
                                flow$Type = Flow$Type.LOCK_PAYMENT_TOKEN_DEVICE;
                                break;
                            } else {
                                flow$Type = Flow$Type.UNLOCK_PAYMENT_TOKEN_DEVICE;
                                break;
                            }
                    }
                    Flow$Type flow$Type2 = flow$Type;
                    String m = Boxes$$ExternalSyntheticOutline1.m();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (areEqual2) {
                        cashAppTag = null;
                    } else {
                        Iterator it = ((List) ((State) obj3).getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                cashAppTag2 = it.next();
                                if (Intrinsics.areEqual(((CashAppTag) cashAppTag2).deviceId, str18)) {
                                }
                            } else {
                                cashAppTag2 = 0;
                            }
                        }
                        cashAppTag = cashAppTag2;
                    }
                    if (cashAppTag == null || (tagFormFactor = cashAppTag.formFactor) == null) {
                        deviceType = null;
                    } else {
                        int ordinal3 = tagFormFactor.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    if (ordinal3 != 3) {
                                        if (ordinal3 != 4) {
                                            if (ordinal3 != 5) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                        }
                                    }
                                }
                                deviceType = DeviceType.MINI_CARD;
                            }
                            deviceType = DeviceType.HEART;
                        }
                        deviceType = DeviceType.WAND;
                    }
                    if (areEqual2) {
                        if (z3) {
                            analytics2.track(new CashCardManageDisable(), null);
                        } else {
                            analytics2.track(new CashCardManageEnable(), null);
                        }
                    } else if (z3) {
                        analytics2.track(new MintTagLockRequested(deviceType, str18, m), null);
                    } else {
                        analytics2.track(new MintTagUnlockRequested(deviceType, str18, m), null);
                    }
                    MutableState mutableState8 = (MutableState) obj7;
                    mutableState8.setValue(MapsKt__MapsKt.plus((Map) mutableState8.getValue(), new Pair(str18, Boolean.TRUE)));
                    MutableState mutableState9 = (MutableState) obj5;
                    mutableState9.setValue(MapsKt__MapsKt.minus((Map) mutableState9.getValue(), str18));
                    MutableState mutableState10 = (MutableState) obj6;
                    mutableState10.setValue(MapsKt__MapsKt.plus((Map) mutableState10.getValue(), new Pair(str18, Boolean.valueOf(z3))));
                    RealDeviceLockAnimationBus realDeviceLockAnimationBus = (RealDeviceLockAnimationBus) cardLockPresenter.deviceLockAnimationBus;
                    StateFlowImpl stateFlowImpl = realDeviceLockAnimationBus._loadingDeviceIds;
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, SetsKt___SetsKt.plus((Set) value, str18)));
                    realDeviceLockAnimationBus._scrollToDeviceEvents.tryEmit(str18);
                    JobKt.launch$default((CoroutineScope) obj2, null, null, new CardLockPresenter$models$1$1(cardLockPresenter, str18, z4, currentTimeMillis, z3, deviceType, m, flow$Type2, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, null), 3);
                    return Unit.INSTANCE;
            }
        }

        public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
            this.$r8$classId = i;
            this.$$this$channelFlow = moleculePresenter;
            this.$applicationName = str;
            this.$previousManifest = mutableState;
            this.$serializersModule = mutableState2;
            this.$initializer = mutableState3;
            this.this$0 = coroutineScope;
        }

        public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, Object obj, Object obj2, Object obj3, State state, State state2, State state3, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.$$this$channelFlow = obj2;
            this.$previousManifest = obj3;
            this.$applicationName = state;
            this.$serializersModule = state2;
            this.$initializer = state3;
        }

        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.$$this$channelFlow = obj2;
            this.$previousManifest = obj3;
            this.$applicationName = obj4;
            this.$serializersModule = obj5;
            this.$initializer = obj6;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(String str, Continuation continuation) {
            ZiplineLoader$load$2$1$emit$1 ziplineLoader$load$2$1$emit$1;
            int i;
            ZiplineManifest ziplineManifest;
            Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$previousManifest;
            if (continuation instanceof ZiplineLoader$load$2$1$emit$1) {
                ziplineLoader$load$2$1$emit$1 = (ZiplineLoader$load$2$1$emit$1) continuation;
                int i2 = ziplineLoader$load$2$1$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    ziplineLoader$load$2$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    ZiplineLoader$load$2$1$emit$1 ziplineLoader$load$2$1$emit$12 = ziplineLoader$load$2$1$emit$1;
                    Object obj = ziplineLoader$load$2$1$emit$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ziplineLoader$load$2$1$emit$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        ZiplineLoader ziplineLoader = (ZiplineLoader) this.this$0;
                        ProducerScope producerScope = (ProducerScope) this.$$this$channelFlow;
                        ZiplineManifest ziplineManifest2 = (ZiplineManifest) ref$ObjectRef.element;
                        long longValue = ((Number) ((Function0) ziplineLoader.nowEpochMs).invoke()).longValue();
                        String str2 = (String) this.$applicationName;
                        SerializersModule serializersModule = (SerializersModule) this.$serializersModule;
                        RealImageLoader$execute$2 realImageLoader$execute$2 = (RealImageLoader$execute$2) this.$initializer;
                        ziplineLoader$load$2$1$emit$12.label = 1;
                        obj = ZiplineLoader.access$loadFromNetwork(ziplineLoader, producerScope, ziplineManifest2, longValue, str2, str, serializersModule, realImageLoader$execute$2, ziplineLoader$load$2$1$emit$12);
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
                    ziplineManifest = (ZiplineManifest) obj;
                    if (ziplineManifest != null) {
                        ref$ObjectRef.element = ziplineManifest;
                    }
                    return Unit.INSTANCE;
                }
            }
            ziplineLoader$load$2$1$emit$1 = new ZiplineLoader$load$2$1$emit$1(this, continuation);
            ZiplineLoader$load$2$1$emit$1 ziplineLoader$load$2$1$emit$122 = ziplineLoader$load$2$1$emit$1;
            Object obj2 = ziplineLoader$load$2$1$emit$122.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = ziplineLoader$load$2$1$emit$122.label;
            if (i != 0) {
            }
            ziplineManifest = (ZiplineManifest) obj2;
            if (ziplineManifest != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$load$2(LocalHomePresenter localHomePresenter, MutableState mutableState, SnapshotStateMap snapshotStateMap, Ref$ObjectRef ref$ObjectRef, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.this$0 = localHomePresenter;
        this.$applicationName = mutableState;
        this.$freshnessChecker = snapshotStateMap;
        this.L$1 = ref$ObjectRef;
        this.$serializersModule = mutableState2;
        this.$initializer = mutableState3;
        this.$manifestUrlFlow = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$load$2(BiometricsPromptBinding biometricsPromptBinding, BiometricsPromptBinding.BiometricsPromptBreadcrumb biometricsPromptBreadcrumb, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.$initializer = biometricsPromptBinding;
        this.$manifestUrlFlow = biometricsPromptBreadcrumb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$load$2(PoolMemberListPresenter poolMemberListPresenter, PoolMemberListViewEvent poolMemberListViewEvent, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 26;
        this.L$1 = poolMemberListPresenter;
        this.L$0 = poolMemberListViewEvent;
        this.this$0 = state;
        this.$freshnessChecker = mutableState;
        this.$serializersModule = mutableState2;
        this.$initializer = mutableState3;
        this.$manifestUrlFlow = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$load$2(HCaptcha hCaptcha, String str, AndroidCameraState androidCameraState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$initializer = hCaptcha;
        this.$applicationName = str;
        this.$manifestUrlFlow = androidCameraState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZiplineLoader$load$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, State state, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.$applicationName = obj3;
        this.$freshnessChecker = obj4;
        this.$serializersModule = obj5;
        this.$initializer = state;
        this.$manifestUrlFlow = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZiplineLoader$load$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.L$0 = obj2;
        this.this$0 = obj3;
        this.$applicationName = obj4;
        this.$freshnessChecker = obj5;
        this.$serializersModule = obj6;
        this.$initializer = obj7;
        this.$manifestUrlFlow = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZiplineLoader$load$2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$applicationName = obj2;
        this.$freshnessChecker = obj3;
        this.$serializersModule = obj4;
        this.$initializer = obj5;
        this.$manifestUrlFlow = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$load$2(Recomposer recomposer, AppWidgetSession appWidgetSession, StateFlowImpl stateFlowImpl, Context context, RemoteViewsRoot remoteViewsRoot, TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1, TimeoutOptions timeoutOptions, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.L$1 = recomposer;
        this.this$0 = appWidgetSession;
        this.$applicationName = stateFlowImpl;
        this.$freshnessChecker = context;
        this.$serializersModule = remoteViewsRoot;
        this.$initializer = timerScopeKt$withTimer$2$1$blockScope$1;
        this.$manifestUrlFlow = timeoutOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZiplineLoader$load$2(Flow flow, Continuation continuation, Object obj, Object obj2, Object obj3, State state, State state2, State state3, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = flow;
        this.this$0 = obj;
        this.$applicationName = obj2;
        this.$freshnessChecker = obj3;
        this.$serializersModule = state;
        this.$initializer = state2;
        this.$manifestUrlFlow = state3;
    }
}
