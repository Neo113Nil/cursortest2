package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class uk0 extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ tm0 n;
    public final /* synthetic */ uqn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk0(float f, float f2, tm0 tm0Var, uqn uqnVar, Continuation continuation) {
        super(2, continuation);
        this.l = f;
        this.m = f2;
        this.n = tm0Var;
        this.o = uqnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        uk0 uk0Var = new uk0(this.l, this.m, this.n, this.o, continuation);
        uk0Var.k = obj;
        return uk0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uk0) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        rwo rwoVar = (rwo) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            tk0 tk0Var = new tk0(0, this.o, rwoVar);
            this.k = null;
            this.j = 1;
            if (v5g.m(0.0f, this.l, this.m, this.n, tk0Var, this) == nm6Var) {
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
    }
}
