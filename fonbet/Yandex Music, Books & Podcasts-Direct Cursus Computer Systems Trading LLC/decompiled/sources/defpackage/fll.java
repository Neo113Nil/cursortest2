package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class fll extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sdr l;
    public final /* synthetic */ na0 m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ sdr o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fll(sdr sdrVar, na0 na0Var, Function0 function0, sdr sdrVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = sdrVar;
        this.m = na0Var;
        this.n = function0;
        this.o = sdrVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fll(this.l, this.m, this.n, this.o, continuation, 0);
            default:
                return new fll(this.l, this.m, this.n, this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fll) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    if (!((Boolean) this.l.getValue()).booleanValue()) {
                        break;
                    } else {
                        na0 na0Var = this.m;
                        eno s0 = szf.s0(new rkl(na0Var, 2));
                        ell ellVar = new ell(na0Var, this.n, this.o, 0);
                        this.k = 1;
                        if (s0.collect(ellVar, this) == nm6Var) {
                        }
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (!((Boolean) this.l.getValue()).booleanValue()) {
                        break;
                    } else {
                        na0 na0Var2 = this.m;
                        eno s02 = szf.s0(new rkl(na0Var2, 4));
                        ell ellVar2 = new ell(na0Var2, this.n, this.o, 1);
                        this.k = 1;
                        if (s02.collect(ellVar2, this) == nm6Var2) {
                        }
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
