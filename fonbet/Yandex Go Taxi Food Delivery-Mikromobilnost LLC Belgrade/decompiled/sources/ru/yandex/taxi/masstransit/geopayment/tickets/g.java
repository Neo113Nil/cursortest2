package ru.yandex.taxi.masstransit.geopayment.tickets;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.xr30;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xr30 b;

    public g(vpr vprVar, xr30 xr30Var) {
        this.a = vprVar;
        this.b = xr30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e5, code lost:
    
        if (r9.emit(r10, r0) != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1 mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        vpr vprVar2;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar;
        Boolean bool;
        boolean c;
        int i2;
        int i3;
        if (continuation instanceof MtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1) {
            mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1 = (MtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1) continuation;
            int i4 = mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label;
                xr30 xr30Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar2 = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj;
                    vprVar = this.a;
                    if (aVar2 != null) {
                        ru.yandex.taxi.masstransit.geopayment.tickets.storage.a aVar3 = xr30Var.b;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$0 = null;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$1 = null;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$2 = null;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$3 = null;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4 = vprVar;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$5 = null;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$6 = aVar2;
                        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label = 1;
                        obj2 = aVar3.Hg(mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            vprVar2 = vprVar;
                            aVar = aVar2;
                        }
                        return coroutineSingletons;
                    }
                    bool = Boolean.FALSE;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$0 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$1 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$2 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$3 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$5 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$6 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$7 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label = 3;
                } else if (i == 1) {
                    aVar = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$6;
                    vprVar2 = (vpr) mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    i3 = mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.I$0;
                    vprVar2 = (vpr) mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    i2 = i3;
                    vprVar = vprVar2;
                    bool = Boolean.valueOf(i2 != 0);
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$0 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$1 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$2 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$3 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$5 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$6 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$7 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label = 3;
                }
                c = aVar.c((ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj2);
                i2 = !c ? 1 : 0;
                if (!c) {
                    ru.yandex.taxi.masstransit.geopayment.tickets.storage.a aVar4 = xr30Var.b;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$0 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$1 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$2 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$3 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4 = vprVar2;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$5 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$6 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$7 = null;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.I$0 = i2;
                    mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label = 2;
                    if (aVar4.Ig(aVar, mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1) != coroutineSingletons) {
                        i3 = i2;
                        i2 = i3;
                    }
                    return coroutineSingletons;
                }
                vprVar = vprVar2;
                bool = Boolean.valueOf(i2 != 0);
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$0 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$1 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$2 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$3 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$5 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$6 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$7 = null;
                mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label = 3;
            }
        }
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1 = new MtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label;
        xr30 xr30Var2 = this.b;
        if (i != 0) {
        }
        c = aVar.c((ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj22);
        i2 = !c ? 1 : 0;
        if (!c) {
        }
        vprVar = vprVar2;
        bool = Boolean.valueOf(i2 != 0);
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$0 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$1 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$2 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$3 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$4 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$5 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$6 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.L$7 = null;
        mtPaymentTicketsRepository$listenTicketsChange$$inlined$map$1$2$1.label = 3;
    }
}
