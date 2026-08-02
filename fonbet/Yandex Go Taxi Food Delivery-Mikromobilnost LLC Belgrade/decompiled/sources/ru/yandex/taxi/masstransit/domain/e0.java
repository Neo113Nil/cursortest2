package ru.yandex.taxi.masstransit.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e0 implements tpr {
    public final /* synthetic */ ru.yandex.taxi.masstransit.experiment.c0 a;

    public e0(ru.yandex.taxi.masstransit.experiment.c0 c0Var) {
        this.a = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1 mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1) {
            mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1 = (MtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1) continuation;
            int i2 = mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0 d0Var = new d0(vprVar);
                    mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.L$0 = null;
                    mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.L$1 = null;
                    mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.L$2 = null;
                    mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(d0Var, mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1 = new MtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteInfoInteractor$logoIconTagFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
