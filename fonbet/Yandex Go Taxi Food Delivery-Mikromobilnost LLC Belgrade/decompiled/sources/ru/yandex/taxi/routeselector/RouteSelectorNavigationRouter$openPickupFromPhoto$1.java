package ru.yandex.taxi.routeselector;

import defpackage.inb0;
import defpackage.jl40;
import defpackage.jnb0;
import defpackage.knb0;
import defpackage.lnb0;
import defpackage.mnb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.z0l0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmnb0;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lmnb0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.RouteSelectorNavigationRouter$openPickupFromPhoto$1", f = "RouteSelectorNavigationRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorNavigationRouter$openPickupFromPhoto$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorNavigationRouter$openPickupFromPhoto$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteSelectorNavigationRouter$openPickupFromPhoto$1 routeSelectorNavigationRouter$openPickupFromPhoto$1 = new RouteSelectorNavigationRouter$openPickupFromPhoto$1(this.this$0, continuation);
        routeSelectorNavigationRouter$openPickupFromPhoto$1.L$0 = obj;
        return routeSelectorNavigationRouter$openPickupFromPhoto$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RouteSelectorNavigationRouter$openPickupFromPhoto$1 routeSelectorNavigationRouter$openPickupFromPhoto$1 = (RouteSelectorNavigationRouter$openPickupFromPhoto$1) create((mnb0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routeSelectorNavigationRouter$openPickupFromPhoto$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mnb0 mnb0Var = (mnb0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (jl40.l(mnb0Var, lnb0.a)) {
            this.this$0.r(new z0l0(12));
        } else if (!(mnb0Var instanceof inb0) && !jl40.l(mnb0Var, knb0.a) && !jl40.l(mnb0Var, jnb0.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
