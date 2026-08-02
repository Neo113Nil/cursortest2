package ru.yandex.taxi.order;

import defpackage.mo21;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GeoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1 geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof GeoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1) {
            geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1 = (GeoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1) continuation;
            int i2 = geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$0 = null;
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$1 = null;
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$2 = null;
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$4 = vprVar2;
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$5 = null;
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$6 = null;
                    geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.label = 1;
                    Object c = d.c(this.b, (mo21) obj, geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1);
                    if (c != coroutineSingletons) {
                        obj2 = c;
                        vprVar = vprVar2;
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
                vprVar = (vpr) geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$0 = null;
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$1 = null;
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$2 = null;
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$3 = null;
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$4 = null;
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$5 = null;
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$6 = null;
                geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.label = 2;
            }
        }
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1 = new GeoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1(this, continuation);
        Object obj22 = geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$0 = null;
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$1 = null;
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$2 = null;
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$3 = null;
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$4 = null;
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$5 = null;
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.L$6 = null;
        geoSharingInteractorImpl$subscribeForUserLocationIfNeeded$$inlined$map$1$2$1.label = 2;
    }
}
