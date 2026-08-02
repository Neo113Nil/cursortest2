package flex.utils.kotlin;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.utils.kotlin.RepeatableTask$start$5", f = "RepeatableTask.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class RepeatableTask$start$5 extends SuspendLambda implements wls {
    final /* synthetic */ tls $isSuccessful;
    final /* synthetic */ wls $onAllRepeatsFailed;
    final /* synthetic */ wls $onFailedTaskExecution;
    final /* synthetic */ wls $onSuccessfulTaskExecution;
    final /* synthetic */ tls $repeatableTask;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatableTask$start$5(a aVar, tls tlsVar, tls tlsVar2, wls wlsVar, wls wlsVar2, wls wlsVar3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$repeatableTask = tlsVar;
        this.$isSuccessful = tlsVar2;
        this.$onSuccessfulTaskExecution = wlsVar;
        this.$onFailedTaskExecution = wlsVar2;
        this.$onAllRepeatsFailed = wlsVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepeatableTask$start$5(this.this$0, this.$repeatableTask, this.$isSuccessful, this.$onSuccessfulTaskExecution, this.$onFailedTaskExecution, this.$onAllRepeatsFailed, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatableTask$start$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            tls tlsVar = this.$repeatableTask;
            tls tlsVar2 = this.$isSuccessful;
            wls wlsVar = this.$onSuccessfulTaskExecution;
            wls wlsVar2 = this.$onFailedTaskExecution;
            wls wlsVar3 = this.$onAllRepeatsFailed;
            this.label = 1;
            if (a.a(aVar, tlsVar, tlsVar2, wlsVar, wlsVar2, wlsVar3, this) == coroutineSingletons) {
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
