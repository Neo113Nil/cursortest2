package com.squareup.cash;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import coil3.RealImageLoader;
import com.fillr.e;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.views.InlineAppMessageView$Factory$Impl;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.banking.presenters.BalanceHomePresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BankingDialogPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BenefitsLeafletPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.BetterOverdraftPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.ConfirmCashOutPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.DemandDepositDialogPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.OverdraftCoveragePresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.RecurringDepositsFirstTimeUserPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.RecurringDepositsPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.TransfersPresenter$Factory$Impl;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.bitcoin.presenters.payinusd.BitcoinPayInUsdPreference;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampOptionType;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampOptionViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewModel;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.BrowserCheckoutDismissError;
import com.squareup.cash.cdf.browser.BrowserCheckoutLoad;
import com.squareup.cash.cdf.browser.BrowserCheckoutReceiveError;
import com.squareup.cash.cdf.browser.BrowserViewOpenRestrictedItemWarning;
import com.squareup.cash.cdf.browser.CheckoutError;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.BackStackDumper$MetroFactory;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinAutoWithdrawToBitkey;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinSettingsPayInUsd;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate;
import com.squareup.cash.growtools.presenters.manager.bitcoinautowithdraw.GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationService;
import com.squareup.cash.mosaic.resources.api.v2.ResourceService;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.nearby.backend.RealNearbyAdvertiser;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.nearby.backend.RealNearbyPermissionStateProvider;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersFullscreenCollectionPresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersGreenStatusPresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersHomePresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersHomePresenterV2$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersNotificationPresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersPresenterFactory;
import com.squareup.cash.offers.presenters.OffersRedemptionPresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersTimelinePresenter$Factory$Impl;
import com.squareup.cash.offers.presenters.OffersTimelinePresenterV2$Factory$Impl;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.treehouse.accessibility.RealAccessibilityCallbackService;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.GetClockInControlsUseCase;
import com.squareup.cash.work.data.real.RealAssignedJobProvider;
import com.squareup.cash.work.data.real.RealGetClockInEssentialsUseCase;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealJobRepository;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.tinygraph.real.RealPersonRepository;
import com.squareup.cropview.Edge;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.BugReportService;
import com.squareup.protos.cash.marketprices.service.MarketPricesAppService;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClasses;
import kotlin.reflect.full.KClassifiers;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import squareup.cash.cryptocurrency.AutoBtcWithdrawThresholdSyncValue;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.cryptocurrency.WithdrawalSpeed;

/* loaded from: classes4.dex */
public final class RealBugReportSenderFactory implements BitcoinHomeWidgetPresenter, GrowToolsManagerDelegate {
    public Object backStackDumper;
    public Object bugReportService;
    public Object bugsnagClient;
    public Object cashDatabase;
    public Object endpoint;
    public Object endpointContext;
    public Object featureEligibilityDumper;
    public Object preferences;
    public Object recentMoneybotSession;
    public Object scope;
    public Object sessionManager;
    public Object tempStorage;

    public RealBugReportSenderFactory() {
        this.bugReportService = new RoundedCornerTreatment();
        this.sessionManager = new RoundedCornerTreatment();
        this.tempStorage = new RoundedCornerTreatment();
        this.preferences = new RoundedCornerTreatment();
        this.endpoint = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        this.backStackDumper = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        this.featureEligibilityDumper = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        this.cashDatabase = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        this.endpointContext = new Transition.AnonymousClass1();
        this.scope = new Transition.AnonymousClass1();
        this.bugsnagClient = new Transition.AnonymousClass1();
        this.recentMoneybotSession = new Transition.AnonymousClass1();
    }

