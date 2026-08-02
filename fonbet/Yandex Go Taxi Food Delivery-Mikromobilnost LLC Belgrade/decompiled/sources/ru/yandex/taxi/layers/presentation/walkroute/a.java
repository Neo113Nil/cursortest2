package ru.yandex.taxi.layers.presentation.walkroute;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.o641;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1 baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BaseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1) {
            baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1 = (BaseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1) continuation;
            int i2 = baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzs zzsVar = (zzs) obj;
                    o641 o641Var = new o641(Collections.singletonList(new Point(zzsVar.a, zzsVar.b)));
                    baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.L$0 = null;
                    baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.L$1 = null;
                    baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.L$2 = null;
                    baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.L$3 = null;
                    baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(o641Var, baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1 = new BaseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1(this, continuation);
        Object obj22 = baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseWalkRouteInteractor$onlyObjectTracking$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
