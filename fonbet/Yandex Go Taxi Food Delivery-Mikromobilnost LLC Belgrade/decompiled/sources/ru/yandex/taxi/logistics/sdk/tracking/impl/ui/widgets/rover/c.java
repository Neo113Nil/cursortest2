package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover;

import defpackage.ao;
import defpackage.j00;
import defpackage.ny61;
import defpackage.t701;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public c(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RoverStateHolder$special$$inlined$map$1$2$1 roverStateHolder$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RoverStateHolder$special$$inlined$map$1$2$1) {
            roverStateHolder$special$$inlined$map$1$2$1 = (RoverStateHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = roverStateHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roverStateHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = roverStateHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roverStateHolder$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.f.getClass();
                    List c = j00.c((t701) obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : c) {
                        if (obj3 instanceof ao) {
                            arrayList.add(obj3);
                        }
                    }
                    Object R = kotlin.collections.a.R(arrayList);
                    roverStateHolder$special$$inlined$map$1$2$1.L$0 = null;
                    roverStateHolder$special$$inlined$map$1$2$1.L$1 = null;
                    roverStateHolder$special$$inlined$map$1$2$1.L$2 = null;
                    roverStateHolder$special$$inlined$map$1$2$1.L$3 = null;
                    roverStateHolder$special$$inlined$map$1$2$1.I$0 = 0;
                    roverStateHolder$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(R, roverStateHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        roverStateHolder$special$$inlined$map$1$2$1 = new RoverStateHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = roverStateHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roverStateHolder$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
