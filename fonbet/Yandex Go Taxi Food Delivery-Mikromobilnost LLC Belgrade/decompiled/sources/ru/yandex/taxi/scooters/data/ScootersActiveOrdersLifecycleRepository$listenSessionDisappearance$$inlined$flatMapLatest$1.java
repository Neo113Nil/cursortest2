package ru.yandex.taxi.scooters.data;

import defpackage.ibn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pqm0;
import defpackage.pvn;
import defpackage.sqm0;
import defpackage.tpr;
import defpackage.uh6;
import defpackage.v4r0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1", f = "ScootersActiveOrdersLifecycleRepository.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class ScootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ pqm0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1(Continuation continuation, pqm0 pqm0Var) {
        super(3, continuation);
        this.this$0 = pqm0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1 scootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1 = new ScootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        scootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Pair pair = (Pair) obj2;
            pqm0 pqm0Var = this.this$0;
            Pair pair2 = ibn0.a;
            sqm0 sqm0Var = (sqm0) pair.c();
            sqm0 sqm0Var2 = (sqm0) pair.f();
            pqm0Var.getClass();
            if (sqm0Var == null || (uh6.y(sqm0Var) && uh6.y(sqm0Var2))) {
                tprVar = pvn.a;
            } else {
                Set g = v4r0.g(pqm0.b(sqm0Var), pqm0.b(sqm0Var2));
                List C = uh6.C(sqm0Var);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : C) {
                    if (g.contains(((zuo0) obj3).getSessionId())) {
                        arrayList.add(obj3);
                    }
                }
                tprVar = new kotlinx.coroutines.flow.g(arrayList);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
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
