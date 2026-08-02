package ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream;

import defpackage.a80;
import defpackage.iq7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rp7;
import defpackage.t7v;
import defpackage.tob1;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zkj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Ljdv;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.CameraControlRepository$listenImageStream$1$1", f = "CameraControlRepository.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
final class CameraControlRepository$listenImageStream$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ iq7 $cameraController;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraControlRepository$listenImageStream$1$1(iq7 iq7Var, Continuation continuation) {
        super(2, continuation);
        this.$cameraController = iq7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CameraControlRepository$listenImageStream$1$1 cameraControlRepository$listenImageStream$1$1 = new CameraControlRepository$listenImageStream$1$1(this.$cameraController, continuation);
        cameraControlRepository$listenImageStream$1$1.L$0 = obj;
        return cameraControlRepository$listenImageStream$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraControlRepository$listenImageStream$1$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            iq7 iq7Var = this.$cameraController;
            zkj zkjVar = zkj.c;
            rp7 rp7Var = new rp7(y6f0Var);
            iq7Var.getClass();
            tob1.b();
            t7v t7vVar = iq7Var.h;
            if (t7vVar != rp7Var || iq7Var.g != zkjVar) {
                iq7Var.g = zkjVar;
                iq7Var.h = rp7Var;
                iq7Var.i.N(zkjVar, rp7Var);
                iq7Var.n(t7vVar, rp7Var);
            }
            a80 a80Var = new a80(5, this.$cameraController);
            this.L$0 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, a80Var, this) == coroutineSingletons) {
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
