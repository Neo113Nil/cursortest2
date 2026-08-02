package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e2n extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ j2n n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2n(Continuation continuation, j2n j2nVar, int i) {
        super(3, continuation);
        this.j = i;
        this.n = j2nVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                e2n e2nVar = new e2n(continuation, this.n, 0);
                e2nVar.l = rjcVar;
                e2nVar.m = obj2;
                return e2nVar.invokeSuspend(Unit.a);
            default:
                e2n e2nVar2 = new e2n(continuation, this.n, 1);
                e2nVar2.l = rjcVar;
                e2nVar2.m = obj2;
                return e2nVar2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pjc pjcVar;
        gow gowVar;
        h0m h0mVar;
        pjc pjcVar2;
        int i = 21;
        int i2 = 3;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    x74 x74Var = (x74) this.m;
                    j2n j2nVar = this.n;
                    s9f[] s9fVarArr = j2n.D;
                    l18 l18Var = l18.b;
                    arf a = btf.a(bwf.c, new p1n(0));
                    if (!(x74Var instanceof s74)) {
                        if (!(x74Var instanceof r74)) {
                            if (!(x74Var instanceof t74)) {
                                if (!(x74Var instanceof w74)) {
                                    b6e.s();
                                    break;
                                } else {
                                    bdt I = hag.I(byb.class);
                                    qdc qdcVar = l18Var.a;
                                    qdcVar.getClass();
                                    if (((Boolean) ((qgw) ((byb) qdcVar.C(I)).c(ern.a(qgw.class))).e.getValue()).booleanValue()) {
                                        how b = j2nVar.i().b();
                                        if (Intrinsics.d((b == null || (gowVar = b.c) == null) ? null : gowVar.a, ((w74) x74Var).c)) {
                                            pjcVar = (pjc) a.getValue();
                                        } else {
                                            diw b2 = ((wlw) j2nVar.i().c.getValue()).b();
                                            bdt I2 = hag.I(jsw.class);
                                            qdc qdcVar2 = b2.a;
                                            qdcVar2.getClass();
                                            pjcVar = new vpw(((jsw) qdcVar2.C(I2)).e, 9);
                                        }
                                    } else {
                                        pjcVar = (pjc) a.getValue();
                                    }
                                }
                            } else {
                                pjcVar = new u21(10, j2nVar.h().n, j2nVar.h().o, new t81(i2, i, continuation));
                            }
                        } else {
                            pjcVar = new h0m(j2nVar.g().a(), 12);
                        }
                    } else {
                        bdt I3 = hag.I(byb.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        if (((Boolean) ((qgw) ((byb) qdcVar3.C(I3)).c(ern.a(qgw.class))).e.getValue()).booleanValue()) {
                            how b3 = j2nVar.i().b();
                            if (b3 == null || b3.d.g) {
                                pjcVar = (pjc) a.getValue();
                            } else {
                                diw b4 = ((wlw) j2nVar.i().c.getValue()).b();
                                bdt I4 = hag.I(jsw.class);
                                qdc qdcVar4 = b4.a;
                                qdcVar4.getClass();
                                pjcVar = new vpw(((jsw) qdcVar4.C(I4)).e, 9);
                            }
                        } else {
                            pjcVar = (pjc) a.getValue();
                        }
                    }
                    pjc b0 = zsd.b0(pjcVar);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar);
                    Object collect = b0.collect(new tek(15, rjcVar, x74Var), this);
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    h74 h74Var = (h74) this.m;
                    j2n j2nVar2 = this.n;
                    s9f[] s9fVarArr2 = j2n.D;
                    int ordinal = h74Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            int i5 = 2;
                            if (ordinal == 2) {
                                h0mVar = new h0m(j2nVar2.i().d(), 14);
                            } else if (ordinal != 3) {
                                b6e.s();
                                break;
                            } else {
                                pjcVar2 = new eno(new jud(i5, 19, continuation));
                            }
                        } else {
                            dk4 g = j2nVar2.g();
                            pjcVar2 = new em(new u21(10, g.a(), new bca(new cz(g.c, g, i), 18), ck4.a), 6);
                        }
                        this.l = null;
                        this.m = null;
                        this.k = 1;
                        if (zsd.e0(rjcVar2, pjcVar2, this) == nm6Var2) {
                            break;
                        }
                    } else {
                        h0mVar = new h0m(j2nVar2.h().m, 13);
                    }
                    pjcVar2 = h0mVar;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, pjcVar2, this) == nm6Var2) {
                    }
                } else if (i4 != 1) {
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
