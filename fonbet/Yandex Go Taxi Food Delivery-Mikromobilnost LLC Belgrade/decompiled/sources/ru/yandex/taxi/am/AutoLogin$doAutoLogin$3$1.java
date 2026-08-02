package ru.yandex.taxi.am;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.api.exception.PassportAutoLoginRetryRequiredException;
import defpackage.a60;
import defpackage.cey;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w94;
import defpackage.wls;
import defpackage.z50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AutoLogin$doAutoLogin$3$1", f = "AutoLogin.kt", l = {173}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AutoLogin$doAutoLogin$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $error;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLogin$doAutoLogin$3$1(r rVar, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$error = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoLogin$doAutoLogin$3$1(this.this$0, this.$error, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoLogin$doAutoLogin$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r rVar = this.this$0;
        PassportAutoLoginRetryRequiredException passportAutoLoginRetryRequiredException = (PassportAutoLoginRetryRequiredException) this.$error;
        this.label = 1;
        q qVar = new q(kotlinx.coroutines.flow.e.T(rVar.c.a(120), 1), rVar);
        w94 w94Var = rVar.b;
        Intent intent = passportAutoLoginRetryRequiredException.getIntent();
        a60 a60Var = (a60) w94Var.a;
        a60Var.getClass();
        hst hstVar = jst.e;
        new Throwable();
        hstVar.getClass();
        cey.c(a60Var.a.getLifecycle(), Lifecycle.State.RESUMED, new z50(a60Var, intent, 120, 0));
        Object y = kotlinx.coroutines.flow.e.y(qVar, this);
        if (y != coroutineSingletons) {
            y = zy11Var;
        }
        return y == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
