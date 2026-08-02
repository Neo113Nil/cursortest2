package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l90 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ Function2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l90(Function0 function0, Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = function0;
        this.n = function2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                l90 l90Var = new l90(this.m, this.n, continuation, 0);
                l90Var.l = obj;
                return l90Var;
            case 1:
                l90 l90Var2 = new l90(this.m, this.n, continuation, 1);
                l90Var2.l = obj;
                return l90Var2;
            default:
                l90 l90Var3 = new l90(this.m, this.n, continuation, 2);
                l90Var3.l = obj;
                return l90Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((l90) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.l;
                    xqn xqnVar = new xqn();
                    eno s0 = szf.s0(this.m);
                    k90 k90Var = new k90(xqnVar, mm6Var, this.n, 0);
                    this.k = 1;
                    if (s0.collect(k90Var, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.l;
                    xqn xqnVar2 = new xqn();
                    eno s02 = szf.s0(this.m);
                    k90 k90Var2 = new k90(xqnVar2, mm6Var2, this.n, 1);
                    this.k = 1;
                    if (s02.collect(k90Var2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    xqn i4 = hrg.i(obj);
                    eno s03 = szf.s0(this.m);
                    k90 k90Var3 = new k90(i4, mm6Var3, this.n, 2);
                    this.l = null;
                    this.k = 1;
                    if (s03.collect(k90Var3, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
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
