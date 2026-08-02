package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.a2a0;
import defpackage.f4a0;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.rnb;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes6.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public g(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        if (r1.emit(r2, r5) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1 mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        b bVar;
        lv90 lv90Var;
        f4a0 f4a0Var;
        int i2;
        if (continuation instanceof MtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1) {
            mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1 = (MtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1) continuation;
            int i3 = mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                MtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1 mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12 = mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1;
                Object obj2 = mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lv90 lv90Var2 = (lv90) obj;
                    k kVar = this.b;
                    b bVar2 = kVar.c;
                    a2a0 a2a0Var = kVar.e;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$0 = null;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$1 = null;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$2 = null;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$3 = null;
                    vpr vprVar2 = this.a;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$4 = vprVar2;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$5 = null;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$6 = lv90Var2;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$7 = bVar2;
                    mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.label = 1;
                    Object a = a2a0.a(a2a0Var, lv90Var2, null, null, mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12, 12);
                    if (a != coroutineSingletons) {
                        vprVar = vprVar2;
                        bVar = bVar2;
                        obj2 = a;
                        lv90Var = lv90Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                bVar = (b) mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$7;
                lv90Var = (lv90) mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$6;
                vprVar = (vpr) mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$4;
                kotlin.b.b(obj2);
                f4a0Var = new f4a0((m1a0) obj2, lv90Var);
                bVar.getClass();
                PaymentMethod$Type paymentMethod$Type = lv90Var.a;
                i2 = paymentMethod$Type != null ? -1 : rnb.c[paymentMethod$Type.ordinal()];
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    f4a0Var = f4a0.c;
                }
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$0 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$1 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$2 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$3 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$4 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$5 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$6 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.L$7 = null;
                mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$12.label = 2;
            }
        }
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1 = new MtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1(this, continuation);
        MtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1 mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122 = mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$1;
        Object obj22 = mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        f4a0Var = new f4a0((m1a0) obj22, lv90Var);
        bVar.getClass();
        PaymentMethod$Type paymentMethod$Type2 = lv90Var.a;
        if (paymentMethod$Type2 != null) {
        }
        if (i2 != 1) {
            f4a0Var = f4a0.c;
        }
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$0 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$1 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$2 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$3 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$4 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$5 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$6 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.L$7 = null;
        mtCheckoutInteractor$paymentMethodState$$inlined$map$1$2$122.label = 2;
    }
}
