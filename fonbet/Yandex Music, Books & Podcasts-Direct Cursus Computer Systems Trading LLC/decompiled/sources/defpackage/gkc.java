package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class gkc extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pjc m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkc(pjc pjcVar, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pjcVar;
        this.n = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                gkc gkcVar = new gkc(this.m, this.n, continuation, 0);
                gkcVar.l = obj;
                return gkcVar;
            default:
                gkc gkcVar2 = new gkc(this.m, this.n, continuation, 1);
                gkcVar2.l = obj;
                return gkcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((gkc) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    int i2 = 0;
                    fkc fkcVar = new fkc(i2, this.n, new wqn(), rjcVar);
                    this.l = null;
                    this.k = 1;
                    if (this.m.collect(fkcVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    jkc jkcVar = new jkc(this.m, this.n, rjcVar2, null);
                    this.l = null;
                    this.k = 1;
                    if (gld.Q(jkcVar, this) == nm6Var2) {
                    }
                } else if (i3 != 1) {
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
