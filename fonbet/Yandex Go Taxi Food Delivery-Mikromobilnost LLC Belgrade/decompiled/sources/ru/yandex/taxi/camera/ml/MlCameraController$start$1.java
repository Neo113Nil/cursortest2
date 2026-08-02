package ru.yandex.taxi.camera.ml;

import android.util.Size;
import androidx.camera.core.f;
import defpackage.bsj0;
import defpackage.co7;
import defpackage.er7;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v7v;
import defpackage.wls;
import defpackage.xs7;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.camera.CameraPreview;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.camera.ml.MlCameraController$start$1", f = "MlCameraController.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MlCameraController$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ Size $resolution;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlCameraController$start$1(Size size, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$resolution = size;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MlCameraController$start$1(this.$resolution, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MlCameraController$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MlCameraController$start$1 mlCameraController$start$1;
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        co7 co7Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            bsj0 c = a.c(this.$resolution);
            v7v v7vVar = new v7v();
            v7vVar.h(c);
            f f = v7vVar.f();
            c cVar2 = this.this$0;
            cVar2.g = f;
            noh nohVar = cVar2.e;
            er7 er7Var = cVar2.f;
            xs7 xs7Var = xs7.c;
            CameraPreview cameraPreview = cVar2.a;
            this.L$0 = null;
            this.L$1 = cVar2;
            this.label = 1;
            mlCameraController$start$1 = this;
            Object e = a.e(nohVar, er7Var, xs7Var, cameraPreview, f, mlCameraController$start$1);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar = cVar2;
            obj = e;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = (c) this.L$1;
            kotlin.b.b(obj);
            mlCameraController$start$1 = this;
        }
        co7 co7Var2 = (co7) obj;
        if (co7Var2 != null) {
            c cVar3 = mlCameraController$start$1.this$0;
            f fVar = cVar3.g;
            if (fVar != null) {
                fVar.N((ExecutorService) cVar3.h.getValue(), new b(cVar3));
            }
            co7Var = co7Var2;
        }
        cVar.i = co7Var;
        return zy11.a;
    }
}
