package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o90 extends aur implements pyc {
    public uqn j;
    public int k;
    public /* synthetic */ ca0 l;
    public final /* synthetic */ p90 m;
    public final /* synthetic */ uqn n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(p90 p90Var, uqn uqnVar, float f, Continuation continuation) {
        super(3, continuation);
        this.m = p90Var;
        this.n = uqnVar;
        this.o = f;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uqn uqnVar = this.n;
        float f = this.o;
        o90 o90Var = new o90(this.m, uqnVar, f, (Continuation) obj3);
        o90Var.l = (ca0) obj;
        return o90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        uqn uqnVar;
        ca0 ca0Var = this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            p90 p90Var = this.m;
            n90 n90Var = new n90(0, p90Var, ca0Var);
            jic jicVar = p90Var.K;
            if (jicVar == null) {
                Intrinsics.j("resolvedFlingBehavior");
                throw null;
            }
            this.l = null;
            uqn uqnVar2 = this.n;
            this.j = uqnVar2;
            this.k = 1;
            obj = jicVar.a(n90Var, this.o, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            uqnVar = uqnVar2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uqnVar = this.j;
            qgg.h0(obj);
        }
        uqnVar.a = ((Number) obj).floatValue();
        return Unit.a;
    }
}
