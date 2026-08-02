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
public final class v implements tpr {
    public final /* synthetic */ t a;
    public final /* synthetic */ w b;
    public final /* synthetic */ fkp c;
    public final /* synthetic */ vm00 w;

    public v(t tVar, w wVar, fkp fkpVar, vm00 vm00Var) {
        this.a = tVar;
        this.b = wVar;
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
        ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1 imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1) {
            imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1 = (ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1) continuation;
            int i2 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = new u(vprVar, this.b, this.c, this.w);
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.L$0 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.L$1 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.L$2 = null;
                    imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(uVar, imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1 = new ImageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageOverlayComponentFactory$createMapObjectComponent$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
