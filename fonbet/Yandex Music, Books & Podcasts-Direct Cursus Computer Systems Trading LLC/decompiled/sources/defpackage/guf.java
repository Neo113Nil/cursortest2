package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class guf extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ awc l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ guf(awc awcVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = awcVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new guf(this.l, continuation, 0);
            default:
                return new guf(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((guf) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    vm0 vm0Var = (vm0) this.l.a;
                    Float f = new Float(0.0f);
                    b9r Q = weo.Q(0.0f, 400.0f, new Float(0.5f), 1);
                    this.k = 1;
                    if (v5g.s(vm0Var, f, Q, true, null, this, 8) == nm6Var) {
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
                    vm0 vm0Var2 = (vm0) this.l.a;
                    Float f2 = new Float(0.0f);
                    b9r Q2 = weo.Q(0.0f, 400.0f, new Float(0.5f), 1);
                    this.k = 1;
                    if (v5g.s(vm0Var2, f2, Q2, true, null, this, 8) == nm6Var2) {
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
