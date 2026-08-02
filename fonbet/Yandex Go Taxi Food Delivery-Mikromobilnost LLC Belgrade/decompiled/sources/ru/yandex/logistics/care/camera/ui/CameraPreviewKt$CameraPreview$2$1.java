package ru.yandex.logistics.care.camera.ui;

import android.content.Context;
import androidx.camera.core.g;
import androidx.camera.view.PreviewView;
import defpackage.co7;
import defpackage.g70;
import defpackage.i5f0;
import defpackage.kf61;
import defpackage.ms7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ody;
import defpackage.oz40;
import defpackage.pey;
import defpackage.pxe0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.v5a1;
import defpackage.vdb1;
import defpackage.w511;
import defpackage.w8v;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.camera.ui.CameraPreviewKt$CameraPreview$2$1", f = "CameraPreview.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CameraPreviewKt$CameraPreview$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $boundCamera$delegate;
    final /* synthetic */ Config$CameraLens $camera;
    final /* synthetic */ Context $context;
    final /* synthetic */ w8v $imageCapture;
    final /* synthetic */ pey $lifecycleOwner;
    final /* synthetic */ sls $onCameraUnavailable;
    final /* synthetic */ tls $onCamerasAvailable;
    final /* synthetic */ PreviewView $previewView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreviewKt$CameraPreview$2$1(Context context, Config$CameraLens config$CameraLens, sls slsVar, pey peyVar, w8v w8vVar, tls tlsVar, PreviewView previewView, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$camera = config$CameraLens;
        this.$onCameraUnavailable = slsVar;
        this.$lifecycleOwner = peyVar;
        this.$imageCapture = w8vVar;
        this.$onCamerasAvailable = tlsVar;
        this.$previewView = previewView;
        this.$boundCamera$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraPreviewKt$CameraPreview$2$1(this.$context, this.$camera, this.$onCameraUnavailable, this.$lifecycleOwner, this.$imageCapture, this.$onCamerasAvailable, this.$previewView, this.$boundCamera$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CameraPreviewKt$CameraPreview$2$1 cameraPreviewKt$CameraPreview$2$1 = (CameraPreviewKt$CameraPreview$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cameraPreviewKt$CameraPreview$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xs7 xs7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i5f0 i5f0Var = i5f0.b;
        i5f0 i5f0Var2 = (i5f0) v5a1.c(this.$context).get();
        i5f0Var2.g();
        g f = new pxe0().f();
        f.J(this.$previewView.getSurfaceProvider());
        int i = ms7.a[this.$camera.ordinal()];
        if (i == 1) {
            xs7Var = xs7.b;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            xs7Var = xs7.c;
        }
        boolean e = i5f0Var2.e(xs7Var);
        zy11 zy11Var = zy11.a;
        if (!e) {
            this.$onCameraUnavailable.invoke();
            return zy11Var;
        }
        try {
            co7 d = i5f0Var2.d(this.$lifecycleOwner, xs7Var, f, this.$imageCapture);
            this.$boundCamera$delegate.setValue(d);
            kf61 kf61Var = (kf61) ((g70) ((ody) d).c()).k().d();
            if (kf61Var != null) {
                this.$onCamerasAvailable.invoke(vdb1.f(kf61Var));
            }
            return zy11Var;
        } catch (Exception unused) {
            this.$onCameraUnavailable.invoke();
            return zy11Var;
        }
    }
}
