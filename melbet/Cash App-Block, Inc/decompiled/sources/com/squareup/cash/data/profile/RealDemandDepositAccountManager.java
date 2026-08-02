package com.squareup.cash.data.profile;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider$showLocal$1$2;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealDemandDepositAccountManager {
    public final FinishSetupTileBadgeCounter accountEligibleForDdaFlow;
    public final StateFlowImpl inMemoryAccountNumberMutableStateFlow = FlowKt.MutableStateFlow(null);
    public final CoroutineContext ioDispatcher;
    public final RealProfileManager profileManager;
    public final SessionQueries queries;

    public RealDemandDepositAccountManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, RealProfileManager realProfileManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository) {
        this.ioDispatcher = coroutineContext;
        this.profileManager = realProfileManager;
        this.queries = cashAccountDatabaseImpl.directDepositAccountQueries;
        EligibleFeature[] eligibleFeatureArr = {EligibleFeature.DDA_TAB};
        this.accountEligibleForDdaFlow = new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), eligibleFeatureArr);
    }

    public final FinishSetupTileBadgeCounter selectUiDda() {
        Continuation continuation = null;
        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(this.accountEligibleForDdaFlow, new RealDemandDepositAccountManager$selectUiDda$$inlined$flatMapLatest$1(continuation, this, 0));
        RealProfileManager realProfileManager = this.profileManager;
        return FlowKt.combine(transformLatest, new RealDisclosureProvider$special$$inlined$map$1(realProfileManager.profile(), 6), realProfileManager.balanceData(), new RealLocalTabProvider$showLocal$1$2(4, continuation, 1));
    }

    public final Unit updateDemandDepositAccount(DirectDepositAccount directDepositAccount) {
        if (directDepositAccount != null && !Intrinsics.areEqual(directDepositAccount.is_placeholder, Boolean.TRUE) && directDepositAccount.account_number == null) {
            Timber.Forest.e(new IllegalStateException("Demand deposit account is not a placeholder, but we didn't get an account number"));
        }
        this.queries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(28, this, directDepositAccount));
        this.inMemoryAccountNumberMutableStateFlow.setValue(directDepositAccount != null ? directDepositAccount.account_number : null);
        Unit unit = Unit.INSTANCE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return unit;
    }
}
