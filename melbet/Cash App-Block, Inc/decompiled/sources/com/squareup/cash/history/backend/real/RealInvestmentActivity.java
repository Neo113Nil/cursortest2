package com.squareup.cash.history.backend.real;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.clientsync.MultiplatformEntitySyncer;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.activity.CashActivityQueries$CountActivityByRollupTypeQuery;
import com.squareup.cash.db2.activity.InvestmentActivityQueries$IsFirstDayOfTradingQuery;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentState;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class RealInvestmentActivity {
    public final AndroidClock clock;
    public final CashAccountDatabaseImpl database;
    public final MultiplatformEntitySyncer entitySyncer;
    public final CoroutineContext ioDispatcher;

    public RealInvestmentActivity(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, MultiplatformEntitySyncer multiplatformEntitySyncer, CoroutineContext coroutineContext) {
        this.database = cashAccountDatabaseImpl;
        this.clock = androidClock;
        this.entitySyncer = multiplatformEntitySyncer;
        this.ioDispatcher = coroutineContext;
    }

    public final FinishSetupTileBadgeCounter countPendingStockActivity() {
        PaymentQueries paymentQueries = this.database.cashActivityQueries;
        List listOf = CollectionsKt__CollectionsJVMKt.listOf("INVESTMENT_ORDER");
        paymentQueries.getClass();
        listOf.getClass();
        return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new CashActivityQueries$CountActivityByRollupTypeQuery(paymentQueries, listOf, new WebLoginConfigQueries$$ExternalSyntheticLambda2(2, false))), this.ioDispatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flow isFirstDayOfTrading() {
        Flow hasSyncedFlow = EntitySyncerKt.hasSyncedFlow(this.entitySyncer);
        CoroutineContext coroutineContext = this.ioDispatcher;
        Flow flowOn = FlowKt.flowOn(hasSyncedFlow, coroutineContext);
        RewardSlotQueries rewardSlotQueries = this.database.investmentActivityQueries;
        long millis = this.clock.millis();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        calendar.setTimeInMillis(millis);
        calendar.set(11, 9);
        calendar.set(12, 30);
        long timeInMillis = calendar.getTimeInMillis();
        Role role = Role.RECIPIENT;
        PaymentState paymentState = PaymentState.COMPLETE;
        rewardSlotQueries.getClass();
        int i = 4;
        return FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowOn, new FinishSetupTileBadgeCounter(i, DBUtil.toFlow(new InvestmentActivityQueries$IsFirstDayOfTradingQuery(rewardSlotQueries, timeInMillis, role, paymentState, new WebLoginConfigQueries$$ExternalSyntheticLambda2(i, false))), coroutineContext), new FileBlockerView$6$2$1(), 0 == true ? 1 : 0));
    }
}
