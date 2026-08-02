package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.fkp;
import defpackage.ny61;
import defpackage.s090;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class y implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ fkp c;
    public final /* synthetic */ vm00 w;

    public y(vpr vprVar, a0 a0Var, fkp fkpVar, vm00 vm00Var) {
        this.a = vprVar;
        this.b = a0Var;
        this.c = fkpVar;
        this.w = vm00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1 overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1) {
            overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1 = (OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$4 = vprVar2;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$5 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$6 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.label = 1;
                    Object d = a0.d(this.b, this.c, (s090) obj, this.w, overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1);
                    if (d != coroutineSingletons) {
                        obj2 = d;
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
                vprVar = (vpr) overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$0 = null;
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$1 = null;
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$2 = null;
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$3 = null;
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$4 = null;
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$5 = null;
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$6 = null;
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.label = 2;
            }
        }
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1 = new OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$0 = null;
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$1 = null;
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$2 = null;
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$3 = null;
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$4 = null;
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$5 = null;
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.L$6 = null;
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$2$1.label = 2;
    }
}
