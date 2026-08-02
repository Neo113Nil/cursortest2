package ru.yandex.taxi.persuggest.domain;

import defpackage.d2t;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.persuggest.domain.model.GeoSuggestException;

/* loaded from: classes9.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d2t b;

    public e(vpr vprVar, d2t d2tVar) {
        this.a = vprVar;
        this.b = d2tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1 geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1) {
            geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1 = (GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1) continuation;
            int i2 = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj).getValue();
                    Throwable a = Result.a(value);
                    if (a != null) {
                        value = new Result.Failure(new GeoSuggestException(a, this.b.b.d));
                    }
                    Result result = new Result(value);
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.L$0 = null;
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.L$1 = null;
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.L$2 = null;
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.L$3 = null;
                    geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(result, geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1) == coroutineSingletons) {
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
        geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1 = new GeoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1(this, continuation);
        Object obj22 = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSuggestInteractorImpl$wrapInGeoSuggestException$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
