package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class guq extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guq(float f, float f2, float f3, Continuation continuation) {
        super(2, continuation);
        this.l = f;
        this.m = f2;
        this.n = f3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        guq guqVar = new guq(this.l, this.m, this.n, continuation);
        guqVar.k = obj;
        return guqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((guq) create((fa0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        fa0 fa0Var = (fa0) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            uqn uqnVar = new uqn();
            float f = this.l;
            uqnVar.a = f;
            fk0 a = vq2.a(f);
            Float f2 = new Float(this.m);
            act actVar = kuq.c;
            Float f3 = new Float(this.n);
            xum xumVar = new xum(24, fa0Var, uqnVar);
            this.k = null;
            this.j = 1;
            if (a.b(f2, actVar, f3, xumVar, this) == nm6Var) {
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
