package ru.yandex.video.m3.player.bandwidth;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.bandwidth.IntervalTaskImpl$taskFlow$1$1", f = "IntervalTaskImpl.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class IntervalTaskImpl$taskFlow$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ IntervalTaskImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntervalTaskImpl$taskFlow$1$1(IntervalTaskImpl intervalTaskImpl, Continuation<? super IntervalTaskImpl$taskFlow$1$1> continuation) {
        super(2, continuation);
        this.this$0 = intervalTaskImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new IntervalTaskImpl$taskFlow$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((IntervalTaskImpl$taskFlow$1$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sls slsVar;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        while (a.p(get_context())) {
            slsVar = this.this$0.task;
            slsVar.invoke();
            j = this.this$0.intervalMs;
            this.label = 1;
            if (a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
