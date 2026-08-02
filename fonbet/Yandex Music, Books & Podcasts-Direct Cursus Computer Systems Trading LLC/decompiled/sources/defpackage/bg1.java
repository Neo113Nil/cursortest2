package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class bg1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dg1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bg1(dg1 dg1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = dg1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                bg1 bg1Var = new bg1(this.l, continuation, 0);
                bg1Var.k = obj;
                return bg1Var;
            default:
                bg1 bg1Var2 = new bg1(this.l, continuation, 1);
                bg1Var2.k = obj;
                return bg1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((bg1) create((wf1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((bg1) create((uf1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        dg1 dg1Var = this.l;
        switch (i) {
            case 0:
                xdr xdrVar = dg1Var.n;
                wf1 wf1Var = (wf1) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (wf1Var instanceof vf1) {
                    ig1 ig1Var = new ig1(true);
                    xdrVar.getClass();
                    xdrVar.m(null, ig1Var);
                } else if (wf1Var instanceof tf1) {
                    ig1 ig1Var2 = new ig1(false);
                    xdrVar.getClass();
                    xdrVar.m(null, ig1Var2);
                } else if (!(wf1Var instanceof uf1)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            default:
                uf1 uf1Var = (uf1) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar2 = dg1Var.n;
                lg1 lg1Var = (lg1) dg1Var.h.getValue();
                ikm ikmVar = uf1Var.b;
                boolean z = uf1Var.a;
                lg1Var.getClass();
                lt ltVar = ikmVar.b;
                jg1 jg1Var = new jg1(lg1Var.a.a(ltVar, ikmVar.c, true), z, c3x.w(ltVar, 0, 0));
                xdrVar2.getClass();
                xdrVar2.m(null, jg1Var);
                return Unit.a;
        }
    }
}
