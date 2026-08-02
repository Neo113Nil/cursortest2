package ru.yandex.taxi.analytics;

import android.content.Context;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcj;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$reportDiagnosticEvent$2", f = "MetricaWrapper.kt", l = {262}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MetricaWrapper$reportDiagnosticEvent$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $eventName;
    final /* synthetic */ Map<String, Object> $eventValue;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$reportDiagnosticEvent$2(String str, Map map, q qVar, Continuation continuation) {
        super(1, continuation);
        this.$eventName = str;
        this.$eventValue = map;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$reportDiagnosticEvent$2(this.$eventName, this.$eventValue, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MetricaWrapper$reportDiagnosticEvent$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AppMetricaYandex.reportStatboxEvent(this.$eventName, this.$eventValue);
            Context context = rcj.a;
            rcj.c(this.$eventName, this.$eventValue);
            CrashlyticsInteractor crashlyticsInteractor = this.this$0.m;
            Map<String, Object> map = this.$eventValue;
            String str = this.$eventName;
            if (map != null) {
                str = str + "\n" + map;
            }
            this.label = 1;
            if (crashlyticsInteractor.a(str, this) == coroutineSingletons) {
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
