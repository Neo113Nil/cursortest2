package ru.yandex.taxi.superapp.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv0;", "addressInfo", "Lzy11;", "<anonymous>", "(Lpv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.address.OrderAddressInteractor$observeAddressState$1", f = "OrderAddressInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderAddressInteractor$observeAddressState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderAddressInteractor$observeAddressState$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderAddressInteractor$observeAddressState$1 orderAddressInteractor$observeAddressState$1 = new OrderAddressInteractor$observeAddressState$1(this.this$0, continuation);
        orderAddressInteractor$observeAddressState$1.L$0 = obj;
        return orderAddressInteractor$observeAddressState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderAddressInteractor$observeAddressState$1 orderAddressInteractor$observeAddressState$1 = (OrderAddressInteractor$observeAddressState$1) create((pv0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderAddressInteractor$observeAddressState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address;
        pv0 pv0Var = (pv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.d.m(new ZoneAddress(pv0Var.a, (Zone) null), null);
        ru.yandex.taxi.preorder.source.domain.a aVar = this.this$0.e;
        pv0 c = aVar.c();
        hst hstVar = jst.e;
        if (c != null && (address = c.a) != null) {
            address.d();
        }
        hstVar.getClass();
        if (c != null) {
            aVar.b(c, EmptySet.a);
        }
        return zy11.a;
    }
}
