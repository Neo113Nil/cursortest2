package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mn4 extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ pqm l;
    public /* synthetic */ long m;
    public final /* synthetic */ s5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn4(s5 s5Var, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = s5Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pqm pqmVar = (pqm) obj;
        enj enjVar = (enj) obj2;
        switch (this.j) {
            case 0:
                long j = enjVar.a;
                mn4 mn4Var = new mn4((nn4) this.n, (Continuation) obj3, 0);
                mn4Var.l = pqmVar;
                mn4Var.m = j;
                return mn4Var.invokeSuspend(Unit.a);
            default:
                long j2 = enjVar.a;
                mn4 mn4Var2 = new mn4((gb5) this.n, (Continuation) obj3, 1);
                mn4Var2.l = pqmVar;
                mn4Var2.m = j2;
                return mn4Var2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.j) {
            case 0:
                Object obj4 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    pqm pqmVar = this.l;
                    long j = this.m;
                    nn4 nn4Var = (nn4) this.n;
                    if (nn4Var.u) {
                        this.k = 1;
                        uoi uoiVar = nn4Var.q;
                        if (uoiVar == null || (obj2 = gld.Q(new o5(pqmVar, j, uoiVar, nn4Var, null), this)) != obj4) {
                            obj2 = Unit.a;
                        }
                        if (obj2 == obj4) {
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
                Object obj5 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    pqm pqmVar2 = this.l;
                    long j2 = this.m;
                    gb5 gb5Var = (gb5) this.n;
                    if (gb5Var.u) {
                        this.k = 1;
                        uoi uoiVar2 = gb5Var.q;
                        if (uoiVar2 == null || (obj3 = gld.Q(new o5(pqmVar2, j2, uoiVar2, gb5Var, null), this)) != obj5) {
                            obj3 = Unit.a;
                        }
                        if (obj3 == obj5) {
                        }
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
