package ru.yandex.taxi.masstransit.detailedroute.overlay;

import defpackage.ah00;
import defpackage.fi6;
import defpackage.fj40;
import defpackage.gf30;
import defpackage.gh00;
import defpackage.hf30;
import defpackage.hj40;
import defpackage.if30;
import defpackage.jf30;
import defpackage.jl40;
import defpackage.jm30;
import defpackage.mvg;
import defpackage.n2j;
import defpackage.ny61;
import defpackage.su30;
import defpackage.w1u;
import defpackage.w211;
import defpackage.w511;
import defpackage.wls;
import defpackage.y540;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "mapMoved", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.overlay.MtDetailedRouteOverlayPresenter$focusModeFlow$2", f = "MtDetailedRouteOverlayPresenter.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteOverlayPresenter$focusModeFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ n2j $state;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteOverlayPresenter$focusModeFlow$2(d dVar, n2j n2jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$state = n2jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailedRouteOverlayPresenter$focusModeFlow$2 mtDetailedRouteOverlayPresenter$focusModeFlow$2 = new MtDetailedRouteOverlayPresenter$focusModeFlow$2(this.this$0, this.$state, continuation);
        mtDetailedRouteOverlayPresenter$focusModeFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return mtDetailedRouteOverlayPresenter$focusModeFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((MtDetailedRouteOverlayPresenter$focusModeFlow$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0135 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object Kg;
        Object obj2;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z) {
            d dVar = this.this$0;
            n2j n2jVar = this.$state;
            this.Z$0 = z;
            this.label = 1;
            su30 su30Var = dVar.x;
            ah00 ah00Var = dVar.F;
            jf30 jf30Var = n2jVar.d;
            if (jl40.l(jf30Var, gf30.a)) {
                if (dVar.C) {
                    su30 su30Var2 = dVar.y;
                    if (su30Var2 != null) {
                        su30Var = su30Var2;
                    }
                    fi6 fi6Var = new fi6();
                    fi6Var.a(su30Var.g.a.d);
                    fi6Var.a(su30Var.g.b.d);
                    fi6Var.d(su30Var.b);
                    ((gh00) ah00Var).A(fi6Var.g(), null);
                }
            } else if (jf30Var instanceof hf30) {
                hf30 hf30Var = (hf30) jf30Var;
                y540 y540Var = hf30Var.a;
                if (y540Var.c.length() == 0) {
                    w211 w211Var = y540Var.b.f;
                    List list = su30Var.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof fj40) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    loop1: while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        fj40 fj40Var = (fj40) obj2;
                        if (fj40Var instanceof jm30) {
                            List list2 = ((jm30) fj40Var).a;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (((w1u) it2.next()).f.equals(w211Var)) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                    }
                    fj40 fj40Var2 = (fj40) obj2;
                    if (fj40Var2 != null && !fj40Var2.e().isEmpty()) {
                        fi6 fi6Var2 = new fi6();
                        Iterator it3 = fj40Var2.e().iterator();
                        while (it3.hasNext()) {
                            fi6Var2.c(((hj40) it3.next()).d);
                        }
                        ((gh00) ah00Var).A(fi6Var2.g(), null);
                    }
                }
                Kg = dVar.Kg(hf30Var, this);
                if (Kg != coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!(jf30Var instanceof if30)) {
                    w511.b();
                    return null;
                }
                hj40 a = ((if30) jf30Var).a.a();
                if (a != null) {
                    ((gh00) ah00Var).D(a.d, 17.0f, 200.0f, null);
                }
            }
            Kg = zy11Var;
            if (Kg != coroutineSingletons) {
            }
        }
        return zy11Var;
    }
}
