package ru.yandex.taxi.messenger.domain;

import defpackage.jm3;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.messenger.domain.WebMessengerAuthInteractorImpl$applyCurrentToken$2$1", f = "WebMessengerAuthInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WebMessengerAuthInteractorImpl$applyCurrentToken$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebMessengerAuthInteractorImpl$applyCurrentToken$2$1(String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$token = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebMessengerAuthInteractorImpl$applyCurrentToken$2$1(this.$token, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebMessengerAuthInteractorImpl$applyCurrentToken$2$1 webMessengerAuthInteractorImpl$applyCurrentToken$2$1 = (WebMessengerAuthInteractorImpl$applyCurrentToken$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webMessengerAuthInteractorImpl$applyCurrentToken$2$1.invokeSuspend(zy11Var);
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
        String str = this.$token;
        if (str == null || str.length() == 0) {
            ((jm3) this.this$0.a.a()).b();
        } else {
            ((jm3) this.this$0.a.a()).c(this.$token);
        }
        return zy11.a;
    }
}
