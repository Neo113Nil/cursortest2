package app.cash.local.presenters.wallet;

import androidx.compose.runtime.MutableState;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.OrderStatusKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TabContentPresenter$models$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activeOrders$delegate;
    public final /* synthetic */ MutableState $refreshState$delegate;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TabContentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabContentPresenter$models$4$1(TabContentPresenter tabContentPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tabContentPresenter;
        this.$activeOrders$delegate = mutableState;
        this.$refreshState$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TabContentPresenter$models$4$1 tabContentPresenter$models$4$1 = new TabContentPresenter$models$4$1(this.this$0, this.$activeOrders$delegate, this.$refreshState$delegate, continuation);
        tabContentPresenter$models$4$1.L$0 = obj;
        return tabContentPresenter$models$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((TabContentPresenter$models$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1 && i != 2) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        while (true) {
            TabContentPresenter tabContentPresenter = this.this$0;
            MutableState mutableState = this.$activeOrders$delegate;
            JobKt.launch$default(coroutineScope, null, null, new TabContentPresenter$models$7$1(tabContentPresenter, mutableState, null, 2), 3);
            MutableState mutableState2 = this.$refreshState$delegate;
            mutableState2.setValue(RefreshState.copy$default((RefreshState) mutableState2.getValue(), 29));
            if (!((List) mutableState.getValue()).isEmpty()) {
                List list = (List) mutableState.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    LocalOrder.OrderStatus orderStatus = ((LocalOrder) it.next()).order_status;
                    OrderStatus orderStatus2 = orderStatus != null ? OrderStatusKt.toOrderStatus(orderStatus) : null;
                    if (orderStatus2 != null) {
                        arrayList.add(orderStatus2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!OrderStatusKt.getCompleted((OrderStatus) it2.next())) {
                            Duration.Companion companion = Duration.Companion;
                            long duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
                            this.L$0 = coroutineScope;
                            this.label = 2;
                            if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                                break;
                            }
                        }
                    }
                }
            }
            Duration.Companion companion2 = Duration.Companion;
            long duration2 = DurationKt.toDuration(1, DurationUnit.MINUTES);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (JobKt.m4182delayVtjQ1oo(duration2, this) == coroutineSingletons) {
                break;
            }
        }
        return coroutineSingletons;
    }
}
