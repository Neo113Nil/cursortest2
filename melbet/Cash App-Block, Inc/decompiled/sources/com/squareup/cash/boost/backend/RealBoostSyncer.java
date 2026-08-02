package com.squareup.cash.boost.backend;

import android.content.Context;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.loader.ManifestVerifier;
import app.cash.zipline.loader.ZiplineHttpClient;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.aiedge.MLKitTitleGenerator$isAvailable$1;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda10;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BusinessAccountBoostDataShortCircuit;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.treehouse.android.RealTreehouseEventListener;
import com.squareup.cash.treehouse.android.TreehouseModule;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.platform.AndroidPlatformServiceFactory;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.protos.franklin.common.SyncRewardSelection;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.rewardly.app.RewardlyExternalAppService;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealBoostSyncer extends SyncEntityStorageObserver implements BoostSyncer {
    public final SessionQueries activeRewardTokenOverrideQueries;
    public final AndroidClock clock;
    public final RealFeatureEligibilityRepository eligibilityRepository;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioCoroutineContext;
    public long lastUpdated;
    public final SessionQueries orderedRewardTokenQueries;
    public final SessionQueries rewardMerchantQueries;
    public final RewardQueries rewardQueries;
    public final LocalTabContentQueries rewardSelectionQueries;
    public final RewardSlotQueries rewardSlotQueries;
    public final CoroutineScope scope;
    public final RewardQueries selectableRewardQueries;
    public final SessionQueries selectedRewardQueries;
    public final RewardlyExternalAppService service;
    public final Signal signOutSignal;
    public final LocalTabContentQueries userRewardsDataQueries;

    public RealBoostSyncer(AndroidClock androidClock, RewardlyExternalAppService rewardlyExternalAppService, FeatureFlagManager featureFlagManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository, Signal signal, CoroutineContext coroutineContext, CoroutineScope coroutineScope, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        super(AndroidSyncValueSpecs.RewardSelection);
        this.clock = androidClock;
        this.service = rewardlyExternalAppService;
        this.featureFlagManager = featureFlagManager;
        this.eligibilityRepository = realFeatureEligibilityRepository;
        this.signOutSignal = signal;
        this.ioCoroutineContext = coroutineContext;
        this.scope = coroutineScope;
        this.userRewardsDataQueries = cashAccountDatabaseImpl.userRewardsDataQueries;
        this.rewardSlotQueries = cashAccountDatabaseImpl.rewardSlotQueries;
        this.selectedRewardQueries = cashAccountDatabaseImpl.selectedRewardQueries;
        this.selectableRewardQueries = cashAccountDatabaseImpl.selectableRewardQueries;
        this.rewardSelectionQueries = cashAccountDatabaseImpl.rewardSelectionQueries;
        this.rewardQueries = cashAccountDatabaseImpl.rewardQueries;
        this.rewardMerchantQueries = cashAccountDatabaseImpl.rewardMerchantQueries;
        this.orderedRewardTokenQueries = cashAccountDatabaseImpl.orderedRewardTokenQueries;
        this.activeRewardTokenOverrideQueries = cashAccountDatabaseImpl.activeRewardOverrideQueries;
    }

    public final void nonatomicInsertRewardSelection(RewardSelection rewardSelection) {
        String str;
        String str2 = rewardSelection.token;
        String str3 = rewardSelection.reward_token;
        if (str2 == null) {
            str3.getClass();
            str = str3;
        } else {
            str = str2;
        }
        str3.getClass();
        Long l = rewardSelection.version;
        l.getClass();
        long longValue = l.longValue();
        String str4 = rewardSelection.token;
        LocalTabContentQueries localTabContentQueries = this.rewardSelectionQueries;
        if (str4 != null) {
            localTabContentQueries.getClass();
            localTabContentQueries.driver.execute(805449512, "DELETE FROM rewardSelection\nWHERE token = ?\nAND version <= ?", new StorageLinkQueries$$ExternalSyntheticLambda13(str, longValue, 2));
            localTabContentQueries.notifyQueries(805449512, new RewardQueries$$ExternalSyntheticLambda4(15));
            localTabContentQueries.deleteForToken(str3);
        } else {
            localTabContentQueries.getClass();
            if (((Number) new RewardQueries.ForIdsQuery(localTabContentQueries, str3, new RewardQueries$$ExternalSyntheticLambda4(17)).executeAsOne()).longValue() > 0) {
                return;
            }
        }
        localTabContentQueries.getClass();
        localTabContentQueries.driver.execute(1826866581, "INSERT OR IGNORE INTO rewardSelection\nVALUES (?, ?, ?, ?)", new BadgeQueries$$ExternalSyntheticLambda3(str, str3, longValue, localTabContentQueries, rewardSelection));
        localTabContentQueries.notifyQueries(1826866581, new RewardQueries$$ExternalSyntheticLambda4(18));
    }

    public final void nonatomicResetRewards(RewardsData rewardsData, boolean z) {
        Boolean bool;
        Boolean bool2;
        final boolean z2 = false;
        final boolean booleanValue = (rewardsData == null || (bool2 = rewardsData.new_to_boost) == null) ? false : bool2.booleanValue();
        if (rewardsData != null && (bool = rewardsData.has_recently_used_boost) != null) {
            z2 = bool.booleanValue();
        }
        final Money money = rewardsData != null ? rewardsData.ytd_total_saving : null;
        final LocalTabContentQueries localTabContentQueries = this.userRewardsDataQueries;
        localTabContentQueries.driver.execute(602793957, "UPDATE userRewardsData\nSET new_to_boost = ?,\n    has_recently_used_boost = ?,\n    ytd_total_saving = ?", new Function1() { // from class: com.squareup.cash.boost.db.UserRewardsDataQueries$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBoolean(0, Boolean.valueOf(booleanValue));
                androidStatement.bindBoolean(1, Boolean.valueOf(z2));
                Money money2 = money;
                androidStatement.bindBytes(2, money2 != null ? (byte[]) ((BlockersConfig.Adapter) localTabContentQueries.local_tab_contentAdapter).target_balance_amountAdapter.encode(money2) : null);
                return Unit.INSTANCE;
            }
        });
        localTabContentQueries.notifyQueries(602793957, new Matcher$$ExternalSyntheticLambda10(9));
        RewardSlotQueries rewardSlotQueries = this.rewardSlotQueries;
        rewardSlotQueries.driver.execute(1912812764, "DELETE FROM rewardSlot", null);
        rewardSlotQueries.notifyQueries(1912812764, new Matcher$$ExternalSyntheticLambda10(6));
        SessionQueries sessionQueries = this.selectedRewardQueries;
        sessionQueries.driver.execute(480996255, "DELETE FROM selectedReward", null);
        sessionQueries.notifyQueries(480996255, new Matcher$$ExternalSyntheticLambda10(8));
        RewardQueries rewardQueries = this.selectableRewardQueries;
        rewardQueries.driver.execute(633499076, "DELETE FROM selectableReward", null);
        rewardQueries.notifyQueries(633499076, new Matcher$$ExternalSyntheticLambda10(7));
        SessionQueries sessionQueries2 = this.rewardMerchantQueries;
        sessionQueries2.driver.execute(1944187986, "DELETE FROM rewardMerchant", null);
        sessionQueries2.notifyQueries(1944187986, new Matcher$$ExternalSyntheticLambda10(3));
        SessionQueries sessionQueries3 = this.orderedRewardTokenQueries;
        sessionQueries3.driver.execute(-1913179572, "DELETE FROM orderedRewardToken", null);
        sessionQueries3.notifyQueries(-1913179572, new Matcher$$ExternalSyntheticLambda10(2));
        this.activeRewardTokenOverrideQueries.deleteAll();
        RewardQueries rewardQueries2 = this.rewardQueries;
        rewardQueries2.driver.execute(1815518010, "DELETE FROM reward", null);
        rewardQueries2.notifyQueries(1815518010, new Matcher$$ExternalSyntheticLambda10(4));
        if (z) {
            LocalTabContentQueries localTabContentQueries2 = this.rewardSelectionQueries;
            localTabContentQueries2.driver.execute(1852605738, "DELETE FROM rewardSelection", null);
            localTabContentQueries2.notifyQueries(1852605738, new Matcher$$ExternalSyntheticLambda10(5));
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        Throwable th;
        this.lastUpdated = 0L;
        LocalTabContentQueries localTabContentQueries = this.userRewardsDataQueries;
        AndroidSqliteDriver.Transaction transaction = (AndroidSqliteDriver.Transaction) localTabContentQueries.driver.newTransaction().getValue();
        transaction.getClass();
        AndroidSqliteDriver.Transaction transaction2 = transaction.enclosingTransaction;
        Unit unit = null;
        try {
            nonatomicResetRewards(null, true);
            Unit unit2 = Unit.INSTANCE;
            try {
                transaction.successful = true;
                transaction.endTransaction$runtime();
                localTabContentQueries.postTransactionCleanup(transaction, transaction2, null, unit2);
            } catch (Throwable th2) {
                th = th2;
                unit = unit2;
                transaction.endTransaction$runtime();
                localTabContentQueries.postTransactionCleanup(transaction, transaction2, th, unit);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        str.getClass();
        syncEntityType.getClass();
        str.getClass();
        this.rewardSelectionQueries.deleteForToken(str);
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        Throwable th;
        SyncRewardSelection syncRewardSelection = (SyncRewardSelection) obj;
        str.getClass();
        syncEntityType.getClass();
        syncRewardSelection.getClass();
        RewardSelection rewardSelection = syncRewardSelection.reward_selection;
        rewardSelection.getClass();
        LocalTabContentQueries localTabContentQueries = this.rewardSelectionQueries;
        AndroidSqliteDriver.Transaction transaction = (AndroidSqliteDriver.Transaction) localTabContentQueries.driver.newTransaction().getValue();
        transaction.getClass();
        AndroidSqliteDriver.Transaction transaction2 = transaction.enclosingTransaction;
        Unit unit = null;
        try {
            nonatomicInsertRewardSelection(rewardSelection);
            Unit unit2 = Unit.INSTANCE;
            try {
                transaction.successful = true;
                transaction.endTransaction$runtime();
                localTabContentQueries.postTransactionCleanup(transaction, transaction2, null, unit2);
            } catch (Throwable th2) {
                th = th2;
                unit = unit2;
                transaction.endTransaction$runtime();
                localTabContentQueries.postTransactionCleanup(transaction, transaction2, th, unit);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (processNewBoostsDataInternal(r7, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processNewBoostsData(RewardsData rewardsData, ContinuationImpl continuationImpl) {
        RealBoostSyncer$processNewBoostsData$1 realBoostSyncer$processNewBoostsData$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealBoostSyncer$processNewBoostsData$1) {
            realBoostSyncer$processNewBoostsData$1 = (RealBoostSyncer$processNewBoostsData$1) continuationImpl;
            int i2 = realBoostSyncer$processNewBoostsData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBoostSyncer$processNewBoostsData$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realBoostSyncer$processNewBoostsData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBoostSyncer$processNewBoostsData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 shouldProcessRewardsData = shouldProcessRewardsData();
                    realBoostSyncer$processNewBoostsData$1.L$0 = rewardsData;
                    realBoostSyncer$processNewBoostsData$1.label = 1;
                    obj = FlowKt.firstOrNull(shouldProcessRewardsData, realBoostSyncer$processNewBoostsData$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rewardsData = realBoostSyncer$processNewBoostsData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    rewardsData = null;
                }
                realBoostSyncer$processNewBoostsData$1.L$0 = null;
                realBoostSyncer$processNewBoostsData$1.label = 2;
            }
        }
        realBoostSyncer$processNewBoostsData$1 = new RealBoostSyncer$processNewBoostsData$1(this, continuationImpl);
        obj = realBoostSyncer$processNewBoostsData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBoostSyncer$processNewBoostsData$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
        }
        realBoostSyncer$processNewBoostsData$1.L$0 = null;
        realBoostSyncer$processNewBoostsData$1.label = 2;
    }

    public final Object processNewBoostsDataInternal(RewardsData rewardsData, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.ioCoroutineContext, new InteractiveCardView$flingTo$1.AnonymousClass2(this, rewardsData, (Continuation) null, 18), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 shouldProcessRewardsData() {
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FinishSetupTileBadgeCounter(10, this.eligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.CASH_OFFERS_TAB}), ((RealFeatureFlagManager) this.featureFlagManager).peekValues(LaunchDarklyFeatureFlags$BusinessAccountBoostDataShortCircuit.INSTANCE), new MLKitTitleGenerator$isAvailable$1(), 0);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 1;
        public final Provider cashDatabase;
        public final Provider clock;
        public final Provider eligibilityRepository;
        public final Provider featureFlagManager;
        public final Provider ioCoroutineContext;
        public final InstanceFactory scope;
        public final DoubleCheck service;
        public final Provider signOutSignal;

        public MetroFactory(TreehouseModule treehouseModule, DoubleCheck doubleCheck, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6) {
            this.clock = doubleCheck;
            this.scope = instanceFactory;
            this.featureFlagManager = doubleCheck2;
            this.eligibilityRepository = doubleCheck3;
            this.signOutSignal = doubleCheck4;
            this.ioCoroutineContext = lambdaProvider;
            this.cashDatabase = doubleCheck5;
            this.service = doubleCheck6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            DoubleCheck doubleCheck = this.service;
            Provider provider = this.cashDatabase;
            Provider provider2 = this.ioCoroutineContext;
            Provider provider3 = this.signOutSignal;
            Provider provider4 = this.eligibilityRepository;
            Provider provider5 = this.featureFlagManager;
            InstanceFactory instanceFactory = this.scope;
            Provider provider6 = this.clock;
            switch (i) {
                case 0:
                    AndroidClock androidClock = (AndroidClock) provider6.invoke();
                    RewardlyExternalAppService rewardlyExternalAppService = (RewardlyExternalAppService) doubleCheck.getValue();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider5.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider4.invoke();
                    Signal signal = (Signal) provider3.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    androidClock.getClass();
                    rewardlyExternalAppService.getClass();
                    featureFlagManager.getClass();
                    realFeatureEligibilityRepository.getClass();
                    signal.getClass();
                    coroutineContext.getClass();
                    coroutineScope.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return new RealBoostSyncer(androidClock, rewardlyExternalAppService, featureFlagManager, realFeatureEligibilityRepository, signal, coroutineContext, coroutineScope, cashAccountDatabaseImpl);
                default:
                    Context context = (Context) provider6.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    ZiplineHttpClient ziplineHttpClient = (ZiplineHttpClient) provider5.invoke();
                    ManifestVerifier manifestVerifier = (ManifestVerifier) provider4.invoke();
                    RealTreehouseEventListener.Factory factory = (RealTreehouseEventListener.Factory) provider3.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider2.invoke();
                    boolean booleanValue = ((Boolean) provider.invoke()).booleanValue();
                    AndroidPlatformServiceFactory androidPlatformServiceFactory = (AndroidPlatformServiceFactory) doubleCheck.getValue();
                    context.getClass();
                    coroutineScope2.getClass();
                    ziplineHttpClient.getClass();
                    manifestVerifier.getClass();
                    factory.getClass();
                    coroutineContext2.getClass();
                    androidPlatformServiceFactory.getClass();
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1 = new TreehouseModule$provideCashTreehouseAppFactory$1(context, ziplineHttpClient, manifestVerifier, factory, booleanValue, androidPlatformServiceFactory, coroutineScope2, coroutineContext2);
                    StateFlowKt.closeWith(treehouseModule$provideCashTreehouseAppFactory$1, coroutineScope2, new MainActivity$$ExternalSyntheticLambda5(21));
                    return treehouseModule$provideCashTreehouseAppFactory$1;
            }
        }

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory) {
            this.clock = lambdaProvider;
            this.service = doubleCheck;
            this.featureFlagManager = doubleCheck2;
            this.eligibilityRepository = doubleCheck3;
            this.signOutSignal = doubleCheck4;
            this.ioCoroutineContext = lambdaProvider2;
            this.scope = instanceFactory;
            this.cashDatabase = doubleCheck5;
        }
    }
}
