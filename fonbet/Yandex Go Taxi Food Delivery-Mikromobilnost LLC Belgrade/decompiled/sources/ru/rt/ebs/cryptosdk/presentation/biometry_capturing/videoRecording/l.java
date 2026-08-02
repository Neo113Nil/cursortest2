package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording;

import defpackage.cm31;
import defpackage.nt7;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vn31;
import defpackage.w511;
import defpackage.wls;
import defpackage.yn31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public final class l extends SuspendLambda implements wls {
    public CameraType a;
    public int b;
    public final /* synthetic */ yn31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yn31 yn31Var, Continuation continuation) {
        super(2, continuation);
        this.c = yn31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CameraType cameraType;
        CameraType cameraType2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            CameraType cameraType3 = ((vn31) this.c.a0()).d;
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
            cm31 cm31Var = this.c.F;
            this.a = cameraType;
            this.b = 1;
            Object k0 = tje.k0(cm31Var.a.main(), new ru.rt.ebs.cryptosdk.common.video.c(cm31Var, cameraType, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            cameraType2 = cameraType;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CameraType cameraType4 = this.a;
            kotlin.b.b(obj);
            cameraType2 = cameraType4;
        }
        yn31 yn31Var = this.c;
        vn31 a = vn31.a((vn31) yn31Var.a0(), null, null, cameraType2, true, false, false, 0, false, 487);
        r0 r0Var = (r0) yn31Var.c0();
        r0Var.getClass();
        r0Var.m(null, a);
        return zy11Var;
    }
}
