package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r07 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ u07 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r07(u07 u07Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = u07Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r07(this.l, continuation, 0);
            case 1:
                return new r07(this.l, continuation, 1);
            case 2:
                return new r07(this.l, continuation, 2);
            default:
                return new r07(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((r07) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((r07) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        u07 u07Var = this.l;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdr xdrVar = u07Var.B().i;
                q07 q07Var = new q07(u07Var, 0);
                this.k = 1;
                xdrVar.collect(q07Var, this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    h7a H0 = zsd.H0(u07Var.A().I, 1);
                    q07 q07Var2 = new q07(u07Var, i2);
                    this.k = 1;
                    if (H0.collect(q07Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar = lyf.c;
                    r07 r07Var = new r07(u07Var, continuation, i2);
                    this.k = 1;
                    if (o8g.K(u07Var, lyfVar, r07Var, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = u07Var.B().j;
                    msa msaVar = nsa.b;
                    pjc Y = zsd.Y(x0qVar, yd5.M(1, ssa.SECONDS));
                    q07 q07Var3 = new q07(u07Var, 2);
                    this.k = 1;
                    if (Y.collect(q07Var3, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
