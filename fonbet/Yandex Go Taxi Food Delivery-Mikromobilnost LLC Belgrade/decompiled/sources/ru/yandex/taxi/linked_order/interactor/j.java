package ru.yandex.taxi.linked_order.interactor;

import defpackage.m201;
import defpackage.ny61;
import defpackage.p201;
import defpackage.t201;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f0 b;

    public j(vpr vprVar, f0 f0Var) {
        this.a = vprVar;
        this.b = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1 linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1;
        int i;
        ru.yandex.taxi.linked_order.map.movement.a aVar = this.b.f;
        if (continuation instanceof LinkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1) {
            linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1 = (LinkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1) continuation;
            int i2 = linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t201 t201Var = (t201) obj;
                    t201 t201Var2 = new t201(t201Var.a, t201Var.b, aVar.B0() ? 0.0d : t201Var.c, t201Var.d);
                    p201 Q2 = aVar.Q2();
                    m201 m201Var = new m201(t201Var2, Q2 != null ? Q2.j : null);
                    linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.L$0 = null;
                    linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.L$1 = null;
                    linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.L$2 = null;
                    linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.L$3 = null;
                    linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(m201Var, linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1) == coroutineSingletons) {
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
        linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1 = new LinkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlayDataInteractor$listenCarGeometry$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
