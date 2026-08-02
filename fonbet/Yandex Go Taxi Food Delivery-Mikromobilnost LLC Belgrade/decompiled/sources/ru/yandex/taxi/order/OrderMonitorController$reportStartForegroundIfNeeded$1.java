package ru.yandex.taxi.order;

import defpackage.hhx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tgx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderMonitorController$reportStartForegroundIfNeeded$1", f = "OrderMonitorController.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderMonitorController$reportStartForegroundIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ hhx $result;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMonitorController$reportStartForegroundIfNeeded$1(k kVar, hhx hhxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$result = hhxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderMonitorController$reportStartForegroundIfNeeded$1(this.this$0, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderMonitorController$reportStartForegroundIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.order.services.a aVar = this.this$0.e;
            this.label = 1;
            obj = aVar.b(this);
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
        String str = (String) obj;
        if (str != null) {
            k kVar = this.this$0;
            hhx hhxVar = this.$result;
            tgx tgxVar = kVar.c;
            Class cls = hhxVar.a;
            ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) tgxVar.a).d("Debug.KeepAliveServiceAnalytics.StartForegroundService");
            d.d("service_class", cls.getSimpleName());
            d.d("metricaTag", str);
            d.m();
        }
        return zy11.a;
    }
}
