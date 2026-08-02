package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class hv5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fp7 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ fuw n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv5(fp7 fp7Var, int i, fuw fuwVar, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.l = fp7Var;
        this.m = i;
        this.n = fuwVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new hv5(this.l, this.m, this.n, continuation, 0);
            default:
                return new hv5(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((hv5) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        fuw fuwVar;
        fuw fuwVar2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    if (this.l.q() != this.m && (fuwVar = this.n) != null) {
                        this.k = 1;
                        obj = gld.Q(new euw(fuwVar, null, 2), this);
                        if (obj == nm6Var) {
                        }
                    }
                    break;
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
                    if (this.l.q() != this.m && (fuwVar2 = this.n) != null) {
                        this.k = 1;
                        obj = gld.Q(new euw(fuwVar2, null, 2), this);
                        if (obj == nm6Var2) {
                        }
                    }
                    break;
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
