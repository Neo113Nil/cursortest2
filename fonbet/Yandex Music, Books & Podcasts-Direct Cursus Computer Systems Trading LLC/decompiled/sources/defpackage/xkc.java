package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class xkc extends aur implements pyc {
    public xqn j;
    public qln k;
    public int l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ long o;
    public final /* synthetic */ x0q p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkc(long j, x0q x0qVar, Continuation continuation) {
        super(3, continuation);
        this.o = j;
        this.p = x0qVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xkc xkcVar = new xkc(this.o, this.p, (Continuation) obj3);
        xkcVar.m = (mm6) obj;
        xkcVar.n = (rjc) obj2;
        return xkcVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        qln qlnVar;
        xqn xqnVar;
        rjc rjcVar;
        qln M;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            mm6 mm6Var = (mm6) this.m;
            rjc rjcVar2 = (rjc) this.n;
            ktm M2 = y7g.M(mm6Var, -1, new wkc(this.p, null), 1);
            xqn xqnVar2 = new xqn();
            qlnVar = M2;
            xqnVar = xqnVar2;
            rjcVar = rjcVar2;
            M = y7g.M(mm6Var, 0, new fv0(this.o, continuation, 1), 1);
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            M = this.k;
            xqnVar = this.j;
            qlnVar = (qln) this.n;
            rjcVar = (rjc) this.m;
            qgg.h0(obj);
        }
        while (xqnVar.a != ugj.c) {
            acp acpVar = new acp(getContext());
            acpVar.g(qlnVar.i(), new n71(xqnVar, M, continuation, 12));
            acpVar.g(M.f(), new fzb(xqnVar, rjcVar, continuation, 11));
            this.m = rjcVar;
            this.n = qlnVar;
            this.j = xqnVar;
            this.k = M;
            this.l = 1;
            if (acpVar.d(this) == nm6Var) {
                return nm6Var;
            }
        }
        return Unit.a;
    }
}
