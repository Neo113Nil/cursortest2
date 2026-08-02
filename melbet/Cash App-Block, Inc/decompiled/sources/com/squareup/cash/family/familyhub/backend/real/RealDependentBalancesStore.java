package com.squareup.cash.family.familyhub.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zznv;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.family.familyhub.backend.api.DependentBalance;
import com.squareup.cash.family.familyhub.backend.api.DependentBalanceName;
import com.squareup.cash.family.familyhub.backend.api.DependentBalances;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.applets.presenters.RealPaychecksAppletTileRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import squareup.cash.savings.SavingsFolder;

/* loaded from: classes6.dex */
public final class RealDependentBalancesStore implements HasObservability {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long CACHE_EXPIRY_PERIOD;
    public static final long DEFAULT_REFRESH_RATE;
    public final Flow activityEvents;
    public final StateFlowImpl cachedStockBalanceLoadingState;
    public final CurrencyConverter$Factory currencyConverterFactory;
    public final SharedFlowImpl entityManagerEvent;
    public final ErrorReporter errorReporter;
    public final RealJurisdictionConfigManager jurisdictionConfigManager;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final PiggybankAppService piggybankService;
    public final PortfoliosService portfoliosService;
    public final SyncValueReader syncValueReader;
    public final RealTargetEntityManager targetEntityManager;

    public final class StockBalanceLoaded {
        public final DependentBalance.LoadingState.BalanceLoaded loaded;

        public StockBalanceLoaded(DependentBalance.LoadingState.BalanceLoaded balanceLoaded) {
            this.loaded = balanceLoaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StockBalanceLoaded) && this.loaded.equals(((StockBalanceLoaded) obj).loaded);
        }

        public final int hashCode() {
            return this.loaded.hashCode();
        }

