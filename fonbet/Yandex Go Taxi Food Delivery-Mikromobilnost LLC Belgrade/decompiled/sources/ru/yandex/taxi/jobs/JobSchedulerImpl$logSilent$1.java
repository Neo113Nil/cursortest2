package ru.yandex.taxi.jobs;

import defpackage.ec70;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.jobs.JobSchedulerImpl$logSilent$1", f = "JobSchedulerImpl.kt", l = {112}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class JobSchedulerImpl$logSilent$1 extends SuspendLambda implements wls {
    final /* synthetic */ ec70 $cancelOperation;
    final /* synthetic */ String $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSchedulerImpl$logSilent$1(ec70 ec70Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$cancelOperation = ec70Var;
        this.$tag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JobSchedulerImpl$logSilent$1(this.$cancelOperation, this.$tag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSchedulerImpl$logSilent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ec70 ec70Var = this.$cancelOperation;
            this.label = 1;
            a = c.a(ec70Var, this);
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
        if (Result.a(a) != null) {
            jst.e.n(this.$tag + ", job cancellation failed");
        }
        return zy11.a;
    }
}
