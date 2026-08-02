package ru.yandex.taxi.masstransit.geopayment.tickets;

import defpackage.k4z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.s8o;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xr30;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;
import ru.yandex.taxi.masstransit.geopayment.tickets.network.MtTicketsApi;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsRepository$listenTickets$1", f = "MtPaymentTicketsRepository.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_256, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtPaymentTicketsRepository$listenTickets$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $zoneName;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xr30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPaymentTicketsRepository$listenTickets$1(xr30 xr30Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xr30Var;
        this.$zoneName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtPaymentTicketsRepository$listenTickets$1 mtPaymentTicketsRepository$listenTickets$1 = new MtPaymentTicketsRepository$listenTickets$1(this.this$0, this.$zoneName, continuation);
        mtPaymentTicketsRepository$listenTickets$1.L$0 = obj;
        return mtPaymentTicketsRepository$listenTickets$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtPaymentTicketsRepository$listenTickets$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r9) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:8:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:8:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long I;
        Long l;
        r1e0 r1e0Var;
        xr30 xr30Var;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a a;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            I = s8o.I(th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.a.k(get_context());
            xr30Var = this.this$0;
            k4z0 k4z0Var = new k4z0(this.$zoneName);
            this.L$0 = vprVar;
            this.L$1 = xr30Var;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.c(((MtTicketsApi) xr30Var.c.getValue()).a(k4z0Var), null, this);
            if (obj == coroutineSingletons) {
            }
            r1e0 r1e0Var2 = (r1e0) obj;
            a = xr30.a(xr30Var, (MtTicketsResponse) r1e0Var2.a);
            this.L$0 = vprVar;
            this.L$1 = r1e0Var2;
            this.label = 2;
            if (vprVar.emit(a, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    r1e0Var = (r1e0) this.L$1;
                    kotlin.b.b(obj);
                    I = r1e0Var.b;
                    l = I;
                    if (l != null) {
                    }
                    if (kotlinx.coroutines.a.p(get_context())) {
                    }
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l = (Long) this.L$1;
                kotlin.b.b(obj);
                if (kotlinx.coroutines.a.p(get_context()) || l == null) {
                    return zy11.a;
                }
                kotlinx.coroutines.a.k(get_context());
                xr30Var = this.this$0;
                k4z0 k4z0Var2 = new k4z0(this.$zoneName);
                this.L$0 = vprVar;
                this.L$1 = xr30Var;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.c(((MtTicketsApi) xr30Var.c.getValue()).a(k4z0Var2), null, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                r1e0 r1e0Var22 = (r1e0) obj;
                a = xr30.a(xr30Var, (MtTicketsResponse) r1e0Var22.a);
                this.L$0 = vprVar;
                this.L$1 = r1e0Var22;
                this.label = 2;
                if (vprVar.emit(a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                r1e0Var = r1e0Var22;
                I = r1e0Var.b;
                l = I;
                if (l != null) {
                    long longValue = l.longValue();
                    this.L$0 = vprVar;
                    this.L$1 = l;
                    this.J$0 = longValue;
                    this.label = 3;
                }
                if (kotlinx.coroutines.a.p(get_context())) {
                }
                return zy11.a;
            }
            xr30Var = (xr30) this.L$1;
            kotlin.b.b(obj);
            r1e0 r1e0Var222 = (r1e0) obj;
            a = xr30.a(xr30Var, (MtTicketsResponse) r1e0Var222.a);
            this.L$0 = vprVar;
            this.L$1 = r1e0Var222;
            this.label = 2;
            if (vprVar.emit(a, this) == coroutineSingletons) {
            }
        }
    }
}
