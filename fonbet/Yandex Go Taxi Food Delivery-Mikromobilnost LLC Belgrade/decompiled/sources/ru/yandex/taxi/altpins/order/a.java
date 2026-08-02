package ru.yandex.taxi.altpins.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.gz1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AltpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1 altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AltpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1) {
            altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1 = (AltpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    gz1 gz1Var = new gz1(taxiOrder.V(), taxiOrder.h.b, taxiOrder.V().j0, taxiOrder.l.A, taxiOrder.l.B);
                    altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(gz1Var, altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1 = new AltpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinDestinationOnMapInteractor$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
