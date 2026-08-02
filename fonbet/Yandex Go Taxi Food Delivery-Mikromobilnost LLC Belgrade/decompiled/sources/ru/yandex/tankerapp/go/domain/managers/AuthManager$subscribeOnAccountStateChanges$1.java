package ru.yandex.tankerapp.go.domain.managers;

import defpackage.esa0;
import defpackage.icx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yeo;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.tankerapp.go.sdk.auth.CartechAccount;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/tankerapp/go/sdk/auth/CartechAccount;", "account", "Lzy11;", "<anonymous>", "(Lru/yandex/tankerapp/go/sdk/auth/CartechAccount;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.AuthManager$subscribeOnAccountStateChanges$1", f = "AuthManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AuthManager$subscribeOnAccountStateChanges$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthManager$subscribeOnAccountStateChanges$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AuthManager$subscribeOnAccountStateChanges$1 authManager$subscribeOnAccountStateChanges$1 = new AuthManager$subscribeOnAccountStateChanges$1(this.this$0, continuation);
        authManager$subscribeOnAccountStateChanges$1.L$0 = obj;
        return authManager$subscribeOnAccountStateChanges$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AuthManager$subscribeOnAccountStateChanges$1 authManager$subscribeOnAccountStateChanges$1 = (AuthManager$subscribeOnAccountStateChanges$1) create((CartechAccount) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        authManager$subscribeOnAccountStateChanges$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map f;
        CartechAccount cartechAccount = (CartechAccount) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (cartechAccount != null) {
            this.this$0.getClass();
            f = (Map) icx.a().c(Map.class, icx.a().h(cartechAccount));
        } else {
            f = kotlin.collections.b.f();
        }
        esa0 esa0Var = this.this$0.x;
        if (esa0Var != null) {
            yeo yeoVar = esa0Var.b;
            if (yeoVar != null) {
                yeoVar.success(f);
            } else {
                esa0Var.a = f;
            }
        }
        return zy11.a;
    }
}
