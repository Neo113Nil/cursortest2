package ru.yandex.taxi.net.tracker;

import defpackage.h201;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.t201;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseSmoothMovementTracker$startTracking$$inlined$map$1$2$1 baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1;
        int i;
        t201 t201Var;
        if (continuation instanceof BaseSmoothMovementTracker$startTracking$$inlined$map$1$2$1) {
            baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1 = (BaseSmoothMovementTracker$startTracking$$inlined$map$1$2$1) continuation;
            int i2 = baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    e eVar = this.b;
                    if (eVar.K) {
                        ru.yandex.taxi.net.tracker.v2.a aVar = eVar.C;
                        jtq0 jtq0Var = eVar.b;
                        if (aVar != null) {
                            h201 d = aVar.d(jtq0Var.d());
                            if (d != null) {
                                eVar.H = d;
                                eVar.I = d.d;
                            }
                        } else if (jtq0Var.d() - eVar.J >= eVar.M) {
                            eVar.Bg();
                        }
                        h201 h201Var = eVar.H;
                        if (h201Var == null) {
                            t201Var = new t201(false);
                        } else {
                            zzs zzsVar = h201Var.a;
                            Double d2 = h201Var.b;
                            t201Var = new t201(zzsVar, false, d2 != null ? d2.doubleValue() : 0.0d, h201Var.d);
                        }
                    } else {
                        t201Var = new t201(true);
                    }
                    baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.L$0 = null;
                    baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.L$1 = null;
                    baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.L$2 = null;
                    baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.L$3 = null;
                    baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(t201Var, baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1 = new BaseSmoothMovementTracker$startTracking$$inlined$map$1$2$1(this, continuation);
        Object obj22 = baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseSmoothMovementTracker$startTracking$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
