package ru.yandex.taxi.scooters.presentation.ontheway.bluetooth;

import defpackage.b64;
import defpackage.c2n0;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.hxx;
import defpackage.ii30;
import defpackage.j18;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.w1n0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, ii30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w1n0 w1n0Var, oep0 oep0Var, ContinuationImpl continuationImpl) {
        ScootersBluetoothRouterKt$launchAwait$1 scootersBluetoothRouterKt$launchAwait$1;
        int i;
        if (continuationImpl instanceof ScootersBluetoothRouterKt$launchAwait$1) {
            scootersBluetoothRouterKt$launchAwait$1 = (ScootersBluetoothRouterKt$launchAwait$1) continuationImpl;
            int i2 = scootersBluetoothRouterKt$launchAwait$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBluetoothRouterKt$launchAwait$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersBluetoothRouterKt$launchAwait$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBluetoothRouterKt$launchAwait$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                scootersBluetoothRouterKt$launchAwait$1.L$0 = w1n0Var;
                scootersBluetoothRouterKt$launchAwait$1.L$1 = oep0Var;
                scootersBluetoothRouterKt$launchAwait$1.L$2 = w1n0Var;
                scootersBluetoothRouterKt$launchAwait$1.label = 1;
                j18 j18Var = new j18(1, dvw.b(scootersBluetoothRouterKt$launchAwait$1));
                Ref$ObjectRef y = b64.y(j18Var);
                cx60 cx60Var = new cx60(5, y);
                cl7 cl7Var = new cl7(j18Var, cx60Var);
                ((pep0) oep0Var).f(new c2n0(w1n0Var, new ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0)), zy11Var, hxx.a);
                y.element = new ii30(27, w1n0Var);
                if (cl7Var.c()) {
                    cx60Var.invoke();
                } else {
                    j18Var.w(new dx60(cl7Var, 6));
                }
                return j18Var.s() == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        scootersBluetoothRouterKt$launchAwait$1 = new ScootersBluetoothRouterKt$launchAwait$1(continuationImpl);
        Object obj2 = scootersBluetoothRouterKt$launchAwait$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBluetoothRouterKt$launchAwait$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
