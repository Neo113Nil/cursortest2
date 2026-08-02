package ru.yandex.taxi.am;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uw60;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AccountResetEventRepository$onAccountReset$1", f = "AccountResetEventRepository.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AccountResetEventRepository$onAccountReset$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountResetEventRepository$onAccountReset$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountResetEventRepository$onAccountReset$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountResetEventRepository$onAccountReset$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            it = ((Iterable) this.this$0.a.get()).iterator();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$1;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            uw60 uw60Var = (uw60) it.next();
            this.L$0 = null;
            this.L$1 = it;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            if (uw60Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
