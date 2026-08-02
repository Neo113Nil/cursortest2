package ru.yandex.taxi.persuggest.domain;

import defpackage.d2t;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ d2t b;

    public f(tpr tprVar, d2t d2tVar) {
        this.a = tprVar;
        this.b = d2tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1 geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1;
        int i;
        if (continuation instanceof GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1) {
            geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1 = (GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1) continuation;
            int i2 = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.L$0 = null;
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.L$1 = null;
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.L$2 = null;
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1) == coroutineSingletons) {
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
        geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1 = new GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1(this, continuation);
        Object obj2 = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
