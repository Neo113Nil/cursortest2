package com.squareup.cash.activity.backend.contacts;

import androidx.room.util.DBUtil;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.activity.CashActivityQueries$RecentsQuery;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.PaymentState;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes5.dex */
public final class RealQuickAccessBarStore {
    public final ReadonlyStateFlow recentRecipients;

    public RealQuickAccessBarStore(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        PaymentQueries paymentQueries = cashAccountDatabaseImpl.cashActivityQueries;
        BlockState blockState = BlockState.BLOCKED;
        PaymentState paymentState = PaymentState.COMPLETE;
        Orientation orientation = Orientation.BILL;
        Role role = Role.RECIPIENT;
        PaymentState paymentState2 = PaymentState.FAILED;
        RealQuickAccessBarStore$recentRecipients$1 realQuickAccessBarStore$recentRecipients$1 = RealQuickAccessBarStore$recentRecipients$1.INSTANCE;
        paymentQueries.getClass();
        blockState.getClass();
        this.recentRecipients = FlowKt.stateIn(DBUtil.mapToList(DBUtil.toFlow(new CashActivityQueries$RecentsQuery(paymentQueries, blockState, paymentState, orientation, role, paymentState2, new ViewTreeObservers$$ExternalSyntheticLambda3(3, realQuickAccessBarStore$recentRecipients$1, paymentQueries))), coroutineContext), coroutineScope, SharingStarted.Companion.Lazily, EmptyList.INSTANCE);
    }
}
