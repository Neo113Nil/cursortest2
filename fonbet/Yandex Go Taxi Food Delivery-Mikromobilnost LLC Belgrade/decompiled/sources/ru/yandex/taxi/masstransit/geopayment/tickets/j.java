package ru.yandex.taxi.masstransit.geopayment.tickets;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n;

/* loaded from: classes6.dex */
public final class j implements tpr {
    public final /* synthetic */ n a;

    public j(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtPaymentTicketsRepository$pollTickets$$inlined$map$1$1 mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtPaymentTicketsRepository$pollTickets$$inlined$map$1$1) {
            mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1 = (MtPaymentTicketsRepository$pollTickets$$inlined$map$1$1) continuation;
            int i2 = mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar);
                    mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.L$0 = null;
                    mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.L$1 = null;
                    mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.L$2 = null;
                    mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.label = 1;
                    if (this.a.collect(iVar, mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1 = new MtPaymentTicketsRepository$pollTickets$$inlined$map$1$1(this, continuation);
        Object obj2 = mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPaymentTicketsRepository$pollTickets$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
