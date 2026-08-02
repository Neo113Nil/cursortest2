package ru.yandex.taxi.logistics.sdk.tracking.impl.rover;

import defpackage.hth;
import defpackage.jl40;
import defpackage.jth;
import defpackage.lth;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xgl0;
import defpackage.ygl0;
import defpackage.zgl0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public b(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RoverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1;
        int i;
        zgl0 zgl0Var;
        if (continuation instanceof RoverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) {
            roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = (RoverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lth lthVar = (lth) obj;
                    boolean z = lthVar instanceof jth;
                    String str = this.b;
                    if (z && jl40.l(((jth) lthVar).c, str)) {
                        zgl0Var = ygl0.a;
                    } else {
                        if (lthVar instanceof hth) {
                            hth hthVar = (hth) lthVar;
                            if (jl40.l(hthVar.c, str)) {
                                zgl0Var = new xgl0(hthVar.e);
                            }
                        }
                        zgl0Var = null;
                    }
                    if (zgl0Var != null) {
                        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(zgl0Var, roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = new RoverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roverTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
