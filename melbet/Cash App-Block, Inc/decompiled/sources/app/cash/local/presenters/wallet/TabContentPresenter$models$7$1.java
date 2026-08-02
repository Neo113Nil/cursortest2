package app.cash.local.presenters.wallet;

import androidx.compose.runtime.MutableState;
import app.cash.local.backend.RefreshMarketingMessages;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealLocalOrderRepository$getActiveOrders$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TabContentPresenter$models$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $addedCards$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ TabContentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TabContentPresenter$models$7$1(TabContentPresenter tabContentPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = tabContentPresenter;
        this.$addedCards$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$addedCards$delegate;
        TabContentPresenter tabContentPresenter = this.this$0;
        switch (i) {
            case 0:
                return new TabContentPresenter$models$7$1(tabContentPresenter, mutableState, continuation, 0);
            case 1:
                return new TabContentPresenter$models$7$1(tabContentPresenter, mutableState, continuation, 1);
            case 2:
                return new TabContentPresenter$models$7$1(tabContentPresenter, mutableState, continuation, 2);
            default:
                return new TabContentPresenter$models$7$1(tabContentPresenter, mutableState, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TabContentPresenter$models$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$addedCards$delegate;
        TabContentPresenter tabContentPresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Map) mutableState.getValue()).isEmpty()) {
                        RealLocalBrandSyncer realLocalBrandSyncer = tabContentPresenter.syncer;
                        Set keySet = ((Map) mutableState.getValue()).keySet();
                        this.label = 1;
                        if (realLocalBrandSyncer.syncLocationStatuses(keySet, this) == coroutineSingletons) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshMarketingMessages refreshMarketingMessages = tabContentPresenter.refreshMarketingMessages;
                    this.label = 1;
                    if (refreshMarketingMessages.invoke(this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(RefreshState.copy$default((RefreshState) mutableState.getValue(), 15));
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new RealLocalOrderRepository$getActiveOrders$1(tabContentPresenter.orderRepository, null, 0));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(safeFlow, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow2 = new SafeFlow(new RealLocalOrderRepository$getActiveOrders$1(tabContentPresenter.orderRepository, null, 1));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$12 = new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 3);
                    this.label = 1;
                    if (FlowKt.collectLatest(safeFlow2, tabContentPresenter$models$4$1$1$12, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
