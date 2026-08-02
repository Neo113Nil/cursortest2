package ru.yandex.taxi.cashback.sdk;

import defpackage.j49;
import defpackage.jl40;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.sdk.TaxiClientContextRepository$special$$inlined$flatMapLatest$1", f = "TaxiClientContextRepository.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class TaxiClientContextRepository$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiClientContextRepository$special$$inlined$flatMapLatest$1(Continuation continuation, c0 c0Var) {
        super(3, continuation);
        this.this$0 = c0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiClientContextRepository$special$$inlined$flatMapLatest$1 taxiClientContextRepository$special$$inlined$flatMapLatest$1 = new TaxiClientContextRepository$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        taxiClientContextRepository$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        taxiClientContextRepository$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return taxiClientContextRepository$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr l;
        tpr d;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) obj2;
            if (jl40.l(str, "scooters_offer_card")) {
                c0 c0Var = this.this$0;
                com.yandex.go.scooters.domain.i iVar = c0Var.h;
                d = iVar.b.d(null, true);
                l = new m0(kotlinx.coroutines.flow.e.p(new com.yandex.go.scooters.domain.h(d, iVar), 50L), kotlinx.coroutines.flow.e.d(c0Var.e.a), new TaxiClientContextRepository$getScootersClientContextFlow$1(str, null));
            } else {
                boolean z = jl40.l(str, "chargers_station") || jl40.l(str, "chargers_offer_card") || jl40.l(str, "chargers_discovery");
                c0 c0Var2 = this.this$0;
                if (z) {
                    com.yandex.go.chargers.payments.domain.c cVar = c0Var2.g;
                    l = new v(new com.yandex.go.chargers.payments.domain.b(cVar.c.e(), cVar), str);
                } else {
                    com.yandex.go.taxi.order.provider.a aVar = (com.yandex.go.taxi.order.provider.a) c0Var2.b;
                    tpr t = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new b0(kotlinx.coroutines.flow.e.X(new mth(aVar.v(), 6), new TaxiClientContextRepository$special$$inlined$flatMapLatest$2(3, null))), new TaxiClientContextRepository$getTaxiClientContextFlow$1(2, null)));
                    j49 j49Var = c0Var2.d;
                    l = kotlinx.coroutines.flow.e.l(t, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new b(((com.yandex.go.taxi.tariffs.internal.repository.k) j49Var.a).g())), new CashbackTariffContextInteractor$cashbackTariffContextFlow$$inlined$flatMapLatest$1(null, j49Var, jl40.l(str, "summary")))), kotlinx.coroutines.flow.e.t(new d(kotlinx.coroutines.flow.e.t(((com.yandex.go.taxi.tariffs.internal.repository.k) j49Var.c).i()), j49Var)), kotlinx.coroutines.flow.e.d(c0Var2.e.a), kotlinx.coroutines.flow.e.t(new z(jl40.l(str, "ride") ? new x(kotlinx.coroutines.flow.e.X(new mth(aVar.v(), 6), new TaxiClientContextRepository$getSelectedPaymentMethodFlow$$inlined$flatMapLatest$1())) : ((com.yandex.go.payments.paymentlist.data.c) c0Var2.f).g.C)), new TaxiClientContextRepository$getTaxiClientContextFlow$3(c0Var2, str, null));
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(l, vprVar, this) == coroutineSingletons) {
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
