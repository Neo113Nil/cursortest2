package com.squareup.cash.appmessages.holders;

import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes5.dex */
public final class PendingPopupMessageHolder$CardTabPlacementHolder implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final CashAccountDatabaseImpl cashDatabase;
    public final Lazy current$delegate;
    public final CoroutineContext ioDispatcher;
    public final PopupMessage.Placement placement;
    public final CoroutineScope scope;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PendingPopupMessageHolder$CardTabPlacementHolder(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, CoroutineScope coroutineScope, int i) {
        this(PopupMessage.Placement.CARD_TAB);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this(PopupMessage.Placement.ACTIVITY_TAB);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.scope = coroutineScope;
                break;
            case 2:
                this(PopupMessage.Placement.BALANCE_TAB);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.scope = coroutineScope;
                break;
            case 3:
                this(PopupMessage.Placement.INVESTING_TAB);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.scope = coroutineScope;
                break;
            case 4:
                this(PopupMessage.Placement.OFFERS_TAB);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.scope = coroutineScope;
                break;
            case 5:
                this(PopupMessage.Placement.PAYMENT_PAD_TAB);
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.scope = coroutineScope;
                break;
            default:
                this.cashDatabase = cashAccountDatabaseImpl;
                this.ioDispatcher = coroutineContext;
                this.scope = coroutineScope;
                break;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = FlowKt.distinctUntilChanged((SharedFlow) this.current$delegate.getValue()).collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public PendingPopupMessageHolder$CardTabPlacementHolder(PopupMessage.Placement placement) {
        this.placement = placement;
        this.current$delegate = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(this, 3));
    }
}
