package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c1n extends aur implements Function1 {
    public int j;
    public final /* synthetic */ d1n k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1n(d1n d1nVar, float f, Continuation continuation) {
        super(1, continuation);
        this.k = d1nVar;
        this.l = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new c1n(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c1n) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            d1n d1nVar = this.k;
            float e = d1nVar.e.e();
            y5 y5Var = new y5(24, d1nVar);
            this.j = 1;
            if (v5g.p(e, this.l, null, y5Var, this, 12) == nm6Var) {
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
