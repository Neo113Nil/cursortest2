package ru.yandex.taxi.masstransit.geopayment.tickets;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.xr30;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xr30 b;

    public c(vpr vprVar, xr30 xr30Var) {
        this.a = vprVar;
        this.b = xr30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1 mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1) {
            mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1 = (MtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1) continuation;
            int i2 = mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.masstransit.geopayment.tickets.model.a a = xr30.a(this.b, (MtTicketsResponse) obj);
                    mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.L$0 = null;
                    mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.L$1 = null;
                    mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.L$2 = null;
                    mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.L$3 = null;
                    mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1 = new MtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPaymentTicketsRepository$getTickets$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
