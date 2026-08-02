package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.lv8;
import defpackage.ny61;
import defpackage.q3s;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;

    public g(vpr vprVar, h hVar) {
        this.a = vprVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CargoFormViewModel$special$$inlined$map$1$2$1 cargoFormViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CargoFormViewModel$special$$inlined$map$1$2$1) {
            cargoFormViewModel$special$$inlined$map$1$2$1 = (CargoFormViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = cargoFormViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cargoFormViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cargoFormViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cargoFormViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    q3s q3sVar = (q3s) obj;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b.y;
                    lv8 lv8Var = new lv8(aVar.g.f(q3sVar.a), q3sVar.b);
                    cargoFormViewModel$special$$inlined$map$1$2$1.L$0 = null;
                    cargoFormViewModel$special$$inlined$map$1$2$1.L$1 = null;
                    cargoFormViewModel$special$$inlined$map$1$2$1.L$2 = null;
                    cargoFormViewModel$special$$inlined$map$1$2$1.L$3 = null;
                    cargoFormViewModel$special$$inlined$map$1$2$1.I$0 = 0;
                    cargoFormViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lv8Var, cargoFormViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        cargoFormViewModel$special$$inlined$map$1$2$1 = new CargoFormViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cargoFormViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cargoFormViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
