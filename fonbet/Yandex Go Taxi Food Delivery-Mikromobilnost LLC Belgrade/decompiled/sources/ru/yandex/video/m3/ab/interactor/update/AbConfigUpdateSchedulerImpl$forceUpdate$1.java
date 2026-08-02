package ru.yandex.video.m3.ab.interactor.update;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateSchedulerImpl$forceUpdate$1", f = "AbConfigUpdateSchedulerImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class AbConfigUpdateSchedulerImpl$forceUpdate$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ AbConfigUpdateSchedulerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbConfigUpdateSchedulerImpl$forceUpdate$1(AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl, Continuation<? super AbConfigUpdateSchedulerImpl$forceUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = abConfigUpdateSchedulerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new AbConfigUpdateSchedulerImpl$forceUpdate$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((AbConfigUpdateSchedulerImpl$forceUpdate$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l8x l8xVar;
        Object update;
        l8x initUpdatesWithState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            l8xVar = this.this$0.updateJob;
            if (!l8xVar.isActive()) {
                AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl = this.this$0;
                initUpdatesWithState = abConfigUpdateSchedulerImpl.initUpdatesWithState();
                abConfigUpdateSchedulerImpl.updateJob = initUpdatesWithState;
            }
            AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl2 = this.this$0;
            this.label = 1;
            update = abConfigUpdateSchedulerImpl2.update(this);
            if (update == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
