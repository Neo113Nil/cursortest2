package yads;

import defpackage.dj81;
import defpackage.fe81;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class qm extends SuspendLambda implements wls {
    public fe81 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dj81 e;
    public final /* synthetic */ yo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(dj81 dj81Var, yo yoVar, Continuation continuation) {
        super(2, continuation);
        this.e = dj81Var;
        this.f = yoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        qm qmVar = new qm(this.e, this.f, continuation);
        qmVar.d = obj;
        return qmVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((qm) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        fe81 fe81Var;
        fe81 fe81Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.d;
            qoh h = tje.h(tseVar, null, null, new pm(this.e, this.f, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new om(this.e, this.f, null), 3);
            fe81 fe81Var3 = this.e.c;
            this.d = h;
            this.b = fe81Var3;
            this.c = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h;
                fe81Var = fe81Var3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fe81Var2 = (fe81) this.d;
            b.b(obj);
            fe81Var2.i = (String) obj;
            return zy11.a;
        }
        fe81Var = this.b;
        nohVar = (noh) this.d;
        b.b(obj);
        fe81Var.h = (String) obj;
        fe81 fe81Var4 = this.e.c;
        this.d = fe81Var4;
        this.b = null;
        this.c = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            obj = k;
            fe81Var2 = fe81Var4;
            fe81Var2.i = (String) obj;
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
