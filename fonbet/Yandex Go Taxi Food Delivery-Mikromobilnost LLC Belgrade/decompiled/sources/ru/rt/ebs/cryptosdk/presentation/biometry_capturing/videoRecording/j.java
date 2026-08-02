package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording;

import defpackage.cm31;
import defpackage.il31;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.o4w;
import defpackage.tje;
import defpackage.vn31;
import defpackage.wls;
import defpackage.yn31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public final class j extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ yn31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yn31 yn31Var, Continuation continuation) {
        super(2, continuation);
        this.b = yn31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r15 != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r15.u0(r14) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
    
        if (r15.u0(r14) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object k0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            l8x l8xVar = (l8x) this.b.C.get("init_job");
            if (l8xVar != null) {
                this.a = 1;
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                yn31 yn31Var = this.b;
                o4w o4wVar = yn31Var.G;
                if (o4wVar == null) {
                    o4wVar = null;
                }
                o4wVar.f = 0;
                o4wVar.g = 0;
                o4wVar.h = 0L;
                vn31 vn31Var = (vn31) yn31Var.a0();
                o4w o4wVar2 = yn31Var.G;
                if (o4wVar2 == null) {
                    o4wVar2 = null;
                }
                vn31 a = vn31.a(vn31Var, new il31(o4wVar2.b), null, null, false, false, false, 0, false, 510);
                r0 r0Var = (r0) yn31Var.c0();
                r0Var.getClass();
                r0Var.m(null, a);
                return zy11Var;
            }
            kotlin.b.b(obj);
            yn31 yn31Var2 = this.b;
            cm31 cm31Var = yn31Var2.F;
            CameraType cameraType = ((vn31) yn31Var2.a0()).d;
            this.a = 3;
            k0 = tje.k0(cm31Var.a.main(), new ru.rt.ebs.cryptosdk.common.video.c(cm31Var, cameraType, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
        }
        l8x l8xVar2 = (l8x) this.b.C.get("handle_video_recording_interrupted");
        if (l8xVar2 != null) {
            this.a = 2;
        }
        yn31 yn31Var22 = this.b;
        cm31 cm31Var2 = yn31Var22.F;
        CameraType cameraType2 = ((vn31) yn31Var22.a0()).d;
        this.a = 3;
        k0 = tje.k0(cm31Var2.a.main(), new ru.rt.ebs.cryptosdk.common.video.c(cm31Var2, cameraType2, null), this);
        if (k0 != coroutineSingletons) {
        }
    }
}
