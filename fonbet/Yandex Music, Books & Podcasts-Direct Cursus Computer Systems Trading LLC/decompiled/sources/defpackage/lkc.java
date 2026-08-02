package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class lkc extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pjc m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkc(pjc pjcVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.m = pjcVar;
        this.n = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                lkc lkcVar = new lkc(this.n, this.m, continuation);
                lkcVar.l = obj;
                return lkcVar;
            default:
                lkc lkcVar2 = new lkc(this.m, this.n, continuation);
                lkcVar2.l = obj;
                return lkcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((lkc) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        tqn tqnVar;
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    xqn i2 = hrg.i(obj);
                    i2.a = this.n;
                    u3 u3Var = new u3(rjcVar, i2, 3);
                    this.l = null;
                    this.k = 1;
                    if (this.m.collect(u3Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                Object obj2 = this.n;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.l;
                    tqn tqnVar2 = new tqn();
                    tl0 tl0Var = new tl0(22, tqnVar2, rjcVar2, obj2);
                    this.l = tqnVar2;
                    this.k = 1;
                    if (this.m.collect(tl0Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                    tqnVar = tqnVar2;
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tqnVar = (tqn) this.l;
                    qgg.h0(obj);
                }
                if (tqnVar.a) {
                    return Unit.a;
                }
                throw new tgr(sgr.n.i("Expected one request for " + obj2 + " but received none"), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkc(Object obj, pjc pjcVar, Continuation continuation) {
        super(2, continuation);
        this.n = obj;
        this.m = pjcVar;
    }
}
