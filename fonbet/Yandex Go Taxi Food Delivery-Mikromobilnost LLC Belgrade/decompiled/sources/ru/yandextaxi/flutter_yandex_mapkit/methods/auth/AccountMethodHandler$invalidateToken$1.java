package ru.yandextaxi.flutter_yandex_mapkit.methods.auth;

import defpackage.ea20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandextaxi.flutter_yandex_mapkit.methods.auth.AccountMethodHandler$invalidateToken$1", f = "AccountMethodHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AccountMethodHandler$invalidateToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountMethodHandler$invalidateToken$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountMethodHandler$invalidateToken$1(this.this$0, this.$token, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AccountMethodHandler$invalidateToken$1 accountMethodHandler$invalidateToken$1 = (AccountMethodHandler$invalidateToken$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        accountMethodHandler$invalidateToken$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        String str = this.$token;
        ea20 ea20Var = aVar.a;
        if (ea20Var != null) {
            ea20Var.a("invalidateToken", str, null);
        }
        return zy11.a;
    }
}
