package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public e(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1 trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        int i2;
        if (continuation instanceof TrackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1) {
            trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1 = (TrackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i3 = trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.label = i3 - Integer.MIN_VALUE;
                obj2 = trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vprVar = this.a;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.I$1 = 0;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.label = 1;
                    Object a = f.a(this.b, trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                i2 = trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.I$0;
                vprVar = (vpr) trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                if (obj2 != null) {
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.I$0 = i2;
                    trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1 = new TrackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        obj2 = trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingStateSourceRepository$trackingFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        return zy11.a;
    }
}
