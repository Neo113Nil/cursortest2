package ru.yandex.taxi.masstransit.domain;

import defpackage.fc30;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.py30;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2", f = "MtOverlayStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2(Continuation continuation, v vVar) {
        super(3, continuation);
        this.this$0 = vVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2 mtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2 = new MtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2((Continuation) obj3, this.this$0);
        mtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        mtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2.L$1 = obj2;
        return mtOverlayStateInteractor$stateFlow$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr sVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Pair pair = (Pair) obj2;
            py30 py30Var = (py30) pair.getFirst();
            fc30 fc30Var = (fc30) pair.getSecond();
            if (py30Var == py30.h) {
                sVar = pvn.a;
            } else if (py30Var.d != null || py30Var.a.isEmpty()) {
                v vVar = this.this$0;
                sVar = new s(kotlinx.coroutines.flow.e.d(vVar.c.b), vVar, fc30Var);
            } else {
                v vVar2 = this.this$0;
                int i2 = v.i;
                vVar2.getClass();
                sVar = new u(new g92(2, py30Var.b), vVar2, fc30Var);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(sVar, vprVar, this) == coroutineSingletons) {
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
