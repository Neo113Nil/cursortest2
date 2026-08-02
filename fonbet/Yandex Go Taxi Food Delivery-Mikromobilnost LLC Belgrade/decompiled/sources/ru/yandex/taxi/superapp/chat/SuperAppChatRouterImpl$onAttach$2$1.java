package ru.yandex.taxi.superapp.chat;

import defpackage.h1p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.psv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.chat.SuperAppChatRouterImpl$onAttach$2$1", f = "SuperAppChatRouterImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppChatRouterImpl$onAttach$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ psv0 $payload;
    final /* synthetic */ a $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppChatRouterImpl$onAttach$2$1(a aVar, psv0 psv0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_run = aVar;
        this.$payload = psv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppChatRouterImpl$onAttach$2$1(this.$this_run, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppChatRouterImpl$onAttach$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.$this_run;
            psv0 psv0Var = this.$payload;
            h1p h1pVar = psv0Var.a;
            String str = psv0Var.b;
            this.label = 1;
            if (a.P(aVar, h1pVar, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
