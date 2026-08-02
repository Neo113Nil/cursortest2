package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ahx;
import defpackage.chx;
import defpackage.dxq0;
import defpackage.g8e;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.order.services.KeepAliveServicePoolFactory$NoMoreServiceException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderMonitorController$ensureService$1", f = "OrderMonitorController.kt", l = {28, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderMonitorController$ensureService$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMonitorController$ensureService$1(k kVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMonitorController$ensureService$1(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMonitorController$ensureService$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r13 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0029, code lost:
    
        if (r13 == r1) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.order.services.a aVar = this.this$0.e;
            this.label = 1;
            obj = aVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    this.this$0.a(this.$order, false, 0L);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ahx ahxVar = this.this$0.d;
            String str = this.$order.a;
            ru.yandex.taxi.order.services.b bVar = ahxVar.c;
            bVar.getClass();
            try {
                bVar.a(str).a(str);
            } catch (IllegalStateException e) {
                xby.l(jst.e, "KEEP_ALIVE_SERVICE:CANT_START_SERVICE_FROM_BACKGROUND", null, e, g8e.o("Failed to start service for order ", str), 2);
            } catch (KeepAliveServicePoolFactory$NoMoreServiceException e2) {
                xby.l(jst.e, "KEEP_ALIVE_SERVICE:SERVICE_LIMIT_EXCEED", null, e2, g8e.o("Failed to start foreground service for order ", str), 2);
            } catch (Exception e3) {
                xby.l(jst.e, "KEEP_ALIVE_SERVICE:CANT_START_SERVICE", null, e3, g8e.o("Failed to start service for order ", str), 2);
            }
        }
        ahx ahxVar2 = this.this$0.d;
        TaxiOrder taxiOrder = this.$order;
        ru.yandex.taxi.order.services.c cVar = ahxVar2.b;
        String str2 = taxiOrder.a;
        Iterator it = cVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            chx chxVar = (chx) next;
            if (chxVar.b.c(str2) && (chxVar.b.e.a.getValue() instanceof dxq0)) {
                obj2 = next;
                break;
            }
        }
        if (((chx) obj2) != null) {
            ru.yandex.taxi.order.services.a aVar2 = this.this$0.e;
            this.label = 2;
            obj = aVar2.d(this);
        }
        return zy11.a;
    }
}
