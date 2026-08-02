package ru.yandex.taxi.layers.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o35;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lbzx;", "T", "Lzy11;", "it", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.BaseLayersInteractor$starter$1", f = "BaseLayersInteractor.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BaseLayersInteractor$starter$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ o35 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLayersInteractor$starter$1(o35 o35Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o35Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseLayersInteractor$starter$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseLayersInteractor$starter$1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        o35 o35Var = this.this$0;
        kotlinx.coroutines.flow.l a = this.this$0.g.a(o35Var.a(o35Var.f.b.a()));
        this.L$0 = null;
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(a, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
