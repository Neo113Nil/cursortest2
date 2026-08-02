package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class y4l extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ z4l m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4l(z4l z4lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = z4lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                y4l y4lVar = new y4l(this.m, continuation, 0);
                y4lVar.l = obj;
                return y4lVar;
            default:
                y4l y4lVar2 = new y4l(this.m, continuation, 1);
                y4lVar2.l = obj;
                return y4lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((y4l) create((s4l) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((y4l) create((oi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        z4l z4lVar = this.m;
        Continuation continuation = null;
        switch (i) {
            case 0:
                s4l s4lVar = (s4l) this.l;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = null;
                    this.k = 1;
                    if (z4l.a(z4lVar, s4lVar, this) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                oi oiVar = (oi) this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 != 0 && i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    while (gld.T(oiVar)) {
                        acp acpVar = new acp(getContext());
                        acpVar.g(oiVar.d.f(), new y4l(z4lVar, continuation, 0));
                        msa msaVar = nsa.b;
                        rzf.K(acpVar, nsa.f(yd5.M(3, ssa.MINUTES)), new hv0(z4lVar, continuation, 22));
                        this.l = oiVar;
                        this.k = 1;
                        if (acpVar.d(this) == nm6Var2) {
                            break;
                        }
                    }
                    break;
                }
        }
        return Unit.a;
    }
}
