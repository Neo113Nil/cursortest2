package com.squareup.cash.history.backend.real;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.protos.franklin.app.AppService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class RealLegacyActivityEntityManager {
    public final AppService appService;
    public final CashAccountDatabaseImpl cashDatabase;
    public final RewardSlotQueries customerQueries;
    public final CoroutineContext ioDispatcher;
    public final FillrInitializer.MetroFactory javaScripter;
    public final CoroutineContext jsDispatcher;

    public RealLegacyActivityEntityManager(AppService appService, FillrInitializer.MetroFactory metroFactory, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealCustomerStore realCustomerStore, CoroutineContext coroutineContext2, CoroutineScope coroutineScope) {
        this.appService = appService;
        this.javaScripter = metroFactory;
        this.jsDispatcher = coroutineContext;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext2;
        this.customerQueries = cashAccountDatabaseImpl.customerQueries;
    }

    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 renderedPayment(String str) {
        str.getClass();
        return new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.transformLatest((Flow) this.javaScripter.invoke(), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, this, str, 12)), 24);
    }
}
