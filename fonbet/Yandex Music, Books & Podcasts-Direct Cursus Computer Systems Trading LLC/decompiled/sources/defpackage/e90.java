package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e90 extends aur implements ryc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ float m;
    public /* synthetic */ Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e90(Object obj, float f, Continuation continuation, int i) {
        super(4, continuation);
        this.j = i;
        this.p = obj;
        this.m = f;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.j) {
            case 0:
                e90 e90Var = new e90((ia0) this.p, this.m, (Continuation) obj4, 0);
                e90Var.n = (ba0) obj;
                e90Var.o = (i9h) obj2;
                e90Var.l = obj3;
                return e90Var.invokeSuspend(Unit.a);
            default:
                e90 e90Var2 = new e90((ka0) this.p, this.m, (Continuation) obj4, 1);
                e90Var2.n = (da0) obj;
                e90Var2.o = (j9h) obj2;
                e90Var2.l = obj3;
                return e90Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                ia0 ia0Var = (ia0) this.p;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ba0 ba0Var = (ba0) this.n;
                    float c = ((i9h) this.o).c(this.l);
                    if (!Float.isNaN(c)) {
                        uqn uqnVar = new uqn();
                        float e = Float.isNaN(((t6k) ia0Var.l).e()) ? 0.0f : ((t6k) ia0Var.l).e();
                        uqnVar.a = e;
                        tm0 tm0Var = (tm0) ia0Var.c;
                        s30 s30Var = new s30(1, ba0Var, uqnVar);
                        this.n = null;
                        this.o = null;
                        this.k = 1;
                        if (v5g.m(e, c, this.m, tm0Var, s30Var, this) == nm6Var) {
                        }
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                ka0 ka0Var = (ka0) this.p;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    da0 da0Var = (da0) this.n;
                    float c2 = ((j9h) this.o).c(this.l);
                    if (!Float.isNaN(c2)) {
                        uqn uqnVar2 = new uqn();
                        float e2 = Float.isNaN(ka0Var.j.e()) ? 0.0f : ka0Var.j.e();
                        uqnVar2.a = e2;
                        tm0 tm0Var2 = ka0Var.c;
                        s30 s30Var2 = new s30(2, da0Var, uqnVar2);
                        this.n = null;
                        this.o = null;
                        this.k = 1;
                        if (v5g.m(e2, c2, this.m, tm0Var2, s30Var2, this) == nm6Var2) {
                        }
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
