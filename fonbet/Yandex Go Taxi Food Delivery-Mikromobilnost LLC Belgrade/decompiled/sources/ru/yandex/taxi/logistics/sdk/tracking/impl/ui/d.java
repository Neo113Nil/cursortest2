package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.d780;
import defpackage.e780;
import defpackage.f780;
import defpackage.g780;
import defpackage.m780;
import defpackage.m83;
import defpackage.n780;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zgz0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;

    public d(vpr vprVar, k kVar) {
        this.a = vprVar;
        this.b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1 trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1;
        int i;
        m83 n780Var;
        if (continuation instanceof TrackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1) {
            trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1 = (TrackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1) continuation;
            int i2 = trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f780 f780Var = (f780) obj;
                    if (f780Var instanceof d780) {
                        n780Var = new m780(((d780) f780Var).a);
                    } else {
                        if (!(f780Var instanceof e780)) {
                            w511.b();
                            return null;
                        }
                        n780Var = new n780(new zgz0(17, this.b));
                    }
                    g780 g780Var = new g780(n780Var);
                    trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.L$0 = null;
                    trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.L$1 = null;
                    trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.L$2 = null;
                    trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.L$3 = null;
                    trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.I$0 = 0;
                    trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g780Var, trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1) == coroutineSingletons) {
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
        trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1 = new TrackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingViewModel$launchOrderStateEmitting$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
