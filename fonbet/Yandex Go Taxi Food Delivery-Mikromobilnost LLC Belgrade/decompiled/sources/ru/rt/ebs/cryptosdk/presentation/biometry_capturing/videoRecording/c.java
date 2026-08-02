package ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording;

import defpackage.cm31;
import defpackage.ny61;
import defpackage.tje;
import defpackage.wls;
import defpackage.yn31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yn31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, yn31 yn31Var, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = yn31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r7 == r0) goto L23;
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
            if (this.b) {
                cm31 cm31Var = this.c.F;
                this.a = 1;
                Object k0 = tje.k0(cm31Var.a.io(), new ru.rt.ebs.cryptosdk.common.video.e(cm31Var, null), this);
                if (k0 != coroutineSingletons) {
                    k0 = zy11Var;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        cm31 cm31Var2 = this.c.F;
        this.a = 2;
        Object k02 = tje.k0(cm31Var2.a.io(), new ru.rt.ebs.cryptosdk.common.video.a(cm31Var2, null), this);
        if (k02 != coroutineSingletons) {
            k02 = zy11Var;
        }
        return k02 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
