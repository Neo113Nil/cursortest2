package ru.yandex.taxi.masstransit.geopayment.modal;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cl30;
import defpackage.mvg;
import defpackage.n26;
import defpackage.ny61;
import defpackage.pk30;
import defpackage.tse;
import defpackage.wls;
import defpackage.zk30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.modal.MtGeoPaymentModalRouterImpl$onAttach$1", f = "MtGeoPaymentModalRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtGeoPaymentModalRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ zk30 $payload;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoPaymentModalRouterImpl$onAttach$1(e eVar, zk30 zk30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$payload = zk30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoPaymentModalRouterImpl$onAttach$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoPaymentModalRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = (f) this.this$0.L.getValue();
            e eVar = this.this$0;
            pk30 pk30Var = eVar.N;
            tse o = eVar.o();
            n26 n26Var = this.$payload.a;
            this.label = 1;
            if (fVar.c(cl30.a, pk30Var, o, n26Var, this) == coroutineSingletons) {
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
