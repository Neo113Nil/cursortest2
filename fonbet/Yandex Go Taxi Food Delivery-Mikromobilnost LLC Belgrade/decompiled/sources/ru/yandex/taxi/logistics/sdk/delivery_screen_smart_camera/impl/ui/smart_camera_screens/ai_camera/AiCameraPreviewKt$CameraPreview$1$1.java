package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.ai_camera;

import android.content.Context;
import androidx.camera.core.g;
import androidx.camera.view.PreviewView;
import defpackage.i5f0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pey;
import defpackage.pxe0;
import defpackage.tse;
import defpackage.v5a1;
import defpackage.w8v;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.ai_camera.AiCameraPreviewKt$CameraPreview$1$1", f = "AiCameraPreview.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class AiCameraPreviewKt$CameraPreview$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ w8v $imageCapture;
    final /* synthetic */ pey $lifecycleOwner;
    final /* synthetic */ PreviewView $previewView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiCameraPreviewKt$CameraPreview$1$1(Context context, pey peyVar, w8v w8vVar, PreviewView previewView, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$lifecycleOwner = peyVar;
        this.$imageCapture = w8vVar;
        this.$previewView = previewView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiCameraPreviewKt$CameraPreview$1$1(this.$context, this.$lifecycleOwner, this.$imageCapture, this.$previewView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiCameraPreviewKt$CameraPreview$1$1 aiCameraPreviewKt$CameraPreview$1$1 = (AiCameraPreviewKt$CameraPreview$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiCameraPreviewKt$CameraPreview$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        i5f0 i5f0Var = i5f0.b;
        i5f0 i5f0Var2 = (i5f0) v5a1.c(this.$context).get();
        i5f0Var2.g();
        g f = new pxe0().f();
        f.J(this.$previewView.getSurfaceProvider());
        try {
            i5f0Var2.d(this.$lifecycleOwner, xs7.c, f, this.$imageCapture);
        } catch (Exception unused) {
        }
        return zy11.a;
    }
}
