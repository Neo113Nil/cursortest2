package ru.yandex.taxi.layers.presentation;

import defpackage.a4e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.PolygonsOverlay$MvpImpl$hide$1", f = "PolygonsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PolygonsOverlay$MvpImpl$hide$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a4e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonsOverlay$MvpImpl$hide$1(a4e0 a4e0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = a4e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PolygonsOverlay$MvpImpl$hide$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PolygonsOverlay$MvpImpl$hide$1 polygonsOverlay$MvpImpl$hide$1 = (PolygonsOverlay$MvpImpl$hide$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        polygonsOverlay$MvpImpl$hide$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.x.m();
        this.this$0.y.m();
        return zy11.a;
    }
}
