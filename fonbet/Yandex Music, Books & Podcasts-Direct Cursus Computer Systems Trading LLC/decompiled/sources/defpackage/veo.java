package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class veo extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ veo(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                veo veoVar = new veo(this.m, continuation, 0);
                veoVar.l = obj;
                return veoVar;
            default:
                veo veoVar2 = new veo(this.m, continuation, 1);
                veoVar2.l = obj;
                return veoVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((veo) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((veo) create((pfm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Function1 function1 = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (((mm6) this.l).getCoroutineContext().get(m6t.b) != null) {
                        this.k = 1;
                        Object invoke = function1.invoke(this);
                        return invoke == nm6Var ? nm6Var : invoke;
                    }
                    xq0.q("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                pfm pfmVar = (pfm) this.l;
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    uqn uqnVar = new uqn();
                    iur iurVar = (iur) pfmVar;
                    float density = iurVar.getDensity() * gvr.a;
                    kzp kzpVar = new kzp(28, uqnVar);
                    fvr fvrVar = new fvr(density, 0, uqnVar, function1);
                    eyq eyqVar = new eyq(19, uqnVar);
                    f5r f5rVar = new f5r(5, uqnVar);
                    this.l = null;
                    this.k = 1;
                    float f = wna.a;
                    Object v = xee.v(iurVar, new qna(kzpVar, f5rVar, fvrVar, eyqVar, (Continuation) null), this);
                    if (v != obj2) {
                        v = Unit.a;
                    }
                    if (v == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
