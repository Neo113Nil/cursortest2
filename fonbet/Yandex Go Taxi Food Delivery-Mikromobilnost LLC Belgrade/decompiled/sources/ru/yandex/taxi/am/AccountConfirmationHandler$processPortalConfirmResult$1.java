package ru.yandex.taxi.am;

import defpackage.cmt;
import defpackage.fmt;
import defpackage.jst;
import defpackage.lk3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tj3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.net.taxi.AuthApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AccountConfirmationHandler$processPortalConfirmResult$1", f = "AccountConfirmationHandler.kt", l = {177}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AccountConfirmationHandler$processPortalConfirmResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $clearedBindPhone;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountConfirmationHandler$processPortalConfirmResult$1(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$clearedBindPhone = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountConfirmationHandler$processPortalConfirmResult$1(this.this$0, this.$clearedBindPhone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountConfirmationHandler$processPortalConfirmResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
                cmt<lk3> a = ((AuthApi) fVar.n.getValue()).a(new tj3(fVar.d.Hg(), this.$clearedBindPhone));
                this.label = 1;
                obj = a.a(this);
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
            failure = (lk3) ((fmt) obj).a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        f fVar2 = this.this$0;
        if (!(failure instanceof Result.Failure) && ((lk3) failure).a) {
            fVar2.e();
        }
        f fVar3 = this.this$0;
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            fVar3.c();
            fVar3.d(a2);
            jst.e.k(a2, "Error while trying to auth new phone for portal account");
            fVar3.g.d(a2.getMessage());
        }
        return zy11.a;
    }
}
