package com.squareup.cash.card.onboarding;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.collection.ArrayMap;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.FlowExtKt;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcher;
import androidx.paging.Pager$pageFetcher$2;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.arcade.values.NavigationIconType;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.ItemOffer;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.LineKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MessageToken;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.service.LocalService;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import coil3.RealImageLoader$execute$2;
import coil3.RealImageLoader$execute$result$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.svg.internal.AndroidSvg;
import com.google.android.gms.internal.location.zzer;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.miteksystems.misnap.camera.a.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchContinuation;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchInitiationSource;
import com.squareup.cash.account.backend.AccountSwitcher$Result;
import com.squareup.cash.account.backend.RealAccountSwitcher;
import com.squareup.cash.account.presenters.accountswitcher.SwitchFullAccountLoadingPresenter$switchAccount$1;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$WhenMappings;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.PopupAppMessageViewModel;
import com.squareup.cash.appmessages.db.PopupMessage;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$models$1$1;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPresenterHelper;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.banking.backend.real.RealConfirmCashOutVersionCodeProvider;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.banking.screens.ConfirmCashOutScreen;
import com.squareup.cash.banking.viewmodels.ConfirmCashOutDialogViewModel;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinAppletTileRepository;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$GraphError;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$LoadedPriceMovement;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$LoadingPriceMovement;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinRepositoryModel$Installed$ZeroBalance;
import com.squareup.cash.bitcoin.applets.presenters.data.RealBitcoinAppletTileRepository;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.bitcoin.presenters.payinusd.BitcoinPayInUsdPreference;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager;
import com.squareup.cash.bitcoin.screens.BitcoinInstrumentRecommendationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinLocationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinPayInUsdSettingsScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinPayInUsdSettingsViewModel;
import com.squareup.cash.bitcoin.viewmodels.autowithdraw.BitcoinAutoWithdrawUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModelKt;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.CardActivationPresenter$verifyQrCode$1;
import com.squareup.cash.blockers.presenters.CashtagPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsPresenter$State;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsPresenter$loadOrderDetails$1;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderHubScreen;
import com.squareup.cash.buynowpaylater.viewmodels.ActionButton;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsPaymentMethodModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubLoadingStatus;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.InfoTileCardViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.OrderDetailRowModel;
import com.squareup.cash.buynowpaylater.viewmodels.OrderPaymentViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.OverflowActionsModel;
import com.squareup.cash.buynowpaylater.viewmodels.SUPCardInfo;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransaction;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransactions;
import com.squareup.cash.buynowpaylater.viewmodels.StackableRow;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.cdf.localclient.FulfillmentType;
import com.squareup.cash.cdf.localmarketing.EventLocation;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.contacts.CustomerQueries$ForIdQuery;
import com.squareup.cash.db2.contacts.CustomerQueries$customerForPaymentToken$2;
import com.squareup.cash.device.DeviceOrientation;
import com.squareup.cash.device.RealDeviceOrientationProvider;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.presenters.DirectDepositManualFormDetailsPresenter$$ExternalSyntheticLambda1;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckCurrencyAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewModel;
import com.squareup.cash.earnings.applets.presenters.EarnerAppletTilePresenterKt$WhenMappings;
import com.squareup.cash.earnings.applets.presenters.RealEarnerAppletAvailabilityState;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileModel;
import com.squareup.cash.earnings.backend.api.CustomerInfo;
import com.squareup.cash.earnings.backend.api.PayerCustomersResult;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.earnings.presenters.payers.AddPayerCustomersPresenter$models$1$1;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earnings.screens.PayerTaggingPromptSheet;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.viewmodels.payers.LoadedData;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewModel;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferManager;
import com.squareup.cash.family.familyhub.screens.DependentTeenQrCodeShareSheetScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferLoadingScreen;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.history.payments.presenters.CounterpartyPageRequestHandler$Factory$Impl;
import com.squareup.cash.history.payments.presenters.ProfileActivityItemEventDecorator;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.viewmodels.RefundPaymentViewModel;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.presenters.InvestmentOrderPresenter$Empty;
import com.squareup.cash.investing.presenters.InvestmentOrderPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.custom.order.InvestingPeriodSelectionPresenter$WhenMappings;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentWelcomeViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneta.plasma.LinkBankAccountPlaidThenRedirectFlowParameters;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.pools.presenters.PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.timeline.viewmodels.TimelineWidgetModel;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferFee;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.btcnetwork.external.BitcoinSellerLocation;
import com.squareup.protos.cash.cashapproxy.api.Avatar;
import com.squareup.protos.cash.cashapproxy.api.Button;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cashapproxy.api.GetApOrderDetailsRequest;
import com.squareup.protos.cash.cashapproxy.api.GetApOrderDetailsResponse;
import com.squareup.protos.cash.cashapproxy.api.InfoTile;
import com.squareup.protos.cash.cashapproxy.api.OrderDetailRow;
import com.squareup.protos.cash.cashapproxy.api.OrderDetailRow$Row$Divider;
import com.squareup.protos.cash.cashapproxy.api.OrderDetailRow$Row$OrderDetailRow;
import com.squareup.protos.cash.cashapproxy.api.OrderDetailRow$Row$Spacer;
import com.squareup.protos.cash.cashapproxy.api.OrderPaymentMethod;
import com.squareup.protos.cash.cashapproxy.api.OverflowAction;
import com.squareup.protos.cash.cashapproxy.api.RowItem;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPayment;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentDetails;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import com.squareup.protos.cash.cashapproxy.api.SingleUsePaymentSummary;
import com.squareup.protos.cash.cashapproxy.api.SupTransactionSummary;
import com.squareup.protos.cash.cashapproxy.api.SupTransactions;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.VerifyQrCodeRequest;
import com.squareup.protos.franklin.app.VerifyQrCodeResponse;
import com.squareup.protos.franklin.common.ConfirmationSheetData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.Strings;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.earnings.EarningsAppletState;
import squareup.cash.earnings.EarningsAppletUIState;

