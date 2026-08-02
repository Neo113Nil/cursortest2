package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.fkp;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class z implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.g a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ fkp c;
    public final /* synthetic */ vm00 w;

    public z(kotlinx.coroutines.flow.g gVar, a0 a0Var, fkp fkpVar, vm00 vm00Var) {
        this.a = gVar;
        this.b = a0Var;
        this.c = fkpVar;
        this.w = vm00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1 overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1) {
            overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1 = (OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1) continuation;
            int i2 = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y yVar = new y(vprVar, this.b, this.c, this.w);
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.L$0 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.L$1 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.L$2 = null;
                    overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(yVar, overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1 = new OverlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overlayComponentFactory$createMapObjectComponent$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
