package ru.yandex.logistics.care.ui;

import defpackage.bu8;
import defpackage.ny61;
import defpackage.pt8;
import defpackage.qhb0;
import defpackage.qt8;
import defpackage.rhb0;
import defpackage.rt8;
import defpackage.shb0;
import defpackage.st8;
import defpackage.thb0;
import defpackage.tt8;
import defpackage.uhb0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pt8 b;
    public final /* synthetic */ l c;

    public f(vpr vprVar, pt8 pt8Var, l lVar) {
        this.a = vprVar;
        this.b = pt8Var;
        this.c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CareWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1 careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1;
        int i;
        Object qt8Var;
        Object st8Var;
        if (continuation instanceof CareWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1) {
            careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1 = (CareWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    uhb0 uhb0Var = (uhb0) obj;
                    int i4 = 0;
                    if (uhb0Var instanceof qhb0) {
                        qt8Var = rt8.a;
                    } else {
                        if (uhb0Var instanceof thb0) {
                            st8Var = new tt8(((thb0) uhb0Var).a);
                        } else {
                            boolean z = uhb0Var instanceof shb0;
                            l lVar = this.c;
                            pt8 pt8Var = this.b;
                            if (z) {
                                shb0 shb0Var = (shb0) uhb0Var;
                                st8Var = new st8(shb0Var.a, shb0Var.b, shb0Var.c, new bu8(pt8Var, lVar, i4));
                            } else {
                                if (!(uhb0Var instanceof rhb0)) {
                                    w511.b();
                                    return null;
                                }
                                rhb0 rhb0Var = (rhb0) uhb0Var;
                                qt8Var = new qt8(rhb0Var.a, rhb0Var.b, rhb0Var.d, rhb0Var.c, new e(pt8Var), new bu8(pt8Var, lVar, i3));
                            }
                        }
                        qt8Var = st8Var;
                    }
                    careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                    careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(qt8Var, careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1 = new CareWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careWebViewViewModelImpl$cameraUploadState$lambda$0$$inlined$map$1$2$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }
}
