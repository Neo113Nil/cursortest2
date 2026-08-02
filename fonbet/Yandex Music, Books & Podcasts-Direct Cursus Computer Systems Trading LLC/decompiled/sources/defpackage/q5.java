package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ s5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5(s5 s5Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = s5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new q5(this.k, continuation, 0);
            default:
                return new q5(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((q5) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Continuation continuation = null;
        s5 s5Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (s5Var.A == null) {
                    k4e k4eVar = new k4e();
                    uoi uoiVar = s5Var.q;
                    if (uoiVar != null) {
                        x97.y(s5Var.G0(), null, null, new l5(uoiVar, k4eVar, continuation, 0), 3);
                    }
                    s5Var.A = k4eVar;
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                k4e k4eVar2 = s5Var.A;
                if (k4eVar2 != null) {
                    l4e l4eVar = new l4e(k4eVar2);
                    uoi uoiVar2 = s5Var.q;
                    if (uoiVar2 != null) {
                        x97.y(s5Var.G0(), null, null, new l5(uoiVar2, l4eVar, continuation, 1), 3);
                    }
                    s5Var.A = null;
                }
                break;
        }
        return Unit.a;
    }
}
