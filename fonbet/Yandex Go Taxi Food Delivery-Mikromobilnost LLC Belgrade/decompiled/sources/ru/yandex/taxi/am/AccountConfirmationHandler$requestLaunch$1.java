package ru.yandex.taxi.am;

import defpackage.mvg;
import defpackage.nk3;
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
@mvg(c = "ru.yandex.taxi.am.AccountConfirmationHandler$requestLaunch$1", f = "AccountConfirmationHandler.kt", l = {201}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AccountConfirmationHandler$requestLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $from;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountConfirmationHandler$requestLaunch$1(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$from = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountConfirmationHandler$requestLaunch$1(this.this$0, this.$from, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountConfirmationHandler$requestLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar = this.this$0;
                String str = this.$from;
                ru.yandex.taxi.startup.launch.c cVar = fVar.e;
                this.label = 1;
                obj = cVar.a(str, this, false);
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
        f fVar2 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            fVar2.c();
            nk3 nk3Var = fVar2.j;
            if (nk3Var != null) {
                nk3Var.onSuccess();
            }
            ru.yandex.taxi.zalogin.e eVar = fVar2.k;
            if (eVar != null) {
                eVar.run();
                fVar2.k = null;
            }
        }
        f fVar3 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            fVar3.c();
            fVar3.d(a);
        }
        return zy11.a;
    }
}
