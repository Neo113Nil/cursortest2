package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/directions/driving/DrivingRoute;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOverlayStateInteractor$drivingRoute$1$drivingRoute$1", f = "MtOverlayStateInteractor.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtOverlayStateInteractor$drivingRoute$1$drivingRoute$1 extends SuspendLambda implements wls {
    final /* synthetic */ uu30 $route;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOverlayStateInteractor$drivingRoute$1$drivingRoute$1(v vVar, uu30 uu30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$route = uu30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtOverlayStateInteractor$drivingRoute$1$drivingRoute$1(this.this$0, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtOverlayStateInteractor$drivingRoute$1$drivingRoute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        v vVar = this.this$0;
        ArrayList b = this.$route.b();
        this.label = 1;
        Object a = v.a(vVar, b, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
