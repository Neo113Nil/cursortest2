package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.fgn0;
import defpackage.fll0;
import defpackage.hac0;
import defpackage.jl40;
import defpackage.jso0;
import defpackage.lhn0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qwo0;
import defpackage.r8c0;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.z7n0;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$goToWaiting$1", f = "ScootersOnTheWayPresenter.kt", l = {164}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$goToWaiting$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersOnTheWayAction $onTheWayAction;
    final /* synthetic */ zuo0 $scootersSessionState;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$goToWaiting$1(f fVar, zuo0 zuo0Var, ScootersOnTheWayAction scootersOnTheWayAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
        this.$onTheWayAction = scootersOnTheWayAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOnTheWayPresenter$goToWaiting$1(this.this$0, this.$scootersSessionState, this.$onTheWayAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$goToWaiting$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            fll0 fll0Var = this.this$0.P;
            this.label = 1;
            obj = fll0Var.b.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        jso0 jso0Var = (jso0) obj;
        jso0.a aVar = jso0Var.c;
        boolean z = jso0Var.b;
        zy11 zy11Var = zy11.a;
        if (!z || aVar == null) {
            this.this$0.Og(this.$scootersSessionState, this.$onTheWayAction);
            return zy11Var;
        }
        List list = aVar.a;
        zuo0 zuo0Var = this.$scootersSessionState;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((jso0.b) obj2).a, zuo0Var.e())) {
                break;
            }
        }
        jso0.b bVar = (jso0.b) obj2;
        String str = bVar != null ? bVar.b : null;
        if (str == null || str.length() == 0) {
            this.this$0.Og(this.$scootersSessionState, this.$onTheWayAction);
            return zy11Var;
        }
        qwo0 qwo0Var = this.this$0.B;
        List list2 = (List) qwo0Var.k.getValue(qwo0Var, qwo0.B[9]);
        int i3 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (jl40.l((String) it2.next(), str) && (i3 = i3 + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        int i4 = aVar.b;
        int i5 = i3;
        f fVar = this.this$0;
        if (i5 >= i4) {
            fVar.Og(this.$scootersSessionState, this.$onTheWayAction);
            return zy11Var;
        }
        lhn0 lhn0Var = fVar.S;
        r8c0 r8c0Var = new r8c0(fVar, str, this.$scootersSessionState, this.$onTheWayAction, 7);
        fgn0 fgn0Var = (fgn0) lhn0Var;
        fgn0Var.getClass();
        z7n0 z7n0Var = new z7n0(str, true);
        ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar2 = fgn0Var.a;
        aVar2.A((m950) aVar2.R.get(), z7n0Var, new hac0(i2, r8c0Var));
        return zy11Var;
    }
}
