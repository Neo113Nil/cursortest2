package ru.yandex.taxi.masstransit.geopayment.tickets;

import defpackage.cmt;
import defpackage.k4z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xr30;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;
import ru.yandex.taxi.masstransit.geopayment.tickets.network.MtTicketsApi;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/masstransit/geopayment/tickets/model/MtTicketsResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsRepository$requestTickets$1", f = "MtPaymentTicketsRepository.kt", l = {106, 106, 109}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtPaymentTicketsRepository$requestTickets$1 extends SuspendLambda implements wls {
    final /* synthetic */ k4z0 $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ xr30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPaymentTicketsRepository$requestTickets$1(xr30 xr30Var, k4z0 k4z0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xr30Var;
        this.$params = k4z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtPaymentTicketsRepository$requestTickets$1 mtPaymentTicketsRepository$requestTickets$1 = new MtPaymentTicketsRepository$requestTickets$1(this.this$0, this.$params, continuation);
        mtPaymentTicketsRepository$requestTickets$1.L$0 = obj;
        return mtPaymentTicketsRepository$requestTickets$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtPaymentTicketsRepository$requestTickets$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r2.emit(r8, r7) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r0.emit(null, r7) != r1) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            xr30 xr30Var = this.this$0;
            cmt<MtTicketsResponse> a = ((MtTicketsApi) xr30Var.c.getValue()).a(this.$params);
            this.L$0 = vprVar2;
            this.L$1 = vprVar2;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.a(a, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            vprVar = vprVar2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = vprVar2;
        this.L$1 = null;
        this.label = 2;
    }
}
