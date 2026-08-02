package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.a2a0;
import defpackage.ib40;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r b;

    public l(vpr vprVar, r rVar) {
        this.a = vprVar;
        this.b = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if (r10.emit(r1, r5) != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1 mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        lv90 lv90Var;
        if (continuation instanceof MtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1) {
            mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1 = (MtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                MtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1 mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12 = mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1;
                Object obj2 = mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lv90 lv90Var2 = (lv90) obj;
                    a2a0 a2a0Var = this.b.c;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$0 = null;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$1 = null;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$2 = null;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$3 = null;
                    vpr vprVar2 = this.a;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$4 = vprVar2;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$5 = null;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$6 = lv90Var2;
                    mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.label = 1;
                    obj2 = a2a0.a(a2a0Var, lv90Var2, null, null, mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12, 12);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
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
                lv90Var = (lv90) mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$6;
                vprVar = (vpr) mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$4;
                kotlin.b.b(obj2);
                ib40 ib40Var = new ib40((m1a0) obj2, lv90Var);
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$0 = null;
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$1 = null;
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$2 = null;
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$3 = null;
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$4 = null;
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$5 = null;
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.L$6 = null;
                mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$12.label = 2;
            }
        }
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1 = new MtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1(this, continuation);
        MtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1 mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122 = mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$1;
        Object obj22 = mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        ib40 ib40Var2 = new ib40((m1a0) obj22, lv90Var);
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.L$0 = null;
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.L$1 = null;
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.L$2 = null;
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.L$3 = null;
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.L$4 = null;
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.L$5 = null;
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.L$6 = null;
        mtTrainCheckoutUiStateRepository$paymentMethodFlow$$inlined$map$1$2$122.label = 2;
    }
}
