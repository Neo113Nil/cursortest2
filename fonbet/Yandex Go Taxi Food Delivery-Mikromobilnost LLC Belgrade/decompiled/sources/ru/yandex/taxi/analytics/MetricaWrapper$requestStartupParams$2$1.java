package ru.yandex.taxi.analytics;

import android.content.Context;
import defpackage.fc20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yb20;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$requestStartupParams$2$1", f = "MetricaWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MetricaWrapper$requestStartupParams$2$1 extends SuspendLambda implements tls {
    final /* synthetic */ Context $context;
    final /* synthetic */ tls $error;
    final /* synthetic */ tls $success;
    int label;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.analytics.MetricaWrapper$requestStartupParams$2$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((tls) this.receiver).invoke((yb20) obj);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.analytics.MetricaWrapper$requestStartupParams$2$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((tls) this.receiver).invoke((Throwable) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$requestStartupParams$2$1(Context context, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(1, continuation);
        this.$context = context;
        this.$success = tlsVar;
        this.$error = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$requestStartupParams$2$1(this.$context, this.$success, this.$error, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MetricaWrapper$requestStartupParams$2$1 metricaWrapper$requestStartupParams$2$1 = (MetricaWrapper$requestStartupParams$2$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        metricaWrapper$requestStartupParams$2$1.invokeSuspend(zy11Var);
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
        AppMetricaYandex.requestStartupParams(this.$context, new fc20(new AnonymousClass1(1, this.$success, tls.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), new AnonymousClass2(1, this.$error, tls.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0)), "appmetrica_uuid", "appmetrica_device_id");
        return zy11.a;
    }
}
