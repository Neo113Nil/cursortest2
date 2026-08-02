package ru.yandex.taxi.masstransit.ui.discovery;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.ny61;
import defpackage.uu30;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        if (r8.emit(r10, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r10 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtProductsParamFactory$paramFlow$$inlined$map$1$2$1 mtProductsParamFactory$paramFlow$$inlined$map$1$2$1;
        int i;
        Object b;
        if (continuation instanceof MtProductsParamFactory$paramFlow$$inlined$map$1$2$1) {
            mtProductsParamFactory$paramFlow$$inlined$map$1$2$1 = (MtProductsParamFactory$paramFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ZoneAddress zoneAddress = ((uu30) obj).a;
                    Address address = zoneAddress != null ? zoneAddress.a : null;
                    vpr vprVar = this.a;
                    c cVar = this.b;
                    if (address != null) {
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$0 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$1 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$2 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$3 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$5 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$6 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$7 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = 1;
                        b = cVar.c(address, mtProductsParamFactory$paramFlow$$inlined$map$1$2$1);
                    } else {
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$0 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$1 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$2 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$3 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$5 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$6 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$7 = null;
                        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = 2;
                        b = c.b(cVar, mtProductsParamFactory$paramFlow$$inlined$map$1$2$1);
                    }
                } else {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vpr vprVar2 = (vpr) mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$0 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$1 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$2 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$3 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$5 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$6 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$7 = null;
                mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = 3;
            }
        }
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1 = new MtProductsParamFactory$paramFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$0 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$1 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$2 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$3 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$4 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$5 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$6 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.L$7 = null;
        mtProductsParamFactory$paramFlow$$inlined$map$1$2$1.label = 3;
    }
}
