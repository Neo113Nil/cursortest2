package com.squareup.cash.appmessages.holders;

import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
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

/* loaded from: classes.dex */
public abstract class PendingInlineMessageHolder implements Flow {
    public final Lazy current$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 3));
    public final InlineMessage.Placement placement;

    public final class ActivityPlacementHolder extends PendingInlineMessageHolder {
        public final CashAccountDatabaseImpl cashDatabase;
        public final CoroutineContext ioContext;
        public final CoroutineScope scope;

        public ActivityPlacementHolder(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
            super(InlineMessage.Placement.ACTIVITY_TAB);
            this.cashDatabase = cashAccountDatabaseImpl;
            this.ioContext = coroutineContext;
            this.scope = coroutineScope;
        }

        @Override // com.squareup.cash.appmessages.holders.PendingInlineMessageHolder
        public final CashAccountDatabaseImpl getCashDatabase() {
            return this.cashDatabase;
        }

        @Override // com.squareup.cash.appmessages.holders.PendingInlineMessageHolder
        public final CoroutineContext getIoContext() {
            return this.ioContext;
        }

        @Override // com.squareup.cash.appmessages.holders.PendingInlineMessageHolder
        public final CoroutineScope getScope() {
            return this.scope;
        }
    }

    /* loaded from: classes5.dex */
    public final class ProfilePlacementHolder extends PendingInlineMessageHolder {
        public final CashAccountDatabaseImpl cashDatabase;
        public final CoroutineContext ioContext;
        public final CoroutineScope scope;

        public ProfilePlacementHolder(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
            super(InlineMessage.Placement.PROFILE_SCREEN);
            this.cashDatabase = cashAccountDatabaseImpl;
            this.ioContext = coroutineContext;
            this.scope = coroutineScope;
        }

        @Override // com.squareup.cash.appmessages.holders.PendingInlineMessageHolder
        public final CashAccountDatabaseImpl getCashDatabase() {
            return this.cashDatabase;
        }

        @Override // com.squareup.cash.appmessages.holders.PendingInlineMessageHolder
        public final CoroutineContext getIoContext() {
            return this.ioContext;
        }

        @Override // com.squareup.cash.appmessages.holders.PendingInlineMessageHolder
        public final CoroutineScope getScope() {
            return this.scope;
        }
    }

    public PendingInlineMessageHolder(InlineMessage.Placement placement) {
        this.placement = placement;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = FlowKt.distinctUntilChanged((SharedFlow) this.current$delegate.getValue()).collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public abstract CashAccountDatabaseImpl getCashDatabase();

    public abstract CoroutineContext getIoContext();

    public abstract CoroutineScope getScope();
}
