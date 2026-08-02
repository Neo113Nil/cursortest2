package ru.yandex.taxi.layers.domain;

import defpackage.bms;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o35;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbzx;", "T", "Lvpr;", "", "<unused var>", "", "", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.BaseLayersInteractor$starter$2", f = "BaseLayersInteractor.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BaseLayersInteractor$starter$2 extends SuspendLambda implements bms {
    int label;
    final /* synthetic */ o35 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLayersInteractor$starter$2(o35 o35Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = o35Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        return new BaseLayersInteractor$starter$2(this.this$0, (Continuation) obj4).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(new ru.yandex.taxi.layers.source.requesttrigger.d(this.this$0.h.a.u(0L)), 4);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.y(mthVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Boolean.TRUE;
    }
}
