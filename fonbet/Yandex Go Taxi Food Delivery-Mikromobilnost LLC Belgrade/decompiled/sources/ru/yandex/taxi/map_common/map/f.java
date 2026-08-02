package ru.yandex.taxi.map_common.map;

import defpackage.gh00;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ gh00 b;

    public f(vpr vprVar, gh00 gh00Var) {
        this.a = vprVar;
        this.b = gh00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapControllerImpl$special$$inlined$map$1$2$1 mapControllerImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MapControllerImpl$special$$inlined$map$1$2$1) {
            mapControllerImpl$special$$inlined$map$1$2$1 = (MapControllerImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = mapControllerImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapControllerImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapControllerImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapControllerImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzs b = this.b.e.b();
                    mapControllerImpl$special$$inlined$map$1$2$1.L$0 = null;
                    mapControllerImpl$special$$inlined$map$1$2$1.L$1 = null;
                    mapControllerImpl$special$$inlined$map$1$2$1.L$2 = null;
                    mapControllerImpl$special$$inlined$map$1$2$1.L$3 = null;
                    mapControllerImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, mapControllerImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mapControllerImpl$special$$inlined$map$1$2$1 = new MapControllerImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mapControllerImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapControllerImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
