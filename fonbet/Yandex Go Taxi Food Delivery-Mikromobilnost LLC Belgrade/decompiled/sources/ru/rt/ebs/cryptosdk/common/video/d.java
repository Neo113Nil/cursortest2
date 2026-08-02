package ru.rt.ebs.cryptosdk.common.video;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaRecorder;
import defpackage.cm31;
import defpackage.ny61;
import defpackage.pn7;
import defpackage.qje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class d extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ cm31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cm31 cm31Var, Continuation continuation) {
        super(2, continuation);
        this.b = cm31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pn7 pn7Var = this.b.b;
        if (pn7Var != null) {
            this.a = 1;
            CaptureRequest.Builder builder = pn7Var.g;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_MODE, 1);
                CameraCaptureSession cameraCaptureSession = pn7Var.e;
                if (cameraCaptureSession != null) {
                    qje.e(cameraCaptureSession.setRepeatingRequest(builder.build(), null, pn7Var.m));
                }
            }
            MediaRecorder mediaRecorder = pn7Var.c;
            if (mediaRecorder != null) {
                mediaRecorder.start();
            }
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
