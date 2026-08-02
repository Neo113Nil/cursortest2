package ru.yandex.taxi.summary.solid.repository;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.main.map.h;
import ru.yandex.taxi.main.map.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.repository.SummaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1", f = "SummaryPinV2DataRepository.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SummaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, f fVar) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1 summaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1 = new SummaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        summaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        summaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return summaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
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
            boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
            boolean booleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
            if (booleanValue && booleanValue2) {
                f fVar = this.this$0;
                tpr t = kotlinx.coroutines.flow.e.t(new b(fVar.a.f()));
                r0 r0Var = fVar.c.a;
                tpr t2 = kotlinx.coroutines.flow.e.t(new e(((k) fVar.e).j.a()));
                i iVar = fVar.b;
                tpr t3 = kotlinx.coroutines.flow.e.t(new h(((k) iVar.b).j.b(), iVar));
                com.yandex.go.summary.branding_pin.i iVar2 = fVar.g;
                tprVar = new c(new tpr[]{t, r0Var, t2, t3, iVar2.d(), iVar2.c()}, fVar);
            } else {
                tprVar = pvn.a;
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
