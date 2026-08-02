package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class nkc extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vdr m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nkc(vdr vdrVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = vdrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                nkc nkcVar = new nkc(this.m, continuation, 0);
                nkcVar.l = obj;
                return nkcVar;
            default:
                nkc nkcVar2 = new nkc(this.m, continuation, 1);
                nkcVar2.l = obj;
                return nkcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((nkc) create(rjcVar, continuation)).invokeSuspend(Unit.a);
                break;
            default:
                ((nkc) create(rjcVar, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return nm6.a;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    xqn i2 = hrg.i(obj);
                    vdr vdrVar = this.m;
                    i2.a = vdrVar.getValue();
                    u3 u3Var = new u3(rjcVar, i2, 4);
                    this.l = null;
                    this.k = 1;
                    if (vdrVar.collect(u3Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            default:
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    tqn tqnVar = new tqn();
                    vdr vdrVar2 = this.m;
                    tqnVar.a = vdrVar2.getValue() == aal.c;
                    tal talVar = new tal(tqnVar, rjcVar2, 0);
                    this.l = null;
                    this.k = 1;
                    if (vdrVar2.collect(talVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
        }
    }
}
