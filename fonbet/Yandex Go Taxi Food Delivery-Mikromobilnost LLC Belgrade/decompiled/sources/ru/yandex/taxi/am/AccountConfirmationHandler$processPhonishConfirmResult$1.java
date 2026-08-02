package ru.yandex.taxi.am;

import defpackage.fhz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rx2;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AccountConfirmationHandler$processPhonishConfirmResult$1", f = "AccountConfirmationHandler.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AccountConfirmationHandler$processPhonishConfirmResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.api.u $data;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountConfirmationHandler$processPhonishConfirmResult$1(f fVar, com.yandex.passport.api.u uVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$data = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountConfirmationHandler$processPhonishConfirmResult$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountConfirmationHandler$processPhonishConfirmResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.b;
            long value = this.$data.a.getValue();
            this.label = 1;
            e = gVar.e(value, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        f fVar = this.this$0;
        if (!(e instanceof Result.Failure)) {
            fhz fhzVar = fVar.g;
            rx2 rx2Var = fhzVar.e;
            Long valueOf = Long.valueOf(fhzVar.b.x.a().a);
            rx2Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("phone_uid", valueOf);
            rx2Var.a.a("Zalogin.ConfirmPhonishSuccess", hashMap, 1, new HashMap());
            tje.N(fVar.h, null, null, new AccountConfirmationHandler$requestLaunch$1(fVar, "processPhonishConfirmResult", null), 3);
        }
        f fVar2 = this.this$0;
        Throwable a = Result.a(e);
        if (a != null) {
            fVar2.c();
            fVar2.g.c(a.getMessage());
            fVar2.d(a);
        }
        return zy11.a;
    }
}
