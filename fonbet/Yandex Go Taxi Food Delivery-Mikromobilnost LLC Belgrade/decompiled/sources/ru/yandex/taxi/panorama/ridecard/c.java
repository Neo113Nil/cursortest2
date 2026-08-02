package ru.yandex.taxi.panorama.ridecard;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ d b;

    public c(b2k b2kVar, d dVar) {
        this.a = b2kVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1 rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1) {
            rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1 = (RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1) continuation;
            int i2 = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.L$2 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1 = new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
