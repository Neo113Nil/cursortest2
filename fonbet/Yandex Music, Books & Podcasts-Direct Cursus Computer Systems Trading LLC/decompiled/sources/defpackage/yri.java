package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class yri extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ zri n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yri(Continuation continuation, zri zriVar, int i) {
        super(3, continuation);
        this.j = i;
        this.n = zriVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                yri yriVar = new yri(continuation, this.n, 0);
                yriVar.l = rjcVar;
                yriVar.m = obj2;
                return yriVar.invokeSuspend(Unit.a);
            default:
                yri yriVar2 = new yri(continuation, this.n, 1);
                yriVar2.l = rjcVar;
                yriVar2.m = obj2;
                return yriVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc M0;
        pjc f9lVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    Continuation continuation = null;
                    if (((Boolean) this.m).booleanValue()) {
                        M0 = new fs(15, adj.a);
                    } else {
                        zri zriVar = this.n;
                        M0 = zsd.M0(new bca(zriVar.f, 18), new yri(continuation, zriVar, 1));
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, M0, this) == nm6Var) {
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
                    pbj pbjVar = (pbj) this.m;
                    yks yksVar = this.n.d;
                    yksVar.getClass();
                    fdj fdjVar = (fdj) yksVar.b;
                    pbjVar.getClass();
                    if (!pbjVar.equals(nbj.a)) {
                        if (!(pbjVar instanceof lbj)) {
                            if (!(pbjVar instanceof obj)) {
                                if (!(pbjVar instanceof mbj)) {
                                    b6e.s();
                                    break;
                                } else {
                                    mbj mbjVar = (mbj) pbjVar;
                                    mqs mqsVar = mbjVar.b;
                                    if (mbjVar.a instanceof xc5) {
                                        k10 k10Var = mqsVar.d;
                                        k10Var.getClass();
                                        if (u2x.z(m20.AudioBook, k10Var.b)) {
                                            f9lVar = new u21(20, zsd.b0(new cla(y1g.L(((oq7) yksVar.d).a), 8)), mbjVar, yksVar);
                                        }
                                    }
                                    f9lVar = new f9l(15, fdjVar.j(mqsVar));
                                }
                            } else {
                                f9lVar = new f9l(15, fdjVar.j(((obj) pbjVar).b));
                            }
                        } else {
                            lbj lbjVar = (lbj) pbjVar;
                            oq oqVar = lbjVar.a;
                            oqVar.getClass();
                            if (u2x.H(oqVar)) {
                                f9lVar = new fs(15, weo.K(oqVar, false));
                            } else {
                                mqs mqsVar2 = lbjVar.b;
                                if (mqsVar2 != null) {
                                    f9lVar = new f9l(15, fdjVar.j(mqsVar2));
                                } else {
                                    f9lVar = new fs(15, new zcj(""));
                                }
                            }
                        }
                    } else {
                        f9lVar = new fs(15, new zcj(""));
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, f9lVar, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
