package com.squareup.cash.data.profile;

import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.BalanceDataQueries$select$2;
import com.squareup.cash.db2.profile.BitcoinAmountEntryCurrencyPreference;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.profile.ProfileQueries$bitcoinAmountEntryCurrencyPreference$2;
import com.squareup.cash.db2.profile.ProfileQueries$btcDisplayUnits$2;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.treehouse.preferences.RawPreferencesService;
import com.squareup.cash.ui.ScreenshotReportingManager$initialize$3$1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetBitcoinDisplayPreferenceRequest;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes.dex */
public final class RealProfileManager implements RawPreferencesService {
    public final Analytics analytics;
    public final AppService appService;
    public final InstrumentQueries balanceDataQueries;
    public final Lazy clientSyncer;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final RealObservabilityManager observabilityManager;
    public final RealProfileAliasRepository profileAliasRepository;
    public final InstrumentQueries profileQueries;
    public final RealProfileSyncer profileSyncer;
    public final RealReferralManager referralManager;
    public final InstrumentQueries scenarioPlanQueries;
    public final CoroutineScope scope;
    public final Signal signOutSignal;
    public final Lazy syncValueReader;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiAlias.Type.values().length];
            try {
                UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UiAlias.Type.Companion companion2 = UiAlias.Type.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UiAlias.Type.Companion companion3 = UiAlias.Type.Companion;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealProfileManager(Lazy lazy, RealProfileSyncer realProfileSyncer, RealReferralManager realReferralManager, AppService appService, Analytics analytics, RealObservabilityManager realObservabilityManager, ErrorReporter errorReporter, Signal signal, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealProfileAliasRepository realProfileAliasRepository, FeatureFlagManager featureFlagManager, Lazy lazy2, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.clientSyncer = lazy;
        this.profileSyncer = realProfileSyncer;
        this.referralManager = realReferralManager;
        this.appService = appService;
        this.analytics = analytics;
        this.observabilityManager = realObservabilityManager;
        this.errorReporter = errorReporter;
        this.signOutSignal = signal;
        this.profileAliasRepository = realProfileAliasRepository;
        this.featureFlagManager = featureFlagManager;
        this.syncValueReader = lazy2;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
        this.balanceDataQueries = cashAccountDatabaseImpl.balanceDataQueries;
        this.scenarioPlanQueries = cashAccountDatabaseImpl.scenarioPlanQueries;
        JobKt.launch(coroutineScope, coroutineContext, CoroutineStart.UNDISPATCHED, new CashApp$onCreate$4$1$1(this, null, 18));
    }

    public final FlowQuery$mapToList$$inlined$map$1 balanceData() {
        InstrumentQueries instrumentQueries = this.balanceDataQueries;
        instrumentQueries.getClass();
        BalanceDataQueries$select$2 balanceDataQueries$select$2 = BalanceDataQueries$select$2.INSTANCE;
        SqlDriver sqlDriver = instrumentQueries.driver;
        OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0 = new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, (byte) 0);
        sqlDriver.getClass();
        return DBUtil.mapToOneNotNull(StateFlowKt.runUntil(DBUtil.toFlow(new SimpleQuery(-2051632653, new String[]{"balanceData"}, sqlDriver, "BalanceData.sq", "select", "SELECT balanceData.cash_balance_home_screen_button_enabled, balanceData.cash_balance_home_screen_button_priority, balanceData.adding_cash_enabled, balanceData.enable_cryptocurrency_transfer_out_status, balanceData.enable_cryptocurrency_transfer_out_button_text, balanceData.balance_limit_groups, balanceData.scheduled_reload_data, balanceData.scheduled_reload_enabled, balanceData.enable_cryptocurrency_transfer_in_status, balanceData.enable_cryptocurrency_transfer_in_button_text, balanceData.check_deposits_enabled, balanceData.direct_deposit, balanceData.deposit_check, balanceData.dda_form, balanceData.bitcoin_p2p_enabled\nFROM balanceData", offlineQueries$$ExternalSyntheticLambda0)), this.signOutSignal), this.ioDispatcher);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bitcoinAmountEntryCurrencyPreference(ContinuationImpl continuationImpl) {
        RealProfileManager$bitcoinAmountEntryCurrencyPreference$1 realProfileManager$bitcoinAmountEntryCurrencyPreference$1;
        int i;
        CurrencyCode bitcoin_amount_entry_currency_preference;
        if (continuationImpl instanceof RealProfileManager$bitcoinAmountEntryCurrencyPreference$1) {
            realProfileManager$bitcoinAmountEntryCurrencyPreference$1 = (RealProfileManager$bitcoinAmountEntryCurrencyPreference$1) continuationImpl;
            int i2 = realProfileManager$bitcoinAmountEntryCurrencyPreference$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProfileManager$bitcoinAmountEntryCurrencyPreference$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProfileManager$bitcoinAmountEntryCurrencyPreference$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfileManager$bitcoinAmountEntryCurrencyPreference$1.label;
                int i3 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentQueries instrumentQueries = this.profileQueries;
                    instrumentQueries.getClass();
                    int i4 = ProfileQueries$bitcoinAmountEntryCurrencyPreference$2.$r8$clinit;
                    SqlDriver sqlDriver = instrumentQueries.driver;
                    ProfileQueries$$ExternalSyntheticLambda2 profileQueries$$ExternalSyntheticLambda2 = new ProfileQueries$$ExternalSyntheticLambda2(instrumentQueries, i3);
                    sqlDriver.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToOneNotNull = DBUtil.mapToOneNotNull(StateFlowKt.runUntil(DBUtil.toFlow(new SimpleQuery(-632591838, new String[]{"profile"}, sqlDriver, "Profile.sq", "bitcoinAmountEntryCurrencyPreference", "SELECT bitcoin_amount_entry_currency_preference\nFROM profile", profileQueries$$ExternalSyntheticLambda2)), this.signOutSignal), this.ioDispatcher);
                    realProfileManager$bitcoinAmountEntryCurrencyPreference$1.label = 1;
                    obj = FlowKt.first(mapToOneNotNull, realProfileManager$bitcoinAmountEntryCurrencyPreference$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                bitcoin_amount_entry_currency_preference = ((BitcoinAmountEntryCurrencyPreference) obj).getBitcoin_amount_entry_currency_preference();
                if (bitcoin_amount_entry_currency_preference == null) {
                    return bitcoin_amount_entry_currency_preference;
                }
                FlowQuery$mapToList$$inlined$map$1 currencyCode = currencyCode();
                realProfileManager$bitcoinAmountEntryCurrencyPreference$1.label = 2;
                Object first = FlowKt.first(currencyCode, realProfileManager$bitcoinAmountEntryCurrencyPreference$1);
                return first == coroutineSingletons ? coroutineSingletons : first;
            }
        }
        realProfileManager$bitcoinAmountEntryCurrencyPreference$1 = new RealProfileManager$bitcoinAmountEntryCurrencyPreference$1(this, continuationImpl);
        Object obj2 = realProfileManager$bitcoinAmountEntryCurrencyPreference$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfileManager$bitcoinAmountEntryCurrencyPreference$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        bitcoin_amount_entry_currency_preference = ((BitcoinAmountEntryCurrencyPreference) obj2).getBitcoin_amount_entry_currency_preference();
        if (bitcoin_amount_entry_currency_preference == null) {
        }
    }

    public final Flow bitcoinDisplayUnits() {
        InstrumentQueries instrumentQueries = this.profileQueries;
        instrumentQueries.getClass();
        int i = ProfileQueries$btcDisplayUnits$2.$r8$clinit;
        SqlDriver sqlDriver = instrumentQueries.driver;
        ProfileQueries$$ExternalSyntheticLambda2 profileQueries$$ExternalSyntheticLambda2 = new ProfileQueries$$ExternalSyntheticLambda2(instrumentQueries, 1);
        sqlDriver.getClass();
        return FlowKt.distinctUntilChanged(new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(StateFlowKt.runUntil(DBUtil.toFlow(new SimpleQuery(1405544004, new String[]{"profile"}, sqlDriver, "Profile.sq", "btcDisplayUnits", "SELECT bitcoin_display_units\nFROM profile", profileQueries$$ExternalSyntheticLambda2)), this.signOutSignal), this.ioDispatcher), 10));
    }

    public final FlowQuery$mapToList$$inlined$map$1 currencyCode() {
        InstrumentQueries instrumentQueries = this.profileQueries;
        SqlDriver sqlDriver = instrumentQueries.driver;
        ProfileQueries$$ExternalSyntheticLambda2 profileQueries$$ExternalSyntheticLambda2 = new ProfileQueries$$ExternalSyntheticLambda2(instrumentQueries, 0);
        sqlDriver.getClass();
        return DBUtil.mapToOneNotNull(StateFlowKt.runUntil(DBUtil.toFlow(new SimpleQuery(-1202621992, new String[]{"profile"}, sqlDriver, "Profile.sq", AppsFlyerProperties.CURRENCY_CODE, "SELECT default_currency\nFROM profile", profileQueries$$ExternalSyntheticLambda2)), this.signOutSignal), this.ioDispatcher);
    }

    @Override // com.squareup.cash.treehouse.preferences.RawPreferencesService
    public final String displayUnit() {
        return (String) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new GooglePayPresenter$models$1$1(this, null, 4));
    }

    @Override // com.squareup.cash.treehouse.preferences.RawPreferencesService
    public final Flow displayUnitFlow() {
        return new RealGooglePayer$createWallet$$inlined$filter$1(bitcoinDisplayUnits(), 10);
    }

    public final FlowQuery$mapToList$$inlined$map$1 profile() {
        return DBUtil.mapToOneNotNull(StateFlowKt.runUntil(DBUtil.toFlow(this.profileQueries.select$2()), this.signOutSignal), this.ioDispatcher);
    }

    public final ChannelFlowTransformLatest publicProfile() {
        InstrumentQueries instrumentQueries = this.profileQueries;
        SafeFlow flow = DBUtil.toFlow(instrumentQueries.select$2());
        CoroutineContext coroutineContext = this.ioDispatcher;
        return Trace.selectClientSyncValues(this.featureFlagManager, SyncValueType.PUBLIC_PROFILE, new AppLockMonitor$special$$inlined$map$2(DBUtil.mapToOneNotNull(flow, coroutineContext), 10), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((SyncValueReader) this.syncValueReader.getValue()).getSingleValue(AndroidSyncValueSpecs.PublicProfile), DBUtil.mapToOneOrNull(DBUtil.toFlow(instrumentQueries.select$2()), coroutineContext), new ScreenshotReportingManager$initialize$3$1(3, null, 2), 0), 24));
    }

    public final FlowQuery$mapToList$$inlined$map$1 region() {
        return DBUtil.mapToOneNotNull(StateFlowKt.runUntil(DBUtil.toFlow(this.profileQueries.selectRegion()), this.signOutSignal), this.ioDispatcher);
    }

    public final void setBitcoinAmountEntryCurrencyPreference(CurrencyCode currencyCode) {
        currencyCode.getClass();
        JobKt.launch$default(this.scope, this.ioDispatcher, null, new RealAppConfigManager$update$2$2(this, currencyCode, null, 13), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setBitcoinDisplayPreference(BitcoinDisplayUnits bitcoinDisplayUnits, ContinuationImpl continuationImpl) {
        RealProfileManager$setBitcoinDisplayPreference$1 realProfileManager$setBitcoinDisplayPreference$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        BitcoinDisplayUnits bitcoinDisplayUnits2;
        Object bitcoinDisplayPreference;
        BitcoinDisplayUnits bitcoinDisplayUnits3;
        if (continuationImpl instanceof RealProfileManager$setBitcoinDisplayPreference$1) {
            realProfileManager$setBitcoinDisplayPreference$1 = (RealProfileManager$setBitcoinDisplayPreference$1) continuationImpl;
            int i2 = realProfileManager$setBitcoinDisplayPreference$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProfileManager$setBitcoinDisplayPreference$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProfileManager$setBitcoinDisplayPreference$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfileManager$setBitcoinDisplayPreference$1.label;
                int i3 = 14;
                CoroutineContext coroutineContext = this.ioDispatcher;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realProfileManager$setBitcoinDisplayPreference$1.L$0 = bitcoinDisplayUnits;
                    realProfileManager$setBitcoinDisplayPreference$1.label = 1;
                    Object withContext = JobKt.withContext(coroutineContext, new RealAppConfigManager$update$2$2(this, bitcoinDisplayUnits, continuation, i3), realProfileManager$setBitcoinDisplayPreference$1);
                    if (withContext != coroutineSingletons) {
                        withContext = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj2 = realProfileManager$setBitcoinDisplayPreference$1.L$2;
                            SafeTrace.throwOnFailure(obj);
                            return obj2;
                        }
                        bitcoinDisplayUnits3 = realProfileManager$setBitcoinDisplayPreference$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        if (((ApiResult) obj) instanceof ApiResult.Failure) {
                            realProfileManager$setBitcoinDisplayPreference$1.L$0 = null;
                            realProfileManager$setBitcoinDisplayPreference$1.L$1 = null;
                            realProfileManager$setBitcoinDisplayPreference$1.L$2 = obj;
                            realProfileManager$setBitcoinDisplayPreference$1.label = 3;
                            Object withContext2 = JobKt.withContext(coroutineContext, new RealAppConfigManager$update$2$2(this, bitcoinDisplayUnits3, continuation, i3), realProfileManager$setBitcoinDisplayPreference$1);
                            if (withContext2 != coroutineSingletons) {
                                withContext2 = Unit.INSTANCE;
                            }
                            if (withContext2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return obj;
                    }
                    bitcoinDisplayUnits = realProfileManager$setBitcoinDisplayPreference$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                bitcoinDisplayUnits2 = BitcoinDisplayUnits.BITCOIN;
                if (bitcoinDisplayUnits == bitcoinDisplayUnits2) {
                    bitcoinDisplayUnits2 = BitcoinDisplayUnits.SATOSHIS;
                }
                SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest = new SetBitcoinDisplayPreferenceRequest(bitcoinDisplayUnits, null, ByteString.EMPTY);
                realProfileManager$setBitcoinDisplayPreference$1.L$0 = null;
                realProfileManager$setBitcoinDisplayPreference$1.L$1 = bitcoinDisplayUnits2;
                realProfileManager$setBitcoinDisplayPreference$1.label = 2;
                bitcoinDisplayPreference = this.appService.setBitcoinDisplayPreference(setBitcoinDisplayPreferenceRequest, realProfileManager$setBitcoinDisplayPreference$1);
                if (bitcoinDisplayPreference != coroutineSingletons) {
                    BitcoinDisplayUnits bitcoinDisplayUnits4 = bitcoinDisplayUnits2;
                    obj = bitcoinDisplayPreference;
                    bitcoinDisplayUnits3 = bitcoinDisplayUnits4;
                    if (((ApiResult) obj) instanceof ApiResult.Failure) {
                    }
                    return obj;
                }
                return coroutineSingletons;
            }
        }
        realProfileManager$setBitcoinDisplayPreference$1 = new RealProfileManager$setBitcoinDisplayPreference$1(this, continuationImpl);
        Object obj3 = realProfileManager$setBitcoinDisplayPreference$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfileManager$setBitcoinDisplayPreference$1.label;
        int i32 = 14;
        CoroutineContext coroutineContext2 = this.ioDispatcher;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        bitcoinDisplayUnits2 = BitcoinDisplayUnits.BITCOIN;
        if (bitcoinDisplayUnits == bitcoinDisplayUnits2) {
        }
        SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest2 = new SetBitcoinDisplayPreferenceRequest(bitcoinDisplayUnits, null, ByteString.EMPTY);
        realProfileManager$setBitcoinDisplayPreference$1.L$0 = null;
        realProfileManager$setBitcoinDisplayPreference$1.L$1 = bitcoinDisplayUnits2;
        realProfileManager$setBitcoinDisplayPreference$1.label = 2;
        bitcoinDisplayPreference = this.appService.setBitcoinDisplayPreference(setBitcoinDisplayPreferenceRequest2, realProfileManager$setBitcoinDisplayPreference$1);
        if (bitcoinDisplayPreference != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
