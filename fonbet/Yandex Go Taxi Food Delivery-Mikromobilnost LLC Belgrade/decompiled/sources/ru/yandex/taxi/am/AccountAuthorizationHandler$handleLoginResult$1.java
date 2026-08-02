package ru.yandex.taxi.am;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import defpackage.a60;
import defpackage.cey;
import defpackage.ckf0;
import defpackage.cug;
import defpackage.fhz;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.nk3;
import defpackage.ny61;
import defpackage.tse;
import defpackage.um3;
import defpackage.wls;
import defpackage.y50;
import defpackage.z50;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AccountAuthorizationHandler$handleLoginResult$1", f = "AccountAuthorizationHandler.kt", l = {165}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AccountAuthorizationHandler$handleLoginResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.api.w $result;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountAuthorizationHandler$handleLoginResult$1(e eVar, com.yandex.passport.api.w wVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$result = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountAuthorizationHandler$handleLoginResult$1(this.this$0, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountAuthorizationHandler$handleLoginResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        nk3 nk3Var;
        nk3 nk3Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.am.internal.b bVar = this.this$0.d;
            com.yandex.passport.api.u uVar = (com.yandex.passport.api.u) this.$result;
            this.label = 1;
            a = bVar.a(uVar, this);
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
        e eVar = this.this$0;
        com.yandex.passport.api.w wVar = this.$result;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            ckf0 ckf0Var = eVar.a;
            SimpleSpinnerModalView simpleSpinnerModalView = ckf0Var.b;
            if (simpleSpinnerModalView != null) {
                simpleSpinnerModalView.dismiss();
                ckf0Var.b = null;
            }
            if (a2 instanceof PassportAccountNotAuthorizedException) {
                y50 y50Var = eVar.b;
                Intent a3 = eVar.e.a(((com.yandex.passport.api.u) wVar).a.getValue(), true, true, null);
                a60 a60Var = (a60) y50Var;
                a60Var.getClass();
                hst hstVar = jst.e;
                new Throwable();
                hstVar.getClass();
                cey.c(a60Var.a.getLifecycle(), Lifecycle.State.RESUMED, new z50(a60Var, a3, HProv.PP_INFO, 0));
            } else {
                jst.e.k(a2, "Error while handle login intent");
                fhz fhzVar = eVar.g;
                um3 um3Var = eVar.l;
                fhzVar.i(um3Var != null ? um3Var.a : null, a2.getMessage());
                um3 um3Var2 = eVar.l;
                if (um3Var2 != null && (nk3Var2 = um3Var2.b) != null) {
                    nk3Var2.b(a2);
                }
            }
        }
        e eVar2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            fhz fhzVar2 = eVar2.g;
            um3 um3Var3 = eVar2.l;
            Events$Zalogin$LoginContext events$Zalogin$LoginContext = um3Var3 != null ? um3Var3.a : null;
            ((ru.yandex.taxi.analytics.j) fhzVar2.a).s("Login.Success");
            cug cugVar = fhzVar2.d;
            Long f = fhzVar2.f();
            String name = events$Zalogin$LoginContext != null ? events$Zalogin$LoginContext.name() : null;
            cugVar.getClass();
            HashMap hashMap = new HashMap();
            if (name != null) {
                hashMap.put("context", name);
            }
            if (f != null) {
                hashMap.put("uid", f);
            }
            cugVar.a.a("Login.Success", hashMap, 1, new HashMap());
            ckf0 ckf0Var2 = eVar2.a;
            SimpleSpinnerModalView simpleSpinnerModalView2 = ckf0Var2.b;
            if (simpleSpinnerModalView2 != null) {
                simpleSpinnerModalView2.dismiss();
                ckf0Var2.b = null;
            }
            um3 um3Var4 = eVar2.l;
            if (um3Var4 != null && (nk3Var = um3Var4.b) != null) {
                nk3Var.onSuccess();
            }
        }
        return zy11.a;
    }
}
