package ru.yandex.logistics.care.camera.ui;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w8v;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.camera.ui.CareCameraComposableKt$CareCameraComposable$3$1", f = "CareCameraComposable.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareCameraComposableKt$CareCameraComposable$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $autoCaptureTrigger;
    final /* synthetic */ ExecutorService $cameraExecutor;
    final /* synthetic */ w8v $imageCapture;
    final /* synthetic */ tls $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareCameraComposableKt$CareCameraComposable$3$1(tpr tprVar, w8v w8vVar, ExecutorService executorService, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$autoCaptureTrigger = tprVar;
        this.$imageCapture = w8vVar;
        this.$cameraExecutor = executorService;
        this.$onAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareCameraComposableKt$CareCameraComposable$3$1(this.$autoCaptureTrigger, this.$imageCapture, this.$cameraExecutor, this.$onAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareCameraComposableKt$CareCameraComposable$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$autoCaptureTrigger;
            ye yeVar = new ye(this.$imageCapture, this.$cameraExecutor, this.$onAction);
            this.label = 1;
            if (tprVar.collect(yeVar, this) == coroutineSingletons) {
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
