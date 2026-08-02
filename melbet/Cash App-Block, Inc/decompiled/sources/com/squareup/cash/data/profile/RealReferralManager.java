package com.squareup.cash.data.profile;

import androidx.media3.common.util.StuckPlayerDetector;
import androidx.room.util.DBUtil;
import app.cash.badging.api.Badger2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.cdf.referralreward.ReferralRewardReceiveViewProgress;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.referrals.RewardStatus;
import com.squareup.cash.db2.referrals.RewardStatusQueries$select$2;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.treehouse.android.broadway.RealTreehouseNavigatorFactory;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.Moneys;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealReferralManager {
    public static final RewardStatus DEFAULT = new RewardStatus(1, false, 1, false, null, 0, null, null, 0, 0, Moneys.zero(CurrencyCode.USD), RewardStatus.Expiration.VALID, null, null);
    public final Analytics analytics;
    public final AppService appService;
    public final Badger2 badger2;
    public final CoroutineContext ioDispatcher;
    public final GpsConfigQueries queries;
    public final KeyValue referralStatusViewed;
    public final TimeToLiveSyncState referralSyncState;
    public final BooleanPreference shouldCallGetRewardStatus;
    public final Signal signOutSignal;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider analytics;
        public final Provider appService;
        public final Provider badger2;
        public final Provider cashDatabase;
        public final Provider ioDispatcher;
        public final Provider referralStatusViewed;
        public final Provider referralSyncState;
        public final Provider shouldCallGetRewardStatus;
        public final Provider signOutSignal;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, DoubleCheck doubleCheck, Provider provider5, Provider provider6, Provider provider7, Provider provider8, int i) {
            this.$r8$classId = i;
            this.appService = provider;
            this.analytics = provider2;
            this.referralSyncState = provider3;
            this.ioDispatcher = provider4;
            this.signOutSignal = doubleCheck;
            this.shouldCallGetRewardStatus = provider5;
            this.referralStatusViewed = provider6;
            this.badger2 = provider7;
            this.cashDatabase = provider8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.cashDatabase;
            Provider provider2 = this.badger2;
            Provider provider3 = this.referralStatusViewed;
            Provider provider4 = this.shouldCallGetRewardStatus;
            Provider provider5 = this.signOutSignal;
            Provider provider6 = this.ioDispatcher;
            Provider provider7 = this.referralSyncState;
            Provider provider8 = this.analytics;
            Provider provider9 = this.appService;
            switch (i) {
                case 0:
                    AppService appService = (AppService) provider9.invoke();
                    Analytics analytics = (Analytics) provider8.invoke();
                    TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) provider7.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider6.invoke();
                    Signal signal = (Signal) provider5.invoke();
                    BooleanPreference booleanPreference = (BooleanPreference) provider4.invoke();
                    KeyValue keyValue = (KeyValue) provider3.invoke();
                    Badger2 badger2 = (Badger2) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    appService.getClass();
                    analytics.getClass();
                    timeToLiveSyncState.getClass();
                    coroutineContext.getClass();
                    signal.getClass();
                    booleanPreference.getClass();
                    keyValue.getClass();
                    badger2.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return new RealReferralManager(appService, analytics, timeToLiveSyncState, coroutineContext, signal, booleanPreference, keyValue, badger2, cashAccountDatabaseImpl);
                case 1:
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider9.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider8.invoke();
                    RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) provider7.invoke();
                    RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) provider6.invoke();
                    CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) provider5.invoke();
                    RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) provider4.invoke();
                    RealDependentBalancesStore realDependentBalancesStore = (RealDependentBalancesStore) provider3.invoke();
                    RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    realJurisdictionConfigManager.getClass();
                    realProfileManager.getClass();
                    realCryptoBalanceRepo.getClass();
                    realBitcoinFormatter.getClass();
                    currencyConverter$Factory.getClass();
                    realBitcoinProfileRepo.getClass();
                    realDependentBalancesStore.getClass();
                    realDependentCustomerTokenRepository.getClass();
                    factory.getClass();
                    return new StuckPlayerDetector(realJurisdictionConfigManager, realProfileManager, realCryptoBalanceRepo, realBitcoinFormatter, currencyConverter$Factory, realBitcoinProfileRepo, realDependentBalancesStore, realDependentCustomerTokenRepository, factory);
                default:
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider9.invoke();
                    RealClientRouteFormatter realClientRouteFormatter = (RealClientRouteFormatter) provider8.invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) provider7.invoke();
                    ClientRoutesConfig clientRoutesConfig = (ClientRoutesConfig) provider6.invoke();
                    TreehouseScreenFactory treehouseScreenFactory = (TreehouseScreenFactory) provider5.invoke();
                    RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) provider4.invoke();
                    FlowStarter flowStarter = (FlowStarter) provider3.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    realRouter$Factory$Impl.getClass();
                    realClientRouteFormatter.getClass();
                    realClientRouteParser.getClass();
                    clientRoutesConfig.getClass();
                    treehouseScreenFactory.getClass();
                    realMoneyNavigatorHelper.getClass();
                    flowStarter.getClass();
                    blockersDataNavigator.getClass();
                    coroutineContext2.getClass();
                    return new RealTreehouseNavigatorFactory(realRouter$Factory$Impl, realClientRouteFormatter, realClientRouteParser, clientRoutesConfig, treehouseScreenFactory, realMoneyNavigatorHelper, flowStarter, blockersDataNavigator, coroutineContext2);
            }
        }
    }

    public RealReferralManager(AppService appService, Analytics analytics, TimeToLiveSyncState timeToLiveSyncState, CoroutineContext coroutineContext, Signal signal, BooleanPreference booleanPreference, KeyValue keyValue, Badger2 badger2, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.appService = appService;
        this.analytics = analytics;
        this.referralSyncState = timeToLiveSyncState;
        this.ioDispatcher = coroutineContext;
        this.signOutSignal = signal;
        this.shouldCallGetRewardStatus = booleanPreference;
        this.referralStatusViewed = keyValue;
        this.badger2 = badger2;
        this.queries = cashAccountDatabaseImpl.rewardStatusQueries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r8.referralStatusViewed.set(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (((app.cash.badging.backend.RealBadger2) r8.badger2).clear(r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object referralStatusRowSeen(ContinuationImpl continuationImpl) {
        RealReferralManager$referralStatusRowSeen$1 realReferralManager$referralStatusRowSeen$1;
        int i;
        if (continuationImpl instanceof RealReferralManager$referralStatusRowSeen$1) {
            realReferralManager$referralStatusRowSeen$1 = (RealReferralManager$referralStatusRowSeen$1) continuationImpl;
            int i2 = realReferralManager$referralStatusRowSeen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realReferralManager$referralStatusRowSeen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realReferralManager$referralStatusRowSeen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realReferralManager$referralStatusRowSeen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.analytics.track(new ReferralRewardReceiveViewProgress(), null);
                    Badger2.Badge[] badgeArr = {new Badger2.Badge("DEFAULT", ItemType.PROFILE_PENDING_REFERRAL, 1L)};
                    realReferralManager$referralStatusRowSeen$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Boolean bool = Boolean.TRUE;
                realReferralManager$referralStatusRowSeen$1.label = 2;
            }
        }
        realReferralManager$referralStatusRowSeen$1 = new RealReferralManager$referralStatusRowSeen$1(this, continuationImpl);
        Object obj2 = realReferralManager$referralStatusRowSeen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realReferralManager$referralStatusRowSeen$1.label;
        if (i != 0) {
        }
        Boolean bool2 = Boolean.TRUE;
        realReferralManager$referralStatusRowSeen$1.label = 2;
    }

    public final Object refresh(boolean z, Continuation continuation) {
        return JobKt.withContext(this.ioDispatcher, new RealBoostSyncer$refresh$1(this, z, (Continuation) null, 5), continuation);
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 rewardStatus() {
        GpsConfigQueries gpsConfigQueries = this.queries;
        gpsConfigQueries.getClass();
        RewardStatusQueries$select$2 rewardStatusQueries$select$2 = RewardStatusQueries$select$2.INSTANCE;
        SqlDriver sqlDriver = gpsConfigQueries.driver;
        RecipientQueries$$ExternalSyntheticLambda0 recipientQueries$$ExternalSyntheticLambda0 = new RecipientQueries$$ExternalSyntheticLambda0(gpsConfigQueries);
        sqlDriver.getClass();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(DBUtil.mapToOneOrDefault(DBUtil.toFlow(new SimpleQuery(504262715, new String[]{"rewardStatus"}, sqlDriver, "RewardStatus.sq", "select", "SELECT rewardStatus.id, rewardStatus.code_entry_enabled, rewardStatus.minimum_code_length, rewardStatus.reward_screen_enabled, rewardStatus.reward_button_text, rewardStatus.reward_button_priority, rewardStatus.reward_header_text, rewardStatus.reward_main_text, rewardStatus.completed_reward_payments, rewardStatus.available_reward_payments, rewardStatus.reward_payment_amount, rewardStatus.expiration, rewardStatus.code_entry_client_route, rewardStatus.referral_status_screen\nFROM rewardStatus", recipientQueries$$ExternalSyntheticLambda0)), DEFAULT, this.ioDispatcher), this.referralStatusViewed.observe(), new InteractiveCardView$flingTo$1.AnonymousClass1(1), 0);
    }
}
