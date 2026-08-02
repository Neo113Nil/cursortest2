package ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream;

import androidx.lifecycle.v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sp7;
import defpackage.tp7;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.CameraControlRepository$listenToCameraStreamState$1$1", f = "CameraControlRepository.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CameraControlRepository$listenToCameraStreamState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ v $currentPreviewStreamState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraControlRepository$listenToCameraStreamState$1$1(v vVar, Continuation continuation) {
        super(2, continuation);
        this.$currentPreviewStreamState = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CameraControlRepository$listenToCameraStreamState$1$1 cameraControlRepository$listenToCameraStreamState$1$1 = new CameraControlRepository$listenToCameraStreamState$1$1(this.$currentPreviewStreamState, continuation);
        cameraControlRepository$listenToCameraStreamState$1$1.L$0 = obj;
        return cameraControlRepository$listenToCameraStreamState$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraControlRepository$listenToCameraStreamState$1$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tp7 tp7Var = new tp7(y6f0Var);
            this.$currentPreviewStreamState.g(tp7Var);
            sp7 sp7Var = new sp7(this.$currentPreviewStreamState, tp7Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, sp7Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
