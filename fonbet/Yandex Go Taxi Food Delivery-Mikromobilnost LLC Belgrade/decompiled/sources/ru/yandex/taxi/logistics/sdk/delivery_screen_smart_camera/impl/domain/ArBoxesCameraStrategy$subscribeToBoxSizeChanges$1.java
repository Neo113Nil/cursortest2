package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.hp7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o33;
import defpackage.sxs0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "boxSizeId", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1", f = "ArBoxesCameraStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1 extends SuspendLambda implements wls {
    final /* synthetic */ hp7 $config;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1(hp7 hp7Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$config = hp7Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1 arBoxesCameraStrategy$subscribeToBoxSizeChanges$1 = new ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1(this.$config, this.this$0, continuation);
        arBoxesCameraStrategy$subscribeToBoxSizeChanges$1.I$0 = ((Number) obj).intValue();
        return arBoxesCameraStrategy$subscribeToBoxSizeChanges$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1 arBoxesCameraStrategy$subscribeToBoxSizeChanges$1 = (ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        arBoxesCameraStrategy$subscribeToBoxSizeChanges$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o33 o33Var = (o33) kotlin.collections.a.S(i, this.$config.d);
        this.this$0.c(new sxs0(new o33(o33Var != null ? o33Var.a : 0, o33Var != null ? o33Var.b : 0, o33Var != null ? o33Var.c : 0)));
        return zy11.a;
    }
}
