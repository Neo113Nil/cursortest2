package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vi1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ yi1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi1(yi1 yi1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = yi1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vi1(this.l, continuation, 0);
            default:
                return new vi1(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((vi1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                yi1 yi1Var = this.l;
                mj1 mj1Var = yi1Var.c;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ez ezVar = new ez(mj1Var.t, 8);
                    this.k = 1;
                    if (zsd.i0(ezVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                zh1 zh1Var = yi1Var.e;
                u51 u51Var = mj1Var.D;
                v5 v5Var = new v5(8, yi1Var);
                zh1Var.getClass();
                u51Var.getClass();
                bi1 bi1Var = zh1Var.a;
                dyd dydVar = (dyd) bi1Var.e;
                if (dydVar != null && !dydVar.c) {
                    xpt xptVar = (xpt) dydVar.b;
                    if (xptVar.a) {
                        x97.y(wyf.F(((np2) bi1Var.b).getLifecycle()), null, null, new v3(bi1Var, u51Var, xptVar, v5Var, (Continuation) null, 10), 3);
                    }
                    dydVar.c = true;
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    vi1 vi1Var = new vi1(this.l, null, 0);
                    this.k = 1;
                    if (tyf.J(10000L, vi1Var, this) == nm6Var2) {
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