    public ShapeAppearanceModel build() {
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        shapeAppearanceModel.topLeftCorner = (ResToolsKt) this.bugReportService;
        shapeAppearanceModel.topRightCorner = (ResToolsKt) this.sessionManager;
        shapeAppearanceModel.bottomRightCorner = (ResToolsKt) this.tempStorage;
        shapeAppearanceModel.bottomLeftCorner = (ResToolsKt) this.preferences;
        shapeAppearanceModel.topLeftCornerSize = (CornerSize) this.endpoint;
        shapeAppearanceModel.topRightCornerSize = (CornerSize) this.backStackDumper;
        shapeAppearanceModel.bottomRightCornerSize = (CornerSize) this.featureEligibilityDumper;
        shapeAppearanceModel.bottomLeftCornerSize = (CornerSize) this.cashDatabase;
        shapeAppearanceModel.topEdge = (Transition.AnonymousClass1) this.endpointContext;
        shapeAppearanceModel.rightEdge = (Transition.AnonymousClass1) this.scope;
        shapeAppearanceModel.bottomEdge = (Transition.AnonymousClass1) this.bugsnagClient;
        shapeAppearanceModel.leftEdge = (Transition.AnonymousClass1) this.recentMoneybotSession;
        return shapeAppearanceModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0333 A[LOOP:0: B:83:0x032d->B:85:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c7  */
    @Override // com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GrowToolsManagerViewModel models(Flow flow, Composer composer, int i) {
        Unit unit;
        MutableState mutableState;
        Object obj;
        MutableState mutableState2;
        Iterable iterable;
        Object obj2;
        MutableState mutableState3;
        boolean changed;
        Object rememberedValue;
        Object rememberedValue2;
        Iterator it;
        String str;
        String m;
        int ordinal;
        Pair pair;
        Long l;
        RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) this.preferences;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.sessionManager;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(678871816);
        GrowToolsManagerState rememberManagerState = KClasses.rememberManagerState(gapComposer);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj3 = Composer.Companion.Empty;
        if (rememberedValue3 == obj3) {
            rememberedValue3 = (StateFlow) this.scope;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj3) {
            rememberedValue4 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) this.bugsnagClient;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue4, BitcoinDisplayUnits.BITCOIN, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj3) {
            rememberedValue5 = (ChannelFlowTransformLatest) this.recentMoneybotSession;
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        int i2 = 4;
        Continuation continuation = null;
        if (changedInstance || rememberedValue6 == obj3) {
            rememberedValue6 = new RealKeyStoreProvider$load$2(this, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue6);
        AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue = (AutoBtcWithdrawThresholdSyncValue) collectAsState.getValue();
        long longValue = (autoBtcWithdrawThresholdSyncValue == null || (l = autoBtcWithdrawThresholdSyncValue.threshold_sats) == null) ? 0L : l.longValue();
        boolean z = longValue > 0;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj3) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState4 = (MutableState) rememberedValue7;
        boolean z2 = z && !((Boolean) mutableState4.getValue()).booleanValue();
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(z2), gapComposer);
        if (rememberManagerState.isInteractive() ? z2 : !z2) {
            BitcoinDisplayUnits bitcoinDisplayUnits = (BitcoinDisplayUnits) collectAsState2.getValue();
            AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue2 = (AutoBtcWithdrawThresholdSyncValue) collectAsState.getValue();
            Long l2 = autoBtcWithdrawThresholdSyncValue2 != null ? autoBtcWithdrawThresholdSyncValue2.keep_in_cash_app_sats : null;
            AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue3 = (AutoBtcWithdrawThresholdSyncValue) collectAsState.getValue();
            WithdrawalSpeed withdrawalSpeed = autoBtcWithdrawThresholdSyncValue3 != null ? autoBtcWithdrawThresholdSyncValue3.withdrawal_speed : null;
            Money money = (Money) collectAsState3.getValue();
            MoneyFormatter moneyFormatter = (MoneyFormatter) this.endpointContext;
            WithdrawalSpeed withdrawalSpeed2 = withdrawalSpeed;
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            long j = longValue;
            String str2 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_detail_threshold_label);
            mutableState2 = rememberUpdatedState;
            Long valueOf = Long.valueOf(j);
            unit = unit2;
            CurrencyCode currencyCode = CurrencyCode.BTC;
            String format$default = RealBitcoinFormatter.format$default(realBitcoinFormatter, bitcoinDisplayUnits, new Money(valueOf, currencyCode, 4), false, 28);
            if (money != null) {
                mutableState = mutableState4;
                Long valueOf2 = Long.valueOf(j);
                obj = obj3;
                str = Recorder$$ExternalSyntheticOutline2.m("~", moneyFormatter.format(Moneys.convertBitcoinEquivalentAmount(new Money(valueOf2, currencyCode, 4), money)));
            } else {
                mutableState = mutableState4;
                obj = obj3;
                str = null;
            }
            createListBuilder.add(new GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow("threshold", new GrowToolsManagerViewModel.Loaded.DetailRow(str2, format$default, str)));
            String str3 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_detail_reserve_label);
            String format2 = l2 != null ? realBitcoinFormatter.format(bitcoinDisplayUnits, new Money(l2, currencyCode, 4), true, false) : androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_detail_reserve_optional);
            if (l2 != null) {
                if (l2.longValue() == 0) {
                    m = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_detail_reserve_optional);
                } else if (money != null) {
                    m = Recorder$$ExternalSyntheticOutline2.m("~", moneyFormatter.format(Moneys.convertBitcoinEquivalentAmount(new Money(l2, currencyCode, 4), money)));
                }
                createListBuilder.add(new GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow("keep", new GrowToolsManagerViewModel.Loaded.DetailRow(str3, format2, m)));
                if (withdrawalSpeed2 != null && (ordinal = withdrawalSpeed2.ordinal()) != 0) {
                    if (ordinal != 1) {
                        pair = new Pair(androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_speed_rush), androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_speed_sublabel_rush));
                    } else if (ordinal == 2) {
                        pair = new Pair(androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_speed_priority), androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_speed_sublabel_priority));
                    } else {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        pair = new Pair(androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_speed_standard), androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_speed_sublabel_standard));
                    }
                    createListBuilder.add(new GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow("speed", new GrowToolsManagerViewModel.Loaded.DetailRow(androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_detail_speed_label), (String) pair.first, (String) pair.second)));
                }
                iterable = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            }
            m = null;
            createListBuilder.add(new GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow("keep", new GrowToolsManagerViewModel.Loaded.DetailRow(str3, format2, m)));
            if (withdrawalSpeed2 != null) {
                if (ordinal != 1) {
                }
                createListBuilder.add(new GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow("speed", new GrowToolsManagerViewModel.Loaded.DetailRow(androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_detail_speed_label), (String) pair.first, (String) pair.second)));
            }
            iterable = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        } else {
            unit = unit2;
            mutableState = mutableState4;
            obj = obj3;
            mutableState2 = rememberUpdatedState;
            iterable = EmptyList.INSTANCE;
        }
        Iterable iterable2 = iterable;
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(iterable2, gapComposer);
        Boolean valueOf3 = Boolean.valueOf(z);
        boolean changed2 = gapComposer.changed(rememberManagerState);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed2) {
            obj2 = obj;
        } else {
            obj2 = obj;
            if (rememberedValue8 != obj2) {
                mutableState3 = mutableState;
                Updater.LaunchedEffect(gapComposer, valueOf3, (Function2) rememberedValue8);
                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) this.cashDatabase).models(gapComposer, 0), gapComposer);
                changed = gapComposer.changed(rememberUpdatedState3);
                rememberedValue = gapComposer.rememberedValue();
                int i3 = 10;
                if (!changed || rememberedValue == obj2) {
                    rememberedValue = new ToastKt$Toast$7$1(rememberUpdatedState3, null, i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj2) {
                    rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, rememberManagerState, (CoroutineScope) rememberedValue2, mutableState3, mutableState2, rememberUpdatedState2, 20));
                final GrowToolsManagerViewModel.Loaded.Header.Target target = new GrowToolsManagerViewModel.Loaded.Header.Target(androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_name), !z2 ? androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_description_on) : androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_description_off), KClassifiers.bitcoinAvatar(), Icons.Passkey24, null);
                String str4 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_title);
                String str5 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_toggle_text);
                final String str6 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_description_not_linked);
                GrowToolsManagerViewModel.Loaded buildModel = new OriginSpecificData(str4, str5, z2, new OriginSpecificData.TargetData(target, str6) { // from class: com.squareup.cash.growtools.presenters.manager.bitcoinautowithdraw.GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget
                    public final String altDescription;
                    public final GrowToolsManagerViewModel.Loaded.Header.Target target;

                    {
                        str6.getClass();
                        this.target = target;
                        this.altDescription = str6;
                    }

                    public final boolean equals(Object obj4) {
                        if (this == obj4) {
                            return true;
                        }
                        if (!(obj4 instanceof GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget)) {
                            return false;
                        }
                        GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget growToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget = (GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget) obj4;
                        return this.target.equals(growToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget.target) && Intrinsics.areEqual(this.altDescription, growToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget.altDescription);
                    }

                    @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
                    public final String getAltDescription() {
                        return this.altDescription;
                    }

                    @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
                    public final GrowToolsManagerViewModel.Loaded.Header.Target getTarget() {
                        return this.target;
                    }

                    public final int hashCode() {
                        return this.altDescription.hashCode() + (this.target.hashCode() * 31);
                    }

                    public final String toString() {
                        return "BitcoinAutoWithdrawTarget(target=" + this.target + ", altDescription=" + this.altDescription + ")";
                    }
                }, androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_toggle_off_dialog_message), androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_toggle_off_dialog_confirm_button)).buildModel(rememberManagerState, (UiCallbackModel) rememberUpdatedState3.getValue(), androidStringManager);
                Iterable iterable3 = iterable2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable3, 10));
                it = iterable3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GrowToolsBitcoinAutoWithdrawManager$FieldDetailRow) it.next()).row);
                }
                GrowToolsManagerViewModel.Loaded.Header header = buildModel.header;
                UiCallbackModel uiCallbackModel = buildModel.activityEmbeddedViewModel;
                GrowToolsManagerViewModel.Loaded.Dialog dialog = buildModel.dialog;
                header.getClass();
                uiCallbackModel.getClass();
                GrowToolsManagerViewModel.Loaded loaded = new GrowToolsManagerViewModel.Loaded(header, null, uiCallbackModel, dialog, arrayList);
                gapComposer.end(false);
                return loaded;
            }
        }
        mutableState3 = mutableState;
        rememberedValue8 = new CheckStatusPresenter.AnonymousClass1.C00611(rememberManagerState, mutableState3, continuation, 23);
        gapComposer.updateRememberedValue(rememberedValue8);
        Updater.LaunchedEffect(gapComposer, valueOf3, (Function2) rememberedValue8);
        MutableState rememberUpdatedState32 = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) this.cashDatabase).models(gapComposer, 0), gapComposer);
        changed = gapComposer.changed(rememberUpdatedState32);
        rememberedValue = gapComposer.rememberedValue();
        int i32 = 10;
        if (!changed) {
        }
        rememberedValue = new ToastKt$Toast$7$1(rememberUpdatedState32, null, i32);
        gapComposer.updateRememberedValue(rememberedValue);
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
        }
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, rememberManagerState, (CoroutineScope) rememberedValue2, mutableState3, mutableState2, rememberUpdatedState2, 20));
        final GrowToolsManagerViewModel.Loaded.Header.Target target2 = new GrowToolsManagerViewModel.Loaded.Header.Target(androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_name), !z2 ? androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_description_on) : androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_description_off), KClassifiers.bitcoinAvatar(), Icons.Passkey24, null);
        String str42 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_title);
        String str52 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_toggle_text);
        final String str62 = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_target_description_not_linked);
        GrowToolsManagerViewModel.Loaded buildModel2 = new OriginSpecificData(str42, str52, z2, new OriginSpecificData.TargetData(target2, str62) { // from class: com.squareup.cash.growtools.presenters.manager.bitcoinautowithdraw.GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget
            public final String altDescription;
            public final GrowToolsManagerViewModel.Loaded.Header.Target target;

            {
                str62.getClass();
                this.target = target2;
                this.altDescription = str62;
            }

            public final boolean equals(Object obj4) {
                if (this == obj4) {
                    return true;
                }
                if (!(obj4 instanceof GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget)) {
                    return false;
                }
                GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget growToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget = (GrowToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget) obj4;
                return this.target.equals(growToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget.target) && Intrinsics.areEqual(this.altDescription, growToolsBitcoinAutoWithdrawManager$BitcoinAutoWithdrawTarget.altDescription);
            }

            @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
            public final String getAltDescription() {
                return this.altDescription;
            }

            @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
            public final GrowToolsManagerViewModel.Loaded.Header.Target getTarget() {
                return this.target;
            }

            public final int hashCode() {
                return this.altDescription.hashCode() + (this.target.hashCode() * 31);
            }

            public final String toString() {
                return "BitcoinAutoWithdrawTarget(target=" + this.target + ", altDescription=" + this.altDescription + ")";
            }
        }, androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_toggle_off_dialog_message), androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_toggle_off_dialog_confirm_button)).buildModel(rememberManagerState, (UiCallbackModel) rememberUpdatedState32.getValue(), androidStringManager);
        Iterable iterable32 = iterable2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable32, 10));
        it = iterable32.iterator();
        while (it.hasNext()) {
        }
        GrowToolsManagerViewModel.Loaded.Header header2 = buildModel2.header;
        UiCallbackModel uiCallbackModel2 = buildModel2.activityEmbeddedViewModel;
        GrowToolsManagerViewModel.Loaded.Dialog dialog2 = buildModel2.dialog;
        header2.getClass();
        uiCallbackModel2.getClass();
        GrowToolsManagerViewModel.Loaded loaded2 = new GrowToolsManagerViewModel.Loaded(header2, null, uiCallbackModel2, dialog2, arrayList2);
        gapComposer.end(false);
        return loaded2;
    }

    public void setAllCornerSizes(float f) {
        this.endpoint = new AbsoluteCornerSize(f);
        this.backStackDumper = new AbsoluteCornerSize(f);
        this.featureEligibilityDumper = new AbsoluteCornerSize(f);
        this.cashDatabase = new AbsoluteCornerSize(f);
    }

    public BrowserCheckoutDismissError trackBrowserCheckoutDismissError(CheckoutError checkoutError) {
        return new BrowserCheckoutDismissError(checkoutError, (InfoContext) this.featureEligibilityDumper, (BrowserOrigin) this.sessionManager, (String) this.tempStorage, (String) this.cashDatabase, (String) this.recentMoneybotSession, (String) this.preferences, (String) this.backStackDumper);
    }

    public BrowserCheckoutReceiveError trackBrowserCheckoutError(CheckoutError checkoutError) {
        return new BrowserCheckoutReceiveError(checkoutError, (InfoContext) this.featureEligibilityDumper, (BrowserOrigin) this.sessionManager, (String) this.tempStorage, (String) this.cashDatabase, (String) this.recentMoneybotSession, (String) this.preferences, (String) this.backStackDumper, null, null, 768);
    }

    public BrowserCheckoutLoad trackBrowserCheckoutLoad() {
        return new BrowserCheckoutLoad((InfoContext) this.featureEligibilityDumper, (BrowserOrigin) this.sessionManager, (String) this.tempStorage, (String) this.cashDatabase, (String) this.recentMoneybotSession, (String) this.preferences, (String) this.backStackDumper);
    }

    public BrowserViewOpenRestrictedItemWarning trackBrowserViewOpenRestrictedItemWarning(String str) {
        String str2 = (String) this.tempStorage;
        return new BrowserViewOpenRestrictedItemWarning((BrowserOrigin) this.sessionManager, (InfoContext) this.featureEligibilityDumper, str, str2, (String) this.cashDatabase, (String) this.backStackDumper);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider bugReportService;
        public final Provider bugsnagClient;
        public final Provider cashDatabase;
        public final Provider endpoint;
        public final Provider endpointContext;
        public final Provider featureEligibilityDumper;
        public final Provider preferences;
        public final Provider recentMoneybotSession;
        public final Provider scope;
        public final Provider sessionManager;
        public final Provider tempStorage;

        public /* synthetic */ MetroFactory(Provider provider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Factory factory, Object obj, Object obj2, InstanceFactory instanceFactory, Provider provider2, Provider provider3, DoubleCheck doubleCheck3, Provider provider4, int i) {
            this.$r8$classId = i;
            this.bugReportService = provider;
            this.tempStorage = doubleCheck;
            this.preferences = doubleCheck2;
            this.cashDatabase = factory;
            this.endpointContext = (Provider) obj;
            this.recentMoneybotSession = (Provider) obj2;
            this.scope = instanceFactory;
            this.sessionManager = provider2;
            this.endpoint = provider3;
            this.bugsnagClient = doubleCheck3;
            this.featureEligibilityDumper = provider4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.endpoint;
            Provider provider2 = this.endpointContext;
            Provider provider3 = this.scope;
            Provider provider4 = this.featureEligibilityDumper;
            Provider provider5 = this.bugsnagClient;
            Provider provider6 = this.sessionManager;
            Provider provider7 = this.recentMoneybotSession;
            Provider provider8 = this.cashDatabase;
            Provider provider9 = this.preferences;
            Provider provider10 = this.bugReportService;
            Provider provider11 = this.tempStorage;
            switch (i) {
                case 0:
                    BugReportService bugReportService = (BugReportService) ((DoubleCheck) provider10).getValue();
                    SessionManager sessionManager = (SessionManager) ((LambdaProvider) provider6).lambda.invoke();
                    TemporaryStorage temporaryStorage = (TemporaryStorage) ((DoubleCheck) provider11).getValue();
                    SharedPreferences sharedPreferences = (SharedPreferences) ((DoubleCheck) provider9).getValue();
                    String str = (String) ((LambdaProvider) provider).lambda.invoke();
                    e eVar = (e) BackStackDumper$MetroFactory.INSTANCE.invoke();
                    BinaryBitmap binaryBitmap = (BinaryBitmap) ((AndroidFileSaver.MetroFactory) provider4).invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((DoubleCheck) provider8).getValue();
                    Context context = (Context) ((DoubleCheck) provider2).getValue();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider3).value;
                    BugsnagClient bugsnagClient = (BugsnagClient) ((LambdaProvider) provider5).lambda.invoke();
                    KeyValue keyValue = (KeyValue) ((DoubleCheck) provider7).getValue();
                    bugReportService.getClass();
                    sessionManager.getClass();
                    temporaryStorage.getClass();
                    sharedPreferences.getClass();
                    str.getClass();
                    cashAccountDatabaseImpl.getClass();
                    context.getClass();
                    coroutineScope.getClass();
                    bugsnagClient.getClass();
                    keyValue.getClass();
                    return new RealBugReportSenderFactory(bugReportService, sessionManager, temporaryStorage, sharedPreferences, str, eVar, binaryBitmap, cashAccountDatabaseImpl, context, coroutineScope, bugsnagClient, keyValue);
                case 1:
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider10.invoke();
                    RealSharedReactionState realSharedReactionState = (RealSharedReactionState) provider11.invoke();
                    RealImageLoader realImageLoader = (RealImageLoader) provider9.invoke();
                    Instrument$Adapter instrument$Adapter = (Instrument$Adapter) ((RealKeyStoreProvider.MetroFactory) provider8).invoke();
                    TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = (TabToolbarPresenter$Factory$Impl) provider2.invoke();
                    InlineAppMessagePresenterHelper$Factory$Impl inlineAppMessagePresenterHelper$Factory$Impl = (InlineAppMessagePresenterHelper$Factory$Impl) provider7.invoke();
                    InlineAppMessageView$Factory$Impl inlineAppMessageView$Factory$Impl = (InlineAppMessageView$Factory$Impl) ((InstanceFactory) provider3).value;
                    Flow flow = (Flow) provider6.invoke();
                    RealAccessibilityCallbackService realAccessibilityCallbackService = (RealAccessibilityCallbackService) provider5.invoke();
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) ((InstanceFactory) provider4).value;
                    realCashVibrator.getClass();
                    realSharedReactionState.getClass();
                    realImageLoader.getClass();
                    tabToolbarPresenter$Factory$Impl.getClass();
                    inlineAppMessagePresenterHelper$Factory$Impl.getClass();
                    inlineAppMessageView$Factory$Impl.getClass();
                    flow.getClass();
                    Provider provider12 = this.endpoint;
                    provider12.getClass();
                    realAccessibilityCallbackService.getClass();
                    lifecycleOwner.getClass();
                    return new Profile.Adapter(realCashVibrator, realSharedReactionState, realImageLoader, instrument$Adapter, tabToolbarPresenter$Factory$Impl, inlineAppMessagePresenterHelper$Factory$Impl, inlineAppMessageView$Factory$Impl, flow, provider12, realAccessibilityCallbackService, lifecycleOwner);
                case 2:
                    ConfirmCashOutPresenter$Factory$Impl confirmCashOutPresenter$Factory$Impl = (ConfirmCashOutPresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    RecurringDepositsPresenter$Factory$Impl recurringDepositsPresenter$Factory$Impl = (RecurringDepositsPresenter$Factory$Impl) ((InstanceFactory) provider11).value;
                    RecurringDepositsFirstTimeUserPresenter$Factory$Impl recurringDepositsFirstTimeUserPresenter$Factory$Impl = (RecurringDepositsFirstTimeUserPresenter$Factory$Impl) ((InstanceFactory) provider9).value;
                    DemandDepositDialogPresenter$Factory$Impl demandDepositDialogPresenter$Factory$Impl = (DemandDepositDialogPresenter$Factory$Impl) ((InstanceFactory) provider8).value;
                    BankingDialogPresenter$Factory$Impl bankingDialogPresenter$Factory$Impl = (BankingDialogPresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    TransfersPresenter$Factory$Impl transfersPresenter$Factory$Impl = (TransfersPresenter$Factory$Impl) ((InstanceFactory) provider7).value;
                    BalanceHomePresenter$Factory$Impl balanceHomePresenter$Factory$Impl = (BalanceHomePresenter$Factory$Impl) ((InstanceFactory) provider6).value;
                    OverdraftCoveragePresenter$Factory$Impl overdraftCoveragePresenter$Factory$Impl = (OverdraftCoveragePresenter$Factory$Impl) ((InstanceFactory) provider).value;
                    BetterOverdraftPresenter$Factory$Impl betterOverdraftPresenter$Factory$Impl = (BetterOverdraftPresenter$Factory$Impl) ((InstanceFactory) provider5).value;
                    BenefitsLeafletPresenter$Factory$Impl benefitsLeafletPresenter$Factory$Impl = (BenefitsLeafletPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) provider10).getValue();
                    confirmCashOutPresenter$Factory$Impl.getClass();
                    recurringDepositsPresenter$Factory$Impl.getClass();
                    recurringDepositsFirstTimeUserPresenter$Factory$Impl.getClass();
                    demandDepositDialogPresenter$Factory$Impl.getClass();
                    bankingDialogPresenter$Factory$Impl.getClass();
                    transfersPresenter$Factory$Impl.getClass();
                    balanceHomePresenter$Factory$Impl.getClass();
                    overdraftCoveragePresenter$Factory$Impl.getClass();
                    betterOverdraftPresenter$Factory$Impl.getClass();
                    benefitsLeafletPresenter$Factory$Impl.getClass();
                    featureFlagManager.getClass();
                    return new OffersPresenterFactory(confirmCashOutPresenter$Factory$Impl, recurringDepositsPresenter$Factory$Impl, recurringDepositsFirstTimeUserPresenter$Factory$Impl, demandDepositDialogPresenter$Factory$Impl, bankingDialogPresenter$Factory$Impl, transfersPresenter$Factory$Impl, balanceHomePresenter$Factory$Impl, overdraftCoveragePresenter$Factory$Impl, betterOverdraftPresenter$Factory$Impl, benefitsLeafletPresenter$Factory$Impl, featureFlagManager);
                case 3:
                    AppService appService = (AppService) provider10.invoke();
                    MarketPricesAppService marketPricesAppService = (MarketPricesAppService) provider11.invoke();
                    PortfoliosService portfoliosService = (PortfoliosService) provider9.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider8.invoke();
                    PersistentHistoricalDataCache persistentHistoricalDataCache = (PersistentHistoricalDataCache) ((RealTrifleService.MetroFactory) provider2).invoke();
                    AndroidClock androidClock = (AndroidClock) provider7.invoke();
                    RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer = (RealInvestmentPerformanceSyncer) provider6.invoke();
                    RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) provider.invoke();
                    Signal signal = (Signal) provider5.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider4.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    appService.getClass();
                    marketPricesAppService.getClass();
                    portfoliosService.getClass();
                    realProfileManager.getClass();
                    persistentHistoricalDataCache.getClass();
                    androidClock.getClass();
                    realInvestmentPerformanceSyncer.getClass();
                    realInvestmentEntities.getClass();
                    signal.getClass();
                    coroutineContext.getClass();
                    coroutineScope2.getClass();
                    return new RealInvestingHistoricalData(appService, marketPricesAppService, portfoliosService, realProfileManager, persistentHistoricalDataCache, androidClock, realInvestmentPerformanceSyncer, realInvestmentEntities, signal, coroutineContext, coroutineScope2);
                case 4:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider10.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider11.invoke();
                    RealNearbyAdvertiser realNearbyAdvertiser = (RealNearbyAdvertiser) provider9.invoke();
                    Edge.Companion companion = (Edge.Companion) ((MusicViewFactory$MetroFactory) provider8).invoke();
                    RealNearbyPermissionStateProvider realNearbyPermissionStateProvider = (RealNearbyPermissionStateProvider) provider2.invoke();
                    AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) provider7.invoke();
                    Activity activity = (Activity) ((InstanceFactory) provider3).value;
                    AndroidClock androidClock2 = (AndroidClock) provider6.invoke();
                    KeyValue keyValue2 = (KeyValue) provider.invoke();
                    KeyValue keyValue3 = (KeyValue) provider5.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) provider4.invoke();
                    featureFlagManager2.getClass();
                    realFeatureEligibilityRepository.getClass();
                    realNearbyAdvertiser.getClass();
                    realNearbyPermissionStateProvider.getClass();
                    androidPermissionManager.getClass();
                    activity.getClass();
                    androidClock2.getClass();
                    keyValue2.getClass();
                    keyValue3.getClass();
                    appForegroundStateProvider.getClass();
                    return new RealNearbyManager(featureFlagManager2, realFeatureEligibilityRepository, realNearbyAdvertiser, companion, realNearbyPermissionStateProvider, androidPermissionManager, activity, androidClock2, keyValue2, keyValue3, appForegroundStateProvider);
                case 5:
                    OffersHomePresenterV2$Factory$Impl offersHomePresenterV2$Factory$Impl = (OffersHomePresenterV2$Factory$Impl) ((InstanceFactory) provider3).value;
                    OffersHomePresenter$Factory$Impl offersHomePresenter$Factory$Impl = (OffersHomePresenter$Factory$Impl) ((InstanceFactory) provider10).value;
                    OffersFilterGroupSheetPresenter$Factory$Impl offersFilterGroupSheetPresenter$Factory$Impl = (OffersFilterGroupSheetPresenter$Factory$Impl) ((InstanceFactory) provider11).value;
                    OffersFullscreenCollectionPresenter$Factory$Impl offersFullscreenCollectionPresenter$Factory$Impl = (OffersFullscreenCollectionPresenter$Factory$Impl) ((InstanceFactory) provider9).value;
                    OffersDetailsPresenter$Factory$Impl offersDetailsPresenter$Factory$Impl = (OffersDetailsPresenter$Factory$Impl) ((InstanceFactory) provider8).value;
                    OffersDetailsPresenterV2$Factory$Impl offersDetailsPresenterV2$Factory$Impl = (OffersDetailsPresenterV2$Factory$Impl) ((InstanceFactory) provider2).value;
                    OffersTimelinePresenter$Factory$Impl offersTimelinePresenter$Factory$Impl = (OffersTimelinePresenter$Factory$Impl) ((InstanceFactory) provider7).value;
                    OffersTimelinePresenterV2$Factory$Impl offersTimelinePresenterV2$Factory$Impl = (OffersTimelinePresenterV2$Factory$Impl) ((InstanceFactory) provider6).value;
                    OffersRedemptionPresenter$Factory$Impl offersRedemptionPresenter$Factory$Impl = (OffersRedemptionPresenter$Factory$Impl) ((InstanceFactory) provider).value;
                    OffersNotificationPresenter$Factory$Impl offersNotificationPresenter$Factory$Impl = (OffersNotificationPresenter$Factory$Impl) ((InstanceFactory) provider5).value;
                    OffersGreenStatusPresenter$Factory$Impl offersGreenStatusPresenter$Factory$Impl = (OffersGreenStatusPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    offersHomePresenterV2$Factory$Impl.getClass();
                    offersHomePresenter$Factory$Impl.getClass();
                    offersFilterGroupSheetPresenter$Factory$Impl.getClass();
                    offersFullscreenCollectionPresenter$Factory$Impl.getClass();
                    offersDetailsPresenter$Factory$Impl.getClass();
                    offersDetailsPresenterV2$Factory$Impl.getClass();
                    offersTimelinePresenter$Factory$Impl.getClass();
                    offersTimelinePresenterV2$Factory$Impl.getClass();
                    offersRedemptionPresenter$Factory$Impl.getClass();
                    offersNotificationPresenter$Factory$Impl.getClass();
                    offersGreenStatusPresenter$Factory$Impl.getClass();
                    return new OffersPresenterFactory(offersHomePresenterV2$Factory$Impl, offersHomePresenter$Factory$Impl, offersFilterGroupSheetPresenter$Factory$Impl, offersFullscreenCollectionPresenter$Factory$Impl, offersDetailsPresenter$Factory$Impl, offersDetailsPresenterV2$Factory$Impl, offersTimelinePresenter$Factory$Impl, offersTimelinePresenterV2$Factory$Impl, offersRedemptionPresenter$Factory$Impl, offersNotificationPresenter$Factory$Impl, offersGreenStatusPresenter$Factory$Impl);
                case 6:
                    PersonalizationService personalizationService = (PersonalizationService) provider10.invoke();
                    ResourceService resourceService = (ResourceService) provider11.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider9.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider8.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider7.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider6.invoke();
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    Context context2 = (Context) provider5.invoke();
                    KeyValue keyValue4 = (KeyValue) provider4.invoke();
                    Moshi moshi = (Moshi) provider3.invoke();
                    personalizationService.getClass();
                    resourceService.getClass();
                    coroutineContext2.getClass();
                    coroutineContext3.getClass();
                    Provider provider13 = this.endpointContext;
                    provider13.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    featureFlagManager3.getClass();
                    realImageLoader2.getClass();
                    context2.getClass();
                    keyValue4.getClass();
                    moshi.getClass();
                    return new RealPersonalizationRepository(personalizationService, resourceService, coroutineContext2, coroutineContext3, provider13, cashAccountDatabaseImpl2, featureFlagManager3, realImageLoader2, context2, keyValue4, moshi);
                default:
                    RealJobRepository realJobRepository = (RealJobRepository) provider11.invoke();
                    RealPersonRepository realPersonRepository = (RealPersonRepository) ((DoubleCheck) provider10).getValue();
                    RealClockInRepository realClockInRepository = (RealClockInRepository) provider9.invoke();
                    RealLocationRepository realLocationRepository = (RealLocationRepository) provider8.invoke();
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) provider2.invoke();
                    RealAssignedJobProvider realAssignedJobProvider = (RealAssignedJobProvider) provider7.invoke();
                    RealCurrentUserProvider realCurrentUserProvider = (RealCurrentUserProvider) provider6.invoke();
                    RealTeamMemberIdProvider realTeamMemberIdProvider = (RealTeamMemberIdProvider) provider.invoke();
                    RealLastClockedInInfoUseCase realLastClockedInInfoUseCase = (RealLastClockedInInfoUseCase) provider5.invoke();
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider4.invoke();
                    GetClockInControlsUseCase getClockInControlsUseCase = (GetClockInControlsUseCase) ((RealSessionFlags.MetroFactory) provider3).invoke();
                    realJobRepository.getClass();
                    realPersonRepository.getClass();
                    realClockInRepository.getClass();
                    realLocationRepository.getClass();
                    realMerchantRepository.getClass();
                    realAssignedJobProvider.getClass();
                    realCurrentUserProvider.getClass();
                    realTeamMemberIdProvider.getClass();
                    realLastClockedInInfoUseCase.getClass();
                    realSelectedMerchantProvider.getClass();
                    return new RealGetClockInEssentialsUseCase(realJobRepository, realPersonRepository, realClockInRepository, realLocationRepository, realMerchantRepository, realAssignedJobProvider, realCurrentUserProvider, realTeamMemberIdProvider, realLastClockedInInfoUseCase, realSelectedMerchantProvider, getClockInControlsUseCase);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, AndroidFileSaver.MetroFactory metroFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck6) {
            this.$r8$classId = 0;
            this.bugReportService = doubleCheck;
            this.sessionManager = lambdaProvider;
            this.tempStorage = doubleCheck2;
            this.preferences = doubleCheck3;
            this.endpoint = lambdaProvider2;
            this.featureEligibilityDumper = metroFactory;
            this.cashDatabase = doubleCheck4;
            this.endpointContext = doubleCheck5;
            this.scope = instanceFactory;
            this.bugsnagClient = lambdaProvider3;
            this.recentMoneybotSession = doubleCheck6;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Provider provider, Provider provider2, Factory factory, Provider provider3, Provider provider4, Provider provider5, DoubleCheck doubleCheck3, Provider provider6, Provider provider7, int i) {
            this.$r8$classId = i;
            this.bugReportService = doubleCheck;
            this.tempStorage = doubleCheck2;
            this.preferences = provider;
            this.cashDatabase = provider2;
            this.endpointContext = factory;
            this.recentMoneybotSession = provider3;
            this.sessionManager = provider4;
            this.endpoint = provider5;
            this.bugsnagClient = doubleCheck3;
            this.featureEligibilityDumper = provider6;
            this.scope = provider7;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck6, ShiftsAnalytics.MetroFactory metroFactory, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, DoubleCheck doubleCheck7, RealSessionFlags.MetroFactory metroFactory2) {
            this.$r8$classId = 7;
            this.tempStorage = doubleCheck;
            this.bugReportService = doubleCheck2;
            this.preferences = doubleCheck3;
            this.cashDatabase = doubleCheck4;
            this.endpointContext = doubleCheck5;
            this.recentMoneybotSession = walletUiFactory$MetroFactory;
            this.sessionManager = doubleCheck6;
            this.endpoint = metroFactory;
            this.bugsnagClient = realDrawerOpener$MetroFactory;
            this.featureEligibilityDumper = doubleCheck7;
            this.scope = metroFactory2;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, DoubleCheck doubleCheck) {
            this.$r8$classId = 2;
            this.scope = instanceFactory;
            this.tempStorage = instanceFactory2;
            this.preferences = instanceFactory3;
            this.cashDatabase = instanceFactory4;
            this.endpointContext = instanceFactory5;
            this.recentMoneybotSession = instanceFactory6;
            this.sessionManager = instanceFactory7;
            this.endpoint = instanceFactory8;
            this.bugsnagClient = instanceFactory9;
            this.featureEligibilityDumper = instanceFactory10;
            this.bugReportService = doubleCheck;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11) {
            this.$r8$classId = 5;
            this.scope = instanceFactory;
            this.bugReportService = instanceFactory2;
            this.tempStorage = instanceFactory3;
            this.preferences = instanceFactory4;
            this.cashDatabase = instanceFactory5;
            this.endpointContext = instanceFactory6;
            this.recentMoneybotSession = instanceFactory7;
            this.sessionManager = instanceFactory8;
            this.endpoint = instanceFactory9;
            this.bugsnagClient = instanceFactory10;
            this.featureEligibilityDumper = instanceFactory11;
        }
    }

    public RealBugReportSenderFactory(CryptoFlowStarter cryptoFlowStarter, AndroidStringManager androidStringManager, CryptoIdvStatusRepo cryptoIdvStatusRepo, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo, FeatureFlagManager featureFlagManager, RealBitcoinPayInUsdPreferenceManager realBitcoinPayInUsdPreferenceManager, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager, RealBitcoinFormatter realBitcoinFormatter, RealBitcoinProfileRepo realBitcoinProfileRepo, SyncValueReader syncValueReader) {
        this.bugReportService = cryptoFlowStarter;
        this.sessionManager = androidStringManager;
        this.tempStorage = cryptoIdvStatusRepo;
        this.preferences = realBitcoinSponsoredStateRepo;
        this.endpoint = featureFlagManager;
        this.backStackDumper = realBitcoinPayInUsdPreferenceManager;
        this.featureEligibilityDumper = realBitcoinInboundNavigator$Factory$Impl;
        this.cashDatabase = realBitcoinMapEligibilityManager;
        this.endpointContext = realBitcoinFormatter;
        this.scope = syncValueReader;
        this.bugsnagClient = syncValueReader.getSingleValue(AndroidSyncValueSpecs.AutoBtcWithdrawThreshold);
        this.recentMoneybotSession = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
    }

    public /* synthetic */ RealBugReportSenderFactory(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        this.bugReportService = obj;
        this.sessionManager = obj2;
        this.tempStorage = obj3;
        this.preferences = obj4;
        this.endpoint = obj5;
        this.backStackDumper = obj6;
        this.featureEligibilityDumper = obj7;
        this.cashDatabase = obj8;
        this.endpointContext = obj9;
        this.scope = obj10;
        this.bugsnagClient = obj11;
        this.recentMoneybotSession = obj12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020b  */
    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        BitcoinOnRampWidgetViewModel bitcoinOnRampWidgetViewModel;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) this.endpoint;
        RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager = (RealBitcoinMapEligibilityManager) this.cashDatabase;
        gapComposer.startReplaceGroup(-1510444290);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealBitcoinSponsoredStateRepo) this.preferences).sponsorshipStateProvider.isSponsored();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Boolean bool = Boolean.FALSE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, bool, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CardModelView$iconTexture$$inlined$map$1(flow, 3);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Flow flow2 = (Flow) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = ((RealBitcoinPayInUsdPreferenceManager) this.backStackDumper).preference();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        BitcoinPayInUsdPreference.Disabled disabled = BitcoinPayInUsdPreference.Disabled.INSTANCE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, disabled, null, gapComposer, 0, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = ((CryptoIdvStatusRepo) this.tempStorage).idvStatus();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, CryptoIdvStatus.NOT_VERIFIED, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = realBitcoinMapEligibilityManager.isEligible();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, bool, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = realBitcoinMapEligibilityManager.isLightningWithdrawEligible();
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue6, bool, null, gapComposer, 48, 2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = (StateFlow) this.bugsnagClient;
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState6 = Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer, 1);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) this.recentMoneybotSession;
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue8, BitcoinDisplayUnits.BITCOIN, null, gapComposer, 48, 2);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinSettingsPayInUsd.INSTANCE)).enabled());
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        boolean booleanValue = ((Boolean) rememberedValue9).booleanValue();
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinAutoWithdrawToBitkey.INSTANCE)).enabled());
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        boolean booleanValue2 = ((Boolean) rememberedValue10).booleanValue();
        Updater.LaunchedEffect(gapComposer, flow2, new AndroidSecureStore$read$2(flow2, (Continuation) null, this, screenNavigator, collectAsState3, 13));
        boolean booleanValue3 = ((Boolean) collectAsState.getValue()).booleanValue();
        boolean booleanValue4 = ((Boolean) collectAsState.getValue()).booleanValue();
        CryptoIdvStatus cryptoIdvStatus = (CryptoIdvStatus) collectAsState3.getValue();
        BitcoinPayInUsdPreference bitcoinPayInUsdPreference = (BitcoinPayInUsdPreference) collectAsState2.getValue();
        boolean booleanValue5 = ((Boolean) collectAsState4.getValue()).booleanValue();
        boolean booleanValue6 = ((Boolean) collectAsState5.getValue()).booleanValue();
        AutoBtcWithdrawThresholdSyncValue autoBtcWithdrawThresholdSyncValue = (AutoBtcWithdrawThresholdSyncValue) collectAsState6.getValue();
        Long l = autoBtcWithdrawThresholdSyncValue != null ? autoBtcWithdrawThresholdSyncValue.threshold_sats : null;
        BitcoinDisplayUnits bitcoinDisplayUnits = (BitcoinDisplayUnits) collectAsState7.getValue();
        cryptoIdvStatus.getClass();
        bitcoinPayInUsdPreference.getClass();
        bitcoinDisplayUnits.getClass();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.sessionManager;
        if (l == null) {
            str2 = androidStringManager.get(R.string.bitcoin_onramp_auto_withdraw_subtitle);
        } else {
            if (l.longValue() != 0) {
                bitcoinOnRampWidgetViewModel = null;
                z = booleanValue3;
                String format2 = ((RealBitcoinFormatter) this.endpointContext).format(bitcoinDisplayUnits, new Money(l, CurrencyCode.BTC, 4), true, false);
                format2.getClass();
                Object[] objArr = {format2};
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.bitcoin_onramp_auto_withdraw_subtitle_active)).format(objArr);
                format3.getClass();
                str = format3;
                BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel = new BitcoinOnRampOptionViewModel(Icons.Passkey24, androidStringManager.get(R.string.bitcoin_onramp_auto_withdraw_title), str, BitcoinOnRampOptionType.AUTO_WITHDRAW, null);
                if (booleanValue2 || booleanValue4) {
                    bitcoinOnRampOptionViewModel = bitcoinOnRampWidgetViewModel;
                }
                if (!booleanValue6) {
                    str3 = androidStringManager.get(R.string.bitcoin_onramp_pay_with_bitcoin_title);
                } else {
                    str3 = androidStringManager.get(R.string.bitcoin_onramp_bitcoin_map_title);
                }
                BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel2 = !booleanValue5 ? new BitcoinOnRampOptionViewModel(Icons.Location24, str3, androidStringManager.get(R.string.bitcoin_onramp_pay_with_bitcoin_subtitle), BitcoinOnRampOptionType.PAY_WITH_BITCOIN, null) : bitcoinOnRampWidgetViewModel;
                BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel3 = z ? new BitcoinOnRampOptionViewModel(Icons.Wallet24, androidStringManager.get(R.string.deposit_bitcoin), androidStringManager.get(R.string.get_your_bitcoin_address), BitcoinOnRampOptionType.WALLET_ADDRESS, null) : bitcoinOnRampWidgetViewModel;
                Icons icons = Icons.CurrencyUsd24;
                String str5 = androidStringManager.get(R.string.bitcoin_on_ramp_pay_in_usd_title);
                String str6 = androidStringManager.get(R.string.bitcoin_on_ramp_pay_in_usd_subtitle);
                BitcoinOnRampOptionType bitcoinOnRampOptionType = BitcoinOnRampOptionType.PAY_IN_USD;
                if (!bitcoinPayInUsdPreference.equals(disabled)) {
                    str4 = androidStringManager.get(R.string.bitcoin_on_ramp_pay_in_usd_off);
                } else if (bitcoinPayInUsdPreference.equals(BitcoinPayInUsdPreference.Enabled.INSTANCE)) {
                    str4 = androidStringManager.get(R.string.bitcoin_on_ramp_pay_in_usd_on);
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return bitcoinOnRampWidgetViewModel;
                }
                List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new BitcoinOnRampOptionViewModel[]{bitcoinOnRampOptionViewModel, bitcoinOnRampOptionViewModel2, bitcoinOnRampOptionViewModel3, !booleanValue ? new BitcoinOnRampOptionViewModel(icons, str5, str6, bitcoinOnRampOptionType, str4) : bitcoinOnRampWidgetViewModel});
                BitcoinOnRampWidgetViewModel bitcoinOnRampWidgetViewModel2 = filterNotNull.isEmpty() ? new BitcoinOnRampWidgetViewModel(filterNotNull) : bitcoinOnRampWidgetViewModel;
                gapComposer.end(false);
                return bitcoinOnRampWidgetViewModel2;
            }
            str2 = androidStringManager.get(R.string.bitcoin_onramp_auto_withdraw_subtitle_paused);
        }
        z = booleanValue3;
        str = str2;
        bitcoinOnRampWidgetViewModel = null;
        BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel4 = new BitcoinOnRampOptionViewModel(Icons.Passkey24, androidStringManager.get(R.string.bitcoin_onramp_auto_withdraw_title), str, BitcoinOnRampOptionType.AUTO_WITHDRAW, null);
        if (booleanValue2) {
        }
        bitcoinOnRampOptionViewModel4 = bitcoinOnRampWidgetViewModel;
        if (!booleanValue6) {
        }
        if (!booleanValue5) {
        }
        if (z) {
        }
        Icons icons2 = Icons.CurrencyUsd24;
        String str52 = androidStringManager.get(R.string.bitcoin_on_ramp_pay_in_usd_title);
        String str62 = androidStringManager.get(R.string.bitcoin_on_ramp_pay_in_usd_subtitle);
        BitcoinOnRampOptionType bitcoinOnRampOptionType2 = BitcoinOnRampOptionType.PAY_IN_USD;
        if (!bitcoinPayInUsdPreference.equals(disabled)) {
        }
        List filterNotNull2 = ArraysKt___ArraysKt.filterNotNull(new BitcoinOnRampOptionViewModel[]{bitcoinOnRampOptionViewModel4, bitcoinOnRampOptionViewModel2, bitcoinOnRampOptionViewModel3, !booleanValue ? new BitcoinOnRampOptionViewModel(icons2, str52, str62, bitcoinOnRampOptionType2, str4) : bitcoinOnRampWidgetViewModel});
        if (filterNotNull2.isEmpty()) {
        }
        gapComposer.end(false);
        return bitcoinOnRampWidgetViewModel2;
    }
}
