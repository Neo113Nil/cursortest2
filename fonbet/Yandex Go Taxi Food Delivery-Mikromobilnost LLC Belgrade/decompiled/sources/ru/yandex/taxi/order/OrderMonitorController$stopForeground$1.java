package ru.yandex.taxi.order;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.chx;
import defpackage.dxq0;
import defpackage.exq0;
import defpackage.gxq0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderMonitorController$stopForeground$1", f = "OrderMonitorController.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class OrderMonitorController$stopForeground$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMonitorController$stopForeground$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMonitorController$stopForeground$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMonitorController$stopForeground$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        gxq0 gxq0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.order.services.a aVar = this.this$0.e;
            this.label = 1;
            obj = aVar.d(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ru.yandex.taxi.order.services.b bVar = this.this$0.d.c;
            bVar.getClass();
            jst.e.getClass();
            Set set = bVar.a.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (((chx) obj2).b.b()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ru.yandex.taxi.order.services.e eVar = ((chx) it.next()).b;
                synchronized (eVar) {
                    try {
                        eVar.a();
                        jst.e.o("KeepAliveService", "KeepAliveServiceStateHolder::stopForeground");
                        r0 r0Var = eVar.d;
                        do {
                            value = r0Var.getValue();
                            gxq0Var = (gxq0) value;
                            if (gxq0Var instanceof dxq0) {
                                gxq0Var = new exq0(((dxq0) gxq0Var).a().d());
                            }
                        } while (!r0Var.k(value, gxq0Var));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zy11.a;
    }
}
