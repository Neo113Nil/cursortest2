package ru.yandex.taxi.intercity.data;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
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
        IntercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1 intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof IntercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1) {
            intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1 = (IntercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1) continuation;
            int i2 = intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$0 = null;
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$1 = null;
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$2 = null;
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$5 = null;
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$6 = null;
                    intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = 1;
                    Object b = g.b(this.b, (Point) obj, intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        obj2 = b;
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
                vprVar = (vpr) intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$0 = null;
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$1 = null;
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$2 = null;
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$3 = null;
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4 = null;
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$5 = null;
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$6 = null;
                intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1 = new IntercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$0 = null;
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$1 = null;
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$2 = null;
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$3 = null;
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4 = null;
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$5 = null;
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$6 = null;
        intercityModeProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = 2;
    }
}
