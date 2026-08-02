package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class y9n extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dan l;
    public final /* synthetic */ se5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9n(dan danVar, se5 se5Var, Continuation continuation) {
        super(2, continuation);
        this.l = danVar;
        this.m = se5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        y9n y9nVar = new y9n(this.l, this.m, continuation);
        y9nVar.k = obj;
        return y9nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y9n) create((v9n) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        v9n v9nVar = (v9n) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        this.k = null;
        this.j = 1;
        Object a = this.l.a(this.m, v9nVar, this);
        return a == nm6Var ? nm6Var : a;
    }
}
