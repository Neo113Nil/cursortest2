package ru.yandex.logistics.care.ui;

import defpackage.kt8;
import defpackage.lt8;
import defpackage.nt8;
import defpackage.ny61;
import defpackage.pt8;
import defpackage.qhb0;
import defpackage.uhb0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pt8 b;

    public d(vpr vprVar, pt8 pt8Var) {
        this.a = vprVar;
        this.b = pt8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CareWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1 careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CareWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1) {
            careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1 = (CareWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    uhb0 uhb0Var = (uhb0) obj;
                    Object lt8Var = uhb0Var instanceof qhb0 ? new lt8(((nt8) this.b).a, (qhb0) uhb0Var) : kt8.a;
                    careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                    careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lt8Var, careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1 = new CareWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careWebViewViewModelImpl$cameraOverlayState$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
