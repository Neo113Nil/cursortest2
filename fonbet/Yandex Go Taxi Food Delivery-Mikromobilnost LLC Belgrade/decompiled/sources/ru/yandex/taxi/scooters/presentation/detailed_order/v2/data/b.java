package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderAction$ClickType$Toggle$ToggleState;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1 scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1) {
            scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1 = (ScootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1) continuation;
            int i2 = scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState = ((Boolean) obj).booleanValue() ? ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.ON : ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.OFF;
                    scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.L$0 = null;
                    scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.L$1 = null;
                    scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.L$2 = null;
                    scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.L$3 = null;
                    scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(scootersDetailedOrderAction$ClickType$Toggle$ToggleState, scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1 = new ScootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShareLocationToggleStateRepository$listen$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
