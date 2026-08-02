package com.squareup.cash.history.presenters;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.Telephony;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.collection.SparseArrayCompat;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.e0;
import com.google.android.gms.internal.measurement.zzaag;
import com.google.android.play.core.splitinstall.internal.zzj;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Placement;
import com.squareup.cash.cdf.account.AccountAuthenticateViewLockSplashScreen;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewCheckStatus;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.formblocker.FormBlockerLaunchShow;
import com.squareup.cash.cdf.growtools.GrowToolsManageActivityItem;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractView;
import com.squareup.cash.cdf.productdiscovery.ProductDiscoveryContentInteractView;
import com.squareup.cash.cdf.productdiscovery.ProductDiscoveryContentRequestRender;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManagePendingRequestViewAll;
import com.squareup.cash.cdf.stock.StockSelectSelectMyFirstStock;
import com.squareup.cash.cdf.stock.StockViewViewActivityDetails;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.receiveasbitcoin.RealReceiveP2PAsBitcoinRepo;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.activity.RealPaymentNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.entities.PaymentQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.entities.PaymentQueries$forExternalId$2;
import com.squareup.cash.db2.entities.PaymentQueries.ForTokenQuery;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.family.familyhub.presenters.FamilyPendingRequestsPresenter;
import com.squareup.cash.family.familyhub.screens.DependentTeenQrCodeShareSheetScreen;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.fidesmo.views.ScanningStepAnimationTrigger;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.formview.components.arcade.ArcadeFormAddressView;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.FormDateInputViewEvent$TextChanged;
import com.squareup.cash.formview.viewmodels.FormDateInputViewModel;
import com.squareup.cash.genericelements.presenters.IllegalPassiveViewEventException;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsItem;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.ibl.CubemapFace;
import com.squareup.cash.graphics.swampgl.components.ibl.IblAssetData;
import com.squareup.cash.graphics.swampgl.components.ibl.IblMipLevel;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.history.treehouse.views.ActivityInviteFriendsView;
import com.squareup.cash.history.viewmodels.CheckStatusViewEvent;
import com.squareup.cash.history.viewmodels.CheckStatusViewModel;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapper;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$1;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$Config;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$instrumentsObs$3;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$instrumentsObs$7;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.components.RepeatClicksOnLongPress$attachTo$2$1;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaFullScreenView;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.sharesheet.ShareSheetViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CashTagProvisioning$IsRetry;
import com.squareup.cash.userjourneys.tracker.UserJourney$Variant$CashTagProvisioning$Deprovision;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.marketdata.GetInvestmentEntityNewsRequest;
import com.squareup.protos.cash.marketdata.GetInvestmentEntityNewsResponse;
import com.squareup.protos.cash.marketdata.MarketDataService;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityNews;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsResponse;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.TickerKt;
import com.squareup.workflow1.internal.SubtreeManager;
import dagger.internal.Providers;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.math.Constants;
import kotlin.random.PlatformRandomKt;
import kotlin.ranges.LongRange;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okhttp3.MultipartBody;
import okio.ByteString;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.scheduledreloader.api.external.v1.ExternalCreateOrUpdateScheduledReloadPreferenceRequest;
import squareup.cash.scheduledreloader.api.external.v1.ExternalGetLatestScheduledReloadPreferenceRequest;
import squareup.cash.scheduledreloader.api.external.v1.ExternalGetLatestScheduledReloadPreferenceResponse;
import squareup.cash.scheduledreloader.api.external.v1.ScheduledReloaderAppService;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CheckStatusPresenter implements MoleculePresenter {
    public final HistoryScreens.CheckPaymentStatus args;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final List paymentGetters;
    public final PaymentNavigator paymentNavigator;
    public final PaymentQueries paymentQueries;
    public final InstrumentQueries pendingPaymentQueries;
    public final AndroidStringManager stringManager;

    public CheckStatusPresenter(Analytics analytics, CashAccountDatabaseImpl cashAccountDatabaseImpl, OfflineManager offlineManager, AndroidStringManager androidStringManager, PaymentNavigator paymentNavigator, CoroutineContext coroutineContext, CoroutineScope coroutineScope, HistoryScreens.CheckPaymentStatus checkPaymentStatus, BetterNavigator.ScreenNavigator screenNavigator) {
        checkPaymentStatus.getClass();
        this.stringManager = androidStringManager;
        this.paymentNavigator = paymentNavigator;
        this.ioDispatcher = coroutineContext;
        this.args = checkPaymentStatus;
        this.navigator = screenNavigator;
        this.paymentQueries = cashAccountDatabaseImpl.paymentQueries;
        this.pendingPaymentQueries = cashAccountDatabaseImpl.pendingPaymentQueries;
        this.paymentGetters = checkPaymentStatus.paymentGetters;
        analytics.track(new ActivityRecordViewCheckStatus(), null);
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, offlineManager, null, 0), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        KFunction kFunction;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1906398685);
        String str = null;
        Updater.LaunchedEffect(gapComposer, flow, new PasscodeDialogPresenter$models$1$1(flow, (Continuation) (0 == true ? 1 : 0), (Object) this, 6));
        Object rememberedValue = gapComposer.rememberedValue();
        CoroutineContext coroutineContext = this.ioDispatcher;
        HistoryScreens.CheckPaymentStatus checkPaymentStatus = this.args;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = DBUtil.mapToOneOrNull(DBUtil.toFlow(this.pendingPaymentQueries.pendingRequest(checkPaymentStatus.paymentExternalId)), coroutineContext);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 1;
        if (rememberedValue2 == neverEqualPolicy) {
            String str2 = checkPaymentStatus.paymentExternalId;
            PaymentQueries paymentQueries = this.paymentQueries;
            paymentQueries.getClass();
            PaymentQueries$forExternalId$2 paymentQueries$forExternalId$2 = PaymentQueries$forExternalId$2.INSTANCE;
            RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(paymentQueries.new ForTokenQuery(str2, new PaymentQueries$$ExternalSyntheticLambda3(paymentQueries, i2), (byte) 0)), coroutineContext), 14);
            gapComposer.updateRememberedValue(realCustomerStore$getCustomerForId$$inlined$map$1);
            rememberedValue2 = realCustomerStore$getCustomerForId$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, new Pair(null, null), null, gapComposer, 0, 2);
        boolean changed = gapComposer.changed((PendingPayment) collectAsState.getValue()) | gapComposer.changed((Pair) collectAsState2.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            PendingPayment pendingPayment = (PendingPayment) collectAsState.getValue();
            rememberedValue3 = pendingPayment != null ? new Pair(pendingPayment.request, pendingPayment.orientation) : (Pair) collectAsState2.getValue();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Pair pair = (Pair) rememberedValue3;
        InitiatePaymentRequest initiatePaymentRequest = (InitiatePaymentRequest) pair.first;
        Orientation orientation = (Orientation) pair.second;
        if (initiatePaymentRequest != null) {
            InitiatePaymentRequest.CancelPaymentsData cancelPaymentsData = initiatePaymentRequest.cancel_payments_data;
            if (cancelPaymentsData != null) {
                if (!Intrinsics.areEqual(cancelPaymentsData.cancel_for_all, Boolean.TRUE)) {
                    List<UiCustomer> list = this.paymentGetters;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (UiCustomer uiCustomer : list) {
                            List<UiCustomer> list2 = cancelPaymentsData.cancel_for_getters;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((UiCustomer) it.next()).id);
                            }
                            if (!arrayList.contains(uiCustomer.id)) {
                                break;
                            }
                        }
                    }
                }
            }
            FormattedResources formattedResources = FormattedResources.INSTANCE;
            if (i2 == 0) {
                gapComposer.startReplaceGroup(1172381773);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    EnumListAdapter$encode$1 enumListAdapter$encode$1 = new EnumListAdapter$encode$1(1, formattedResources, FormattedResources.class, "history_check_status_pending_message", "history_check_status_pending_message(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 12);
                    gapComposer.updateRememberedValue(enumListAdapter$encode$1);
                    rememberedValue4 = enumListAdapter$encode$1;
                }
                kFunction = (KFunction) rememberedValue4;
                gapComposer.end(false);
            } else if (initiatePaymentRequest != null) {
                gapComposer.startReplaceGroup(1172465070);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    EnumListAdapter$encode$1 enumListAdapter$encode$12 = new EnumListAdapter$encode$1(1, formattedResources, FormattedResources.class, "history_check_status_cancel_pending", "history_check_status_cancel_pending(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 13);
                    gapComposer.updateRememberedValue(enumListAdapter$encode$12);
                    rememberedValue5 = enumListAdapter$encode$12;
                }
                kFunction = (KFunction) rememberedValue5;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1172536432);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    EnumListAdapter$encode$1 enumListAdapter$encode$13 = new EnumListAdapter$encode$1(1, formattedResources, FormattedResources.class, "history_check_status_already_sent", "history_check_status_already_sent(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 14);
                    gapComposer.updateRememberedValue(enumListAdapter$encode$13);
                    rememberedValue6 = enumListAdapter$encode$13;
                }
                kFunction = (KFunction) rememberedValue6;
                gapComposer.end(false);
            }
            AndroidStringManager androidStringManager = this.stringManager;
            String string2 = (initiatePaymentRequest == null && i2 == 0) ? androidStringManager.get(R.string.history_check_status_cancel_pending_message) : androidStringManager.getString((FormattedResource) ((Function1) kFunction).invoke(androidStringManager.get(orientation != Orientation.BILL ? R.string.history_check_status_type_bill : R.string.history_check_status_type_cash)));
            if (i2 != 0) {
                String str3 = androidStringManager.get(orientation == Orientation.BILL ? R.string.history_check_status_type_bill_capital : R.string.history_check_status_type_cash_capital);
                str3.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.history_check_status_cancel)).format(new Object[]{str3});
                str.getClass();
            }
            CheckStatusViewModel checkStatusViewModel = new CheckStatusViewModel((initiatePaymentRequest == null && i2 == 0) ? androidStringManager.get(R.string.history_check_status_cancel_pending_title) : androidStringManager.get(R.string.history_check_status_pending_title), string2, str);
            gapComposer.end(false);
            return checkStatusViewModel;
        }
        i2 = 0;
        FormattedResources formattedResources2 = FormattedResources.INSTANCE;
        if (i2 == 0) {
        }
        AndroidStringManager androidStringManager2 = this.stringManager;
        if (initiatePaymentRequest == null) {
        }
        if (i2 != 0) {
        }
        CheckStatusViewModel checkStatusViewModel2 = new CheckStatusViewModel((initiatePaymentRequest == null && i2 == 0) ? androidStringManager2.get(R.string.history_check_status_cancel_pending_title) : androidStringManager2.get(R.string.history_check_status_pending_title), string2, str);
        gapComposer.end(false);
        return checkStatusViewModel2;
    }

    /* renamed from: com.squareup.cash.history.presenters.CheckStatusPresenter$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Object $offlineManager;
        public final /* synthetic */ int $r8$classId;
        public int label;
        public /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
            this.$offlineManager = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$offlineManager;
            switch (i) {
                case 0:
                    return new AnonymousClass1((CheckStatusPresenter) this.this$0, (OfflineManager) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass1((GrowToolsAutoInvestManager) this.this$0, (GrowToolsManagerState) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass1((e0) this.this$0, (GrowToolsManagerState) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass1((CheckStatusPresenter) this.this$0, (CheckStatusViewEvent) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass1((RealColdStartIntegrityChecker) this.this$0, (Ref$BooleanRef) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass1((IntegrityCheck) this.this$0, (RealColdStartIntegrityChecker) obj2, continuation, 5);
                case 6:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((LocalCashBalancePresenter) obj2, continuation, 6);
                    anonymousClass1.this$0 = obj;
                    return anonymousClass1;
                case 7:
                    return new AnonymousClass1((LocalCashBalancePresenter) this.this$0, (MutableState) obj2, continuation, 7);
                case 8:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((NetworkStatus) obj2, continuation, 8);
                    anonymousClass12.this$0 = obj;
                    return anonymousClass12;
                case 9:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((PersistentHistoricalDataCache) obj2, continuation, 9);
                    anonymousClass13.this$0 = obj;
                    return anonymousClass13;
                case 10:
                    return new AnonymousClass1((RealInvestingHistoricalData) this.this$0, (InvestmentEntityToken) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass1((RealInvestingSyncer) this.this$0, (NewsKind.Stock) obj2, continuation, 11);
                case 12:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((RealInvestingMetrics.CachedETFDetailsResponse) obj2, continuation, 12);
                    anonymousClass14.this$0 = obj;
                    return anonymousClass14;
                case 13:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((RealInvestingMetrics.CachedMetricsResponse) obj2, continuation, 13);
                    anonymousClass15.this$0 = obj;
                    return anonymousClass15;
                case 14:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1((EglCore) obj2, continuation, 14);
                    anonymousClass16.this$0 = obj;
                    return anonymousClass16;
                case 15:
                    return new AnonymousClass1((EglCore) this.this$0, (AppCompatImageButton) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass1((StocksTransferEtaFullScreenView) this.this$0, (Function1) obj2, continuation, 16);
                case 17:
                    return new AnonymousClass1((DisclosurePresenter) this.this$0, (MutableState) obj2, continuation, 17);
                case 18:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1((SelectCustomerPresenter) obj2, continuation, 18);
                    anonymousClass17.this$0 = obj;
                    return anonymousClass17;
                case 19:
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1((ProfilePresenter) obj2, continuation, 19);
                    anonymousClass18.this$0 = obj;
                    return anonymousClass18;
                case 20:
                    return new AnonymousClass1((ProfilePresenter) this.this$0, (InvestingHomeViewEvent) obj2, continuation, 20);
                case 21:
                    AnonymousClass1 anonymousClass19 = new AnonymousClass1((TextGeometricTransformKt) obj2, continuation, 21);
                    anonymousClass19.this$0 = obj;
                    return anonymousClass19;
                case 22:
                    AnonymousClass1 anonymousClass110 = new AnonymousClass1((InvestingGraphContentModel$AccentColorType$UptoDateData) obj2, continuation, 22);
                    anonymousClass110.this$0 = obj;
                    return anonymousClass110;
                case 23:
                    return new AnonymousClass1((Channel) this.this$0, (List) obj2, continuation, 23);
                case 24:
                    return new AnonymousClass1((Channel) this.this$0, (InvestingCryptoNewsViewModel) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass1((Channel) this.this$0, (UiCallbackModel) obj2, continuation, 25);
                case 26:
                    AnonymousClass1 anonymousClass111 = new AnonymousClass1((InvestingPortfolioPresenter) obj2, continuation, 26);
                    anonymousClass111.this$0 = obj;
                    return anonymousClass111;
                case 27:
                    return new AnonymousClass1((TapToPayPresenter) this.this$0, (Pair) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass1((LocalEditorialPresenter) this.this$0, (StockMetricTypePickerViewEvent) obj2, continuation, 28);
                default:
                    return new AnonymousClass1((MutableSharedFlow) this.this$0, (InitiateInvestmentOrderRequest) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:204:0x03b2, code lost:
        
            if (r0 == r3) goto L194;
         */
        /* JADX WARN: Code restructure failed: missing block: B:209:0x037b, code lost:
        
            if (r0.emit(r1, r29) == r3) goto L194;
         */
        /* JADX WARN: Code restructure failed: missing block: B:212:0x036e, code lost:
        
            if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r4, r29) == r3) goto L194;
         */
        /* JADX WARN: Code restructure failed: missing block: B:215:0x0358, code lost:
        
            if (r0.emit(r1, r29) == r3) goto L194;
         */
        /* JADX WARN: Code restructure failed: missing block: B:218:0x034b, code lost:
        
            if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r4, r29) == r3) goto L194;
         */
        /* JADX WARN: Code restructure failed: missing block: B:220:0x0335, code lost:
        
            if (r0.emit(r4, r29) == r3) goto L194;
         */
        /* JADX WARN: Code restructure failed: missing block: B:365:0x06a5, code lost:
        
            if (kotlinx.coroutines.JobKt.coroutineScope(new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3(r19, r20, (kotlin.coroutines.Continuation) null, 10), r29) == r3) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:371:0x06bb, code lost:
        
            if (((com.squareup.cash.data.db.RealAppConfigManager) r0).update(true, r29) == r3) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:373:0x06c8, code lost:
        
            if (r0.refresh(true, r29) == r3) goto L327;
         */
        /* JADX WARN: Code restructure failed: missing block: B:443:0x0837, code lost:
        
            if (r1 == r4) goto L387;
         */
        /* JADX WARN: Code restructure failed: missing block: B:449:0x07eb, code lost:
        
            if (r1 == r4) goto L387;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object externalGetLatestScheduledReloadPreference;
            Object externalCreateOrUpdateScheduledReloadPreference;
            Object pauseConversions;
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
            Object investmentEntityNews;
            int i = this.$r8$classId;
            int i2 = 25;
            int i3 = 10;
            int i4 = 5;
            int i5 = 6;
            int i6 = 3;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            Object obj2 = this.$offlineManager;
            int i7 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CheckStatusPresenter checkStatusPresenter = (CheckStatusPresenter) this.this$0;
                        CoroutineContext coroutineContext = checkStatusPresenter.ioDispatcher;
                        C00611 c00611 = new C00611((OfflineManager) obj2, checkStatusPresenter, continuation, z ? 1 : 0);
                        this.label = 1;
                        if (JobKt.withContext(coroutineContext, c00611, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    GrowToolsManagerState growToolsManagerState = (GrowToolsManagerState) obj2;
                    GrowToolsAutoInvestManager growToolsAutoInvestManager = (GrowToolsAutoInvestManager) this.this$0;
                    ScheduledReloaderAppService scheduledReloaderAppService = growToolsAutoInvestManager.scheduledReloaderAppService;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                externalCreateOrUpdateScheduledReloadPreference = obj;
                                ApiResult apiResult = (ApiResult) externalCreateOrUpdateScheduledReloadPreference;
                                Analytics analytics = growToolsAutoInvestManager.analytics;
                                GrowToolsManagerScreen.ManageAutoInvestScreen manageAutoInvestScreen = growToolsAutoInvestManager.args;
                                PlatformRandomKt.trackToggleUpdate(analytics, apiResult, manageAutoInvestScreen.origin, manageAutoInvestScreen.f1144type);
                                if (apiResult instanceof ApiResult.Failure) {
                                    growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.ERROR));
                                } else if (!(apiResult instanceof ApiResult.Success)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            externalGetLatestScheduledReloadPreference = obj;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        ExternalGetLatestScheduledReloadPreferenceRequest externalGetLatestScheduledReloadPreferenceRequest = new ExternalGetLatestScheduledReloadPreferenceRequest(ScheduledReloadPreference.Type.TYPE_BTC_BUY, null, ByteString.EMPTY);
                        this.label = 1;
                        externalGetLatestScheduledReloadPreference = scheduledReloaderAppService.externalGetLatestScheduledReloadPreference(externalGetLatestScheduledReloadPreferenceRequest, this);
                        break;
                    }
                    ApiResult apiResult2 = (ApiResult) externalGetLatestScheduledReloadPreference;
                    if (apiResult2 instanceof ApiResult.Failure) {
                        growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.ERROR));
                        break;
                    } else if (apiResult2 instanceof ApiResult.Success) {
                        ScheduledReloadPreference scheduledReloadPreference = ((ExternalGetLatestScheduledReloadPreferenceResponse) ((ApiResult.Success) apiResult2).response).scheduled_reload_preference;
                        scheduledReloadPreference.getClass();
                        ExternalCreateOrUpdateScheduledReloadPreferenceRequest externalCreateOrUpdateScheduledReloadPreferenceRequest = new ExternalCreateOrUpdateScheduledReloadPreferenceRequest(ScheduledReloadPreference.copy$default(scheduledReloadPreference, null, null, null, null, null, null, null, null, 2097150), null, ByteString.EMPTY);
                        this.label = 2;
                        externalCreateOrUpdateScheduledReloadPreference = scheduledReloaderAppService.externalCreateOrUpdateScheduledReloadPreference(externalCreateOrUpdateScheduledReloadPreferenceRequest, this);
                        break;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealReceiveP2PAsBitcoinRepo realReceiveP2PAsBitcoinRepo = (RealReceiveP2PAsBitcoinRepo) ((e0) this.this$0).a;
                        this.label = 1;
                        pauseConversions = realReceiveP2PAsBitcoinRepo.pauseConversions(this);
                        if (pauseConversions == coroutineSingletons3) {
                            break;
                        }
                    } else if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        pauseConversions = obj;
                    }
                    if (!((Boolean) pauseConversions).booleanValue()) {
                        ((GrowToolsManagerState) obj2).setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.ERROR));
                    }
                    break;
                case 3:
                    CheckStatusPresenter checkStatusPresenter2 = (CheckStatusPresenter) this.this$0;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        PaymentNavigator paymentNavigator = checkStatusPresenter2.paymentNavigator;
                        ClientScenario clientScenario = ClientScenario.ACTIVITY;
                        HistoryScreens.CheckPaymentStatus checkPaymentStatus = checkStatusPresenter2.args;
                        Object cancelPayment = ((RealPaymentNavigator) paymentNavigator).cancelPayment(clientScenario, checkPaymentStatus.flowToken, checkPaymentStatus.paymentExternalId, checkPaymentStatus.paymentAmount, checkStatusPresenter2.paymentGetters, this);
                        if (cancelPayment != coroutineSingletons4) {
                            cancelPayment = Unit.INSTANCE;
                        }
                        if (cancelPayment == coroutineSingletons4) {
                            break;
                        }
                    } else if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    BetterNavigator.ScreenNavigator screenNavigator = checkStatusPresenter2.navigator;
                    ((CheckStatusViewEvent.NegativeClicked) ((CheckStatusViewEvent) obj2)).getClass();
                    screenNavigator.goTo(new Finish(AlertDialogResult.NEGATIVE));
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(RealColdStartIntegrityChecker.SYNC_APP_LOCK_ANALYTICS_DELAY);
                        this.label = 1;
                        if (JobKt.delay(m4167getInWholeMillisecondsimpl, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    RealColdStartIntegrityChecker realColdStartIntegrityChecker = (RealColdStartIntegrityChecker) this.this$0;
                    Analytics analytics2 = realColdStartIntegrityChecker.analytics;
                    long j = RealColdStartIntegrityChecker.SYNC_APP_LOCK_ANALYTICS_DELAY;
                    Duration.Companion companion = Duration.Companion;
                    analytics2.track(new AccountAuthenticateViewLockSplashScreen(Integer.valueOf((int) Duration.m4176toLongimpl(j, DurationUnit.SECONDS)), Boolean.valueOf(realColdStartIntegrityChecker.accessSyncValue.getValue() != null)), null);
                    ((Ref$BooleanRef) obj2).element = true;
                    break;
                case 5:
                    IntegrityCheck integrityCheck = (IntegrityCheck) this.this$0;
                    RealColdStartIntegrityChecker realColdStartIntegrityChecker2 = (RealColdStartIntegrityChecker) obj2;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int ordinal = integrityCheck.getType().ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    long j2 = RealColdStartIntegrityChecker.SYNC_APP_LOCK_TIMEOUT;
                                    this.label = 3;
                                    break;
                                } else {
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1(integrityCheck, "Missing retry setup for ");
                                    break;
                                }
                            } else {
                                AppConfigManager appConfigManager = realColdStartIntegrityChecker2.appConfig;
                                this.label = 2;
                                break;
                            }
                        } else {
                            RealProfileSyncer realProfileSyncer = realColdStartIntegrityChecker2.profileSyncer;
                            this.label = 1;
                            break;
                        }
                    } else if (i13 != 1 && i13 != 2 && i13 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 6:
                    SelectPaymentInstrumentArgs selectPaymentInstrumentArgs = (SelectPaymentInstrumentArgs) ((LocalCashBalancePresenter) obj2).clock;
                    FlowCollector flowCollector = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SelectPaymentInstrumentPresenter$initialModel$Config selectPaymentInstrumentPresenter$initialModel$Config = new SelectPaymentInstrumentPresenter$initialModel$Config(selectPaymentInstrumentArgs.getCreditCardFeeBps(), selectPaymentInstrumentArgs.getCreditCardLinkingEnabled(), selectPaymentInstrumentArgs.getCashBalanceEnabled());
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector.emit(selectPaymentInstrumentPresenter$initialModel$Config, this) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 7:
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.this$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealInstrumentManager realInstrumentManager = (RealInstrumentManager) localCashBalancePresenter.analytics;
                        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) localCashBalancePresenter.launcher;
                        SelectPaymentInstrumentArgs selectPaymentInstrumentArgs2 = (SelectPaymentInstrumentArgs) localCashBalancePresenter.clock;
                        if (selectPaymentInstrumentArgs2.getType() == SelectPaymentInstrumentType.SELECT_FROM_ALL) {
                            flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realBalanceSnapshotManager.select(), realInstrumentManager.select(), SelectPaymentInstrumentPresenter$initialModel$instrumentsObs$3.INSTANCE, z3 ? 1 : 0);
                        } else {
                            String[] strArr = (String[]) selectPaymentInstrumentArgs2.getInstrumentTokens().toArray(new String[0]);
                            flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new Transform$special$$inlined$map$1(realBalanceSnapshotManager.select(), strArr, 22), StateFlowKt.runUntil(new Transform$special$$inlined$map$1(RealInstrumentManager.syncValueBased$default(realInstrumentManager), (String[]) Arrays.copyOf(strArr, strArr.length), 21), realInstrumentManager.signOut), SelectPaymentInstrumentPresenter$initialModel$instrumentsObs$7.INSTANCE, z2 ? 1 : 0);
                        }
                        int i16 = 9;
                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(25, new Flow[]{FlowKt.transformLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(i6, continuation, i7)), new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AnonymousClass1(localCashBalancePresenter, continuation, i5), new RealAppConfigManager$cashLiteConfig$$inlined$map$1(((RealAppConfigManager) ((AppConfigManager) localCashBalancePresenter.syncer)).instrumentLinkingConfig(), i16)), ((RealInstrumentLinkingOptionManager) localCashBalancePresenter.sessionManager).select(), ((RealProfileManager) localCashBalancePresenter.store).profile(), ((RealStatusAndLimitsManager) localCashBalancePresenter.service).hasPassedIdv()}, new SelectPaymentInstrumentPresenter$initialModel$1(localCashBalancePresenter, null)));
                        RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$1 = new RepeatClicksOnLongPress$attachTo$2$1(10, localCashBalancePresenter, (MutableState) obj2);
                        this.label = 1;
                        Object collect = distinctUntilChanged.collect(new RepeatClicksOnLongPress$attachTo$2$1(i16, repeatClicksOnLongPress$attachTo$2$1, localCashBalancePresenter), this);
                        if (collect != coroutineSingletons8) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons8) {
                            break;
                        }
                    } else if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 8:
                    FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector2.emit((NetworkStatus) obj2, this) == coroutineSingletons9) {
                            break;
                        }
                    } else if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 9:
                    FlowCollector flowCollector3 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) ((PersistentHistoricalDataCache) obj2).portfoliosHistoricalDataResponseCache.cache;
                        if (getPortfoliosHistoricalDataResponse != null) {
                            this.this$0 = null;
                            this.label = 1;
                            if (flowCollector3.emit(getPortfoliosHistoricalDataResponse, this) == coroutineSingletons10) {
                                break;
                            }
                        }
                    } else if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (RealInvestmentPerformanceSyncer.syncPerformance$default(((RealInvestingHistoricalData) this.this$0).investmentPerformanceSyncer, (InvestmentEntityToken) obj2, this) == coroutineSingletons11) {
                            break;
                        }
                    } else if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 11:
                    NewsKind.Stock stock = (NewsKind.Stock) obj2;
                    RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) this.this$0;
                    Map map = realInvestingSyncer.newsCacheExpiryTimes;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Instant instant = (Instant) map.get(stock);
                        if (instant == null || !instant.isAfter(DimensionKt.now(realInvestingSyncer.clock))) {
                            GetInvestmentEntityNewsRequest getInvestmentEntityNewsRequest = new GetInvestmentEntityNewsRequest(CollectionsKt__CollectionsJVMKt.listOf(stock.token.value), ByteString.EMPTY);
                            MarketDataService marketDataService = realInvestingSyncer.marketDataService;
                            this.label = 1;
                            investmentEntityNews = marketDataService.getInvestmentEntityNews(getInvestmentEntityNewsRequest, this);
                            if (investmentEntityNews == coroutineSingletons12) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        investmentEntityNews = obj;
                    }
                    ApiResult apiResult3 = (ApiResult) investmentEntityNews;
                    if (apiResult3 instanceof ApiResult.Success) {
                        GetInvestmentEntityNewsResponse getInvestmentEntityNewsResponse = (GetInvestmentEntityNewsResponse) ((ApiResult.Success) apiResult3).response;
                        Long l = getInvestmentEntityNewsResponse.next_cache_refresh_after;
                        if (l == null) {
                            map.remove(stock);
                        } else {
                            map.put(stock, Instant.ofEpochMilli(l.longValue()));
                        }
                        for (InvestmentEntityNews investmentEntityNews2 : getInvestmentEntityNewsResponse.investment_entity_news) {
                            String str = investmentEntityNews2.investment_entity_token;
                            str.getClass();
                            NewsKind.Stock stock2 = new NewsKind.Stock(new InvestmentEntityToken(str));
                            List list = investmentEntityNews2.news;
                            Integer num = getInvestmentEntityNewsResponse.number_of_news_in_carousel;
                            RealInvestingSyncer.access$saveNews(realInvestingSyncer, stock2, list, num != null ? num.intValue() : 3);
                        }
                    }
                    break;
                case 12:
                    FlowCollector flowCollector4 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetETFDetailsResponse getETFDetailsResponse = ((RealInvestingMetrics.CachedETFDetailsResponse) obj2).response;
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector4.emit(getETFDetailsResponse, this) == coroutineSingletons13) {
                            break;
                        }
                    } else if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 13:
                    FlowCollector flowCollector5 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetInvestingMetricsResponse getInvestingMetricsResponse = ((RealInvestingMetrics.CachedMetricsResponse) obj2).response;
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector5.emit(getInvestingMetricsResponse, this) == coroutineSingletons14) {
                            break;
                        }
                    } else if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 14:
                    FlowCollector flowCollector6 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (this.label) {
                        case 0:
                            SafeTrace.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            this.this$0 = flowCollector6;
                            this.label = 1;
                            break;
                        case 1:
                            SafeTrace.throwOnFailure(obj);
                            Duration.Companion companion2 = Duration.Companion;
                            long duration = DurationKt.toDuration(EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, DurationUnit.MILLISECONDS);
                            this.this$0 = flowCollector6;
                            this.label = 2;
                            break;
                        case 2:
                            SafeTrace.throwOnFailure(obj);
                            Unit unit2 = Unit.INSTANCE;
                            this.this$0 = flowCollector6;
                            this.label = 3;
                            break;
                        case 3:
                            SafeTrace.throwOnFailure(obj);
                            Duration.Companion companion3 = Duration.Companion;
                            long duration2 = DurationKt.toDuration(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, DurationUnit.MILLISECONDS);
                            this.this$0 = flowCollector6;
                            this.label = 4;
                            break;
                        case 4:
                            SafeTrace.throwOnFailure(obj);
                            Unit unit3 = Unit.INSTANCE;
                            this.this$0 = flowCollector6;
                            this.label = 5;
                            break;
                        case 5:
                            SafeTrace.throwOnFailure(obj);
                            Duration.Companion companion4 = Duration.Companion;
                            Flow flowOn = FlowKt.flowOn(TickerKt.m3996tickerFlowQTBD994$default(DurationKt.toDuration(80, DurationUnit.MILLISECONDS)), (CoroutineContext) ((EglCore) obj2).eglDisplay);
                            this.this$0 = null;
                            this.label = 6;
                            FlowKt.ensureActive(flowCollector6);
                            Object collect2 = flowOn.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector6, 21), this);
                            if (collect2 != coroutineSingletons15) {
                                collect2 = Unit.INSTANCE;
                            }
                            if (collect2 != coroutineSingletons15) {
                                collect2 = Unit.INSTANCE;
                                break;
                            }
                            break;
                        case 6:
                            SafeTrace.throwOnFailure(obj);
                            break;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                    }
                case 15:
                    EglCore eglCore = (EglCore) this.this$0;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest((SharedFlowImpl) eglCore.eglContext, new AnchoredDraggableNode$drag$2(continuation, eglCore, i2));
                        RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$12 = new RepeatClicksOnLongPress$attachTo$2$1(z4 ? 1 : 0, (AppCompatImageButton) obj2, eglCore);
                        this.label = 1;
                        if (transformLatest.collect(repeatClicksOnLongPress$attachTo$2$12, this) == coroutineSingletons16) {
                            break;
                        }
                    } else if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 != 0) {
                        if (i24 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl = ((StocksTransferEtaFullScreenView) this.this$0).formView.viewEvents;
                        SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(i3, (Function1) obj2);
                        this.label = 1;
                        sharedFlowImpl.getClass();
                        SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, anonymousClass2, this);
                        break;
                    }
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.this$0;
                        CoroutineContext coroutineContext2 = (CoroutineContext) disclosurePresenter.stringManager;
                        InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$1 = new InvestingHomeView$onScrollFlow$1((MoleculePresenter) disclosurePresenter, (MutableState) obj2, continuation, i4);
                        this.label = 1;
                        if (JobKt.withContext(coroutineContext2, investingHomeView$onScrollFlow$1, this) == coroutineSingletons18) {
                            break;
                        }
                    } else if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 18:
                    FlowCollector flowCollector7 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object obj3 = ((Cache) ((SelectCustomerPresenter) obj2).inputFieldTextSaver).cache;
                        InvestingHomeViewEvent.SelectHistoricalRange selectHistoricalRange = obj3 != null ? (InvestingHomeViewEvent.SelectHistoricalRange) obj3 : new InvestingHomeViewEvent.SelectHistoricalRange(HistoricalRange.DAY);
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector7.emit(selectHistoricalRange, this) == coroutineSingletons19) {
                            break;
                        }
                    } else if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 19:
                    ProfilePresenter profilePresenter = (ProfilePresenter) obj2;
                    CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                    Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealInvestingSyncer realInvestingSyncer2 = (RealInvestingSyncer) profilePresenter.jurisdictionConfigManager;
                        this.this$0 = coroutineScope;
                        this.label = 1;
                        Object withContext = JobKt.withContext(realInvestingSyncer2.ioDispatcher, new RealBoostSyncer$refresh$1(z5 ? 1 : 0, realInvestingSyncer2, continuation, i5), this);
                        Object obj5 = withContext;
                        if (withContext != obj4) {
                            obj5 = Unit.INSTANCE;
                        }
                        if (obj5 == obj4) {
                            break;
                        }
                    } else if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$load$2(profilePresenter, continuation, 17), 3);
                    break;
                case 20:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (ProfilePresenter.access$openCategoryDetailsScreen((ProfilePresenter) this.this$0, (InvestingHomeViewEvent.SelectCategory) ((InvestingHomeViewEvent) obj2), this) == coroutineSingletons20) {
                            break;
                        }
                    } else if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 21:
                    FlowCollector flowCollector8 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TextGeometricTransformKt textGeometricTransformKt = (TextGeometricTransformKt) obj2;
                        textGeometricTransformKt.getClass();
                        GraphPresenterData graphPresenterData = new GraphPresenterData(new SparseArrayCompat((Object) null), HistoricalRange.DAY, new InvestingGraphContentModel.Loading(textGeometricTransformKt, 15), new LongRange(0L, 0L));
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector8.emit(graphPresenterData, this) == coroutineSingletons21) {
                            break;
                        }
                    } else if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 22:
                    FlowCollector flowCollector9 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GraphPresenterData graphPresenterData2 = new GraphPresenterData(new SparseArrayCompat((Object) null), HistoricalRange.DAY, new InvestingGraphContentModel.Loading((InvestingGraphContentModel$AccentColorType$UptoDateData) obj2, 15), new LongRange(0L, 0L));
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector9.emit(graphPresenterData2, this) == coroutineSingletons22) {
                            break;
                        }
                    } else if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 23:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((Channel) this.this$0).send((List) obj2, this) == coroutineSingletons23) {
                            break;
                        }
                    } else if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 24:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((Channel) this.this$0).send((InvestingCryptoNewsViewModel) obj2, this) == coroutineSingletons24) {
                            break;
                        }
                    } else if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 25:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((Channel) this.this$0).send((UiCallbackModel) obj2, this) == coroutineSingletons25) {
                            break;
                        }
                    } else if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 26:
                    FlowCollector flowCollector10 = (FlowCollector) this.this$0;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object obj6 = ((InvestingPortfolioPresenter) obj2).rangeSelectionCache.cache;
                        InvestingHomeViewEvent.SelectHistoricalRange selectHistoricalRange2 = obj6 != null ? (InvestingHomeViewEvent.SelectHistoricalRange) obj6 : new InvestingHomeViewEvent.SelectHistoricalRange(HistoricalRange.DAY);
                        this.this$0 = null;
                        this.label = 1;
                        if (flowCollector10.emit(selectHistoricalRange2, this) == coroutineSingletons26) {
                            break;
                        }
                    } else if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 27:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) this.this$0;
                        InvestingStockSelectionViewEvent.SelectStockClicked selectStockClicked = new InvestingStockSelectionViewEvent.SelectStockClicked((InvestmentEntityToken) ((Pair) obj2).first);
                        this.label = 1;
                        if (TapToPayPresenter.access$submitSelection(tapToPayPresenter, selectStockClicked, this) == coroutineSingletons27) {
                            break;
                        }
                    } else if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 28:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.label;
                    if (i36 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue = (KeyValue) ((LocalEditorialPresenter) this.this$0).responseContextHandler;
                        PortfolioStockMetricType portfolioStockMetricType = ((StockMetricTypePickerViewEvent.SelectPortfolioMetricType) ((StockMetricTypePickerViewEvent) obj2)).metricType;
                        this.label = 1;
                        if (keyValue.set(portfolioStockMetricType, this) == coroutineSingletons28) {
                            break;
                        }
                    } else if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.label;
                    if (i37 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((MutableSharedFlow) this.this$0).emit((InitiateInvestmentOrderRequest) obj2, this) == coroutineSingletons29) {
                            break;
                        }
                    } else if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.squareup.cash.history.presenters.CheckStatusPresenter$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00611 extends SuspendLambda implements Function2 {
            public /* synthetic */ Object $offlineManager;
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ Object this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00611(Object obj, Object obj2, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.$offlineManager = obj;
                this.this$0 = obj2;
            }

            private final Object invokeSuspend$com$squareup$cash$graphics$swampgl$components$ibl$IblAssetLoaderKt$loadIblAssetData$3(Object obj) {
                AssetManager assetManager;
                int i;
                Bitmap bitmap;
                String str = "x";
                AssetManager assetManager2 = (AssetManager) this.this$0;
                String str2 = (String) this.$offlineManager;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i2 = 0;
                try {
                    Timber.Forest forest = Timber.Forest;
                    forest.d("Starting to load IBL asset from path: " + str2 + " (on background thread)", new Object[0]);
                    Pair access$peekIblFaceSize = Providers.access$peekIblFaceSize(assetManager2, str2.concat("/m0_px.rgbm"));
                    if (access$peekIblFaceSize == null) {
                        forest.e("Failed to peek face size for " + str2 + "/m0_px.rgbm", new Object[0]);
                        return null;
                    }
                    int intValue = ((Number) access$peekIblFaceSize.first).intValue();
                    int intValue2 = ((Number) access$peekIblFaceSize.second).intValue();
                    forest.d("Base face size: " + intValue + "x" + intValue2, new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    int log = ((int) ((float) (Math.log((double) ((float) intValue)) / Constants.LN2))) + 1;
                    forest.d("Expected " + log + " mip levels", new Object[0]);
                    int i3 = 0;
                    loop0: while (true) {
                        if (i3 >= log) {
                            break;
                        }
                        Timber.Forest.d("Loading mip level " + i3 + " (" + intValue + str + intValue2 + ")", new Object[i2]);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        CubemapFace[] values = CubemapFace.values();
                        int length = values.length;
                        int i4 = i2;
                        while (i4 < length) {
                            CubemapFace cubemapFace = values[i4];
                            String str3 = cubemapFace.suffix;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            String str4 = str;
                            sb.append("/m");
                            sb.append(i3);
                            sb.append("_");
                            sb.append(str3);
                            sb.append(".rgbm");
                            String sb2 = sb.toString();
                            Timber.Forest forest2 = Timber.Forest;
                            StringBuilder sb3 = new StringBuilder();
                            int i5 = log;
                            sb3.append("  Loading face: ");
                            sb3.append(sb2);
                            CubemapFace[] cubemapFaceArr = values;
                            forest2.v(sb3.toString(), new Object[0]);
                            try {
                                InputStream open = assetManager2.open(sb2);
                                try {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inPremultiplied = false;
                                    bitmap = BitmapFactory.decodeStream(open, null, options);
                                    Utf8.closeFinally(open, null);
                                    assetManager = assetManager2;
                                    i = length;
                                } finally {
                                }
                            } catch (Exception e) {
                                assetManager = assetManager2;
                                i = length;
                                Timber.Forest.e("Error loading IBL face: ".concat(sb2), new Object[0], e);
                                bitmap = null;
                            }
                            if (bitmap == null) {
                                forest2.w("Failed to load face: " + sb2, new Object[0]);
                                forest2.d("Stopped loading mip levels at level " + i3 + " (this is normal)", new Object[0]);
                                break loop0;
                            }
                            linkedHashMap.put(cubemapFace, bitmap);
                            i4++;
                            str = str4;
                            log = i5;
                            values = cubemapFaceArr;
                            assetManager2 = assetManager;
                            length = i;
                        }
                        arrayList.add(new IblMipLevel(i3, intValue, intValue2, linkedHashMap));
                        Timber.Forest.d("✓ Completed mip level " + i3, new Object[0]);
                        intValue /= 2;
                        intValue2 /= 2;
                        i3++;
                        str = str;
                        log = log;
                        assetManager2 = assetManager2;
                        i2 = 0;
                    }
                    if (arrayList.isEmpty()) {
                        Timber.Forest.e("No mip levels loaded for " + str2 + " - this is an error!", new Object[0]);
                        return null;
                    }
                    String substringAfterLast$default = StringsKt.substringAfterLast$default(str2, "/");
                    Timber.Forest.i("✓ Successfully loaded IBL asset: " + substringAfterLast$default + " with " + arrayList.size() + " mip levels", new Object[0]);
                    return new IblAssetData(substringAfterLast$default, arrayList);
                } catch (Exception e2) {
                    Timber.Forest.e("Error loading IBL asset from ".concat(str2), new Object[0], e2);
                    return null;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                int i = this.$r8$classId;
                Object obj2 = this.this$0;
                switch (i) {
                    case 0:
                        return new C00611((OfflineManager) this.$offlineManager, (CheckStatusPresenter) obj2, continuation, 0);
                    case 1:
                        return new C00611((CardStudioPresenter) this.$offlineManager, (MutableState) obj2, continuation, 1);
                    case 2:
                        return new C00611((FamilyPendingRequestsPresenter) this.$offlineManager, (MutableState) obj2, continuation, 2);
                    case 3:
                        C00611 c00611 = new C00611((CardStudioPresenter) obj2, continuation, 3);
                        c00611.$offlineManager = obj;
                        return c00611;
                    case 4:
                        return new C00611((AmountDisplayState) this.$offlineManager, (AmountChooserViewModel.Content) obj2, continuation, 4);
                    case 5:
                        return new C00611((FidesmoDeprovisioningPresenter) this.$offlineManager, (MutableState) obj2, continuation, 5);
                    case 6:
                        return new C00611((FidesmoProvisioningPresenter) this.$offlineManager, (MutableState) obj2, continuation, 6);
                    case 7:
                        return new C00611((ScanningStepAnimationTrigger) this.$offlineManager, (MutableState) obj2, continuation, 7);
                    case 8:
                        return new C00611((FidesmoProvisioningViewModel.Scanning) this.$offlineManager, (Function1) obj2, continuation, 8);
                    case 9:
                        return new C00611((RealAndroidFileParser) this.$offlineManager, (Uri) obj2, continuation, 9);
                    case 10:
                        return new C00611((String) this.$offlineManager, (RealAndroidFileParser) obj2, continuation, 10);
                    case 11:
                        return new C00611((ArcadeFormAddressView) this.$offlineManager, (AddressState.Valid) obj2, continuation, 11);
                    case 12:
                        return new C00611((ArcadeFormDateInputView) this.$offlineManager, (FormDateInputViewModel) obj2, continuation, 12);
                    case 13:
                        return new C00611((Channel) this.$offlineManager, (MutableState) obj2, continuation, 13);
                    case 14:
                        return new C00611((ArcadeFormMerchantTransactionPickerView) this.$offlineManager, (MutableState) obj2, continuation, 14);
                    case 15:
                        return new C00611((Function1) this.$offlineManager, (ArcadeFormOptionPickerView) obj2, continuation, 15);
                    case 16:
                        return new C00611((String) this.$offlineManager, (FormPresenter) obj2, continuation, 16);
                    case 17:
                        return new C00611((GenericTreeElementsItem) this.$offlineManager, (SubtreeManager) obj2, continuation, 17);
                    case 18:
                        return new C00611((GlobalSearchFeedKt$$ExternalSyntheticLambda5) this.$offlineManager, (GlobalSearchViewModel.Item) obj2, continuation, 18);
                    case 19:
                        return new C00611((GLSceneScope) this.$offlineManager, (String) obj2, continuation, 19);
                    case 20:
                        return new C00611((String) this.$offlineManager, (AssetManager) obj2, continuation, 20);
                    case 21:
                        return new C00611((TextureView) this.$offlineManager, (MutableFloatState) obj2, continuation, 21);
                    case 22:
                        C00611 c006112 = new C00611((Lazy) obj2, continuation, 22);
                        c006112.$offlineManager = obj;
                        return c006112;
                    case 23:
                        return new C00611((GrowToolsManagerState) this.$offlineManager, (MutableState) obj2, continuation, 23);
                    case 24:
                        C00611 c006113 = new C00611((ActivityInviteFriendsView) obj2, continuation, 24);
                        c006113.$offlineManager = obj;
                        return c006113;
                    case 25:
                        C00611 c006114 = new C00611((RealRequestReviewFlagWrapper) obj2, continuation, 25);
                        c006114.$offlineManager = obj;
                        return c006114;
                    case 26:
                        C00611 c006115 = new C00611((RealDependentInvestmentEntities) obj2, continuation, 26);
                        c006115.$offlineManager = obj;
                        return c006115;
                    case 27:
                        return new C00611((ProfilePresenter) this.$offlineManager, (MutableState) obj2, continuation, 27);
                    case 28:
                        return new C00611((ProfilePresenter) this.$offlineManager, (InvestingHomeViewEvent) obj2, continuation, 28);
                    default:
                        return new C00611((LocalHomePresenter) this.$offlineManager, (Investment_entity) obj2, continuation, 29);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (this.$r8$classId) {
                }
                return ((C00611) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                String replace;
                final String str2;
                String replace2;
                String str3;
                String extensionFromMimeType;
                FormBlocker.Element.UpsellElement upsellElement;
                FormBlocker.Element.UpsellElement upsellElement2;
                FormBlocker.Element.UpsellElement upsellElement3;
                FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData;
                FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData;
                FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData2;
                String str4;
                GenericTreeElementsViewEvent viewEvent;
                int i = this.$r8$classId;
                UserJourney$Tag$CashTagProvisioning$IsRetry userJourney$Tag$CashTagProvisioning$IsRetry = UserJourney$Tag$CashTagProvisioning$IsRetry.INSTANCE;
                UserJourney$Variant$CashTagProvisioning$Deprovision userJourney$Variant$CashTagProvisioning$Deprovision = UserJourney$Variant$CashTagProvisioning$Deprovision.INSTANCE;
                int i2 = 11;
                byte[] bArr = null;
                Object obj2 = this.this$0;
                switch (i) {
                    case 0:
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        OfflineManager offlineManager = (OfflineManager) this.$offlineManager;
                        String str5 = ((CheckStatusPresenter) obj2).args.paymentExternalId;
                        RealOfflineManager realOfflineManager = (RealOfflineManager) offlineManager;
                        str5.getClass();
                        Timber.Forest.d("Retrying pending payment: ".concat(str5), new Object[0]);
                        InstrumentQueries instrumentQueries = realOfflineManager.paymentQueries;
                        instrumentQueries.getClass();
                        instrumentQueries.driver.execute(-1487015526, "UPDATE pendingPayment\nSET retry_at = 0\nWHERE external_id = ?\nAND succeeded = 0", new SyncDetailsQueries$$ExternalSyntheticLambda2(str5, 14));
                        instrumentQueries.notifyQueries(-1487015526, new OfflineQueries$$ExternalSyntheticLambda1(10));
                        ((Number) realOfflineManager.databaseQueries.changes().executeAsOne()).longValue();
                        return Unit.INSTANCE;
                    case 1:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.$offlineManager;
                        AndroidStringManager androidStringManager = (AndroidStringManager) cardStudioPresenter.args;
                        DependentTeenQrCodeShareSheetScreen dependentTeenQrCodeShareSheetScreen = (DependentTeenQrCodeShareSheetScreen) cardStudioPresenter.cardStudioQueries;
                        String str6 = dependentTeenQrCodeShareSheetScreen.currencySymbol;
                        str6.getClass();
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.share_your_cashtag)).format(new Object[]{str6});
                        format2.getClass();
                        ArrayList arrayList = new ArrayList();
                        AndroidPackageManager androidPackageManager = (AndroidPackageManager) cardStudioPresenter.ioContext;
                        if (androidPackageManager.isPackageInstalled("com.twitter.android")) {
                            arrayList.add(new ShareTarget.XApp(androidStringManager.get(R.string.share_x), new ShareTarget.XApp.Content(dependentTeenQrCodeShareSheetScreen.cashtagUrl)));
                        }
                        if (androidPackageManager.isPackageInstalled("com.instagram.android")) {
                            arrayList.add(new ShareTarget.Instagram(androidStringManager.get(R.string.share_insta), new ShareTarget.Instagram.Content(Uri.parse(dependentTeenQrCodeShareSheetScreen.qrCodeImageUrl))));
                        }
                        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(androidPackageManager.context);
                        if (defaultSmsPackage != null && androidPackageManager.isPackageInstalled(defaultSmsPackage)) {
                            arrayList.add(new ShareTarget.Sms(androidStringManager.get(R.string.share_sms), new ShareTarget.Sms.Content(dependentTeenQrCodeShareSheetScreen.cashtagUrl), defaultSmsPackage));
                        }
                        String str7 = dependentTeenQrCodeShareSheetScreen.currencySymbol;
                        String str8 = dependentTeenQrCodeShareSheetScreen.cashtagUrl;
                        str7.getClass();
                        Resources resources2 = androidStringManager.resources;
                        resources2.getClass();
                        String format3 = new MessageFormat(resources2.getString(R.string.copy_cashtag_link)).format(new Object[]{str7});
                        format3.getClass();
                        arrayList.add(new ShareTarget.CopyToClipboard(format3, new ShareTarget.CopyToClipboard.Content(str8)));
                        arrayList.add(new ShareTarget.SaveToPhotos(androidStringManager.get(R.string.save_to_photos), new ShareTarget.SaveToPhotos.Content(Uri.parse(dependentTeenQrCodeShareSheetScreen.qrCodeImageUrl))));
                        arrayList.add(new ShareTarget.More(androidStringManager.get(R.string.share_more), new ShareTarget.More.Content(str8)));
                        MutableState mutableState = (MutableState) obj2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ShareTarget shareTarget = (ShareTarget) it.next();
                            arrayList2.add(new ShareSheetViewModel.SharingOption(shareTarget.getTitle(), ShareSheetViewKt.toIcon(shareTarget.getId()), false, shareTarget));
                        }
                        mutableState.setValue(new ShareSheetViewModel(format2, arrayList2));
                        return Unit.INSTANCE;
                    case 2:
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        Analytics analytics = ((FamilyPendingRequestsPresenter) this.$offlineManager).analytics;
                        PendingRequestsParams pendingRequestsParams = (PendingRequestsParams) ((MutableState) obj2).getValue();
                        pendingRequestsParams.getClass();
                        analytics.track(new SponsoredAccountManagePendingRequestViewAll(new Integer(pendingRequestsParams.pending_requests.size())), null);
                        return Unit.INSTANCE;
                    case 3:
                        CoroutineScope coroutineScope = (CoroutineScope) this.$offlineManager;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj2;
                        JobKt.launch$default(coroutineScope, null, null, new GooglePayPresenter$models$1$1(cardStudioPresenter2, null == true ? 1 : 0, 21), 3);
                        JobKt.launch$default(coroutineScope, null, null, new RealProfileManager$profileOrNull$2(cardStudioPresenter2, null == true ? 1 : 0, 9), 3);
                        return Unit.INSTANCE;
                    case 4:
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        AmountDisplayState amountDisplayState = (AmountDisplayState) this.$offlineManager;
                        AmountChooserViewModel.Content content = (AmountChooserViewModel.Content) obj2;
                        if (!amountDisplayState.getRawAmount().equals(content.rawAmount)) {
                            Function1 function1 = amountDisplayState.onEvent;
                            amountDisplayState.onEvent = null;
                            try {
                                AmountDisplayState.reset$default(amountDisplayState, content.rawAmount, 2);
                            } finally {
                                amountDisplayState.onEvent = function1;
                            }
                        }
                        return Unit.INSTANCE;
                    case 5:
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                            FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter = (FidesmoDeprovisioningPresenter) this.$offlineManager;
                            UserJourney$Name userJourney$Name = fidesmoDeprovisioningPresenter.journeyName;
                            UserJourneyTracker userJourneyTracker = fidesmoDeprovisioningPresenter.userJourneyTracker;
                            if (!fidesmoDeprovisioningPresenter.journeyStarted) {
                                UserJourneyTracker.m3788startJourneycrs4WS4$default(userJourneyTracker, userJourney$Name);
                                RealUserJourneyTracker realUserJourneyTracker = (RealUserJourneyTracker) userJourneyTracker;
                                realUserJourneyTracker.setVariant(userJourney$Name, userJourney$Variant$CashTagProvisioning$Deprovision);
                                String str9 = Build.MODEL;
                                str = str9 != null ? str9 : "";
                                Locale locale = Locale.ROOT;
                                replace = new Regex("[^a-z0-9]+").replace(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale), "-");
                                String trim = StringsKt.trim(replace, '-');
                                str2 = trim.length() != 0 ? trim : "unknown";
                                realUserJourneyTracker.addTag(userJourney$Name, new zzaag(str2) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CashTagProvisioning$PhoneModel
                                    public final String phoneModel;

                                    {
                                        super("phone-model-".concat(str2));
                                        this.phoneModel = str2;
                                    }

                                    public final boolean equals(Object obj3) {
                                        if (this == obj3) {
                                            return true;
                                        }
                                        return (obj3 instanceof UserJourney$Tag$CashTagProvisioning$PhoneModel) && Intrinsics.areEqual(this.phoneModel, ((UserJourney$Tag$CashTagProvisioning$PhoneModel) obj3).phoneModel);
                                    }

                                    public final int hashCode() {
                                        return this.phoneModel.hashCode();
                                    }

                                    public final String toString() {
                                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PhoneModel(phoneModel=", this.phoneModel, ")");
                                    }
                                });
                                if (fidesmoDeprovisioningPresenter.isRetryAttempt) {
                                    realUserJourneyTracker.addTag(userJourney$Name, userJourney$Tag$CashTagProvisioning$IsRetry);
                                }
                                fidesmoDeprovisioningPresenter.journeyStarted = true;
                                fidesmoDeprovisioningPresenter.journeyEnded = false;
                                fidesmoDeprovisioningPresenter.scanAttempts = 0;
                                return Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                            FidesmoProvisioningPresenter fidesmoProvisioningPresenter = (FidesmoProvisioningPresenter) this.$offlineManager;
                            if (!fidesmoProvisioningPresenter.journeyStarted) {
                                UserJourney$Name userJourney$Name2 = fidesmoProvisioningPresenter.journeyName;
                                UserJourneyTracker userJourneyTracker2 = fidesmoProvisioningPresenter.userJourneyTracker;
                                UserJourneyTracker.m3788startJourneycrs4WS4$default(userJourneyTracker2, userJourney$Name2);
                                if (fidesmoProvisioningPresenter.args.flowType == FidesmoFlowType.DEPROVISION) {
                                    ((RealUserJourneyTracker) userJourneyTracker2).setVariant(userJourney$Name2, userJourney$Variant$CashTagProvisioning$Deprovision);
                                }
                                String str10 = Build.MODEL;
                                str = str10 != null ? str10 : "";
                                Locale locale2 = Locale.ROOT;
                                replace2 = new Regex("[^a-z0-9]+").replace(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale2, str, locale2), "-");
                                String trim2 = StringsKt.trim(replace2, '-');
                                str2 = trim2.length() != 0 ? trim2 : "unknown";
                                RealUserJourneyTracker realUserJourneyTracker2 = (RealUserJourneyTracker) userJourneyTracker2;
                                realUserJourneyTracker2.addTag(userJourney$Name2, new zzaag(str2) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Tag$CashTagProvisioning$PhoneModel
                                    public final String phoneModel;

                                    {
                                        super("phone-model-".concat(str2));
                                        this.phoneModel = str2;
                                    }

                                    public final boolean equals(Object obj3) {
                                        if (this == obj3) {
                                            return true;
                                        }
                                        return (obj3 instanceof UserJourney$Tag$CashTagProvisioning$PhoneModel) && Intrinsics.areEqual(this.phoneModel, ((UserJourney$Tag$CashTagProvisioning$PhoneModel) obj3).phoneModel);
                                    }

                                    public final int hashCode() {
                                        return this.phoneModel.hashCode();
                                    }

                                    public final String toString() {
                                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PhoneModel(phoneModel=", this.phoneModel, ")");
                                    }
                                });
                                if (fidesmoProvisioningPresenter.isRetryAttempt) {
                                    realUserJourneyTracker2.addTag(userJourney$Name2, userJourney$Tag$CashTagProvisioning$IsRetry);
                                }
                                fidesmoProvisioningPresenter.journeyStarted = true;
                                fidesmoProvisioningPresenter.journeyEnded = false;
                                fidesmoProvisioningPresenter.scanAttempts = 0;
                                return Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    case 7:
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (((ScanningStepAnimationTrigger) this.$offlineManager) != null) {
                            MutableState mutableState2 = (MutableState) obj2;
                            List list = FidesmoProvisioningViewKt.SNAKE_PATH;
                            Integer num = (Integer) mutableState2.getValue();
                            mutableState2.setValue(new Integer((num != null ? num.intValue() : 0) + 1));
                        }
                        return Unit.INSTANCE;
                    case 8:
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (!(((FidesmoProvisioningViewModel.Scanning) this.$offlineManager) instanceof FidesmoProvisioningViewModel.Scanning.InProgress)) {
                            ((Function1) obj2).invoke(Boolean.FALSE);
                        }
                        return Unit.INSTANCE;
                    case 9:
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ParcelFileDescriptor openFileDescriptor = ((RealAndroidFileParser) this.$offlineManager).contentResolver.openFileDescriptor((Uri) obj2, "r");
                        if (openFileDescriptor != null) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor), PKIFailureInfo.certRevoked);
                            try {
                                bArr = ByteStreamsKt.readBytes(bufferedInputStream);
                                bufferedInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    Utf8.closeFinally(bufferedInputStream, th);
                                    throw th2;
                                }
                            }
                        }
                        return bArr;
                    case 10:
                        RealAndroidFileParser realAndroidFileParser = (RealAndroidFileParser) obj2;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        String str11 = (String) this.$offlineManager;
                        Uri parse = Uri.parse(str11);
                        if (parse.getScheme() == null || Intrinsics.areEqual(parse.getScheme(), "file")) {
                            String path = parse.getPath();
                            if (path == null) {
                                String lastPathSegment = parse.getLastPathSegment();
                                if (lastPathSegment != null) {
                                    str11 = lastPathSegment;
                                }
                                return new FileMetadata("application/octet-stream", str11, null, null);
                            }
                            File file = new File(path);
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt__UtilsKt.getExtension(file));
                            String str12 = mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
                            String name = file.getName();
                            name.getClass();
                            String lowerCase = FilesKt__UtilsKt.getExtension(file).toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            return new FileMetadata(str12, name, lowerCase, new Long(file.length()));
                        }
                        String type2 = realAndroidFileParser.contentResolver.getType(parse);
                        String str13 = type2 == null ? "application/octet-stream" : type2;
                        try {
                            Cursor query = realAndroidFileParser.contentResolver.query(parse, null, null, null, null, null);
                            if (query != null) {
                                try {
                                    if (query.moveToFirst()) {
                                        int columnIndex = query.getColumnIndex("_display_name");
                                        if (columnIndex < 0) {
                                            throw new Exception("Display Name Index not found");
                                        }
                                        String string2 = query.getString(columnIndex);
                                        int columnIndex2 = query.getColumnIndex("_size");
                                        Long l = !query.isNull(columnIndex2) ? new Long(query.getLong(columnIndex2)) : null;
                                        if (str13.equals("application/octet-stream") || (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str13)) == null) {
                                            str3 = null;
                                        } else {
                                            str3 = extensionFromMimeType.toUpperCase(Locale.ROOT);
                                            str3.getClass();
                                        }
                                        string2.getClass();
                                        FileMetadata fileMetadata = new FileMetadata(str13, string2, str3, l);
                                        query.close();
                                        return fileMetadata;
                                    }
                                    query.close();
                                } finally {
                                }
                            }
                        } catch (Exception e) {
                            Timber.Forest.e(Boxes$$ExternalSyntheticOutline1.m(e, "Failed to query file uri "), new Object[0]);
                        }
                        String lastPathSegment2 = parse.getLastPathSegment();
                        if (lastPathSegment2 != null) {
                            str11 = lastPathSegment2;
                        }
                        return new FileMetadata(str13, str11, null, null);
                    case 11:
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ArcadeFormAddressView arcadeFormAddressView = (ArcadeFormAddressView) this.$offlineManager;
                        arcadeFormAddressView.onEvent.invoke(new FormViewEvent.UpdateResultEvent.AddressChange(arcadeFormAddressView.formElementId, new SubmitFormRequest.ElementResult.AddressResult(((AddressState.Valid) obj2).address, ByteString.EMPTY)));
                        return Unit.INSTANCE;
                    case 12:
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        StateFlowKt.emitOrThrow(((ArcadeFormDateInputView) this.$offlineManager).isValidStream, Boolean.valueOf(((FormDateInputViewModel) obj2).status == FormDateInputViewModel.Status.VALID));
                        return Unit.INSTANCE;
                    case 13:
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        Channel channel = (Channel) this.$offlineManager;
                        int i3 = ArcadeFormDateInputView.$r8$clinit;
                        channel.mo1159trySendJP2dKIU(new FormDateInputViewEvent$TextChanged(((TextFieldValue) ((MutableState) obj2).getValue()).annotatedString.text));
                        return Unit.INSTANCE;
                    case 14:
                        CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ArcadeFormMerchantTransactionPickerView arcadeFormMerchantTransactionPickerView = (ArcadeFormMerchantTransactionPickerView) this.$offlineManager;
                        arcadeFormMerchantTransactionPickerView.onEvent.invoke(new FormViewEvent.UpdateResultEvent.MerchantTransactionOptionClick(arcadeFormMerchantTransactionPickerView.formElementId, new SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult((List) ((MutableState) obj2).getValue(), ByteString.EMPTY)));
                        return Unit.INSTANCE;
                    case 15:
                        CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ArcadeFormOptionPickerView arcadeFormOptionPickerView = (ArcadeFormOptionPickerView) obj2;
                        ((Function1) this.$offlineManager).invoke(new FormViewEvent.UpdateResultEvent.OptionClick(arcadeFormOptionPickerView.formElementId, new SubmitFormRequest.ElementResult.OptionPickerResult((String) arcadeFormOptionPickerView.selectedOptionId$delegate.getValue())));
                        return Unit.INSTANCE;
                    case 16:
                        FormPresenter formPresenter = (FormPresenter) obj2;
                        BlockersScreens.FormScreen formScreen = formPresenter.args;
                        Analytics analytics2 = formPresenter.analytics;
                        CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (((String) this.$offlineManager) != null) {
                            BlockersData blockersData = formScreen.blockersData;
                            List list2 = formScreen.elements;
                            String str14 = blockersData.blockerId;
                            ClientScenario clientScenario = blockersData.clientScenario;
                            String name2 = clientScenario != null ? clientScenario.name() : null;
                            String str15 = blockersData.flowToken;
                            List<FormBlocker.Element> list3 = list2;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                            for (FormBlocker.Element element : list3) {
                                element.getClass();
                                FormBlocker.Element.AbstractC0072Element abstractC0072Element = element.element;
                                if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SpacerElement) {
                                    str4 = "spacer_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ButtonElement) {
                                    str4 = "button_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.LocalImageElement) {
                                    str4 = "local_image_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.RemoteImageElement) {
                                    str4 = "remote_image_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MoneyElement) {
                                    str4 = "money_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TextElement) {
                                    str4 = "text_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.LegalTextElement) {
                                    str4 = "legal_text_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CustomizedCardElement) {
                                    str4 = "customized_card_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.AddressElement) {
                                    str4 = "address_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.OptionPickerElement) {
                                    str4 = "option_picker_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TextInputElement) {
                                    str4 = "text_input_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MultilineTextInputElement) {
                                    str4 = "multiline_text_input_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.DetailRowElement) {
                                    str4 = "detail_row_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CashtagElement) {
                                    str4 = "cashtag_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.DateInputElement) {
                                    str4 = "date_input_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.AvatarElement) {
                                    str4 = "avatar_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SelectableRowElement) {
                                    str4 = "selectable_row_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TimelineElement) {
                                    str4 = "timeline_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TimelineCardListElement) {
                                    str4 = "timeline_card_list_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.DividerElement) {
                                    str4 = "divider_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CallToActionElement) {
                                    str4 = "call_to_action_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CaptionedTileElement) {
                                    str4 = "captioned_tile_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.HeroElement) {
                                    str4 = "hero_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.GiftCardElement) {
                                    str4 = "gift_card_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CardElement) {
                                    str4 = "card_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MoneyInputElement) {
                                    str4 = "money_input_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.NoticeElement) {
                                    str4 = "notice_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CopyableElementGroup) {
                                    str4 = "copyable_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.EmojiPickerElement) {
                                    str4 = "emoji_picker_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.FamilyUpsellElement) {
                                    str4 = "family_upsell_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.UpsellElement) {
                                    str4 = "upsell_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MerchantTransactionElement) {
                                    str4 = "merchant_transaction_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MerchantTransactionPickerElement) {
                                    str4 = "merchant_transaction_picker_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.PaymentPlanScheduleElement) {
                                    str4 = "payment_plan_schedule_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.PaymentPlanSummaryElement) {
                                    str4 = "payment_plan_summary_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SelectableInputElement) {
                                    str4 = "selectable_input_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ProfilePreviewElement) {
                                    str4 = "profile_preview_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.LocationElement) {
                                    str4 = "location_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CheckboxElement) {
                                    str4 = "checkbox_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.VerificationCodeElement) {
                                    str4 = "verification_code_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ListUnorderedElement) {
                                    str4 = "list_unordered_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SectionHeaderElement) {
                                    str4 = "section_header_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CellDefaultElement) {
                                    str4 = "cell_default_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.FixedSpacerElement) {
                                    str4 = "fixed_spacer_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.HeroHeaderElement) {
                                    str4 = "hero_header_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ListOrderedElement) {
                                    str4 = "list_ordered_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.HeroNumericsHeaderElement) {
                                    str4 = "hero_numerics_header_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.EditorialContentElement) {
                                    str4 = "editorial_content_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.UpsellCardElement) {
                                    str4 = "upsell_card_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CashAppTagElement) {
                                    str4 = "cash_app_tag_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.InstructionCardElement) {
                                    str4 = "instruction_card_element";
                                } else if (abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SelectedInstrumentElement) {
                                    str4 = "selected_instrument_element";
                                } else {
                                    if (abstractC0072Element != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str4 = "unknown_element";
                                }
                                arrayList3.add(str4);
                            }
                            analytics2.track(new FormBlockerLaunchShow(Integer.valueOf(list2.size()), str14, name2, str15, CollectionsKt.joinToString$default(CollectionsKt.sorted(CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList3))), ",", null, null, 0, null, null, 62)), null);
                            List list4 = formScreen.elements;
                            list4.getClass();
                            Iterator it2 = list4.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    upsellElement = BlockerFlowAnalyticsHelperKt.upsellElement((FormBlocker.Element) it2.next());
                                    if (upsellElement != null) {
                                    }
                                } else {
                                    upsellElement = null;
                                }
                            }
                            if (upsellElement != null && (productDiscoveryData2 = upsellElement.product_discovery_data) != null) {
                                analytics2.track(new ProductDiscoveryContentInteractView(productDiscoveryData2.product_discovery_flow_token, productDiscoveryData2.product_major, productDiscoveryData2.product_minor, productDiscoveryData2.product_category, productDiscoveryData2.content_token, productDiscoveryData2.content_template_token), null);
                            }
                            List list5 = formScreen.elements;
                            list5.getClass();
                            Iterator it3 = list5.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    upsellElement2 = BlockerFlowAnalyticsHelperKt.upsellElement((FormBlocker.Element) it3.next());
                                    if (upsellElement2 != null) {
                                    }
                                } else {
                                    upsellElement2 = null;
                                }
                            }
                            if (upsellElement2 != null && (productDiscoveryData = upsellElement2.product_discovery_data) != null) {
                                analytics2.track(new ProductDiscoveryContentRequestRender(productDiscoveryData.product_discovery_flow_token, productDiscoveryData.product_major, productDiscoveryData.product_minor, productDiscoveryData.product_category, productDiscoveryData.content_template_token, productDiscoveryData.content_token), null);
                            }
                            List list6 = formScreen.elements;
                            AndroidClock androidClock = formPresenter.clock;
                            list6.getClass();
                            Iterator it4 = list6.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    upsellElement3 = BlockerFlowAnalyticsHelperKt.upsellElement((FormBlocker.Element) it4.next());
                                    if (upsellElement3 != null) {
                                    }
                                } else {
                                    upsellElement3 = null;
                                }
                            }
                            if (upsellElement3 != null && (onDemandMessageData = upsellElement3.on_demand_message_data) != null) {
                                String str16 = onDemandMessageData.product_type;
                                List listOf = str16 != null ? CollectionsKt__CollectionsJVMKt.listOf(str16) : null;
                                String str17 = onDemandMessageData.campaign_token;
                                Long valueOf = Long.valueOf(androidClock.millis());
                                String str18 = onDemandMessageData.placement;
                                analytics2.track(new OnDemandMessageInteractView(str17, valueOf, str18 != null ? Placement.valueOf(str18) : null, onDemandMessageData.template_token, onDemandMessageData.template_version, AppMessageFormat.CARD, listOf != null ? CollectionsKt.joinToString$default(listOf, null, null, null, 0, null, null, 63) : null), null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 17:
                        SubtreeManager subtreeManager = (SubtreeManager) obj2;
                        CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        GenericTreeElementsItem genericTreeElementsItem = (GenericTreeElementsItem) this.$offlineManager;
                        GenericAnalyticsData genericAnalyticsData = genericTreeElementsItem.viewAnalytics;
                        if (genericAnalyticsData != null) {
                            subtreeManager.track(genericAnalyticsData, genericTreeElementsItem.overrideAnalytics);
                        }
                        Action action = genericTreeElementsItem.passiveAction;
                        if (action != null && (viewEvent = zzj.toViewEvent(action)) != null) {
                            if (!(viewEvent instanceof GenericTreeElementsViewEvent.PromptOverlayEvent) && !(viewEvent instanceof GenericTreeElementsViewEvent.OpenUrlEvent)) {
                                throw new IllegalPassiveViewEventException();
                            }
                            SubtreeManager.access$process(subtreeManager, viewEvent, genericTreeElementsItem);
                        }
                        return Unit.INSTANCE;
                    case 18:
                        CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ((GlobalSearchFeedKt$$ExternalSyntheticLambda5) this.$offlineManager).invoke(new GlobalSearchViewEvent.RowSectionEvent.RowViewed((GlobalSearchViewModel.Item) obj2));
                        return Unit.INSTANCE;
                    case 19:
                        CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        Context context = ((GLSceneScope) this.$offlineManager).context;
                        String str19 = (String) obj2;
                        InputStream open = context.getAssets().open(str19.concat("_vs.glsl"));
                        open.getClass();
                        InputStream open2 = context.getAssets().open(str19.concat("_fs.glsl"));
                        open2.getClass();
                        return new PBRMaterial(open, open2);
                    case 20:
                        return invokeSuspend$com$squareup$cash$graphics$swampgl$components$ibl$IblAssetLoaderKt$loadIblAssetData$3(obj);
                    case 21:
                        TextureView textureView = (TextureView) this.$offlineManager;
                        CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        MutableFloatState mutableFloatState = (MutableFloatState) obj2;
                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                        if (parcelableSnapshotMutableFloatState.getFloatValue() < 1.0f) {
                            ViewParent parent = textureView.getParent();
                            parent.getClass();
                            FrameLayout frameLayout = (FrameLayout) parent;
                            Bitmap bitmap = textureView.getBitmap();
                            if (bitmap != null) {
                                Resources resources3 = textureView.getResources();
                                resources3.getClass();
                                frameLayout.setForeground(new BitmapDrawable(resources3, bitmap));
                            }
                            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
                            if (layoutParams == null) {
                                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                return null;
                            }
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.width = (int) (parcelableSnapshotMutableFloatState.getFloatValue() * frameLayout.getWidth());
                            layoutParams2.height = (int) (parcelableSnapshotMutableFloatState.getFloatValue() * frameLayout.getHeight());
                            layoutParams2.gravity = 17;
                            textureView.setLayoutParams(layoutParams2);
                            textureView.postDelayed(new r6$$ExternalSyntheticLambda0(i2, textureView, mutableFloatState), 100L);
                        }
                        return Unit.INSTANCE;
                    case 22:
                        Lazy lazy = (Lazy) obj2;
                        GrowToolsManagerScreen growToolsManagerScreen = (GrowToolsManagerScreen) lazy.value;
                        ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) this.$offlineManager;
                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (activityItemCallbackEvent == ActivityItemCallbackEvent.AnalyticsEvent.ItemTapped) {
                            Analytics analytics3 = (Analytics) lazy.initializer;
                            GrowToolsManagerScreen.Origin origin = growToolsManagerScreen.getOrigin();
                            GrowToolsManagerScreen.InvestmentType investmentType = growToolsManagerScreen.f1144type;
                            origin.getClass();
                            analytics3.track(new GrowToolsManageActivityItem(PlatformRandomKt.toCdfType(origin), PlatformRandomKt.toCdfType(investmentType)), null);
                        }
                        return Unit.INSTANCE;
                    case 23:
                        CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ((MutableState) obj2).setValue(Boolean.FALSE);
                        ((GrowToolsManagerState) this.$offlineManager).setInteractive(true);
                        return Unit.INSTANCE;
                    case 24:
                        CoroutineScope coroutineScope2 = (CoroutineScope) this.$offlineManager;
                        CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ActivityInviteFriendsView activityInviteFriendsView = (ActivityInviteFriendsView) obj2;
                        Instrument$Adapter instrument$Adapter = activityInviteFriendsView.factory;
                        Navigator navigator = activityInviteFriendsView.navigator;
                        instrument$Adapter.getClass();
                        navigator.getClass();
                        activityInviteFriendsView.presenter = new RealActivityInvitePresenter((AppConfigManager) instrument$Adapter.cash_instrument_typeAdapter, (Analytics) instrument$Adapter.card_brandAdapter, (FlowStarter) instrument$Adapter.balance_currencyAdapter, navigator);
                        JobKt.launch$default(coroutineScope2, null, null, new RealKeyStoreProvider$load$2(activityInviteFriendsView, null == true ? 1 : 0, i2), 3);
                        return Unit.INSTANCE;
                    case 25:
                        Boolean bool = (Boolean) this.$offlineManager;
                        CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        RealRequestReviewFlagWrapper realRequestReviewFlagWrapper = (RealRequestReviewFlagWrapper) obj2;
                        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            realRequestReviewFlagWrapper.shouldRequestReviewPrompt.set(false);
                        }
                        return Unit.INSTANCE;
                    case 26:
                        SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) this.$offlineManager;
                        CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        RealInvestmentEntities realInvestmentEntities = ((RealDependentInvestmentEntities) obj2).investmentEntities;
                        String str20 = syncInvestmentHolding.investment_entity_token;
                        str20.getClass();
                        return new Transform$special$$inlined$map$1(FlowKt.take(realInvestmentEntities.stockDetails(new InvestmentEntityToken(str20)), 1), syncInvestmentHolding, 29);
                    case 27:
                        CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                            ProfilePresenter profilePresenter = (ProfilePresenter) this.$offlineManager;
                            Analytics analytics4 = profilePresenter.analytics;
                            AppNavigateOpenSpace.Space space = AppNavigateOpenSpace.Space.INVESTING;
                            InvestingScreens.InvestingHome investingHome = (InvestingScreens.InvestingHome) profilePresenter.profileDetailsProvider;
                            analytics4.track(new AppNavigateOpenSpace(investingHome.source, investingHome.sourceTab, space, null, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE), null);
                        }
                        return Unit.INSTANCE;
                    case 28:
                        CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        ProfilePresenter profilePresenter2 = (ProfilePresenter) this.$offlineManager;
                        profilePresenter2.analytics.track(new StockSelectSelectMyFirstStock(), null);
                        ((IntentLauncher) profilePresenter2.favoritesManager).launchUrlInInternalBrowser(((InvestingHomeViewEvent.MyFirstStockClicked) ((InvestingHomeViewEvent) obj2)).url);
                        return Unit.INSTANCE;
                    default:
                        CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        Investment_entity investment_entity = (Investment_entity) obj2;
                        ((Analytics) ((LocalHomePresenter) this.$offlineManager).localHomeGeoPresenterFactory).track(new StockViewViewActivityDetails(investment_entity.symbol, MultipartBody.Part.Companion.toEquityType(investment_entity.f1153type)), null);
                        return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00611(Object obj, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.this$0 = obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$offlineManager = obj;
        }
    }
}
