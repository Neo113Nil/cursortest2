package ru.yandex.taxi.preorder.map.interactor;

import defpackage.dms;
import defpackage.fji;
import defpackage.fnx0;
import defpackage.lub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.vj11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lp0c0;", "style", "Lfnx0;", "tariffSelection", "Llub0;", "brandingOverride", "Lfji;", "deliveryPin", "Lvj11;", "<anonymous>", "(Lp0c0;Lfnx0;Llub0;Lfji;)Lvj11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.interactor.RouteOverlayAppearanceInteractor$sourceAppearanceFlow$1", f = "RouteOverlayApperanceInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteOverlayAppearanceInteractor$sourceAppearanceFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        RouteOverlayAppearanceInteractor$sourceAppearanceFlow$1 routeOverlayAppearanceInteractor$sourceAppearanceFlow$1 = new RouteOverlayAppearanceInteractor$sourceAppearanceFlow$1(5, (Continuation) obj5);
        routeOverlayAppearanceInteractor$sourceAppearanceFlow$1.L$0 = (p0c0) obj;
        routeOverlayAppearanceInteractor$sourceAppearanceFlow$1.L$1 = (fnx0) obj2;
        routeOverlayAppearanceInteractor$sourceAppearanceFlow$1.L$2 = (lub0) obj3;
        routeOverlayAppearanceInteractor$sourceAppearanceFlow$1.L$3 = (fji) obj4;
        return routeOverlayAppearanceInteractor$sourceAppearanceFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p0c0 p0c0Var = (p0c0) this.L$0;
        fnx0 fnx0Var = (fnx0) this.L$1;
        lub0 lub0Var = (lub0) this.L$2;
        fji fjiVar = (fji) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new vj11(p0c0Var, fnx0Var, lub0Var, fjiVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
