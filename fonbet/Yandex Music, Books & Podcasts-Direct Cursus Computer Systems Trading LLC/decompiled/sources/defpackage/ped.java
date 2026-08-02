package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class ped extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ iz7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ped(iz7 iz7Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = iz7Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ped(this.l, continuation, 0);
            default:
                return new ped(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ped) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cla claVar = new cla(y1g.L(((oq7) ((jyr) this.l.g).getValue()).a), 1);
                this.k = 1;
                Object g0 = zsd.g0(claVar, this);
                return g0 == nm6Var ? nm6Var : g0;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                iz7 iz7Var = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    iz7Var.getClass();
                    obj = tyf.L(200000L, new ped(iz7Var, null, 0), this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                u3q u3qVar = (u3q) obj;
                if (u3qVar != null ? ((Boolean) ocg.k(u3qVar, new rwd(25))).booleanValue() : false) {
                    iz7.l(iz7Var, new ned("init", false), new med[]{med.a, med.b});
                }
                return Unit.a;
        }
    }
}
