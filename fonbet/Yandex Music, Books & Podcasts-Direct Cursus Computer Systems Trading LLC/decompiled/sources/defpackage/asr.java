package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class asr extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ bsr n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ asr(int i, bsr bsrVar, Continuation continuation) {
        super(3, continuation);
        this.j = i;
        this.n = bsrVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                asr asrVar = new asr(0, this.n, continuation);
                asrVar.l = rjcVar;
                asrVar.m = obj2;
                return asrVar.invokeSuspend(Unit.a);
            default:
                asr asrVar2 = new asr(1, this.n, continuation);
                asrVar2.l = rjcVar;
                asrVar2.m = obj2;
                return asrVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc clcVar;
        int i = this.j;
        bsr bsrVar = this.n;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    vdr c = ((z66) bsrVar.c.getValue()).c();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, c, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    Continuation continuation = null;
                    if (((x66) this.m).a) {
                        pjc t = bsrVar.d().b().t();
                        msa msaVar = nsa.b;
                        long M = yd5.M(30, ssa.SECONDS);
                        t.getClass();
                        long f = nsa.f(M);
                        if (f < 0) {
                            xq0.x("Timeout should not be negative");
                            return null;
                        }
                        clcVar = new clc(new eno(new gkc(t, f, continuation, 1)), new zrr(4, 0, continuation));
                    } else {
                        clcVar = z4b.a;
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, clcVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
