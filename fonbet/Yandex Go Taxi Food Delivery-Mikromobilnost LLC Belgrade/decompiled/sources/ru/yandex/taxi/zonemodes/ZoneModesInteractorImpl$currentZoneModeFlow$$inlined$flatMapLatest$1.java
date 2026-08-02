package ru.yandex.taxi.zonemodes;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zonemodes.ZoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1", f = "ZoneModesInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
public final class ZoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tpr $infoFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1(Continuation continuation, j jVar, tpr tprVar) {
        super(3, continuation);
        this.this$0 = jVar;
        this.$infoFlow$inlined = tprVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ZoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1 zoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1 = new ZoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$infoFlow$inlined);
        zoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        zoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return zoneModesInteractorImpl$currentZoneModeFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr d;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o2y0 o2y0Var = (o2y0) obj2;
            j jVar = this.this$0;
            if (o2y0Var != null) {
                d = new rol0(new ZoneModesInteractorImpl$currentZoneModeFlow$1$1(jVar, o2y0Var, null));
            } else {
                tpr tprVar = this.$infoFlow$inlined;
                if (tprVar == null) {
                    tprVar = kotlinx.coroutines.flow.e.t(new g(((k) jVar.d).j.b()));
                }
                d = jVar.d(tprVar);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(d, vprVar, this) == coroutineSingletons) {
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
