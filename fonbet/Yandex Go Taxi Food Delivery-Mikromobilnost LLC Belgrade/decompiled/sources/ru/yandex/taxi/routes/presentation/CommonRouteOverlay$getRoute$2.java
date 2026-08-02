package ru.yandex.taxi.routes.presentation;

import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0005\u001a\u0012\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld0l0;", "route", "Ljava/util/Optional;", "Lq6l0;", "Lkotlin/jvm/internal/EnhancedNullability;", "routeOverride", "Llgl0;", "<anonymous>", "(Ld0l0;Ljava/util/Optional;)Llgl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routes.presentation.CommonRouteOverlay$getRoute$2", f = "CommonRouteOverlay.kt", l = {385}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CommonRouteOverlay$getRoute$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRouteOverlay$getRoute$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CommonRouteOverlay$getRoute$2 commonRouteOverlay$getRoute$2 = new CommonRouteOverlay$getRoute$2(this.this$0, (Continuation) obj3);
        commonRouteOverlay$getRoute$2.L$0 = (d0l0) obj;
        commonRouteOverlay$getRoute$2.L$1 = (Optional) obj2;
        return commonRouteOverlay$getRoute$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        Optional optional = (Optional) this.L$1;
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
        c cVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object Hg = c.Hg(cVar, d0l0Var, optional, this);
        return Hg == coroutineSingletons ? coroutineSingletons : Hg;
    }
}
