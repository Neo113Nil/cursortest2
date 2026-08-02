package ru.yandex.taxi.order;

import defpackage.az70;
import defpackage.bz70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderListOverlayStateProvider$onChange$$inlined$start$1", f = "OrderListOverlayStateProvider.kt", l = {HProv.PP_SIGNATUREOID, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class OrderListOverlayStateProvider$onChange$$inlined$start$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ bz70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListOverlayStateProvider$onChange$$inlined$start$1(bz70 bz70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bz70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderListOverlayStateProvider$onChange$$inlined$start$1 orderListOverlayStateProvider$onChange$$inlined$start$1 = new OrderListOverlayStateProvider$onChange$$inlined$start$1(this.this$0, continuation);
        orderListOverlayStateProvider$onChange$$inlined$start$1.L$0 = obj;
        return orderListOverlayStateProvider$onChange$$inlined$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderListOverlayStateProvider$onChange$$inlined$start$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r2.emit(r4, r7) == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o2y0 o2y0Var;
        vpr vprVar;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o2y0 a = this.this$0.a();
            com.yandex.go.taxi.order.provider.a aVar = this.this$0.a;
            this.L$0 = null;
            this.L$1 = vprVar2;
            this.L$2 = null;
            this.L$3 = a;
            this.label = 1;
            Object k = aVar.k(this);
            if (k != coroutineSingletons) {
                o2y0Var = a;
                obj = k;
                vprVar = vprVar2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o2y0Var = (o2y0) this.L$3;
        vprVar = (vpr) this.L$1;
        kotlin.b.b(obj);
        az70 az70Var = new az70((List) obj, o2y0Var);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
