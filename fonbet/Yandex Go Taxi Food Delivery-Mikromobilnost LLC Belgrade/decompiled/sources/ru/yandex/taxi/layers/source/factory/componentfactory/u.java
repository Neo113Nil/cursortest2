package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.fkp;
import defpackage.mcv;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class u implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ w b;
    public final /* synthetic */ fkp c;
    public final /* synthetic */ vm00 w;

    public u(vpr vprVar, w wVar, fkp fkpVar, vm00 vm00Var) {
        this.a = vprVar;
        this.b = wVar;
        this.c = fkpVar;
        this.w = vm00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r12.emit(r14, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1 imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        if (continuation instanceof ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1) {
            imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1 = (ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mcv mcvVar = (mcv) obj;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$0 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$1 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar2 = this.a;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$4 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$5 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.label = 1;
                    w wVar = this.b;
                    wVar.a.getClass();
                    obj2 = tje.k0(uyj.a, new ImageOverlayComponentFactory$prepareImageOverlay$2(wVar, mcvVar, this.c, this.w, null), imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1);
                    if (obj2 != coroutineSingletons) {
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
                vprVar = (vpr) imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                if (obj2 != null) {
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$0 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$1 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$2 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$3 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$4 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.L$5 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1 = new ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1(this, continuation);
        obj2 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        return zy11.a;
    }
}
