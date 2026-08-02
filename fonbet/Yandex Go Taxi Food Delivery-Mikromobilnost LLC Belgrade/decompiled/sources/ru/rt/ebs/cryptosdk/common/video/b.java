package ru.rt.ebs.cryptosdk.common.video;

import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.cm31;
import defpackage.gwy;
import defpackage.ny61;
import defpackage.pn7;
import defpackage.s2v;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.concurrent.Executors;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;

/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ cm31 b;
    public final /* synthetic */ s2v c;
    public final /* synthetic */ File d;
    public final /* synthetic */ VideoResolutionRestrictions e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cm31 cm31Var, s2v s2vVar, File file, VideoResolutionRestrictions videoResolutionRestrictions, Continuation continuation) {
        super(2, continuation);
        this.b = cm31Var;
        this.c = s2vVar;
        this.d = file;
        this.e = videoResolutionRestrictions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        cm31 cm31Var = this.b;
        if (cm31Var.b == null) {
            cm31Var.b = new pn7(this.c, new gwy(), this.d);
            this.b.getClass();
            pn7 pn7Var = this.b.b;
            if (pn7Var != null) {
                VideoResolutionRestrictions videoResolutionRestrictions = this.e;
                this.a = 1;
                pn7Var.j = videoResolutionRestrictions;
                HandlerThread handlerThread = new HandlerThread("CameraBackground");
                handlerThread.start();
                pn7Var.m = new Handler(handlerThread.getLooper());
                pn7Var.l = handlerThread;
                pn7Var.k = Executors.newSingleThreadExecutor();
                pn7Var.c = new MediaRecorder();
                if (zy11Var == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return zy11Var;
    }
}
