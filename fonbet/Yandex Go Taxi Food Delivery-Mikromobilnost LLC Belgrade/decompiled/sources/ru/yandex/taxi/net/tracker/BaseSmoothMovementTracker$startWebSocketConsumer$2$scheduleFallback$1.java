package ru.yandex.taxi.net.tracker;

import com.yandex.go.taxi.order.net.xiva.n;
import com.yandex.go.taxi_order.ws.XivaWsAnalytics$TaxiRoutePollingFallbackReason;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.te51;
import defpackage.tse;
import defpackage.u201;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$startWebSocketConsumer$2$scheduleFallback$1", f = "BaseSmoothMovementTracker.kt", l = {324}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseSmoothMovementTracker$startWebSocketConsumer$2$scheduleFallback$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delayMs;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSmoothMovementTracker$startWebSocketConsumer$2$scheduleFallback$1(long j, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$delayMs = j;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseSmoothMovementTracker$startWebSocketConsumer$2$scheduleFallback$1(this.$delayMs, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSmoothMovementTracker$startWebSocketConsumer$2$scheduleFallback$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o430 o430Var = e3n.b;
            long V = kp50.V(this.$delayMs, DurationUnit.MILLISECONDS);
            this.label = 1;
            if (kotlinx.coroutines.a.j(V, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        e eVar = this.this$0;
        u201 u201Var = eVar.z;
        if (u201Var != null) {
            te51 te51Var = ((n) u201Var).f;
            XivaWsAnalytics$TaxiRoutePollingFallbackReason xivaWsAnalytics$TaxiRoutePollingFallbackReason = XivaWsAnalytics$TaxiRoutePollingFallbackReason.Timeout;
            te51Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(CRLReasonCodeExtension.REASON, xivaWsAnalytics$TaxiRoutePollingFallbackReason.getEventValue());
            te51Var.a.a("XivaWs.TaxiRouteFallback.Started", hashMap, 1, new HashMap());
        }
        eVar.Cg(BaseSmoothMovementTracker$DataOrigin.ENDPOINT);
        eVar.Bg();
        return zy11.a;
    }
}
