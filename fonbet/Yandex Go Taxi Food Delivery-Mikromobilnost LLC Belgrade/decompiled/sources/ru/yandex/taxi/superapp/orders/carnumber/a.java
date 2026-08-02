package ru.yandex.taxi.superapp.orders.carnumber;

import com.yandex.go.taxi.order.y;
import defpackage.bpt0;
import defpackage.fag;
import defpackage.ny61;
import defpackage.p201;
import defpackage.q5z;
import defpackage.s58;
import defpackage.vpr;
import defpackage.z280;
import defpackage.zay0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s58 b;

    public a(vpr vprVar, s58 s58Var) {
        this.a = vprVar;
        this.b = s58Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CarNumberBubbleOverlay$resume$$inlined$map$1$2$1 carNumberBubbleOverlay$resume$$inlined$map$1$2$1;
        int i;
        boolean z;
        if (continuation instanceof CarNumberBubbleOverlay$resume$$inlined$map$1$2$1) {
            carNumberBubbleOverlay$resume$$inlined$map$1$2$1 = (CarNumberBubbleOverlay$resume$$inlined$map$1$2$1) continuation;
            int i2 = carNumberBubbleOverlay$resume$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carNumberBubbleOverlay$resume$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = carNumberBubbleOverlay$resume$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carNumberBubbleOverlay$resume$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    z280 z280Var = (z280) obj;
                    boolean z2 = false;
                    if (z280Var.b) {
                        s58 s58Var = this.b;
                        bpt0 i3 = ((y) s58Var.k.b).i(s58Var.a.b().a);
                        if (i3 != null) {
                            zay0 zay0Var = (zay0) ((fag) i3).E.get();
                            q5z.i(zay0Var);
                            p201 Q2 = zay0Var.Q2();
                            if (Q2 != null) {
                                z = Q2.a;
                                if (!z) {
                                    z2 = true;
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    z280 z280Var2 = new z280(z280Var.a, z2, z280Var.c, z280Var.d);
                    carNumberBubbleOverlay$resume$$inlined$map$1$2$1.L$0 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$1$2$1.L$1 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$1$2$1.L$2 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$1$2$1.L$3 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(z280Var2, carNumberBubbleOverlay$resume$$inlined$map$1$2$1) == coroutineSingletons) {
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
        carNumberBubbleOverlay$resume$$inlined$map$1$2$1 = new CarNumberBubbleOverlay$resume$$inlined$map$1$2$1(this, continuation);
        Object obj22 = carNumberBubbleOverlay$resume$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carNumberBubbleOverlay$resume$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
