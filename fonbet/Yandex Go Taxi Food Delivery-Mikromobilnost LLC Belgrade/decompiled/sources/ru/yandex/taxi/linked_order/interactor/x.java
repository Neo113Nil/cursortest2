package ru.yandex.taxi.linked_order.interactor;

import defpackage.h2b1;
import defpackage.jl40;
import defpackage.nly;
import defpackage.ny61;
import defpackage.oly;
import defpackage.ply;
import defpackage.qly;
import defpackage.rly;
import defpackage.s35;
import defpackage.sly;
import defpackage.tly;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class x implements vpr {
    public final /* synthetic */ vpr a;

    public x(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1 linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1;
        int i;
        s35 s35Var;
        if (continuation instanceof LinkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1) {
            linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1 = (LinkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1) continuation;
            int i2 = linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sly slyVar = (sly) obj;
                    if (jl40.l(slyVar, rly.a) || jl40.l(slyVar, qly.a)) {
                        s35Var = s35.k;
                    } else if (slyVar instanceof oly) {
                        tly tlyVar = ((oly) slyVar).a;
                        s35Var = tlyVar != null ? h2b1.g(tlyVar, true) : s35.k;
                    } else if (slyVar instanceof nly) {
                        s35Var = h2b1.g(((nly) slyVar).a, false);
                    } else {
                        if (!(slyVar instanceof ply)) {
                            w511.b();
                            return null;
                        }
                        s35Var = h2b1.g(((ply) slyVar).a, true);
                    }
                    linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.L$0 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.L$1 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.L$2 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.L$3 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(s35Var, linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1 = new LinkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlayDataInteractor$listenMapInfoFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
