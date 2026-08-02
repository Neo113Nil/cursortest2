package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xmw extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ anw n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmw(Continuation continuation, anw anwVar, int i) {
        super(3, continuation);
        this.j = i;
        this.n = anwVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                xmw xmwVar = new xmw(continuation, this.n, 0);
                xmwVar.l = rjcVar;
                xmwVar.m = obj2;
                return xmwVar.invokeSuspend(Unit.a);
            default:
                xmw xmwVar2 = new xmw(continuation, this.n, 1);
                xmwVar2.l = rjcVar;
                xmwVar2.m = obj2;
                return xmwVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        pjc pjcVar = z4b.a;
        anw anwVar = this.n;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    sqw sqwVar = (sqw) this.m;
                    e7v e7vVar = new e7v(anwVar.j.a, 26);
                    if (sqwVar != null) {
                        pjcVar = new xo2(zsd.s0(anwVar.i.d, new rhw(anwVar, continuation, 4)), 9);
                    }
                    tc4 u0 = zsd.u0(pjcVar, e7vVar, zsd.C(zsd.M0(anwVar.e.b(sqwVar), new xmw(continuation, anwVar, i2)), 0));
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, u0, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    vkw vkwVar = (vkw) this.m;
                    ssg.a(3, anw.l, "selector changed: ".concat(v5g.E(vkwVar)), null);
                    if (!vkwVar.equals(ukw.b)) {
                        if (vkwVar instanceof rkw) {
                            pjcVar = anw.a(anwVar, ((rkw) vkwVar).b);
                        } else if (vkwVar instanceof skw) {
                            pjcVar = anw.a(anwVar, ((skw) vkwVar).b);
                        } else {
                            if (!(vkwVar instanceof tkw)) {
                                b6e.s();
                                return null;
                            }
                            pqw pqwVar = ((tkw) vkwVar).b;
                            mlw mlwVar = anwVar.g;
                            pjcVar = zsd.u0(new l8v(mlwVar.f, anwVar, 17), new u21(24, mlwVar.d, anwVar, pqwVar));
                        }
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, pjcVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
