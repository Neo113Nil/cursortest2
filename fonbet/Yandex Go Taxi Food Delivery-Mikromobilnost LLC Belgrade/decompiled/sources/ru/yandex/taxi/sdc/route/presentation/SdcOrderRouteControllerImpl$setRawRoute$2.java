package ru.yandex.taxi.sdc.route.presentation;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkmp0;", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.sdc.route.presentation.SdcOrderRouteControllerImpl$setRawRoute$2", f = "SdcOrderRouteControllerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SdcOrderRouteControllerImpl$setRawRoute$2 extends SuspendLambda implements zls {
    final /* synthetic */ List<zzs> $rawRoute;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdcOrderRouteControllerImpl$setRawRoute$2(a aVar, List list, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$rawRoute = list;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SdcOrderRouteControllerImpl$setRawRoute$2 sdcOrderRouteControllerImpl$setRawRoute$2 = new SdcOrderRouteControllerImpl$setRawRoute$2(this.this$0, this.$rawRoute, (Continuation) obj3);
        sdcOrderRouteControllerImpl$setRawRoute$2.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        sdcOrderRouteControllerImpl$setRawRoute$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jst.e.s(th);
        this.this$0.b.c(this.$rawRoute);
        return zy11.a;
    }
}