/* loaded from: classes6.dex */
public final class CardStudioPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 21;
    public final Object analytics;
    public final Object appConfig;
    public final Object args;
    public Object cardStudioQueries;
    public final Object ioContext;
    public final Object navigator;

    public CardStudioPresenter(BalanceFeedScreen balanceFeedScreen, BetterNavigator.ScreenNavigator screenNavigator, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory, AndroidStringManager androidStringManager, RealActivitiesCacheManager realActivitiesCacheManager, LocalizedMoneyFormatter.Factory factory, RealBalanceSnapshotManager realBalanceSnapshotManager) {
        balanceFeedScreen.getClass();
        this.args = balanceFeedScreen;
        this.navigator = screenNavigator;
        this.ioContext = androidStringManager;
        this.analytics = realBalanceSnapshotManager;
        this.appConfig = factory.create(MoneyFormatterConfig.STANDARD);
        BalanceFeedScreen.BalanceType balanceType = balanceFeedScreen.balanceType;
        ActivitiesManager.ActivityPageHandler activityPageHandler = null;
        if (BalanceFeedPresenter$WhenMappings.$EnumSwitchMapping$0[balanceType.ordinal()] == 1) {
            this.cardStudioQueries = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(new ActivitiesManager.ActivityContext(RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN_RUNNING_BALANCE_CASH), ActivityScope.MY_ACTIVITY, activityPageHandler, 12), RealActivitiesCacheManager.take$default(realActivitiesCacheManager, balanceType), balanceFeedScreen, false, null, null, null, null, null, 16376));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            throw null;
        }
    }

    public static final SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState access$asInitialTimesState(CardStudioPresenter cardStudioPresenter, SchedulingDay schedulingDay) {
        SchedulingTime schedulingTime = (SchedulingTime) CollectionsKt.firstOrNull(schedulingDay.day_times);
        return schedulingTime != null ? new SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadedTimes(schedulingTime) : SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadingTimes.INSTANCE;
    }

    public static final FulfillmentType access$getFulfillmentTypeForCdf(CardStudioPresenter cardStudioPresenter) {
        FulfillmentConfiguration fulfillmentConfiguration = ((LocalSchedulingDayTimePickerScreen) cardStudioPresenter.appConfig).fulfillmentConfiguration;
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
            return FulfillmentType.DELIVERY;
        }
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup) {
            return FulfillmentType.PICKUP;
        }
        if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) && !Intrinsics.areEqual(fulfillmentConfiguration, FulfillmentConfiguration.Unspecified.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
        return null;
    }

    public static final Unit access$handleButtonClick(CardStudioPresenter cardStudioPresenter, BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption bitcoinInstrumentRecommendationOption, SuspendLambda suspendLambda) {
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        if (bitcoinInstrumentRecommendationOption instanceof BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer) {
            BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer continueBitcoinTransfer = (BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer) bitcoinInstrumentRecommendationOption;
            Unit initiateBitcoinExchange = ((RealCryptoFlowStarter) ((CryptoFlowStarter) cardStudioPresenter.args)).initiateBitcoinExchange(continueBitcoinTransfer.exitScreen, screenNavigator, continueBitcoinTransfer.exchangeType, continueBitcoinTransfer.sourceInstrumentToken, continueBitcoinTransfer.targetInstrumentToken, continueBitcoinTransfer.cashInInstrument, continueBitcoinTransfer.cashInInstrumentAmount, continueBitcoinTransfer.frequency);
            return initiateBitcoinExchange == CoroutineSingletons.COROUTINE_SUSPENDED ? initiateBitcoinExchange : Unit.INSTANCE;
        }
        if (bitcoinInstrumentRecommendationOption instanceof BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount) {
            BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount linkBankAccount = (BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount) bitcoinInstrumentRecommendationOption;
            FlowStarter flowStarter = (FlowStarter) cardStudioPresenter.appConfig;
            Money money = linkBankAccount.amount;
            String str = linkBankAccount.previousInstrumentToken;
            ByteString byteString = ByteString.EMPTY;
            LinkBankAccountPlaidThenRedirectFlowParameters linkBankAccountPlaidThenRedirectFlowParameters = new LinkBankAccountPlaidThenRedirectFlowParameters(new LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext(money, str, byteString), byteString);
            Screen screen = linkBankAccount.exitScreen;
            screen.getClass();
            screenNavigator.goTo(FlowStarter.startPlasmaFlowWithParams$default((RealFlowStarter) flowStarter, Flow$Type.LINK_BANK_ACCOUNT_PLAID_THEN_REDIRECT, linkBankAccountPlaidThenRedirectFlowParameters, screen, null, screen, null, null, 984));
        } else {
            if (!(bitcoinInstrumentRecommendationOption instanceof BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.SwitchToBankAccount)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(((BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.SwitchToBankAccount) bitcoinInstrumentRecommendationOption).exitScreen);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadOrderDetails(CardStudioPresenter cardStudioPresenter, ContinuationImpl continuationImpl) {
        AfterPayOrderDetailsPresenter$loadOrderDetails$1 afterPayOrderDetailsPresenter$loadOrderDetails$1;
        int i;
        ApiResult apiResult;
        AfterPayOrderDetailsViewEvent.PaymentMethodInfoButtonClicked paymentMethodInfoButtonClicked;
        ActionButton actionButton;
        SUPCardInfo sUPCardInfo;
        ArrayList arrayList;
        ArrayList arrayList2;
        TextModel textModel;
        SUPOrderTransactions sUPOrderTransactions;
        SUPOrderDetailsViewModel sUPOrderDetailsViewModel;
        String format2;
        String format3;
        Object orderDetailRowHeader;
        TimelineWidgetModel.Item.State state;
        MoneyFormatter moneyFormatter = (MoneyFormatter) cardStudioPresenter.cardStudioQueries;
        if (continuationImpl instanceof AfterPayOrderDetailsPresenter$loadOrderDetails$1) {
            afterPayOrderDetailsPresenter$loadOrderDetails$1 = (AfterPayOrderDetailsPresenter$loadOrderDetails$1) continuationImpl;
            int i2 = afterPayOrderDetailsPresenter$loadOrderDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterPayOrderDetailsPresenter$loadOrderDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = afterPayOrderDetailsPresenter$loadOrderDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterPayOrderDetailsPresenter$loadOrderDetails$1.label;
                TextModel textModel2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashApProxyClientService cashApProxyClientService = (CashApProxyClientService) cardStudioPresenter.args;
                    GetApOrderDetailsRequest getApOrderDetailsRequest = new GetApOrderDetailsRequest(((AfterPayOrderDetailsScreen) cardStudioPresenter.analytics).orderId, ByteString.EMPTY);
                    afterPayOrderDetailsPresenter$loadOrderDetails$1.label = 1;
                    obj = cashApProxyClientService.getApOrderDetails(getApOrderDetailsRequest, afterPayOrderDetailsPresenter$loadOrderDetails$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new AfterPayOrderDetailsViewModel.OrderDetailsErrorLoading(TextUtilsCompat.errorMessaging((AndroidStringManager) cardStudioPresenter.ioContext, (ApiResult.Failure) apiResult, null).message);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetApOrderDetailsResponse getApOrderDetailsResponse = (GetApOrderDetailsResponse) ((ApiResult.Success) apiResult).response;
                Avatar avatar = getApOrderDetailsResponse.avatar;
                OrderPaymentMethod orderPaymentMethod = getApOrderDetailsResponse.order_payment_method;
                com.squareup.cash.buynowpaylater.viewmodels.Avatar avatar2 = new com.squareup.cash.buynowpaylater.viewmodels.Avatar(avatar != null ? avatar.image : null, avatar != null ? avatar.badge : null);
                Text text = getApOrderDetailsResponse.title;
                TextModel textModel3 = text != null ? OfflineManagerKt.toTextModel(text, true) : null;
                Text text2 = getApOrderDetailsResponse.subtitle;
                TextModel textModel4 = text2 != null ? OfflineManagerKt.toTextModel(text2, true) : null;
                InfoTile infoTile = getApOrderDetailsResponse.info_tile;
                InfoTileCardViewModel parseInfoCard = infoTile != null ? OfflineManagerKt.parseInfoCard(infoTile) : null;
                boolean z = !getApOrderDetailsResponse.available_payment_methods.isEmpty();
                OrderPaymentViewModel parseOrderPaymentViewModel = orderPaymentMethod != null ? OfflineManagerKt.parseOrderPaymentViewModel(orderPaymentMethod) : null;
                if (orderPaymentMethod != null) {
                    OrderPaymentViewModel parseOrderPaymentViewModel2 = OfflineManagerKt.parseOrderPaymentViewModel(orderPaymentMethod);
                    TextModel textModel5 = parseOrderPaymentViewModel2.infoTitle;
                    textModel5.getClass();
                    StackableRow.Text text3 = new StackableRow.Text(textModel5);
                    TextModel textModel6 = parseOrderPaymentViewModel2.infoText;
                    textModel6.getClass();
                    paymentMethodInfoButtonClicked = new AfterPayOrderDetailsViewEvent.PaymentMethodInfoButtonClicked(new InfoSheetViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new StackableRow.Text[]{text3, new StackableRow.Text(textModel6)})));
                } else {
                    paymentMethodInfoButtonClicked = null;
                }
                AfterPayOrderDetailsPaymentMethodModel afterPayOrderDetailsPaymentMethodModel = new AfterPayOrderDetailsPaymentMethodModel(z, parseOrderPaymentViewModel, paymentMethodInfoButtonClicked);
                Text text4 = getApOrderDetailsResponse.balance_summary;
                TextModel textModel7 = text4 != null ? OfflineManagerKt.toTextModel(text4, true) : null;
                List list = getApOrderDetailsResponse.schedule_payments;
                list.getClass();
                moneyFormatter.getClass();
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ScheduledPayment scheduledPayment = (ScheduledPayment) it.next();
                    TextModel textModel8 = textModel2;
                    ScheduledPaymentStatus scheduledPaymentStatus = scheduledPayment.status;
                    scheduledPaymentStatus.getClass();
                    switch (scheduledPaymentStatus.ordinal()) {
                        case 0:
                            state = TimelineWidgetModel.Item.State.NORMAL;
                            break;
                        case 1:
                            state = TimelineWidgetModel.Item.State.UPCOMING;
                            break;
                        case 2:
                            state = TimelineWidgetModel.Item.State.HIGHLIGHT_COMPLETED;
                            break;
                        case 3:
                            state = TimelineWidgetModel.Item.State.ALERT;
                            break;
                        case 4:
                            state = TimelineWidgetModel.Item.State.REFUNDED_ALT;
                            break;
                        case 5:
                            state = TimelineWidgetModel.Item.State.UPCOMING;
                            break;
                        case 6:
                            state = TimelineWidgetModel.Item.State.PENDING;
                            break;
                        case 7:
                            state = TimelineWidgetModel.Item.State.UPCOMING;
                            break;
                        case 8:
                            state = TimelineWidgetModel.Item.State.CANCELED;
                            break;
                        case 9:
                            state = TimelineWidgetModel.Item.State.NORMAL;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return textModel8;
                    }
                    Text text5 = scheduledPayment.title;
                    String str = text5 != null ? text5.text : textModel8;
                    str.getClass();
                    Money money = scheduledPayment.amount;
                    money.getClass();
                    String format4 = moneyFormatter.format(money);
                    Text text6 = scheduledPayment.subtitle;
                    String str2 = text6 != null ? text6.text : textModel8;
                    str2.getClass();
                    Iterator it2 = it;
                    TimelineWidgetModel.Item.InlineText inlineText = new TimelineWidgetModel.Item.InlineText(str2, scheduledPaymentStatus == ScheduledPaymentStatus.SCHEDULED_PAYMENT_STATUS_OVERDUE ? TimelineWidgetModel.Item.InlineText.InlineState.OVERDUE : TimelineWidgetModel.Item.InlineText.InlineState.SECONDARY, false);
                    ArrayList arrayList4 = new ArrayList();
                    ScheduledPaymentDetails scheduledPaymentDetails = scheduledPayment.details;
                    arrayList4.add(new StackableRow.PaymentStatusIcon(scheduledPaymentStatus));
                    scheduledPaymentDetails.getClass();
                    Text text7 = scheduledPaymentDetails.title;
                    text7.getClass();
                    com.squareup.cash.buynowpaylater.viewmodels.Avatar avatar3 = avatar2;
                    arrayList4.add(new StackableRow.Text(OfflineManagerKt.toTextModel(text7, true)));
                    List list3 = scheduledPaymentDetails.details;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        RowItem rowItem = (RowItem) it3.next();
                        Iterator it4 = it3;
                        Text text8 = rowItem.title;
                        TextModel textModel9 = textModel3;
                        TextModel textModel10 = text8 != null ? OfflineManagerKt.toTextModel(text8, false) : textModel8;
                        Text text9 = rowItem.detail;
                        arrayList5.add(Boolean.valueOf(arrayList4.add(new StackableRow.RowItem(textModel10, text9 != null ? OfflineManagerKt.toTextModel(text9, false) : textModel8))));
                        it3 = it4;
                        textModel3 = textModel9;
                    }
                    arrayList3.add(new TimelineWidgetModel.Item(state, str, format4, inlineText, new AfterPayOrderDetailsViewEvent.ScheduledPaymentClicked(new InfoSheetViewModel(CollectionsKt.toList(arrayList4)), scheduledPaymentStatus), false));
                    textModel2 = textModel8;
                    it = it2;
                    avatar2 = avatar3;
                }
                TextModel textModel11 = textModel2;
                com.squareup.cash.buynowpaylater.viewmodels.Avatar avatar4 = avatar2;
                TextModel textModel12 = textModel3;
                TimelineWidgetModel timelineWidgetModel = new TimelineWidgetModel(1, arrayList3);
                Text text10 = getApOrderDetailsResponse.info_text;
                TextModel textModel13 = text10 != null ? OfflineManagerKt.toTextModel(text10, true) : textModel11;
                Text text11 = getApOrderDetailsResponse.order_details_title;
                TextModel textModel14 = text11 != null ? OfflineManagerKt.toTextModel(text11, true) : textModel11;
                List list4 = getApOrderDetailsResponse.order_details_rows;
                list4.getClass();
                List list5 = list4;
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    LocalMoneyKt localMoneyKt = ((OrderDetailRow) it5.next()).row;
                    if (localMoneyKt instanceof OrderDetailRow$Row$Divider) {
                        orderDetailRowHeader = OrderDetailRowModel.Divider.INSTANCE;
                    } else if (localMoneyKt instanceof OrderDetailRow$Row$Spacer) {
                        orderDetailRowHeader = OrderDetailRowModel.Spacer.INSTANCE;
                    } else {
                        if (!(localMoneyKt instanceof OrderDetailRow$Row$OrderDetailRow)) {
                            if (localMoneyKt == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Unsupported orderDetailRow type. missing elements");
                                return textModel11;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return textModel11;
                        }
                        RowItem rowItem2 = ((OrderDetailRow$Row$OrderDetailRow) localMoneyKt).value;
                        Text text12 = rowItem2.title;
                        TextModel textModel15 = text12 != null ? OfflineManagerKt.toTextModel(text12, true) : textModel11;
                        Text text13 = rowItem2.detail;
                        orderDetailRowHeader = new OrderDetailRowModel.OrderDetailRowHeader(textModel15, text13 != null ? OfflineManagerKt.toTextModel(text13, true) : textModel11);
                    }
                    arrayList6.add(orderDetailRowHeader);
                }
                List list6 = getApOrderDetailsResponse.overflow_actions;
                list6.getClass();
                List<OverflowAction> list7 = list6;
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                for (OverflowAction overflowAction : list7) {
                    Text text14 = overflowAction.title;
                    arrayList7.add(new OverflowActionsModel(text14 != null ? OfflineManagerKt.toTextModel(text14, false) : textModel11, overflowAction.client_route_url));
                }
                Button button = getApOrderDetailsResponse.primary_action_button;
                if (button != null) {
                    Text text15 = button.title;
                    text15.getClass();
                    TextModel textModel16 = OfflineManagerKt.toTextModel(text15, true);
                    String str3 = button.action_url;
                    str3.getClass();
                    actionButton = new ActionButton(textModel16, str3);
                } else {
                    actionButton = textModel11;
                }
                SingleUsePaymentSummary singleUsePaymentSummary = getApOrderDetailsResponse.sup_card;
                SupTransactions supTransactions = getApOrderDetailsResponse.sup_transactions;
                Text text16 = getApOrderDetailsResponse.sup_message;
                if (singleUsePaymentSummary == null && text16 == null && supTransactions == null) {
                    sUPOrderDetailsViewModel = textModel11;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    textModel = textModel4;
                } else {
                    if (singleUsePaymentSummary != null) {
                        Text text17 = singleUsePaymentSummary.title;
                        text17.getClass();
                        String str4 = text17.text;
                        str4.getClass();
                        Text text18 = singleUsePaymentSummary.subtitle;
                        text18.getClass();
                        String str5 = text18.text;
                        str5.getClass();
                        Money money2 = singleUsePaymentSummary.usage;
                        String str6 = (money2 == null || (format3 = moneyFormatter.format(money2)) == null) ? "" : format3;
                        Money money3 = singleUsePaymentSummary.limit;
                        String str7 = (money3 == null || (format2 = moneyFormatter.format(money3)) == null) ? "" : format2;
                        Text text19 = singleUsePaymentSummary.footer_text;
                        text19.getClass();
                        String str8 = text19.text;
                        str8.getClass();
                        Image image = singleUsePaymentSummary.image;
                        image.getClass();
                        sUPCardInfo = new SUPCardInfo(image, str4, str5, str6, str7, str8);
                    } else {
                        sUPCardInfo = textModel11;
                    }
                    String str9 = text16 != null ? text16.text : textModel11;
                    if (supTransactions != null) {
                        Text text20 = supTransactions.title;
                        String str10 = text20 != null ? text20.text : textModel11;
                        List list8 = supTransactions.rows;
                        list8.getClass();
                        List list9 = list8;
                        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                        Iterator it6 = list9.iterator();
                        while (it6.hasNext()) {
                            SupTransactionSummary supTransactionSummary = (SupTransactionSummary) it6.next();
                            List list10 = supTransactionSummary.details;
                            ArrayList arrayList9 = arrayList6;
                            ArrayList arrayList10 = arrayList7;
                            Iterator it7 = it6;
                            ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                            Iterator it8 = list10.iterator();
                            while (it8.hasNext()) {
                                RowItem rowItem3 = (RowItem) it8.next();
                                Iterator it9 = it8;
                                Text text21 = rowItem3.title;
                                text21.getClass();
                                TextModel textModel17 = OfflineManagerKt.toTextModel(text21, true);
                                Text text22 = rowItem3.detail;
                                text22.getClass();
                                arrayList11.add(new StackableRow.RowItem(textModel17, OfflineManagerKt.toTextModel(text22, true)));
                                it8 = it9;
                                textModel4 = textModel4;
                            }
                            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
                            Instant instant = supTransactionSummary.created_time;
                            instant.getClass();
                            String format5 = dateTimeFormatter.format(instant);
                            format5.getClass();
                            arrayList8.add(new SUPOrderTransaction(format5, arrayList11));
                            it6 = it7;
                            arrayList6 = arrayList9;
                            arrayList7 = arrayList10;
                            textModel4 = textModel4;
                        }
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        textModel = textModel4;
                        sUPOrderTransactions = new SUPOrderTransactions(str10, arrayList8);
                    } else {
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        textModel = textModel4;
                        sUPOrderTransactions = textModel11;
                    }
                    sUPOrderDetailsViewModel = new SUPOrderDetailsViewModel(sUPCardInfo, str9, sUPOrderTransactions);
                }
                return new AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel(avatar4, textModel12, textModel, parseInfoCard, afterPayOrderDetailsPaymentMethodModel, textModel7, timelineWidgetModel, textModel13, textModel14, arrayList, arrayList2, actionButton, sUPOrderDetailsViewModel);
            }
        }
        afterPayOrderDetailsPresenter$loadOrderDetails$1 = new AfterPayOrderDetailsPresenter$loadOrderDetails$1(cardStudioPresenter, continuationImpl);
        Object obj2 = afterPayOrderDetailsPresenter$loadOrderDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterPayOrderDetailsPresenter$loadOrderDetails$1.label;
        TextModel textModel22 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r14 == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
    
        if (r10.interact(r11, r7) == r8) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$switchAccount(CardStudioPresenter cardStudioPresenter, ContinuationImpl continuationImpl) {
        SwitchFullAccountLoadingPresenter$switchAccount$1 switchFullAccountLoadingPresenter$switchAccount$1;
        int i;
        ManagedAccountAnimationInfo managedAccountAnimationInfo;
        String str;
        RealAccountSwitcher realAccountSwitcher = (RealAccountSwitcher) cardStudioPresenter.args;
        FlowStarter flowStarter = (FlowStarter) cardStudioPresenter.ioContext;
        SwitchFullAccountLoadingScreen switchFullAccountLoadingScreen = (SwitchFullAccountLoadingScreen) cardStudioPresenter.cardStudioQueries;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        if (continuationImpl instanceof SwitchFullAccountLoadingPresenter$switchAccount$1) {
            switchFullAccountLoadingPresenter$switchAccount$1 = (SwitchFullAccountLoadingPresenter$switchAccount$1) continuationImpl;
            int i2 = switchFullAccountLoadingPresenter$switchAccount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                switchFullAccountLoadingPresenter$switchAccount$1.label = i2 - PKIFailureInfo.systemUnavail;
                SwitchFullAccountLoadingPresenter$switchAccount$1 switchFullAccountLoadingPresenter$switchAccount$12 = switchFullAccountLoadingPresenter$switchAccount$1;
                Object obj = switchFullAccountLoadingPresenter$switchAccount$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = switchFullAccountLoadingPresenter$switchAccount$12.label;
                Continuation continuation = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            switchFullAccountLoadingPresenter$switchAccount$12.L$0 = null;
                            switchFullAccountLoadingPresenter$switchAccount$12.label = 3;
                            obj = realAccountSwitcher.finish((AccountSwitcher$AccountSwitchContinuation) obj, screenNavigator, switchFullAccountLoadingPresenter$switchAccount$12);
                        } else {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        if (Intrinsics.areEqual((AccountSwitcher$Result) obj, AccountSwitcher$Result.Failure.INSTANCE)) {
                            screenNavigator.goTo(((RealFlowStarter) flowStarter).signOut());
                        }
                        return Unit.INSTANCE;
                    }
                    managedAccountAnimationInfo = switchFullAccountLoadingPresenter$switchAccount$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ((AccountSwitchScreenStateRelay) cardStudioPresenter.appConfig).managedAccountWelcomeMessage = managedAccountAnimationInfo != null ? managedAccountAnimationInfo.welcomeMessage : null;
                    String str2 = switchFullAccountLoadingScreen.flowToken;
                    if (str2 == null) {
                        BlockersData.Flow.INSTANCE.getClass();
                        str2 = BlockersData.Flow.Companion.generateToken();
                    }
                    FullAccount fullAccount = switchFullAccountLoadingScreen.account;
                    if (fullAccount == null || (str = fullAccount.account_id) == null) {
                        str = switchFullAccountLoadingScreen.customerToken;
                    }
                    if (str == null) {
                        screenNavigator.goTo(((RealFlowStarter) flowStarter).signOut());
                        return Unit.INSTANCE;
                    }
                    String str3 = fullAccount != null ? fullAccount.cash_tag : null;
                    AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource = switchFullAccountLoadingScreen.initiationSource;
                    TargetDestination targetDestination = switchFullAccountLoadingScreen.destination;
                    switchFullAccountLoadingPresenter$switchAccount$12.L$0 = null;
                    switchFullAccountLoadingPresenter$switchAccount$12.label = 2;
                    realAccountSwitcher.initiate(str2, str, str3, accountSwitcher$AccountSwitchInitiationSource, targetDestination, switchFullAccountLoadingPresenter$switchAccount$12);
                    return coroutineSingletons;
                }
                SafeTrace.throwOnFailure(obj);
                managedAccountAnimationInfo = switchFullAccountLoadingScreen.managedAccountAnimationInfo;
                Object managedAccountSwitchScrimScreen = managedAccountAnimationInfo != null ? new ScrimScreen.ManagedAccountSwitchScrimScreen(managedAccountAnimationInfo) : new ScrimScreen.SwitchFullAccountLoadingScrimScreen(switchFullAccountLoadingScreen.account);
                AcceptableScrim acceptableScrim = (AcceptableScrim) cardStudioPresenter.analytics;
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(managedAccountSwitchScrimScreen, continuation, 14);
                switchFullAccountLoadingPresenter$switchAccount$12.L$0 = managedAccountAnimationInfo;
                switchFullAccountLoadingPresenter$switchAccount$12.label = 1;
            }
        }
        switchFullAccountLoadingPresenter$switchAccount$1 = new SwitchFullAccountLoadingPresenter$switchAccount$1(cardStudioPresenter, continuationImpl);
        SwitchFullAccountLoadingPresenter$switchAccount$1 switchFullAccountLoadingPresenter$switchAccount$122 = switchFullAccountLoadingPresenter$switchAccount$1;
        Object obj2 = switchFullAccountLoadingPresenter$switchAccount$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = switchFullAccountLoadingPresenter$switchAccount$122.label;
        Continuation continuation2 = null;
        if (i == 0) {
        }
    }

    public static final LoadedData access$toLoadedData(CardStudioPresenter cardStudioPresenter, PayerCustomersResult payerCustomersResult) {
        ArrayList<CustomerInfo> arrayList = payerCustomersResult.taggedPayers;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (CustomerInfo customerInfo : arrayList) {
            String str = customerInfo.customerToken;
            String str2 = customerInfo.displayName;
            arrayList2.add(new PayerCustomerRowModel(str, str2, customerInfo.cashtag, StringsKt___StringsKt.firstOrNull(str2), null, customerInfo.profilePhotoUrl, true));
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((PayerCustomerRowModel) next).customerToken, next);
        }
        ArrayList arrayList3 = payerCustomersResult.recentSenders;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!linkedHashMap.containsKey(((CustomerInfo) obj).customerToken)) {
                arrayList4.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (hashSet.add(((CustomerInfo) next2).customerToken)) {
                arrayList5.add(next2);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            CustomerInfo customerInfo2 = (CustomerInfo) it3.next();
            String str3 = customerInfo2.customerToken;
            String str4 = customerInfo2.displayName;
            arrayList6.add(new PayerCustomerRowModel(str3, str4, customerInfo2.cashtag, StringsKt___StringsKt.firstOrNull(str4), null, customerInfo2.profilePhotoUrl, false));
        }
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            linkedHashMap2.put(((PayerCustomerRowModel) next3).customerToken, next3);
        }
        return new LoadedData(linkedHashMap, linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Integer, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$verifyQrCode(CardStudioPresenter cardStudioPresenter, ContinuationImpl continuationImpl) {
        CardActivationPresenter$verifyQrCode$1 cardActivationPresenter$verifyQrCode$1;
        int i;
        Object obj;
        String str;
        VerifyQrCodeRequest copy$default;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
        BlockersScreens.CardActivationScreen cardActivationScreen = (BlockersScreens.CardActivationScreen) cardStudioPresenter.cardStudioQueries;
        BlockersData blockersData = cardActivationScreen.blockersData;
        if (continuationImpl instanceof CardActivationPresenter$verifyQrCode$1) {
            cardActivationPresenter$verifyQrCode$1 = (CardActivationPresenter$verifyQrCode$1) continuationImpl;
            int i2 = cardActivationPresenter$verifyQrCode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardActivationPresenter$verifyQrCode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = cardActivationPresenter$verifyQrCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardActivationPresenter$verifyQrCode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    VerifyQrCodeRequest verifyQrCodeRequest = new VerifyQrCodeRequest(blockersData.requestContext, null, null, null, ByteString.EMPTY);
                    AppService appService = (AppService) cardStudioPresenter.args;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    String str2 = blockersData.flowToken;
                    BlockersScreens.CardActivationScreen.CardActivationData cardActivationData = cardActivationScreen.activationData;
                    if (cardActivationData instanceof BlockersScreens.CardActivationScreen.CardActivationData.WithCode) {
                        obj = null;
                        str = str2;
                        copy$default = VerifyQrCodeRequest.copy$default(verifyQrCodeRequest, null, ((BlockersScreens.CardActivationScreen.CardActivationData.WithCode) cardActivationData).code, Boolean.FALSE, null, 25);
                    } else {
                        obj = null;
                        str = str2;
                        if (!(cardActivationData instanceof BlockersScreens.CardActivationScreen.CardActivationData.SkipToCvv)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        copy$default = VerifyQrCodeRequest.copy$default(verifyQrCodeRequest, null, null, Boolean.TRUE, null, 27);
                    }
                    cardActivationPresenter$verifyQrCode$1.label = 1;
                    obj2 = appService.verifyQrCode(clientScenario, str, copy$default, cardActivationPresenter$verifyQrCode$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = null;
                }
                apiResult = (ApiResult) obj2;
                if (!(apiResult instanceof ApiResult.Success)) {
                    VerifyQrCodeResponse verifyQrCodeResponse = (VerifyQrCodeResponse) ((ApiResult.Success) apiResult).response;
                    VerifyQrCodeResponse.Status status = verifyQrCodeResponse.status;
                    ResponseContext responseContext = verifyQrCodeResponse.response_context;
                    if (status == null) {
                        status = ProtoDefaults.VERIFY_QR_CODE_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal != 1 && ordinal != 2) {
                        a$$ExternalSyntheticBUOutline0.m$2(verifyQrCodeResponse.status, "Unknown status ");
                        return obj;
                    }
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) cardStudioPresenter.ioContext;
                    responseContext.getClass();
                    String str3 = responseContext.dialog_message;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    if (str3 == null || StringsKt.isBlank(str3)) {
                        screenNavigator.goTo(blockersDataNavigator.getNext(cardActivationScreen, updateFromResponseContext));
                    } else {
                        screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, blockersDataNavigator.getNext(cardActivationScreen, updateFromResponseContext), str3, null, 8));
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Object obj3 = obj;
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return obj3;
                    }
                    ?? r3 = obj;
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging((AndroidStringManager) cardStudioPresenter.analytics, (ApiResult.Failure) apiResult, r3).message, r3, 4));
                }
                return Unit.INSTANCE;
            }
        }
        cardActivationPresenter$verifyQrCode$1 = new CardActivationPresenter$verifyQrCode$1(cardStudioPresenter, continuationImpl);
        Object obj22 = cardActivationPresenter$verifyQrCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardActivationPresenter$verifyQrCode$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static boolean isTaggableAsPayer(Recipient recipient) {
        return (recipient.customerId == null || recipient.isBusiness || !recipient.isCashCustomer) ? false : true;
    }

    private final Object models$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormDetailsPresenter(Flow flow, Composer composer, int i) {
        String format2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1532451907);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealProfileManager) this.analytics).publicProfile(), 25);
            gapComposer.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
            rememberedValue = cardModelView$cardHeat$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, "", null, gapComposer, 48, 2);
        int i2 = 0;
        Object[] objArr = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new Recipient$$ExternalSyntheticLambda2(8);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 48);
        if (((String) mutableState.getValue()).length() == 0 && ((String) collectAsState.getValue()).length() > 0) {
            mutableState.setValue((String) collectAsState.getValue());
        }
        Object[] objArr2 = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new DirectDepositManualFormDetailsPresenter$$ExternalSyntheticLambda1(this, i2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue3, gapComposer, 0);
        Object[] objArr3 = new Object[0];
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new Recipient$$ExternalSyntheticLambda2(9);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue4, gapComposer, 48);
        Object[] objArr4 = new Object[0];
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new Recipient$$ExternalSyntheticLambda2(10);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState4 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue5, gapComposer, 48);
        boolean changed = gapComposer.changed(mutableState);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new HeroTagViewKt$$ExternalSyntheticLambda12(11, mutableState);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Function2 function2 = (Function2) rememberedValue6;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(staticProvidableCompositionLocal);
        boolean changed2 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 22);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue7, gapComposer);
        boolean changed3 = gapComposer.changed(mutableState2);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new HeroTagViewKt$$ExternalSyntheticLambda12(12, mutableState2);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Function2 function22 = (Function2) rememberedValue8;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer.consume(staticProvidableCompositionLocal);
        boolean changed4 = gapComposer.changed(function22) | gapComposer.changedInstance(answerDispatcher2);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 23);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue9, gapComposer);
        boolean changed5 = gapComposer.changed(mutableState3);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = new HeroTagViewKt$$ExternalSyntheticLambda12(13, mutableState3);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        Function2 function23 = (Function2) rememberedValue10;
        AnswerDispatcher answerDispatcher3 = (AnswerDispatcher) gapComposer.consume(staticProvidableCompositionLocal);
        boolean changed6 = gapComposer.changed(function23) | gapComposer.changedInstance(answerDispatcher3);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function23, answerDispatcher3, 24);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Updater.DisposableEffect(answerDispatcher3, (Function1) rememberedValue11, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new EngineInterceptor$intercept$2(27, mutableState3, flow, this, mutableState4, mutableState, mutableState2, (Continuation) null));
        String str = (String) mutableState.getValue();
        String str2 = (String) mutableState2.getValue();
        PaycheckDepositAllocation paycheckDepositAllocation = (PaycheckDepositAllocation) mutableState3.getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.args;
        Resources resources = androidStringManager.resources;
        paycheckDepositAllocation.getClass();
        if (paycheckDepositAllocation.equals(PaycheckDepositAllocation.All.INSTANCE)) {
            format2 = androidStringManager.get(R.string.direct_deposit_manual_paycheck_all);
        } else if (paycheckDepositAllocation instanceof PaycheckDepositAllocation.Percentage) {
            Object[] objArr5 = {Integer.valueOf(((PaycheckDepositAllocation.Percentage) paycheckDepositAllocation).percentage)};
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.direct_deposit_manual_paycheck_percent)).format(objArr5);
            format2.getClass();
        } else {
            if (!(paycheckDepositAllocation instanceof PaycheckDepositAllocation.CurrencyAmount)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String format3 = ((MoneyFormatter) ((Lazy) this.cardStudioQueries).getValue()).format(((PaycheckDepositAllocation.CurrencyAmount) paycheckDepositAllocation).amount);
            format3.getClass();
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.direct_deposit_manual_paycheck_amount)).format(new Object[]{format3});
            format2.getClass();
        }
        DirectDepositManualFormDetailsViewModel directDepositManualFormDetailsViewModel = new DirectDepositManualFormDetailsViewModel(str, str2, format2, ((Boolean) mutableState4.getValue()).booleanValue());
        gapComposer.end(false);
        return directDepositManualFormDetailsViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$earnings$applets$presenters$EarnerAppletTilePresenter(Flow flow, Composer composer, int i) {
        Object obj;
        Object obj2;
        boolean changedInstance;
        Object rememberedValue;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1852967223);
        Object rememberedValue2 = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealEarningsSyncStateRepository) this.analytics).appletUiState;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Continuation continuation = null;
        EarningsAppletUIState earningsAppletUIState = (EarningsAppletUIState) Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1).getValue();
        if (earningsAppletUIState != null) {
            String str = earningsAppletUIState.client_route;
            LocalizedString localizedString = earningsAppletUIState.subtitle_text;
            LocalizedString localizedString2 = earningsAppletUIState.title_text;
            EarningsAppletState earningsAppletState = earningsAppletUIState.applet_state;
            int i2 = earningsAppletState == null ? -1 : EarnerAppletTilePresenterKt$WhenMappings.$EnumSwitchMapping$0[earningsAppletState.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    String translatedValue = zzer.translatedValue(localizedString2);
                    String translatedValue2 = zzer.translatedValue(localizedString);
                    if (str == null || StringsKt.isBlank(str)) {
                        str = null;
                    }
                    List list = earningsAppletUIState.stream_avatars;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StackedAvatarViewModelKt.toStackedAvatarViewModel((UiAvatar) it.next()).avatar);
                    }
                    int size = arrayList.size();
                    obj2 = new EarnerAppletTileModel.Installed(translatedValue, translatedValue2, str, size != 0 ? size != 1 ? size != 2 ? new StackedAvatarViewModel.Trio((StackedAvatarViewModel.Avatar) arrayList.get(0), (StackedAvatarViewModel.Avatar) arrayList.get(1), (StackedAvatarViewModel.Avatar) arrayList.get(2), true, arrayList.size() - 1) : new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) arrayList.get(0), (StackedAvatarViewModel.Avatar) arrayList.get(1)) : new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) arrayList.get(0)) : null);
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(obj2, gapComposer);
                    Unit unit = Unit.INSTANCE;
                    changedInstance = gapComposer.changedInstance(this);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new GooglePayPresenter$models$1$1(this, continuation, 13);
                    gapComposer.updateRememberedValue(rememberedValue);
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                    Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, rememberUpdatedState, 1));
                    gapComposer.end(false);
                    return obj2;
                }
                if (i2 == 2) {
                    String translatedValue3 = zzer.translatedValue(localizedString2);
                    String translatedValue4 = zzer.translatedValue(localizedString);
                    if (str == null || StringsKt.isBlank(str)) {
                        str = null;
                    }
                    obj = new EarnerAppletTileModel.Uninstalled(translatedValue3, translatedValue4, str);
                } else if (i2 == 3) {
                    obj = EarnerAppletTileModel.Hidden.INSTANCE;
                } else if (i2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                obj2 = obj;
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(obj2, gapComposer);
                Unit unit2 = Unit.INSTANCE;
                changedInstance = gapComposer.changedInstance(this);
                rememberedValue = gapComposer.rememberedValue();
                if (!changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new GooglePayPresenter$models$1$1(this, continuation, 13);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue);
                Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, rememberUpdatedState2, 1));
                gapComposer.end(false);
                return obj2;
            }
        }
        obj = EarnerAppletTileModel.Loading.INSTANCE;
        obj2 = obj;
        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(obj2, gapComposer);
        Unit unit22 = Unit.INSTANCE;
        changedInstance = gapComposer.changedInstance(this);
        rememberedValue = gapComposer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new GooglePayPresenter$models$1$1(this, continuation, 13);
        gapComposer.updateRememberedValue(rememberedValue);
        Updater.LaunchedEffect(gapComposer, unit22, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, rememberUpdatedState22, 1));
        gapComposer.end(false);
        return obj2;
    }

    private final Object models$com$squareup$cash$earnings$presenters$payers$AddPayerCustomersPresenter(Flow flow, Composer composer, int i) {
        Object addPayerCustomersPresenter$models$1$1;
        MutableState mutableState;
        MutableState mutableState2;
        Integer num;
        Map map;
        GapComposer gapComposer;
        SnapshotStateSet snapshotStateSet;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        boolean z;
        MutableState mutableState7;
        MutableState mutableState8;
        SnapshotStateSet snapshotStateSet2;
        Map map2;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(731867309);
        boolean z2 = ((AddPayerCustomersScreen) this.cardStudioQueries).entrypoint != AddPayerCustomersScreen.Entrypoint.POST_KYB;
        Object rememberedValue = gapComposer2.rememberedValue();
        Object obj = Composer.Companion.Empty;
        Object obj2 = rememberedValue;
        if (rememberedValue == obj) {
            Object mutableStateOf$default = Updater.mutableStateOf$default(new AddPayerCustomersViewModel.Loading(z2));
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj2 = mutableStateOf$default;
        }
        MutableState mutableState9 = (MutableState) obj2;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        Object obj3 = rememberedValue2;
        if (rememberedValue2 == obj) {
            Object mutableStateOf$default2 = Updater.mutableStateOf$default("");
            gapComposer2.updateRememberedValue(mutableStateOf$default2);
            obj3 = mutableStateOf$default2;
        }
        MutableState mutableState10 = (MutableState) obj3;
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj4 = rememberedValue3;
        if (rememberedValue3 == obj) {
            Object mutableStateOf$default3 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer2.updateRememberedValue(mutableStateOf$default3);
            obj4 = mutableStateOf$default3;
        }
        MutableState mutableState11 = (MutableState) obj4;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        Object obj5 = rememberedValue4;
        if (rememberedValue4 == obj) {
            Object mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default4);
            obj5 = mutableStateOf$default4;
        }
        MutableState mutableState12 = (MutableState) obj5;
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj6 = rememberedValue5;
        if (rememberedValue5 == obj) {
            Object mutableStateOf$default5 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default5);
            obj6 = mutableStateOf$default5;
        }
        MutableState mutableState13 = (MutableState) obj6;
        Object rememberedValue6 = gapComposer2.rememberedValue();
        Object obj7 = rememberedValue6;
        if (rememberedValue6 == obj) {
            Object snapshotStateSet3 = new SnapshotStateSet();
            gapComposer2.updateRememberedValue(snapshotStateSet3);
            obj7 = snapshotStateSet3;
        }
        SnapshotStateSet snapshotStateSet4 = (SnapshotStateSet) obj7;
        Object rememberedValue7 = gapComposer2.rememberedValue();
        Object obj8 = rememberedValue7;
        if (rememberedValue7 == obj) {
            Object linkedHashMap = new LinkedHashMap();
            gapComposer2.updateRememberedValue(linkedHashMap);
            obj8 = linkedHashMap;
        }
        Map map3 = (Map) obj8;
        Object rememberedValue8 = gapComposer2.rememberedValue();
        Object obj9 = rememberedValue8;
        if (rememberedValue8 == obj) {
            obj9 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj9;
        Object rememberedValue9 = gapComposer2.rememberedValue();
        Object obj10 = rememberedValue9;
        if (rememberedValue9 == obj) {
            Object recipients = ((RealContactRepository) this.ioContext).recipients();
            gapComposer2.updateRememberedValue(recipients);
            obj10 = recipients;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) obj10, EmptyList.INSTANCE, null, gapComposer2, 48, 2);
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changed = gapComposer2.changed(z2) | gapComposer2.changedInstance(this) | gapComposer2.changedInstance(map3) | gapComposer2.changed(collectAsState);
        Object rememberedValue10 = gapComposer2.rememberedValue();
        if (changed || rememberedValue10 == obj) {
            mutableState = mutableState10;
            mutableState2 = mutableState12;
            num = valueOf;
            map = map3;
            gapComposer = gapComposer2;
            addPayerCustomersPresenter$models$1$1 = new AddPayerCustomersPresenter$models$1$1(z2, this, snapshotStateSet4, map, mutableState9, mutableState, collectAsState, mutableState11, mutableState2, mutableState13, (Continuation) null);
            snapshotStateSet = snapshotStateSet4;
            mutableState3 = mutableState11;
            mutableState4 = mutableState9;
            mutableState5 = collectAsState;
            mutableState6 = mutableState13;
            z = z2;
            gapComposer.updateRememberedValue(addPayerCustomersPresenter$models$1$1);
        } else {
            mutableState4 = mutableState9;
            addPayerCustomersPresenter$models$1$1 = rememberedValue10;
            mutableState = mutableState10;
            mutableState2 = mutableState12;
            mutableState6 = mutableState13;
            snapshotStateSet = snapshotStateSet4;
            num = valueOf;
            mutableState5 = collectAsState;
            map = map3;
            gapComposer = gapComposer2;
            mutableState3 = mutableState11;
            z = z2;
        }
        Updater.LaunchedEffect(gapComposer, num, (Function2) addPayerCustomersPresenter$models$1$1);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(map);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue11 == obj) {
            MutableState mutableState14 = mutableState;
            Map map4 = map;
            MutableState mutableState15 = mutableState2;
            Object realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1(mutableState14, this, mutableState3, mutableState15, snapshotStateSet, map4, (Continuation) null);
            mutableState7 = mutableState3;
            mutableState8 = mutableState15;
            snapshotStateSet2 = snapshotStateSet;
            map2 = map4;
            mutableState = mutableState14;
            gapComposer.updateRememberedValue(realIdvPresenter$models$1$1);
            rememberedValue11 = realIdvPresenter$models$1$1;
        } else {
            mutableState7 = mutableState3;
            map2 = map;
            snapshotStateSet2 = snapshotStateSet;
            mutableState8 = mutableState2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue11);
        MutableState mutableState16 = mutableState;
        MutableState mutableState17 = mutableState4;
        MutableState mutableState18 = mutableState6;
        ZiplineLoader$load$2 ziplineLoader$load$2 = new ZiplineLoader$load$2(flow, (Continuation) (false ? 1 : 0), (Object) snapshotStateSet2, (Object) this, (Object) mutableState16, (State) mutableState18, (State) mutableState17, (State) parcelableSnapshotMutableIntState, 16);
        SnapshotStateSet snapshotStateSet5 = snapshotStateSet2;
        Updater.LaunchedEffect(gapComposer, flow, ziplineLoader$load$2);
        AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) mutableState17.getValue();
        AddPayerCustomersViewModel.Loaded loaded = addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Loaded ? (AddPayerCustomersViewModel.Loaded) addPayerCustomersViewModel : null;
        LoadedData loadedData = loaded != null ? loaded.loadedData : null;
        if (loadedData != null) {
            mutableState17.setValue(buildLoadedViewModel(loadedData, snapshotStateSet5, (String) mutableState16.getValue(), (List) mutableState5.getValue(), z, (List) mutableState7.getValue(), ((Boolean) mutableState8.getValue()).booleanValue(), map2, ((Boolean) mutableState18.getValue()).booleanValue()));
        }
        AddPayerCustomersViewModel addPayerCustomersViewModel2 = (AddPayerCustomersViewModel) mutableState17.getValue();
        gapComposer.end(false);
        return addPayerCustomersViewModel2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$earnings$presenters$payers$PayerTaggingPromptPresenter(Flow flow, Composer composer, int i) {
        PayerTaggingPromptSheet payerTaggingPromptSheet = (PayerTaggingPromptSheet) this.appConfig;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.args;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(141014878);
        Updater.LaunchedEffect(gapComposer, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) (0 == true ? 1 : 0), (MoleculePresenter) this, 5));
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            Character ch = payerTaggingPromptSheet.monogram;
            String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
            Color color = payerTaggingPromptSheet.accentColor;
            String str = payerTaggingPromptSheet.imageUrl;
            String str2 = payerTaggingPromptSheet.displayName;
            String format2 = ((MoneyFormatter) this.cardStudioQueries).format(payerTaggingPromptSheet.amount);
            str2.getClass();
            format2.getClass();
            ArrayMap arrayMap = new ArrayMap(2);
            arrayMap.put("amount", format2);
            arrayMap.put("name", str2);
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.payer_tagging_prompt_title)).format(arrayMap);
            format3.getClass();
            PayerTaggingPromptViewModel payerTaggingPromptViewModel = new PayerTaggingPromptViewModel(valueOf, color, str, format3, androidStringManager.get(R.string.payer_tagging_prompt_message), androidStringManager.get(R.string.payer_tagging_prompt_not_now), androidStringManager.get(R.string.payer_tagging_prompt_yes));
            gapComposer.updateRememberedValue(payerTaggingPromptViewModel);
            rememberedValue = payerTaggingPromptViewModel;
        }
        PayerTaggingPromptViewModel payerTaggingPromptViewModel2 = (PayerTaggingPromptViewModel) rememberedValue;
        gapComposer.end(false);
        return payerTaggingPromptViewModel2;
    }

    private final Object models$com$squareup$cash$family$familyhub$presenters$DependentTeenQrCodeShareSheetPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1856789576);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(new ShareSheetViewModel("", null, null, EmptyList.INSTANCE, false));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = FlowKt.MutableStateFlow(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i2 = 1;
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new CheckStatusPresenter.AnonymousClass1.C00611(this, mutableState, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        ShareSheetViewModel shareSheetViewModel = (ShareSheetViewModel) mutableState.getValue();
        Object value = Updater.collectAsState(mutableStateFlow, null, gapComposer, 1).getValue();
        if (shareSheetViewModel == null || value == null) {
            gapComposer.startReplaceGroup(-1383879796);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1383927846);
            Updater.LaunchedEffect(shareSheetViewModel, value, new DotGridKt$DotGrid$3$1(shareSheetViewModel, value, null, mutableState), gapComposer);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, mutableStateFlow, 13));
        ShareSheetViewModel shareSheetViewModel2 = (ShareSheetViewModel) mutableState.getValue();
        gapComposer.end(false);
        return shareSheetViewModel2;
    }

    private final Object models$com$squareup$cash$history$presenters$RefundPaymentPresenter(Flow flow, Composer composer, int i) {
        String str;
        String format2;
        HistoryScreens.RefundPayment refundPayment = (HistoryScreens.RefundPayment) this.appConfig;
        RealLegacyActivityEntityManager realLegacyActivityEntityManager = (RealLegacyActivityEntityManager) this.args;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-667686479);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = realLegacyActivityEntityManager.renderedPayment(refundPayment.paymentToken);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            String str2 = refundPayment.paymentToken;
            str2.getClass();
            RewardSlotQueries rewardSlotQueries = realLegacyActivityEntityManager.customerQueries;
            rewardSlotQueries.getClass();
            CustomerQueries$customerForPaymentToken$2 customerQueries$customerForPaymentToken$2 = CustomerQueries$customerForPaymentToken$2.INSTANCE;
            RealAppConfigManager$cashLiteConfig$$inlined$map$1 realAppConfigManager$cashLiteConfig$$inlined$map$1 = new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new CustomerQueries$ForIdQuery(rewardSlotQueries, str2, new CustomerQueries$$ExternalSyntheticLambda7(rewardSlotQueries, 1))), realLegacyActivityEntityManager.ioDispatcher), 8);
            gapComposer.updateRememberedValue(realAppConfigManager$cashLiteConfig$$inlined$map$1);
            rememberedValue2 = realAppConfigManager$cashLiteConfig$$inlined$map$1;
        }
        Continuation continuation = null;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        boolean changed = gapComposer.changed((RenderedPayment) collectAsState.getValue()) | gapComposer.changed((Recipient) collectAsState2.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            if (((RenderedPayment) collectAsState.getValue()) == null || ((Recipient) collectAsState2.getValue()) == null) {
                rememberedValue3 = null;
            } else {
                MoneyFormatter moneyFormatter = (MoneyFormatter) this.cardStudioQueries;
                RenderedPayment renderedPayment = (RenderedPayment) collectAsState.getValue();
                renderedPayment.getClass();
                String format3 = moneyFormatter.format(renderedPayment.amount);
                RenderedPayment renderedPayment2 = (RenderedPayment) collectAsState.getValue();
                renderedPayment2.getClass();
                String str3 = renderedPayment2.historyData.notes;
                Resources resources = ((AndroidStringManager) this.analytics).resources;
                if (str3 == null) {
                    Recipient recipient = (Recipient) collectAsState2.getValue();
                    recipient.getClass();
                    String str4 = recipient.displayName;
                    str = str4 != null ? str4 : "null";
                    format3.getClass();
                    resources.getClass();
                    format2 = new MessageFormat(resources.getString(R.string.history_refund_message)).format(new Object[]{format3, str});
                    format2.getClass();
                } else {
                    Recipient recipient2 = (Recipient) collectAsState2.getValue();
                    recipient2.getClass();
                    String str5 = recipient2.displayName;
                    str = str5 != null ? str5 : "null";
                    format3.getClass();
                    resources.getClass();
                    format2 = new MessageFormat(resources.getString(R.string.history_refund_message_with_note)).format(new Object[]{format3, str, str3});
                    format2.getClass();
                }
                rememberedValue3 = format2;
            }
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        String str6 = (String) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, 13));
        if (str6 == null) {
            str6 = "";
        }
        RefundPaymentViewModel refundPaymentViewModel = new RefundPaymentViewModel(str6);
        gapComposer.end(false);
        return refundPaymentViewModel;
    }

    private final Object models$com$squareup$cash$investing$presenters$custom$order$InvestingPeriodSelectionPresenter(Flow flow, Composer composer, int i) {
        InvestingScreens.InvestingPeriodSelectionScreen investingPeriodSelectionScreen = (InvestingScreens.InvestingPeriodSelectionScreen) this.appConfig;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2134289078);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = FlowKt.take(new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(((GpsConfigQueries) this.cardStudioQueries).select$2()), (CoroutineContext) this.ioContext), 14), 1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) collectAsState.getValue();
        Object obj = PeriodSelectionViewModel.InFlight.INSTANCE;
        if (customOrderConfiguration == null) {
            gapComposer.end(false);
            return obj;
        }
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            String str = investingPeriodSelectionScreen.investmentEntityToken.value;
            ColorModel colorModel = investingPeriodSelectionScreen.accentColor;
            str.getClass();
            colorModel.getClass();
            InviteErrorPresenter inviteErrorPresenter = new InviteErrorPresenter(colorModel, str, (String) null);
            gapComposer.updateRememberedValue(inviteErrorPresenter);
            rememberedValue2 = inviteErrorPresenter;
        }
        MoleculePresenter moleculePresenter = (MoleculePresenter) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            CustomOrderConfiguration customOrderConfiguration2 = (CustomOrderConfiguration) collectAsState.getValue();
            customOrderConfiguration2.getClass();
            AndroidStringManager androidStringManager = (AndroidStringManager) this.args;
            rememberedValue3 = Updater.mutableStateOf$default(new PeriodSelectionViewModel.ContentModel(androidStringManager.get(R.string.period_selection_title), androidStringManager.get(InvestingPeriodSelectionPresenter$WhenMappings.$EnumSwitchMapping$0[investingPeriodSelectionScreen.orderSide.ordinal()] == 1 ? R.string.period_selection_description_buy : R.string.period_selection_description_sell), androidStringManager.get(R.string.next), null, customOrderConfiguration2.periods, false));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue5;
        Screen screen = (Screen) moleculePresenter.models(mutableSharedFlow, gapComposer, 0);
        if (screen instanceof InvestmentOrderPresenter$Empty) {
            gapComposer.startReplaceGroup(90943096);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(90880631);
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(screen);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new GenieViewKt$GenieView$1$1(this, screen, continuation, 2);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue6);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, mutableState, collectAsState, mutableSharedFlow, mutableState2, 10));
        if (!((Boolean) mutableState2.getValue()).booleanValue()) {
            obj = (PeriodSelectionViewModel.ContentModel) mutableState.getValue();
        }
        gapComposer.end(false);
        return obj;
    }

    public static Orientation toCardStudioOrientation(DeviceOrientation deviceOrientation) {
        int ordinal = deviceOrientation.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return Orientation.LANDSCAPE_RIGHT;
            }
            if (ordinal == 3) {
                return Orientation.LANDSCAPE_LEFT;
            }
            if (ordinal == 4) {
                return Orientation.PORTRAIT;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return Orientation.PORTRAIT;
    }

    public static PayerCustomerRowModel toRowModel(Recipient recipient, boolean z) {
        String str = recipient.customerId;
        String str2 = recipient.displayName;
        String str3 = str == null ? "" : str;
        String str4 = str2 == null ? "" : str2;
        String str5 = recipient.cashtag;
        String concat = str5 != null ? "$".concat(str5) : null;
        String str6 = concat == null ? "" : concat;
        Character firstOrNull = str2 != null ? StringsKt___StringsKt.firstOrNull(str2) : null;
        Color color = recipient.themedAccentColor;
        Image image = recipient.photo;
        return new PayerCustomerRowModel(str3, str4, str6, firstOrNull, color, image != null ? image.light_url : null, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v21, types: [kotlin.collections.EmptyList] */
    public AddPayerCustomersViewModel.Loaded buildLoadedViewModel(LoadedData loadedData, Set set, String str, List list, boolean z, List list2, boolean z2, Map map, boolean z3) {
        LinkedHashMap linkedHashMap = loadedData.taggedPayers;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.appConfig;
        boolean z4 = str.length() > 0;
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (isTaggableAsPayer((Recipient) obj)) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((Recipient) next).customerId)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Recipient recipient = (Recipient) it2.next();
                arrayList3.add(toRowModel(recipient, CollectionsKt.contains(set, recipient.customerId)));
            }
            List<PayerCustomerRowModel> list3 = list2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (PayerCustomerRowModel payerCustomerRowModel : list3) {
                arrayList4.add(PayerCustomerRowModel.copy$default(payerCustomerRowModel, set.contains(payerCustomerRowModel.customerToken)));
            }
            String title = title();
            String str2 = androidStringManager.get(R.string.add_payer_customers_subtitle);
            List list4 = arrayList3;
            if (z4) {
                list4 = EmptyList.INSTANCE;
            }
            String str3 = androidStringManager.get(R.string.add_payer_customers_post_kyb_section_all_contacts);
            List list5 = arrayList4;
            if (!z4) {
                list5 = EmptyList.INSTANCE;
            }
            List list6 = list5;
            List list7 = list4;
            EmptyList emptyList = EmptyList.INSTANCE;
            return new AddPayerCustomersViewModel.Loaded(title, str2, str, emptyList, emptyList, list7, str3, list6, z2, z3, z, loadedData);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = loadedData.recentSenders;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put((String) entry.getKey(), (PayerCustomerRowModel) entry.getValue());
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            linkedHashMap2.put((String) entry2.getKey(), (PayerCustomerRowModel) entry2.getValue());
        }
        List list8 = list;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list8) {
            if (isTaggableAsPayer((Recipient) obj2)) {
                arrayList5.add(obj2);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (hashSet2.add(((Recipient) next2).customerId)) {
                arrayList6.add(next2);
            }
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Recipient recipient2 = (Recipient) it4.next();
            String str4 = recipient2.customerId;
            str4.getClass();
            linkedHashMap2.put(str4, toRowModel(recipient2, false));
        }
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashMap2.putIfAbsent((String) entry3.getKey(), (PayerCustomerRowModel) entry3.getValue());
        }
        Set keySet = linkedHashMap3.keySet();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : list8) {
            if (isTaggableAsPayer((Recipient) obj3)) {
                arrayList7.add(obj3);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            String str5 = ((Recipient) it5.next()).customerId;
            if (str5 != null) {
                arrayList8.add(str5);
            }
        }
        LinkedHashSet plus = SetsKt___SetsKt.plus(keySet, (Iterable) CollectionsKt.toSet(arrayList8));
        ArrayList arrayList9 = new ArrayList();
        Iterator it6 = set.iterator();
        while (it6.hasNext()) {
            PayerCustomerRowModel payerCustomerRowModel2 = (PayerCustomerRowModel) linkedHashMap2.get((String) it6.next());
            if (payerCustomerRowModel2 != null) {
                arrayList9.add(payerCustomerRowModel2);
            }
        }
        ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
        Iterator it7 = arrayList9.iterator();
        while (it7.hasNext()) {
            arrayList10.add(PayerCustomerRowModel.copy$default((PayerCustomerRowModel) it7.next(), true));
        }
        Collection values = linkedHashMap.values();
        ArrayList arrayList11 = new ArrayList();
        for (Object obj4 : values) {
            PayerCustomerRowModel payerCustomerRowModel3 = (PayerCustomerRowModel) obj4;
            if (!set.contains(payerCustomerRowModel3.customerToken) && !plus.contains(payerCustomerRowModel3.customerToken)) {
                arrayList11.add(obj4);
            }
        }
        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
        Iterator it8 = arrayList11.iterator();
        while (it8.hasNext()) {
            arrayList12.add(PayerCustomerRowModel.copy$default((PayerCustomerRowModel) it8.next(), false));
        }
        ArrayList plus2 = CollectionsKt.plus((Iterable) arrayList12, (Collection) arrayList10);
        Collection values2 = linkedHashMap3.values();
        ArrayList arrayList13 = new ArrayList();
        for (Object obj5 : values2) {
            if (!set.contains(((PayerCustomerRowModel) obj5).customerToken)) {
                arrayList13.add(obj5);
            }
        }
        ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
        Iterator it9 = arrayList13.iterator();
        while (it9.hasNext()) {
            arrayList14.add(PayerCustomerRowModel.copy$default((PayerCustomerRowModel) it9.next(), false));
        }
        LinkedHashSet plus3 = SetsKt___SetsKt.plus(set, (Iterable) linkedHashMap3.keySet());
        ArrayList arrayList15 = new ArrayList();
        for (Object obj6 : list8) {
            Recipient recipient3 = (Recipient) obj6;
            if (isTaggableAsPayer(recipient3) && !CollectionsKt.contains(plus3, recipient3.customerId)) {
                arrayList15.add(obj6);
            }
        }
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList16 = new ArrayList();
        Iterator it10 = arrayList15.iterator();
        while (it10.hasNext()) {
            Object next3 = it10.next();
            if (hashSet3.add(((Recipient) next3).customerId)) {
                arrayList16.add(next3);
            }
        }
        ?? arrayList17 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList16, 10));
        Iterator it11 = arrayList16.iterator();
        while (it11.hasNext()) {
            arrayList17.add(toRowModel((Recipient) it11.next(), false));
        }
        List<PayerCustomerRowModel> list9 = list2;
        ArrayList arrayList18 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
        for (PayerCustomerRowModel payerCustomerRowModel4 : list9) {
            arrayList18.add(PayerCustomerRowModel.copy$default(payerCustomerRowModel4, set.contains(payerCustomerRowModel4.customerToken)));
        }
        String title2 = title();
        String str6 = androidStringManager.get(R.string.add_payer_customers_subtitle);
        List list10 = arrayList14;
        if (z4) {
            list10 = EmptyList.INSTANCE;
        }
        if (z4) {
            arrayList17 = EmptyList.INSTANCE;
        }
        List list11 = arrayList17;
        String str7 = androidStringManager.get(R.string.add_payer_customers_section_all_contacts);
        List list12 = arrayList18;
        if (!z4) {
            list12 = EmptyList.INSTANCE;
        }
        return new AddPayerCustomersViewModel.Loaded(title2, str6, str, list10, plus2, list11, str7, list12, z2, z3, z, loadedData);
    }

    public ReadonlySharedFlow createPagerFlow(CoroutineScope coroutineScope) {
        n nVar = (n) this.args;
        return FlowExtKt.cachedIn(new PageFetcher(new Pager$pageFetcher$2(new SsnViewKt$$ExternalSyntheticLambda4(nVar, 9), null, 0), new PagingConfig(30, 62)).flow, coroutineScope);
    }

    public String getButtonText(BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption bitcoinInstrumentRecommendationOption) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.ioContext;
        if (bitcoinInstrumentRecommendationOption instanceof BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.ContinueBitcoinTransfer) {
            return androidStringManager.get(R.string.bitcoin_instrument_recommendation_continue);
        }
        if (bitcoinInstrumentRecommendationOption instanceof BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.LinkBankAccount) {
            return androidStringManager.get(R.string.bitcoin_instrument_recommendation_link_bank);
        }
        if (bitcoinInstrumentRecommendationOption instanceof BitcoinInstrumentRecommendationScreen.BitcoinInstrumentRecommendationOption.SwitchToBankAccount) {
            return androidStringManager.get(R.string.bitcoin_instrument_recommendation_use_existing_bank);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0bbb  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0bc4  */
    /* JADX WARN: Type inference failed for: r21v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MarketingMessageViewModel.OfferPreview offerPreview;
        MarketingMessageOfferDetails marketingMessageOfferDetails;
        MarketingMessageData marketingMessageData;
        Object obj;
        ItemOffer itemOffer;
        String str;
        MarketingMessageViewModel.OfferPreview.DiscountOffer discountOffer;
        MarketingMessageViewModel.OfferPreview.DiscountOffer discountOffer2;
        Line line;
        boolean z;
        Object obj2;
        Money money;
        BitcoinAppletTileModel bitcoinAppletTileModel;
        BitcoinAppletTileModel bitcoinAppletTileModel2;
        boolean z2;
        Money money2;
        Object amountBlockerPresenter$models$1$2;
        Continuation continuation;
        MutableState mutableState;
        CurrencyCode currencyCode;
        boolean z3;
        Money money3;
        boolean z4;
        CardStudioPresenter cardStudioPresenter = this;
        int i2 = cardStudioPresenter.$r8$classId;
        int i3 = 8;
        int i4 = 7;
        int i5 = 24;
        int i6 = 22;
        int i7 = 17;
        Object obj3 = cardStudioPresenter.analytics;
        int i8 = 4;
        Object obj4 = cardStudioPresenter.appConfig;
        Object obj5 = cardStudioPresenter.args;
        Object obj6 = cardStudioPresenter.ioContext;
        BitcoinAppletTileModel bitcoinAppletTileModel3 = null;
        r7 = null;
        ConfirmCashOutDialogViewModel confirmCashOutDialogViewModel = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i9 = 0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-121480513);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(CardStudioViewModel.Loading.INSTANCE);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(cardStudioPresenter);
                Object rememberedValue2 = gapComposer.rememberedValue();
                Continuation continuation2 = null;
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CardStudioPresenter$models$1$1(cardStudioPresenter, mutableState2, continuation2, i9);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation2, cardStudioPresenter, mutableState2, 21));
                CardStudioViewModel cardStudioViewModel = (CardStudioViewModel) mutableState2.getValue();
                gapComposer.end(false);
                return cardStudioViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1199701943);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = ((RealLocalBrandRepository) obj5).brand((BrandSpot) cardStudioPresenter.cardStudioQueries);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer2, 48, 2);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Updater.mutableStateOf$default(SchedulingDayTimePickerViewModel.ModelState.LoadingDays.INSTANCE);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState3 = (MutableState) rememberedValue4;
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer2.changedInstance(cardStudioPresenter);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new DiskLruCache$launchCleanup$1((Object) cardStudioPresenter, (Continuation) (false ? 1 : 0), i7);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue5);
                Updater.LaunchedEffect(gapComposer2, flow, new zzmo(flow, (Continuation) (false ? 1 : 0), (Object) cardStudioPresenter, (Object) mutableState3, 4));
                if (((SchedulingDayTimePickerViewModel.ModelState) mutableState3.getValue()) instanceof SchedulingDayTimePickerViewModel.ModelState.LoadingDays) {
                    gapComposer2.startReplaceGroup(1900104557);
                    SchedulingDayTimePickerViewModel.ModelState modelState = (SchedulingDayTimePickerViewModel.ModelState) mutableState3.getValue();
                    boolean changedInstance3 = gapComposer2.changedInstance(cardStudioPresenter);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new RealImageLoader$execute$2((Object) cardStudioPresenter, (Object) mutableState3, (Continuation) (false ? 1 : 0), 5);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Updater.LaunchedEffect(gapComposer2, modelState, (Function2) rememberedValue6);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(1901424971);
                    gapComposer2.end(false);
                }
                if ((((SchedulingDayTimePickerViewModel.ModelState) mutableState3.getValue()) instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays) && (((SchedulingDayTimePickerViewModel.ModelState) mutableState3.getValue()).getTimesState() instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.LoadingTimes)) {
                    gapComposer2.startReplaceGroup(1901570082);
                    SchedulingDayTimePickerViewModel.ModelState modelState2 = (SchedulingDayTimePickerViewModel.ModelState) mutableState3.getValue();
                    boolean changedInstance4 = gapComposer2.changedInstance(cardStudioPresenter);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changedInstance4 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new RealImageLoader$execute$result$1((Object) cardStudioPresenter, (Object) mutableState3, (Continuation) (false ? 1 : 0), 14);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    Updater.LaunchedEffect(gapComposer2, modelState2, (Function2) rememberedValue7);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(1903362347);
                    gapComposer2.end(false);
                }
                LocalBrand localBrand = (LocalBrand) collectAsState.getValue();
                String str2 = localBrand != null ? localBrand.name : null;
                SchedulingDayTimePickerViewModel schedulingDayTimePickerViewModel = new SchedulingDayTimePickerViewModel(str2 != null ? str2 : "", (SchedulingDayTimePickerViewModel.ModelState) mutableState3.getValue());
                gapComposer2.end(false);
                return schedulingDayTimePickerViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(857985021);
                LocalMarketingMessageScreen localMarketingMessageScreen = (LocalMarketingMessageScreen) cardStudioPresenter.cardStudioQueries;
                MarketingMessageData marketingMessageData2 = localMarketingMessageScreen.marketingMessage;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj6;
                MarketingMessageOfferDetails marketingMessageOfferDetails2 = marketingMessageData2.offerDetails;
                if (marketingMessageOfferDetails2 != null) {
                    Iterator it = marketingMessageOfferDetails2.offerLines.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            LocalCart.Line line2 = (LocalCart.Line) obj;
                            if (line2.menu_item_name == null || line2.total_price_before_discounts == null) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    LocalCart.Line line3 = (LocalCart.Line) obj;
                    if (line3 != null) {
                        Line line4 = LineKt.toLine(line3);
                        itemOffer = line4.totalPrice.amount == 0 ? new ItemOffer.FreeItem(line4) : new ItemOffer.Reward(line4);
                    } else {
                        itemOffer = null;
                    }
                    if (itemOffer == null || (line = itemOffer.getLine()) == null || (str = line.menuItemName) == null) {
                        str = marketingMessageOfferDetails2.label;
                    }
                    String str3 = str;
                    if (itemOffer instanceof ItemOffer.FreeItem) {
                        LocalMoney localMoney = ((ItemOffer.FreeItem) itemOffer).line.totalPriceBeforeDiscounts;
                        r7 = localMoney != null ? LocalsKt.prettyPrint$default(localMoney, false, null, 7) : 0;
                        discountOffer2 = new MarketingMessageViewModel.OfferPreview.DiscountOffer(r7 != 0 ? r7 : "", androidStringManager.get(R.string.local_presenters_free));
                    } else if (itemOffer instanceof ItemOffer.Reward) {
                        Line line5 = ((ItemOffer.Reward) itemOffer).line;
                        LocalMoney localMoney2 = line5.totalPriceBeforeDiscounts;
                        String prettyPrint$default = localMoney2 != null ? LocalsKt.prettyPrint$default(localMoney2, false, null, 7) : null;
                        discountOffer2 = new MarketingMessageViewModel.OfferPreview.DiscountOffer(prettyPrint$default != null ? prettyPrint$default : "", LocalsKt.prettyPrint$default(line5.totalPrice, false, null, 7));
                    } else {
                        if (itemOffer != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        discountOffer = null;
                        String str4 = marketingMessageOfferDetails2.label;
                        String str5 = marketingMessageOfferDetails2.offerCode;
                        str5.getClass();
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.local_presenters_coupon_format)).format(new Object[]{str5});
                        format2.getClass();
                        offerPreview = new MarketingMessageViewModel.OfferPreview(marketingMessageOfferDetails2.image, str3, discountOffer, marketingMessageOfferDetails2.validityText, new MarketingMessageViewModel.OfferPreview.SheetDetails(str4, format2, marketingMessageOfferDetails2.eligibleItems, marketingMessageOfferDetails2.validityText, marketingMessageOfferDetails2.redemptionInstructions, marketingMessageOfferDetails2.termsAndConditions, marketingMessageOfferDetails2.discountDescription), marketingMessageOfferDetails2.status != Offer.OfferStatus.OFFER_STATUS_REDEEMED);
                    }
                    discountOffer = discountOffer2;
                    String str42 = marketingMessageOfferDetails2.label;
                    String str52 = marketingMessageOfferDetails2.offerCode;
                    str52.getClass();
                    Resources resources2 = androidStringManager.resources;
                    resources2.getClass();
                    String format22 = new MessageFormat(resources2.getString(R.string.local_presenters_coupon_format)).format(new Object[]{str52});
                    format22.getClass();
                    offerPreview = new MarketingMessageViewModel.OfferPreview(marketingMessageOfferDetails2.image, str3, discountOffer, marketingMessageOfferDetails2.validityText, new MarketingMessageViewModel.OfferPreview.SheetDetails(str42, format22, marketingMessageOfferDetails2.eligibleItems, marketingMessageOfferDetails2.validityText, marketingMessageOfferDetails2.redemptionInstructions, marketingMessageOfferDetails2.termsAndConditions, marketingMessageOfferDetails2.discountDescription), marketingMessageOfferDetails2.status != Offer.OfferStatus.OFFER_STATUS_REDEEMED);
                } else {
                    offerPreview = null;
                }
                MarketingMessageOfferDetails marketingMessageOfferDetails3 = marketingMessageData2.offerDetails;
                EventLocation eventLocation = localMarketingMessageScreen.eventLocation;
                MessageToken messageToken = new MessageToken(marketingMessageData2.messageToken);
                boolean changedInstance5 = gapComposer3.changedInstance(cardStudioPresenter) | gapComposer3.changedInstance(marketingMessageData2) | gapComposer3.changedInstance(marketingMessageOfferDetails3) | gapComposer3.changed(eventLocation.ordinal());
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (changedInstance5 || rememberedValue8 == neverEqualPolicy) {
                    marketingMessageOfferDetails = marketingMessageOfferDetails3;
                    zzmo zzmoVar = new zzmo(cardStudioPresenter, marketingMessageData2, marketingMessageOfferDetails, eventLocation, null, 7);
                    marketingMessageData = marketingMessageData2;
                    gapComposer3.updateRememberedValue(zzmoVar);
                    rememberedValue8 = zzmoVar;
                } else {
                    marketingMessageOfferDetails = marketingMessageOfferDetails3;
                    marketingMessageData = marketingMessageData2;
                }
                Updater.LaunchedEffect(gapComposer3, messageToken, (Function2) rememberedValue8);
                Updater.LaunchedEffect(gapComposer3, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, marketingMessageOfferDetails, this, offerPreview, 15));
                MarketingMessageViewModel marketingMessageViewModel = new MarketingMessageViewModel(marketingMessageData.image, marketingMessageData.cashtag, marketingMessageData.message, marketingMessageData.backgroundColor, marketingMessageData.foregroundColor, marketingMessageData.logo, offerPreview);
                gapComposer3.end(false);
                return marketingMessageViewModel;
            case 3:
                m3429models(flow, composer, i);
                return Unit.INSTANCE;
            case 4:
                BalanceFeedScreen balanceFeedScreen = (BalanceFeedScreen) obj5;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-1111415358);
                Object rememberedValue9 = gapComposer4.rememberedValue();
                Continuation continuation3 = null;
                if (rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = Updater.mutableStateOf$default(null);
                    gapComposer4.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState4 = (MutableState) rememberedValue9;
                Updater.LaunchedEffect(gapComposer4, flow, new zzmo(flow, continuation3, cardStudioPresenter, mutableState4, 24));
                boolean changed = gapComposer4.changed(balanceFeedScreen);
                Object rememberedValue10 = gapComposer4.rememberedValue();
                if (changed || rememberedValue10 == neverEqualPolicy) {
                    z = true;
                    if (BalanceFeedPresenter$WhenMappings.$EnumSwitchMapping$0[balanceFeedScreen.balanceType.ordinal()] != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    obj2 = ((AndroidStringManager) obj6).get(R.string.balance_feed_title_cash);
                    gapComposer4.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue10;
                    z = true;
                }
                String str6 = (String) obj2;
                boolean z5 = ((((i & 112) ^ 48) <= 32 || !gapComposer4.changed(cardStudioPresenter)) && (i & 48) != 32) ? false : z;
                Object rememberedValue11 = gapComposer4.rememberedValue();
                if (z5 || rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = new NetworkFetcher$doFetch$2(cardStudioPresenter, continuation3, i6);
                    gapComposer4.updateRememberedValue(rememberedValue11);
                }
                BalanceFeedViewModel balanceFeedViewModel = new BalanceFeedViewModel(((RealActivityEmbeddedPresenter) cardStudioPresenter.cardStudioQueries).models(gapComposer4, 0), str6, (String) Updater.produceState(gapComposer4, null, (Function2) rememberedValue11).getValue(), (BalanceFeedViewModel.InfoSheet) mutableState4.getValue());
                gapComposer4.end(false);
                return balanceFeedViewModel;
            case 5:
                return models(flow, composer);
            case 6:
                return models(flow, composer, i);
            case 7:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-244858846);
                boolean changedInstance6 = gapComposer5.changedInstance(cardStudioPresenter);
                Object rememberedValue12 = gapComposer5.rememberedValue();
                if (changedInstance6 || rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = new MLKitTitleGenerator$1(cardStudioPresenter, r7, 15);
                    gapComposer5.updateRememberedValue(rememberedValue12);
                }
                Updater.LaunchedEffect(gapComposer5, "ConfirmCashOutPresenter", (Function2) rememberedValue12);
                Updater.LaunchedEffect(gapComposer5, flow, new ToastKt$Toast$9$1(flow, (Continuation) r7, cardStudioPresenter, 14));
                MoneyFormatter moneyFormatter = (MoneyFormatter) cardStudioPresenter.cardStudioQueries;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj4;
                TransferData transferData = ((ConfirmCashOutScreen) obj5).blockersData.transferData;
                transferData.getClass();
                Money money4 = transferData.amount;
                String format3 = money4 != null ? moneyFormatter.format(money4) : null;
                ConfirmationSheetData confirmationSheetData = transferData.confirmationSheetData;
                if (format3 != null) {
                    if (confirmationSheetData != null) {
                        TransferFee transferFee = transferData.acceptedFee;
                        String format4 = (transferFee == null || (money = transferFee.fee) == null) ? null : moneyFormatter.format(money);
                        if (format4 != null) {
                            String str7 = confirmationSheetData.main_text;
                            String str8 = confirmationSheetData.subtext;
                            str8.getClass();
                            String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str8, "{{amount}}", format3), "{{fee}}", format4);
                            String str9 = confirmationSheetData.confirm_button_text;
                            str9.getClass();
                            String str10 = confirmationSheetData.cancel_button_text;
                            str10.getClass();
                            confirmCashOutDialogViewModel = new ConfirmCashOutDialogViewModel(str7, replace$default, str9, str10);
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("fee should exist for c4b cash out exp");
                        }
                    } else {
                        Object[] objArr = {format3};
                        Resources resources3 = androidStringManager2.resources;
                        resources3.getClass();
                        String format5 = new MessageFormat(resources3.getString(R.string.balance_confirm_withdraw)).format(objArr);
                        format5.getClass();
                        confirmCashOutDialogViewModel = new ConfirmCashOutDialogViewModel(null, format5, androidStringManager2.get(R.string.balance_confirm_withdraw_positive), androidStringManager2.get(R.string.balance_confirm_negative));
                    }
                    gapComposer5.end(false);
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("[transferData.amount] should be defined in confirm cash out flow");
                }
                return confirmCashOutDialogViewModel;
            case 8:
                String str11 = (String) obj4;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) cardStudioPresenter.navigator;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-457836455);
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) cardStudioPresenter.cardStudioQueries;
                verifyCheckDialogPresenter.getClass();
                gapComposer6.startReplaceGroup(-1613152821);
                boolean changed2 = gapComposer6.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
                Object rememberedValue13 = gapComposer6.rememberedValue();
                if (changed2 || rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, i7);
                    gapComposer6.updateRememberedValue(rememberedValue13);
                }
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue13, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer6, 0, 2).getValue();
                gapComposer6.end(false);
                Object rememberedValue14 = gapComposer6.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = ((RealBitcoinAppletTileRepository) ((BitcoinAppletTileRepository) obj5)).bitcoinModel;
                    gapComposer6.updateRememberedValue(rememberedValue14);
                }
                MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue14, null, null, gapComposer6, 48, 2);
                Updater.LaunchedEffect(gapComposer6, flow, new ToastKt$Toast$9$1(flow, (Continuation) r7, cardStudioPresenter, i5));
                BitcoinRepositoryModel bitcoinRepositoryModel = (BitcoinRepositoryModel) collectAsState2.getValue();
                if (bitcoinRepositoryModel == null) {
                    bitcoinAppletTileModel2 = new BitcoinAppletTileModel.Loading(str11);
                } else {
                    if (!(bitcoinRepositoryModel instanceof BitcoinRepositoryModel.Uninstalled)) {
                        if (bitcoinRepositoryModel instanceof BitcoinRepositoryModel$Installed$ZeroBalance) {
                            String str12 = ((BitcoinRepositoryModel$Installed$ZeroBalance) bitcoinRepositoryModel).formattedBalance;
                            String str13 = androidStringManager3.get(R.string.applets_pres_bitcoin_zero_balance_movement);
                            String lowerCase = androidStringManager3.get(R.string.applets_pres_today).toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            bitcoinAppletTileModel3 = new BitcoinAppletTileModel.Installed.Loaded.ZeroBalance(str11, str12, str13, lowerCase);
                        } else {
                            if (bitcoinRepositoryModel instanceof BitcoinRepositoryModel$Installed$LoadedPriceMovement) {
                                BitcoinRepositoryModel$Installed$LoadedPriceMovement bitcoinRepositoryModel$Installed$LoadedPriceMovement = (BitcoinRepositoryModel$Installed$LoadedPriceMovement) bitcoinRepositoryModel;
                                String str14 = bitcoinRepositoryModel$Installed$LoadedPriceMovement.formattedBalance;
                                long j = bitcoinRepositoryModel$Installed$LoadedPriceMovement.balanceAmountCents;
                                String str15 = bitcoinRepositoryModel$Installed$LoadedPriceMovement.movement;
                                String lowerCase2 = androidStringManager3.get(R.string.applets_pres_today).toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                bitcoinAppletTileModel = new BitcoinAppletTileModel.Installed.Loaded.Chart((String) obj4, str14, j, str15, lowerCase2, bitcoinRepositoryModel$Installed$LoadedPriceMovement.changeDirection, bitcoinRepositoryModel$Installed$LoadedPriceMovement.graph);
                            } else if (bitcoinRepositoryModel instanceof BitcoinRepositoryModel$Installed$LoadingPriceMovement) {
                                bitcoinAppletTileModel2 = new BitcoinAppletTileModel.Installed.LoadingPriceMovement(str11);
                            } else {
                                if (!(bitcoinRepositoryModel instanceof BitcoinRepositoryModel$Installed$GraphError)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return bitcoinAppletTileModel3;
                                }
                                BitcoinRepositoryModel$Installed$GraphError bitcoinRepositoryModel$Installed$GraphError = (BitcoinRepositoryModel$Installed$GraphError) bitcoinRepositoryModel;
                                bitcoinAppletTileModel = new BitcoinAppletTileModel.Installed.GraphError((String) obj4, bitcoinRepositoryModel$Installed$GraphError.formattedBalance, bitcoinRepositoryModel$Installed$GraphError.balanceAmountCents, androidStringManager3.get(R.string.bitcoin_graph_load_failure_message));
                            }
                            bitcoinAppletTileModel3 = bitcoinAppletTileModel;
                        }
                        gapComposer6.end(false);
                        return bitcoinAppletTileModel3;
                    }
                    bitcoinAppletTileModel2 = new BitcoinAppletTileModel.Uninstalled(str11, androidStringManager3.get(R.string.applets_pres_bitcoin_null_state_footer_alternative), promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null);
                }
                bitcoinAppletTileModel3 = bitcoinAppletTileModel2;
                gapComposer6.end(false);
                return bitcoinAppletTileModel3;
            case 9:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj3;
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-655151833);
                Object rememberedValue15 = gapComposer7.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = ((RealBitcoinPayInUsdPreferenceManager) obj6).preference();
                    gapComposer7.updateRememberedValue(rememberedValue15);
                }
                BitcoinPayInUsdPreference.Disabled disabled = BitcoinPayInUsdPreference.Disabled.INSTANCE;
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue15, disabled, null, gapComposer7, 0, 2);
                Object rememberedValue16 = gapComposer7.rememberedValue();
                if (rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = ((RealBalanceSnapshotManager) obj5).select();
                    gapComposer7.updateRememberedValue(rememberedValue16);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue16, null, null, gapComposer7, 48, 2);
                Continuation continuation4 = null;
                continuation4 = null;
                Updater.LaunchedEffect(gapComposer7, flow, new BenefitsHubPresenter$models$1$1(flow, continuation4, cardStudioPresenter, collectAsState3, 19));
                String str16 = androidStringManager4.get(R.string.bitcoin_settings_pay_in_usd_title);
                String str17 = androidStringManager4.get(R.string.bitcoin_settings_pay_in_usd_description);
                String str18 = androidStringManager4.get(R.string.bitcoin_settings_pay_in_usd_toggle_title);
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState4.getValue();
                if (balanceSnapshot != null && (money2 = balanceSnapshot.balance) != null) {
                    String format6 = ((MoneyFormatter) cardStudioPresenter.cardStudioQueries).format(money2);
                    format6.getClass();
                    Resources resources4 = androidStringManager4.resources;
                    resources4.getClass();
                    ?? format7 = new MessageFormat(resources4.getString(R.string.bitcoin_settings_pay_in_usd_toggle_subtitle)).format(new Object[]{format6});
                    format7.getClass();
                    continuation4 = format7;
                }
                ?? r21 = continuation4;
                BitcoinPayInUsdPreference bitcoinPayInUsdPreference = (BitcoinPayInUsdPreference) collectAsState3.getValue();
                if (Intrinsics.areEqual(bitcoinPayInUsdPreference, disabled)) {
                    z2 = false;
                } else {
                    if (!Intrinsics.areEqual(bitcoinPayInUsdPreference, BitcoinPayInUsdPreference.Enabled.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z2 = true;
                }
                BitcoinPayInUsdSettingsViewModel bitcoinPayInUsdSettingsViewModel = new BitcoinPayInUsdSettingsViewModel(str16, str17, str18, r21, z2);
                gapComposer7.end(false);
                return bitcoinPayInUsdSettingsViewModel;
            case 10:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1770116310);
                Object rememberedValue17 = gapComposer8.rememberedValue();
                if (rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) cardStudioPresenter.cardStudioQueries;
                    gapComposer8.updateRememberedValue(rememberedValue17);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue17, BitcoinDisplayUnits.BITCOIN, null, gapComposer8, 48, 2);
                Updater.LaunchedEffect(gapComposer8, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) r7, cardStudioPresenter, i3));
                String format$default = RealBitcoinFormatter.format$default((RealBitcoinFormatter) obj4, (BitcoinDisplayUnits) collectAsState5.getValue(), new Money((Long) 100000L, CurrencyCode.BTC, i8), false, 28);
                format$default.getClass();
                Resources resources5 = ((AndroidStringManager) obj3).resources;
                resources5.getClass();
                String format8 = new MessageFormat(resources5.getString(R.string.bitcoin_auto_withdraw_upsell_target_description)).format(new Object[]{format$default});
                format8.getClass();
                BitcoinAutoWithdrawUpsellViewModel bitcoinAutoWithdrawUpsellViewModel = new BitcoinAutoWithdrawUpsellViewModel(format8);
                gapComposer8.end(false);
                return bitcoinAutoWithdrawUpsellViewModel;
            case 11:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-2030855118);
                Object rememberedValue18 = gapComposer9.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = ((RealBitcoinMapEligibilityManager) obj6).isLightningWithdrawEligible();
                    gapComposer9.updateRememberedValue(rememberedValue18);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue18, Boolean.FALSE, null, gapComposer9, 48, 2);
                boolean changed3 = gapComposer9.changed(((Boolean) collectAsState6.getValue()).booleanValue());
                Object rememberedValue19 = gapComposer9.rememberedValue();
                if (changed3 || rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = BitcoinMapViewModelKt.toViewModel((BitcoinSellerLocation) cardStudioPresenter.cardStudioQueries, ((Boolean) collectAsState6.getValue()).booleanValue());
                    gapComposer9.updateRememberedValue(rememberedValue19);
                }
                BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) rememberedValue19;
                Updater.LaunchedEffect(gapComposer9, flow, new SetNamePresenter$models$1$1$1(flow, (Continuation) null, cardStudioPresenter, bitcoinLocationViewModel, 2));
                gapComposer9.end(false);
                return bitcoinLocationViewModel;
            case 12:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1626559937);
                Object rememberedValue20 = gapComposer10.rememberedValue();
                if (rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = Updater.mutableStateOf$default(StablecoinDepositOptionsViewModel.Loading.INSTANCE);
                    gapComposer10.updateRememberedValue(rememberedValue20);
                }
                MutableState mutableState5 = (MutableState) rememberedValue20;
                Object rememberedValue21 = gapComposer10.rememberedValue();
                if (rememberedValue21 == neverEqualPolicy) {
                    rememberedValue21 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer10.updateRememberedValue(rememberedValue21);
                }
                MutableState mutableState6 = (MutableState) rememberedValue21;
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance7 = gapComposer10.changedInstance(cardStudioPresenter);
                Object rememberedValue22 = gapComposer10.rememberedValue();
                if (changedInstance7 || rememberedValue22 == neverEqualPolicy) {
                    continuation = null;
                    amountBlockerPresenter$models$1$2 = new AmountBlockerPresenter$models$1$2((MoleculePresenter) this, mutableState6, mutableState5, continuation, 18);
                    mutableState = mutableState5;
                    gapComposer10.updateRememberedValue(amountBlockerPresenter$models$1$2);
                } else {
                    mutableState = mutableState5;
                    amountBlockerPresenter$models$1$2 = rememberedValue22;
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer10, unit3, (Function2) amountBlockerPresenter$models$1$2);
                Updater.LaunchedEffect(gapComposer10, flow, new SetNamePresenter$models$1$1$1(8, mutableState6, this, flow, continuation));
                StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) mutableState.getValue();
                gapComposer10.end(false);
                return stablecoinDepositOptionsViewModel;
            case 13:
                BitcoinInstrumentRecommendationScreen bitcoinInstrumentRecommendationScreen = (BitcoinInstrumentRecommendationScreen) cardStudioPresenter.cardStudioQueries;
                AndroidStringManager androidStringManager5 = (AndroidStringManager) obj6;
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(1490418834);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance8 = gapComposer11.changedInstance(cardStudioPresenter);
                Object rememberedValue23 = gapComposer11.rememberedValue();
                if (changedInstance8 || rememberedValue23 == neverEqualPolicy) {
                    rememberedValue23 = new MLKitTitleGenerator$1(cardStudioPresenter, r7, i6);
                    gapComposer11.updateRememberedValue(rememberedValue23);
                }
                Updater.LaunchedEffect(gapComposer11, unit4, (Function2) rememberedValue23);
                Updater.LaunchedEffect(gapComposer11, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) r7, cardStudioPresenter, 20));
                BitcoinInstrumentRecommendationViewModel bitcoinInstrumentRecommendationViewModel = new BitcoinInstrumentRecommendationViewModel(androidStringManager5.get(R.string.bitcoin_instrument_recommendation_title), androidStringManager5.get(R.string.bitcoin_instrument_recommendation_body), cardStudioPresenter.getButtonText(bitcoinInstrumentRecommendationScreen.primaryOption), cardStudioPresenter.getButtonText(bitcoinInstrumentRecommendationScreen.secondaryOption));
                gapComposer11.end(false);
                return bitcoinInstrumentRecommendationViewModel;
            case 14:
                m3429models(flow, composer, i);
                return Unit.INSTANCE;
            case 15:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(1369642865);
                Object rememberedValue24 = gapComposer12.rememberedValue();
                if (rememberedValue24 == neverEqualPolicy) {
                    rememberedValue24 = Updater.mutableStateOf$default(new AfterPayOrderDetailsPresenter$State(AfterPayOrderDetailsViewModel.OrderDetailsLoading.INSTANCE));
                    gapComposer12.updateRememberedValue(rememberedValue24);
                }
                MutableState mutableState7 = (MutableState) rememberedValue24;
                Updater.LaunchedEffect(gapComposer12, flow, new RealBoostSelector$removeBoost$1(flow, (Continuation) null, this, mutableState7, 17));
                if (((AfterPayOrderDetailsPresenter$State) mutableState7.getValue()).viewModel instanceof AfterPayOrderDetailsViewModel.OrderDetailsLoading) {
                    gapComposer12.startReplaceGroup(842753608);
                    boolean changedInstance9 = gapComposer12.changedInstance(this);
                    Object rememberedValue25 = gapComposer12.rememberedValue();
                    if (changedInstance9 || rememberedValue25 == neverEqualPolicy) {
                        rememberedValue25 = new RealBoostSelector$removeBoost$1(this, mutableState7, null);
                        gapComposer12.updateRememberedValue(rememberedValue25);
                    }
                    Updater.LaunchedEffect(gapComposer12, "load-order-details", (Function2) rememberedValue25);
                    gapComposer12.end(false);
                } else {
                    gapComposer12.startReplaceGroup(842854513);
                    gapComposer12.end(false);
                }
                AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel = ((AfterPayOrderDetailsPresenter$State) mutableState7.getValue()).viewModel;
                gapComposer12.end(false);
                return afterPayOrderDetailsViewModel;
            case 16:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(1452729214);
                Object rememberedValue26 = gapComposer13.rememberedValue();
                if (rememberedValue26 == neverEqualPolicy) {
                    rememberedValue26 = Updater.createCompositionCoroutineScope(((CoroutineContext) obj6).plus(new CoroutineName("AfterPay-Paging-Cache")), gapComposer13);
                    gapComposer13.updateRememberedValue(rememberedValue26);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue26;
                Object rememberedValue27 = gapComposer13.rememberedValue();
                if (rememberedValue27 == neverEqualPolicy) {
                    rememberedValue27 = Updater.mutableStateOf$default(new AfterPayOrderHubViewModel.LoadingViewModel(AfterPayOrderHubLoadingStatus.InitialLoadStatus.Loading.INSTANCE, AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Idle.INSTANCE));
                    gapComposer13.updateRememberedValue(rememberedValue27);
                }
                MutableState mutableState8 = (MutableState) rememberedValue27;
                ChannelAsFlow channelAsFlow = (ChannelAsFlow) cardStudioPresenter.cardStudioQueries;
                Updater.LaunchedEffect(gapComposer13, channelAsFlow, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(i8, mutableState8, r7, channelAsFlow));
                Object rememberedValue28 = gapComposer13.rememberedValue();
                if (rememberedValue28 == neverEqualPolicy) {
                    rememberedValue28 = Updater.mutableStateOf$default(cardStudioPresenter.createPagerFlow(coroutineScope));
                    gapComposer13.updateRememberedValue(rememberedValue28);
                }
                MutableState mutableState9 = (MutableState) rememberedValue28;
                Object rememberedValue29 = gapComposer13.rememberedValue();
                if (rememberedValue29 == neverEqualPolicy) {
                    rememberedValue29 = Updater.mutableStateOf$default(new PagingData(new AppLockMonitor$special$$inlined$map$2(new PageEvent.StaticList(EmptyList.INSTANCE), 19), PagingData.NOOP_UI_RECEIVER, PagingData.NOOP_HINT_RECEIVER, new TextKt$$ExternalSyntheticLambda0(29)));
                    gapComposer13.updateRememberedValue(rememberedValue29);
                }
                MutableState mutableState10 = (MutableState) rememberedValue29;
                Flow flow2 = (Flow) mutableState9.getValue();
                Updater.LaunchedEffect(gapComposer13, flow2, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(5, mutableState10, r7, flow2));
                Updater.LaunchedEffect(gapComposer13, flow, new RealIdvPresenter$models$1$1(flow, (Continuation) null, (Object) cardStudioPresenter, (Object) coroutineScope, mutableState9, mutableState10, 11));
                AfterPayOrderHubViewModel afterPayOrderHubViewModel = new AfterPayOrderHubViewModel((AfterPayOrderHubViewModel.LoadingViewModel) mutableState8.getValue(), (PagingData) mutableState10.getValue());
                gapComposer13.end(false);
                return afterPayOrderHubViewModel;
            case 17:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(-20287781);
                Object rememberedValue30 = gapComposer14.rememberedValue();
                Object obj7 = rememberedValue30;
                if (rememberedValue30 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(CardStudioViewModelV2.Loading.INSTANCE);
                    gapComposer14.updateRememberedValue(mutableStateOf$default);
                    obj7 = mutableStateOf$default;
                }
                MutableState mutableState11 = (MutableState) obj7;
                Object rememberedValue31 = gapComposer14.rememberedValue();
                Object obj8 = rememberedValue31;
                if (rememberedValue31 == neverEqualPolicy) {
                    StateFlowImpl stateFlowImpl = ((RealDeviceOrientationProvider) obj3).orientation;
                    gapComposer14.updateRememberedValue(stateFlowImpl);
                    obj8 = stateFlowImpl;
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) obj8, DeviceOrientation.PORTRAIT, null, gapComposer14, 48, 2);
                Object rememberedValue32 = gapComposer14.rememberedValue();
                Object obj9 = rememberedValue32;
                if (rememberedValue32 == neverEqualPolicy) {
                    CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer14);
                    gapComposer14.updateRememberedValue(createCompositionCoroutineScope);
                    obj9 = createCompositionCoroutineScope;
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) obj9;
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance10 = gapComposer14.changedInstance(cardStudioPresenter) | gapComposer14.changed(collectAsState7);
                Object rememberedValue33 = gapComposer14.rememberedValue();
                Continuation continuation5 = null;
                if (changedInstance10 || rememberedValue33 == neverEqualPolicy) {
                    RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$1 = new RealBoostSelector$removeBoost$1(22, mutableState11, collectAsState7, cardStudioPresenter, continuation5);
                    collectAsState7 = collectAsState7;
                    cardStudioPresenter = cardStudioPresenter;
                    continuation5 = null;
                    gapComposer14.updateRememberedValue(realBoostSelector$removeBoost$1);
                    rememberedValue33 = realBoostSelector$removeBoost$1;
                }
                Updater.LaunchedEffect(gapComposer14, unit5, (Function2) rememberedValue33);
                DeviceOrientation deviceOrientation = (DeviceOrientation) collectAsState7.getValue();
                boolean changedInstance11 = gapComposer14.changedInstance(cardStudioPresenter) | gapComposer14.changed(collectAsState7);
                Object rememberedValue34 = gapComposer14.rememberedValue();
                if (changedInstance11 || rememberedValue34 == neverEqualPolicy) {
                    MutableState mutableState12 = collectAsState7;
                    SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1((MoleculePresenter) this, mutableState11, mutableState12, continuation5, 23);
                    collectAsState7 = mutableState12;
                    cardStudioPresenter = this;
                    gapComposer14.updateRememberedValue(setNameViewKt$SetName$2$1);
                    rememberedValue34 = setNameViewKt$SetName$2$1;
                }
                Updater.LaunchedEffect(gapComposer14, deviceOrientation, (Function2) rememberedValue34);
                Object rememberedValue35 = gapComposer14.rememberedValue();
                Object obj10 = rememberedValue35;
                if (rememberedValue35 == neverEqualPolicy) {
                    HeroTagViewKt$$ExternalSyntheticLambda12 heroTagViewKt$$ExternalSyntheticLambda12 = new HeroTagViewKt$$ExternalSyntheticLambda12(i4, mutableState11);
                    gapComposer14.updateRememberedValue(heroTagViewKt$$ExternalSyntheticLambda12);
                    obj10 = heroTagViewKt$$ExternalSyntheticLambda12;
                }
                Function2 function2 = (Function2) obj10;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer14.consume(staticProvidableCompositionLocal);
                boolean changedInstance12 = gapComposer14.changedInstance(answerDispatcher);
                Object rememberedValue36 = gapComposer14.rememberedValue();
                Object obj11 = rememberedValue36;
                if (changedInstance12 || rememberedValue36 == neverEqualPolicy) {
                    VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i7);
                    gapComposer14.updateRememberedValue(verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1);
                    obj11 = verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) obj11, gapComposer14);
                boolean changedInstance13 = gapComposer14.changedInstance(coroutineScope2) | gapComposer14.changedInstance(cardStudioPresenter);
                Object rememberedValue37 = gapComposer14.rememberedValue();
                Object obj12 = rememberedValue37;
                if (changedInstance13 || rememberedValue37 == neverEqualPolicy) {
                    BulletinTileKt$$ExternalSyntheticLambda2 bulletinTileKt$$ExternalSyntheticLambda2 = new BulletinTileKt$$ExternalSyntheticLambda2(i6, coroutineScope2, cardStudioPresenter);
                    gapComposer14.updateRememberedValue(bulletinTileKt$$ExternalSyntheticLambda2);
                    obj12 = bulletinTileKt$$ExternalSyntheticLambda2;
                }
                Function2 function22 = (Function2) obj12;
                AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer14.consume(staticProvidableCompositionLocal);
                boolean changed4 = gapComposer14.changed(function22) | gapComposer14.changedInstance(answerDispatcher2);
                Object rememberedValue38 = gapComposer14.rememberedValue();
                Object obj13 = rememberedValue38;
                if (changed4 || rememberedValue38 == neverEqualPolicy) {
                    VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 verifyCheckDepositPresenter$models$$inlined$AnswerHandler$12 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 18);
                    gapComposer14.updateRememberedValue(verifyCheckDepositPresenter$models$$inlined$AnswerHandler$12);
                    obj13 = verifyCheckDepositPresenter$models$$inlined$AnswerHandler$12;
                }
                Updater.DisposableEffect(answerDispatcher2, (Function1) obj13, gapComposer14);
                Object rememberedValue39 = gapComposer14.rememberedValue();
                Object obj14 = rememberedValue39;
                if (rememberedValue39 == neverEqualPolicy) {
                    HeroTagViewKt$$ExternalSyntheticLambda12 heroTagViewKt$$ExternalSyntheticLambda122 = new HeroTagViewKt$$ExternalSyntheticLambda12(i3, mutableState11);
                    gapComposer14.updateRememberedValue(heroTagViewKt$$ExternalSyntheticLambda122);
                    obj14 = heroTagViewKt$$ExternalSyntheticLambda122;
                }
                Function2 function23 = (Function2) obj14;
                AnswerDispatcher answerDispatcher3 = (AnswerDispatcher) gapComposer14.consume(staticProvidableCompositionLocal);
                boolean changedInstance14 = gapComposer14.changedInstance(answerDispatcher3);
                Object rememberedValue40 = gapComposer14.rememberedValue();
                Object obj15 = rememberedValue40;
                if (changedInstance14 || rememberedValue40 == neverEqualPolicy) {
                    VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 verifyCheckDepositPresenter$models$$inlined$AnswerHandler$13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function23, answerDispatcher3, 19);
                    gapComposer14.updateRememberedValue(verifyCheckDepositPresenter$models$$inlined$AnswerHandler$13);
                    obj15 = verifyCheckDepositPresenter$models$$inlined$AnswerHandler$13;
                }
                Updater.DisposableEffect(answerDispatcher3, (Function1) obj15, gapComposer14);
                Updater.LaunchedEffect(gapComposer14, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, cardStudioPresenter, mutableState11, collectAsState7, 6));
                CardStudioViewModelV2 cardStudioViewModelV2 = (CardStudioViewModelV2) mutableState11.getValue();
                gapComposer14.end(false);
                return cardStudioViewModelV2;
            case 18:
                AndroidStringManager androidStringManager6 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(-1383145671);
                Object[] objArr2 = new Object[0];
                RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) obj6;
                boolean changedInstance15 = gapComposer15.changedInstance(cardStudioPresenter);
                Object rememberedValue41 = gapComposer15.rememberedValue();
                if (changedInstance15 || rememberedValue41 == neverEqualPolicy) {
                    rememberedValue41 = new ArcadeModal$$ExternalSyntheticLambda2(cardStudioPresenter, i8);
                    gapComposer15.updateRememberedValue(rememberedValue41);
                }
                MutableState rememberSaveable = SaverKt.rememberSaveable(objArr2, (Saver) realInputFieldTextSaver, (Function0) rememberedValue41, (Composer) gapComposer15, 0);
                Updater.LaunchedEffect(gapComposer15, flow, new VerifyCheckDepositPresenter$models$3$1(flow, (Continuation) null, (MoleculePresenter) cardStudioPresenter, rememberSaveable, 23));
                DirectDepositSingleInputViewModel directDepositSingleInputViewModel = new DirectDepositSingleInputViewModel(DirectDepositSingleInputViewModel.Type.CompanyName.INSTANCE, androidStringManager6.get(R.string.direct_deposit_manual_company_name_title), androidStringManager6.get(R.string.direct_deposit_manual_company_name_input_hint), ((AskedQuestion) cardStudioPresenter.cardStudioQueries) != null ? androidStringManager6.get(R.string.direct_deposit_edit_paycheck_save_button) : androidStringManager6.get(R.string.direct_deposit_manual_company_name_button), null, (InputFieldText) rememberSaveable.getValue(), null, !StringsKt.isBlank(((InputFieldText) rememberSaveable.getValue()).getValue()), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                gapComposer15.end(false);
                return directDepositSingleInputViewModel;
            case 19:
                AndroidStringManager androidStringManager7 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(784135399);
                PaycheckDepositAllocation paycheckDepositAllocation = ((DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion) ((DirectDepositEditPaycheckCurrencyAllocationScreen) obj4).question.question).paycheckDepositAllocation;
                Object[] objArr3 = new Object[0];
                RealInputFieldTextSaver realInputFieldTextSaver2 = (RealInputFieldTextSaver) obj6;
                boolean changedInstance16 = gapComposer16.changedInstance(cardStudioPresenter);
                Object rememberedValue42 = gapComposer16.rememberedValue();
                if (changedInstance16 || rememberedValue42 == neverEqualPolicy) {
                    rememberedValue42 = new ArcadeModal$$ExternalSyntheticLambda2(cardStudioPresenter, 6);
                    gapComposer16.updateRememberedValue(rememberedValue42);
                }
                MutableState rememberSaveable2 = SaverKt.rememberSaveable(objArr3, (Saver) realInputFieldTextSaver2, (Function0) rememberedValue42, (Composer) gapComposer16, 0);
                Object rememberedValue43 = gapComposer16.rememberedValue();
                if (rememberedValue43 == neverEqualPolicy) {
                    CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealJurisdictionConfigManager) obj3).select(), i5);
                    gapComposer16.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                    rememberedValue43 = cardModelView$cardHeat$$inlined$map$1;
                }
                Flow flow3 = (Flow) rememberedValue43;
                PaycheckDepositAllocation.CurrencyAmount currencyAmount = paycheckDepositAllocation instanceof PaycheckDepositAllocation.CurrencyAmount ? (PaycheckDepositAllocation.CurrencyAmount) paycheckDepositAllocation : null;
                if (currencyAmount == null || (money3 = currencyAmount.amount) == null || (currencyCode = money3.currency_code) == null) {
                    currencyCode = CurrencyCode.USD;
                }
                MutableState collectAsState8 = Updater.collectAsState(flow3, currencyCode, null, gapComposer16, 0, 2);
                Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(((InputFieldText) rememberSaveable2.getValue()).getValue().toString(), (CurrencyCode) collectAsState8.getValue());
                Updater.LaunchedEffect(gapComposer16, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, cardStudioPresenter, rememberSaveable2, collectAsState8, 18));
                DirectDepositSingleInputViewModel.Type.PaycheckCurrencyAmount paycheckCurrencyAmount = new DirectDepositSingleInputViewModel.Type.PaycheckCurrencyAmount((CurrencyCode) collectAsState8.getValue());
                NavigationIconType.Companion companion = NavigationIconType.Companion;
                String str19 = androidStringManager7.get(R.string.direct_deposit_edit_paycheck_currency_title);
                String str20 = androidStringManager7.get(R.string.direct_deposit_edit_paycheck_desc);
                String str21 = androidStringManager7.get(R.string.direct_deposit_edit_paycheck_save_button);
                InputFieldText inputFieldText = (InputFieldText) rememberSaveable2.getValue();
                if (!StringsKt.isBlank(((InputFieldText) rememberSaveable2.getValue()).getValue()) && !Moneys.isZero(parseMoneyFromString$default)) {
                    Long l = parseMoneyFromString$default.amount;
                    l.getClass();
                    if (l.longValue() <= 2500000) {
                        z3 = true;
                        DirectDepositSingleInputViewModel directDepositSingleInputViewModel2 = new DirectDepositSingleInputViewModel(paycheckCurrencyAmount, str19, "", str21, str20, inputFieldText, null, z3, 128);
                        gapComposer16.end(false);
                        return directDepositSingleInputViewModel2;
                    }
                }
                z3 = false;
                DirectDepositSingleInputViewModel directDepositSingleInputViewModel22 = new DirectDepositSingleInputViewModel(paycheckCurrencyAmount, str19, "", str21, str20, inputFieldText, null, z3, 128);
                gapComposer16.end(false);
                return directDepositSingleInputViewModel22;
            case 20:
                return models$com$squareup$cash$directdeposit$presenters$DirectDepositManualFormDetailsPresenter(flow, composer, i);
            case 21:
                return models$com$squareup$cash$earnings$applets$presenters$EarnerAppletTilePresenter(flow, composer, i);
            case 22:
                return models$com$squareup$cash$earnings$presenters$payers$AddPayerCustomersPresenter(flow, composer, i);
            case 23:
                return models$com$squareup$cash$earnings$presenters$payers$PayerTaggingPromptPresenter(flow, composer, i);
            case 24:
                return models$com$squareup$cash$family$familyhub$presenters$DependentTeenQrCodeShareSheetPresenter(flow, composer, i);
            case 25:
                m3429models(flow, composer, i);
                return Unit.INSTANCE;
            case 26:
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(-1011209278);
                Updater.LaunchedEffect(gapComposer17, flow, new PasscodeDialogPresenter$models$1$1(flow, (Continuation) r7, cardStudioPresenter, i8));
                FullScreenActivityViewModel fullScreenActivityViewModel = new FullScreenActivityViewModel(((RealActivityEmbeddedPresenter) ((Lazy) cardStudioPresenter.cardStudioQueries).getValue()).models(gapComposer17, 0), ((AndroidStringManager) obj6).get(R.string.profile_complete_activity_title));
                gapComposer17.end(false);
                return fullScreenActivityViewModel;
            case 27:
                return models$com$squareup$cash$history$presenters$RefundPaymentPresenter(flow, composer, i);
            case 28:
                return models$com$squareup$cash$investing$presenters$custom$order$InvestingPeriodSelectionPresenter(flow, composer, i);
            default:
                AndroidStringManager androidStringManager8 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(-1423062360);
                InvestingState investingStates = ((RealInvestingStateManager) obj6).investingStates(gapComposer18);
                if (investingStates instanceof InvestingState.Content) {
                    z4 = ((InvestingState.Content) investingStates).brokerageAccountState.equals(InvestingState.Content.BrokerageAccountState.Inactive.INSTANCE);
                } else {
                    if (!investingStates.equals(InvestingState.Loading.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z4 = false;
                }
                Updater.LaunchedEffect(gapComposer18, flow, new GLThread$start$2(flow, (Continuation) null, cardStudioPresenter, Updater.rememberUpdatedState(Boolean.valueOf(z4), gapComposer18), 21));
                DividendReinvestmentWelcomeViewModel dividendReinvestmentWelcomeViewModel = new DividendReinvestmentWelcomeViewModel(androidStringManager8.get(R.string.investing_drip_welcome_title), androidStringManager8.get(R.string.investing_drip_welcome_disclosure), androidStringManager8.get(R.string.investing_drip_welcome_continue), CollectionsKt__CollectionsKt.listOf((Object[]) new DividendReinvestmentWelcomeViewModel.Section[]{new DividendReinvestmentWelcomeViewModel.Section(androidStringManager8.get(R.string.investing_drip_welcome_first_entry_title), androidStringManager8.get(R.string.investing_drip_welcome_first_entry_message), DividendReinvestmentWelcomeViewModel.Section.Icon.UP_AND_DOWN_ARROW), new DividendReinvestmentWelcomeViewModel.Section(androidStringManager8.get(R.string.investing_drip_welcome_second_entry_title), androidStringManager8.get(R.string.investing_drip_welcome_second_entry_message), DividendReinvestmentWelcomeViewModel.Section.Icon.BULLET_POINT)}));
                gapComposer18.end(false);
                return dividendReinvestmentWelcomeViewModel;
        }
    }

    public boolean routeTo(String str) {
        return ((RealRouter) this.cardStudioQueries).route(new RoutingParams(new MoneyTabScreen(null), null, null, null, null, null, 510), str);
    }

    public String title() {
        return ((AndroidStringManager) this.appConfig).get(((AddPayerCustomersScreen) this.cardStudioQueries).entrypoint == AddPayerCustomersScreen.Entrypoint.POST_KYB ? R.string.add_payer_customers_post_kyb_title : R.string.add_payer_customers_title);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck appConfig;
        public final DoubleCheck cashDatabase;
        public final LambdaProvider ioContext;

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
            this.ioContext = lambdaProvider;
            this.analytics = doubleCheck;
            this.appConfig = doubleCheck2;
            this.cashDatabase = doubleCheck3;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
            this.analytics = doubleCheck;
            this.ioContext = lambdaProvider;
            this.appConfig = doubleCheck2;
            this.cashDatabase = doubleCheck3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3) {
            this.analytics = doubleCheck;
            this.appConfig = doubleCheck2;
            this.ioContext = lambdaProvider;
            this.cashDatabase = doubleCheck3;
        }
    }

    public CardStudioPresenter(AndroidStringManager androidStringManager, RealInputFieldTextSaver realInputFieldTextSaver, Analytics analytics, DirectDepositEditCompanyNameScreen directDepositEditCompanyNameScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        directDepositEditCompanyNameScreen.getClass();
        this.args = androidStringManager;
        this.ioContext = realInputFieldTextSaver;
        this.analytics = analytics;
        this.appConfig = directDepositEditCompanyNameScreen;
        this.navigator = screenNavigator;
        this.cardStudioQueries = directDepositEditCompanyNameScreen.question;
    }

    public CardStudioPresenter(ConfirmCashOutScreen confirmCashOutScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealConfirmCashOutVersionCodeProvider realConfirmCashOutVersionCodeProvider, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        confirmCashOutScreen.getClass();
        this.args = confirmCashOutScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.ioContext = realConfirmCashOutVersionCodeProvider;
        this.appConfig = androidStringManager;
        this.cardStudioQueries = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public CardStudioPresenter(BetterNavigator.ScreenNavigator screenNavigator, PaymentHistoryScreens$ProfileCompletePaymentHistory paymentHistoryScreens$ProfileCompletePaymentHistory, AndroidStringManager androidStringManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivitiesCacheManager realActivitiesCacheManager, CounterpartyPageRequestHandler$Factory$Impl counterpartyPageRequestHandler$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, ProfileActivityItemEventDecorator profileActivityItemEventDecorator) {
        paymentHistoryScreens$ProfileCompletePaymentHistory.getClass();
        this.navigator = screenNavigator;
        this.args = paymentHistoryScreens$ProfileCompletePaymentHistory;
        this.ioContext = androidStringManager;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.analytics = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new GLSceneScope$$ExternalSyntheticLambda2(18, realActivityTokenFactory, counterpartyPageRequestHandler$Factory$Impl, this));
        this.appConfig = RealActivitiesCacheManager.take$default(realActivitiesCacheManager, paymentHistoryScreens$ProfileCompletePaymentHistory.profileId);
        this.cardStudioQueries = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new l2$$ExternalSyntheticLambda7(realActivityEmbeddedPresenter$Factory$Impl, this, defaultActivityItemEventHandler$Factory$Impl, profileActivityItemEventDecorator, 26));
    }

    public CardStudioPresenter(RealLegacyActivityEntityManager realLegacyActivityEntityManager, PaymentManager paymentManager, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, HistoryScreens.RefundPayment refundPayment, BetterNavigator.ScreenNavigator screenNavigator) {
        refundPayment.getClass();
        this.args = realLegacyActivityEntityManager;
        this.ioContext = paymentManager;
        this.analytics = androidStringManager;
        this.appConfig = refundPayment;
        this.navigator = screenNavigator;
        this.cardStudioQueries = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public CardStudioPresenter(RealBalanceSnapshotManager realBalanceSnapshotManager, RealBitcoinPayInUsdPreferenceManager realBitcoinPayInUsdPreferenceManager, AndroidStringManager androidStringManager, CoroutineScope coroutineScope, LocalizedMoneyFormatter.Factory factory, BitcoinPayInUsdSettingsScreen bitcoinPayInUsdSettingsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        bitcoinPayInUsdSettingsScreen.getClass();
        this.args = realBalanceSnapshotManager;
        this.ioContext = realBitcoinPayInUsdPreferenceManager;
        this.analytics = androidStringManager;
        this.appConfig = coroutineScope;
        this.navigator = screenNavigator;
        this.cardStudioQueries = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public CardStudioPresenter(IntentLauncher intentLauncher, Analytics analytics, RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager, BitcoinLocationScreen bitcoinLocationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        bitcoinLocationScreen.getClass();
        this.args = intentLauncher;
        this.analytics = analytics;
        this.ioContext = realBitcoinMapEligibilityManager;
        this.navigator = screenNavigator;
        BitcoinSellerLocation bitcoinSellerLocation = bitcoinLocationScreen.location;
        this.appConfig = bitcoinSellerLocation.id;
        this.cardStudioQueries = bitcoinSellerLocation;
    }

    public CardStudioPresenter(AndroidStringManager androidStringManager, RealPayerRepository realPayerRepository, CoroutineScope coroutineScope, LocalizedMoneyFormatter.Factory factory, PayerTaggingPromptSheet payerTaggingPromptSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        payerTaggingPromptSheet.getClass();
        this.args = androidStringManager;
        this.ioContext = realPayerRepository;
        this.analytics = coroutineScope;
        this.appConfig = payerTaggingPromptSheet;
        this.navigator = screenNavigator;
        this.cardStudioQueries = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public CardStudioPresenter(CryptoFlowStarter cryptoFlowStarter, AndroidStringManager androidStringManager, FlowStarter flowStarter, Analytics analytics, BitcoinInstrumentRecommendationScreen bitcoinInstrumentRecommendationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        bitcoinInstrumentRecommendationScreen.getClass();
        this.args = cryptoFlowStarter;
        this.ioContext = androidStringManager;
        this.appConfig = flowStarter;
        this.analytics = analytics;
        this.cardStudioQueries = bitcoinInstrumentRecommendationScreen;
        this.navigator = screenNavigator;
    }

    public CardStudioPresenter(RealAccountSwitcher realAccountSwitcher, FlowStarter flowStarter, AcceptableScrim acceptableScrim, AccountSwitchScreenStateRelay accountSwitchScreenStateRelay, SwitchFullAccountLoadingScreen switchFullAccountLoadingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        switchFullAccountLoadingScreen.getClass();
        this.args = realAccountSwitcher;
        this.ioContext = flowStarter;
        this.analytics = acceptableScrim;
        this.appConfig = accountSwitchScreenStateRelay;
        this.cardStudioQueries = switchFullAccountLoadingScreen;
        this.navigator = screenNavigator;
    }

    public CardStudioPresenter(RealManagedAccountTransferManager realManagedAccountTransferManager, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, ManagedAccountTransferLoadingScreen managedAccountTransferLoadingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        managedAccountTransferLoadingScreen.getClass();
        this.args = realManagedAccountTransferManager;
        this.ioContext = flowStarter;
        this.analytics = blockersDataNavigator;
        this.appConfig = managedAccountTransferLoadingScreen;
        this.navigator = screenNavigator;
        this.cardStudioQueries = Boxes$$ExternalSyntheticOutline1.m();
    }

    public CardStudioPresenter(AndroidStringManager androidStringManager, RealInputFieldTextSaver realInputFieldTextSaver, RealJurisdictionConfigManager realJurisdictionConfigManager, DirectDepositEditPaycheckCurrencyAllocationScreen directDepositEditPaycheckCurrencyAllocationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        directDepositEditPaycheckCurrencyAllocationScreen.getClass();
        this.args = androidStringManager;
        this.ioContext = realInputFieldTextSaver;
        this.analytics = realJurisdictionConfigManager;
        this.appConfig = directDepositEditPaycheckCurrencyAllocationScreen;
        this.navigator = screenNavigator;
        this.cardStudioQueries = directDepositEditPaycheckCurrencyAllocationScreen.question;
    }

    public CardStudioPresenter(AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, BlockerFlowListener blockerFlowListener, BlockersScreens.CardActivationScreen cardActivationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.args = appService;
        this.ioContext = blockersDataNavigator;
        this.analytics = androidStringManager;
        this.appConfig = blockerFlowListener;
        this.cardStudioQueries = cardActivationScreen;
        this.navigator = screenNavigator;
    }

    public CardStudioPresenter(AndroidSvg androidSvg, AndroidStringManager androidStringManager, RealLocalLauncher realLocalLauncher, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator, LocalMarketingMessageScreen localMarketingMessageScreen) {
        localMarketingMessageScreen.getClass();
        this.args = androidSvg;
        this.ioContext = androidStringManager;
        this.appConfig = realLocalLauncher;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.cardStudioQueries = localMarketingMessageScreen;
    }

    public CardStudioPresenter(FlowStarter flowStarter, IntentLauncher intentLauncher, AndroidStringManager androidStringManager, RealBitcoinFormatter realBitcoinFormatter, RealBitcoinProfileRepo realBitcoinProfileRepo, BetterNavigator.ScreenNavigator screenNavigator) {
        this.args = flowStarter;
        this.ioContext = intentLauncher;
        this.analytics = androidStringManager;
        this.appConfig = realBitcoinFormatter;
        this.navigator = screenNavigator;
        this.cardStudioQueries = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
    }

    public CardStudioPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppMessageClientService appMessageClientService, RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper, CoroutineContext coroutineContext, Flow flow, BetterNavigator.ScreenNavigator screenNavigator) {
        this.args = appMessageClientService;
        this.ioContext = coroutineContext;
        this.navigator = flow;
        this.analytics = realAppMessageActionPerformer$Factory$Impl.create$1(screenNavigator);
        this.appConfig = cashAccountDatabaseImpl.cardMessageQueries;
    }

    public CardStudioPresenter(AndroidStringManager androidStringManager, RealInvestingStateManager realInvestingStateManager, FlowStarter flowStarter, FeatureFlagManager featureFlagManager, InvestingScreens.DividendReinvestmentWelcomeScreen dividendReinvestmentWelcomeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        dividendReinvestmentWelcomeScreen.getClass();
        this.args = androidStringManager;
        this.ioContext = realInvestingStateManager;
        this.analytics = flowStarter;
        this.appConfig = featureFlagManager;
        this.cardStudioQueries = dividendReinvestmentWelcomeScreen;
        this.navigator = screenNavigator;
    }

    public CardStudioPresenter(Analytics analytics, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, StablecoinNetworkRepo stablecoinNetworkRepo, StablecoinDepositOptionsScreen stablecoinDepositOptionsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        stablecoinDepositOptionsScreen.getClass();
        this.analytics = analytics;
        this.args = flowStarter;
        this.ioContext = blockersDataNavigator;
        this.appConfig = stablecoinNetworkRepo;
        this.cardStudioQueries = stablecoinDepositOptionsScreen;
        this.navigator = screenNavigator;
    }

    public CardStudioPresenter(RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper, AppMessageClientService appMessageClientService, RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, Flow flow, BetterNavigator.ScreenNavigator screenNavigator) {
        this.args = appMessageClientService;
        this.ioContext = coroutineContext;
        this.analytics = flow;
        this.navigator = screenNavigator;
        this.appConfig = realAppMessageActionPerformer$Factory$Impl.create$1(screenNavigator);
        this.cardStudioQueries = cashAccountDatabaseImpl.popupMessageQueries;
    }

    public CardStudioPresenter(BitcoinAppletTileRepository bitcoinAppletTileRepository, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, AndroidStringManager androidStringManager, MoneyAnalyticsService moneyAnalyticsService, Navigator navigator) {
        navigator.getClass();
        this.args = bitcoinAppletTileRepository;
        this.navigator = androidStringManager;
        this.ioContext = moneyAnalyticsService;
        this.analytics = navigator;
        this.appConfig = androidStringManager.get(R.string.applets_pres_bitcoin);
        this.cardStudioQueries = promotedAppletTilePresenter$Factory$Impl.create(AppletId.BITCOIN);
    }

    public CardStudioPresenter(AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, RealProfileManager realProfileManager, Analytics analytics, DirectDepositManualFormDetailsScreen directDepositManualFormDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        directDepositManualFormDetailsScreen.getClass();
        this.args = androidStringManager;
        this.ioContext = factory;
        this.analytics = realProfileManager;
        this.appConfig = directDepositManualFormDetailsScreen;
        this.navigator = screenNavigator;
        this.cardStudioQueries = LazyKt.lazy(new DirectDepositManualFormDetailsPresenter$$ExternalSyntheticLambda1(this, 1));
    }

    public CardStudioPresenter(Navigator navigator, RealEarnerAppletAvailabilityState realEarnerAppletAvailabilityState, FlowStarter flowStarter, RealEarningsSyncStateRepository realEarningsSyncStateRepository, RealRouter$Factory$Impl realRouter$Factory$Impl, MoneyAnalyticsService moneyAnalyticsService) {
        navigator.getClass();
        this.args = navigator;
        this.navigator = realEarnerAppletAvailabilityState;
        this.ioContext = flowStarter;
        this.analytics = realEarningsSyncStateRepository;
        this.appConfig = moneyAnalyticsService;
        this.cardStudioQueries = realRouter$Factory$Impl.create$1(navigator);
    }

    public CardStudioPresenter(CardStudioScreen cardStudioScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealDeviceOrientationProvider realDeviceOrientationProvider, AppConfigManager appConfigManager) {
        cardStudioScreen.getClass();
        this.args = cardStudioScreen;
        this.navigator = screenNavigator;
        this.ioContext = coroutineContext;
        this.analytics = realDeviceOrientationProvider;
        this.appConfig = appConfigManager;
        this.cardStudioQueries = cashAccountDatabaseImpl.cardStudioQueries;
    }

    public CardStudioPresenter(n nVar, CoroutineContext coroutineContext, RealRouter$Factory$Impl realRouter$Factory$Impl, AfterPayOrderHubScreen afterPayOrderHubScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        afterPayOrderHubScreen.getClass();
        this.args = nVar;
        this.ioContext = coroutineContext;
        this.analytics = afterPayOrderHubScreen;
        this.navigator = screenNavigator;
        this.appConfig = realRouter$Factory$Impl.create$1(screenNavigator);
        this.cardStudioQueries = FlowKt.receiveAsFlow((BufferedChannel) nVar.c);
    }

    public CardStudioPresenter(RealPayerRepository realPayerRepository, RealContactRepository realContactRepository, RealRecipientRepository realRecipientRepository, AndroidStringManager androidStringManager, AddPayerCustomersScreen addPayerCustomersScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        addPayerCustomersScreen.getClass();
        this.args = realPayerRepository;
        this.ioContext = realContactRepository;
        this.analytics = realRecipientRepository;
        this.appConfig = androidStringManager;
        this.cardStudioQueries = addPayerCustomersScreen;
        this.navigator = screenNavigator;
    }

    public CardStudioPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, InvestmentOrderPresenter$Factory$Impl investmentOrderPresenter$Factory$Impl, AndroidStringManager androidStringManager, RealInvestingAnalytics realInvestingAnalytics, CoroutineContext coroutineContext, InvestingScreens.InvestingPeriodSelectionScreen investingPeriodSelectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        investingPeriodSelectionScreen.getClass();
        this.args = androidStringManager;
        this.analytics = realInvestingAnalytics;
        this.ioContext = coroutineContext;
        this.appConfig = investingPeriodSelectionScreen;
        this.navigator = screenNavigator;
        this.cardStudioQueries = cashAccountDatabaseImpl.investingSettingsQueries;
    }

    public CardStudioPresenter(LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, CashApProxyClientService cashApProxyClientService, AndroidStringManager androidStringManager, AfterPayOrderDetailsScreen afterPayOrderDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        afterPayOrderDetailsScreen.getClass();
        this.args = cashApProxyClientService;
        this.ioContext = androidStringManager;
        this.analytics = afterPayOrderDetailsScreen;
        this.navigator = screenNavigator;
        this.appConfig = realRouter$Factory$Impl.create$1(screenNavigator);
        this.cardStudioQueries = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public CardStudioPresenter(AndroidStringManager androidStringManager, AndroidPackageManager androidPackageManager, TextSetter textSetter, Analytics analytics, DependentTeenQrCodeShareSheetScreen dependentTeenQrCodeShareSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        dependentTeenQrCodeShareSheetScreen.getClass();
        this.args = androidStringManager;
        this.ioContext = androidPackageManager;
        this.appConfig = textSetter;
        this.analytics = analytics;
        this.cardStudioQueries = dependentTeenQrCodeShareSheetScreen;
        this.navigator = screenNavigator;
    }

    public CardStudioPresenter(Analytics analytics, RealLocalBrandRepository realLocalBrandRepository, LocalService localService, BetterNavigator.ScreenNavigator screenNavigator, LocalSchedulingDayTimePickerScreen localSchedulingDayTimePickerScreen) {
        localSchedulingDayTimePickerScreen.getClass();
        this.analytics = analytics;
        this.args = realLocalBrandRepository;
        this.ioContext = localService;
        this.navigator = screenNavigator;
        this.appConfig = localSchedulingDayTimePickerScreen;
        this.cardStudioQueries = localSchedulingDayTimePickerScreen.brandSpot;
    }

    public CardStudioPresenter(CardStudioScreen cardStudioScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, Analytics analytics, AppConfigManager appConfigManager, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        cardStudioScreen.getClass();
        this.args = cardStudioScreen;
        this.navigator = screenNavigator;
        this.ioContext = coroutineContext;
        this.analytics = analytics;
        this.appConfig = appConfigManager;
        this.cardStudioQueries = cashAccountDatabaseImpl.cardStudioQueries;
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3429models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        flow.getClass();
        switch (i5) {
            case 3:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(1656287568);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BlockRunner$cancel$1(this, continuation, 25);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, "switch-account", (Function2) rememberedValue);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(this, flow, i, 5);
                    break;
                }
                break;
            case 14:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-673454590);
                if ((i & 6) == 0) {
                    i3 = (gapComposer2.changedInstance(flow) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance2 = gapComposer2.changedInstance(this);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new AmountPickerCondensedView.AnonymousClass14(this, continuation, 26);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
                    Updater.LaunchedEffect(gapComposer2, flow, new CashtagPresenter$models$2$1(flow, continuation, this, 9));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 20);
                    break;
                }
                break;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(803748614);
                if ((i & 48) == 0) {
                    i4 = i | (gapComposer3.changedInstance(this) ? 32 : 16);
                } else {
                    i4 = i;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 17) != 16)) {
                    Unit unit2 = Unit.INSTANCE;
                    boolean changedInstance3 = gapComposer3.changedInstance(this);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CheckStatusPresenter.AnonymousClass1.C00611(this, continuation, 3);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer3, unit2, (Function2) rememberedValue3);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(this, flow, i, 24);
                    break;
                }
                break;
        }
    }

    public CardAppMessageViewModel models(Flow flow, Composer composer) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(221852040);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(flow);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new CardAppMessagePresenterHelper$models$1$1(this, flow, null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            Flow flow2 = (Flow) this.navigator;
            rememberedValue2 = FlowKt.merge(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(flow2, this, 21), 11), new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flow2, 24), this, 22), this, 23));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        CardAppMessageViewModel cardAppMessageViewModel = (CardAppMessageViewModel) Updater.collectAsState((Flow) rememberedValue2, CardAppMessageViewModel.NotAvailable.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        return cardAppMessageViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public PopupAppMessageViewModel models(Flow flow, Composer composer, int i) {
        PopupAppMessageViewModel popupAppMessageViewModel;
        AppMessageImage.Animated asAppMessageImage;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1755053134);
        Object rememberedValue = gapComposer.rememberedValue();
        AppMessageImage appMessageImage = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new MLKitTitleGenerator$prepareModel$1(this, mutableState, objArr == true ? 1 : 0, 8);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new ToastKt$Toast$9$1((Object) flow, (Continuation) (objArr2 == true ? 1 : 0), (Object) this, 5));
        PopupMessage popupMessage = (PopupMessage) mutableState.getValue();
        if (popupMessage != null) {
            String str = popupMessage.messageToken;
            Animation animation = popupMessage.animation;
            if (animation == null || (asAppMessageImage = CameraCaptureCallbacks.asAppMessageImage(animation)) == null) {
                com.squareup.protos.cash.messagingplatformcommon.app.Image image = popupMessage.image;
                if (image != null) {
                    appMessageImage = CameraCaptureCallbacks.asAppMessageImage(image, false);
                }
            } else {
                appMessageImage = asAppMessageImage;
            }
            String emptyAsNull = Strings.emptyAsNull(popupMessage.title);
            String emptyAsNull2 = Strings.emptyAsNull(popupMessage.subtitle);
            AppMessageAction appMessageAction = popupMessage.primaryNavigationAction;
            appMessageAction.getClass();
            popupAppMessageViewModel = new PopupAppMessageViewModel.Loaded(str, appMessageImage, emptyAsNull, emptyAsNull2, RealAppMessageActionPresenterHelper.viewModelActions(str, true, appMessageAction, popupMessage.secondaryNavigationAction), new AppMessageViewEvent.AppMessageActionTaken(str, null, true, null, 8));
        } else {
            popupAppMessageViewModel = PopupAppMessageViewModel.Loading.INSTANCE;
        }
        gapComposer.end(false);
        return popupAppMessageViewModel;
    }
}
