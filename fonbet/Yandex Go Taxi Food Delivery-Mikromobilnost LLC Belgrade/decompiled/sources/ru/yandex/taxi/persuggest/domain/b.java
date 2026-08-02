package ru.yandex.taxi.persuggest.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ RoutePointType b;

    public b(tpr tprVar, RoutePointType routePointType) {
        this.a = tprVar;
        this.b = routePointType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GeoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1 geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1;
        int i;
        if (continuation instanceof GeoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1) {
            geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1 = (GeoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1) continuation;
            int i2 = geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.L$0 = null;
                    geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.L$1 = null;
                    geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.L$2 = null;
                    geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1) == coroutineSingletons) {
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
        geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1 = new GeoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1(this, continuation);
        Object obj2 = geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSuggestInteractorImpl$listenToSuggest$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
