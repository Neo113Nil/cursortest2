package ru.yandex.taxi.router;

import defpackage.bvv;
import defpackage.hxx;
import defpackage.ke0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uw4;
import defpackage.wls;
import defpackage.ze0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.router.AddFavoritesRootRouterImpl$show$1$1", f = "AddFavoritesRootRouterImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddFavoritesRootRouterImpl$show$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ke0 $this_with;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesRootRouterImpl$show$1$1(ke0 ke0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$this_with = ke0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesRootRouterImpl$show$1$1(this.$this_with, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFavoritesRootRouterImpl$show$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ze0 a = this.$this_with.a();
            this.label = 1;
            if (kotlinx.coroutines.flow.e.y(((uw4) a).a.b.a(), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        c cVar = this.this$0;
        bvv b = this.$this_with.b();
        cVar.E((m950) cVar.J.get(), b, new b(cVar, b, cVar.F.d()), hxx.a);
        return zy11.a;
    }
}
