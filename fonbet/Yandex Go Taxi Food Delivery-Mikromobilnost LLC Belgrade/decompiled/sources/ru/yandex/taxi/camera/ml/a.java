package ru.yandex.taxi.camera.ml;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.core.j;
import defpackage.asj0;
import defpackage.bsj0;
import defpackage.csj0;
import defpackage.d6z;
import defpackage.dfb1;
import defpackage.er7;
import defpackage.i5f0;
import defpackage.jst;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ody;
import defpackage.pxe0;
import defpackage.q8v;
import defpackage.v5a1;
import defpackage.w8v;
import defpackage.x8v;
import defpackage.xs7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.camera.CameraPreview;

/* loaded from: classes4.dex */
public abstract class a {
    public static final w8v a(bsj0 bsj0Var, Integer num) {
        q8v q8vVar = new q8v();
        q8vVar.h(bsj0Var);
        if (num != null) {
            int intValue = num.intValue();
            d6z.p(intValue, 1, 100, "jpegQuality");
            q8vVar.a.w(x8v.C, Integer.valueOf(intValue));
        }
        return q8vVar.f();
    }

    public static final noh b(Context context) {
        i5f0 i5f0Var = i5f0.b;
        return dfb1.c(v5a1.c(context));
    }

    public static final bsj0 c(Size size) {
        asj0 asj0Var = new asj0();
        asj0Var.b = new csj0(3, size);
        return asj0Var.a();
    }

    public static final ody d(i5f0 i5f0Var, er7 er7Var, xs7 xs7Var, CameraPreview cameraPreview, j jVar) {
        g f = new pxe0().f();
        cameraPreview.attachPreview(f);
        i5f0Var.g();
        try {
            return (ody) i5f0Var.d(er7Var, xs7Var, f, jVar);
        } catch (IllegalArgumentException e) {
            jst.e.k(e, "Unable to init camera");
            return null;
        } catch (IllegalStateException e2) {
            jst.e.k(e2, "Unable to init camera");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(noh nohVar, er7 er7Var, xs7 xs7Var, CameraPreview cameraPreview, j jVar, ContinuationImpl continuationImpl) {
        CameraProviderExtensionKt$startCamera$1 cameraProviderExtensionKt$startCamera$1;
        int i;
        if (continuationImpl instanceof CameraProviderExtensionKt$startCamera$1) {
            cameraProviderExtensionKt$startCamera$1 = (CameraProviderExtensionKt$startCamera$1) continuationImpl;
            int i2 = cameraProviderExtensionKt$startCamera$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraProviderExtensionKt$startCamera$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraProviderExtensionKt$startCamera$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraProviderExtensionKt$startCamera$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cameraProviderExtensionKt$startCamera$1.L$0 = null;
                    cameraProviderExtensionKt$startCamera$1.L$1 = er7Var;
                    cameraProviderExtensionKt$startCamera$1.L$2 = xs7Var;
                    cameraProviderExtensionKt$startCamera$1.L$3 = cameraPreview;
                    cameraProviderExtensionKt$startCamera$1.L$4 = jVar;
                    cameraProviderExtensionKt$startCamera$1.label = 1;
                    obj = nohVar.k(cameraProviderExtensionKt$startCamera$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar = (j) cameraProviderExtensionKt$startCamera$1.L$4;
                    cameraPreview = (CameraPreview) cameraProviderExtensionKt$startCamera$1.L$3;
                    xs7Var = (xs7) cameraProviderExtensionKt$startCamera$1.L$2;
                    er7Var = (er7) cameraProviderExtensionKt$startCamera$1.L$1;
                    kotlin.b.b(obj);
                }
                return d((i5f0) obj, er7Var, xs7Var, cameraPreview, jVar);
            }
        }
        cameraProviderExtensionKt$startCamera$1 = new CameraProviderExtensionKt$startCamera$1(continuationImpl);
        Object obj3 = cameraProviderExtensionKt$startCamera$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraProviderExtensionKt$startCamera$1.label;
        if (i != 0) {
        }
        return d((i5f0) obj3, er7Var, xs7Var, cameraPreview, jVar);
    }

    public static final void f(noh nohVar) {
        try {
            ((i5f0) nohVar.c()).g();
        } catch (Exception e) {
            jst.e.k(e, "Unable to release camera on ".concat(nohVar.getClass().getSimpleName()));
        }
    }
}
