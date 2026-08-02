package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nz6 extends aur implements Function2 {
    public final /* synthetic */ int j = 2;
    public int k;
    public Object l;
    public boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz6(ueo ueoVar, boolean z, boolean z2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.l = ueoVar;
        this.m = z;
        this.n = z2;
        this.o = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nz6((ueo) this.l, this.m, this.n, (Function1) this.o, continuation);
            case 1:
                return new nz6(continuation, (ueo) this.l, this.m, this.n, (Function1) this.o);
            default:
                return new nz6((hyp) this.o, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nz6) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        rk rkVar;
        boolean z;
        switch (this.j) {
            case 0:
                ueo ueoVar = (ueo) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                boolean z2 = !(ueoVar.o() && ueoVar.p()) && this.m;
                ueo ueoVar2 = (ueo) this.l;
                boolean z3 = this.n;
                mz6 mz6Var = new mz6(z2, z3, ueoVar2, null, (Function1) this.o, 0);
                this.k = 1;
                Object u = ueoVar2.u(z3, mz6Var, this);
                return u == nm6Var ? nm6Var : u;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ueo ueoVar3 = (ueo) this.l;
                boolean z4 = this.m;
                mz6 mz6Var2 = new mz6(this.n, z4, ueoVar3, null, (Function1) this.o, 1);
                this.k = 1;
                Object u2 = ueoVar3.u(z4, mz6Var2, this);
                return u2 == nm6Var2 ? nm6Var2 : u2;
            default:
                hyp hypVar = (hyp) this.o;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                Continuation continuation = null;
                if (i3 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = hypVar.d;
                    boolean z5 = this.n;
                    v3w.n(z5, xdrVar, null);
                    rk rkVar2 = hypVar.b;
                    pjc g = hypVar.a.g();
                    this.l = rkVar2;
                    this.m = z5;
                    this.k = 1;
                    Object g0 = zsd.g0(g, this);
                    if (g0 == nm6Var3) {
                        return nm6Var3;
                    }
                    rkVar = rkVar2;
                    obj = g0;
                    z = z5;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z6 = this.m;
                    rk rkVar3 = (rk) this.l;
                    qgg.h0(obj);
                    z = z6;
                    rkVar = rkVar3;
                }
                this.l = null;
                this.k = 2;
                rkVar.getClass();
                Object V = x97.V(dm6.b, new qk(rkVar, (xxq) obj, z, continuation, 0), this);
                if (V != nm6Var3) {
                    V = Unit.a;
                }
                if (V == nm6Var3) {
                    return nm6Var3;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz6(hyp hypVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = hypVar;
        this.n = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz6(Continuation continuation, ueo ueoVar, boolean z, boolean z2, Function1 function1) {
        super(2, continuation);
        this.l = ueoVar;
        this.m = z;
        this.n = z2;
        this.o = function1;
    }
}
