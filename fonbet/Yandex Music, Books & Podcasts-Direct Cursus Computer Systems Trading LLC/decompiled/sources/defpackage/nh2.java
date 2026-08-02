package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class nh2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pjc m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh2(pjc pjcVar, Continuation continuation, int i, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = pjcVar;
        this.n = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                nh2 nh2Var = new nh2(this.m, continuation, this.n, 0);
                nh2Var.l = obj;
                return nh2Var;
            default:
                nh2 nh2Var2 = new nh2(this.m, continuation, this.n, 1);
                nh2Var2.l = obj;
                return nh2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nh2) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    mh2 mh2Var = new mh2((rjc) this.l, this.n, 0);
                    this.l = null;
                    this.k = 1;
                    if (this.m.collect(mh2Var, this) == nm6Var) {
                    }
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
                    mh2 mh2Var2 = new mh2((rjc) this.l, this.n, 1);
                    this.l = null;
                    this.k = 1;
                    if (this.m.collect(mh2Var2, this) == nm6Var2) {
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
