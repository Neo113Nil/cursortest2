package ru.yandex.taxi.sdc.route.presentation;

import defpackage.kmp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkmp0;", "it", "Lzy11;", "<anonymous>", "(Lkmp0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.sdc.route.presentation.SdcOrderRouteControllerImpl$setRawRoute$3", f = "SdcOrderRouteControllerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SdcOrderRouteControllerImpl$setRawRoute$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdcOrderRouteControllerImpl$setRawRoute$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SdcOrderRouteControllerImpl$setRawRoute$3 sdcOrderRouteControllerImpl$setRawRoute$3 = new SdcOrderRouteControllerImpl$setRawRoute$3(this.this$0, continuation);
        sdcOrderRouteControllerImpl$setRawRoute$3.L$0 = obj;
        return sdcOrderRouteControllerImpl$setRawRoute$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SdcOrderRouteControllerImpl$setRawRoute$3 sdcOrderRouteControllerImpl$setRawRoute$3 = (SdcOrderRouteControllerImpl$setRawRoute$3) create((kmp0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sdcOrderRouteControllerImpl$setRawRoute$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kmp0 kmp0Var = (kmp0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.b.b(kmp0Var.b, kmp0Var.a);
        return zy11.a;
    }
}
