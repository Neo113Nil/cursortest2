package ru.yandex.taxi.am;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rr3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.AutoLoginState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AutoLogin$notifySuccessAsync$2", f = "AutoLogin.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AutoLogin$notifySuccessAsync$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLogin$notifySuccessAsync$2(r rVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoLogin$notifySuccessAsync$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AutoLogin$notifySuccessAsync$2 autoLogin$notifySuccessAsync$2 = (AutoLogin$notifySuccessAsync$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        autoLogin$notifySuccessAsync$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r rVar = this.this$0;
        rVar.s = false;
        rr3 rr3Var = rVar.r;
        if (rr3Var != null) {
            rr3Var.r();
        }
        rVar.r = null;
        rVar.t.l(AutoLoginState.COMPLETED);
        return zy11.a;
    }
}
