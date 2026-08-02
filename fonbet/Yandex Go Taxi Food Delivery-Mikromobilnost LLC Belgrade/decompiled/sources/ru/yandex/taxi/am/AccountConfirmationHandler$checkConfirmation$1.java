package ru.yandex.taxi.am;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AccountConfirmationHandler$checkConfirmation$1", f = "AccountConfirmationHandler.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AccountConfirmationHandler$checkConfirmation$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $onError;
    final /* synthetic */ Runnable $request;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountConfirmationHandler$checkConfirmation$1(f fVar, Runnable runnable, Runnable runnable2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$request = runnable;
        this.$onError = runnable2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountConfirmationHandler$checkConfirmation$1(this.this$0, this.$request, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountConfirmationHandler$checkConfirmation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.startup.launch.c cVar = this.this$0.e;
                this.label = 1;
                obj = cVar.a("AccountConfirmationHandler", this, false);
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
            failure = (owx) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        Runnable runnable = this.$request;
        f fVar = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            owx owxVar = (owx) failure;
            if (owxVar.a && owxVar.o) {
                runnable.run();
                fVar.k = null;
            }
        }
        Runnable runnable2 = this.$onError;
        Throwable a = Result.a(failure);
        if (a != null) {
            runnable2.run();
            jst.e.k(a, "error while check account server confirmation");
        }
        return zy11.a;
    }
}
