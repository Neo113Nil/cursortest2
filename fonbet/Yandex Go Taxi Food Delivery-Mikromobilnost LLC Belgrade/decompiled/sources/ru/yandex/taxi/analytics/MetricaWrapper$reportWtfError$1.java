package ru.yandex.taxi.analytics;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.RtmErrorEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$reportWtfError$1", f = "MetricaWrapper.kt", l = {284}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MetricaWrapper$reportWtfError$1 extends SuspendLambda implements tls {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ String $message;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$reportWtfError$1(String str, Throwable th, Continuation continuation, q qVar) {
        super(1, continuation);
        this.this$0 = qVar;
        this.$message = str;
        this.$error = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$reportWtfError$1(this.$message, this.$error, continuation, this.this$0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MetricaWrapper$reportWtfError$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.p) {
                AppMetricaYandex.reportRtmError(RtmErrorEvent.newBuilder(this.$message).build());
            }
            this.this$0.getClass();
            CrashlyticsInteractor crashlyticsInteractor = this.this$0.m;
            Exception exc = new Exception(this.$message, this.$error);
            this.label = 1;
            if (crashlyticsInteractor.b(exc, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
