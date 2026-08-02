package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.statusbar;

import defpackage.avj0;
import defpackage.ea90;
import defpackage.i47;
import defpackage.kyh0;
import defpackage.lrj0;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.se90;
import defpackage.shn0;
import defpackage.thn0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ thn0 b;
    public final /* synthetic */ zuo0 c;

    public a(vpr vprVar, thn0 thn0Var, zuo0 zuo0Var) {
        this.a = vprVar;
        this.b = thn0Var;
        this.c = zuo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1 scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1;
        int i;
        shn0 shn0Var;
        if (continuation instanceof ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1) {
            scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1 = (ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1) continuation;
            int i2 = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) obj;
                    i47 i47Var = this.b.a;
                    zuo0 zuo0Var = this.c;
                    if (zuo0Var instanceof ea90) {
                        int i3 = kyh0.scooters_in_the_parking;
                        shn0Var = new shn0(((avj0) i47Var.b).i(i3, str), ((ea90) zuo0Var).w);
                    } else if (zuo0Var instanceof se90) {
                        int i4 = kyh0.scooters_in_the_parking;
                        shn0Var = new shn0(((avj0) i47Var.b).i(i4, str), ((se90) zuo0Var).v);
                    } else if (zuo0Var instanceof nrk0) {
                        int i5 = kyh0.scooters_on_the_way;
                        shn0Var = new shn0(((avj0) i47Var.b).i(i5, str), ((nrk0) zuo0Var).w);
                    } else {
                        if (!(zuo0Var instanceof lrj0)) {
                            i47Var.getClass();
                            w511.b();
                            return null;
                        }
                        shn0Var = new shn0(((avj0) i47Var.b).h(kyh0.scooters_ontheway_reservation), str);
                    }
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.L$0 = null;
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.L$1 = null;
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.L$2 = null;
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.L$3 = null;
                    scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(shn0Var, scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1 = new ScootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedStatusInteractor$listenStatusFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
