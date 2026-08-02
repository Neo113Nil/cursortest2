package ru.yandex.taxi.map_common.map;

import defpackage.eci0;
import defpackage.gh00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ gh00 b;

    public g(eci0 eci0Var, gh00 gh00Var) {
        this.a = eci0Var;
        this.b = gh00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MapControllerImpl$special$$inlined$map$1$1 mapControllerImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof MapControllerImpl$special$$inlined$map$1$1) {
            mapControllerImpl$special$$inlined$map$1$1 = (MapControllerImpl$special$$inlined$map$1$1) continuation;
            int i2 = mapControllerImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapControllerImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapControllerImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapControllerImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    mapControllerImpl$special$$inlined$map$1$1.L$0 = null;
                    mapControllerImpl$special$$inlined$map$1$1.L$1 = null;
                    mapControllerImpl$special$$inlined$map$1$1.L$2 = null;
                    mapControllerImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, mapControllerImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        mapControllerImpl$special$$inlined$map$1$1 = new MapControllerImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = mapControllerImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapControllerImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
