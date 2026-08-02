package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording;

import defpackage.cm31;
import defpackage.ny61;
import defpackage.o4w;
import defpackage.tje;
import defpackage.wls;
import defpackage.yn31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.Negotiate;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;

/* loaded from: classes4.dex */
public final class b extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ yn31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yn31 yn31Var, Continuation continuation) {
        super(2, continuation);
        this.b = yn31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r7 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            cm31 cm31Var = this.b.F;
            this.a = 1;
            Object k0 = tje.k0(cm31Var.a.io(), new ru.rt.ebs.cryptosdk.common.video.e(cm31Var, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                o4w o4wVar = this.b.G;
                this.b.Z().emit(new Event.Process(new Negotiate((o4wVar != null ? o4wVar : null).c)));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        cm31 cm31Var2 = this.b.F;
        this.a = 2;
        Object k02 = tje.k0(cm31Var2.a.io(), new ru.rt.ebs.cryptosdk.common.video.a(cm31Var2, null), this);
        if (k02 != coroutineSingletons) {
            k02 = zy11Var;
        }
    }
}
