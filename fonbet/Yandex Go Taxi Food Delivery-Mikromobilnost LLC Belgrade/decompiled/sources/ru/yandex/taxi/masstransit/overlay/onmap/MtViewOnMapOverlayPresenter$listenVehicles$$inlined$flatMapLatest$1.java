package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.a631;
import defpackage.azy0;
import defpackage.b3v0;
import defpackage.bzy0;
import defpackage.ck40;
import defpackage.dk40;
import defpackage.ek40;
import defpackage.fk40;
import defpackage.g92;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w1u;
import defpackage.w511;
import defpackage.y540;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zyy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.MtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1", f = "MtViewOnMapOverlayPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1(Continuation continuation, h hVar) {
        super(3, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1 mtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1 = new MtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        mtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1.L$1 = obj2;
        return mtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fk40 fk40Var = (fk40) obj2;
            h hVar = this.this$0;
            hVar.getClass();
            if (jl40.l(fk40Var, ck40.a)) {
                g92Var = new g92(2, EmptyList.a);
            } else if (fk40Var instanceof dk40) {
                y540 y540Var = ((dk40) fk40Var).a;
                g92Var = new g(new e(com.yandex.go.coroutines.b.d(hVar.A.b, new MtViewOnMapOverlayPresenter$selectedVehicleFlowWithInitial$$inlined$start$1(y540Var.c, null)), y540Var.b));
            } else {
                if (!(fk40Var instanceof ek40)) {
                    w511.b();
                    return null;
                }
                bzy0 bzy0Var = ((ek40) fk40Var).a;
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
                g92Var = new g92(2, arrayList);
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
