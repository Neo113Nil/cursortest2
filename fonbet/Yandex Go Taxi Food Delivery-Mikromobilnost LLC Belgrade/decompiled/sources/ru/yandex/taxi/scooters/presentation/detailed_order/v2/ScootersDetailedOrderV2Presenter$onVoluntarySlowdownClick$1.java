package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Presenter$onVoluntarySlowdownClick$1", f = "ScootersDetailedOrderV2Presenter.kt", l = {312}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderV2Presenter$onVoluntarySlowdownClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $enable;
    final /* synthetic */ zuo0 $scootersSessionState;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderV2Presenter$onVoluntarySlowdownClick$1(e eVar, boolean z, zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$enable = z;
        this.$scootersSessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDetailedOrderV2Presenter$onVoluntarySlowdownClick$1(this.this$0, this.$enable, this.$scootersSessionState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailedOrderV2Presenter$onVoluntarySlowdownClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.K;
            boolean z = this.$enable;
            String m = this.$scootersSessionState.m();
            this.label = 1;
            if (gVar.e(m, this, z) == coroutineSingletons) {
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
