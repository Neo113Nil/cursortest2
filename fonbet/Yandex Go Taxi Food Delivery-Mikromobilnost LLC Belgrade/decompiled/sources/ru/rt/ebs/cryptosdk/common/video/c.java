package ru.rt.ebs.cryptosdk.common.video;

import android.hardware.camera2.CameraDevice;
import defpackage.bm31;
import defpackage.cm31;
import defpackage.ny61;
import defpackage.pn7;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ cm31 b;
    public final /* synthetic */ CameraType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cm31 cm31Var, CameraType cameraType, Continuation continuation) {
        super(2, continuation);
        this.b = cm31Var;
        this.c = cameraType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x003b, code lost:
    
        if (r6 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pn7 pn7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pn7 pn7Var2 = this.b.b;
            if (pn7Var2 != null) {
                this.a = 1;
                CameraDevice cameraDevice = pn7Var2.d;
                if (cameraDevice != null) {
                    cameraDevice.close();
                }
                pn7Var2.d = null;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                pn7Var = this.b.b;
                if (pn7Var != null) {
                    this.a = 4;
                    if (pn7Var.c(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        int i2 = bm31.a[this.c.ordinal()];
        if (i2 == 1) {
            pn7 pn7Var3 = this.b.b;
            if (pn7Var3 != null) {
                this.a = 2;
                Object b = pn7Var3.b(0, this);
                if (b != coroutineSingletons) {
                    b = zy11Var;
                }
            }
            pn7Var = this.b.b;
            if (pn7Var != null) {
            }
            return zy11Var;
        }
        if (i2 != 2) {
            w511.b();
            return null;
        }
        pn7 pn7Var4 = this.b.b;
        if (pn7Var4 != null) {
            this.a = 3;
            Object b2 = pn7Var4.b(1, this);
            if (b2 != coroutineSingletons) {
                b2 = zy11Var;
            }
        }
        pn7Var = this.b.b;
        if (pn7Var != null) {
        }
        return zy11Var;
    }
}
