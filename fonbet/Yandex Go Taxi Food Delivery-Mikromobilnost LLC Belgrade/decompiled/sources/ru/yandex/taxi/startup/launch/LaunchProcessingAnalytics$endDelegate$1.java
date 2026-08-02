package ru.yandex.taxi.startup.launch;

import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t61;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.LaunchProcessingAnalytics$endDelegate$1", f = "LaunchProcessingAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchProcessingAnalytics$endDelegate$1 extends SuspendLambda implements tls {
    final /* synthetic */ int $id;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchProcessingAnalytics$endDelegate$1(k kVar, int i, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = kVar;
        this.$id = i;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LaunchProcessingAnalytics$endDelegate$1(this.this$0, this.$id, this.$name, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        LaunchProcessingAnalytics$endDelegate$1 launchProcessingAnalytics$endDelegate$1 = (LaunchProcessingAnalytics$endDelegate$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        launchProcessingAnalytics$endDelegate$1.invokeSuspend(zy11Var);
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
        if (k.b(this.this$0, this.$id, "LaunchProcessing.Delegate.Complete")) {
            Long l = (Long) this.this$0.d.get(this.$name);
            k kVar = this.this$0;
            if (l == null) {
                kVar.a.b("LaunchProcessing.Delegate.Complete");
            } else {
                t61 t61Var = kVar.a;
                String str = this.$name;
                String a = k.a(kVar, l.longValue());
                t61Var.getClass();
                t61Var.a.a("LaunchProcessing.Delegate.Complete", g8e.u("name", str, "duration", a), 1, new HashMap());
            }
        }
        return zy11.a;
    }
}
