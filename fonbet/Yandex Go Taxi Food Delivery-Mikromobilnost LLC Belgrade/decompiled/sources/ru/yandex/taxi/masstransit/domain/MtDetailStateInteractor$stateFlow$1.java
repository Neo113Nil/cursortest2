package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import defpackage.n1j;
import defpackage.ny61;
import defpackage.rw30;
import defpackage.wb6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrw30;", "routeState", "Ln1j;", "<anonymous>", "(Lrw30;)Ln1j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtDetailStateInteractor$stateFlow$1", f = "MtDetailStateInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailStateInteractor$stateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailStateInteractor$stateFlow$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailStateInteractor$stateFlow$1 mtDetailStateInteractor$stateFlow$1 = new MtDetailStateInteractor$stateFlow$1(this.this$0, continuation);
        mtDetailStateInteractor$stateFlow$1.L$0 = obj;
        return mtDetailStateInteractor$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailStateInteractor$stateFlow$1) create((rw30) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rw30 rw30Var = (rw30) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            ru.yandex.taxi.masstransit.experiment.f fVar = rw30Var.e;
            this.L$0 = rw30Var;
            this.label = 1;
            obj = g.a(gVar, fVar, this);
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
        wb6 wb6Var = (wb6) obj;
        ru.yandex.taxi.masstransit.experiment.f fVar2 = rw30Var.e;
        String a = fVar2 != null ? fVar2.a(rw30Var.a) : null;
        if (a == null) {
            a = "";
        }
        return new n1j(wb6Var, rw30Var, a);
    }
}
