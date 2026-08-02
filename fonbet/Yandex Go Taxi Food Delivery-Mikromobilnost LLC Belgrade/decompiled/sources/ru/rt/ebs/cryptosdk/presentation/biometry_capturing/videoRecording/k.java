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
import ru.rt.ebs.cryptosdk.common.video.d;

/* loaded from: classes4.dex */
public final class k extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ yn31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yn31 yn31Var, Continuation continuation) {
        super(2, continuation);
        this.b = yn31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            cm31 cm31Var = this.b.F;
            this.a = 1;
            Object k0 = tje.k0(cm31Var.a.io(), new d(cm31Var, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.b.h0();
        return zy11Var;
    }
}
