package ru.yandex.taxi.zonemodes;

import defpackage.n20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public a(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ZoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1 zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof ZoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1) {
            zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1 = (ZoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1) continuation;
            int i2 = zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    n20 n20Var = this.b.e;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$0 = null;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$1 = null;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$2 = null;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$5 = null;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$6 = null;
                    zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = ((com.yandex.go.taxi.order.provider.a) n20Var).t(zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$0 = null;
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$1 = null;
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$2 = null;
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$3 = null;
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$4 = null;
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$5 = null;
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$6 = null;
                zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1 = new ZoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$0 = null;
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$1 = null;
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$2 = null;
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$3 = null;
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$4 = null;
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$5 = null;
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.L$6 = null;
        zoneModesInteractorImpl$activeOrderFlow$$inlined$map$1$2$1.label = 2;
    }
}
