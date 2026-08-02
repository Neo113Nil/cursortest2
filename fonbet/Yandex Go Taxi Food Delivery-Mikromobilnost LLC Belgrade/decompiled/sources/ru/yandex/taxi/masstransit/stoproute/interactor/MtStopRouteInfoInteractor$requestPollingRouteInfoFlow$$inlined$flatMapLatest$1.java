package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.e3n;
import defpackage.k110;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1", f = "MtStopRouteInfoInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1 mtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1 = new MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1(3, (Continuation) obj3);
        mtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mtStopRouteInfoInteractor$requestPollingRouteInfoFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o430 o430Var = e3n.b;
            rol0 l = com.yandex.go.coroutines.b.l(e3n.e(kp50.V(((k110) obj2).d, DurationUnit.SECONDS)));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(l, vprVar, this) == coroutineSingletons) {
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
