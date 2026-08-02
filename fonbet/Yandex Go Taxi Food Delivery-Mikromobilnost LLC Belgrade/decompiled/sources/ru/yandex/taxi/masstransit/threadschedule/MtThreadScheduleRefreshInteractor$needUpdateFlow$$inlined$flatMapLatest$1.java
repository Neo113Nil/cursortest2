package ru.yandex.taxi.masstransit.threadschedule;

import defpackage.b640;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.z540;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.experiment.f;
import ru.yandex.taxi.masstransit.utils.RefreshState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.threadschedule.MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1", f = "MtThreadScheduleRefreshInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ f $config$inlined;
    final /* synthetic */ b640 $stateRepository$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1(Continuation continuation, b640 b640Var, f fVar) {
        super(3, continuation);
        this.$stateRepository$inlined = b640Var;
        this.$config$inlined = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1 mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1 = new MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.$stateRepository$inlined, this.$config$inlined);
        mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
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
            if (((Boolean) obj2).booleanValue()) {
                b640 b640Var = this.$stateRepository$inlined;
                tprVar = kotlinx.coroutines.flow.e.X(com.yandex.go.coroutines.b.d(b640Var.b, new MtThreadScheduleRefreshInteractor$needUpdateFlow$lambda$1$$inlined$start$1(((z540) b640Var.d.a.getValue()).b.isEmpty() ? RefreshState.LOADING : RefreshState.SILENT, null)), new MtThreadScheduleRefreshInteractor$needUpdateFlow$lambda$1$$inlined$flatMapLatest$1(null, this.$config$inlined));
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
