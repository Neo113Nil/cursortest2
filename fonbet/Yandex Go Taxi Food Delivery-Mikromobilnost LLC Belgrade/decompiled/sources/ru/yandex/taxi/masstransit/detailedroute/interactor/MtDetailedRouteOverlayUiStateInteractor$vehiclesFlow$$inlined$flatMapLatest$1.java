package ru.yandex.taxi.masstransit.detailedroute.interactor;

import defpackage.a631;
import defpackage.azy0;
import defpackage.b3v0;
import defpackage.bzy0;
import defpackage.g92;
import defpackage.gf30;
import defpackage.hf30;
import defpackage.if30;
import defpackage.jf30;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.su30;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w1u;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zyy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.interactor.MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1", f = "MtDetailedRouteOverlayUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ su30 $route$inlined;
    final /* synthetic */ tpr $selectedVehicleFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1(Continuation continuation, a aVar, su30 su30Var, tpr tprVar) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$route$inlined = su30Var;
        this.$selectedVehicleFlow$inlined = tprVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1 mtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1 = new MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$route$inlined, this.$selectedVehicleFlow$inlined);
        mtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return mtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr I;
        ArrayList arrayList;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jf30 jf30Var = (jf30) obj2;
            if (jl40.l(jf30Var, gf30.a)) {
                a aVar = this.this$0;
                I = e.I(aVar.f.b(), new MtDetailedRouteOverlayUiStateInteractor$routeVehicles$1(aVar, this.$route$inlined, null));
            } else if (jf30Var instanceof if30) {
                a aVar2 = this.this$0;
                bzy0 bzy0Var = ((if30) jf30Var).a;
                int i2 = a.h;
                aVar2.getClass();
                if (bzy0Var instanceof zyy0) {
                    List<w1u> list = ((zyy0) bzy0Var).b;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    for (w1u w1uVar : list) {
                        String str = w1uVar.a;
                        arrayList.add(new a631(w1uVar.f.a, null, null, 28));
                    }
                } else {
                    if (!(bzy0Var instanceof azy0)) {
                        w511.b();
                        return null;
                    }
                    List<b3v0> list2 = ((azy0) bzy0Var).b;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    for (b3v0 b3v0Var : list2) {
                        String str2 = b3v0Var.a;
                        arrayList.add(new a631(b3v0Var.d.a, null, null, 28));
                    }
                }
                I = new g92(2, arrayList);
            } else {
                if (!(jf30Var instanceof hf30)) {
                    w511.b();
                    return null;
                }
                I = e.I(com.yandex.go.coroutines.b.d(this.$selectedVehicleFlow$inlined, new MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$lambda$0$$inlined$start$1(((hf30) jf30Var).a.c, null)), new MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$vehiclesFlow$1(jf30Var, null));
            }
            g I2 = e.I(I, new MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1(this.this$0, jf30Var, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(I2, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
