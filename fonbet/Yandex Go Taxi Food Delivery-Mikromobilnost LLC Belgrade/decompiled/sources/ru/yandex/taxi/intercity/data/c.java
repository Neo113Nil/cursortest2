package ru.yandex.taxi.intercity.data;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zs7;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
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
        IntercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1 intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof IntercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1) {
            intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1 = (IntercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1) continuation;
            int i2 = intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Point target = ((zs7) obj).a.getTarget();
                    intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.L$0 = null;
                    intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.L$1 = null;
                    intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.L$2 = null;
                    intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.L$3 = null;
                    intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(target, intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1) == coroutineSingletons) {
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
        intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1 = new IntercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityModeProductsParamFactory$listenGeo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
