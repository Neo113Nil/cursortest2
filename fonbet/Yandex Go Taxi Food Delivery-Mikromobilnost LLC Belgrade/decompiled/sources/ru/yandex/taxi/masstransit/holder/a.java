package ru.yandex.taxi.masstransit.holder;

import defpackage.ny61;
import defpackage.py30;
import defpackage.su30;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
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
        MtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1 mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1) {
            mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1 = (MtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    su30 su30Var = ((py30) obj).b;
                    mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.L$0 = null;
                    mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.L$1 = null;
                    mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.L$2 = null;
                    mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.L$3 = null;
                    mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(su30Var, mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1 = new MtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtSimpleRoutesHolder$selectedRouteFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
