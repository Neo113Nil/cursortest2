package com.squareup.cash.data.db;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView$1$2$2;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo$special$$inlined$map$1;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.BankingConfig;
import com.squareup.cash.db2.BlockersConfigQueries$selectAll$2;
import com.squareup.cash.db2.CashLiteConfigQueries$select$2;
import com.squareup.cash.db2.ClientRoutingConfigQueries$selectAll$2;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.OfflineConfigQueries$select$2;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.StampsConfigQueries$select$2;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.WebLoginConfigQueries$expiresAt$2;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataManager;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.treehouse.appconfig.RawAppConfigService;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.semaphore.api.SemaphoreService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.app.GetAppConfigRequest;
import com.squareup.protos.franklin.app.GetAppConfigResponse;
import com.squareup.protos.franklin.common.ClientData;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okio.AsyncTimeout;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealAppConfigManager implements AppConfigManager, RawAppConfigService {
    public final AppService appService;
    public final LocalTabContentQueries bankingConfigQueries;
    public final CryptoAutoInvestRepo bitcoinAutoInvestRepo;
    public final SessionQueries bitcoinCustomerIdQueries;
    public final RealBitcoinProfileRepo bitcoinProfileRepo;
    public final LocalTabContentQueries blockersConfigQueries;
    public final BugsnagClient bugsnagClient;
    public final LocalTabContentQueries cashLiteConfigQueries;
    public final LocalTabContentQueries clientRouteConfigQueries;
    public final AndroidClock clock;
    public final SessionQueries cryptocurrencyConfigQueries;
    public final InstrumentQueries institutionsConfigQueries;
    public final InstrumentQueries instrumentLinkingConfigQueries;
    public final InstrumentQueries invitationConfigQueries;
    public final CoroutineContext ioDispatcher;
    public long lastUpdated;
    public final GpsConfigQueries localizationConfigQueries;
    public final SessionQueries loyaltyHiddenPaymentTypesQueries;
    public final RealMarketCapabilitiesDataManager marketCapabilitiesDataManager;
    public final RealObservabilityManager observabilityManager;
    public final InstrumentQueries offlineConfigQueries;
    public final InstrumentQueries paymentHistoryConfigQueries;
    public final InstrumentQueries reactionConfigQueries;
    public final InstrumentQueries recipientConfigQueries;
    public final CoroutineScope scope;
    public final SemaphoreService semaphoreService;
    public final Signal signOutSignal;
    public final InstrumentQueries stampsConfigQueries;
    public final AndroidStringManager stringManager;
    public final SessionQueries supportConfigQueries;
    public final SessionQueries treehouseAppConfigQueries;
    public final MutexImpl update = new MutexImpl();
    public final SessionQueries webLoginConfigQueries;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetAppConfigResponse.Status.values().length];
            try {
                AsyncTimeout.Companion companion = GetAppConfigResponse.Status.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealAppConfigManager(AndroidStringManager androidStringManager, AndroidClock androidClock, AppService appService, SemaphoreService semaphoreService, Signal signal, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, RealMarketCapabilitiesDataManager realMarketCapabilitiesDataManager, BugsnagClient bugsnagClient, RealObservabilityManager realObservabilityManager, RealBitcoinProfileRepo realBitcoinProfileRepo, CryptoAutoInvestRepo cryptoAutoInvestRepo, CoroutineScope coroutineScope, CashAccountDatabaseImpl cashAccountDatabaseImpl2) {
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.appService = appService;
        this.semaphoreService = semaphoreService;
        this.signOutSignal = signal;
        this.ioDispatcher = coroutineContext;
        this.marketCapabilitiesDataManager = realMarketCapabilitiesDataManager;
        this.bugsnagClient = bugsnagClient;
        this.observabilityManager = realObservabilityManager;
        this.bitcoinProfileRepo = realBitcoinProfileRepo;
        this.bitcoinAutoInvestRepo = cryptoAutoInvestRepo;
        this.scope = coroutineScope;
        this.blockersConfigQueries = cashAccountDatabaseImpl.blockersConfigQueries;
        this.instrumentLinkingConfigQueries = cashAccountDatabaseImpl.instrumentLinkingConfigQueries;
        this.offlineConfigQueries = cashAccountDatabaseImpl.offlineConfigQueries;
        this.webLoginConfigQueries = cashAccountDatabaseImpl.webLoginConfigQueries;
        this.supportConfigQueries = cashAccountDatabaseImpl.supportConfigQueries;
        this.stampsConfigQueries = cashAccountDatabaseImpl.stampsConfigQueries;
        this.paymentHistoryConfigQueries = cashAccountDatabaseImpl.paymentHistoryConfigQueries;
        this.bitcoinCustomerIdQueries = cashAccountDatabaseImpl.bitcoinTransactionCustomerIdsQueries;
        this.cryptocurrencyConfigQueries = cashAccountDatabaseImpl.cryptocurrencyConfigQueries;
        this.invitationConfigQueries = cashAccountDatabaseImpl.invitationConfigQueries;
        this.institutionsConfigQueries = cashAccountDatabaseImpl.institutionsConfigQueries;
        this.recipientConfigQueries = cashAccountDatabaseImpl.recipientConfigQueries;
        this.reactionConfigQueries = cashAccountDatabaseImpl.reactionConfigQueries;
        this.bankingConfigQueries = cashAccountDatabaseImpl.bankingConfigQueries;
        this.treehouseAppConfigQueries = cashAccountDatabaseImpl.treehouseAppConfigQueries;
        this.loyaltyHiddenPaymentTypesQueries = cashAccountDatabaseImpl.loyaltyHiddenPaymentTypesQueries;
        this.cashLiteConfigQueries = cashAccountDatabaseImpl.cashLiteConfigQueries;
        this.clientRouteConfigQueries = cashAccountDatabaseImpl.clientRoutingConfigQueries;
        this.localizationConfigQueries = cashAccountDatabaseImpl2.localizationConfigQueries;
    }

    public static final Object access$updateWebLoginConfig(RealAppConfigManager realAppConfigManager, SuspendLambda suspendLambda) {
        SessionQueries sessionQueries = realAppConfigManager.webLoginConfigQueries;
        sessionQueries.getClass();
        WebLoginConfigQueries$expiresAt$2 webLoginConfigQueries$expiresAt$2 = WebLoginConfigQueries$expiresAt$2.INSTANCE;
        SqlDriver sqlDriver = sessionQueries.driver;
        WebLoginConfigQueries$$ExternalSyntheticLambda2 webLoginConfigQueries$$ExternalSyntheticLambda2 = new WebLoginConfigQueries$$ExternalSyntheticLambda2(0);
        sqlDriver.getClass();
        Object collect = StateFlowKt.runUntil(new RealTransferManager$addCash$$inlined$map$1(FlowKt.take(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-1337524982, new String[]{"webLoginConfig"}, sqlDriver, "WebLoginConfig.sq", "expiresAt", "SELECT expires_at\nFROM webLoginConfig", webLoginConfigQueries$$ExternalSyntheticLambda2)), realAppConfigManager.ioDispatcher), 1), realAppConfigManager, 19), realAppConfigManager.signOutSignal).collect(new CardModelView$1$2$2(realAppConfigManager, 24), suspendLambda);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public static ClientData createClientData(BitcoinDisplayUnits bitcoinDisplayUnits, AndroidClock androidClock, ScheduledTransactionPreference scheduledTransactionPreference) {
        ClientData.Builder current_timezone = new ClientData.Builder().current_timezone_offset_minutes(Long.valueOf(-(androidClock.timeZone().getOffset(androidClock.millis()) / 60000))).current_timezone(androidClock.timeZone().getID());
        Boolean bool = Boolean.TRUE;
        return current_timezone.flat_activity(bool).details_sheet_receipts(bool).feature_flags(EmptyList.INSTANCE).bitcoin_display_units(bitcoinDisplayUnits).bitcoin_auto_invest_preference(scheduledTransactionPreference).build();
    }

    @Override // com.squareup.cash.treehouse.appconfig.RawAppConfigService
    public final ByteString bankingConfigByteString() {
        RealAppConfigManager$$ExternalSyntheticLambda17 realAppConfigManager$$ExternalSyntheticLambda17 = new RealAppConfigManager$$ExternalSyntheticLambda17(this, 0);
        LocalTabContentQueries localTabContentQueries = this.bankingConfigQueries;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        InstrumentQueries$$ExternalSyntheticLambda0 instrumentQueries$$ExternalSyntheticLambda0 = new InstrumentQueries$$ExternalSyntheticLambda0(8, realAppConfigManager$$ExternalSyntheticLambda17, localTabContentQueries);
        sqlDriver.getClass();
        BankingConfig bankingConfig = (BankingConfig) new SimpleQuery(1829534298, new String[]{"bankingConfig"}, sqlDriver, "BankingConfig.sq", "select", "SELECT bankingConfig.main_screen_title, bankingConfig.main_screen_balance_subtitle, bankingConfig.recurring_deposits_dda_upsell\nFROM bankingConfig", instrumentQueries$$ExternalSyntheticLambda0).executeAsOne();
        return new com.squareup.protos.franklin.app.BankingConfig(new BankingConfig.Strings(bankingConfig.getMain_screen_title(), bankingConfig.getMain_screen_balance_subtitle()), bankingConfig.getRecurring_deposits_dda_upsell()).encodeByteString();
    }

    @Override // com.squareup.cash.treehouse.appconfig.RawAppConfigService
    public final Flow bankingConfigByteStringFlow() {
        RealAppConfigManager$$ExternalSyntheticLambda17 realAppConfigManager$$ExternalSyntheticLambda17 = new RealAppConfigManager$$ExternalSyntheticLambda17(this, 1);
        LocalTabContentQueries localTabContentQueries = this.bankingConfigQueries;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        InstrumentQueries$$ExternalSyntheticLambda0 instrumentQueries$$ExternalSyntheticLambda0 = new InstrumentQueries$$ExternalSyntheticLambda0(8, realAppConfigManager$$ExternalSyntheticLambda17, localTabContentQueries);
        sqlDriver.getClass();
        return new RealTransferManager$addCash$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(1829534298, new String[]{"bankingConfig"}, sqlDriver, "BankingConfig.sq", "select", "SELECT bankingConfig.main_screen_title, bankingConfig.main_screen_balance_subtitle, bankingConfig.recurring_deposits_dda_upsell\nFROM bankingConfig", instrumentQueries$$ExternalSyntheticLambda0)), this.ioDispatcher), this, 18);
    }

    public final FinishSetupTileBadgeCounter blockersConfig() {
        LocalTabContentQueries localTabContentQueries = this.blockersConfigQueries;
        localTabContentQueries.getClass();
        int i = BlockersConfigQueries$selectAll$2.$r8$clinit;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(localTabContentQueries);
        sqlDriver.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-1330658876, new String[]{"blockersConfig"}, sqlDriver, "BlockersConfig.sq", "selectAll", "SELECT blockersConfig.address_typeahead_enabled, blockersConfig.add_cash_header_text, blockersConfig.target_balance_amount\nFROM blockersConfig", storageLinkQueries$$ExternalSyntheticLambda8)), this.ioDispatcher);
    }

    public final RealAppConfigManager$cashLiteConfig$$inlined$map$1 cashLiteConfig() {
        LocalTabContentQueries localTabContentQueries = this.cashLiteConfigQueries;
        localTabContentQueries.getClass();
        int i = CashLiteConfigQueries$select$2.$r8$clinit;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        StampsConfigQueries$$ExternalSyntheticLambda0 stampsConfigQueries$$ExternalSyntheticLambda0 = new StampsConfigQueries$$ExternalSyntheticLambda0(localTabContentQueries);
        sqlDriver.getClass();
        return new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(478265189, new String[]{"cashLiteConfig"}, sqlDriver, "CashLiteConfig.sq", "select", "SELECT config FROM cashLiteConfig", stampsConfigQueries$$ExternalSyntheticLambda0)), this.ioDispatcher), 0);
    }

    @Override // com.squareup.cash.treehouse.appconfig.RawAppConfigService
    public final Flow clientDataByteStringFlow() {
        DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 displayUnitProto = ViewShowRenderingKt.displayUnitProto(this.bitcoinProfileRepo);
        RealCryptoAutoInvestRepo realCryptoAutoInvestRepo = (RealCryptoAutoInvestRepo) this.bitcoinAutoInvestRepo;
        int i = 0;
        return new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(FlowKt.stateIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(displayUnitProto, new RealCryptoAutoInvestRepo$special$$inlined$map$1(realCryptoAutoInvestRepo.getPreferenceQuery(), realCryptoAutoInvestRepo, i), new CardModelView$getActiveHeat$2$2(this, (Continuation) null, 7), i), this.scope, SharingStarted.Companion.Eagerly, createClientData(BitcoinDisplayUnits.BITCOIN, this.clock, null)), 29);
    }

    public final FinishSetupTileBadgeCounter clientRouteConfig() {
        LocalTabContentQueries localTabContentQueries = this.clientRouteConfigQueries;
        localTabContentQueries.getClass();
        int i = ClientRoutingConfigQueries$selectAll$2.$r8$clinit;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(localTabContentQueries, (byte) 0);
        sqlDriver.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-656901518, new String[]{"clientRoutingConfig"}, sqlDriver, "ClientRoutingConfig.sq", "selectAll", "SELECT clientRoutingConfig.client_route_rules, clientRoutingConfig.deep_link_rules FROM clientRoutingConfig", storageLinkQueries$$ExternalSyntheticLambda8)), this.ioDispatcher);
    }

    public final FinishSetupTileBadgeCounter instrumentLinkingConfig() {
        RealAppConfigManager$$ExternalSyntheticLambda1 realAppConfigManager$$ExternalSyntheticLambda1 = new RealAppConfigManager$$ExternalSyntheticLambda1(this);
        InstrumentQueries instrumentQueries = this.instrumentLinkingConfigQueries;
        instrumentQueries.getClass();
        SqlDriver sqlDriver = instrumentQueries.driver;
        Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(29, realAppConfigManager$$ExternalSyntheticLambda1, instrumentQueries);
        sqlDriver.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(846346741, new String[]{"instrumentLinkingConfig"}, sqlDriver, "InstrumentLinkingConfig.sq", "select", "SELECT instrumentLinkingConfig.header_no_instrument_linked, instrumentLinkingConfig.description_no_instrument_linked, instrumentLinkingConfig.header_bank_account_linked, instrumentLinkingConfig.description_bank_account_linked, instrumentLinkingConfig.header_no_instrument_linked_personal, instrumentLinkingConfig.description_no_instrument_linked_personal, instrumentLinkingConfig.credit_card_fee_bps, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.max_credit_prompts, instrumentLinkingConfig.cash_balance_enabled, instrumentLinkingConfig.issued_cards_enabled, instrumentLinkingConfig.bankbook_enabled, instrumentLinkingConfig.issued_card_disabled_style, instrumentLinkingConfig.physical_issued_cards_enabled, instrumentLinkingConfig.nfc_card_linking_enabled, instrumentLinkingConfig.bank_account_linking_config\nFROM instrumentLinkingConfig", recomposer$$ExternalSyntheticLambda4)), this.ioDispatcher);
    }

    public final FinishSetupTileBadgeCounter invitationConfig() {
        RealAppConfigManager$$ExternalSyntheticLambda0 realAppConfigManager$$ExternalSyntheticLambda0 = new RealAppConfigManager$$ExternalSyntheticLambda0(this);
        InstrumentQueries instrumentQueries = this.invitationConfigQueries;
        instrumentQueries.getClass();
        SqlDriver sqlDriver = instrumentQueries.driver;
        ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3 = new ViewTreeObservers$$ExternalSyntheticLambda3(2, realAppConfigManager$$ExternalSyntheticLambda0, instrumentQueries);
        sqlDriver.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(1255039613, new String[]{"invitationConfig"}, sqlDriver, "InvitationConfig.sq", "select", "SELECT invitationConfig.enabled, invitationConfig.bounty_amount, invitationConfig.welcome_amount, invitationConfig.header, invitationConfig.preview_message, invitationConfig.message_template, invitationConfig.invite_all_enabled, invitationConfig.reward_code, invitationConfig.reward_code_url, invitationConfig.share_text, invitationConfig.header_link_display_text, invitationConfig.profile_button_text, invitationConfig.activity_button_text, invitationConfig.preview_message_by_country, invitationConfig.profile_row_title, invitationConfig.profile_row_subtitle, invitationConfig.standalone_invite_friends_cta, invitationConfig.short_invite_friends_cta\nFROM invitationConfig", viewTreeObservers$$ExternalSyntheticLambda3)), this.ioDispatcher);
    }

    public final FinishSetupTileBadgeCounter offlineConfig() {
        InstrumentQueries instrumentQueries = this.offlineConfigQueries;
        instrumentQueries.getClass();
        OfflineConfigQueries$select$2 offlineConfigQueries$select$2 = OfflineConfigQueries$select$2.INSTANCE;
        SqlDriver sqlDriver = instrumentQueries.driver;
        StampsConfigQueries$$ExternalSyntheticLambda0 stampsConfigQueries$$ExternalSyntheticLambda0 = new StampsConfigQueries$$ExternalSyntheticLambda0(instrumentQueries);
        sqlDriver.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-1280027113, new String[]{"offlineConfig"}, sqlDriver, "OfflineConfig.sq", "select", "SELECT offlineConfig.enabled, offlineConfig.external_status_url, offlineConfig.attempted_payment_status_result, offlineConfig.offline_payment_status_result, offlineConfig.attempted_bill_status_result, offlineConfig.offline_bill_status_result, offlineConfig.attempted_cash_out_status_result, offlineConfig.offline_cash_out_status_result, offlineConfig.attempted_add_cash_status_result, offlineConfig.offline_add_cash_status_result, offlineConfig.retry_intervals, offlineConfig.error_cash_out_status_result, offlineConfig.error_add_cash_status_result, offlineConfig.offline_transfer_scenario_plan, offlineConfig.error_transfer_scenario_plan\nFROM offlineConfig", stampsConfigQueries$$ExternalSyntheticLambda0)), this.ioDispatcher);
    }

    public final FinishSetupTileBadgeCounter stampConfig() {
        InstrumentQueries instrumentQueries = this.stampsConfigQueries;
        instrumentQueries.getClass();
        int i = StampsConfigQueries$select$2.$r8$clinit;
        SqlDriver sqlDriver = instrumentQueries.driver;
        StampsConfigQueries$$ExternalSyntheticLambda0 stampsConfigQueries$$ExternalSyntheticLambda0 = new StampsConfigQueries$$ExternalSyntheticLambda0(instrumentQueries, (byte) 0);
        sqlDriver.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(1471806964, new String[]{"stampsConfig"}, sqlDriver, "StampsConfig.sq", "select", "SELECT stampsConfig.stamps\nFROM stampsConfig", stampsConfigQueries$$ExternalSyntheticLambda0)), this.ioDispatcher);
    }

    public final FinishSetupTileBadgeCounter supportConfig() {
        RealAppConfigManager$$ExternalSyntheticLambda6 realAppConfigManager$$ExternalSyntheticLambda6 = new RealAppConfigManager$$ExternalSyntheticLambda6(0);
        SessionQueries sessionQueries = this.supportConfigQueries;
        sessionQueries.getClass();
        SqlDriver sqlDriver = sessionQueries.driver;
        StampsConfigQueries$$ExternalSyntheticLambda0 stampsConfigQueries$$ExternalSyntheticLambda0 = new StampsConfigQueries$$ExternalSyntheticLambda0(realAppConfigManager$$ExternalSyntheticLambda6, 12);
        sqlDriver.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(436268702, new String[]{"supportConfig"}, sqlDriver, "SupportConfig.sq", "selectAll", "SELECT supportConfig.privacy_policy_url, supportConfig.terms_of_service_url\nFROM supportConfig", stampsConfigQueries$$ExternalSyntheticLambda0)), this.ioDispatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:26:0x004d, B:28:0x00e5, B:30:0x00eb, B:32:0x00f5, B:33:0x00f7, B:35:0x0102, B:39:0x0126, B:40:0x0137, B:41:0x0138), top: B:25:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:26:0x004d, B:28:0x00e5, B:30:0x00eb, B:32:0x00f5, B:33:0x00f7, B:35:0x0102, B:39:0x0126, B:40:0x0137, B:41:0x0138), top: B:25:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update(boolean z, ContinuationImpl continuationImpl) {
        RealAppConfigManager$update$1 realAppConfigManager$update$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Mutex mutex;
        boolean z2;
        int i2;
        Mutex mutex2;
        Object appConfig;
        int i3;
        int i4;
        boolean z3;
        Mutex mutex3;
        ApiResult apiResult;
        if (continuationImpl instanceof RealAppConfigManager$update$1) {
            realAppConfigManager$update$1 = (RealAppConfigManager$update$1) continuationImpl;
            int i5 = realAppConfigManager$update$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                realAppConfigManager$update$1.label = i5 - PKIFailureInfo.systemUnavail;
                Object obj = realAppConfigManager$update$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAppConfigManager$update$1.label;
                int i6 = 0;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutexImpl mutexImpl = this.update;
                    realAppConfigManager$update$1.L$0 = mutexImpl;
                    realAppConfigManager$update$1.Z$0 = z;
                    realAppConfigManager$update$1.I$0 = 0;
                    realAppConfigManager$update$1.label = 1;
                    if (mutexImpl.lock(realAppConfigManager$update$1) != coroutineSingletons) {
                        mutex = mutexImpl;
                        z2 = z;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        int i7 = realAppConfigManager$update$1.I$1;
                        int i8 = realAppConfigManager$update$1.I$0;
                        boolean z4 = realAppConfigManager$update$1.Z$0;
                        mutex3 = realAppConfigManager$update$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            z3 = z4;
                            i3 = i8;
                            i4 = i7;
                            appConfig = obj;
                            apiResult = (ApiResult) appConfig;
                            if (apiResult instanceof ApiResult.Success) {
                                Timber.Forest.e("Failed to update app config due to " + apiResult, new Object[0]);
                                mutex = mutex3;
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            }
                            GetAppConfigResponse getAppConfigResponse = (GetAppConfigResponse) ((ApiResult.Success) apiResult).response;
                            GetAppConfigResponse.Status status = getAppConfigResponse.status;
                            if (status == null) {
                                status = ProtoDefaults.GET_APP_CONFIG_STATUS;
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[status.ordinal()] != 1) {
                                throw new IllegalArgumentException("Unknown status: " + status);
                            }
                            Timber.Forest.d("Successfully updated app config.", new Object[0]);
                            CoroutineContext coroutineContext = this.ioDispatcher;
                            RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(this, getAppConfigResponse, continuation, i6);
                            realAppConfigManager$update$1.L$0 = mutex3;
                            realAppConfigManager$update$1.Z$0 = z3;
                            realAppConfigManager$update$1.I$0 = i3;
                            realAppConfigManager$update$1.I$1 = i4;
                            realAppConfigManager$update$1.label = 3;
                            if (JobKt.withContext(coroutineContext, realAppConfigManager$update$2$2, realAppConfigManager$update$1) != coroutineSingletons) {
                                mutex2 = mutex3;
                                mutex = mutex2;
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            mutex2 = mutex3;
                        }
                    } else {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = realAppConfigManager$update$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutex = mutex2;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    mutex2.unlock(null);
                    throw th;
                }
                i2 = realAppConfigManager$update$1.I$0;
                z2 = realAppConfigManager$update$1.Z$0;
                mutex = realAppConfigManager$update$1.L$0;
                SafeTrace.throwOnFailure(obj);
                if (!z2) {
                    try {
                        long millis = this.clock.millis() - this.lastUpdated;
                        AppConfigManager.Companion.getClass();
                        if (millis < Duration.m4167getInWholeMillisecondsimpl(AppConfigManager.Companion.TTL)) {
                            Timber.Forest.d("Not updating app config. Last update was at " + this.lastUpdated, new Object[0]);
                            JobKt.launch$default(this.scope, null, null, new RealAppConfigManager$update$2$1(this, continuation, i6), 3);
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        mutex2 = mutex;
                    }
                }
                Timber.Forest.d("Updating app config...", new Object[0]);
                SemaphoreService semaphoreService = this.semaphoreService;
                GetAppConfigRequest getAppConfigRequest = new GetAppConfigRequest(ByteString.EMPTY);
                realAppConfigManager$update$1.L$0 = mutex;
                realAppConfigManager$update$1.Z$0 = z2;
                realAppConfigManager$update$1.I$0 = i2;
                realAppConfigManager$update$1.I$1 = 0;
                realAppConfigManager$update$1.label = 2;
                appConfig = semaphoreService.getAppConfig(getAppConfigRequest, realAppConfigManager$update$1);
                if (appConfig != coroutineSingletons) {
                    i3 = i2;
                    i4 = 0;
                    z3 = z2;
                    mutex3 = mutex;
                    apiResult = (ApiResult) appConfig;
                    if (apiResult instanceof ApiResult.Success) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realAppConfigManager$update$1 = new RealAppConfigManager$update$1(this, continuationImpl);
        Object obj2 = realAppConfigManager$update$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAppConfigManager$update$1.label;
        int i62 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!z2) {
        }
        Timber.Forest.d("Updating app config...", new Object[0]);
        SemaphoreService semaphoreService2 = this.semaphoreService;
        GetAppConfigRequest getAppConfigRequest2 = new GetAppConfigRequest(ByteString.EMPTY);
        realAppConfigManager$update$1.L$0 = mutex;
        realAppConfigManager$update$1.Z$0 = z2;
        realAppConfigManager$update$1.I$0 = i2;
        realAppConfigManager$update$1.I$1 = 0;
        realAppConfigManager$update$1.label = 2;
        appConfig = semaphoreService2.getAppConfig(getAppConfigRequest2, realAppConfigManager$update$1);
        if (appConfig != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
