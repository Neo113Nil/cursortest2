package ru.yandex.taxi.analytics;

import android.content.Context;
import defpackage.cm9;
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
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$reportEvent$2", f = "MetricaWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MetricaWrapper$reportEvent$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $eventName;
    final /* synthetic */ kotlinx.serialization.json.c $jsonObject;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$reportEvent$2(kotlinx.serialization.json.c cVar, String str, q qVar, Continuation continuation) {
        super(1, continuation);
        this.$jsonObject = cVar;
        this.$eventName = str;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MetricaWrapper$reportEvent$2(this.$jsonObject, this.$eventName, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MetricaWrapper$reportEvent$2 metricaWrapper$reportEvent$2 = (MetricaWrapper$reportEvent$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        metricaWrapper$reportEvent$2.invokeSuspend(zy11Var);
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
        String cVar = this.$jsonObject.toString();
        AppMetrica.reportEvent(this.$eventName, cVar);
        Context context = rcj.a;
        rcj.b(this.$eventName, cVar);
        CopyOnWriteArraySet copyOnWriteArraySet = this.this$0.o;
        String str = this.$eventName;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((cm9) it.next()).a(new mcw(2, str, null));
        }
        this.this$0.getClass();
        return zy11.a;
    }
}
