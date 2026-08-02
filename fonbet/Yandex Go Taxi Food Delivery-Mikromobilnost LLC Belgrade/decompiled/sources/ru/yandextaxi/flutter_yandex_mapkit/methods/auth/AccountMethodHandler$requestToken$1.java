package ru.yandextaxi.flutter_yandex_mapkit.methods.auth;

import com.yandex.runtime.auth.TokenListener;
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
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandextaxi.flutter_yandex_mapkit.methods.auth.AccountMethodHandler$requestToken$1", f = "AccountMethodHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AccountMethodHandler$requestToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ TokenListener $tokenListener;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountMethodHandler$requestToken$1(a aVar, TokenListener tokenListener, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tokenListener = tokenListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountMethodHandler$requestToken$1(this.this$0, this.$tokenListener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AccountMethodHandler$requestToken$1 accountMethodHandler$requestToken$1 = (AccountMethodHandler$requestToken$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        accountMethodHandler$requestToken$1.invokeSuspend(zy11Var);
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
        String a = this.this$0.b.a(ReferenceType.TOKEN_LISTENER, this.$tokenListener);
        ea20 ea20Var = this.this$0.a;
        if (ea20Var != null) {
            ea20Var.a("requestToken", a, null);
        }
        return zy11.a;
    }
}
