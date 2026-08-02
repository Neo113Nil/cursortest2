package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class h04 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public rjc k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ j04 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h04(j04 j04Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = j04Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                h04 h04Var = new h04(this.n, continuation, 0);
                h04Var.m = obj;
                return h04Var;
            default:
                h04 h04Var2 = new h04(this.n, continuation, 1);
                h04Var2.m = obj;
                return h04Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h04) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    dp1 dp1Var = this.n.b;
                    this.m = null;
                    this.k = rjcVar;
                    this.l = 1;
                    obj = dp1Var.a(this);
                    if (obj == nm6Var) {
                    }
                } else if (i == 1) {
                    rjcVar = this.k;
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                this.m = null;
                this.k = null;
                this.l = 2;
                if (rjcVar.emit(obj, this) == nm6Var) {
                }
                break;
            default:
                rjc rjcVar2 = (rjc) this.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    dp1 dp1Var2 = this.n.b;
                    this.m = null;
                    this.k = rjcVar2;
                    this.l = 1;
                    obj = dp1Var2.a(this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 == 1) {
                    rjcVar2 = this.k;
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                this.m = null;
                this.k = null;
                this.l = 2;
                if (rjcVar2.emit(obj, this) == nm6Var2) {
                }
                break;
        }
        return Unit.a;
    }
}
