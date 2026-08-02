package ru.yandex.taxi.location;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        if (r9.emit(r11, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LbsProviderImpl$requestLocation$$inlined$map$2$2$1 lbsProviderImpl$requestLocation$$inlined$map$2$2$1;
        Object obj2;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        List list;
        vpr vprVar2;
        if (continuation instanceof LbsProviderImpl$requestLocation$$inlined$map$2$2$1) {
            lbsProviderImpl$requestLocation$$inlined$map$2$2$1 = (LbsProviderImpl$requestLocation$$inlined$map$2$2$1) continuation;
            int i2 = lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = lbsProviderImpl$requestLocation$$inlined$map$2$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label;
                g gVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list2 = (List) obj;
                    ru.yandex.taxi.launch.c cVar = (ru.yandex.taxi.launch.c) gVar.i.get();
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$0 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$1 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$2 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$3 = null;
                    vpr vprVar3 = this.a;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$4 = vprVar3;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$5 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$6 = list2;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label = 1;
                    obj2 = cVar.c(lbsProviderImpl$requestLocation$$inlined$map$2$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar3;
                        list = list2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    list = (List) lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$6;
                    vprVar = (vpr) lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$0 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$1 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$2 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$3 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$4 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$5 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$6 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$7 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label = 3;
                }
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$0 = null;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$1 = null;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$2 = null;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$3 = null;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$4 = vprVar;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$5 = null;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$6 = null;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$7 = null;
                lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label = 2;
                obj2 = g.a(gVar, (String) obj2, list, lbsProviderImpl$requestLocation$$inlined$map$2$2$1);
                if (obj2 != coroutineSingletons) {
                    vprVar2 = vprVar;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$0 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$1 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$2 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$3 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$4 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$5 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$6 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$7 = null;
                    lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1 = new LbsProviderImpl$requestLocation$$inlined$map$2$2$1(this, continuation);
        obj2 = lbsProviderImpl$requestLocation$$inlined$map$2$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label;
        g gVar2 = this.b;
        if (i != 0) {
        }
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$0 = null;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$1 = null;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$2 = null;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$3 = null;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$4 = vprVar;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$5 = null;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$6 = null;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.L$7 = null;
        lbsProviderImpl$requestLocation$$inlined$map$2$2$1.label = 2;
        obj2 = g.a(gVar2, (String) obj2, list, lbsProviderImpl$requestLocation$$inlined$map$2$2$1);
        if (obj2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
