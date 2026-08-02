package ru.yandex.taxi.orderbutton.summary.base.interactors;

import defpackage.f0z;
import defpackage.g92;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ro0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderbutton.summary.base.interactors.SummaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1", f = "SummaryButtonModelInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SummaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1(Continuation continuation, i iVar) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1 summaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1 = new SummaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        summaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        summaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return summaryButtonModelInteractor$priceLoadingFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        tpr rol0Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj3 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Pair pair = (Pair) obj3;
            String str = (String) pair.getFirst();
            if (((Boolean) pair.getSecond()).booleanValue()) {
                ro0 ro0Var = this.this$0.i;
                if (ro0Var.a() && ro0Var.c.b().d.b.c) {
                    rol0Var = new g92(2, Boolean.TRUE);
                } else if (((f0z) this.this$0.f.b.b()).b()) {
                    Iterator it = ((f0z) this.this$0.f.b.b()).c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((f0z.a) obj2).a, str)) {
                            break;
                        }
                    }
                    f0z.a aVar = (f0z.a) obj2;
                    Long l = aVar != null ? aVar.d : null;
                    rol0Var = l != null ? new rol0(new SummaryButtonModelInteractor$priceLoadingFlow$4$1(l.longValue(), null)) : new g92(2, Boolean.TRUE);
                } else {
                    rol0Var = new g92(2, Boolean.TRUE);
                }
            } else {
                rol0Var = new g92(2, Boolean.FALSE);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(rol0Var, vprVar, this) == coroutineSingletons) {
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
