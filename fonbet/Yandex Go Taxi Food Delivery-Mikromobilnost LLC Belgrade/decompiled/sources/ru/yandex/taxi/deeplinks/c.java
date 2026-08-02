package ru.yandex.taxi.deeplinks;

import defpackage.dd61;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (r7.emit(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1 deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        String zoneName;
        if (continuation instanceof DeeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1) {
            deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1 = (DeeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1) continuation;
            int i2 = deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$0 = null;
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$1 = null;
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$2 = null;
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$5 = null;
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$6 = null;
                    deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.label = 1;
                    Object a = e.a(this.b, (pv0) obj, deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
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
                vprVar = (vpr) deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                dd61 dd61Var = (dd61) obj2;
                zoneName = dd61Var.a.a.getZoneName();
                if (zoneName != null || evu0.J(zoneName)) {
                    throw new NotSupportedAddressException(dd61Var.a());
                }
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$0 = null;
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$1 = null;
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$2 = null;
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$3 = null;
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$4 = null;
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$5 = null;
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.L$6 = null;
                deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1 = new DeeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deeplinkGeoPointDecoder$sourcePointInfoFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        dd61 dd61Var2 = (dd61) obj22;
        zoneName = dd61Var2.a.a.getZoneName();
        if (zoneName != null) {
        }
        throw new NotSupportedAddressException(dd61Var2.a());
    }
}
