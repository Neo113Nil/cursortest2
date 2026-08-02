package ru.yandex.taxi.jobs;

import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r041;
import defpackage.tse;
import defpackage.w4j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.jobs.JobSchedulerImpl$acquireJobWakeLock$1", f = "JobSchedulerImpl.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class JobSchedulerImpl$acquireJobWakeLock$1 extends SuspendLambda implements wls {
    final /* synthetic */ a $jobInfo;
    final /* synthetic */ w4j0 $request;
    final /* synthetic */ r041 $wakeLock;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSchedulerImpl$acquireJobWakeLock$1(a aVar, w4j0 w4j0Var, r041 r041Var, Continuation continuation) {
        super(2, continuation);
        this.$jobInfo = aVar;
        this.$request = w4j0Var;
        this.$wakeLock = r041Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JobSchedulerImpl$acquireJobWakeLock$1(this.$jobInfo, this.$request, this.$wakeLock, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSchedulerImpl$acquireJobWakeLock$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.$jobInfo;
            this.label = 1;
            a = aVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            hst hstVar = jst.e;
            String str = this.$request.a;
            hstVar.getClass();
        } else {
            jst.e.k(a2, "Failed to schedule job");
        }
        this.$wakeLock.close();
        return zy11.a;
    }
}
