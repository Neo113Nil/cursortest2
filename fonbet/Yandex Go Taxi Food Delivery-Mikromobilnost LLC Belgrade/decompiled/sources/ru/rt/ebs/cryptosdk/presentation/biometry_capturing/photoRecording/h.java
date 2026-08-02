package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording;

import defpackage.bhb0;
import defpackage.lib0;
import defpackage.nt7;
import defpackage.ny61;
import defpackage.oib0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public final class h extends SuspendLambda implements wls {
    public CameraType a;
    public int b;
    public final /* synthetic */ oib0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(oib0 oib0Var, Continuation continuation) {
        super(2, continuation);
        this.c = oib0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CameraType cameraType;
        CameraType cameraType2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            CameraType cameraType3 = ((lib0) this.c.a0()).b;
            cameraType3.getClass();
            int i2 = nt7.a[cameraType3.ordinal()];
            if (i2 == 1) {
                cameraType = CameraType.BACK;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                cameraType = CameraType.FRONT;
            }
            bhb0 bhb0Var = this.c.F;
            bhb0Var.b = null;
            bhb0Var.c = null;
            this.a = cameraType;
            this.b = 1;
            bhb0Var.a(cameraType);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
            cameraType2 = cameraType;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CameraType cameraType4 = this.a;
            b.b(obj);
            cameraType2 = cameraType4;
        }
        oib0 oib0Var = this.c;
        lib0 a = lib0.a((lib0) oib0Var.a0(), null, cameraType2, true, false, false, 0, 57);
        r0 r0Var = (r0) oib0Var.c0();
        r0Var.getClass();
        r0Var.m(null, a);
        return zy11Var;
    }
}
