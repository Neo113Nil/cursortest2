package ru.yandex.taxi.preorder.map.interactor;

import defpackage.e6l0;
import defpackage.fji;
import defpackage.fnx0;
import defpackage.kb5;
import defpackage.lub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.pex0;
import defpackage.q5z;
import defpackage.vj11;
import defpackage.wls;
import defpackage.zdt0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvj11;", "Lp0c0;", "Lfnx0;", "Llub0;", "Lfji;", "<destruct>", "Le6l0;", "<anonymous>", "(Lvj11;)Le6l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.interactor.RouteOverlayAppearanceInteractor$sourceAppearanceFlow$2", f = "RouteOverlayApperanceInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayAppearanceInteractor$sourceAppearanceFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayAppearanceInteractor$sourceAppearanceFlow$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteOverlayAppearanceInteractor$sourceAppearanceFlow$2 routeOverlayAppearanceInteractor$sourceAppearanceFlow$2 = new RouteOverlayAppearanceInteractor$sourceAppearanceFlow$2(this.this$0, continuation);
        routeOverlayAppearanceInteractor$sourceAppearanceFlow$2.L$0 = obj;
        return routeOverlayAppearanceInteractor$sourceAppearanceFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteOverlayAppearanceInteractor$sourceAppearanceFlow$2) create((vj11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var;
        lub0 lub0Var;
        fji fjiVar;
        c cVar;
        c cVar2;
        e6l0 e6l0Var;
        c cVar3;
        vj11 vj11Var = (vj11) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        e6l0 e6l0Var2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            p0c0 p0c0Var = (p0c0) vj11Var.a;
            fnx0Var = (fnx0) vj11Var.b;
            lub0Var = (lub0) vj11Var.c;
            fjiVar = (fji) vj11Var.d;
            c cVar4 = this.this$0;
            e6l0 e6l0Var3 = new e6l0(p0c0Var, null);
            ru.yandex.taxi.address.interactor.a aVar = cVar4.b;
            kb5 kb5Var = fnx0Var.e;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = fnx0Var;
            this.L$3 = lub0Var;
            this.L$4 = fjiVar;
            this.L$5 = cVar4;
            this.L$6 = cVar4;
            this.L$7 = cVar4;
            this.L$8 = e6l0Var3;
            this.label = 1;
            obj = aVar.a(kb5Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar = cVar4;
            cVar2 = cVar;
            e6l0Var = e6l0Var3;
            cVar3 = cVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e6l0Var = (e6l0) this.L$8;
            cVar = (c) this.L$7;
            cVar3 = (c) this.L$6;
            cVar2 = (c) this.L$5;
            fjiVar = (fji) this.L$4;
            lub0Var = (lub0) this.L$3;
            fnx0Var = (fnx0) this.L$2;
            kotlin.b.b(obj);
        }
        zdt0 zdt0Var = (zdt0) obj;
        if (zdt0Var != null) {
            e eVar = cVar.c;
            Integer c = eVar.c(zdt0Var.a);
            if (c != null) {
                int intValue = c.intValue();
                Integer p = eVar.p(zdt0Var.b);
                if (p != null) {
                    e6l0Var2 = new e6l0(new p0c0(q5z.s(intValue), "", "", q5z.s(p.intValue())), zdt0Var.c);
                }
            }
            if (e6l0Var2 != null) {
                e6l0Var = e6l0Var2;
            }
        } else {
            cVar.getClass();
        }
        e6l0 a = c.a(cVar3, e6l0Var, fjiVar);
        pex0 pex0Var = fnx0Var.c;
        cVar2.getClass();
        if (lub0Var.equals(lub0.d) || pex0Var.u0 != TariffOrderFlow.TAXI_FLOW) {
            return a;
        }
        p0c0 p0c0Var2 = a.a;
        String str = lub0Var.b;
        if (str == null) {
            str = p0c0Var2.a;
        }
        String str2 = lub0Var.c;
        if (str2 == null) {
            str2 = p0c0Var2.d;
        }
        return new e6l0(new p0c0(str, p0c0Var2.b, p0c0Var2.c, str2), lub0Var.a);
    }
}
