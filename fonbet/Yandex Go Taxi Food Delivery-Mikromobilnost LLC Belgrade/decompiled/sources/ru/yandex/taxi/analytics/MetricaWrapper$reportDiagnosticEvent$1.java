package ru.yandex.taxi.analytics;

import android.content.Context;
import defpackage.g8e;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcj;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$reportDiagnosticEvent$1", f = "MetricaWrapper.kt", l = {255}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MetricaWrapper$reportDiagnosticEvent$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $eventName;
    final /* synthetic */ String $eventValue;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$reportDiagnosticEvent$1(String str, String str2, q qVar, Continuation continuation) {
        super(1, continuation);
        this.$eventName = str;
        this.$eventValue = str2;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$reportDiagnosticEvent$1(this.$eventName, this.$eventValue, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MetricaWrapper$reportDiagnosticEvent$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AppMetricaYandex.reportStatboxEvent(this.$eventName, this.$eventValue);
            Context context = rcj.a;
            rcj.b(this.$eventName, this.$eventValue);
            CrashlyticsInteractor crashlyticsInteractor = this.this$0.m;
            String str = this.$eventValue;
            String str2 = this.$eventName;
            if (str != null) {
                str2 = g8e.p(str2, "\n", str);
            }
            this.label = 1;
            if (crashlyticsInteractor.a(str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str3 = this.$eventValue;
        if (str3 != null) {
            if (str3.length() == 0) {
                jst.e.getClass();
            } else {
                jst.e.getClass();
            }
        }
        return zy11.a;
    }
}
