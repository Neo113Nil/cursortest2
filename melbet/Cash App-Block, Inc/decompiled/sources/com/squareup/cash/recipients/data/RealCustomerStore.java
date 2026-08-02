package com.squareup.cash.recipients.data;

import androidx.room.util.DBUtil;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.contacts.CustomerQueries$ForIdQuery;
import com.squareup.cash.db2.contacts.CustomerQueries$forId$2;
import com.squareup.cash.db2.contacts.CustomerQueries$forIds$2;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes.dex */
public final class RealCustomerStore {
    public final InstrumentQueries aliasQueries;
    public final RewardSlotQueries customerQueries;
    public final CoroutineContext ioDispatcher;

    public RealCustomerStore(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.ioDispatcher = coroutineContext;
        this.customerQueries = cashAccountDatabaseImpl.customerQueries;
        this.aliasQueries = cashAccountDatabaseImpl.aliasQueries;
    }

    public final Flow getCustomerForId(String str) {
        str.getClass();
        RewardSlotQueries rewardSlotQueries = this.customerQueries;
        rewardSlotQueries.getClass();
        CustomerQueries$forId$2 customerQueries$forId$2 = CustomerQueries$forId$2.INSTANCE;
        int i = 0;
        SafeFlow flow = DBUtil.toFlow(new CustomerQueries$ForIdQuery(rewardSlotQueries, str, new CustomerQueries$$ExternalSyntheticLambda7(rewardSlotQueries, i), (byte) 0));
        CoroutineContext coroutineContext = this.ioDispatcher;
        return FlowKt.flowOn(new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(flow, coroutineContext), i), coroutineContext);
    }

    public final RealCustomerStore$getCustomersForIds$$inlined$map$1 getCustomersForIds(List list) {
        list.getClass();
        RewardSlotQueries rewardSlotQueries = this.customerQueries;
        rewardSlotQueries.getClass();
        CustomerQueries$forIds$2 customerQueries$forIds$2 = CustomerQueries$forIds$2.INSTANCE;
        return new RealCustomerStore$getCustomersForIds$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(rewardSlotQueries, list, new CustomerQueries$$ExternalSyntheticLambda7(rewardSlotQueries, 3))), this.ioDispatcher), list, 0);
    }
}
