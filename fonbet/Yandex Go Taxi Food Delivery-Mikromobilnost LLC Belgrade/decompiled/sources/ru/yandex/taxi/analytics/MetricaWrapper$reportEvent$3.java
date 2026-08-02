package ru.yandex.taxi.analytics;

import android.content.Context;
import defpackage.cm9;
import defpackage.jst;
import defpackage.mcw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcj;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetrica;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$reportEvent$3", f = "MetricaWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MetricaWrapper$reportEvent$3 extends SuspendLambda implements tls {
    final /* synthetic */ String $eventName;
    final /* synthetic */ String $json;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$reportEvent$3(String str, String str2, q qVar, Continuation continuation) {
        super(1, continuation);
        this.$eventName = str;
        this.$json = str2;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$reportEvent$3(this.$eventName, this.$json, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MetricaWrapper$reportEvent$3 metricaWrapper$reportEvent$3 = (MetricaWrapper$reportEvent$3) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        metricaWrapper$reportEvent$3.invokeSuspend(zy11Var);
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
        AppMetrica.reportEvent(this.$eventName, this.$json);
        Context context = rcj.a;
        rcj.b(this.$eventName, this.$json);
        CopyOnWriteArraySet copyOnWriteArraySet = this.this$0.o;
        String str = this.$eventName;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((cm9) it.next()).a(new mcw(2, str, null));
        }
        this.this$0.getClass();
        String str2 = this.$json;
        if (str2 == null || str2.length() == 0) {
            jst.e.getClass();
        } else {
            jst.e.getClass();
        }
        return zy11.a;
    }
}
