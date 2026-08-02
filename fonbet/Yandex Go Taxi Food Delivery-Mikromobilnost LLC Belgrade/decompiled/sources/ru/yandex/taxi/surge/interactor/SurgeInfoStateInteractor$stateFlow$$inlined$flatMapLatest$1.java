package ru.yandex.taxi.surge.interactor;

import defpackage.g92;
import defpackage.itw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1", f = "SurgeInfoStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SurgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $origin$inlined;
    final /* synthetic */ tpr $selectionFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, q qVar, tpr tprVar, String str) {
        super(3, continuation);
        this.this$0 = qVar;
        this.$selectionFlow$inlined = tprVar;
        this.$origin$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SurgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1 surgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1 = new SurgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$selectionFlow$inlined, this.$origin$inlined);
        surgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        surgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return surgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((PriceUpdate$PriceLoadingState) obj2) == PriceUpdate$PriceLoadingState.LOADED) {
                q qVar = this.this$0;
                g92Var = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(qVar.f.a(), ((com.yandex.go.taxi.tariffs.internal.repository.k) qVar.c).j.b(), this.$selectionFlow$inlined, new SurgeInfoStateInteractor$stateFlowForCurrentTariff$1(qVar, this.$origin$inlined, null))), new SurgeInfoStateInteractor$stateFlowForCurrentTariff$$inlined$flatMapLatest$1(null, qVar));
            } else {
                g92Var = new g92(2, itw0.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
