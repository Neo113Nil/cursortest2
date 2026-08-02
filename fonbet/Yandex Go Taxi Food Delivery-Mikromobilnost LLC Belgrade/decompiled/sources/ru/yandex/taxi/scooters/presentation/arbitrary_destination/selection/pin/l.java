package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin;

import defpackage.e0c0;
import defpackage.f0c0;
import defpackage.ny61;
import defpackage.r0c0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin.ScootersPinStateRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public l(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1 scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1;
        int i;
        f0c0 b;
        r0c0 r0c0Var = this.b.a;
        if (continuation instanceof ScootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1) {
            scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1 = (ScootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = e.a[((ScootersPinStateRepository.State) obj).ordinal()];
                    if (i3 == 1) {
                        b = r0c0Var.b();
                    } else if (i3 == 2) {
                        b = e0c0.a;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        b = r0c0Var.d();
                    }
                    SourceOnMapControl.a aVar = new SourceOnMapControl.a(b, null, null, false, false, null, null, 2046);
                    scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(aVar, scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1 = new ScootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
