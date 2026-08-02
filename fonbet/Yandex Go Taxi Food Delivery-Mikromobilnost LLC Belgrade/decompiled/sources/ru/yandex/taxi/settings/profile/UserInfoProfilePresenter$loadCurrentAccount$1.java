package ru.yandex.taxi.settings.profile;

import defpackage.jst;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pn21;
import defpackage.qn21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.f0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.profile.UserInfoProfilePresenter$loadCurrentAccount$1", f = "UserInfoProfilePresenter.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class UserInfoProfilePresenter$loadCurrentAccount$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ qn21 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoProfilePresenter$loadCurrentAccount$1(qn21 qn21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qn21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserInfoProfilePresenter$loadCurrentAccount$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserInfoProfilePresenter$loadCurrentAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        kj kjVar = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                f0 f0Var = this.this$0.A;
                this.label = 1;
                f0Var.getClass();
                obj = f0.a(f0Var, this);
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
            kjVar = (kj) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to load current account to show user info");
        }
        qn21 qn21Var = this.this$0;
        ((pn21) qn21Var.Dg()).setAccount(kjVar, qn21Var.z.a(kjVar));
        return zy11.a;
    }
}
