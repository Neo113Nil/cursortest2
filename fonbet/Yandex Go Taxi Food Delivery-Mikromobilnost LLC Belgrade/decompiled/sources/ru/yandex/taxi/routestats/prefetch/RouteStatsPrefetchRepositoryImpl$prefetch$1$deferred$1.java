package ru.yandex.taxi.routestats.prefetch;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.lbl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yal0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.routestats.api.RouteStatsApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyal0;", "<anonymous>", "(Ltse;)Lyal0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchRepositoryImpl$prefetch$1$deferred$1", f = "RouteStatsPrefetchRepositoryImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteStatsPrefetchRepositoryImpl$prefetch$1$deferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ lbl0 $param;
    Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStatsPrefetchRepositoryImpl$prefetch$1$deferred$1(lbl0 lbl0Var, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$param = lbl0Var;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteStatsPrefetchRepositoryImpl$prefetch$1$deferred$1(this.$param, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStatsPrefetchRepositoryImpl$prefetch$1$deferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<yal0> a = ((RouteStatsApi) this.this$0.e.getValue()).a(this.$param, this.$param.r ? m.j : m.i);
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.b(a, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        fmt fmtVar = (fmt) obj;
        Object obj2 = fmtVar.a;
        lbl0 lbl0Var = this.$param;
        yal0 yal0Var = (yal0) obj2;
        yal0Var.s = fmtVar.e.a("X-YaTraceId");
        yal0Var.t = lbl0Var.r;
        return obj2;
    }
}
