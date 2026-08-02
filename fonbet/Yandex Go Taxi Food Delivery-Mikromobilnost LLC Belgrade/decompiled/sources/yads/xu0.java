package yads;

import defpackage.aw81;
import defpackage.lm71;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yz71;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class xu0 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ aw81 d;
    public final /* synthetic */ zu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(byte[] bArr, aw81 aw81Var, zu0 zu0Var, Continuation continuation) {
        super(2, continuation);
        this.c = bArr;
        this.d = aw81Var;
        this.e = zu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xu0(this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((xu0) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            byte[] bArr = this.c;
            if (bArr == null) {
                return null;
            }
            lm71 lm71Var = this.d.b;
            zu0 zu0Var = this.e;
            this.b = 1;
            yz71 yz71Var = (yz71) lm71Var.b;
            yz71Var.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new nu0(yz71Var, zu0Var, bArr, null), this);
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
            b.b(obj);
        }
        return zy11Var;
    }
}
