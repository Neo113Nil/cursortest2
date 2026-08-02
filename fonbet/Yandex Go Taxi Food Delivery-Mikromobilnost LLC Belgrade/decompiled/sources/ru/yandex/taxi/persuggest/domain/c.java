package ru.yandex.taxi.persuggest.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GeoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1 geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GeoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1) {
            geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1 = (GeoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1) continuation;
            int i2 = geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj).getValue();
                    kotlin.b.b(value);
                    geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.L$0 = null;
                    geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.L$1 = null;
                    geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.L$2 = null;
                    geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.L$3 = null;
                    geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(value, geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1 = new GeoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSuggestInteractorImpl$unwrapResultFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
