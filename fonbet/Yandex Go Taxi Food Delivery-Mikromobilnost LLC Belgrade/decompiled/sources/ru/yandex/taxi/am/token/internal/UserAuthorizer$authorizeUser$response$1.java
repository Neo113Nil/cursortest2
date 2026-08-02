package ru.yandex.taxi.am.token.internal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.startup.launch.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lowx;", "<anonymous>", "(Ltse;)Lowx;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.token.internal.UserAuthorizer$authorizeUser$response$1", f = "UserAuthorizer.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UserAuthorizer$authorizeUser$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAuthorizer$authorizeUser$response$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserAuthorizer$authorizeUser$response$1(this.this$0, this.$token, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserAuthorizer$authorizeUser$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0.b;
            String str = this.$token;
            this.label = 1;
            b = i.b(iVar, "AuthHelper", str, true, this, 2);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        kotlin.b.b(b);
        return b;
    }
}
