package ru.yandex.taxi.masstransit.geopayment.tickets;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.uu30;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wr30;
import defpackage.xr30;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.tickets.MtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1", f = "MtPaymentTicketsInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ wr30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1(Continuation continuation, wr30 wr30Var) {
        super(3, continuation);
        this.this$0 = wr30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1 mtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1 = new MtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        mtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1.L$1 = obj2;
        return mtPaymentTicketsInteractor$listenTicketsChange$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Zone zone;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xr30 xr30Var = this.this$0.a;
            ZoneAddress zoneAddress = ((uu30) obj2).a;
            String str = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : zone.a;
            xr30Var.getClass();
            rol0 rol0Var = new rol0(new MtPaymentTicketsRepository$listenTickets$1(xr30Var, str, null));
            xr30Var.a.getClass();
            sjh sjhVar = uyj.a;
            h hVar = new h(kotlinx.coroutines.flow.e.F(rol0Var, mdh.b), xr30Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(hVar, vprVar, this) == coroutineSingletons) {
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
