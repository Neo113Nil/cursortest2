package ru.yandex.taxi.analytics;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.RtmClientEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$reportRtmEvent$1", f = "MetricaWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MetricaWrapper$reportRtmEvent$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $eventName;
    final /* synthetic */ sls $eventValueBuilder;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$reportRtmEvent$1(sls slsVar, q qVar, String str, Continuation continuation) {
        super(1, continuation);
        this.$eventValueBuilder = slsVar;
        this.this$0 = qVar;
        this.$eventName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$reportRtmEvent$1(this.$eventValueBuilder, this.this$0, this.$eventName, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MetricaWrapper$reportRtmEvent$1 metricaWrapper$reportRtmEvent$1 = (MetricaWrapper$reportRtmEvent$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        metricaWrapper$reportRtmEvent$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = (String) this.$eventValueBuilder.invoke();
        if (this.this$0.p) {
            AppMetricaYandex.reportRtmEvent(RtmClientEvent.newBuilder(this.$eventName, str).build());
        }
        this.this$0.getClass();
        return zy11.a;
    }
}
