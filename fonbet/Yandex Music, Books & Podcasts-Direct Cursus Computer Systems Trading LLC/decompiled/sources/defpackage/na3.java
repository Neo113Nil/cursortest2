package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class na3 extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ dn9 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na3(Continuation continuation, dn9 dn9Var, int i) {
        super(3, continuation);
        this.j = i;
        this.n = dn9Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                na3 na3Var = new na3(continuation, this.n, 0);
                na3Var.l = rjcVar;
                na3Var.m = obj2;
                return na3Var.invokeSuspend(Unit.a);
            default:
                na3 na3Var2 = new na3(continuation, this.n, 1);
                na3Var2.l = rjcVar;
                na3Var2.m = obj2;
                return na3Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc u21Var;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    mqs mqsVar = (mqs) this.m;
                    pjc d = ((yzk) this.n.b).d();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar);
                    Object collect = d.collect(new g62(new ta3(rjcVar, mqsVar, 0), 21), this);
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    oq oqVar = (oq) this.m;
                    Continuation continuation = null;
                    if (oqVar.F.isEmpty()) {
                        u21Var = new fs(15, qb3.a);
                    } else if (u2x.H(oqVar)) {
                        dn9 dn9Var = this.n;
                        u21Var = new u21(6, zsd.M0(zsd.b0(new u21(5, zsd.X(zsd.b0(new ez(((oq7) dn9Var.d).a.c, 22)), 100L), dn9Var, oqVar)), new na3(continuation, dn9Var, 0)), dn9Var, oqVar);
                    } else {
                        u21Var = new fs(15, qb3.b);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, u21Var, this) == nm6Var2) {
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
