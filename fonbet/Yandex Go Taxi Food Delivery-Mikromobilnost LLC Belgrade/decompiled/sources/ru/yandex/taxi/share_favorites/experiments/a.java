package ru.yandex.taxi.share_favorites.experiments;

import defpackage.ny61;
import defpackage.v0t;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GeoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1 geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GeoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1) {
            geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1 = (GeoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1) continuation;
            int i2 = geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    v0t v0tVar = (v0t) obj;
                    if (!v0tVar.b()) {
                        v0t.Companion.getClass();
                        v0tVar = v0t.i;
                    }
                    geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.L$0 = null;
                    geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.L$1 = null;
                    geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.L$2 = null;
                    geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.L$3 = null;
                    geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(v0tVar, geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1) == coroutineSingletons) {
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
        geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1 = new GeoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1(this, continuation);
        Object obj22 = geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingBubbleFactory$flowExperiment$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
