package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class khk extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ lhk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ khk(lhk lhkVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = lhkVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new khk(this.l, continuation, 0);
            default:
                return new khk(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((khk) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                lhk lhkVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    wrt wrtVar = (wrt) lhkVar.q.getValue();
                    this.k = 1;
                    wrtVar.getClass();
                    if (x97.V(dm6.b, new zts(wrtVar, null, 8), this) == nm6Var) {
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                lhkVar.H();
                j0q j0qVar = lhkVar.w;
                Unit unit = Unit.a;
                this.k = 2;
                if (j0qVar.emit(unit, this) == nm6Var) {
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                Continuation continuation = null;
                lhk lhkVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rdk rdkVar = lhkVar2.s;
                    if (rdkVar != null) {
                        v3n v3nVar = (v3n) rdkVar.D();
                        v3nVar.getClass();
                        v3n.c(v3nVar, r3n.h);
                    }
                    wrt wrtVar2 = (wrt) lhkVar2.q.getValue();
                    this.k = 1;
                    wrtVar2.getClass();
                    obj = x97.V(dm6.b, new zts(wrtVar2, continuation, 8), this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                bot botVar = (bot) obj;
                if (!(botVar instanceof znt)) {
                    if (!(botVar instanceof xnt)) {
                        b6e.s();
                        break;
                    } else {
                        iv8 iv8Var = (iv8) lhkVar2.u.getValue();
                        if (iv8Var != null) {
                            x97.y(ot0.F(lhkVar2), null, null, new rlg(lhkVar2, iv8Var, continuation, 22), 3);
                        }
                    }
                } else {
                    boolean z = ((znt) botVar).e;
                    v3w.n(z, lhkVar2.t, null);
                    if (z) {
                        rdk rdkVar2 = lhkVar2.s;
                        if (rdkVar2 != null) {
                            v3n v3nVar2 = (v3n) rdkVar2.D();
                            v3nVar2.getClass();
                            x97.y(v3nVar2.b, null, null, new c5l(v3nVar2, r3n.i, "The user is Kid and can't buy option", continuation, 18), 3);
                        }
                        break;
                    } else {
                        iv8 iv8Var2 = (iv8) lhkVar2.u.getValue();
                        if (iv8Var2 != null) {
                            x97.y(ot0.F(lhkVar2), null, null, new rlg(lhkVar2, iv8Var2, continuation, 22), 3);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
