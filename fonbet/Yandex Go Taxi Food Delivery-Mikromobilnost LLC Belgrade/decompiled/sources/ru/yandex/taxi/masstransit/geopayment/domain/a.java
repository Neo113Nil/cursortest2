package ru.yandex.taxi.masstransit.geopayment.domain;

import defpackage.ny61;
import defpackage.pn30;
import defpackage.rj40;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sl30;
import defpackage.tj40;
import defpackage.ul30;
import defpackage.vj40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wl30;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ca, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1 mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Object b;
        if (continuation instanceof MtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1) {
            mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1 = (MtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1) continuation;
            int i2 = mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    tj40 tj40Var = (tj40) obj;
                    int i3 = vj40.a[tj40Var.b.ordinal()];
                    c cVar = this.b;
                    vprVar = this.a;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            rj40 rj40Var = tj40Var.c;
                            Throwable th = rj40Var != null ? rj40Var.a : null;
                            b = s8o.B(th) ? sl30.e : c.b(cVar, th);
                        } else {
                            if (i3 != 3) {
                                w511.b();
                                return null;
                            }
                            pn30 pn30Var = pn30.a;
                            b = new ul30(scc.g(pn30Var, pn30Var, pn30Var));
                        }
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$0 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$1 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$2 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$3 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$4 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$5 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$6 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label = 2;
                    } else {
                        MtVehiclesResponse mtVehiclesResponse = tj40Var.a;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$0 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$1 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$2 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$3 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$4 = vprVar;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$5 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$6 = null;
                        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label = 1;
                        obj2 = c.a(cVar, mtVehiclesResponse, mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                b = new wl30((List) obj2);
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$0 = null;
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$1 = null;
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$2 = null;
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$3 = null;
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$4 = null;
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$5 = null;
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$6 = null;
                mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label = 2;
            }
        }
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1 = new MtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        b = new wl30((List) obj22);
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$0 = null;
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$1 = null;
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$2 = null;
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$3 = null;
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$4 = null;
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$5 = null;
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.L$6 = null;
        mtVehiclesInteractor$mapVehicles$$inlined$map$1$2$1.label = 2;
    }
}
