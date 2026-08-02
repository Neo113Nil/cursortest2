package ru.yandex.taxi.scooters.presentation.route;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pr40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpr40;", "segmentData", "", "sessionId", "", "canShowScooterRoute", "Lkotlin/Triple;", "<anonymous>", "(Lpr40;Ljava/lang/String;Z)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.route.ScootersMtRouteOverlayRouter$onLaunch$1", f = "ScootersMtRouteOverlayRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersMtRouteOverlayRouter$onLaunch$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ScootersMtRouteOverlayRouter$onLaunch$1 scootersMtRouteOverlayRouter$onLaunch$1 = new ScootersMtRouteOverlayRouter$onLaunch$1(4, (Continuation) obj4);
        scootersMtRouteOverlayRouter$onLaunch$1.L$0 = (pr40) obj;
        scootersMtRouteOverlayRouter$onLaunch$1.L$1 = (String) obj2;
        scootersMtRouteOverlayRouter$onLaunch$1.Z$0 = booleanValue;
        return scootersMtRouteOverlayRouter$onLaunch$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pr40 pr40Var = (pr40) this.L$0;
        String str = (String) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Triple(pr40Var, str, Boolean.valueOf(z));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
