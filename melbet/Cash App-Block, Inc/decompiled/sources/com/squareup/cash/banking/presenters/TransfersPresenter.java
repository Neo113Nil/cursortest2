package com.squareup.cash.banking.presenters;

import android.app.Activity;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.history.screens.HistoryScreens;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanl;
import com.google.android.gms.internal.mlkit_genai_prompt.zzhx;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.InputHandlerKt;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.PillControl;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.Toggle;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.screens.TransfersScreen;
import com.squareup.cash.banking.viewmodels.AccountDetailsContent;
import com.squareup.cash.banking.viewmodels.TransfersViewModel;
import com.squareup.cash.banking.viewmodels.TransfersViewModel$Companion$TransfersTab;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerEntrypoint;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerOpenLoadApplet;
import com.squareup.cash.cdf.earningstracker.Timeframe;
import com.squareup.cash.cdf.transfers.Section;
import com.squareup.cash.cdf.transfers.TransfersTapCopyNumber;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.backend.real.RealDateFilterGenerator;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.backend.api.EarningsStream;
import com.squareup.cash.earnings.backend.real.RealEarningsStreamsRepository;
import com.squareup.cash.earnings.presenters.home.EarningsStreamMapperKt;
import com.squareup.cash.earnings.presenters.streamdetail.EarningsStreamDetailPresenter$StreamDetailState;
import com.squareup.cash.earnings.screens.streamdetail.EarningsStreamDetailScreen;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsStreamViewModel;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel;
import com.squareup.cash.earningstracker.backend.api.EarningsTrackerDataResult;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerRepository;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.viewmodels.HeaderSubtitle;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AppScreenLock;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$IncreasedWireTransferInLimits;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$WireTransfersDeactivatedState;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$VerifyPasscodeAttempt;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$verifyPasscode$1;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.profile.presenters.RealProfilePasscodePresenter$PasscodeToggleData;
import com.squareup.cash.profile.presenters.RealProfilePasscodePresenter$passcodeToggleData$1;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.Trend;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ConfirmPasscodeRequest;
import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.wires.WiresAccountInfo;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class TransfersPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object accountFormatter;
    public final Object analytics;
    public final Object args;
    public final Object blockersHelper;
    public final Object clipboardManager;
    public final Object demandDepositAccountManager;
    public final Object featureFlagManager;
    public Object initialTab;
    public final Object issuedCardManager;
    public final Object navigator;
    public final Object router;
    public final AndroidStringManager stringManager;
    public final Object syncValueReader;

    public TransfersPresenter(RealEarningsStreamsRepository realEarningsStreamsRepository, RealDateFilterGenerator realDateFilterGenerator, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, AndroidStringManager androidStringManager, RealLocaleManager realLocaleManager, AndroidClock androidClock, ActivitiesManager.Factory factory, SessionManager sessionManager, LocalizedMoneyFormatter.Factory factory2, CoroutineContext coroutineContext, EarningsStreamDetailScreen earningsStreamDetailScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        earningsStreamDetailScreen.getClass();
        this.clipboardManager = realEarningsStreamsRepository;
        this.accountFormatter = realActivityEmbeddedPresenter$Factory$Impl;
        this.stringManager = androidStringManager;
        this.syncValueReader = realLocaleManager;
        this.issuedCardManager = coroutineContext;
        this.featureFlagManager = earningsStreamDetailScreen;
        this.navigator = screenNavigator;
        this.analytics = factory2.create(MoneyFormatterConfig.STANDARD);
        ActivitiesManager.ActivityContext earningsActivityContext$default = zzanl.earningsActivityContext$default(4, PlatformKt.activeAccountToken(sessionManager), earningsStreamDetailScreen.streamId);
        this.demandDepositAccountManager = earningsActivityContext$default;
        this.args = factory.create(earningsActivityContext$default, new ActivitiesCache.InMemory());
        this.router = new LinkedHashMap();
        YearMonth from = YearMonth.from(Instant.ofEpochMilli(androidClock.millis()).atZone(androidClock.timeZone().toZoneId()));
        from.getClass();
        this.blockersHelper = from;
        List generateMonthlyFilters = realDateFilterGenerator.generateMonthlyFilters(from.minusMonths(2L).atDay(1).atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli());
        ArrayList arrayList = new ArrayList();
        for (Object obj : generateMonthlyFilters) {
            if (obj instanceof DateFilter.Monthly) {
                arrayList.add(obj);
            }
        }
        this.initialTab = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.takeLast(3, arrayList), (Object) new DateFilter.Yearly(from.getYear())), (Object) DateFilter.AllTime.INSTANCE);
    }

    public static final void access$copyAccountNumber(TransfersPresenter transfersPresenter, String str, Section section) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        } else {
            ((Analytics) transfersPresenter.analytics).track(new TransfersTapCopyNumber(section, TransfersTapCopyNumber.NumberType.ACCOUNT), null);
            ((RealClipboardManager) transfersPresenter.clipboardManager).copy("Account number", str);
        }
    }

    public static final void access$copyRoutingNumber(TransfersPresenter transfersPresenter, String str, Section section) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        } else {
            ((Analytics) transfersPresenter.analytics).track(new TransfersTapCopyNumber(section, TransfersTapCopyNumber.NumberType.ROUTING), null);
            ((RealClipboardManager) transfersPresenter.clipboardManager).copy("Routing number", str);
        }
    }

    public static final int access$indexOfInstrument(TransfersPresenter transfersPresenter, List list, String str) {
        boolean z;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument) it.next();
            if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) {
                z = Intrinsics.areEqual(((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingInstrument) paymentInstrument).instrument.token, str);
            } else if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) {
                z = Intrinsics.areEqual(((SelectPaymentInstrumentViewModel.PaymentInstrument.ExistingCashBalance) paymentInstrument).balance.token, str);
            } else {
                if (!(paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                z = false;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void access$models$fetchEarnings(TransfersPresenter transfersPresenter, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, boolean z) {
        mutableState.setValue(null);
        Pair pair = (Pair) transfersPresenter.initialTab;
        AndroidClock androidClock = (AndroidClock) transfersPresenter.issuedCardManager;
        if (pair != null) {
            if (!((Job) pair.first).isActive()) {
                pair = null;
            }
            if (pair != null) {
                Job job = (Job) pair.first;
                long longValue = ((Number) pair.second).longValue();
                job.cancel(null);
                ((RealEarningsTrackerAnalytics) transfersPresenter.args).trackFetchError((DateFilter) mutableState2.getValue(), (int) (androidClock.elapsedRealtime() - longValue), "Fetch cancelled", null, true);
            }
        }
        transfersPresenter.initialTab = new Pair(JobKt.launch$default(coroutineScope, null, null, new RoomDatabase$performClear$1.AnonymousClass1(transfersPresenter, z, mutableState2, mutableState, (Continuation) null, 9), 3), Long.valueOf(androidClock.elapsedRealtime()));
    }

    public static final void access$models$trackLoadApplet(TransfersPresenter transfersPresenter, MutableState mutableState, EarningsTrackerOpenLoadApplet.Trigger trigger) {
        RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) transfersPresenter.args;
        EarningsTrackerEntrypoint earningsTrackerEntrypoint = ((EarningsTrackerScreen) transfersPresenter.router).entrypoint;
        DateFilter dateFilter = (DateFilter) mutableState.getValue();
        earningsTrackerEntrypoint.getClass();
        dateFilter.getClass();
        Triple analyticsTimeframeData = zzhx.toAnalyticsTimeframeData(dateFilter);
        realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerOpenLoadApplet(earningsTrackerEntrypoint, trigger, (Timeframe) analyticsTimeframeData.first, (Integer) analyticsTimeframeData.second, (Integer) analyticsTimeframeData.third), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$passcodeToggleData(TransfersPresenter transfersPresenter, Profile profile, ContinuationImpl continuationImpl) {
        RealProfilePasscodePresenter$passcodeToggleData$1 realProfilePasscodePresenter$passcodeToggleData$1;
        int i;
        if (continuationImpl instanceof RealProfilePasscodePresenter$passcodeToggleData$1) {
            realProfilePasscodePresenter$passcodeToggleData$1 = (RealProfilePasscodePresenter$passcodeToggleData$1) continuationImpl;
            int i2 = realProfilePasscodePresenter$passcodeToggleData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProfilePasscodePresenter$passcodeToggleData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProfilePasscodePresenter$passcodeToggleData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfilePasscodePresenter$passcodeToggleData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = profile.verification_instrument_token;
                    if (Intrinsics.areEqual(str, "CUSTOMER_PASSCODE")) {
                        return new RealProfilePasscodePresenter$PasscodeToggleData("CUSTOMER_PASSCODE", null);
                    }
                    if (str == null) {
                        return new RealProfilePasscodePresenter$PasscodeToggleData(null, null);
                    }
                    CoroutineContext coroutineContext = (CoroutineContext) transfersPresenter.initialTab;
                    PhonePlansHomePresenter$models$1$1 phonePlansHomePresenter$models$1$1 = new PhonePlansHomePresenter$models$1$1(transfersPresenter, str, (Continuation) null);
                    realProfilePasscodePresenter$passcodeToggleData$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, phonePlansHomePresenter$models$1$1, realProfilePasscodePresenter$passcodeToggleData$1);
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
                return new RealProfilePasscodePresenter$PasscodeToggleData(null, (RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument) obj);
            }
        }
        realProfilePasscodePresenter$passcodeToggleData$1 = new RealProfilePasscodePresenter$passcodeToggleData$1(transfersPresenter, continuationImpl);
        Object obj2 = realProfilePasscodePresenter$passcodeToggleData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfilePasscodePresenter$passcodeToggleData$1.label;
        if (i != 0) {
        }
        return new RealProfilePasscodePresenter$PasscodeToggleData(null, (RealProfilePasscodePresenter$PasscodeToggleData.VerificationInstrument) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0144, code lost:
    
        if (r3.write(r0, null, r6) == r7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a4, code lost:
    
        if (r2 == r7) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$verifyPasscode(TransfersPresenter transfersPresenter, String str, String str2, Function1 function1, ContinuationImpl continuationImpl) {
        PasscodeDialogPresenter$verifyPasscode$1 passcodeDialogPresenter$verifyPasscode$1;
        int i;
        String str3;
        ApiResult apiResult;
        ScenarioPlan scenarioPlan;
        ScenarioPlan scenarioPlan2;
        Function1 function12 = function1;
        AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) transfersPresenter.accountFormatter;
        PaymentManager paymentManager = (PaymentManager) transfersPresenter.demandDepositAccountManager;
        HistoryScreens.PaymentPasscodeDialog paymentPasscodeDialog = (HistoryScreens.PaymentPasscodeDialog) transfersPresenter.router;
        if (continuationImpl instanceof PasscodeDialogPresenter$verifyPasscode$1) {
            passcodeDialogPresenter$verifyPasscode$1 = (PasscodeDialogPresenter$verifyPasscode$1) continuationImpl;
            int i2 = passcodeDialogPresenter$verifyPasscode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passcodeDialogPresenter$verifyPasscode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = passcodeDialogPresenter$verifyPasscode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passcodeDialogPresenter$verifyPasscode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function12.invoke(new ActivityItemLayout$$ExternalSyntheticLambda4(7));
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(paymentPasscodeDialog.paymentToken);
                    ConfirmPasscodeRequest confirmPasscodeRequest = new ConfirmPasscodeRequest(new RequestContext(null, listOf, null, null, null, null, null, null, 8175), str, listOf, str2, paymentPasscodeDialog.instrumentSelection, (String) null, 96);
                    AppService appService = (AppService) transfersPresenter.clipboardManager;
                    ClientScenario clientScenario = ClientScenario.ACTIVITY;
                    String str4 = paymentPasscodeDialog.flowToken;
                    str3 = str2;
                    passcodeDialogPresenter$verifyPasscode$1.L$1 = str3;
                    passcodeDialogPresenter$verifyPasscode$1.L$2 = function12;
                    passcodeDialogPresenter$verifyPasscode$1.label = 1;
                    obj = appService.confirmPasscode(clientScenario, str4, confirmPasscodeRequest, passcodeDialogPresenter$verifyPasscode$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        scenarioPlan2 = passcodeDialogPresenter$verifyPasscode$1.L$9;
                        SafeTrace.throwOnFailure(obj);
                        scenarioPlan = scenarioPlan2;
                        ((Navigator) transfersPresenter.blockersHelper).goTo(new Finish(new HistoryScreens.PaymentPasscodeDialog.Result(HistoryScreens.PaymentPasscodeDialog.Result.Status.SUCCESS, scenarioPlan)));
                        return Unit.INSTANCE;
                    }
                    function12 = passcodeDialogPresenter$verifyPasscode$1.L$2;
                    String str5 = passcodeDialogPresenter$verifyPasscode$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    str3 = str5;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ConfirmPasscodeResponse confirmPasscodeResponse = (ConfirmPasscodeResponse) ((ApiResult.Success) apiResult).response;
                    ConfirmPasscodeResponse.Status status = confirmPasscodeResponse.status;
                    ResponseContext responseContext = confirmPasscodeResponse.response_context;
                    if (status == null) {
                        status = ProtoDefaults.CONFIRM_PASSCODE_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 1) {
                        Timber.Forest forest = Timber.Forest;
                        String str6 = paymentPasscodeDialog.paymentToken;
                        String str7 = paymentPasscodeDialog.flowToken;
                        forest.d("Passcode succeeded for %s", str6);
                        responseContext.getClass();
                        StatusResult statusResult = responseContext.status_result;
                        scenarioPlan = responseContext.scenario_plan;
                        StatusResult.Icon icon = statusResult != null ? statusResult.icon : null;
                        if (icon == StatusResult.Icon.BANK || icon == StatusResult.Icon.FAILURE) {
                            statusResult.getClass();
                            String str8 = statusResult.text;
                            str8.getClass();
                            ((RealPaymentManager) paymentManager).error(str7, str8);
                        } else {
                            List<BlockerDescriptor> list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                            if (list != null && !list.isEmpty()) {
                                ((RealPaymentManager) paymentManager).completeScenarioPlan(str7, paymentPasscodeDialog.paymentToken, scenarioPlan, statusResult);
                            } else if (((UiPayment) responseContext.payments.get(0)).state == PaymentState.FAILED) {
                                ((RealPaymentManager) paymentManager).error(str7, transfersPresenter.stringManager.get(R.string.history_passcode_payment_failed));
                            } else {
                                ((ProductionAttributionEventEmitter) transfersPresenter.args).paymentConfirmationSuccessful(Role.SENDER);
                            }
                        }
                        if (str3 == null) {
                            String str9 = paymentPasscodeDialog.verificationInstrumentToken;
                            str9.getClass();
                            String str10 = confirmPasscodeResponse.passcode_token;
                            passcodeDialogPresenter$verifyPasscode$1.L$1 = null;
                            passcodeDialogPresenter$verifyPasscode$1.L$2 = null;
                            passcodeDialogPresenter$verifyPasscode$1.L$9 = scenarioPlan;
                            passcodeDialogPresenter$verifyPasscode$1.label = 2;
                            if (androidBiometricsStore.write(str9, str10, passcodeDialogPresenter$verifyPasscode$1) != coroutineSingletons) {
                                scenarioPlan2 = scenarioPlan;
                                scenarioPlan = scenarioPlan2;
                            }
                        }
                        ((Navigator) transfersPresenter.blockersHelper).goTo(new Finish(new HistoryScreens.PaymentPasscodeDialog.Result(HistoryScreens.PaymentPasscodeDialog.Result.Status.SUCCESS, scenarioPlan)));
                    } else if (ordinal == 2) {
                        Timber.Forest.d("Concurrent modification for %s", paymentPasscodeDialog.paymentToken);
                        finish$default(transfersPresenter, HistoryScreens.PaymentPasscodeDialog.Result.Status.CONCURRENT_MODIFICATION);
                    } else if (ordinal == 3) {
                        Timber.Forest.d("Passcode invalid for %s", paymentPasscodeDialog.paymentToken);
                        function12.invoke(new GLSceneScope$$ExternalSyntheticLambda10(12, transfersPresenter, str3));
                        if (str3 != null) {
                            String str11 = paymentPasscodeDialog.verificationInstrumentToken;
                            str11.getClass();
                            passcodeDialogPresenter$verifyPasscode$1.L$1 = null;
                            passcodeDialogPresenter$verifyPasscode$1.L$2 = null;
                            passcodeDialogPresenter$verifyPasscode$1.label = 3;
                        }
                    } else if (ordinal == 4) {
                        Timber.Forest.d("Too many attempts for %s", paymentPasscodeDialog.paymentToken);
                        finish$default(transfersPresenter, HistoryScreens.PaymentPasscodeDialog.Result.Status.TOO_MANY_ATTEMPTS);
                        String str12 = paymentPasscodeDialog.flowToken;
                        responseContext.getClass();
                        StatusResult statusResult2 = responseContext.status_result;
                        statusResult2.getClass();
                        ((RealPaymentManager) paymentManager).error(str12, statusResult2.text);
                    } else {
                        if (ordinal != 5) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        Timber.Forest.d("Card blocked for %s", paymentPasscodeDialog.paymentToken);
                        finish$default(transfersPresenter, HistoryScreens.PaymentPasscodeDialog.Result.Status.CARD_BLOCKED);
                        String str13 = paymentPasscodeDialog.flowToken;
                        responseContext.getClass();
                        StatusResult statusResult3 = responseContext.status_result;
                        statusResult3.getClass();
                        ((RealPaymentManager) paymentManager).error(str13, statusResult3.text);
                    }
                    return coroutineSingletons;
                }
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Timber.Forest.e("Failed to confirm passcode for %s", paymentPasscodeDialog.paymentToken);
                function12.invoke(new GLSceneScope$$ExternalSyntheticLambda10(13, transfersPresenter, (ApiResult.Failure) apiResult));
                return Unit.INSTANCE;
            }
        }
        passcodeDialogPresenter$verifyPasscode$1 = new PasscodeDialogPresenter$verifyPasscode$1(transfersPresenter, continuationImpl);
        Object obj2 = passcodeDialogPresenter$verifyPasscode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passcodeDialogPresenter$verifyPasscode$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static void finish$default(TransfersPresenter transfersPresenter, HistoryScreens.PaymentPasscodeDialog.Result.Status status) {
        ((Navigator) transfersPresenter.blockersHelper).goTo(new Finish(new HistoryScreens.PaymentPasscodeDialog.Result(status, null)));
    }

    public static final StackedAvatarViewModel.Single streamDetailViewModel$fallbackAvatar(EarningsStream.Avatar avatar, TransfersPresenter transfersPresenter, String str) {
        if (avatar != null) {
            return EarningsStreamMapperKt.toStackedAvatarViewModel(avatar, str);
        }
        String str2 = ((EarningsStreamDetailScreen) transfersPresenter.featureFlagManager).avatarUrl;
        return new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(ColorModel.CashGreen.INSTANCE, GrpcStatus.Companion.monogram(str), str, str2 != null ? new Image(str2, str2, 4) : null, null, null, null, null, false, false, null, false, null, null, 131056));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (r5 >= 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DateFilterBarViewModel createFilterBarViewModel(Long l, DateFilter dateFilter) {
        List listOf;
        RealDateFilterGenerator realDateFilterGenerator = (RealDateFilterGenerator) this.featureFlagManager;
        Integer num = null;
        if (l == null) {
            return new DateFilterBarViewModel(EmptyList.INSTANCE, null);
        }
        if (dateFilter instanceof DateFilter.Monthly) {
            listOf = realDateFilterGenerator.generateMonthlyFilters(l.longValue());
        } else if (dateFilter instanceof DateFilter.Yearly) {
            long longValue = l.longValue();
            AndroidClock androidClock = realDateFilterGenerator.clock;
            boolean z = false;
            listOf = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(new SessionQueries$$ExternalSyntheticLambda1(3, z), DimensionKt.millisToLocalDate(longValue, androidClock.timeZone())), new StampsConfigQueries$$ExternalSyntheticLambda0(DimensionKt.nowLocalDate(androidClock), 7)), new SessionQueries$$ExternalSyntheticLambda1(4, z)));
        } else {
            if (!Intrinsics.areEqual(dateFilter, DateFilter.AllTime.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            listOf = CollectionsKt__CollectionsJVMKt.listOf(dateFilter);
        }
        int lastIndexOf = listOf.lastIndexOf(dateFilter);
        Integer valueOf = Integer.valueOf(lastIndexOf);
        if (lastIndexOf < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            int size = listOf.size() - 1;
            valueOf = Integer.valueOf(size);
        }
        num = valueOf;
        return new DateFilterBarViewModel(listOf, num);
    }

    public DateFilter.Monthly getCurrentMonthAsMonthlyFilter() {
        LocalDate nowLocalDate = DimensionKt.nowLocalDate((AndroidClock) this.issuedCardManager);
        return new DateFilter.Monthly(nowLocalDate.getMonthValue(), nowLocalDate.getYear());
    }

    public String getDefaultMessage() {
        CardBrandGuesser$Brand cardBrandGuesser$Brand = (CardBrandGuesser$Brand) this.initialTab;
        CardBrandGuesser$Brand cardBrandGuesser$Brand2 = CardBrandGuesser$Brand.BALANCE;
        AndroidStringManager androidStringManager = this.stringManager;
        if (cardBrandGuesser$Brand == cardBrandGuesser$Brand2) {
            return androidStringManager.get(R.string.blockers_passcode_title_pin);
        }
        String valueOf = String.valueOf(cardBrandGuesser$Brand.cvvLength);
        String str = androidStringManager.get(cardBrandGuesser$Brand.cvvLocation);
        String str2 = ((HistoryScreens.PaymentPasscodeDialog) this.router).suffix;
        if (str2 == null) {
            str2 = "null";
        }
        valueOf.getClass();
        str.getClass();
        Object[] objArr = {valueOf, str, str2};
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.profile_confirm_message_passcode)).format(objArr);
        format2.getClass();
        return format2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[LOOP:1: B:176:0x064c->B:257:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0aba  */
    /* JADX WARN: Type inference failed for: r2v118, types: [com.squareup.cash.account.settings.viewmodels.Toggle, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v127 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        TransfersViewModel.BankTransferContent cashCardNotOrdered;
        TransfersViewModel.WireTransferContent wireTransferContent;
        TransfersViewModel.WireTransferContent wireTransferContent2;
        List list;
        TransfersViewModel.WireTransferContent.Eligible eligible;
        List list2;
        int i2;
        Object realFidesmoClient$observeDeviceState$1;
        MutableState mutableState;
        Integer num;
        MutableState mutableState2;
        CurrencyCode currencyCode;
        EarningsStream.Avatar avatar;
        String str;
        String format2;
        Object loaded;
        String format3;
        EarningsHomeViewModel.EarningsActivity earningsActivity;
        long j;
        Money money;
        Long l;
        EarningsStream.Avatar avatar2;
        Money money2;
        Object dotGridKt$DotGrid$3$1;
        MutableState mutableState3;
        MutableState mutableState4;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        Object navHostKt$NavHost$33$1;
        Long l2;
        MutableState mutableState5;
        MutableState mutableState6;
        Continuation continuation;
        MutableState mutableState7;
        MutableState mutableState8;
        TransfersPresenter transfersPresenter;
        Continuation continuation2;
        ?? r2;
        ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel;
        TransfersPresenter transfersPresenter2 = this;
        int i3 = transfersPresenter2.$r8$classId;
        int i4 = 23;
        Object obj = transfersPresenter2.router;
        Object obj2 = transfersPresenter2.blockersHelper;
        Object obj3 = transfersPresenter2.accountFormatter;
        Object obj4 = transfersPresenter2.syncValueReader;
        int i5 = 12;
        Object obj5 = transfersPresenter2.featureFlagManager;
        AndroidStringManager androidStringManager = transfersPresenter2.stringManager;
        Object obj6 = transfersPresenter2.demandDepositAccountManager;
        Object obj7 = Composer.Companion.Empty;
        switch (i3) {
            case 0:
                DemandDepositAccountFormatter demandDepositAccountFormatter = (DemandDepositAccountFormatter) obj3;
                Resources resources = androidStringManager.resources;
                SyncValueReader syncValueReader = (SyncValueReader) obj4;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1577759747);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj7) {
                    rememberedValue = ((RealIssuedCardManager) ((IssuedCardManager) transfersPresenter2.issuedCardManager)).getIssuedCardState();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CashAppCard.PhysicalCardOrderState physicalCardOrderState = CashAppCard.PhysicalCardOrderState.NO_CARD;
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, physicalCardOrderState, null, gapComposer, 48, 2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj7) {
                    rememberedValue2 = ((RealDemandDepositAccountManager) obj6).selectUiDda();
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj7) {
                    rememberedValue3 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.Wires);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue3, null, gapComposer, 1);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj7) {
                    rememberedValue4 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.InputtedLegalName, null, new AvatarsKt$$ExternalSyntheticLambda2(i4));
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
                Object[] objArr = new Object[0];
                boolean changedInstance = gapComposer.changedInstance(transfersPresenter2);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue5 == obj7) {
                    rememberedValue5 = new ErrorView$$ExternalSyntheticLambda0(transfersPresenter2, 13);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue5, gapComposer, 0);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer.changedInstance(transfersPresenter2);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue6 == obj7) {
                    rememberedValue6 = new TransfersPresenter$models$1$1(transfersPresenter2, null, 0);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue6);
                Updater.LaunchedEffect(gapComposer, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, transfersPresenter2, collectAsState2, collectAsState3, mutableState9, 20));
                UiDda uiDda = (UiDda) collectAsState2.getValue();
                DirectDepositAccount directDepositAccount = uiDda != null ? uiDda.account : null;
                CashAppCard.PhysicalCardOrderState physicalCardOrderState2 = (CashAppCard.PhysicalCardOrderState) collectAsState.getValue();
                if ((directDepositAccount != null ? directDepositAccount.account_number : null) != null) {
                    cashCardNotOrdered = new TransfersViewModel.BankTransferContent.HasCashCard(androidStringManager.get(R.string.how_to_make_a_bank_transfer_button), MooncakeTheme.accountDetailsContent(directDepositAccount, demandDepositAccountFormatter, androidStringManager));
                } else {
                    cashCardNotOrdered = physicalCardOrderState2 == physicalCardOrderState ? new TransfersViewModel.BankTransferContent.NoCashCard.CashCardNotOrdered(androidStringManager.get(R.string.bank_transfer_card_not_ordered_primary_button_text), androidStringManager.get(R.string.bank_transfer_card_not_ordered_secondary_description)) : new TransfersViewModel.BankTransferContent.NoCashCard.CashCardOrdered(androidStringManager.get(R.string.bank_transfer_card_ordered_primary_button_text), androidStringManager.get(R.string.bank_transfer_card_ordered_secondary_description));
                }
                WiresAccountInfo wiresAccountInfo = (WiresAccountInfo) collectAsState3.getValue();
                if (wiresAccountInfo != null) {
                    WiresAccountInfo.WiresProfile wiresProfile = wiresAccountInfo.wires_profile;
                    String str2 = (String) collectAsState4.getValue();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) obj5;
                    if (wiresProfile != null) {
                        WiresAccountInfo.WiresProfile.DeactivationDetails deactivationDetails = wiresProfile instanceof WiresAccountInfo.WiresProfile.DeactivationDetails ? (WiresAccountInfo.WiresProfile.DeactivationDetails) wiresProfile : null;
                        WiresAccountInfo.DeactivationDetails deactivationDetails2 = deactivationDetails != null ? deactivationDetails.value : null;
                        if (deactivationDetails2 != null) {
                            if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$WireTransfersDeactivatedState.INSTANCE)).enabled()) {
                                deactivationDetails2 = null;
                            }
                            if (deactivationDetails2 != null) {
                                String str3 = deactivationDetails2.title;
                                str3.getClass();
                                wireTransferContent = new TransfersViewModel.WireTransferContent.Deactivated(str3, deactivationDetails2.description, deactivationDetails2.learn_more_button_text);
                                TransfersViewModel transfersViewModel = new TransfersViewModel(cashCardNotOrdered, wireTransferContent, (TransfersViewModel$Companion$TransfersTab) mutableState9.getValue());
                                gapComposer.end(false);
                                return transfersViewModel;
                            }
                        }
                    }
                    if (wiresProfile != null) {
                        WiresAccountInfo.WiresProfile.EligibilityDetails eligibilityDetails = wiresProfile instanceof WiresAccountInfo.WiresProfile.EligibilityDetails ? (WiresAccountInfo.WiresProfile.EligibilityDetails) wiresProfile : null;
                        WiresAccountInfo.EligibilityDetails eligibilityDetails2 = eligibilityDetails != null ? eligibilityDetails.value : null;
                        if (eligibilityDetails2 != null) {
                            String str4 = androidStringManager.get(R.string.transfers_routing_label);
                            String str5 = eligibilityDetails2.routing_number;
                            str5.getClass();
                            String formatRouting = DemandDepositAccountFormatter.formatRouting(str5);
                            String str6 = androidStringManager.get(R.string.transfers_account_label);
                            String formatAccount = DemandDepositAccountFormatter.formatAccount(eligibilityDetails2.account_number);
                            formatAccount.getClass();
                            AccountDetailsContent accountDetailsContent = new AccountDetailsContent(formatRouting, str4, formatAccount, str6, true);
                            TransfersViewModel.WireTransferContent.Eligible.PartnerBankDetailsContent partnerBankDetailsContent = new TransfersViewModel.WireTransferContent.Eligible.PartnerBankDetailsContent(androidStringManager.get(R.string.temp_wires_bank_name), androidStringManager.get(R.string.temp_wires_bank_street), androidStringManager.get(R.string.temp_wires_bank_city_state_zip));
                            String str7 = androidStringManager.get(R.string.how_to_make_a_wire_transfer_button);
                            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$IncreasedWireTransferInLimits.INSTANCE)).enabled()) {
                                String[] stringArray = resources.getStringArray(R.array.wire_transfer_requirements_increased_limits);
                                stringArray.getClass();
                                list2 = ArraysKt___ArraysKt.toList(stringArray);
                            } else {
                                String[] stringArray2 = resources.getStringArray(R.array.wire_transfer_requirements);
                                stringArray2.getClass();
                                list2 = ArraysKt___ArraysKt.toList(stringArray2);
                            }
                            eligible = new TransfersViewModel.WireTransferContent.Eligible(str7, accountDetailsContent, partnerBankDetailsContent, str2, list2);
                            wireTransferContent = eligible;
                            TransfersViewModel transfersViewModel2 = new TransfersViewModel(cashCardNotOrdered, wireTransferContent, (TransfersViewModel$Companion$TransfersTab) mutableState9.getValue());
                            gapComposer.end(false);
                            return transfersViewModel2;
                        }
                    }
                    if (wiresProfile != null) {
                        WiresAccountInfo.WiresProfile.IneligibilityDetails ineligibilityDetails = wiresProfile instanceof WiresAccountInfo.WiresProfile.IneligibilityDetails ? (WiresAccountInfo.WiresProfile.IneligibilityDetails) wiresProfile : null;
                        WiresAccountInfo.IneligibilityDetails ineligibilityDetails2 = ineligibilityDetails != null ? ineligibilityDetails.value : null;
                        if (ineligibilityDetails2 != null) {
                            LocalizedString localizedString = ineligibilityDetails2.action_title;
                            String str8 = localizedString != null ? localizedString.translated_value : null;
                            LocalizedString localizedString2 = ineligibilityDetails2.description;
                            wireTransferContent2 = new TransfersViewModel.WireTransferContent.Ineligible(str8, localizedString2 != null ? localizedString2.translated_value : null);
                            if (wireTransferContent2 == null) {
                                wireTransferContent = wireTransferContent2;
                                TransfersViewModel transfersViewModel22 = new TransfersViewModel(cashCardNotOrdered, wireTransferContent, (TransfersViewModel$Companion$TransfersTab) mutableState9.getValue());
                                gapComposer.end(false);
                                return transfersViewModel22;
                            }
                            String str9 = wiresAccountInfo.account_number;
                            String str10 = wiresAccountInfo.routing_number;
                            if (str9 != null && str10 != null) {
                                String str11 = androidStringManager.get(R.string.transfers_routing_label);
                                String formatRouting2 = DemandDepositAccountFormatter.formatRouting(str10);
                                String str12 = androidStringManager.get(R.string.transfers_account_label);
                                String formatAccount2 = DemandDepositAccountFormatter.formatAccount(str9);
                                formatAccount2.getClass();
                                AccountDetailsContent accountDetailsContent2 = new AccountDetailsContent(formatRouting2, str11, formatAccount2, str12, true);
                                GlobalAddress globalAddress = wiresAccountInfo.bank_address;
                                globalAddress.getClass();
                                String str13 = globalAddress.address_line_1;
                                str13.getClass();
                                String str14 = globalAddress.address_line_2;
                                str14.getClass();
                                TransfersViewModel.WireTransferContent.Eligible.PartnerBankDetailsContent partnerBankDetailsContent2 = new TransfersViewModel.WireTransferContent.Eligible.PartnerBankDetailsContent(str13, str14, Boxes$$ExternalSyntheticOutline1.m$1(globalAddress.locality, ", ", globalAddress.administrative_district_level_1, " ", globalAddress.postal_code));
                                String str15 = androidStringManager.get(R.string.how_to_make_a_wire_transfer_button);
                                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$IncreasedWireTransferInLimits.INSTANCE)).enabled()) {
                                    String[] stringArray3 = resources.getStringArray(R.array.wire_transfer_requirements_increased_limits);
                                    stringArray3.getClass();
                                    list = ArraysKt___ArraysKt.toList(stringArray3);
                                } else {
                                    String[] stringArray4 = resources.getStringArray(R.array.wire_transfer_requirements);
                                    stringArray4.getClass();
                                    list = ArraysKt___ArraysKt.toList(stringArray4);
                                }
                                eligible = new TransfersViewModel.WireTransferContent.Eligible(str15, accountDetailsContent2, partnerBankDetailsContent2, str2, list);
                                wireTransferContent = eligible;
                                TransfersViewModel transfersViewModel222 = new TransfersViewModel(cashCardNotOrdered, wireTransferContent, (TransfersViewModel$Companion$TransfersTab) mutableState9.getValue());
                                gapComposer.end(false);
                                return transfersViewModel222;
                            }
                        }
                    }
                    wireTransferContent2 = null;
                    if (wireTransferContent2 == null) {
                    }
                }
                wireTransferContent = null;
                TransfersViewModel transfersViewModel2222 = new TransfersViewModel(cashCardNotOrdered, wireTransferContent, (TransfersViewModel$Companion$TransfersTab) mutableState9.getValue());
                gapComposer.end(false);
                return transfersViewModel2222;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(390695972);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (rememberedValue7 == obj7) {
                    i2 = 1;
                    rememberedValue7 = StateFlowKt.combineState(((BalanceAppletTileRepository) transfersPresenter2.clipboardManager).balanceModel(), Countries.observeState(((RealBalancePrivacy) obj3).obfuscationEnabled), new CashtagViewKt$$ExternalSyntheticLambda10(transfersPresenter2, i2));
                    gapComposer2.updateRememberedValue(rememberedValue7);
                } else {
                    i2 = 1;
                }
                MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer2, i2);
                Updater.LaunchedEffect(gapComposer2, flow, new BenefitsHubPresenter$models$1$1(flow, (Continuation) null, transfersPresenter2, collectAsState5, 11));
                BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) collectAsState5.getValue();
                gapComposer2.end(false);
                return balanceAppletTileViewModel;
            case 2:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                YearMonth yearMonth = (YearMonth) obj2;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1781358835);
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (rememberedValue8 == obj7) {
                    rememberedValue8 = Updater.mutableStateOf$default(new DateFilter.Monthly(yearMonth.getMonthValue(), yearMonth.getYear()));
                    gapComposer3.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState10 = (MutableState) rememberedValue8;
                Object rememberedValue9 = gapComposer3.rememberedValue();
                if (rememberedValue9 == obj7) {
                    rememberedValue9 = Updater.mutableStateOf$default(EarningsStreamDetailPresenter$StreamDetailState.Loading.INSTANCE);
                    gapComposer3.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState11 = (MutableState) rememberedValue9;
                Object rememberedValue10 = gapComposer3.rememberedValue();
                if (rememberedValue10 == obj7) {
                    rememberedValue10 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer3);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue10;
                boolean changed = gapComposer3.changed((ActivitiesManager.ActivityContext) obj6);
                Object rememberedValue11 = gapComposer3.rememberedValue();
                if (changed || rememberedValue11 == obj7) {
                    rememberedValue11 = ((RealActivityEmbeddedPresenter$Factory$Impl) obj3).create((BetterNavigator.ScreenNavigator) transfersPresenter2.navigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default((ActivitiesManager.ActivityContext) obj6, null, null, new ArcadeModal$$ExternalSyntheticLambda2(transfersPresenter2, i5), 3, null, null, null, null, null, 8138));
                    gapComposer3.updateRememberedValue(rememberedValue11);
                }
                UiCallbackModel models = ((RealActivityEmbeddedPresenter) rememberedValue11).models(gapComposer3, 0);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer3.changedInstance(transfersPresenter2);
                Object rememberedValue12 = gapComposer3.rememberedValue();
                Continuation continuation3 = null;
                if (changedInstance3 || rememberedValue12 == obj7) {
                    rememberedValue12 = new RealAppConfigManager$update$2$2(transfersPresenter2, continuation3, 22);
                    gapComposer3.updateRememberedValue(rememberedValue12);
                }
                Updater.LaunchedEffect(gapComposer3, unit2, (Function2) rememberedValue12);
                Updater.LaunchedEffect(gapComposer3, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, transfersPresenter2, mutableState10, parcelableSnapshotMutableIntState2, 21));
                DateFilter dateFilter = (DateFilter) mutableState10.getValue();
                Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState2.getIntValue());
                boolean changedInstance4 = gapComposer3.changedInstance(transfersPresenter2);
                Object rememberedValue13 = gapComposer3.rememberedValue();
                if (changedInstance4 || rememberedValue13 == obj7) {
                    mutableState = mutableState10;
                    num = valueOf;
                    realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1(transfersPresenter2, mutableState, mutableState11, (Continuation) null, 6);
                    transfersPresenter2 = transfersPresenter2;
                    mutableState2 = mutableState11;
                    gapComposer3.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
                    currencyCode = null;
                } else {
                    num = valueOf;
                    realFidesmoClient$observeDeviceState$1 = rememberedValue13;
                    mutableState = mutableState10;
                    currencyCode = 0;
                    mutableState2 = mutableState11;
                }
                Updater.LaunchedEffect(dateFilter, num, (Function2) realFidesmoClient$observeDeviceState$1, gapComposer3);
                Iterator it = linkedHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        EarningsStream earningsStream = (EarningsStream) it.next();
                        avatar = earningsStream != null ? earningsStream.avatar : currencyCode;
                        if (avatar != null) {
                        }
                    } else {
                        avatar = currencyCode;
                    }
                }
                Iterator it2 = linkedHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        EarningsStream earningsStream2 = (EarningsStream) it2.next();
                        if (earningsStream2 != null) {
                            str = earningsStream2.name;
                            if (str.length() > 0) {
                                if (str == null) {
                                }
                            }
                        }
                        str = currencyCode;
                        if (str == null) {
                        }
                    } else {
                        str = currencyCode;
                    }
                }
                EarningsStreamDetailPresenter$StreamDetailState earningsStreamDetailPresenter$StreamDetailState = (EarningsStreamDetailPresenter$StreamDetailState) mutableState2.getValue();
                DateFilter dateFilter2 = (DateFilter) mutableState.getValue();
                ArrayList arrayList = (ArrayList) transfersPresenter2.initialTab;
                EarningsHomeViewModel.EarningsActivity earningsActivity2 = new EarningsHomeViewModel.EarningsActivity(models, androidStringManager.get(R.string.earnings_recent_activity_title));
                MoneyFormatter moneyFormatter = (MoneyFormatter) transfersPresenter2.analytics;
                EarningsStreamDetailScreen earningsStreamDetailScreen = (EarningsStreamDetailScreen) obj5;
                if (earningsStreamDetailPresenter$StreamDetailState instanceof EarningsStreamDetailPresenter$StreamDetailState.Loading) {
                    String str16 = str == null ? earningsStreamDetailScreen.streamName : str;
                    if (str == null) {
                        str = earningsStreamDetailScreen.streamName;
                    }
                    loaded = new EarningsStreamDetailViewModel.Loading(str16, streamDetailViewModel$fallbackAvatar(avatar, transfersPresenter2, str), arrayList, dateFilter2, earningsActivity2);
                } else {
                    if (!(earningsStreamDetailPresenter$StreamDetailState instanceof EarningsStreamDetailPresenter$StreamDetailState.Error)) {
                        if (earningsStreamDetailPresenter$StreamDetailState instanceof EarningsStreamDetailPresenter$StreamDetailState.Loaded) {
                            EarningsStream earningsStream3 = ((EarningsStreamDetailPresenter$StreamDetailState.Loaded) earningsStreamDetailPresenter$StreamDetailState).stream;
                            if (earningsStream3 == null || (money2 = (Money) earningsStream3.totalAmount$delegate.getValue()) == null || (format2 = moneyFormatter.format(money2)) == null) {
                                format2 = moneyFormatter.format(new Money((Long) 0L, currencyCode, 6));
                            }
                            if (earningsStream3 != null) {
                                String str17 = earningsStream3.name;
                                if (str17.length() <= 0) {
                                    str17 = currencyCode;
                                }
                                if (str17 != null) {
                                    str = str17;
                                    EarningsStreamViewModel earningsStreamViewModel = new EarningsStreamViewModel((earningsStream3 != null || (avatar2 = earningsStream3.avatar) == null) ? streamDetailViewModel$fallbackAvatar(avatar, transfersPresenter2, str) : EarningsStreamMapperKt.toStackedAvatarViewModel(avatar2, str), earningsStreamDetailScreen.streamId, str, format2);
                                    Locale locale = (Locale) ((RealLocaleManager) obj4).resolvedLocale.$$delegate_0.getValue();
                                    dateFilter2.getClass();
                                    Resources resources2 = androidStringManager.resources;
                                    locale.getClass();
                                    yearMonth.getClass();
                                    if (!(dateFilter2 instanceof DateFilter.AllTime)) {
                                        format3 = androidStringManager.get(R.string.earnings_period_all_time);
                                    } else if (dateFilter2 instanceof DateFilter.Yearly) {
                                        String valueOf2 = String.valueOf(((DateFilter.Yearly) dateFilter2).year);
                                        valueOf2.getClass();
                                        ArrayMap arrayMap = new ArrayMap(1);
                                        arrayMap.put("year", valueOf2);
                                        resources2.getClass();
                                        format3 = new MessageFormat(resources2.getString(R.string.earnings_period_in_year)).format(arrayMap);
                                        format3.getClass();
                                    } else if (dateFilter2 instanceof DateFilter.Monthly) {
                                        DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter2;
                                        YearMonth of = YearMonth.of(monthly.year, monthly.month);
                                        String displayName = of.getMonth().getDisplayName(TextStyle.FULL, locale);
                                        if (of.equals(yearMonth)) {
                                            format3 = androidStringManager.get(R.string.earnings_period_this_month);
                                        } else if (of.equals(yearMonth.minusMonths(1L))) {
                                            format3 = androidStringManager.get(R.string.earnings_period_last_month);
                                        } else {
                                            displayName.getClass();
                                            ArrayMap arrayMap2 = new ArrayMap(1);
                                            arrayMap2.put("month", displayName);
                                            resources2.getClass();
                                            format3 = new MessageFormat(resources2.getString(R.string.earnings_period_in_named_month)).format(arrayMap2);
                                            format3.getClass();
                                        }
                                    } else {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                    }
                                    String str18 = format3;
                                    if (earningsStream3 != null || (money = (Money) earningsStream3.totalAmount$delegate.getValue()) == null || (l = money.amount) == null) {
                                        earningsActivity = earningsActivity2;
                                        j = 0;
                                    } else {
                                        earningsActivity = earningsActivity2;
                                        j = l.longValue();
                                    }
                                    loaded = new EarningsStreamDetailViewModel.Loaded(earningsStreamViewModel, str18, format2, j, arrayList, dateFilter2, earningsActivity);
                                }
                            }
                            if (str == null) {
                                str = earningsStreamDetailScreen.streamName;
                            }
                            EarningsStreamViewModel earningsStreamViewModel2 = new EarningsStreamViewModel((earningsStream3 != null || (avatar2 = earningsStream3.avatar) == null) ? streamDetailViewModel$fallbackAvatar(avatar, transfersPresenter2, str) : EarningsStreamMapperKt.toStackedAvatarViewModel(avatar2, str), earningsStreamDetailScreen.streamId, str, format2);
                            Locale locale2 = (Locale) ((RealLocaleManager) obj4).resolvedLocale.$$delegate_0.getValue();
                            dateFilter2.getClass();
                            Resources resources22 = androidStringManager.resources;
                            locale2.getClass();
                            yearMonth.getClass();
                            if (!(dateFilter2 instanceof DateFilter.AllTime)) {
                            }
                            String str182 = format3;
                            if (earningsStream3 != null) {
                            }
                            earningsActivity = earningsActivity2;
                            j = 0;
                            loaded = new EarningsStreamDetailViewModel.Loaded(earningsStreamViewModel2, str182, format2, j, arrayList, dateFilter2, earningsActivity);
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                        return null;
                    }
                    String str19 = str == null ? earningsStreamDetailScreen.streamName : str;
                    if (str == null) {
                        str = earningsStreamDetailScreen.streamName;
                    }
                    loaded = new EarningsStreamDetailViewModel.LoadError(str19, streamDetailViewModel$fallbackAvatar(avatar, transfersPresenter2, str), arrayList, dateFilter2, earningsActivity2);
                }
                Object obj8 = loaded;
                gapComposer3.end(false);
                return obj8;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-915213683);
                Object rememberedValue14 = gapComposer4.rememberedValue();
                if (rememberedValue14 == obj7) {
                    rememberedValue14 = Updater.mutableStateOf$default(null);
                    gapComposer4.updateRememberedValue(rememberedValue14);
                }
                MutableState mutableState12 = (MutableState) rememberedValue14;
                Object rememberedValue15 = gapComposer4.rememberedValue();
                if (rememberedValue15 == obj7) {
                    rememberedValue15 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer4);
                    gapComposer4.updateRememberedValue(rememberedValue15);
                }
                Object obj9 = (CoroutineScope) rememberedValue15;
                Object rememberedValue16 = gapComposer4.rememberedValue();
                if (rememberedValue16 == obj7) {
                    rememberedValue16 = ((RealTapToPayEligibilityProvider) obj6).isEligible();
                    gapComposer4.updateRememberedValue(rememberedValue16);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue16, Boolean.FALSE, null, gapComposer4, 48, 2);
                Object[] objArr2 = new Object[0];
                boolean changedInstance5 = gapComposer4.changedInstance(transfersPresenter2);
                Object rememberedValue17 = gapComposer4.rememberedValue();
                if (changedInstance5 || rememberedValue17 == obj7) {
                    rememberedValue17 = new ArcadeModal$$ExternalSyntheticLambda2(transfersPresenter2, 14);
                    gapComposer4.updateRememberedValue(rememberedValue17);
                }
                MutableState mutableState13 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue17, gapComposer4, 0);
                Object rememberedValue18 = gapComposer4.rememberedValue();
                if (rememberedValue18 == obj7) {
                    rememberedValue18 = ((SyncValueReader) obj4).getSingleValueOrDefault(AndroidSyncValueSpecs.C4bEarningsTrackerSummary, null, new StoryQueries$$ExternalSyntheticLambda0(5));
                    gapComposer4.updateRememberedValue(rememberedValue18);
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue18, gapComposer4);
                Object rememberedValue19 = gapComposer4.rememberedValue();
                if (rememberedValue19 == obj7) {
                    rememberedValue19 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer4);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue19;
                Object rememberedValue20 = gapComposer4.rememberedValue();
                if (rememberedValue20 == obj7) {
                    rememberedValue20 = Updater.mutableStateOf$default(new EarningsTrackerViewModel.Loading(transfersPresenter2.createFilterBarViewModel((Long) receiveValueAsState.getValue(), (DateFilter) mutableState13.getValue())));
                    gapComposer4.updateRememberedValue(rememberedValue20);
                }
                MutableState mutableState14 = (MutableState) rememberedValue20;
                boolean changedInstance6 = gapComposer4.changedInstance(transfersPresenter2) | gapComposer4.changed(mutableState13);
                Object rememberedValue21 = gapComposer4.rememberedValue();
                if (changedInstance6 || rememberedValue21 == obj7) {
                    rememberedValue21 = new RealAppConfigManager$update$2$2(transfersPresenter2, mutableState13, null, i4);
                    gapComposer4.updateRememberedValue(rememberedValue21);
                }
                Updater.LaunchedEffect(gapComposer4, "track-load-applet-event", (Function2) rememberedValue21);
                DateFilter dateFilter3 = (DateFilter) mutableState13.getValue();
                boolean changedInstance7 = gapComposer4.changedInstance(transfersPresenter2) | gapComposer4.changed(mutableState13) | gapComposer4.changedInstance(obj9);
                Object rememberedValue22 = gapComposer4.rememberedValue();
                if (changedInstance7 || rememberedValue22 == obj7) {
                    mutableState3 = mutableState13;
                    dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) transfersPresenter2, obj9, mutableState12, mutableState3, (Continuation) null, 6);
                    transfersPresenter2 = transfersPresenter2;
                    mutableState4 = mutableState12;
                    gapComposer4.updateRememberedValue(dotGridKt$DotGrid$3$1);
                } else {
                    dotGridKt$DotGrid$3$1 = rememberedValue22;
                    mutableState4 = mutableState12;
                    mutableState3 = mutableState13;
                }
                Updater.LaunchedEffect(gapComposer4, dateFilter3, (Function2) dotGridKt$DotGrid$3$1);
                Integer valueOf3 = Integer.valueOf(parcelableSnapshotMutableIntState3.getIntValue());
                boolean changedInstance8 = gapComposer4.changedInstance(transfersPresenter2) | gapComposer4.changed(mutableState3) | gapComposer4.changedInstance(obj9);
                Object rememberedValue23 = gapComposer4.rememberedValue();
                if (changedInstance8 || rememberedValue23 == obj7) {
                    MutableState mutableState15 = mutableState3;
                    MutableState mutableState16 = mutableState4;
                    TransfersPresenter transfersPresenter3 = transfersPresenter2;
                    Object moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(parcelableSnapshotMutableIntState3, transfersPresenter3, obj9, mutableState16, mutableState15, null, 12);
                    parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                    transfersPresenter2 = transfersPresenter3;
                    mutableState4 = mutableState16;
                    mutableState3 = mutableState15;
                    gapComposer4.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                    rememberedValue23 = moleculeKt$immediateClockFlow$1$1$1;
                } else {
                    parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                }
                Updater.LaunchedEffect(gapComposer4, valueOf3, (Function2) rememberedValue23);
                EarningsTrackerDataResult earningsTrackerDataResult = (EarningsTrackerDataResult) mutableState4.getValue();
                Long l3 = (Long) receiveValueAsState.getValue();
                boolean changedInstance9 = gapComposer4.changedInstance(transfersPresenter2) | gapComposer4.changed(receiveValueAsState) | gapComposer4.changed(mutableState3) | gapComposer4.changed(collectAsState6);
                Object rememberedValue24 = gapComposer4.rememberedValue();
                if (changedInstance9 || rememberedValue24 == obj7) {
                    l2 = l3;
                    mutableState5 = mutableState14;
                    navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1((Object) mutableState4, (Object) transfersPresenter2, (Object) receiveValueAsState, mutableState3, mutableState5, (State) collectAsState6, (Continuation) null, 5);
                    gapComposer4.updateRememberedValue(navHostKt$NavHost$33$1);
                } else {
                    l2 = l3;
                    navHostKt$NavHost$33$1 = rememberedValue24;
                    mutableState5 = mutableState14;
                }
                Updater.LaunchedEffect(earningsTrackerDataResult, l2, (Function2) navHostKt$NavHost$33$1, gapComposer4);
                MutableState mutableState17 = mutableState5;
                Updater.LaunchedEffect(gapComposer4, flow, new EngineInterceptor$intercept$2(29, parcelableSnapshotMutableIntState, flow, this, mutableState3, mutableState17, mutableState4, (Continuation) null));
                EarningsTrackerViewModel earningsTrackerViewModel = (EarningsTrackerViewModel) mutableState17.getValue();
                gapComposer4.end(false);
                return earningsTrackerViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(529071949);
                Object rememberedValue25 = gapComposer5.rememberedValue();
                Continuation continuation4 = null;
                if (rememberedValue25 == obj7) {
                    rememberedValue25 = Updater.mutableStateOf$default(new PasscodeDialogViewModel(transfersPresenter2.getDefaultMessage(), ((CardBrandGuesser$Brand) transfersPresenter2.initialTab).cvvLength, false, null));
                    gapComposer5.updateRememberedValue(rememberedValue25);
                }
                MutableState mutableState18 = (MutableState) rememberedValue25;
                Object rememberedValue26 = gapComposer5.rememberedValue();
                if (rememberedValue26 == obj7) {
                    rememberedValue26 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue26);
                }
                MutableState mutableState19 = (MutableState) rememberedValue26;
                Updater.LaunchedEffect(gapComposer5, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, transfersPresenter2, mutableState18, mutableState19, 6));
                String str20 = ((HistoryScreens.PaymentPasscodeDialog) obj).verificationInstrumentToken;
                boolean changedInstance10 = gapComposer5.changedInstance(transfersPresenter2);
                Object rememberedValue27 = gapComposer5.rememberedValue();
                if (changedInstance10 || rememberedValue27 == obj7) {
                    mutableState6 = mutableState19;
                    Object gLThread$start$2 = new GLThread$start$2(this, mutableState18, mutableState6, continuation4, 9);
                    mutableState18 = mutableState18;
                    continuation = null;
                    gapComposer5.updateRememberedValue(gLThread$start$2);
                    rememberedValue27 = gLThread$start$2;
                } else {
                    mutableState6 = mutableState19;
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer5, str20, (Function2) rememberedValue27);
                PasscodeDialogPresenter$VerifyPasscodeAttempt passcodeDialogPresenter$VerifyPasscodeAttempt = (PasscodeDialogPresenter$VerifyPasscodeAttempt) mutableState6.getValue();
                if (passcodeDialogPresenter$VerifyPasscodeAttempt != null) {
                    gapComposer5.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer5, passcodeDialogPresenter$VerifyPasscodeAttempt, new GLThread$start$2(passcodeDialogPresenter$VerifyPasscodeAttempt, continuation, this, mutableState18, 8));
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(-1106436997);
                    gapComposer5.end(false);
                }
                PasscodeDialogViewModel passcodeDialogViewModel = (PasscodeDialogViewModel) mutableState18.getValue();
                gapComposer5.end(false);
                return passcodeDialogViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(966099680);
                Object rememberedValue28 = gapComposer6.rememberedValue();
                if (rememberedValue28 == obj7) {
                    rememberedValue28 = Updater.mutableStateOf$default(InstrumentSelectionViewModel.Loading.INSTANCE);
                    gapComposer6.updateRememberedValue(rememberedValue28);
                }
                MutableState mutableState20 = (MutableState) rememberedValue28;
                Object rememberedValue29 = gapComposer6.rememberedValue();
                if (rememberedValue29 == obj7) {
                    rememberedValue29 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer6.updateRememberedValue(rememberedValue29);
                }
                MutableState mutableState21 = (MutableState) rememberedValue29;
                Object rememberedValue30 = gapComposer6.rememberedValue();
                if (rememberedValue30 == obj7) {
                    rememberedValue30 = Updater.mutableStateOf$default(null);
                    gapComposer6.updateRememberedValue(rememberedValue30);
                }
                MutableState mutableState22 = (MutableState) rememberedValue30;
                Object rememberedValue31 = gapComposer6.rememberedValue();
                if (rememberedValue31 == obj7) {
                    rememberedValue31 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer6.updateRememberedValue(rememberedValue31);
                }
                MutableState mutableState23 = (MutableState) rememberedValue31;
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance11 = gapComposer6.changedInstance(transfersPresenter2);
                Object rememberedValue32 = gapComposer6.rememberedValue();
                if (changedInstance11 || rememberedValue32 == obj7) {
                    rememberedValue32 = new PasscodeDialogPresenter$models$1$1(transfersPresenter2, mutableState23, null);
                    gapComposer6.updateRememberedValue(rememberedValue32);
                }
                Updater.LaunchedEffect(gapComposer6, unit3, (Function2) rememberedValue32);
                boolean z = ((InstrumentSelectionScreen) transfersPresenter2.initialTab).includeGooglePay && ((Boolean) mutableState23.getValue()).booleanValue();
                Boolean valueOf4 = Boolean.valueOf(z);
                boolean changedInstance12 = gapComposer6.changedInstance(transfersPresenter2) | gapComposer6.changed(z);
                Object rememberedValue33 = gapComposer6.rememberedValue();
                if (changedInstance12 || rememberedValue33 == obj7) {
                    mutableState7 = mutableState21;
                    mutableState8 = mutableState22;
                    Object realPayDataLoader$fetchData$1 = new RealPayDataLoader$fetchData$1(7, this, mutableState7, mutableState8, mutableState20, null, z);
                    gapComposer6.updateRememberedValue(realPayDataLoader$fetchData$1);
                    rememberedValue33 = realPayDataLoader$fetchData$1;
                } else {
                    mutableState7 = mutableState21;
                    mutableState8 = mutableState22;
                }
                Updater.LaunchedEffect(gapComposer6, valueOf4, (Function2) rememberedValue33);
                Updater.LaunchedEffect(gapComposer6, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState7, (State) mutableState20, (Object) mutableState8, 7));
                InstrumentSelectionViewModel instrumentSelectionViewModel = (InstrumentSelectionViewModel) mutableState20.getValue();
                gapComposer6.end(false);
                return instrumentSelectionViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(44427340);
                Object rememberedValue34 = gapComposer7.rememberedValue();
                if (rememberedValue34 == obj7) {
                    rememberedValue34 = (FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) ((FeatureFlagManager) obj5)).peekCurrentValue(LaunchDarklyFeatureFlags$AppScreenLock.INSTANCE);
                    gapComposer7.updateRememberedValue(rememberedValue34);
                }
                FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = (FeatureFlag$StringFeatureFlag$Value) rememberedValue34;
                Object rememberedValue35 = gapComposer7.rememberedValue();
                if (rememberedValue35 == obj7) {
                    rememberedValue35 = ((RealProfileManager) obj6).profile();
                    gapComposer7.updateRememberedValue(rememberedValue35);
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue35, null, null, gapComposer7, 48, 2);
                Object rememberedValue36 = gapComposer7.rememberedValue();
                if (rememberedValue36 == obj7) {
                    rememberedValue36 = (StateFlow) obj2;
                    gapComposer7.updateRememberedValue(rememberedValue36);
                }
                MutableState collectAsState8 = Updater.collectAsState((StateFlow) rememberedValue36, null, gapComposer7, 1);
                Object rememberedValue37 = gapComposer7.rememberedValue();
                if (rememberedValue37 == obj7) {
                    rememberedValue37 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(rememberedValue37);
                }
                MutableState mutableState24 = (MutableState) rememberedValue37;
                Object rememberedValue38 = gapComposer7.rememberedValue();
                if (rememberedValue38 == obj7) {
                    rememberedValue38 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(rememberedValue38);
                }
                MutableState mutableState25 = (MutableState) rememberedValue38;
                Object rememberedValue39 = gapComposer7.rememberedValue();
                if (rememberedValue39 == obj7) {
                    rememberedValue39 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(rememberedValue39);
                }
                MutableState mutableState26 = (MutableState) rememberedValue39;
                Object rememberedValue40 = gapComposer7.rememberedValue();
                if (rememberedValue40 == obj7) {
                    rememberedValue40 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(rememberedValue40);
                }
                MutableState mutableState27 = (MutableState) rememberedValue40;
                boolean hasPasscode = ((PasscodeSettings) collectAsState8.getValue()).getHasPasscode();
                boolean requirePasscodeConfirmation = ((PasscodeSettings) collectAsState8.getValue()).getRequirePasscodeConfirmation();
                Updater.LaunchedEffect(gapComposer7, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, transfersPresenter2, mutableState24, mutableState26, collectAsState8, 4));
                Profile profile = (Profile) collectAsState7.getValue();
                if (profile == null) {
                    gapComposer7.startReplaceGroup(687503067);
                    gapComposer7.end(false);
                    r2 = 0;
                } else {
                    gapComposer7.startReplaceGroup(687503068);
                    Boolean bool = (Boolean) mutableState26.getValue();
                    if (bool != null) {
                        gapComposer7.startReplaceGroup(-1106477359);
                        transfersPresenter = this;
                        Updater.LaunchedEffect(gapComposer7, bool, new CashQrScannerPresenter$models$$inlined$LaunchedEffectNotNull$1(bool, null, transfersPresenter, profile, 1));
                        gapComposer7.end(false);
                        continuation2 = null;
                    } else {
                        transfersPresenter = this;
                        continuation2 = null;
                        gapComposer7.startReplaceGroup(-1106436997);
                        gapComposer7.end(false);
                    }
                    Boolean bool2 = (Boolean) mutableState24.getValue();
                    if (bool2 != null) {
                        gapComposer7.startReplaceGroup(-1106477359);
                        Updater.LaunchedEffect(gapComposer7, bool2, new AndroidFileSaver$save$2(bool2, continuation2, transfersPresenter, i5));
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-1106436997);
                        gapComposer7.end(false);
                    }
                    gapComposer7.end(false);
                    r2 = continuation2;
                }
                Boolean bool3 = (Boolean) mutableState25.getValue();
                if (bool3 != null) {
                    requirePasscodeConfirmation = bool3.booleanValue();
                }
                boolean z2 = requirePasscodeConfirmation;
                Boolean bool4 = (Boolean) mutableState27.getValue();
                boolean booleanValue = bool4 != null ? bool4.booleanValue() : ((PasscodeSettings) collectAsState8.getValue()).getAppLockActivated();
                if (TransactorKt.timeout(featureFlag$StringFeatureFlag$Value) != null) {
                    Pair pair = !hasPasscode ? new Pair(PillControl.Style.ClickableButton, androidStringManager.get(R.string.security_lock_button_text_turn_on)) : (z2 || booleanValue) ? new Pair(PillControl.Style.PillEnabled, androidStringManager.get(R.string.security_lock_button_text_on)) : new Pair(PillControl.Style.PillDisabled, androidStringManager.get(R.string.security_lock_button_text_off));
                    profilePasscodeSectionViewModel = new ProfilePasscodeSectionViewModel(new PillControl((String) pair.second, (PillControl.Style) pair.first), new Toggle(androidStringManager.get(R.string.security_lock_description_app), hasPasscode, booleanValue), new Toggle(androidStringManager.get(R.string.security_lock_description_funds), z2, 2), 2);
                } else {
                    profilePasscodeSectionViewModel = new ProfilePasscodeSectionViewModel(new Toggle((String) r2, z2, 1), r2, r2, 12);
                }
                gapComposer7.end(false);
                return profilePasscodeSectionViewModel;
        }
    }

    public HeaderSubtitle.TrendSubtitle toHeaderSubtitle(Trend trend) {
        Resources resources = this.stringManager.resources;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.blockersHelper;
        Money money = trend.amount_difference;
        String str = trend.comparison_period;
        money.getClass();
        String format2 = moneyFormatter.format(money);
        Trend.TrendDirection trendDirection = trend.trend_direction;
        trendDirection.getClass();
        int ordinal = trendDirection.ordinal();
        if (ordinal == 0) {
            com.squareup.cash.earningstracker.viewmodels.Trend trend2 = com.squareup.cash.earningstracker.viewmodels.Trend.UP;
            str.getClass();
            format2.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.earnings_tracker_trend_up)).format(new Object[]{format2, str});
            format3.getClass();
            return new HeaderSubtitle.TrendSubtitle(trend2, format3);
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        com.squareup.cash.earningstracker.viewmodels.Trend trend3 = com.squareup.cash.earningstracker.viewmodels.Trend.DOWN;
        str.getClass();
        format2.getClass();
        resources.getClass();
        String format4 = new MessageFormat(resources.getString(R.string.earnings_tracker_trend_down)).format(new Object[]{format2, str});
        format4.getClass();
        return new HeaderSubtitle.TrendSubtitle(trend3, format4);
    }

    public TransfersPresenter(AppConfigManager appConfigManager, AndroidStringManager androidStringManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, RealInstrumentLinkingOptionManager realInstrumentLinkingOptionManager, RealProfileManager realProfileManager, RealStatusAndLimitsManager realStatusAndLimitsManager, LocalizedMoneyFormatter.Factory factory, FlowStarter flowStarter, RealFamilyAccountsManager realFamilyAccountsManager, GooglePayPaymentsClient googlePayPaymentsClient, InstrumentSelectionScreen instrumentSelectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        instrumentSelectionScreen.getClass();
        this.clipboardManager = appConfigManager;
        this.stringManager = androidStringManager;
        this.accountFormatter = realBalanceSnapshotManager;
        this.syncValueReader = realInstrumentManager;
        this.issuedCardManager = realInstrumentLinkingOptionManager;
        this.featureFlagManager = realProfileManager;
        this.analytics = realStatusAndLimitsManager;
        this.demandDepositAccountManager = factory;
        this.args = flowStarter;
        this.router = realFamilyAccountsManager;
        this.blockersHelper = googlePayPaymentsClient;
        this.initialTab = instrumentSelectionScreen;
        this.navigator = screenNavigator;
    }

    public TransfersPresenter(BalanceAppletTileRepository balanceAppletTileRepository, RealBalancePrivacy realBalancePrivacy, AndroidStringManager androidStringManager, MoneyAnalyticsService moneyAnalyticsService, LocalizedMoneyFormatter.Factory factory, CoroutineScope coroutineScope, Navigator navigator) {
        navigator.getClass();
        this.clipboardManager = balanceAppletTileRepository;
        this.accountFormatter = realBalancePrivacy;
        this.stringManager = androidStringManager;
        this.syncValueReader = moneyAnalyticsService;
        this.issuedCardManager = coroutineScope;
        this.featureFlagManager = navigator;
        this.analytics = factory.create(MoneyFormatterConfig.STANDARD);
        this.demandDepositAccountManager = factory.createNoSymbol();
        String str = androidStringManager.get(R.string.balance_banking_packaging_applet_title);
        this.args = str;
        String str2 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_add_money_button_label);
        this.navigator = str2;
        String str3 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_withdraw_button_label);
        this.router = str3;
        this.blockersHelper = new BalanceAppletTileViewModel.Loaded.Lite.Uninstalled.UninstalledRowModel(androidStringManager.get(R.string.lite_add_money_applet_tile_title), androidStringManager.get(R.string.lite_add_money_applet_tile_subtitle));
        this.initialTab = new BalanceAppletTileViewModel.Loading(str, new BalanceAppletTileViewModel.BalanceMovementButtons(false, false, str2, str3, 32));
    }

    public TransfersPresenter(ProfileScreens profileScreens, BetterNavigator.ScreenNavigator screenNavigator, RealBalanceSnapshotManager realBalanceSnapshotManager, RealCryptoBalanceRepo realCryptoBalanceRepo, RealInstrumentManager realInstrumentManager, RealProfileManager realProfileManager, FlowStarter flowStarter, Analytics analytics, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, RealPasscodeFlowStarter realPasscodeFlowStarter, StateFlow stateFlow, CoroutineContext coroutineContext) {
        profileScreens.getClass();
        this.clipboardManager = profileScreens;
        this.navigator = screenNavigator;
        this.accountFormatter = realBalanceSnapshotManager;
        this.syncValueReader = realCryptoBalanceRepo;
        this.issuedCardManager = realInstrumentManager;
        this.demandDepositAccountManager = realProfileManager;
        this.args = flowStarter;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.router = realPasscodeFlowStarter;
        this.blockersHelper = stateFlow;
        this.initialTab = coroutineContext;
    }

    public TransfersPresenter(AndroidStringManager androidStringManager, AppService appService, Analytics analytics, AndroidBiometricsStore androidBiometricsStore, CoroutineContext coroutineContext, CashBiometricsInfo cashBiometricsInfo, PaymentManager paymentManager, ProductionAttributionEventEmitter productionAttributionEventEmitter, FeatureFlagManager featureFlagManager, Activity activity, HistoryScreens.PaymentPasscodeDialog paymentPasscodeDialog, Navigator navigator) {
        paymentPasscodeDialog.getClass();
        this.stringManager = androidStringManager;
        this.clipboardManager = appService;
        this.analytics = analytics;
        this.accountFormatter = androidBiometricsStore;
        this.syncValueReader = coroutineContext;
        this.issuedCardManager = cashBiometricsInfo;
        this.demandDepositAccountManager = paymentManager;
        this.args = productionAttributionEventEmitter;
        this.featureFlagManager = featureFlagManager;
        this.navigator = activity;
        this.router = paymentPasscodeDialog;
        this.blockersHelper = navigator;
        this.initialTab = InputHandlerKt.toBrand(paymentPasscodeDialog.instrumentType);
    }

    public TransfersPresenter(AndroidStringManager androidStringManager, RealClipboardManager realClipboardManager, DemandDepositAccountFormatter demandDepositAccountFormatter, SyncValueReader syncValueReader, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, IssuedCardManager issuedCardManager, FeatureFlagManager featureFlagManager, Analytics analytics, RealDemandDepositAccountManager realDemandDepositAccountManager, RealRouter$Factory$Impl realRouter$Factory$Impl, TransfersScreen transfersScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        TransfersViewModel$Companion$TransfersTab transfersViewModel$Companion$TransfersTab;
        transfersScreen.getClass();
        this.stringManager = androidStringManager;
        this.clipboardManager = realClipboardManager;
        this.accountFormatter = demandDepositAccountFormatter;
        this.syncValueReader = syncValueReader;
        this.issuedCardManager = issuedCardManager;
        this.featureFlagManager = featureFlagManager;
        this.analytics = analytics;
        this.demandDepositAccountManager = realDemandDepositAccountManager;
        this.args = transfersScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        int ordinal = transfersScreen.transfersScreenTab.ordinal();
        if (ordinal == 0) {
            transfersViewModel$Companion$TransfersTab = TransfersViewModel$Companion$TransfersTab.BankTab;
        } else if (ordinal == 1) {
            transfersViewModel$Companion$TransfersTab = TransfersViewModel$Companion$TransfersTab.WireTab;
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            throw null;
        }
        this.initialTab = transfersViewModel$Companion$TransfersTab;
    }

    public TransfersPresenter(RealEarningsTrackerRepository realEarningsTrackerRepository, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, EglCore eglCore, AndroidClock androidClock, RealDateFilterGenerator realDateFilterGenerator, zzr zzrVar, SyncValueReader syncValueReader, RealTapToPayEligibilityProvider realTapToPayEligibilityProvider, RealEarningsTrackerAnalytics realEarningsTrackerAnalytics, EarningsTrackerScreen earningsTrackerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        earningsTrackerScreen.getClass();
        this.clipboardManager = realEarningsTrackerRepository;
        this.stringManager = androidStringManager;
        this.accountFormatter = eglCore;
        this.issuedCardManager = androidClock;
        this.featureFlagManager = realDateFilterGenerator;
        this.analytics = zzrVar;
        this.syncValueReader = syncValueReader;
        this.demandDepositAccountManager = realTapToPayEligibilityProvider;
        this.args = realEarningsTrackerAnalytics;
        this.router = earningsTrackerScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = factory.create(MoneyFormatterConfig.STANDARD);
    }
}
