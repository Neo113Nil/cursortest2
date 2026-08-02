package yads;

import defpackage.ay71;
import defpackage.dm71;
import defpackage.el61;
import defpackage.hu81;
import defpackage.k181;
import defpackage.ny61;
import defpackage.q971;
import defpackage.sg81;
import defpackage.tje;
import defpackage.vo71;
import defpackage.w511;
import defpackage.wg61;
import defpackage.wls;
import defpackage.yr71;
import defpackage.yw81;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class da1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ q971 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da1(q971 q971Var, Continuation continuation) {
        super(2, continuation);
        this.c = q971Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new da1(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new da1(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ay71 ay71Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            sg81 sg81Var = this.c.b;
            this.b = 1;
            k181 k181Var = sg81Var.a;
            obj = tje.k0(k181Var.f, new o80(k181Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        el61 el61Var = (el61) obj;
        if (el61Var instanceof wg61) {
            ay71Var = new yr71(((wg61) el61Var).a);
        } else if (el61Var instanceof hu81) {
            ay71Var = new vo71(((hu81) el61Var).a);
        } else {
            if (!(el61Var instanceof yw81)) {
                w511.b();
                return null;
            }
            ay71Var = dm71.a;
        }
        q971 q971Var = this.c;
        tje.N(q971Var.a, null, null, new ca1(q971Var, ay71Var, null), 3);
        return zy11.a;
    }
}
