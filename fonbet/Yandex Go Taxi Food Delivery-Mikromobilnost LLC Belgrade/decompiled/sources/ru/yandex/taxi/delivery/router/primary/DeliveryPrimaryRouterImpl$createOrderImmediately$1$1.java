package ru.yandex.taxi.delivery.router.primary;

import defpackage.b8r;
import defpackage.gwh;
import defpackage.h0i;
import defpackage.h3i;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwf;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.router.primary.DeliveryPrimaryRouterImpl$createOrderImmediately$1$1", f = "DeliveryPrimaryRouterImpl.kt", l = {248}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPrimaryRouterImpl$createOrderImmediately$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ h0i $deliveryComponent;
    final /* synthetic */ String $offerId;
    final /* synthetic */ String $tariffClass;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPrimaryRouterImpl$createOrderImmediately$1$1(a aVar, String str, String str2, h0i h0iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$offerId = str;
        this.$tariffClass = str2;
        this.$deliveryComponent = h0iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryPrimaryRouterImpl$createOrderImmediately$1$1(this.this$0, this.$offerId, this.$tariffClass, this.$deliveryComponent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryPrimaryRouterImpl$createOrderImmediately$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 pex0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            ru.yandex.taxi.delivery.interactors.b bVar = aVar.N;
            String str = this.$offerId;
            String str2 = this.$tariffClass;
            wwf wwfVar = aVar.M;
            mi31 d = b8r.d((b8r) wwfVar.a, str2, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, 4);
            h3i h3iVar = new h3i(str, str2, (d == null || (pex0Var = d.a) == null) ? null : ((gwh) wwfVar.b).a(pex0Var));
            this.label = 1;
            obj = bVar.a(h3iVar, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        UUID uuid = (UUID) obj;
        a aVar2 = this.this$0;
        h0i h0iVar = this.$deliveryComponent;
        if (uuid != null) {
            aVar2.U(h0iVar);
            aVar2.O.a(uuid);
        } else {
            aVar2.U(h0iVar);
        }
        return zy11.a;
    }
}
