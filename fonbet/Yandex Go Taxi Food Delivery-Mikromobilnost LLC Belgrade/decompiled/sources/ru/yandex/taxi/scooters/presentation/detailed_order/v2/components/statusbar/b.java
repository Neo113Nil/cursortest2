package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.statusbar;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.thn0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ thn0 b;
    public final /* synthetic */ zuo0 c;

    public b(rol0 rol0Var, thn0 thn0Var, zuo0 zuo0Var) {
        this.a = rol0Var;
        this.b = thn0Var;
        this.c = zuo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1 scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1) {
            scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1 = (ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1) continuation;
            int i2 = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.L$0 = null;
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.L$1 = null;
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.L$2 = null;
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1 = new ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
