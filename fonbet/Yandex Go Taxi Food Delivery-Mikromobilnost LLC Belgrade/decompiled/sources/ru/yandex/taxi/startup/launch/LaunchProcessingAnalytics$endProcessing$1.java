package ru.yandex.taxi.startup.launch;

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
@mvg(c = "ru.yandex.taxi.startup.launch.LaunchProcessingAnalytics$endProcessing$1", f = "LaunchProcessingAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchProcessingAnalytics$endProcessing$1 extends SuspendLambda implements tls {
    final /* synthetic */ int $id;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchProcessingAnalytics$endProcessing$1(k kVar, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = kVar;
        this.$id = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LaunchProcessingAnalytics$endProcessing$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        LaunchProcessingAnalytics$endProcessing$1 launchProcessingAnalytics$endProcessing$1 = (LaunchProcessingAnalytics$endProcessing$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        launchProcessingAnalytics$endProcessing$1.invokeSuspend(zy11Var);
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
        if (k.b(this.this$0, this.$id, "LaunchProcessing.Processor.Complete")) {
            k kVar = this.this$0;
            t61 t61Var = kVar.a;
            String a = k.a(kVar, kVar.e);
            t61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("duration", a);
            t61Var.a.a("LaunchProcessing.Processor.Complete", hashMap, 1, new HashMap());
            k kVar2 = this.this$0;
            kVar2.c = null;
            kVar2.e = 0L;
        }
        return zy11.a;
    }
}
