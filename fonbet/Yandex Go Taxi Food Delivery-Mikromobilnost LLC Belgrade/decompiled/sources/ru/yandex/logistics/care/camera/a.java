package ru.yandex.logistics.care.camera;

import defpackage.ny61;
import defpackage.qs8;
import defpackage.rs8;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CareCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1 careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CareCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1) {
            careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1 = (CareCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rs8 rs8Var = (rs8) obj;
                    qs8 a = rs8Var.a().g != null ? rs8Var.a() : null;
                    careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                    careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1 = new CareCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careCameraViewModelImpl$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
