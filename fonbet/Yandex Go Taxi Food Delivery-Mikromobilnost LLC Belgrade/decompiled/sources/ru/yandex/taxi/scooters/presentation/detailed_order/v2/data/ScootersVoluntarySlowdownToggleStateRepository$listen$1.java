package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.ScootersVoluntarySlowdownToggleStateRepository$listen$1", f = "ScootersVoluntarySlowdownToggleStateRepository.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersVoluntarySlowdownToggleStateRepository$listen$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $sessionState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersVoluntarySlowdownToggleStateRepository$listen$1(zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.$sessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersVoluntarySlowdownToggleStateRepository$listen$1 scootersVoluntarySlowdownToggleStateRepository$listen$1 = new ScootersVoluntarySlowdownToggleStateRepository$listen$1(this.$sessionState, continuation);
        scootersVoluntarySlowdownToggleStateRepository$listen$1.L$0 = obj;
        return scootersVoluntarySlowdownToggleStateRepository$listen$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersVoluntarySlowdownToggleStateRepository$listen$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Iterator it = this.$sessionState.p().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ScootersSlowdown) obj2).b == ScootersSlowdown.Reason.TRAINING_MODE) {
                    break;
                }
            }
            ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState = ((ScootersSlowdown) obj2) != null ? ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.ON : ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.OFF;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(scootersDetailedOrderAction$ClickType$Toggle$ToggleState, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
