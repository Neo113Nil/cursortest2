package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class qx2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ rx2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx2(rx2 rx2Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = rx2Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qx2(this.l, continuation, 0);
            case 1:
                return new qx2(this.l, continuation, 1);
            default:
                return new qx2(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((qx2) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                rx2 rx2Var = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    lx2 lx2Var = rx2Var.c;
                    this.k = 1;
                    if (lx2Var.c(this) == nm6Var) {
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                bsd b = dm6.b();
                ox2 ox2Var = new ox2(rx2Var, null, 2);
                this.k = 2;
                if (x97.V(b, ox2Var, this) == nm6Var) {
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                rx2 rx2Var2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    lx2 lx2Var2 = rx2Var2.c;
                    this.k = 1;
                    if (lx2Var2.a(this) == nm6Var2) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                bsd b2 = dm6.b();
                ox2 ox2Var2 = new ox2(rx2Var2, null, 3);
                this.k = 2;
                if (x97.V(b2, ox2Var2, this) == nm6Var2) {
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                rx2 rx2Var3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    lx2 lx2Var3 = rx2Var3.c;
                    this.k = 1;
                    if (lx2Var3.c(this) == nm6Var3) {
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                bsd b3 = dm6.b();
                ox2 ox2Var3 = new ox2(rx2Var3, null, 4);
                this.k = 2;
                if (x97.V(b3, ox2Var3, this) == nm6Var3) {
                }
                break;
        }
        return Unit.a;
    }
}
