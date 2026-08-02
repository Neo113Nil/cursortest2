package ru.yandex.taxi.analytics;

import defpackage.lc20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetrica;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$requestDeferredDeeplink$2$1", f = "MetricaWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MetricaWrapper$requestDeferredDeeplink$2$1 extends SuspendLambda implements tls {
    final /* synthetic */ tls $success;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$requestDeferredDeeplink$2$1(tls tlsVar, Continuation continuation, q qVar) {
        super(1, continuation);
        this.$success = tlsVar;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$requestDeferredDeeplink$2$1(this.$success, continuation, this.this$0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MetricaWrapper$requestDeferredDeeplink$2$1 metricaWrapper$requestDeferredDeeplink$2$1 = (MetricaWrapper$requestDeferredDeeplink$2$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        metricaWrapper$requestDeferredDeeplink$2$1.invokeSuspend(zy11Var);
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
        AppMetrica.requestDeferredDeeplink(new lc20(this.$success, this.this$0));
        return zy11.a;
    }
}
