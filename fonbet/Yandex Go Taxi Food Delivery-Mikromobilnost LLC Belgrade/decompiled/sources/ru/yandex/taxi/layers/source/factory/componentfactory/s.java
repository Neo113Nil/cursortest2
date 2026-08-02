package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.bxu0;
import defpackage.hxu0;
import defpackage.mcv;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;

    public s(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ImageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1 imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1;
        int i;
        boolean z;
        Float[] fArr;
        hxu0 hxu0Var;
        hxu0 hxu0Var2;
        hxu0 hxu0Var3;
        hxu0 hxu0Var4;
        if (continuation instanceof ImageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1) {
            imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1 = (ImageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1) continuation;
            int i2 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mcv mcvVar = (mcv) obj;
                    bxu0 bxu0Var = mcvVar.d;
                    if (((bxu0Var == null || (hxu0Var4 = bxu0Var.b) == null) ? null : hxu0Var4.a) == null) {
                        if (((bxu0Var == null || (hxu0Var3 = bxu0Var.b) == null) ? null : hxu0Var3.c) == null) {
                            if (((bxu0Var == null || (hxu0Var2 = bxu0Var.b) == null) ? null : hxu0Var2.d) == null) {
                                z = false;
                                if (mcvVar.a != null && (fArr = mcvVar.b) != null && fArr.length == 2) {
                                    if (((bxu0Var != null || (hxu0Var = bxu0Var.b) == null) ? null : hxu0Var.e) != null && z) {
                                        imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$0 = null;
                                        imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$1 = null;
                                        imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$2 = null;
                                        imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$3 = null;
                                        imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.label = 1;
                                        if (this.a.emit(obj, imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                    if (mcvVar.a != null) {
                        if (((bxu0Var != null || (hxu0Var = bxu0Var.b) == null) ? null : hxu0Var.e) != null) {
                            imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$0 = null;
                            imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$1 = null;
                            imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$2 = null;
                            imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.L$3 = null;
                            imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.label = 1;
                            if (this.a.emit(obj, imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1) == coroutineSingletons) {
                            }
                        }
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
        imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1 = new ImageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageOverlayComponentFactory$createMapObjectComponent$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
