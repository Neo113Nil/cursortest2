package ru.yandex.taxi.am;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2", f = "MainUiAutoLoginDelayCondition.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2(e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainUiAutoLoginDelayCondition$waitUiReadyWithTimeout$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d0 d0Var = new d0(this.this$0.a.e);
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(d0Var, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