        public final String toString() {
            return "StockBalanceLoaded(loaded=" + this.loaded + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StockBalanceState {
        public static final /* synthetic */ StockBalanceState[] $VALUES;
        public static final StockBalanceState ABSENT;
        public static final StockBalanceState NEED_FETCHING;
        public static final StockBalanceState ZERO;

        static {
            StockBalanceState stockBalanceState = new StockBalanceState("ABSENT", 0);
            ABSENT = stockBalanceState;
            StockBalanceState stockBalanceState2 = new StockBalanceState("ZERO", 1);
            ZERO = stockBalanceState2;
            StockBalanceState stockBalanceState3 = new StockBalanceState("NEED_FETCHING", 2);
            NEED_FETCHING = stockBalanceState3;
            $VALUES = new StockBalanceState[]{stockBalanceState, stockBalanceState2, stockBalanceState3};
        }

        public static StockBalanceState valueOf(String str) {
            return (StockBalanceState) Enum.valueOf(StockBalanceState.class, str);
        }

        public static StockBalanceState[] values() {
            return (StockBalanceState[]) $VALUES.clone();
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        DEFAULT_REFRESH_RATE = DurationKt.toDuration(5, DurationUnit.SECONDS);
        CACHE_EXPIRY_PERIOD = DurationKt.toDuration(5, DurationUnit.MINUTES);
    }

    public RealDependentBalancesStore(PortfoliosService portfoliosService, PiggybankAppService piggybankAppService, RealJurisdictionConfigManager realJurisdictionConfigManager, CurrencyConverter$Factory currencyConverter$Factory, Flow flow, RealTargetEntityManager realTargetEntityManager, SyncValueReader syncValueReader, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.portfoliosService = portfoliosService;
        this.piggybankService = piggybankAppService;
        this.jurisdictionConfigManager = realJurisdictionConfigManager;
        this.currencyConverterFactory = currencyConverter$Factory;
        this.activityEvents = flow;
        this.targetEntityManager = realTargetEntityManager;
        this.syncValueReader = syncValueReader;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.cachedStockBalanceLoadingState = FlowKt.MutableStateFlow(emptyMap);
        this.entityManagerEvent = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    }

    public static Money findBitcoinBalance(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            BalanceSnapshot balanceSnapshot = null;
            if (!it.hasNext()) {
                break;
            }
            SyncValue.Value value = ((SyncValue) it.next()).value;
            if (value != null) {
                SyncValue.Value.BalanceSnapshot balanceSnapshot2 = value instanceof SyncValue.Value.BalanceSnapshot ? (SyncValue.Value.BalanceSnapshot) value : null;
                if (balanceSnapshot2 != null) {
                    balanceSnapshot = balanceSnapshot2.value;
                }
            }
            if (balanceSnapshot != null) {
                arrayList.add(balanceSnapshot);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Money money = ((BalanceSnapshot) obj).balance;
            if ((money != null ? money.currency_code : null) == CurrencyCode.BTC) {
                break;
            }
        }
        BalanceSnapshot balanceSnapshot3 = (BalanceSnapshot) obj;
        if (balanceSnapshot3 != null) {
            return balanceSnapshot3.balance;
        }
        return null;
    }

    public static Money findSavingsBalance(List list, CurrencyCode currencyCode, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            BalanceSnapshot balanceSnapshot = null;
            if (!it.hasNext()) {
                break;
            }
            SyncValue.Value value = ((SyncValue) it.next()).value;
            if (value != null) {
                SyncValue.Value.BalanceSnapshot balanceSnapshot2 = value instanceof SyncValue.Value.BalanceSnapshot ? (SyncValue.Value.BalanceSnapshot) value : null;
                if (balanceSnapshot2 != null) {
                    balanceSnapshot = balanceSnapshot2.value;
                }
            }
            if (balanceSnapshot != null) {
                arrayList.add(balanceSnapshot);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (CollectionsKt.contains(set, ((BalanceSnapshot) next).instrument_token)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Money money = ((BalanceSnapshot) it3.next()).balance;
            if (money != null) {
                arrayList3.add(money);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (((Money) next2).currency_code == currencyCode) {
                arrayList4.add(next2);
            }
        }
        if (arrayList4.isEmpty()) {
            return null;
        }
        Iterator it5 = arrayList4.iterator();
        long j = 0;
        while (it5.hasNext()) {
            Long l = ((Money) it5.next()).amount;
            l.getClass();
            j += l.longValue();
        }
        return new Money(Long.valueOf(j), currencyCode, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01b1 A[EDGE_INSN: B:271:0x01b1->B:249:0x01b1 BREAK  A[LOOP:6: B:260:0x018f->B:272:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[LOOP:6: B:260:0x018f->B:272:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0167 A[EDGE_INSN: B:296:0x0167->B:30:0x0167 BREAK  A[LOOP:7: B:285:0x0145->B:297:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[LOOP:7: B:285:0x0145->B:297:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0532  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.squareup.protos.franklin.common.SyncValue$Value$InvestTradingState] */
    /* JADX WARN: Type inference failed for: r1v20, types: [squareup.cash.investcore.trading.syncvalues.TradingState] */
    /* JADX WARN: Type inference failed for: r1v22, types: [squareup.cash.investcore.trading.syncvalues.TradingState] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.squareup.protos.franklin.common.SyncValue$Value$InvestPortfolioState] */
    /* JADX WARN: Type inference failed for: r1v31, types: [squareup.cash.portfolios.syncvalues.PortfolioState] */
    /* JADX WARN: Type inference failed for: r1v33, types: [squareup.cash.portfolios.syncvalues.PortfolioState] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r22v0, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r2v48, types: [kotlin.coroutines.Continuation] */
    /* renamed from: balances-fUqyM7Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DependentBalances m3529balancesfUqyM7Y(String str, DependentBalanceCategory dependentBalanceCategory, Duration duration, GapComposer gapComposer, int i) {
        List listOf;
        RealDependentBalancesStore realDependentBalancesStore;
        DependentBalances dependentBalances;
        ?? r1;
        StockBalanceState stockBalanceState;
        ?? r12;
        DependentBalance.LoadingState loadingState;
        DependentBalance.LoadingState balanceLoaded;
        DependentBalance.LoadingState loadingState2;
        Object obj;
        BalanceSnapshot balanceSnapshot;
        DependentBalance.LoadingState savingsBalanceLoaded;
        MutableState mutableState;
        LocalizedString localizedString;
        String str2;
        Object obj2;
        Boolean bool;
        boolean booleanValue;
        SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization;
        boolean z;
        Money money;
        Money money2;
        DependentBalance.LoadingState loadingState3;
        DependentBalance.LoadingState loadingState4;
        int ordinal = dependentBalanceCategory.ordinal();
        Continuation continuation = null;
        if (ordinal == 0) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new DomainType[]{DomainType.BALANCE_SNAPSHOT, DomainType.SAVINGS_FOLDER, DomainType.INVEST_STATE, DomainType.SPONSORSHIP_CRYPTO_AUTHORIZATION});
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            listOf = CollectionsKt__CollectionsJVMKt.listOf(DomainType.BALANCE_SNAPSHOT);
        }
        TargetEntityManager$TargetEntityValue syncValues = this.targetEntityManager.syncValues(this.entityManagerEvent, str, listOf, gapComposer, 0);
        boolean changed = gapComposer.changed(str);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj3 = Composer.Companion.Empty;
        if (changed || rememberedValue == obj3) {
            rememberedValue = new SafeFlow(new EarningsHomePresenter$models$3$1(this, continuation, 16));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj3) {
            rememberedValue2 = new RealGooglePayer$createWallet$$inlined$filter$1(this.activityEvents, 13);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, Boolean.TRUE, null, gapComposer, 48, 2);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj3) {
            Duration.Companion companion = Duration.Companion;
            Duration duration2 = new Duration(DurationKt.toDuration(0, DurationUnit.SECONDS));
            gapComposer.updateRememberedValue(duration2);
            rememberedValue3 = duration2;
        }
        ref$LongRef.element = ((Duration) rememberedValue3).rawValue;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj3) {
            rememberedValue4 = Boolean.FALSE;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        ref$BooleanRef.element = ((Boolean) rememberedValue4).booleanValue();
        long j = duration != null ? duration.rawValue : DEFAULT_REFRESH_RATE;
        if (((Boolean) collectAsState2.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-299741731);
            dependentBalances = null;
            realDependentBalancesStore = this;
            Updater.LaunchedEffect((Composer) gapComposer, Unit.INSTANCE, new RepeatOnIntervalTaskRunner$repeatOn$2(ref$BooleanRef, ref$LongRef, this, j, (Continuation) null, 12));
            gapComposer.end(false);
        } else {
            realDependentBalancesStore = this;
            dependentBalances = null;
            gapComposer.startReplaceGroup(-299241050);
            gapComposer.end(false);
        }
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj3) {
            CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(realDependentBalancesStore.jurisdictionConfigManager.select(), 27);
            gapComposer.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
            rememberedValue5 = cardModelView$cardHeat$$inlined$map$1;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        TargetEntityManager$TargetEntityValue.Failed failed = TargetEntityManager$TargetEntityValue.Failed.INSTANCE;
        boolean areEqual = Intrinsics.areEqual(syncValues, failed);
        TargetEntityManager$TargetEntityValue.Loading loading = TargetEntityManager$TargetEntityValue.Loading.INSTANCE;
        if (!areEqual && !Intrinsics.areEqual(syncValues, loading)) {
            if (!(syncValues instanceof TargetEntityManager$TargetEntityValue.Ready)) {
                DependentBalances dependentBalances2 = dependentBalances;
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return dependentBalances2;
            }
            Iterator it = ((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues.iterator();
            while (it.hasNext()) {
                SyncValue.Value value = ((SyncValue) it.next()).value;
                if (value != null) {
                    ?? r13 = value instanceof SyncValue.Value.InvestTradingState ? (SyncValue.Value.InvestTradingState) value : dependentBalances;
                    if (r13 != 0) {
                        r1 = r13.value;
                        if (r1 == 0) {
                            break;
                        }
                    }
                }
                r1 = dependentBalances;
                if (r1 == 0) {
                }
            }
        }
        r1 = dependentBalances;
        if (r1 == 0) {
            stockBalanceState = StockBalanceState.ABSENT;
        } else if (r1.has_active_brokerage_account) {
            if (!Intrinsics.areEqual(syncValues, failed) && !Intrinsics.areEqual(syncValues, loading)) {
                if (!(syncValues instanceof TargetEntityManager$TargetEntityValue.Ready)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return dependentBalances;
                }
                Iterator it2 = ((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues.iterator();
                while (it2.hasNext()) {
                    SyncValue.Value value2 = ((SyncValue) it2.next()).value;
                    if (value2 != null) {
                        ?? r14 = value2 instanceof SyncValue.Value.InvestPortfolioState ? (SyncValue.Value.InvestPortfolioState) value2 : dependentBalances;
                        if (r14 != 0) {
                            r12 = r14.value;
                            if (r12 == 0) {
                                break;
                            }
                        }
                    }
                    r12 = dependentBalances;
                    if (r12 == 0) {
                    }
                }
            }
            r12 = dependentBalances;
            stockBalanceState = r12 == 0 ? StockBalanceState.ZERO : r12.has_portfolio ? StockBalanceState.NEED_FETCHING : StockBalanceState.ZERO;
        } else {
            stockBalanceState = StockBalanceState.ABSENT;
        }
        int ordinal2 = stockBalanceState.ordinal();
        DependentBalance.LoadingState loadingState5 = DependentBalance.LoadingState.BalanceLoading.INSTANCE;
        if (ordinal2 == 0) {
            gapComposer.startReplaceGroup(-298983007);
            gapComposer.end(false);
            loadingState = null;
        } else if (ordinal2 == 1) {
            gapComposer.startReplaceGroup(-298960097);
            gapComposer.end(false);
            CurrencyCode currencyCode = (CurrencyCode) collectAsState3.getValue();
            loadingState = currencyCode != null ? new DependentBalance.LoadingState.BalanceLoaded(zznv.access$toZeroMoney(currencyCode)) : loadingState5;
        } else {
            if (ordinal2 != 2) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) gapComposer, 1237279652, false);
            }
            gapComposer.startReplaceGroup(1237289409);
            boolean changed2 = gapComposer.changed(syncValues);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue6 == obj3) {
                rememberedValue6 = new SafeFlow(new RealBlockersHelper$skipBlocker$1((Object) str, (Object) realDependentBalancesStore, (Continuation) dependentBalances, 23));
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            loadingState = (DependentBalance.LoadingState) Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2).getValue();
            gapComposer.end(false);
        }
        DependentBalanceName dependentBalanceName = DependentBalanceName.Cash;
        boolean areEqual2 = Intrinsics.areEqual(syncValues, failed);
        DependentBalance.LoadingState loadingState6 = DependentBalance.LoadingState.BalanceFailedToLoad.INSTANCE;
        if (areEqual2) {
            loadingState2 = loadingState6;
            balanceLoaded = loadingState2;
        } else {
            if (!Intrinsics.areEqual(syncValues, loading)) {
                if (!(syncValues instanceof TargetEntityManager$TargetEntityValue.Ready)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                CurrencyCode currencyCode2 = (CurrencyCode) collectAsState3.getValue();
                if (currencyCode2 != null) {
                    List list = ((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues;
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        SyncValue.Value value3 = ((SyncValue) it3.next()).value;
                        DependentBalance.LoadingState loadingState7 = loadingState6;
                        if (value3 != null) {
                            SyncValue.Value.BalanceSnapshot balanceSnapshot2 = value3 instanceof SyncValue.Value.BalanceSnapshot ? (SyncValue.Value.BalanceSnapshot) value3 : null;
                            if (balanceSnapshot2 != null) {
                                balanceSnapshot = balanceSnapshot2.value;
                                if (balanceSnapshot == null) {
                                    arrayList.add(balanceSnapshot);
                                }
                                loadingState6 = loadingState7;
                            }
                        }
                        balanceSnapshot = null;
                        if (balanceSnapshot == null) {
                        }
                        loadingState6 = loadingState7;
                    }
                    loadingState2 = loadingState6;
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it4.next();
                        BalanceSnapshot balanceSnapshot3 = (BalanceSnapshot) obj;
                        Iterator it5 = it4;
                        if (balanceSnapshot3.f1396type != BalanceSnapshot.Type.SECONDARY) {
                            Money money3 = balanceSnapshot3.balance;
                            if ((money3 != null ? money3.currency_code : null) == currencyCode2) {
                                break;
                            }
                        }
                        it4 = it5;
                    }
                    BalanceSnapshot balanceSnapshot4 = (BalanceSnapshot) obj;
                    Money money4 = balanceSnapshot4 != null ? balanceSnapshot4.balance : null;
                    if (money4 == null) {
                        money4 = zznv.access$toZeroMoney(currencyCode2);
                    }
                    balanceLoaded = new DependentBalance.LoadingState.BalanceLoaded(money4);
                }
            }
            loadingState2 = loadingState6;
            balanceLoaded = loadingState5;
        }
        DependentBalance dependentBalance = new DependentBalance(dependentBalanceName, balanceLoaded);
        CurrencyCode currencyCode3 = (CurrencyCode) collectAsState3.getValue();
        SavingsInterestData savingsInterestData = (SavingsInterestData) collectAsState.getValue();
        DependentBalanceName dependentBalanceName2 = DependentBalanceName.Savings;
        if (Intrinsics.areEqual(syncValues, failed)) {
            savingsBalanceLoaded = loadingState2;
            mutableState = collectAsState3;
        } else {
            if (!Intrinsics.areEqual(syncValues, loading)) {
                if (!(syncValues instanceof TargetEntityManager$TargetEntityValue.Ready)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (currencyCode3 != null) {
                    List list2 = ((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        MutableState mutableState2 = collectAsState3;
                        SyncValue.Value value4 = ((SyncValue) it6.next()).value;
                        Iterator it7 = it6;
                        if (value4 != null) {
                            SyncValue.Value.SavingsFolder savingsFolder = value4 instanceof SyncValue.Value.SavingsFolder ? (SyncValue.Value.SavingsFolder) value4 : null;
                            SavingsFolder savingsFolder2 = savingsFolder != null ? savingsFolder.value : null;
                            if (savingsFolder2 != null) {
                                str2 = savingsFolder2.instrument_token;
                                if (str2 == null) {
                                    arrayList2.add(str2);
                                }
                                collectAsState3 = mutableState2;
                                it6 = it7;
                            }
                        }
                        str2 = null;
                        if (str2 == null) {
                        }
                        collectAsState3 = mutableState2;
                        it6 = it7;
                    }
                    mutableState = collectAsState3;
                    Money findSavingsBalance = findSavingsBalance(list2, currencyCode3, CollectionsKt.toHashSet(arrayList2));
                    if (findSavingsBalance == null) {
                        findSavingsBalance = zznv.access$toZeroMoney(currencyCode3);
                    }
                    savingsBalanceLoaded = new DependentBalance.LoadingState.SavingsBalanceLoaded(findSavingsBalance, savingsInterestData != null ? savingsInterestData.status : null, (savingsInterestData == null || (localizedString = savingsInterestData.enhancedRate) == null) ? null : localizedString.translated_value);
                }
            }
            mutableState = collectAsState3;
            savingsBalanceLoaded = loadingState5;
        }
        DependentBalance dependentBalance2 = new DependentBalance(dependentBalanceName2, savingsBalanceLoaded);
        gapComposer.startReplaceGroup(1237310201);
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(dependentBalance);
        createListBuilder.add(dependentBalance2);
        if (loadingState != null) {
            createListBuilder.add(new DependentBalance(DependentBalanceName.Stocks, loadingState));
        }
        if (!Intrinsics.areEqual(syncValues, failed) && !Intrinsics.areEqual(syncValues, loading)) {
            if (!(syncValues instanceof TargetEntityManager$TargetEntityValue.Ready)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            List list3 = ((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues;
            ArrayList arrayList3 = new ArrayList();
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                SyncValue.Value value5 = ((SyncValue) it8.next()).value;
                if (value5 != null) {
                    SyncValue.Value.SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization2 = value5 instanceof SyncValue.Value.SponsorshipCryptoAuthorization ? (SyncValue.Value.SponsorshipCryptoAuthorization) value5 : null;
                    if (sponsorshipCryptoAuthorization2 != null) {
                        sponsorshipCryptoAuthorization = sponsorshipCryptoAuthorization2.value;
                        if (sponsorshipCryptoAuthorization == null) {
                            arrayList3.add(sponsorshipCryptoAuthorization);
                        }
                    }
                }
                sponsorshipCryptoAuthorization = null;
                if (sponsorshipCryptoAuthorization == null) {
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((SponsorshipCryptoAuthorization) it9.next()).feature_authorizations, arrayList4);
            }
            Iterator it10 = arrayList4.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it10.next();
                SponsorshipCryptoAuthorization.FeatureAuthorization featureAuthorization = (SponsorshipCryptoAuthorization.FeatureAuthorization) obj2;
                if (featureAuthorization.feature == SponsorshipCryptoAuthorization.Feature.BTC_EXCHANGE && Intrinsics.areEqual(featureAuthorization.is_authorized, Boolean.TRUE)) {
                    break;
                }
            }
            SponsorshipCryptoAuthorization.FeatureAuthorization featureAuthorization2 = (SponsorshipCryptoAuthorization.FeatureAuthorization) obj2;
            if (featureAuthorization2 != null && (bool = featureAuthorization2.is_authorized) != null) {
                booleanValue = bool.booleanValue();
                if (booleanValue) {
                    z = false;
                    gapComposer.startReplaceGroup(-739054623);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-739692727);
                    DependentBalanceName dependentBalanceName3 = DependentBalanceName.Bitcoin;
                    if (Intrinsics.areEqual(syncValues, failed)) {
                        gapComposer.startReplaceGroup(807428628);
                        z = false;
                        gapComposer.end(false);
                        loadingState4 = loadingState2;
                    } else {
                        z = false;
                        if (Intrinsics.areEqual(syncValues, loading)) {
                            gapComposer.startReplaceGroup(807430255);
                            gapComposer.end(false);
                        } else {
                            if (!(syncValues instanceof TargetEntityManager$TargetEntityValue.Ready)) {
                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) gapComposer, 807427247, false);
                            }
                            gapComposer.startReplaceGroup(-739389640);
                            CurrencyCode currencyCode4 = (CurrencyCode) mutableState.getValue();
                            if (currencyCode4 == null) {
                                gapComposer.startReplaceGroup(-739376745);
                                gapComposer.end(false);
                                loadingState3 = null;
                            } else {
                                gapComposer.startReplaceGroup(-739376744);
                                Money findBitcoinBalance = findBitcoinBalance(((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues);
                                if (findBitcoinBalance == null) {
                                    gapComposer.startReplaceGroup(-172036019);
                                    gapComposer.end(false);
                                    money2 = null;
                                } else {
                                    gapComposer.startReplaceGroup(1102829108);
                                    if (findBitcoinBalance.currency_code != CurrencyCode.BTC) {
                                        a$$ExternalSyntheticBUOutline0.m$3("This only converts from BTC");
                                        return null;
                                    }
                                    boolean changed3 = gapComposer.changed(findBitcoinBalance);
                                    Object rememberedValue7 = gapComposer.rememberedValue();
                                    if (changed3 || rememberedValue7 == obj3) {
                                        rememberedValue7 = new RealTransferManager$addCash$$inlined$map$1(WebViewGlueCommunicator.convert(new AppLockMonitor$special$$inlined$map$2(findBitcoinBalance, 19), ((RealCurrencyConverter.Factory) realDependentBalancesStore.currencyConverterFactory).get(currencyCode4)), currencyCode4, 29);
                                        gapComposer.updateRememberedValue(rememberedValue7);
                                    }
                                    MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer, 48, 2);
                                    if (((Money) collectAsState4.getValue()) == null) {
                                        money = new Money((Long) 0L, currencyCode4, 4);
                                    } else {
                                        money = (Money) collectAsState4.getValue();
                                        money.getClass();
                                    }
                                    money2 = money;
                                    z = false;
                                    gapComposer.end(false);
                                }
                                if (money2 == null) {
                                    money2 = zznv.access$toZeroMoney(currencyCode4);
                                }
                                DependentBalance.LoadingState balanceLoaded2 = new DependentBalance.LoadingState.BalanceLoaded(money2);
                                gapComposer.end(z);
                                loadingState3 = balanceLoaded2;
                            }
                            if (loadingState3 != null) {
                                loadingState5 = loadingState3;
                            }
                            gapComposer.end(z);
                        }
                        loadingState4 = loadingState5;
                    }
                    createListBuilder.add(new DependentBalance(dependentBalanceName3, loadingState4));
                    gapComposer.end(z);
                }
                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                gapComposer.end(z);
                return new DependentBalances(build);
            }
        }
        booleanValue = false;
        if (booleanValue) {
        }
        ListBuilder build2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        gapComposer.end(z);
        return new DependentBalances(build2);
    }

    /* renamed from: cashBalance-hhJSO8g, reason: not valid java name */
    public final DependentBalance m3530cashBalancehhJSO8g(String str, Duration duration, GapComposer gapComposer, int i) {
        Object obj;
        str.getClass();
        gapComposer.startReplaceGroup(-852788474);
        Iterator it = m3529balancesfUqyM7Y(str, DependentBalanceCategory.CASH_BALANCE_ONLY, duration, gapComposer, 48 | ((i << 3) & 896)).balances.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DependentBalance) obj).name == DependentBalanceName.Cash) {
                break;
            }
        }
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$3("a dependent always has a cash balance at the very least");
            return null;
        }
        DependentBalance dependentBalance = (DependentBalance) obj;
        gapComposer.end(false);
        return dependentBalance;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 1;
        public final InstanceFactory activityEvents;
        public final Provider currencyConverterFactory;
        public final Provider errorReporter;
        public final Provider jurisdictionConfigManager;
        public final Provider oneErrorPerAppSessionStrategy;
        public final Provider piggybankService;
        public final Provider portfoliosService;
        public final Provider syncValueReader;
        public final Provider targetEntityManager;

        public MetroFactory(DoubleCheck doubleCheck, RealKnotLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider3) {
            this.portfoliosService = doubleCheck;
            this.piggybankService = metroFactory;
            this.jurisdictionConfigManager = doubleCheck2;
            this.currencyConverterFactory = lambdaProvider;
            this.targetEntityManager = doubleCheck3;
            this.syncValueReader = lambdaProvider2;
            this.errorReporter = musicViewFactory$MetroFactory;
            this.activityEvents = instanceFactory;
            this.oneErrorPerAppSessionStrategy = lambdaProvider3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.oneErrorPerAppSessionStrategy;
            InstanceFactory instanceFactory = this.activityEvents;
            Provider provider2 = this.errorReporter;
            Provider provider3 = this.syncValueReader;
            Provider provider4 = this.targetEntityManager;
            Provider provider5 = this.currencyConverterFactory;
            Provider provider6 = this.jurisdictionConfigManager;
            Provider provider7 = this.piggybankService;
            Provider provider8 = this.portfoliosService;
            switch (i) {
                case 0:
                    PortfoliosService portfoliosService = (PortfoliosService) provider8.invoke();
                    PiggybankAppService piggybankAppService = (PiggybankAppService) provider7.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider6.invoke();
                    CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) provider5.invoke();
                    Flow flow = (Flow) instanceFactory.value;
                    RealTargetEntityManager realTargetEntityManager = (RealTargetEntityManager) provider4.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                    portfoliosService.getClass();
                    piggybankAppService.getClass();
                    realJurisdictionConfigManager.getClass();
                    currencyConverter$Factory.getClass();
                    flow.getClass();
                    realTargetEntityManager.getClass();
                    syncValueReader.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    return new RealDependentBalancesStore(portfoliosService, piggybankAppService, realJurisdictionConfigManager, currencyConverter$Factory, flow, realTargetEntityManager, syncValueReader, errorReporter, sampleStrategy);
                default:
                    PaychecksAppService paychecksAppService = (PaychecksAppService) provider8.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider7.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider6.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider5.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider4.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider3.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    paychecksAppService.getClass();
                    realClientSyncer.getClass();
                    featureFlagManager.getClass();
                    androidStringManager.getClass();
                    syncValueReader2.getClass();
                    errorReporter2.getClass();
                    sampleStrategy2.getClass();
                    coroutineScope.getClass();
                    coroutineContext.getClass();
                    return new RealPaychecksAppletTileRepository(paychecksAppService, realClientSyncer, featureFlagManager, androidStringManager, syncValueReader2, errorReporter2, sampleStrategy2, coroutineScope, coroutineContext);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LocalViewFactory.MetroFactory metroFactory, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.portfoliosService = doubleCheck;
            this.piggybankService = doubleCheck2;
            this.jurisdictionConfigManager = metroFactory;
            this.currencyConverterFactory = doubleCheck3;
            this.activityEvents = instanceFactory;
            this.targetEntityManager = doubleCheck4;
            this.syncValueReader = doubleCheck5;
            this.errorReporter = lambdaProvider;
            this.oneErrorPerAppSessionStrategy = musicViewFactory$MetroFactory;
        }
    }
}
