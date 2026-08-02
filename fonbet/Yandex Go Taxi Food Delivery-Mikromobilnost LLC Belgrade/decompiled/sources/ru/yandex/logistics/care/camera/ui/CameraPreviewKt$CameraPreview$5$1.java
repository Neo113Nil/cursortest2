package ru.yandex.logistics.care.camera.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w8v;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.camera.ui.CameraPreviewKt$CameraPreview$5$1", f = "CameraPreview.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CameraPreviewKt$CameraPreview$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $flashMode;
    final /* synthetic */ w8v $imageCapture;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreviewKt$CameraPreview$5$1(w8v w8vVar, int i, Continuation continuation) {
        super(2, continuation);
        this.$imageCapture = w8vVar;
        this.$flashMode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraPreviewKt$CameraPreview$5$1(this.$imageCapture, this.$flashMode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CameraPreviewKt$CameraPreview$5$1 cameraPreviewKt$CameraPreview$5$1 = (CameraPreviewKt$CameraPreview$5$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cameraPreviewKt$CameraPreview$5$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$imageCapture.M(this.$flashMode);
        return zy11.a;
    }
}
