package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.fgn0;
import defpackage.hac0;
import defpackage.kgx;
import defpackage.lhn0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdz;
import defpackage.qdx;
import defpackage.qdz;
import defpackage.qwo0;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.z1b1;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$showManualLockInstructionIfNeed$1", f = "ScootersOnTheWayPresenter.kt", l = {220}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$showManualLockInstructionIfNeed$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onComplete;
    final /* synthetic */ zuo0 $scootersSessionState;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$showManualLockInstructionIfNeed$1(sls slsVar, zuo0 zuo0Var, Continuation continuation, f fVar) {
        super(2, continuation);
        this.$scootersSessionState = zuo0Var;
        this.this$0 = fVar;
        this.$onComplete = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOnTheWayPresenter$showManualLockInstructionIfNeed$1(this.$onComplete, this.$scootersSessionState, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$showManualLockInstructionIfNeed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qdz qdzVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            qdz a = z1b1.a(this.$scootersSessionState);
            if (a instanceof pdz) {
                ru.yandex.taxi.scooters.presentation.ontheway.lock.domain.a aVar = this.this$0.H;
                this.L$0 = a;
                this.label = 1;
                Object a2 = aVar.a(this);
                if (a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qdzVar = a;
                obj = a2;
            }
            this.$onComplete.invoke();
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qdzVar = (qdz) this.L$0;
        kotlin.b.b(obj);
        if (((Boolean) obj).booleanValue()) {
            lhn0 lhn0Var = this.this$0.S;
            sls slsVar = this.$onComplete;
            ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar2 = ((fgn0) lhn0Var).a;
            aVar2.A((m950) aVar2.S.get(), (pdz) qdzVar, new hac0(i2, slsVar));
            qwo0 qwo0Var = this.this$0.H.a;
            qdx qdxVar = qwo0Var.e;
            kgx[] kgxVarArr = qwo0.B;
            qwo0Var.e.setValue(qwo0Var, kgxVarArr[3], Integer.valueOf(((Number) qdxVar.getValue(qwo0Var, kgxVarArr[3])).intValue() + 1));
            qwo0Var.f.setValue(qwo0Var, kgxVarArr[4], Long.valueOf(System.currentTimeMillis()));
            return zy11Var;
        }
        this.$onComplete.invoke();
        return zy11Var;
    }
}
