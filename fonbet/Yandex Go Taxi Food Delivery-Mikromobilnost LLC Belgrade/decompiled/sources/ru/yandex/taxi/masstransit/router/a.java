package ru.yandex.taxi.masstransit.router;

import defpackage.b64;
import defpackage.c85;
import defpackage.cl7;
import defpackage.dp30;
import defpackage.dvw;
import defpackage.i140;
import defpackage.igu0;
import defpackage.ii30;
import defpackage.j18;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.vj;
import defpackage.wj;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.common_models.net.map_object.t;
import ru.yandex.taxi.masstransit.api.model.OpenReason;

/* loaded from: classes6.dex */
public final class a extends c85 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, ii30] */
    @Override // defpackage.c85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pm00 pm00Var, Continuation continuation) {
        MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1 mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1;
        int i;
        if (continuation instanceof MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1) {
            mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1 = (MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1) continuation;
            int i2 = mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.L$0 = pm00Var;
                    b bVar = this.a;
                    mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.L$1 = bVar;
                    mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    vj vjVar = new vj(20, y);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$$inlined$suspendCallbackApi$2 mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$$inlined$suspendCallbackApi$2 = new MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
                    String str = pm00Var.b;
                    zzs zzsVar = pm00Var.a;
                    bVar.P(new dp30(zzsVar, new i140(new igu0(str, zzsVar, ((t) pm00Var.d).a, OpenReason.REASON_SUPER_APP_DISCOVERY_MAP))));
                    y.element = new ii30(0, mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$$inlined$suspendCallbackApi$2);
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 20));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1 = new MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1(this, (ContinuationImpl) continuation);
        Object obj2 = mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
